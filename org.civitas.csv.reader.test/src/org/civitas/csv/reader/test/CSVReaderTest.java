/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
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
package org.civitas.csv.reader.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.civitas.csv.reader.api.CSVReaderService;
//import org.civitas.meter.source.model.metersource.BasicData;
//import org.civitas.meter.source.model.metersource.MeterSourcePackage;
//import org.civitas.meter.source.model.metersource.OperatingData;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fennec.codec.csv.resource.CSVResourceFactory;
import org.gecko.emf.osgi.annotation.require.RequireEMF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.annotation.Property;
import org.osgi.test.common.annotation.config.WithFactoryConfiguration;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;

/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@RequireEMF
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
//@ExtendWith(MockitoExtension.class)
public class CSVReaderTest {

	//	@Mock
	//	TestInterface test;

	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx) {

	}

	@WithFactoryConfiguration(factoryPid = "DefaultObjectMapperConfigurator", location = "?", name = "csv", properties = {
			@Property(key = "type", value="csv"),
			@Property(key = "codecFactoryConfigurator.target", value="(type=csv)")
	})
	@WithFactoryConfiguration(factoryPid = "DefaultCodecModuleConfigurator", location = "?", name = "csv")
	@Test
	public void testBasicData(
			@InjectService(cardinality = 0) ServiceAware<CSVResourceFactory> csvRFAware, @InjectService ResourceSet rs,
			@InjectService ServiceAware<CSVReaderService> csvReaderAware)
	{
		CSVResourceFactory csvRF = null;
		try {
			csvRF = csvRFAware.waitForService(5000l);
		} catch (InterruptedException e) {
			fail("Retrieven CSV ResourceFactory failed with timeout after 5 secs", e);
		}
		assertNotNull(csvRF);

		CSVReaderService csvReader = null;
		try {
			csvReader = csvReaderAware.waitForService(5000l);
		} catch (InterruptedException e) {
			fail("Retrieven CSVReaderService failed with timeout after 5 secs", e);
		}
		assertNotNull(csvReader);

//		List<EObject> results = csvReader.loadEObjectsFromCSV(System.getProperty("data")+"basic_data_2025_09_23_11_45.csv", MeterSourcePackage.eINSTANCE.getBasicData());
//		assertThat(results).hasSize(20);
//		for(EObject result : results) {
//			BasicData basicData = (BasicData) result;
//			assertNotNull(basicData.getPlantId());
//			assertNotNull(basicData.getCity());
//			assertNotNull(basicData.getZip());
//			assertNotNull(basicData.getStreet());
//			assertNotNull(basicData.getType());
//		}
	}

	@WithFactoryConfiguration(factoryPid = "DefaultObjectMapperConfigurator", location = "?", name = "csv", properties = {
			@Property(key = "type", value="csv"),
			@Property(key = "codecFactoryConfigurator.target", value="(type=csv)")
	})
	@WithFactoryConfiguration(factoryPid = "DefaultCodecModuleConfigurator", location = "?", name = "csv")
	@Test
	public void testOperatingData(
			@InjectService(cardinality = 0) ServiceAware<CSVResourceFactory> csvRFAware, @InjectService ResourceSet rs,
			@InjectService ServiceAware<CSVReaderService> csvReaderAware)
	{
		CSVResourceFactory csvRF = null;
		try {
			csvRF = csvRFAware.waitForService(5000l);
		} catch (InterruptedException e) {
			fail("Retrieven CSV ResourceFactory failed with timeout after 5 secs", e);
		}
		assertNotNull(csvRF);

		CSVReaderService csvReader = null;
		try {
			csvReader = csvReaderAware.waitForService(5000l);
		} catch (InterruptedException e) {
			fail("Retrieven CSVReaderService failed with timeout after 5 secs", e);
		}
		assertNotNull(csvReader);
		
//		List<EObject> results = csvReader.loadEObjectsFromCSV(System.getProperty("data")+"operating_data_2025_09_23_12_23.csv", MeterSourcePackage.eINSTANCE.getOperatingData());
//		assertThat(results).hasSize(20);
//		for(EObject result : results) {
//			OperatingData basicData = (OperatingData) result;
//			assertNotNull(basicData.getPlantId());
//			assertNotNull(basicData.getOperatingHours());
//			assertNotNull(basicData.getId());
//		}

	}

}
