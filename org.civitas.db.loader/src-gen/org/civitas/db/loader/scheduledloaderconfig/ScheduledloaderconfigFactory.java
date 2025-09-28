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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigPackage
 * @generated
 */
@ProviderType
public interface ScheduledloaderconfigFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScheduledloaderconfigFactory eINSTANCE = org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledloaderconfigFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scheduled Loader Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduled Loader Config</em>'.
	 * @generated
	 */
	ScheduledLoaderConfig createScheduledLoaderConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScheduledloaderconfigPackage getScheduledloaderconfigPackage();

} //ScheduledloaderconfigFactory
