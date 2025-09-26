/*
 * Copyright (c) 2012 - 2025 Data In Motion and others....
 */
package org.civitas.glt.intermediate.model.gltintermediate;

import org.civitas.glt.model.glt.Building;

import org.civitas.glt.sensor.model.sensor.SensorReading;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Building Sensor Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading#getBuildingId <em>Building Id</em>}</li>
 *   <li>{@link org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading#getBuilding <em>Building</em>}</li>
 *   <li>{@link org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading#getSensorReading <em>Sensor Reading</em>}</li>
 * </ul>
 *
 * @see org.civitas.glt.intermediate.model.gltintermediate.GLTIntermediatePackage#getBuildingSensorReading()
 * @model
 * @generated
 */
@ProviderType
public interface BuildingSensorReading extends EObject {
	/**
	 * Returns the value of the '<em><b>Building Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Id</em>' attribute.
	 * @see #setBuildingId(String)
	 * @see org.civitas.glt.intermediate.model.gltintermediate.GLTIntermediatePackage#getBuildingSensorReading_BuildingId()
	 * @model id="true"
	 * @generated
	 */
	String getBuildingId();

	/**
	 * Sets the value of the '{@link org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading#getBuildingId <em>Building Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Id</em>' attribute.
	 * @see #getBuildingId()
	 * @generated
	 */
	void setBuildingId(String value);

	/**
	 * Returns the value of the '<em><b>Building</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building</em>' reference.
	 * @see #setBuilding(Building)
	 * @see org.civitas.glt.intermediate.model.gltintermediate.GLTIntermediatePackage#getBuildingSensorReading_Building()
	 * @model
	 * @generated
	 */
	Building getBuilding();

	/**
	 * Sets the value of the '{@link org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading#getBuilding <em>Building</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building</em>' reference.
	 * @see #getBuilding()
	 * @generated
	 */
	void setBuilding(Building value);

	/**
	 * Returns the value of the '<em><b>Sensor Reading</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Reading</em>' reference.
	 * @see #setSensorReading(SensorReading)
	 * @see org.civitas.glt.intermediate.model.gltintermediate.GLTIntermediatePackage#getBuildingSensorReading_SensorReading()
	 * @model
	 * @generated
	 */
	SensorReading getSensorReading();

	/**
	 * Sets the value of the '{@link org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading#getSensorReading <em>Sensor Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Reading</em>' reference.
	 * @see #getSensorReading()
	 * @generated
	 */
	void setSensorReading(SensorReading value);

} // BuildingSensorReading
