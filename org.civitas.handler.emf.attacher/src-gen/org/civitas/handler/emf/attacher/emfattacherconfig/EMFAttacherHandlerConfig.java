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
package org.civitas.handler.emf.attacher.emfattacherconfig;

import org.civitas.osgi.component.Configuration;

import org.civitas.pipeline.Handler;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Attacher Handler Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration for EMF Attacher Handler that processes EMF objects and attaches them to target objects
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getRepoTarget <em>Repo Target</em>}</li>
 *   <li>{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getTargetEClassUri <em>Target EClass Uri</em>}</li>
 *   <li>{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getIncomingEClassUri <em>Incoming EClass Uri</em>}</li>
 *   <li>{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getTargetReferenceUri <em>Target Reference Uri</em>}</li>
 *   <li>{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getForeignKeyFeatureUri <em>Foreign Key Feature Uri</em>}</li>
 *   <li>{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getIncomingReferenceUri <em>Incoming Reference Uri</em>}</li>
 * </ul>
 *
 * @see org.civitas.handler.emf.attacher.emfattacherconfig.EmfattacherconfigPackage#getEMFAttacherHandlerConfig()
 * @model
 * @generated
 */
@ProviderType
public interface EMFAttacherHandlerConfig extends Configuration, Handler {
	/**
	 * Returns the value of the '<em><b>Repo Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EMF Repository target filter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repo Target</em>' attribute.
	 * @see #setRepoTarget(String)
	 * @see org.civitas.handler.emf.attacher.emfattacherconfig.EmfattacherconfigPackage#getEMFAttacherHandlerConfig_RepoTarget()
	 * @model required="true"
	 *        extendedMetaData="name='repo.target'"
	 * @generated
	 */
	String getRepoTarget();

	/**
	 * Sets the value of the '{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getRepoTarget <em>Repo Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repo Target</em>' attribute.
	 * @see #getRepoTarget()
	 * @generated
	 */
	void setRepoTarget(String value);

	/**
	 * Returns the value of the '<em><b>Target EClass Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URI of the target EClass where objects will be attached (e.g., http://...#//Plant)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target EClass Uri</em>' reference.
	 * @see #setTargetEClassUri(EClass)
	 * @see org.civitas.handler.emf.attacher.emfattacherconfig.EmfattacherconfigPackage#getEMFAttacherHandlerConfig_TargetEClassUri()
	 * @model extendedMetaData="name='target.eclassuri'"
	 * @generated
	 */
	EClass getTargetEClassUri();

	/**
	 * Sets the value of the '{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getTargetEClassUri <em>Target EClass Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target EClass Uri</em>' reference.
	 * @see #getTargetEClassUri()
	 * @generated
	 */
	void setTargetEClassUri(EClass value);

	/**
	 * Returns the value of the '<em><b>Incoming EClass Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URI of the incoming EObject EClass (e.g., http://...#//Meter)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming EClass Uri</em>' reference.
	 * @see #setIncomingEClassUri(EClass)
	 * @see org.civitas.handler.emf.attacher.emfattacherconfig.EmfattacherconfigPackage#getEMFAttacherHandlerConfig_IncomingEClassUri()
	 * @model extendedMetaData="name='incoming.eclassuri'"
	 * @generated
	 */
	EClass getIncomingEClassUri();

	/**
	 * Sets the value of the '{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getIncomingEClassUri <em>Incoming EClass Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming EClass Uri</em>' reference.
	 * @see #getIncomingEClassUri()
	 * @generated
	 */
	void setIncomingEClassUri(EClass value);

	/**
	 * Returns the value of the '<em><b>Target Reference Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URI of the target EReference where to put the incoming EObject (e.g., Plant/meters)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Reference Uri</em>' reference.
	 * @see #setTargetReferenceUri(EReference)
	 * @see org.civitas.handler.emf.attacher.emfattacherconfig.EmfattacherconfigPackage#getEMFAttacherHandlerConfig_TargetReferenceUri()
	 * @model extendedMetaData="name='target.reference.uri'"
	 * @generated
	 */
	EReference getTargetReferenceUri();

	/**
	 * Sets the value of the '{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getTargetReferenceUri <em>Target Reference Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Reference Uri</em>' reference.
	 * @see #getTargetReferenceUri()
	 * @generated
	 */
	void setTargetReferenceUri(EReference value);

	/**
	 * Returns the value of the '<em><b>Foreign Key Feature Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URI of the EStructuralFeature from the incoming EObject used as identifier for the target EObject (e.g., http://...#//Meter/plantId)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Foreign Key Feature Uri</em>' reference.
	 * @see #setForeignKeyFeatureUri(EStructuralFeature)
	 * @see org.civitas.handler.emf.attacher.emfattacherconfig.EmfattacherconfigPackage#getEMFAttacherHandlerConfig_ForeignKeyFeatureUri()
	 * @model extendedMetaData="name='foreignKeyFeature.uri'"
	 * @generated
	 */
	EStructuralFeature getForeignKeyFeatureUri();

	/**
	 * Sets the value of the '{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getForeignKeyFeatureUri <em>Foreign Key Feature Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key Feature Uri</em>' reference.
	 * @see #getForeignKeyFeatureUri()
	 * @generated
	 */
	void setForeignKeyFeatureUri(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Incoming Reference Uri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URI of the incoming EReference, which has to be attached instead of the whole incoming EObject
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Reference Uri</em>' reference.
	 * @see #setIncomingReferenceUri(EReference)
	 * @see org.civitas.handler.emf.attacher.emfattacherconfig.EmfattacherconfigPackage#getEMFAttacherHandlerConfig_IncomingReferenceUri()
	 * @model extendedMetaData="name='incoming.referenceuri'"
	 * @generated
	 */
	EReference getIncomingReferenceUri();

	/**
	 * Sets the value of the '{@link org.civitas.handler.emf.attacher.emfattacherconfig.EMFAttacherHandlerConfig#getIncomingReferenceUri <em>Incoming Reference Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Reference Uri</em>' reference.
	 * @see #getIncomingReferenceUri()
	 * @generated
	 */
	void setIncomingReferenceUri(EReference value);

} // EMFAttacherHandlerConfig
