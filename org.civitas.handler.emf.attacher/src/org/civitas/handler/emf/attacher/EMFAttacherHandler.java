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
package org.civitas.handler.emf.attacher;

import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.typedevent.TypedEventBus;
import org.osgi.service.typedevent.TypedEventConstants;
import org.osgi.service.typedevent.TypedEventHandler;

/**
 * 
 * @author grune
 * @since Sep 24, 2025
 */
@Designate(ocd = EMFAttacherHandler.Config.class)
@Component(name = "EMFAttacherHandler", property = {TypedEventConstants.TYPED_EVENT_TOPICS+"=emf/attacher"}, 
configurationPid = "EMFAttacherHandler", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class EMFAttacherHandler implements TypedEventHandler<EObject> {
	
	@ObjectClassDefinition(name = "EMFAttacherHandler Configuration")
	@interface Config{
		
		@AttributeDefinition(name = "Event Topic", description = "The topic this handler is listening to")
		String event_topic();
		
		@AttributeDefinition(name = "Repo Target", description = "The EMF Repository target")
		String repo_target();
		
		@AttributeDefinition(name = "Incoming EClass URI", description = "The URI of the incoming EObject EClass")
		String incomming_eclassuri(); // http:,....#//Meter
		
		@AttributeDefinition(name = "Target EClass URI", description = "The URI of the targer EClass")
		String target_eclassuri(); // http:,....#//Plant
		
		@AttributeDefinition(name = "Foreign Key Feature URI", description = "The URI of the EStructuralFeature from the incoming EObject to be used as identifier for the target EObject")
		String foreignKeyFeature_uri(); // http:,....#//Meter_plantId
		
		@AttributeDefinition(name = "Target Reference URI", description = "The URI of the target EReference where to put the incoming EObject")
		String target_reference_uri(); // Plant_meters
		
		@AttributeDefinition(name = "Forward Topic", description = "The topic where to publish the updated target EObject")
		String forwardTopic();
	}
	
	private static final Logger LOGGER = Logger.getLogger(EMFAttacherHandler.class.getName());
	
	@Reference
	EMFRepository repository;
	
	@Reference
	TypedEventBus typedEventBus;
	
	private Config config;
	
	@Activate
	public EMFAttacherHandler(Config config) {
		this.config = config;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.osgi.service.typedevent.TypedEventHandler#notify(java.lang.String, java.lang.Object)
	 */
	@Override
	public void notify(String topic, EObject event) {
		handleEvent(event);
		
	}
	
	void handleEvent(EObject eObject) {
		// check if we can handle this EClass
		if(!EcoreUtil.getURI(eObject.eClass()).toString().equals(config.incomming_eclassuri())) return;
		
		// look for target Eclass with foreign key in repository
		EObject target = repository.getResourceSet().getEObject(URI.createURI(config.target_eclassuri()), false);
		if(target == null || !(target instanceof EClass)) {
			LOGGER.severe(String.format("No EClass found in ResourceSet for target_eclassuri %s", config.target_eclassuri()));
			return;
		}
		EObject foreignKeyObject = repository.getResourceSet().getEObject(URI.createURI(config.foreignKeyFeature_uri()), false);
		if(foreignKeyObject == null || !(foreignKeyObject instanceof EStructuralFeature)) {
			LOGGER.severe(String.format("No EStructuralFeature found in ResourceSet for foreignKeyFeature_uri %s", config.foreignKeyFeature_uri()));
			return;
		}
		
		EObject targetRefObj = repository.getResourceSet().getEObject(URI.createURI(config.target_reference_uri()), false);
		if(targetRefObj == null || !(targetRefObj instanceof EReference)) {
			LOGGER.severe(String.format("No EReference found in ResourceSet for target_reference_uri %s", config.target_reference_uri()));
			return;
		}
		
		EStructuralFeature foreignKeyFeature = (EStructuralFeature) foreignKeyObject;
		EObject targetEObject = null; 
		if(foreignKeyFeature instanceof EAttribute) {
			target = repository.getEObject((EClass) target, eObject.eGet(foreignKeyFeature), null);
		} else {
			EObject root = (EObject) eObject.eGet(foreignKeyFeature);
			target = repository.getEObject((EClass) target, EcoreUtil.getID(root), null);
		}
		
		// create target object if null and attach eObject (copy) to it
		if(targetEObject == null) {
			targetEObject = EcoreUtil.create((EClass) target);
			targetEObject.eSet(targetEObject.eClass().getEIDAttribute(), eObject.eGet(foreignKeyFeature));
		} 
		
//		We have to distinguish here between many ref and single ref. 
//		If many ref we have to look in the existing list and replace the right element based on its ID feature
		EReference targetRef = (EReference) targetRefObj;
		if(targetRef.isMany()) {
			@SuppressWarnings("unchecked")
			EList<EObject> eList = (EList<EObject>) targetEObject.eGet(targetRef);
			if(eList.isEmpty()) {
				eList.add(EcoreUtil.copy(eObject));
			} else {
				addOrReplaceById(EcoreUtil.copy(eObject), eList, eObject.eClass().getEIDAttribute());
			}			
		} else {
			targetEObject.eSet(targetRef, EcoreUtil.copy(eObject));
		}
		
		// save in repo
		repository.save(targetEObject);
		
		// create Copy of target EObject and send via Typed Eventadmin
		typedEventBus.deliver(config.forwardTopic(), EcoreUtil.copy(targetEObject));
	}

	
	private void addOrReplaceById(EObject eObjectToAdd, EList<EObject> eList, EStructuralFeature idFeature) {
	    //If no ID feature, we simply add the new object
		if(idFeature == null) {
			eList.add(eObjectToAdd);
			return;
		}
		
		// Get the ID of the new object
	    Object idOfNewObject = eObjectToAdd.eGet(idFeature);

	    // Find a matching object in the list
	    int indexToReplace = -1;
	    for (int i = 0; i < eList.size(); i++) {
	        EObject existingObject = eList.get(i);
	        Object idOfExistingObject = existingObject.eGet(idFeature);

	        if (idOfNewObject.equals(idOfExistingObject)) {
	            indexToReplace = i;
	            break; // Found a match, exit the loop
	        }
	    }

	    // Replace or add the new object
	    if (indexToReplace != -1) {
	        // A matching object was found, so replace it
	        eList.set(indexToReplace, eObjectToAdd);
	    } else {
	        // No match found, so add the new object
	        eList.add(eObjectToAdd);
	    }
	}
}
