/**
 */
package validationhandlerconfig.impl;

import org.civitas.osgi.component.ComponentConfigPackage;

import org.civitas.pipeline.PipelinePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import validationhandlerconfig.ValidationHandlerConfig;
import validationhandlerconfig.ValidationhandlerFactory;
import validationhandlerconfig.ValidationhandlerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidationhandlerPackageImpl extends EPackageImpl implements ValidationhandlerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationHandlerConfigEClass = null;

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
	 * @see validationhandlerconfig.ValidationhandlerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValidationhandlerPackageImpl() {
		super(eNS_URI, ValidationhandlerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ValidationhandlerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValidationhandlerPackage init() {
		if (isInited) return (ValidationhandlerPackage)EPackage.Registry.INSTANCE.getEPackage(ValidationhandlerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredValidationhandlerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ValidationhandlerPackageImpl theValidationhandlerPackage = registeredValidationhandlerPackage instanceof ValidationhandlerPackageImpl ? (ValidationhandlerPackageImpl)registeredValidationhandlerPackage : new ValidationhandlerPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ComponentConfigPackage.eINSTANCE.eClass();
		PipelinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theValidationhandlerPackage.createPackageContents();

		// Initialize created meta-data
		theValidationhandlerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValidationhandlerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValidationhandlerPackage.eNS_URI, theValidationhandlerPackage);
		return theValidationhandlerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidationHandlerConfig() {
		return validationHandlerConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidationHandlerConfig_IncomingEClassUri() {
		return (EReference)validationHandlerConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidationHandlerConfig_ReferenceUriToBeValidated() {
		return (EReference)validationHandlerConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidationHandlerConfig_AttributeUriToBeValidated() {
		return (EReference)validationHandlerConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationHandlerConfig_ValidationType() {
		return (EAttribute)validationHandlerConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationHandlerConfig_Threshold() {
		return (EAttribute)validationHandlerConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationHandlerConfig_MinThreshold() {
		return (EAttribute)validationHandlerConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationHandlerConfig_MaxThreshold() {
		return (EAttribute)validationHandlerConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationhandlerFactory getValidationhandlerFactory() {
		return (ValidationhandlerFactory)getEFactoryInstance();
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
		validationHandlerConfigEClass = createEClass(VALIDATION_HANDLER_CONFIG);
		createEReference(validationHandlerConfigEClass, VALIDATION_HANDLER_CONFIG__INCOMING_ECLASS_URI);
		createEReference(validationHandlerConfigEClass, VALIDATION_HANDLER_CONFIG__REFERENCE_URI_TO_BE_VALIDATED);
		createEReference(validationHandlerConfigEClass, VALIDATION_HANDLER_CONFIG__ATTRIBUTE_URI_TO_BE_VALIDATED);
		createEAttribute(validationHandlerConfigEClass, VALIDATION_HANDLER_CONFIG__VALIDATION_TYPE);
		createEAttribute(validationHandlerConfigEClass, VALIDATION_HANDLER_CONFIG__THRESHOLD);
		createEAttribute(validationHandlerConfigEClass, VALIDATION_HANDLER_CONFIG__MIN_THRESHOLD);
		createEAttribute(validationHandlerConfigEClass, VALIDATION_HANDLER_CONFIG__MAX_THRESHOLD);
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
		ComponentConfigPackage theComponentConfigPackage = (ComponentConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentConfigPackage.eNS_URI);
		PipelinePackage thePipelinePackage = (PipelinePackage)EPackage.Registry.INSTANCE.getEPackage(PipelinePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		validationHandlerConfigEClass.getESuperTypes().add(theComponentConfigPackage.getConfiguration());
		validationHandlerConfigEClass.getESuperTypes().add(thePipelinePackage.getHandler());

		// Initialize classes, features, and operations; add parameters
		initEClass(validationHandlerConfigEClass, ValidationHandlerConfig.class, "ValidationHandlerConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidationHandlerConfig_IncomingEClassUri(), ecorePackage.getEClass(), null, "incomingEClassUri", null, 0, 1, ValidationHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidationHandlerConfig_ReferenceUriToBeValidated(), ecorePackage.getEReference(), null, "referenceUriToBeValidated", null, 0, 1, ValidationHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidationHandlerConfig_AttributeUriToBeValidated(), ecorePackage.getEAttribute(), null, "attributeUriToBeValidated", null, 0, 1, ValidationHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationHandlerConfig_ValidationType(), ecorePackage.getEString(), "validationType", "", 0, 1, ValidationHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationHandlerConfig_Threshold(), ecorePackage.getEDouble(), "threshold", "-9999.0", 0, 1, ValidationHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationHandlerConfig_MinThreshold(), ecorePackage.getEDouble(), "minThreshold", "-9999.0", 0, 1, ValidationHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationHandlerConfig_MaxThreshold(), ecorePackage.getEDouble(), "maxThreshold", "-9999.0", 0, 1, ValidationHandlerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (getValidationHandlerConfig_IncomingEClassUri(),
		   source,
		   new String[] {
			   "name", "incoming.eclassuri"
		   });
		addAnnotation
		  (getValidationHandlerConfig_ReferenceUriToBeValidated(),
		   source,
		   new String[] {
			   "name", "reference.uri.to.be.validated"
		   });
		addAnnotation
		  (getValidationHandlerConfig_AttributeUriToBeValidated(),
		   source,
		   new String[] {
			   "name", "attribute.uri.to.be.validated"
		   });
		addAnnotation
		  (getValidationHandlerConfig_ValidationType(),
		   source,
		   new String[] {
			   "name", "validation.type"
		   });
	}

} //ValidationhandlerPackageImpl
