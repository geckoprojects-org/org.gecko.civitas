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
package org.civitas.datasinkconfig;


import org.civitas.osgi.component.ComponentConfigPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;

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
 * @see org.civitas.datasinkconfig.DatasinkconfigFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = DatasinkconfigPackage.eNS_URI, genModel = "/model/emf-repository-datasink-config.genmodel", genModelSourceLocations = {"model/emf-repository-datasink-config.genmodel","org.civitas.handler.emf.repository.datasink/model/emf-repository-datasink-config.genmodel"}, ecore="/model/emf-repository-datasink-config.ecore", ecoreSourceLocations="/model/emf-repository-datasink-config.ecore")
public interface DatasinkconfigPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datasinkconfig";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://civitas.org/handler/emf/repository/datasink/config/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datasinkconfig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasinkconfigPackage eINSTANCE = org.civitas.datasinkconfig.impl.DatasinkconfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.civitas.datasinkconfig.impl.EMFRepositoryDataSinkConfigImpl <em>EMF Repository Data Sink Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.datasinkconfig.impl.EMFRepositoryDataSinkConfigImpl
	 * @see org.civitas.datasinkconfig.impl.DatasinkconfigPackageImpl#getEMFRepositoryDataSinkConfig()
	 * @generated
	 */
	int EMF_REPOSITORY_DATA_SINK_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_REPOSITORY_DATA_SINK_CONFIG__PID = ComponentConfigPackage.CONFIGURATION__PID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_REPOSITORY_DATA_SINK_CONFIG__ID = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_REPOSITORY_DATA_SINK_CONFIG__INPUTS = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_REPOSITORY_DATA_SINK_CONFIG__OUTPUTS = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repo Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_REPOSITORY_DATA_SINK_CONFIG__REPO_TARGET = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Merge Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_REPOSITORY_DATA_SINK_CONFIG__MERGE_STRATEGY = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Detailed Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_REPOSITORY_DATA_SINK_CONFIG__DETAILED_LOGGING = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EMF Repository Data Sink Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_REPOSITORY_DATA_SINK_CONFIG_FEATURE_COUNT = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>EMF Repository Data Sink Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_REPOSITORY_DATA_SINK_CONFIG_OPERATION_COUNT = ComponentConfigPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.civitas.datasinkconfig.MergeStrategy <em>Merge Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.datasinkconfig.MergeStrategy
	 * @see org.civitas.datasinkconfig.impl.DatasinkconfigPackageImpl#getMergeStrategy()
	 * @generated
	 */
	int MERGE_STRATEGY = 1;


	/**
	 * Returns the meta object for class '{@link org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig <em>EMF Repository Data Sink Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Repository Data Sink Config</em>'.
	 * @see org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig
	 * @generated
	 */
	EClass getEMFRepositoryDataSinkConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig#getRepoTarget <em>Repo Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repo Target</em>'.
	 * @see org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig#getRepoTarget()
	 * @see #getEMFRepositoryDataSinkConfig()
	 * @generated
	 */
	EAttribute getEMFRepositoryDataSinkConfig_RepoTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig#getMergeStrategy <em>Merge Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge Strategy</em>'.
	 * @see org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig#getMergeStrategy()
	 * @see #getEMFRepositoryDataSinkConfig()
	 * @generated
	 */
	EAttribute getEMFRepositoryDataSinkConfig_MergeStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig#isDetailedLogging <em>Detailed Logging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detailed Logging</em>'.
	 * @see org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig#isDetailedLogging()
	 * @see #getEMFRepositoryDataSinkConfig()
	 * @generated
	 */
	EAttribute getEMFRepositoryDataSinkConfig_DetailedLogging();

	/**
	 * Returns the meta object for enum '{@link org.civitas.datasinkconfig.MergeStrategy <em>Merge Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Merge Strategy</em>'.
	 * @see org.civitas.datasinkconfig.MergeStrategy
	 * @generated
	 */
	EEnum getMergeStrategy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatasinkconfigFactory getDatasinkconfigFactory();

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
		 * The meta object literal for the '{@link org.civitas.datasinkconfig.impl.EMFRepositoryDataSinkConfigImpl <em>EMF Repository Data Sink Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.datasinkconfig.impl.EMFRepositoryDataSinkConfigImpl
		 * @see org.civitas.datasinkconfig.impl.DatasinkconfigPackageImpl#getEMFRepositoryDataSinkConfig()
		 * @generated
		 */
		EClass EMF_REPOSITORY_DATA_SINK_CONFIG = eINSTANCE.getEMFRepositoryDataSinkConfig();

		/**
		 * The meta object literal for the '<em><b>Repo Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_REPOSITORY_DATA_SINK_CONFIG__REPO_TARGET = eINSTANCE.getEMFRepositoryDataSinkConfig_RepoTarget();

		/**
		 * The meta object literal for the '<em><b>Merge Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_REPOSITORY_DATA_SINK_CONFIG__MERGE_STRATEGY = eINSTANCE.getEMFRepositoryDataSinkConfig_MergeStrategy();

		/**
		 * The meta object literal for the '<em><b>Detailed Logging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_REPOSITORY_DATA_SINK_CONFIG__DETAILED_LOGGING = eINSTANCE.getEMFRepositoryDataSinkConfig_DetailedLogging();

		/**
		 * The meta object literal for the '{@link org.civitas.datasinkconfig.MergeStrategy <em>Merge Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.datasinkconfig.MergeStrategy
		 * @see org.civitas.datasinkconfig.impl.DatasinkconfigPackageImpl#getMergeStrategy()
		 * @generated
		 */
		EEnum MERGE_STRATEGY = eINSTANCE.getMergeStrategy();

	}

} //DatasinkconfigPackage
