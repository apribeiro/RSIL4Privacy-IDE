/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Policy#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Policy#getDay <em>Day</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Policy#getMonth <em>Month</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Policy#getYear <em>Year</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Policy#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Policy#getDisclosure <em>Disclosure</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Policy#getRetention <em>Retention</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Policy#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Policy#getInformative <em>Informative</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Policy#getPrivateData <em>Private Data</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Policy#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Policy#getService <em>Service</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Policy#getEnforcement <em>Enforcement</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolicy_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Policy#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Day</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Day</em>' attribute.
   * @see #setDay(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolicy_Day()
   * @model
   * @generated
   */
  int getDay();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Policy#getDay <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Day</em>' attribute.
   * @see #getDay()
   * @generated
   */
  void setDay(int value);

  /**
   * Returns the value of the '<em><b>Month</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Month</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Month</em>' attribute.
   * @see #setMonth(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolicy_Month()
   * @model
   * @generated
   */
  String getMonth();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Policy#getMonth <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Month</em>' attribute.
   * @see #getMonth()
   * @generated
   */
  void setMonth(String value);

  /**
   * Returns the value of the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Year</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Year</em>' attribute.
   * @see #setYear(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolicy_Year()
   * @model
   * @generated
   */
  int getYear();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Policy#getYear <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Year</em>' attribute.
   * @see #getYear()
   * @generated
   */
  void setYear(int value);

  /**
   * Returns the value of the '<em><b>Collection</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Collection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolicy_Collection()
   * @model containment="true"
   * @generated
   */
  EList<Collection> getCollection();

  /**
   * Returns the value of the '<em><b>Disclosure</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Disclosure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disclosure</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disclosure</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolicy_Disclosure()
   * @model containment="true"
   * @generated
   */
  EList<Disclosure> getDisclosure();

  /**
   * Returns the value of the '<em><b>Retention</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Retention}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Retention</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Retention</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolicy_Retention()
   * @model containment="true"
   * @generated
   */
  EList<Retention> getRetention();

  /**
   * Returns the value of the '<em><b>Usage</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Usage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usage</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usage</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolicy_Usage()
   * @model containment="true"
   * @generated
   */
  EList<Usage> getUsage();

  /**
   * Returns the value of the '<em><b>Informative</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Informative}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Informative</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Informative</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolicy_Informative()
   * @model containment="true"
   * @generated
   */
  EList<Informative> getInformative();

  /**
   * Returns the value of the '<em><b>Private Data</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.PrivateData}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Private Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Private Data</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolicy_PrivateData()
   * @model containment="true"
   * @generated
   */
  EList<PrivateData> getPrivateData();

  /**
   * Returns the value of the '<em><b>Recipient</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Recipient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipient</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipient</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolicy_Recipient()
   * @model containment="true"
   * @generated
   */
  EList<Recipient> getRecipient();

  /**
   * Returns the value of the '<em><b>Service</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolicy_Service()
   * @model containment="true"
   * @generated
   */
  EList<Service> getService();

  /**
   * Returns the value of the '<em><b>Enforcement</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Enforcement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enforcement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enforcement</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPolicy_Enforcement()
   * @model containment="true"
   * @generated
   */
  EList<Enforcement> getEnforcement();

} // Policy
