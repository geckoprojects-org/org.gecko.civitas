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
 *   <li>{@link org.civitas.meter.target.MeteringPoint#getCurrentMeter <em>Current Meter</em>}</li>
 *   <li>{@link org.civitas.meter.target.MeteringPoint#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link org.civitas.meter.target.MeteringPoint#getMeterHistory <em>Meter History</em>}</li>
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
	 * Returns the value of the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant</em>' reference.
	 * @see #setPlant(Plant)
	 * @see org.civitas.meter.target.targetPackage#getMeteringPoint_Plant()
	 * @model
	 * @generated
	 */
	Plant getPlant();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.MeteringPoint#getPlant <em>Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant</em>' reference.
	 * @see #getPlant()
	 * @generated
	 */
	void setPlant(Plant value);

	/**
	 * Returns the value of the '<em><b>Current Meter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Meter</em>' reference.
	 * @see #setCurrentMeter(Meter)
	 * @see org.civitas.meter.target.targetPackage#getMeteringPoint_CurrentMeter()
	 * @model required="true"
	 * @generated
	 */
	Meter getCurrentMeter();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.MeteringPoint#getCurrentMeter <em>Current Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Meter</em>' reference.
	 * @see #getCurrentMeter()
	 * @generated
	 */
	void setCurrentMeter(Meter value);

	/**
	 * Returns the value of the '<em><b>Meter Readings</b></em>' containment reference list.
	 * The list contents are of type {@link org.civitas.meter.target.MeterReading}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Readings</em>' containment reference list.
	 * @see org.civitas.meter.target.targetPackage#getMeteringPoint_MeterReadings()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeterReading> getMeterReadings();

	/**
	 * Returns the value of the '<em><b>Meter History</b></em>' containment reference list.
	 * The list contents are of type {@link org.civitas.meter.target.MeterHistory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter History</em>' containment reference list.
	 * @see org.civitas.meter.target.targetPackage#getMeteringPoint_MeterHistory()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeterHistory> getMeterHistory();

} // MeteringPoint
