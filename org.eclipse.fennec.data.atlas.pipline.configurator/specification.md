# org.eclipse.fennec.data.atlas.pipline.configurator.PiplineConfigurator

This component gets org.civitas.pipeline.Pipline Services injected. A Pipline can hold a List of http://civitas.org/osgi/component/configuration/1.0#//Configuration Objects and PiplineSetps. From these Configuration Admin Configurations must be created. When a Pipeline is unregistered the created Configurations must be removed again. 

PiplineSteps can be http://civitas.org/osgi/component/configuration/1.0#//Configuration Objects as well. If they are, they can be handled like any other Configurations. 

## How to transform Configuration Models to ConfigurationAdmin Configurations

All EStructural Features of all Supertypes must be considered except Attributes from EObject.

The key for the Configuration are constructed as follows (if not defined otherwise in the special handling instructions):

1. ExtendedMetadata Annotation with the key name
2. EStructuralFeature#getName converted according to the Component property types sepcification - https://osgi.github.io/osgi/cmpn/service.component.html#service.component-component.property.types

### EAttributes

EAttributes will become simple entries in the Configuration Dictionary. The key is defined by the EAttribute name or via the ExtendedMetadata Annotation with the key name if present.

### EReferences

References with the following Types will be supported

#### EClass

The key will be defined by the EReference name or the ExtendedMetadata
If the EReference is to an EClass, the value for the Configuration will become a String that is the EClasses URI.   

#### EPackage

The key will be the ERefernce Name plus ".target" or the ExtendedMetadata name.
The value will be a filter "(emf.nsUri=<EPackage#getNsURI>)".

#### Configuration

The key will be the ERefernce Name plus ".target" or the ExtendedMetadata name.
The value will be a filter using the other services id a as identifying target.
If the References is a Many, then the filters will be combined with as "or" filters.

#### PipelineStep

Pipelines communicte via TypedEventAdmin Topics. Thus the key will be defined via the ExtendedMetadata name. If they are many, than the value will be a List of Strings. The String will be configured as follows:

`pipline.getId() + "/" + refrence.getName() + "/" + pipline.eGet(reference).getId()` 