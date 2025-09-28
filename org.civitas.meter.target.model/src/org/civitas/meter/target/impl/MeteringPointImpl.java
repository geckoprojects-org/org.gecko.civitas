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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 *   <li>{@link org.civitas.meter.target.impl.MeteringPointImpl#getMeterReadings <em>Meter Readings</em>}</li>
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
	 * The cached value of the '{@link #getMeterReadings() <em>Meter Readings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterReading> meterReadings;

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
		if (eContainerFeatureID() != targetPackage.METERING_POINT__PLANT) return null;
		return (Plant)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlant(Plant newPlant, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPlant, targetPackage.METERING_POINT__PLANT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlant(Plant newPlant) {
		if (newPlant != eInternalContainer() || (eContainerFeatureID() != targetPackage.METERING_POINT__PLANT && newPlant != null)) {
			if (EcoreUtil.isAncestor(this, newPlant))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPlant != null)
				msgs = ((InternalEObject)newPlant).eInverseAdd(this, targetPackage.PLANT__METERING_POINTS, Plant.class, msgs);
			msgs = basicSetPlant(newPlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.METERING_POINT__PLANT, newPlant, newPlant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeterReading> getMeterReadings() {
		if (meterReadings == null) {
			meterReadings = new EObjectContainmentWithInverseEList<MeterReading>(MeterReading.class, this, targetPackage.METERING_POINT__METER_READINGS, targetPackage.METER_READING__METERING_POINT);
		}
		return meterReadings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case targetPackage.METERING_POINT__PLANT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPlant((Plant)otherEnd, msgs);
			case targetPackage.METERING_POINT__METER_READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeterReadings()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case targetPackage.METERING_POINT__PLANT:
				return basicSetPlant(null, msgs);
			case targetPackage.METERING_POINT__METER_READINGS:
				return ((InternalEList<?>)getMeterReadings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case targetPackage.METERING_POINT__PLANT:
				return eInternalContainer().eInverseRemove(this, targetPackage.PLANT__METERING_POINTS, Plant.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
				return getPlant();
			case targetPackage.METERING_POINT__METER_READINGS:
				return getMeterReadings();
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
			case targetPackage.METERING_POINT__METER_READINGS:
				getMeterReadings().clear();
				getMeterReadings().addAll((Collection<? extends MeterReading>)newValue);
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
			case targetPackage.METERING_POINT__METER_READINGS:
				getMeterReadings().clear();
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
				return getPlant() != null;
			case targetPackage.METERING_POINT__METER_READINGS:
				return meterReadings != null && !meterReadings.isEmpty();
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
