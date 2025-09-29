/**
 */
package validationhandlerconfig.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import validationhandlerconfig.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidationhandlerFactoryImpl extends EFactoryImpl implements ValidationhandlerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ValidationhandlerFactory init() {
		try {
			ValidationhandlerFactory theValidationhandlerFactory = (ValidationhandlerFactory)EPackage.Registry.INSTANCE.getEFactory(ValidationhandlerPackage.eNS_URI);
			if (theValidationhandlerFactory != null) {
				return theValidationhandlerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValidationhandlerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationhandlerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG: return createValidationHandlerConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationHandlerConfig createValidationHandlerConfig() {
		ValidationHandlerConfigImpl validationHandlerConfig = new ValidationHandlerConfigImpl();
		return validationHandlerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationhandlerPackage getValidationhandlerPackage() {
		return (ValidationhandlerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValidationhandlerPackage getPackage() {
		return ValidationhandlerPackage.eINSTANCE;
	}

} //ValidationhandlerFactoryImpl
