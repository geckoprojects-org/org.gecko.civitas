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
package org.civitas.mqttreceiver.impl;

import org.civitas.mqttreceiver.MqttReceiverConfig;
import org.civitas.mqttreceiver.MqttreceiverPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mqtt Receiver Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.mqttreceiver.impl.MqttReceiverConfigImpl#getMqttTopic <em>Mqtt Topic</em>}</li>
 *   <li>{@link org.civitas.mqttreceiver.impl.MqttReceiverConfigImpl#isPrintPayload <em>Print Payload</em>}</li>
 *   <li>{@link org.civitas.mqttreceiver.impl.MqttReceiverConfigImpl#getPayloadEclassuri <em>Payload Eclassuri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MqttReceiverConfigImpl extends MinimalEObjectImpl.Container implements MqttReceiverConfig {
	/**
	 * The default value of the '{@link #getMqttTopic() <em>Mqtt Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMqttTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String MQTT_TOPIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMqttTopic() <em>Mqtt Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMqttTopic()
	 * @generated
	 * @ordered
	 */
	protected String mqttTopic = MQTT_TOPIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrintPayload() <em>Print Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrintPayload()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRINT_PAYLOAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrintPayload() <em>Print Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrintPayload()
	 * @generated
	 * @ordered
	 */
	protected boolean printPayload = PRINT_PAYLOAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPayloadEclassuri() <em>Payload Eclassuri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadEclassuri()
	 * @generated
	 * @ordered
	 */
	protected EClass payloadEclassuri;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MqttReceiverConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MqttreceiverPackage.Literals.MQTT_RECEIVER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMqttTopic() {
		return mqttTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMqttTopic(String newMqttTopic) {
		String oldMqttTopic = mqttTopic;
		mqttTopic = newMqttTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MqttreceiverPackage.MQTT_RECEIVER_CONFIG__MQTT_TOPIC, oldMqttTopic, mqttTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPrintPayload() {
		return printPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrintPayload(boolean newPrintPayload) {
		boolean oldPrintPayload = printPayload;
		printPayload = newPrintPayload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PRINT_PAYLOAD, oldPrintPayload, printPayload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPayloadEclassuri() {
		if (payloadEclassuri != null && payloadEclassuri.eIsProxy()) {
			InternalEObject oldPayloadEclassuri = (InternalEObject)payloadEclassuri;
			payloadEclassuri = (EClass)eResolveProxy(oldPayloadEclassuri);
			if (payloadEclassuri != oldPayloadEclassuri) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PAYLOAD_ECLASSURI, oldPayloadEclassuri, payloadEclassuri));
			}
		}
		return payloadEclassuri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetPayloadEclassuri() {
		return payloadEclassuri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayloadEclassuri(EClass newPayloadEclassuri) {
		EClass oldPayloadEclassuri = payloadEclassuri;
		payloadEclassuri = newPayloadEclassuri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PAYLOAD_ECLASSURI, oldPayloadEclassuri, payloadEclassuri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__MQTT_TOPIC:
				return getMqttTopic();
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PRINT_PAYLOAD:
				return isPrintPayload();
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PAYLOAD_ECLASSURI:
				if (resolve) return getPayloadEclassuri();
				return basicGetPayloadEclassuri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__MQTT_TOPIC:
				setMqttTopic((String)newValue);
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PRINT_PAYLOAD:
				setPrintPayload((Boolean)newValue);
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PAYLOAD_ECLASSURI:
				setPayloadEclassuri((EClass)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__MQTT_TOPIC:
				setMqttTopic(MQTT_TOPIC_EDEFAULT);
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PRINT_PAYLOAD:
				setPrintPayload(PRINT_PAYLOAD_EDEFAULT);
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PAYLOAD_ECLASSURI:
				setPayloadEclassuri((EClass)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__MQTT_TOPIC:
				return MQTT_TOPIC_EDEFAULT == null ? mqttTopic != null : !MQTT_TOPIC_EDEFAULT.equals(mqttTopic);
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PRINT_PAYLOAD:
				return printPayload != PRINT_PAYLOAD_EDEFAULT;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PAYLOAD_ECLASSURI:
				return payloadEclassuri != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mqttTopic: ");
		result.append(mqttTopic);
		result.append(", printPayload: ");
		result.append(printPayload);
		result.append(')');
		return result.toString();
	}

} //MqttReceiverConfigImpl
