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
package cbase;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cbase.AssetOperator#getAssets <em>Assets</em>}</li>
 *   <li>{@link cbase.AssetOperator#getOperatorId <em>Operator Id</em>}</li>
 * </ul>
 *
 * @see cbase.CbasePackage#getAssetOperator()
 * @model
 * @generated
 */
@ProviderType
public interface AssetOperator extends Person {
	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link cbase.Asset}.
	 * It is bidirectional and its opposite is '{@link cbase.Asset#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see cbase.CbasePackage#getAssetOperator_Assets()
	 * @see cbase.Asset#getOperator
	 * @model opposite="operator" keys="assetId"
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Operator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Id</em>' attribute.
	 * @see #setOperatorId(String)
	 * @see cbase.CbasePackage#getAssetOperator_OperatorId()
	 * @model
	 * @generated
	 */
	String getOperatorId();

	/**
	 * Sets the value of the '{@link cbase.AssetOperator#getOperatorId <em>Operator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Id</em>' attribute.
	 * @see #getOperatorId()
	 * @generated
	 */
	void setOperatorId(String value);

} // AssetOperator
