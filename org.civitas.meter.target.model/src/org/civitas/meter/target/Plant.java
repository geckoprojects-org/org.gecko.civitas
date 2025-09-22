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
package org.civitas.meter.target;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.target.Plant#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.target.Plant#getNumber <em>Number</em>}</li>
 *   <li>{@link org.civitas.meter.target.Plant#getCity <em>City</em>}</li>
 *   <li>{@link org.civitas.meter.target.Plant#getPostalcode <em>Postalcode</em>}</li>
 *   <li>{@link org.civitas.meter.target.Plant#getStreet <em>Street</em>}</li>
 *   <li>{@link org.civitas.meter.target.Plant#getHouseNumber <em>House Number</em>}</li>
 *   <li>{@link org.civitas.meter.target.Plant#getNet <em>Net</em>}</li>
 *   <li>{@link org.civitas.meter.target.Plant#getOperatingData <em>Operating Data</em>}</li>
 *   <li>{@link org.civitas.meter.target.Plant#getMeteringPoints <em>Metering Points</em>}</li>
 *   <li>{@link org.civitas.meter.target.Plant#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see org.civitas.meter.target.targetPackage#getPlant()
 * @model
 * @generated
 */
@ProviderType
public interface Plant extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.civitas.meter.target.targetPackage#getPlant_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.Plant#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see org.civitas.meter.target.targetPackage#getPlant_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.Plant#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see org.civitas.meter.target.targetPackage#getPlant_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.Plant#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Postalcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postalcode</em>' attribute.
	 * @see #setPostalcode(String)
	 * @see org.civitas.meter.target.targetPackage#getPlant_Postalcode()
	 * @model
	 * @generated
	 */
	String getPostalcode();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.Plant#getPostalcode <em>Postalcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postalcode</em>' attribute.
	 * @see #getPostalcode()
	 * @generated
	 */
	void setPostalcode(String value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see org.civitas.meter.target.targetPackage#getPlant_Street()
	 * @model
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.Plant#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>House Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House Number</em>' attribute.
	 * @see #setHouseNumber(String)
	 * @see org.civitas.meter.target.targetPackage#getPlant_HouseNumber()
	 * @model
	 * @generated
	 */
	String getHouseNumber();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.Plant#getHouseNumber <em>House Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House Number</em>' attribute.
	 * @see #getHouseNumber()
	 * @generated
	 */
	void setHouseNumber(String value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' reference.
	 * @see #setNet(Net)
	 * @see org.civitas.meter.target.targetPackage#getPlant_Net()
	 * @model required="true"
	 * @generated
	 */
	Net getNet();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.Plant#getNet <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Net value);

	/**
	 * Returns the value of the '<em><b>Operating Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.civitas.meter.target.OperatingData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Data</em>' containment reference list.
	 * @see org.civitas.meter.target.targetPackage#getPlant_OperatingData()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperatingData> getOperatingData();

	/**
	 * Returns the value of the '<em><b>Metering Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.civitas.meter.target.MeteringPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metering Points</em>' containment reference list.
	 * @see org.civitas.meter.target.targetPackage#getPlant_MeteringPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeteringPoint> getMeteringPoints();

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.civitas.meter.target.Parts}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.civitas.meter.target.targetPackage#getPlant_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parts> getParts();

} // Plant
