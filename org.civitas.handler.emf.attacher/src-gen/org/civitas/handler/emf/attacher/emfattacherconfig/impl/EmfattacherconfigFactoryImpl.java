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
package org.civitas.handler.emf.attacher.emfattacherconfig.impl;

import org.civitas.handler.emf.attacher.emfattacherconfig.*;

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
public class EmfattacherconfigFactoryImpl extends EFactoryImpl implements EmfattacherconfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmfattacherconfigFactory init() {
		try {
			EmfattacherconfigFactory theEmfattacherconfigFactory = (EmfattacherconfigFactory)EPackage.Registry.INSTANCE.getEFactory(EmfattacherconfigPackage.eNS_URI);
			if (theEmfattacherconfigFactory != null) {
				return theEmfattacherconfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmfattacherconfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfattacherconfigFactoryImpl() {
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
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG: return createEMFAttacherHandlerConfig();
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
	public EMFAttacherHandlerConfig createEMFAttacherHandlerConfig() {
		EMFAttacherHandlerConfigImpl emfAttacherHandlerConfig = new EMFAttacherHandlerConfigImpl();
		return emfAttacherHandlerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmfattacherconfigPackage getEmfattacherconfigPackage() {
		return (EmfattacherconfigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmfattacherconfigPackage getPackage() {
		return EmfattacherconfigPackage.eINSTANCE;
	}

} //EmfattacherconfigFactoryImpl
