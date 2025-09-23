/**
 */
package org.civitas.meter.source.model.metersource.impl;

import org.civitas.meter.source.model.metersource.BasicData;
import org.civitas.meter.source.model.metersource.Customer;
import org.civitas.meter.source.model.metersource.Meter;
import org.civitas.meter.source.model.metersource.MeterSourceFactory;
import org.civitas.meter.source.model.metersource.MeterSourcePackage;
import org.civitas.meter.source.model.metersource.OperatingData;
import org.civitas.meter.source.model.metersource.Reading;

import org.civitas.units.model.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeterSourcePackageImpl extends EPackageImpl implements MeterSourcePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

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
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MeterSourcePackageImpl() {
		super(eNS_URI, MeterSourceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MeterSourcePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MeterSourcePackage init() {
		if (isInited) return (MeterSourcePackage)EPackage.Registry.INSTANCE.getEPackage(MeterSourcePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMeterSourcePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MeterSourcePackageImpl theMeterSourcePackage = registeredMeterSourcePackage instanceof MeterSourcePackageImpl ? (MeterSourcePackageImpl)registeredMeterSourcePackage : new MeterSourcePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMeterSourcePackage.createPackageContents();

		// Initialize created meta-data
		theMeterSourcePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMeterSourcePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MeterSourcePackage.eNS_URI, theMeterSourcePackage);
		return theMeterSourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicData() {
		return basicDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicData_PlantId() {
		return (EAttribute)basicDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicData_Address() {
		return (EAttribute)basicDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicData_Net() {
		return (EAttribute)basicDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicData_Type() {
		return (EAttribute)basicDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperatingData() {
		return operatingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperatingData_Id() {
		return (EAttribute)operatingDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperatingData_PlantId() {
		return (EAttribute)operatingDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperatingData_OperatingHours() {
		return (EAttribute)operatingDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperatingData_Starts() {
		return (EAttribute)operatingDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeter() {
		return meterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeter_PlantId() {
		return (EAttribute)meterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeter_Id() {
		return (EAttribute)meterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReading() {
		return readingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReading_Id() {
		return (EAttribute)readingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReading_MeterId() {
		return (EAttribute)readingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReading_Value() {
		return (EAttribute)readingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReading_Timestamp() {
		return (EAttribute)readingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeterSourceFactory getMeterSourceFactory() {
		return (MeterSourceFactory)getEFactoryInstance();
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
		basicDataEClass = createEClass(BASIC_DATA);
		createEAttribute(basicDataEClass, BASIC_DATA__PLANT_ID);
		createEAttribute(basicDataEClass, BASIC_DATA__ADDRESS);
		createEAttribute(basicDataEClass, BASIC_DATA__NET);
		createEAttribute(basicDataEClass, BASIC_DATA__TYPE);

		operatingDataEClass = createEClass(OPERATING_DATA);
		createEAttribute(operatingDataEClass, OPERATING_DATA__ID);
		createEAttribute(operatingDataEClass, OPERATING_DATA__PLANT_ID);
		createEAttribute(operatingDataEClass, OPERATING_DATA__OPERATING_HOURS);
		createEAttribute(operatingDataEClass, OPERATING_DATA__STARTS);

		meterEClass = createEClass(METER);
		createEAttribute(meterEClass, METER__PLANT_ID);
		createEAttribute(meterEClass, METER__ID);

		readingEClass = createEClass(READING);
		createEAttribute(readingEClass, READING__ID);
		createEAttribute(readingEClass, READING__METER_ID);
		createEAttribute(readingEClass, READING__VALUE);
		createEAttribute(readingEClass, READING__TIMESTAMP);

		customerEClass = createEClass(CUSTOMER);
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
		UnitsPackage theUnitsPackage = (UnitsPackage)EPackage.Registry.INSTANCE.getEPackage(UnitsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(basicDataEClass, BasicData.class, "BasicData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicData_PlantId(), ecorePackage.getEString(), "plantId", null, 1, 1, BasicData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicData_Address(), ecorePackage.getEString(), "address", null, 0, 1, BasicData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicData_Net(), ecorePackage.getEIntegerObject(), "net", null, 0, 1, BasicData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicData_Type(), ecorePackage.getEString(), "type", null, 0, 1, BasicData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatingDataEClass, OperatingData.class, "OperatingData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperatingData_Id(), ecorePackage.getEInt(), "id", null, 1, 1, OperatingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatingData_PlantId(), ecorePackage.getEString(), "plantId", null, 0, 1, OperatingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatingData_OperatingHours(), theUnitsPackage.getHours(), "operatingHours", null, 0, 1, OperatingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatingData_Starts(), theUnitsPackage.getEInstant(), "starts", null, 0, 1, OperatingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meterEClass, Meter.class, "Meter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeter_PlantId(), ecorePackage.getEString(), "plantId", null, 0, 1, Meter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeter_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Meter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readingEClass, Reading.class, "Reading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReading_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Reading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReading_MeterId(), ecorePackage.getEString(), "meterId", null, 0, 1, Reading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReading_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Reading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReading_Timestamp(), theUnitsPackage.getEInstant(), "timestamp", null, 0, 1, Reading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
			   "basePackage", "org.civitas.meter.source.model",
			   "resource", "XMI"
		   });
		addAnnotation
		  (basicDataEClass,
		   source,
		   new String[] {
			   "documentation", "The basic data for a production plant is available in an Excel file.  The id of every entry is prefixed with a p."
		   });
		addAnnotation
		  (operatingDataEClass,
		   source,
		   new String[] {
			   "documentation", "The operating data for a plant is exported daily from the source system as a CSV file and uploaded to an FTP server. The plant IDs in these CSV files are not prefixed with a p."
		   });
		addAnnotation
		  (getOperatingData_PlantId(),
		   source,
		   new String[] {
			   "documentation", "This is a reference to the plantId of the BasicData but without the prefix \"p\"."
		   });
		addAnnotation
		  (getMeter_PlantId(),
		   source,
		   new String[] {
			   "documentation", "This is a reference to the plantId of the BasicData but without the prefix \"p\"."
		   });
		addAnnotation
		  (getReading_MeterId(),
		   source,
		   new String[] {
			   "documentation", "This is a reference to the meterId"
		   });
		addAnnotation
		  (customerEClass,
		   source,
		   new String[] {
			   "documentation", "This is another way of storing the plants, used for remote meters."
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (getBasicData_PlantId(),
		   source,
		   new String[] {
			   "name", "plant_id"
		   });
		addAnnotation
		  (getOperatingData_PlantId(),
		   source,
		   new String[] {
			   "name", "plant_id"
		   });
		addAnnotation
		  (getMeter_PlantId(),
		   source,
		   new String[] {
			   "name", "plant_id"
		   });
		addAnnotation
		  (getReading_MeterId(),
		   source,
		   new String[] {
			   "name", "meter_id"
		   });
	}

} //MeterSourcePackageImpl
