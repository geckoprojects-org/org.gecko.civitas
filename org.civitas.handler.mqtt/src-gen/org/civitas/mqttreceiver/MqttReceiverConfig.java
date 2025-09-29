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
package org.civitas.mqttreceiver;

import org.civitas.osgi.component.Configuration;

import org.civitas.pipeline.DataSource;

import org.eclipse.emf.ecore.EClass;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mqtt Receiver Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration for MQTT Receiver
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.mqttreceiver.MqttReceiverConfig#getMqttTopic <em>Mqtt Topic</em>}</li>
 *   <li>{@link org.civitas.mqttreceiver.MqttReceiverConfig#isPrintPayload <em>Print Payload</em>}</li>
 *   <li>{@link org.civitas.mqttreceiver.MqttReceiverConfig#getPayloadEclassuri <em>Payload Eclassuri</em>}</li>
 *   <li>{@link org.civitas.mqttreceiver.MqttReceiverConfig#getMqttServiceTarget <em>Mqtt Service Target</em>}</li>
 * </ul>
 *
 * @see org.civitas.mqttreceiver.MqttreceiverPackage#getMqttReceiverConfig()
 * @model
 * @generated
 */
@ProviderType
public interface MqttReceiverConfig extends Configuration, DataSource {
	/**
	 * Returns the value of the '<em><b>Mqtt Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MQTT topic where to listen to
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mqtt Topic</em>' attribute.
	 * @see #setMqttTopic(String)
	 * @see org.civitas.mqttreceiver.MqttreceiverPackage#getMqttReceiverConfig_MqttTopic()
	 * @model extendedMetaData="name='mqtt.topic'"
	 * @generated
	 */
	String getMqttTopic();

	/**
	 * Sets the value of the '{@link org.civitas.mqttreceiver.MqttReceiverConfig#getMqttTopic <em>Mqtt Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mqtt Topic</em>' attribute.
	 * @see #getMqttTopic()
	 * @generated
	 */
	void setMqttTopic(String value);

	/**
	 * Returns the value of the '<em><b>Print Payload</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not to print the payload content
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Print Payload</em>' attribute.
	 * @see #setPrintPayload(boolean)
	 * @see org.civitas.mqttreceiver.MqttreceiverPackage#getMqttReceiverConfig_PrintPayload()
	 * @model default="false"
	 *        extendedMetaData="name='print.payload'"
	 * @generated
	 */
	boolean isPrintPayload();

	/**
	 * Sets the value of the '{@link org.civitas.mqttreceiver.MqttReceiverConfig#isPrintPayload <em>Print Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print Payload</em>' attribute.
	 * @see #isPrintPayload()
	 * @generated
	 */
	void setPrintPayload(boolean value);

	/**
	 * Returns the value of the '<em><b>Payload Eclassuri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EClass URI of the object we expect in the MQTT message payload
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload Eclassuri</em>' reference.
	 * @see #setPayloadEclassuri(EClass)
	 * @see org.civitas.mqttreceiver.MqttreceiverPackage#getMqttReceiverConfig_PayloadEclassuri()
	 * @model extendedMetaData="name='payload.eclassuri'"
	 * @generated
	 */
	EClass getPayloadEclassuri();

	/**
	 * Sets the value of the '{@link org.civitas.mqttreceiver.MqttReceiverConfig#getPayloadEclassuri <em>Payload Eclassuri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload Eclassuri</em>' reference.
	 * @see #getPayloadEclassuri()
	 * @generated
	 */
	void setPayloadEclassuri(EClass value);

	/**
	 * Returns the value of the '<em><b>Mqtt Service Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mqtt Service Target</em>' attribute.
	 * @see #setMqttServiceTarget(String)
	 * @see org.civitas.mqttreceiver.MqttreceiverPackage#getMqttReceiverConfig_MqttServiceTarget()
	 * @model extendedMetaData="name='mqtt.service.target'"
	 * @generated
	 */
	String getMqttServiceTarget();

	/**
	 * Sets the value of the '{@link org.civitas.mqttreceiver.MqttReceiverConfig#getMqttServiceTarget <em>Mqtt Service Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mqtt Service Target</em>' attribute.
	 * @see #getMqttServiceTarget()
	 * @generated
	 */
	void setMqttServiceTarget(String value);

} // MqttReceiverConfig
