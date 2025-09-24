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
package org.civitas.prototype.model.calarm;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.civitas.prototype.model.calarm.CIVAlarmFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel complianceLevel='17.0' oSGiCompatible='true' basePackage='org.civitas.prototype.model' resource='XMI'"
 * @generated
 */
@ProviderType
@EPackage(uri = CIVAlarmPackage.eNS_URI, genModel = "/model/civitas-alarm.genmodel", genModelSourceLocations = {"model/civitas-alarm.genmodel","org.civitas.prototype.model/model/civitas-alarm.genmodel"}, ecore="/model/civitas-alarm.ecore", ecoreSourceLocations="/model/civitas-alarm.ecore")
public interface CIVAlarmPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "calarm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://civitas.org/alarm-notification/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "alarm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CIVAlarmPackage eINSTANCE = org.civitas.prototype.model.calarm.impl.CIVAlarmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.civitas.prototype.model.calarm.impl.AlarmImpl <em>Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.prototype.model.calarm.impl.AlarmImpl
	 * @see org.civitas.prototype.model.calarm.impl.CIVAlarmPackageImpl#getAlarm()
	 * @generated
	 */
	int ALARM = 0;

	/**
	 * The feature id for the '<em><b>Alarm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ALARM_ID = 0;

	/**
	 * The feature id for the '<em><b>Occurance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__OCCURANCE = 1;

	/**
	 * The feature id for the '<em><b>Alarmation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ALARMATION = 2;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ASSETS = 3;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__SEVERITY = 4;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__SCOPE = 5;

	/**
	 * The feature id for the '<em><b>Notification Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__NOTIFICATION_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.civitas.prototype.model.calarm.impl.SimpleAlarmImpl <em>Simple Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.prototype.model.calarm.impl.SimpleAlarmImpl
	 * @see org.civitas.prototype.model.calarm.impl.CIVAlarmPackageImpl#getSimpleAlarm()
	 * @generated
	 */
	int SIMPLE_ALARM = 1;

	/**
	 * The feature id for the '<em><b>Alarm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALARM__ALARM_ID = 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALARM__SEVERITY = 1;

	/**
	 * The feature id for the '<em><b>Notification Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALARM__NOTIFICATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Alarm Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALARM__ALARM_RECEIVER = 3;

	/**
	 * The feature id for the '<em><b>Alarm Trigger Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALARM__ALARM_TRIGGER_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Massage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALARM__MASSAGE = 5;

	/**
	 * The number of structural features of the '<em>Simple Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALARM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Simple Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALARM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.civitas.prototype.model.calarm.SeverityType <em>Severity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.prototype.model.calarm.SeverityType
	 * @see org.civitas.prototype.model.calarm.impl.CIVAlarmPackageImpl#getSeverityType()
	 * @generated
	 */
	int SEVERITY_TYPE = 2;

	/**
	 * The meta object id for the '{@link org.civitas.prototype.model.calarm.NotificationType <em>Notification Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.prototype.model.calarm.NotificationType
	 * @see org.civitas.prototype.model.calarm.impl.CIVAlarmPackageImpl#getNotificationType()
	 * @generated
	 */
	int NOTIFICATION_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link org.civitas.prototype.model.calarm.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm</em>'.
	 * @see org.civitas.prototype.model.calarm.Alarm
	 * @generated
	 */
	EClass getAlarm();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.prototype.model.calarm.Alarm#getAlarmId <em>Alarm Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Id</em>'.
	 * @see org.civitas.prototype.model.calarm.Alarm#getAlarmId()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_AlarmId();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.prototype.model.calarm.Alarm#getOccurance <em>Occurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurance</em>'.
	 * @see org.civitas.prototype.model.calarm.Alarm#getOccurance()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_Occurance();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.prototype.model.calarm.Alarm#getAlarmation <em>Alarmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarmation</em>'.
	 * @see org.civitas.prototype.model.calarm.Alarm#getAlarmation()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_Alarmation();

	/**
	 * Returns the meta object for the reference list '{@link org.civitas.prototype.model.calarm.Alarm#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see org.civitas.prototype.model.calarm.Alarm#getAssets()
	 * @see #getAlarm()
	 * @generated
	 */
	EReference getAlarm_Assets();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.prototype.model.calarm.Alarm#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.civitas.prototype.model.calarm.Alarm#getSeverity()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_Severity();

	/**
	 * Returns the meta object for the reference list '{@link org.civitas.prototype.model.calarm.Alarm#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scope</em>'.
	 * @see org.civitas.prototype.model.calarm.Alarm#getScope()
	 * @see #getAlarm()
	 * @generated
	 */
	EReference getAlarm_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.prototype.model.calarm.Alarm#getNotificationType <em>Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification Type</em>'.
	 * @see org.civitas.prototype.model.calarm.Alarm#getNotificationType()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_NotificationType();

	/**
	 * Returns the meta object for class '{@link org.civitas.prototype.model.calarm.SimpleAlarm <em>Simple Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Alarm</em>'.
	 * @see org.civitas.prototype.model.calarm.SimpleAlarm
	 * @generated
	 */
	EClass getSimpleAlarm();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.prototype.model.calarm.SimpleAlarm#getAlarmId <em>Alarm Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Id</em>'.
	 * @see org.civitas.prototype.model.calarm.SimpleAlarm#getAlarmId()
	 * @see #getSimpleAlarm()
	 * @generated
	 */
	EAttribute getSimpleAlarm_AlarmId();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.prototype.model.calarm.SimpleAlarm#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.civitas.prototype.model.calarm.SimpleAlarm#getSeverity()
	 * @see #getSimpleAlarm()
	 * @generated
	 */
	EAttribute getSimpleAlarm_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.prototype.model.calarm.SimpleAlarm#getNotificationType <em>Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification Type</em>'.
	 * @see org.civitas.prototype.model.calarm.SimpleAlarm#getNotificationType()
	 * @see #getSimpleAlarm()
	 * @generated
	 */
	EAttribute getSimpleAlarm_NotificationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.civitas.prototype.model.calarm.SimpleAlarm#getAlarmReceiver <em>Alarm Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alarm Receiver</em>'.
	 * @see org.civitas.prototype.model.calarm.SimpleAlarm#getAlarmReceiver()
	 * @see #getSimpleAlarm()
	 * @generated
	 */
	EReference getSimpleAlarm_AlarmReceiver();

	/**
	 * Returns the meta object for the containment reference '{@link org.civitas.prototype.model.calarm.SimpleAlarm#getAlarmTriggerEvent <em>Alarm Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alarm Trigger Event</em>'.
	 * @see org.civitas.prototype.model.calarm.SimpleAlarm#getAlarmTriggerEvent()
	 * @see #getSimpleAlarm()
	 * @generated
	 */
	EReference getSimpleAlarm_AlarmTriggerEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.prototype.model.calarm.SimpleAlarm#getMassage <em>Massage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Massage</em>'.
	 * @see org.civitas.prototype.model.calarm.SimpleAlarm#getMassage()
	 * @see #getSimpleAlarm()
	 * @generated
	 */
	EAttribute getSimpleAlarm_Massage();

	/**
	 * Returns the meta object for enum '{@link org.civitas.prototype.model.calarm.SeverityType <em>Severity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity Type</em>'.
	 * @see org.civitas.prototype.model.calarm.SeverityType
	 * @generated
	 */
	EEnum getSeverityType();

	/**
	 * Returns the meta object for enum '{@link org.civitas.prototype.model.calarm.NotificationType <em>Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Notification Type</em>'.
	 * @see org.civitas.prototype.model.calarm.NotificationType
	 * @generated
	 */
	EEnum getNotificationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CIVAlarmFactory getCIVAlarmFactory();

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
		 * The meta object literal for the '{@link org.civitas.prototype.model.calarm.impl.AlarmImpl <em>Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.prototype.model.calarm.impl.AlarmImpl
		 * @see org.civitas.prototype.model.calarm.impl.CIVAlarmPackageImpl#getAlarm()
		 * @generated
		 */
		EClass ALARM = eINSTANCE.getAlarm();

		/**
		 * The meta object literal for the '<em><b>Alarm Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM__ALARM_ID = eINSTANCE.getAlarm_AlarmId();

		/**
		 * The meta object literal for the '<em><b>Occurance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM__OCCURANCE = eINSTANCE.getAlarm_Occurance();

		/**
		 * The meta object literal for the '<em><b>Alarmation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM__ALARMATION = eINSTANCE.getAlarm_Alarmation();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALARM__ASSETS = eINSTANCE.getAlarm_Assets();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM__SEVERITY = eINSTANCE.getAlarm_Severity();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALARM__SCOPE = eINSTANCE.getAlarm_Scope();

		/**
		 * The meta object literal for the '<em><b>Notification Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM__NOTIFICATION_TYPE = eINSTANCE.getAlarm_NotificationType();

		/**
		 * The meta object literal for the '{@link org.civitas.prototype.model.calarm.impl.SimpleAlarmImpl <em>Simple Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.prototype.model.calarm.impl.SimpleAlarmImpl
		 * @see org.civitas.prototype.model.calarm.impl.CIVAlarmPackageImpl#getSimpleAlarm()
		 * @generated
		 */
		EClass SIMPLE_ALARM = eINSTANCE.getSimpleAlarm();

		/**
		 * The meta object literal for the '<em><b>Alarm Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ALARM__ALARM_ID = eINSTANCE.getSimpleAlarm_AlarmId();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ALARM__SEVERITY = eINSTANCE.getSimpleAlarm_Severity();

		/**
		 * The meta object literal for the '<em><b>Notification Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ALARM__NOTIFICATION_TYPE = eINSTANCE.getSimpleAlarm_NotificationType();

		/**
		 * The meta object literal for the '<em><b>Alarm Receiver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_ALARM__ALARM_RECEIVER = eINSTANCE.getSimpleAlarm_AlarmReceiver();

		/**
		 * The meta object literal for the '<em><b>Alarm Trigger Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_ALARM__ALARM_TRIGGER_EVENT = eINSTANCE.getSimpleAlarm_AlarmTriggerEvent();

		/**
		 * The meta object literal for the '<em><b>Massage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ALARM__MASSAGE = eINSTANCE.getSimpleAlarm_Massage();

		/**
		 * The meta object literal for the '{@link org.civitas.prototype.model.calarm.SeverityType <em>Severity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.prototype.model.calarm.SeverityType
		 * @see org.civitas.prototype.model.calarm.impl.CIVAlarmPackageImpl#getSeverityType()
		 * @generated
		 */
		EEnum SEVERITY_TYPE = eINSTANCE.getSeverityType();

		/**
		 * The meta object literal for the '{@link org.civitas.prototype.model.calarm.NotificationType <em>Notification Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.prototype.model.calarm.NotificationType
		 * @see org.civitas.prototype.model.calarm.impl.CIVAlarmPackageImpl#getNotificationType()
		 * @generated
		 */
		EEnum NOTIFICATION_TYPE = eINSTANCE.getNotificationType();

	}

} //CIVAlarmPackage
