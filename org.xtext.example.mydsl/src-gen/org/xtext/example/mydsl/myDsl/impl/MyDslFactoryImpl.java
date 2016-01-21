/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.POLICY: return createPolicy();
      case MyDslPackage.IMPORT: return createImport();
      case MyDslPackage.ENFORCEMENT: return createEnforcement();
      case MyDslPackage.SERVICE: return createService();
      case MyDslPackage.RECIPIENT: return createRecipient();
      case MyDslPackage.PRIVATE_DATA: return createPrivateData();
      case MyDslPackage.ATTRIBUTE: return createAttribute();
      case MyDslPackage.COLLECTION: return createCollection();
      case MyDslPackage.DISCLOSURE: return createDisclosure();
      case MyDslPackage.RETENTION: return createRetention();
      case MyDslPackage.USAGE: return createUsage();
      case MyDslPackage.INFORMATIVE: return createInformative();
      case MyDslPackage.PARTOF: return createPartof();
      case MyDslPackage.REFER_TO_RECIPIENT: return createReferToRecipient();
      case MyDslPackage.REFER_TO_RECIPIENT_SOURCE: return createReferToRecipientSource();
      case MyDslPackage.REFER_TO_RECIPIENT_TARGET: return createReferToRecipientTarget();
      case MyDslPackage.REFER_TO_SERVICE: return createReferToService();
      case MyDslPackage.SERVICE_PARTOF: return createServicePartof();
      case MyDslPackage.REF_PRIVATE_DATA: return createRefPrivateData();
      case MyDslPackage.REFERTO_ENFORCEMENT: return createRefertoEnforcement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Policy createPolicy()
  {
    PolicyImpl policy = new PolicyImpl();
    return policy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enforcement createEnforcement()
  {
    EnforcementImpl enforcement = new EnforcementImpl();
    return enforcement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipient createRecipient()
  {
    RecipientImpl recipient = new RecipientImpl();
    return recipient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrivateData createPrivateData()
  {
    PrivateDataImpl privateData = new PrivateDataImpl();
    return privateData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection createCollection()
  {
    CollectionImpl collection = new CollectionImpl();
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Disclosure createDisclosure()
  {
    DisclosureImpl disclosure = new DisclosureImpl();
    return disclosure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Retention createRetention()
  {
    RetentionImpl retention = new RetentionImpl();
    return retention;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Usage createUsage()
  {
    UsageImpl usage = new UsageImpl();
    return usage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Informative createInformative()
  {
    InformativeImpl informative = new InformativeImpl();
    return informative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Partof createPartof()
  {
    PartofImpl partof = new PartofImpl();
    return partof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferToRecipient createReferToRecipient()
  {
    ReferToRecipientImpl referToRecipient = new ReferToRecipientImpl();
    return referToRecipient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferToRecipientSource createReferToRecipientSource()
  {
    ReferToRecipientSourceImpl referToRecipientSource = new ReferToRecipientSourceImpl();
    return referToRecipientSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferToRecipientTarget createReferToRecipientTarget()
  {
    ReferToRecipientTargetImpl referToRecipientTarget = new ReferToRecipientTargetImpl();
    return referToRecipientTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferToService createReferToService()
  {
    ReferToServiceImpl referToService = new ReferToServiceImpl();
    return referToService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServicePartof createServicePartof()
  {
    ServicePartofImpl servicePartof = new ServicePartofImpl();
    return servicePartof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefPrivateData createRefPrivateData()
  {
    RefPrivateDataImpl refPrivateData = new RefPrivateDataImpl();
    return refPrivateData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefertoEnforcement createRefertoEnforcement()
  {
    RefertoEnforcementImpl refertoEnforcement = new RefertoEnforcementImpl();
    return refertoEnforcement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
