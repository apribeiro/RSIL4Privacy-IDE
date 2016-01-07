/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enforcement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Enforcement#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Enforcement#getEnforcementName <em>Enforcement Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Enforcement#getEnforcementDescription <em>Enforcement Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Enforcement#getEnforcementKind <em>Enforcement Kind</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEnforcement()
 * @model
 * @generated
 */
public interface Enforcement extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEnforcement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Enforcement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Enforcement Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enforcement Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enforcement Name</em>' attribute.
   * @see #setEnforcementName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEnforcement_EnforcementName()
   * @model
   * @generated
   */
  String getEnforcementName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Enforcement#getEnforcementName <em>Enforcement Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enforcement Name</em>' attribute.
   * @see #getEnforcementName()
   * @generated
   */
  void setEnforcementName(String value);

  /**
   * Returns the value of the '<em><b>Enforcement Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enforcement Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enforcement Description</em>' attribute.
   * @see #setEnforcementDescription(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEnforcement_EnforcementDescription()
   * @model
   * @generated
   */
  String getEnforcementDescription();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Enforcement#getEnforcementDescription <em>Enforcement Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enforcement Description</em>' attribute.
   * @see #getEnforcementDescription()
   * @generated
   */
  void setEnforcementDescription(String value);

  /**
   * Returns the value of the '<em><b>Enforcement Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enforcement Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enforcement Kind</em>' attribute.
   * @see #setEnforcementKind(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEnforcement_EnforcementKind()
   * @model
   * @generated
   */
  String getEnforcementKind();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Enforcement#getEnforcementKind <em>Enforcement Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enforcement Kind</em>' attribute.
   * @see #getEnforcementKind()
   * @generated
   */
  void setEnforcementKind(String value);

} // Enforcement
