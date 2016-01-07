/**
 */
package org.xtext.example.mydsl.myDsl;

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
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PolicyImpl <em>Policy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PolicyImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPolicy()
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
   * The feature id for the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__DAY = 1;

  /**
   * The feature id for the '<em><b>Month</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__MONTH = 2;

  /**
   * The feature id for the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__YEAR = 3;

  /**
   * The feature id for the '<em><b>Collection</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__COLLECTION = 4;

  /**
   * The feature id for the '<em><b>Disclosure</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__DISCLOSURE = 5;

  /**
   * The feature id for the '<em><b>Retention</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__RETENTION = 6;

  /**
   * The feature id for the '<em><b>Usage</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__USAGE = 7;

  /**
   * The feature id for the '<em><b>Informative</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__INFORMATIVE = 8;

  /**
   * The feature id for the '<em><b>Private Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__PRIVATE_DATA = 9;

  /**
   * The feature id for the '<em><b>Recipient</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__RECIPIENT = 10;

  /**
   * The feature id for the '<em><b>Service</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__SERVICE = 11;

  /**
   * The feature id for the '<em><b>Enforcement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__ENFORCEMENT = 12;

  /**
   * The number of structural features of the '<em>Policy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.EnforcementImpl <em>Enforcement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.EnforcementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEnforcement()
   * @generated
   */
  int ENFORCEMENT = 1;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ServiceImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getService()
   * @generated
   */
  int SERVICE = 2;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RecipientImpl <em>Recipient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RecipientImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRecipient()
   * @generated
   */
  int RECIPIENT = 3;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PrivateDataImpl <em>Private Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PrivateDataImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPrivateData()
   * @generated
   */
  int PRIVATE_DATA = 4;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AttributeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 5;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CollectionImpl <em>Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CollectionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCollection()
   * @generated
   */
  int COLLECTION = 6;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DisclosureImpl <em>Disclosure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DisclosureImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDisclosure()
   * @generated
   */
  int DISCLOSURE = 7;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RetentionImpl <em>Retention</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RetentionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRetention()
   * @generated
   */
  int RETENTION = 8;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.UsageImpl <em>Usage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.UsageImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUsage()
   * @generated
   */
  int USAGE = 9;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.InformativeImpl <em>Informative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.InformativeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInformative()
   * @generated
   */
  int INFORMATIVE = 10;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PartofImpl <em>Partof</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PartofImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPartof()
   * @generated
   */
  int PARTOF = 11;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ReferToRecipientImpl <em>Refer To Recipient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ReferToRecipientImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReferToRecipient()
   * @generated
   */
  int REFER_TO_RECIPIENT = 12;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ReferToRecipientSourceImpl <em>Refer To Recipient Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ReferToRecipientSourceImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReferToRecipientSource()
   * @generated
   */
  int REFER_TO_RECIPIENT_SOURCE = 13;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ReferToRecipientTargetImpl <em>Refer To Recipient Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ReferToRecipientTargetImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReferToRecipientTarget()
   * @generated
   */
  int REFER_TO_RECIPIENT_TARGET = 14;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ReferToServiceImpl <em>Refer To Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ReferToServiceImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReferToService()
   * @generated
   */
  int REFER_TO_SERVICE = 15;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ServicePartofImpl <em>Service Partof</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ServicePartofImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getServicePartof()
   * @generated
   */
  int SERVICE_PARTOF = 16;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RefPrivateDataImpl <em>Ref Private Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RefPrivateDataImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRefPrivateData()
   * @generated
   */
  int REF_PRIVATE_DATA = 17;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RefertoEnforcementImpl <em>Referto Enforcement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RefertoEnforcementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRefertoEnforcement()
   * @generated
   */
  int REFERTO_ENFORCEMENT = 18;

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
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Policy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Policy</em>'.
   * @see org.xtext.example.mydsl.myDsl.Policy
   * @generated
   */
  EClass getPolicy();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Policy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Policy#getName()
   * @see #getPolicy()
   * @generated
   */
  EAttribute getPolicy_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Policy#getDay <em>Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Day</em>'.
   * @see org.xtext.example.mydsl.myDsl.Policy#getDay()
   * @see #getPolicy()
   * @generated
   */
  EAttribute getPolicy_Day();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Policy#getMonth <em>Month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Month</em>'.
   * @see org.xtext.example.mydsl.myDsl.Policy#getMonth()
   * @see #getPolicy()
   * @generated
   */
  EAttribute getPolicy_Month();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Policy#getYear <em>Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Year</em>'.
   * @see org.xtext.example.mydsl.myDsl.Policy#getYear()
   * @see #getPolicy()
   * @generated
   */
  EAttribute getPolicy_Year();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Policy#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Collection</em>'.
   * @see org.xtext.example.mydsl.myDsl.Policy#getCollection()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Collection();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Policy#getDisclosure <em>Disclosure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Disclosure</em>'.
   * @see org.xtext.example.mydsl.myDsl.Policy#getDisclosure()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Disclosure();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Policy#getRetention <em>Retention</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Retention</em>'.
   * @see org.xtext.example.mydsl.myDsl.Policy#getRetention()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Retention();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Policy#getUsage <em>Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usage</em>'.
   * @see org.xtext.example.mydsl.myDsl.Policy#getUsage()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Usage();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Policy#getInformative <em>Informative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Informative</em>'.
   * @see org.xtext.example.mydsl.myDsl.Policy#getInformative()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Informative();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Policy#getPrivateData <em>Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Private Data</em>'.
   * @see org.xtext.example.mydsl.myDsl.Policy#getPrivateData()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_PrivateData();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Policy#getRecipient <em>Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Recipient</em>'.
   * @see org.xtext.example.mydsl.myDsl.Policy#getRecipient()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Recipient();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Policy#getService <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service</em>'.
   * @see org.xtext.example.mydsl.myDsl.Policy#getService()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Service();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Policy#getEnforcement <em>Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enforcement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Policy#getEnforcement()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Enforcement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Enforcement <em>Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enforcement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Enforcement
   * @generated
   */
  EClass getEnforcement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Enforcement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Enforcement#getName()
   * @see #getEnforcement()
   * @generated
   */
  EAttribute getEnforcement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Enforcement#getEnforcementName <em>Enforcement Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enforcement Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Enforcement#getEnforcementName()
   * @see #getEnforcement()
   * @generated
   */
  EAttribute getEnforcement_EnforcementName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Enforcement#getEnforcementDescription <em>Enforcement Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enforcement Description</em>'.
   * @see org.xtext.example.mydsl.myDsl.Enforcement#getEnforcementDescription()
   * @see #getEnforcement()
   * @generated
   */
  EAttribute getEnforcement_EnforcementDescription();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Enforcement#getEnforcementKind <em>Enforcement Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enforcement Kind</em>'.
   * @see org.xtext.example.mydsl.myDsl.Enforcement#getEnforcementKind()
   * @see #getEnforcement()
   * @generated
   */
  EAttribute getEnforcement_EnforcementKind();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Service#getServicename <em>Servicename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Servicename</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getServicename()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Servicename();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Service#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getDescription()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Service#getRefprivatedata <em>Refprivatedata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refprivatedata</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getRefprivatedata()
   * @see #getService()
   * @generated
   */
  EReference getService_Refprivatedata();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Service#getServicepartof <em>Servicepartof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Servicepartof</em>'.
   * @see org.xtext.example.mydsl.myDsl.Service#getServicepartof()
   * @see #getService()
   * @generated
   */
  EReference getService_Servicepartof();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Recipient <em>Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recipient</em>'.
   * @see org.xtext.example.mydsl.myDsl.Recipient
   * @generated
   */
  EClass getRecipient();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Recipient#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Recipient#getName()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Recipient#getRecipientname <em>Recipientname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recipientname</em>'.
   * @see org.xtext.example.mydsl.myDsl.Recipient#getRecipientname()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_Recipientname();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Recipient#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.example.mydsl.myDsl.Recipient#getDescription()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Recipient#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Partof</em>'.
   * @see org.xtext.example.mydsl.myDsl.Recipient#getPartof()
   * @see #getRecipient()
   * @generated
   */
  EReference getRecipient_Partof();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Recipient#getRecipientScopeKind <em>Recipient Scope Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recipient Scope Kind</em>'.
   * @see org.xtext.example.mydsl.myDsl.Recipient#getRecipientScopeKind()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_RecipientScopeKind();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Recipient#getRecipientTypeKind <em>Recipient Type Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recipient Type Kind</em>'.
   * @see org.xtext.example.mydsl.myDsl.Recipient#getRecipientTypeKind()
   * @see #getRecipient()
   * @generated
   */
  EAttribute getRecipient_RecipientTypeKind();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.PrivateData <em>Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Private Data</em>'.
   * @see org.xtext.example.mydsl.myDsl.PrivateData
   * @generated
   */
  EClass getPrivateData();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.PrivateData#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.PrivateData#getName()
   * @see #getPrivateData()
   * @generated
   */
  EAttribute getPrivateData_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.PrivateData#getPrivatedata <em>Privatedata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Privatedata</em>'.
   * @see org.xtext.example.mydsl.myDsl.PrivateData#getPrivatedata()
   * @see #getPrivateData()
   * @generated
   */
  EAttribute getPrivateData_Privatedata();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.PrivateData#getPrivateDataKind <em>Private Data Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Private Data Kind</em>'.
   * @see org.xtext.example.mydsl.myDsl.PrivateData#getPrivateDataKind()
   * @see #getPrivateData()
   * @generated
   */
  EAttribute getPrivateData_PrivateDataKind();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.PrivateData#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see org.xtext.example.mydsl.myDsl.PrivateData#getAttribute()
   * @see #getPrivateData()
   * @generated
   */
  EReference getPrivateData_Attribute();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.example.mydsl.myDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Attribute#getAttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Attribute#getAttributeName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_AttributeName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Collection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection</em>'.
   * @see org.xtext.example.mydsl.myDsl.Collection
   * @generated
   */
  EClass getCollection();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Collection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Collection#getName()
   * @see #getCollection()
   * @generated
   */
  EAttribute getCollection_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Collection#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.example.mydsl.myDsl.Collection#getDescription()
   * @see #getCollection()
   * @generated
   */
  EAttribute getCollection_Description();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Collection#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see org.xtext.example.mydsl.myDsl.Collection#getCondition()
   * @see #getCollection()
   * @generated
   */
  EAttribute getCollection_Condition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Collection#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Partof</em>'.
   * @see org.xtext.example.mydsl.myDsl.Collection#getPartof()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_Partof();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Collection#getRefprivatedata <em>Refprivatedata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refprivatedata</em>'.
   * @see org.xtext.example.mydsl.myDsl.Collection#getRefprivatedata()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_Refprivatedata();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Collection#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see org.xtext.example.mydsl.myDsl.Collection#getRefertoservice()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_Refertoservice();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Collection#getRefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referto Enforcement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Collection#getRefertoEnforcement()
   * @see #getCollection()
   * @generated
   */
  EReference getCollection_RefertoEnforcement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Collection#getModalitykind <em>Modalitykind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modalitykind</em>'.
   * @see org.xtext.example.mydsl.myDsl.Collection#getModalitykind()
   * @see #getCollection()
   * @generated
   */
  EAttribute getCollection_Modalitykind();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Disclosure <em>Disclosure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disclosure</em>'.
   * @see org.xtext.example.mydsl.myDsl.Disclosure
   * @generated
   */
  EClass getDisclosure();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Disclosure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Disclosure#getName()
   * @see #getDisclosure()
   * @generated
   */
  EAttribute getDisclosure_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Disclosure#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.example.mydsl.myDsl.Disclosure#getDescription()
   * @see #getDisclosure()
   * @generated
   */
  EAttribute getDisclosure_Description();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Disclosure#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see org.xtext.example.mydsl.myDsl.Disclosure#getCondition()
   * @see #getDisclosure()
   * @generated
   */
  EAttribute getDisclosure_Condition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Disclosure#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Partof</em>'.
   * @see org.xtext.example.mydsl.myDsl.Disclosure#getPartof()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_Partof();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Disclosure#getReferToRecipient <em>Refer To Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refer To Recipient</em>'.
   * @see org.xtext.example.mydsl.myDsl.Disclosure#getReferToRecipient()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_ReferToRecipient();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Disclosure#getReferToRecipientsource <em>Refer To Recipientsource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refer To Recipientsource</em>'.
   * @see org.xtext.example.mydsl.myDsl.Disclosure#getReferToRecipientsource()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_ReferToRecipientsource();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Disclosure#getReferToRecipienttarget <em>Refer To Recipienttarget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refer To Recipienttarget</em>'.
   * @see org.xtext.example.mydsl.myDsl.Disclosure#getReferToRecipienttarget()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_ReferToRecipienttarget();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Disclosure#getRefprivatedata <em>Refprivatedata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refprivatedata</em>'.
   * @see org.xtext.example.mydsl.myDsl.Disclosure#getRefprivatedata()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_Refprivatedata();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Disclosure#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see org.xtext.example.mydsl.myDsl.Disclosure#getRefertoservice()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_Refertoservice();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Disclosure#getRefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referto Enforcement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Disclosure#getRefertoEnforcement()
   * @see #getDisclosure()
   * @generated
   */
  EReference getDisclosure_RefertoEnforcement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Disclosure#getModalitykind <em>Modalitykind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modalitykind</em>'.
   * @see org.xtext.example.mydsl.myDsl.Disclosure#getModalitykind()
   * @see #getDisclosure()
   * @generated
   */
  EAttribute getDisclosure_Modalitykind();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Retention <em>Retention</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Retention</em>'.
   * @see org.xtext.example.mydsl.myDsl.Retention
   * @generated
   */
  EClass getRetention();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Retention#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Retention#getName()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Retention#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.example.mydsl.myDsl.Retention#getDescription()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Description();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Retention#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see org.xtext.example.mydsl.myDsl.Retention#getCondition()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Condition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Retention#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Partof</em>'.
   * @see org.xtext.example.mydsl.myDsl.Retention#getPartof()
   * @see #getRetention()
   * @generated
   */
  EReference getRetention_Partof();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Retention#getPeriod <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Period</em>'.
   * @see org.xtext.example.mydsl.myDsl.Retention#getPeriod()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Period();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Retention#getRefprivatedata <em>Refprivatedata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refprivatedata</em>'.
   * @see org.xtext.example.mydsl.myDsl.Retention#getRefprivatedata()
   * @see #getRetention()
   * @generated
   */
  EReference getRetention_Refprivatedata();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Retention#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see org.xtext.example.mydsl.myDsl.Retention#getRefertoservice()
   * @see #getRetention()
   * @generated
   */
  EReference getRetention_Refertoservice();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Retention#getRefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referto Enforcement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Retention#getRefertoEnforcement()
   * @see #getRetention()
   * @generated
   */
  EReference getRetention_RefertoEnforcement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Retention#getModalitykind <em>Modalitykind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modalitykind</em>'.
   * @see org.xtext.example.mydsl.myDsl.Retention#getModalitykind()
   * @see #getRetention()
   * @generated
   */
  EAttribute getRetention_Modalitykind();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Usage <em>Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Usage</em>'.
   * @see org.xtext.example.mydsl.myDsl.Usage
   * @generated
   */
  EClass getUsage();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Usage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Usage#getName()
   * @see #getUsage()
   * @generated
   */
  EAttribute getUsage_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Usage#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.example.mydsl.myDsl.Usage#getDescription()
   * @see #getUsage()
   * @generated
   */
  EAttribute getUsage_Description();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Usage#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see org.xtext.example.mydsl.myDsl.Usage#getCondition()
   * @see #getUsage()
   * @generated
   */
  EAttribute getUsage_Condition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Usage#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Partof</em>'.
   * @see org.xtext.example.mydsl.myDsl.Usage#getPartof()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_Partof();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Usage#getRefprivatedata <em>Refprivatedata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refprivatedata</em>'.
   * @see org.xtext.example.mydsl.myDsl.Usage#getRefprivatedata()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_Refprivatedata();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Usage#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see org.xtext.example.mydsl.myDsl.Usage#getRefertoservice()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_Refertoservice();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Usage#getRefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referto Enforcement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Usage#getRefertoEnforcement()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_RefertoEnforcement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Usage#getModalitykind <em>Modalitykind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modalitykind</em>'.
   * @see org.xtext.example.mydsl.myDsl.Usage#getModalitykind()
   * @see #getUsage()
   * @generated
   */
  EAttribute getUsage_Modalitykind();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Informative <em>Informative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Informative</em>'.
   * @see org.xtext.example.mydsl.myDsl.Informative
   * @generated
   */
  EClass getInformative();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Informative#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Informative#getName()
   * @see #getInformative()
   * @generated
   */
  EAttribute getInformative_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Informative#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.example.mydsl.myDsl.Informative#getDescription()
   * @see #getInformative()
   * @generated
   */
  EAttribute getInformative_Description();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Informative#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see org.xtext.example.mydsl.myDsl.Informative#getCondition()
   * @see #getInformative()
   * @generated
   */
  EAttribute getInformative_Condition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Informative#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Partof</em>'.
   * @see org.xtext.example.mydsl.myDsl.Informative#getPartof()
   * @see #getInformative()
   * @generated
   */
  EReference getInformative_Partof();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Informative#getRefprivatedata <em>Refprivatedata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refprivatedata</em>'.
   * @see org.xtext.example.mydsl.myDsl.Informative#getRefprivatedata()
   * @see #getInformative()
   * @generated
   */
  EReference getInformative_Refprivatedata();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Informative#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refertoservice</em>'.
   * @see org.xtext.example.mydsl.myDsl.Informative#getRefertoservice()
   * @see #getInformative()
   * @generated
   */
  EReference getInformative_Refertoservice();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Informative#getRefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referto Enforcement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Informative#getRefertoEnforcement()
   * @see #getInformative()
   * @generated
   */
  EReference getInformative_RefertoEnforcement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Informative#getModalitykind <em>Modalitykind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modalitykind</em>'.
   * @see org.xtext.example.mydsl.myDsl.Informative#getModalitykind()
   * @see #getInformative()
   * @generated
   */
  EAttribute getInformative_Modalitykind();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Partof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Partof</em>'.
   * @see org.xtext.example.mydsl.myDsl.Partof
   * @generated
   */
  EClass getPartof();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Partof#getPartof <em>Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Partof</em>'.
   * @see org.xtext.example.mydsl.myDsl.Partof#getPartof()
   * @see #getPartof()
   * @generated
   */
  EReference getPartof_Partof();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ReferToRecipient <em>Refer To Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refer To Recipient</em>'.
   * @see org.xtext.example.mydsl.myDsl.ReferToRecipient
   * @generated
   */
  EClass getReferToRecipient();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.ReferToRecipient#getRefertore <em>Refertore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refertore</em>'.
   * @see org.xtext.example.mydsl.myDsl.ReferToRecipient#getRefertore()
   * @see #getReferToRecipient()
   * @generated
   */
  EReference getReferToRecipient_Refertore();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ReferToRecipientSource <em>Refer To Recipient Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refer To Recipient Source</em>'.
   * @see org.xtext.example.mydsl.myDsl.ReferToRecipientSource
   * @generated
   */
  EClass getReferToRecipientSource();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.ReferToRecipientSource#getRefertore <em>Refertore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refertore</em>'.
   * @see org.xtext.example.mydsl.myDsl.ReferToRecipientSource#getRefertore()
   * @see #getReferToRecipientSource()
   * @generated
   */
  EReference getReferToRecipientSource_Refertore();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ReferToRecipientTarget <em>Refer To Recipient Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refer To Recipient Target</em>'.
   * @see org.xtext.example.mydsl.myDsl.ReferToRecipientTarget
   * @generated
   */
  EClass getReferToRecipientTarget();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.ReferToRecipientTarget#getRefertore <em>Refertore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refertore</em>'.
   * @see org.xtext.example.mydsl.myDsl.ReferToRecipientTarget#getRefertore()
   * @see #getReferToRecipientTarget()
   * @generated
   */
  EReference getReferToRecipientTarget_Refertore();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ReferToService <em>Refer To Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refer To Service</em>'.
   * @see org.xtext.example.mydsl.myDsl.ReferToService
   * @generated
   */
  EClass getReferToService();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.ReferToService#getRefertose <em>Refertose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refertose</em>'.
   * @see org.xtext.example.mydsl.myDsl.ReferToService#getRefertose()
   * @see #getReferToService()
   * @generated
   */
  EReference getReferToService_Refertose();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ServicePartof <em>Service Partof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Partof</em>'.
   * @see org.xtext.example.mydsl.myDsl.ServicePartof
   * @generated
   */
  EClass getServicePartof();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.ServicePartof#getRefertoservice <em>Refertoservice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refertoservice</em>'.
   * @see org.xtext.example.mydsl.myDsl.ServicePartof#getRefertoservice()
   * @see #getServicePartof()
   * @generated
   */
  EReference getServicePartof_Refertoservice();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.RefPrivateData <em>Ref Private Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Private Data</em>'.
   * @see org.xtext.example.mydsl.myDsl.RefPrivateData
   * @generated
   */
  EClass getRefPrivateData();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.RefPrivateData#getRefpr <em>Refpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refpr</em>'.
   * @see org.xtext.example.mydsl.myDsl.RefPrivateData#getRefpr()
   * @see #getRefPrivateData()
   * @generated
   */
  EReference getRefPrivateData_Refpr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.RefertoEnforcement <em>Referto Enforcement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referto Enforcement</em>'.
   * @see org.xtext.example.mydsl.myDsl.RefertoEnforcement
   * @generated
   */
  EClass getRefertoEnforcement();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.RefertoEnforcement#getRefst <em>Refst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refst</em>'.
   * @see org.xtext.example.mydsl.myDsl.RefertoEnforcement#getRefst()
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
  MyDslFactory getMyDslFactory();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PolicyImpl <em>Policy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PolicyImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPolicy()
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
     * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLICY__DAY = eINSTANCE.getPolicy_Day();

    /**
     * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLICY__MONTH = eINSTANCE.getPolicy_Month();

    /**
     * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLICY__YEAR = eINSTANCE.getPolicy_Year();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.EnforcementImpl <em>Enforcement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.EnforcementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEnforcement()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ServiceImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getService()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RecipientImpl <em>Recipient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RecipientImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRecipient()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PrivateDataImpl <em>Private Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PrivateDataImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPrivateData()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AttributeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAttribute()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CollectionImpl <em>Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CollectionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCollection()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DisclosureImpl <em>Disclosure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DisclosureImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDisclosure()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RetentionImpl <em>Retention</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RetentionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRetention()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.UsageImpl <em>Usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.UsageImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUsage()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.InformativeImpl <em>Informative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.InformativeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInformative()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PartofImpl <em>Partof</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PartofImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPartof()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ReferToRecipientImpl <em>Refer To Recipient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ReferToRecipientImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReferToRecipient()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ReferToRecipientSourceImpl <em>Refer To Recipient Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ReferToRecipientSourceImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReferToRecipientSource()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ReferToRecipientTargetImpl <em>Refer To Recipient Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ReferToRecipientTargetImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReferToRecipientTarget()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ReferToServiceImpl <em>Refer To Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ReferToServiceImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReferToService()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ServicePartofImpl <em>Service Partof</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ServicePartofImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getServicePartof()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RefPrivateDataImpl <em>Ref Private Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RefPrivateDataImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRefPrivateData()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RefertoEnforcementImpl <em>Referto Enforcement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RefertoEnforcementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRefertoEnforcement()
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

} //MyDslPackage
