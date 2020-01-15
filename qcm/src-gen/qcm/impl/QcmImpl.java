/**
 */
package qcm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qcm.Qcm;
import qcm.QcmPackage;
import qcm.Question;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qcm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qcm.impl.QcmImpl#getDomaine <em>Domaine</em>}</li>
 *   <li>{@link qcm.impl.QcmImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QcmImpl extends MinimalEObjectImpl.Container implements Qcm {
	/**
	 * The default value of the '{@link #getDomaine() <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaine()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomaine() <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaine()
	 * @generated
	 * @ordered
	 */
	protected String domaine = DOMAINE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> question;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QcmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QcmPackage.Literals.QCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomaine() {
		return domaine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomaine(String newDomaine) {
		String oldDomaine = domaine;
		domaine = newDomaine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.QCM__DOMAINE, oldDomaine, domaine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getQuestion() {
		if (question == null) {
			question = new EObjectContainmentEList<Question>(Question.class, this, QcmPackage.QCM__QUESTION);
		}
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QcmPackage.QCM__QUESTION:
			return ((InternalEList<?>) getQuestion()).basicRemove(otherEnd, msgs);
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
		case QcmPackage.QCM__DOMAINE:
			return getDomaine();
		case QcmPackage.QCM__QUESTION:
			return getQuestion();
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
		case QcmPackage.QCM__DOMAINE:
			setDomaine((String) newValue);
			return;
		case QcmPackage.QCM__QUESTION:
			getQuestion().clear();
			getQuestion().addAll((Collection<? extends Question>) newValue);
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
		case QcmPackage.QCM__DOMAINE:
			setDomaine(DOMAINE_EDEFAULT);
			return;
		case QcmPackage.QCM__QUESTION:
			getQuestion().clear();
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
		case QcmPackage.QCM__DOMAINE:
			return DOMAINE_EDEFAULT == null ? domaine != null : !DOMAINE_EDEFAULT.equals(domaine);
		case QcmPackage.QCM__QUESTION:
			return question != null && !question.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (domaine: ");
		result.append(domaine);
		result.append(')');
		return result.toString();
	}

} //QcmImpl
