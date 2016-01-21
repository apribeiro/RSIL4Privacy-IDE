/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Policy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Policy</em>'.
   * @generated
   */
  Policy createPolicy();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Enforcement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enforcement</em>'.
   * @generated
   */
  Enforcement createEnforcement();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Recipient</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recipient</em>'.
   * @generated
   */
  Recipient createRecipient();

  /**
   * Returns a new object of class '<em>Private Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Private Data</em>'.
   * @generated
   */
  PrivateData createPrivateData();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection</em>'.
   * @generated
   */
  Collection createCollection();

  /**
   * Returns a new object of class '<em>Disclosure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disclosure</em>'.
   * @generated
   */
  Disclosure createDisclosure();

  /**
   * Returns a new object of class '<em>Retention</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Retention</em>'.
   * @generated
   */
  Retention createRetention();

  /**
   * Returns a new object of class '<em>Usage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Usage</em>'.
   * @generated
   */
  Usage createUsage();

  /**
   * Returns a new object of class '<em>Informative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Informative</em>'.
   * @generated
   */
  Informative createInformative();

  /**
   * Returns a new object of class '<em>Partof</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Partof</em>'.
   * @generated
   */
  Partof createPartof();

  /**
   * Returns a new object of class '<em>Refer To Recipient</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Refer To Recipient</em>'.
   * @generated
   */
  ReferToRecipient createReferToRecipient();

  /**
   * Returns a new object of class '<em>Refer To Recipient Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Refer To Recipient Source</em>'.
   * @generated
   */
  ReferToRecipientSource createReferToRecipientSource();

  /**
   * Returns a new object of class '<em>Refer To Recipient Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Refer To Recipient Target</em>'.
   * @generated
   */
  ReferToRecipientTarget createReferToRecipientTarget();

  /**
   * Returns a new object of class '<em>Refer To Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Refer To Service</em>'.
   * @generated
   */
  ReferToService createReferToService();

  /**
   * Returns a new object of class '<em>Service Partof</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Partof</em>'.
   * @generated
   */
  ServicePartof createServicePartof();

  /**
   * Returns a new object of class '<em>Ref Private Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Private Data</em>'.
   * @generated
   */
  RefPrivateData createRefPrivateData();

  /**
   * Returns a new object of class '<em>Referto Enforcement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Referto Enforcement</em>'.
   * @generated
   */
  RefertoEnforcement createRefertoEnforcement();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
