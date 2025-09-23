/*
 */
package org.civitas.glt.sensor.model.sensor;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.civitas.glt.sensor.model.sensor.BuildingSensorPackage
 * @generated
 */
@ProviderType
public interface BuildingSensorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuildingSensorFactory eINSTANCE = org.civitas.glt.sensor.model.sensor.impl.BuildingSensorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sensor Reading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Reading</em>'.
	 * @generated
	 */
	SensorReading createSensorReading();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BuildingSensorPackage getBuildingSensorPackage();

} //BuildingSensorFactory
