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
package org.civitas.minio.example;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.typedevent.annotations.EventTopics;
import org.osgi.service.typedevent.TypedEventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example event handler that receives parsed EObjects from MinIOCSVDownloadService.
 *
 * This component listens to the "org/civitas/meter/data/parsed" topic and processes
 * any EObject events published by the MinIO CSV download service.
 */
@Component(immediate = true)
@EventTopics("org/civitas/meter/data/parsed")
public class ExampleEventHandler implements TypedEventHandler<EObject> {

    private static final Logger logger = LoggerFactory.getLogger(ExampleEventHandler.class);

    @Override
    public void notify(String topic, EObject eObject) {
        logger.info("Received EObject event on topic '{}': Type={}, Object={}",
                   topic, eObject.eClass().getName(), eObject.toString());

        // Example processing based on EClass type
        switch (eObject.eClass().getName()) {
            case "Meter":
                processMeterData(eObject);
                break;
            case "Customer":
                processCustomerData(eObject);
                break;
            case "Reading":
                processReadingData(eObject);
                break;
            default:
                logger.info("Unknown EObject type: {}", eObject.eClass().getName());
        }
    }

    private void processMeterData(EObject meter) {
        logger.info("Processing meter data: {}", meter);
        // Add your meter-specific processing logic here
    }

    private void processCustomerData(EObject customer) {
        logger.info("Processing customer data: {}", customer);
        // Add your customer-specific processing logic here
    }

    private void processReadingData(EObject reading) {
        logger.info("Processing reading data: {}", reading);
        // Add your reading-specific processing logic here
    }
}