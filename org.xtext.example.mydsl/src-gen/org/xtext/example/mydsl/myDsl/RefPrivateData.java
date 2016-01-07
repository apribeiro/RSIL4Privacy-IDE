/**
 */
package org.xtext.example.mydsl.myDsl;

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
 *   <li>{@link org.xtext.example.mydsl.myDsl.RefPrivateData#getRefpr <em>Refpr</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRefPrivateData()
 * @model
 * @generated
 */
public interface RefPrivateData extends EObject
{
  /**
   * Returns the value of the '<em><b>Refpr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refpr</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refpr</em>' reference.
   * @see #setRefpr(PrivateData)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRefPrivateData_Refpr()
   * @model
   * @generated
   */
  PrivateData getRefpr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.RefPrivateData#getRefpr <em>Refpr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refpr</em>' reference.
   * @see #getRefpr()
   * @generated
   */
  void setRefpr(PrivateData value);

} // RefPrivateData
