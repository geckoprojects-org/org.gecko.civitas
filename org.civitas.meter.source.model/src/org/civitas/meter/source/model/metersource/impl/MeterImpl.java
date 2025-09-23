/*
 */
package org.civitas.meter.source.model.metersource.impl;

import org.civitas.meter.source.model.metersource.Meter;
import org.civitas.meter.source.model.metersource.MeterSourcePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.MeterImpl#getPlantId <em>Plant Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.MeterImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterImpl extends MinimalEObjectImpl.Container implements Meter {
	/**
	 * The default value of the '{@link #getPlantId() <em>Plant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantId()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlantId() <em>Plant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantId()
	 * @generated
	 * @ordered
	 */
	protected String plantId = PLANT_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeterSourcePackage.Literals.METER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlantId() {
		return plantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlantId(String newPlantId) {
		String oldPlantId = plantId;
		plantId = newPlantId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.METER__PLANT_ID, oldPlantId, plantId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.METER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeterSourcePackage.METER__PLANT_ID:
				return getPlantId();
			case MeterSourcePackage.METER__ID:
				return getId();
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
			case MeterSourcePackage.METER__PLANT_ID:
				setPlantId((String)newValue);
				return;
			case MeterSourcePackage.METER__ID:
				setId((Integer)newValue);
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
			case MeterSourcePackage.METER__PLANT_ID:
				setPlantId(PLANT_ID_EDEFAULT);
				return;
			case MeterSourcePackage.METER__ID:
				setId(ID_EDEFAULT);
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
			case MeterSourcePackage.METER__PLANT_ID:
				return PLANT_ID_EDEFAULT == null ? plantId != null : !PLANT_ID_EDEFAULT.equals(plantId);
			case MeterSourcePackage.METER__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (plantId: ");
		result.append(plantId);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //MeterImpl
