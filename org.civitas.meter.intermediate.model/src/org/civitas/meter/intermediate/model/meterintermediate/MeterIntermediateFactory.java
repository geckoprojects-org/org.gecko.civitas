/*
 */
package org.civitas.meter.intermediate.model.meterintermediate;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.civitas.meter.intermediate.model.meterintermediate.MeterIntermediatePackage
 * @generated
 */
@ProviderType
public interface MeterIntermediateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeterIntermediateFactory eINSTANCE = org.civitas.meter.intermediate.model.meterintermediate.impl.MeterIntermediateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Metering Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metering Point</em>'.
	 * @generated
	 */
	MeteringPoint createMeteringPoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MeterIntermediatePackage getMeterIntermediatePackage();

} //MeterIntermediateFactory
