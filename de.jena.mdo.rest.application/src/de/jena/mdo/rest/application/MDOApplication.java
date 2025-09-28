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
package de.jena.mdo.rest.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import jakarta.ws.rs.core.Application;

/**
 *
 * @author Juergen Albert
 * @since 22 Mar 2022
 */
@Component(name = MDOApplication.COMPONENT_NAME, service = Application.class, property = "emf=true", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class MDOApplication extends Application {

	public static final String COMPONENT_NAME = "MDOApplication";

}
