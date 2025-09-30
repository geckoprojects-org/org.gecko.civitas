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

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
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
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.typedevent.TypedEventBus;
import org.osgi.service.typedevent.TypedEventHandler;

/**
 * 
 * @author grune
 * @since Sep 24, 2025
 */
@Designate(ocd = EMFAttacherHandler.Config.class)
@Component(name = "EMFAttacherHandler", configurationPid = "EMFAttacherHandlerConfig", configurationPolicy = ConfigurationPolicy.REQUIRE, scope = ServiceScope.PROTOTYPE)
public class EMFAttacherHandler implements TypedEventHandler<EObject> {

	@ObjectClassDefinition(name = "EMFAttacherHandler Configuration")
	@interface Config {

		@AttributeDefinition(name = "Event Topic", description = "The topic this handler is listening to")
		String[] event_topics();

		@AttributeDefinition(name = "Repo Target", description = "The EMF Repository target")
		String repo_target();

		@AttributeDefinition(name = "Incoming EClass URI", description = "The URI of the incoming EObject EClass")
		String incoming_eclassuri(); // http:,....#//Meter
		
		@AttributeDefinition(name = "Incoming Reference URI", description = "The URI of the incoming EReference, which has to be attached instead of the whole incoming EObject")
		String incoming_referenceuri(); 

		@AttributeDefinition(name = "Target EClass URI", description = "The URI of the targer EClass")
		String target_eclassuri(); // http:,....#//Plant

		@AttributeDefinition(name = "Foreign Key Feature URI", description = "The URI of the EStructuralFeature from the incoming EObject to be used as identifier for the target EObject")
		String foreignKeyFeature_uri(); // http:,....#//Meter_plantId

		@AttributeDefinition(name = "Target Reference URI", description = "The URI of the target EReference where to put the incoming EObject")
		String target_reference_uri(); // Plant_meters

		@AttributeDefinition(name = "Forward Topic", description = "The topic where to publish the updated target EObject")
		String[] forward_topics();
	}

	private static final Logger LOGGER = Logger.getLogger(EMFAttacherHandler.class.getName());

	@Reference(name = "repo", target = "(&(needs_configuration=true)(must_not_resolve=true)(must_not_resolve=false))")
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
	 * 
	 * @see org.osgi.service.typedevent.TypedEventHandler#notify(java.lang.String,
	 * java.lang.Object)
	 */
	@Override
	public void notify(String topic, EObject event) {
		CompletableFuture.runAsync(() -> {
			handleEvent(event, topic);
		});
	}

	@SuppressWarnings("unchecked")
	void handleEvent(EObject eObject, String topic) {
		
		// check if we can handle this EClass
		if (!EcoreUtil.getURI(eObject.eClass()).toString().equals(config.incoming_eclassuri()))
			return;
		
		LOGGER.info(String.format("EMFAttacherHandler on topic %s for incoming object %s with ID %s and targetting object %s", topic, eObject.eClass().getName(), EcoreUtil.getID(eObject), config.target_eclassuri() ));

		// look for target Eclass with foreign key in repository
		EObject target = repository.getResourceSet().getEObject(URI.createURI(config.target_eclassuri()), false);
		if (!(target instanceof EClass)) {
			LOGGER.severe(
					String.format("No EClass found in ResourceSet for target_eclassuri %s", config.target_eclassuri()));
			return;
		}
		EObject foreignKeyObject = repository.getResourceSet().getEObject(URI.createURI(config.foreignKeyFeature_uri()),
				false);
		if (!(foreignKeyObject instanceof EStructuralFeature)) {
			LOGGER.severe(String.format("No EStructuralFeature found in ResourceSet for foreignKeyFeature_uri %s",
					config.foreignKeyFeature_uri()));
			return;
		}

		EObject targetRefObj = repository.getResourceSet().getEObject(URI.createURI(config.target_reference_uri()),
				false);
		if (!(targetRefObj instanceof EReference)) {
			LOGGER.severe(String.format("No EReference found in ResourceSet for target_reference_uri %s",
					config.target_reference_uri()));
			return;
		}

		EStructuralFeature foreignKeyFeature = (EStructuralFeature) foreignKeyObject;
		Object id;
		if (foreignKeyFeature instanceof EAttribute) {
			id = eObject.eGet(foreignKeyFeature);
		} else {
			id = EcoreUtil.getID((EObject) eObject.eGet(foreignKeyFeature));
		}

		// create target object if null and attach eObject (copy) to it
		synchronized (repository) {
			EObject targetEObject = repository.getEObject((EClass) target, id);
			if (targetEObject == null) {
				targetEObject = EcoreUtil.create((EClass) target);
				targetEObject.eSet(targetEObject.eClass().getEIDAttribute(), id);
			}

			EObject incomingRefObject = config.incoming_referenceuri() == null ? null : repository.getResourceSet().getEObject(URI.createURI(config.incoming_referenceuri()), false);
			EReference incomingEReference = null;
			if(incomingRefObject != null) {
				if(!(incomingRefObject instanceof EReference)) {
					LOGGER.severe(String.format("No EReference found in ResourceSet for incoming_referenceuri %s",
							config.target_reference_uri()));
					return;
				}
				incomingEReference = (EReference) incomingRefObject;
			}

	//		We have to distinguish here between many ref and single ref.
	//		If many ref we have to look in the existing list and replace the right element based on its ID feature
			EReference targetRef = (EReference) targetRefObj;
			if(incomingEReference != null) {
	//			TODO: we should check here if we really want to overwrite or if we want to addAll and replace the existing objects with the same ids
				Object object = eObject.eGet(incomingEReference);
				if(targetRef.isMany()) {
					EList<EObject> eList = (EList<EObject>) targetEObject.eGet(targetRef);
					eList.addAll((Collection<? extends EObject>) object);
				} else {
					targetEObject.eSet(targetRef, object);
				}

			} else if (targetRef.isMany()) {
				EList<EObject> eList = (EList<EObject>) targetEObject.eGet(targetRef);
				if (eList.isEmpty()) {
					eList.add( EcoreUtil.copy(eObject));
				} else {
					addOrReplaceById(EcoreUtil.copy(eObject), eList, eObject.eClass().getEIDAttribute());
				}
			} else {
				targetEObject.eSet(targetRef, EcoreUtil.copy(eObject));
			}

			// save in repo
			repository.save(targetEObject);
			final EObject forwadObject = targetEObject;
			// create Copy of target EObject and send via Typed Eventadmin
			Arrays.asList(config.forward_topics()).forEach(t -> typedEventBus.deliver(t, EcoreUtil.copy(forwadObject)));
		}
	}

	private void addOrReplaceById(EObject eObjectToAdd, EList<EObject> eList, EStructuralFeature idFeature) {
		// If no ID feature, we simply add the new object
		if (idFeature == null) {
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
