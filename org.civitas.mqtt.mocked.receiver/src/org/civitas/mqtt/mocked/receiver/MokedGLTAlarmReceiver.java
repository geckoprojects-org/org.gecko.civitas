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

import java.util.Collections;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.civitas.mqtt.mocked.receiver.helper.MqttReceiverHelper;
import org.civitas.prototype.model.calarm.CIVAlarmPackage;
import org.civitas.prototype.model.calarm.SimpleAlarm;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.gecko.osgi.messaging.Message;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.util.pushstream.PushStream;


@Component(name = "MokedGLTAlarmReceiver", immediate = true)
public class MokedGLTAlarmReceiver   {

	private static final Logger LOGGER = Logger.getLogger(MokedGLTAlarmReceiver.class.getName());
	private static final String TOPIC = "glt/alarm";
	
	private MessagingService messagingService;
	private ComponentServiceObjects<ResourceSet> rsFactory;
	
	@Activate
	public MokedGLTAlarmReceiver(
			@Reference(target = "("+EMFNamespaces.EMF_MODEL_FILE_EXT +"=json)", cardinality = ReferenceCardinality.MANDATORY) ComponentServiceObjects<ResourceSet> rsFactory,
			@Reference(target = "(id=full)", cardinality = ReferenceCardinality.MANDATORY) MessagingService messagingService) {
		this.rsFactory = rsFactory;
		this.messagingService = messagingService;
		subscribe();
	}
	
	private void subscribe() {
		try {
			PushStream<Message> subscription = messagingService.subscribe(TOPIC);
			subscription.forEach(this::hanldeMessage);			
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, String.format("Exception while subscribing to topic %s", TOPIC), e);
		}
	}
	
	private void hanldeMessage(Message msg) {
		if(msg == null) {
			LOGGER.warning(String.format("Message is null! Cannot extract anything!"));
			return;
		}
		LOGGER.info(String.format("Got Alarm Msg for topic %s", msg.topic()));
		SimpleAlarm alarm = extractAlarm(msg);
		if(alarm != null) {
			LOGGER.info(
					String.format("""
					Got Alarm msg with severity %s.
					Contact Person %s %s has been notified via %s.
					Triggered event was from sensor %s at %s with value %s.
					
					""", 
					alarm.getSeverity(),
					alarm.getAlarmReceiver().getFirstName(),
					alarm.getAlarmReceiver().getLastName(),
					alarm.getNotificationType(),
					alarm.getAlarmTriggerEvent().getBuildingId(), 
					alarm.getAlarmTriggerEvent().getTimestamp(),
					alarm.getAlarmTriggerEvent().getValue())
					);
		}
	}
	
	private SimpleAlarm extractAlarm(Message message) {		
		byte[] content = message.payload().array();
		try {
			return (SimpleAlarm) MqttReceiverHelper
					.loadResource(rsFactory, URI.createFileURI(UUID.randomUUID().toString().concat(".json")), 
							"application/json", content, 
							Collections.singletonMap(EMFJs.OPTION_ROOT_ELEMENT, CIVAlarmPackage.Literals.SIMPLE_ALARM));
		} catch(Exception e) {
			LOGGER.log(Level.SEVERE, String.format("IOException while reading payload from MQTT"), e);
			return null;
		}
	}

}
