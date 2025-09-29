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

import org.civitas.osgi.component.Configuration;

import org.civitas.pipeline.DataSource;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Loader Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration for loading EObjects from EMF repository on a scheduled basis
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getScheduleInterval <em>Schedule Interval</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getQueryLimit <em>Query Limit</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getInitialQuerySkip <em>Initial Query Skip</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#isEnablePaging <em>Enable Paging</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getRepoTarget <em>Repo Target</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getLoaderName <em>Loader Name</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getPackage <em>Package</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getEclass <em>Eclass</em>}</li>
 * </ul>
 *
 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigPackage#getScheduledLoaderConfig()
 * @model
 * @generated
 */
@ProviderType
public interface ScheduledLoaderConfig extends Configuration, DataSource {
	/**
	 * Returns the value of the '<em><b>Schedule Interval</b></em>' attribute.
	 * The default value is <code>"60"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interval in seconds for loading data from database
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Interval</em>' attribute.
	 * @see #setScheduleInterval(long)
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigPackage#getScheduledLoaderConfig_ScheduleInterval()
	 * @model default="60" required="true"
	 *        extendedMetaData="name='schedule.interval'"
	 * @generated
	 */
	long getScheduleInterval();

	/**
	 * Sets the value of the '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getScheduleInterval <em>Schedule Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Interval</em>' attribute.
	 * @see #getScheduleInterval()
	 * @generated
	 */
	void setScheduleInterval(long value);

	/**
	 * Returns the value of the '<em><b>Query Limit</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of records to load per query
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query Limit</em>' attribute.
	 * @see #setQueryLimit(long)
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigPackage#getScheduledLoaderConfig_QueryLimit()
	 * @model default="1000" required="true"
	 *        extendedMetaData="name='query.limit'"
	 * @generated
	 */
	long getQueryLimit();

	/**
	 * Sets the value of the '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getQueryLimit <em>Query Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Limit</em>' attribute.
	 * @see #getQueryLimit()
	 * @generated
	 */
	void setQueryLimit(long value);

	/**
	 * Returns the value of the '<em><b>Initial Query Skip</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initial number of records to skip (starting point for pagination)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Query Skip</em>' attribute.
	 * @see #setInitialQuerySkip(long)
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigPackage#getScheduledLoaderConfig_InitialQuerySkip()
	 * @model default="0" required="true"
	 *        extendedMetaData="name='initial.query.skip'"
	 * @generated
	 */
	long getInitialQuerySkip();

	/**
	 * Sets the value of the '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getInitialQuerySkip <em>Initial Query Skip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Query Skip</em>' attribute.
	 * @see #getInitialQuerySkip()
	 * @generated
	 */
	void setInitialQuerySkip(long value);

	/**
	 * Returns the value of the '<em><b>Enable Paging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Paging</em>' attribute.
	 * @see #setEnablePaging(boolean)
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigPackage#getScheduledLoaderConfig_EnablePaging()
	 * @model extendedMetaData="name='enable.paging'"
	 * @generated
	 */
	boolean isEnablePaging();

	/**
	 * Sets the value of the '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#isEnablePaging <em>Enable Paging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Paging</em>' attribute.
	 * @see #isEnablePaging()
	 * @generated
	 */
	void setEnablePaging(boolean value);

	/**
	 * Returns the value of the '<em><b>Repo Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The repository ID to target for loading data (e.g., 'manualMeter', 'remoteMeter', 'manualReading')
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repo Target</em>' attribute.
	 * @see #setRepoTarget(String)
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigPackage#getScheduledLoaderConfig_RepoTarget()
	 * @model required="true"
	 *        extendedMetaData="name='repo.target'"
	 * @generated
	 */
	String getRepoTarget();

	/**
	 * Sets the value of the '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getRepoTarget <em>Repo Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repo Target</em>' attribute.
	 * @see #getRepoTarget()
	 * @generated
	 */
	void setRepoTarget(String value);

	/**
	 * Returns the value of the '<em><b>Loader Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive name for this loader instance (used in logging)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loader Name</em>' attribute.
	 * @see #setLoaderName(String)
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigPackage#getScheduledLoaderConfig_LoaderName()
	 * @model required="true"
	 *        extendedMetaData="name='loader.name'"
	 * @generated
	 */
	String getLoaderName();

	/**
	 * Sets the value of the '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getLoaderName <em>Loader Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loader Name</em>' attribute.
	 * @see #getLoaderName()
	 * @generated
	 */
	void setLoaderName(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(EPackage)
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigPackage#getScheduledLoaderConfig_Package()
	 * @model
	 * @generated
	 */
	EPackage getPackage();

	/**
	 * Sets the value of the '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(EPackage value);

	/**
	 * Returns the value of the '<em><b>Eclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eclass</em>' reference.
	 * @see #setEclass(EClass)
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigPackage#getScheduledLoaderConfig_Eclass()
	 * @model
	 * @generated
	 */
	EClass getEclass();

	/**
	 * Sets the value of the '{@link org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig#getEclass <em>Eclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eclass</em>' reference.
	 * @see #getEclass()
	 * @generated
	 */
	void setEclass(EClass value);

} // ScheduledLoaderConfig
