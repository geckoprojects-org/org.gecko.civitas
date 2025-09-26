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

import java.util.Collection;

import org.civitas.glt.model.glt.Building;
import org.civitas.glt.model.glt.Contact;

import org.civitas.glt.sensor.model.sensor.SensorReading;

import org.civitas.prototype.model.calarm.CIVAlarmPackage;
import org.civitas.prototype.model.calarm.SimpleAlarm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.SimpleAlarmImpl#getAlarmId <em>Alarm Id</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.SimpleAlarmImpl#getAlarmReceiver <em>Alarm Receiver</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.SimpleAlarmImpl#getAlarmTriggerEvent <em>Alarm Trigger Event</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.SimpleAlarmImpl#getAlarmTriggeringBuilder <em>Alarm Triggering Builder</em>}</li>
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
	 * The cached value of the '{@link #getAlarmReceiver() <em>Alarm Receiver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmReceiver()
	 * @generated
	 * @ordered
	 */
	protected EList<Contact> alarmReceiver;

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
	 * The cached value of the '{@link #getAlarmTriggeringBuilder() <em>Alarm Triggering Builder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmTriggeringBuilder()
	 * @generated
	 * @ordered
	 */
	protected Building alarmTriggeringBuilder;

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
	public EList<Contact> getAlarmReceiver() {
		if (alarmReceiver == null) {
			alarmReceiver = new EObjectContainmentEList<Contact>(Contact.class, this, CIVAlarmPackage.SIMPLE_ALARM__ALARM_RECEIVER);
		}
		return alarmReceiver;
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
	public Building getAlarmTriggeringBuilder() {
		return alarmTriggeringBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlarmTriggeringBuilder(Building newAlarmTriggeringBuilder, NotificationChain msgs) {
		Building oldAlarmTriggeringBuilder = alarmTriggeringBuilder;
		alarmTriggeringBuilder = newAlarmTriggeringBuilder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGERING_BUILDER, oldAlarmTriggeringBuilder, newAlarmTriggeringBuilder);
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
	public void setAlarmTriggeringBuilder(Building newAlarmTriggeringBuilder) {
		if (newAlarmTriggeringBuilder != alarmTriggeringBuilder) {
			NotificationChain msgs = null;
			if (alarmTriggeringBuilder != null)
				msgs = ((InternalEObject)alarmTriggeringBuilder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGERING_BUILDER, null, msgs);
			if (newAlarmTriggeringBuilder != null)
				msgs = ((InternalEObject)newAlarmTriggeringBuilder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGERING_BUILDER, null, msgs);
			msgs = basicSetAlarmTriggeringBuilder(newAlarmTriggeringBuilder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGERING_BUILDER, newAlarmTriggeringBuilder, newAlarmTriggeringBuilder));
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
				return ((InternalEList<?>)getAlarmReceiver()).basicRemove(otherEnd, msgs);
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGER_EVENT:
				return basicSetAlarmTriggerEvent(null, msgs);
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGERING_BUILDER:
				return basicSetAlarmTriggeringBuilder(null, msgs);
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
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_RECEIVER:
				return getAlarmReceiver();
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGER_EVENT:
				return getAlarmTriggerEvent();
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGERING_BUILDER:
				return getAlarmTriggeringBuilder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_ID:
				setAlarmId((String)newValue);
				return;
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_RECEIVER:
				getAlarmReceiver().clear();
				getAlarmReceiver().addAll((Collection<? extends Contact>)newValue);
				return;
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGER_EVENT:
				setAlarmTriggerEvent((SensorReading)newValue);
				return;
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGERING_BUILDER:
				setAlarmTriggeringBuilder((Building)newValue);
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
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_RECEIVER:
				getAlarmReceiver().clear();
				return;
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGER_EVENT:
				setAlarmTriggerEvent((SensorReading)null);
				return;
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGERING_BUILDER:
				setAlarmTriggeringBuilder((Building)null);
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
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_RECEIVER:
				return alarmReceiver != null && !alarmReceiver.isEmpty();
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGER_EVENT:
				return alarmTriggerEvent != null;
			case CIVAlarmPackage.SIMPLE_ALARM__ALARM_TRIGGERING_BUILDER:
				return alarmTriggeringBuilder != null;
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
		result.append(')');
		return result.toString();
	}

} //SimpleAlarmImpl
