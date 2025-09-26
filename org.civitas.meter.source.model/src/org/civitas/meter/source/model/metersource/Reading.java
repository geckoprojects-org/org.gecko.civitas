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

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.source.model.metersource.Reading#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.Reading#getMeterId <em>Meter Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.Reading#getValue <em>Value</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.Reading#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getReading()
 * @model extendedMetaData="name='readings'"
 * @generated
 */
@ProviderType
public interface Reading extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getReading_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.Reading#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Meter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a reference to the meterId
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meter Id</em>' attribute.
	 * @see #setMeterId(String)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getReading_MeterId()
	 * @model extendedMetaData="name='meter_id'"
	 * @generated
	 */
	String getMeterId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.Reading#getMeterId <em>Meter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Id</em>' attribute.
	 * @see #getMeterId()
	 * @generated
	 */
	void setMeterId(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getReading_Value()
	 * @model dataType="org.civitas.units.model.units.KilowattHours"
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.Reading#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getReading_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.Reading#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

} // Reading
