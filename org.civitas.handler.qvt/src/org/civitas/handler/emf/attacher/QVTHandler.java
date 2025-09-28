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
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.fennec.qvt.osgi.api.ModelTransformationConstants;
import org.eclipse.fennec.qvt.osgi.api.ModelTransformator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceReference;
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
@Component(name = "QVTHandler", property = { TypedEventConstants.TYPED_EVENT_TOPICS
	+ "=*" }, configurationPid = "QVTHandler", configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = QVTHandler.Config.class)
public class QVTHandler implements TypedEventHandler<EObject> {
    private static final Logger LOGGER = Logger.getLogger(QVTHandler.class.getName());

    @ObjectClassDefinition(name = "EObject QVT handler configuration")
    @interface Config {

	@AttributeDefinition(name = "Event Topics", description = "The OSGi event topic to listen to for EObject events (e.g., 'org/civitas/meter/data/parsed')")
	String event_topics();

	@AttributeDefinition(name = "EClass URI", description = "The URI of the source eobject")
	String eclassuri(); // http:,....#//Meter

	@AttributeDefinition(name = "QVT ID", description = "ID of the QVT transformation")
	String trafo_id();

	@AttributeDefinition(name = "Forward Topic", description = "The topic where to publish the transformed target EObject")
	String[] forward_topics();
    }

    @Reference
    private TypedEventBus bus;

    private ModelTransformator trafo;

    private Config config;

    @Activate
    public void activate(BundleContext ctx, Config config) throws InvalidSyntaxException {
	this.config = config;
	ctx.addServiceListener(event -> {
	    int type = event.getType();
	    ServiceReference<?> ref = event.getServiceReference();
	    switch (type) {
	    case ServiceEvent.REGISTERED, ServiceEvent.MODIFIED:
		if (ctx.getService(ref) instanceof ModelTransformator t) {
		    trafo = t;
		}
		break;
	    case ServiceEvent.UNREGISTERING:
		trafo = null;
		break;
	    default:
		LOGGER.log(Level.SEVERE, "Unexpected value for service event type: {0}", type);
	    }

	}, "(" + ModelTransformationConstants.TRANSFORMATOR_ID + "=" + config.trafo_id() + ")");
    }

    @Override
    public void notify(String topic, EObject event) {
	if (config.eclassuri().equals(EcoreUtil.getURI(event).toString())) {
	    Diagnostic diagnostic = Diagnostician.INSTANCE.validate(event);
	    if (diagnostic.getSeverity() == Diagnostic.OK && trafo != null) {
		EObject result = trafo.doTransformation(event);
		Arrays.asList(config.forward_topics()).forEach(t -> bus.deliver(t, result));
	    }
	}
    }

}
