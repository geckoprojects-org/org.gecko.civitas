/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.civitas.handler.mqtt;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.typedevent.TypedEventHandler;

@Designate(ocd = MqttEventHandler.Config.class)
@Component(name = "MqttEventHandler", configurationPid = "MqttEventHandlerConfig", configurationPolicy = ConfigurationPolicy.REQUIRE, scope = ServiceScope.PROTOTYPE)
public class MqttEventHandler implements TypedEventHandler<EObject> {


	private static final Logger LOGGER = Logger.getLogger(MqttEventHandler.class.getName());
	
	private static final Map<String, Object> EMF_CONFIG = Collections.singletonMap(EMFJs.OPTION_DATE_FORMAT,
			"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz");
	
	@Reference(target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME
			+ "=EMFJson)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ResourceSet> serviceObjects;
	@Reference(name = "mqtt.service", target = "(id=local)")
	private MessagingService messaging;

	private Config config;

	@ObjectClassDefinition(name = "MqttEventHandler Configuration")
	@interface Config {

		@AttributeDefinition(name = "Event Topic", description = "The topic this handler is listening to")
		String event_topics();

		@AttributeDefinition(name = "MQTT Topic", description = "The MQTT topic list where to publish the result")
		String[] mqtt_topics();

		@AttributeDefinition(name = "Content type", description = "Content type of the published message (default = application/json)")
		String contentType() default "application/json";
	}

	@Activate
	public void activate(Config config) {
		this.config = config;

	}


	@Override
	public void notify(String topic, EObject event) {
		ResourceSet resourceSet = serviceObjects.getService();
		try {
			Resource res = resourceSet.createResource(URI.createFileURI(UUID.randomUUID().toString()), config.contentType());

			res.getContents().add(EcoreUtil.copy(event));
			ByteArrayOutputStream bao = new ByteArrayOutputStream();
			res.save(bao, EMF_CONFIG);
			LOGGER.log(Level.INFO, "Sending EObject via MQTT. {0}", new String(bao.toByteArray()));
			ByteBuffer buffer = ByteBuffer.wrap(bao.toByteArray());
			send(buffer);
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Error while saving meg content.", e);
		} finally {
			serviceObjects.ungetService(resourceSet);
		}

	}

	private void send(ByteBuffer buffer) {
		for (String t : config.mqtt_topics()) {
			try {
				messaging.publish(t, buffer);
			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, String.format("Error while sending EObject via MQTT for topic %s.", t), e);
			}
		}
	}
}
