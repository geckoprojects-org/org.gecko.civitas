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

import org.civitas.osgi.component.Configuration;

import org.civitas.pipeline.DataSink;
import org.civitas.pipeline.DataSource;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Repository Data Sink Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration for EMF Repository Data Sink component that persists EObjects from event topics
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig#getRepoTarget <em>Repo Target</em>}</li>
 *   <li>{@link org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig#getMergeStrategy <em>Merge Strategy</em>}</li>
 *   <li>{@link org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig#isDetailedLogging <em>Detailed Logging</em>}</li>
 * </ul>
 *
 * @see org.civitas.datasinkconfig.DatasinkconfigPackage#getEMFRepositoryDataSinkConfig()
 * @model
 * @generated
 */
@ProviderType
public interface EMFRepositoryDataSinkConfig extends Configuration, DataSink, DataSource {
	/**
	 * Returns the value of the '<em><b>Repo Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OSGi filter to target the specific EMF Repository instance (e.g., '(repository.name=meter-repository)')
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repo Target</em>' attribute.
	 * @see #setRepoTarget(String)
	 * @see org.civitas.datasinkconfig.DatasinkconfigPackage#getEMFRepositoryDataSinkConfig_RepoTarget()
	 * @model required="true"
	 *        extendedMetaData="name='repo.target'"
	 * @generated
	 */
	String getRepoTarget();

	/**
	 * Sets the value of the '{@link org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig#getRepoTarget <em>Repo Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repo Target</em>' attribute.
	 * @see #getRepoTarget()
	 * @generated
	 */
	void setRepoTarget(String value);

	/**
	 * Returns the value of the '<em><b>Merge Strategy</b></em>' attribute.
	 * The default value is <code>"MERGE_INTO_IGNORE_UNSET"</code>.
	 * The literals are from the enumeration {@link org.civitas.datasinkconfig.MergeStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Strategy for handling existing objects in the repository
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merge Strategy</em>' attribute.
	 * @see org.civitas.datasinkconfig.MergeStrategy
	 * @see #setMergeStrategy(MergeStrategy)
	 * @see org.civitas.datasinkconfig.DatasinkconfigPackage#getEMFRepositoryDataSinkConfig_MergeStrategy()
	 * @model default="MERGE_INTO_IGNORE_UNSET"
	 *        extendedMetaData="name='merger.strategy'"
	 * @generated
	 */
	MergeStrategy getMergeStrategy();

	/**
	 * Sets the value of the '{@link org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig#getMergeStrategy <em>Merge Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Strategy</em>' attribute.
	 * @see org.civitas.datasinkconfig.MergeStrategy
	 * @see #getMergeStrategy()
	 * @generated
	 */
	void setMergeStrategy(MergeStrategy value);

	/**
	 * Returns the value of the '<em><b>Detailed Logging</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enable detailed logging for debugging and monitoring purposes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detailed Logging</em>' attribute.
	 * @see #setDetailedLogging(boolean)
	 * @see org.civitas.datasinkconfig.DatasinkconfigPackage#getEMFRepositoryDataSinkConfig_DetailedLogging()
	 * @model default="false"
	 *        extendedMetaData="name='detailed.logging'"
	 * @generated
	 */
	boolean isDetailedLogging();

	/**
	 * Sets the value of the '{@link org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig#isDetailedLogging <em>Detailed Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detailed Logging</em>' attribute.
	 * @see #isDetailedLogging()
	 * @generated
	 */
	void setDetailedLogging(boolean value);

} // EMFRepositoryDataSinkConfig
