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
package org.civitas.mqtthandler.impl;

import org.civitas.mqtthandler.MqttEventHandlerConfig;
import org.civitas.mqtthandler.MqtthandlerFactory;
import org.civitas.mqtthandler.MqtthandlerPackage;

import org.civitas.mqttreceiver.MqttreceiverPackage;

import org.civitas.mqttreceiver.impl.MqttreceiverPackageImpl;

import org.civitas.osgi.component.ComponentConfigPackage;

import org.civitas.pipeline.PipelinePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MqtthandlerPackageImpl extends EPackageImpl implements MqtthandlerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mqttEventHandlerConfigEClass = null;

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
	 * @see org.civitas.mqtthandler.MqtthandlerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MqtthandlerPackageImpl() {
		super(eNS_URI, MqtthandlerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MqtthandlerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MqtthandlerPackage init() {
		if (isInited) return (MqtthandlerPackage)EPackage.Registry.INSTANCE.getEPackage(MqtthandlerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMqtthandlerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MqtthandlerPackageImpl theMqtthandlerPackage = registeredMqtthandlerPackage instanceof MqtthandlerPackageImpl ? (MqtthandlerPackageImpl)registeredMqtthandlerPackage : new MqtthandlerPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ComponentConfigPackage.eINSTANCE.eClass();
		PipelinePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MqttreceiverPackage.eNS_URI);
		MqttreceiverPackageImpl theMqttreceiverPackage = (MqttreceiverPackageImpl)(registeredPackage instanceof MqttreceiverPackageImpl ? registeredPackage : MqttreceiverPackage.eINSTANCE);

		// Create package meta-data objects
		theMqtthandlerPackage.createPackageContents();
		theMqttreceiverPackage.createPackageContents();

		// Initialize created meta-data
		theMqtthandlerPackage.initializePackageContents();
		theMqttreceiverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMqtthandlerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MqtthandlerPackage.eNS_URI, theMqtthandlerPackage);
		return theMqtthandlerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMqttEventHandlerConfig() {
		return mqttEventHandlerConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMqttEventHandlerConfig_MqttTopic() {
		return (EAttribute)mqttEventHandlerConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMqttEventHandlerConfig_MqttServiceTarget() {
		return (EAttribute)mqttEventHandlerConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMqttEventHandlerConfig_ContentType() {
		return (EAttribute)mqttEventHandlerConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MqtthandlerFactory getMqtthandlerFactory() {
		return (MqtthandlerFactory)getEFactoryInstance();
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
		mqttEventHandlerConfigEClass = createEClass(MQTT_EVENT_HANDLER_CONFIG);
		createEAttribute(mqttEventHandlerConfigEClass, MQTT_EVENT_HANDLER_CONFIG__MQTT_TOPIC);
		createEAttribute(mqttEventHandlerConfigEClass, MQTT_EVENT_HANDLER_CONFIG__MQTT_SERVICE_TARGET);
		createEAttribute(mqttEventHandlerConfigEClass, MQTT_EVENT_HANDLER_CONFIG__CONTENT_TYPE);
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
		mqttEventHandlerConfigEClass.getESuperTypes().add(theComponentConfigPackage.getConfiguration());
		mqttEventHandlerConfigEClass.getESuperTypes().add(thePipelinePackage.getDataSink());

		// Initialize classes, features, and operations; add parameters
		initEClass(mqttEventHandlerConfigEClass, MqttEventHandlerConfig.class, "MqttEventHandlerConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMqttEventHandlerConfig_MqttTopic(), ecorePackage.getEString(), "mqttTopic", null, 0, -1, MqttEventHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMqttEventHandlerConfig_MqttServiceTarget(), ecorePackage.getEString(), "mqttServiceTarget", null, 0, 1, MqttEventHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMqttEventHandlerConfig_ContentType(), ecorePackage.getEString(), "contentType", "application/json", 0, 1, MqttEventHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0"
		   });
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
		  (getMqttEventHandlerConfig_MqttServiceTarget(),
		   source,
		   new String[] {
			   "name", "mqtt.service.target"
		   });
	}

} //MqtthandlerPackageImpl
