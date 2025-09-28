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
package org.civitas.handler.emf.repository.datasink.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.net.URL;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.osgi.annotation.require.RequireEMF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.annotation.Property;
import org.osgi.test.common.annotation.Property.Scalar;
import org.osgi.test.common.annotation.Property.Type;
import org.osgi.test.common.annotation.config.WithFactoryConfiguration;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;
import org.osgi.service.typedevent.TypedEventHandler;

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
//@ExtendWith(MockitoExtension.class)
public class ExampleTest {
	
//	@Mock
//	TestInterface test;
	private EObject plant = null;
	
	@BeforeEach
	public void before(@InjectBundleContext BundleContext ctx, @InjectService(filter = "(emf.name=target)") ResourceSet rs ) {
		assertNotNull(rs);
		URL plantXMI = ctx.getBundle().getEntry("/data/Plant.xmi");
		Resource resource = rs.createResource(URI.createURI(UUID.randomUUID().toString() + ".xmi"));
		try {
			resource.load(plantXMI.openStream(), null);
			assertFalse(resource.getContents().isEmpty());
			plant = resource.getContents().get(0);
			assertNotNull(plant);
		} catch (IOException e) {
			fail("Cannot load plant XMI", e);
		}
	}
	
	// Database connection must be defined
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@WithFactoryConfiguration(factoryPid = "daanse.jdbc.datasource.postgresql.DataSource", location = "?", name = "plant", properties = {
			@Property(key = "name", value = "plantTarget"),
			@Property(key = "user", value = "postgres"),
			@Property(key = ".password", value = "postgres"),
			@Property(key = "dbname", value = "plant_readings"),
			@Property(key = "ports", scalar = Scalar.Integer, value = "5432"),
			@Property(key = "host", value = "localhost")
	})
	// Can be auto generated. Only the link / target to the model is needed
	@WithFactoryConfiguration(factoryPid = "fennec.jpa.EORMMappingService", location = "?", name = "plant", properties = {
			@Property(key = "fennec.jpa.eorm.mappingName", value = "plant"),
			@Property(key = "fennec.jpa.eorm.strict", scalar = Scalar.Boolean, value = "true"),
			@Property(key = "fennec.jpa.eorm.model.target", value = "(emf.name=target)"),
			@Property(key = "fennec.jpa.eorm.eClasses", type = Type.Array, scalar = Scalar.String, value = {"Plant", "Parts", "Net", "OperatingData", "MeteringPoint", "MeterReading", "Meter"})
	})
	// Just an assignment from model / mapping to data source is needed
	@WithFactoryConfiguration(factoryPid = "fennec.jpa.EMPersistenceUnit", location = "?", name = "plant", properties = {
			@Property(key = "fennec.jpa.ext.eclipselink.target-database", value = "PostgreSQL"),
			@Property(key = "fennec.jpa.ext.eclipselink.ddl-generation", value = "create-or-extend-tables"),
			@Property(key = "fennec.jpa.dataSource.target", value = "(name=plantTarget)"),
			@Property(key = "fennec.jpa.mapping.target", value = "(fennec.jpa.eorm.mapping=plant)"),
			@Property(key = "fennec.jpa.persistenceUnitName", value = "plantTarget")
	})
	// Can be directly auto-configured out of the persistence unit 
	@WithFactoryConfiguration(factoryPid = "fennec.jpa.JPARepository", location = "?", name = "plant", properties = {
			@Property(key = "repo_id", value = "plantTarget"),
			@Property(key = "base_uri", value = "plantTarget"),
			@Property(key = "entityManager.target", value = "(osgi.unit.name=plantTarget)")
	})
	// Can be directly auto-configured out of the persistence unit linked together with a topic 
	@WithFactoryConfiguration(factoryPid = "EMFRepositoryDataSinkConfig", location = "?", name = "plant", properties = {
			@Property(key = "repo_target", value = "test_topic"),
			@Property(key = "event_topics", value = "test_topic"),
			@Property(key = "name", value = "test"),
			@Property(key = "repo.target", value = "(repo_id=plantTarget)")
	})
	@Test
	@Disabled
	public void test(@InjectService(timeout = 5000l, filter = "(name=test)") ServiceAware<TypedEventHandler> handlerAware) {
		assertFalse(handlerAware.isEmpty());
		assertNotNull(plant);
		handlerAware.getService().notify("test_topic", plant);
		EObject plantCopy = EcoreUtil.copy(plant);
		EStructuralFeature cityFeature = plantCopy.eClass().getEStructuralFeature("city");
		plantCopy.eSet(cityFeature, "Schlumpfhausen");
		handlerAware.getService().notify("test_topic", plantCopy);
		
		
	}

}
