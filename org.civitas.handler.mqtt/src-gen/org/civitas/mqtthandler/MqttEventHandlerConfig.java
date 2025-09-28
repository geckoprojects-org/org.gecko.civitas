/*
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
package org.civitas.mqtthandler;

import org.civitas.osgi.component.Configuration;

import org.civitas.pipeline.DataSource;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mqtt Event Handler Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration for MQTT Event Handler
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.mqtthandler.MqttEventHandlerConfig#getMqttTopic <em>Mqtt Topic</em>}</li>
 * </ul>
 *
 * @see org.civitas.mqtthandler.MqtthandlerPackage#getMqttEventHandlerConfig()
 * @model
 * @generated
 */
@ProviderType
public interface MqttEventHandlerConfig extends Configuration, DataSource {
	/**
	 * Returns the value of the '<em><b>Mqtt Topic</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MQTT topic list where to publish the result
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mqtt Topic</em>' attribute list.
	 * @see org.civitas.mqtthandler.MqtthandlerPackage#getMqttEventHandlerConfig_MqttTopic()
	 * @model
	 * @generated
	 */
	EList<String> getMqttTopic();

} // MqttEventHandlerConfig
