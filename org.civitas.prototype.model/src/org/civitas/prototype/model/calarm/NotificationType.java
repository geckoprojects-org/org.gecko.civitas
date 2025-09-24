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
package org.civitas.prototype.model.calarm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Notification Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.civitas.prototype.model.calarm.CIVAlarmPackage#getNotificationType()
 * @model
 * @generated
 */
@ProviderType
public enum NotificationType implements Enumerator {
	/**
	 * The '<em><b>EMAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL(0, "EMAIL", "EMAIL"),

	/**
	 * The '<em><b>PHONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONE_VALUE
	 * @generated
	 * @ordered
	 */
	PHONE(1, "PHONE", "PHONE"),

	/**
	 * The '<em><b>SMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMS_VALUE
	 * @generated
	 * @ordered
	 */
	SMS(2, "SMS", "SMS"),

	/**
	 * The '<em><b>PUSH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH_VALUE
	 * @generated
	 * @ordered
	 */
	PUSH(3, "PUSH", "PUSH"),

	/**
	 * The '<em><b>POLICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLICE_VALUE
	 * @generated
	 * @ordered
	 */
	POLICE(10, "POLICE", "POLICE"),

	/**
	 * The '<em><b>FIREDEPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIREDEPT_VALUE
	 * @generated
	 * @ordered
	 */
	FIREDEPT(11, "FIREDEPT", "FIREDEPT"),

	/**
	 * The '<em><b>MEDEMERGENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDEMERGENCY_VALUE
	 * @generated
	 * @ordered
	 */
	MEDEMERGENCY(12, "MEDEMERGENCY", "MEDEMERGENCY");

	/**
	 * The '<em><b>EMAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_VALUE = 0;

	/**
	 * The '<em><b>PHONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHONE_VALUE = 1;

	/**
	 * The '<em><b>SMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMS_VALUE = 2;

	/**
	 * The '<em><b>PUSH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUSH_VALUE = 3;

	/**
	 * The '<em><b>POLICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POLICE_VALUE = 10;

	/**
	 * The '<em><b>FIREDEPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIREDEPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIREDEPT_VALUE = 11;

	/**
	 * The '<em><b>MEDEMERGENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDEMERGENCY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEDEMERGENCY_VALUE = 12;

	/**
	 * An array of all the '<em><b>Notification Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NotificationType[] VALUES_ARRAY =
		new NotificationType[] {
			EMAIL,
			PHONE,
			SMS,
			PUSH,
			POLICE,
			FIREDEPT,
			MEDEMERGENCY,
		};

	/**
	 * A public read-only list of all the '<em><b>Notification Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NotificationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Notification Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NotificationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NotificationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notification Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NotificationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NotificationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notification Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NotificationType get(int value) {
		switch (value) {
			case EMAIL_VALUE: return EMAIL;
			case PHONE_VALUE: return PHONE;
			case SMS_VALUE: return SMS;
			case PUSH_VALUE: return PUSH;
			case POLICE_VALUE: return POLICE;
			case FIREDEPT_VALUE: return FIREDEPT;
			case MEDEMERGENCY_VALUE: return MEDEMERGENCY;
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
	private NotificationType(int value, String name, String literal) {
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
	
} //NotificationType
