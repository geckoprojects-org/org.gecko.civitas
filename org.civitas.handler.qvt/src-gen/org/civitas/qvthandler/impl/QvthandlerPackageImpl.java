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
package org.civitas.qvthandler.impl;

import org.civitas.osgi.component.ComponentConfigPackage;

import org.civitas.pipeline.PipelinePackage;

import org.civitas.qvthandler.QVTHandlerConfig;
import org.civitas.qvthandler.QvthandlerFactory;
import org.civitas.qvthandler.QvthandlerPackage;

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
public class QvthandlerPackageImpl extends EPackageImpl implements QvthandlerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qvtHandlerConfigEClass = null;

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
	 * @see org.civitas.qvthandler.QvthandlerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QvthandlerPackageImpl() {
		super(eNS_URI, QvthandlerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QvthandlerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QvthandlerPackage init() {
		if (isInited) return (QvthandlerPackage)EPackage.Registry.INSTANCE.getEPackage(QvthandlerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQvthandlerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QvthandlerPackageImpl theQvthandlerPackage = registeredQvthandlerPackage instanceof QvthandlerPackageImpl ? (QvthandlerPackageImpl)registeredQvthandlerPackage : new QvthandlerPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ComponentConfigPackage.eINSTANCE.eClass();
		PipelinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQvthandlerPackage.createPackageContents();

		// Initialize created meta-data
		theQvthandlerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQvthandlerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QvthandlerPackage.eNS_URI, theQvthandlerPackage);
		return theQvthandlerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQVTHandlerConfig() {
		return qvtHandlerConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQVTHandlerConfig_Trafo() {
		return (EAttribute)qvtHandlerConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQVTHandlerConfig_Eclassuri() {
		return (EReference)qvtHandlerConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QvthandlerFactory getQvthandlerFactory() {
		return (QvthandlerFactory)getEFactoryInstance();
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
		qvtHandlerConfigEClass = createEClass(QVT_HANDLER_CONFIG);
		createEAttribute(qvtHandlerConfigEClass, QVT_HANDLER_CONFIG__TRAFO);
		createEReference(qvtHandlerConfigEClass, QVT_HANDLER_CONFIG__ECLASSURI);
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
		qvtHandlerConfigEClass.getESuperTypes().add(theComponentConfigPackage.getConfiguration());
		qvtHandlerConfigEClass.getESuperTypes().add(thePipelinePackage.getHandler());

		// Initialize classes, features, and operations; add parameters
		initEClass(qvtHandlerConfigEClass, QVTHandlerConfig.class, "QVTHandlerConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQVTHandlerConfig_Trafo(), ecorePackage.getEString(), "trafo", null, 0, 1, QVTHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQVTHandlerConfig_Eclassuri(), ecorePackage.getEClass(), null, "eclassuri", null, 0, 1, QVTHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getQVTHandlerConfig_Trafo(),
		   source,
		   new String[] {
			   "name", "trafo.target"
		   });
	}

} //QvthandlerPackageImpl
