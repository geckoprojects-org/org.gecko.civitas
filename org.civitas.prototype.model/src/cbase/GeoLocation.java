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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cbase.GeoLocation#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link cbase.GeoLocation#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link cbase.GeoLocation#getElevation <em>Elevation</em>}</li>
 * </ul>
 *
 * @see cbase.CbasePackage#getGeoLocation()
 * @model
 * @generated
 */
@ProviderType
public interface GeoLocation extends Location {
	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(Double)
	 * @see cbase.CbasePackage#getGeoLocation_Latitude()
	 * @model required="true"
	 * @generated
	 */
	Double getLatitude();

	/**
	 * Sets the value of the '{@link cbase.GeoLocation#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(Double value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(Double)
	 * @see cbase.CbasePackage#getGeoLocation_Longitude()
	 * @model required="true"
	 * @generated
	 */
	Double getLongitude();

	/**
	 * Sets the value of the '{@link cbase.GeoLocation#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(Double value);

	/**
	 * Returns the value of the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation</em>' attribute.
	 * @see #setElevation(Double)
	 * @see cbase.CbasePackage#getGeoLocation_Elevation()
	 * @model required="true"
	 * @generated
	 */
	Double getElevation();

	/**
	 * Sets the value of the '{@link cbase.GeoLocation#getElevation <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation</em>' attribute.
	 * @see #getElevation()
	 * @generated
	 */
	void setElevation(Double value);

} // GeoLocation
