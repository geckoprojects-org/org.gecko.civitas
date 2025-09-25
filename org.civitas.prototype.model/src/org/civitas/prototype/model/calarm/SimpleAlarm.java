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

import org.civitas.glt.model.glt.Building;
import org.civitas.glt.model.glt.Contact;

import org.civitas.glt.sensor.model.sensor.SensorReading;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.prototype.model.calarm.SimpleAlarm#getAlarmId <em>Alarm Id</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.SimpleAlarm#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.SimpleAlarm#getNotificationType <em>Notification Type</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.SimpleAlarm#getAlarmReceiver <em>Alarm Receiver</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.SimpleAlarm#getAlarmTriggerEvent <em>Alarm Trigger Event</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.SimpleAlarm#getAlarmTriggeringBuilder <em>Alarm Triggering Builder</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.SimpleAlarm#getMassage <em>Massage</em>}</li>
 * </ul>
 *
 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getSimpleAlarm()
 * @model
 * @generated
 */
@ProviderType
public interface SimpleAlarm extends EObject {
	/**
	 * Returns the value of the '<em><b>Alarm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Id</em>' attribute.
	 * @see #setAlarmId(String)
	 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getSimpleAlarm_AlarmId()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getAlarmId();

	/**
	 * Sets the value of the '{@link org.civitas.prototype.model.calarm.SimpleAlarm#getAlarmId <em>Alarm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Id</em>' attribute.
	 * @see #getAlarmId()
	 * @generated
	 */
	void setAlarmId(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.civitas.prototype.model.calarm.SeverityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.civitas.prototype.model.calarm.SeverityType
	 * @see #setSeverity(SeverityType)
	 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getSimpleAlarm_Severity()
	 * @model
	 * @generated
	 */
	SeverityType getSeverity();

	/**
	 * Sets the value of the '{@link org.civitas.prototype.model.calarm.SimpleAlarm#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.civitas.prototype.model.calarm.SeverityType
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(SeverityType value);

	/**
	 * Returns the value of the '<em><b>Notification Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.civitas.prototype.model.calarm.NotificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Type</em>' attribute.
	 * @see org.civitas.prototype.model.calarm.NotificationType
	 * @see #setNotificationType(NotificationType)
	 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getSimpleAlarm_NotificationType()
	 * @model
	 * @generated
	 */
	NotificationType getNotificationType();

	/**
	 * Sets the value of the '{@link org.civitas.prototype.model.calarm.SimpleAlarm#getNotificationType <em>Notification Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Type</em>' attribute.
	 * @see org.civitas.prototype.model.calarm.NotificationType
	 * @see #getNotificationType()
	 * @generated
	 */
	void setNotificationType(NotificationType value);

	/**
	 * Returns the value of the '<em><b>Alarm Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Receiver</em>' containment reference.
	 * @see #setAlarmReceiver(Contact)
	 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getSimpleAlarm_AlarmReceiver()
	 * @model containment="true"
	 * @generated
	 */
	Contact getAlarmReceiver();

	/**
	 * Sets the value of the '{@link org.civitas.prototype.model.calarm.SimpleAlarm#getAlarmReceiver <em>Alarm Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Receiver</em>' containment reference.
	 * @see #getAlarmReceiver()
	 * @generated
	 */
	void setAlarmReceiver(Contact value);

	/**
	 * Returns the value of the '<em><b>Alarm Trigger Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Trigger Event</em>' containment reference.
	 * @see #setAlarmTriggerEvent(SensorReading)
	 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getSimpleAlarm_AlarmTriggerEvent()
	 * @model containment="true"
	 * @generated
	 */
	SensorReading getAlarmTriggerEvent();

	/**
	 * Sets the value of the '{@link org.civitas.prototype.model.calarm.SimpleAlarm#getAlarmTriggerEvent <em>Alarm Trigger Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Trigger Event</em>' containment reference.
	 * @see #getAlarmTriggerEvent()
	 * @generated
	 */
	void setAlarmTriggerEvent(SensorReading value);

	/**
	 * Returns the value of the '<em><b>Alarm Triggering Builder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Triggering Builder</em>' containment reference.
	 * @see #setAlarmTriggeringBuilder(Building)
	 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getSimpleAlarm_AlarmTriggeringBuilder()
	 * @model containment="true"
	 * @generated
	 */
	Building getAlarmTriggeringBuilder();

	/**
	 * Sets the value of the '{@link org.civitas.prototype.model.calarm.SimpleAlarm#getAlarmTriggeringBuilder <em>Alarm Triggering Builder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Triggering Builder</em>' containment reference.
	 * @see #getAlarmTriggeringBuilder()
	 * @generated
	 */
	void setAlarmTriggeringBuilder(Building value);

	/**
	 * Returns the value of the '<em><b>Massage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Massage</em>' attribute.
	 * @see #setMassage(String)
	 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getSimpleAlarm_Massage()
	 * @model
	 * @generated
	 */
	String getMassage();

	/**
	 * Sets the value of the '{@link org.civitas.prototype.model.calarm.SimpleAlarm#getMassage <em>Massage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Massage</em>' attribute.
	 * @see #getMassage()
	 * @generated
	 */
	void setMassage(String value);

} // SimpleAlarm
