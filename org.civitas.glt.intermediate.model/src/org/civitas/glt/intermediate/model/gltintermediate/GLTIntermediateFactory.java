/*
 * Copyright (c) 2012 - 2025 Data In Motion and others....
 */
package org.civitas.glt.intermediate.model.gltintermediate;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.civitas.glt.intermediate.model.gltintermediate.GLTIntermediatePackage
 * @generated
 */
@ProviderType
public interface GLTIntermediateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GLTIntermediateFactory eINSTANCE = org.civitas.glt.intermediate.model.gltintermediate.impl.GLTIntermediateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Building Sensor Reading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Building Sensor Reading</em>'.
	 * @generated
	 */
	BuildingSensorReading createBuildingSensorReading();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GLTIntermediatePackage getGLTIntermediatePackage();

} //GLTIntermediateFactory
