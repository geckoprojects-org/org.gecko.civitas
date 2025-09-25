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
package org.civitas.example.integration;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.typedevent.TypedEventBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example integration showing how to publish EObjects to the EMFRepositoryDataSink.
 *
 * This example demonstrates:
 * 1. Publishing EObjects to event topics for persistence
 * 2. Integration with TypedEventBus
 * 3. Proper ID assignment for repository storage
 */
@Component(immediate = true)
public class EMFRepositoryDataSinkIntegrationExample {

    private static final Logger LOGGER = LoggerFactory.getLogger(EMFRepositoryDataSinkIntegrationExample.class);

    @Reference
    private TypedEventBus typedEventBus;

    /**
     * Example method showing how to publish an EObject to be persisted by EMFRepositoryDataSink.
     *
     * Prerequisites:
     * 1. EMFRepositoryDataSink must be configured to listen to the target topic
     * 2. EObject must have an ID set (using EcoreUtil.setID())
     * 3. Appropriate EMF Repository must be available and configured
     *
     * @param dataObject The EObject to persist
     * @param topicName The event topic to publish to (must match DataSink configuration)
     */
    public void publishDataForPersistence(EObject dataObject, String topicName) {
        // Ensure the object has an ID for repository storage
        if (EcoreUtil.getID(dataObject) == null) {
            String generatedId = generateUniqueId(dataObject);
            EcoreUtil.setID(dataObject, generatedId);
            LOGGER.info("Generated ID '{}' for EObject of type: {}", generatedId, dataObject.eClass().getName());
        }

        try {
            // Publish the EObject to the specified topic
            // The EMFRepositoryDataSink listening to this topic will automatically persist it
            typedEventBus.deliver(topicName, dataObject);

            LOGGER.info("Published EObject to topic '{}' - Type: {}, ID: {}",
                       topicName, dataObject.eClass().getName(), EcoreUtil.getID(dataObject));

        } catch (Exception e) {
            LOGGER.error("Failed to publish EObject to topic: " + topicName, e);
            throw new RuntimeException("Event publication failed", e);
        }
    }

    /**
     * Example usage for meter data persistence.
     */
    public void persistMeterData(EObject meterReading) {
        // This will be handled by the EMFRepositoryDataSink configured for meter data
        publishDataForPersistence(meterReading, "org/civitas/meter/data/parsed");
    }

    /**
     * Example usage for sensor data persistence.
     */
    public void persistSensorData(EObject sensorReading) {
        // This will be handled by the EMFRepositoryDataSink configured for sensor data
        publishDataForPersistence(sensorReading, "org/civitas/sensor/data/parsed");
    }

    /**
     * Example usage for batch data persistence.
     */
    public void persistBatchData(java.util.List<EObject> dataObjects, String topicName) {
        for (EObject obj : dataObjects) {
            publishDataForPersistence(obj, topicName);
        }
        LOGGER.info("Published {} objects to topic: {}", dataObjects.size(), topicName);
    }

    /**
     * Generate a unique ID for an EObject.
     * In production, you might use UUIDs, timestamps, or domain-specific ID generation.
     */
    private String generateUniqueId(EObject object) {
        return object.eClass().getName() + "_" + System.currentTimeMillis() + "_" +
               Integer.toHexString(object.hashCode());
    }
}