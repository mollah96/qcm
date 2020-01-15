/**
 */
package qcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qcm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcm.Qcm#getDomaine <em>Domaine</em>}</li>
 *   <li>{@link qcm.Qcm#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @see qcm.QcmPackage#getQcm()
 * @model
 * @generated
 */
public interface Qcm extends EObject {
	/**
	 * Returns the value of the '<em><b>Domaine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domaine</em>' attribute.
	 * @see #setDomaine(String)
	 * @see qcm.QcmPackage#getQcm_Domaine()
	 * @model
	 * @generated
	 */
	String getDomaine();

	/**
	 * Sets the value of the '{@link qcm.Qcm#getDomaine <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domaine</em>' attribute.
	 * @see #getDomaine()
	 * @generated
	 */
	void setDomaine(String value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference list.
	 * The list contents are of type {@link qcm.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference list.
	 * @see qcm.QcmPackage#getQcm_Question()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Question> getQuestion();

} // Qcm
