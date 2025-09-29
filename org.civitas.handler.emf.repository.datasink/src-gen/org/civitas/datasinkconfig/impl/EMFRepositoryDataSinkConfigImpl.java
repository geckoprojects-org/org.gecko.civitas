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
package org.civitas.datasinkconfig.impl;

import java.util.Collection;

import org.civitas.datasinkconfig.DatasinkconfigPackage;
import org.civitas.datasinkconfig.EMFRepositoryDataSinkConfig;
import org.civitas.datasinkconfig.MergeStrategy;

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
 * An implementation of the model object '<em><b>EMF Repository Data Sink Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.datasinkconfig.impl.EMFRepositoryDataSinkConfigImpl#getPid <em>Pid</em>}</li>
 *   <li>{@link org.civitas.datasinkconfig.impl.EMFRepositoryDataSinkConfigImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.datasinkconfig.impl.EMFRepositoryDataSinkConfigImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.civitas.datasinkconfig.impl.EMFRepositoryDataSinkConfigImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.civitas.datasinkconfig.impl.EMFRepositoryDataSinkConfigImpl#getRepoTarget <em>Repo Target</em>}</li>
 *   <li>{@link org.civitas.datasinkconfig.impl.EMFRepositoryDataSinkConfigImpl#getMergeStrategy <em>Merge Strategy</em>}</li>
 *   <li>{@link org.civitas.datasinkconfig.impl.EMFRepositoryDataSinkConfigImpl#isDetailedLogging <em>Detailed Logging</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFRepositoryDataSinkConfigImpl extends MinimalEObjectImpl.Container implements EMFRepositoryDataSinkConfig {
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
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSink> outputs;

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
	 * The default value of the '{@link #getMergeStrategy() <em>Merge Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final MergeStrategy MERGE_STRATEGY_EDEFAULT = MergeStrategy.MERGE_INTO_IGNORE_UNSET;

	/**
	 * The cached value of the '{@link #getMergeStrategy() <em>Merge Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeStrategy()
	 * @generated
	 * @ordered
	 */
	protected MergeStrategy mergeStrategy = MERGE_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #isDetailedLogging() <em>Detailed Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDetailedLogging()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DETAILED_LOGGING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDetailedLogging() <em>Detailed Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDetailedLogging()
	 * @generated
	 * @ordered
	 */
	protected boolean detailedLogging = DETAILED_LOGGING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFRepositoryDataSinkConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasinkconfigPackage.Literals.EMF_REPOSITORY_DATA_SINK_CONFIG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__PID, oldPid, pid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSource> getInputs() {
		if (inputs == null) {
			inputs = new EObjectWithInverseResolvingEList.ManyInverse<DataSource>(DataSource.class, this, DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__INPUTS, PipelinePackage.DATA_SOURCE__OUTPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSink> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectWithInverseResolvingEList.ManyInverse<DataSink>(DataSink.class, this, DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__OUTPUTS, PipelinePackage.DATA_SINK__INPUTS);
		}
		return outputs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__REPO_TARGET, oldRepoTarget, repoTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergeStrategy getMergeStrategy() {
		return mergeStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergeStrategy(MergeStrategy newMergeStrategy) {
		MergeStrategy oldMergeStrategy = mergeStrategy;
		mergeStrategy = newMergeStrategy == null ? MERGE_STRATEGY_EDEFAULT : newMergeStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__MERGE_STRATEGY, oldMergeStrategy, mergeStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDetailedLogging() {
		return detailedLogging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailedLogging(boolean newDetailedLogging) {
		boolean oldDetailedLogging = detailedLogging;
		detailedLogging = newDetailedLogging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__DETAILED_LOGGING, oldDetailedLogging, detailedLogging));
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
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__INPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputs()).basicAdd(otherEnd, msgs);
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__OUTPUTS:
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
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__OUTPUTS:
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
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__PID:
				return getPid();
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__ID:
				return getId();
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__INPUTS:
				return getInputs();
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__OUTPUTS:
				return getOutputs();
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__REPO_TARGET:
				return getRepoTarget();
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__MERGE_STRATEGY:
				return getMergeStrategy();
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__DETAILED_LOGGING:
				return isDetailedLogging();
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
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__PID:
				setPid((String)newValue);
				return;
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__ID:
				setId((String)newValue);
				return;
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends DataSource>)newValue);
				return;
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends DataSink>)newValue);
				return;
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__REPO_TARGET:
				setRepoTarget((String)newValue);
				return;
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__MERGE_STRATEGY:
				setMergeStrategy((MergeStrategy)newValue);
				return;
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__DETAILED_LOGGING:
				setDetailedLogging((Boolean)newValue);
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
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__PID:
				setPid(PID_EDEFAULT);
				return;
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__ID:
				setId(ID_EDEFAULT);
				return;
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__INPUTS:
				getInputs().clear();
				return;
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__OUTPUTS:
				getOutputs().clear();
				return;
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__REPO_TARGET:
				setRepoTarget(REPO_TARGET_EDEFAULT);
				return;
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__MERGE_STRATEGY:
				setMergeStrategy(MERGE_STRATEGY_EDEFAULT);
				return;
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__DETAILED_LOGGING:
				setDetailedLogging(DETAILED_LOGGING_EDEFAULT);
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
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__PID:
				return PID_EDEFAULT == null ? pid != null : !PID_EDEFAULT.equals(pid);
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__REPO_TARGET:
				return REPO_TARGET_EDEFAULT == null ? repoTarget != null : !REPO_TARGET_EDEFAULT.equals(repoTarget);
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__MERGE_STRATEGY:
				return mergeStrategy != MERGE_STRATEGY_EDEFAULT;
			case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__DETAILED_LOGGING:
				return detailedLogging != DETAILED_LOGGING_EDEFAULT;
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
				case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__ID: return PipelinePackage.PIPELINE_STEP__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSink.class) {
			switch (derivedFeatureID) {
				case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__INPUTS: return PipelinePackage.DATA_SINK__INPUTS;
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (derivedFeatureID) {
				case DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__OUTPUTS: return PipelinePackage.DATA_SOURCE__OUTPUTS;
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
				case PipelinePackage.PIPELINE_STEP__ID: return DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSink.class) {
			switch (baseFeatureID) {
				case PipelinePackage.DATA_SINK__INPUTS: return DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__INPUTS;
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (baseFeatureID) {
				case PipelinePackage.DATA_SOURCE__OUTPUTS: return DatasinkconfigPackage.EMF_REPOSITORY_DATA_SINK_CONFIG__OUTPUTS;
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
		result.append(", mergeStrategy: ");
		result.append(mergeStrategy);
		result.append(", detailedLogging: ");
		result.append(detailedLogging);
		result.append(')');
		return result.toString();
	}

} //EMFRepositoryDataSinkConfigImpl
