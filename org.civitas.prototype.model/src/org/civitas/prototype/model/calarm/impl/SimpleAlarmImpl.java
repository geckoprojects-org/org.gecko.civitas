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
package org.civitas.prototype.model.calarm.impl;

import org.civitas.glt.model.glt.Contact;

import org.civitas.glt.sensor.model.sensor.SensorReading;

import org.civitas.prototype.model.calarm.CIVAlarmPackage;
import org.civitas.prototype.model.calarm.NotificationType;
import org.civitas.prototype.model.calarm.SeverityType;
import org.civitas.prototype.model.calarm.SimpleAlarm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.SimpleAlarmImpl#getAlarmId <em>Alarm Id</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.SimpleAlarmImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.SimpleAlarmImpl#getNotificationType <em>Notification Type</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.SimpleAlarmImpl#getAlarmReceiver <em>Alarm Receiver</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.SimpleAlarmImpl#getAlarmTriggerEvent <em>Alarm Trigger Event</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.SimpleAlarmImpl#getMassage <em>Massage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleAlarmImpl extends MinimalEObjectImpl.Container implements SimpleAlarm {
	/**
	 * The default value of the '{@link #getAlarmId() <em>Alarm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmId()
	 * @generated
	 * @ordered
	 */
	protected static final String ALARM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlarmId() <em>Alarm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmId()
	 * @generated
	 * @ordered
	 */
	protected String alarmId = ALARM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final SeverityType SEVERITY_EDEFAULT = SeverityType.INFO;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected SeverityType severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotificationType() <em>Notification Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationType()
	 * @generated
	 * @ordered
	 */
	protected static final NotificationType NOTIFICATION_TYPE_EDEFAULT = NotificationType.EMAIL;

	/**
	 * The cached value of the '{@link #getNotificationType() <em>Notification Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationType()
	 * @generated
	 * @ordered
	 */
	protected NotificationType notificationType = NOTIFICATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlarmReceiver() <em>Alarm Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmReceiver()
	 * @generated
	 * @ordered
	 */
	protected Contact alarmReceiver;

	/**
	 * The cached value of the '{@link #getAlarmTriggerEvent() <em>Alarm Trigger Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmTriggerEvent()
	 * @generated
	 * @ordered
	 */
	protected SensorReading alarmTriggerEvent;

	/**
	 * The default value of the '{@link #getMassage() <em>Massage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassage()
	 * @generated
	 * @ordered
	 */
	protected static final String MASSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMassage() <em>Massage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassage()
	 * @generated
	 * @ordered
	 */
	protected String massage = MASSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleAlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CIVAlarmPackage.Literals.SIMPLE_ALARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlarmId() {
		return alarmId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlarmId(String newAlarmId) {
		String oldAlarmId = alarmId;
		alarmId = newAlarmId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CIVAlarmPackage.SIMPLE_ALARM__ALARM_ID, oldAlarmId, alarmId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeverityType getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(SeverityType newSeverity) {
		SeverityType oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CIVAlarmPackage.SIMPLE_ALARM__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationType getNotificationType() {
		return notificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotificationType(NotificationType newNotificationType) {
		NotificationType oldNotificationType = notificationType;
		notificationType = newNotificationType == null ? NOTIFICATION_TYPE_EDEFAULT : newNotificationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CIVAlarmPackage.SIMPLE_ALARM__NOTIFICATION_TYPE, oldNotificationType, notificationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contact getAlarmReceiver() {
		return alarmReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlarmReceiver(Contact newAlarmReceiver, NotificationChain msgs) {
		Contact oldAlarmReceiver = alarmReceiver;
		alarmReceiver = newAlarmReceiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CIVAlarmPackage.SIMPLE_ALARM__ALARM_RECEIVER, oldAlarmReceiver, newAlarmReceiver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlarmReceiver(Contact newAlarmReceiver) {
		if (newAlarmReceiver != alarmReceiver) {
			NotificationChain msgs = null;
			if (alarmReceiver != null)
				msgs = ((InternalEObject)alarmReceiver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CIVAlarmPackage.SIMPLE_ALARM__ALARM_RECEIVER, null, msgs);
			if (newAlarmReceiver != null)
				msgs = ((InternalEObject)newAlarmReceiver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CIVAlarmPackage.SIMPLE_ALARM__ALARM_RECEIVER, null, msgs);
			msgs = basicSetAlarmReceiver(newAlarmReceiver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CIVAlarmPackage.SIMPLE_ALARM__ALARM_RECEIVER, newAlarmReceiver, newAlarmReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorReading getAlarmTriggerEvent() {
		return alarmTriggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlarmTriggerEvent(SensorReading newAlarmTriggerEvent, NotificationChain msgs) {
		SensorReading oldAlarmTriggerEvent = alarmTriggerEvent;
		alarmTriggerEvent = newAlarmTriggerEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGER_EVENT, oldAlarmTriggerEvent, newAlarmTriggerEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlarmTriggerEvent(SensorReading newAlarmTriggerEvent) {
		if (newAlarmTriggerEvent != alarmTriggerEvent) {
			NotificationChain msgs = null;
			if (alarmTriggerEvent != null)
				msgs = ((InternalEObject)alarmTriggerEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGER_EVENT, null, msgs);
			if (newAlarmTriggerEvent != null)
				msgs = ((InternalEObject)newAlarmTriggerEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGER_EVENT, null, msgs);
			msgs = basicSetAlarmTriggerEvent(newAlarmTriggerEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGER_EVENT, newAlarmTriggerEvent, newAlarmTriggerEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMassage() {
		return massage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMassage(String newMassage) {
		String oldMassage = massage;
		massage = newMassage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CIVAlarmPackage.SIMPLE_ALARM__MASSAGE, oldMassage, massage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_RECEIVER:
				return basicSetAlarmReceiver(null, msgs);
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGER_EVENT:
				return basicSetAlarmTriggerEvent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_ID:
				return getAlarmId();
			case CIVAlarmPackage.SIMPLE_ALARM__SEVERITY:
				return getSeverity();
			case CIVAlarmPackage.SIMPLE_ALARM__NOTIFICATION_TYPE:
				return getNotificationType();
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_RECEIVER:
				return getAlarmReceiver();
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGER_EVENT:
				return getAlarmTriggerEvent();
			case CIVAlarmPackage.SIMPLE_ALARM__MASSAGE:
				return getMassage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_ID:
				setAlarmId((String)newValue);
				return;
			case CIVAlarmPackage.SIMPLE_ALARM__SEVERITY:
				setSeverity((SeverityType)newValue);
				return;
			case CIVAlarmPackage.SIMPLE_ALARM__NOTIFICATION_TYPE:
				setNotificationType((NotificationType)newValue);
				return;
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_RECEIVER:
				setAlarmReceiver((Contact)newValue);
				return;
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGER_EVENT:
				setAlarmTriggerEvent((SensorReading)newValue);
				return;
			case CIVAlarmPackage.SIMPLE_ALARM__MASSAGE:
				setMassage((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_ID:
				setAlarmId(ALARM_ID_EDEFAULT);
				return;
			case CIVAlarmPackage.SIMPLE_ALARM__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case CIVAlarmPackage.SIMPLE_ALARM__NOTIFICATION_TYPE:
				setNotificationType(NOTIFICATION_TYPE_EDEFAULT);
				return;
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_RECEIVER:
				setAlarmReceiver((Contact)null);
				return;
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGER_EVENT:
				setAlarmTriggerEvent((SensorReading)null);
				return;
			case CIVAlarmPackage.SIMPLE_ALARM__MASSAGE:
				setMassage(MASSAGE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_ID:
				return ALARM_ID_EDEFAULT == null ? alarmId != null : !ALARM_ID_EDEFAULT.equals(alarmId);
			case CIVAlarmPackage.SIMPLE_ALARM__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case CIVAlarmPackage.SIMPLE_ALARM__NOTIFICATION_TYPE:
				return notificationType != NOTIFICATION_TYPE_EDEFAULT;
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_RECEIVER:
				return alarmReceiver != null;
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGER_EVENT:
				return alarmTriggerEvent != null;
			case CIVAlarmPackage.SIMPLE_ALARM__MASSAGE:
				return MASSAGE_EDEFAULT == null ? massage != null : !MASSAGE_EDEFAULT.equals(massage);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (alarmId: ");
		result.append(alarmId);
		result.append(", severity: ");
		result.append(severity);
		result.append(", notificationType: ");
		result.append(notificationType);
		result.append(", massage: ");
		result.append(massage);
		result.append(')');
		return result.toString();
	}

} //SimpleAlarmImpl
