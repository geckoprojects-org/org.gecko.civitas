/*
 * Copyright (c) 2012 - 2025 Data In Motion and others....
 */
package org.civitas.glt.intermediate.model.gltintermediate.util;

import java.util.HashMap;
import java.util.Map;

import org.civitas.glt.intermediate.model.gltintermediate.GLTIntermediatePackage;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.gecko.emf.osgi.constants.EMFNamespaces;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.civitas.glt.intermediate.model.gltintermediate.util.GLTIntermediateResourceImpl
 * @generated
 */
public class GLTIntermediateResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GLTIntermediateResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new GLTIntermediateResourceImpl(uri);
		return result;
	}

	/**
	 * A method providing the Properties the services around this ResourceFactory should be registered with.
	 * @generated
	 */
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_CONFIGURATOR_NAME, GLTIntermediatePackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "gltintermediate");
		properties.put(EMFNamespaces.EMF_MODEL_VERSION, "1.0");
		return properties;
	}

} //GLTIntermediateResourceFactoryImpl
