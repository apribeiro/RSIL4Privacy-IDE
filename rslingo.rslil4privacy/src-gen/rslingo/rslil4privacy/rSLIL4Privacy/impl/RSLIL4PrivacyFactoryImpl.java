/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rslingo.rslil4privacy.rSLIL4Privacy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RSLIL4PrivacyFactoryImpl extends EFactoryImpl implements RSLIL4PrivacyFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RSLIL4PrivacyFactory init()
  {
    try
    {
      RSLIL4PrivacyFactory theRSLIL4PrivacyFactory = (RSLIL4PrivacyFactory)EPackage.Registry.INSTANCE.getEFactory(RSLIL4PrivacyPackage.eNS_URI);
      if (theRSLIL4PrivacyFactory != null)
      {
        return theRSLIL4PrivacyFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RSLIL4PrivacyFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RSLIL4PrivacyFactoryImpl()
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
      case RSLIL4PrivacyPackage.POLICY: return createPolicy();
      case RSLIL4PrivacyPackage.IMPORT: return createImport();
      case RSLIL4PrivacyPackage.ENFORCEMENT: return createEnforcement();
      case RSLIL4PrivacyPackage.SERVICE: return createService();
      case RSLIL4PrivacyPackage.RECIPIENT: return createRecipient();
      case RSLIL4PrivacyPackage.PRIVATE_DATA: return createPrivateData();
      case RSLIL4PrivacyPackage.ATTRIBUTE: return createAttribute();
      case RSLIL4PrivacyPackage.COLLECTION: return createCollection();
      case RSLIL4PrivacyPackage.DISCLOSURE: return createDisclosure();
      case RSLIL4PrivacyPackage.RETENTION: return createRetention();
      case RSLIL4PrivacyPackage.USAGE: return createUsage();
      case RSLIL4PrivacyPackage.INFORMATIVE: return createInformative();
      case RSLIL4PrivacyPackage.RECIPIENT_PART: return createRecipientPart();
      case RSLIL4PrivacyPackage.REF_RECIPIENT: return createRefRecipient();
      case RSLIL4PrivacyPackage.REF_RECIPIENT_SOURCE: return createRefRecipientSource();
      case RSLIL4PrivacyPackage.REF_RECIPIENT_TARGET: return createRefRecipientTarget();
      case RSLIL4PrivacyPackage.REF_SERVICE: return createRefService();
      case RSLIL4PrivacyPackage.SERVICE_PART: return createServicePart();
      case RSLIL4PrivacyPackage.REF_PRIVATE_DATA: return createRefPrivateData();
      case RSLIL4PrivacyPackage.REF_ENFORCEMENT: return createRefEnforcement();
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
  public RecipientPart createRecipientPart()
  {
    RecipientPartImpl recipientPart = new RecipientPartImpl();
    return recipientPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefRecipient createRefRecipient()
  {
    RefRecipientImpl refRecipient = new RefRecipientImpl();
    return refRecipient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefRecipientSource createRefRecipientSource()
  {
    RefRecipientSourceImpl refRecipientSource = new RefRecipientSourceImpl();
    return refRecipientSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefRecipientTarget createRefRecipientTarget()
  {
    RefRecipientTargetImpl refRecipientTarget = new RefRecipientTargetImpl();
    return refRecipientTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefService createRefService()
  {
    RefServiceImpl refService = new RefServiceImpl();
    return refService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServicePart createServicePart()
  {
    ServicePartImpl servicePart = new ServicePartImpl();
    return servicePart;
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
  public RefEnforcement createRefEnforcement()
  {
    RefEnforcementImpl refEnforcement = new RefEnforcementImpl();
    return refEnforcement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RSLIL4PrivacyPackage getRSLIL4PrivacyPackage()
  {
    return (RSLIL4PrivacyPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RSLIL4PrivacyPackage getPackage()
  {
    return RSLIL4PrivacyPackage.eINSTANCE;
  }

} //RSLIL4PrivacyFactoryImpl
