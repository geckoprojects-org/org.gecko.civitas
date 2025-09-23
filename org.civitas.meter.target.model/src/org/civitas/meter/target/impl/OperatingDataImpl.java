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

import org.civitas.meter.target.OperatingData;
import org.civitas.meter.target.Plant;
import org.civitas.meter.target.targetPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.target.impl.OperatingDataImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.OperatingDataImpl#getOperatingHours <em>Operating Hours</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.OperatingDataImpl#getStarts <em>Starts</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.OperatingDataImpl#getPlant <em>Plant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingDataImpl extends MinimalEObjectImpl.Container implements OperatingData {
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
	 * The default value of the '{@link #getOperatingHours() <em>Operating Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingHours()
	 * @generated
	 * @ordered
	 */
	protected static final double OPERATING_HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOperatingHours() <em>Operating Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingHours()
	 * @generated
	 * @ordered
	 */
	protected double operatingHours = OPERATING_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStarts() <em>Starts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarts()
	 * @generated
	 * @ordered
	 */
	protected static final int STARTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStarts() <em>Starts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarts()
	 * @generated
	 * @ordered
	 */
	protected int starts = STARTS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return targetPackage.Literals.OPERATING_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.OPERATING_DATA__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOperatingHours() {
		return operatingHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatingHours(double newOperatingHours) {
		double oldOperatingHours = operatingHours;
		operatingHours = newOperatingHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.OPERATING_DATA__OPERATING_HOURS, oldOperatingHours, operatingHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStarts() {
		return starts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStarts(int newStarts) {
		int oldStarts = starts;
		starts = newStarts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.OPERATING_DATA__STARTS, oldStarts, starts));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, targetPackage.OPERATING_DATA__PLANT, oldPlant, plant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.OPERATING_DATA__PLANT, oldPlant, plant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case targetPackage.OPERATING_DATA__ID:
				return getId();
			case targetPackage.OPERATING_DATA__OPERATING_HOURS:
				return getOperatingHours();
			case targetPackage.OPERATING_DATA__STARTS:
				return getStarts();
			case targetPackage.OPERATING_DATA__PLANT:
				if (resolve) return getPlant();
				return basicGetPlant();
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
			case targetPackage.OPERATING_DATA__ID:
				setId((String)newValue);
				return;
			case targetPackage.OPERATING_DATA__OPERATING_HOURS:
				setOperatingHours((Double)newValue);
				return;
			case targetPackage.OPERATING_DATA__STARTS:
				setStarts((Integer)newValue);
				return;
			case targetPackage.OPERATING_DATA__PLANT:
				setPlant((Plant)newValue);
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
			case targetPackage.OPERATING_DATA__ID:
				setId(ID_EDEFAULT);
				return;
			case targetPackage.OPERATING_DATA__OPERATING_HOURS:
				setOperatingHours(OPERATING_HOURS_EDEFAULT);
				return;
			case targetPackage.OPERATING_DATA__STARTS:
				setStarts(STARTS_EDEFAULT);
				return;
			case targetPackage.OPERATING_DATA__PLANT:
				setPlant((Plant)null);
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
			case targetPackage.OPERATING_DATA__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case targetPackage.OPERATING_DATA__OPERATING_HOURS:
				return operatingHours != OPERATING_HOURS_EDEFAULT;
			case targetPackage.OPERATING_DATA__STARTS:
				return starts != STARTS_EDEFAULT;
			case targetPackage.OPERATING_DATA__PLANT:
				return plant != null;
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
		result.append(", operatingHours: ");
		result.append(operatingHours);
		result.append(", starts: ");
		result.append(starts);
		result.append(')');
		return result.toString();
	}

} //OperatingDataImpl
