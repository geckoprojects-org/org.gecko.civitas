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
package org.civitas.glt.sensor.validation;

import java.util.Arrays;
import java.util.logging.Logger;

import org.civitas.glt.sensor.validation.api.ValidationType;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.typedevent.TypedEventBus;
import org.osgi.service.typedevent.TypedEventHandler;

@Designate(ocd = ValidationHandler.Config.class)
@Component(name = "ValidationHandler", configurationPid = "ValidationHandler", configurationPolicy = ConfigurationPolicy.REQUIRE, scope = ServiceScope.PROTOTYPE)
public class ValidationHandler implements TypedEventHandler<EObject> {

	@Reference
	TypedEventBus typedEventBus;
	
	private static final Logger LOGGER = Logger.getLogger(ValidationHandler.class.getName());
	
	private Config config;
	private ValidationType type;
	private ResourceSet resourceSet;

	@ObjectClassDefinition(name = "ValidationHandler Configuration")
	public @interface Config {

		@AttributeDefinition(name = "Event Topic", description = "The topic this handler is listening to")
		String[] event_topics();

		@AttributeDefinition(name = "Incoming EClass URI", description = "The URI of the incoming EObject EClass")
		String incoming_eclassuri(); // http:,....#//Reading

		@AttributeDefinition(name = "Target Reference URI", description = "The URI of the EStructuralFeature to be validated")
		String reference_uri_to_be_validated(); // Reading_value
		
		@AttributeDefinition(name = "Target Reference URI", description = "The URI of the EStructuralFeature to be validated")
		String attribute_uri_to_be_validated(); // Reading_value

		@AttributeDefinition(name = "Validation Type", description = "The validation type")
		String validation_type() default "";

		@AttributeDefinition(name = "Threshold", description = "The threshold value for the validation")
		double threshold() default -9999.;

		@AttributeDefinition(name = "Min Threshold", description = "The minimum threshold value for the validation")
		double minThreshold() default -9999.;

		@AttributeDefinition(name = "Max Threshold", description = "The maximum threshold value for the validation")
		double maxThreshold() default -9999.;

		@AttributeDefinition(name = "Forward Topic", description = "The topic where to publish the updated target EObject")
		String[] forward_topics();
	}

	@Activate
	public ValidationHandler(Config config, 
			@Reference(cardinality = ReferenceCardinality.MANDATORY) ResourceSet resourceSet
			) throws ConfigurationException {
		this.config = config;
		this.resourceSet = resourceSet;
		checkConfig(config);
		this.type = ValidationType.valueOf(config.validation_type());
	}

	/* 
	 * (non-Javadoc)
	 * @see org.osgi.service.typedevent.TypedEventHandler#notify(java.lang.String, java.lang.Object)
	 */
	@Override
	public void notify(String topic, EObject eObject) {
		// check if we can handle this EClass
		if(!EcoreUtil.getURI(eObject.eClass()).toString().equals(config.incoming_eclassuri())) return;
		
//		Check if reference_uri_to_be_validated is null: if yes we just look in the attribute_uri_to_be_validated
//		If not, we have to do treat it like a feature path
		Number numberToBeValidated = null;
		if(config.reference_uri_to_be_validated() == null) {
			 EObject attObj = resourceSet.getEObject(URI.createURI(config.attribute_uri_to_be_validated()), false);
			 if(attObj instanceof EAttribute att) {
				 numberToBeValidated = (Number) eObject.eGet(att);
			 }
		} else {
			EObject attObj = resourceSet.getEObject(URI.createURI(config.attribute_uri_to_be_validated()), false);
			EObject refObj = resourceSet.getEObject(URI.createURI(config.reference_uri_to_be_validated()), false);
			if(refObj instanceof EReference ref && attObj instanceof EAttribute att) {
				EObject refValue = (EObject) eObject.eGet(ref);
				if(refValue != null) {
					numberToBeValidated = (Number) refValue.eGet(att);
				}				
			}
		}
		if(numberToBeValidated != null) {
			if(!isValid(numberToBeValidated)) {
				LOGGER.info(String.format("Validation failed. Passing object forward"));
				Arrays.asList(config.forward_topics()).forEach(t -> typedEventBus.deliver(t, EcoreUtil.copy(eObject)));
			}
		}
	}

	private boolean isValid(Number number) {
		switch(type) {
		case ABOVE_OR_EQUAL_THRESHOLD:
			if(number.doubleValue() >= config.threshold()) {
				return false;
			} 
			break;			
		case ABOVE_THRESHOLD:
			if(number.doubleValue() > config.threshold()) {
				return false;
			} 
			break;
		case BELOW_OR_EQUAL_THRESHOLD:
			if(number.doubleValue() <= config.threshold()) {
				return false;
			} 
			break;
		case BELOW_THRESHOLD:
			if(number.doubleValue() < config.threshold()) {
				return false;
			} 
			break;
		case OUTSIDE_RANGE:
			if(number.doubleValue() < config.minThreshold() || number.doubleValue() > config.maxThreshold()) {
				return false;
			} 
			break;
		case WITHIN_RANGE:
			if(number.doubleValue() > config.minThreshold() || number.doubleValue() < config.maxThreshold()) {
				return false;
			} 
			break;
		}
		return true;
	}



	private void checkConfig(Config config) throws ConfigurationException {
		if(config.validation_type() == null || config.validation_type().isEmpty()) {
			throw new ConfigurationException("validationType", "validationType must be set");
		}
		try {
			ValidationType.valueOf(config.validation_type());
		} catch(Exception e) {
			throw new ConfigurationException("validationType", "validationType must be a valid ValidationType value");
		}

		ValidationType type = ValidationType.valueOf(config.validation_type());
		if(ValidationType.ABOVE_OR_EQUAL_THRESHOLD.equals(type) || ValidationType.ABOVE_THRESHOLD.equals(type) || ValidationType.BELOW_OR_EQUAL_THRESHOLD.equals(type) || ValidationType.BELOW_THRESHOLD.equals(type) ) {
			if(config.threshold() == -9999.) {
				throw new ConfigurationException("threshold", String.format("threshold must be set for validation of type %s", type));
			}
		}
		if(ValidationType.WITHIN_RANGE.equals(type) || ValidationType.OUTSIDE_RANGE.equals(type)) {
			if(config.minThreshold() == -9999.) {
				throw new ConfigurationException("minThreshold", String.format("minThreshold must be set for validation of type %s", type));
			} 
			if(config.maxThreshold() == -9999.) {
				throw new ConfigurationException("maxThreshold", String.format("maxThreshold must be set for validation of type %s", type));
			}
		}
	}


}
