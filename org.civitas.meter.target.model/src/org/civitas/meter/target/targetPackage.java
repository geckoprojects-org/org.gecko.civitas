/*
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
package org.civitas.meter.target;


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
 * @see org.civitas.meter.target.targetFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 * @generated
 */
@ProviderType
@EPackage(uri = targetPackage.eNS_URI, genModel = "/model/meter-target.genmodel", genModelSourceLocations = {"model/meter-target.genmodel","org.civitas.meter.target.model/model/meter-target.genmodel"}, ecore="/model/meter-target.ecore", ecoreSourceLocations="/model/meter-target.ecore")
public interface targetPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "target";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://civitas.org/meter/target/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "target";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	targetPackage eINSTANCE = org.civitas.meter.target.impl.targetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.civitas.meter.target.impl.PlantImpl <em>Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.meter.target.impl.PlantImpl
	 * @see org.civitas.meter.target.impl.targetPackageImpl#getPlant()
	 * @generated
	 */
	int PLANT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__ID = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__CITY = 2;

	/**
	 * The feature id for the '<em><b>Postalcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__POSTALCODE = 3;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__STREET = 4;

	/**
	 * The feature id for the '<em><b>House Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__HOUSE_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__NET = 6;

	/**
	 * The feature id for the '<em><b>Operating Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__OPERATING_DATA = 7;

	/**
	 * The feature id for the '<em><b>Metering Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__METERING_POINTS = 8;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__PARTS = 9;

	/**
	 * The number of structural features of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.civitas.meter.target.impl.NetImpl <em>Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.meter.target.impl.NetImpl
	 * @see org.civitas.meter.target.impl.targetPackageImpl#getNet()
	 * @generated
	 */
	int NET = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__ID = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.civitas.meter.target.impl.PartsImpl <em>Parts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.meter.target.impl.PartsImpl
	 * @see org.civitas.meter.target.impl.targetPackageImpl#getParts()
	 * @generated
	 */
	int PARTS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTS__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTS__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTS__PERFORMANCE = 2;

	/**
	 * The feature id for the '<em><b>Construction Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTS__CONSTRUCTION_YEAR = 3;

	/**
	 * The feature id for the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTS__PLANT = 4;

	/**
	 * The number of structural features of the '<em>Parts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Parts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.civitas.meter.target.impl.OperatingDataImpl <em>Operating Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.meter.target.impl.OperatingDataImpl
	 * @see org.civitas.meter.target.impl.targetPackageImpl#getOperatingData()
	 * @generated
	 */
	int OPERATING_DATA = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_DATA__ID = 0;

	/**
	 * The feature id for the '<em><b>Operating Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_DATA__OPERATING_HOURS = 1;

	/**
	 * The feature id for the '<em><b>Starts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_DATA__STARTS = 2;

	/**
	 * The feature id for the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_DATA__PLANT = 3;

	/**
	 * The number of structural features of the '<em>Operating Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_DATA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Operating Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.civitas.meter.target.impl.MeteringPointImpl <em>Metering Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.meter.target.impl.MeteringPointImpl
	 * @see org.civitas.meter.target.impl.targetPackageImpl#getMeteringPoint()
	 * @generated
	 */
	int METERING_POINT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT__PLANT = 1;

	/**
	 * The feature id for the '<em><b>Current Meter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT__CURRENT_METER = 2;

	/**
	 * The feature id for the '<em><b>Meter Readings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT__METER_READINGS = 3;

	/**
	 * The feature id for the '<em><b>Meter History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT__METER_HISTORY = 4;

	/**
	 * The number of structural features of the '<em>Metering Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Metering Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.civitas.meter.target.impl.MeterImpl <em>Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.meter.target.impl.MeterImpl
	 * @see org.civitas.meter.target.impl.targetPackageImpl#getMeter()
	 * @generated
	 */
	int METER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__ID = 0;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__SERIAL_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.civitas.meter.target.impl.MeterReadingImpl <em>Meter Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.meter.target.impl.MeterReadingImpl
	 * @see org.civitas.meter.target.impl.targetPackageImpl#getMeterReading()
	 * @generated
	 */
	int METER_READING = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__ID = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Metering Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__METERING_POINT = 3;

	/**
	 * The number of structural features of the '<em>Meter Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Meter Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.civitas.meter.target.impl.MeterHistoryImpl <em>Meter History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.meter.target.impl.MeterHistoryImpl
	 * @see org.civitas.meter.target.impl.targetPackageImpl#getMeterHistory()
	 * @generated
	 */
	int METER_HISTORY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_HISTORY__ID = 0;

	/**
	 * The feature id for the '<em><b>Removal Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_HISTORY__REMOVAL_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_HISTORY__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Meter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_HISTORY__METER = 3;

	/**
	 * The feature id for the '<em><b>Metering Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_HISTORY__METERING_POINT = 4;

	/**
	 * The number of structural features of the '<em>Meter History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_HISTORY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Meter History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_HISTORY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.civitas.meter.target.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant</em>'.
	 * @see org.civitas.meter.target.Plant
	 * @generated
	 */
	EClass getPlant();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.Plant#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.civitas.meter.target.Plant#getId()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.Plant#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.civitas.meter.target.Plant#getNumber()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.Plant#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.civitas.meter.target.Plant#getCity()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_City();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.Plant#getPostalcode <em>Postalcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postalcode</em>'.
	 * @see org.civitas.meter.target.Plant#getPostalcode()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_Postalcode();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.Plant#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.civitas.meter.target.Plant#getStreet()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_Street();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.Plant#getHouseNumber <em>House Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>House Number</em>'.
	 * @see org.civitas.meter.target.Plant#getHouseNumber()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_HouseNumber();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.meter.target.Plant#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Net</em>'.
	 * @see org.civitas.meter.target.Plant#getNet()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Net();

	/**
	 * Returns the meta object for the containment reference list '{@link org.civitas.meter.target.Plant#getOperatingData <em>Operating Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operating Data</em>'.
	 * @see org.civitas.meter.target.Plant#getOperatingData()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_OperatingData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.civitas.meter.target.Plant#getMeteringPoints <em>Metering Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metering Points</em>'.
	 * @see org.civitas.meter.target.Plant#getMeteringPoints()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_MeteringPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.civitas.meter.target.Plant#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.civitas.meter.target.Plant#getParts()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Parts();

	/**
	 * Returns the meta object for class '{@link org.civitas.meter.target.Net <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net</em>'.
	 * @see org.civitas.meter.target.Net
	 * @generated
	 */
	EClass getNet();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.Net#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.civitas.meter.target.Net#getId()
	 * @see #getNet()
	 * @generated
	 */
	EAttribute getNet_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.Net#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.civitas.meter.target.Net#getNumber()
	 * @see #getNet()
	 * @generated
	 */
	EAttribute getNet_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.Net#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.civitas.meter.target.Net#getDescription()
	 * @see #getNet()
	 * @generated
	 */
	EAttribute getNet_Description();

	/**
	 * Returns the meta object for class '{@link org.civitas.meter.target.Parts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parts</em>'.
	 * @see org.civitas.meter.target.Parts
	 * @generated
	 */
	EClass getParts();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.Parts#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.civitas.meter.target.Parts#getId()
	 * @see #getParts()
	 * @generated
	 */
	EAttribute getParts_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.Parts#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.civitas.meter.target.Parts#getType()
	 * @see #getParts()
	 * @generated
	 */
	EAttribute getParts_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.Parts#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance</em>'.
	 * @see org.civitas.meter.target.Parts#getPerformance()
	 * @see #getParts()
	 * @generated
	 */
	EAttribute getParts_Performance();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.Parts#getConstructionYear <em>Construction Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Construction Year</em>'.
	 * @see org.civitas.meter.target.Parts#getConstructionYear()
	 * @see #getParts()
	 * @generated
	 */
	EAttribute getParts_ConstructionYear();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.meter.target.Parts#getPlant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plant</em>'.
	 * @see org.civitas.meter.target.Parts#getPlant()
	 * @see #getParts()
	 * @generated
	 */
	EReference getParts_Plant();

	/**
	 * Returns the meta object for class '{@link org.civitas.meter.target.OperatingData <em>Operating Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating Data</em>'.
	 * @see org.civitas.meter.target.OperatingData
	 * @generated
	 */
	EClass getOperatingData();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.OperatingData#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.civitas.meter.target.OperatingData#getId()
	 * @see #getOperatingData()
	 * @generated
	 */
	EAttribute getOperatingData_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.OperatingData#getOperatingHours <em>Operating Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating Hours</em>'.
	 * @see org.civitas.meter.target.OperatingData#getOperatingHours()
	 * @see #getOperatingData()
	 * @generated
	 */
	EAttribute getOperatingData_OperatingHours();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.OperatingData#getStarts <em>Starts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starts</em>'.
	 * @see org.civitas.meter.target.OperatingData#getStarts()
	 * @see #getOperatingData()
	 * @generated
	 */
	EAttribute getOperatingData_Starts();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.meter.target.OperatingData#getPlant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plant</em>'.
	 * @see org.civitas.meter.target.OperatingData#getPlant()
	 * @see #getOperatingData()
	 * @generated
	 */
	EReference getOperatingData_Plant();

	/**
	 * Returns the meta object for class '{@link org.civitas.meter.target.MeteringPoint <em>Metering Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metering Point</em>'.
	 * @see org.civitas.meter.target.MeteringPoint
	 * @generated
	 */
	EClass getMeteringPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.MeteringPoint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.civitas.meter.target.MeteringPoint#getId()
	 * @see #getMeteringPoint()
	 * @generated
	 */
	EAttribute getMeteringPoint_Id();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.meter.target.MeteringPoint#getPlant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plant</em>'.
	 * @see org.civitas.meter.target.MeteringPoint#getPlant()
	 * @see #getMeteringPoint()
	 * @generated
	 */
	EReference getMeteringPoint_Plant();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.meter.target.MeteringPoint#getCurrentMeter <em>Current Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Meter</em>'.
	 * @see org.civitas.meter.target.MeteringPoint#getCurrentMeter()
	 * @see #getMeteringPoint()
	 * @generated
	 */
	EReference getMeteringPoint_CurrentMeter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.civitas.meter.target.MeteringPoint#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meter Readings</em>'.
	 * @see org.civitas.meter.target.MeteringPoint#getMeterReadings()
	 * @see #getMeteringPoint()
	 * @generated
	 */
	EReference getMeteringPoint_MeterReadings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.civitas.meter.target.MeteringPoint#getMeterHistory <em>Meter History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meter History</em>'.
	 * @see org.civitas.meter.target.MeteringPoint#getMeterHistory()
	 * @see #getMeteringPoint()
	 * @generated
	 */
	EReference getMeteringPoint_MeterHistory();

	/**
	 * Returns the meta object for class '{@link org.civitas.meter.target.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter</em>'.
	 * @see org.civitas.meter.target.Meter
	 * @generated
	 */
	EClass getMeter();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.Meter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.civitas.meter.target.Meter#getId()
	 * @see #getMeter()
	 * @generated
	 */
	EAttribute getMeter_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.Meter#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see org.civitas.meter.target.Meter#getSerialNumber()
	 * @see #getMeter()
	 * @generated
	 */
	EAttribute getMeter_SerialNumber();

	/**
	 * Returns the meta object for class '{@link org.civitas.meter.target.MeterReading <em>Meter Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Reading</em>'.
	 * @see org.civitas.meter.target.MeterReading
	 * @generated
	 */
	EClass getMeterReading();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.MeterReading#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.civitas.meter.target.MeterReading#getId()
	 * @see #getMeterReading()
	 * @generated
	 */
	EAttribute getMeterReading_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.MeterReading#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.civitas.meter.target.MeterReading#getValue()
	 * @see #getMeterReading()
	 * @generated
	 */
	EAttribute getMeterReading_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.MeterReading#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.civitas.meter.target.MeterReading#getTimestamp()
	 * @see #getMeterReading()
	 * @generated
	 */
	EAttribute getMeterReading_Timestamp();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.meter.target.MeterReading#getMeteringPoint <em>Metering Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metering Point</em>'.
	 * @see org.civitas.meter.target.MeterReading#getMeteringPoint()
	 * @see #getMeterReading()
	 * @generated
	 */
	EReference getMeterReading_MeteringPoint();

	/**
	 * Returns the meta object for class '{@link org.civitas.meter.target.MeterHistory <em>Meter History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter History</em>'.
	 * @see org.civitas.meter.target.MeterHistory
	 * @generated
	 */
	EClass getMeterHistory();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.MeterHistory#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.civitas.meter.target.MeterHistory#getId()
	 * @see #getMeterHistory()
	 * @generated
	 */
	EAttribute getMeterHistory_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.MeterHistory#getRemovalStatus <em>Removal Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Removal Status</em>'.
	 * @see org.civitas.meter.target.MeterHistory#getRemovalStatus()
	 * @see #getMeterHistory()
	 * @generated
	 */
	EAttribute getMeterHistory_RemovalStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.target.MeterHistory#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.civitas.meter.target.MeterHistory#getTimestamp()
	 * @see #getMeterHistory()
	 * @generated
	 */
	EAttribute getMeterHistory_Timestamp();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.meter.target.MeterHistory#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter</em>'.
	 * @see org.civitas.meter.target.MeterHistory#getMeter()
	 * @see #getMeterHistory()
	 * @generated
	 */
	EReference getMeterHistory_Meter();

	/**
	 * Returns the meta object for the reference '{@link org.civitas.meter.target.MeterHistory#getMeteringPoint <em>Metering Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metering Point</em>'.
	 * @see org.civitas.meter.target.MeterHistory#getMeteringPoint()
	 * @see #getMeterHistory()
	 * @generated
	 */
	EReference getMeterHistory_MeteringPoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	targetFactory gettargetFactory();

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
		 * The meta object literal for the '{@link org.civitas.meter.target.impl.PlantImpl <em>Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.meter.target.impl.PlantImpl
		 * @see org.civitas.meter.target.impl.targetPackageImpl#getPlant()
		 * @generated
		 */
		EClass PLANT = eINSTANCE.getPlant();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__ID = eINSTANCE.getPlant_Id();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__NUMBER = eINSTANCE.getPlant_Number();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__CITY = eINSTANCE.getPlant_City();

		/**
		 * The meta object literal for the '<em><b>Postalcode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__POSTALCODE = eINSTANCE.getPlant_Postalcode();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__STREET = eINSTANCE.getPlant_Street();

		/**
		 * The meta object literal for the '<em><b>House Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__HOUSE_NUMBER = eINSTANCE.getPlant_HouseNumber();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__NET = eINSTANCE.getPlant_Net();

		/**
		 * The meta object literal for the '<em><b>Operating Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__OPERATING_DATA = eINSTANCE.getPlant_OperatingData();

		/**
		 * The meta object literal for the '<em><b>Metering Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__METERING_POINTS = eINSTANCE.getPlant_MeteringPoints();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__PARTS = eINSTANCE.getPlant_Parts();

		/**
		 * The meta object literal for the '{@link org.civitas.meter.target.impl.NetImpl <em>Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.meter.target.impl.NetImpl
		 * @see org.civitas.meter.target.impl.targetPackageImpl#getNet()
		 * @generated
		 */
		EClass NET = eINSTANCE.getNet();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NET__ID = eINSTANCE.getNet_Id();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NET__NUMBER = eINSTANCE.getNet_Number();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NET__DESCRIPTION = eINSTANCE.getNet_Description();

		/**
		 * The meta object literal for the '{@link org.civitas.meter.target.impl.PartsImpl <em>Parts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.meter.target.impl.PartsImpl
		 * @see org.civitas.meter.target.impl.targetPackageImpl#getParts()
		 * @generated
		 */
		EClass PARTS = eINSTANCE.getParts();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTS__ID = eINSTANCE.getParts_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTS__TYPE = eINSTANCE.getParts_Type();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTS__PERFORMANCE = eINSTANCE.getParts_Performance();

		/**
		 * The meta object literal for the '<em><b>Construction Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTS__CONSTRUCTION_YEAR = eINSTANCE.getParts_ConstructionYear();

		/**
		 * The meta object literal for the '<em><b>Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTS__PLANT = eINSTANCE.getParts_Plant();

		/**
		 * The meta object literal for the '{@link org.civitas.meter.target.impl.OperatingDataImpl <em>Operating Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.meter.target.impl.OperatingDataImpl
		 * @see org.civitas.meter.target.impl.targetPackageImpl#getOperatingData()
		 * @generated
		 */
		EClass OPERATING_DATA = eINSTANCE.getOperatingData();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_DATA__ID = eINSTANCE.getOperatingData_Id();

		/**
		 * The meta object literal for the '<em><b>Operating Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_DATA__OPERATING_HOURS = eINSTANCE.getOperatingData_OperatingHours();

		/**
		 * The meta object literal for the '<em><b>Starts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_DATA__STARTS = eINSTANCE.getOperatingData_Starts();

		/**
		 * The meta object literal for the '<em><b>Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATING_DATA__PLANT = eINSTANCE.getOperatingData_Plant();

		/**
		 * The meta object literal for the '{@link org.civitas.meter.target.impl.MeteringPointImpl <em>Metering Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.meter.target.impl.MeteringPointImpl
		 * @see org.civitas.meter.target.impl.targetPackageImpl#getMeteringPoint()
		 * @generated
		 */
		EClass METERING_POINT = eINSTANCE.getMeteringPoint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METERING_POINT__ID = eINSTANCE.getMeteringPoint_Id();

		/**
		 * The meta object literal for the '<em><b>Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METERING_POINT__PLANT = eINSTANCE.getMeteringPoint_Plant();

		/**
		 * The meta object literal for the '<em><b>Current Meter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METERING_POINT__CURRENT_METER = eINSTANCE.getMeteringPoint_CurrentMeter();

		/**
		 * The meta object literal for the '<em><b>Meter Readings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METERING_POINT__METER_READINGS = eINSTANCE.getMeteringPoint_MeterReadings();

		/**
		 * The meta object literal for the '<em><b>Meter History</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METERING_POINT__METER_HISTORY = eINSTANCE.getMeteringPoint_MeterHistory();

		/**
		 * The meta object literal for the '{@link org.civitas.meter.target.impl.MeterImpl <em>Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.meter.target.impl.MeterImpl
		 * @see org.civitas.meter.target.impl.targetPackageImpl#getMeter()
		 * @generated
		 */
		EClass METER = eINSTANCE.getMeter();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER__ID = eINSTANCE.getMeter_Id();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER__SERIAL_NUMBER = eINSTANCE.getMeter_SerialNumber();

		/**
		 * The meta object literal for the '{@link org.civitas.meter.target.impl.MeterReadingImpl <em>Meter Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.meter.target.impl.MeterReadingImpl
		 * @see org.civitas.meter.target.impl.targetPackageImpl#getMeterReading()
		 * @generated
		 */
		EClass METER_READING = eINSTANCE.getMeterReading();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_READING__ID = eINSTANCE.getMeterReading_Id();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_READING__VALUE = eINSTANCE.getMeterReading_Value();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_READING__TIMESTAMP = eINSTANCE.getMeterReading_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Metering Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_READING__METERING_POINT = eINSTANCE.getMeterReading_MeteringPoint();

		/**
		 * The meta object literal for the '{@link org.civitas.meter.target.impl.MeterHistoryImpl <em>Meter History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.meter.target.impl.MeterHistoryImpl
		 * @see org.civitas.meter.target.impl.targetPackageImpl#getMeterHistory()
		 * @generated
		 */
		EClass METER_HISTORY = eINSTANCE.getMeterHistory();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_HISTORY__ID = eINSTANCE.getMeterHistory_Id();

		/**
		 * The meta object literal for the '<em><b>Removal Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_HISTORY__REMOVAL_STATUS = eINSTANCE.getMeterHistory_RemovalStatus();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_HISTORY__TIMESTAMP = eINSTANCE.getMeterHistory_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Meter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_HISTORY__METER = eINSTANCE.getMeterHistory_Meter();

		/**
		 * The meta object literal for the '<em><b>Metering Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_HISTORY__METERING_POINT = eINSTANCE.getMeterHistory_MeteringPoint();

	}

} //targetPackage
