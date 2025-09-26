/**
 * Copyright (c) 2012 - 2025 Data In Motion and others....
 */
package org.civitas.glt.intermediate.model.gltintermediate.impl;

import org.civitas.glt.intermediate.model.gltintermediate.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GLTIntermediateFactoryImpl extends EFactoryImpl implements GLTIntermediateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GLTIntermediateFactory init() {
		try {
			GLTIntermediateFactory theGLTIntermediateFactory = (GLTIntermediateFactory)EPackage.Registry.INSTANCE.getEFactory(GLTIntermediatePackage.eNS_URI);
			if (theGLTIntermediateFactory != null) {
				return theGLTIntermediateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GLTIntermediateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GLTIntermediateFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GLTIntermediatePackage.BUILDING_SENSOR_READING: return createBuildingSensorReading();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildingSensorReading createBuildingSensorReading() {
		BuildingSensorReadingImpl buildingSensorReading = new BuildingSensorReadingImpl();
		return buildingSensorReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GLTIntermediatePackage getGLTIntermediatePackage() {
		return (GLTIntermediatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GLTIntermediatePackage getPackage() {
		return GLTIntermediatePackage.eINSTANCE;
	}

} //GLTIntermediateFactoryImpl
