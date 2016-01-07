/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refer To Recipient Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ReferToRecipientSource#getRefertore <em>Refertore</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReferToRecipientSource()
 * @model
 * @generated
 */
public interface ReferToRecipientSource extends EObject
{
  /**
   * Returns the value of the '<em><b>Refertore</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refertore</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refertore</em>' reference.
   * @see #setRefertore(Recipient)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReferToRecipientSource_Refertore()
   * @model
   * @generated
   */
  Recipient getRefertore();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ReferToRecipientSource#getRefertore <em>Refertore</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refertore</em>' reference.
   * @see #getRefertore()
   * @generated
   */
  void setRefertore(Recipient value);

} // ReferToRecipientSource
