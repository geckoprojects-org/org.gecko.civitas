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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.pipeline.DataSource#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see org.civitas.pipeline.PipelinePackage#getDataSource()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface DataSource extends PipelineStep {
	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link org.civitas.pipeline.DataSink}.
	 * It is bidirectional and its opposite is '{@link org.civitas.pipeline.DataSink#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see org.civitas.pipeline.PipelinePackage#getDataSource_Outputs()
	 * @see org.civitas.pipeline.DataSink#getInputs
	 * @model opposite="inputs" required="true"
	 *        extendedMetaData="name='forward.topics'"
	 * @generated
	 */
	EList<DataSink> getOutputs();

} // DataSource
