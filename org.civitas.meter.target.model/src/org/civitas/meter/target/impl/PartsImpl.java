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

import org.civitas.meter.target.Parts;
import org.civitas.meter.target.Plant;
import org.civitas.meter.target.targetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.target.impl.PartsImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.PartsImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.PartsImpl#getPerformance <em>Performance</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.PartsImpl#getConstructionYear <em>Construction Year</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.PartsImpl#getPlant <em>Plant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartsImpl extends MinimalEObjectImpl.Container implements Parts {
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
	 * The default value of the '{@link #getPerformance() <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected static final String PERFORMANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerformance() <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected String performance = PERFORMANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstructionYear() <em>Construction Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionYear()
	 * @generated
	 * @ordered
	 */
	protected static final int CONSTRUCTION_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConstructionYear() <em>Construction Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionYear()
	 * @generated
	 * @ordered
	 */
	protected int constructionYear = CONSTRUCTION_YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return targetPackage.Literals.PARTS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.PARTS__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.PARTS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPerformance() {
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformance(String newPerformance) {
		String oldPerformance = performance;
		performance = newPerformance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.PARTS__PERFORMANCE, oldPerformance, performance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getConstructionYear() {
		return constructionYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstructionYear(int newConstructionYear) {
		int oldConstructionYear = constructionYear;
		constructionYear = newConstructionYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.PARTS__CONSTRUCTION_YEAR, oldConstructionYear, constructionYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plant getPlant() {
		if (eContainerFeatureID() != targetPackage.PARTS__PLANT) return null;
		return (Plant)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlant(Plant newPlant, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPlant, targetPackage.PARTS__PLANT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlant(Plant newPlant) {
		if (newPlant != eInternalContainer() || (eContainerFeatureID() != targetPackage.PARTS__PLANT && newPlant != null)) {
			if (EcoreUtil.isAncestor(this, newPlant))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPlant != null)
				msgs = ((InternalEObject)newPlant).eInverseAdd(this, targetPackage.PLANT__PARTS, Plant.class, msgs);
			msgs = basicSetPlant(newPlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.PARTS__PLANT, newPlant, newPlant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case targetPackage.PARTS__PLANT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPlant((Plant)otherEnd, msgs);
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
			case targetPackage.PARTS__PLANT:
				return basicSetPlant(null, msgs);
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
			case targetPackage.PARTS__PLANT:
				return eInternalContainer().eInverseRemove(this, targetPackage.PLANT__PARTS, Plant.class, msgs);
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
			case targetPackage.PARTS__ID:
				return getId();
			case targetPackage.PARTS__TYPE:
				return getType();
			case targetPackage.PARTS__PERFORMANCE:
				return getPerformance();
			case targetPackage.PARTS__CONSTRUCTION_YEAR:
				return getConstructionYear();
			case targetPackage.PARTS__PLANT:
				return getPlant();
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
			case targetPackage.PARTS__ID:
				setId((String)newValue);
				return;
			case targetPackage.PARTS__TYPE:
				setType((String)newValue);
				return;
			case targetPackage.PARTS__PERFORMANCE:
				setPerformance((String)newValue);
				return;
			case targetPackage.PARTS__CONSTRUCTION_YEAR:
				setConstructionYear((Integer)newValue);
				return;
			case targetPackage.PARTS__PLANT:
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
			case targetPackage.PARTS__ID:
				setId(ID_EDEFAULT);
				return;
			case targetPackage.PARTS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case targetPackage.PARTS__PERFORMANCE:
				setPerformance(PERFORMANCE_EDEFAULT);
				return;
			case targetPackage.PARTS__CONSTRUCTION_YEAR:
				setConstructionYear(CONSTRUCTION_YEAR_EDEFAULT);
				return;
			case targetPackage.PARTS__PLANT:
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
			case targetPackage.PARTS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case targetPackage.PARTS__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case targetPackage.PARTS__PERFORMANCE:
				return PERFORMANCE_EDEFAULT == null ? performance != null : !PERFORMANCE_EDEFAULT.equals(performance);
			case targetPackage.PARTS__CONSTRUCTION_YEAR:
				return constructionYear != CONSTRUCTION_YEAR_EDEFAULT;
			case targetPackage.PARTS__PLANT:
				return getPlant() != null;
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
		result.append(", type: ");
		result.append(type);
		result.append(", performance: ");
		result.append(performance);
		result.append(", constructionYear: ");
		result.append(constructionYear);
		result.append(')');
		return result.toString();
	}

} //PartsImpl
