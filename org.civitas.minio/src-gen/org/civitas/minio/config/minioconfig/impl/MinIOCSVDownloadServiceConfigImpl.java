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
package org.civitas.minio.config.minioconfig.impl;

import java.util.Collection;

import org.civitas.minio.config.minioconfig.MinIOCSVDownloadServiceConfig;
import org.civitas.minio.config.minioconfig.MinIOClientConfig;
import org.civitas.minio.config.minioconfig.MinioconfigPackage;

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
 * An implementation of the model object '<em><b>Min IOCSV Download Service Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.minio.config.minioconfig.impl.MinIOCSVDownloadServiceConfigImpl#getPid <em>Pid</em>}</li>
 *   <li>{@link org.civitas.minio.config.minioconfig.impl.MinIOCSVDownloadServiceConfigImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.minio.config.minioconfig.impl.MinIOCSVDownloadServiceConfigImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.civitas.minio.config.minioconfig.impl.MinIOCSVDownloadServiceConfigImpl#getBucketname <em>Bucketname</em>}</li>
 *   <li>{@link org.civitas.minio.config.minioconfig.impl.MinIOCSVDownloadServiceConfigImpl#getCron <em>Cron</em>}</li>
 *   <li>{@link org.civitas.minio.config.minioconfig.impl.MinIOCSVDownloadServiceConfigImpl#getClientTarget <em>Client Target</em>}</li>
 *   <li>{@link org.civitas.minio.config.minioconfig.impl.MinIOCSVDownloadServiceConfigImpl#getEClass <em>EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinIOCSVDownloadServiceConfigImpl extends MinimalEObjectImpl.Container implements MinIOCSVDownloadServiceConfig {
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
	 * The default value of the '{@link #getBucketname() <em>Bucketname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketname()
	 * @generated
	 * @ordered
	 */
	protected static final String BUCKETNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketname() <em>Bucketname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketname()
	 * @generated
	 * @ordered
	 */
	protected String bucketname = BUCKETNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCron() <em>Cron</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCron()
	 * @generated
	 * @ordered
	 */
	protected static final String CRON_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCron() <em>Cron</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCron()
	 * @generated
	 * @ordered
	 */
	protected String cron = CRON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClientTarget() <em>Client Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientTarget()
	 * @generated
	 * @ordered
	 */
	protected MinIOClientConfig clientTarget;

	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinIOCSVDownloadServiceConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinioconfigPackage.Literals.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__PID, oldPid, pid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSink> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectWithInverseResolvingEList.ManyInverse<DataSink>(DataSink.class, this, MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__OUTPUTS, PipelinePackage.DATA_SINK__INPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBucketname() {
		return bucketname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBucketname(String newBucketname) {
		String oldBucketname = bucketname;
		bucketname = newBucketname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__BUCKETNAME, oldBucketname, bucketname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCron() {
		return cron;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCron(String newCron) {
		String oldCron = cron;
		cron = newCron;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CRON, oldCron, cron));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinIOClientConfig getClientTarget() {
		if (clientTarget != null && clientTarget.eIsProxy()) {
			InternalEObject oldClientTarget = (InternalEObject)clientTarget;
			clientTarget = (MinIOClientConfig)eResolveProxy(oldClientTarget);
			if (clientTarget != oldClientTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CLIENT_TARGET, oldClientTarget, clientTarget));
			}
		}
		return clientTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinIOClientConfig basicGetClientTarget() {
		return clientTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientTarget(MinIOClientConfig newClientTarget) {
		MinIOClientConfig oldClientTarget = clientTarget;
		clientTarget = newClientTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CLIENT_TARGET, oldClientTarget, clientTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		if (eClass != null && eClass.eIsProxy()) {
			InternalEObject oldEClass = (InternalEObject)eClass;
			eClass = (EClass)eResolveProxy(oldEClass);
			if (eClass != oldEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ECLASS, oldEClass, eClass));
			}
		}
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEClass(EClass newEClass) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ECLASS, oldEClass, eClass));
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
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__OUTPUTS:
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
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__OUTPUTS:
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
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__PID:
				return getPid();
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ID:
				return getId();
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__OUTPUTS:
				return getOutputs();
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__BUCKETNAME:
				return getBucketname();
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CRON:
				return getCron();
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CLIENT_TARGET:
				if (resolve) return getClientTarget();
				return basicGetClientTarget();
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ECLASS:
				if (resolve) return getEClass();
				return basicGetEClass();
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
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__PID:
				setPid((String)newValue);
				return;
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ID:
				setId((String)newValue);
				return;
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends DataSink>)newValue);
				return;
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__BUCKETNAME:
				setBucketname((String)newValue);
				return;
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CRON:
				setCron((String)newValue);
				return;
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CLIENT_TARGET:
				setClientTarget((MinIOClientConfig)newValue);
				return;
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ECLASS:
				setEClass((EClass)newValue);
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
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__PID:
				setPid(PID_EDEFAULT);
				return;
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ID:
				setId(ID_EDEFAULT);
				return;
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__OUTPUTS:
				getOutputs().clear();
				return;
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__BUCKETNAME:
				setBucketname(BUCKETNAME_EDEFAULT);
				return;
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CRON:
				setCron(CRON_EDEFAULT);
				return;
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CLIENT_TARGET:
				setClientTarget((MinIOClientConfig)null);
				return;
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ECLASS:
				setEClass((EClass)null);
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
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__PID:
				return PID_EDEFAULT == null ? pid != null : !PID_EDEFAULT.equals(pid);
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__BUCKETNAME:
				return BUCKETNAME_EDEFAULT == null ? bucketname != null : !BUCKETNAME_EDEFAULT.equals(bucketname);
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CRON:
				return CRON_EDEFAULT == null ? cron != null : !CRON_EDEFAULT.equals(cron);
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__CLIENT_TARGET:
				return clientTarget != null;
			case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ECLASS:
				return eClass != null;
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
				case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ID: return PipelinePackage.PIPELINE_STEP__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (derivedFeatureID) {
				case MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__OUTPUTS: return PipelinePackage.DATA_SOURCE__OUTPUTS;
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
				case PipelinePackage.PIPELINE_STEP__ID: return MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (baseFeatureID) {
				case PipelinePackage.DATA_SOURCE__OUTPUTS: return MinioconfigPackage.MIN_IOCSV_DOWNLOAD_SERVICE_CONFIG__OUTPUTS;
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
		result.append(", bucketname: ");
		result.append(bucketname);
		result.append(", cron: ");
		result.append(cron);
		result.append(')');
		return result.toString();
	}

} //MinIOCSVDownloadServiceConfigImpl
