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
package org.civitas.meter.target.impl;

import java.util.Collection;

import org.civitas.meter.target.Meter;
import org.civitas.meter.target.MeterHistory;
import org.civitas.meter.target.MeterReading;
import org.civitas.meter.target.MeteringPoint;
import org.civitas.meter.target.Plant;
import org.civitas.meter.target.targetPackage;

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
 * An implementation of the model object '<em><b>Metering Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.target.impl.MeteringPointImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.MeteringPointImpl#getPlant <em>Plant</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.MeteringPointImpl#getCurrentMeter <em>Current Meter</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.MeteringPointImpl#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.MeteringPointImpl#getMeterHistory <em>Meter History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeteringPointImpl extends MinimalEObjectImpl.Container implements MeteringPoint {
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
	 * The cached value of the '{@link #getPlant() <em>Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlant()
	 * @generated
	 * @ordered
	 */
	protected Plant plant;

	/**
	 * The cached value of the '{@link #getCurrentMeter() <em>Current Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMeter()
	 * @generated
	 * @ordered
	 */
	protected Meter currentMeter;

	/**
	 * The cached value of the '{@link #getMeterReadings() <em>Meter Readings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterReading> meterReadings;

	/**
	 * The cached value of the '{@link #getMeterHistory() <em>Meter History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterHistory> meterHistory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeteringPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return targetPackage.Literals.METERING_POINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.METERING_POINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plant getPlant() {
		if (plant != null && plant.eIsProxy()) {
			InternalEObject oldPlant = (InternalEObject)plant;
			plant = (Plant)eResolveProxy(oldPlant);
			if (plant != oldPlant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, targetPackage.METERING_POINT__PLANT, oldPlant, plant));
			}
		}
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant basicGetPlant() {
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlant(Plant newPlant) {
		Plant oldPlant = plant;
		plant = newPlant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.METERING_POINT__PLANT, oldPlant, plant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meter getCurrentMeter() {
		if (currentMeter != null && currentMeter.eIsProxy()) {
			InternalEObject oldCurrentMeter = (InternalEObject)currentMeter;
			currentMeter = (Meter)eResolveProxy(oldCurrentMeter);
			if (currentMeter != oldCurrentMeter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, targetPackage.METERING_POINT__CURRENT_METER, oldCurrentMeter, currentMeter));
			}
		}
		return currentMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meter basicGetCurrentMeter() {
		return currentMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentMeter(Meter newCurrentMeter) {
		Meter oldCurrentMeter = currentMeter;
		currentMeter = newCurrentMeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.METERING_POINT__CURRENT_METER, oldCurrentMeter, currentMeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeterReading> getMeterReadings() {
		if (meterReadings == null) {
			meterReadings = new EObjectContainmentEList<MeterReading>(MeterReading.class, this, targetPackage.METERING_POINT__METER_READINGS);
		}
		return meterReadings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeterHistory> getMeterHistory() {
		if (meterHistory == null) {
			meterHistory = new EObjectContainmentEList<MeterHistory>(MeterHistory.class, this, targetPackage.METERING_POINT__METER_HISTORY);
		}
		return meterHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case targetPackage.METERING_POINT__METER_READINGS:
				return ((InternalEList<?>)getMeterReadings()).basicRemove(otherEnd, msgs);
			case targetPackage.METERING_POINT__METER_HISTORY:
				return ((InternalEList<?>)getMeterHistory()).basicRemove(otherEnd, msgs);
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
			case targetPackage.METERING_POINT__ID:
				return getId();
			case targetPackage.METERING_POINT__PLANT:
				if (resolve) return getPlant();
				return basicGetPlant();
			case targetPackage.METERING_POINT__CURRENT_METER:
				if (resolve) return getCurrentMeter();
				return basicGetCurrentMeter();
			case targetPackage.METERING_POINT__METER_READINGS:
				return getMeterReadings();
			case targetPackage.METERING_POINT__METER_HISTORY:
				return getMeterHistory();
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
			case targetPackage.METERING_POINT__ID:
				setId((String)newValue);
				return;
			case targetPackage.METERING_POINT__PLANT:
				setPlant((Plant)newValue);
				return;
			case targetPackage.METERING_POINT__CURRENT_METER:
				setCurrentMeter((Meter)newValue);
				return;
			case targetPackage.METERING_POINT__METER_READINGS:
				getMeterReadings().clear();
				getMeterReadings().addAll((Collection<? extends MeterReading>)newValue);
				return;
			case targetPackage.METERING_POINT__METER_HISTORY:
				getMeterHistory().clear();
				getMeterHistory().addAll((Collection<? extends MeterHistory>)newValue);
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
			case targetPackage.METERING_POINT__ID:
				setId(ID_EDEFAULT);
				return;
			case targetPackage.METERING_POINT__PLANT:
				setPlant((Plant)null);
				return;
			case targetPackage.METERING_POINT__CURRENT_METER:
				setCurrentMeter((Meter)null);
				return;
			case targetPackage.METERING_POINT__METER_READINGS:
				getMeterReadings().clear();
				return;
			case targetPackage.METERING_POINT__METER_HISTORY:
				getMeterHistory().clear();
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
			case targetPackage.METERING_POINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case targetPackage.METERING_POINT__PLANT:
				return plant != null;
			case targetPackage.METERING_POINT__CURRENT_METER:
				return currentMeter != null;
			case targetPackage.METERING_POINT__METER_READINGS:
				return meterReadings != null && !meterReadings.isEmpty();
			case targetPackage.METERING_POINT__METER_HISTORY:
				return meterHistory != null && !meterHistory.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //MeteringPointImpl
