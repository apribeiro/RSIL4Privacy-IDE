/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partof</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Partof#getPartof <em>Partof</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getPartof()
 * @model
 * @generated
 */
public interface Partof extends EObject
{
  /**
   * Returns the value of the '<em><b>Partof</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partof</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partof</em>' reference.
   * @see #setPartof(Recipient)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getPartof_Partof()
   * @model
   * @generated
   */
  Recipient getPartof();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Partof#getPartof <em>Partof</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partof</em>' reference.
   * @see #getPartof()
   * @generated
   */
  void setPartof(Recipient value);

} // Partof
