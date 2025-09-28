/**
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
package org.civitas.db.loader.scheduledloaderconfig.impl;

import org.civitas.db.loader.scheduledloaderconfig.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScheduledloaderconfigFactoryImpl extends EFactoryImpl implements ScheduledloaderconfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScheduledloaderconfigFactory init() {
		try {
			ScheduledloaderconfigFactory theScheduledloaderconfigFactory = (ScheduledloaderconfigFactory)EPackage.Registry.INSTANCE.getEFactory(ScheduledloaderconfigPackage.eNS_URI);
			if (theScheduledloaderconfigFactory != null) {
				return theScheduledloaderconfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScheduledloaderconfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledloaderconfigFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG: return createScheduledLoaderConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScheduledLoaderConfig createScheduledLoaderConfig() {
		ScheduledLoaderConfigImpl scheduledLoaderConfig = new ScheduledLoaderConfigImpl();
		return scheduledLoaderConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScheduledloaderconfigPackage getScheduledloaderconfigPackage() {
		return (ScheduledloaderconfigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScheduledloaderconfigPackage getPackage() {
		return ScheduledloaderconfigPackage.eINSTANCE;
	}

} //ScheduledloaderconfigFactoryImpl
