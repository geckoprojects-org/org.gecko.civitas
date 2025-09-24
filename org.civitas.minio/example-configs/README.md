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
    "eClassUri": "Meter"
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
    "eClassUri": "SensorReading"
  }
}
```

## Deployment

1. Place these JSON files in your OSGi configuration directory (typically `load/` or `configuration/`)
2. The Felix Configurator will automatically pick up these configurations
3. Services will be activated with the specified settings

## EClass URIs

Make sure the `eClassUri` values match the actual EClass names in your EMF model packages:
- For meter source model: `"Meter"`, `"Customer"`, `"Reading"`, etc.
- For sensor model: `"SensorReading"`, etc.
- For GLT model: `"Building"`, `"Contact"`, etc.

## MinIO Setup

Ensure your MinIO server is running and accessible at the configured endpoint with the provided credentials.