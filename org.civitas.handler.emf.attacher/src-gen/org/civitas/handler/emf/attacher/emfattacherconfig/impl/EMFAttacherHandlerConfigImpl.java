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
package org.civitas.handler.emf.attacher.emfattacherconfig.impl;

import java.util.Collection;

import org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig;
import org.civitas.handler.emf.attacher.emfattacherconfig.EmfattacherconfigPackage;

import org.civitas.pipeline.DataSink;
import org.civitas.pipeline.DataSource;
import org.civitas.pipeline.Handler;
import org.civitas.pipeline.PipelinePackage;
import org.civitas.pipeline.PipelineStep;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Attacher Handler Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.handler.emf.attacher.emfattacherconfig.impl.EMFAttacherHandlerConfigImpl#getPid <em>Pid</em>}</li>
 *   <li>{@link org.civitas.handler.emf.attacher.emfattacherconfig.impl.EMFAttacherHandlerConfigImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.handler.emf.attacher.emfattacherconfig.impl.EMFAttacherHandlerConfigImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.civitas.handler.emf.attacher.emfattacherconfig.impl.EMFAttacherHandlerConfigImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.civitas.handler.emf.attacher.emfattacherconfig.impl.EMFAttacherHandlerConfigImpl#getRepoTarget <em>Repo Target</em>}</li>
 *   <li>{@link org.civitas.handler.emf.attacher.emfattacherconfig.impl.EMFAttacherHandlerConfigImpl#getTargetEClassUri <em>Target EClass Uri</em>}</li>
 *   <li>{@link org.civitas.handler.emf.attacher.emfattacherconfig.impl.EMFAttacherHandlerConfigImpl#getIncomingEClassUri <em>Incoming EClass Uri</em>}</li>
 *   <li>{@link org.civitas.handler.emf.attacher.emfattacherconfig.impl.EMFAttacherHandlerConfigImpl#getTargetReferenceUri <em>Target Reference Uri</em>}</li>
 *   <li>{@link org.civitas.handler.emf.attacher.emfattacherconfig.impl.EMFAttacherHandlerConfigImpl#getForeignKeyFeatureUri <em>Foreign Key Feature Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFAttacherHandlerConfigImpl extends MinimalEObjectImpl.Container implements EMFAttacherHandlerConfig {
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
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSource> inputs;

	/**
	 * The default value of the '{@link #getRepoTarget() <em>Repo Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepoTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String REPO_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepoTarget() <em>Repo Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepoTarget()
	 * @generated
	 * @ordered
	 */
	protected String repoTarget = REPO_TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetEClassUri() <em>Target EClass Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEClassUri()
	 * @generated
	 * @ordered
	 */
	protected EClass targetEClassUri;

	/**
	 * The cached value of the '{@link #getIncomingEClassUri() <em>Incoming EClass Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingEClassUri()
	 * @generated
	 * @ordered
	 */
	protected EClass incomingEClassUri;

	/**
	 * The cached value of the '{@link #getTargetReferenceUri() <em>Target Reference Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetReferenceUri()
	 * @generated
	 * @ordered
	 */
	protected EReference targetReferenceUri;

	/**
	 * The cached value of the '{@link #getForeignKeyFeatureUri() <em>Foreign Key Feature Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyFeatureUri()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature foreignKeyFeatureUri;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFAttacherHandlerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfattacherconfigPackage.Literals.EMF_ATTACHER_HANDLER_CONFIG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__PID, oldPid, pid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSink> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectWithInverseResolvingEList.ManyInverse<DataSink>(DataSink.class, this, EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__OUTPUTS, PipelinePackage.DATA_SINK__INPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSource> getInputs() {
		if (inputs == null) {
			inputs = new EObjectWithInverseResolvingEList.ManyInverse<DataSource>(DataSource.class, this, EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__INPUTS, PipelinePackage.DATA_SOURCE__OUTPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRepoTarget() {
		return repoTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepoTarget(String newRepoTarget) {
		String oldRepoTarget = repoTarget;
		repoTarget = newRepoTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__REPO_TARGET, oldRepoTarget, repoTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetEClassUri() {
		if (targetEClassUri != null && targetEClassUri.eIsProxy()) {
			InternalEObject oldTargetEClassUri = (InternalEObject)targetEClassUri;
			targetEClassUri = (EClass)eResolveProxy(oldTargetEClassUri);
			if (targetEClassUri != oldTargetEClassUri) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__TARGET_ECLASS_URI, oldTargetEClassUri, targetEClassUri));
			}
		}
		return targetEClassUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetTargetEClassUri() {
		return targetEClassUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetEClassUri(EClass newTargetEClassUri) {
		EClass oldTargetEClassUri = targetEClassUri;
		targetEClassUri = newTargetEClassUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__TARGET_ECLASS_URI, oldTargetEClassUri, targetEClassUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncomingEClassUri() {
		if (incomingEClassUri != null && incomingEClassUri.eIsProxy()) {
			InternalEObject oldIncomingEClassUri = (InternalEObject)incomingEClassUri;
			incomingEClassUri = (EClass)eResolveProxy(oldIncomingEClassUri);
			if (incomingEClassUri != oldIncomingEClassUri) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__INCOMING_ECLASS_URI, oldIncomingEClassUri, incomingEClassUri));
			}
		}
		return incomingEClassUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetIncomingEClassUri() {
		return incomingEClassUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncomingEClassUri(EClass newIncomingEClassUri) {
		EClass oldIncomingEClassUri = incomingEClassUri;
		incomingEClassUri = newIncomingEClassUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__INCOMING_ECLASS_URI, oldIncomingEClassUri, incomingEClassUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetReferenceUri() {
		if (targetReferenceUri != null && targetReferenceUri.eIsProxy()) {
			InternalEObject oldTargetReferenceUri = (InternalEObject)targetReferenceUri;
			targetReferenceUri = (EReference)eResolveProxy(oldTargetReferenceUri);
			if (targetReferenceUri != oldTargetReferenceUri) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__TARGET_REFERENCE_URI, oldTargetReferenceUri, targetReferenceUri));
			}
		}
		return targetReferenceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetTargetReferenceUri() {
		return targetReferenceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetReferenceUri(EReference newTargetReferenceUri) {
		EReference oldTargetReferenceUri = targetReferenceUri;
		targetReferenceUri = newTargetReferenceUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__TARGET_REFERENCE_URI, oldTargetReferenceUri, targetReferenceUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EStructuralFeature getForeignKeyFeatureUri() {
		if (foreignKeyFeatureUri != null && foreignKeyFeatureUri.eIsProxy()) {
			InternalEObject oldForeignKeyFeatureUri = (InternalEObject)foreignKeyFeatureUri;
			foreignKeyFeatureUri = (EStructuralFeature)eResolveProxy(oldForeignKeyFeatureUri);
			if (foreignKeyFeatureUri != oldForeignKeyFeatureUri) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__FOREIGN_KEY_FEATURE_URI, oldForeignKeyFeatureUri, foreignKeyFeatureUri));
			}
		}
		return foreignKeyFeatureUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetForeignKeyFeatureUri() {
		return foreignKeyFeatureUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForeignKeyFeatureUri(EStructuralFeature newForeignKeyFeatureUri) {
		EStructuralFeature oldForeignKeyFeatureUri = foreignKeyFeatureUri;
		foreignKeyFeatureUri = newForeignKeyFeatureUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__FOREIGN_KEY_FEATURE_URI, oldForeignKeyFeatureUri, foreignKeyFeatureUri));
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
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__OUTPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputs()).basicAdd(otherEnd, msgs);
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__INPUTS:
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
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__INPUTS:
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
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__PID:
				return getPid();
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__ID:
				return getId();
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__OUTPUTS:
				return getOutputs();
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__INPUTS:
				return getInputs();
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__REPO_TARGET:
				return getRepoTarget();
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__TARGET_ECLASS_URI:
				if (resolve) return getTargetEClassUri();
				return basicGetTargetEClassUri();
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__INCOMING_ECLASS_URI:
				if (resolve) return getIncomingEClassUri();
				return basicGetIncomingEClassUri();
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__TARGET_REFERENCE_URI:
				if (resolve) return getTargetReferenceUri();
				return basicGetTargetReferenceUri();
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__FOREIGN_KEY_FEATURE_URI:
				if (resolve) return getForeignKeyFeatureUri();
				return basicGetForeignKeyFeatureUri();
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
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__PID:
				setPid((String)newValue);
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__ID:
				setId((String)newValue);
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends DataSink>)newValue);
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends DataSource>)newValue);
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__REPO_TARGET:
				setRepoTarget((String)newValue);
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__TARGET_ECLASS_URI:
				setTargetEClassUri((EClass)newValue);
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__INCOMING_ECLASS_URI:
				setIncomingEClassUri((EClass)newValue);
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__TARGET_REFERENCE_URI:
				setTargetReferenceUri((EReference)newValue);
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__FOREIGN_KEY_FEATURE_URI:
				setForeignKeyFeatureUri((EStructuralFeature)newValue);
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
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__PID:
				setPid(PID_EDEFAULT);
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__ID:
				setId(ID_EDEFAULT);
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__OUTPUTS:
				getOutputs().clear();
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__INPUTS:
				getInputs().clear();
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__REPO_TARGET:
				setRepoTarget(REPO_TARGET_EDEFAULT);
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__TARGET_ECLASS_URI:
				setTargetEClassUri((EClass)null);
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__INCOMING_ECLASS_URI:
				setIncomingEClassUri((EClass)null);
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__TARGET_REFERENCE_URI:
				setTargetReferenceUri((EReference)null);
				return;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__FOREIGN_KEY_FEATURE_URI:
				setForeignKeyFeatureUri((EStructuralFeature)null);
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
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__PID:
				return PID_EDEFAULT == null ? pid != null : !PID_EDEFAULT.equals(pid);
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__REPO_TARGET:
				return REPO_TARGET_EDEFAULT == null ? repoTarget != null : !REPO_TARGET_EDEFAULT.equals(repoTarget);
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__TARGET_ECLASS_URI:
				return targetEClassUri != null;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__INCOMING_ECLASS_URI:
				return incomingEClassUri != null;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__TARGET_REFERENCE_URI:
				return targetReferenceUri != null;
			case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__FOREIGN_KEY_FEATURE_URI:
				return foreignKeyFeatureUri != null;
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
				case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__ID: return PipelinePackage.PIPELINE_STEP__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (derivedFeatureID) {
				case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__OUTPUTS: return PipelinePackage.DATA_SOURCE__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == DataSink.class) {
			switch (derivedFeatureID) {
				case EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__INPUTS: return PipelinePackage.DATA_SINK__INPUTS;
				default: return -1;
			}
		}
		if (baseClass == Handler.class) {
			switch (derivedFeatureID) {
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
				case PipelinePackage.PIPELINE_STEP__ID: return EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (baseFeatureID) {
				case PipelinePackage.DATA_SOURCE__OUTPUTS: return EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == DataSink.class) {
			switch (baseFeatureID) {
				case PipelinePackage.DATA_SINK__INPUTS: return EmfattacherconfigPackage.EMF_ATTACHER_HANDLER_CONFIG__INPUTS;
				default: return -1;
			}
		}
		if (baseClass == Handler.class) {
			switch (baseFeatureID) {
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
		result.append(", repoTarget: ");
		result.append(repoTarget);
		result.append(')');
		return result.toString();
	}

} //EMFAttacherHandlerConfigImpl
