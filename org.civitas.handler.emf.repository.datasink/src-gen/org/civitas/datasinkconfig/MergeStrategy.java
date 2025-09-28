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
package org.civitas.datasinkconfig;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Merge Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Strategy for handling existing objects when persisting EObjects
 * <!-- end-model-doc -->
 * @see org.civitas.datasinkconfig.DatasinkconfigPackage#getMergeStrategy()
 * @model
 * @generated
 */
@ProviderType
public enum MergeStrategy implements Enumerator {
	/**
	 * The '<em><b>OVERWRITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Completely overwrite existing objects with incoming data
	 * <!-- end-model-doc -->
	 * @see #OVERWRITE_VALUE
	 * @generated
	 * @ordered
	 */
	OVERWRITE(0, "OVERWRITE", "OVERWRITE"),

	/**
	 * The '<em><b>MERGE INTO IGNORE UNSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Merge incoming data into existing objects, preserving unset attributes
	 * <!-- end-model-doc -->
	 * @see #MERGE_INTO_IGNORE_UNSET_VALUE
	 * @generated
	 * @ordered
	 */
	MERGE_INTO_IGNORE_UNSET(1, "MERGE_INTO_IGNORE_UNSET", "MERGE_INTO_IGNORE_UNSET");

	/**
	 * The '<em><b>OVERWRITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Completely overwrite existing objects with incoming data
	 * <!-- end-model-doc -->
	 * @see #OVERWRITE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OVERWRITE_VALUE = 0;

	/**
	 * The '<em><b>MERGE INTO IGNORE UNSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Merge incoming data into existing objects, preserving unset attributes
	 * <!-- end-model-doc -->
	 * @see #MERGE_INTO_IGNORE_UNSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MERGE_INTO_IGNORE_UNSET_VALUE = 1;

	/**
	 * An array of all the '<em><b>Merge Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MergeStrategy[] VALUES_ARRAY =
		new MergeStrategy[] {
			OVERWRITE,
			MERGE_INTO_IGNORE_UNSET,
		};

	/**
	 * A public read-only list of all the '<em><b>Merge Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MergeStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Merge Strategy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MergeStrategy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MergeStrategy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Merge Strategy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MergeStrategy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MergeStrategy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Merge Strategy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MergeStrategy get(int value) {
		switch (value) {
			case OVERWRITE_VALUE: return OVERWRITE;
			case MERGE_INTO_IGNORE_UNSET_VALUE: return MERGE_INTO_IGNORE_UNSET;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MergeStrategy(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MergeStrategy
