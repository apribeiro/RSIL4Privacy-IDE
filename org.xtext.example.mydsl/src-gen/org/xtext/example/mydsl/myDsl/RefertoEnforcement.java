/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referto Enforcement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RefertoEnforcement#getRefst <em>Refst</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRefertoEnforcement()
 * @model
 * @generated
 */
public interface RefertoEnforcement extends EObject
{
  /**
   * Returns the value of the '<em><b>Refst</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refst</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refst</em>' reference.
   * @see #setRefst(Enforcement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRefertoEnforcement_Refst()
   * @model
   * @generated
   */
  Enforcement getRefst();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.RefertoEnforcement#getRefst <em>Refst</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refst</em>' reference.
   * @see #getRefst()
   * @generated
   */
  void setRefst(Enforcement value);

} // RefertoEnforcement
