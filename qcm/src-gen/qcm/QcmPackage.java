/**
 */
package qcm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see qcm.QcmFactory
 * @model kind="package"
 * @generated
 */
public interface QcmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qcm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/qcm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qcm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QcmPackage eINSTANCE = qcm.impl.QcmPackageImpl.init();

	/**
	 * The meta object id for the '{@link qcm.impl.QcmImpl <em>Qcm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.QcmImpl
	 * @see qcm.impl.QcmPackageImpl#getQcm()
	 * @generated
	 */
	int QCM = 0;

	/**
	 * The feature id for the '<em><b>Domaine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCM__DOMAINE = 0;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCM__QUESTION = 1;

	/**
	 * The number of structural features of the '<em>Qcm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Qcm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qcm.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.QuestionImpl
	 * @see qcm.impl.QcmPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__INTITULE = 0;

	/**
	 * The feature id for the '<em><b>Reponse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REPONSE = 1;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qcm.impl.ReponseImpl <em>Reponse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.ReponseImpl
	 * @see qcm.impl.QcmPackageImpl#getReponse()
	 * @generated
	 */
	int REPONSE = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__DATA = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link qcm.Qcm <em>Qcm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qcm</em>'.
	 * @see qcm.Qcm
	 * @generated
	 */
	EClass getQcm();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Qcm#getDomaine <em>Domaine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domaine</em>'.
	 * @see qcm.Qcm#getDomaine()
	 * @see #getQcm()
	 * @generated
	 */
	EAttribute getQcm_Domaine();

	/**
	 * Returns the meta object for the containment reference list '{@link qcm.Qcm#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question</em>'.
	 * @see qcm.Qcm#getQuestion()
	 * @see #getQcm()
	 * @generated
	 */
	EReference getQcm_Question();

	/**
	 * Returns the meta object for class '{@link qcm.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see qcm.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Question#getIntitule <em>Intitule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intitule</em>'.
	 * @see qcm.Question#getIntitule()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Intitule();

	/**
	 * Returns the meta object for the containment reference list '{@link qcm.Question#getReponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reponse</em>'.
	 * @see qcm.Question#getReponse()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Reponse();

	/**
	 * Returns the meta object for class '{@link qcm.Reponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reponse</em>'.
	 * @see qcm.Reponse
	 * @generated
	 */
	EClass getReponse();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Reponse#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see qcm.Reponse#getData()
	 * @see #getReponse()
	 * @generated
	 */
	EAttribute getReponse_Data();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Reponse#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qcm.Reponse#isValue()
	 * @see #getReponse()
	 * @generated
	 */
	EAttribute getReponse_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QcmFactory getQcmFactory();

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
		 * The meta object literal for the '{@link qcm.impl.QcmImpl <em>Qcm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.QcmImpl
		 * @see qcm.impl.QcmPackageImpl#getQcm()
		 * @generated
		 */
		EClass QCM = eINSTANCE.getQcm();

		/**
		 * The meta object literal for the '<em><b>Domaine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QCM__DOMAINE = eINSTANCE.getQcm_Domaine();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QCM__QUESTION = eINSTANCE.getQcm_Question();

		/**
		 * The meta object literal for the '{@link qcm.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.QuestionImpl
		 * @see qcm.impl.QcmPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Intitule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__INTITULE = eINSTANCE.getQuestion_Intitule();

		/**
		 * The meta object literal for the '<em><b>Reponse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__REPONSE = eINSTANCE.getQuestion_Reponse();

		/**
		 * The meta object literal for the '{@link qcm.impl.ReponseImpl <em>Reponse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.ReponseImpl
		 * @see qcm.impl.QcmPackageImpl#getReponse()
		 * @generated
		 */
		EClass REPONSE = eINSTANCE.getReponse();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE__DATA = eINSTANCE.getReponse_Data();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE__VALUE = eINSTANCE.getReponse_Value();

	}

} //QcmPackage
