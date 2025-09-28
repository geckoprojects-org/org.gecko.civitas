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
package org.civitas.handler.emf.attacher.emfattacherconfig;


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
 * @see org.civitas.handler.emf.attacher.emfattacherconfig.EmfattacherconfigFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = EmfattacherconfigPackage.eNS_URI, genModel = "/model/emf-attacher-config.genmodel", genModelSourceLocations = {"model/emf-attacher-config.genmodel","org.civitas.handler.emf.attacher/model/emf-attacher-config.genmodel"}, ecore="/model/emf-attacher-config.ecore", ecoreSourceLocations="/model/emf-attacher-config.ecore")
public interface EmfattacherconfigPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emfattacherconfig";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://civitas.org/handler/emf/attacher/config/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emfattacherconfig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmfattacherconfigPackage eINSTANCE = org.civitas.handler.emf.attacher.emfattacherconfig.impl.EmfattacherconfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.civitas.handler.emf.attacher.emfattacherconfig.impl.EMFAttacherHandlerConfigImpl <em>EMF Attacher Handler Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.handler.emf.attacher.emfattacherconfig.impl.EMFAttacherHandlerConfigImpl
	 * @see org.civitas.handler.emf.attacher.emfattacherconfig.impl.EmfattacherconfigPackageImpl#getEMFAttacherHandlerConfig()
	 * @generated
	 */
	int EMF_ATTACHER_HANDLER_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTACHER_HANDLER_CONFIG__PID = ComponentConfigPackage.CONFIGURATION__PID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTACHER_HANDLER_CONFIG__ID = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTACHER_HANDLER_CONFIG__OUTPUTS = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTACHER_HANDLER_CONFIG__INPUTS = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repo Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTACHER_HANDLER_CONFIG__REPO_TARGET = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target EClass Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTACHER_HANDLER_CONFIG__TARGET_ECLASS_URI = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Incoming EClass Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTACHER_HANDLER_CONFIG__INCOMING_ECLASS_URI = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Reference Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTACHER_HANDLER_CONFIG__TARGET_REFERENCE_URI = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Foreign Key Feature Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTACHER_HANDLER_CONFIG__FOREIGN_KEY_FEATURE_URI = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>EMF Attacher Handler Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTACHER_HANDLER_CONFIG_FEATURE_COUNT = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>EMF Attacher Handler Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTACHER_HANDLER_CONFIG_OPERATION_COUNT = ComponentConfigPackage.CONFIGURATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig <em>EMF Attacher Handler Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Attacher Handler Config</em>'.
	 * @see org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig
	 * @generated
	 */
	EClass getEMFAttacherHandlerConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getRepoTarget <em>Repo Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repo Target</em>'.
	 * @see org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getRepoTarget()
	 * @see #getEMFAttacherHandlerConfig()
	 * @generated
	 */
	EAttribute getEMFAttacherHandlerConfig_RepoTarget();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getTargetEClassUri <em>Target EClass Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target EClass Uri</em>'.
	 * @see org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getTargetEClassUri()
	 * @see #getEMFAttacherHandlerConfig()
	 * @generated
	 */
	EReference getEMFAttacherHandlerConfig_TargetEClassUri();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getIncomingEClassUri <em>Incoming EClass Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming EClass Uri</em>'.
	 * @see org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getIncomingEClassUri()
	 * @see #getEMFAttacherHandlerConfig()
	 * @generated
	 */
	EReference getEMFAttacherHandlerConfig_IncomingEClassUri();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getTargetReferenceUri <em>Target Reference Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Reference Uri</em>'.
	 * @see org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getTargetReferenceUri()
	 * @see #getEMFAttacherHandlerConfig()
	 * @generated
	 */
	EReference getEMFAttacherHandlerConfig_TargetReferenceUri();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getForeignKeyFeatureUri <em>Foreign Key Feature Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foreign Key Feature Uri</em>'.
	 * @see org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getForeignKeyFeatureUri()
	 * @see #getEMFAttacherHandlerConfig()
	 * @generated
	 */
	EReference getEMFAttacherHandlerConfig_ForeignKeyFeatureUri();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmfattacherconfigFactory getEmfattacherconfigFactory();

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
		 * The meta object literal for the '{@link org.civitas.handler.emf.attacher.emfattacherconfig.impl.EMFAttacherHandlerConfigImpl <em>EMF Attacher Handler Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.handler.emf.attacher.emfattacherconfig.impl.EMFAttacherHandlerConfigImpl
		 * @see org.civitas.handler.emf.attacher.emfattacherconfig.impl.EmfattacherconfigPackageImpl#getEMFAttacherHandlerConfig()
		 * @generated
		 */
		EClass EMF_ATTACHER_HANDLER_CONFIG = eINSTANCE.getEMFAttacherHandlerConfig();

		/**
		 * The meta object literal for the '<em><b>Repo Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_ATTACHER_HANDLER_CONFIG__REPO_TARGET = eINSTANCE.getEMFAttacherHandlerConfig_RepoTarget();

		/**
		 * The meta object literal for the '<em><b>Target EClass Uri</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_ATTACHER_HANDLER_CONFIG__TARGET_ECLASS_URI = eINSTANCE.getEMFAttacherHandlerConfig_TargetEClassUri();

		/**
		 * The meta object literal for the '<em><b>Incoming EClass Uri</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_ATTACHER_HANDLER_CONFIG__INCOMING_ECLASS_URI = eINSTANCE.getEMFAttacherHandlerConfig_IncomingEClassUri();

		/**
		 * The meta object literal for the '<em><b>Target Reference Uri</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_ATTACHER_HANDLER_CONFIG__TARGET_REFERENCE_URI = eINSTANCE.getEMFAttacherHandlerConfig_TargetReferenceUri();

		/**
		 * The meta object literal for the '<em><b>Foreign Key Feature Uri</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_ATTACHER_HANDLER_CONFIG__FOREIGN_KEY_FEATURE_URI = eINSTANCE.getEMFAttacherHandlerConfig_ForeignKeyFeatureUri();

	}

} //EmfattacherconfigPackage
