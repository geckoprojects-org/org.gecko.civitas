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
package org.eclipse.fennec.data.atlas.pipeline.configurator;

import java.io.IOException;
import java.util.logging.Logger;

import org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig;
import org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigFactory;
import org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigPackage;
import org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig;
import org.civitas.handler.emf.attacher.emfattacherconfig.EmfattacherconfigFactory;
import org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig;
import org.civitas.minio.config.minioconfig.MinIOClientConfig;
import org.civitas.minio.config.minioconfig.MinioconfigFactory;
import org.civitas.minio.config.minioconfig.MinioconfigPackage;
import org.civitas.pipeline.Pipeline;
import org.civitas.pipeline.PipelinePackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Pipeline creator
 *
 *
 * @author Juergen Albert
 * @since 27 Sept 2025
 */
@Component
public class PipelineCreator {

	private static final Logger logger = Logger.getLogger(PipelineCreator.class.getName());

	@Reference
	PipelinePackage pPackage;

	@Reference
	MinioconfigPackage minioPackage;
	@Reference
	ScheduledloaderconfigPackage loaderPackage;

	@Reference
	ResourceSet set;

	private Resource resource;

	@Activate
	public void activate() throws IOException {
		Pipeline pipeline = pPackage.getPipelineFactory().createPipeline();
		pipeline.setId("Meter_Pipeline");

		MinIOClientConfig minio = MinioconfigFactory.eINSTANCE.createMinIOClientConfig();
//		minio.setPid("minio");
		minio.setAccessKey("minio");
		minio.setSecretKey("minio123");
		minio.setEndpoint("http://localhost:9000");

		pipeline.getComponents().add(minio);

		MinIOCSVDownloadServiceConfig download = MinioconfigFactory.eINSTANCE.createMinIOCSVDownloadServiceConfig();
		download.setBucketname("dummy-data");
		download.setId("operating_data_source");
		download.setPid("operating_data_source");
		download.setClientTarget(minio);
		download.setEClass((EClass) createProxy("../models/meter/meter-source.ecore#//OperatingData",
				EcorePackage.Literals.ECLASS));

		pipeline.getSteps().add(download);

		ScheduledLoaderConfig manualMeter = ScheduledloaderconfigFactory.eINSTANCE.createScheduledLoaderConfig();
		manualMeter.setId("manual-meter");
		manualMeter.setPid("manual-meter");
		manualMeter.setLoaderName("manual-meter");
		manualMeter.setEclass(
				(EClass) createProxy("../models/meter/meter-source.ecore#//Meter", EcorePackage.Literals.ECLASS));
		manualMeter.setPackage((EPackage) createProxy("https://civitas.org/meter/source/1.0.0#/" ,EcorePackage.Literals.EPACKAGE));
		manualMeter.setRepoTarget("(repo_id=manualMeter)");
		manualMeter.setScheduleInterval(600);
		manualMeter.setInitialQuerySkip(0);
		manualMeter.setQueryLimit(1000);

		pipeline.getSteps().add(manualMeter);

		ScheduledLoaderConfig remoteMeter = ScheduledloaderconfigFactory.eINSTANCE.createScheduledLoaderConfig();
		remoteMeter.setId("remote-meter");
		remoteMeter.setPid("remote-meter");
		remoteMeter.setLoaderName("remote-meter");
		remoteMeter.setEclass(
				(EClass) createProxy("../models/meter/meter-source.ecore#//Meter", EcorePackage.Literals.ECLASS));
		remoteMeter.setPackage((EPackage) createProxy("https://civitas.org/meter/source/1.0.0#/" ,EcorePackage.Literals.EPACKAGE));
		remoteMeter.setRepoTarget("(repo_id=remoteMeter)");
		remoteMeter.setScheduleInterval(600);
		remoteMeter.setInitialQuerySkip(0);
		remoteMeter.setQueryLimit(1000);
		
		pipeline.getSteps().add(remoteMeter);

		ScheduledLoaderConfig manualReading = ScheduledloaderconfigFactory.eINSTANCE.createScheduledLoaderConfig();
		manualReading.setId("manual-readings");
		manualReading.setPid("manual-readings");
		manualReading.setLoaderName("manual-readings");
		manualReading.setEclass(
				(EClass) createProxy("../models/meter/meter-source.ecore#//Reading", EcorePackage.Literals.ECLASS));
		manualReading.setPackage((EPackage) createProxy("https://civitas.org/meter/source/1.0.0#/" ,EcorePackage.Literals.EPACKAGE));
		manualReading.setRepoTarget("(repo_id=manualReading)");
		manualReading.setScheduleInterval(60);
		manualReading.setInitialQuerySkip(0);
		manualReading.setQueryLimit(1000);
		
		pipeline.getSteps().add(manualReading);
		
		ScheduledLoaderConfig remoteReading = ScheduledloaderconfigFactory.eINSTANCE.createScheduledLoaderConfig();
		remoteReading.setId("remote-readings");
		remoteReading.setPid("remote-readings");
		remoteReading.setLoaderName("remote-readings");
		remoteReading.setEclass(
				(EClass) createProxy("../models/meter/meter-source.ecore#//RemoteReading", EcorePackage.Literals.ECLASS));
		remoteReading.setPackage((EPackage) createProxy("https://civitas.org/meter/source/1.0.0#/" ,EcorePackage.Literals.EPACKAGE));
		remoteReading.setRepoTarget("(repo_id=remoteMeter)");
		remoteReading.setScheduleInterval(60);
		remoteReading.setInitialQuerySkip(0);
		remoteReading.setQueryLimit(1000);
		
		pipeline.getSteps().add(remoteReading);
		
		EMFAttacherHandlerConfig attacher = EmfattacherconfigFactory.eINSTANCE.createEMFAttacherHandlerConfig();
		attacher.setId("plant_id_attacher");
		attacher.setPid("plant_id_attacher");
		attacher.setRepoTarget("(repo_id=inmem)");
		attacher.getInputs().add(download);
		attacher.setTargetEClassUri((EClass) createProxy("../models/meter/meter-source.ecore#//IntermediatePlant",
				EcorePackage.Literals.ECLASS));
		attacher.setIncomingEClassUri((EClass) createProxy("../models/meter/meter-source.ecore#//OperatingData",
				EcorePackage.Literals.ECLASS));
		attacher.setTargetReferenceUri(
				(EReference) createProxy("../models/meter/meter-source.ecore#//IntermediatePlant/operatingData",
						EcorePackage.Literals.EREFERENCE));
		attacher.setForeignKeyFeatureUri((EAttribute) createProxy(
				"../models/meter/meter-source.ecore#//OperatingData/plantId", EcorePackage.Literals.EATTRIBUTE));

		pipeline.getSteps().add(attacher);

		resource = set.createResource(URI.createURI("workspace/pipelines/meter.pipeline"));

		resource.getContents().add(pipeline);

		resource.save(null);

	}

	private EObject createProxy(String uri, EClass eClass) {
		EObject eObject = EcoreUtil.create(eClass);
		((InternalEObject) eObject).eSetProxyURI(URI.createURI(uri));
		return eObject;
	}

}
