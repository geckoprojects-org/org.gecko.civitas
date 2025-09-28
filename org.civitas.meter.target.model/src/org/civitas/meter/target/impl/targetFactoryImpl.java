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
package org.civitas.meter.target.impl;

import org.civitas.meter.target.*;

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
public class targetFactoryImpl extends EFactoryImpl implements targetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static targetFactory init() {
		try {
			targetFactory thetargetFactory = (targetFactory)EPackage.Registry.INSTANCE.getEFactory(targetPackage.eNS_URI);
			if (thetargetFactory != null) {
				return thetargetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new targetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public targetFactoryImpl() {
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
			case targetPackage.PLANT: return createPlant();
			case targetPackage.NET: return createNet();
			case targetPackage.PARTS: return createParts();
			case targetPackage.OPERATING_DATA: return createOperatingData();
			case targetPackage.METERING_POINT: return createMeteringPoint();
			case targetPackage.METER: return createMeter();
			case targetPackage.METER_READING: return createMeterReading();
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
	public Plant createPlant() {
		PlantImpl plant = new PlantImpl();
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Net createNet() {
		NetImpl net = new NetImpl();
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parts createParts() {
		PartsImpl parts = new PartsImpl();
		return parts;
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
	public MeteringPoint createMeteringPoint() {
		MeteringPointImpl meteringPoint = new MeteringPointImpl();
		return meteringPoint;
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
	public MeterReading createMeterReading() {
		MeterReadingImpl meterReading = new MeterReadingImpl();
		return meterReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public targetPackage gettargetPackage() {
		return (targetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static targetPackage getPackage() {
		return targetPackage.eINSTANCE;
	}

} //targetFactoryImpl
