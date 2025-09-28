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
package org.civitas.minio.config.minioconfig;

import org.civitas.osgi.component.Configuration;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min IO Client Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration for MinIO client connection settings
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.minio.config.minioconfig.MinIOClientConfig#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.civitas.minio.config.minioconfig.MinIOClientConfig#getAccessKey <em>Access Key</em>}</li>
 *   <li>{@link org.civitas.minio.config.minioconfig.MinIOClientConfig#getSecretKey <em>Secret Key</em>}</li>
 * </ul>
 *
 * @see org.civitas.minio.config.minioconfig.MinioconfigPackage#getMinIOClientConfig()
 * @model
 * @generated
 */
@ProviderType
public interface MinIOClientConfig extends Configuration {
	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' attribute.
	 * The default value is <code>"http://localhost:9000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MinIO server endpoint URL
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' attribute.
	 * @see #setEndpoint(String)
	 * @see org.civitas.minio.config.minioconfig.MinioconfigPackage#getMinIOClientConfig_Endpoint()
	 * @model default="http://localhost:9000" required="true"
	 * @generated
	 */
	String getEndpoint();

	/**
	 * Sets the value of the '{@link org.civitas.minio.config.minioconfig.MinIOClientConfig#getEndpoint <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' attribute.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Access Key</b></em>' attribute.
	 * The default value is <code>"minioadmin"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MinIO access key for authentication
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Key</em>' attribute.
	 * @see #setAccessKey(String)
	 * @see org.civitas.minio.config.minioconfig.MinioconfigPackage#getMinIOClientConfig_AccessKey()
	 * @model default="minioadmin" required="true"
	 *        extendedMetaData="name='accessKey'"
	 * @generated
	 */
	String getAccessKey();

	/**
	 * Sets the value of the '{@link org.civitas.minio.config.minioconfig.MinIOClientConfig#getAccessKey <em>Access Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Key</em>' attribute.
	 * @see #getAccessKey()
	 * @generated
	 */
	void setAccessKey(String value);

	/**
	 * Returns the value of the '<em><b>Secret Key</b></em>' attribute.
	 * The default value is <code>"minioadmin"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MinIO secret key for authentication
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secret Key</em>' attribute.
	 * @see #setSecretKey(String)
	 * @see org.civitas.minio.config.minioconfig.MinioconfigPackage#getMinIOClientConfig_SecretKey()
	 * @model default="minioadmin" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/ExtendedMetaData name='secretKey'"
	 * @generated
	 */
	String getSecretKey();

	/**
	 * Sets the value of the '{@link org.civitas.minio.config.minioconfig.MinIOClientConfig#getSecretKey <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret Key</em>' attribute.
	 * @see #getSecretKey()
	 * @generated
	 */
	void setSecretKey(String value);

} // MinIOClientConfig
