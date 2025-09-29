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
package org.civitas.handler.emf.repository.datasink;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.civitas.handler.emf.repository.datasink.EMFRepositoryDataSink.Config.MergeStrategy;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.typedevent.TypedEventHandler;

/**
 * EMFRepositoryDataSink is a TypedEventHandler that receives EObject events and persists them to an EMF repository.
 *
 * This component acts as a data sink for EObjects published via OSGi TypedEventBus, providing persistent storage
 * with configurable merge strategies when objects already exist in the repository.
 *
 * <h3>Key Features:</h3>
 * <ul>
 *   <li><b>Event-Driven Persistence</b>: Automatically saves EObjects received from configured event topics</li>
 *   <li><b>Merge Strategies</b>: Configurable handling of existing objects (overwrite vs. merge)</li>
 *   <li><b>Repository Integration</b>: Uses EMF Repository for persistent storage with proper ID-based lookups</li>
 *   <li><b>Type Safety</b>: Strongly typed event handling with EObject instances</li>
 * </ul>
 *
 * <h3>Configuration:</h3>
 * The component requires OSGi configuration with the following properties:
 * <p><strong>Note:</strong> In OSGi Configuration Admin, underscore characters in annotation attributes
 * are automatically converted to dots in the actual configuration properties.</p>
 * <ul>
 *   <li><code>event.topic</code>: The OSGi event topic to listen to for EObject events</li>
 *   <li><code>repo.target</code>: OSGi filter to target the specific EMF Repository instance</li>
 *   <li><code>merger.strategy</code>: Strategy for handling existing objects (OVERWRITE, MERGE_INTO_IGNORE_UNSET)</li>
 *   <li><code>detailed.logging</code>: Enable verbose logging for debugging and monitoring</li>
 * </ul>
 *
 * <h3>Merge Strategies:</h3>
 * <ul>
 *   <li><b>OVERWRITE</b>: Completely replace existing objects with new data</li>
 *   <li><b>MERGE_INTO_IGNORE_UNSET</b>: Merge new data into existing objects, preserving unset attributes</li>
 * </ul>
 *
 * <h3>Usage Example:</h3>
 * <pre>
 * // Configuration in OSGi Configurator format:
 * {
 *   "EMFRepositoryDataSink~meter-data": {
 *     "event.topic": "org/civitas/meter/data/parsed",
 *     "repo.target": "(repository.name=meter-repository)",
 *     "merger.strategy": "MERGE_INTO_IGNORE_UNSET",
 *     "detailed.logging": true
 *   }
 * }
 * </pre>
 *
 * @author Juergen Albert
 * @author Data In Motion
 * @since Sep 24, 2025
 */
@Designate(ocd = EMFRepositoryDataSink.Config.class)
@Component(name = "EMFRepositoryDataSink", configurationPid = "EMFRepositoryDataSinkConfig", configurationPolicy = ConfigurationPolicy.REQUIRE, scope = ServiceScope.PROTOTYPE)
public class EMFRepositoryDataSink implements TypedEventHandler<EObject> {

    /**
     * Configuration interface for EMFRepositoryDataSink component.
     * Defines the configuration properties needed to configure event handling and persistence behavior.
     */
    @ObjectClassDefinition(name = "EMF Repository Data Sink Configuration",
                          description = "Configuration for EMF Repository Data Sink that persists EObjects from event topics")
    @interface Config {

        /**
         * Enumeration defining merge strategies for handling existing objects in the repository.
         */
        enum MergeStrategy {
            /** Completely overwrite existing objects with incoming data */
            OVERWRITE,
            /** Merge incoming data into existing objects, ignoring unset attributes */
            MERGE_INTO_IGNORE_UNSET
        }

        @AttributeDefinition(name = "Event Topics",
                           description = "The OSGi event topic to listen to for EObject events (e.g., 'org/civitas/meter/data/parsed')")
        String event_topics();

        @AttributeDefinition(name = "Repository Target",
                           description = "OSGi filter to target the specific EMF Repository instance (e.g., '(repository.name=meter-repository)')")
        String repo_target();

        @AttributeDefinition(name = "Merge Strategy",
                           description = "Strategy for handling existing objects: OVERWRITE (replace completely) or MERGE_INTO_IGNORE_UNSET (merge preserving unset attributes)",
                           defaultValue = "MERGE_INTO_IGNORE_UNSET")
        MergeStrategy merger_strategy() default MergeStrategy.MERGE_INTO_IGNORE_UNSET;

        @AttributeDefinition(name = "Enable Detailed Logging",
                           description = "Enable detailed logging for debugging and monitoring purposes",
                           defaultValue = "false")
        boolean detailed_logging() default false;
    }

    private static class MergeCopier extends Copier {
	/**
	 * Returns a copy of the given eObject.
	 * 
	 * @param eObject the object to copy.
	 * @return the copy.
	 */
	public void copyInto(EObject source, EObject target) {
	    if (source == null) {
		return;
	    } else {
		if (target != null) {
		    put(source, target);
		    EClass eClass = source.eClass();
		    for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
			EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
			if (eStructuralFeature.isChangeable() && !eStructuralFeature.isDerived()) {
			    if (eStructuralFeature instanceof EAttribute) {
				copyAttribute((EAttribute) eStructuralFeature, source, target);
			    } else {
				EReference eReference = (EReference) eStructuralFeature;
				if (eReference.isContainment()) {
				    copyContainment(eReference, source, target);
				}
			    }
			}
		    }

		    copyProxyURI(source, target);
		}
	    }
	}

	/**
	 * Called to handle the copying of a containment feature; this adds a list of
	 * copies or sets a single copy as appropriate for the multiplicity.
	 * 
	 * @param eReference  the feature to copy.
	 * @param eObject     the object from which to copy.
	 * @param copyEObject the object to copy to.
	 */
	@SuppressWarnings("unchecked")
	protected void copyContainment(EReference eReference, EObject eObject, EObject copyEObject) {
	    if (eObject.eIsSet(eReference)) {
		EStructuralFeature.Setting setting = getTarget(eReference, eObject, copyEObject);
		if (setting != null) {
		    Object value = eObject.eGet(eReference);
		    if (eReference.isMany()) {
			List<EObject> target = (List<EObject>) value;
			List<EObject> fullList =  new ArrayList<>((List<EObject>) copyEObject.eGet(eReference));
			fullList.addAll(copyAll(target));
			setting.set(fullList);
		    } else {
			setting.set(copy((EObject) value));
		    }
		}
	    }
	}
    }

    private static final Logger LOGGER = Logger.getLogger(EMFRepositoryDataSink.class.getName());

    @Reference(name = "repo", target = "(&(needs_configuration=true)(must_not_resolve=true)(must_not_resolve=false))")
    EMFRepository repository;

    private Config config;

    @Activate
    public EMFRepositoryDataSink(Config config) {
        this.config = config;
        LOGGER.info("EMFRepositoryDataSink activated - Topic: '" + config.event_topics() +
                   "', Repository Target: '" + config.repo_target() +
                   "', Merge Strategy: " + config.merger_strategy() +
                   ", Detailed Logging: " + config.detailed_logging());
    }

    /**
     * TypedEventHandler interface implementation that receives EObject events from the configured topic.
     * This method is called automatically by the OSGi TypedEventBus when events are published to the configured topic.
     *
     * @param topic The event topic from which the event was received
     * @param event The EObject event data to be persisted
     */
    @Override
    public void notify(String topic, EObject event) {
        if (config.detailed_logging()) {
            LOGGER.info("Received event on topic '" + topic + "' for EObject type: " +
                       event.eClass().getName() + " with ID: " + EcoreUtil.getID(event));
        }

        try {
            handleEvent(event);

            if (config.detailed_logging()) {
                LOGGER.fine("Successfully processed event for EObject ID: " + EcoreUtil.getID(event));
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Failed to process event for EObject type: " + event.eClass().getName() +
                      " with ID: " + EcoreUtil.getID(event), e);
        }
    }

    /**
     * Handles the persistence of an incoming EObject to the repository.
     * Applies the configured merge strategy when an object with the same ID already exists.
     *
     * @param incoming The EObject to be persisted
     * @throws IllegalArgumentException if the incoming EObject has no ID
     * @throws RuntimeException if repository operations fail
     */
    void handleEvent(EObject incoming) {
        String objectId = EcoreUtil.getID(incoming);
        if (objectId == null) {
            LOGGER.warning("Received EObject without ID, skipping persistence: " + incoming.eClass().getName());
            return;
        }

        if (config.detailed_logging()) {
            LOGGER.info("Processing EObject - Type: " + incoming.eClass().getName() +
                       ", ID: " + objectId + ", Merge Strategy: " + config.merger_strategy());
        }

        try {
            EObject existingObject = repository.getEObject(incoming.eClass(), objectId);

            EObject toSave;
            if (existingObject != null) {
                if (config.merger_strategy() == MergeStrategy.MERGE_INTO_IGNORE_UNSET) {
                    LOGGER.info("Merging incoming data into existing object with ID: " + objectId);
                    new MergeCopier().copyInto(incoming, existingObject);
                    toSave = existingObject;
                } else {
                    LOGGER.info("Overwriting existing object with ID: " + objectId);
                    toSave = incoming;
                }
            } else {
                LOGGER.info("Creating new object with ID: " + objectId);
                toSave = incoming;
            }

            repository.save(toSave);

            if (config.detailed_logging()) {
                LOGGER.info("Successfully saved EObject - Type: " + toSave.eClass().getName() +
                           ", ID: " + EcoreUtil.getID(toSave) + ", Strategy: " + config.merger_strategy());
            }

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Repository operation failed for EObject ID: " + objectId +
                      ", Type: " + incoming.eClass().getName(), e);
            throw new RuntimeException("Failed to persist EObject with ID: " + objectId, e);
        }
    }
}
