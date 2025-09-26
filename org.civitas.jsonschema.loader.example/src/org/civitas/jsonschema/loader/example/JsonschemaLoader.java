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
package org.civitas.jsonschema.loader.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fennec.codec.configurator.ObjectMapperConfigurator;
import org.eclipse.fennec.codec.options.CodecModelInfoOptions;
import org.eclipse.fennec.codec.options.CodecModuleOptions;
import org.eclipse.fennec.codec.options.CodecResourceOptions;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

@Component(immediate = true, name = "JsonschamaLoader")
public class JsonschemaLoader {

	private static final Logger LOGGER = Logger.getLogger(JsonschemaLoader.class.getName());
	private ResourceSet resourceSet;

	@Activate
	public JsonschemaLoader(
			@Reference(cardinality = ReferenceCardinality.MANDATORY, target = "(serializers.target=(component.name=JsonSchemaCodecEMFSerializers))") ObjectMapperConfigurator objMapperConfigurator,
			@Reference(cardinality = ReferenceCardinality.MANDATORY, target = "("+EMFNamespaces.EMF_CONFIGURATOR_NAME + "=CodecJson)") ResourceSet resourceSet) {
				this.resourceSet = resourceSet;
		try {
			loadJsonschema(System.getProperty("data")+"meter-reading.json");
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, String.format("IOException while parsing jsonschema from file %s",System.getProperty("data")+"meter-reading.json"), e);
		}
	}
	
	public void loadJsonschema(String pathToJsonschemaFile) throws IOException {
		Resource res = resourceSet.createResource(URI.createURI(pathToJsonschemaFile));
		Map<String, Object> options = new HashMap<>();
		options.put(CodecResourceOptions.CODEC_ROOT_OBJECT, EcorePackage.Literals.EPACKAGE);
		options.put(CodecModuleOptions.CODEC_MODULE_SERIALIZE_TYPE, false);
		options.put(CodecModuleOptions.CODEC_MODULE_SERIALIZE_EMPTY_VALUE, true);
		options.put(CodecModuleOptions.CODEC_MODULE_SERIALIZE_NULL_VALUE, true);
		Map<String, Object> classOptions = new HashMap<>();
		classOptions.put(CodecModelInfoOptions.CODEC_EXTRAS, Map.of("jsonschema", "true", "jsonschema.feature.key", "definitions"));
		options.put(CodecResourceOptions.CODEC_OPTIONS, Map.of(EcorePackage.Literals.EPACKAGE, classOptions));
		
		res.load(options);		
		if(res.getContents().isEmpty()) {
			LOGGER.warning(String.format("No content loaded for %s", pathToJsonschemaFile));
			return;
		}
		EObject obj = res.getContents().get(0);
		if(obj == null) {
			LOGGER.warning(String.format("Null content loaded for %s", pathToJsonschemaFile));
			return;
		}
		if(obj instanceof EPackage ePackage) {
			res = resourceSet.createResource(URI.createURI(UUID.randomUUID().toString()+".ecore"));
			res.getContents().add(ePackage);
			res.save(options);
		} else {
			LOGGER.warning(String.format("Content loaded from %s is not of type EPackage", pathToJsonschemaFile));
			return;
		}
		
		
	}

}
