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

import org.civitas.meter.source.model.metersource.BasicData;
import org.civitas.meter.source.model.metersource.MeterSourcePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.BasicDataImpl#getPlantId <em>Plant Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.BasicDataImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.BasicDataImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.BasicDataImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicDataImpl extends MinimalEObjectImpl.Container implements BasicData {
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
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNet() <em>Net</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Integer net = NET_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeterSourcePackage.Literals.BASIC_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.BASIC_DATA__PLANT_ID, oldPlantId, plantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.BASIC_DATA__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNet(Integer newNet) {
		Integer oldNet = net;
		net = newNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.BASIC_DATA__NET, oldNet, net));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.BASIC_DATA__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeterSourcePackage.BASIC_DATA__PLANT_ID:
				return getPlantId();
			case MeterSourcePackage.BASIC_DATA__ADDRESS:
				return getAddress();
			case MeterSourcePackage.BASIC_DATA__NET:
				return getNet();
			case MeterSourcePackage.BASIC_DATA__TYPE:
				return getType();
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
			case MeterSourcePackage.BASIC_DATA__PLANT_ID:
				setPlantId((String)newValue);
				return;
			case MeterSourcePackage.BASIC_DATA__ADDRESS:
				setAddress((String)newValue);
				return;
			case MeterSourcePackage.BASIC_DATA__NET:
				setNet((Integer)newValue);
				return;
			case MeterSourcePackage.BASIC_DATA__TYPE:
				setType((String)newValue);
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
			case MeterSourcePackage.BASIC_DATA__PLANT_ID:
				setPlantId(PLANT_ID_EDEFAULT);
				return;
			case MeterSourcePackage.BASIC_DATA__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case MeterSourcePackage.BASIC_DATA__NET:
				setNet(NET_EDEFAULT);
				return;
			case MeterSourcePackage.BASIC_DATA__TYPE:
				setType(TYPE_EDEFAULT);
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
			case MeterSourcePackage.BASIC_DATA__PLANT_ID:
				return PLANT_ID_EDEFAULT == null ? plantId != null : !PLANT_ID_EDEFAULT.equals(plantId);
			case MeterSourcePackage.BASIC_DATA__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case MeterSourcePackage.BASIC_DATA__NET:
				return NET_EDEFAULT == null ? net != null : !NET_EDEFAULT.equals(net);
			case MeterSourcePackage.BASIC_DATA__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (plantId: ");
		result.append(plantId);
		result.append(", address: ");
		result.append(address);
		result.append(", net: ");
		result.append(net);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //BasicDataImpl
