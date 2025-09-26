/*
 * Copyright (c) 2012 - 2025 Data In Motion and others....
 */
package org.civitas.glt.intermediate.model.gltintermediate;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.civitas.glt.intermediate.model.gltintermediate.GLTIntermediateFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel complianceLevel='17.0' oSGiCompatible='true' basePackage='org.civitas.glt.intermediate.model' resource='XMI'"
 * @generated
 */
@ProviderType
@EPackage(uri = GLTIntermediatePackage.eNS_URI, genModel = "/model/glt-intermediate.genmodel", genModelSourceLocations = {"model/glt-intermediate.genmodel","org.civitas.glt.intermediate.model/model/glt-intermediate.genmodel"}, ecore="/model/glt-intermediate.ecore", ecoreSourceLocations="/model/glt-intermediate.ecore")
public interface GLTIntermediatePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gltintermediate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://civitas.org/glt/intermediate/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gltintermediate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GLTIntermediatePackage eINSTANCE = org.civitas.glt.intermediate.model.gltintermediate.impl.GLTIntermediatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.civitas.glt.intermediate.model.gltintermediate.impl.BuildingSensorReadingImpl <em>Building Sensor Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.glt.intermediate.model.gltintermediate.impl.BuildingSensorReadingImpl
	 * @see org.civitas.glt.intermediate.model.gltintermediate.impl.GLTIntermediatePackageImpl#getBuildingSensorReading()
	 * @generated
	 */
	int BUILDING_SENSOR_READING = 0;

	/**
	 * The feature id for the '<em><b>Building Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_SENSOR_READING__BUILDING_ID = 0;

	/**
	 * The feature id for the '<em><b>Building</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_SENSOR_READING__BUILDING = 1;

	/**
	 * The feature id for the '<em><b>Sensor Reading</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_SENSOR_READING__SENSOR_READING = 2;

	/**
	 * The number of structural features of the '<em>Building Sensor Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_SENSOR_READING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Building Sensor Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_SENSOR_READING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading <em>Building Sensor Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building Sensor Reading</em>'.
	 * @see org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading
	 * @generated
	 */
	EClass getBuildingSensorReading();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading#getBuildingId <em>Building Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Id</em>'.
	 * @see org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading#getBuildingId()
	 * @see #getBuildingSensorReading()
	 * @generated
	 */
	EAttribute getBuildingSensorReading_BuildingId();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading#getBuilding <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Building</em>'.
	 * @see org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading#getBuilding()
	 * @see #getBuildingSensorReading()
	 * @generated
	 */
	EReference getBuildingSensorReading_Building();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading#getSensorReading <em>Sensor Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor Reading</em>'.
	 * @see org.civitas.glt.intermediate.model.gltintermediate.BuildingSensorReading#getSensorReading()
	 * @see #getBuildingSensorReading()
	 * @generated
	 */
	EReference getBuildingSensorReading_SensorReading();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GLTIntermediateFactory getGLTIntermediateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.civitas.glt.intermediate.model.gltintermediate.impl.BuildingSensorReadingImpl <em>Building Sensor Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.glt.intermediate.model.gltintermediate.impl.BuildingSensorReadingImpl
		 * @see org.civitas.glt.intermediate.model.gltintermediate.impl.GLTIntermediatePackageImpl#getBuildingSensorReading()
		 * @generated
		 */
		EClass BUILDING_SENSOR_READING = eINSTANCE.getBuildingSensorReading();

		/**
		 * The meta object literal for the '<em><b>Building Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING_SENSOR_READING__BUILDING_ID = eINSTANCE.getBuildingSensorReading_BuildingId();

		/**
		 * The meta object literal for the '<em><b>Building</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_SENSOR_READING__BUILDING = eINSTANCE.getBuildingSensorReading_Building();

		/**
		 * The meta object literal for the '<em><b>Sensor Reading</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_SENSOR_READING__SENSOR_READING = eINSTANCE.getBuildingSensorReading_SensorReading();

	}

} //GLTIntermediatePackage
