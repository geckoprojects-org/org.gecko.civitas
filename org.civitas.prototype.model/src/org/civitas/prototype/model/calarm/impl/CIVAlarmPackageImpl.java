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
package org.civitas.prototype.model.calarm.impl;

import cbase.CbasePackage;

import cbase.impl.CbasePackageImpl;

import org.civitas.glt.model.glt.GLTPackage;

import org.civitas.glt.sensor.model.sensor.BuildingSensorPackage;

import org.civitas.prototype.model.calarm.Alarm;
import org.civitas.prototype.model.calarm.CIVAlarmFactory;
import org.civitas.prototype.model.calarm.CIVAlarmPackage;
import org.civitas.prototype.model.calarm.NotificationType;
import org.civitas.prototype.model.calarm.SeverityType;
import org.civitas.prototype.model.calarm.SimpleAlarm;

import org.civitas.units.model.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CIVAlarmPackageImpl extends EPackageImpl implements CIVAlarmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAlarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum notificationTypeEEnum = null;

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
	 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CIVAlarmPackageImpl() {
		super(eNS_URI, CIVAlarmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CIVAlarmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CIVAlarmPackage init() {
		if (isInited) return (CIVAlarmPackage)EPackage.Registry.INSTANCE.getEPackage(CIVAlarmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCIVAlarmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CIVAlarmPackageImpl theCIVAlarmPackage = registeredCIVAlarmPackage instanceof CIVAlarmPackageImpl ? (CIVAlarmPackageImpl)registeredCIVAlarmPackage : new CIVAlarmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BuildingSensorPackage.eINSTANCE.eClass();
		GLTPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CbasePackage.eNS_URI);
		CbasePackageImpl theCbasePackage = (CbasePackageImpl)(registeredPackage instanceof CbasePackageImpl ? registeredPackage : CbasePackage.eINSTANCE);

		// Create package meta-data objects
		theCIVAlarmPackage.createPackageContents();
		theCbasePackage.createPackageContents();

		// Initialize created meta-data
		theCIVAlarmPackage.initializePackageContents();
		theCbasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCIVAlarmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CIVAlarmPackage.eNS_URI, theCIVAlarmPackage);
		return theCIVAlarmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlarm() {
		return alarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarm_AlarmId() {
		return (EAttribute)alarmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarm_Occurance() {
		return (EAttribute)alarmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarm_Alarmation() {
		return (EAttribute)alarmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlarm_Assets() {
		return (EReference)alarmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarm_Severity() {
		return (EAttribute)alarmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlarm_Scope() {
		return (EReference)alarmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlarm_NotificationType() {
		return (EAttribute)alarmEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleAlarm() {
		return simpleAlarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleAlarm_AlarmId() {
		return (EAttribute)simpleAlarmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleAlarm_Severity() {
		return (EAttribute)simpleAlarmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleAlarm_NotificationType() {
		return (EAttribute)simpleAlarmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleAlarm_AlarmReceiver() {
		return (EReference)simpleAlarmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleAlarm_AlarmTriggerEvent() {
		return (EReference)simpleAlarmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleAlarm_Massage() {
		return (EAttribute)simpleAlarmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSeverityType() {
		return severityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNotificationType() {
		return notificationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIVAlarmFactory getCIVAlarmFactory() {
		return (CIVAlarmFactory)getEFactoryInstance();
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
		alarmEClass = createEClass(ALARM);
		createEAttribute(alarmEClass, ALARM__ALARM_ID);
		createEAttribute(alarmEClass, ALARM__OCCURANCE);
		createEAttribute(alarmEClass, ALARM__ALARMATION);
		createEReference(alarmEClass, ALARM__ASSETS);
		createEAttribute(alarmEClass, ALARM__SEVERITY);
		createEReference(alarmEClass, ALARM__SCOPE);
		createEAttribute(alarmEClass, ALARM__NOTIFICATION_TYPE);

		simpleAlarmEClass = createEClass(SIMPLE_ALARM);
		createEAttribute(simpleAlarmEClass, SIMPLE_ALARM__ALARM_ID);
		createEAttribute(simpleAlarmEClass, SIMPLE_ALARM__SEVERITY);
		createEAttribute(simpleAlarmEClass, SIMPLE_ALARM__NOTIFICATION_TYPE);
		createEReference(simpleAlarmEClass, SIMPLE_ALARM__ALARM_RECEIVER);
		createEReference(simpleAlarmEClass, SIMPLE_ALARM__ALARM_TRIGGER_EVENT);
		createEAttribute(simpleAlarmEClass, SIMPLE_ALARM__MASSAGE);

		// Create enums
		severityTypeEEnum = createEEnum(SEVERITY_TYPE);
		notificationTypeEEnum = createEEnum(NOTIFICATION_TYPE);
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
		CbasePackage theCbasePackage = (CbasePackage)EPackage.Registry.INSTANCE.getEPackage(CbasePackage.eNS_URI);
		GLTPackage theGLTPackage = (GLTPackage)EPackage.Registry.INSTANCE.getEPackage(GLTPackage.eNS_URI);
		BuildingSensorPackage theBuildingSensorPackage = (BuildingSensorPackage)EPackage.Registry.INSTANCE.getEPackage(BuildingSensorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(alarmEClass, Alarm.class, "Alarm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlarm_AlarmId(), ecorePackage.getEString(), "alarmId", null, 1, 1, Alarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlarm_Occurance(), ecorePackage.getEDate(), "occurance", null, 0, 1, Alarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlarm_Alarmation(), ecorePackage.getEDate(), "alarmation", null, 0, 1, Alarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlarm_Assets(), theCbasePackage.getAsset(), null, "assets", null, 0, -1, Alarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlarm_Severity(), this.getSeverityType(), "severity", null, 0, 1, Alarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlarm_Scope(), theCbasePackage.getAssetScope(), null, "scope", null, 0, -1, Alarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlarm_NotificationType(), this.getNotificationType(), "notificationType", null, 0, 1, Alarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleAlarmEClass, SimpleAlarm.class, "SimpleAlarm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleAlarm_AlarmId(), ecorePackage.getEString(), "alarmId", null, 1, 1, SimpleAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleAlarm_Severity(), this.getSeverityType(), "severity", null, 0, 1, SimpleAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleAlarm_NotificationType(), this.getNotificationType(), "notificationType", null, 0, 1, SimpleAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleAlarm_AlarmReceiver(), theGLTPackage.getContact(), null, "alarmReceiver", null, 0, 1, SimpleAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleAlarm_AlarmTriggerEvent(), theBuildingSensorPackage.getSensorReading(), null, "alarmTriggerEvent", null, 0, 1, SimpleAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleAlarm_Massage(), ecorePackage.getEString(), "massage", null, 0, 1, SimpleAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(severityTypeEEnum, SeverityType.class, "SeverityType");
		addEEnumLiteral(severityTypeEEnum, SeverityType.INFO);
		addEEnumLiteral(severityTypeEEnum, SeverityType.WARNING);
		addEEnumLiteral(severityTypeEEnum, SeverityType.SEVERE);
		addEEnumLiteral(severityTypeEEnum, SeverityType.CRITICAL);

		initEEnum(notificationTypeEEnum, NotificationType.class, "NotificationType");
		addEEnumLiteral(notificationTypeEEnum, NotificationType.EMAIL);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.PHONE);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.SMS);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.PUSH);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.POLICE);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.FIREDEPT);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.MEDEMERGENCY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
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
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "complianceLevel", "17.0",
			   "oSGiCompatible", "true",
			   "basePackage", "org.civitas.prototype.model",
			   "resource", "XMI"
		   });
	}

} //CIVAlarmPackageImpl
