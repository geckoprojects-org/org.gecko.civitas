/**
 */
package org.civitas.meter.intermediate.model.meterintermediate.impl;

import org.civitas.meter.intermediate.model.meterintermediate.*;

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
public class MeterIntermediateFactoryImpl extends EFactoryImpl implements MeterIntermediateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeterIntermediateFactory init() {
		try {
			MeterIntermediateFactory theMeterIntermediateFactory = (MeterIntermediateFactory)EPackage.Registry.INSTANCE.getEFactory(MeterIntermediatePackage.eNS_URI);
			if (theMeterIntermediateFactory != null) {
				return theMeterIntermediateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MeterIntermediateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterIntermediateFactoryImpl() {
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
			case MeterIntermediatePackage.METERING_POINT: return createMeteringPoint();
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
	public MeterIntermediatePackage getMeterIntermediatePackage() {
		return (MeterIntermediatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MeterIntermediatePackage getPackage() {
		return MeterIntermediatePackage.eINSTANCE;
	}

} //MeterIntermediateFactoryImpl
