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

/**
 * 
 * @author ilenia
 * @since Sep 24, 2025
 */
public enum ValidationType {
	
	ABOVE_THRESHOLD, 
	
	ABOVE_OR_EQUAL_THRESHOLD,
	
	BELOW_THRESHOLD,
	
	BELOW_OR_EQUAL_THRESHOLD,
	
	WITHIN_RANGE,
	
	OUTSIDE_RANGE;

}
