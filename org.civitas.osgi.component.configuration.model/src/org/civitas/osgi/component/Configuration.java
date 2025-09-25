/*
 */
package org.civitas.osgi.component;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.osgi.component.Configuration#getPid <em>Pid</em>}</li>
 * </ul>
 *
 * @see org.civitas.osgi.component.ComponentConfigPackage#getConfiguration()
 * @model
 * @generated
 */
@ProviderType
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pid</em>' attribute.
	 * @see #setPid(String)
	 * @see org.civitas.osgi.component.ComponentConfigPackage#getConfiguration_Pid()
	 * @model
	 * @generated
	 */
	String getPid();

	/**
	 * Sets the value of the '{@link org.civitas.osgi.component.Configuration#getPid <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pid</em>' attribute.
	 * @see #getPid()
	 * @generated
	 */
	void setPid(String value);

} // Configuration
