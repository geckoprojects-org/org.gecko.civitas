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

import org.apache.aries.typedevent.bus.spi.AriesTypedEvents;
import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author grune
 * @since Sep 24, 2025
 */
//implements typed eventhandler
public class Handler {
	
	@interface Config{
		String repo_target();
		String incomming_eclassuri(); // http:,....#//Meter
		String target_eclassuri(); // http:,....#//Plant
		String foreignKeyFeature_uri(); // http:,....#//Meter_plantId
		String target_reference_uri(); // Plant_meters
		String forwardTopic();
	}
	
	void handleMessage(EObject eObject) {
		// check if we can handle this EClass
		// lokk for target Eclass with foreign key in repository
		// attache Object (copy)
		// save in repo
		// create Copy of target EObject and send via Typed Eventadmin
	}

}
