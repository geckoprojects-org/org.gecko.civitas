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
package org.civitas.mqtthandler.impl;

import java.util.Collection;

import org.civitas.mqtthandler.MqttEventHandlerConfig;
import org.civitas.mqtthandler.MqtthandlerPackage;

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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mqtt Event Handler Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.mqtthandler.impl.MqttEventHandlerConfigImpl#getPid <em>Pid</em>}</li>
 *   <li>{@link org.civitas.mqtthandler.impl.MqttEventHandlerConfigImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.mqtthandler.impl.MqttEventHandlerConfigImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.civitas.mqtthandler.impl.MqttEventHandlerConfigImpl#getMqttTopic <em>Mqtt Topic</em>}</li>
 *   <li>{@link org.civitas.mqtthandler.impl.MqttEventHandlerConfigImpl#getMqttServiceTarget <em>Mqtt Service Target</em>}</li>
 *   <li>{@link org.civitas.mqtthandler.impl.MqttEventHandlerConfigImpl#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MqttEventHandlerConfigImpl extends MinimalEObjectImpl.Container implements MqttEventHandlerConfig {
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
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSource> inputs;

	/**
	 * The cached value of the '{@link #getMqttTopic() <em>Mqtt Topic</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMqttTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mqttTopic;

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
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = "application/json";

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MqttEventHandlerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MqtthandlerPackage.Literals.MQTT_EVENT_HANDLER_CONFIG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__PID, oldPid, pid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSource> getInputs() {
		if (inputs == null) {
			inputs = new EObjectWithInverseResolvingEList.ManyInverse<DataSource>(DataSource.class, this, MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__INPUTS, PipelinePackage.DATA_SOURCE__OUTPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMqttTopic() {
		if (mqttTopic == null) {
			mqttTopic = new EDataTypeUniqueEList<String>(String.class, this, MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__MQTT_TOPIC);
		}
		return mqttTopic;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__MQTT_SERVICE_TARGET, oldMqttServiceTarget, mqttServiceTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__CONTENT_TYPE, oldContentType, contentType));
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
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__INPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputs()).basicAdd(otherEnd, msgs);
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
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
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
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__PID:
				return getPid();
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__ID:
				return getId();
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__INPUTS:
				return getInputs();
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__MQTT_TOPIC:
				return getMqttTopic();
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__MQTT_SERVICE_TARGET:
				return getMqttServiceTarget();
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__CONTENT_TYPE:
				return getContentType();
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
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__PID:
				setPid((String)newValue);
				return;
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__ID:
				setId((String)newValue);
				return;
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends DataSource>)newValue);
				return;
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__MQTT_TOPIC:
				getMqttTopic().clear();
				getMqttTopic().addAll((Collection<? extends String>)newValue);
				return;
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__MQTT_SERVICE_TARGET:
				setMqttServiceTarget((String)newValue);
				return;
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__CONTENT_TYPE:
				setContentType((String)newValue);
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
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__PID:
				setPid(PID_EDEFAULT);
				return;
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__ID:
				setId(ID_EDEFAULT);
				return;
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__INPUTS:
				getInputs().clear();
				return;
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__MQTT_TOPIC:
				getMqttTopic().clear();
				return;
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__MQTT_SERVICE_TARGET:
				setMqttServiceTarget(MQTT_SERVICE_TARGET_EDEFAULT);
				return;
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
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
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__PID:
				return PID_EDEFAULT == null ? pid != null : !PID_EDEFAULT.equals(pid);
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__MQTT_TOPIC:
				return mqttTopic != null && !mqttTopic.isEmpty();
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__MQTT_SERVICE_TARGET:
				return MQTT_SERVICE_TARGET_EDEFAULT == null ? mqttServiceTarget != null : !MQTT_SERVICE_TARGET_EDEFAULT.equals(mqttServiceTarget);
			case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
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
				case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__ID: return PipelinePackage.PIPELINE_STEP__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSink.class) {
			switch (derivedFeatureID) {
				case MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__INPUTS: return PipelinePackage.DATA_SINK__INPUTS;
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
				case PipelinePackage.PIPELINE_STEP__ID: return MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSink.class) {
			switch (baseFeatureID) {
				case PipelinePackage.DATA_SINK__INPUTS: return MqtthandlerPackage.MQTT_EVENT_HANDLER_CONFIG__INPUTS;
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
		result.append(", mqttServiceTarget: ");
		result.append(mqttServiceTarget);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(')');
		return result.toString();
	}

} //MqttEventHandlerConfigImpl
