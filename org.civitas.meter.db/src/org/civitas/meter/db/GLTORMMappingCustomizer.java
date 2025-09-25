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
package org.civitas.meter.db;

import org.eclipse.fennec.persistence.eorm.Basic;
import org.eclipse.fennec.persistence.eorm.Entity;
import org.eclipse.fennec.persistence.eorm.EntityMappings;
import org.eclipse.fennec.persistence.eorm.OneToMany;
import org.eclipse.fennec.persistence.orm.EORMMappingCustomizer;
import org.osgi.service.component.annotations.Component;

/**
 * Customizer for the Meter ORM Mapping
 * @author Mark Hoffmann
 * @since 25.09.2025
 */
@Component(property = "name=glt")
public class GLTORMMappingCustomizer implements EORMMappingCustomizer {

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.fennec.persistence.orm.EORMMappingCustomizer#customizeMapping(org.eclipse.fennec.persistence.eorm.EntityMappings)
	 */
	@Override
	public EntityMappings customizeMapping(EntityMappings mapping) {
		Entity reading = mapping.getEntity().stream().filter(e->e.getName().equals("Building")).findFirst().orElse(null);
		if(reading != null) {
			reading.getTable().setName("BUILDINGS");
			OneToMany contacts = reading.getAttributes().getOneToMany().stream().filter(b->b.getName().equals("contacts")).findFirst().orElse(null);
		}
		Entity remoteReading = mapping.getEntity().stream().filter(e->e.getName().equals("Contact")).findFirst().orElse(null);
		if(remoteReading != null) {
			remoteReading.getTable().setName("CONTACTS");
		}
		return mapping;
	}

}
