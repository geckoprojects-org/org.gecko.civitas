/*
 */
package org.civitas.meter.source.model.metersource.impl;

import java.time.Instant;

import org.civitas.meter.source.model.metersource.MeterSourcePackage;
import org.civitas.meter.source.model.metersource.Reading;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.ReadingImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.ReadingImpl#getMeterId <em>Meter Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.ReadingImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.ReadingImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadingImpl extends MinimalEObjectImpl.Container implements Reading {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeterId() <em>Meter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterId()
	 * @generated
	 * @ordered
	 */
	protected static final String METER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeterId() <em>Meter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterId()
	 * @generated
	 * @ordered
	 */
	protected String meterId = METER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Instant TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Instant timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeterSourcePackage.Literals.READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.READING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMeterId() {
		return meterId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeterId(String newMeterId) {
		String oldMeterId = meterId;
		meterId = newMeterId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.READING__METER_ID, oldMeterId, meterId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.READING__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Instant newTimestamp) {
		Instant oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.READING__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeterSourcePackage.READING__ID:
				return getId();
			case MeterSourcePackage.READING__METER_ID:
				return getMeterId();
			case MeterSourcePackage.READING__VALUE:
				return getValue();
			case MeterSourcePackage.READING__TIMESTAMP:
				return getTimestamp();
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
			case MeterSourcePackage.READING__ID:
				setId((Integer)newValue);
				return;
			case MeterSourcePackage.READING__METER_ID:
				setMeterId((String)newValue);
				return;
			case MeterSourcePackage.READING__VALUE:
				setValue((Integer)newValue);
				return;
			case MeterSourcePackage.READING__TIMESTAMP:
				setTimestamp((Instant)newValue);
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
			case MeterSourcePackage.READING__ID:
				setId(ID_EDEFAULT);
				return;
			case MeterSourcePackage.READING__METER_ID:
				setMeterId(METER_ID_EDEFAULT);
				return;
			case MeterSourcePackage.READING__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MeterSourcePackage.READING__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
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
			case MeterSourcePackage.READING__ID:
				return id != ID_EDEFAULT;
			case MeterSourcePackage.READING__METER_ID:
				return METER_ID_EDEFAULT == null ? meterId != null : !METER_ID_EDEFAULT.equals(meterId);
			case MeterSourcePackage.READING__VALUE:
				return value != VALUE_EDEFAULT;
			case MeterSourcePackage.READING__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", meterId: ");
		result.append(meterId);
		result.append(", value: ");
		result.append(value);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //ReadingImpl
