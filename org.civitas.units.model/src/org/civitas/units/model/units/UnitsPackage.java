/*
 */
package org.civitas.units.model.units;


import org.eclipse.emf.ecore.EDataType;

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
 * @see org.civitas.units.model.units.UnitsFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel complianceLevel='17.0' oSGiCompatible='true' basePackage='org.civitas.units.model' resource='XMI'"
 * @generated
 */
@ProviderType
@EPackage(uri = UnitsPackage.eNS_URI, genModel = "/model/units.genmodel", genModelSourceLocations = {"model/units.genmodel","org.civitas.units.model/model/units.genmodel"}, ecore="/model/units.ecore", ecoreSourceLocations="/model/units.ecore")
public interface UnitsPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "units";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://civitas.org/units/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "units";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnitsPackage eINSTANCE = org.civitas.units.model.units.impl.UnitsPackageImpl.init();

	/**
	 * The meta object id for the '<em>Hours</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.civitas.units.model.units.impl.UnitsPackageImpl#getHours()
	 * @generated
	 */
	int HOURS = 0;

	/**
	 * The meta object id for the '<em>Kilowatt Hours</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.civitas.units.model.units.impl.UnitsPackageImpl#getKilowattHours()
	 * @generated
	 */
	int KILOWATT_HOURS = 1;

	/**
	 * The meta object id for the '<em>Degrees Celsius</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.civitas.units.model.units.impl.UnitsPackageImpl#getDegreesCelsius()
	 * @generated
	 */
	int DEGREES_CELSIUS = 2;

	/**
	 * The meta object id for the '<em>EInstant</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.Instant
	 * @see org.civitas.units.model.units.impl.UnitsPackageImpl#getEInstant()
	 * @generated
	 */
	int EINSTANT = 3;


	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hours</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getHours();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Kilowatt Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kilowatt Hours</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getKilowattHours();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Degrees Celsius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Degrees Celsius</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getDegreesCelsius();

	/**
	 * Returns the meta object for data type '{@link java.time.Instant <em>EInstant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInstant</em>'.
	 * @see java.time.Instant
	 * @model instanceClass="java.time.Instant"
	 * @generated
	 */
	EDataType getEInstant();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UnitsFactory getUnitsFactory();

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
		 * The meta object literal for the '<em>Hours</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.civitas.units.model.units.impl.UnitsPackageImpl#getHours()
		 * @generated
		 */
		EDataType HOURS = eINSTANCE.getHours();

		/**
		 * The meta object literal for the '<em>Kilowatt Hours</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.civitas.units.model.units.impl.UnitsPackageImpl#getKilowattHours()
		 * @generated
		 */
		EDataType KILOWATT_HOURS = eINSTANCE.getKilowattHours();

		/**
		 * The meta object literal for the '<em>Degrees Celsius</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.civitas.units.model.units.impl.UnitsPackageImpl#getDegreesCelsius()
		 * @generated
		 */
		EDataType DEGREES_CELSIUS = eINSTANCE.getDegreesCelsius();

		/**
		 * The meta object literal for the '<em>EInstant</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.Instant
		 * @see org.civitas.units.model.units.impl.UnitsPackageImpl#getEInstant()
		 * @generated
		 */
		EDataType EINSTANT = eINSTANCE.getEInstant();

	}

} //UnitsPackage
