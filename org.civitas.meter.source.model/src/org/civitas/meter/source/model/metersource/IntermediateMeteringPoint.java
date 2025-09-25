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
 * A representation of the model object '<em><b>Intermediate Metering Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.source.model.metersource.IntermediateMeteringPoint#getMeterId <em>Meter Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.IntermediateMeteringPoint#getPlantId <em>Plant Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.IntermediateMeteringPoint#getReadings <em>Readings</em>}</li>
 * </ul>
 *
 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getIntermediateMeteringPoint()
 * @model
 * @generated
 */
@ProviderType
public interface IntermediateMeteringPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Meter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Id</em>' attribute.
	 * @see #setMeterId(String)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getIntermediateMeteringPoint_MeterId()
	 * @model id="true"
	 * @generated
	 */
	String getMeterId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.IntermediateMeteringPoint#getMeterId <em>Meter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Id</em>' attribute.
	 * @see #getMeterId()
	 * @generated
	 */
	void setMeterId(String value);

	/**
	 * Returns the value of the '<em><b>Plant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Id</em>' attribute.
	 * @see #setPlantId(String)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getIntermediateMeteringPoint_PlantId()
	 * @model
	 * @generated
	 */
	String getPlantId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.IntermediateMeteringPoint#getPlantId <em>Plant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Id</em>' attribute.
	 * @see #getPlantId()
	 * @generated
	 */
	void setPlantId(String value);

	/**
	 * Returns the value of the '<em><b>Readings</b></em>' reference list.
	 * The list contents are of type {@link org.civitas.meter.source.model.metersource.Reading}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readings</em>' reference list.
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getIntermediateMeteringPoint_Readings()
	 * @model
	 * @generated
	 */
	EList<Reading> getReadings();

} // IntermediateMeteringPoint
