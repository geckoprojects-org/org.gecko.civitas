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
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.civitas.osgi.component.ComponentConfigPackage;
import org.civitas.osgi.component.Configuration;
import org.civitas.pipeline.Pipeline;
import org.civitas.pipeline.PipelinePackage;
import org.civitas.pipeline.PipelineStep;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.cm.annotations.RequireConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

/**
 * Pipeline Configurator component that transforms Pipeline models into OSGi
 * Configuration Admin configurations.
 *
 * This component: - Tracks Pipeline services and extracts Configuration and
 * PipelineStep objects - Transforms EMF model objects into Configuration Admin
 * configurations - Handles cleanup when pipelines are unregistered
 *
 * @author Juergen Albert
 * @since 27 Sept 2025
 */
@Component
@RequireConfigurationAdmin
public class PipelineConfigurator {

	private static final Logger logger = Logger.getLogger(PipelineConfigurator.class.getName());

	ConfigurationAdmin configAdmin;

	// Track pipelines and their created configurations for cleanup
	private final Map<Pipeline, List<org.osgi.service.cm.Configuration>> pipelineConfigurations = new ConcurrentHashMap<>();

	@Activate
	public PipelineConfigurator(@Reference ConfigurationAdmin configAdmin) {
		this.configAdmin = configAdmin;
	}

	@Deactivate
	public void deactivtate() {
		pipelineConfigurations.forEach((k, v) -> v.forEach(this::cleanupConfiguration));
	}

	private void cleanupConfiguration(org.osgi.service.cm.Configuration config) {
		try {
			config.delete();
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to configuration configurations for pipeline: " + config.getPid(), e);
		}
	}

	/**
	 * Called when a Pipeline service is registered.
	 */
	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY)
	void addPipeline(Pipeline pipeline) {
		logger.info("Pipeline registered: " + pipeline.getId());
		try {
			List<org.osgi.service.cm.Configuration> configurations = createConfigurationsForPipeline(pipeline);
			pipelineConfigurations.put(pipeline, configurations);
			logger.info("Created " + configurations.size() + " configurations for pipeline: " + pipeline.getId());
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Failed to create configurations for pipeline: " + pipeline.getId(), e);
		}
	}

	/**
	 * Called when a Pipeline service is unregistered.
	 */
	void removePipeline(Pipeline pipeline) {
		logger.info("Pipeline unregistered: " + pipeline.getId());
		try {
			List<org.osgi.service.cm.Configuration> configurations = pipelineConfigurations.remove(pipeline);
			if (configurations != null) {
				for (org.osgi.service.cm.Configuration config : configurations) {
					config.delete();
				}
				logger.info("Deleted " + configurations.size() + " configurations for pipeline: " + pipeline.getId());
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Failed to delete configurations for pipeline: " + pipeline.getId(), e);
		}
	}

	/**
	 * Creates Configuration Admin configurations for all Configuration and
	 * PipelineStep objects in the pipeline.
	 */
	private List<org.osgi.service.cm.Configuration> createConfigurationsForPipeline(Pipeline pipeline)
			throws IOException {
		List<org.osgi.service.cm.Configuration> configurations = new java.util.ArrayList<>();

		// Process components (Configuration objects)
		for (Configuration component : pipeline.getComponents()) {
			org.osgi.service.cm.Configuration config = createConfiguration(component, pipeline);
			if (config != null) {
				configurations.add(config);
			}
		}

		// Process steps (PipelineStep objects, which may also be Configuration objects)
		for (PipelineStep step : pipeline.getSteps()) {
			if (step instanceof Configuration) {
				org.osgi.service.cm.Configuration config = createConfiguration((Configuration) step, pipeline);
				if (config != null) {
					configurations.add(config);
				}
			}
		}

		return configurations;
	}

	/**
	 * Creates a Configuration Admin configuration from an EMF model object.
	 */
	private org.osgi.service.cm.Configuration createConfiguration(Configuration configuration, Pipeline pipeline)
			throws IOException {
		String factoryPid = configuration.eClass().getName();
		String instanceId = configuration.getPid();

		if (instanceId == null) {
			logger.warning("Skipping object without ID: " + configuration.eClass().getName());
			return null;
		}

		String pid = factoryPid + "~" + instanceId;
		org.osgi.service.cm.Configuration config = configAdmin.getFactoryConfiguration(factoryPid, instanceId, "?");

		Dictionary<String, Object> properties = new Hashtable<>();
		transformEObjectToProperties(configuration, properties, pipeline);

		config.update(properties);
		logger.fine("Created configuration: " + pid);

		return config;
	}

	/**
	 * Transforms an EMF model object into Configuration Admin properties.
	 */
	private void transformEObjectToProperties(Configuration configuration, Dictionary<String, Object> properties,
			Pipeline pipeline) {
		EClass eClass = configuration.eClass();

		// Process all structural features from all supertypes (except EObject)
		for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {
			if (feature.getEContainingClass().equals(org.eclipse.emf.ecore.EcorePackage.Literals.EOBJECT)) {
				continue; // Skip EObject attributes
			}

			if (configuration.eIsSet(feature)) {
				Object value = configuration.eGet(feature);

				String key = getPropertyKey(feature);

				if (feature instanceof EAttribute) {
					transformEAttribute((EAttribute) feature, value, key, properties);
				} else if (feature instanceof EReference) {
					transformEReference((EReference) feature, value, key, properties, configuration);
				}

			}
		}
	}

	/**
	 * Gets the property key for a structural feature, considering ExtendedMetadata
	 * annotations.
	 */
	private String getPropertyKey(EStructuralFeature feature) {
		EAnnotation extendedMetaData = feature.getEAnnotation("http:///org/eclipse/emf/ecore/util/ExtendedMetaData");
		if (extendedMetaData == null) {
			extendedMetaData = feature.getEAnnotation("http://www.eclipse.org/emf/2002/ExtendedMetaData");
		}
		if (extendedMetaData != null) {
			String name = extendedMetaData.getDetails().get("name");
			if (name != null && !name.isEmpty()) {
				return name;
			}
		}

		// Fall back to OSGi Component property types specification conversion
		return convertToOSGiPropertyName(feature.getName());
	}

	/**
	 * Converts camelCase feature names to OSGi property format (dots for
	 * separators).
	 */
	private String convertToOSGiPropertyName(String featureName) {
		// Convert camelCase to dot notation: camelCase -> camel.case
//        return featureName.replaceAll("([a-z])([A-Z])", "$1.$2").toLowerCase();
		return featureName;
	}

	/**
	 * Transforms an EAttribute to a Configuration Admin property.
	 */
	private void transformEAttribute(EAttribute attribute, Object value, String key,
			Dictionary<String, Object> properties) {
		// EAttributes become simple entries in the Configuration Dictionary
		properties.put(key, value);
		logger.fine("Added EAttribute: " + key + " = " + value);
	}

	/**
	 * Transforms an EReference to a Configuration Admin property.
	 */
	private void transformEReference(EReference reference, Object value, String key,
			Dictionary<String, Object> properties, Configuration configuration) {
		EClass targetType = reference.getEReferenceType();

		if (targetType.equals(org.eclipse.emf.ecore.EcorePackage.Literals.ECLASS)) {
			// EClass reference -> URI string
			transformEClassReference(reference, value, key, properties);
		} else if (targetType.equals(org.eclipse.emf.ecore.EcorePackage.Literals.EPACKAGE)) {
			// EPackage reference -> filter
			transformEPackageReference(reference, (EPackage) value, key, properties);
		} else if (targetType.getEAllSuperTypes().contains(PipelinePackage.Literals.PIPELINE_STEP)) {
			// PipelineStep reference -> topic string
			transformPipelineStepReference(reference, value, key, properties, (PipelineStep) configuration);
		} else if (targetType.getEAllSuperTypes().contains(ComponentConfigPackage.Literals.CONFIGURATION)) {
			// Configuration reference -> target filter
			transformConfigurationReference(reference, value, key, properties);
		} else {
			// Unknown reference type, treat as simple string
			properties.put(key, value.toString());
			logger.fine("Added unknown reference: " + key + " = " + value);
		}
	}

	/**
	 * Transforms EClass reference to URI string.
	 */
	private void transformEClassReference(EReference reference, Object value, String key,
			Dictionary<String, Object> properties) {
		if (value instanceof EClass) {
			EClass eClass = (EClass) value;
			String uri = EcoreUtil.getURI(eClass).toString();
			properties.put(key, uri);
			logger.fine("Added EClass reference: " + key + " = " + uri);
		}
	}

	/**
	 * Transforms EPackage reference to OSGi filter.
	 */
	private void transformEPackageReference(EReference reference, EPackage value, String key,
			Dictionary<String, Object> properties) {
		EPackage ePackage = (EPackage) value;
		String targetKey = key.endsWith(".target") ? key : key + ".target";
		String filter = "(emf.nsUri=" + ePackage.getNsURI() + ")";
		properties.put(targetKey, filter);
		logger.fine("Added EPackage reference: " + targetKey + " = " + filter);
	}

	/**
	 * Transforms Configuration reference to OSGi target filter.
	 */
	@SuppressWarnings("unchecked")
	private void transformConfigurationReference(EReference reference, Object value, String key,
			Dictionary<String, Object> properties) {
		String targetKey = key.endsWith(".target") ? key : key + ".target";

		if (reference.isMany() && value instanceof List) {
			// Many references -> OR filter
			List<EObject> configurations = (List<EObject>) value;
			StringBuilder filterBuilder = new StringBuilder();

			if (configurations.size() > 1) {
				filterBuilder.append("(|");
			}

			for (EObject config : configurations) {
				String id = EcoreUtil.getID(config);
				if (id != null) {
					filterBuilder.append("(service.pid=").append(config.eClass().getName()).append("~").append(id)
							.append(")");
				}
			}

			if (configurations.size() > 1) {
				filterBuilder.append(")");
			}

			properties.put(targetKey, filterBuilder.toString());
			logger.fine("Added Configuration reference (many): " + targetKey + " = " + filterBuilder.toString());
		} else if (value instanceof EObject) {
			// Single reference
			EObject config = (EObject) value;
			String id = EcoreUtil.getID(config);
			if (id != null) {
				String filter = "(service.pid=" + config.eClass().getName() + "~" + id + ")";
				properties.put(targetKey, filter);
				logger.fine("Added Configuration reference: " + targetKey + " = " + filter);
			}
		}
	}

	/**
	 * Transforms PipelineStep reference to event topic string.
	 */
	@SuppressWarnings("unchecked")
	private void transformPipelineStepReference(EReference reference, Object value, String key,
			Dictionary<String, Object> properties, PipelineStep pipelineStep) {
		if (reference.isMany() && value instanceof List) {
			// Many references -> List of topic strings
			List<EObject> steps = (List<EObject>) value;
			List<String> topics = new java.util.ArrayList<>();

			for (EObject step : steps) {
				String id = EcoreUtil.getID(step);
				if (id != null) {
					String topic = createTopic(pipelineStep, id, reference);
					topics.add(topic);
				}
			}

			properties.put(key, topics.toArray(new String[0]));
			logger.fine("Added PipelineStep reference (many): " + key + " = " + topics);
		} else if (value instanceof EObject) {
			// Single reference -> Single topic string
			EObject step = (EObject) value;
			String id = EcoreUtil.getID(step);
			if (id != null) {
				String topic = pipelineStep.getId() + "/" + reference.getName() + "/" + id;
				properties.put(key, topic);
				logger.fine("Added PipelineStep reference: " + key + " = " + topic);
			}
		}
	}

	/**
	 * @param pipelineStep
	 * @param id
	 * @param reference
	 * @return
	 */
	private String createTopic(PipelineStep pipelineStep, String otherSideId, EReference reference) {
		String pipelineId = ((Pipeline) pipelineStep.eContainer()).getId();
		String currentStepId = pipelineStep.getId();
		if (reference == PipelinePackage.Literals.DATA_SOURCE__OUTPUTS) {
			return pipelineId + "/" + currentStepId + "/" + otherSideId;
		} else {
			return pipelineId + "/" + otherSideId + "/" + currentStepId;
		}
	}
}
