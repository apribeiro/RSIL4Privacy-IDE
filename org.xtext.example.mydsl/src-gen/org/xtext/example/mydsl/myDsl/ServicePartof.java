/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Partof</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ServicePartof#getRefertoservice <em>Refertoservice</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getServicePartof()
 * @model
 * @generated
 */
public interface ServicePartof extends EObject
{
  /**
   * Returns the value of the '<em><b>Refertoservice</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refertoservice</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refertoservice</em>' reference.
   * @see #setRefertoservice(Service)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getServicePartof_Refertoservice()
   * @model
   * @generated
   */
  Service getRefertoservice();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ServicePartof#getRefertoservice <em>Refertoservice</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refertoservice</em>' reference.
   * @see #getRefertoservice()
   * @generated
   */
  void setRefertoservice(Service value);

} // ServicePartof
