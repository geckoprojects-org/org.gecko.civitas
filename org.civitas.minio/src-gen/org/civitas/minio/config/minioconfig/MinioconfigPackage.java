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


import org.civitas.osgi.component.ComponentConfigPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.civitas.minio.config.minioconfig.MinioconfigFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = MinioconfigPackage.eNS_URI, genModel = "/model/minio-config.genmodel", genModelSourceLocations = {"model/minio-config.genmodel","org.civitas.minio/model/minio-config.genmodel"}, ecore="/model/minio-config.ecore", ecoreSourceLocations="/model/minio-config.ecore")
public interface MinioconfigPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "minioconfig";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://civitas.org/minio/config/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "minioconfig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MinioconfigPackage eINSTANCE = org.civitas.minio.config.minioconfig.impl.MinioconfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.civitas.minio.config.minioconfig.impl.MinIOClientConfigImpl <em>Min IO Client Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.minio.config.minioconfig.impl.MinIOClientConfigImpl
	 * @see org.civitas.minio.config.minioconfig.impl.MinioconfigPackageImpl#getMinIOClientConfig()
	 * @generated
	 */
	int MIN_IO_CLIENT_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_IO_CLIENT_CONFIG__PID = ComponentConfigPackage.CONFIGURATION__PID;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_IO_CLIENT_CONFIG__ENDPOINT = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_IO_CLIENT_CONFIG__ACCESS_KEY = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_IO_CLIENT_CONFIG__SECRET_KEY = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Min IO Client Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_IO_CLIENT_CONFIG_FEATURE_COUNT = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Min IO Client Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_IO_CLIENT_CONFIG_OPERATION_COUNT = ComponentConfigPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.civitas.minio.config.minioconfig.impl.MinIOCSVDownloadServiceConfigImpl <em>Min IOCSV Download Service Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.minio.config.minioconfig.impl.MinIOCSVDownloadServiceConfigImpl
	 * @see org.civitas.minio.config.minioconfig.impl.MinioconfigPackageImpl#getMinIOCSVDownloadServiceConfig()
	 * @generated
	 */
	int MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__PID = ComponentConfigPackage.CONFIGURATION__PID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ID = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__OUTPUTS = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bucketname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__BUCKETNAME = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cron</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CRON = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Client Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CLIENT_TARGET = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ECLASS = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Min IOCSV Download Service Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG_FEATURE_COUNT = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Min IOCSV Download Service Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG_OPERATION_COUNT = ComponentConfigPackage.CONFIGURATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.civitas.minio.config.minioconfig.MinIOClientConfig <em>Min IO Client Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min IO Client Config</em>'.
	 * @see org.civitas.minio.config.minioconfig.MinIOClientConfig
	 * @generated
	 */
	EClass getMinIOClientConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.minio.config.minioconfig.MinIOClientConfig#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint</em>'.
	 * @see org.civitas.minio.config.minioconfig.MinIOClientConfig#getEndpoint()
	 * @see #getMinIOClientConfig()
	 * @generated
	 */
	EAttribute getMinIOClientConfig_Endpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.minio.config.minioconfig.MinIOClientConfig#getAccessKey <em>Access Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Key</em>'.
	 * @see org.civitas.minio.config.minioconfig.MinIOClientConfig#getAccessKey()
	 * @see #getMinIOClientConfig()
	 * @generated
	 */
	EAttribute getMinIOClientConfig_AccessKey();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.minio.config.minioconfig.MinIOClientConfig#getSecretKey <em>Secret Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret Key</em>'.
	 * @see org.civitas.minio.config.minioconfig.MinIOClientConfig#getSecretKey()
	 * @see #getMinIOClientConfig()
	 * @generated
	 */
	EAttribute getMinIOClientConfig_SecretKey();

	/**
	 * Returns the meta object for class '{@link org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig <em>Min IOCSV Download Service Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min IOCSV Download Service Config</em>'.
	 * @see org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig
	 * @generated
	 */
	EClass getMinIOCSVDownloadServiceConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getBucketname <em>Bucketname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucketname</em>'.
	 * @see org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getBucketname()
	 * @see #getMinIOCSVDownloadServiceConfig()
	 * @generated
	 */
	EAttribute getMinIOCSVDownloadServiceConfig_Bucketname();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getCron <em>Cron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cron</em>'.
	 * @see org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getCron()
	 * @see #getMinIOCSVDownloadServiceConfig()
	 * @generated
	 */
	EAttribute getMinIOCSVDownloadServiceConfig_Cron();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getClientTarget <em>Client Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client Target</em>'.
	 * @see org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getClientTarget()
	 * @see #getMinIOCSVDownloadServiceConfig()
	 * @generated
	 */
	EReference getMinIOCSVDownloadServiceConfig_ClientTarget();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig#getEClass()
	 * @see #getMinIOCSVDownloadServiceConfig()
	 * @generated
	 */
	EReference getMinIOCSVDownloadServiceConfig_EClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MinioconfigFactory getMinioconfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.civitas.minio.config.minioconfig.impl.MinIOClientConfigImpl <em>Min IO Client Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.minio.config.minioconfig.impl.MinIOClientConfigImpl
		 * @see org.civitas.minio.config.minioconfig.impl.MinioconfigPackageImpl#getMinIOClientConfig()
		 * @generated
		 */
		EClass MIN_IO_CLIENT_CONFIG = eINSTANCE.getMinIOClientConfig();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_IO_CLIENT_CONFIG__ENDPOINT = eINSTANCE.getMinIOClientConfig_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Access Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_IO_CLIENT_CONFIG__ACCESS_KEY = eINSTANCE.getMinIOClientConfig_AccessKey();

		/**
		 * The meta object literal for the '<em><b>Secret Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_IO_CLIENT_CONFIG__SECRET_KEY = eINSTANCE.getMinIOClientConfig_SecretKey();

		/**
		 * The meta object literal for the '{@link org.civitas.minio.config.minioconfig.impl.MinIOCSVDownloadServiceConfigImpl <em>Min IOCSV Download Service Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.minio.config.minioconfig.impl.MinIOCSVDownloadServiceConfigImpl
		 * @see org.civitas.minio.config.minioconfig.impl.MinioconfigPackageImpl#getMinIOCSVDownloadServiceConfig()
		 * @generated
		 */
		EClass MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG = eINSTANCE.getMinIOCSVDownloadServiceConfig();

		/**
		 * The meta object literal for the '<em><b>Bucketname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__BUCKETNAME = eINSTANCE.getMinIOCSVDownloadServiceConfig_Bucketname();

		/**
		 * The meta object literal for the '<em><b>Cron</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CRON = eINSTANCE.getMinIOCSVDownloadServiceConfig_Cron();

		/**
		 * The meta object literal for the '<em><b>Client Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CLIENT_TARGET = eINSTANCE.getMinIOCSVDownloadServiceConfig_ClientTarget();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ECLASS = eINSTANCE.getMinIOCSVDownloadServiceConfig_EClass();

	}

} //MinioconfigPackage
