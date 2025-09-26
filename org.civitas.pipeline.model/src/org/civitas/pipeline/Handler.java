/*
 */
package org.civitas.pipeline;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.civitas.pipeline.Handler#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.civitas.pipeline.Handler#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see org.civitas.pipeline.PipelinePackage#getHandler()
 * @model
 * @generated
 */
@ProviderType
public interface Handler extends PipelineStep {
	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link org.civitas.pipeline.PipelineStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see org.civitas.pipeline.PipelinePackage#getHandler_Outputs()
	 * @model required="true"
	 * @generated
	 */
	EList<PipelineStep> getOutputs();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link org.civitas.pipeline.PipelineStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see org.civitas.pipeline.PipelinePackage#getHandler_Inputs()
	 * @model required="true"
	 *        extendedMetaData="osgi.config.property='event.topics'"
	 * @generated
	 */
	EList<PipelineStep> getInputs();

} // Handler
