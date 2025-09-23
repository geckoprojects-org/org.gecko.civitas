# Generic MQTT-to-sensiNact EMF Integration Specification

## 1. Introduction

### 1.1. Purpose

This document outlines the specification for a generic integration layer between an MQTT message broker and the sensiNact IoT platform. The primary goal is to dynamically load models from MQTT messages and push them as device providers to sensiNact.

This integration utilizes the Eclipse sensiNact framework and EMF (Eclipse Modeling Framework) to create a flexible, model-driven bridge. It is designed to deserialize incoming MQTT message payloads into EMF model instances based on a configurable Ecore model (`EPackage`) and content type.

### 1.2. Scope

The scope of this specification covers two main components:

1. **`MqttGatewayConfigurator`**: An OSGi component responsible for configuring the connection to an MQTT broker and setting up the corresponding device factory.
2. **`MqttDeviceFactoryHandler`**: An OSGi component that listens for MQTT messages, deserializes the payload into an EMF model instance using a dynamically referenced `EPackage`, and pushes the resulting object to sensiNact.

### 1.3. System Overview

The overall architecture consists of an external system publishing messages to an MQTT broker. The `sensinact-southbound-mqtt` gateway, configured by `MqttGatewayConfigurator`, subscribes to the relevant topics. The `MqttDeviceFactoryHandler` processes these messages, using EMF's resource loading mechanism to automatically create and populate digital representations of the physical devices within the sensiNact platform.

## 2. Core Components

### 2.1. `MqttGatewayConfigurator`

This component is responsible for the initial setup and configuration of the integration.

#### 2.1.1. Functionality

- Creates and manages factory configurations for both the sensiNact MQTT gateway (`sensinact.southbound.mqtt`) and the `MqttDeviceFactoryHandler`.
- Uses a single configuration PID to derive the necessary configurations for the other components.
- Handles the connection setup to the MQTT broker, including security credentials.

#### 2.1.2. Configuration

The configurator is managed via an OSGi configuration with the following properties:

| Property          | Type       | Description                                                  |
| ----------------- | ---------- | ------------------------------------------------------------ |
| `id`              | `String`   | A unique identifier to bind the MQTT gateway to the device factory. |
| `protocol`        | `String`   | The protocol for the MQTT connection (e.g., "ssl", "tcp").   |
| `host`            | `String`   | The hostname or IP address of the MQTT broker.               |
| `port`            | `int`      | The port number of the MQTT broker.                          |
| `topics`          | `String[]` | An array of MQTT topics to subscribe to.                     |
| `eclass.uri`      | `String`   | The URI of the root `EClass` to expect in the MQTT message payload. |
| `content.type`    | `String`   | The content type of the message payload (e.g., `application/json`). |
| `epackage.target` | `String`   | An OSGi filter to target the `EPackage` service (e.g., `(osgi.epp.nsURI=...)`). |
| `certPath`        | `String`   | Absolute path to the client certificate file (.pem) for SSL/TLS. |
| `certKey`         | `String`   | Absolute path to the client private key file (.key) for SSL/TLS. |
| `caPath`          | `String`   | Absolute path to the CA certificate file (.pem) for SSL/TLS. |
| `caChainPath`     | `String[]` | An array of absolute paths to files in the CA certificate chain. |

### 2.2. `MqttDeviceFactoryHandler`

This component is the core of the dynamic model loading logic.

#### 2.2.1. Functionality

- Receives its configuration from the `MqttGatewayConfigurator`.
- Listens for MQTT messages on the configured topics.
- Dynamically references the `EPackage` specified by the `epackage.target` filter in its configuration.
- Uses an EMF `ResourceSet` configured for the specified `content.type` to deserialize message payloads.
- On message arrival, it loads the payload into an EMF Resource, which creates an `EObject` graph.
- Pushes the root `EObject` from the resource to the sensiNact platform via the `DataUpdate` service.

## 3. Data Flow and Processing

1. An external system publishes a message (e.g., in JSON format) to a configured MQTT topic.
2. The `sensinact-southbound-mqtt` gateway receives the message.
3. The `MqttDeviceFactoryHandler` is notified of the new message.
4. The handler obtains an EMF `ResourceSet` capable of handling the configured `content.type`.
5. The raw message payload is loaded into a new EMF `Resource`. EMF's deserialization mechanism automatically parses the payload and instantiates the corresponding `EObject`s based on the structure defined in the dynamically referenced `EPackage`.
6. The handler retrieves the root `EObject` from the resource's contents.
7. This `EObject` (which should be a valid `Provider` instance) is pushed to the sensiNact `DataUpdate` service, making it available within the platform.