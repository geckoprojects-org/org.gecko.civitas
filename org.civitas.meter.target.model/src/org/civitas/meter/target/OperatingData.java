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
package org.civitas.meter.target;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.target.OperatingData#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.target.OperatingData#getOperatingHours <em>Operating Hours</em>}</li>
 *   <li>{@link org.civitas.meter.target.OperatingData#getStarts <em>Starts</em>}</li>
 *   <li>{@link org.civitas.meter.target.OperatingData#getPlant <em>Plant</em>}</li>
 * </ul>
 *
 * @see org.civitas.meter.target.targetPackage#getOperatingData()
 * @model
 * @generated
 */
@ProviderType
public interface OperatingData extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.civitas.meter.target.targetPackage#getOperatingData_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.OperatingData#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Operating Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Hours</em>' attribute.
	 * @see #setOperatingHours(double)
	 * @see org.civitas.meter.target.targetPackage#getOperatingData_OperatingHours()
	 * @model
	 * @generated
	 */
	double getOperatingHours();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.OperatingData#getOperatingHours <em>Operating Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Hours</em>' attribute.
	 * @see #getOperatingHours()
	 * @generated
	 */
	void setOperatingHours(double value);

	/**
	 * Returns the value of the '<em><b>Starts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starts</em>' attribute.
	 * @see #setStarts(int)
	 * @see org.civitas.meter.target.targetPackage#getOperatingData_Starts()
	 * @model
	 * @generated
	 */
	int getStarts();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.OperatingData#getStarts <em>Starts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starts</em>' attribute.
	 * @see #getStarts()
	 * @generated
	 */
	void setStarts(int value);

	/**
	 * Returns the value of the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant</em>' reference.
	 * @see #setPlant(Plant)
	 * @see org.civitas.meter.target.targetPackage#getOperatingData_Plant()
	 * @model required="true"
	 * @generated
	 */
	Plant getPlant();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.OperatingData#getPlant <em>Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant</em>' reference.
	 * @see #getPlant()
	 * @generated
	 */
	void setPlant(Plant value);

} // OperatingData
