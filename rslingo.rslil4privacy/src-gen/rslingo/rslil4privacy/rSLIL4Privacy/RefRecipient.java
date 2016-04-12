/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Recipient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.RefRecipient#getRefRecipient <em>Ref Recipient</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.RefRecipient#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefRecipient()
 * @model
 * @generated
 */
public interface RefRecipient extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Recipient</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Recipient</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Recipient</em>' reference.
   * @see #setRefRecipient(Recipient)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefRecipient_RefRecipient()
   * @model
   * @generated
   */
  Recipient getRefRecipient();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefRecipient#getRefRecipient <em>Ref Recipient</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Recipient</em>' reference.
   * @see #getRefRecipient()
   * @generated
   */
  void setRefRecipient(Recipient value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefRecipient_Refs()
   * @model
   * @generated
   */
  EList<Recipient> getRefs();

} // RefRecipient
