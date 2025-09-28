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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metering Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.target.MeteringPoint#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.target.MeteringPoint#getPlant <em>Plant</em>}</li>
 *   <li>{@link org.civitas.meter.target.MeteringPoint#getMeterReadings <em>Meter Readings</em>}</li>
 * </ul>
 *
 * @see org.civitas.meter.target.targetPackage#getMeteringPoint()
 * @model
 * @generated
 */
@ProviderType
public interface MeteringPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.civitas.meter.target.targetPackage#getMeteringPoint_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.MeteringPoint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Plant</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.civitas.meter.target.Plant#getMeteringPoints <em>Metering Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant</em>' container reference.
	 * @see #setPlant(Plant)
	 * @see org.civitas.meter.target.targetPackage#getMeteringPoint_Plant()
	 * @see org.civitas.meter.target.Plant#getMeteringPoints
	 * @model opposite="meteringPoints" transient="false"
	 * @generated
	 */
	Plant getPlant();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.MeteringPoint#getPlant <em>Plant</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant</em>' container reference.
	 * @see #getPlant()
	 * @generated
	 */
	void setPlant(Plant value);

	/**
	 * Returns the value of the '<em><b>Meter Readings</b></em>' containment reference list.
	 * The list contents are of type {@link org.civitas.meter.target.MeterReading}.
	 * It is bidirectional and its opposite is '{@link org.civitas.meter.target.MeterReading#getMeteringPoint <em>Metering Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Readings</em>' containment reference list.
	 * @see org.civitas.meter.target.targetPackage#getMeteringPoint_MeterReadings()
	 * @see org.civitas.meter.target.MeterReading#getMeteringPoint
	 * @model opposite="meteringPoint" containment="true"
	 * @generated
	 */
	EList<MeterReading> getMeterReadings();

} // MeteringPoint
