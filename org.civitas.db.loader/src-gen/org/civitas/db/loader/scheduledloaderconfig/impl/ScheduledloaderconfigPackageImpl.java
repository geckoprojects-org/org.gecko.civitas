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

import org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig;
import org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigFactory;
import org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigPackage;

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
public class ScheduledloaderconfigPackageImpl extends EPackageImpl implements ScheduledloaderconfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduledLoaderConfigEClass = null;

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
	 * @see org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScheduledloaderconfigPackageImpl() {
		super(eNS_URI, ScheduledloaderconfigFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ScheduledloaderconfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScheduledloaderconfigPackage init() {
		if (isInited) return (ScheduledloaderconfigPackage)EPackage.Registry.INSTANCE.getEPackage(ScheduledloaderconfigPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredScheduledloaderconfigPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ScheduledloaderconfigPackageImpl theScheduledloaderconfigPackage = registeredScheduledloaderconfigPackage instanceof ScheduledloaderconfigPackageImpl ? (ScheduledloaderconfigPackageImpl)registeredScheduledloaderconfigPackage : new ScheduledloaderconfigPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ComponentConfigPackage.eINSTANCE.eClass();
		PipelinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theScheduledloaderconfigPackage.createPackageContents();

		// Initialize created meta-data
		theScheduledloaderconfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScheduledloaderconfigPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScheduledloaderconfigPackage.eNS_URI, theScheduledloaderconfigPackage);
		return theScheduledloaderconfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScheduledLoaderConfig() {
		return scheduledLoaderConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduledLoaderConfig_ScheduleInterval() {
		return (EAttribute)scheduledLoaderConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduledLoaderConfig_QueryLimit() {
		return (EAttribute)scheduledLoaderConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduledLoaderConfig_InitialQuerySkip() {
		return (EAttribute)scheduledLoaderConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduledLoaderConfig_EnablePaging() {
		return (EAttribute)scheduledLoaderConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduledLoaderConfig_RepoTarget() {
		return (EAttribute)scheduledLoaderConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduledLoaderConfig_LoaderName() {
		return (EAttribute)scheduledLoaderConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScheduledLoaderConfig_Package() {
		return (EReference)scheduledLoaderConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScheduledLoaderConfig_Eclass() {
		return (EReference)scheduledLoaderConfigEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScheduledloaderconfigFactory getScheduledloaderconfigFactory() {
		return (ScheduledloaderconfigFactory)getEFactoryInstance();
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
		scheduledLoaderConfigEClass = createEClass(SCHEDULED_LOADER_CONFIG);
		createEAttribute(scheduledLoaderConfigEClass, SCHEDULED_LOADER_CONFIG__SCHEDULE_INTERVAL);
		createEAttribute(scheduledLoaderConfigEClass, SCHEDULED_LOADER_CONFIG__QUERY_LIMIT);
		createEAttribute(scheduledLoaderConfigEClass, SCHEDULED_LOADER_CONFIG__INITIAL_QUERY_SKIP);
		createEAttribute(scheduledLoaderConfigEClass, SCHEDULED_LOADER_CONFIG__ENABLE_PAGING);
		createEAttribute(scheduledLoaderConfigEClass, SCHEDULED_LOADER_CONFIG__REPO_TARGET);
		createEAttribute(scheduledLoaderConfigEClass, SCHEDULED_LOADER_CONFIG__LOADER_NAME);
		createEReference(scheduledLoaderConfigEClass, SCHEDULED_LOADER_CONFIG__PACKAGE);
		createEReference(scheduledLoaderConfigEClass, SCHEDULED_LOADER_CONFIG__ECLASS);
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
		scheduledLoaderConfigEClass.getESuperTypes().add(theComponentConfigPackage.getConfiguration());
		scheduledLoaderConfigEClass.getESuperTypes().add(thePipelinePackage.getDataSource());

		// Initialize classes, features, and operations; add parameters
		initEClass(scheduledLoaderConfigEClass, ScheduledLoaderConfig.class, "ScheduledLoaderConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduledLoaderConfig_ScheduleInterval(), ecorePackage.getELong(), "scheduleInterval", "60", 1, 1, ScheduledLoaderConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduledLoaderConfig_QueryLimit(), ecorePackage.getELong(), "queryLimit", "1000", 1, 1, ScheduledLoaderConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduledLoaderConfig_InitialQuerySkip(), ecorePackage.getELong(), "initialQuerySkip", "0", 1, 1, ScheduledLoaderConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduledLoaderConfig_EnablePaging(), ecorePackage.getEBoolean(), "enablePaging", null, 0, 1, ScheduledLoaderConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduledLoaderConfig_RepoTarget(), ecorePackage.getEString(), "repoTarget", null, 1, 1, ScheduledLoaderConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduledLoaderConfig_LoaderName(), ecorePackage.getEString(), "loaderName", null, 1, 1, ScheduledLoaderConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduledLoaderConfig_Package(), ecorePackage.getEPackage(), null, "package", null, 0, 1, ScheduledLoaderConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduledLoaderConfig_Eclass(), ecorePackage.getEClass(), null, "eclass", null, 0, 1, ScheduledLoaderConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (getScheduledLoaderConfig_ScheduleInterval(),
		   source,
		   new String[] {
			   "name", "schedule.interval"
		   });
		addAnnotation
		  (getScheduledLoaderConfig_QueryLimit(),
		   source,
		   new String[] {
			   "name", "query.limit"
		   });
		addAnnotation
		  (getScheduledLoaderConfig_InitialQuerySkip(),
		   source,
		   new String[] {
			   "name", "initial.query.skip"
		   });
		addAnnotation
		  (getScheduledLoaderConfig_EnablePaging(),
		   source,
		   new String[] {
			   "name", "enable.paging"
		   });
		addAnnotation
		  (getScheduledLoaderConfig_RepoTarget(),
		   source,
		   new String[] {
			   "name", "repo.target"
		   });
		addAnnotation
		  (getScheduledLoaderConfig_LoaderName(),
		   source,
		   new String[] {
			   "name", "loader.name"
		   });
	}

} //ScheduledloaderconfigPackageImpl
