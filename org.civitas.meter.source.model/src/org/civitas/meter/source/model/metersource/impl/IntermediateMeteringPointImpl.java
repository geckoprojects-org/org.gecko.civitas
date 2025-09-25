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

import java.util.Collection;

import org.civitas.meter.source.model.metersource.IntermediateMeteringPoint;
import org.civitas.meter.source.model.metersource.MeterSourcePackage;
import org.civitas.meter.source.model.metersource.Reading;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediate Metering Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.IntermediateMeteringPointImpl#getMeterId <em>Meter Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.IntermediateMeteringPointImpl#getPlantId <em>Plant Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.IntermediateMeteringPointImpl#getReadings <em>Readings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermediateMeteringPointImpl extends MinimalEObjectImpl.Container implements IntermediateMeteringPoint {
	/**
	 * The default value of the '{@link #getMeterId() <em>Meter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterId()
	 * @generated
	 * @ordered
	 */
	protected static final String METER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeterId() <em>Meter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterId()
	 * @generated
	 * @ordered
	 */
	protected String meterId = METER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlantId() <em>Plant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantId()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlantId() <em>Plant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantId()
	 * @generated
	 * @ordered
	 */
	protected String plantId = PLANT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReadings() <em>Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<Reading> readings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateMeteringPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeterSourcePackage.Literals.INTERMEDIATE_METERING_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMeterId() {
		return meterId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeterId(String newMeterId) {
		String oldMeterId = meterId;
		meterId = newMeterId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.INTERMEDIATE_METERING_POINT__METER_ID, oldMeterId, meterId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlantId() {
		return plantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlantId(String newPlantId) {
		String oldPlantId = plantId;
		plantId = newPlantId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.INTERMEDIATE_METERING_POINT__PLANT_ID, oldPlantId, plantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reading> getReadings() {
		if (readings == null) {
			readings = new EObjectResolvingEList<Reading>(Reading.class, this, MeterSourcePackage.INTERMEDIATE_METERING_POINT__READINGS);
		}
		return readings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeterSourcePackage.INTERMEDIATE_METERING_POINT__METER_ID:
				return getMeterId();
			case MeterSourcePackage.INTERMEDIATE_METERING_POINT__PLANT_ID:
				return getPlantId();
			case MeterSourcePackage.INTERMEDIATE_METERING_POINT__READINGS:
				return getReadings();
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
			case MeterSourcePackage.INTERMEDIATE_METERING_POINT__METER_ID:
				setMeterId((String)newValue);
				return;
			case MeterSourcePackage.INTERMEDIATE_METERING_POINT__PLANT_ID:
				setPlantId((String)newValue);
				return;
			case MeterSourcePackage.INTERMEDIATE_METERING_POINT__READINGS:
				getReadings().clear();
				getReadings().addAll((Collection<? extends Reading>)newValue);
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
			case MeterSourcePackage.INTERMEDIATE_METERING_POINT__METER_ID:
				setMeterId(METER_ID_EDEFAULT);
				return;
			case MeterSourcePackage.INTERMEDIATE_METERING_POINT__PLANT_ID:
				setPlantId(PLANT_ID_EDEFAULT);
				return;
			case MeterSourcePackage.INTERMEDIATE_METERING_POINT__READINGS:
				getReadings().clear();
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
			case MeterSourcePackage.INTERMEDIATE_METERING_POINT__METER_ID:
				return METER_ID_EDEFAULT == null ? meterId != null : !METER_ID_EDEFAULT.equals(meterId);
			case MeterSourcePackage.INTERMEDIATE_METERING_POINT__PLANT_ID:
				return PLANT_ID_EDEFAULT == null ? plantId != null : !PLANT_ID_EDEFAULT.equals(plantId);
			case MeterSourcePackage.INTERMEDIATE_METERING_POINT__READINGS:
				return readings != null && !readings.isEmpty();
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
		result.append(" (meterId: ");
		result.append(meterId);
		result.append(", plantId: ");
		result.append(plantId);
		result.append(')');
		return result.toString();
	}

} //IntermediateMeteringPointImpl
