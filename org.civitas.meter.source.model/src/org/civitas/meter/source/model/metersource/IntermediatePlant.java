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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.source.model.metersource.IntermediatePlant#getOperatingData <em>Operating Data</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.IntermediatePlant#getBasicData <em>Basic Data</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.IntermediatePlant#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getIntermediatePlant()
 * @model
 * @generated
 */
@ProviderType
public interface IntermediatePlant extends EObject {
	/**
	 * Returns the value of the '<em><b>Operating Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.civitas.meter.source.model.metersource.OperatingData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Data</em>' containment reference list.
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getIntermediatePlant_OperatingData()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperatingData> getOperatingData();

	/**
	 * Returns the value of the '<em><b>Basic Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Data</em>' containment reference.
	 * @see #setBasicData(BasicData)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getIntermediatePlant_BasicData()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BasicData getBasicData();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.IntermediatePlant#getBasicData <em>Basic Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Data</em>' containment reference.
	 * @see #getBasicData()
	 * @generated
	 */
	void setBasicData(BasicData value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getIntermediatePlant_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.IntermediatePlant#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // IntermediatePlant
