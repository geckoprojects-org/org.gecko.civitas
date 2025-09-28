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
package org.civitas.db.loader;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.typedevent.TypedEventBus;

/**
 * Generic scheduled loader for any EObject type from any EMF repository.
 * This single component replaces all the individual loader components by being
 * configurable for different data sources, repositories, and EClass types.
 *
 * @author mark
 * @since 26.09.2025
 */
@Designate(ocd = ScheduledLoaderConfig.class)
@Component(name = "GenericScheduledLoader", configurationPid = "ScheduledLoaderConfig", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class GenericScheduledLoader {

	private static final Logger LOGGER = Logger.getLogger(GenericScheduledLoader.class.getName());

	@Reference
	private TypedEventBus typedEventBus;

	// These will be set dynamically based on configuration
	@Reference(name="repo", target = "(&(needs_configuration=true)(must_not_resolve=true)(must_not_resolve=false))")
	private EMFRepository repository;
	@Reference(name="package", target="(&(needs_configuration=true)(must_not_resolve=true)(must_not_resolve=false))")
	private EPackage ePackage;

	private ScheduledExecutorService scheduler;
	private ScheduledFuture<?> scheduledTask;
	private ScheduledLoaderConfig config;
	private volatile boolean running = false;
	private EClass eClass;
	private volatile long currentOffset;

	@Activate
	public void activate(ScheduledLoaderConfig config) {
		this.config = config;
		currentOffset = config.initial_query_skip();
		// Get the EClass from the package
		URI eClassURI = URI.create(config.eclass());
		eClass = (EClass) ePackage.eResource().getEObject(eClassURI.getFragment());
		if (eClass == null) {
			throw new IllegalArgumentException("EClass '" + config.eclass() + "' not found in package: " + ePackage.getName());
		}


		scheduler = Executors.newSingleThreadScheduledExecutor(r -> {
			Thread t = new Thread(r, "GenericScheduledLoader-" + config.loader_name());
			t.setDaemon(true);
			return t;
		});

		startScheduledLoading();
		LOGGER.info("Generic Scheduled Loader '" + config.loader_name() + "' activated: repository=" + config.repo_target() +
				   ", eClass=" + config.eclass() + ", interval=" + config.schedule_interval() + "s, offset=" + config.initial_query_skip());
	}

	@Deactivate
	public void deactivate() {
		running = false;
		if (scheduledTask != null) {
			scheduledTask.cancel(true);
		}
		if (scheduler != null) {
			scheduler.shutdown();
			try {
				if (!scheduler.awaitTermination(5, TimeUnit.SECONDS)) {
					scheduler.shutdownNow();
				}
			} catch (InterruptedException e) {
				scheduler.shutdownNow();
				Thread.currentThread().interrupt();
			}
		}
		LOGGER.info("Generic Scheduled Loader '" + config.loader_name() + "' deactivated");
	}

	private void startScheduledLoading() {
		running = true;
		scheduledTask = scheduler.scheduleAtFixedRate(
			this::loadAndPublish,
			0, // Initial delay
			config.schedule_interval(),
			TimeUnit.SECONDS
		);
	}

	private void loadAndPublish() {
		if (!running) {
			return;
		}

		try {
			loadAndPublishEObjects();
		} catch (Exception e) {
			LOGGER.severe("Error during scheduled loading for '" + config.loader_name() + "': " + e.getMessage());
		}
	}

	/**
	 * Loads new EObjects from the repository and publishes them to the event bus.
	 * Only loads records starting from the current offset and advances the offset
	 * by the number of records actually loaded.
	 */
	private void loadAndPublishEObjects() {
		Map<String, Object> queryParams = Map.of(
			"limit", config.query_limit(),
			"skip", currentOffset
		);

		List<EObject> objects = repository.getAllEObjects(eClass, queryParams);
		LOGGER.info("Loaded " + objects.size() + " " + config.loader_name() + " from database (offset: " + currentOffset + ")");

		if (!objects.isEmpty()) {
			publishEObjects(objects);
			// Advance offset by the number of records actually loaded
			currentOffset += objects.size();
			LOGGER.fine("Advanced " + config.loader_name() + " offset to: " + currentOffset);
		} else {
			LOGGER.fine("No new " + config.loader_name() + " found at offset: " + currentOffset);
		}
	}

	/**
	 * Publishes the loaded EObjects to all configured event topics.
	 *
	 * @param objects the EObjects to publish
	 */
	private void publishEObjects(List<EObject> objects) {
		for (EObject eObject : objects) {
			EObject eObjectCopy = EcoreUtil.copy(eObject);

			for (String topic : config.forward_topics()) {
				try {
					typedEventBus.deliver(topic, eObjectCopy);
					Object objectId = getObjectId(eObjectCopy);
					LOGGER.fine("Published " + config.loader_name() + " with id " + objectId + " to topic: " + topic);
				} catch (Exception e) {
					LOGGER.severe("Failed to publish " + config.loader_name() + " to topic " + topic + ": " + e.getMessage());
				}
			}
		}
	}

	/**
	 * Gets a readable identifier for the EObject for logging purposes.
	 *
	 * @param eObject the EObject
	 * @return the object ID or "unknown" if no ID attribute exists
	 */
	private Object getObjectId(EObject eObject) {
		if (eObject.eClass().getEIDAttribute() != null) {
			return eObject.eGet(eObject.eClass().getEIDAttribute());
		}
		return "unknown";
	}

}