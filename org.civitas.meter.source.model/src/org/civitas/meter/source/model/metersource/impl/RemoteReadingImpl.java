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
package org.civitas.meter.source.model.metersource.impl;

import java.util.Date;

import org.civitas.meter.source.model.metersource.MeterSourcePackage;
import org.civitas.meter.source.model.metersource.RemoteReading;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.RemoteReadingImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.RemoteReadingImpl#getMeterId <em>Meter Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.RemoteReadingImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.RemoteReadingImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoteReadingImpl extends MinimalEObjectImpl.Container implements RemoteReading {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeterId() <em>Meter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterId()
	 * @generated
	 * @ordered
	 */
	protected static final int METER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMeterId() <em>Meter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterId()
	 * @generated
	 * @ordered
	 */
	protected int meterId = METER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeterSourcePackage.Literals.REMOTE_READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.REMOTE_READING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMeterId() {
		return meterId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeterId(int newMeterId) {
		int oldMeterId = meterId;
		meterId = newMeterId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.REMOTE_READING__METER_ID, oldMeterId, meterId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.REMOTE_READING__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.REMOTE_READING__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeterSourcePackage.REMOTE_READING__ID:
				return getId();
			case MeterSourcePackage.REMOTE_READING__METER_ID:
				return getMeterId();
			case MeterSourcePackage.REMOTE_READING__VALUE:
				return getValue();
			case MeterSourcePackage.REMOTE_READING__TIMESTAMP:
				return getTimestamp();
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
			case MeterSourcePackage.REMOTE_READING__ID:
				setId((Integer)newValue);
				return;
			case MeterSourcePackage.REMOTE_READING__METER_ID:
				setMeterId((Integer)newValue);
				return;
			case MeterSourcePackage.REMOTE_READING__VALUE:
				setValue((Integer)newValue);
				return;
			case MeterSourcePackage.REMOTE_READING__TIMESTAMP:
				setTimestamp((Date)newValue);
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
			case MeterSourcePackage.REMOTE_READING__ID:
				setId(ID_EDEFAULT);
				return;
			case MeterSourcePackage.REMOTE_READING__METER_ID:
				setMeterId(METER_ID_EDEFAULT);
				return;
			case MeterSourcePackage.REMOTE_READING__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MeterSourcePackage.REMOTE_READING__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
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
			case MeterSourcePackage.REMOTE_READING__ID:
				return id != ID_EDEFAULT;
			case MeterSourcePackage.REMOTE_READING__METER_ID:
				return meterId != METER_ID_EDEFAULT;
			case MeterSourcePackage.REMOTE_READING__VALUE:
				return value != VALUE_EDEFAULT;
			case MeterSourcePackage.REMOTE_READING__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", meterId: ");
		result.append(meterId);
		result.append(", value: ");
		result.append(value);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //RemoteReadingImpl
