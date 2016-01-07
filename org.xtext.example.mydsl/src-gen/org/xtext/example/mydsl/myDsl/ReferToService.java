/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refer To Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ReferToService#getRefertose <em>Refertose</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReferToService()
 * @model
 * @generated
 */
public interface ReferToService extends EObject
{
  /**
   * Returns the value of the '<em><b>Refertose</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refertose</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refertose</em>' reference.
   * @see #setRefertose(Service)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReferToService_Refertose()
   * @model
   * @generated
   */
  Service getRefertose();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ReferToService#getRefertose <em>Refertose</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refertose</em>' reference.
   * @see #getRefertose()
   * @generated
   */
  void setRefertose(Service value);

} // ReferToService
