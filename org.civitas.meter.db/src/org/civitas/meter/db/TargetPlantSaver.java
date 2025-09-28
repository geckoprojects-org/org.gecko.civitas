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

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * 
 * @author mark
 * @since 28.09.2025
 */
@Component
public class TargetPlantSaver {
	
	@Reference(target = "(repo_id=plantTarget)")
	private EMFRepository plantRepo;
	
	@Reference(target = "(emf.name=target)")
	private ResourceSet resourceSet;
	
	@Activate
	public void activate(BundleContext bctx) {
		URL xmi = bctx.getBundle().getEntry("data/Plant.xmi");
		Resource resource = resourceSet.createResource(URI.createURI(UUID.randomUUID().toString() + ".xmi"));
		try {
			resource.load(xmi.openStream(), null);
			EObject plant = resource.getContents().get(0);
			System.out.println("PLANT: " + plant);
			plantRepo.save(plant, Collections.emptyMap());
			System.out.println("SAVED PLANT: " + plant);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
