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
package org.civitas.prototype.model.calarm.impl;

import cbase.Asset;
import cbase.AssetScope;

import java.util.Collection;
import java.util.Date;

import org.civitas.prototype.model.calarm.Alarm;
import org.civitas.prototype.model.calarm.CIVAlarmPackage;
import org.civitas.prototype.model.calarm.NotificationType;
import org.civitas.prototype.model.calarm.SeverityType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.AlarmImpl#getAlarmId <em>Alarm Id</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.AlarmImpl#getOccurance <em>Occurance</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.AlarmImpl#getAlarmation <em>Alarmation</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.AlarmImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.AlarmImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.AlarmImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.impl.AlarmImpl#getNotificationType <em>Notification Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlarmImpl extends MinimalEObjectImpl.Container implements Alarm {
	/**
	 * The default value of the '{@link #getAlarmId() <em>Alarm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmId()
	 * @generated
	 * @ordered
	 */
	protected static final String ALARM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlarmId() <em>Alarm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmId()
	 * @generated
	 * @ordered
	 */
	protected String alarmId = ALARM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccurance() <em>Occurance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurance()
	 * @generated
	 * @ordered
	 */
	protected static final Date OCCURANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOccurance() <em>Occurance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurance()
	 * @generated
	 * @ordered
	 */
	protected Date occurance = OCCURANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlarmation() <em>Alarmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmation()
	 * @generated
	 * @ordered
	 */
	protected static final Date ALARMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlarmation() <em>Alarmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmation()
	 * @generated
	 * @ordered
	 */
	protected Date alarmation = ALARMATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final SeverityType SEVERITY_EDEFAULT = SeverityType.INFO;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected SeverityType severity = SEVERITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetScope> scope;

	/**
	 * The default value of the '{@link #getNotificationType() <em>Notification Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationType()
	 * @generated
	 * @ordered
	 */
	protected static final NotificationType NOTIFICATION_TYPE_EDEFAULT = NotificationType.EMAIL;

	/**
	 * The cached value of the '{@link #getNotificationType() <em>Notification Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationType()
	 * @generated
	 * @ordered
	 */
	protected NotificationType notificationType = NOTIFICATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CIVAlarmPackage.Literals.ALARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlarmId() {
		return alarmId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlarmId(String newAlarmId) {
		String oldAlarmId = alarmId;
		alarmId = newAlarmId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CIVAlarmPackage.ALARM__ALARM_ID, oldAlarmId, alarmId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOccurance() {
		return occurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOccurance(Date newOccurance) {
		Date oldOccurance = occurance;
		occurance = newOccurance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CIVAlarmPackage.ALARM__OCCURANCE, oldOccurance, occurance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAlarmation() {
		return alarmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlarmation(Date newAlarmation) {
		Date oldAlarmation = alarmation;
		alarmation = newAlarmation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CIVAlarmPackage.ALARM__ALARMATION, oldAlarmation, alarmation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectResolvingEList<Asset>(Asset.class, this, CIVAlarmPackage.ALARM__ASSETS);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeverityType getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(SeverityType newSeverity) {
		SeverityType oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CIVAlarmPackage.ALARM__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssetScope> getScope() {
		if (scope == null) {
			scope = new EObjectResolvingEList<AssetScope>(AssetScope.class, this, CIVAlarmPackage.ALARM__SCOPE);
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationType getNotificationType() {
		return notificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotificationType(NotificationType newNotificationType) {
		NotificationType oldNotificationType = notificationType;
		notificationType = newNotificationType == null ? NOTIFICATION_TYPE_EDEFAULT : newNotificationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CIVAlarmPackage.ALARM__NOTIFICATION_TYPE, oldNotificationType, notificationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CIVAlarmPackage.ALARM__ALARM_ID:
				return getAlarmId();
			case CIVAlarmPackage.ALARM__OCCURANCE:
				return getOccurance();
			case CIVAlarmPackage.ALARM__ALARMATION:
				return getAlarmation();
			case CIVAlarmPackage.ALARM__ASSETS:
				return getAssets();
			case CIVAlarmPackage.ALARM__SEVERITY:
				return getSeverity();
			case CIVAlarmPackage.ALARM__SCOPE:
				return getScope();
			case CIVAlarmPackage.ALARM__NOTIFICATION_TYPE:
				return getNotificationType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CIVAlarmPackage.ALARM__ALARM_ID:
				setAlarmId((String)newValue);
				return;
			case CIVAlarmPackage.ALARM__OCCURANCE:
				setOccurance((Date)newValue);
				return;
			case CIVAlarmPackage.ALARM__ALARMATION:
				setAlarmation((Date)newValue);
				return;
			case CIVAlarmPackage.ALARM__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CIVAlarmPackage.ALARM__SEVERITY:
				setSeverity((SeverityType)newValue);
				return;
			case CIVAlarmPackage.ALARM__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends AssetScope>)newValue);
				return;
			case CIVAlarmPackage.ALARM__NOTIFICATION_TYPE:
				setNotificationType((NotificationType)newValue);
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
			case CIVAlarmPackage.ALARM__ALARM_ID:
				setAlarmId(ALARM_ID_EDEFAULT);
				return;
			case CIVAlarmPackage.ALARM__OCCURANCE:
				setOccurance(OCCURANCE_EDEFAULT);
				return;
			case CIVAlarmPackage.ALARM__ALARMATION:
				setAlarmation(ALARMATION_EDEFAULT);
				return;
			case CIVAlarmPackage.ALARM__ASSETS:
				getAssets().clear();
				return;
			case CIVAlarmPackage.ALARM__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case CIVAlarmPackage.ALARM__SCOPE:
				getScope().clear();
				return;
			case CIVAlarmPackage.ALARM__NOTIFICATION_TYPE:
				setNotificationType(NOTIFICATION_TYPE_EDEFAULT);
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
			case CIVAlarmPackage.ALARM__ALARM_ID:
				return ALARM_ID_EDEFAULT == null ? alarmId != null : !ALARM_ID_EDEFAULT.equals(alarmId);
			case CIVAlarmPackage.ALARM__OCCURANCE:
				return OCCURANCE_EDEFAULT == null ? occurance != null : !OCCURANCE_EDEFAULT.equals(occurance);
			case CIVAlarmPackage.ALARM__ALARMATION:
				return ALARMATION_EDEFAULT == null ? alarmation != null : !ALARMATION_EDEFAULT.equals(alarmation);
			case CIVAlarmPackage.ALARM__ASSETS:
				return assets != null && !assets.isEmpty();
			case CIVAlarmPackage.ALARM__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case CIVAlarmPackage.ALARM__SCOPE:
				return scope != null && !scope.isEmpty();
			case CIVAlarmPackage.ALARM__NOTIFICATION_TYPE:
				return notificationType != NOTIFICATION_TYPE_EDEFAULT;
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
		result.append(" (alarmId: ");
		result.append(alarmId);
		result.append(", occurance: ");
		result.append(occurance);
		result.append(", alarmation: ");
		result.append(alarmation);
		result.append(", severity: ");
		result.append(severity);
		result.append(", notificationType: ");
		result.append(notificationType);
		result.append(')');
		return result.toString();
	}

} //AlarmImpl
