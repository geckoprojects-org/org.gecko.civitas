/*
 */
package org.civitas.glt.sensor.model.sensor;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

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
 * @see org.civitas.glt.sensor.model.sensor.BuildingSensorFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = BuildingSensorPackage.eNS_URI, genModel = "/model/building_sensor.genmodel", genModelSourceLocations = {"model/building_sensor.genmodel","org.civitas.glt.sensor.model/model/building_sensor.genmodel"}, ecore="/model/building_sensor.ecore", ecoreSourceLocations="/model/building_sensor.ecore")
public interface BuildingSensorPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sensor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://models.civitas.org/models/building/sensor/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "building_sensor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuildingSensorPackage eINSTANCE = org.civitas.glt.sensor.model.sensor.impl.BuildingSensorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.civitas.glt.sensor.model.sensor.impl.SensorReadingImpl <em>Sensor Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.glt.sensor.model.sensor.impl.SensorReadingImpl
	 * @see org.civitas.glt.sensor.model.sensor.impl.BuildingSensorPackageImpl#getSensorReading()
	 * @generated
	 */
	int SENSOR_READING = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Building Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__BUILDING_ID = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Sensor Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sensor Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.civitas.glt.sensor.model.sensor.SensorReading <em>Sensor Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Reading</em>'.
	 * @see org.civitas.glt.sensor.model.sensor.SensorReading
	 * @generated
	 */
	EClass getSensorReading();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.glt.sensor.model.sensor.SensorReading#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.civitas.glt.sensor.model.sensor.SensorReading#getTimestamp()
	 * @see #getSensorReading()
	 * @generated
	 */
	EAttribute getSensorReading_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.glt.sensor.model.sensor.SensorReading#getBuildingId <em>Building Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Id</em>'.
	 * @see org.civitas.glt.sensor.model.sensor.SensorReading#getBuildingId()
	 * @see #getSensorReading()
	 * @generated
	 */
	EAttribute getSensorReading_BuildingId();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.glt.sensor.model.sensor.SensorReading#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.civitas.glt.sensor.model.sensor.SensorReading#getValue()
	 * @see #getSensorReading()
	 * @generated
	 */
	EAttribute getSensorReading_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BuildingSensorFactory getBuildingSensorFactory();

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
		 * The meta object literal for the '{@link org.civitas.glt.sensor.model.sensor.impl.SensorReadingImpl <em>Sensor Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.glt.sensor.model.sensor.impl.SensorReadingImpl
		 * @see org.civitas.glt.sensor.model.sensor.impl.BuildingSensorPackageImpl#getSensorReading()
		 * @generated
		 */
		EClass SENSOR_READING = eINSTANCE.getSensorReading();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_READING__TIMESTAMP = eINSTANCE.getSensorReading_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Building Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_READING__BUILDING_ID = eINSTANCE.getSensorReading_BuildingId();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_READING__VALUE = eINSTANCE.getSensorReading_Value();

	}

} //BuildingSensorPackage
