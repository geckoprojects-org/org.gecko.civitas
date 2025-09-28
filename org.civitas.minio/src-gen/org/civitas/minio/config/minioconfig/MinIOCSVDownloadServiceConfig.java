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

import org.civitas.pipeline.DataSource;

import org.eclipse.emf.ecore.EClass;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min IOCSV Download Service Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration for MinIO CSV download and processing service
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getBucketname <em>Bucketname</em>}</li>
 *   <li>{@link org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getCron <em>Cron</em>}</li>
 *   <li>{@link org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getClientTarget <em>Client Target</em>}</li>
 *   <li>{@link org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getEClass <em>EClass</em>}</li>
 * </ul>
 *
 * @see org.civitas.minio.config.minioconfig.MinioconfigPackage#getMinIOCSVDownloadServiceConfig()
 * @model
 * @generated
 */
@ProviderType
public interface MinIOCSVDownloadServiceConfig extends Configuration, DataSource {
	/**
	 * Returns the value of the '<em><b>Bucketname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the MinIO bucket to monitor for CSV files
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bucketname</em>' attribute.
	 * @see #setBucketname(String)
	 * @see org.civitas.minio.config.minioconfig.MinioconfigPackage#getMinIOCSVDownloadServiceConfig_Bucketname()
	 * @model required="true"
	 *        extendedMetaData="name='bucketname' osgi.annotation.attribute='bucketname' documentation='Maps directly to OSGi Configuration Admin property \'bucketname\' (no underscore conversion needed)'"
	 * @generated
	 */
	String getBucketname();

	/**
	 * Sets the value of the '{@link org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getBucketname <em>Bucketname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucketname</em>' attribute.
	 * @see #getBucketname()
	 * @generated
	 */
	void setBucketname(String value);

	/**
	 * Returns the value of the '<em><b>Cron</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cron expression for scheduling file checks (format: seconds minutes hours day month dayOfWeek)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cron</em>' attribute.
	 * @see #setCron(String)
	 * @see org.civitas.minio.config.minioconfig.MinioconfigPackage#getMinIOCSVDownloadServiceConfig_Cron()
	 * @model default=""
	 *        extendedMetaData="name='cron' osgi.annotation.attribute='cron' documentation='Maps directly to OSGi Configuration Admin property \'cron\' (no underscore conversion needed)'"
	 * @generated
	 */
	String getCron();

	/**
	 * Sets the value of the '{@link org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getCron <em>Cron</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cron</em>' attribute.
	 * @see #getCron()
	 * @generated
	 */
	void setCron(String value);

	/**
	 * Returns the value of the '<em><b>Client Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the MinIO client configuration to use for connection
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Target</em>' reference.
	 * @see #setClientTarget(MinIOClientConfig)
	 * @see org.civitas.minio.config.minioconfig.MinioconfigPackage#getMinIOCSVDownloadServiceConfig_ClientTarget()
	 * @model extendedMetaData="name='client.target' osgi.annotation.attribute='client_target' documentation='Maps to OSGi Configuration Admin property \'client.target\' from annotation attribute \'client_target\''"
	 * @generated
	 */
	MinIOClientConfig getClientTarget();

	/**
	 * Sets the value of the '{@link org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getClientTarget <em>Client Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Target</em>' reference.
	 * @see #getClientTarget()
	 * @generated
	 */
	void setClientTarget(MinIOClientConfig value);

	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URI of the EClass to use for parsing CSV data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see org.civitas.minio.config.minioconfig.MinioconfigPackage#getMinIOCSVDownloadServiceConfig_EClass()
	 * @model extendedMetaData="name='eClassUri' osgi.annotation.attribute='eClassUri' documentation='Maps directly to OSGi Configuration Admin property \'eClassUri\' (no underscore conversion needed)'"
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

} // MinIOCSVDownloadServiceConfig
