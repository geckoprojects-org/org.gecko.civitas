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

import org.civitas.osgi.component.Configuration;

import org.civitas.pipeline.Handler;

import org.eclipse.emf.ecore.EClass;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QVT Handler Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EObject QVT handler configuration
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.qvthandler.QVTHandlerConfig#getTrafo <em>Trafo</em>}</li>
 *   <li>{@link org.civitas.qvthandler.QVTHandlerConfig#getEclassuri <em>Eclassuri</em>}</li>
 * </ul>
 *
 * @see org.civitas.qvthandler.QvthandlerPackage#getQVTHandlerConfig()
 * @model
 * @generated
 */
@ProviderType
public interface QVTHandlerConfig extends Configuration, Handler {
	/**
	 * Returns the value of the '<em><b>Trafo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID of the QVT transformation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trafo</em>' attribute.
	 * @see #setTrafo(String)
	 * @see org.civitas.qvthandler.QvthandlerPackage#getQVTHandlerConfig_Trafo()
	 * @model extendedMetaData="name='trafo.target'"
	 * @generated
	 */
	String getTrafo();

	/**
	 * Sets the value of the '{@link org.civitas.qvthandler.QVTHandlerConfig#getTrafo <em>Trafo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trafo</em>' attribute.
	 * @see #getTrafo()
	 * @generated
	 */
	void setTrafo(String value);

	/**
	 * Returns the value of the '<em><b>Eclassuri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URI of the source eobject
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eclassuri</em>' reference.
	 * @see #setEclassuri(EClass)
	 * @see org.civitas.qvthandler.QvthandlerPackage#getQVTHandlerConfig_Eclassuri()
	 * @model
	 * @generated
	 */
	EClass getEclassuri();

	/**
	 * Sets the value of the '{@link org.civitas.qvthandler.QVTHandlerConfig#getEclassuri <em>Eclassuri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eclassuri</em>' reference.
	 * @see #getEclassuri()
	 * @generated
	 */
	void setEclassuri(EClass value);

} // QVTHandlerConfig
