/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rslingo.rslil4privacy.rSLIL4Privacy.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage
 * @generated
 */
public class RSLIL4PrivacySwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RSLIL4PrivacyPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RSLIL4PrivacySwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RSLIL4PrivacyPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RSLIL4PrivacyPackage.POLICY:
      {
        Policy policy = (Policy)theEObject;
        T result = casePolicy(policy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.ENFORCEMENT:
      {
        Enforcement enforcement = (Enforcement)theEObject;
        T result = caseEnforcement(enforcement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.SERVICE:
      {
        Service service = (Service)theEObject;
        T result = caseService(service);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.RECIPIENT:
      {
        Recipient recipient = (Recipient)theEObject;
        T result = caseRecipient(recipient);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.PRIVATE_DATA:
      {
        PrivateData privateData = (PrivateData)theEObject;
        T result = casePrivateData(privateData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.COLLECTION:
      {
        Collection collection = (Collection)theEObject;
        T result = caseCollection(collection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.DISCLOSURE:
      {
        Disclosure disclosure = (Disclosure)theEObject;
        T result = caseDisclosure(disclosure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.RETENTION:
      {
        Retention retention = (Retention)theEObject;
        T result = caseRetention(retention);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.USAGE:
      {
        Usage usage = (Usage)theEObject;
        T result = caseUsage(usage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.INFORMATIVE:
      {
        Informative informative = (Informative)theEObject;
        T result = caseInformative(informative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.PARTOF:
      {
        Partof partof = (Partof)theEObject;
        T result = casePartof(partof);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.REFER_TO_RECIPIENT:
      {
        ReferToRecipient referToRecipient = (ReferToRecipient)theEObject;
        T result = caseReferToRecipient(referToRecipient);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.REFER_TO_RECIPIENT_SOURCE:
      {
        ReferToRecipientSource referToRecipientSource = (ReferToRecipientSource)theEObject;
        T result = caseReferToRecipientSource(referToRecipientSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.REFER_TO_RECIPIENT_TARGET:
      {
        ReferToRecipientTarget referToRecipientTarget = (ReferToRecipientTarget)theEObject;
        T result = caseReferToRecipientTarget(referToRecipientTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.REFER_TO_SERVICE:
      {
        ReferToService referToService = (ReferToService)theEObject;
        T result = caseReferToService(referToService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.SERVICE_PARTOF:
      {
        ServicePartof servicePartof = (ServicePartof)theEObject;
        T result = caseServicePartof(servicePartof);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.REF_PRIVATE_DATA:
      {
        RefPrivateData refPrivateData = (RefPrivateData)theEObject;
        T result = caseRefPrivateData(refPrivateData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RSLIL4PrivacyPackage.REFERTO_ENFORCEMENT:
      {
        RefertoEnforcement refertoEnforcement = (RefertoEnforcement)theEObject;
        T result = caseRefertoEnforcement(refertoEnforcement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Policy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Policy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePolicy(Policy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enforcement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enforcement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnforcement(Enforcement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseService(Service object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recipient</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recipient</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecipient(Recipient object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Private Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Private Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrivateData(PrivateData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollection(Collection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disclosure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disclosure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisclosure(Disclosure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Retention</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Retention</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRetention(Retention object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Usage</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Usage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsage(Usage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Informative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Informative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInformative(Informative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Partof</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Partof</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePartof(Partof object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refer To Recipient</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refer To Recipient</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferToRecipient(ReferToRecipient object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refer To Recipient Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refer To Recipient Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferToRecipientSource(ReferToRecipientSource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refer To Recipient Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refer To Recipient Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferToRecipientTarget(ReferToRecipientTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refer To Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refer To Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferToService(ReferToService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Partof</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Partof</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServicePartof(ServicePartof object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Private Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Private Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefPrivateData(RefPrivateData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Referto Enforcement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referto Enforcement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefertoEnforcement(RefertoEnforcement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RSLIL4PrivacySwitch
