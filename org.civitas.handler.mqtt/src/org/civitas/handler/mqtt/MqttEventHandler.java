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
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.typedevent.TypedEventHandler;

@Designate(ocd = MqttEventHandler.Config.class)
@Component(name = "MqttEventHandler", configurationPid = "MqttEventHandlerConfig", configurationPolicy = ConfigurationPolicy.REQUIRE, scope = ServiceScope.PROTOTYPE)
public class MqttEventHandler implements TypedEventHandler<EObject> {

    @Reference(name = "mqtt.service", target = "(id=local)")
    private MessagingService messaging;

    private static final Logger LOGGER = Logger.getLogger(MqttEventHandler.class.getName());
    private Config config;

    @ObjectClassDefinition(name = "MqttEventHandler Configuration")
    @interface Config {

	@AttributeDefinition(name = "Event Topic", description = "The topic this handler is listening to")
	String event_topics();

	@AttributeDefinition(name = "MQTT Topic", description = "The MQTT topic list where to publish the result")
	String[] mqtt_topics();
    }

    @Activate
    public void activate(Config config) {
	this.config = config;

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.osgi.service.typedevent.TypedEventHandler#notify(java.lang.String,
     * java.lang.Object)
     */
    @Override
    public void notify(String topic, EObject event) {
	try {
	    BinaryResourceImpl res = new BinaryResourceImpl();
	    res.getContents().add(EcoreUtil.copy(event));
	    ByteArrayOutputStream bao = new ByteArrayOutputStream();
	    res.save(bao, null);
	    LOGGER.log(Level.INFO, "Sending EObject via MQTT. {0}", new String(bao.toByteArray()));
	    ByteBuffer buffer = ByteBuffer.wrap(bao.toByteArray());
	    for (String t : config.mqtt_topics()) {
		try {
		    messaging.publish(t, buffer);
		} catch (Exception e) {
		    LOGGER.log(Level.SEVERE, String.format("Error while sending EObject via MQTT for topic %s.", t), e);
		}
	    }
	} catch (IOException e) {
	    LOGGER.log(Level.SEVERE, "Error while saving meg content.", e);
	}

    }
}
