/**
 */
package org.civitas.meter.intermediate.model.meterintermediate.impl;

import org.civitas.meter.intermediate.model.meterintermediate.MeterIntermediateFactory;
import org.civitas.meter.intermediate.model.meterintermediate.MeterIntermediatePackage;
import org.civitas.meter.intermediate.model.meterintermediate.MeteringPoint;

import org.civitas.meter.target.targetPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeterIntermediatePackageImpl extends EPackageImpl implements MeterIntermediatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meteringPointEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.civitas.meter.intermediate.model.meterintermediate.MeterIntermediatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MeterIntermediatePackageImpl() {
		super(eNS_URI, MeterIntermediateFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MeterIntermediatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MeterIntermediatePackage init() {
		if (isInited) return (MeterIntermediatePackage)EPackage.Registry.INSTANCE.getEPackage(MeterIntermediatePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMeterIntermediatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MeterIntermediatePackageImpl theMeterIntermediatePackage = registeredMeterIntermediatePackage instanceof MeterIntermediatePackageImpl ? (MeterIntermediatePackageImpl)registeredMeterIntermediatePackage : new MeterIntermediatePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		targetPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMeterIntermediatePackage.createPackageContents();

		// Initialize created meta-data
		theMeterIntermediatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMeterIntermediatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MeterIntermediatePackage.eNS_URI, theMeterIntermediatePackage);
		return theMeterIntermediatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeteringPoint() {
		return meteringPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeteringPoint_Id() {
		return (EAttribute)meteringPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeteringPoint_Readings() {
		return (EReference)meteringPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeterIntermediateFactory getMeterIntermediateFactory() {
		return (MeterIntermediateFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		meteringPointEClass = createEClass(METERING_POINT);
		createEAttribute(meteringPointEClass, METERING_POINT__ID);
		createEReference(meteringPointEClass, METERING_POINT__READINGS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		targetPackage thetargetPackage = (targetPackage)EPackage.Registry.INSTANCE.getEPackage(targetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(meteringPointEClass, MeteringPoint.class, "MeteringPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeteringPoint_Id(), ecorePackage.getEString(), "id", null, 0, 1, MeteringPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeteringPoint_Readings(), thetargetPackage.getMeterReading(), null, "readings", null, 0, -1, MeteringPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "complianceLevel", "17.0",
			   "oSGiCompatible", "true",
			   "basePackage", "org.civitas.meter.intermediate.model",
			   "resource", "XMI"
		   });
	}

} //MeterIntermediatePackageImpl
