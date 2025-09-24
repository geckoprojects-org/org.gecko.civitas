# MinIO Configuration Examples

This directory contains example configuration files for the MinIO services.

## MinIO Client Configuration (`minio-client-config.json`)

Configures the MinIOClient service that connects to the MinIO server.

### Configuration Properties:
- **endpoint**: MinIO server URL (default: `http://localhost:9000`)
- **accessKey**: MinIO access key (default: `minioadmin`)
- **secretKey**: MinIO secret key (default: `minioadmin`)

### Example:
```json
{
  "MinIOClient~default": {
    "endpoint": "http://localhost:9000",
    "accessKey": "minioadmin",
    "secretKey": "minioadmin"
  }
}
```

## MinIO CSV Download Service Configuration (`minio-csv-download-service-config.json`)

Configures the MinIOCSVDownloadService that processes CSV files from MinIO buckets.

### Configuration Properties:
- **bucketname**: Name of the MinIO bucket to monitor
- **cron**: Cron expression for scheduling file checks (format: seconds minutes hours day month dayOfWeek)
- **client.target**: OSGi filter to target the specific MinIOClient instance
- **eClassUri**: URI/name of the EClass to use for parsing CSV data
- **eventTopic**: Event topic to publish parsed EObjects to (default: `org/civitas/minio/csv/parsed`)

### Cron Expression Examples:
- `"0 */5 * * * *"` - Every 5 minutes
- `"0 */10 * * * *"` - Every 10 minutes
- `"0 0 */1 * * *"` - Every hour
- `"0 30 9 * * *"` - Daily at 9:30 AM

### Example Configurations:

#### Meter Data Processing:
```json
{
  "MinIOCSVDownloadService~meter-data": {
    "bucketname": "meter-csv-data",
    "cron": "0 */5 * * * *",
    "client.target": "(service.pid=MinIOClient~default)",
    "eClassUri": "https://civitas.org/meter/source/1.0.0#//Meter",
    "eventTopic": "org/civitas/meter/data/parsed"
  }
}
```

#### Sensor Data Processing:
```json
{
  "MinIOCSVDownloadService~sensor-data": {
    "bucketname": "sensor-csv-data",
    "cron": "0 */10 * * * *",
    "client.target": "(service.pid=MinIOClient~default)",
    "eClassUri": "https://civitas.org/meter/source/1.0.0#//SensorReading",
    "eventTopic": "org/civitas/sensor/data/parsed"
  }
}
```

## Asynchronous Processing

The MinIOCSVDownloadService performs initial file processing asynchronously during activation to avoid blocking the OSGi startup process. The service:

1. **Immediate Activation**: Extracts the EClass and starts the scheduler immediately
2. **Async Initial Processing**: Uses OSGi Promises to process existing files in the background
3. **Non-blocking Startup**: OSGi container startup continues without waiting for initial CSV processing
4. **Logging**: Success/failure of initial processing is logged but doesn't affect service activation

## Event Handling

The service uses OSGi TypedEventAdmin to publish parsed EObjects to configurable event topics. Each successfully parsed EObject is sent as a typed event.

### Creating Event Handlers

To receive the events, create a component that implements `TypedEventHandler<EObject>`:

```java
@Component
@EventTopics("org/civitas/meter/data/parsed")
public class MeterDataEventHandler implements TypedEventHandler<EObject> {

    @Override
    public void notify(String topic, EObject event) {
        if (event.eClass().getName().equals("Meter")) {
            // Process meter data
            logger.info("Received meter data: {}", event);
        }
    }
}
```

### Event Topic Conventions

Recommended topic naming patterns:
- `org/civitas/meter/data/parsed` - For meter data
- `org/civitas/sensor/data/parsed` - For sensor readings
- `org/civitas/glt/data/parsed` - For GLT building data

## Deployment

1. Place these JSON files in your OSGi configuration directory (typically `load/` or `configuration/`)
2. The Felix Configurator will automatically pick up these configurations
3. Services will be activated with the specified settings

## EClass URIs

Make sure the `eClassUri` values match the actual EClass URI in your EMF model packages:
- For meter source model: `"https://civitas.org/meter/source/1.0.0#//Meter"`, `"https://civitas.org/meter/source/1.0.0#//Customer"`, `"https://civitas.org/meter/source/1.0.0#//Reading"`, etc.

## Ecore Configuration Model

The MinIO configurations are also modeled using Eclipse Modeling Framework (EMF) Ecore. This provides:

- **Type Safety**: Structured configuration objects with validation
- **Code Generation**: Java classes generated from the Ecore model
- **XMI Support**: Configuration data can be stored in XMI format
- **Integration**: Easy integration with EMF-based tools and frameworks

### Model Structure

The Ecore model (`model/minio-config.ecore`) defines:

- **MinIOClientConfig**: Client connection settings (endpoint, credentials)
- **MinIOCSVDownloadServiceConfig**: Download service configuration
- **MinIOConfigurationRoot**: Container for multiple configurations
- **ScheduleFrequency**: Enum with predefined cron expressions

### Example XMI Configuration

```xml
<minioconfig:MinIOConfigurationRoot>
  <clientConfigurations configurationId="minio-client-default"
                        endpoint="http://localhost:9000"
                        accessKey="minioadmin"
                        secretKey="minioadmin"/>

  <downloadServiceConfigurations configurationId="meter-data-processor"
                                bucketname="meter-csv-data"
                                eClassUri="https://civitas.org/meter/source/1.0.0#//Meter"
                                eventTopic="org/civitas/meter/data/parsed"/>
</minioconfig:MinIOConfigurationRoot>
```

### Code Generation

To generate Java classes from the Ecore model:
1. Uncomment the `-generate` instruction in `bnd.bnd`
2. Run the build to generate model classes in `src/`

## MinIO Setup

Ensure your MinIO server is running and accessible at the configured endpoint with the provided credentials.