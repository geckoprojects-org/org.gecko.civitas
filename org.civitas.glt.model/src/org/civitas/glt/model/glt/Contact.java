/*
 */
package org.civitas.glt.model.glt;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.glt.model.glt.Contact#getBuildingId <em>Building Id</em>}</li>
 *   <li>{@link org.civitas.glt.model.glt.Contact#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.civitas.glt.model.glt.Contact#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.civitas.glt.model.glt.Contact#getRole <em>Role</em>}</li>
 *   <li>{@link org.civitas.glt.model.glt.Contact#getEmail <em>Email</em>}</li>
 *   <li>{@link org.civitas.glt.model.glt.Contact#getPhoneNumber <em>Phone Number</em>}</li>
 * </ul>
 *
 * @see org.civitas.glt.model.glt.GLTPackage#getContact()
 * @model
 * @generated
 */
@ProviderType
public interface Contact extends EObject {
	/**
	 * Returns the value of the '<em><b>Building Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Id</em>' attribute.
	 * @see #setBuildingId(Integer)
	 * @see org.civitas.glt.model.glt.GLTPackage#getContact_BuildingId()
	 * @model required="true"
	 * @generated
	 */
	Integer getBuildingId();

	/**
	 * Sets the value of the '{@link org.civitas.glt.model.glt.Contact#getBuildingId <em>Building Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Id</em>' attribute.
	 * @see #getBuildingId()
	 * @generated
	 */
	void setBuildingId(Integer value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.civitas.glt.model.glt.GLTPackage#getContact_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.civitas.glt.model.glt.Contact#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see org.civitas.glt.model.glt.GLTPackage#getContact_LastName()
	 * @model
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.civitas.glt.model.glt.Contact#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.civitas.glt.model.glt.GLTPackage#getContact_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.civitas.glt.model.glt.Contact#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.civitas.glt.model.glt.GLTPackage#getContact_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.civitas.glt.model.glt.Contact#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(String)
	 * @see org.civitas.glt.model.glt.GLTPackage#getContact_PhoneNumber()
	 * @model
	 * @generated
	 */
	String getPhoneNumber();

	/**
	 * Sets the value of the '{@link org.civitas.glt.model.glt.Contact#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(String value);

} // Contact
