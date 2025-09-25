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
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
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
public class MeterLoader {
	
	@Reference(target = "(repo_id=manualMeter)")
	private EMFRepository manualMeterRepo;
	@Reference(target = "(repo_id=remoteMeter)")
	private EMFRepository remoteMeterRepo;
	@Reference(target = "(repo_id=manualReading)")
	private EMFRepository manualReadingRepo;
	
	@Reference(target = "(emf.name=metersource)")
	private EPackage meterPackage;
	private EClass meterEClass;
	private EClass remoteReadingEClass;
	private EStructuralFeature idFeature;
	private EStructuralFeature plantIdFeature;
	private EStructuralFeature remoteReadingIdFeature;
	private EStructuralFeature remoteReadingMeterFeature;
	private EStructuralFeature remoteReadingValueFeature;
	private EClass readingEClass;
	private EStructuralFeature readingIdFeature;
	private EStructuralFeature readingMeterFeature;
	private EStructuralFeature readingValueFeature;
	
	@Activate
	public void activate() {
		meterEClass = (EClass) meterPackage.getEClassifier("Meter");
		idFeature = meterEClass.getEStructuralFeature("id");
		plantIdFeature = meterEClass.getEStructuralFeature("plantId");
		remoteReadingEClass = (EClass) meterPackage.getEClassifier("RemoteReading");
		remoteReadingIdFeature = remoteReadingEClass.getEStructuralFeature("id");
		remoteReadingMeterFeature = remoteReadingEClass.getEStructuralFeature("meterId");
		remoteReadingValueFeature = remoteReadingEClass.getEStructuralFeature("value");
		readingEClass = (EClass) meterPackage.getEClassifier("Reading");
		readingIdFeature = readingEClass.getEStructuralFeature("id");
		readingMeterFeature = readingEClass.getEStructuralFeature("meterId");
		readingValueFeature = readingEClass.getEStructuralFeature("value");
		System.out.println("METER LOADER ACTIVE");
		printManualMeters();
		printManualMeterReadings();
		printRemoteMeters();
		printRemoteMeterReadings();
		
	}

	/**
	 * 
	 */
	private void printManualMeters() {
		EObject eObject = manualMeterRepo.getEObject("Meter", Integer.valueOf("20"));
		System.out.println("Manual Meter by id '20': " + eObject);
		// All objects are detached here and have no resource
		List<EObject> allEObjects = manualMeterRepo.getAllEObjects(meterEClass);
		allEObjects.forEach(eo->{
			System.out.println("Manual Meter id: " + eo.eGet(idFeature) + " for plant: " + eo.eGet(plantIdFeature));
		});
	}
	/**
	 * 
	 */
	private void printRemoteMeters() {
		EObject eObject = remoteMeterRepo.getEObject("Meter", Integer.valueOf("20"));
		System.out.println("Remote Meter by id '20': " + eObject);
		// All objects are detached here and have no resource
		List<EObject> allEObjects = remoteMeterRepo.getAllEObjects(meterEClass);
		allEObjects.forEach(eo->{
			System.out.println("Remote Meter id: " + eo.eGet(idFeature) + " for plant: " + eo.eGet(plantIdFeature));
		});
	}
	/**
	 * 
	 */
	private void printRemoteMeterReadings() {
		EObject eObject = remoteMeterRepo.getEObject(remoteReadingEClass, Integer.valueOf("60"));
		System.out.println("Remote Meter Reading by id '60': " + eObject);
		// All objects are detached here and have no resource
		List<EObject> allEObjects = remoteMeterRepo.getAllEObjects(remoteReadingEClass, Map.of("limit", 1000l, "skip", 2000l));
		allEObjects.forEach(eo->{
			System.out.println("Remote Meter Reading id: " + eo.eGet(remoteReadingIdFeature) + " for meter: " + eo.eGet(remoteReadingMeterFeature) + " with value: " + eo.eGet(remoteReadingValueFeature));
		});
	}
	/**
	 * 
	 */
	private void printManualMeterReadings() {
		EObject eObject = manualReadingRepo.getEObject(readingEClass, Integer.valueOf("50"));
		System.out.println("Manual Meter Reading by id '50': " + eObject);
		// All objects are detached here and have no resource
		List<EObject> allEObjects = manualReadingRepo.getAllEObjects(readingEClass, Map.of("limit", 1000l, "skip", 1000l));
		allEObjects.forEach(eo->{
			System.out.println("Manual Meter Reading id: " + eo.eGet(readingIdFeature) + " for meter: " + eo.eGet(readingMeterFeature) + " with value: " + eo.eGet(readingValueFeature));
		});
	}
	
}
