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
package org.civitas.glt.sensor.validation;

import org.civitas.glt.sensor.model.sensor.SensorReading;
import org.civitas.glt.sensor.validation.api.ValidationType;
import org.civitas.glt.sensor.validation.api.ValidationService;
import org.civitas.glt.sensor.validation.api.ValidationServiceConfig;
import org.civitas.prototype.model.calarm.CIVAlarmFactory;
import org.civitas.prototype.model.calarm.NotificationType;
import org.civitas.prototype.model.calarm.SeverityType;
import org.civitas.prototype.model.calarm.SimpleAlarm;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.annotations.*;
import org.osgi.service.metatype.annotations.Designate;

@Designate(ocd = ValidationServiceConfig.class)
//@Component(name = "ValidationService", configurationPid = "ValidationService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class ValidationServiceImpl2 implements ValidationService {
	
	private ValidationServiceConfig config;
	private ValidationType type;

	@Activate
	public void activate(ValidationServiceConfig config) throws ConfigurationException {
		this.config = config;
		checkConfig(config);
		this.type = ValidationType.valueOf(config.validationType());
	}

	/* 
	 * (non-Javadoc)
	 * @see org.civitas.glt.sensor.validation.api.ValidationService#validate(org.civitas.glt.sensor.model.sensor.SensorReading)
	 */
	@Override
	public SimpleAlarm validate(SensorReading sensorReading) {
		
		switch(type) {
		case ABOVE_OR_EQUAL_THRESHOLD:
			if(sensorReading.getValue() >= config.threshold()) {
				return createAlarm(sensorReading, String.format("Validation of type %s failed. Sensor value %s is above or equal the threshold of %s", type, sensorReading.getValue(), config.threshold()));
			} 
			break;			
		case ABOVE_THRESHOLD:
			if(sensorReading.getValue() > config.threshold()) {
				return createAlarm(sensorReading, String.format("Validation of type %s failed. Sensor value %s is above the threshold of %s", type, sensorReading.getValue(), config.threshold()));
			} 
			break;
		case BELOW_OR_EQUAL_THRESHOLD:
			if(sensorReading.getValue() <= config.threshold()) {
				return createAlarm(sensorReading, String.format("Validation of type %s failed. Sensor value %s is below or equal the threshold of %s", type, sensorReading.getValue(), config.threshold()));
			} 
			break;
		case BELOW_THRESHOLD:
			if(sensorReading.getValue() < config.threshold()) {
				return createAlarm(sensorReading, String.format("Validation of type %s failed. Sensor value %s is below the threshold of %s", type, sensorReading.getValue(), config.threshold()));
			} 
			break;
		case OUTSIDE_RANGE:
			if(sensorReading.getValue() < config.minThreshold() || sensorReading.getValue() > config.maxThreshold()) {
				return createAlarm(sensorReading, String.format("Validation of type %s failed. Sensor value %s is outside the range %s - %s", type, sensorReading.getValue(), config.minThreshold(), config.maxThreshold()));
			} 
			break;
		case WITHIN_RANGE:
			if(sensorReading.getValue() > config.minThreshold() || sensorReading.getValue() < config.maxThreshold()) {
				return createAlarm(sensorReading, String.format("Validation of type %s failed. Sensor value %s is inside the range %s - %s", type, sensorReading.getValue(), config.minThreshold(), config.maxThreshold()));
			} 
			break;
		default:
			break;
		
		}
		return null;
	}
	
	private SimpleAlarm createAlarm(SensorReading sensorReading, String alarmMsg) {
		
		SimpleAlarm alarm = CIVAlarmFactory.eINSTANCE.createSimpleAlarm();
		alarm.setAlarmTriggerEvent(EcoreUtil.copy(sensorReading));
		alarm.setMassage(alarmMsg);
		alarm.setSeverity(SeverityType.valueOf(config.severityType()));
		alarm.setNotificationType(NotificationType.valueOf(config.notificationType()));
		
//		TODO: do we link the alarm to the Contact here??
		
		return alarm;
		
	}

	private void checkConfig(ValidationServiceConfig config) throws ConfigurationException {
		if(config.validationType() == null || config.validationType().isEmpty()) {
			throw new ConfigurationException("validationType", "validationType must be set");
		}
		try {
			ValidationType.valueOf(config.validationType());
		} catch(Exception e) {
			throw new ConfigurationException("validationType", "validationType must be a valid ValidationType value");
		}
		try {
			SeverityType.valueOf(config.severityType());
		} catch(Exception e) {
			throw new ConfigurationException("severityType", "severityType must be a valid SeverityType value");
		}
		try {
			NotificationType.valueOf(config.notificationType());
		} catch(Exception e) {
			throw new ConfigurationException("notificationType", "notificationType must be a valid NotificationType value");
		}
		ValidationType type = ValidationType.valueOf(config.validationType());
		if(ValidationType.ABOVE_OR_EQUAL_THRESHOLD.equals(type) || ValidationType.ABOVE_THRESHOLD.equals(type) || ValidationType.BELOW_OR_EQUAL_THRESHOLD.equals(type) || ValidationType.BELOW_THRESHOLD.equals(type) ) {
			if(config.threshold() == -9999.) {
				throw new ConfigurationException("threshold", String.format("threshold must be set for validation of type %s", type));
			}
		}
		if(ValidationType.WITHIN_RANGE.equals(type) || ValidationType.OUTSIDE_RANGE.equals(type)) {
			if(config.minThreshold() == -9999.) {
				throw new ConfigurationException("minThreshold", String.format("minThreshold must be set for validation of type %s", type));
			} 
			if(config.maxThreshold() == -9999.) {
				throw new ConfigurationException("maxThreshold", String.format("maxThreshold must be set for validation of type %s", type));
			}
		}
	}
}
