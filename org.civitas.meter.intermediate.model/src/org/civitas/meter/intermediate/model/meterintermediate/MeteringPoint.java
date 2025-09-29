/*
 */
package org.civitas.meter.intermediate.model.meterintermediate;

import org.civitas.meter.target.MeterReading;

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
 *   <li>{@link org.civitas.meter.intermediate.model.meterintermediate.MeteringPoint#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.intermediate.model.meterintermediate.MeteringPoint#getReadings <em>Readings</em>}</li>
 * </ul>
 *
 * @see org.civitas.meter.intermediate.model.meterintermediate.MeterIntermediatePackage#getMeteringPoint()
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
	 * @see org.civitas.meter.intermediate.model.meterintermediate.MeterIntermediatePackage#getMeteringPoint_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.intermediate.model.meterintermediate.MeteringPoint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Readings</b></em>' reference list.
	 * The list contents are of type {@link org.civitas.meter.target.MeterReading}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readings</em>' reference list.
	 * @see org.civitas.meter.intermediate.model.meterintermediate.MeterIntermediatePackage#getMeteringPoint_Readings()
	 * @model
	 * @generated
	 */
	EList<MeterReading> getReadings();

} // MeteringPoint
