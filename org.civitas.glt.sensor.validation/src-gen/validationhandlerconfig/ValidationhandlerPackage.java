/*
 */
package validationhandlerconfig;


import org.civitas.osgi.component.ComponentConfigPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see validationhandlerconfig.ValidationhandlerFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = ValidationhandlerPackage.eNS_URI, genModel = "/model/validation-handler.genmodel", genModelSourceLocations = {"model/validation-handler.genmodel","org.civitas.glt.sensor.validation/model/validation-handler.genmodel"}, ecore="/model/validation-handler.ecore", ecoreSourceLocations="/model/validation-handler.ecore")
public interface ValidationhandlerPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "validationhandlerconfig";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://civitas.org/handler/validation/config/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "validationhandlerconfig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValidationhandlerPackage eINSTANCE = validationhandlerconfig.impl.ValidationhandlerPackageImpl.init();

	/**
	 * The meta object id for the '{@link validationhandlerconfig.impl.ValidationHandlerConfigImpl <em>Validation Handler Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see validationhandlerconfig.impl.ValidationHandlerConfigImpl
	 * @see validationhandlerconfig.impl.ValidationhandlerPackageImpl#getValidationHandlerConfig()
	 * @generated
	 */
	int VALIDATION_HANDLER_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_HANDLER_CONFIG__PID = ComponentConfigPackage.CONFIGURATION__PID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_HANDLER_CONFIG__ID = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_HANDLER_CONFIG__OUTPUTS = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_HANDLER_CONFIG__INPUTS = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming EClass Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_HANDLER_CONFIG__INCOMING_ECLASS_URI = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference Uri To Be Validated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_HANDLER_CONFIG__REFERENCE_URI_TO_BE_VALIDATED = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attribute Uri To Be Validated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_HANDLER_CONFIG__ATTRIBUTE_URI_TO_BE_VALIDATED = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Validation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_HANDLER_CONFIG__VALIDATION_TYPE = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_HANDLER_CONFIG__THRESHOLD = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_HANDLER_CONFIG__MIN_THRESHOLD = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_HANDLER_CONFIG__MAX_THRESHOLD = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Validation Handler Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_HANDLER_CONFIG_FEATURE_COUNT = ComponentConfigPackage.CONFIGURATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Validation Handler Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_HANDLER_CONFIG_OPERATION_COUNT = ComponentConfigPackage.CONFIGURATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link validationhandlerconfig.ValidationHandlerConfig <em>Validation Handler Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Handler Config</em>'.
	 * @see validationhandlerconfig.ValidationHandlerConfig
	 * @generated
	 */
	EClass getValidationHandlerConfig();

	/**
	 * Returns the meta object for the reference '{@link validationhandlerconfig.ValidationHandlerConfig#getIncomingEClassUri <em>Incoming EClass Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming EClass Uri</em>'.
	 * @see validationhandlerconfig.ValidationHandlerConfig#getIncomingEClassUri()
	 * @see #getValidationHandlerConfig()
	 * @generated
	 */
	EReference getValidationHandlerConfig_IncomingEClassUri();

	/**
	 * Returns the meta object for the reference '{@link validationhandlerconfig.ValidationHandlerConfig#getReferenceUriToBeValidated <em>Reference Uri To Be Validated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Uri To Be Validated</em>'.
	 * @see validationhandlerconfig.ValidationHandlerConfig#getReferenceUriToBeValidated()
	 * @see #getValidationHandlerConfig()
	 * @generated
	 */
	EReference getValidationHandlerConfig_ReferenceUriToBeValidated();

	/**
	 * Returns the meta object for the reference '{@link validationhandlerconfig.ValidationHandlerConfig#getAttributeUriToBeValidated <em>Attribute Uri To Be Validated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Uri To Be Validated</em>'.
	 * @see validationhandlerconfig.ValidationHandlerConfig#getAttributeUriToBeValidated()
	 * @see #getValidationHandlerConfig()
	 * @generated
	 */
	EReference getValidationHandlerConfig_AttributeUriToBeValidated();

	/**
	 * Returns the meta object for the attribute '{@link validationhandlerconfig.ValidationHandlerConfig#getValidationType <em>Validation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Type</em>'.
	 * @see validationhandlerconfig.ValidationHandlerConfig#getValidationType()
	 * @see #getValidationHandlerConfig()
	 * @generated
	 */
	EAttribute getValidationHandlerConfig_ValidationType();

	/**
	 * Returns the meta object for the attribute '{@link validationhandlerconfig.ValidationHandlerConfig#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see validationhandlerconfig.ValidationHandlerConfig#getThreshold()
	 * @see #getValidationHandlerConfig()
	 * @generated
	 */
	EAttribute getValidationHandlerConfig_Threshold();

	/**
	 * Returns the meta object for the attribute '{@link validationhandlerconfig.ValidationHandlerConfig#getMinThreshold <em>Min Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Threshold</em>'.
	 * @see validationhandlerconfig.ValidationHandlerConfig#getMinThreshold()
	 * @see #getValidationHandlerConfig()
	 * @generated
	 */
	EAttribute getValidationHandlerConfig_MinThreshold();

	/**
	 * Returns the meta object for the attribute '{@link validationhandlerconfig.ValidationHandlerConfig#getMaxThreshold <em>Max Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Threshold</em>'.
	 * @see validationhandlerconfig.ValidationHandlerConfig#getMaxThreshold()
	 * @see #getValidationHandlerConfig()
	 * @generated
	 */
	EAttribute getValidationHandlerConfig_MaxThreshold();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValidationhandlerFactory getValidationhandlerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link validationhandlerconfig.impl.ValidationHandlerConfigImpl <em>Validation Handler Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see validationhandlerconfig.impl.ValidationHandlerConfigImpl
		 * @see validationhandlerconfig.impl.ValidationhandlerPackageImpl#getValidationHandlerConfig()
		 * @generated
		 */
		EClass VALIDATION_HANDLER_CONFIG = eINSTANCE.getValidationHandlerConfig();

		/**
		 * The meta object literal for the '<em><b>Incoming EClass Uri</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_HANDLER_CONFIG__INCOMING_ECLASS_URI = eINSTANCE.getValidationHandlerConfig_IncomingEClassUri();

		/**
		 * The meta object literal for the '<em><b>Reference Uri To Be Validated</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_HANDLER_CONFIG__REFERENCE_URI_TO_BE_VALIDATED = eINSTANCE.getValidationHandlerConfig_ReferenceUriToBeValidated();

		/**
		 * The meta object literal for the '<em><b>Attribute Uri To Be Validated</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_HANDLER_CONFIG__ATTRIBUTE_URI_TO_BE_VALIDATED = eINSTANCE.getValidationHandlerConfig_AttributeUriToBeValidated();

		/**
		 * The meta object literal for the '<em><b>Validation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_HANDLER_CONFIG__VALIDATION_TYPE = eINSTANCE.getValidationHandlerConfig_ValidationType();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_HANDLER_CONFIG__THRESHOLD = eINSTANCE.getValidationHandlerConfig_Threshold();

		/**
		 * The meta object literal for the '<em><b>Min Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_HANDLER_CONFIG__MIN_THRESHOLD = eINSTANCE.getValidationHandlerConfig_MinThreshold();

		/**
		 * The meta object literal for the '<em><b>Max Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_HANDLER_CONFIG__MAX_THRESHOLD = eINSTANCE.getValidationHandlerConfig_MaxThreshold();

	}

} //ValidationhandlerPackage
