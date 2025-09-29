/*
 */
package validationhandlerconfig;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see validationhandlerconfig.ValidationhandlerPackage
 * @generated
 */
@ProviderType
public interface ValidationhandlerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValidationhandlerFactory eINSTANCE = validationhandlerconfig.impl.ValidationhandlerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Validation Handler Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation Handler Config</em>'.
	 * @generated
	 */
	ValidationHandlerConfig createValidationHandlerConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ValidationhandlerPackage getValidationhandlerPackage();

} //ValidationhandlerFactory
