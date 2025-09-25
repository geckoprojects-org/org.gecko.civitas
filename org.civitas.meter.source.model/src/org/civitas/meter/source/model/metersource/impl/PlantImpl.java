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

import org.civitas.meter.source.model.metersource.BasicData;
import org.civitas.meter.source.model.metersource.Meter;
import org.civitas.meter.source.model.metersource.MeterSourcePackage;
import org.civitas.meter.source.model.metersource.OperatingData;
import org.civitas.meter.source.model.metersource.Plant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.PlantImpl#getOperatingData <em>Operating Data</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.PlantImpl#getBasicData <em>Basic Data</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.PlantImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.PlantImpl#getMeter <em>Meter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlantImpl extends MinimalEObjectImpl.Container implements Plant {
	/**
	 * The cached value of the '{@link #getOperatingData() <em>Operating Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingData()
	 * @generated
	 * @ordered
	 */
	protected EList<OperatingData> operatingData;

	/**
	 * The cached value of the '{@link #getBasicData() <em>Basic Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicData()
	 * @generated
	 * @ordered
	 */
	protected BasicData basicData;

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
	 * The cached value of the '{@link #getMeter() <em>Meter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter()
	 * @generated
	 * @ordered
	 */
	protected EList<Meter> meter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeterSourcePackage.Literals.PLANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperatingData> getOperatingData() {
		if (operatingData == null) {
			operatingData = new EObjectResolvingEList<OperatingData>(OperatingData.class, this, MeterSourcePackage.PLANT__OPERATING_DATA);
		}
		return operatingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicData getBasicData() {
		if (basicData != null && basicData.eIsProxy()) {
			InternalEObject oldBasicData = (InternalEObject)basicData;
			basicData = (BasicData)eResolveProxy(oldBasicData);
			if (basicData != oldBasicData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeterSourcePackage.PLANT__BASIC_DATA, oldBasicData, basicData));
			}
		}
		return basicData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicData basicGetBasicData() {
		return basicData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasicData(BasicData newBasicData) {
		BasicData oldBasicData = basicData;
		basicData = newBasicData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.PLANT__BASIC_DATA, oldBasicData, basicData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.PLANT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Meter> getMeter() {
		if (meter == null) {
			meter = new EObjectResolvingEList<Meter>(Meter.class, this, MeterSourcePackage.PLANT__METER);
		}
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeterSourcePackage.PLANT__OPERATING_DATA:
				return getOperatingData();
			case MeterSourcePackage.PLANT__BASIC_DATA:
				if (resolve) return getBasicData();
				return basicGetBasicData();
			case MeterSourcePackage.PLANT__ID:
				return getId();
			case MeterSourcePackage.PLANT__METER:
				return getMeter();
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
			case MeterSourcePackage.PLANT__OPERATING_DATA:
				getOperatingData().clear();
				getOperatingData().addAll((Collection<? extends OperatingData>)newValue);
				return;
			case MeterSourcePackage.PLANT__BASIC_DATA:
				setBasicData((BasicData)newValue);
				return;
			case MeterSourcePackage.PLANT__ID:
				setId((String)newValue);
				return;
			case MeterSourcePackage.PLANT__METER:
				getMeter().clear();
				getMeter().addAll((Collection<? extends Meter>)newValue);
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
			case MeterSourcePackage.PLANT__OPERATING_DATA:
				getOperatingData().clear();
				return;
			case MeterSourcePackage.PLANT__BASIC_DATA:
				setBasicData((BasicData)null);
				return;
			case MeterSourcePackage.PLANT__ID:
				setId(ID_EDEFAULT);
				return;
			case MeterSourcePackage.PLANT__METER:
				getMeter().clear();
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
			case MeterSourcePackage.PLANT__OPERATING_DATA:
				return operatingData != null && !operatingData.isEmpty();
			case MeterSourcePackage.PLANT__BASIC_DATA:
				return basicData != null;
			case MeterSourcePackage.PLANT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MeterSourcePackage.PLANT__METER:
				return meter != null && !meter.isEmpty();
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

} //PlantImpl
