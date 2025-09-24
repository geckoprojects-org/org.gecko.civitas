/*
 * Example Event Handler for MinIO CSV Download Service
 *
 * This is an example of how to create an event handler to receive
 * the parsed EObjects from the MinIOCSVDownloadService.
 */
package org.civitas.minio.example;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.typedevent.TypedEventHandler;
import org.osgi.service.typedevent.propertytypes.EventTopics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example event handler that receives parsed EObjects from MinIOCSVDownloadService.
 *
 * This component listens to the "org/civitas/meter/data/parsed" topic and processes
 * any EObject events published by the MinIO CSV download service.
 */
@Component
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