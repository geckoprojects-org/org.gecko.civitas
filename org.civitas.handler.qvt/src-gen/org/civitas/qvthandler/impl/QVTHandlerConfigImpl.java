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
package org.civitas.qvthandler.impl;

import java.util.Collection;

import org.civitas.pipeline.DataSink;
import org.civitas.pipeline.DataSource;
import org.civitas.pipeline.Handler;
import org.civitas.pipeline.PipelinePackage;
import org.civitas.pipeline.PipelineStep;

import org.civitas.qvthandler.QVTHandlerConfig;
import org.civitas.qvthandler.QvthandlerPackage;

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
 * An implementation of the model object '<em><b>QVT Handler Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.qvthandler.impl.QVTHandlerConfigImpl#getPid <em>Pid</em>}</li>
 *   <li>{@link org.civitas.qvthandler.impl.QVTHandlerConfigImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.qvthandler.impl.QVTHandlerConfigImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.civitas.qvthandler.impl.QVTHandlerConfigImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.civitas.qvthandler.impl.QVTHandlerConfigImpl#getTrafo <em>Trafo</em>}</li>
 *   <li>{@link org.civitas.qvthandler.impl.QVTHandlerConfigImpl#getEclassuri <em>Eclassuri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QVTHandlerConfigImpl extends MinimalEObjectImpl.Container implements QVTHandlerConfig {
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
	 * The default value of the '{@link #getTrafo() <em>Trafo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafo()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrafo() <em>Trafo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafo()
	 * @generated
	 * @ordered
	 */
	protected String trafo = TRAFO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEclassuri() <em>Eclassuri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEclassuri()
	 * @generated
	 * @ordered
	 */
	protected EClass eclassuri;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QVTHandlerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvthandlerPackage.Literals.QVT_HANDLER_CONFIG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QvthandlerPackage.QVT_HANDLER_CONFIG__PID, oldPid, pid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QvthandlerPackage.QVT_HANDLER_CONFIG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSink> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectWithInverseResolvingEList.ManyInverse<DataSink>(DataSink.class, this, QvthandlerPackage.QVT_HANDLER_CONFIG__OUTPUTS, PipelinePackage.DATA_SINK__INPUTS);
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
			inputs = new EObjectWithInverseResolvingEList.ManyInverse<DataSource>(DataSource.class, this, QvthandlerPackage.QVT_HANDLER_CONFIG__INPUTS, PipelinePackage.DATA_SOURCE__OUTPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrafo() {
		return trafo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrafo(String newTrafo) {
		String oldTrafo = trafo;
		trafo = newTrafo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvthandlerPackage.QVT_HANDLER_CONFIG__TRAFO, oldTrafo, trafo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEclassuri() {
		if (eclassuri != null && eclassuri.eIsProxy()) {
			InternalEObject oldEclassuri = (InternalEObject)eclassuri;
			eclassuri = (EClass)eResolveProxy(oldEclassuri);
			if (eclassuri != oldEclassuri) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvthandlerPackage.QVT_HANDLER_CONFIG__ECLASSURI, oldEclassuri, eclassuri));
			}
		}
		return eclassuri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEclassuri() {
		return eclassuri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEclassuri(EClass newEclassuri) {
		EClass oldEclassuri = eclassuri;
		eclassuri = newEclassuri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvthandlerPackage.QVT_HANDLER_CONFIG__ECLASSURI, oldEclassuri, eclassuri));
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
			case QvthandlerPackage.QVT_HANDLER_CONFIG__OUTPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputs()).basicAdd(otherEnd, msgs);
			case QvthandlerPackage.QVT_HANDLER_CONFIG__INPUTS:
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
			case QvthandlerPackage.QVT_HANDLER_CONFIG__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case QvthandlerPackage.QVT_HANDLER_CONFIG__INPUTS:
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
			case QvthandlerPackage.QVT_HANDLER_CONFIG__PID:
				return getPid();
			case QvthandlerPackage.QVT_HANDLER_CONFIG__ID:
				return getId();
			case QvthandlerPackage.QVT_HANDLER_CONFIG__OUTPUTS:
				return getOutputs();
			case QvthandlerPackage.QVT_HANDLER_CONFIG__INPUTS:
				return getInputs();
			case QvthandlerPackage.QVT_HANDLER_CONFIG__TRAFO:
				return getTrafo();
			case QvthandlerPackage.QVT_HANDLER_CONFIG__ECLASSURI:
				if (resolve) return getEclassuri();
				return basicGetEclassuri();
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
			case QvthandlerPackage.QVT_HANDLER_CONFIG__PID:
				setPid((String)newValue);
				return;
			case QvthandlerPackage.QVT_HANDLER_CONFIG__ID:
				setId((String)newValue);
				return;
			case QvthandlerPackage.QVT_HANDLER_CONFIG__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends DataSink>)newValue);
				return;
			case QvthandlerPackage.QVT_HANDLER_CONFIG__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends DataSource>)newValue);
				return;
			case QvthandlerPackage.QVT_HANDLER_CONFIG__TRAFO:
				setTrafo((String)newValue);
				return;
			case QvthandlerPackage.QVT_HANDLER_CONFIG__ECLASSURI:
				setEclassuri((EClass)newValue);
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
			case QvthandlerPackage.QVT_HANDLER_CONFIG__PID:
				setPid(PID_EDEFAULT);
				return;
			case QvthandlerPackage.QVT_HANDLER_CONFIG__ID:
				setId(ID_EDEFAULT);
				return;
			case QvthandlerPackage.QVT_HANDLER_CONFIG__OUTPUTS:
				getOutputs().clear();
				return;
			case QvthandlerPackage.QVT_HANDLER_CONFIG__INPUTS:
				getInputs().clear();
				return;
			case QvthandlerPackage.QVT_HANDLER_CONFIG__TRAFO:
				setTrafo(TRAFO_EDEFAULT);
				return;
			case QvthandlerPackage.QVT_HANDLER_CONFIG__ECLASSURI:
				setEclassuri((EClass)null);
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
			case QvthandlerPackage.QVT_HANDLER_CONFIG__PID:
				return PID_EDEFAULT == null ? pid != null : !PID_EDEFAULT.equals(pid);
			case QvthandlerPackage.QVT_HANDLER_CONFIG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case QvthandlerPackage.QVT_HANDLER_CONFIG__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case QvthandlerPackage.QVT_HANDLER_CONFIG__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case QvthandlerPackage.QVT_HANDLER_CONFIG__TRAFO:
				return TRAFO_EDEFAULT == null ? trafo != null : !TRAFO_EDEFAULT.equals(trafo);
			case QvthandlerPackage.QVT_HANDLER_CONFIG__ECLASSURI:
				return eclassuri != null;
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
				case QvthandlerPackage.QVT_HANDLER_CONFIG__ID: return PipelinePackage.PIPELINE_STEP__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (derivedFeatureID) {
				case QvthandlerPackage.QVT_HANDLER_CONFIG__OUTPUTS: return PipelinePackage.DATA_SOURCE__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == DataSink.class) {
			switch (derivedFeatureID) {
				case QvthandlerPackage.QVT_HANDLER_CONFIG__INPUTS: return PipelinePackage.DATA_SINK__INPUTS;
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
				case PipelinePackage.PIPELINE_STEP__ID: return QvthandlerPackage.QVT_HANDLER_CONFIG__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (baseFeatureID) {
				case PipelinePackage.DATA_SOURCE__OUTPUTS: return QvthandlerPackage.QVT_HANDLER_CONFIG__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == DataSink.class) {
			switch (baseFeatureID) {
				case PipelinePackage.DATA_SINK__INPUTS: return QvthandlerPackage.QVT_HANDLER_CONFIG__INPUTS;
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
		result.append(", trafo: ");
		result.append(trafo);
		result.append(')');
		return result.toString();
	}

} //QVTHandlerConfigImpl
