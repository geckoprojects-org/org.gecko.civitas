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

import org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig;
import org.civitas.handler.emf.attacher.emfattacherconfig.EmfattacherconfigFactory;
import org.civitas.handler.emf.attacher.emfattacherconfig.EmfattacherconfigPackage;

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
public class EmfattacherconfigPackageImpl extends EPackageImpl implements EmfattacherconfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfAttacherHandlerConfigEClass = null;

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
	 * @see org.civitas.handler.emf.attacher.emfattacherconfig.EmfattacherconfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmfattacherconfigPackageImpl() {
		super(eNS_URI, EmfattacherconfigFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EmfattacherconfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmfattacherconfigPackage init() {
		if (isInited) return (EmfattacherconfigPackage)EPackage.Registry.INSTANCE.getEPackage(EmfattacherconfigPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEmfattacherconfigPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EmfattacherconfigPackageImpl theEmfattacherconfigPackage = registeredEmfattacherconfigPackage instanceof EmfattacherconfigPackageImpl ? (EmfattacherconfigPackageImpl)registeredEmfattacherconfigPackage : new EmfattacherconfigPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ComponentConfigPackage.eINSTANCE.eClass();
		PipelinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEmfattacherconfigPackage.createPackageContents();

		// Initialize created meta-data
		theEmfattacherconfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmfattacherconfigPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmfattacherconfigPackage.eNS_URI, theEmfattacherconfigPackage);
		return theEmfattacherconfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEMFAttacherHandlerConfig() {
		return emfAttacherHandlerConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEMFAttacherHandlerConfig_RepoTarget() {
		return (EAttribute)emfAttacherHandlerConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEMFAttacherHandlerConfig_TargetEClassUri() {
		return (EReference)emfAttacherHandlerConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEMFAttacherHandlerConfig_IncomingEClassUri() {
		return (EReference)emfAttacherHandlerConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEMFAttacherHandlerConfig_TargetReferenceUri() {
		return (EReference)emfAttacherHandlerConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEMFAttacherHandlerConfig_ForeignKeyFeatureUri() {
		return (EReference)emfAttacherHandlerConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmfattacherconfigFactory getEmfattacherconfigFactory() {
		return (EmfattacherconfigFactory)getEFactoryInstance();
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
		emfAttacherHandlerConfigEClass = createEClass(EMF_ATTACHER_HANDLER_CONFIG);
		createEAttribute(emfAttacherHandlerConfigEClass, EMF_ATTACHER_HANDLER_CONFIG__REPO_TARGET);
		createEReference(emfAttacherHandlerConfigEClass, EMF_ATTACHER_HANDLER_CONFIG__TARGET_ECLASS_URI);
		createEReference(emfAttacherHandlerConfigEClass, EMF_ATTACHER_HANDLER_CONFIG__INCOMING_ECLASS_URI);
		createEReference(emfAttacherHandlerConfigEClass, EMF_ATTACHER_HANDLER_CONFIG__TARGET_REFERENCE_URI);
		createEReference(emfAttacherHandlerConfigEClass, EMF_ATTACHER_HANDLER_CONFIG__FOREIGN_KEY_FEATURE_URI);
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
		emfAttacherHandlerConfigEClass.getESuperTypes().add(theComponentConfigPackage.getConfiguration());
		emfAttacherHandlerConfigEClass.getESuperTypes().add(thePipelinePackage.getHandler());

		// Initialize classes, features, and operations; add parameters
		initEClass(emfAttacherHandlerConfigEClass, EMFAttacherHandlerConfig.class, "EMFAttacherHandlerConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMFAttacherHandlerConfig_RepoTarget(), ecorePackage.getEString(), "repoTarget", null, 1, 1, EMFAttacherHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFAttacherHandlerConfig_TargetEClassUri(), ecorePackage.getEClass(), null, "targetEClassUri", null, 0, 1, EMFAttacherHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFAttacherHandlerConfig_IncomingEClassUri(), ecorePackage.getEClass(), null, "incomingEClassUri", null, 0, 1, EMFAttacherHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFAttacherHandlerConfig_TargetReferenceUri(), ecorePackage.getEReference(), null, "targetReferenceUri", null, 0, 1, EMFAttacherHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFAttacherHandlerConfig_ForeignKeyFeatureUri(), ecorePackage.getEStructuralFeature(), null, "foreignKeyFeatureUri", null, 0, 1, EMFAttacherHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getEMFAttacherHandlerConfig_RepoTarget(),
		   source,
		   new String[] {
			   "name", "repo.target"
		   });
		addAnnotation
		  (getEMFAttacherHandlerConfig_TargetEClassUri(),
		   source,
		   new String[] {
			   "name", "target.eclassuri"
		   });
		addAnnotation
		  (getEMFAttacherHandlerConfig_IncomingEClassUri(),
		   source,
		   new String[] {
			   "name", "incoming.eclassuri"
		   });
		addAnnotation
		  (getEMFAttacherHandlerConfig_TargetReferenceUri(),
		   source,
		   new String[] {
			   "name", "target.reference.uri"
		   });
		addAnnotation
		  (getEMFAttacherHandlerConfig_ForeignKeyFeatureUri(),
		   source,
		   new String[] {
			   "name", "foreignKeyFeature.uri"
		   });
	}

} //EmfattacherconfigPackageImpl
