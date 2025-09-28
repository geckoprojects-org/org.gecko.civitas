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
package org.civitas.minio.config.minioconfig.impl;

import org.civitas.minio.config.minioconfig.MinIOClientConfig;
import org.civitas.minio.config.minioconfig.MinioconfigPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min IO Client Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.minio.config.minioconfig.impl.MinIOClientConfigImpl#getPid <em>Pid</em>}</li>
 *   <li>{@link org.civitas.minio.config.minioconfig.impl.MinIOClientConfigImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.civitas.minio.config.minioconfig.impl.MinIOClientConfigImpl#getAccessKey <em>Access Key</em>}</li>
 *   <li>{@link org.civitas.minio.config.minioconfig.impl.MinIOClientConfigImpl#getSecretKey <em>Secret Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinIOClientConfigImpl extends MinimalEObjectImpl.Container implements MinIOClientConfig {
	/**
	 * The default value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected static final String PID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected String pid = PID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_EDEFAULT = "http://localhost:9000";

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String endpoint = ENDPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessKey() <em>Access Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_KEY_EDEFAULT = "minioadmin";

	/**
	 * The cached value of the '{@link #getAccessKey() <em>Access Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessKey()
	 * @generated
	 * @ordered
	 */
	protected String accessKey = ACCESS_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecretKey() <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_KEY_EDEFAULT = "minioadmin";

	/**
	 * The cached value of the '{@link #getSecretKey() <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKey()
	 * @generated
	 * @ordered
	 */
	protected String secretKey = SECRET_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinIOClientConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinioconfigPackage.Literals.MIN_IO_CLIENT_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPid() {
		return pid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPid(String newPid) {
		String oldPid = pid;
		pid = newPid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinioconfigPackage.MIN_IO_CLIENT_CONFIG__PID, oldPid, pid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpoint(String newEndpoint) {
		String oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinioconfigPackage.MIN_IO_CLIENT_CONFIG__ENDPOINT, oldEndpoint, endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessKey() {
		return accessKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessKey(String newAccessKey) {
		String oldAccessKey = accessKey;
		accessKey = newAccessKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinioconfigPackage.MIN_IO_CLIENT_CONFIG__ACCESS_KEY, oldAccessKey, accessKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecretKey() {
		return secretKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecretKey(String newSecretKey) {
		String oldSecretKey = secretKey;
		secretKey = newSecretKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinioconfigPackage.MIN_IO_CLIENT_CONFIG__SECRET_KEY, oldSecretKey, secretKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__PID:
				return getPid();
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__ENDPOINT:
				return getEndpoint();
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__ACCESS_KEY:
				return getAccessKey();
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__SECRET_KEY:
				return getSecretKey();
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
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__PID:
				setPid((String)newValue);
				return;
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__ENDPOINT:
				setEndpoint((String)newValue);
				return;
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__ACCESS_KEY:
				setAccessKey((String)newValue);
				return;
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__SECRET_KEY:
				setSecretKey((String)newValue);
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
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__PID:
				setPid(PID_EDEFAULT);
				return;
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__ENDPOINT:
				setEndpoint(ENDPOINT_EDEFAULT);
				return;
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__ACCESS_KEY:
				setAccessKey(ACCESS_KEY_EDEFAULT);
				return;
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__SECRET_KEY:
				setSecretKey(SECRET_KEY_EDEFAULT);
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
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__PID:
				return PID_EDEFAULT == null ? pid != null : !PID_EDEFAULT.equals(pid);
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__ENDPOINT:
				return ENDPOINT_EDEFAULT == null ? endpoint != null : !ENDPOINT_EDEFAULT.equals(endpoint);
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__ACCESS_KEY:
				return ACCESS_KEY_EDEFAULT == null ? accessKey != null : !ACCESS_KEY_EDEFAULT.equals(accessKey);
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG__SECRET_KEY:
				return SECRET_KEY_EDEFAULT == null ? secretKey != null : !SECRET_KEY_EDEFAULT.equals(secretKey);
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
		result.append(" (pid: ");
		result.append(pid);
		result.append(", endpoint: ");
		result.append(endpoint);
		result.append(", accessKey: ");
		result.append(accessKey);
		result.append(", secretKey: ");
		result.append(secretKey);
		result.append(')');
		return result.toString();
	}

} //MinIOClientConfigImpl
