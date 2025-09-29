/*
 */
package validationhandlerconfig;

import org.civitas.osgi.component.Configuration;

import org.civitas.pipeline.Handler;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Handler Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration for Validation Handler
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link validationhandlerconfig.ValidationHandlerConfig#getIncomingEClassUri <em>Incoming EClass Uri</em>}</li>
 *   <li>{@link validationhandlerconfig.ValidationHandlerConfig#getReferenceUriToBeValidated <em>Reference Uri To Be Validated</em>}</li>
 *   <li>{@link validationhandlerconfig.ValidationHandlerConfig#getAttributeUriToBeValidated <em>Attribute Uri To Be Validated</em>}</li>
 *   <li>{@link validationhandlerconfig.ValidationHandlerConfig#getValidationType <em>Validation Type</em>}</li>
 *   <li>{@link validationhandlerconfig.ValidationHandlerConfig#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link validationhandlerconfig.ValidationHandlerConfig#getMinThreshold <em>Min Threshold</em>}</li>
 *   <li>{@link validationhandlerconfig.ValidationHandlerConfig#getMaxThreshold <em>Max Threshold</em>}</li>
 * </ul>
 *
 * @see validationhandlerconfig.ValidationhandlerPackage#getValidationHandlerConfig()
 * @model
 * @generated
 */
@ProviderType
public interface ValidationHandlerConfig extends Configuration, Handler {
	/**
	 * Returns the value of the '<em><b>Incoming EClass Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URI of the incoming EObject EClass (e.g., http://...#//Meter)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming EClass Uri</em>' reference.
	 * @see #setIncomingEClassUri(EClass)
	 * @see validationhandlerconfig.ValidationhandlerPackage#getValidationHandlerConfig_IncomingEClassUri()
	 * @model extendedMetaData="name='incoming.eclassuri'"
	 * @generated
	 */
	EClass getIncomingEClassUri();

	/**
	 * Sets the value of the '{@link validationhandlerconfig.ValidationHandlerConfig#getIncomingEClassUri <em>Incoming EClass Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming EClass Uri</em>' reference.
	 * @see #getIncomingEClassUri()
	 * @generated
	 */
	void setIncomingEClassUri(EClass value);

	/**
	 * Returns the value of the '<em><b>Reference Uri To Be Validated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URI of the EStructuralFeature to be validated
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Uri To Be Validated</em>' reference.
	 * @see #setReferenceUriToBeValidated(EReference)
	 * @see validationhandlerconfig.ValidationhandlerPackage#getValidationHandlerConfig_ReferenceUriToBeValidated()
	 * @model extendedMetaData="name='reference.uri.to.be.validated'"
	 * @generated
	 */
	EReference getReferenceUriToBeValidated();

	/**
	 * Sets the value of the '{@link validationhandlerconfig.ValidationHandlerConfig#getReferenceUriToBeValidated <em>Reference Uri To Be Validated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Uri To Be Validated</em>' reference.
	 * @see #getReferenceUriToBeValidated()
	 * @generated
	 */
	void setReferenceUriToBeValidated(EReference value);

	/**
	 * Returns the value of the '<em><b>Attribute Uri To Be Validated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URI of the EStructuralFeature to be validated
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Uri To Be Validated</em>' reference.
	 * @see #setAttributeUriToBeValidated(EAttribute)
	 * @see validationhandlerconfig.ValidationhandlerPackage#getValidationHandlerConfig_AttributeUriToBeValidated()
	 * @model extendedMetaData="name='attribute.uri.to.be.validated'"
	 * @generated
	 */
	EAttribute getAttributeUriToBeValidated();

	/**
	 * Sets the value of the '{@link validationhandlerconfig.ValidationHandlerConfig#getAttributeUriToBeValidated <em>Attribute Uri To Be Validated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Uri To Be Validated</em>' reference.
	 * @see #getAttributeUriToBeValidated()
	 * @generated
	 */
	void setAttributeUriToBeValidated(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Validation Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The validation type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validation Type</em>' attribute.
	 * @see #setValidationType(String)
	 * @see validationhandlerconfig.ValidationhandlerPackage#getValidationHandlerConfig_ValidationType()
	 * @model default=""
	 *        extendedMetaData="name='validation.type'"
	 * @generated
	 */
	String getValidationType();

	/**
	 * Sets the value of the '{@link validationhandlerconfig.ValidationHandlerConfig#getValidationType <em>Validation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Type</em>' attribute.
	 * @see #getValidationType()
	 * @generated
	 */
	void setValidationType(String value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * The default value is <code>"-9999.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The threshold value for the validation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(double)
	 * @see validationhandlerconfig.ValidationhandlerPackage#getValidationHandlerConfig_Threshold()
	 * @model default="-9999.0"
	 * @generated
	 */
	double getThreshold();

	/**
	 * Sets the value of the '{@link validationhandlerconfig.ValidationHandlerConfig#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Min Threshold</b></em>' attribute.
	 * The default value is <code>"-9999.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum threshold value for the validation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Threshold</em>' attribute.
	 * @see #setMinThreshold(double)
	 * @see validationhandlerconfig.ValidationhandlerPackage#getValidationHandlerConfig_MinThreshold()
	 * @model default="-9999.0"
	 * @generated
	 */
	double getMinThreshold();

	/**
	 * Sets the value of the '{@link validationhandlerconfig.ValidationHandlerConfig#getMinThreshold <em>Min Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Threshold</em>' attribute.
	 * @see #getMinThreshold()
	 * @generated
	 */
	void setMinThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Max Threshold</b></em>' attribute.
	 * The default value is <code>"-9999.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum threshold value for the validation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Threshold</em>' attribute.
	 * @see #setMaxThreshold(double)
	 * @see validationhandlerconfig.ValidationhandlerPackage#getValidationHandlerConfig_MaxThreshold()
	 * @model default="-9999.0"
	 * @generated
	 */
	double getMaxThreshold();

	/**
	 * Sets the value of the '{@link validationhandlerconfig.ValidationHandlerConfig#getMaxThreshold <em>Max Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Threshold</em>' attribute.
	 * @see #getMaxThreshold()
	 * @generated
	 */
	void setMaxThreshold(double value);

} // ValidationHandlerConfig
