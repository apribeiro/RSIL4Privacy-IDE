/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyFactory
 * @model kind="package"
 * @generated
 */
public interface RSLIL4PrivacyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rSLIL4Privacy";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.rslil4privacy.rslingo/RSLIL4Privacy";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rSLIL4Privacy";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RSLIL4PrivacyPackage eINSTANCE = rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl.init();

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.PolicyImpl <em>Policy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.PolicyImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getPolicy()
   * @generated
   */
  int POLICY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__NAME = 0;

  /**
   * The feature id for the '<em><b>Importelements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__IMPORTELEMENTS = 1;

  /**
   * The feature id for the '<em><b>Collection</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__COLLECTION = 2;

  /**
   * The feature id for the '<em><b>Disclosure</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__DISCLOSURE = 3;

  /**
   * The feature id for the '<em><b>Retention</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__RETENTION = 4;

  /**
   * The feature id for the '<em><b>Usage</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__USAGE = 5;

  /**
   * The feature id for the '<em><b>Informative</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__INFORMATIVE = 6;

  /**
   * The feature id for the '<em><b>Private Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__PRIVATE_DATA = 7;

  /**
   * The feature id for the '<em><b>Recipient</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__RECIPIENT = 8;

  /**
   * The feature id for the '<em><b>Service</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__SERVICE = 9;

  /**
   * The feature id for the '<em><b>Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__ENFORCEMENT = 10;

  /**
   * The number of structural features of the '<em>Policy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ImportImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.EnforcementImpl <em>Enforcement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.EnforcementImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getEnforcement()
   * @generated
   */
  int ENFORCEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENFORCEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Enforcement Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENFORCEMENT__ENFORCEMENT_NAME = 1;

  /**
   * The feature id for the '<em><b>Enforcement Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENFORCEMENT__ENFORCEMENT_DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Enforcement Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENFORCEMENT__ENFORCEMENT_KIND = 3;

  /**
   * The number of structural features of the '<em>Enforcement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENFORCEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ServiceImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getService()
   * @generated
   */
  int SERVICE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Servicename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__SERVICENAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Refprivatedata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__REFPRIVATEDATA = 3;

  /**
   * The feature id for the '<em><b>Servicepartof</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__SERVICEPARTOF = 4;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl <em>Recipient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRecipient()
   * @generated
   */
  int RECIPIENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Recipientname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__RECIPIENTNAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Partof</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__PARTOF = 3;

  /**
   * The feature id for the '<em><b>Recipient Scope Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__RECIPIENT_SCOPE_KIND = 4;

  /**
   * The feature id for the '<em><b>Recipient Type Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__RECIPIENT_TYPE_KIND = 5;

  /**
   * The number of structural features of the '<em>Recipient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.PrivateDataImpl <em>Private Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.PrivateDataImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getPrivateData()
   * @generated
   */
  int PRIVATE_DATA = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_DATA__NAME = 0;

  /**
   * The feature id for the '<em><b>Privatedata</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_DATA__PRIVATEDATA = 1;

  /**
   * The feature id for the '<em><b>Private Data Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_DATA__PRIVATE_DATA_KIND = 2;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_DATA__ATTRIBUTE = 3;

  /**
   * The number of structural features of the '<em>Private Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_DATA_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.AttributeImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATTRIBUTE_NAME = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.CollectionImpl <em>Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.CollectionImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getCollection()
   * @generated
   */
  int COLLECTION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__CONDITION = 2;

  /**
   * The feature id for the '<em><b>Partof</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__PARTOF = 3;

  /**
   * The feature id for the '<em><b>Refprivatedata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__REFPRIVATEDATA = 4;

  /**
   * The feature id for the '<em><b>Refertoservice</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__REFERTOSERVICE = 5;

  /**
   * The feature id for the '<em><b>Referto Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__REFERTO_ENFORCEMENT = 6;

  /**
   * The feature id for the '<em><b>Modalitykind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__MODALITYKIND = 7;

  /**
   * The number of structural features of the '<em>Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl <em>Disclosure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getDisclosure()
   * @generated
   */
  int DISCLOSURE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__CONDITION = 2;

  /**
   * The feature id for the '<em><b>Partof</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__PARTOF = 3;

  /**
   * The feature id for the '<em><b>Refer To Recipient</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REFER_TO_RECIPIENT = 4;

  /**
   * The feature id for the '<em><b>Refer To Recipientsource</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REFER_TO_RECIPIENTSOURCE = 5;

  /**
   * The feature id for the '<em><b>Refer To Recipienttarget</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REFER_TO_RECIPIENTTARGET = 6;

  /**
   * The feature id for the '<em><b>Refprivatedata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REFPRIVATEDATA = 7;

  /**
   * The feature id for the '<em><b>Refertoservice</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REFERTOSERVICE = 8;

  /**
   * The feature id for the '<em><b>Referto Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REFERTO_ENFORCEMENT = 9;

  /**
   * The feature id for the '<em><b>Modalitykind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__MODALITYKIND = 10;

  /**
   * The number of structural features of the '<em>Disclosure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl <em>Retention</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRetention()
   * @generated
   */
  int RETENTION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__CONDITION = 2;

  /**
   * The feature id for the '<em><b>Partof</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__PARTOF = 3;

  /**
   * The feature id for the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__PERIOD = 4;

  /**
   * The feature id for the '<em><b>Refprivatedata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__REFPRIVATEDATA = 5;

  /**
   * The feature id for the '<em><b>Refertoservice</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__REFERTOSERVICE = 6;

  /**
   * The feature id for the '<em><b>Referto Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__REFERTO_ENFORCEMENT = 7;

  /**
   * The feature id for the '<em><b>Modalitykind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__MODALITYKIND = 8;

  /**
   * The number of structural features of the '<em>Retention</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.UsageImpl <em>Usage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.UsageImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getUsage()
   * @generated
   */
  int USAGE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__CONDITION = 2;

  /**
   * The feature id for the '<em><b>Partof</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__PARTOF = 3;

  /**
   * The feature id for the '<em><b>Refprivatedata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__REFPRIVATEDATA = 4;

  /**
   * The feature id for the '<em><b>Refertoservice</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__REFERTOSERVICE = 5;

  /**
   * The feature id for the '<em><b>Referto Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__REFERTO_ENFORCEMENT = 6;

  /**
   * The feature id for the '<em><b>Modalitykind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__MODALITYKIND = 7;

  /**
   * The number of structural features of the '<em>Usage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.InformativeImpl <em>Informative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.InformativeImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getInformative()
   * @generated
   */
  int INFORMATIVE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__CONDITION = 2;

  /**
   * The feature id for the '<em><b>Partof</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__PARTOF = 3;

  /**
   * The feature id for the '<em><b>Refprivatedata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__REFPRIVATEDATA = 4;

  /**
   * The feature id for the '<em><b>Refertoservice</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__REFERTOSERVICE = 5;

  /**
   * The feature id for the '<em><b>Referto Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__REFERTO_ENFORCEMENT = 6;

  /**
   * The feature id for the '<em><b>Modalitykind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__MODALITYKIND = 7;

  /**
   * The number of structural features of the '<em>Informative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.PartofImpl <em>Partof</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.PartofImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getPartof()
   * @generated
   */
  int PARTOF = 12;

  /**
   * The feature id for the '<em><b>Partof</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTOF__PARTOF = 0;

  /**
   * The number of structural features of the '<em>Partof</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTOF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToRecipientImpl <em>Refer To Recipient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToRecipientImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getReferToRecipient()
   * @generated
   */
  int REFER_TO_RECIPIENT = 13;

  /**
   * The feature id for the '<em><b>Refertore</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_RECIPIENT__REFERTORE = 0;

  /**
   * The number of structural features of the '<em>Refer To Recipient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_RECIPIENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToRecipientSourceImpl <em>Refer To Recipient Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToRecipientSourceImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getReferToRecipientSource()
   * @generated
   */
  int REFER_TO_RECIPIENT_SOURCE = 14;

  /**
   * The feature id for the '<em><b>Refertore</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_RECIPIENT_SOURCE__REFERTORE = 0;

  /**
   * The number of structural features of the '<em>Refer To Recipient Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_RECIPIENT_SOURCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToRecipientTargetImpl <em>Refer To Recipient Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToRecipientTargetImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getReferToRecipientTarget()
   * @generated
   */
  int REFER_TO_RECIPIENT_TARGET = 15;

  /**
   * The feature id for the '<em><b>Refertore</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_RECIPIENT_TARGET__REFERTORE = 0;

  /**
   * The number of structural features of the '<em>Refer To Recipient Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_RECIPIENT_TARGET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToServiceImpl <em>Refer To Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToServiceImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getReferToService()
   * @generated
   */
  int REFER_TO_SERVICE = 16;

  /**
   * The feature id for the '<em><b>Refertose</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_SERVICE__REFERTOSE = 0;

  /**
   * The number of structural features of the '<em>Refer To Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFER_TO_SERVICE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServicePartofImpl <em>Service Partof</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ServicePartofImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getServicePartof()
   * @generated
   */
  int SERVICE_PARTOF = 17;

  /**
   * The feature id for the '<em><b>Refertoservice</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PARTOF__REFERTOSERVICE = 0;

  /**
   * The number of structural features of the '<em>Service Partof</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PARTOF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefPrivateDataImpl <em>Ref Private Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RefPrivateDataImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRefPrivateData()
   * @generated
   */
  int REF_PRIVATE_DATA = 18;

  /**
   * The feature id for the '<em><b>Refpr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_PRIVATE_DATA__REFPR = 0;

  /**
   * The number of structural features of the '<em>Ref Private Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_PRIVATE_DATA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefertoEnforcementImpl <em>Referto Enforcement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RefertoEnforcementImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRefertoEnforcement()
   * @generated
   */
  int REFERTO_ENFORCEMENT = 19;

  /**
   * The feature id for the '<em><b>Refst</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERTO_ENFORCEMENT__REFST = 0;

  /**
   * The number of structural features of the '<em>Referto Enforcement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERTO_ENFORCEMENT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Policy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Policy</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Policy
   * @generated
   */
  EClass getPolicy();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Policy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Policy#getName()
   * @see #getPolicy()
   * @generated
   */
  EAttribute getPolicy_Name();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Policy#getImportelements <em>Importelements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Importelements</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Policy#getImportelements()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Importelements();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Policy#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Collection</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Policy#getCollection()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Collection();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Policy#getDisclosure <em>Disclosure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Disclosure</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Policy#getDisclosure()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Disclosure();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Policy#getRetention <em>Retention</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Retention</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Policy#getRetention()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Retention();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Policy#getUsage <em>Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usage</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Policy#getUsage()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Usage();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Policy#getInformative <em>Informative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Informative</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Policy#getInformative()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Informative();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Policy#getPrivateData <em>Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Private Data</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Policy#getPrivateData()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_PrivateData();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Policy#getRecipient <em>Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Recipient</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Policy#getRecipient()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Recipient();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Policy#getService <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Policy#getService()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Service();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Policy#getEnforcement <em>Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enforcement</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Policy#getEnforcement()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Enforcement();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Enforcement <em>Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enforcement</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Enforcement
   * @generated
   */
  EClass getEnforcement();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Enforcement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Enforcement#getName()
   * @see #getEnforcement()
   * @generated
   */
  EAttribute getEnforcement_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Enforcement#getEnforcementName <em>Enforcement Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enforcement Name</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Enforcement#getEnforcementName()
   * @see #getEnforcement()
   * @generated
   */
  EAttribute getEnforcement_EnforcementName();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Enforcement#getEnforcementDescription <em>Enforcement Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enforcement Description</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Enforcement#getEnforcementDescription()
   * @see #getEnforcement()
   * @generated
   */
  EAttribute getEnforcement_EnforcementDescription();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Enforcement#getEnforcementKind <em>Enforcement Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enforcement Kind</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Enforcement#getEnforcementKind()
   * @see #getEnforcement()
   * @generated
   */
  EAttribute getEnforcement_EnforcementKind();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getServicename <em>Servicename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Servicename</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Service#getServicename()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Servicename();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Service#getDescription()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Description();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getRefprivatedata <em>Refprivatedata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refprivatedata</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Service#getRefprivatedata()
   * @see #getService()
   * @generated
   */
  EReference getService_Refprivatedata();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getServicepartof <em>Servicepartof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Servicepartof</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Service#getServicepartof()
   * @see #getService()
   * @generated
   */
  EReference getService_Servicepartof();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient <em>Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recipient</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Recipient
   * @generated
   */
  EClass getRecipient();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getName()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getRecipientname <em>Recipientname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recipientname</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getRecipientname()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_Recipientname();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getDescription()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_Description();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Partof</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getPartof()
   * @see #getRecipient()
   * @generated
   */
  EReference getRecipient_Partof();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getRecipientScopeKind <em>Recipient Scope Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recipient Scope Kind</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getRecipientScopeKind()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_RecipientScopeKind();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getRecipientTypeKind <em>Recipient Type Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recipient Type Kind</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getRecipientTypeKind()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_RecipientTypeKind();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData <em>Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Private Data</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.PrivateData
   * @generated
   */
  EClass getPrivateData();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getName()
   * @see #getPrivateData()
   * @generated
   */
  EAttribute getPrivateData_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getPrivatedata <em>Privatedata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Privatedata</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getPrivatedata()
   * @see #getPrivateData()
   * @generated
   */
  EAttribute getPrivateData_Privatedata();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getPrivateDataKind <em>Private Data Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Private Data Kind</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getPrivateDataKind()
   * @see #getPrivateData()
   * @generated
   */
  EAttribute getPrivateData_PrivateDataKind();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getAttribute()
   * @see #getPrivateData()
   * @generated
   */
  EReference getPrivateData_Attribute();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Attribute#getAttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Name</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Attribute#getAttributeName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_AttributeName();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Collection
   * @generated
   */
  EClass getCollection();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Collection#getName()
   * @see #getCollection()
   * @generated
   */
  EAttribute getCollection_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Collection#getDescription()
   * @see #getCollection()
   * @generated
   */
  EAttribute getCollection_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Collection#getCondition()
   * @see #getCollection()
   * @generated
   */
  EAttribute getCollection_Condition();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Partof</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Collection#getPartof()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_Partof();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getRefprivatedata <em>Refprivatedata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refprivatedata</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Collection#getRefprivatedata()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_Refprivatedata();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Collection#getRefertoservice()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_Refertoservice();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getRefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referto Enforcement</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Collection#getRefertoEnforcement()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_RefertoEnforcement();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getModalitykind <em>Modalitykind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modalitykind</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Collection#getModalitykind()
   * @see #getCollection()
   * @generated
   */
  EAttribute getCollection_Modalitykind();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure <em>Disclosure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disclosure</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure
   * @generated
   */
  EClass getDisclosure();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getName()
   * @see #getDisclosure()
   * @generated
   */
  EAttribute getDisclosure_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getDescription()
   * @see #getDisclosure()
   * @generated
   */
  EAttribute getDisclosure_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getCondition()
   * @see #getDisclosure()
   * @generated
   */
  EAttribute getDisclosure_Condition();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Partof</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getPartof()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_Partof();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getReferToRecipient <em>Refer To Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refer To Recipient</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getReferToRecipient()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_ReferToRecipient();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getReferToRecipientsource <em>Refer To Recipientsource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refer To Recipientsource</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getReferToRecipientsource()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_ReferToRecipientsource();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getReferToRecipienttarget <em>Refer To Recipienttarget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refer To Recipienttarget</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getReferToRecipienttarget()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_ReferToRecipienttarget();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefprivatedata <em>Refprivatedata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refprivatedata</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefprivatedata()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_Refprivatedata();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefertoservice()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_Refertoservice();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referto Enforcement</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefertoEnforcement()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_RefertoEnforcement();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getModalitykind <em>Modalitykind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modalitykind</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getModalitykind()
   * @see #getDisclosure()
   * @generated
   */
  EAttribute getDisclosure_Modalitykind();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention <em>Retention</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Retention</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention
   * @generated
   */
  EClass getRetention();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention#getName()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention#getDescription()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention#getCondition()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Condition();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Partof</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention#getPartof()
   * @see #getRetention()
   * @generated
   */
  EReference getRetention_Partof();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention#getPeriod <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Period</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention#getPeriod()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Period();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention#getRefprivatedata <em>Refprivatedata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refprivatedata</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention#getRefprivatedata()
   * @see #getRetention()
   * @generated
   */
  EReference getRetention_Refprivatedata();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention#getRefertoservice()
   * @see #getRetention()
   * @generated
   */
  EReference getRetention_Refertoservice();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention#getRefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referto Enforcement</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention#getRefertoEnforcement()
   * @see #getRetention()
   * @generated
   */
  EReference getRetention_RefertoEnforcement();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention#getModalitykind <em>Modalitykind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modalitykind</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention#getModalitykind()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Modalitykind();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Usage <em>Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Usage</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Usage
   * @generated
   */
  EClass getUsage();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Usage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Usage#getName()
   * @see #getUsage()
   * @generated
   */
  EAttribute getUsage_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Usage#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Usage#getDescription()
   * @see #getUsage()
   * @generated
   */
  EAttribute getUsage_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Usage#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Usage#getCondition()
   * @see #getUsage()
   * @generated
   */
  EAttribute getUsage_Condition();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.Usage#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Partof</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Usage#getPartof()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_Partof();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Usage#getRefprivatedata <em>Refprivatedata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refprivatedata</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Usage#getRefprivatedata()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_Refprivatedata();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Usage#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Usage#getRefertoservice()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_Refertoservice();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Usage#getRefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referto Enforcement</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Usage#getRefertoEnforcement()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_RefertoEnforcement();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Usage#getModalitykind <em>Modalitykind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modalitykind</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Usage#getModalitykind()
   * @see #getUsage()
   * @generated
   */
  EAttribute getUsage_Modalitykind();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Informative <em>Informative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Informative</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Informative
   * @generated
   */
  EClass getInformative();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Informative#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Informative#getName()
   * @see #getInformative()
   * @generated
   */
  EAttribute getInformative_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Informative#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Informative#getDescription()
   * @see #getInformative()
   * @generated
   */
  EAttribute getInformative_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Informative#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Informative#getCondition()
   * @see #getInformative()
   * @generated
   */
  EAttribute getInformative_Condition();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.Informative#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Partof</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Informative#getPartof()
   * @see #getInformative()
   * @generated
   */
  EReference getInformative_Partof();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Informative#getRefprivatedata <em>Refprivatedata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refprivatedata</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Informative#getRefprivatedata()
   * @see #getInformative()
   * @generated
   */
  EReference getInformative_Refprivatedata();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Informative#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Informative#getRefertoservice()
   * @see #getInformative()
   * @generated
   */
  EReference getInformative_Refertoservice();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Informative#getRefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referto Enforcement</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Informative#getRefertoEnforcement()
   * @see #getInformative()
   * @generated
   */
  EReference getInformative_RefertoEnforcement();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Informative#getModalitykind <em>Modalitykind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modalitykind</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Informative#getModalitykind()
   * @see #getInformative()
   * @generated
   */
  EAttribute getInformative_Modalitykind();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.Partof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Partof</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Partof
   * @generated
   */
  EClass getPartof();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.Partof#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Partof</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Partof#getPartof()
   * @see #getPartof()
   * @generated
   */
  EReference getPartof_Partof();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipient <em>Refer To Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refer To Recipient</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipient
   * @generated
   */
  EClass getReferToRecipient();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipient#getRefertore <em>Refertore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refertore</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipient#getRefertore()
   * @see #getReferToRecipient()
   * @generated
   */
  EReference getReferToRecipient_Refertore();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipientSource <em>Refer To Recipient Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refer To Recipient Source</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipientSource
   * @generated
   */
  EClass getReferToRecipientSource();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipientSource#getRefertore <em>Refertore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refertore</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipientSource#getRefertore()
   * @see #getReferToRecipientSource()
   * @generated
   */
  EReference getReferToRecipientSource_Refertore();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipientTarget <em>Refer To Recipient Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refer To Recipient Target</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipientTarget
   * @generated
   */
  EClass getReferToRecipientTarget();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipientTarget#getRefertore <em>Refertore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refertore</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipientTarget#getRefertore()
   * @see #getReferToRecipientTarget()
   * @generated
   */
  EReference getReferToRecipientTarget_Refertore();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.ReferToService <em>Refer To Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refer To Service</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ReferToService
   * @generated
   */
  EClass getReferToService();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.ReferToService#getRefertose <em>Refertose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refertose</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ReferToService#getRefertose()
   * @see #getReferToService()
   * @generated
   */
  EReference getReferToService_Refertose();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.ServicePartof <em>Service Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Partof</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ServicePartof
   * @generated
   */
  EClass getServicePartof();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.ServicePartof#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refertoservice</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ServicePartof#getRefertoservice()
   * @see #getServicePartof()
   * @generated
   */
  EReference getServicePartof_Refertoservice();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData <em>Ref Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Private Data</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData
   * @generated
   */
  EClass getRefPrivateData();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData#getRefpr <em>Refpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refpr</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData#getRefpr()
   * @see #getRefPrivateData()
   * @generated
   */
  EReference getRefPrivateData_Refpr();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referto Enforcement</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefertoEnforcement
   * @generated
   */
  EClass getRefertoEnforcement();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefertoEnforcement#getRefst <em>Refst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refst</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefertoEnforcement#getRefst()
   * @see #getRefertoEnforcement()
   * @generated
   */
  EReference getRefertoEnforcement_Refst();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RSLIL4PrivacyFactory getRSLIL4PrivacyFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.PolicyImpl <em>Policy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.PolicyImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getPolicy()
     * @generated
     */
    EClass POLICY = eINSTANCE.getPolicy();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLICY__NAME = eINSTANCE.getPolicy_Name();

    /**
     * The meta object literal for the '<em><b>Importelements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__IMPORTELEMENTS = eINSTANCE.getPolicy_Importelements();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__COLLECTION = eINSTANCE.getPolicy_Collection();

    /**
     * The meta object literal for the '<em><b>Disclosure</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__DISCLOSURE = eINSTANCE.getPolicy_Disclosure();

    /**
     * The meta object literal for the '<em><b>Retention</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__RETENTION = eINSTANCE.getPolicy_Retention();

    /**
     * The meta object literal for the '<em><b>Usage</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__USAGE = eINSTANCE.getPolicy_Usage();

    /**
     * The meta object literal for the '<em><b>Informative</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__INFORMATIVE = eINSTANCE.getPolicy_Informative();

    /**
     * The meta object literal for the '<em><b>Private Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__PRIVATE_DATA = eINSTANCE.getPolicy_PrivateData();

    /**
     * The meta object literal for the '<em><b>Recipient</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__RECIPIENT = eINSTANCE.getPolicy_Recipient();

    /**
     * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__SERVICE = eINSTANCE.getPolicy_Service();

    /**
     * The meta object literal for the '<em><b>Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__ENFORCEMENT = eINSTANCE.getPolicy_Enforcement();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ImportImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.EnforcementImpl <em>Enforcement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.EnforcementImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getEnforcement()
     * @generated
     */
    EClass ENFORCEMENT = eINSTANCE.getEnforcement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENFORCEMENT__NAME = eINSTANCE.getEnforcement_Name();

    /**
     * The meta object literal for the '<em><b>Enforcement Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENFORCEMENT__ENFORCEMENT_NAME = eINSTANCE.getEnforcement_EnforcementName();

    /**
     * The meta object literal for the '<em><b>Enforcement Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENFORCEMENT__ENFORCEMENT_DESCRIPTION = eINSTANCE.getEnforcement_EnforcementDescription();

    /**
     * The meta object literal for the '<em><b>Enforcement Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENFORCEMENT__ENFORCEMENT_KIND = eINSTANCE.getEnforcement_EnforcementKind();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ServiceImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '<em><b>Servicename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__SERVICENAME = eINSTANCE.getService_Servicename();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

    /**
     * The meta object literal for the '<em><b>Refprivatedata</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__REFPRIVATEDATA = eINSTANCE.getService_Refprivatedata();

    /**
     * The meta object literal for the '<em><b>Servicepartof</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__SERVICEPARTOF = eINSTANCE.getService_Servicepartof();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl <em>Recipient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRecipient()
     * @generated
     */
    EClass RECIPIENT = eINSTANCE.getRecipient();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPIENT__NAME = eINSTANCE.getRecipient_Name();

    /**
     * The meta object literal for the '<em><b>Recipientname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPIENT__RECIPIENTNAME = eINSTANCE.getRecipient_Recipientname();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPIENT__DESCRIPTION = eINSTANCE.getRecipient_Description();

    /**
     * The meta object literal for the '<em><b>Partof</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPIENT__PARTOF = eINSTANCE.getRecipient_Partof();

    /**
     * The meta object literal for the '<em><b>Recipient Scope Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPIENT__RECIPIENT_SCOPE_KIND = eINSTANCE.getRecipient_RecipientScopeKind();

    /**
     * The meta object literal for the '<em><b>Recipient Type Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPIENT__RECIPIENT_TYPE_KIND = eINSTANCE.getRecipient_RecipientTypeKind();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.PrivateDataImpl <em>Private Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.PrivateDataImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getPrivateData()
     * @generated
     */
    EClass PRIVATE_DATA = eINSTANCE.getPrivateData();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIVATE_DATA__NAME = eINSTANCE.getPrivateData_Name();

    /**
     * The meta object literal for the '<em><b>Privatedata</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIVATE_DATA__PRIVATEDATA = eINSTANCE.getPrivateData_Privatedata();

    /**
     * The meta object literal for the '<em><b>Private Data Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIVATE_DATA__PRIVATE_DATA_KIND = eINSTANCE.getPrivateData_PrivateDataKind();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIVATE_DATA__ATTRIBUTE = eINSTANCE.getPrivateData_Attribute();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.AttributeImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ATTRIBUTE_NAME = eINSTANCE.getAttribute_AttributeName();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.CollectionImpl <em>Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.CollectionImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getCollection()
     * @generated
     */
    EClass COLLECTION = eINSTANCE.getCollection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION__NAME = eINSTANCE.getCollection_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION__DESCRIPTION = eINSTANCE.getCollection_Description();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION__CONDITION = eINSTANCE.getCollection_Condition();

    /**
     * The meta object literal for the '<em><b>Partof</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__PARTOF = eINSTANCE.getCollection_Partof();

    /**
     * The meta object literal for the '<em><b>Refprivatedata</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__REFPRIVATEDATA = eINSTANCE.getCollection_Refprivatedata();

    /**
     * The meta object literal for the '<em><b>Refertoservice</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__REFERTOSERVICE = eINSTANCE.getCollection_Refertoservice();

    /**
     * The meta object literal for the '<em><b>Referto Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__REFERTO_ENFORCEMENT = eINSTANCE.getCollection_RefertoEnforcement();

    /**
     * The meta object literal for the '<em><b>Modalitykind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION__MODALITYKIND = eINSTANCE.getCollection_Modalitykind();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl <em>Disclosure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getDisclosure()
     * @generated
     */
    EClass DISCLOSURE = eINSTANCE.getDisclosure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISCLOSURE__NAME = eINSTANCE.getDisclosure_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISCLOSURE__DESCRIPTION = eINSTANCE.getDisclosure_Description();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISCLOSURE__CONDITION = eINSTANCE.getDisclosure_Condition();

    /**
     * The meta object literal for the '<em><b>Partof</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__PARTOF = eINSTANCE.getDisclosure_Partof();

    /**
     * The meta object literal for the '<em><b>Refer To Recipient</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REFER_TO_RECIPIENT = eINSTANCE.getDisclosure_ReferToRecipient();

    /**
     * The meta object literal for the '<em><b>Refer To Recipientsource</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REFER_TO_RECIPIENTSOURCE = eINSTANCE.getDisclosure_ReferToRecipientsource();

    /**
     * The meta object literal for the '<em><b>Refer To Recipienttarget</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REFER_TO_RECIPIENTTARGET = eINSTANCE.getDisclosure_ReferToRecipienttarget();

    /**
     * The meta object literal for the '<em><b>Refprivatedata</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REFPRIVATEDATA = eINSTANCE.getDisclosure_Refprivatedata();

    /**
     * The meta object literal for the '<em><b>Refertoservice</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REFERTOSERVICE = eINSTANCE.getDisclosure_Refertoservice();

    /**
     * The meta object literal for the '<em><b>Referto Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REFERTO_ENFORCEMENT = eINSTANCE.getDisclosure_RefertoEnforcement();

    /**
     * The meta object literal for the '<em><b>Modalitykind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISCLOSURE__MODALITYKIND = eINSTANCE.getDisclosure_Modalitykind();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl <em>Retention</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRetention()
     * @generated
     */
    EClass RETENTION = eINSTANCE.getRetention();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETENTION__NAME = eINSTANCE.getRetention_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETENTION__DESCRIPTION = eINSTANCE.getRetention_Description();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETENTION__CONDITION = eINSTANCE.getRetention_Condition();

    /**
     * The meta object literal for the '<em><b>Partof</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETENTION__PARTOF = eINSTANCE.getRetention_Partof();

    /**
     * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETENTION__PERIOD = eINSTANCE.getRetention_Period();

    /**
     * The meta object literal for the '<em><b>Refprivatedata</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETENTION__REFPRIVATEDATA = eINSTANCE.getRetention_Refprivatedata();

    /**
     * The meta object literal for the '<em><b>Refertoservice</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETENTION__REFERTOSERVICE = eINSTANCE.getRetention_Refertoservice();

    /**
     * The meta object literal for the '<em><b>Referto Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETENTION__REFERTO_ENFORCEMENT = eINSTANCE.getRetention_RefertoEnforcement();

    /**
     * The meta object literal for the '<em><b>Modalitykind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETENTION__MODALITYKIND = eINSTANCE.getRetention_Modalitykind();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.UsageImpl <em>Usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.UsageImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getUsage()
     * @generated
     */
    EClass USAGE = eINSTANCE.getUsage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USAGE__NAME = eINSTANCE.getUsage_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USAGE__DESCRIPTION = eINSTANCE.getUsage_Description();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USAGE__CONDITION = eINSTANCE.getUsage_Condition();

    /**
     * The meta object literal for the '<em><b>Partof</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USAGE__PARTOF = eINSTANCE.getUsage_Partof();

    /**
     * The meta object literal for the '<em><b>Refprivatedata</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USAGE__REFPRIVATEDATA = eINSTANCE.getUsage_Refprivatedata();

    /**
     * The meta object literal for the '<em><b>Refertoservice</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USAGE__REFERTOSERVICE = eINSTANCE.getUsage_Refertoservice();

    /**
     * The meta object literal for the '<em><b>Referto Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USAGE__REFERTO_ENFORCEMENT = eINSTANCE.getUsage_RefertoEnforcement();

    /**
     * The meta object literal for the '<em><b>Modalitykind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USAGE__MODALITYKIND = eINSTANCE.getUsage_Modalitykind();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.InformativeImpl <em>Informative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.InformativeImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getInformative()
     * @generated
     */
    EClass INFORMATIVE = eINSTANCE.getInformative();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFORMATIVE__NAME = eINSTANCE.getInformative_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFORMATIVE__DESCRIPTION = eINSTANCE.getInformative_Description();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFORMATIVE__CONDITION = eINSTANCE.getInformative_Condition();

    /**
     * The meta object literal for the '<em><b>Partof</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFORMATIVE__PARTOF = eINSTANCE.getInformative_Partof();

    /**
     * The meta object literal for the '<em><b>Refprivatedata</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFORMATIVE__REFPRIVATEDATA = eINSTANCE.getInformative_Refprivatedata();

    /**
     * The meta object literal for the '<em><b>Refertoservice</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFORMATIVE__REFERTOSERVICE = eINSTANCE.getInformative_Refertoservice();

    /**
     * The meta object literal for the '<em><b>Referto Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFORMATIVE__REFERTO_ENFORCEMENT = eINSTANCE.getInformative_RefertoEnforcement();

    /**
     * The meta object literal for the '<em><b>Modalitykind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFORMATIVE__MODALITYKIND = eINSTANCE.getInformative_Modalitykind();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.PartofImpl <em>Partof</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.PartofImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getPartof()
     * @generated
     */
    EClass PARTOF = eINSTANCE.getPartof();

    /**
     * The meta object literal for the '<em><b>Partof</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTOF__PARTOF = eINSTANCE.getPartof_Partof();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToRecipientImpl <em>Refer To Recipient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToRecipientImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getReferToRecipient()
     * @generated
     */
    EClass REFER_TO_RECIPIENT = eINSTANCE.getReferToRecipient();

    /**
     * The meta object literal for the '<em><b>Refertore</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFER_TO_RECIPIENT__REFERTORE = eINSTANCE.getReferToRecipient_Refertore();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToRecipientSourceImpl <em>Refer To Recipient Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToRecipientSourceImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getReferToRecipientSource()
     * @generated
     */
    EClass REFER_TO_RECIPIENT_SOURCE = eINSTANCE.getReferToRecipientSource();

    /**
     * The meta object literal for the '<em><b>Refertore</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFER_TO_RECIPIENT_SOURCE__REFERTORE = eINSTANCE.getReferToRecipientSource_Refertore();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToRecipientTargetImpl <em>Refer To Recipient Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToRecipientTargetImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getReferToRecipientTarget()
     * @generated
     */
    EClass REFER_TO_RECIPIENT_TARGET = eINSTANCE.getReferToRecipientTarget();

    /**
     * The meta object literal for the '<em><b>Refertore</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFER_TO_RECIPIENT_TARGET__REFERTORE = eINSTANCE.getReferToRecipientTarget_Refertore();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToServiceImpl <em>Refer To Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToServiceImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getReferToService()
     * @generated
     */
    EClass REFER_TO_SERVICE = eINSTANCE.getReferToService();

    /**
     * The meta object literal for the '<em><b>Refertose</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFER_TO_SERVICE__REFERTOSE = eINSTANCE.getReferToService_Refertose();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServicePartofImpl <em>Service Partof</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ServicePartofImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getServicePartof()
     * @generated
     */
    EClass SERVICE_PARTOF = eINSTANCE.getServicePartof();

    /**
     * The meta object literal for the '<em><b>Refertoservice</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PARTOF__REFERTOSERVICE = eINSTANCE.getServicePartof_Refertoservice();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefPrivateDataImpl <em>Ref Private Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RefPrivateDataImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRefPrivateData()
     * @generated
     */
    EClass REF_PRIVATE_DATA = eINSTANCE.getRefPrivateData();

    /**
     * The meta object literal for the '<em><b>Refpr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_PRIVATE_DATA__REFPR = eINSTANCE.getRefPrivateData_Refpr();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefertoEnforcementImpl <em>Referto Enforcement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RefertoEnforcementImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRefertoEnforcement()
     * @generated
     */
    EClass REFERTO_ENFORCEMENT = eINSTANCE.getRefertoEnforcement();

    /**
     * The meta object literal for the '<em><b>Refst</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERTO_ENFORCEMENT__REFST = eINSTANCE.getRefertoEnforcement_Refst();

  }

} //RSLIL4PrivacyPackage
