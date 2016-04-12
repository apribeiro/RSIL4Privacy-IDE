/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Recipient Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientSource#getRefRecipientSource <em>Ref Recipient Source</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientSource#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefRecipientSource()
 * @model
 * @generated
 */
public interface RefRecipientSource extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Recipient Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Recipient Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Recipient Source</em>' reference.
   * @see #setRefRecipientSource(Recipient)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefRecipientSource_RefRecipientSource()
   * @model
   * @generated
   */
  Recipient getRefRecipientSource();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientSource#getRefRecipientSource <em>Ref Recipient Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Recipient Source</em>' reference.
   * @see #getRefRecipientSource()
   * @generated
   */
  void setRefRecipientSource(Recipient value);

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
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefRecipientSource_Refs()
   * @model
   * @generated
   */
  EList<Recipient> getRefs();

} // RefRecipientSource
