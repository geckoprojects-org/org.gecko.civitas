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
package org.civitas.minio.config.minioconfig.impl;

import org.civitas.minio.config.minioconfig.*;

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
public class MinioconfigFactoryImpl extends EFactoryImpl implements MinioconfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MinioconfigFactory init() {
		try {
			MinioconfigFactory theMinioconfigFactory = (MinioconfigFactory)EPackage.Registry.INSTANCE.getEFactory(MinioconfigPackage.eNS_URI);
			if (theMinioconfigFactory != null) {
				return theMinioconfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MinioconfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinioconfigFactoryImpl() {
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
			case MinioconfigPackage.MIN_IO_CLIENT_CONFIG: return createMinIOClientConfig();
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG: return createMinIOCSVDownloadServiceConfig();
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
	public MinIOClientConfig createMinIOClientConfig() {
		MinIOClientConfigImpl minIOClientConfig = new MinIOClientConfigImpl();
		return minIOClientConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinIOCSVDownloadServiceConfig createMinIOCSVDownloadServiceConfig() {
		MinIOCSVDownloadServiceConfigImpl minIOCSVDownloadServiceConfig = new MinIOCSVDownloadServiceConfigImpl();
		return minIOCSVDownloadServiceConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinioconfigPackage getMinioconfigPackage() {
		return (MinioconfigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MinioconfigPackage getPackage() {
		return MinioconfigPackage.eINSTANCE;
	}

} //MinioconfigFactoryImpl
