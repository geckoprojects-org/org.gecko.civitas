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
package org.civitas.mqttreceiver.impl;

import org.civitas.mqtthandler.MqtthandlerPackage;

import org.civitas.mqtthandler.impl.MqtthandlerPackageImpl;

import org.civitas.mqttreceiver.MqttReceiverConfig;
import org.civitas.mqttreceiver.MqttreceiverFactory;
import org.civitas.mqttreceiver.MqttreceiverPackage;

import org.civitas.osgi.component.ComponentConfigPackage;

import org.civitas.pipeline.PipelinePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MqttreceiverPackageImpl extends EPackageImpl implements MqttreceiverPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mqttReceiverConfigEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.civitas.mqttreceiver.MqttreceiverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MqttreceiverPackageImpl() {
		super(eNS_URI, MqttreceiverFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MqttreceiverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MqttreceiverPackage init() {
		if (isInited) return (MqttreceiverPackage)EPackage.Registry.INSTANCE.getEPackage(MqttreceiverPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMqttreceiverPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MqttreceiverPackageImpl theMqttreceiverPackage = registeredMqttreceiverPackage instanceof MqttreceiverPackageImpl ? (MqttreceiverPackageImpl)registeredMqttreceiverPackage : new MqttreceiverPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ComponentConfigPackage.eINSTANCE.eClass();
		PipelinePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MqtthandlerPackage.eNS_URI);
		MqtthandlerPackageImpl theMqtthandlerPackage = (MqtthandlerPackageImpl)(registeredPackage instanceof MqtthandlerPackageImpl ? registeredPackage : MqtthandlerPackage.eINSTANCE);

		// Create package meta-data objects
		theMqttreceiverPackage.createPackageContents();
		theMqtthandlerPackage.createPackageContents();

		// Initialize created meta-data
		theMqttreceiverPackage.initializePackageContents();
		theMqtthandlerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMqttreceiverPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MqttreceiverPackage.eNS_URI, theMqttreceiverPackage);
		return theMqttreceiverPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMqttReceiverConfig() {
		return mqttReceiverConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMqttReceiverConfig_MqttTopic() {
		return (EAttribute)mqttReceiverConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMqttReceiverConfig_PrintPayload() {
		return (EAttribute)mqttReceiverConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMqttReceiverConfig_PayloadEclassuri() {
		return (EReference)mqttReceiverConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMqttReceiverConfig_MqttServiceTarget() {
		return (EAttribute)mqttReceiverConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MqttreceiverFactory getMqttreceiverFactory() {
		return (MqttreceiverFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mqttReceiverConfigEClass = createEClass(MQTT_RECEIVER_CONFIG);
		createEAttribute(mqttReceiverConfigEClass, MQTT_RECEIVER_CONFIG__MQTT_TOPIC);
		createEAttribute(mqttReceiverConfigEClass, MQTT_RECEIVER_CONFIG__PRINT_PAYLOAD);
		createEReference(mqttReceiverConfigEClass, MQTT_RECEIVER_CONFIG__PAYLOAD_ECLASSURI);
		createEAttribute(mqttReceiverConfigEClass, MQTT_RECEIVER_CONFIG__MQTT_SERVICE_TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ComponentConfigPackage theComponentConfigPackage = (ComponentConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentConfigPackage.eNS_URI);
		PipelinePackage thePipelinePackage = (PipelinePackage)EPackage.Registry.INSTANCE.getEPackage(PipelinePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mqttReceiverConfigEClass.getESuperTypes().add(theComponentConfigPackage.getConfiguration());
		mqttReceiverConfigEClass.getESuperTypes().add(thePipelinePackage.getDataSource());

		// Initialize classes, features, and operations; add parameters
		initEClass(mqttReceiverConfigEClass, MqttReceiverConfig.class, "MqttReceiverConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMqttReceiverConfig_MqttTopic(), ecorePackage.getEString(), "mqttTopic", null, 0, 1, MqttReceiverConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMqttReceiverConfig_PrintPayload(), ecorePackage.getEBoolean(), "printPayload", "false", 0, 1, MqttReceiverConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMqttReceiverConfig_PayloadEclassuri(), ecorePackage.getEClass(), null, "payloadEclassuri", null, 0, 1, MqttReceiverConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMqttReceiverConfig_MqttServiceTarget(), ecorePackage.getEString(), "mqttServiceTarget", null, 0, 1, MqttReceiverConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (getMqttReceiverConfig_MqttTopic(),
		   source,
		   new String[] {
			   "name", "mqtt.topic"
		   });
		addAnnotation
		  (getMqttReceiverConfig_PrintPayload(),
		   source,
		   new String[] {
			   "name", "print.payload"
		   });
		addAnnotation
		  (getMqttReceiverConfig_PayloadEclassuri(),
		   source,
		   new String[] {
			   "name", "payload.eclassuri"
		   });
		addAnnotation
		  (getMqttReceiverConfig_MqttServiceTarget(),
		   source,
		   new String[] {
			   "name", "mqtt.service.target"
		   });
	}

} //MqttreceiverPackageImpl
