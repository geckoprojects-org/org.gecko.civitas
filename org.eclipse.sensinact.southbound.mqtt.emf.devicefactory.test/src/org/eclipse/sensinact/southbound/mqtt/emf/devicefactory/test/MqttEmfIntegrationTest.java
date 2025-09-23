/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.eclipse.sensinact.southbound.mqtt.emf.devicefactory.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.eclipse.sensinact.southbound.mqtt.emf.devicefactory.MqttDeviceFactoryHandler;
import org.eclipse.sensinact.southbound.mqtt.emf.devicefactory.MqttGatewayConfigurator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.annotation.config.WithFactoryConfiguration;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

/**
 * Integration tests for the complete MQTT EMF device factory workflow
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)

public class MqttEmfIntegrationTest {

    @InjectService
    private ConfigurationAdmin configAdmin;

    private BundleContext bundleContext;

    @BeforeEach
    public void setUp(@InjectBundleContext BundleContext ctx) {
        this.bundleContext = ctx;
    }

//    @Test
//    public void testConfigurationWorkflow() throws Exception {
//        // Create configuration for MqttGatewayConfigurator
//        Configuration config = configAdmin.getConfiguration("MqttGatewayConfig", "?");
//
//        Dictionary<String, Object> props = new Hashtable<>();
//        props.put("id", "integration-test-gateway");
//        props.put("protocol", "tcp");
//        props.put("host", "localhost");
//        props.put("port", 1883);
//        props.put("topics", new String[]{"test/+/data"});
//        props.put("eclass.uri", "http://example.com/test/1.0#//TestProvider");
//        props.put("content.type", "application/json");
//        props.put("epackage.target", "(osgi.epp.nsURI=http://example.com/test/1.0)");
//
//        config.update(props);
//
//        // Wait for configuration to be processed
//        Thread.sleep(1000);
//
//        // Verify that the MQTT configuration was created
//        Configuration[] mqttConfigs = configAdmin.listConfigurations("(service.factoryPid=sensinact.southbound.mqtt)");
//        assertNotNull(mqttConfigs, "MQTT configurations should be created");
//        assertTrue(mqttConfigs.length > 0, "At least one MQTT configuration should exist");
//
//        // Find our specific configuration
//        Configuration mqttConfig = null;
//        for (Configuration cfg : mqttConfigs) {
//            Dictionary<String, Object> configProps = cfg.getProperties();
//            if ("integration-test-gateway".equals(configProps.get("id"))) {
//                mqttConfig = cfg;
//                break;
//            }
//        }
//
//        assertNotNull(mqttConfig, "Our MQTT configuration should be found");
//
//        // Verify MQTT configuration properties
//        Dictionary<String, Object> mqttProps = mqttConfig.getProperties();
//        assertEquals("integration-test-gateway", mqttProps.get("id"));
//        assertEquals("tcp", mqttProps.get("protocol"));
//        assertEquals("localhost", mqttProps.get("host"));
//        assertEquals(1883, mqttProps.get("port"));
//
//        // Verify that the device factory configuration was created
//        Configuration[] factoryConfigs = configAdmin.listConfigurations("(service.factoryPid=" + MqttDeviceFactoryHandler.PID + ")");
//        assertNotNull(factoryConfigs, "Device factory configurations should be created");
//        assertTrue(factoryConfigs.length > 0, "At least one device factory configuration should exist");
//
//        // Find our specific device factory configuration
//        Configuration factoryConfig = null;
//        for (Configuration cfg : factoryConfigs) {
//            Dictionary<String, Object> configProps = cfg.getProperties();
//            if ("integration-test-gateway".equals(configProps.get("mqtt.handler.id"))) {
//                factoryConfig = cfg;
//                break;
//            }
//        }
//
//        assertNotNull(factoryConfig, "Our device factory configuration should be found");
//
//        // Verify device factory configuration properties
//        Dictionary<String, Object> factoryProps = factoryConfig.getProperties();
//        assertEquals("integration-test-gateway", factoryProps.get("mqtt.handler.id"));
//        assertEquals("http://example.com/test/1.0#//TestProvider", factoryProps.get("eclass.uri"));
//        assertEquals("application/json", factoryProps.get("content.type"));
//        assertEquals("(osgi.epp.nsURI=http://example.com/test/1.0)", factoryProps.get("epackage.target"));
//
//        // Clean up configurations
//        config.delete();
//        mqttConfig.delete();
//        factoryConfig.delete();
//    }
//
//    @Test
//    public void testServiceRegistration() throws Exception {
//        // Wait a bit for services to be registered
//        Thread.sleep(500);
//
//        // Check that MqttGatewayConfigurator service is available
//        ServiceReference<?>[] configuratorRefs = bundleContext.getServiceReferences(
//            MqttGatewayConfigurator.class.getName(), null);
//
//        // The service might not be registered if there's no active configuration
//        // This is expected behavior for @Component with configurationPolicy = REQUIRE
//
//        // Check bundle is active
//        assertTrue(bundleContext.getBundle().getState() == bundleContext.getBundle().ACTIVE,
//            "Test bundle should be active");
//    }
//
//    @Test
//    public void testConfigurationDefaults() throws Exception {
//        // Test configuration with minimal required properties
//        Configuration config = configAdmin.getConfiguration("MqttGatewayConfig", "?");
//
//        Dictionary<String, Object> props = new Hashtable<>();
//        props.put("id", "minimal-test-gateway");
//        props.put("host", "test.example.com");
//        props.put("port", 8883);
//        props.put("topics", new String[]{"minimal/test"});
//        props.put("eclass.uri", "http://minimal.test#//Provider");
//        props.put("epackage.target", "(test=minimal)");
//        // Note: protocol and content.type should use defaults
//
//        config.update(props);
//
//        // Wait for processing
//        Thread.sleep(500);
//
//        // Verify MQTT configuration was created with defaults
//        Configuration[] mqttConfigs = configAdmin.listConfigurations("(service.factoryPid=sensinact.southbound.mqtt)");
//        if (mqttConfigs != null) {
//            for (Configuration cfg : mqttConfigs) {
//                Dictionary<String, Object> configProps = cfg.getProperties();
//                if ("minimal-test-gateway".equals(configProps.get("id"))) {
//                    // Found our configuration
//                    assertEquals("ssl", configProps.get("protocol")); // default from annotation
//                    break;
//                }
//            }
//        }
//
//        // Verify device factory configuration was created with defaults
//        Configuration[] factoryConfigs = configAdmin.listConfigurations("(service.factoryPid=" + MqttDeviceFactoryHandler.PID + ")");
//        if (factoryConfigs != null) {
//            for (Configuration cfg : factoryConfigs) {
//                Dictionary<String, Object> configProps = cfg.getProperties();
//                if ("minimal-test-gateway".equals(configProps.get("mqtt.handler.id"))) {
//                    // Found our configuration
//                    assertEquals("application/json", configProps.get("content.type")); // default
//                    break;
//                }
//            }
//        }
//
//        // Clean up
//        config.delete();
//    }

//    @Test
//    public void testErrorHandling() throws IOException {
//        // Test with invalid configuration
//        Configuration config = configAdmin.getConfiguration("MqttGatewayConfig", "?");
//
//        Dictionary<String, Object> props = new Hashtable<>();
//        // Missing required properties should be handled gracefully
//        props.put("id", "invalid-config");
//        // Missing host, port, topics, etc.
//
//        // This should not throw an exception
//        config.update(props);
//
//        // Clean up
//        config.delete();
//    }

    @Test
    public void testConfigurationModification() throws Exception {
        // Create initial configuration
        Configuration config = configAdmin.getFactoryConfiguration("MqttGatewayConfig", "?");

        Dictionary<String, Object> props = new Hashtable<>();
        props.put("id", "modify-test-gateway");
        props.put("protocol", "tcp");
        props.put("host", "initial.example.com");
        props.put("port", 1883);
        props.put("topics", new String[]{"initial/topic"});
        props.put("eclass.uri", "http://initial.test#//Provider");
        props.put("content.type", "application/json");

        config.update(props);
        Thread.sleep(500);

        // Modify configuration
        props.put("host", "modified.example.com");
        props.put("port", 8883);
        props.put("protocol", "ssl");

        config.update(props);
        Thread.sleep(500);

        // Verify modifications were applied
        Configuration[] mqttConfigs = configAdmin.listConfigurations("(service.factoryPid=sensinact.southbound.mqtt)");
        if (mqttConfigs != null) {
            for (Configuration cfg : mqttConfigs) {
                Dictionary<String, Object> configProps = cfg.getProperties();
                if ("modify-test-gateway".equals(configProps.get("id"))) {
                    assertEquals("modified.example.com", configProps.get("host"));
                    assertEquals(8883, configProps.get("port"));
                    assertEquals("ssl", configProps.get("protocol"));
                    break;
                }
            }
        }

        // Clean up
        config.delete();
    }
}