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
package org.civitas.glt.sensor.validation.api;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

/**
 * 
 * @author ilenia
 * @since Sep 24, 2025
 */
@ObjectClassDefinition(name = "ValidationService Configuration")
public @interface ValidationServiceConfig {
	
	@AttributeDefinition(name = "Validation Type", description = "The validation type")
	String validationType() default "";
	
	@AttributeDefinition(name = "Threshold", description = "The threshold value for the validation")
	double threshold() default -9999.;

	@AttributeDefinition(name = "Min Threshold", description = "The minimum threshold value for the validation")
	double minThreshold() default -9999.;
	
	@AttributeDefinition(name = "Max Threshold", description = "The maximum threshold value for the validation")
	double maxThreshold() default -9999.;
	
	@AttributeDefinition(name = "Severity Type", description = "The severity type")
	String severityType() default "WARNING";
	
	@AttributeDefinition(name = "Notification Type", description = "The notification type")
	String notificationType() default "PHONE";
}
