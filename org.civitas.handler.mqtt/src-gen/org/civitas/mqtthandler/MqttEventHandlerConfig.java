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

import org.civitas.pipeline.DataSink;

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
 *   <li>{@link org.civitas.mqtthandler.MqttEventHandlerConfig#getMqttTopics <em>Mqtt Topics</em>}</li>
 *   <li>{@link org.civitas.mqtthandler.MqttEventHandlerConfig#getMqttServiceTarget <em>Mqtt Service Target</em>}</li>
 *   <li>{@link org.civitas.mqtthandler.MqttEventHandlerConfig#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @see org.civitas.mqtthandler.MqtthandlerPackage#getMqttEventHandlerConfig()
 * @model
 * @generated
 */
@ProviderType
public interface MqttEventHandlerConfig extends Configuration, DataSink {
	/**
	 * Returns the value of the '<em><b>Mqtt Topics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MQTT topic list where to publish the result
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mqtt Topics</em>' attribute list.
	 * @see org.civitas.mqtthandler.MqtthandlerPackage#getMqttEventHandlerConfig_MqttTopics()
	 * @model extendedMetaData="name='mqtt.topics'"
	 * @generated
	 */
	EList<String> getMqttTopics();

	/**
	 * Returns the value of the '<em><b>Mqtt Service Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mqtt Service Target</em>' attribute.
	 * @see #setMqttServiceTarget(String)
	 * @see org.civitas.mqtthandler.MqtthandlerPackage#getMqttEventHandlerConfig_MqttServiceTarget()
	 * @model extendedMetaData="name='mqtt.service.target'"
	 * @generated
	 */
	String getMqttServiceTarget();

	/**
	 * Sets the value of the '{@link org.civitas.mqtthandler.MqttEventHandlerConfig#getMqttServiceTarget <em>Mqtt Service Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mqtt Service Target</em>' attribute.
	 * @see #getMqttServiceTarget()
	 * @generated
	 */
	void setMqttServiceTarget(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * The default value is <code>"application/json"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see org.civitas.mqtthandler.MqtthandlerPackage#getMqttEventHandlerConfig_ContentType()
	 * @model default="application/json"
	 *        extendedMetaData="name='contentType'"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link org.civitas.mqtthandler.MqttEventHandlerConfig#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

} // MqttEventHandlerConfig
