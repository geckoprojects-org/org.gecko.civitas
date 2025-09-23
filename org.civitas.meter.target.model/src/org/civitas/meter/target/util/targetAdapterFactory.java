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
package org.civitas.meter.target.util;

import org.civitas.meter.target.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.civitas.meter.target.targetPackage
 * @generated
 */
public class targetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static targetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public targetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = targetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected targetSwitch<Adapter> modelSwitch =
		new targetSwitch<Adapter>() {
			@Override
			public Adapter casePlant(Plant object) {
				return createPlantAdapter();
			}
			@Override
			public Adapter caseNet(Net object) {
				return createNetAdapter();
			}
			@Override
			public Adapter caseParts(Parts object) {
				return createPartsAdapter();
			}
			@Override
			public Adapter caseOperatingData(OperatingData object) {
				return createOperatingDataAdapter();
			}
			@Override
			public Adapter caseMeteringPoint(MeteringPoint object) {
				return createMeteringPointAdapter();
			}
			@Override
			public Adapter caseMeter(Meter object) {
				return createMeterAdapter();
			}
			@Override
			public Adapter caseMeterReading(MeterReading object) {
				return createMeterReadingAdapter();
			}
			@Override
			public Adapter caseMeterHistory(MeterHistory object) {
				return createMeterHistoryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.target.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.target.Plant
	 * @generated
	 */
	public Adapter createPlantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.target.Net <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.target.Net
	 * @generated
	 */
	public Adapter createNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.target.Parts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.target.Parts
	 * @generated
	 */
	public Adapter createPartsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.target.OperatingData <em>Operating Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.target.OperatingData
	 * @generated
	 */
	public Adapter createOperatingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.target.MeteringPoint <em>Metering Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.target.MeteringPoint
	 * @generated
	 */
	public Adapter createMeteringPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.target.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.target.Meter
	 * @generated
	 */
	public Adapter createMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.target.MeterReading <em>Meter Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.target.MeterReading
	 * @generated
	 */
	public Adapter createMeterReadingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.target.MeterHistory <em>Meter History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.target.MeterHistory
	 * @generated
	 */
	public Adapter createMeterHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //targetAdapterFactory
