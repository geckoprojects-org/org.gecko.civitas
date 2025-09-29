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
import org.civitas.qvthandler.QVTHandlerConfig;
import org.civitas.qvthandler.QvthandlerFactory;
import org.civitas.qvthandler.QvthandlerPackage;
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
import org.civitas.datasinkconfig.DatasinkconfigFactory;
import org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig;
import org.civitas.mqtthandler.MqttEventHandlerConfig;
import org.civitas.mqtthandler.MqtthandlerFactory;
import org.civitas.mqtthandler.MqtthandlerPackage;
import org.civitas.mqttreceiver.MqttReceiverConfig;
import org.civitas.mqttreceiver.MqttreceiverFactory;
import org.civitas.mqttreceiver.MqttreceiverPackage;

import validationhandlerconfig.ValidationHandlerConfig;
import validationhandlerconfig.ValidationhandlerFactory;

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
	QvthandlerPackage qvtPackage;

	@Reference
	MqtthandlerPackage mqttSenderPackage;

	@Reference
	MqttreceiverPackage mqttReceiverPackage;

	@Reference
	ResourceSet set;

	private Resource resource;

	@Activate
	public void activate() throws IOException {
//		createMeterPipeline();
		createGLTPipeline();
		createMQTTExample();
	}

	private void createMQTTExample() throws IOException {
	    Pipeline pipeline = pPackage.getPipelineFactory().createPipeline();
	    pipeline.setId("MQTT_Example_Pipeline");

	    MqttReceiverConfig receiver = MqttreceiverFactory.eINSTANCE.createMqttReceiverConfig();
	    receiver.setMqttTopic("buildings/#");
	    receiver.setPayloadEclassuri((EClass) createProxy("http://models.civitas.org/models/building/sensor/1.0#//SensorReading", EcorePackage.Literals.ECLASS));
	    receiver.setPid("SensorReadingReceiver");
	    receiver.setId("SensorReadingReceiver");
	    receiver.setMqttServiceTarget("(id=local)");
	    
	    pipeline.getSteps().add(receiver);
	    
	    MqttEventHandlerConfig mqttHandler = MqtthandlerFactory.eINSTANCE.createMqttEventHandlerConfig();
	    mqttHandler.setId("MQTTHandler");
	    mqttHandler.setPid("MQTTHandler");
	    mqttHandler.getMqttTopics().add("other/buildings/new");
	    mqttHandler.setMqttServiceTarget("(id=local)");
	    mqttHandler.setContentType("application/xmi");

	    mqttHandler.getInputs().add(receiver);
	    pipeline.getSteps().add(mqttHandler);
	    
	    resource = set.createResource(URI.createURI("workspace/pipelines/mqttexample.pipeline"));

	    resource.getContents().add(pipeline);
	    try {
		resource.save(null);
	    } catch (Exception e) {
		System.err.println("Something went wrong");
	    }
	}

	/**
	 * @throws IOException
	 */
	private void createMeterPipeline() throws IOException {
	    Pipeline pipeline = pPackage.getPipelineFactory().createPipeline();
	    pipeline.setId("Meter_Pipeline");

	    MinIOClientConfig minio = MinioconfigFactory.eINSTANCE.createMinIOClientConfig();
	    minio.setPid("minio");
	    minio.setAccessKey("minio");
	    minio.setSecretKey("minio123");
	    minio.setEndpoint("http://localhost:9000");

	    pipeline.getComponents().add(minio);

	    MinIOCSVDownloadServiceConfig minIoOperatingData = MinioconfigFactory.eINSTANCE.createMinIOCSVDownloadServiceConfig();
	    minIoOperatingData.setBucketname("dummy-data");
	    minIoOperatingData.setId("operating_data_source");
	    minIoOperatingData.setPid("operating_data_source");
	    minIoOperatingData.setClientTarget(minio);
	    minIoOperatingData.setCron("0 */5 * * * *");
	    minIoOperatingData.setEClass((EClass) createProxy("https://civitas.org/meter/source/1.0.0#//OperatingData",
	    		EcorePackage.Literals.ECLASS));

	    pipeline.getSteps().add(minIoOperatingData);

	    MinIOCSVDownloadServiceConfig minIoBasicData = MinioconfigFactory.eINSTANCE.createMinIOCSVDownloadServiceConfig();
	    minIoBasicData.setBucketname("dummy-data");
	    minIoBasicData.setId("basic_data_source");
	    minIoBasicData.setPid("basic_data_source");
	    minIoBasicData.setClientTarget(minio);
	    minIoBasicData.setCron("0 */5 * * * *");
	    minIoBasicData.setEClass((EClass) createProxy("https://civitas.org/meter/source/1.0.0#//BasicData",
	    		EcorePackage.Literals.ECLASS));
	    
	    pipeline.getSteps().add(minIoBasicData);
	    
	    ScheduledLoaderConfig manualMeter = ScheduledloaderconfigFactory.eINSTANCE.createScheduledLoaderConfig();
	    manualMeter.setId("manual-meter");
	    manualMeter.setPid("manual-meter");
	    manualMeter.setLoaderName("manual-meter");
	    manualMeter.setEclass(
	    		(EClass) createProxy("https://civitas.org/meter/source/1.0.0#//Meter", EcorePackage.Literals.ECLASS));
	    manualMeter.setPackage((EPackage) createProxy("https://civitas.org/meter/source/1.0.0#/" ,EcorePackage.Literals.EPACKAGE));
	    manualMeter.setRepoTarget("(repo_id=manualMeter)");
	    manualMeter.setScheduleInterval(60);
	    manualMeter.setInitialQuerySkip(0);
	    manualMeter.setQueryLimit(1000);

	    pipeline.getSteps().add(manualMeter);

	    ScheduledLoaderConfig remoteMeter = ScheduledloaderconfigFactory.eINSTANCE.createScheduledLoaderConfig();
	    remoteMeter.setId("remote-meter");
	    remoteMeter.setPid("remote-meter");
	    remoteMeter.setLoaderName("remote-meter");
	    remoteMeter.setEclass(
	    		(EClass) createProxy("https://civitas.org/meter/source/1.0.0#//Meter", EcorePackage.Literals.ECLASS));
	    remoteMeter.setPackage((EPackage) createProxy("https://civitas.org/meter/source/1.0.0#/" ,EcorePackage.Literals.EPACKAGE));
	    remoteMeter.setRepoTarget("(repo_id=remoteMeter)");
	    remoteMeter.setScheduleInterval(60);
	    remoteMeter.setInitialQuerySkip(0);
	    remoteMeter.setQueryLimit(1000);
	    
	    pipeline.getSteps().add(remoteMeter);

	    ScheduledLoaderConfig manualReading = ScheduledloaderconfigFactory.eINSTANCE.createScheduledLoaderConfig();
	    manualReading.setId("manual-readings");
	    manualReading.setPid("manual-readings");
	    manualReading.setLoaderName("manual-readings");
	    manualReading.setEclass(
	    		(EClass) createProxy("https://civitas.org/meter/source/1.0.0#//Reading", EcorePackage.Literals.ECLASS));
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
	    		(EClass) createProxy("https://civitas.org/meter/source/1.0.0#//RemoteReading", EcorePackage.Literals.ECLASS));
	    remoteReading.setPackage((EPackage) createProxy("https://civitas.org/meter/source/1.0.0#/" ,EcorePackage.Literals.EPACKAGE));
	    remoteReading.setRepoTarget("(repo_id=remoteMeter)");
	    remoteReading.setScheduleInterval(60);
	    remoteReading.setInitialQuerySkip(0);
	    remoteReading.setQueryLimit(1000);
	    
	    pipeline.getSteps().add(remoteReading);
	    
	    QVTHandlerConfig basicDataQVT = QvthandlerFactory.eINSTANCE.createQVTHandlerConfig();
	    basicDataQVT.setId("basicDataQVT");
	    basicDataQVT.setPid("basicDataQVT");
	    basicDataQVT.setTrafo("(transformator.id=basicDataQVT)");
	    basicDataQVT.setEclassuri((EClass) createProxy("https://civitas.org/meter/source/1.0.0#//BasicData",
	    		EcorePackage.Literals.ECLASS));

	    basicDataQVT.getInputs().add(minIoBasicData);
	    pipeline.getSteps().add(basicDataQVT);
	    
	    EMFAttacherHandlerConfig opDataAttacher = EmfattacherconfigFactory.eINSTANCE.createEMFAttacherHandlerConfig();
	    opDataAttacher.setId("op_plant_id_attacher");
	    opDataAttacher.setPid("op_plant_id_attacher");
	    opDataAttacher.setRepoTarget("(repo_id=inmem)");
	    opDataAttacher.getInputs().add(minIoOperatingData);
	    opDataAttacher.setIncomingEClassUri((EClass) createProxy("https://civitas.org/meter/source/1.0.0#//OperatingData",
	    		EcorePackage.Literals.ECLASS));
	    opDataAttacher.setTargetEClassUri((EClass) createProxy("https://civitas.org/meter/source/1.0.0#//IntermediatePlant",
	    		EcorePackage.Literals.ECLASS));
	    opDataAttacher.setTargetReferenceUri(
	    		(EReference) createProxy("https://civitas.org/meter/source/1.0.0#//IntermediatePlant/operatingData",
	    				EcorePackage.Literals.EREFERENCE));
	    opDataAttacher.setForeignKeyFeatureUri((EAttribute) createProxy(
	    		"https://civitas.org/meter/source/1.0.0#//OperatingData/plantId", EcorePackage.Literals.EATTRIBUTE));

	    pipeline.getSteps().add(opDataAttacher);
	    
	    
	    EMFAttacherHandlerConfig basicDataAttacher = EmfattacherconfigFactory.eINSTANCE.createEMFAttacherHandlerConfig();
	    basicDataAttacher.setId("basic_plant_id_attacher");
	    basicDataAttacher.setPid("basic_plant_id_attacher");
	    basicDataAttacher.setRepoTarget("(repo_id=inmem)");
	    basicDataAttacher.getInputs().add(basicDataQVT);
	    basicDataAttacher.setIncomingEClassUri((EClass) createProxy("https://civitas.org/meter/source/1.0.0#//BasicData",
	    		EcorePackage.Literals.ECLASS));
	    basicDataAttacher.setTargetEClassUri((EClass) createProxy("https://civitas.org/meter/source/1.0.0#//IntermediatePlant",
	    		EcorePackage.Literals.ECLASS));
	    basicDataAttacher.setTargetReferenceUri(
	    		(EReference) createProxy("https://civitas.org/meter/source/1.0.0#//IntermediatePlant/basicData",
	    				EcorePackage.Literals.EREFERENCE));
	    basicDataAttacher.setForeignKeyFeatureUri((EAttribute) createProxy(
	    		"https://civitas.org/meter/source/1.0.0#//BasicData/plantId", EcorePackage.Literals.EATTRIBUTE));
	    
	    pipeline.getSteps().add(basicDataAttacher);

	    
	    QVTHandlerConfig plantQvt = QvthandlerFactory.eINSTANCE.createQVTHandlerConfig();
	    plantQvt.setId("plantQVT");
	    plantQvt.setPid("plantQVT"); 
	    plantQvt.setTrafo("(transformator.id=intPlantToPlantQVT)");
	    plantQvt.setEclassuri((EClass) createProxy("https://civitas.org/meter/source/1.0.0#//IntermediatePlant",
	    		EcorePackage.Literals.ECLASS));

	    plantQvt.getInputs().add(basicDataAttacher);
	    plantQvt.getInputs().add(opDataAttacher);
	    pipeline.getSteps().add(plantQvt);
	    
	    QVTHandlerConfig meterToIntermediateMeteringPointConfig = QvthandlerFactory.eINSTANCE.createQVTHandlerConfig();
	    meterToIntermediateMeteringPointConfig.setId("meterToIntermediateMeteringPointQVT");
	    meterToIntermediateMeteringPointConfig.setPid("meterToIntermediateMeteringPointQVT"); 
	    meterToIntermediateMeteringPointConfig.setTrafo("(transformator.id=meterToIntermediateMeteringPointQVT)");
	    meterToIntermediateMeteringPointConfig.setEclassuri((EClass) createProxy("https://civitas.org/meter/source/1.0.0#//IntermediateMeteringPoint",
	    		EcorePackage.Literals.ECLASS));

	    
//		TODO: Attach meter to intermediateMeteringPoint 
//		
//		EMFAttacherHandlerConfig meterAttacher = EmfattacherconfigFactory.eINSTANCE.createEMFAttacherHandlerConfig();
//		meterAttacher.setId("meter_attacher");
//		meterAttacher.setPid("meter_attacher");
//		meterAttacher.setRepoTarget("(repo_id=inmem)");
//		meterAttacher.getInputs().add(manualMeter);
//		meterAttacher.getInputs().add(remoteMeter);
//		meterAttacher.setIncomingEClassUri((EClass) createProxy("https://civitas.org/meter/source/1.0.0#//Meter",
//				EcorePackage.Literals.ECLASS));
//		meterAttacher.setTargetEClassUri((EClass) createProxy("https://civitas.org/meter/source/1.0.0#//IntermediateMeteringPoint",
//				EcorePackage.Literals.ECLASS));
//		meterAttacher.setTargetReferenceUri(
//				(EReference) createProxy("https://civitas.org/meter/source/1.0.0#//IntermediateMeteringPoint",
//						EcorePackage.Literals.EREFERENCE));
//		meterAttacher.setForeignKeyFeatureUri((EAttribute) createProxy(
//				"https://civitas.org/meter/source/1.0.0#//Meter/id", EcorePackage.Literals.EATTRIBUTE));
//		
//		pipeline.getSteps().add(meterAttacher);

	    EMFAttacherHandlerConfig readingAttacher = EmfattacherconfigFactory.eINSTANCE.createEMFAttacherHandlerConfig();
	    readingAttacher.setId("reading_attacher");
	    readingAttacher.setPid("reading_attacher");
	    readingAttacher.setRepoTarget("(repo_id=inmem)");
	    readingAttacher.getInputs().add(manualReading);
	    readingAttacher.getInputs().add(remoteReading);
	    readingAttacher.setIncomingEClassUri((EClass) createProxy("https://civitas.org/meter/source/1.0.0#//Reading",
	    		EcorePackage.Literals.ECLASS));
	    readingAttacher.setTargetEClassUri((EClass) createProxy("https://civitas.org/meter/source/1.0.0#//IntermediateMeteringPoint",
	    		EcorePackage.Literals.ECLASS));
	    readingAttacher.setTargetReferenceUri(
	    		(EReference) createProxy("https://civitas.org/meter/source/1.0.0#//IntermediateMeteringPoint/readings",
	    				EcorePackage.Literals.EREFERENCE));
	    readingAttacher.setForeignKeyFeatureUri((EAttribute) createProxy(
	    		"https://civitas.org/meter/source/1.0.0#//Reading/meterId", EcorePackage.Literals.EATTRIBUTE));
	    
	    pipeline.getSteps().add(readingAttacher);
	    
	    
	    QVTHandlerConfig meteringpointQvt = QvthandlerFactory.eINSTANCE.createQVTHandlerConfig();
	    meteringpointQvt.setId("meteringPointQVT");
	    meteringpointQvt.setPid("meteringPointQVT"); 
	    meteringpointQvt.setTrafo("(transformator.id=intMeteringPointToTargetMeteringPointQVT)");
	    meteringpointQvt.setEclassuri((EClass) createProxy("https://civitas.org/meter/source/1.0.0#//IntermediateMeteringPoint",
	    		EcorePackage.Literals.ECLASS));
	    
//		meteringpointQvt.getInputs().add(meterAttacher);
	    meteringpointQvt.getInputs().add(readingAttacher);
	    pipeline.getSteps().add(meteringpointQvt);
	    
//		EMFRepositoryDataSinkConfig meteringPointDataSink = DatasinkconfigFactory.eINSTANCE.createEMFRepositoryDataSinkConfig();
//		meteringPointDataSink.setRepoTarget("(repo_id=plantTarget)");
//		meteringPointDataSink.setId("plantDataSink");
//		meteringPointDataSink.setPid("plantDataSink");
//		meteringPointDataSink.getInputs().add(meteringpointQvt);
//		
//		pipeline.getSteps().add(meteringPointDataSink);
	    
	    EMFRepositoryDataSinkConfig plantDataSink = DatasinkconfigFactory.eINSTANCE.createEMFRepositoryDataSinkConfig();
	    plantDataSink.setRepoTarget("(repo_id=plantTarget)");
	    plantDataSink.setId("plantDataSink");
	    plantDataSink.setPid("plantDataSink");
	    plantDataSink.getInputs().add(plantQvt);
	    plantDataSink.getInputs().add(meteringpointQvt);
	    
	    pipeline.getSteps().add(plantDataSink);
	    
	    resource = set.createResource(URI.createURI("workspace/pipelines/meter.pipeline"));

	    resource.getContents().add(pipeline);

	    try {
		resource.save(null);
	    } catch (Exception e) {
		// TODO: handle exception
	    }
	}
	
	private void createGLTPipeline() {
		Pipeline pipeline = pPackage.getPipelineFactory().createPipeline();
		pipeline.setId("GLT_Pipeline");

	    MqttReceiverConfig mqttSensorReadings = MqttreceiverFactory.eINSTANCE.createMqttReceiverConfig();
	    mqttSensorReadings.setMqttTopic("#");
	    mqttSensorReadings.setPayloadEclassuri((EClass) createProxy("http://models.civitas.org/models/building/sensor/1.0#//SensorReading", EcorePackage.Literals.ECLASS));
	    mqttSensorReadings.setPid("SensorReadingReceiver");
	    mqttSensorReadings.setId("SensorReadingReceiver");
	    mqttSensorReadings.setMqttServiceTarget("(id=local)");
	    
	    pipeline.getSteps().add(mqttSensorReadings);
		
	    ScheduledLoaderConfig sourceBuildings = ScheduledloaderconfigFactory.eINSTANCE.createScheduledLoaderConfig();
	    sourceBuildings.setId("building-glt");
	    sourceBuildings.setPid("building-glt");
	    sourceBuildings.setLoaderName("building-glt");
	    sourceBuildings.setEclass(
	    		(EClass) createProxy("https://civitas.org/glt/1.0.0#//Building", EcorePackage.Literals.ECLASS));
	    sourceBuildings.setPackage((EPackage) createProxy("https://civitas.org/glt/1.0.0#/" ,EcorePackage.Literals.EPACKAGE));
	    sourceBuildings.setRepoTarget("(repo_id=assets)");
	    sourceBuildings.setScheduleInterval(60);
	    sourceBuildings.setInitialQuerySkip(0);
	    sourceBuildings.setQueryLimit(1000);
	    
	    pipeline.getSteps().add(sourceBuildings);
	    
//	    ScheduledLoaderConfig sourceContacts = ScheduledloaderconfigFactory.eINSTANCE.createScheduledLoaderConfig();
//	    sourceContacts.setId("contacts-glt");
//	    sourceContacts.setPid("contacts-glt");
//	    sourceContacts.setLoaderName("contacts-glt");
//	    sourceContacts.setEclass(
//	    		(EClass) createProxy("https://civitas.org/glt/1.0.0#//Contact", EcorePackage.Literals.ECLASS));
//	    sourceContacts.setPackage((EPackage) createProxy("https://civitas.org/glt/1.0.0#/" ,EcorePackage.Literals.EPACKAGE));
//	    sourceContacts.setRepoTarget("(repo_id=assets)");
//	    sourceContacts.setScheduleInterval(60);
//	    sourceContacts.setInitialQuerySkip(0);
//	    sourceContacts.setQueryLimit(1000);
//	    
//	    pipeline.getSteps().add(sourceContacts);

	    EMFAttacherHandlerConfig buildingAttacher = EmfattacherconfigFactory.eINSTANCE.createEMFAttacherHandlerConfig();
	    buildingAttacher.setId("reading_attacher");
	    buildingAttacher.setPid("reading_attacher");
	    buildingAttacher.setRepoTarget("(repo_id=inmem)");
	    buildingAttacher.getInputs().add(sourceBuildings);
	    buildingAttacher.setIncomingEClassUri((EClass) createProxy("https://civitas.org/glt/1.0.0#//Building",
	    		EcorePackage.Literals.ECLASS));
	    buildingAttacher.setTargetEClassUri((EClass) createProxy("https://civitas.org/glt/intermediate/1.0.0#//BuildingSensorReading",
	    		EcorePackage.Literals.ECLASS));
	    buildingAttacher.setTargetReferenceUri(
	    		(EReference) createProxy("https://civitas.org/glt/intermediate/1.0.0#//BuildingSensorReading/building",
	    				EcorePackage.Literals.EREFERENCE));
	    buildingAttacher.setForeignKeyFeatureUri((EAttribute) createProxy(
	    		"https://civitas.org/glt/1.0.0#//Building/id", EcorePackage.Literals.EATTRIBUTE));
	    
	    pipeline.getSteps().add(buildingAttacher);
	    
	    
	    EMFAttacherHandlerConfig sensorReadingAttacher = EmfattacherconfigFactory.eINSTANCE.createEMFAttacherHandlerConfig();
	    sensorReadingAttacher.setId("sensor_reading_attacher");
	    sensorReadingAttacher.setPid("sensor_reading_attacher");
	    sensorReadingAttacher.setRepoTarget("(repo_id=inmem)");
	    sensorReadingAttacher.getInputs().add(mqttSensorReadings);
	    sensorReadingAttacher.setIncomingEClassUri((EClass) createProxy("https://civitas.org/glt/sensor/1.0.0#//SensorReading",
	    		EcorePackage.Literals.ECLASS));
	    sensorReadingAttacher.setTargetEClassUri((EClass) createProxy("https://civitas.org/glt/intermediate/1.0.0#//BuildingSensorReading",
	    		EcorePackage.Literals.ECLASS));
	    sensorReadingAttacher.setTargetReferenceUri(
	    		(EReference) createProxy("https://civitas.org/glt/intermediate/1.0.0#//BuildingSensorReading/sensorReading",
	    				EcorePackage.Literals.EREFERENCE));
	    sensorReadingAttacher.setForeignKeyFeatureUri((EAttribute) createProxy(
	    		"https://civitas.org/glt/1.0.0#//SensorReading/buildingId", EcorePackage.Literals.EATTRIBUTE));
	    
	    pipeline.getSteps().add(sensorReadingAttacher);
	    
	    ValidationHandlerConfig validationSensorReadings = ValidationhandlerFactory.eINSTANCE.createValidationHandlerConfig();
	    validationSensorReadings.setId("sensor_validation");
	    validationSensorReadings.setPid("sensor_validation");
	    validationSensorReadings.setIncomingEClassUri((EClass) createProxy("https://civitas.org/glt/intermediate/1.0.0#//BuildingSensorReading",
	    		EcorePackage.Literals.ECLASS));
	    validationSensorReadings.setReferenceUriToBeValidated((EReference) createProxy("https://civitas.org/glt/intermediate/1.0.0#//BuildingSensorReading/sensorReading",
				EcorePackage.Literals.EREFERENCE));
	    validationSensorReadings.setAttributeUriToBeValidated((EAttribute) createProxy("https://civitas.org/glt/sensor/1.0.0#//SensorReading/value",
	    		EcorePackage.Literals.EATTRIBUTE));
	    validationSensorReadings.setThreshold(18.0);
	    validationSensorReadings.setValidationType("BELOW_THRESHOLD");
	    validationSensorReadings.getInputs().add(sensorReadingAttacher);
	    
	    pipeline.getSteps().add(validationSensorReadings);
	    
	    
	    QVTHandlerConfig simpleAlarmQVT = QvthandlerFactory.eINSTANCE.createQVTHandlerConfig();
	    simpleAlarmQVT.setId("simple_alarm_QVT");
	    simpleAlarmQVT.setPid("simple_alarm_QVT"); 
	    simpleAlarmQVT.setTrafo("(transformator.id=buildingSensorReadingToSimpleAlarmQVT)");
	    simpleAlarmQVT.setEclassuri((EClass) createProxy("https://civitas.org/glt/intermediate/1.0.0#//BuildingSensorReading",
	    		EcorePackage.Literals.ECLASS));
	    simpleAlarmQVT.getInputs().add(validationSensorReadings);

	    pipeline.getSteps().add(simpleAlarmQVT);
	    
	    
	    MqttEventHandlerConfig mqttHandler = MqtthandlerFactory.eINSTANCE.createMqttEventHandlerConfig();
	    mqttHandler.setId("AlarmMQTTHandler");
	    mqttHandler.setPid("AlarmMQTTHandler");
	    mqttHandler.getMqttTopics().add("glt/alarm");
	    mqttHandler.setMqttServiceTarget("(id=local)");
	    mqttHandler.setContentType("application/xmi");

	    mqttHandler.getInputs().add(simpleAlarmQVT);
	    pipeline.getSteps().add(mqttHandler);
	    
		resource = set.createResource(URI.createURI("workspace/pipelines/glt.pipeline"));
		
		resource.getContents().add(pipeline);
		
		try {
			resource.save(null);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private EObject createProxy(String uri, EClass eClass) {
		EObject eObject = EcoreUtil.create(eClass);
		((InternalEObject) eObject).eSetProxyURI(URI.createURI(uri));
		return eObject;
	}

}
