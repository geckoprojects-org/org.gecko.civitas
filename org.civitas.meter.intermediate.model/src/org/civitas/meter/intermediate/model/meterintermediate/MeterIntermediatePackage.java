/*
 */
package org.civitas.meter.intermediate.model.meterintermediate;


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
 * @see org.civitas.meter.intermediate.model.meterintermediate.MeterIntermediateFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel complianceLevel='17.0' oSGiCompatible='true' basePackage='org.civitas.meter.intermediate.model' resource='XMI'"
 * @generated
 */
@ProviderType
@EPackage(uri = MeterIntermediatePackage.eNS_URI, genModel = "/model/meter-intermediate.genmodel", genModelSourceLocations = {"model/meter-intermediate.genmodel","org.civitas.meter.intermediate.model/model/meter-intermediate.genmodel"}, ecore="/model/meter-intermediate.ecore", ecoreSourceLocations="/model/meter-intermediate.ecore")
public interface MeterIntermediatePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "meterintermediate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://civitas.org/meter/intermediate/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "meterintermediate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeterIntermediatePackage eINSTANCE = org.civitas.meter.intermediate.model.meterintermediate.impl.MeterIntermediatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.civitas.meter.intermediate.model.meterintermediate.impl.MeteringPointImpl <em>Metering Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.meter.intermediate.model.meterintermediate.impl.MeteringPointImpl
	 * @see org.civitas.meter.intermediate.model.meterintermediate.impl.MeterIntermediatePackageImpl#getMeteringPoint()
	 * @generated
	 */
	int METERING_POINT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT__READINGS = 1;

	/**
	 * The number of structural features of the '<em>Metering Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metering Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.civitas.meter.intermediate.model.meterintermediate.MeteringPoint <em>Metering Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metering Point</em>'.
	 * @see org.civitas.meter.intermediate.model.meterintermediate.MeteringPoint
	 * @generated
	 */
	EClass getMeteringPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.meter.intermediate.model.meterintermediate.MeteringPoint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.civitas.meter.intermediate.model.meterintermediate.MeteringPoint#getId()
	 * @see #getMeteringPoint()
	 * @generated
	 */
	EAttribute getMeteringPoint_Id();

	/**
	 * Returns the meta object for the reference list '{@link org.civitas.meter.intermediate.model.meterintermediate.MeteringPoint#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Readings</em>'.
	 * @see org.civitas.meter.intermediate.model.meterintermediate.MeteringPoint#getReadings()
	 * @see #getMeteringPoint()
	 * @generated
	 */
	EReference getMeteringPoint_Readings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MeterIntermediateFactory getMeterIntermediateFactory();

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
		 * The meta object literal for the '{@link org.civitas.meter.intermediate.model.meterintermediate.impl.MeteringPointImpl <em>Metering Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.meter.intermediate.model.meterintermediate.impl.MeteringPointImpl
		 * @see org.civitas.meter.intermediate.model.meterintermediate.impl.MeterIntermediatePackageImpl#getMeteringPoint()
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
		 * The meta object literal for the '<em><b>Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METERING_POINT__READINGS = eINSTANCE.getMeteringPoint_Readings();

	}

} //MeterIntermediatePackage
