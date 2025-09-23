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
package org.civitas.meter.source.model.metersource;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The basic data for a production plant is available in an Excel file.  The id of every entry is prefixed with a p.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.source.model.metersource.BasicData#getPlantId <em>Plant Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.BasicData#getAddress <em>Address</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.BasicData#getNet <em>Net</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.BasicData#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getBasicData()
 * @model
 * @generated
 */
@ProviderType
public interface BasicData extends EObject {
	/**
	 * Returns the value of the '<em><b>Plant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Id</em>' attribute.
	 * @see #setPlantId(String)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getBasicData_PlantId()
	 * @model id="true" required="true"
	 *        extendedMetaData="name='plant_id'"
	 * @generated
	 */
	String getPlantId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.BasicData#getPlantId <em>Plant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Id</em>' attribute.
	 * @see #getPlantId()
	 * @generated
	 */
	void setPlantId(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getBasicData_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.BasicData#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' attribute.
	 * @see #setNet(Integer)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getBasicData_Net()
	 * @model
	 * @generated
	 */
	Integer getNet();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.BasicData#getNet <em>Net</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' attribute.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Integer value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getBasicData_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.BasicData#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // BasicData
