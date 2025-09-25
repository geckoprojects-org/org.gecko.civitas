/**
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
package org.civitas.meter.source.model.metersource.impl;

import org.civitas.meter.source.model.metersource.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeterSourceFactoryImpl extends EFactoryImpl implements MeterSourceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeterSourceFactory init() {
		try {
			MeterSourceFactory theMeterSourceFactory = (MeterSourceFactory)EPackage.Registry.INSTANCE.getEFactory(MeterSourcePackage.eNS_URI);
			if (theMeterSourceFactory != null) {
				return theMeterSourceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MeterSourceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterSourceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MeterSourcePackage.BASIC_DATA: return createBasicData();
			case MeterSourcePackage.OPERATING_DATA: return createOperatingData();
			case MeterSourcePackage.METER: return createMeter();
			case MeterSourcePackage.READING: return createReading();
			case MeterSourcePackage.CUSTOMER: return createCustomer();
			case MeterSourcePackage.INTERMEDIATE_PLANT: return createIntermediatePlant();
			case MeterSourcePackage.INTERMEDIATE_METERING_POINT: return createIntermediateMeteringPoint();
			case MeterSourcePackage.REMOTE_READING: return createRemoteReading();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicData createBasicData() {
		BasicDataImpl basicData = new BasicDataImpl();
		return basicData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatingData createOperatingData() {
		OperatingDataImpl operatingData = new OperatingDataImpl();
		return operatingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meter createMeter() {
		MeterImpl meter = new MeterImpl();
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reading createReading() {
		ReadingImpl reading = new ReadingImpl();
		return reading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermediatePlant createIntermediatePlant() {
		IntermediatePlantImpl intermediatePlant = new IntermediatePlantImpl();
		return intermediatePlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermediateMeteringPoint createIntermediateMeteringPoint() {
		IntermediateMeteringPointImpl intermediateMeteringPoint = new IntermediateMeteringPointImpl();
		return intermediateMeteringPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoteReading createRemoteReading() {
		RemoteReadingImpl remoteReading = new RemoteReadingImpl();
		return remoteReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeterSourcePackage getMeterSourcePackage() {
		return (MeterSourcePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MeterSourcePackage getPackage() {
		return MeterSourcePackage.eINSTANCE;
	}

} //MeterSourceFactoryImpl
