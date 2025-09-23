/*
 */
package org.civitas.meter.source.model.metersource.impl;

import java.time.Instant;

import org.civitas.meter.source.model.metersource.MeterSourcePackage;
import org.civitas.meter.source.model.metersource.OperatingData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.OperatingDataImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.OperatingDataImpl#getPlantId <em>Plant Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.OperatingDataImpl#getOperatingHours <em>Operating Hours</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.impl.OperatingDataImpl#getStarts <em>Starts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingDataImpl extends MinimalEObjectImpl.Container implements OperatingData {
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
	 * The default value of the '{@link #getOperatingHours() <em>Operating Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingHours()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OPERATING_HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperatingHours() <em>Operating Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingHours()
	 * @generated
	 * @ordered
	 */
	protected Integer operatingHours = OPERATING_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStarts() <em>Starts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarts()
	 * @generated
	 * @ordered
	 */
	protected static final Instant STARTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStarts() <em>Starts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarts()
	 * @generated
	 * @ordered
	 */
	protected Instant starts = STARTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeterSourcePackage.Literals.OPERATING_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.OPERATING_DATA__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.OPERATING_DATA__PLANT_ID, oldPlantId, plantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOperatingHours() {
		return operatingHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatingHours(Integer newOperatingHours) {
		Integer oldOperatingHours = operatingHours;
		operatingHours = newOperatingHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.OPERATING_DATA__OPERATING_HOURS, oldOperatingHours, operatingHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getStarts() {
		return starts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStarts(Instant newStarts) {
		Instant oldStarts = starts;
		starts = newStarts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeterSourcePackage.OPERATING_DATA__STARTS, oldStarts, starts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeterSourcePackage.OPERATING_DATA__ID:
				return getId();
			case MeterSourcePackage.OPERATING_DATA__PLANT_ID:
				return getPlantId();
			case MeterSourcePackage.OPERATING_DATA__OPERATING_HOURS:
				return getOperatingHours();
			case MeterSourcePackage.OPERATING_DATA__STARTS:
				return getStarts();
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
			case MeterSourcePackage.OPERATING_DATA__ID:
				setId((Integer)newValue);
				return;
			case MeterSourcePackage.OPERATING_DATA__PLANT_ID:
				setPlantId((String)newValue);
				return;
			case MeterSourcePackage.OPERATING_DATA__OPERATING_HOURS:
				setOperatingHours((Integer)newValue);
				return;
			case MeterSourcePackage.OPERATING_DATA__STARTS:
				setStarts((Instant)newValue);
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
			case MeterSourcePackage.OPERATING_DATA__ID:
				setId(ID_EDEFAULT);
				return;
			case MeterSourcePackage.OPERATING_DATA__PLANT_ID:
				setPlantId(PLANT_ID_EDEFAULT);
				return;
			case MeterSourcePackage.OPERATING_DATA__OPERATING_HOURS:
				setOperatingHours(OPERATING_HOURS_EDEFAULT);
				return;
			case MeterSourcePackage.OPERATING_DATA__STARTS:
				setStarts(STARTS_EDEFAULT);
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
			case MeterSourcePackage.OPERATING_DATA__ID:
				return id != ID_EDEFAULT;
			case MeterSourcePackage.OPERATING_DATA__PLANT_ID:
				return PLANT_ID_EDEFAULT == null ? plantId != null : !PLANT_ID_EDEFAULT.equals(plantId);
			case MeterSourcePackage.OPERATING_DATA__OPERATING_HOURS:
				return OPERATING_HOURS_EDEFAULT == null ? operatingHours != null : !OPERATING_HOURS_EDEFAULT.equals(operatingHours);
			case MeterSourcePackage.OPERATING_DATA__STARTS:
				return STARTS_EDEFAULT == null ? starts != null : !STARTS_EDEFAULT.equals(starts);
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
		result.append(", plantId: ");
		result.append(plantId);
		result.append(", operatingHours: ");
		result.append(operatingHours);
		result.append(", starts: ");
		result.append(starts);
		result.append(')');
		return result.toString();
	}

} //OperatingDataImpl
