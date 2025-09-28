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
package org.civitas.db.loader.scheduledloaderconfig.impl;

import java.util.Collection;

import org.civitas.db.loader.scheduledloaderconfig.ScheduledLoaderConfig;
import org.civitas.db.loader.scheduledloaderconfig.ScheduledloaderconfigPackage;

import org.civitas.pipeline.DataSink;
import org.civitas.pipeline.DataSource;
import org.civitas.pipeline.PipelinePackage;
import org.civitas.pipeline.PipelineStep;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduled Loader Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledLoaderConfigImpl#getPid <em>Pid</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledLoaderConfigImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledLoaderConfigImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledLoaderConfigImpl#getScheduleInterval <em>Schedule Interval</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledLoaderConfigImpl#getQueryLimit <em>Query Limit</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledLoaderConfigImpl#getInitialQuerySkip <em>Initial Query Skip</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledLoaderConfigImpl#getRepoTarget <em>Repo Target</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledLoaderConfigImpl#getLoaderName <em>Loader Name</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledLoaderConfigImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.civitas.db.loader.scheduledloaderconfig.impl.ScheduledLoaderConfigImpl#getEclass <em>Eclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduledLoaderConfigImpl extends MinimalEObjectImpl.Container implements ScheduledLoaderConfig {
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
	 * The default value of the '{@link #getScheduleInterval() <em>Schedule Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleInterval()
	 * @generated
	 * @ordered
	 */
	protected static final long SCHEDULE_INTERVAL_EDEFAULT = 60L;

	/**
	 * The cached value of the '{@link #getScheduleInterval() <em>Schedule Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleInterval()
	 * @generated
	 * @ordered
	 */
	protected long scheduleInterval = SCHEDULE_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueryLimit() <em>Query Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLimit()
	 * @generated
	 * @ordered
	 */
	protected static final long QUERY_LIMIT_EDEFAULT = 1000L;

	/**
	 * The cached value of the '{@link #getQueryLimit() <em>Query Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLimit()
	 * @generated
	 * @ordered
	 */
	protected long queryLimit = QUERY_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialQuerySkip() <em>Initial Query Skip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialQuerySkip()
	 * @generated
	 * @ordered
	 */
	protected static final long INITIAL_QUERY_SKIP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getInitialQuerySkip() <em>Initial Query Skip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialQuerySkip()
	 * @generated
	 * @ordered
	 */
	protected long initialQuerySkip = INITIAL_QUERY_SKIP_EDEFAULT;

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
	 * The default value of the '{@link #getLoaderName() <em>Loader Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoaderName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOADER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoaderName() <em>Loader Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoaderName()
	 * @generated
	 * @ordered
	 */
	protected String loaderName = LOADER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage package_;

	/**
	 * The cached value of the '{@link #getEclass() <em>Eclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEclass()
	 * @generated
	 * @ordered
	 */
	protected EClass eclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduledLoaderConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScheduledloaderconfigPackage.Literals.SCHEDULED_LOADER_CONFIG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__PID, oldPid, pid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSink> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectWithInverseResolvingEList.ManyInverse<DataSink>(DataSink.class, this, ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__OUTPUTS, PipelinePackage.DATA_SINK__INPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getScheduleInterval() {
		return scheduleInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheduleInterval(long newScheduleInterval) {
		long oldScheduleInterval = scheduleInterval;
		scheduleInterval = newScheduleInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__SCHEDULE_INTERVAL, oldScheduleInterval, scheduleInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getQueryLimit() {
		return queryLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueryLimit(long newQueryLimit) {
		long oldQueryLimit = queryLimit;
		queryLimit = newQueryLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__QUERY_LIMIT, oldQueryLimit, queryLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getInitialQuerySkip() {
		return initialQuerySkip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialQuerySkip(long newInitialQuerySkip) {
		long oldInitialQuerySkip = initialQuerySkip;
		initialQuerySkip = newInitialQuerySkip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__INITIAL_QUERY_SKIP, oldInitialQuerySkip, initialQuerySkip));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__REPO_TARGET, oldRepoTarget, repoTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoaderName() {
		return loaderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoaderName(String newLoaderName) {
		String oldLoaderName = loaderName;
		loaderName = newLoaderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__LOADER_NAME, oldLoaderName, loaderName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPackage getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (EPackage)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackage(EPackage newPackage) {
		EPackage oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEclass() {
		if (eclass != null && eclass.eIsProxy()) {
			InternalEObject oldEclass = (InternalEObject)eclass;
			eclass = (EClass)eResolveProxy(oldEclass);
			if (eclass != oldEclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__ECLASS, oldEclass, eclass));
			}
		}
		return eclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEclass() {
		return eclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEclass(EClass newEclass) {
		EClass oldEclass = eclass;
		eclass = newEclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__ECLASS, oldEclass, eclass));
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
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__OUTPUTS:
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
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__OUTPUTS:
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
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__PID:
				return getPid();
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__ID:
				return getId();
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__OUTPUTS:
				return getOutputs();
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__SCHEDULE_INTERVAL:
				return getScheduleInterval();
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__QUERY_LIMIT:
				return getQueryLimit();
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__INITIAL_QUERY_SKIP:
				return getInitialQuerySkip();
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__REPO_TARGET:
				return getRepoTarget();
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__LOADER_NAME:
				return getLoaderName();
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__ECLASS:
				if (resolve) return getEclass();
				return basicGetEclass();
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
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__PID:
				setPid((String)newValue);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__ID:
				setId((String)newValue);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends DataSink>)newValue);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__SCHEDULE_INTERVAL:
				setScheduleInterval((Long)newValue);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__QUERY_LIMIT:
				setQueryLimit((Long)newValue);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__INITIAL_QUERY_SKIP:
				setInitialQuerySkip((Long)newValue);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__REPO_TARGET:
				setRepoTarget((String)newValue);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__LOADER_NAME:
				setLoaderName((String)newValue);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__PACKAGE:
				setPackage((EPackage)newValue);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__ECLASS:
				setEclass((EClass)newValue);
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
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__PID:
				setPid(PID_EDEFAULT);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__ID:
				setId(ID_EDEFAULT);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__OUTPUTS:
				getOutputs().clear();
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__SCHEDULE_INTERVAL:
				setScheduleInterval(SCHEDULE_INTERVAL_EDEFAULT);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__QUERY_LIMIT:
				setQueryLimit(QUERY_LIMIT_EDEFAULT);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__INITIAL_QUERY_SKIP:
				setInitialQuerySkip(INITIAL_QUERY_SKIP_EDEFAULT);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__REPO_TARGET:
				setRepoTarget(REPO_TARGET_EDEFAULT);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__LOADER_NAME:
				setLoaderName(LOADER_NAME_EDEFAULT);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__PACKAGE:
				setPackage((EPackage)null);
				return;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__ECLASS:
				setEclass((EClass)null);
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
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__PID:
				return PID_EDEFAULT == null ? pid != null : !PID_EDEFAULT.equals(pid);
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__SCHEDULE_INTERVAL:
				return scheduleInterval != SCHEDULE_INTERVAL_EDEFAULT;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__QUERY_LIMIT:
				return queryLimit != QUERY_LIMIT_EDEFAULT;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__INITIAL_QUERY_SKIP:
				return initialQuerySkip != INITIAL_QUERY_SKIP_EDEFAULT;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__REPO_TARGET:
				return REPO_TARGET_EDEFAULT == null ? repoTarget != null : !REPO_TARGET_EDEFAULT.equals(repoTarget);
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__LOADER_NAME:
				return LOADER_NAME_EDEFAULT == null ? loaderName != null : !LOADER_NAME_EDEFAULT.equals(loaderName);
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__PACKAGE:
				return package_ != null;
			case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__ECLASS:
				return eclass != null;
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
				case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__ID: return PipelinePackage.PIPELINE_STEP__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (derivedFeatureID) {
				case ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__OUTPUTS: return PipelinePackage.DATA_SOURCE__OUTPUTS;
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
				case PipelinePackage.PIPELINE_STEP__ID: return ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (baseFeatureID) {
				case PipelinePackage.DATA_SOURCE__OUTPUTS: return ScheduledloaderconfigPackage.SCHEDULED_LOADER_CONFIG__OUTPUTS;
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
		result.append(", scheduleInterval: ");
		result.append(scheduleInterval);
		result.append(", queryLimit: ");
		result.append(queryLimit);
		result.append(", initialQuerySkip: ");
		result.append(initialQuerySkip);
		result.append(", repoTarget: ");
		result.append(repoTarget);
		result.append(", loaderName: ");
		result.append(loaderName);
		result.append(')');
		return result.toString();
	}

} //ScheduledLoaderConfigImpl
