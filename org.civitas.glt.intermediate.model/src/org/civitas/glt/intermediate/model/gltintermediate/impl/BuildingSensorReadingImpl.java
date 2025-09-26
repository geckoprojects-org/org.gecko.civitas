/*
 * Copyright (c) 2012 - 2025 Data In Motion and others....
 */
package org.civitas.glt.intermediate.model.gltintermediate.impl;

import org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading;
import org.civitas.glt.intermediate.model.gltintermediate.GLTIntermediatePackage;

import org.civitas.glt.model.glt.Building;

import org.civitas.glt.sensor.model.sensor.SensorReading;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Building Sensor Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.glt.intermediate.model.gltintermediate.impl.BuildingSensorReadingImpl#getBuildingId <em>Building Id</em>}</li>
 *   <li>{@link org.civitas.glt.intermediate.model.gltintermediate.impl.BuildingSensorReadingImpl#getBuilding <em>Building</em>}</li>
 *   <li>{@link org.civitas.glt.intermediate.model.gltintermediate.impl.BuildingSensorReadingImpl#getSensorReading <em>Sensor Reading</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildingSensorReadingImpl extends MinimalEObjectImpl.Container implements BuildingSensorReading {
	/**
	 * The default value of the '{@link #getBuildingId() <em>Building Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILDING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildingId() <em>Building Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingId()
	 * @generated
	 * @ordered
	 */
	protected String buildingId = BUILDING_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBuilding() <em>Building</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilding()
	 * @generated
	 * @ordered
	 */
	protected Building building;

	/**
	 * The cached value of the '{@link #getSensorReading() <em>Sensor Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorReading()
	 * @generated
	 * @ordered
	 */
	protected SensorReading sensorReading;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingSensorReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GLTIntermediatePackage.Literals.BUILDING_SENSOR_READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBuildingId() {
		return buildingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuildingId(String newBuildingId) {
		String oldBuildingId = buildingId;
		buildingId = newBuildingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GLTIntermediatePackage.BUILDING_SENSOR_READING__BUILDING_ID, oldBuildingId, buildingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Building getBuilding() {
		if (building != null && building.eIsProxy()) {
			InternalEObject oldBuilding = (InternalEObject)building;
			building = (Building)eResolveProxy(oldBuilding);
			if (building != oldBuilding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GLTIntermediatePackage.BUILDING_SENSOR_READING__BUILDING, oldBuilding, building));
			}
		}
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Building basicGetBuilding() {
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuilding(Building newBuilding) {
		Building oldBuilding = building;
		building = newBuilding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GLTIntermediatePackage.BUILDING_SENSOR_READING__BUILDING, oldBuilding, building));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorReading getSensorReading() {
		if (sensorReading != null && sensorReading.eIsProxy()) {
			InternalEObject oldSensorReading = (InternalEObject)sensorReading;
			sensorReading = (SensorReading)eResolveProxy(oldSensorReading);
			if (sensorReading != oldSensorReading) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GLTIntermediatePackage.BUILDING_SENSOR_READING__SENSOR_READING, oldSensorReading, sensorReading));
			}
		}
		return sensorReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorReading basicGetSensorReading() {
		return sensorReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensorReading(SensorReading newSensorReading) {
		SensorReading oldSensorReading = sensorReading;
		sensorReading = newSensorReading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GLTIntermediatePackage.BUILDING_SENSOR_READING__SENSOR_READING, oldSensorReading, sensorReading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GLTIntermediatePackage.BUILDING_SENSOR_READING__BUILDING_ID:
				return getBuildingId();
			case GLTIntermediatePackage.BUILDING_SENSOR_READING__BUILDING:
				if (resolve) return getBuilding();
				return basicGetBuilding();
			case GLTIntermediatePackage.BUILDING_SENSOR_READING__SENSOR_READING:
				if (resolve) return getSensorReading();
				return basicGetSensorReading();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GLTIntermediatePackage.BUILDING_SENSOR_READING__BUILDING_ID:
				setBuildingId((String)newValue);
				return;
			case GLTIntermediatePackage.BUILDING_SENSOR_READING__BUILDING:
				setBuilding((Building)newValue);
				return;
			case GLTIntermediatePackage.BUILDING_SENSOR_READING__SENSOR_READING:
				setSensorReading((SensorReading)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GLTIntermediatePackage.BUILDING_SENSOR_READING__BUILDING_ID:
				setBuildingId(BUILDING_ID_EDEFAULT);
				return;
			case GLTIntermediatePackage.BUILDING_SENSOR_READING__BUILDING:
				setBuilding((Building)null);
				return;
			case GLTIntermediatePackage.BUILDING_SENSOR_READING__SENSOR_READING:
				setSensorReading((SensorReading)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GLTIntermediatePackage.BUILDING_SENSOR_READING__BUILDING_ID:
				return BUILDING_ID_EDEFAULT == null ? buildingId != null : !BUILDING_ID_EDEFAULT.equals(buildingId);
			case GLTIntermediatePackage.BUILDING_SENSOR_READING__BUILDING:
				return building != null;
			case GLTIntermediatePackage.BUILDING_SENSOR_READING__SENSOR_READING:
				return sensorReading != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (buildingId: ");
		result.append(buildingId);
		result.append(')');
		return result.toString();
	}

} //BuildingSensorReadingImpl
