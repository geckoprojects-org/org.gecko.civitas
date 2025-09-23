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
package org.civitas.meter.source.model.metersource;


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
 * @see org.civitas.meter.source.model.metersource.MeterSourceFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel complianceLevel='17.0' oSGiCompatible='true' basePackage='org.civitas.meter.source.model' resource='XMI'"
 * @generated
 */
@ProviderType
@EPackage(uri = MeterSourcePackage.eNS_URI, genModel = "/model/meter-source.genmodel", genModelSourceLocations = {"model/meter-source.genmodel","org.civitas.meter.source.model/model/meter-source.genmodel"}, ecore="/model/meter-source.ecore", ecoreSourceLocations="/model/meter-source.ecore")
public interface MeterSourcePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metersource";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://civitas.org/meter/source/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metersource";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeterSourcePackage eINSTANCE = org.civitas.meter.source.model.metersource.impl.MeterSourcePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.civitas.meter.source.model.metersource.impl.BasicDataImpl <em>Basic Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.meter.source.model.metersource.impl.BasicDataImpl
	 * @see org.civitas.meter.source.model.metersource.impl.MeterSourcePackageImpl#getBasicData()
	 * @generated
	 */
	int BASIC_DATA = 0;

	/**
	 * The feature id for the '<em><b>Plant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DATA__PLANT_ID = 0;

	/**
	 * The feature id for the '<em><b>Net</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DATA__NET = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DATA__TYPE = 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DATA__CITY = 3;

	/**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DATA__ZIP = 4;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DATA__STREET = 5;

	/**
	 * The number of structural features of the '<em>Basic Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DATA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Basic Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.civitas.meter.source.model.metersource.impl.OperatingDataImpl <em>Operating Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.meter.source.model.metersource.impl.OperatingDataImpl
	 * @see org.civitas.meter.source.model.metersource.impl.MeterSourcePackageImpl#getOperatingData()
	 * @generated
	 */
	int OPERATING_DATA = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_DATA__ID = 0;

	/**
	 * The feature id for the '<em><b>Plant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_DATA__PLANT_ID = 1;

	/**
	 * The feature id for the '<em><b>Operating Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_DATA__OPERATING_HOURS = 2;

	/**
	 * The feature id for the '<em><b>Starts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_DATA__STARTS = 3;

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
	 * The meta object id for the '{@link org.civitas.meter.source.model.metersource.impl.MeterImpl <em>Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.meter.source.model.metersource.impl.MeterImpl
	 * @see org.civitas.meter.source.model.metersource.impl.MeterSourcePackageImpl#getMeter()
	 * @generated
	 */
	int METER = 2;

	/**
	 * The feature id for the '<em><b>Plant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__PLANT_ID = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__ID = 1;

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
	 * The meta object id for the '{@link org.civitas.meter.source.model.metersource.impl.ReadingImpl <em>Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.meter.source.model.metersource.impl.ReadingImpl
	 * @see org.civitas.meter.source.model.metersource.impl.MeterSourcePackageImpl#getReading()
	 * @generated
	 */
	int READING = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__ID = 0;

	/**
	 * The feature id for the '<em><b>Meter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__METER_ID = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__TIMESTAMP = 3;

	/**
	 * The number of structural features of the '<em>Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.civitas.meter.source.model.metersource.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.meter.source.model.metersource.impl.CustomerImpl
	 * @see org.civitas.meter.source.model.metersource.impl.MeterSourcePackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 4;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.civitas.meter.source.model.metersource.BasicData <em>Basic Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Data</em>'.
	 * @see org.civitas.meter.source.model.metersource.BasicData
	 * @generated
	 */
	EClass getBasicData();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.BasicData#getPlantId <em>Plant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plant Id</em>'.
	 * @see org.civitas.meter.source.model.metersource.BasicData#getPlantId()
	 * @see #getBasicData()
	 * @generated
	 */
	EAttribute getBasicData_PlantId();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.BasicData#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net</em>'.
	 * @see org.civitas.meter.source.model.metersource.BasicData#getNet()
	 * @see #getBasicData()
	 * @generated
	 */
	EAttribute getBasicData_Net();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.BasicData#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.civitas.meter.source.model.metersource.BasicData#getType()
	 * @see #getBasicData()
	 * @generated
	 */
	EAttribute getBasicData_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.BasicData#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.civitas.meter.source.model.metersource.BasicData#getCity()
	 * @see #getBasicData()
	 * @generated
	 */
	EAttribute getBasicData_City();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.BasicData#getZip <em>Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip</em>'.
	 * @see org.civitas.meter.source.model.metersource.BasicData#getZip()
	 * @see #getBasicData()
	 * @generated
	 */
	EAttribute getBasicData_Zip();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.BasicData#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.civitas.meter.source.model.metersource.BasicData#getStreet()
	 * @see #getBasicData()
	 * @generated
	 */
	EAttribute getBasicData_Street();

	/**
	 * Returns the meta object for class '{@link org.civitas.meter.source.model.metersource.OperatingData <em>Operating Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating Data</em>'.
	 * @see org.civitas.meter.source.model.metersource.OperatingData
	 * @generated
	 */
	EClass getOperatingData();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.OperatingData#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.civitas.meter.source.model.metersource.OperatingData#getId()
	 * @see #getOperatingData()
	 * @generated
	 */
	EAttribute getOperatingData_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.OperatingData#getPlantId <em>Plant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plant Id</em>'.
	 * @see org.civitas.meter.source.model.metersource.OperatingData#getPlantId()
	 * @see #getOperatingData()
	 * @generated
	 */
	EAttribute getOperatingData_PlantId();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.OperatingData#getOperatingHours <em>Operating Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating Hours</em>'.
	 * @see org.civitas.meter.source.model.metersource.OperatingData#getOperatingHours()
	 * @see #getOperatingData()
	 * @generated
	 */
	EAttribute getOperatingData_OperatingHours();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.OperatingData#getStarts <em>Starts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starts</em>'.
	 * @see org.civitas.meter.source.model.metersource.OperatingData#getStarts()
	 * @see #getOperatingData()
	 * @generated
	 */
	EAttribute getOperatingData_Starts();

	/**
	 * Returns the meta object for class '{@link org.civitas.meter.source.model.metersource.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter</em>'.
	 * @see org.civitas.meter.source.model.metersource.Meter
	 * @generated
	 */
	EClass getMeter();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.Meter#getPlantId <em>Plant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plant Id</em>'.
	 * @see org.civitas.meter.source.model.metersource.Meter#getPlantId()
	 * @see #getMeter()
	 * @generated
	 */
	EAttribute getMeter_PlantId();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.Meter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.civitas.meter.source.model.metersource.Meter#getId()
	 * @see #getMeter()
	 * @generated
	 */
	EAttribute getMeter_Id();

	/**
	 * Returns the meta object for class '{@link org.civitas.meter.source.model.metersource.Reading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reading</em>'.
	 * @see org.civitas.meter.source.model.metersource.Reading
	 * @generated
	 */
	EClass getReading();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.Reading#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.civitas.meter.source.model.metersource.Reading#getId()
	 * @see #getReading()
	 * @generated
	 */
	EAttribute getReading_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.Reading#getMeterId <em>Meter Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meter Id</em>'.
	 * @see org.civitas.meter.source.model.metersource.Reading#getMeterId()
	 * @see #getReading()
	 * @generated
	 */
	EAttribute getReading_MeterId();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.Reading#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.civitas.meter.source.model.metersource.Reading#getValue()
	 * @see #getReading()
	 * @generated
	 */
	EAttribute getReading_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.source.model.metersource.Reading#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.civitas.meter.source.model.metersource.Reading#getTimestamp()
	 * @see #getReading()
	 * @generated
	 */
	EAttribute getReading_Timestamp();

	/**
	 * Returns the meta object for class '{@link org.civitas.meter.source.model.metersource.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see org.civitas.meter.source.model.metersource.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MeterSourceFactory getMeterSourceFactory();

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
		 * The meta object literal for the '{@link org.civitas.meter.source.model.metersource.impl.BasicDataImpl <em>Basic Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.meter.source.model.metersource.impl.BasicDataImpl
		 * @see org.civitas.meter.source.model.metersource.impl.MeterSourcePackageImpl#getBasicData()
		 * @generated
		 */
		EClass BASIC_DATA = eINSTANCE.getBasicData();

		/**
		 * The meta object literal for the '<em><b>Plant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_DATA__PLANT_ID = eINSTANCE.getBasicData_PlantId();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_DATA__NET = eINSTANCE.getBasicData_Net();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_DATA__TYPE = eINSTANCE.getBasicData_Type();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_DATA__CITY = eINSTANCE.getBasicData_City();

		/**
		 * The meta object literal for the '<em><b>Zip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_DATA__ZIP = eINSTANCE.getBasicData_Zip();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_DATA__STREET = eINSTANCE.getBasicData_Street();

		/**
		 * The meta object literal for the '{@link org.civitas.meter.source.model.metersource.impl.OperatingDataImpl <em>Operating Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.meter.source.model.metersource.impl.OperatingDataImpl
		 * @see org.civitas.meter.source.model.metersource.impl.MeterSourcePackageImpl#getOperatingData()
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
		 * The meta object literal for the '<em><b>Plant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_DATA__PLANT_ID = eINSTANCE.getOperatingData_PlantId();

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
		 * The meta object literal for the '{@link org.civitas.meter.source.model.metersource.impl.MeterImpl <em>Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.meter.source.model.metersource.impl.MeterImpl
		 * @see org.civitas.meter.source.model.metersource.impl.MeterSourcePackageImpl#getMeter()
		 * @generated
		 */
		EClass METER = eINSTANCE.getMeter();

		/**
		 * The meta object literal for the '<em><b>Plant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER__PLANT_ID = eINSTANCE.getMeter_PlantId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER__ID = eINSTANCE.getMeter_Id();

		/**
		 * The meta object literal for the '{@link org.civitas.meter.source.model.metersource.impl.ReadingImpl <em>Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.meter.source.model.metersource.impl.ReadingImpl
		 * @see org.civitas.meter.source.model.metersource.impl.MeterSourcePackageImpl#getReading()
		 * @generated
		 */
		EClass READING = eINSTANCE.getReading();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING__ID = eINSTANCE.getReading_Id();

		/**
		 * The meta object literal for the '<em><b>Meter Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING__METER_ID = eINSTANCE.getReading_MeterId();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING__VALUE = eINSTANCE.getReading_Value();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING__TIMESTAMP = eINSTANCE.getReading_Timestamp();

		/**
		 * The meta object literal for the '{@link org.civitas.meter.source.model.metersource.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.meter.source.model.metersource.impl.CustomerImpl
		 * @see org.civitas.meter.source.model.metersource.impl.MeterSourcePackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

	}

} //MeterSourcePackage
