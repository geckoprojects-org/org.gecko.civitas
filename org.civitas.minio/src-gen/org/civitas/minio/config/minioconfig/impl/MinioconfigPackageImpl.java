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

import org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig;
import org.civitas.minio.config.minioconfig.MinIOClientConfig;
import org.civitas.minio.config.minioconfig.MinioconfigFactory;
import org.civitas.minio.config.minioconfig.MinioconfigPackage;

import org.civitas.osgi.component.ComponentConfigPackage;

import org.civitas.pipeline.PipelinePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MinioconfigPackageImpl extends EPackageImpl implements MinioconfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minIOClientConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minIOCSVDownloadServiceConfigEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.civitas.minio.config.minioconfig.MinioconfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MinioconfigPackageImpl() {
		super(eNS_URI, MinioconfigFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MinioconfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MinioconfigPackage init() {
		if (isInited) return (MinioconfigPackage)EPackage.Registry.INSTANCE.getEPackage(MinioconfigPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMinioconfigPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MinioconfigPackageImpl theMinioconfigPackage = registeredMinioconfigPackage instanceof MinioconfigPackageImpl ? (MinioconfigPackageImpl)registeredMinioconfigPackage : new MinioconfigPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ComponentConfigPackage.eINSTANCE.eClass();
		PipelinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMinioconfigPackage.createPackageContents();

		// Initialize created meta-data
		theMinioconfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMinioconfigPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MinioconfigPackage.eNS_URI, theMinioconfigPackage);
		return theMinioconfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMinIOClientConfig() {
		return minIOClientConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMinIOClientConfig_Endpoint() {
		return (EAttribute)minIOClientConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMinIOClientConfig_AccessKey() {
		return (EAttribute)minIOClientConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMinIOClientConfig_SecretKey() {
		return (EAttribute)minIOClientConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMinIOCSVDownloadServiceConfig() {
		return minIOCSVDownloadServiceConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMinIOCSVDownloadServiceConfig_Bucketname() {
		return (EAttribute)minIOCSVDownloadServiceConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMinIOCSVDownloadServiceConfig_Cron() {
		return (EAttribute)minIOCSVDownloadServiceConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMinIOCSVDownloadServiceConfig_ClientTarget() {
		return (EReference)minIOCSVDownloadServiceConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMinIOCSVDownloadServiceConfig_EClass() {
		return (EReference)minIOCSVDownloadServiceConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinioconfigFactory getMinioconfigFactory() {
		return (MinioconfigFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		minIOClientConfigEClass = createEClass(MIN_IO_CLIENT_CONFIG);
		createEAttribute(minIOClientConfigEClass, MIN_IO_CLIENT_CONFIG__ENDPOINT);
		createEAttribute(minIOClientConfigEClass, MIN_IO_CLIENT_CONFIG__ACCESS_KEY);
		createEAttribute(minIOClientConfigEClass, MIN_IO_CLIENT_CONFIG__SECRET_KEY);

		minIOCSVDownloadServiceConfigEClass = createEClass(MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG);
		createEAttribute(minIOCSVDownloadServiceConfigEClass, MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__BUCKETNAME);
		createEAttribute(minIOCSVDownloadServiceConfigEClass, MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CRON);
		createEReference(minIOCSVDownloadServiceConfigEClass, MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CLIENT_TARGET);
		createEReference(minIOCSVDownloadServiceConfigEClass, MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ECLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ComponentConfigPackage theComponentConfigPackage = (ComponentConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentConfigPackage.eNS_URI);
		PipelinePackage thePipelinePackage = (PipelinePackage)EPackage.Registry.INSTANCE.getEPackage(PipelinePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		minIOClientConfigEClass.getESuperTypes().add(theComponentConfigPackage.getConfiguration());
		minIOCSVDownloadServiceConfigEClass.getESuperTypes().add(theComponentConfigPackage.getConfiguration());
		minIOCSVDownloadServiceConfigEClass.getESuperTypes().add(thePipelinePackage.getDataSource());

		// Initialize classes, features, and operations; add parameters
		initEClass(minIOClientConfigEClass, MinIOClientConfig.class, "MinIOClientConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinIOClientConfig_Endpoint(), ecorePackage.getEString(), "endpoint", "http://localhost:9000", 1, 1, MinIOClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinIOClientConfig_AccessKey(), ecorePackage.getEString(), "accessKey", "minioadmin", 1, 1, MinIOClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinIOClientConfig_SecretKey(), ecorePackage.getEString(), "secretKey", "minioadmin", 1, 1, MinIOClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minIOCSVDownloadServiceConfigEClass, MinIOCSVDownloadServiceConfig.class, "MinIOCSVDownloadServiceConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinIOCSVDownloadServiceConfig_Bucketname(), ecorePackage.getEString(), "bucketname", null, 1, 1, MinIOCSVDownloadServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinIOCSVDownloadServiceConfig_Cron(), ecorePackage.getEString(), "cron", "", 0, 1, MinIOCSVDownloadServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMinIOCSVDownloadServiceConfig_ClientTarget(), this.getMinIOClientConfig(), null, "clientTarget", null, 0, 1, MinIOCSVDownloadServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMinIOCSVDownloadServiceConfig_EClass(), ecorePackage.getEClass(), null, "eClass", null, 0, 1, MinIOCSVDownloadServiceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.eclipse.org/emf/2002/ExtendedMetaData
		createExtendedMetaData_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (getMinIOClientConfig_AccessKey(),
		   source,
		   new String[] {
			   "name", "accessKey"
		   });
		addAnnotation
		  (getMinIOCSVDownloadServiceConfig_Bucketname(),
		   source,
		   new String[] {
			   "name", "bucketname",
			   "osgi.annotation.attribute", "bucketname",
			   "documentation", "Maps directly to OSGi Configuration Admin property \'bucketname\' (no underscore conversion needed)"
		   });
		addAnnotation
		  (getMinIOCSVDownloadServiceConfig_Cron(),
		   source,
		   new String[] {
			   "name", "cron",
			   "osgi.annotation.attribute", "cron",
			   "documentation", "Maps directly to OSGi Configuration Admin property \'cron\' (no underscore conversion needed)"
		   });
		addAnnotation
		  (getMinIOCSVDownloadServiceConfig_ClientTarget(),
		   source,
		   new String[] {
			   "name", "client.target",
			   "osgi.annotation.attribute", "client_target",
			   "documentation", "Maps to OSGi Configuration Admin property \'client.target\' from annotation attribute \'client_target\'"
		   });
		addAnnotation
		  (getMinIOCSVDownloadServiceConfig_EClass(),
		   source,
		   new String[] {
			   "name", "eClassUri",
			   "osgi.annotation.attribute", "eClassUri",
			   "documentation", "Maps directly to OSGi Configuration Admin property \'eClassUri\' (no underscore conversion needed)"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaData_1Annotations() {
		String source = "http://www.eclipse.org/emf/2002/ExtendedMetaData";
		addAnnotation
		  (getMinIOClientConfig_SecretKey(),
		   source,
		   new String[] {
			   "name", "secretKey"
		   });
	}

} //MinioconfigPackageImpl
