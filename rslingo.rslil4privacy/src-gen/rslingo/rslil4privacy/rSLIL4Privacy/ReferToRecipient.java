/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refer To Recipient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipient#getRefertore <em>Refertore</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getReferToRecipient()
 * @model
 * @generated
 */
public interface ReferToRecipient extends EObject
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
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getReferToRecipient_Refertore()
   * @model
   * @generated
   */
  Recipient getRefertore();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipient#getRefertore <em>Refertore</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refertore</em>' reference.
   * @see #getRefertore()
   * @generated
   */
  void setRefertore(Recipient value);

} // ReferToRecipient
