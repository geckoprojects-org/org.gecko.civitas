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

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.emf.common.util.URI;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.cm.annotations.RequireConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

/**
 * Generic MQTT Gateway Configurator following the specification.
 *
 * This component is responsible for the initial setup and configuration of the
 * integration. It creates and manages factory configurations for both the
 * sensiNact MQTT gateway (sensinact.southbound.mqtt) and the
 * MqttDeviceFactoryHandler.
 *
 * Uses a single configuration PID to derive the necessary configurations for
 * the other components. Handles the connection setup to the MQTT broker,
 * including security credentials.
 */
@Component(configurationPid = "MqttGatewayConfig", configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = MqttGatewayConfigurator.MqttGatewayConfig.class)
@RequireConfigurationAdmin
public class MqttGatewayConfigurator {

  private static final Logger logger = System.getLogger(MqttGatewayConfigurator.class.getName());

  private static final String MQTT_PID = "sensinact.southbound.mqtt";

  @ObjectClassDefinition
  public @interface MqttGatewayConfig {
    @AttributeDefinition(name = "id", description = "Unique identifier to bind MQTT gateway to device factory")
    String id();

    @AttributeDefinition(name = "protocol", description = "Protocol for MQTT connection (ssl, tcp)")
    String protocol() default "ssl";

    @AttributeDefinition(name = "host", description = "Hostname or IP address of MQTT broker")
    String host();

    @AttributeDefinition(name = "port", description = "Port number of MQTT broker")
    int port();

    @AttributeDefinition(name = "topics", description = "Array of MQTT topics to subscribe to")
    String[] topics();

    @AttributeDefinition(name = "eclass.uri", description = "URI of the root EClass to expect in MQTT message payload")
    String eclass_uri();

    @AttributeDefinition(name = "content.type", description = "Content type of message payload (e.g., application/json)")
    String content_type() default "application/json";

    @AttributeDefinition(name = "certPath", description = "Absolute path to client certificate file (.pem)")
    String certPath();

    @AttributeDefinition(name = "certKey", description = "Absolute path to client private key file (.key)")
    String certKey();

    @AttributeDefinition(name = "caPath", description = "Absolute path to CA certificate file (.pem)")
    String caPath();

    @AttributeDefinition(name = "caChainPath", description = "Array of absolute paths to CA certificate chain files")
    String[] caChainPath();
  }

  @Reference
  private ConfigurationAdmin configAdmin;

  private Configuration mqttConfig;

  private Configuration factoryConfig;

  @Activate
  public void activate(MqttGatewayConfig config) {
    String id = config.id();
    logger.log(Level.DEBUG, "Start loading MQTT gateway configuration {0}", id);
    try {
      init(config, id);
    } catch (Exception e) {
      logger.log(Level.ERROR, () -> "Error while reading configuration from " + id, e);
    }
  }

  @Modified
  public void modify(MqttGatewayConfig config) {
    deactivate();
    String id = config.id();
    logger.log(Level.DEBUG, "Update MQTT gateway configuration {0}", id);
    try {
      init(config, id);
    } catch (Exception e) {
      logger.log(Level.ERROR, () -> "Error while reading configuration from " + id, e);
    }
  }

  @Deactivate
  public void deactivate() {
    try {
      factoryConfig.delete();
      mqttConfig.delete();
    } catch (IOException e) {
    }
  }

  private void init(MqttGatewayConfig config, String id) throws IOException {
    configureMqttGateway(id, config);
    configureDeviceFactory(id, config);
  }

  private void configureDeviceFactory(String id, MqttGatewayConfig config) throws IOException {
    logger.log(Level.INFO, () -> "create MQTT device factory config for " + id);
    Dictionary<String, Object> props = new Hashtable<>();
    props.put("mqtt.handler.id", id);
    props.put("eclass.uri", config.eclass_uri());
    props.put("content.type", config.content_type());
    URI uri = URI.createURI(config.eclass_uri());
    String epackageFilterString = String.format("(%s=%s)", EMFNamespaces.EMF_MODEL_NSURI,
        uri.trimFragment().toString());
    props.put("epackage.target", epackageFilterString);
    String resourceSetFilterString = String.format("(&(%s=CodecJson)(%s=%s))", EMFNamespaces.EMF_CONFIGURATOR_NAME,
        EMFNamespaces.EMF_MODEL_CONTENT_TYPE, config.content_type());
    props.put("resourceset.target", resourceSetFilterString);

    factoryConfig = configAdmin.getFactoryConfiguration(MqttDeviceFactoryHandler.PID, id, "?");
    logger.log(Level.DEBUG, "Update device factory configuration for {0} with {1}", factoryConfig, props);
    factoryConfig.updateIfDifferent(props);
  }

  public void configureMqttGateway(String name, MqttGatewayConfig config) throws IOException {
    mqttConfig = configAdmin.getFactoryConfiguration(MQTT_PID, name, "?");
    Dictionary<String, Object> props = new Hashtable<>();
    props.put("id", name);
    props.put("protocol", config.protocol());
    props.put("host", config.host());
    props.put("port", config.port());
    props.put("topics", config.topics());
    props.put("auth.clientcert.path", config.certPath());
    props.put("auth.clientcert.key", config.certKey());
    props.put("auth.clientcert.key.algorithm", "EC");
    props.put("auth.clientcert.ca.path", config.caPath());
    props.put("auth.trusted.certs", config.caChainPath());
    props.put("auth.allow.expired", true);

    logger.log(Level.DEBUG, "Update MQTT configuration for {0} with {1}", mqttConfig, props);
    mqttConfig.updateIfDifferent(props);
  }
}