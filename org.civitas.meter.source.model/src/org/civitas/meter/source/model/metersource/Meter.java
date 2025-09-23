/*
 */
package org.civitas.meter.source.model.metersource;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.source.model.metersource.Meter#getPlantId <em>Plant Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.Meter#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getMeter()
 * @model
 * @generated
 */
@ProviderType
public interface Meter extends EObject {
	/**
	 * Returns the value of the '<em><b>Plant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a reference to the plantId of the BasicData but without the prefix "p".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plant Id</em>' attribute.
	 * @see #setPlantId(String)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getMeter_PlantId()
	 * @model extendedMetaData="name='plant_id'"
	 * @generated
	 */
	String getPlantId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.Meter#getPlantId <em>Plant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Id</em>' attribute.
	 * @see #getPlantId()
	 * @generated
	 */
	void setPlantId(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getMeter_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.Meter#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Meter
