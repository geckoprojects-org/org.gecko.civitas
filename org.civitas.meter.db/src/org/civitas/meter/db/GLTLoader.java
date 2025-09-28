/**
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
package org.civitas.meter.db;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * 
 * @author mark
 * @since 25.09.2025
 */
//@Component
public class GLTLoader {
	
	@Reference(target = "(repo_id=assets)")
	private EMFRepository gltRepo;
	
	@Reference(target = "(emf.name=glt)")
	private EPackage gltPackage;

	private EClass buildingEClass;
	private EStructuralFeature contactsFeature;
	
	@Activate
	public void activate() {
		System.out.println("GLT LOADER ACTIVE");
		buildingEClass = (EClass) gltPackage.getEClassifier("Building");
		contactsFeature = buildingEClass.getEStructuralFeature("contacts");
		printGLTAssets();
		
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	private void printGLTAssets() {
		EObject eObject = gltRepo.getEObject("Building", Integer.valueOf("3"));
		System.out.println("Building by id '3': " + eObject + " contacts: " + ((List<EObject>)eObject.eGet(contactsFeature)).size());
		
		// All objects are detached here and have no resource
		List<EObject> allBuildings = gltRepo.getAllEObjects(buildingEClass);
		allBuildings.forEach(eo->{
			System.out.println("Building id: " + EcoreUtil.getID(eo) + " contacts: " + ((List<EObject>)eo.eGet(contactsFeature)).size());
		});
	}
	
}
