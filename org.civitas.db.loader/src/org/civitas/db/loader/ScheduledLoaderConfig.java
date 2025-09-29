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

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

/**
 * Common configuration interface for all scheduled loaders.
 * Defines the configuration properties for the generic scheduled loader component.
 *
 * @author mark
 * @since 26.09.2025
 */
@ObjectClassDefinition(name = "Configuration for loading EObjects from EMF repository")
public @interface ScheduledLoaderConfig {

	@AttributeDefinition(name = "Schedule Interval (seconds)", description = "Interval in seconds for loading data from database")
	long schedule_interval() default 60;

	@AttributeDefinition(name = "Event Bus Topics", description = "Topics to publish loaded data to")
	String[] forward_topics() default {"data/loaded"};

	@AttributeDefinition(name = "Database Query Limit", description = "Maximum number of records to load per query")
	long query_limit() default 1000;

	@AttributeDefinition(name = "Initial Database Query Skip Offset", description = "Initial number of records to skip (starting point for pagination)")
	long initial_query_skip() default 0;

	@AttributeDefinition(name = "Loads only new entries", description = "")
	boolean enablePaging() default true;

	@AttributeDefinition(name = "Repository ID", description = "The repository ID to target for loading data (e.g., 'manualMeter', 'remoteMeter', 'manualReading')")
	String repo_target();

	@AttributeDefinition(name = "EClass Name", description = "The name of the EClass to load from the repository (e.g., 'Meter', 'Reading', 'RemoteReading')")
	String eclass();

	@AttributeDefinition(name = "Package Name", description = "The EMF package name to use for EClass lookup")
	String package_target() default "metersource";

	@AttributeDefinition(name = "Loader Name", description = "Descriptive name for this loader instance (used in logging)")
	String loader_name();
}