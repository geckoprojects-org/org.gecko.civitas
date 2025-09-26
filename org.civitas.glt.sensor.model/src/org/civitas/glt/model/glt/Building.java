/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.civitas.glt.model.glt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.glt.model.glt.Building#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.glt.model.glt.Building#getCity <em>City</em>}</li>
 *   <li>{@link org.civitas.glt.model.glt.Building#getZip <em>Zip</em>}</li>
 *   <li>{@link org.civitas.glt.model.glt.Building#getStreet <em>Street</em>}</li>
 *   <li>{@link org.civitas.glt.model.glt.Building#getContacts <em>Contacts</em>}</li>
 * </ul>
 *
 * @see org.civitas.glt.model.glt.GltPackage#getBuilding()
 * @model extendedMetaData="name='Buildings'"
 * @generated
 */
@ProviderType
public interface Building extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see org.civitas.glt.model.glt.GltPackage#getBuilding_Id()
	 * @model id="true" required="true"
	 *        extendedMetaData="name='id'"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link org.civitas.glt.model.glt.Building#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see org.civitas.glt.model.glt.GltPackage#getBuilding_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link org.civitas.glt.model.glt.Building#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip</em>' attribute.
	 * @see #setZip(int)
	 * @see org.civitas.glt.model.glt.GltPackage#getBuilding_Zip()
	 * @model
	 * @generated
	 */
	int getZip();

	/**
	 * Sets the value of the '{@link org.civitas.glt.model.glt.Building#getZip <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip</em>' attribute.
	 * @see #getZip()
	 * @generated
	 */
	void setZip(int value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Street + house number, separated with a space
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see org.civitas.glt.model.glt.GltPackage#getBuilding_Street()
	 * @model
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link org.civitas.glt.model.glt.Building#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.civitas.glt.model.glt.Contact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacts</em>' containment reference list.
	 * @see org.civitas.glt.model.glt.GltPackage#getBuilding_Contacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contact> getContacts();

} // Building
