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
package org.civitas.handler.mqtt.helper;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.json.constants.EMFJs;
import org.osgi.service.component.ComponentServiceObjects;
import org.eclipse.fennec.codec.options.CodecResourceOptions;

/**
 * 
 * @author ilenia
 * @since Sep 24, 2025
 */
public class MqttReceiverHelper {
	
	public static EObject loadResource(ComponentServiceObjects<ResourceSet> rsFactory, URI uri, String mediaType, byte[] content, Map<String, Object> options) throws IOException {
		ResourceSet set = rsFactory.getService();
		try {
			Resource res = set.createResource(uri, mediaType);
			String received = new String(content).replaceAll("^\\x00*", "");
			res.load(new BufferedInputStream(new ByteArrayInputStream(received.getBytes())), options);
			if(res.getContents() != null & !res.getContents().isEmpty()) {
				return res.getContents().get(0);
			}
		} 
		finally {
			rsFactory.ungetService(set);
		}
		return null;
	}
	
	public static EObject loadResource(ComponentServiceObjects<ResourceSet> rsFactory, URI uri, String mediaType, byte[] content, String rootEClassURI) throws IOException {
		ResourceSet set = rsFactory.getService();
		try {
			Resource res = set.createResource(uri, mediaType);
			String received = new String(content).replaceAll("^\\x00*", "");
			Map<String, Object> options = Collections.singletonMap(CodecResourceOptions.CODEC_ROOT_OBJECT, set.getEObject(URI.createURI(rootEClassURI), false));
			res.load(new BufferedInputStream(new ByteArrayInputStream(received.getBytes())), options);
			if(res.getContents() != null & !res.getContents().isEmpty()) {
				return res.getContents().get(0);
			}
		} 
		finally {
			rsFactory.ungetService(set);
		}
		return null;
	}
	
	public static void printResource(ComponentServiceObjects<ResourceSet> rsFactory, URI uri, String mediaType, EObject content) throws IOException {
		ResourceSet set = rsFactory.getService();
		try {
			Resource res = set.createResource(uri, mediaType);
			res.getContents().add(content);
			res.save(System.out, null);
		} 
		finally {
			rsFactory.ungetService(set);
		}
	}

}
