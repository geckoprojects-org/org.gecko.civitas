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
package org.civitas.pipeline;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.civitas.pipeline.PipelineFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel complianceLevel='17.0' oSGiCompatible='true' basePackage='org.civitas' resource='XMI' copyrightText='Copyright (c) 2012 - 2025 Data In Motion and others.\nAll rights reserved. \n\nThis program and the accompanying materials are made\navailable under the terms of the Eclipse Public License 2.0\nwhich is available at https://www.eclipse.org/legal/epl-2.0/\n\nSPDX-License-Identifier: EPL-2.0\n\nContributors:\n    Data In Motion - initial API and implementation'"
 * @generated
 */
@ProviderType
@EPackage(uri = PipelinePackage.eNS_URI, genModel = "/model/pipeline.genmodel", genModelSourceLocations = {"model/pipeline.genmodel","org.civitas.pipeline.model/model/pipeline.genmodel"}, ecore="/model/pipeline.ecore", ecoreSourceLocations="/model/pipeline.ecore")
public interface PipelinePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pipeline";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://civitas.org/pipline/model/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pipeline";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PipelinePackage eINSTANCE = org.civitas.pipeline.impl.PipelinePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.civitas.pipeline.impl.PipelineStepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.pipeline.impl.PipelineStepImpl
	 * @see org.civitas.pipeline.impl.PipelinePackageImpl#getPipelineStep()
	 * @generated
	 */
	int PIPELINE_STEP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_STEP__ID = 0;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_STEP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.civitas.pipeline.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.pipeline.impl.DataSourceImpl
	 * @see org.civitas.pipeline.impl.PipelinePackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__ID = PIPELINE_STEP__ID;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__OUTPUTS = PIPELINE_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = PIPELINE_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = PIPELINE_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.civitas.pipeline.impl.DataSinkImpl <em>Data Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.pipeline.impl.DataSinkImpl
	 * @see org.civitas.pipeline.impl.PipelinePackageImpl#getDataSink()
	 * @generated
	 */
	int DATA_SINK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK__ID = PIPELINE_STEP__ID;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK__INPUTS = PIPELINE_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK_FEATURE_COUNT = PIPELINE_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK_OPERATION_COUNT = PIPELINE_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.civitas.pipeline.impl.HandlerImpl <em>Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.pipeline.impl.HandlerImpl
	 * @see org.civitas.pipeline.impl.PipelinePackageImpl#getHandler()
	 * @generated
	 */
	int HANDLER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__ID = PIPELINE_STEP__ID;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__OUTPUTS = PIPELINE_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__INPUTS = PIPELINE_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_FEATURE_COUNT = PIPELINE_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_OPERATION_COUNT = PIPELINE_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.civitas.pipeline.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.civitas.pipeline.impl.PipelineImpl
	 * @see org.civitas.pipeline.impl.PipelinePackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ID = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__STEPS = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__COMPONENTS = 2;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.civitas.pipeline.PipelineStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.civitas.pipeline.PipelineStep
	 * @generated
	 */
	EClass getPipelineStep();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.pipeline.PipelineStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.civitas.pipeline.PipelineStep#getId()
	 * @see #getPipelineStep()
	 * @generated
	 */
	EAttribute getPipelineStep_Id();

	/**
	 * Returns the meta object for class '{@link org.civitas.pipeline.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see org.civitas.pipeline.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the reference list '{@link org.civitas.pipeline.DataSource#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see org.civitas.pipeline.DataSource#getOutputs()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Outputs();

	/**
	 * Returns the meta object for class '{@link org.civitas.pipeline.DataSink <em>Data Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Sink</em>'.
	 * @see org.civitas.pipeline.DataSink
	 * @generated
	 */
	EClass getDataSink();

	/**
	 * Returns the meta object for the reference list '{@link org.civitas.pipeline.DataSink#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see org.civitas.pipeline.DataSink#getInputs()
	 * @see #getDataSink()
	 * @generated
	 */
	EReference getDataSink_Inputs();

	/**
	 * Returns the meta object for class '{@link org.civitas.pipeline.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler</em>'.
	 * @see org.civitas.pipeline.Handler
	 * @generated
	 */
	EClass getHandler();

	/**
	 * Returns the meta object for class '{@link org.civitas.pipeline.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see org.civitas.pipeline.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the attribute '{@link org.civitas.pipeline.Pipeline#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.civitas.pipeline.Pipeline#getId()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.civitas.pipeline.Pipeline#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see org.civitas.pipeline.Pipeline#getSteps()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.civitas.pipeline.Pipeline#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.civitas.pipeline.Pipeline#getComponents()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Components();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PipelineFactory getPipelineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.civitas.pipeline.impl.PipelineStepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.pipeline.impl.PipelineStepImpl
		 * @see org.civitas.pipeline.impl.PipelinePackageImpl#getPipelineStep()
		 * @generated
		 */
		EClass PIPELINE_STEP = eINSTANCE.getPipelineStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE_STEP__ID = eINSTANCE.getPipelineStep_Id();

		/**
		 * The meta object literal for the '{@link org.civitas.pipeline.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.pipeline.impl.DataSourceImpl
		 * @see org.civitas.pipeline.impl.PipelinePackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__OUTPUTS = eINSTANCE.getDataSource_Outputs();

		/**
		 * The meta object literal for the '{@link org.civitas.pipeline.impl.DataSinkImpl <em>Data Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.pipeline.impl.DataSinkImpl
		 * @see org.civitas.pipeline.impl.PipelinePackageImpl#getDataSink()
		 * @generated
		 */
		EClass DATA_SINK = eINSTANCE.getDataSink();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SINK__INPUTS = eINSTANCE.getDataSink_Inputs();

		/**
		 * The meta object literal for the '{@link org.civitas.pipeline.impl.HandlerImpl <em>Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.pipeline.impl.HandlerImpl
		 * @see org.civitas.pipeline.impl.PipelinePackageImpl#getHandler()
		 * @generated
		 */
		EClass HANDLER = eINSTANCE.getHandler();

		/**
		 * The meta object literal for the '{@link org.civitas.pipeline.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.civitas.pipeline.impl.PipelineImpl
		 * @see org.civitas.pipeline.impl.PipelinePackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__ID = eINSTANCE.getPipeline_Id();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__STEPS = eINSTANCE.getPipeline_Steps();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__COMPONENTS = eINSTANCE.getPipeline_Components();

	}

} //PipelinePackage
