/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Private Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData#getRefPrivateData <em>Ref Private Data</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefPrivateData()
 * @model
 * @generated
 */
public interface RefPrivateData extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Private Data</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Private Data</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Private Data</em>' reference.
   * @see #setRefPrivateData(PrivateData)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefPrivateData_RefPrivateData()
   * @model
   * @generated
   */
  PrivateData getRefPrivateData();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData#getRefPrivateData <em>Ref Private Data</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Private Data</em>' reference.
   * @see #getRefPrivateData()
   * @generated
   */
  void setRefPrivateData(PrivateData value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefPrivateData_Refs()
   * @model
   * @generated
   */
  EList<PrivateData> getRefs();

} // RefPrivateData
