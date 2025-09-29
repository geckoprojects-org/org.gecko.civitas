/*
 */
package org.civitas.meter.intermediate.model.meterintermediate.configuration;

import java.util.Hashtable;

import org.civitas.meter.intermediate.model.meterintermediate.MeterIntermediateFactory;
import org.civitas.meter.intermediate.model.meterintermediate.MeterIntermediatePackage;

import org.civitas.meter.intermediate.model.meterintermediate.impl.MeterIntermediatePackageImpl;

import org.civitas.meter.intermediate.model.meterintermediate.util.MeterIntermediateResourceFactoryImpl;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource.Factory;

import org.gecko.emf.osgi.configurator.EPackageConfigurator;

import org.osgi.annotation.bundle.Capability;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import org.osgi.service.condition.Condition;
/**
 * The <b>PackageConfiguration</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * 
 * @generated
 */
@Component(name = "MeterIntermediateConfigurator")
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.civitas.meter.intermediate.model.meterintermediate.util.MeterIntermediateResourceFactoryImpl, org.eclipse.emf.ecore.resource.Resource$Factory\"" , "uses:=\"org.eclipse.emf.ecore.resource,org.civitas.meter.intermediate.model.meterintermediate.util\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.civitas.meter.intermediate.model.meterintermediate.MeterIntermediateFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=\"org.eclipse.emf.ecore,org.civitas.meter.intermediate.model.meterintermediate\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.civitas.meter.intermediate.model.meterintermediate.MeterIntermediatePackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=\"org.eclipse.emf.ecore,org.civitas.meter.intermediate.model.meterintermediate\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.configurator.EPackageConfigurator\"" , "uses:=\"org.eclipse.emf.ecore,org.civitas.meter.intermediate.model.meterintermediate\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class MeterIntermediateConfigurationComponent {
	
	private ServiceRegistration<?> packageRegistration = null;
	private ServiceRegistration<EPackageConfigurator> ePackageConfiguratorRegistration = null;
	private ServiceRegistration<?> eFactoryRegistration = null;
	private ServiceRegistration<?> conditionRegistration = null;
	private ServiceRegistration<?> resourceFactoryRegistration = null;

	/**
	 * Activates the Configuration Component.
	 *
	 * @generated
	 */
	@Activate
	public void activate(BundleContext ctx) {
		MeterIntermediatePackage ePackage = MeterIntermediatePackageImpl.eINSTANCE;
		
		
		MeterIntermediateEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerResourceFactoryService(ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the MeterIntermediateEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private MeterIntermediateEPackageConfigurator registerEPackageConfiguratorService(MeterIntermediatePackage ePackage, BundleContext ctx){
		MeterIntermediateEPackageConfigurator packageConfigurator = new MeterIntermediateEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}

	/**
	 * Registers the MeterIntermediateResourceFactoryImpl as a service.
	 *
	 * @generated
	 */
	private void registerResourceFactoryService(BundleContext ctx){
		MeterIntermediateResourceFactoryImpl factory = new MeterIntermediateResourceFactoryImpl();
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(factory.getServiceProperties());
		String[] serviceClasses = new String[] {MeterIntermediateResourceFactoryImpl.class.getName(), Factory.class.getName()};
		resourceFactoryRegistration = ctx.registerService(serviceClasses, factory, properties);
	}

	/**
	 * Registers the MeterIntermediatePackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(MeterIntermediatePackage ePackage, MeterIntermediateEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {MeterIntermediatePackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the MeterIntermediateFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(MeterIntermediatePackage ePackage, MeterIntermediateEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {MeterIntermediateFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getMeterIntermediateFactory(), properties);
	}

	private void registerConditionService(MeterIntermediateEPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, MeterIntermediatePackage.eNS_URI);
		conditionRegistration = ctx.registerService(Condition.class, Condition.INSTANCE, properties);
	}

	/**
	 * Deactivates and unregisters everything.
	 *
	 * @generated
	 */
	@Deactivate
	public void deactivate() {
		conditionRegistration.unregister();
		eFactoryRegistration.unregister();
		packageRegistration.unregister();
		resourceFactoryRegistration.unregister();

		ePackageConfiguratorRegistration.unregister();
		EPackage.Registry.INSTANCE.remove(MeterIntermediatePackage.eNS_URI);
	}
}
