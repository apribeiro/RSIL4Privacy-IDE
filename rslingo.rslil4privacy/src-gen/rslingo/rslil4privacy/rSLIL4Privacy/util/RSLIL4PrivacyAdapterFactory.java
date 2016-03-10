/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rslingo.rslil4privacy.rSLIL4Privacy.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage
 * @generated
 */
public class RSLIL4PrivacyAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RSLIL4PrivacyPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RSLIL4PrivacyAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RSLIL4PrivacyPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RSLIL4PrivacySwitch<Adapter> modelSwitch =
    new RSLIL4PrivacySwitch<Adapter>()
    {
      @Override
      public Adapter casePolicy(Policy object)
      {
        return createPolicyAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseEnforcement(Enforcement object)
      {
        return createEnforcementAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter caseRecipient(Recipient object)
      {
        return createRecipientAdapter();
      }
      @Override
      public Adapter casePrivateData(PrivateData object)
      {
        return createPrivateDataAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseCollection(Collection object)
      {
        return createCollectionAdapter();
      }
      @Override
      public Adapter caseDisclosure(Disclosure object)
      {
        return createDisclosureAdapter();
      }
      @Override
      public Adapter caseRetention(Retention object)
      {
        return createRetentionAdapter();
      }
      @Override
      public Adapter caseUsage(Usage object)
      {
        return createUsageAdapter();
      }
      @Override
      public Adapter caseInformative(Informative object)
      {
        return createInformativeAdapter();
      }
      @Override
      public Adapter casePartof(Partof object)
      {
        return createPartofAdapter();
      }
      @Override
      public Adapter caseReferToRecipient(ReferToRecipient object)
      {
        return createReferToRecipientAdapter();
      }
      @Override
      public Adapter caseReferToRecipientSource(ReferToRecipientSource object)
      {
        return createReferToRecipientSourceAdapter();
      }
      @Override
      public Adapter caseReferToRecipientTarget(ReferToRecipientTarget object)
      {
        return createReferToRecipientTargetAdapter();
      }
      @Override
      public Adapter caseReferToService(ReferToService object)
      {
        return createReferToServiceAdapter();
      }
      @Override
      public Adapter caseServicePartof(ServicePartof object)
      {
        return createServicePartofAdapter();
      }
      @Override
      public Adapter caseRefPrivateData(RefPrivateData object)
      {
        return createRefPrivateDataAdapter();
      }
      @Override
      public Adapter caseRefertoEnforcement(RefertoEnforcement object)
      {
        return createRefertoEnforcementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Policy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Policy
   * @generated
   */
  public Adapter createPolicyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Enforcement <em>Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Enforcement
   * @generated
   */
  public Adapter createEnforcementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient <em>Recipient</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Recipient
   * @generated
   */
  public Adapter createRecipientAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData <em>Private Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.PrivateData
   * @generated
   */
  public Adapter createPrivateDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Collection
   * @generated
   */
  public Adapter createCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure <em>Disclosure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure
   * @generated
   */
  public Adapter createDisclosureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention <em>Retention</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention
   * @generated
   */
  public Adapter createRetentionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Usage <em>Usage</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Usage
   * @generated
   */
  public Adapter createUsageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Informative <em>Informative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Informative
   * @generated
   */
  public Adapter createInformativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Partof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Partof
   * @generated
   */
  public Adapter createPartofAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipient <em>Refer To Recipient</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipient
   * @generated
   */
  public Adapter createReferToRecipientAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipientSource <em>Refer To Recipient Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipientSource
   * @generated
   */
  public Adapter createReferToRecipientSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipientTarget <em>Refer To Recipient Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipientTarget
   * @generated
   */
  public Adapter createReferToRecipientTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.ReferToService <em>Refer To Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ReferToService
   * @generated
   */
  public Adapter createReferToServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.ServicePartof <em>Service Partof</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ServicePartof
   * @generated
   */
  public Adapter createServicePartofAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData <em>Ref Private Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData
   * @generated
   */
  public Adapter createRefPrivateDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefertoEnforcement
   * @generated
   */
  public Adapter createRefertoEnforcementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RSLIL4PrivacyAdapterFactory
