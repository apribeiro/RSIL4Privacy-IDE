/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getRecipientName <em>Recipient Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getRecipientPart <em>Recipient Part</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getScope <em>Scope</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRecipient()
 * @model
 * @generated
 */
public interface Recipient extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRecipient_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Recipient Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipient Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipient Name</em>' attribute.
   * @see #setRecipientName(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRecipient_RecipientName()
   * @model
   * @generated
   */
  String getRecipientName();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getRecipientName <em>Recipient Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipient Name</em>' attribute.
   * @see #getRecipientName()
   * @generated
   */
  void setRecipientName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRecipient_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Recipient Part</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipient Part</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipient Part</em>' containment reference list.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRecipient_RecipientPart()
   * @model containment="true"
   * @generated
   */
  EList<RecipientPart> getRecipientPart();

  /**
   * Returns the value of the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scope</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' attribute.
   * @see #setScope(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRecipient_Scope()
   * @model
   * @generated
   */
  String getScope();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getScope <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' attribute.
   * @see #getScope()
   * @generated
   */
  void setScope(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRecipient_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // Recipient
