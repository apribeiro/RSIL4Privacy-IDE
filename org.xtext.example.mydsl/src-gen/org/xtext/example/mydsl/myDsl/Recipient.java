/**
 */
package org.xtext.example.mydsl.myDsl;

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
 *   <li>{@link org.xtext.example.mydsl.myDsl.Recipient#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Recipient#getRecipientname <em>Recipientname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Recipient#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Recipient#getPartof <em>Partof</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Recipient#getRecipientScopeKind <em>Recipient Scope Kind</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Recipient#getRecipientTypeKind <em>Recipient Type Kind</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRecipient()
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRecipient_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Recipient#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Recipientname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipientname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipientname</em>' attribute.
   * @see #setRecipientname(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRecipient_Recipientname()
   * @model
   * @generated
   */
  String getRecipientname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Recipient#getRecipientname <em>Recipientname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipientname</em>' attribute.
   * @see #getRecipientname()
   * @generated
   */
  void setRecipientname(String value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRecipient_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Recipient#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Partof</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Partof}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partof</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partof</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRecipient_Partof()
   * @model containment="true"
   * @generated
   */
  EList<Partof> getPartof();

  /**
   * Returns the value of the '<em><b>Recipient Scope Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipient Scope Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipient Scope Kind</em>' attribute.
   * @see #setRecipientScopeKind(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRecipient_RecipientScopeKind()
   * @model
   * @generated
   */
  String getRecipientScopeKind();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Recipient#getRecipientScopeKind <em>Recipient Scope Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipient Scope Kind</em>' attribute.
   * @see #getRecipientScopeKind()
   * @generated
   */
  void setRecipientScopeKind(String value);

  /**
   * Returns the value of the '<em><b>Recipient Type Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipient Type Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipient Type Kind</em>' attribute.
   * @see #setRecipientTypeKind(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRecipient_RecipientTypeKind()
   * @model
   * @generated
   */
  String getRecipientTypeKind();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Recipient#getRecipientTypeKind <em>Recipient Type Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipient Type Kind</em>' attribute.
   * @see #getRecipientTypeKind()
   * @generated
   */
  void setRecipientTypeKind(String value);

} // Recipient
