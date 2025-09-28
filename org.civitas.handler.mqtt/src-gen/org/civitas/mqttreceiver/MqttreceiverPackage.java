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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.civitas.mqttreceiver.MqttreceiverFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = MqttreceiverPackage.eNS_URI, genModel = "/model/mqtt-handler.genmodel", genModelSourceLocations = {"model/mqtt-handler.genmodel","org.civitas.handler.mqtt/model/mqtt-handler.genmodel"}, ecore="/model/mqtt-receiver.ecore", ecoreSourceLocations="/model/mqtt-receiver.ecore")
public interface MqttreceiverPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mqttreceiver";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://civitas.org/mqtt/receiver/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mqttreceiver";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MqttreceiverPackage eINSTANCE = org.civitas.mqttreceiver.impl.MqttreceiverPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.civitas.mqttreceiver.impl.MqttReceiverConfigImpl <em>Mqtt Receiver Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.mqttreceiver.impl.MqttReceiverConfigImpl
	 * @see org.civitas.mqttreceiver.impl.MqttreceiverPackageImpl#getMqttReceiverConfig()
	 * @generated
	 */
	int MQTT_RECEIVER_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Mqtt Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_RECEIVER_CONFIG__MQTT_TOPIC = 0;

	/**
	 * The feature id for the '<em><b>Print Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_RECEIVER_CONFIG__PRINT_PAYLOAD = 1;

	/**
	 * The feature id for the '<em><b>Payload Eclassuri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_RECEIVER_CONFIG__PAYLOAD_ECLASSURI = 2;

	/**
	 * The number of structural features of the '<em>Mqtt Receiver Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_RECEIVER_CONFIG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mqtt Receiver Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_RECEIVER_CONFIG_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.civitas.mqttreceiver.MqttReceiverConfig <em>Mqtt Receiver Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mqtt Receiver Config</em>'.
	 * @see org.civitas.mqttreceiver.MqttReceiverConfig
	 * @generated
	 */
	EClass getMqttReceiverConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.mqttreceiver.MqttReceiverConfig#getMqttTopic <em>Mqtt Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mqtt Topic</em>'.
	 * @see org.civitas.mqttreceiver.MqttReceiverConfig#getMqttTopic()
	 * @see #getMqttReceiverConfig()
	 * @generated
	 */
	EAttribute getMqttReceiverConfig_MqttTopic();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.mqttreceiver.MqttReceiverConfig#isPrintPayload <em>Print Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print Payload</em>'.
	 * @see org.civitas.mqttreceiver.MqttReceiverConfig#isPrintPayload()
	 * @see #getMqttReceiverConfig()
	 * @generated
	 */
	EAttribute getMqttReceiverConfig_PrintPayload();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.mqttreceiver.MqttReceiverConfig#getPayloadEclassuri <em>Payload Eclassuri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payload Eclassuri</em>'.
	 * @see org.civitas.mqttreceiver.MqttReceiverConfig#getPayloadEclassuri()
	 * @see #getMqttReceiverConfig()
	 * @generated
	 */
	EReference getMqttReceiverConfig_PayloadEclassuri();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MqttreceiverFactory getMqttreceiverFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.civitas.mqttreceiver.impl.MqttReceiverConfigImpl <em>Mqtt Receiver Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.mqttreceiver.impl.MqttReceiverConfigImpl
		 * @see org.civitas.mqttreceiver.impl.MqttreceiverPackageImpl#getMqttReceiverConfig()
		 * @generated
		 */
		EClass MQTT_RECEIVER_CONFIG = eINSTANCE.getMqttReceiverConfig();

		/**
		 * The meta object literal for the '<em><b>Mqtt Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT_RECEIVER_CONFIG__MQTT_TOPIC = eINSTANCE.getMqttReceiverConfig_MqttTopic();

		/**
		 * The meta object literal for the '<em><b>Print Payload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT_RECEIVER_CONFIG__PRINT_PAYLOAD = eINSTANCE.getMqttReceiverConfig_PrintPayload();

		/**
		 * The meta object literal for the '<em><b>Payload Eclassuri</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MQTT_RECEIVER_CONFIG__PAYLOAD_ECLASSURI = eINSTANCE.getMqttReceiverConfig_PayloadEclassuri();

	}

} //MqttreceiverPackage
