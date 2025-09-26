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
package org.civitas.mqtt.mocked.receiver;

import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.civitas.mqtt.mocked.receiver.helper.MqttReceiverHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.util.pushstream.PushStream;

/**
 * 
 * @author ilenia
 * @since Sep 26, 2025
 */
@Designate(ocd = MqttReceiver.Config.class)
@Component(name = "MqttReceiver", configurationPid = "MqttReceiver", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class MqttReceiver {
	
	@Reference
	private MessagingService messaging;
	
	private static final Logger LOGGER = Logger.getLogger(MqttReceiver.class.getName());
	
	private Config config;
	private ComponentServiceObjects<ResourceSet> rsFactory;
	private MessagingService messagingService;
	
	@ObjectClassDefinition(name = "MqttReceiver Configuration")
	@interface Config {

		@AttributeDefinition(name = "MQTT Topic", description = "The MQTT topic where to listen to")
		String mqtt_topic();
		
		@AttributeDefinition(name = "Payload EClass URI", description = "The EClass URI of the object we expect in the MQTT message payload")
		String payload_eclassuri();
	}

	
	@Activate
	public MqttReceiver(Config config, 
			@Reference(target = "("+EMFNamespaces.EMF_MODEL_FILE_EXT +"=json)", cardinality = ReferenceCardinality.MANDATORY) ComponentServiceObjects<ResourceSet> rsFactory,
			@Reference(target = "(id=full)", cardinality = ReferenceCardinality.MANDATORY) MessagingService messagingService) {
		this.rsFactory = rsFactory;
		this.messagingService = messagingService;
		this.config = config;
		subscribe();
	}
	
	private void subscribe() {
		try {
			PushStream<Message> subscription = messagingService.subscribe(config.mqtt_topic());
			subscription.forEach(this::hanldeMessage);			
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, String.format("Exception while subscribing to topic %s", config.mqtt_topic()), e);
		}
	}
	
	private void hanldeMessage(Message msg) {
		if(msg == null) {
			LOGGER.warning(String.format("Message is null! Cannot extract anything!"));
			return;
		}
		LOGGER.info(String.format("Got Alarm Msg for topic %s", msg.topic()));
		EObject content = extractPayload(msg);
		printPayload(content);
	}

	private EObject extractPayload(Message message) {		
		byte[] content = message.payload().array();
		try {
			return MqttReceiverHelper
					.loadResource(rsFactory, URI.createFileURI(UUID.randomUUID().toString().concat(".json")), 
							"application/json", content, 
							config.payload_eclassuri());
		} catch(Exception e) {
			LOGGER.log(Level.SEVERE, String.format("IOException while reading payload from MQTT"), e);
			return null;
		}
	}
	
	private void printPayload(EObject content) {		
		try {
			MqttReceiverHelper
					.printResource(rsFactory, URI.createFileURI(UUID.randomUUID().toString().concat(".json")), 
							"application/json", content);
		} catch(Exception e) {
			LOGGER.log(Level.SEVERE, String.format("IOException while printing payload from MQTT"), e);
		}
	}
}
