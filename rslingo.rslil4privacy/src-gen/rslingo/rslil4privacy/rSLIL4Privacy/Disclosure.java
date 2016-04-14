/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disclosure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getCondition <em>Condition</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getPartDisclosure <em>Part Disclosure</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRecipient <em>Ref Recipient</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRAll <em>Ref RAll</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRecipientSource <em>Ref Recipient Source</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRSAll <em>Ref RS All</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRecipientTarget <em>Ref Recipient Target</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRTAll <em>Ref RT All</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefPrivateData <em>Ref Private Data</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefPDAll <em>Ref PD All</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefService <em>Ref Service</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefSAll <em>Ref SAll</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefEnforcement <em>Ref Enforcement</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefEAll <em>Ref EAll</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getModality <em>Modality</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure()
 * @model
 * @generated
 */
public interface Disclosure extends EObject
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
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute.
   * @see #setCondition(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_Condition()
   * @model
   * @generated
   */
  String getCondition();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getCondition <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' attribute.
   * @see #getCondition()
   * @generated
   */
  void setCondition(String value);

  /**
   * Returns the value of the '<em><b>Part Disclosure</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Disclosure</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Disclosure</em>' reference.
   * @see #setPartDisclosure(Disclosure)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_PartDisclosure()
   * @model
   * @generated
   */
  Disclosure getPartDisclosure();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getPartDisclosure <em>Part Disclosure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part Disclosure</em>' reference.
   * @see #getPartDisclosure()
   * @generated
   */
  void setPartDisclosure(Disclosure value);

  /**
   * Returns the value of the '<em><b>Ref Recipient</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Recipient</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Recipient</em>' containment reference.
   * @see #setRefRecipient(RefRecipient)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_RefRecipient()
   * @model containment="true"
   * @generated
   */
  RefRecipient getRefRecipient();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRecipient <em>Ref Recipient</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Recipient</em>' containment reference.
   * @see #getRefRecipient()
   * @generated
   */
  void setRefRecipient(RefRecipient value);

  /**
   * Returns the value of the '<em><b>Ref RAll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref RAll</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref RAll</em>' attribute.
   * @see #setRefRAll(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_RefRAll()
   * @model
   * @generated
   */
  String getRefRAll();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRAll <em>Ref RAll</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref RAll</em>' attribute.
   * @see #getRefRAll()
   * @generated
   */
  void setRefRAll(String value);

  /**
   * Returns the value of the '<em><b>Ref Recipient Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Recipient Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Recipient Source</em>' containment reference.
   * @see #setRefRecipientSource(RefRecipientSource)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_RefRecipientSource()
   * @model containment="true"
   * @generated
   */
  RefRecipientSource getRefRecipientSource();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRecipientSource <em>Ref Recipient Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Recipient Source</em>' containment reference.
   * @see #getRefRecipientSource()
   * @generated
   */
  void setRefRecipientSource(RefRecipientSource value);

  /**
   * Returns the value of the '<em><b>Ref RS All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref RS All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref RS All</em>' attribute.
   * @see #setRefRSAll(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_RefRSAll()
   * @model
   * @generated
   */
  String getRefRSAll();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRSAll <em>Ref RS All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref RS All</em>' attribute.
   * @see #getRefRSAll()
   * @generated
   */
  void setRefRSAll(String value);

  /**
   * Returns the value of the '<em><b>Ref Recipient Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Recipient Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Recipient Target</em>' containment reference.
   * @see #setRefRecipientTarget(RefRecipientTarget)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_RefRecipientTarget()
   * @model containment="true"
   * @generated
   */
  RefRecipientTarget getRefRecipientTarget();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRecipientTarget <em>Ref Recipient Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Recipient Target</em>' containment reference.
   * @see #getRefRecipientTarget()
   * @generated
   */
  void setRefRecipientTarget(RefRecipientTarget value);

  /**
   * Returns the value of the '<em><b>Ref RT All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref RT All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref RT All</em>' attribute.
   * @see #setRefRTAll(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_RefRTAll()
   * @model
   * @generated
   */
  String getRefRTAll();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRTAll <em>Ref RT All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref RT All</em>' attribute.
   * @see #getRefRTAll()
   * @generated
   */
  void setRefRTAll(String value);

  /**
   * Returns the value of the '<em><b>Ref Private Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Private Data</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Private Data</em>' containment reference.
   * @see #setRefPrivateData(RefPrivateData)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_RefPrivateData()
   * @model containment="true"
   * @generated
   */
  RefPrivateData getRefPrivateData();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefPrivateData <em>Ref Private Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Private Data</em>' containment reference.
   * @see #getRefPrivateData()
   * @generated
   */
  void setRefPrivateData(RefPrivateData value);

  /**
   * Returns the value of the '<em><b>Ref PD All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref PD All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref PD All</em>' attribute.
   * @see #setRefPDAll(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_RefPDAll()
   * @model
   * @generated
   */
  String getRefPDAll();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefPDAll <em>Ref PD All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref PD All</em>' attribute.
   * @see #getRefPDAll()
   * @generated
   */
  void setRefPDAll(String value);

  /**
   * Returns the value of the '<em><b>Ref Service</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Service</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Service</em>' containment reference.
   * @see #setRefService(RefService)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_RefService()
   * @model containment="true"
   * @generated
   */
  RefService getRefService();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefService <em>Ref Service</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Service</em>' containment reference.
   * @see #getRefService()
   * @generated
   */
  void setRefService(RefService value);

  /**
   * Returns the value of the '<em><b>Ref SAll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref SAll</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref SAll</em>' attribute.
   * @see #setRefSAll(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_RefSAll()
   * @model
   * @generated
   */
  String getRefSAll();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefSAll <em>Ref SAll</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref SAll</em>' attribute.
   * @see #getRefSAll()
   * @generated
   */
  void setRefSAll(String value);

  /**
   * Returns the value of the '<em><b>Ref Enforcement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Enforcement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Enforcement</em>' containment reference.
   * @see #setRefEnforcement(RefEnforcement)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_RefEnforcement()
   * @model containment="true"
   * @generated
   */
  RefEnforcement getRefEnforcement();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefEnforcement <em>Ref Enforcement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Enforcement</em>' containment reference.
   * @see #getRefEnforcement()
   * @generated
   */
  void setRefEnforcement(RefEnforcement value);

  /**
   * Returns the value of the '<em><b>Ref EAll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref EAll</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref EAll</em>' attribute.
   * @see #setRefEAll(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_RefEAll()
   * @model
   * @generated
   */
  String getRefEAll();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefEAll <em>Ref EAll</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref EAll</em>' attribute.
   * @see #getRefEAll()
   * @generated
   */
  void setRefEAll(String value);

  /**
   * Returns the value of the '<em><b>Modality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modality</em>' attribute.
   * @see #setModality(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDisclosure_Modality()
   * @model
   * @generated
   */
  String getModality();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getModality <em>Modality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modality</em>' attribute.
   * @see #getModality()
   * @generated
   */
  void setModality(String value);

} // Disclosure
