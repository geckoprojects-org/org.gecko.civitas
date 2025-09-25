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
package org.civitas.glt.mqtt.sender;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.civitas.glt.mqtt.sender.api.AlarmSenderService;
import org.civitas.prototype.model.calarm.SimpleAlarm;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.json.constants.EMFJs;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(name = "AlarmSenderService")
public class AlarmSenderServiceImpl implements AlarmSenderService {
	
	private static final Logger LOGGER = Logger.getLogger(AlarmSenderServiceImpl.class.getName());
	private static final String TOPIC = "glt/alarm";
	private static final Map<String, Object> CONFIG = Collections.singletonMap(EMFJs.OPTION_DATE_FORMAT, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'zzz");

	
	@Reference
	private MessagingService messaging;

	/* 
	 * (non-Javadoc)
	 * @see org.civitas.glt.mqtt.sender.api.AlarmSenderService#sendAlarm(org.civitas.prototype.model.calarm.Alarm)
	 */
	@Override
	public void sendAlarm(SimpleAlarm alarm) {
		try {
			BinaryResourceImpl res = new BinaryResourceImpl();
			res.getContents().add(EcoreUtil.copy(alarm));
			ByteArrayOutputStream bao = new ByteArrayOutputStream();
			res.save(bao, CONFIG);
			LOGGER.log(Level.INFO, "Send Alarm data via MQTT. {0}", new String(bao.toByteArray()));
			ByteBuffer buffer = ByteBuffer.wrap(bao.toByteArray());
			messaging.publish(TOPIC, buffer);
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error while sending Alarm object via MQTT.", e);
		}
	}
}
