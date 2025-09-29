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
package org.civitas.datasinkconfig.impl;

import org.civitas.datasinkconfig.DatasinkconfigFactory;
import org.civitas.datasinkconfig.DatasinkconfigPackage;
import org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig;
import org.civitas.datasinkconfig.MergeStrategy;

import org.civitas.osgi.component.ComponentConfigPackage;

import org.civitas.pipeline.PipelinePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasinkconfigPackageImpl extends EPackageImpl implements DatasinkconfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfRepositoryDataSinkConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mergeStrategyEEnum = null;

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
	 * @see org.civitas.datasinkconfig.DatasinkconfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatasinkconfigPackageImpl() {
		super(eNS_URI, DatasinkconfigFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatasinkconfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatasinkconfigPackage init() {
		if (isInited) return (DatasinkconfigPackage)EPackage.Registry.INSTANCE.getEPackage(DatasinkconfigPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDatasinkconfigPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DatasinkconfigPackageImpl theDatasinkconfigPackage = registeredDatasinkconfigPackage instanceof DatasinkconfigPackageImpl ? (DatasinkconfigPackageImpl)registeredDatasinkconfigPackage : new DatasinkconfigPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ComponentConfigPackage.eINSTANCE.eClass();
		PipelinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDatasinkconfigPackage.createPackageContents();

		// Initialize created meta-data
		theDatasinkconfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatasinkconfigPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatasinkconfigPackage.eNS_URI, theDatasinkconfigPackage);
		return theDatasinkconfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEMFRepositoryDataSinkConfig() {
		return emfRepositoryDataSinkConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEMFRepositoryDataSinkConfig_RepoTarget() {
		return (EAttribute)emfRepositoryDataSinkConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEMFRepositoryDataSinkConfig_MergeStrategy() {
		return (EAttribute)emfRepositoryDataSinkConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEMFRepositoryDataSinkConfig_DetailedLogging() {
		return (EAttribute)emfRepositoryDataSinkConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMergeStrategy() {
		return mergeStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasinkconfigFactory getDatasinkconfigFactory() {
		return (DatasinkconfigFactory)getEFactoryInstance();
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
		emfRepositoryDataSinkConfigEClass = createEClass(EMF_REPOSITORY_DATA_SINK_CONFIG);
		createEAttribute(emfRepositoryDataSinkConfigEClass, EMF_REPOSITORY_DATA_SINK_CONFIG__REPO_TARGET);
		createEAttribute(emfRepositoryDataSinkConfigEClass, EMF_REPOSITORY_DATA_SINK_CONFIG__MERGE_STRATEGY);
		createEAttribute(emfRepositoryDataSinkConfigEClass, EMF_REPOSITORY_DATA_SINK_CONFIG__DETAILED_LOGGING);

		// Create enums
		mergeStrategyEEnum = createEEnum(MERGE_STRATEGY);
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
		emfRepositoryDataSinkConfigEClass.getESuperTypes().add(theComponentConfigPackage.getConfiguration());
		emfRepositoryDataSinkConfigEClass.getESuperTypes().add(thePipelinePackage.getDataSink());
		emfRepositoryDataSinkConfigEClass.getESuperTypes().add(thePipelinePackage.getDataSource());

		// Initialize classes, features, and operations; add parameters
		initEClass(emfRepositoryDataSinkConfigEClass, EMFRepositoryDataSinkConfig.class, "EMFRepositoryDataSinkConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMFRepositoryDataSinkConfig_RepoTarget(), ecorePackage.getEString(), "repoTarget", null, 1, 1, EMFRepositoryDataSinkConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFRepositoryDataSinkConfig_MergeStrategy(), this.getMergeStrategy(), "mergeStrategy", "MERGE_INTO_IGNORE_UNSET", 0, 1, EMFRepositoryDataSinkConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFRepositoryDataSinkConfig_DetailedLogging(), ecorePackage.getEBoolean(), "detailedLogging", "false", 0, 1, EMFRepositoryDataSinkConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mergeStrategyEEnum, MergeStrategy.class, "MergeStrategy");
		addEEnumLiteral(mergeStrategyEEnum, MergeStrategy.OVERWRITE);
		addEEnumLiteral(mergeStrategyEEnum, MergeStrategy.MERGE_INTO_IGNORE_UNSET);

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
		  (getEMFRepositoryDataSinkConfig_RepoTarget(),
		   source,
		   new String[] {
			   "name", "repo.target"
		   });
		addAnnotation
		  (getEMFRepositoryDataSinkConfig_MergeStrategy(),
		   source,
		   new String[] {
			   "name", "merger.strategy"
		   });
		addAnnotation
		  (getEMFRepositoryDataSinkConfig_DetailedLogging(),
		   source,
		   new String[] {
			   "name", "detailed.logging"
		   });
	}

} //DatasinkconfigPackageImpl
