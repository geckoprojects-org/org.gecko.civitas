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

import org.eclipse.fennec.persistence.eorm.EORMFactory;
import org.eclipse.fennec.persistence.eorm.Entity;
import org.eclipse.fennec.persistence.eorm.EntityMappings;
import org.eclipse.fennec.persistence.eorm.FetchType;
import org.eclipse.fennec.persistence.eorm.JoinColumn;
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
	
	@Override
    public EntityMappings customizeMapping(EntityMappings mapping) {
        if (mapping == null || !"glt".equals(mapping.getName())) {
            return mapping;
        }
        
        // Find Building entity
        Entity buildingEntity = findEntity(mapping, "Building");
        if (buildingEntity == null) {
            return mapping;
        }
        
        // Find contacts OneToMany mapping
        OneToMany contactsMapping = findOneToManyMapping(buildingEntity, "contacts");
        if (contactsMapping == null) {
            return mapping;
        }
        
        // Fix the mapping: Replace JoinTable with JoinColumn
        fixContactsContainmentMapping(contactsMapping);
        
        return mapping;
    }
	
    /**
     * Fixes the Building.contacts containment mapping to use correct JoinColumn strategy.
     * 
     * @param contactsMapping the OneToMany mapping to fix
     */
    private void fixContactsContainmentMapping(OneToMany contactsMapping) {
        // Remove incorrect JoinTable
        contactsMapping.setJoinTable(null);
        
        // Create correct JoinColumn
        JoinColumn joinColumn = EORMFactory.eINSTANCE.createJoinColumn();
        joinColumn.setName("building_id");    // FK column in contacts table
        joinColumn.setReferencedColumnName("BUILDINGS.id");   // PK column in buildings table
        
        // Create ForeignKey (CRITICAL: EDynamicTypeBuilder expects this!)
        org.eclipse.fennec.persistence.eorm.ForeignKey foreignKey = 
            EORMFactory.eINSTANCE.createForeignKey();
        foreignKey.setName("building_id");  // Must match JoinColumn name
        foreignKey.setConstraintMode(org.eclipse.fennec.persistence.eorm.ConstraintMode.CONSTRAINT);
        foreignKey.setForeignKeyDefinition("FK_CONTACT_BUILDING");
        
        // Set the JoinColumn and ForeignKey
        contactsMapping.getJoinColumn().clear();
        contactsMapping.getJoinColumn().add(joinColumn);
        contactsMapping.setForeignKey(foreignKey);  // ✅ This fixes the NPE!
        
        // Ensure correct containment settings
        contactsMapping.setOrphanRemoval(false);  // EMF containment semantic
        contactsMapping.setFetch(FetchType.EAGER);
        
        // Note: Cascade should already be set correctly by BaseReferenceProcessor
        // for containment relationships (cascadeAll)
    }
    
    /**
     * Finds an entity by name in the EntityMappings.
     * 
     * @param mappings the EntityMappings to search
     * @param entityName the entity name to find
     * @return the Entity or null if not found
     */
    private Entity findEntity(EntityMappings mappings, String entityName) {
        return mappings.getEntity().stream()
                .filter(entity -> entityName.equals(entity.getName()))
                .findFirst()
                .orElse(null);
    }
    
    /**
     * Finds a OneToMany mapping by name in an Entity.
     * 
     * @param entity the Entity to search
     * @param mappingName the mapping name to find
     * @return the OneToMany mapping or null if not found
     */
    private OneToMany findOneToManyMapping(Entity entity, String mappingName) {
        if (entity.getAttributes() == null) {
            return null;
        }
        
        return entity.getAttributes().getOneToMany().stream()
                .filter(mapping -> mappingName.equals(mapping.getName()))
                .findFirst()
                .orElse(null);
    }

}
