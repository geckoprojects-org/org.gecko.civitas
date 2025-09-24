/*
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
 *      Mark Hoffmann - initial API and implementation
 */
package org.civitas.minio.impl;

import java.io.InputStream;
import java.net.URI;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.civitas.csv.reader.api.CSVReaderService;
import org.civitas.minio.MinIOClient;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.minio.Result;
import io.minio.messages.Item;

@Component(name="MinIOCSVDownloadService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class MinIOCSVDownloadService {
    
    private Logger logger = LoggerFactory.getLogger(MinIOCSVDownloadService.class);

    private Config config;
    private EClass targetEClass;
    private Set<String> visitedFiles = new HashSet<>();
    private ScheduledFuture<?> scheduledTask;
    
    @ObjectClassDefinition(name = "MinIO Downloader Configuration")
    public @interface Config {

      @AttributeDefinition(name = "Bucketname", description = "The designation of the minio Bucket to use")
      String bucketname() ;

      @AttributeDefinition(name = "The cron expression to schedule", description = "MinIO access key")
      String cron() default "* * * * *";

      @AttributeDefinition(name = "Filter", description = "MinIO Client Filter")
      String client_target();

      @AttributeDefinition(name = "EClassUri", description = "The URI of the EClass to expect")
      String eClassUri();
    }
    
    @Reference(name="client")
    private MinIOClient minioClient;
    
    @Reference
    CSVReaderService reader;

    
    
    @Reference(target = "(" + EMFNamespaces.EMF_MODEL_NSURI +"=https://civitas.org/meter/source/1.0.0)")
    EPackage ePackage;
    
    @Activate
    void activate(Config config) {
        this.config = config;

        try {
            // Extract the required EClass from the injected EPackage
            this.targetEClass = extractEClassFromPackage(config.eClassUri());

            // Process initial files
            processFilesInBucket();

            // Start scheduler for periodic checking
            startScheduler();

        } catch (Exception e) {
            logger.error("Error during activation", e);
        }
    }

    @Deactivate
    void deactivate() {
        if (scheduledTask != null && !scheduledTask.isCancelled()) {
            scheduledTask.cancel(true);
        }
    }
    
    private EClass extractEClassFromPackage(String eClassUri) {
        if (ePackage == null) {
            throw new IllegalStateException("EPackage not injected");
        }
        URI uri = URI.create(eClassUri);
        EClassifier classifier = (EClassifier) ePackage.eResource().getEObject(uri.getFragment());
        if (classifier instanceof EClass) {
            logger.info("Extracted EClass: {} from package: {}", eClassUri, ePackage.getNsURI());
            return (EClass) classifier;
        } else {
            throw new IllegalArgumentException("No EClass found for URI: " + eClassUri);
        }
    }

    private void processFilesInBucket() {
        try {
            String bucketName = config.bucketname();

            // Iterate over files in the bucket
            Iterable<Result<Item>> objects = minioClient.listObjects(bucketName);

            for (Result<Item> result : objects) {
                Item item = result.get();
                String fileName = item.objectName();

                // Only process files we haven't visited and that are CSV files
                if (!visitedFiles.contains(fileName) && fileName.toLowerCase().endsWith(".csv")) {
                    processCSVFile(bucketName, fileName);
                }
            }

        } catch (Exception e) {
            logger.error("Error processing files in bucket", e);
        }
    }

    private void processCSVFile(String bucketName, String fileName) {
        try (InputStream inputStream = minioClient.getObject(bucketName, fileName)) {

            // Parse CSV using the referenced CSVReader
            List<EObject> parsedObjects = reader.loadEObjects(inputStream, targetEClass);

            // Print out the parsed EObjects (as specified in the requirement)
            printParsedEObjects(fileName, parsedObjects);

            // Store the parsed filename in the visited list
            visitedFiles.add(fileName);

            logger.info("Successfully processed file: {} with {} objects", fileName, parsedObjects.size());

        } catch (Exception e) {
            logger.error("Error processing CSV file: {}", fileName, e);
        }
    }

    private void printParsedEObjects(String fileName, List<EObject> objects) {
        logger.info("=== Parsed objects from file: {} ===", fileName);
        for (int i = 0; i < objects.size(); i++) {
            EObject obj = objects.get(i);
            logger.info("Object {}: Type={}, toString={}", i + 1, obj.eClass().getName(), obj.toString());
        }
        logger.info("=== End of parsed objects from file: {} ===", fileName);
    }

    private void startScheduler() {
        String cronExpression = config.cron();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        // For simplicity, we'll use a fixed rate scheduler
        // In a real implementation, you might want to use a proper cron scheduler
        scheduledTask = scheduledExecutorService.scheduleAtFixedRate(
            this::checkForNewFiles,
            60, // Initial delay: 1 minute
            60, // Period: 1 minute
            TimeUnit.SECONDS
        );

        logger.info("Started scheduler with cron expression: {}", cronExpression);
    }

    private void checkForNewFiles() {
        logger.debug("Checking for new files...");
        processFilesInBucket();
    }
}