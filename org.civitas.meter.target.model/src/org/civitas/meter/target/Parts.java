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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.target.Parts#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.target.Parts#getType <em>Type</em>}</li>
 *   <li>{@link org.civitas.meter.target.Parts#getPerformance <em>Performance</em>}</li>
 *   <li>{@link org.civitas.meter.target.Parts#getConstructionYear <em>Construction Year</em>}</li>
 *   <li>{@link org.civitas.meter.target.Parts#getPlant <em>Plant</em>}</li>
 * </ul>
 *
 * @see org.civitas.meter.target.targetPackage#getParts()
 * @model
 * @generated
 */
@ProviderType
public interface Parts extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.civitas.meter.target.targetPackage#getParts_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.Parts#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.civitas.meter.target.targetPackage#getParts_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.Parts#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' attribute.
	 * @see #setPerformance(String)
	 * @see org.civitas.meter.target.targetPackage#getParts_Performance()
	 * @model
	 * @generated
	 */
	String getPerformance();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.Parts#getPerformance <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance</em>' attribute.
	 * @see #getPerformance()
	 * @generated
	 */
	void setPerformance(String value);

	/**
	 * Returns the value of the '<em><b>Construction Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction Year</em>' attribute.
	 * @see #setConstructionYear(int)
	 * @see org.civitas.meter.target.targetPackage#getParts_ConstructionYear()
	 * @model
	 * @generated
	 */
	int getConstructionYear();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.Parts#getConstructionYear <em>Construction Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction Year</em>' attribute.
	 * @see #getConstructionYear()
	 * @generated
	 */
	void setConstructionYear(int value);

	/**
	 * Returns the value of the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant</em>' reference.
	 * @see #setPlant(Plant)
	 * @see org.civitas.meter.target.targetPackage#getParts_Plant()
	 * @model required="true"
	 * @generated
	 */
	Plant getPlant();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.Parts#getPlant <em>Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant</em>' reference.
	 * @see #getPlant()
	 * @generated
	 */
	void setPlant(Plant value);

} // Parts
