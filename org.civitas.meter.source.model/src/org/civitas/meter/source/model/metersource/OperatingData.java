/*
 */
package org.civitas.meter.source.model.metersource;

import java.time.Instant;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The operating data for a plant is exported daily from the source system as a CSV file and uploaded to an FTP server. The plant IDs in these CSV files are not prefixed with a p.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.meter.source.model.metersource.OperatingData#getId <em>Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.OperatingData#getPlantId <em>Plant Id</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.OperatingData#getOperatingHours <em>Operating Hours</em>}</li>
 *   <li>{@link org.civitas.meter.source.model.metersource.OperatingData#getStarts <em>Starts</em>}</li>
 * </ul>
 *
 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getOperatingData()
 * @model
 * @generated
 */
@ProviderType
public interface OperatingData extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getOperatingData_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.OperatingData#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Plant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a reference to the plantId of the BasicData but without the prefix "p".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plant Id</em>' attribute.
	 * @see #setPlantId(String)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getOperatingData_PlantId()
	 * @model extendedMetaData="name='plant_id'"
	 * @generated
	 */
	String getPlantId();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.OperatingData#getPlantId <em>Plant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Id</em>' attribute.
	 * @see #getPlantId()
	 * @generated
	 */
	void setPlantId(String value);

	/**
	 * Returns the value of the '<em><b>Operating Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Hours</em>' attribute.
	 * @see #setOperatingHours(Integer)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getOperatingData_OperatingHours()
	 * @model dataType="org.civitas.units.model.units.Hours"
	 * @generated
	 */
	Integer getOperatingHours();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.OperatingData#getOperatingHours <em>Operating Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Hours</em>' attribute.
	 * @see #getOperatingHours()
	 * @generated
	 */
	void setOperatingHours(Integer value);

	/**
	 * Returns the value of the '<em><b>Starts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starts</em>' attribute.
	 * @see #setStarts(Instant)
	 * @see org.civitas.meter.source.model.metersource.MeterSourcePackage#getOperatingData_Starts()
	 * @model dataType="org.civitas.units.model.units.EInstant"
	 * @generated
	 */
	Instant getStarts();

	/**
	 * Sets the value of the '{@link org.civitas.meter.source.model.metersource.OperatingData#getStarts <em>Starts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starts</em>' attribute.
	 * @see #getStarts()
	 * @generated
	 */
	void setStarts(Instant value);

} // OperatingData
