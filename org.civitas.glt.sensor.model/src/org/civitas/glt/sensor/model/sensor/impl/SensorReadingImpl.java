/*
 */
package org.civitas.glt.sensor.model.sensor.impl;

import java.util.Date;

import org.civitas.glt.sensor.model.sensor.BuildingSensorPackage;
import org.civitas.glt.sensor.model.sensor.SensorReading;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.glt.sensor.model.sensor.impl.SensorReadingImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.civitas.glt.sensor.model.sensor.impl.SensorReadingImpl#getBuildingId <em>Building Id</em>}</li>
 *   <li>{@link org.civitas.glt.sensor.model.sensor.impl.SensorReadingImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorReadingImpl extends MinimalEObjectImpl.Container implements SensorReading {
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Double value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingSensorPackage.Literals.SENSOR_READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingSensorPackage.SENSOR_READING__TIMESTAMP, oldTimestamp, timestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingSensorPackage.SENSOR_READING__BUILDING_ID, oldBuildingId, buildingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Double newValue) {
		Double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingSensorPackage.SENSOR_READING__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuildingSensorPackage.SENSOR_READING__TIMESTAMP:
				return getTimestamp();
			case BuildingSensorPackage.SENSOR_READING__BUILDING_ID:
				return getBuildingId();
			case BuildingSensorPackage.SENSOR_READING__VALUE:
				return getValue();
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
			case BuildingSensorPackage.SENSOR_READING__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case BuildingSensorPackage.SENSOR_READING__BUILDING_ID:
				setBuildingId((String)newValue);
				return;
			case BuildingSensorPackage.SENSOR_READING__VALUE:
				setValue((Double)newValue);
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
			case BuildingSensorPackage.SENSOR_READING__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case BuildingSensorPackage.SENSOR_READING__BUILDING_ID:
				setBuildingId(BUILDING_ID_EDEFAULT);
				return;
			case BuildingSensorPackage.SENSOR_READING__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case BuildingSensorPackage.SENSOR_READING__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case BuildingSensorPackage.SENSOR_READING__BUILDING_ID:
				return BUILDING_ID_EDEFAULT == null ? buildingId != null : !BUILDING_ID_EDEFAULT.equals(buildingId);
			case BuildingSensorPackage.SENSOR_READING__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(", buildingId: ");
		result.append(buildingId);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SensorReadingImpl
