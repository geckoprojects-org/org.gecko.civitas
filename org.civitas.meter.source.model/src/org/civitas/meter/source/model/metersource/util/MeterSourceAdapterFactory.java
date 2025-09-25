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
package org.civitas.meter.source.model.metersource.util;

import org.civitas.meter.source.model.metersource.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage
 * @generated
 */
public class MeterSourceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MeterSourcePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterSourceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MeterSourcePackage.eINSTANCE;
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
	protected MeterSourceSwitch<Adapter> modelSwitch =
		new MeterSourceSwitch<Adapter>() {
			@Override
			public Adapter caseBasicData(BasicData object) {
				return createBasicDataAdapter();
			}
			@Override
			public Adapter caseOperatingData(OperatingData object) {
				return createOperatingDataAdapter();
			}
			@Override
			public Adapter caseMeter(Meter object) {
				return createMeterAdapter();
			}
			@Override
			public Adapter caseReading(Reading object) {
				return createReadingAdapter();
			}
			@Override
			public Adapter caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			@Override
			public Adapter caseIntermediatePlant(IntermediatePlant object) {
				return createIntermediatePlantAdapter();
			}
			@Override
			public Adapter caseIntermediateMeteringPoint(IntermediateMeteringPoint object) {
				return createIntermediateMeteringPointAdapter();
			}
			@Override
			public Adapter caseRemoteReading(RemoteReading object) {
				return createRemoteReadingAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.source.model.metersource.BasicData <em>Basic Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.source.model.metersource.BasicData
	 * @generated
	 */
	public Adapter createBasicDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.source.model.metersource.OperatingData <em>Operating Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.source.model.metersource.OperatingData
	 * @generated
	 */
	public Adapter createOperatingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.source.model.metersource.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.source.model.metersource.Meter
	 * @generated
	 */
	public Adapter createMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.source.model.metersource.Reading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.source.model.metersource.Reading
	 * @generated
	 */
	public Adapter createReadingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.source.model.metersource.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.source.model.metersource.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.source.model.metersource.IntermediatePlant <em>Intermediate Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.source.model.metersource.IntermediatePlant
	 * @generated
	 */
	public Adapter createIntermediatePlantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.source.model.metersource.IntermediateMeteringPoint <em>Intermediate Metering Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.source.model.metersource.IntermediateMeteringPoint
	 * @generated
	 */
	public Adapter createIntermediateMeteringPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.civitas.meter.source.model.metersource.RemoteReading <em>Remote Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.civitas.meter.source.model.metersource.RemoteReading
	 * @generated
	 */
	public Adapter createRemoteReadingAdapter() {
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

} //MeterSourceAdapterFactory
