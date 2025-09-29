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

import java.util.Collection;

import org.civitas.mqttreceiver.MqttReceiverConfig;
import org.civitas.mqttreceiver.MqttreceiverPackage;

import org.civitas.pipeline.DataSink;
import org.civitas.pipeline.DataSource;
import org.civitas.pipeline.PipelinePackage;
import org.civitas.pipeline.PipelineStep;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mqtt Receiver Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.mqttreceiver.impl.MqttReceiverConfigImpl#getPid <em>Pid</em>}</li>
 *   <li>{@link org.civitas.mqttreceiver.impl.MqttReceiverConfigImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.mqttreceiver.impl.MqttReceiverConfigImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.civitas.mqttreceiver.impl.MqttReceiverConfigImpl#getMqttTopic <em>Mqtt Topic</em>}</li>
 *   <li>{@link org.civitas.mqttreceiver.impl.MqttReceiverConfigImpl#isPrintPayload <em>Print Payload</em>}</li>
 *   <li>{@link org.civitas.mqttreceiver.impl.MqttReceiverConfigImpl#getPayloadEclassuri <em>Payload Eclassuri</em>}</li>
 *   <li>{@link org.civitas.mqttreceiver.impl.MqttReceiverConfigImpl#getMqttServiceTarget <em>Mqtt Service Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MqttReceiverConfigImpl extends MinimalEObjectImpl.Container implements MqttReceiverConfig {
	/**
	 * The default value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected static final String PID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected String pid = PID_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSink> outputs;

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
	 * The default value of the '{@link #getMqttServiceTarget() <em>Mqtt Service Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMqttServiceTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String MQTT_SERVICE_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMqttServiceTarget() <em>Mqtt Service Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMqttServiceTarget()
	 * @generated
	 * @ordered
	 */
	protected String mqttServiceTarget = MQTT_SERVICE_TARGET_EDEFAULT;

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
	public String getPid() {
		return pid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPid(String newPid) {
		String oldPid = pid;
		pid = newPid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PID, oldPid, pid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MqttreceiverPackage.MQTT_RECEIVER_CONFIG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSink> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectWithInverseResolvingEList.ManyInverse<DataSink>(DataSink.class, this, MqttreceiverPackage.MQTT_RECEIVER_CONFIG__OUTPUTS, PipelinePackage.DATA_SINK__INPUTS);
		}
		return outputs;
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
	public String getMqttServiceTarget() {
		return mqttServiceTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMqttServiceTarget(String newMqttServiceTarget) {
		String oldMqttServiceTarget = mqttServiceTarget;
		mqttServiceTarget = newMqttServiceTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MqttreceiverPackage.MQTT_RECEIVER_CONFIG__MQTT_SERVICE_TARGET, oldMqttServiceTarget, mqttServiceTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__OUTPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PID:
				return getPid();
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__ID:
				return getId();
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__OUTPUTS:
				return getOutputs();
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__MQTT_TOPIC:
				return getMqttTopic();
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PRINT_PAYLOAD:
				return isPrintPayload();
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PAYLOAD_ECLASSURI:
				if (resolve) return getPayloadEclassuri();
				return basicGetPayloadEclassuri();
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__MQTT_SERVICE_TARGET:
				return getMqttServiceTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PID:
				setPid((String)newValue);
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__ID:
				setId((String)newValue);
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends DataSink>)newValue);
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__MQTT_TOPIC:
				setMqttTopic((String)newValue);
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PRINT_PAYLOAD:
				setPrintPayload((Boolean)newValue);
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PAYLOAD_ECLASSURI:
				setPayloadEclassuri((EClass)newValue);
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__MQTT_SERVICE_TARGET:
				setMqttServiceTarget((String)newValue);
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
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PID:
				setPid(PID_EDEFAULT);
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__ID:
				setId(ID_EDEFAULT);
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__OUTPUTS:
				getOutputs().clear();
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__MQTT_TOPIC:
				setMqttTopic(MQTT_TOPIC_EDEFAULT);
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PRINT_PAYLOAD:
				setPrintPayload(PRINT_PAYLOAD_EDEFAULT);
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PAYLOAD_ECLASSURI:
				setPayloadEclassuri((EClass)null);
				return;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__MQTT_SERVICE_TARGET:
				setMqttServiceTarget(MQTT_SERVICE_TARGET_EDEFAULT);
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
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PID:
				return PID_EDEFAULT == null ? pid != null : !PID_EDEFAULT.equals(pid);
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__MQTT_TOPIC:
				return MQTT_TOPIC_EDEFAULT == null ? mqttTopic != null : !MQTT_TOPIC_EDEFAULT.equals(mqttTopic);
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PRINT_PAYLOAD:
				return printPayload != PRINT_PAYLOAD_EDEFAULT;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__PAYLOAD_ECLASSURI:
				return payloadEclassuri != null;
			case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__MQTT_SERVICE_TARGET:
				return MQTT_SERVICE_TARGET_EDEFAULT == null ? mqttServiceTarget != null : !MQTT_SERVICE_TARGET_EDEFAULT.equals(mqttServiceTarget);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PipelineStep.class) {
			switch (derivedFeatureID) {
				case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__ID: return PipelinePackage.PIPELINE_STEP__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (derivedFeatureID) {
				case MqttreceiverPackage.MQTT_RECEIVER_CONFIG__OUTPUTS: return PipelinePackage.DATA_SOURCE__OUTPUTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PipelineStep.class) {
			switch (baseFeatureID) {
				case PipelinePackage.PIPELINE_STEP__ID: return MqttreceiverPackage.MQTT_RECEIVER_CONFIG__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (baseFeatureID) {
				case PipelinePackage.DATA_SOURCE__OUTPUTS: return MqttreceiverPackage.MQTT_RECEIVER_CONFIG__OUTPUTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (pid: ");
		result.append(pid);
		result.append(", id: ");
		result.append(id);
		result.append(", mqttTopic: ");
		result.append(mqttTopic);
		result.append(", printPayload: ");
		result.append(printPayload);
		result.append(", mqttServiceTarget: ");
		result.append(mqttServiceTarget);
		result.append(')');
		return result.toString();
	}

} //MqttReceiverConfigImpl
