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

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.target.MeterReading#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.target.MeterReading#getValue <em>Value</em>}</li>
 *   <li>{@link org.civitas.meter.target.MeterReading#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.civitas.meter.target.MeterReading#getMeteringPoint <em>Metering Point</em>}</li>
 * </ul>
 *
 * @see org.civitas.meter.target.targetPackage#getMeterReading()
 * @model
 * @generated
 */
@ProviderType
public interface MeterReading extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.civitas.meter.target.targetPackage#getMeterReading_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.MeterReading#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.civitas.meter.target.targetPackage#getMeterReading_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.MeterReading#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see org.civitas.meter.target.targetPackage#getMeterReading_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.MeterReading#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Metering Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metering Point</em>' reference.
	 * @see #setMeteringPoint(MeteringPoint)
	 * @see org.civitas.meter.target.targetPackage#getMeterReading_MeteringPoint()
	 * @model required="true"
	 * @generated
	 */
	MeteringPoint getMeteringPoint();

	/**
	 * Sets the value of the '{@link org.civitas.meter.target.MeterReading#getMeteringPoint <em>Metering Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metering Point</em>' reference.
	 * @see #getMeteringPoint()
	 * @generated
	 */
	void setMeteringPoint(MeteringPoint value);

} // MeterReading
