/*
 */
package org.civitas.meter.source.model.metersource;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage
 * @generated
 */
@ProviderType
public interface MeterSourceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeterSourceFactory eINSTANCE = org.civitas.meter.source.model.metersource.impl.MeterSourceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Basic Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Data</em>'.
	 * @generated
	 */
	BasicData createBasicData();

	/**
	 * Returns a new object of class '<em>Operating Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operating Data</em>'.
	 * @generated
	 */
	OperatingData createOperatingData();

	/**
	 * Returns a new object of class '<em>Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meter</em>'.
	 * @generated
	 */
	Meter createMeter();

	/**
	 * Returns a new object of class '<em>Reading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reading</em>'.
	 * @generated
	 */
	Reading createReading();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MeterSourcePackage getMeterSourcePackage();

} //MeterSourceFactory
