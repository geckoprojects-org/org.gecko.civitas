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
package org.civitas.pipeline;

import org.civitas.osgi.component.Configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.pipeline.Pipeline#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.pipeline.Pipeline#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.civitas.pipeline.Pipeline#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.civitas.pipeline.PipelinePackage#getPipeline()
 * @model
 * @generated
 */
@ProviderType
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.civitas.pipeline.PipelinePackage#getPipeline_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.civitas.pipeline.Pipeline#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.civitas.pipeline.PipelineStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see org.civitas.pipeline.PipelinePackage#getPipeline_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<PipelineStep> getSteps();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.civitas.osgi.component.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.civitas.pipeline.PipelinePackage#getPipeline_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getComponents();

} // Pipeline
