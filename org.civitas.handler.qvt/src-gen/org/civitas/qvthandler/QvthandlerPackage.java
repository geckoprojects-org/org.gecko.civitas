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
package org.civitas.qvthandler;


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
 * @see org.civitas.qvthandler.QvthandlerFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = QvthandlerPackage.eNS_URI, genModel = "/model/qvt-handler.genmodel", genModelSourceLocations = {"model/qvt-handler.genmodel","org.civitas.handler.qvt/model/qvt-handler.genmodel"}, ecore="/model/qvt-handler.ecore", ecoreSourceLocations="/model/qvt-handler.ecore")
public interface QvthandlerPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qvthandler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://civitas.org/handler/qvt/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qvthandler";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QvthandlerPackage eINSTANCE = org.civitas.qvthandler.impl.QvthandlerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.civitas.qvthandler.impl.QVTHandlerConfigImpl <em>QVT Handler Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.qvthandler.impl.QVTHandlerConfigImpl
	 * @see org.civitas.qvthandler.impl.QvthandlerPackageImpl#getQVTHandlerConfig()
	 * @generated
	 */
	int QVT_HANDLER_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVT_HANDLER_CONFIG__PID = ComponentConfigPackage.CONFIGURATION__PID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVT_HANDLER_CONFIG__ID = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVT_HANDLER_CONFIG__OUTPUTS = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVT_HANDLER_CONFIG__INPUTS = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trafo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVT_HANDLER_CONFIG__TRAFO = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Eclassuri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVT_HANDLER_CONFIG__ECLASSURI = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>QVT Handler Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVT_HANDLER_CONFIG_FEATURE_COUNT = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>QVT Handler Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QVT_HANDLER_CONFIG_OPERATION_COUNT = ComponentConfigPackage.CONFIGURATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.civitas.qvthandler.QVTHandlerConfig <em>QVT Handler Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QVT Handler Config</em>'.
	 * @see org.civitas.qvthandler.QVTHandlerConfig
	 * @generated
	 */
	EClass getQVTHandlerConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.qvthandler.QVTHandlerConfig#getTrafo <em>Trafo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trafo</em>'.
	 * @see org.civitas.qvthandler.QVTHandlerConfig#getTrafo()
	 * @see #getQVTHandlerConfig()
	 * @generated
	 */
	EAttribute getQVTHandlerConfig_Trafo();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.qvthandler.QVTHandlerConfig#getEclassuri <em>Eclassuri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Eclassuri</em>'.
	 * @see org.civitas.qvthandler.QVTHandlerConfig#getEclassuri()
	 * @see #getQVTHandlerConfig()
	 * @generated
	 */
	EReference getQVTHandlerConfig_Eclassuri();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QvthandlerFactory getQvthandlerFactory();

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
		 * The meta object literal for the '{@link org.civitas.qvthandler.impl.QVTHandlerConfigImpl <em>QVT Handler Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.qvthandler.impl.QVTHandlerConfigImpl
		 * @see org.civitas.qvthandler.impl.QvthandlerPackageImpl#getQVTHandlerConfig()
		 * @generated
		 */
		EClass QVT_HANDLER_CONFIG = eINSTANCE.getQVTHandlerConfig();

		/**
		 * The meta object literal for the '<em><b>Trafo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QVT_HANDLER_CONFIG__TRAFO = eINSTANCE.getQVTHandlerConfig_Trafo();

		/**
		 * The meta object literal for the '<em><b>Eclassuri</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QVT_HANDLER_CONFIG__ECLASSURI = eINSTANCE.getQVTHandlerConfig_Eclassuri();

	}

} //QvthandlerPackage
