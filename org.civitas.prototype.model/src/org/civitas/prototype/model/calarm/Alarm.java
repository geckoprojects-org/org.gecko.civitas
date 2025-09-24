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
package org.civitas.prototype.model.calarm;

import cbase.Asset;
import cbase.AssetScope;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.prototype.model.calarm.Alarm#getAlarmId <em>Alarm Id</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.Alarm#getOccurance <em>Occurance</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.Alarm#getAlarmation <em>Alarmation</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.Alarm#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.Alarm#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.Alarm#getScope <em>Scope</em>}</li>
 *   <li>{@link org.civitas.prototype.model.calarm.Alarm#getNotificationType <em>Notification Type</em>}</li>
 * </ul>
 *
 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getAlarm()
 * @model
 * @generated
 */
@ProviderType
public interface Alarm extends EObject {
	/**
	 * Returns the value of the '<em><b>Alarm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Id</em>' attribute.
	 * @see #setAlarmId(String)
	 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getAlarm_AlarmId()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getAlarmId();

	/**
	 * Sets the value of the '{@link org.civitas.prototype.model.calarm.Alarm#getAlarmId <em>Alarm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Id</em>' attribute.
	 * @see #getAlarmId()
	 * @generated
	 */
	void setAlarmId(String value);

	/**
	 * Returns the value of the '<em><b>Occurance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurance</em>' attribute.
	 * @see #setOccurance(Date)
	 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getAlarm_Occurance()
	 * @model
	 * @generated
	 */
	Date getOccurance();

	/**
	 * Sets the value of the '{@link org.civitas.prototype.model.calarm.Alarm#getOccurance <em>Occurance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurance</em>' attribute.
	 * @see #getOccurance()
	 * @generated
	 */
	void setOccurance(Date value);

	/**
	 * Returns the value of the '<em><b>Alarmation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarmation</em>' attribute.
	 * @see #setAlarmation(Date)
	 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getAlarm_Alarmation()
	 * @model
	 * @generated
	 */
	Date getAlarmation();

	/**
	 * Sets the value of the '{@link org.civitas.prototype.model.calarm.Alarm#getAlarmation <em>Alarmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarmation</em>' attribute.
	 * @see #getAlarmation()
	 * @generated
	 */
	void setAlarmation(Date value);

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link cbase.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getAlarm_Assets()
	 * @model
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.civitas.prototype.model.calarm.SeverityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.civitas.prototype.model.calarm.SeverityType
	 * @see #setSeverity(SeverityType)
	 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getAlarm_Severity()
	 * @model
	 * @generated
	 */
	SeverityType getSeverity();

	/**
	 * Sets the value of the '{@link org.civitas.prototype.model.calarm.Alarm#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.civitas.prototype.model.calarm.SeverityType
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(SeverityType value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference list.
	 * The list contents are of type {@link cbase.AssetScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference list.
	 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getAlarm_Scope()
	 * @model
	 * @generated
	 */
	EList<AssetScope> getScope();

	/**
	 * Returns the value of the '<em><b>Notification Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.civitas.prototype.model.calarm.NotificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Type</em>' attribute.
	 * @see org.civitas.prototype.model.calarm.NotificationType
	 * @see #setNotificationType(NotificationType)
	 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getAlarm_NotificationType()
	 * @model
	 * @generated
	 */
	NotificationType getNotificationType();

	/**
	 * Sets the value of the '{@link org.civitas.prototype.model.calarm.Alarm#getNotificationType <em>Notification Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Type</em>' attribute.
	 * @see org.civitas.prototype.model.calarm.NotificationType
	 * @see #getNotificationType()
	 * @generated
	 */
	void setNotificationType(NotificationType value);

} // Alarm
