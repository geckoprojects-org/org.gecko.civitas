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
import org.civitas.meter.target.MeteringPoint;
import org.civitas.meter.target.OperatingData;
import org.civitas.meter.target.Parts;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.target.impl.PlantImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.PlantImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.PlantImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.PlantImpl#getPostalcode <em>Postalcode</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.PlantImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.PlantImpl#getHouseNumber <em>House Number</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.PlantImpl#getOperatingData <em>Operating Data</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.PlantImpl#getMeteringPoints <em>Metering Points</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.PlantImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link org.civitas.meter.target.impl.PlantImpl#getMeter <em>Meter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlantImpl extends MinimalEObjectImpl.Container implements Plant {
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
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalcode() <em>Postalcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalcode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTALCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalcode() <em>Postalcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalcode()
	 * @generated
	 * @ordered
	 */
	protected String postalcode = POSTALCODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseNumber() <em>House Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseNumber() <em>House Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseNumber()
	 * @generated
	 * @ordered
	 */
	protected String houseNumber = HOUSE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperatingData() <em>Operating Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingData()
	 * @generated
	 * @ordered
	 */
	protected EList<OperatingData> operatingData;

	/**
	 * The cached value of the '{@link #getMeteringPoints() <em>Metering Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeteringPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<MeteringPoint> meteringPoints;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Parts> parts;

	/**
	 * The cached value of the '{@link #getMeter() <em>Meter</em>}' containment reference list.
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
		return targetPackage.Literals.PLANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.PLANT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.PLANT__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.PLANT__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalcode() {
		return postalcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalcode(String newPostalcode) {
		String oldPostalcode = postalcode;
		postalcode = newPostalcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.PLANT__POSTALCODE, oldPostalcode, postalcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.PLANT__STREET, oldStreet, street));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHouseNumber(String newHouseNumber) {
		String oldHouseNumber = houseNumber;
		houseNumber = newHouseNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, targetPackage.PLANT__HOUSE_NUMBER, oldHouseNumber, houseNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperatingData> getOperatingData() {
		if (operatingData == null) {
			operatingData = new EObjectContainmentWithInverseEList<OperatingData>(OperatingData.class, this, targetPackage.PLANT__OPERATING_DATA, targetPackage.OPERATING_DATA__PLANT);
		}
		return operatingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeteringPoint> getMeteringPoints() {
		if (meteringPoints == null) {
			meteringPoints = new EObjectContainmentWithInverseEList<MeteringPoint>(MeteringPoint.class, this, targetPackage.PLANT__METERING_POINTS, targetPackage.METERING_POINT__PLANT);
		}
		return meteringPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parts> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentWithInverseEList<Parts>(Parts.class, this, targetPackage.PLANT__PARTS, targetPackage.PARTS__PLANT);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Meter> getMeter() {
		if (meter == null) {
			meter = new EObjectContainmentEList<Meter>(Meter.class, this, targetPackage.PLANT__METER);
		}
		return meter;
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
			case targetPackage.PLANT__OPERATING_DATA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperatingData()).basicAdd(otherEnd, msgs);
			case targetPackage.PLANT__METERING_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeteringPoints()).basicAdd(otherEnd, msgs);
			case targetPackage.PLANT__PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParts()).basicAdd(otherEnd, msgs);
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
			case targetPackage.PLANT__OPERATING_DATA:
				return ((InternalEList<?>)getOperatingData()).basicRemove(otherEnd, msgs);
			case targetPackage.PLANT__METERING_POINTS:
				return ((InternalEList<?>)getMeteringPoints()).basicRemove(otherEnd, msgs);
			case targetPackage.PLANT__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
			case targetPackage.PLANT__METER:
				return ((InternalEList<?>)getMeter()).basicRemove(otherEnd, msgs);
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
			case targetPackage.PLANT__ID:
				return getId();
			case targetPackage.PLANT__NUMBER:
				return getNumber();
			case targetPackage.PLANT__CITY:
				return getCity();
			case targetPackage.PLANT__POSTALCODE:
				return getPostalcode();
			case targetPackage.PLANT__STREET:
				return getStreet();
			case targetPackage.PLANT__HOUSE_NUMBER:
				return getHouseNumber();
			case targetPackage.PLANT__OPERATING_DATA:
				return getOperatingData();
			case targetPackage.PLANT__METERING_POINTS:
				return getMeteringPoints();
			case targetPackage.PLANT__PARTS:
				return getParts();
			case targetPackage.PLANT__METER:
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
			case targetPackage.PLANT__ID:
				setId((String)newValue);
				return;
			case targetPackage.PLANT__NUMBER:
				setNumber((String)newValue);
				return;
			case targetPackage.PLANT__CITY:
				setCity((String)newValue);
				return;
			case targetPackage.PLANT__POSTALCODE:
				setPostalcode((String)newValue);
				return;
			case targetPackage.PLANT__STREET:
				setStreet((String)newValue);
				return;
			case targetPackage.PLANT__HOUSE_NUMBER:
				setHouseNumber((String)newValue);
				return;
			case targetPackage.PLANT__OPERATING_DATA:
				getOperatingData().clear();
				getOperatingData().addAll((Collection<? extends OperatingData>)newValue);
				return;
			case targetPackage.PLANT__METERING_POINTS:
				getMeteringPoints().clear();
				getMeteringPoints().addAll((Collection<? extends MeteringPoint>)newValue);
				return;
			case targetPackage.PLANT__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends Parts>)newValue);
				return;
			case targetPackage.PLANT__METER:
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
			case targetPackage.PLANT__ID:
				setId(ID_EDEFAULT);
				return;
			case targetPackage.PLANT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case targetPackage.PLANT__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case targetPackage.PLANT__POSTALCODE:
				setPostalcode(POSTALCODE_EDEFAULT);
				return;
			case targetPackage.PLANT__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case targetPackage.PLANT__HOUSE_NUMBER:
				setHouseNumber(HOUSE_NUMBER_EDEFAULT);
				return;
			case targetPackage.PLANT__OPERATING_DATA:
				getOperatingData().clear();
				return;
			case targetPackage.PLANT__METERING_POINTS:
				getMeteringPoints().clear();
				return;
			case targetPackage.PLANT__PARTS:
				getParts().clear();
				return;
			case targetPackage.PLANT__METER:
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
			case targetPackage.PLANT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case targetPackage.PLANT__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case targetPackage.PLANT__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case targetPackage.PLANT__POSTALCODE:
				return POSTALCODE_EDEFAULT == null ? postalcode != null : !POSTALCODE_EDEFAULT.equals(postalcode);
			case targetPackage.PLANT__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case targetPackage.PLANT__HOUSE_NUMBER:
				return HOUSE_NUMBER_EDEFAULT == null ? houseNumber != null : !HOUSE_NUMBER_EDEFAULT.equals(houseNumber);
			case targetPackage.PLANT__OPERATING_DATA:
				return operatingData != null && !operatingData.isEmpty();
			case targetPackage.PLANT__METERING_POINTS:
				return meteringPoints != null && !meteringPoints.isEmpty();
			case targetPackage.PLANT__PARTS:
				return parts != null && !parts.isEmpty();
			case targetPackage.PLANT__METER:
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
		result.append(", number: ");
		result.append(number);
		result.append(", city: ");
		result.append(city);
		result.append(", postalcode: ");
		result.append(postalcode);
		result.append(", street: ");
		result.append(street);
		result.append(", houseNumber: ");
		result.append(houseNumber);
		result.append(')');
		return result.toString();
	}

} //PlantImpl
