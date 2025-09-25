# EMF Repository Data Sink - Configuration and Usage Examples

The `EMFRepositoryDataSink` is a TypedEventHandler component that receives EObject events from OSGi TypedEventBus and persists them to an EMF Repository. It provides configurable merge strategies for handling existing objects and comprehensive logging for monitoring and debugging.

## Overview

### Key Features

- **Event-Driven Persistence**: Automatically persists EObjects received from event topics
- **Merge Strategies**: Configurable handling of existing objects (overwrite vs. merge)
- **Repository Integration**: Uses EMF Repository for persistent storage with ID-based lookups
- **Comprehensive Logging**: Detailed logging with configurable verbosity levels
- **Type Safety**: Strongly typed event handling with EObject instances

### Architecture

```
EObject Publisher → TypedEventBus → EMFRepositoryDataSink → EMF Repository → Database
```

## Configuration

### Required Properties

**Note**: In OSGi Configuration Admin, underscore characters in annotation attributes are converted to dots in the actual configuration properties.

| Property | Description | Example |
|----------|-------------|---------|
| `event.topic` | OSGi event topic to listen to | `"org/civitas/meter/data/parsed"` |
| `repo.target` | OSGi filter for EMF Repository | `"(repository.name=meter-repository)"` |
| `merger.strategy` | How to handle existing objects | `"MERGE_INTO_IGNORE_UNSET"` |
| `detailed.logging` | Enable verbose logging | `true` |

### Merge Strategies

#### OVERWRITE
- **Behavior**: Completely replaces existing objects with new data
- **Use Case**: When incoming data is the complete, authoritative version
- **Performance**: Faster, as no merging logic is required

#### MERGE_INTO_IGNORE_UNSET
- **Behavior**: Merges incoming data into existing objects, preserving unset attributes
- **Use Case**: When incoming data is partial updates or incremental changes
- **Performance**: Slower due to merge operations, but preserves existing data

## Configuration Examples

### Basic Configuration

```json
{
  "EMFRepositoryDataSink~meter-data": {
    "event.topic": "org/civitas/meter/data/parsed",
    "repo.target": "(repository.name=meter-repository)",
    "merger.strategy": "MERGE_INTO_IGNORE_UNSET",
    "detailed.logging": true
  }
}
```

### Advanced Multi-Repository Setup

```json
{
  "EMFRepositoryDataSink~meter-readings": {
    "event.topic": "org/civitas/meter/readings/parsed",
    "repo.target": "(&(repository.name=meter-repository)(repository.type=mongodb))",
    "merger.strategy": "MERGE_INTO_IGNORE_UNSET",
    "detailed.logging": true
  },

  "EMFRepositoryDataSink~audit-trail": {
    "event.topic": "org/civitas/audit/events",
    "repo.target": "(&(repository.name=audit-repository)(repository.type=postgresql))",
    "merger.strategy": "OVERWRITE",
    "detailed.logging": true
  }
}
```

## Integration Patterns

### 1. CSV Data Processing Pipeline

```
MinIOCSVDownloadService → TypedEventBus → EMFRepositoryDataSink → Repository
```

**Configuration:**
```json
{
  "MinIOCSVDownloadService~meter-data": {
    "eventTopic": "org/civitas/meter/data/parsed"
  },
  "EMFRepositoryDataSink~meter-data": {
    "event.topic": "org/civitas/meter/data/parsed",
    "repo.target": "(repository.name=meter-repository)"
  }
}
```

### 2. Real-time Data Ingestion

```java
// Publisher component
@Component
public class DataIngestionService {
    @Reference
    TypedEventBus eventBus;

    public void processIncomingData(EObject data) {
        // Ensure object has ID
        if (EcoreUtil.getID(data) == null) {
            EcoreUtil.setID(data, generateId());
        }

        // Publish to event bus
        eventBus.deliver("org/civitas/sensor/data/parsed", data);
    }
}
```

### 3. Batch Data Processing

```java
public void processBatch(List<EObject> objects) {
    objects.forEach(obj -> {
        EcoreUtil.setID(obj, extractIdFromData(obj));
        eventBus.deliver("org/civitas/batch/data/parsed", obj);
    });
}
```

## Logging and Monitoring

### Log Levels

- **INFO**: Component activation, object creation/merge/overwrite operations
- **FINE**: Detailed processing information (when `detailed_logging=true`)
- **WARNING**: Objects without IDs, non-critical issues
- **SEVERE**: Repository failures, critical errors

### Sample Log Output

```
INFO: EMFRepositoryDataSink activated - Topic: 'org/civitas/meter/data/parsed', Repository Target: '(repository.name=meter-repository)', Merge Strategy: MERGE_INTO_IGNORE_UNSET, Detailed Logging: true

INFO: Received event on topic 'org/civitas/meter/data/parsed' for EObject type: Meter with ID: METER_001

INFO: Merging incoming data into existing object with ID: METER_001

INFO: Successfully saved EObject - Type: Meter, ID: METER_001, Strategy: MERGE_INTO_IGNORE_UNSET
```

## Best Practices

### 1. ID Management
- **Always assign IDs**: EObjects must have IDs for repository operations
- **Use meaningful IDs**: Domain-specific IDs are better than random UUIDs
- **ID uniqueness**: Ensure IDs are unique within the EClass scope

### 2. Configuration
- **Use detailed logging**: Enable for development and troubleshooting
- **Proper repository filters**: Use specific OSGi filters to target correct repositories
- **Choose appropriate merge strategy**: Based on your data update patterns

### 3. Error Handling
- **Monitor logs**: Watch for repository failures and ID-related warnings
- **Handle exceptions**: Repository operations can fail due to constraints or connectivity
- **Graceful degradation**: Consider fallback strategies for persistence failures

### 4. Performance
- **Batch considerations**: Large volumes may require batching strategies
- **Repository tuning**: Configure repository connection pools and caching
- **Merge strategy impact**: OVERWRITE is faster than MERGE_INTO_IGNORE_UNSET

## Troubleshooting

### Common Issues

| Issue | Cause | Solution |
|-------|--------|----------|
| "EObject without ID" warnings | Missing object IDs | Ensure `EcoreUtil.setID()` is called before publishing |
| Repository save failures | Database constraints, connectivity | Check repository configuration and database status |
| Events not received | Topic mismatch | Verify event topic matches between publisher and sink |
| Merge not working | Wrong strategy | Use `MERGE_INTO_IGNORE_UNSET` for partial updates |

### Debug Steps

1. **Enable detailed logging**: Set `detailed_logging=true`
2. **Check event flow**: Verify events are published to correct topics
3. **Validate configuration**: Ensure repository targets are correct
4. **Test repository**: Verify repository is accessible and functional
5. **Monitor resource usage**: Check memory and database connections

## Dependencies

- **EMF Repository**: Target repository must be available and configured
- **TypedEventBus**: OSGi TypedEvent implementation required
- **EObject IDs**: Objects must have IDs assigned via `EcoreUtil.setID()`

## Ecore Configuration Model

The EMF Repository Data Sink configurations are also modeled using Eclipse Modeling Framework (EMF) Ecore. This provides:

- **Type Safety**: Structured configuration objects with validation
- **Code Generation**: Java classes generated from the Ecore model
- **XMI Support**: Configuration data can be stored in XMI format
- **Integration**: Easy integration with EMF-based tools and frameworks

### Model Structure

The Ecore model (`model/emf-repository-datasink-config.ecore`) defines:

- **EMFRepositoryDataSinkConfig**: Individual data sink configuration
- **EMFRepositoryDataSinkConfigurationRoot**: Container for multiple configurations
- **MergeStrategy**: Enum for merge behavior (OVERWRITE, MERGE_INTO_IGNORE_UNSET)
- **Environment**: Enum for deployment environments (DEVELOPMENT, STAGING, PRODUCTION)

### Example XMI Configuration

```xml
<datasinkconfig:EMFRepositoryDataSinkConfigurationRoot
    name="Civitas Data Sink Configuration"
    environment="DEVELOPMENT">

  <dataSinkConfigurations configurationId="meter-data-sink"
                         eventTopic="org/civitas/meter/data/parsed"
                         repoTarget="(repository.name=meter-repository)"
                         mergeStrategy="MERGE_INTO_IGNORE_UNSET"
                         detailedLogging="true"
                         enabled="true"/>
</datasinkconfig:EMFRepositoryDataSinkConfigurationRoot>
```

### Code Generation

To generate Java classes from the Ecore model:
1. Uncomment the `-generate` instruction in `bnd.bnd`
2. Run the build to generate model classes in `src/`

### Configuration Properties Mapping

The Ecore model includes Extended Metadata annotations that document OSGi Configuration Admin property mapping. Note that properties with underscore characters in annotation attributes are automatically converted to dots in OSGi Configuration Admin.

| Ecore Attribute | Annotation Attribute | OSGi Config Property | Conversion | Description |
|-----------------|---------------------|---------------------|------------|-------------|
| `eventTopic` | `event_topic` | `event.topic` | Yes | Event topic to listen to |
| `repoTarget` | `repo_target` | `repo.target` | Yes | Repository OSGi filter |
| `mergeStrategy` | `merger_strategy` | `merger.strategy` | Yes | Merge behavior |
| `detailedLogging` | `detailed_logging` | `detailed.logging` | Yes | Logging verbosity |

**Extended Metadata Annotations**: The Ecore model uses Extended Metadata annotations to document this mapping:
- `osgi.config.property`: The actual OSGi Configuration Admin property name
- `osgi.annotation.attribute`: The annotation attribute name in the code
- All properties in this model require underscore-to-dot conversion as they contain underscores in their annotation attributes

## Related Components

- **MinIOCSVDownloadService**: CSV data source that publishes to event topics
- **EMF Repository**: Persistence layer for EObjects
- **TypedEventBus**: Event distribution mechanism