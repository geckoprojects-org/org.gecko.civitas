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


import org.civitas.osgi.component.ComponentConfigPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

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
 * @see org.civitas.mqtthandler.MqtthandlerFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = MqtthandlerPackage.eNS_URI, genModel = "/model/mqtt-handler.genmodel", genModelSourceLocations = {"model/mqtt-handler.genmodel","org.civitas.handler.mqtt/model/mqtt-handler.genmodel"}, ecore="/model/mqtt-handler.ecore", ecoreSourceLocations="/model/mqtt-handler.ecore")
public interface MqtthandlerPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mqtthandler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://civitas.org/mqtt/handler/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mqtthandler";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MqtthandlerPackage eINSTANCE = org.civitas.mqtthandler.impl.MqtthandlerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.civitas.mqtthandler.impl.MqttEventHandlerConfigImpl <em>Mqtt Event Handler Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.mqtthandler.impl.MqttEventHandlerConfigImpl
	 * @see org.civitas.mqtthandler.impl.MqtthandlerPackageImpl#getMqttEventHandlerConfig()
	 * @generated
	 */
	int MQTT_EVENT_HANDLER_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_EVENT_HANDLER_CONFIG__PID = ComponentConfigPackage.CONFIGURATION__PID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_EVENT_HANDLER_CONFIG__ID = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_EVENT_HANDLER_CONFIG__OUTPUTS = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mqtt Topic</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_EVENT_HANDLER_CONFIG__MQTT_TOPIC = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mqtt Event Handler Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_EVENT_HANDLER_CONFIG_FEATURE_COUNT = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mqtt Event Handler Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_EVENT_HANDLER_CONFIG_OPERATION_COUNT = ComponentConfigPackage.CONFIGURATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.civitas.mqtthandler.MqttEventHandlerConfig <em>Mqtt Event Handler Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mqtt Event Handler Config</em>'.
	 * @see org.civitas.mqtthandler.MqttEventHandlerConfig
	 * @generated
	 */
	EClass getMqttEventHandlerConfig();

	/**
	 * Returns the meta object for the attribute list '{@link org.civitas.mqtthandler.MqttEventHandlerConfig#getMqttTopic <em>Mqtt Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mqtt Topic</em>'.
	 * @see org.civitas.mqtthandler.MqttEventHandlerConfig#getMqttTopic()
	 * @see #getMqttEventHandlerConfig()
	 * @generated
	 */
	EAttribute getMqttEventHandlerConfig_MqttTopic();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MqtthandlerFactory getMqtthandlerFactory();

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
		 * The meta object literal for the '{@link org.civitas.mqtthandler.impl.MqttEventHandlerConfigImpl <em>Mqtt Event Handler Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.mqtthandler.impl.MqttEventHandlerConfigImpl
		 * @see org.civitas.mqtthandler.impl.MqtthandlerPackageImpl#getMqttEventHandlerConfig()
		 * @generated
		 */
		EClass MQTT_EVENT_HANDLER_CONFIG = eINSTANCE.getMqttEventHandlerConfig();

		/**
		 * The meta object literal for the '<em><b>Mqtt Topic</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT_EVENT_HANDLER_CONFIG__MQTT_TOPIC = eINSTANCE.getMqttEventHandlerConfig_MqttTopic();

	}

} //MqtthandlerPackage
