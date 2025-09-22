/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.civitas.meter.target.impl;

import java.util.Date;

import org.civitas.meter.target.MeterReading;
import org.civitas.meter.target.MeteringPoint;
import org.civitas.meter.target.targetPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.target.impl.MeterReadingImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.MeterReadingImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.MeterReadingImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.MeterReadingImpl#getMeteringPoint <em>Metering Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterReadingImpl extends MinimalEObjectImpl.Container implements MeterReading {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

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
	 * The cached value of the '{@link #getMeteringPoint() <em>Metering Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeteringPoint()
	 * @generated
	 * @ordered
	 */
	protected MeteringPoint meteringPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return targetPackage.Literals.METER_READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.METER_READING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.METER_READING__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.METER_READING__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeteringPoint getMeteringPoint() {
		if (meteringPoint != null && meteringPoint.eIsProxy()) {
			InternalEObject oldMeteringPoint = (InternalEObject)meteringPoint;
			meteringPoint = (MeteringPoint)eResolveProxy(oldMeteringPoint);
			if (meteringPoint != oldMeteringPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, targetPackage.METER_READING__METERING_POINT, oldMeteringPoint, meteringPoint));
			}
		}
		return meteringPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringPoint basicGetMeteringPoint() {
		return meteringPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeteringPoint(MeteringPoint newMeteringPoint) {
		MeteringPoint oldMeteringPoint = meteringPoint;
		meteringPoint = newMeteringPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.METER_READING__METERING_POINT, oldMeteringPoint, meteringPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case targetPackage.METER_READING__ID:
				return getId();
			case targetPackage.METER_READING__VALUE:
				return getValue();
			case targetPackage.METER_READING__TIMESTAMP:
				return getTimestamp();
			case targetPackage.METER_READING__METERING_POINT:
				if (resolve) return getMeteringPoint();
				return basicGetMeteringPoint();
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
			case targetPackage.METER_READING__ID:
				setId((String)newValue);
				return;
			case targetPackage.METER_READING__VALUE:
				setValue((Double)newValue);
				return;
			case targetPackage.METER_READING__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case targetPackage.METER_READING__METERING_POINT:
				setMeteringPoint((MeteringPoint)newValue);
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
			case targetPackage.METER_READING__ID:
				setId(ID_EDEFAULT);
				return;
			case targetPackage.METER_READING__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case targetPackage.METER_READING__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case targetPackage.METER_READING__METERING_POINT:
				setMeteringPoint((MeteringPoint)null);
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
			case targetPackage.METER_READING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case targetPackage.METER_READING__VALUE:
				return value != VALUE_EDEFAULT;
			case targetPackage.METER_READING__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case targetPackage.METER_READING__METERING_POINT:
				return meteringPoint != null;
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
		result.append(", value: ");
		result.append(value);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //MeterReadingImpl
