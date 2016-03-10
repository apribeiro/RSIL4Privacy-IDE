/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

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
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.RefertoEnforcement#getRefst <em>Refst</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefertoEnforcement()
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
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefertoEnforcement_Refst()
   * @model
   * @generated
   */
  Enforcement getRefst();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefertoEnforcement#getRefst <em>Refst</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refst</em>' reference.
   * @see #getRefst()
   * @generated
   */
  void setRefst(Enforcement value);

} // RefertoEnforcement
