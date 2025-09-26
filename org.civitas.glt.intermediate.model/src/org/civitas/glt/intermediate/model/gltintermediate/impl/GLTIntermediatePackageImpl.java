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
package org.civitas.glt.intermediate.model.gltintermediate.impl;

import org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading;
import org.civitas.glt.intermediate.model.gltintermediate.GLTIntermediateFactory;
import org.civitas.glt.intermediate.model.gltintermediate.GLTIntermediatePackage;

import org.civitas.glt.model.glt.GLTPackage;

import org.civitas.glt.sensor.model.sensor.BuildingSensorPackage;

import org.civitas.units.model.units.UnitsPackage;

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
public class GLTIntermediatePackageImpl extends EPackageImpl implements GLTIntermediatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingSensorReadingEClass = null;

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
	 * @see org.civitas.glt.intermediate.model.gltintermediate.GLTIntermediatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GLTIntermediatePackageImpl() {
		super(eNS_URI, GLTIntermediateFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GLTIntermediatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GLTIntermediatePackage init() {
		if (isInited) return (GLTIntermediatePackage)EPackage.Registry.INSTANCE.getEPackage(GLTIntermediatePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGLTIntermediatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GLTIntermediatePackageImpl theGLTIntermediatePackage = registeredGLTIntermediatePackage instanceof GLTIntermediatePackageImpl ? (GLTIntermediatePackageImpl)registeredGLTIntermediatePackage : new GLTIntermediatePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BuildingSensorPackage.eINSTANCE.eClass();
		GLTPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGLTIntermediatePackage.createPackageContents();

		// Initialize created meta-data
		theGLTIntermediatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGLTIntermediatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GLTIntermediatePackage.eNS_URI, theGLTIntermediatePackage);
		return theGLTIntermediatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildingSensorReading() {
		return buildingSensorReadingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuildingSensorReading_BuildingId() {
		return (EAttribute)buildingSensorReadingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBuildingSensorReading_Building() {
		return (EReference)buildingSensorReadingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBuildingSensorReading_SensorReading() {
		return (EReference)buildingSensorReadingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GLTIntermediateFactory getGLTIntermediateFactory() {
		return (GLTIntermediateFactory)getEFactoryInstance();
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
		buildingSensorReadingEClass = createEClass(BUILDING_SENSOR_READING);
		createEAttribute(buildingSensorReadingEClass, BUILDING_SENSOR_READING__BUILDING_ID);
		createEReference(buildingSensorReadingEClass, BUILDING_SENSOR_READING__BUILDING);
		createEReference(buildingSensorReadingEClass, BUILDING_SENSOR_READING__SENSOR_READING);
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
		GLTPackage theGLTPackage = (GLTPackage)EPackage.Registry.INSTANCE.getEPackage(GLTPackage.eNS_URI);
		BuildingSensorPackage theBuildingSensorPackage = (BuildingSensorPackage)EPackage.Registry.INSTANCE.getEPackage(BuildingSensorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(buildingSensorReadingEClass, BuildingSensorReading.class, "BuildingSensorReading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuildingSensorReading_BuildingId(), ecorePackage.getEString(), "buildingId", null, 0, 1, BuildingSensorReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildingSensorReading_Building(), theGLTPackage.getBuilding(), null, "building", null, 0, 1, BuildingSensorReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildingSensorReading_SensorReading(), theBuildingSensorPackage.getSensorReading(), null, "sensorReading", null, 0, 1, BuildingSensorReading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "complianceLevel", "17.0",
			   "oSGiCompatible", "true",
			   "basePackage", "org.civitas.glt.intermediate.model",
			   "resource", "XMI"
		   });
	}

} //GLTIntermediatePackageImpl
