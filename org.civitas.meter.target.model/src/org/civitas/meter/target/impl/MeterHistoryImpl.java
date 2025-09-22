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

import org.civitas.meter.target.Meter;
import org.civitas.meter.target.MeterHistory;
import org.civitas.meter.target.MeteringPoint;
import org.civitas.meter.target.targetPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.target.impl.MeterHistoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.MeterHistoryImpl#getRemovalStatus <em>Removal Status</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.MeterHistoryImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.MeterHistoryImpl#getMeter <em>Meter</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.MeterHistoryImpl#getMeteringPoint <em>Metering Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterHistoryImpl extends MinimalEObjectImpl.Container implements MeterHistory {
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
	 * The default value of the '{@link #getRemovalStatus() <em>Removal Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOVAL_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemovalStatus() <em>Removal Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalStatus()
	 * @generated
	 * @ordered
	 */
	protected String removalStatus = REMOVAL_STATUS_EDEFAULT;

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
	 * The cached value of the '{@link #getMeter() <em>Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter()
	 * @generated
	 * @ordered
	 */
	protected Meter meter;

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
	protected MeterHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return targetPackage.Literals.METER_HISTORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.METER_HISTORY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemovalStatus() {
		return removalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemovalStatus(String newRemovalStatus) {
		String oldRemovalStatus = removalStatus;
		removalStatus = newRemovalStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.METER_HISTORY__REMOVAL_STATUS, oldRemovalStatus, removalStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.METER_HISTORY__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meter getMeter() {
		if (meter != null && meter.eIsProxy()) {
			InternalEObject oldMeter = (InternalEObject)meter;
			meter = (Meter)eResolveProxy(oldMeter);
			if (meter != oldMeter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, targetPackage.METER_HISTORY__METER, oldMeter, meter));
			}
		}
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meter basicGetMeter() {
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeter(Meter newMeter) {
		Meter oldMeter = meter;
		meter = newMeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.METER_HISTORY__METER, oldMeter, meter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, targetPackage.METER_HISTORY__METERING_POINT, oldMeteringPoint, meteringPoint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.METER_HISTORY__METERING_POINT, oldMeteringPoint, meteringPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case targetPackage.METER_HISTORY__ID:
				return getId();
			case targetPackage.METER_HISTORY__REMOVAL_STATUS:
				return getRemovalStatus();
			case targetPackage.METER_HISTORY__TIMESTAMP:
				return getTimestamp();
			case targetPackage.METER_HISTORY__METER:
				if (resolve) return getMeter();
				return basicGetMeter();
			case targetPackage.METER_HISTORY__METERING_POINT:
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
			case targetPackage.METER_HISTORY__ID:
				setId((String)newValue);
				return;
			case targetPackage.METER_HISTORY__REMOVAL_STATUS:
				setRemovalStatus((String)newValue);
				return;
			case targetPackage.METER_HISTORY__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case targetPackage.METER_HISTORY__METER:
				setMeter((Meter)newValue);
				return;
			case targetPackage.METER_HISTORY__METERING_POINT:
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
			case targetPackage.METER_HISTORY__ID:
				setId(ID_EDEFAULT);
				return;
			case targetPackage.METER_HISTORY__REMOVAL_STATUS:
				setRemovalStatus(REMOVAL_STATUS_EDEFAULT);
				return;
			case targetPackage.METER_HISTORY__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case targetPackage.METER_HISTORY__METER:
				setMeter((Meter)null);
				return;
			case targetPackage.METER_HISTORY__METERING_POINT:
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
			case targetPackage.METER_HISTORY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case targetPackage.METER_HISTORY__REMOVAL_STATUS:
				return REMOVAL_STATUS_EDEFAULT == null ? removalStatus != null : !REMOVAL_STATUS_EDEFAULT.equals(removalStatus);
			case targetPackage.METER_HISTORY__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case targetPackage.METER_HISTORY__METER:
				return meter != null;
			case targetPackage.METER_HISTORY__METERING_POINT:
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
		result.append(", removalStatus: ");
		result.append(removalStatus);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //MeterHistoryImpl
