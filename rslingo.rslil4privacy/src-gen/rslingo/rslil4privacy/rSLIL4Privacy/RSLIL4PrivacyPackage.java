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
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENFORCEMENT__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENFORCEMENT__TYPE = 3;

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
   * The feature id for the '<em><b>Service Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__SERVICE_NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Ref Private Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__REF_PRIVATE_DATA = 3;

  /**
   * The feature id for the '<em><b>Service Part</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__SERVICE_PART = 4;

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
   * The feature id for the '<em><b>Recipient Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__RECIPIENT_NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Recipient Part</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__RECIPIENT_PART = 3;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__SCOPE = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT__TYPE = 5;

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
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_DATA__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_DATA__TYPE = 2;

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
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DESCRIPTION = 1;

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
   * The feature id for the '<em><b>Part Collection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__PART_COLLECTION = 3;

  /**
   * The feature id for the '<em><b>Ref Private Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__REF_PRIVATE_DATA = 4;

  /**
   * The feature id for the '<em><b>Ref Service</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__REF_SERVICE = 5;

  /**
   * The feature id for the '<em><b>Ref Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__REF_ENFORCEMENT = 6;

  /**
   * The feature id for the '<em><b>Modality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION__MODALITY = 7;

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
   * The feature id for the '<em><b>Part Disclosure</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__PART_DISCLOSURE = 3;

  /**
   * The feature id for the '<em><b>Ref Recipient</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REF_RECIPIENT = 4;

  /**
   * The feature id for the '<em><b>Ref Recipient Source</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REF_RECIPIENT_SOURCE = 5;

  /**
   * The feature id for the '<em><b>Ref Recipient Target</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REF_RECIPIENT_TARGET = 6;

  /**
   * The feature id for the '<em><b>Ref Private Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REF_PRIVATE_DATA = 7;

  /**
   * The feature id for the '<em><b>Ref Service</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REF_SERVICE = 8;

  /**
   * The feature id for the '<em><b>Ref Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__REF_ENFORCEMENT = 9;

  /**
   * The feature id for the '<em><b>Modality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCLOSURE__MODALITY = 10;

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
   * The feature id for the '<em><b>Part Retention</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__PART_RETENTION = 3;

  /**
   * The feature id for the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__PERIOD = 4;

  /**
   * The feature id for the '<em><b>Ref Private Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__REF_PRIVATE_DATA = 5;

  /**
   * The feature id for the '<em><b>Ref Service</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__REF_SERVICE = 6;

  /**
   * The feature id for the '<em><b>Ref Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__REF_ENFORCEMENT = 7;

  /**
   * The feature id for the '<em><b>Modality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETENTION__MODALITY = 8;

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
   * The feature id for the '<em><b>Part Usage</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__PART_USAGE = 3;

  /**
   * The feature id for the '<em><b>Ref Private Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__REF_PRIVATE_DATA = 4;

  /**
   * The feature id for the '<em><b>Ref Service</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__REF_SERVICE = 5;

  /**
   * The feature id for the '<em><b>Ref Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__REF_ENFORCEMENT = 6;

  /**
   * The feature id for the '<em><b>Modality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__MODALITY = 7;

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
   * The feature id for the '<em><b>Part Informative</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__PART_INFORMATIVE = 3;

  /**
   * The feature id for the '<em><b>Ref Private Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__REF_PRIVATE_DATA = 4;

  /**
   * The feature id for the '<em><b>Ref Service</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__REF_SERVICE = 5;

  /**
   * The feature id for the '<em><b>Ref Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__REF_ENFORCEMENT = 6;

  /**
   * The feature id for the '<em><b>Modality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE__MODALITY = 7;

  /**
   * The number of structural features of the '<em>Informative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATIVE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientPartImpl <em>Recipient Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientPartImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRecipientPart()
   * @generated
   */
  int RECIPIENT_PART = 12;

  /**
   * The feature id for the '<em><b>Recipient Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT_PART__RECIPIENT_PART = 0;

  /**
   * The number of structural features of the '<em>Recipient Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECIPIENT_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientImpl <em>Ref Recipient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRefRecipient()
   * @generated
   */
  int REF_RECIPIENT = 13;

  /**
   * The feature id for the '<em><b>Ref Recipient</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_RECIPIENT__REF_RECIPIENT = 0;

  /**
   * The number of structural features of the '<em>Ref Recipient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_RECIPIENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientSourceImpl <em>Ref Recipient Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientSourceImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRefRecipientSource()
   * @generated
   */
  int REF_RECIPIENT_SOURCE = 14;

  /**
   * The feature id for the '<em><b>Ref Recipient Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_RECIPIENT_SOURCE__REF_RECIPIENT_SOURCE = 0;

  /**
   * The number of structural features of the '<em>Ref Recipient Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_RECIPIENT_SOURCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientTargetImpl <em>Ref Recipient Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientTargetImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRefRecipientTarget()
   * @generated
   */
  int REF_RECIPIENT_TARGET = 15;

  /**
   * The feature id for the '<em><b>Ref Recipient Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_RECIPIENT_TARGET__REF_RECIPIENT_TARGET = 0;

  /**
   * The number of structural features of the '<em>Ref Recipient Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_RECIPIENT_TARGET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefServiceImpl <em>Ref Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RefServiceImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRefService()
   * @generated
   */
  int REF_SERVICE = 16;

  /**
   * The feature id for the '<em><b>Ref Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_SERVICE__REF_SERVICE = 0;

  /**
   * The number of structural features of the '<em>Ref Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_SERVICE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServicePartImpl <em>Service Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ServicePartImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getServicePart()
   * @generated
   */
  int SERVICE_PART = 17;

  /**
   * The feature id for the '<em><b>Service Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PART__SERVICE_PART = 0;

  /**
   * The number of structural features of the '<em>Service Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PART_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Ref Private Data</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_PRIVATE_DATA__REF_PRIVATE_DATA = 0;

  /**
   * The number of structural features of the '<em>Ref Private Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_PRIVATE_DATA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefEnforcementImpl <em>Ref Enforcement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RefEnforcementImpl
   * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRefEnforcement()
   * @generated
   */
  int REF_ENFORCEMENT = 19;

  /**
   * The feature id for the '<em><b>Ref Enforcement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ENFORCEMENT__REF_ENFORCEMENT = 0;

  /**
   * The number of structural features of the '<em>Ref Enforcement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ENFORCEMENT_FEATURE_COUNT = 1;


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
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Enforcement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Enforcement#getDescription()
   * @see #getEnforcement()
   * @generated
   */
  EAttribute getEnforcement_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Enforcement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Enforcement#getType()
   * @see #getEnforcement()
   * @generated
   */
  EAttribute getEnforcement_Type();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getServiceName <em>Service Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Service Name</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Service#getServiceName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_ServiceName();

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
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getRefPrivateData <em>Ref Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Private Data</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Service#getRefPrivateData()
   * @see #getService()
   * @generated
   */
  EReference getService_RefPrivateData();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getServicePart <em>Service Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Part</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Service#getServicePart()
   * @see #getService()
   * @generated
   */
  EReference getService_ServicePart();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getRecipientName <em>Recipient Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recipient Name</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getRecipientName()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_RecipientName();

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
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getRecipientPart <em>Recipient Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Recipient Part</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getRecipientPart()
   * @see #getRecipient()
   * @generated
   */
  EReference getRecipient_RecipientPart();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scope</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getScope()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_Scope();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Recipient#getType()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_Type();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getDescription()
   * @see #getPrivateData()
   * @generated
   */
  EAttribute getPrivateData_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getType()
   * @see #getPrivateData()
   * @generated
   */
  EAttribute getPrivateData_Type();

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
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Attribute#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Attribute#getDescription()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Description();

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
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getPartCollection <em>Part Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Collection</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Collection#getPartCollection()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_PartCollection();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getRefPrivateData <em>Ref Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Private Data</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Collection#getRefPrivateData()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_RefPrivateData();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getRefService <em>Ref Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Service</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Collection#getRefService()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_RefService();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getRefEnforcement <em>Ref Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Enforcement</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Collection#getRefEnforcement()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_RefEnforcement();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getModality <em>Modality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modality</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Collection#getModality()
   * @see #getCollection()
   * @generated
   */
  EAttribute getCollection_Modality();

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
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getPartDisclosure <em>Part Disclosure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Disclosure</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getPartDisclosure()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_PartDisclosure();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRecipient <em>Ref Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Recipient</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRecipient()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_RefRecipient();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRecipientSource <em>Ref Recipient Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Recipient Source</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRecipientSource()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_RefRecipientSource();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRecipientTarget <em>Ref Recipient Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Recipient Target</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefRecipientTarget()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_RefRecipientTarget();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefPrivateData <em>Ref Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Private Data</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefPrivateData()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_RefPrivateData();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefService <em>Ref Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Service</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefService()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_RefService();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefEnforcement <em>Ref Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Enforcement</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getRefEnforcement()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_RefEnforcement();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getModality <em>Modality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modality</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Disclosure#getModality()
   * @see #getDisclosure()
   * @generated
   */
  EAttribute getDisclosure_Modality();

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
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention#getPartRetention <em>Part Retention</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Retention</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention#getPartRetention()
   * @see #getRetention()
   * @generated
   */
  EReference getRetention_PartRetention();

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
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention#getRefPrivateData <em>Ref Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Private Data</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention#getRefPrivateData()
   * @see #getRetention()
   * @generated
   */
  EReference getRetention_RefPrivateData();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention#getRefService <em>Ref Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Service</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention#getRefService()
   * @see #getRetention()
   * @generated
   */
  EReference getRetention_RefService();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention#getRefEnforcement <em>Ref Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Enforcement</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention#getRefEnforcement()
   * @see #getRetention()
   * @generated
   */
  EReference getRetention_RefEnforcement();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Retention#getModality <em>Modality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modality</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Retention#getModality()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Modality();

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
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.Usage#getPartUsage <em>Part Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Usage</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Usage#getPartUsage()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_PartUsage();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Usage#getRefPrivateData <em>Ref Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Private Data</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Usage#getRefPrivateData()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_RefPrivateData();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Usage#getRefService <em>Ref Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Service</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Usage#getRefService()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_RefService();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Usage#getRefEnforcement <em>Ref Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Enforcement</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Usage#getRefEnforcement()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_RefEnforcement();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Usage#getModality <em>Modality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modality</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Usage#getModality()
   * @see #getUsage()
   * @generated
   */
  EAttribute getUsage_Modality();

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
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.Informative#getPartInformative <em>Part Informative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Informative</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Informative#getPartInformative()
   * @see #getInformative()
   * @generated
   */
  EReference getInformative_PartInformative();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Informative#getRefPrivateData <em>Ref Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Private Data</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Informative#getRefPrivateData()
   * @see #getInformative()
   * @generated
   */
  EReference getInformative_RefPrivateData();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Informative#getRefService <em>Ref Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Service</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Informative#getRefService()
   * @see #getInformative()
   * @generated
   */
  EReference getInformative_RefService();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rslil4privacy.rSLIL4Privacy.Informative#getRefEnforcement <em>Ref Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Enforcement</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Informative#getRefEnforcement()
   * @see #getInformative()
   * @generated
   */
  EReference getInformative_RefEnforcement();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rslil4privacy.rSLIL4Privacy.Informative#getModality <em>Modality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modality</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.Informative#getModality()
   * @see #getInformative()
   * @generated
   */
  EAttribute getInformative_Modality();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart <em>Recipient Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recipient Part</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart
   * @generated
   */
  EClass getRecipientPart();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart#getRecipientPart <em>Recipient Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Recipient Part</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart#getRecipientPart()
   * @see #getRecipientPart()
   * @generated
   */
  EReference getRecipientPart_RecipientPart();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefRecipient <em>Ref Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Recipient</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefRecipient
   * @generated
   */
  EClass getRefRecipient();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefRecipient#getRefRecipient <em>Ref Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Recipient</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefRecipient#getRefRecipient()
   * @see #getRefRecipient()
   * @generated
   */
  EReference getRefRecipient_RefRecipient();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientSource <em>Ref Recipient Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Recipient Source</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientSource
   * @generated
   */
  EClass getRefRecipientSource();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientSource#getRefRecipientSource <em>Ref Recipient Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Recipient Source</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientSource#getRefRecipientSource()
   * @see #getRefRecipientSource()
   * @generated
   */
  EReference getRefRecipientSource_RefRecipientSource();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientTarget <em>Ref Recipient Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Recipient Target</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientTarget
   * @generated
   */
  EClass getRefRecipientTarget();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientTarget#getRefRecipientTarget <em>Ref Recipient Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Recipient Target</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientTarget#getRefRecipientTarget()
   * @see #getRefRecipientTarget()
   * @generated
   */
  EReference getRefRecipientTarget_RefRecipientTarget();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefService <em>Ref Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Service</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefService
   * @generated
   */
  EClass getRefService();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefService#getRefService <em>Ref Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Service</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefService#getRefService()
   * @see #getRefService()
   * @generated
   */
  EReference getRefService_RefService();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.ServicePart <em>Service Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Part</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ServicePart
   * @generated
   */
  EClass getServicePart();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.ServicePart#getServicePart <em>Service Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service Part</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.ServicePart#getServicePart()
   * @see #getServicePart()
   * @generated
   */
  EReference getServicePart_ServicePart();

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
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData#getRefPrivateData <em>Ref Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Private Data</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData#getRefPrivateData()
   * @see #getRefPrivateData()
   * @generated
   */
  EReference getRefPrivateData_RefPrivateData();

  /**
   * Returns the meta object for class '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement <em>Ref Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Enforcement</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement
   * @generated
   */
  EClass getRefEnforcement();

  /**
   * Returns the meta object for the reference '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement#getRefEnforcement <em>Ref Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Enforcement</em>'.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement#getRefEnforcement()
   * @see #getRefEnforcement()
   * @generated
   */
  EReference getRefEnforcement_RefEnforcement();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENFORCEMENT__DESCRIPTION = eINSTANCE.getEnforcement_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENFORCEMENT__TYPE = eINSTANCE.getEnforcement_Type();

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
     * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__SERVICE_NAME = eINSTANCE.getService_ServiceName();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

    /**
     * The meta object literal for the '<em><b>Ref Private Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__REF_PRIVATE_DATA = eINSTANCE.getService_RefPrivateData();

    /**
     * The meta object literal for the '<em><b>Service Part</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__SERVICE_PART = eINSTANCE.getService_ServicePart();

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
     * The meta object literal for the '<em><b>Recipient Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPIENT__RECIPIENT_NAME = eINSTANCE.getRecipient_RecipientName();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPIENT__DESCRIPTION = eINSTANCE.getRecipient_Description();

    /**
     * The meta object literal for the '<em><b>Recipient Part</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPIENT__RECIPIENT_PART = eINSTANCE.getRecipient_RecipientPart();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPIENT__SCOPE = eINSTANCE.getRecipient_Scope();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECIPIENT__TYPE = eINSTANCE.getRecipient_Type();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIVATE_DATA__DESCRIPTION = eINSTANCE.getPrivateData_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIVATE_DATA__TYPE = eINSTANCE.getPrivateData_Type();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

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
     * The meta object literal for the '<em><b>Part Collection</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__PART_COLLECTION = eINSTANCE.getCollection_PartCollection();

    /**
     * The meta object literal for the '<em><b>Ref Private Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__REF_PRIVATE_DATA = eINSTANCE.getCollection_RefPrivateData();

    /**
     * The meta object literal for the '<em><b>Ref Service</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__REF_SERVICE = eINSTANCE.getCollection_RefService();

    /**
     * The meta object literal for the '<em><b>Ref Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION__REF_ENFORCEMENT = eINSTANCE.getCollection_RefEnforcement();

    /**
     * The meta object literal for the '<em><b>Modality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION__MODALITY = eINSTANCE.getCollection_Modality();

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
     * The meta object literal for the '<em><b>Part Disclosure</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__PART_DISCLOSURE = eINSTANCE.getDisclosure_PartDisclosure();

    /**
     * The meta object literal for the '<em><b>Ref Recipient</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REF_RECIPIENT = eINSTANCE.getDisclosure_RefRecipient();

    /**
     * The meta object literal for the '<em><b>Ref Recipient Source</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REF_RECIPIENT_SOURCE = eINSTANCE.getDisclosure_RefRecipientSource();

    /**
     * The meta object literal for the '<em><b>Ref Recipient Target</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REF_RECIPIENT_TARGET = eINSTANCE.getDisclosure_RefRecipientTarget();

    /**
     * The meta object literal for the '<em><b>Ref Private Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REF_PRIVATE_DATA = eINSTANCE.getDisclosure_RefPrivateData();

    /**
     * The meta object literal for the '<em><b>Ref Service</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REF_SERVICE = eINSTANCE.getDisclosure_RefService();

    /**
     * The meta object literal for the '<em><b>Ref Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCLOSURE__REF_ENFORCEMENT = eINSTANCE.getDisclosure_RefEnforcement();

    /**
     * The meta object literal for the '<em><b>Modality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISCLOSURE__MODALITY = eINSTANCE.getDisclosure_Modality();

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
     * The meta object literal for the '<em><b>Part Retention</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETENTION__PART_RETENTION = eINSTANCE.getRetention_PartRetention();

    /**
     * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETENTION__PERIOD = eINSTANCE.getRetention_Period();

    /**
     * The meta object literal for the '<em><b>Ref Private Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETENTION__REF_PRIVATE_DATA = eINSTANCE.getRetention_RefPrivateData();

    /**
     * The meta object literal for the '<em><b>Ref Service</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETENTION__REF_SERVICE = eINSTANCE.getRetention_RefService();

    /**
     * The meta object literal for the '<em><b>Ref Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETENTION__REF_ENFORCEMENT = eINSTANCE.getRetention_RefEnforcement();

    /**
     * The meta object literal for the '<em><b>Modality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETENTION__MODALITY = eINSTANCE.getRetention_Modality();

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
     * The meta object literal for the '<em><b>Part Usage</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USAGE__PART_USAGE = eINSTANCE.getUsage_PartUsage();

    /**
     * The meta object literal for the '<em><b>Ref Private Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USAGE__REF_PRIVATE_DATA = eINSTANCE.getUsage_RefPrivateData();

    /**
     * The meta object literal for the '<em><b>Ref Service</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USAGE__REF_SERVICE = eINSTANCE.getUsage_RefService();

    /**
     * The meta object literal for the '<em><b>Ref Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USAGE__REF_ENFORCEMENT = eINSTANCE.getUsage_RefEnforcement();

    /**
     * The meta object literal for the '<em><b>Modality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USAGE__MODALITY = eINSTANCE.getUsage_Modality();

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
     * The meta object literal for the '<em><b>Part Informative</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFORMATIVE__PART_INFORMATIVE = eINSTANCE.getInformative_PartInformative();

    /**
     * The meta object literal for the '<em><b>Ref Private Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFORMATIVE__REF_PRIVATE_DATA = eINSTANCE.getInformative_RefPrivateData();

    /**
     * The meta object literal for the '<em><b>Ref Service</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFORMATIVE__REF_SERVICE = eINSTANCE.getInformative_RefService();

    /**
     * The meta object literal for the '<em><b>Ref Enforcement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFORMATIVE__REF_ENFORCEMENT = eINSTANCE.getInformative_RefEnforcement();

    /**
     * The meta object literal for the '<em><b>Modality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFORMATIVE__MODALITY = eINSTANCE.getInformative_Modality();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientPartImpl <em>Recipient Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientPartImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRecipientPart()
     * @generated
     */
    EClass RECIPIENT_PART = eINSTANCE.getRecipientPart();

    /**
     * The meta object literal for the '<em><b>Recipient Part</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECIPIENT_PART__RECIPIENT_PART = eINSTANCE.getRecipientPart_RecipientPart();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientImpl <em>Ref Recipient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRefRecipient()
     * @generated
     */
    EClass REF_RECIPIENT = eINSTANCE.getRefRecipient();

    /**
     * The meta object literal for the '<em><b>Ref Recipient</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_RECIPIENT__REF_RECIPIENT = eINSTANCE.getRefRecipient_RefRecipient();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientSourceImpl <em>Ref Recipient Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientSourceImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRefRecipientSource()
     * @generated
     */
    EClass REF_RECIPIENT_SOURCE = eINSTANCE.getRefRecipientSource();

    /**
     * The meta object literal for the '<em><b>Ref Recipient Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_RECIPIENT_SOURCE__REF_RECIPIENT_SOURCE = eINSTANCE.getRefRecipientSource_RefRecipientSource();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientTargetImpl <em>Ref Recipient Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientTargetImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRefRecipientTarget()
     * @generated
     */
    EClass REF_RECIPIENT_TARGET = eINSTANCE.getRefRecipientTarget();

    /**
     * The meta object literal for the '<em><b>Ref Recipient Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_RECIPIENT_TARGET__REF_RECIPIENT_TARGET = eINSTANCE.getRefRecipientTarget_RefRecipientTarget();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefServiceImpl <em>Ref Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RefServiceImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRefService()
     * @generated
     */
    EClass REF_SERVICE = eINSTANCE.getRefService();

    /**
     * The meta object literal for the '<em><b>Ref Service</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_SERVICE__REF_SERVICE = eINSTANCE.getRefService_RefService();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServicePartImpl <em>Service Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.ServicePartImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getServicePart()
     * @generated
     */
    EClass SERVICE_PART = eINSTANCE.getServicePart();

    /**
     * The meta object literal for the '<em><b>Service Part</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PART__SERVICE_PART = eINSTANCE.getServicePart_ServicePart();

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
     * The meta object literal for the '<em><b>Ref Private Data</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_PRIVATE_DATA__REF_PRIVATE_DATA = eINSTANCE.getRefPrivateData_RefPrivateData();

    /**
     * The meta object literal for the '{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefEnforcementImpl <em>Ref Enforcement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RefEnforcementImpl
     * @see rslingo.rslil4privacy.rSLIL4Privacy.impl.RSLIL4PrivacyPackageImpl#getRefEnforcement()
     * @generated
     */
    EClass REF_ENFORCEMENT = eINSTANCE.getRefEnforcement();

    /**
     * The meta object literal for the '<em><b>Ref Enforcement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ENFORCEMENT__REF_ENFORCEMENT = eINSTANCE.getRefEnforcement_RefEnforcement();

  }

} //RSLIL4PrivacyPackage
