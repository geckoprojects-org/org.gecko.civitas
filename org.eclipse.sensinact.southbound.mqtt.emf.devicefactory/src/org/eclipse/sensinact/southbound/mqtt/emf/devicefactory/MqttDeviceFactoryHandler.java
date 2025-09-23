/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */

package org.eclipse.sensinact.southbound.mqtt.emf.devicefactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.Executors;

import org.assertj.core.util.Strings;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fennec.codec.options.CodecResourceOptions;
import org.eclipse.sensinact.core.push.DataUpdate;
import org.eclipse.sensinact.gateway.southbound.mqtt.api.IMqttMessage;
import org.eclipse.sensinact.gateway.southbound.mqtt.api.IMqttMessageListener;
import org.gecko.emf.osgi.annotation.require.RequireEMF;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.util.promise.Deferred;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.PromiseFactory;

/**
 * Generic MQTT Device Factory Handler following the specification.
 *
 * This component is the core of the dynamic model loading logic. It receives
 * its configuration from the MqttGatewayConfigurator, listens for MQTT messages
 * on configured topics, dynamically references the EPackage specified by the
 * epackage.target filter in its configuration, uses an EMF ResourceSet
 * configured for the specified content.type to deserialize message payloads,
 * and pushes the root EObject from the resource to the sensiNact platform via
 * the DataUpdate service.
 */
@RequireEMF
@Component(service = {}, configurationPid = MqttDeviceFactoryHandler.PID, configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = MqttDeviceFactoryHandler.MqttDeviceFactoryConfiguration.class)
public class MqttDeviceFactoryHandler implements IMqttMessageListener {

  public static final String PID = "mqtt.emf.device.factory";

  private static final Logger logger = System.getLogger(MqttDeviceFactoryHandler.class.getName());

  @Reference(name = "resourceset")
  private ComponentServiceObjects<ResourceSet> serviceObjects;

  @Reference
  private DataUpdate sensiNact;

  private volatile EPackage targetEPackage;
  private volatile EClass targetEClass;

  private ServiceRegistration<IMqttMessageListener> svcReg;
  private String eclassUri;
  private String contentType;

  private Deferred<Object> deferred;

  @ObjectClassDefinition
  public static @interface MqttDeviceFactoryConfiguration {
    /**
     * MQTT handler ID to bind to
     */
    String mqtt_handler_id();

    /**
     * URI of the root EClass to expect in MQTT message payload
     */
    String eclass_uri() default "";

    /**
     * Content type of the message payload
     */
    String content_type() default "application/json";

    /**
     * OSGi filter to target the EPackage service
     */
    String epackage_target();

    /**
     * OSGi filter to target the {@link ResourceSet} service
     */
    String resourceset_target();

    /**
     * Name for the IMqttMessageListener service
     */
    String name() default "MqttDeviceFactoryHandler";
  }

  /**
   * Creates a new instance.
   */
  public MqttDeviceFactoryHandler() {
    PromiseFactory promiseFactory = new PromiseFactory(Executors.newSingleThreadExecutor());
    deferred = promiseFactory.deferred();
  }

  @Activate
  public void activate(final BundleContext context, final MqttDeviceFactoryConfiguration conf) {
    this.eclassUri = conf.eclass_uri();
    this.contentType = conf.content_type();

    deferred.getPromise().onSuccess(e -> resolveTargetEClass()).onResolve(() -> {
      if (eclassUri != null) {
        // Try to resolve EClass if EPackage is already available
        resolveTargetEClass();
      }

      // Register the listener service with handler ID filter
      Dictionary<String, Object> properties = new Hashtable<>();
      properties.put(IMqttMessageListener.MQTT_TOPICS_FILTERS, "(id=" + conf.mqtt_handler_id() + ")");
      properties.put("name", conf.name());
      svcReg = context.registerService(IMqttMessageListener.class, this, properties);

      logger.log(Level.INFO, "MQTT Device Factory Handler activated for handler: {0}, EClass: {1}",
          conf.mqtt_handler_id(), eclassUri);
    }).onFailure(t -> { logger.log(Level.ERROR, "Unable to register MQTTHandler", t); }, IllegalArgumentException.class);

  }

  @Deactivate
  public void deactivate() {
    if (svcReg != null) {
      svcReg.unregister();
      svcReg = null;
    }
  }

  @Override
  public void onMqttMessage(String handlerId, String topic, IMqttMessage message) {
    try {
      // Get ResourceSet configured for the content type
      ResourceSet resourceSet = serviceObjects.getService();
      try {
        // Create temporary URI for the resource
        URI tempUri = URI.createURI("temp://" + System.currentTimeMillis());
        Resource resource = resourceSet.createResource(tempUri, contentType);

        Map<Object, Object> properties = new HashMap<>();
        if(targetEClass != null) {
          properties.put(CodecResourceOptions.CODEC_ROOT_OBJECT, targetEClass);
        }
        
        // Load message payload into EMF resource
        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(message.getPayload())) {
          resource.load(inputStream, null);
        }

        // Validate that we have content and the root object is the expected type
        if (resource.getContents().isEmpty()) {
          logger.log(Level.WARNING, "No content loaded from MQTT message on topic {0}", topic);
          return;
        }

        EObject rootObject = resource.getContents().get(0);

        // Validate the root object type matches expected EClass
        if (!isExpectedEClass(rootObject)) {
          logger.log(Level.WARNING, "Root object type {0} does not match expected EClass URI {1}",
              rootObject.eClass().getEPackage().getNsURI() + "#//" + rootObject.eClass().getName(), eclassUri);
          return;
        }

        // Push to sensiNact
        Promise<?> promise = sensiNact.pushUpdate(rootObject);
        promise
            .onSuccess(
                result -> logger.log(Level.INFO, "Successfully pushed EMF object to sensiNact from topic {0}: {1}",
                    topic, rootObject.eClass().getName()))
            .onFailure(error -> logger.log(Level.ERROR, "Error pushing EMF object to sensiNact from topic {0}: {1}",
                topic, error.getMessage()));

      } finally {
        serviceObjects.ungetService(resourceSet);
      }

    } catch (IOException e) {
      logger.log(Level.ERROR, "Error loading EMF resource from MQTT message on topic {0}: {1}", topic, e.getMessage(),
          e);
    } catch (Exception e) {
      logger.log(Level.ERROR, "Unexpected error processing MQTT message from {0} on topic {1}: {2}", handlerId, topic,
          e.getMessage(), e);
    }
  }

  /**
   * Check if the root object matches the expected EClass using EMF type system
   */
  private boolean isExpectedEClass(EObject rootObject) {
    if (targetEClass == null) {
      return true; // No specific requirement or EClass not resolved
    }

    EClass actualEClass = rootObject.eClass();
    // Use EMF type system to check if the actual class is compatible with expected
    // class
    // This supports inheritance (subclasses of the expected type are accepted)
    return targetEClass.isSuperTypeOf(actualEClass) || targetEClass.equals(actualEClass);
  }

  /**
   * Resolve the target EClass from the configured URI using Method 2 (EcoreUtil)
   */
  private void resolveTargetEClass() {
    if(Strings.isNullOrEmpty(eclassUri)) {
      return;
    }
      URI uri = URI.createURI(eclassUri);
      String fragment = uri.fragment();

      if (fragment != null && targetEPackage.eResource() != null) {
        EObject eObject = targetEPackage.eResource().getEObject(fragment);

        if (eObject instanceof EClass) {
          this.targetEClass = (EClass) eObject;
          logger.log(Level.INFO, "Resolved target EClass: {0} from URI: {1}", targetEClass.getName(), eclassUri);
          return;
        }
      } else {
        throw new IllegalArgumentException(String.format("Unable to find EClass %s in EPackage %s", eclassUri, targetEPackage));
      }
  }

  /**
   * Bind method for dynamic EPackage reference with deferred EClass resolution
   */
  @Reference(cardinality = ReferenceCardinality.OPTIONAL, policy = ReferencePolicy.DYNAMIC)
  public void bindTargetEPackage(EPackage ePackage) {
    this.targetEPackage = ePackage;
    logger.log(Level.DEBUG, "Bound target EPackage: {0}", ePackage.getNsURI());

    // Try to resolve EClass now that we have the EPackage
    deferred.resolve(ePackage);
  }

  /**
   * Unbind method for dynamic EPackage reference
   */
  public void unbindTargetEPackage(EPackage ePackage) {
    if (this.targetEPackage == ePackage) {
      this.targetEPackage = null;
      this.targetEClass = null;
      logger.log(Level.DEBUG, "Unbound target EPackage: {0}", ePackage.getNsURI());
    }
  }
}