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
package org.civitas.db.loader.scheduledloaderconfig;


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
 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = ScheduledloaderconfigPackage.eNS_URI, genModel = "/model/scheduled-loader.genmodel", genModelSourceLocations = {"model/scheduled-loader.genmodel","org.civitas.db.loader/model/scheduled-loader.genmodel"}, ecore="/model/scheduled-loader.ecore", ecoreSourceLocations="/model/scheduled-loader.ecore")
public interface ScheduledloaderconfigPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scheduledloaderconfig";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://civitas.org/db/loader/scheduledloader/config/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scheduledloaderconfig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScheduledloaderconfigPackage eINSTANCE = org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledloaderconfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledLoaderConfigImpl <em>Scheduled Loader Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledLoaderConfigImpl
	 * @see org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledloaderconfigPackageImpl#getScheduledLoaderConfig()
	 * @generated
	 */
	int SCHEDULED_LOADER_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_LOADER_CONFIG__PID = ComponentConfigPackage.CONFIGURATION__PID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_LOADER_CONFIG__ID = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_LOADER_CONFIG__OUTPUTS = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schedule Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_LOADER_CONFIG__SCHEDULE_INTERVAL = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Query Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_LOADER_CONFIG__QUERY_LIMIT = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initial Query Skip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_LOADER_CONFIG__INITIAL_QUERY_SKIP = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enable Paging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_LOADER_CONFIG__ENABLE_PAGING = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Repo Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_LOADER_CONFIG__REPO_TARGET = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Loader Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_LOADER_CONFIG__LOADER_NAME = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_LOADER_CONFIG__PACKAGE = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Eclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_LOADER_CONFIG__ECLASS = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Scheduled Loader Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_LOADER_CONFIG_FEATURE_COUNT = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Scheduled Loader Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_LOADER_CONFIG_OPERATION_COUNT = ComponentConfigPackage.CONFIGURATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig <em>Scheduled Loader Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduled Loader Config</em>'.
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig
	 * @generated
	 */
	EClass getScheduledLoaderConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getScheduleInterval <em>Schedule Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Interval</em>'.
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getScheduleInterval()
	 * @see #getScheduledLoaderConfig()
	 * @generated
	 */
	EAttribute getScheduledLoaderConfig_ScheduleInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getQueryLimit <em>Query Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Limit</em>'.
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getQueryLimit()
	 * @see #getScheduledLoaderConfig()
	 * @generated
	 */
	EAttribute getScheduledLoaderConfig_QueryLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getInitialQuerySkip <em>Initial Query Skip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Query Skip</em>'.
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getInitialQuerySkip()
	 * @see #getScheduledLoaderConfig()
	 * @generated
	 */
	EAttribute getScheduledLoaderConfig_InitialQuerySkip();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#isEnablePaging <em>Enable Paging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Paging</em>'.
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#isEnablePaging()
	 * @see #getScheduledLoaderConfig()
	 * @generated
	 */
	EAttribute getScheduledLoaderConfig_EnablePaging();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getRepoTarget <em>Repo Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repo Target</em>'.
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getRepoTarget()
	 * @see #getScheduledLoaderConfig()
	 * @generated
	 */
	EAttribute getScheduledLoaderConfig_RepoTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getLoaderName <em>Loader Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loader Name</em>'.
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getLoaderName()
	 * @see #getScheduledLoaderConfig()
	 * @generated
	 */
	EAttribute getScheduledLoaderConfig_LoaderName();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getPackage()
	 * @see #getScheduledLoaderConfig()
	 * @generated
	 */
	EReference getScheduledLoaderConfig_Package();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getEclass <em>Eclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Eclass</em>'.
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getEclass()
	 * @see #getScheduledLoaderConfig()
	 * @generated
	 */
	EReference getScheduledLoaderConfig_Eclass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScheduledloaderconfigFactory getScheduledloaderconfigFactory();

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
		 * The meta object literal for the '{@link org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledLoaderConfigImpl <em>Scheduled Loader Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledLoaderConfigImpl
		 * @see org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledloaderconfigPackageImpl#getScheduledLoaderConfig()
		 * @generated
		 */
		EClass SCHEDULED_LOADER_CONFIG = eINSTANCE.getScheduledLoaderConfig();

		/**
		 * The meta object literal for the '<em><b>Schedule Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_LOADER_CONFIG__SCHEDULE_INTERVAL = eINSTANCE.getScheduledLoaderConfig_ScheduleInterval();

		/**
		 * The meta object literal for the '<em><b>Query Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_LOADER_CONFIG__QUERY_LIMIT = eINSTANCE.getScheduledLoaderConfig_QueryLimit();

		/**
		 * The meta object literal for the '<em><b>Initial Query Skip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_LOADER_CONFIG__INITIAL_QUERY_SKIP = eINSTANCE.getScheduledLoaderConfig_InitialQuerySkip();

		/**
		 * The meta object literal for the '<em><b>Enable Paging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_LOADER_CONFIG__ENABLE_PAGING = eINSTANCE.getScheduledLoaderConfig_EnablePaging();

		/**
		 * The meta object literal for the '<em><b>Repo Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_LOADER_CONFIG__REPO_TARGET = eINSTANCE.getScheduledLoaderConfig_RepoTarget();

		/**
		 * The meta object literal for the '<em><b>Loader Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_LOADER_CONFIG__LOADER_NAME = eINSTANCE.getScheduledLoaderConfig_LoaderName();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULED_LOADER_CONFIG__PACKAGE = eINSTANCE.getScheduledLoaderConfig_Package();

		/**
		 * The meta object literal for the '<em><b>Eclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULED_LOADER_CONFIG__ECLASS = eINSTANCE.getScheduledLoaderConfig_Eclass();

	}

} //ScheduledloaderconfigPackage
