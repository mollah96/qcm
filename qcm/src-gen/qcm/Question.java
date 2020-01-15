/**
 */
package qcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcm.Question#getIntitule <em>Intitule</em>}</li>
 *   <li>{@link qcm.Question#getReponse <em>Reponse</em>}</li>
 * </ul>
 *
 * @see qcm.QcmPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject {
	/**
	 * Returns the value of the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intitule</em>' attribute.
	 * @see #setIntitule(String)
	 * @see qcm.QcmPackage#getQuestion_Intitule()
	 * @model
	 * @generated
	 */
	String getIntitule();

	/**
	 * Sets the value of the '{@link qcm.Question#getIntitule <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intitule</em>' attribute.
	 * @see #getIntitule()
	 * @generated
	 */
	void setIntitule(String value);

	/**
	 * Returns the value of the '<em><b>Reponse</b></em>' containment reference list.
	 * The list contents are of type {@link qcm.Reponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reponse</em>' containment reference list.
	 * @see qcm.QcmPackage#getQuestion_Reponse()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Reponse> getReponse();

} // Question
