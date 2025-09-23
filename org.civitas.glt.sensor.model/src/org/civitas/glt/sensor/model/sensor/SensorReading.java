/*
 */
package org.civitas.glt.sensor.model.sensor;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.glt.sensor.model.sensor.SensorReading#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.civitas.glt.sensor.model.sensor.SensorReading#getBuildingId <em>Building Id</em>}</li>
 *   <li>{@link org.civitas.glt.sensor.model.sensor.SensorReading#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.civitas.glt.sensor.model.sensor.BuildingSensorPackage#getSensorReading()
 * @model
 * @generated
 */
@ProviderType
public interface SensorReading extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see org.civitas.glt.sensor.model.sensor.BuildingSensorPackage#getSensorReading_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link org.civitas.glt.sensor.model.sensor.SensorReading#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Building Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Id</em>' attribute.
	 * @see #setBuildingId(String)
	 * @see org.civitas.glt.sensor.model.sensor.BuildingSensorPackage#getSensorReading_BuildingId()
	 * @model extendedMetaData="name='building_id'"
	 * @generated
	 */
	String getBuildingId();

	/**
	 * Sets the value of the '{@link org.civitas.glt.sensor.model.sensor.SensorReading#getBuildingId <em>Building Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Id</em>' attribute.
	 * @see #getBuildingId()
	 * @generated
	 */
	void setBuildingId(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see org.civitas.glt.sensor.model.sensor.BuildingSensorPackage#getSensorReading_Value()
	 * @model dataType="org.civitas.units.model.units.DegreesCelsius"
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link org.civitas.glt.sensor.model.sensor.SensorReading#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

} // SensorReading
