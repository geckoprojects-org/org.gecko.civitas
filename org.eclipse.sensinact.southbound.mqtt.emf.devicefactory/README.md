# Generic MQTT-to-sensiNact EMF Integration

This project implements the generic MQTT-to-sensiNact EMF integration specification as defined in `specification.md`. It provides a flexible, model-driven bridge between MQTT message brokers and the sensiNact IoT platform using Eclipse Modeling Framework (EMF).

## Overview

The integration utilizes EMF to create a generic bridge that can dynamically deserialize incoming MQTT message payloads into EMF model instances based on a configurable Ecore model (EPackage) and content type. The resulting objects are automatically pushed to sensiNact as device providers.

## Core Components

### 1. MqttGatewayConfigurator

**Configuration PID:** `MqttGatewayConfig`

Responsible for initial setup and configuration of the integration:
- Creates factory configurations for both sensiNact MQTT gateway (`sensinact.southbound.mqtt`) and `MqttDeviceFactoryHandler`
- Uses single configuration PID to derive necessary configurations for other components
- Handles connection setup to MQTT broker including security credentials

#### Configuration Properties

| Property | Type | Description |
|----------|------|-------------|
| `id` | String | Unique identifier to bind MQTT gateway to device factory |
| `protocol` | String | Protocol for MQTT connection (ssl, tcp) |
| `host` | String | Hostname or IP address of MQTT broker |
| `port` | int | Port number of MQTT broker |
| `topics` | String[] | Array of MQTT topics to subscribe to |
| `eclass.uri` | String | URI of root EClass to expect in MQTT message payload |
| `content.type` | String | Content type of message payload (default: application/json) |
| `epackage.target` | String | OSGi filter to target the EPackage service |
| `certPath` | String | Absolute path to client certificate file (.pem) |
| `certKey` | String | Absolute path to client private key file (.key) |
| `caPath` | String | Absolute path to CA certificate file (.pem) |
| `caChainPath` | String[] | Array of paths to CA certificate chain files |

### 2. MqttDeviceFactoryHandler

**Configuration PID:** `mqtt.emf.device.factory`

Core component implementing dynamic model loading logic:
- Receives configuration from `MqttGatewayConfigurator`
- Listens for MQTT messages on configured topics
- Dynamically references EPackage specified by `epackage.target` filter
- Uses EMF ResourceSet configured for specified `content.type` to deserialize payloads
- Loads payload into EMF Resource creating EObject graph
- Pushes root EObject to sensiNact platform via `DataUpdate` service

## Data Flow and Processing

1. **External System** publishes message (e.g., JSON) to configured MQTT topic
2. **sensiNact MQTT Gateway** receives the message
3. **MqttDeviceFactoryHandler** is notified of new message
4. **Handler** obtains EMF ResourceSet capable of handling configured content type
5. **Raw payload** is loaded into new EMF Resource
6. **EMF deserialization** automatically parses payload and instantiates corresponding EObjects
7. **Handler** retrieves root EObject from resource contents
8. **Root EObject** (valid Provider instance) is pushed to sensiNact DataUpdate service

## Example Configuration

```properties
# MQTT Gateway Configuration
id=my-iot-gateway
protocol=ssl
host=mqtt.example.com
port=8883
topics=devices/+/data,sensors/+/readings
eclass.uri=http://example.com/mymodel/1.0#//DeviceProvider
content.type=application/json
epackage.target=(osgi.epp.nsURI=http://example.com/mymodel/1.0)
certPath=/path/to/client.pem
certKey=/path/to/client.key
caPath=/path/to/ca.pem
caChainPath=/path/to/chain1.pem,/path/to/chain2.pem
```

## Usage

1. **Deploy** this bundle with required dependencies
2. **Create EPackage service** for your target EMF model
3. **Configure** using properties above
4. **Activate configuration** - both components start automatically
5. **Publish messages** to configured MQTT topics
6. **Verify** sensiNact providers are created from messages

## Dependencies

- OSGi Configuration Admin
- OSGi Component Services
- Eclipse sensiNact Gateway Core
- Eclipse sensiNact MQTT Southbound
- Eclipse EMF Core
- Gecko EMF OSGi utilities

## Architecture Benefits

- **Generic**: Works with any EMF model and JSON/XML structure
- **Model-Driven**: Uses Ecore models to define message structure
- **Automatic**: EMF handles deserialization transparently
- **Type-Safe**: Validates object types against expected EClass using EMF type system
- **Inheritance Support**: Accepts subclasses of the expected EClass type
- **Dynamic**: EPackage services can be added/removed at runtime with deferred binding
- **Optional Validation**: EClass URI is optional - can work without type validation
- **Secure**: Full SSL/TLS support with certificate authentication
- **OSGi Native**: Complete OSGi service component integration

This implementation strictly follows the specification in `specification.md` providing a concrete, reusable foundation for MQTT-based IoT integrations with sensiNact.