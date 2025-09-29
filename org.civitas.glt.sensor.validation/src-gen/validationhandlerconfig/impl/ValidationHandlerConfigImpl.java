/*
 */
package validationhandlerconfig.impl;

import java.util.Collection;

import org.civitas.pipeline.DataSink;
import org.civitas.pipeline.DataSource;
import org.civitas.pipeline.Handler;
import org.civitas.pipeline.PipelinePackage;
import org.civitas.pipeline.PipelineStep;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import validationhandlerconfig.ValidationHandlerConfig;
import validationhandlerconfig.ValidationhandlerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validation Handler Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link validationhandlerconfig.impl.ValidationHandlerConfigImpl#getPid <em>Pid</em>}</li>
 *   <li>{@link validationhandlerconfig.impl.ValidationHandlerConfigImpl#getId <em>Id</em>}</li>
 *   <li>{@link validationhandlerconfig.impl.ValidationHandlerConfigImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link validationhandlerconfig.impl.ValidationHandlerConfigImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link validationhandlerconfig.impl.ValidationHandlerConfigImpl#getIncomingEClassUri <em>Incoming EClass Uri</em>}</li>
 *   <li>{@link validationhandlerconfig.impl.ValidationHandlerConfigImpl#getReferenceUriToBeValidated <em>Reference Uri To Be Validated</em>}</li>
 *   <li>{@link validationhandlerconfig.impl.ValidationHandlerConfigImpl#getAttributeUriToBeValidated <em>Attribute Uri To Be Validated</em>}</li>
 *   <li>{@link validationhandlerconfig.impl.ValidationHandlerConfigImpl#getValidationType <em>Validation Type</em>}</li>
 *   <li>{@link validationhandlerconfig.impl.ValidationHandlerConfigImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link validationhandlerconfig.impl.ValidationHandlerConfigImpl#getMinThreshold <em>Min Threshold</em>}</li>
 *   <li>{@link validationhandlerconfig.impl.ValidationHandlerConfigImpl#getMaxThreshold <em>Max Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidationHandlerConfigImpl extends MinimalEObjectImpl.Container implements ValidationHandlerConfig {
	/**
	 * The default value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected static final String PID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected String pid = PID_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSink> outputs;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSource> inputs;

	/**
	 * The cached value of the '{@link #getIncomingEClassUri() <em>Incoming EClass Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingEClassUri()
	 * @generated
	 * @ordered
	 */
	protected EClass incomingEClassUri;

	/**
	 * The cached value of the '{@link #getReferenceUriToBeValidated() <em>Reference Uri To Be Validated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceUriToBeValidated()
	 * @generated
	 * @ordered
	 */
	protected EReference referenceUriToBeValidated;

	/**
	 * The cached value of the '{@link #getAttributeUriToBeValidated() <em>Attribute Uri To Be Validated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeUriToBeValidated()
	 * @generated
	 * @ordered
	 */
	protected EAttribute attributeUriToBeValidated;

	/**
	 * The default value of the '{@link #getValidationType() <em>Validation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationType()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATION_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getValidationType() <em>Validation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationType()
	 * @generated
	 * @ordered
	 */
	protected String validationType = VALIDATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double THRESHOLD_EDEFAULT = -9999.0;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected double threshold = THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinThreshold() <em>Min Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_THRESHOLD_EDEFAULT = -9999.0;

	/**
	 * The cached value of the '{@link #getMinThreshold() <em>Min Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinThreshold()
	 * @generated
	 * @ordered
	 */
	protected double minThreshold = MIN_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxThreshold() <em>Max Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_THRESHOLD_EDEFAULT = -9999.0;

	/**
	 * The cached value of the '{@link #getMaxThreshold() <em>Max Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThreshold()
	 * @generated
	 * @ordered
	 */
	protected double maxThreshold = MAX_THRESHOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationHandlerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValidationhandlerPackage.Literals.VALIDATION_HANDLER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPid() {
		return pid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPid(String newPid) {
		String oldPid = pid;
		pid = newPid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__PID, oldPid, pid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSink> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectWithInverseResolvingEList.ManyInverse<DataSink>(DataSink.class, this, ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__OUTPUTS, PipelinePackage.DATA_SINK__INPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSource> getInputs() {
		if (inputs == null) {
			inputs = new EObjectWithInverseResolvingEList.ManyInverse<DataSource>(DataSource.class, this, ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__INPUTS, PipelinePackage.DATA_SOURCE__OUTPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncomingEClassUri() {
		if (incomingEClassUri != null && incomingEClassUri.eIsProxy()) {
			InternalEObject oldIncomingEClassUri = (InternalEObject)incomingEClassUri;
			incomingEClassUri = (EClass)eResolveProxy(oldIncomingEClassUri);
			if (incomingEClassUri != oldIncomingEClassUri) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__INCOMING_ECLASS_URI, oldIncomingEClassUri, incomingEClassUri));
			}
		}
		return incomingEClassUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetIncomingEClassUri() {
		return incomingEClassUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncomingEClassUri(EClass newIncomingEClassUri) {
		EClass oldIncomingEClassUri = incomingEClassUri;
		incomingEClassUri = newIncomingEClassUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__INCOMING_ECLASS_URI, oldIncomingEClassUri, incomingEClassUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceUriToBeValidated() {
		if (referenceUriToBeValidated != null && referenceUriToBeValidated.eIsProxy()) {
			InternalEObject oldReferenceUriToBeValidated = (InternalEObject)referenceUriToBeValidated;
			referenceUriToBeValidated = (EReference)eResolveProxy(oldReferenceUriToBeValidated);
			if (referenceUriToBeValidated != oldReferenceUriToBeValidated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__REFERENCE_URI_TO_BE_VALIDATED, oldReferenceUriToBeValidated, referenceUriToBeValidated));
			}
		}
		return referenceUriToBeValidated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetReferenceUriToBeValidated() {
		return referenceUriToBeValidated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceUriToBeValidated(EReference newReferenceUriToBeValidated) {
		EReference oldReferenceUriToBeValidated = referenceUriToBeValidated;
		referenceUriToBeValidated = newReferenceUriToBeValidated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__REFERENCE_URI_TO_BE_VALIDATED, oldReferenceUriToBeValidated, referenceUriToBeValidated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeUriToBeValidated() {
		if (attributeUriToBeValidated != null && attributeUriToBeValidated.eIsProxy()) {
			InternalEObject oldAttributeUriToBeValidated = (InternalEObject)attributeUriToBeValidated;
			attributeUriToBeValidated = (EAttribute)eResolveProxy(oldAttributeUriToBeValidated);
			if (attributeUriToBeValidated != oldAttributeUriToBeValidated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__ATTRIBUTE_URI_TO_BE_VALIDATED, oldAttributeUriToBeValidated, attributeUriToBeValidated));
			}
		}
		return attributeUriToBeValidated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetAttributeUriToBeValidated() {
		return attributeUriToBeValidated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeUriToBeValidated(EAttribute newAttributeUriToBeValidated) {
		EAttribute oldAttributeUriToBeValidated = attributeUriToBeValidated;
		attributeUriToBeValidated = newAttributeUriToBeValidated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__ATTRIBUTE_URI_TO_BE_VALIDATED, oldAttributeUriToBeValidated, attributeUriToBeValidated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidationType() {
		return validationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidationType(String newValidationType) {
		String oldValidationType = validationType;
		validationType = newValidationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__VALIDATION_TYPE, oldValidationType, validationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreshold(double newThreshold) {
		double oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinThreshold() {
		return minThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinThreshold(double newMinThreshold) {
		double oldMinThreshold = minThreshold;
		minThreshold = newMinThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__MIN_THRESHOLD, oldMinThreshold, minThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxThreshold() {
		return maxThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxThreshold(double newMaxThreshold) {
		double oldMaxThreshold = maxThreshold;
		maxThreshold = newMaxThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__MAX_THRESHOLD, oldMaxThreshold, maxThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__OUTPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputs()).basicAdd(otherEnd, msgs);
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__INPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__PID:
				return getPid();
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__ID:
				return getId();
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__OUTPUTS:
				return getOutputs();
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__INPUTS:
				return getInputs();
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__INCOMING_ECLASS_URI:
				if (resolve) return getIncomingEClassUri();
				return basicGetIncomingEClassUri();
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__REFERENCE_URI_TO_BE_VALIDATED:
				if (resolve) return getReferenceUriToBeValidated();
				return basicGetReferenceUriToBeValidated();
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__ATTRIBUTE_URI_TO_BE_VALIDATED:
				if (resolve) return getAttributeUriToBeValidated();
				return basicGetAttributeUriToBeValidated();
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__VALIDATION_TYPE:
				return getValidationType();
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__THRESHOLD:
				return getThreshold();
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__MIN_THRESHOLD:
				return getMinThreshold();
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__MAX_THRESHOLD:
				return getMaxThreshold();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__PID:
				setPid((String)newValue);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__ID:
				setId((String)newValue);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends DataSink>)newValue);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends DataSource>)newValue);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__INCOMING_ECLASS_URI:
				setIncomingEClassUri((EClass)newValue);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__REFERENCE_URI_TO_BE_VALIDATED:
				setReferenceUriToBeValidated((EReference)newValue);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__ATTRIBUTE_URI_TO_BE_VALIDATED:
				setAttributeUriToBeValidated((EAttribute)newValue);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__VALIDATION_TYPE:
				setValidationType((String)newValue);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__THRESHOLD:
				setThreshold((Double)newValue);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__MIN_THRESHOLD:
				setMinThreshold((Double)newValue);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__MAX_THRESHOLD:
				setMaxThreshold((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__PID:
				setPid(PID_EDEFAULT);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__ID:
				setId(ID_EDEFAULT);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__OUTPUTS:
				getOutputs().clear();
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__INPUTS:
				getInputs().clear();
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__INCOMING_ECLASS_URI:
				setIncomingEClassUri((EClass)null);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__REFERENCE_URI_TO_BE_VALIDATED:
				setReferenceUriToBeValidated((EReference)null);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__ATTRIBUTE_URI_TO_BE_VALIDATED:
				setAttributeUriToBeValidated((EAttribute)null);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__VALIDATION_TYPE:
				setValidationType(VALIDATION_TYPE_EDEFAULT);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__THRESHOLD:
				setThreshold(THRESHOLD_EDEFAULT);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__MIN_THRESHOLD:
				setMinThreshold(MIN_THRESHOLD_EDEFAULT);
				return;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__MAX_THRESHOLD:
				setMaxThreshold(MAX_THRESHOLD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__PID:
				return PID_EDEFAULT == null ? pid != null : !PID_EDEFAULT.equals(pid);
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__INCOMING_ECLASS_URI:
				return incomingEClassUri != null;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__REFERENCE_URI_TO_BE_VALIDATED:
				return referenceUriToBeValidated != null;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__ATTRIBUTE_URI_TO_BE_VALIDATED:
				return attributeUriToBeValidated != null;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__VALIDATION_TYPE:
				return VALIDATION_TYPE_EDEFAULT == null ? validationType != null : !VALIDATION_TYPE_EDEFAULT.equals(validationType);
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__THRESHOLD:
				return threshold != THRESHOLD_EDEFAULT;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__MIN_THRESHOLD:
				return minThreshold != MIN_THRESHOLD_EDEFAULT;
			case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__MAX_THRESHOLD:
				return maxThreshold != MAX_THRESHOLD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PipelineStep.class) {
			switch (derivedFeatureID) {
				case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__ID: return PipelinePackage.PIPELINE_STEP__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (derivedFeatureID) {
				case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__OUTPUTS: return PipelinePackage.DATA_SOURCE__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == DataSink.class) {
			switch (derivedFeatureID) {
				case ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__INPUTS: return PipelinePackage.DATA_SINK__INPUTS;
				default: return -1;
			}
		}
		if (baseClass == Handler.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PipelineStep.class) {
			switch (baseFeatureID) {
				case PipelinePackage.PIPELINE_STEP__ID: return ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__ID;
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (baseFeatureID) {
				case PipelinePackage.DATA_SOURCE__OUTPUTS: return ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == DataSink.class) {
			switch (baseFeatureID) {
				case PipelinePackage.DATA_SINK__INPUTS: return ValidationhandlerPackage.VALIDATION_HANDLER_CONFIG__INPUTS;
				default: return -1;
			}
		}
		if (baseClass == Handler.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (pid: ");
		result.append(pid);
		result.append(", id: ");
		result.append(id);
		result.append(", validationType: ");
		result.append(validationType);
		result.append(", threshold: ");
		result.append(threshold);
		result.append(", minThreshold: ");
		result.append(minThreshold);
		result.append(", maxThreshold: ");
		result.append(maxThreshold);
		result.append(')');
		return result.toString();
	}

} //ValidationHandlerConfigImpl
