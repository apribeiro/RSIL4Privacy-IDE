/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil4privacy.rSLIL4Privacy.Disclosure;
import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.RefRecipient;
import rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientSource;
import rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientTarget;
import rslingo.rslil4privacy.rSLIL4Privacy.RefService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disclosure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getPartDisclosure <em>Part Disclosure</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getRefRecipient <em>Ref Recipient</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getRefRAll <em>Ref RAll</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getRefRecipientSource <em>Ref Recipient Source</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getRefRSAll <em>Ref RS All</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getRefRecipientTarget <em>Ref Recipient Target</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getRefRTAll <em>Ref RT All</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getRefPrivateData <em>Ref Private Data</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getRefPDAll <em>Ref PD All</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getRefService <em>Ref Service</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getRefSAll <em>Ref SAll</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getRefEnforcement <em>Ref Enforcement</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getRefEAll <em>Ref EAll</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.DisclosureImpl#getModality <em>Modality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisclosureImpl extends MinimalEObjectImpl.Container implements Disclosure
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected static final String CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected String condition = CONDITION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPartDisclosure() <em>Part Disclosure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartDisclosure()
   * @generated
   * @ordered
   */
  protected Disclosure partDisclosure;

  /**
   * The cached value of the '{@link #getRefRecipient() <em>Ref Recipient</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefRecipient()
   * @generated
   * @ordered
   */
  protected RefRecipient refRecipient;

  /**
   * The default value of the '{@link #getRefRAll() <em>Ref RAll</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefRAll()
   * @generated
   * @ordered
   */
  protected static final String REF_RALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRefRAll() <em>Ref RAll</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefRAll()
   * @generated
   * @ordered
   */
  protected String refRAll = REF_RALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefRecipientSource() <em>Ref Recipient Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefRecipientSource()
   * @generated
   * @ordered
   */
  protected RefRecipientSource refRecipientSource;

  /**
   * The default value of the '{@link #getRefRSAll() <em>Ref RS All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefRSAll()
   * @generated
   * @ordered
   */
  protected static final String REF_RS_ALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRefRSAll() <em>Ref RS All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefRSAll()
   * @generated
   * @ordered
   */
  protected String refRSAll = REF_RS_ALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefRecipientTarget() <em>Ref Recipient Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefRecipientTarget()
   * @generated
   * @ordered
   */
  protected RefRecipientTarget refRecipientTarget;

  /**
   * The default value of the '{@link #getRefRTAll() <em>Ref RT All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefRTAll()
   * @generated
   * @ordered
   */
  protected static final String REF_RT_ALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRefRTAll() <em>Ref RT All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefRTAll()
   * @generated
   * @ordered
   */
  protected String refRTAll = REF_RT_ALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefPrivateData() <em>Ref Private Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefPrivateData()
   * @generated
   * @ordered
   */
  protected RefPrivateData refPrivateData;

  /**
   * The default value of the '{@link #getRefPDAll() <em>Ref PD All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefPDAll()
   * @generated
   * @ordered
   */
  protected static final String REF_PD_ALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRefPDAll() <em>Ref PD All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefPDAll()
   * @generated
   * @ordered
   */
  protected String refPDAll = REF_PD_ALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefService() <em>Ref Service</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefService()
   * @generated
   * @ordered
   */
  protected RefService refService;

  /**
   * The default value of the '{@link #getRefSAll() <em>Ref SAll</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefSAll()
   * @generated
   * @ordered
   */
  protected static final String REF_SALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRefSAll() <em>Ref SAll</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefSAll()
   * @generated
   * @ordered
   */
  protected String refSAll = REF_SALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefEnforcement() <em>Ref Enforcement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefEnforcement()
   * @generated
   * @ordered
   */
  protected RefEnforcement refEnforcement;

  /**
   * The default value of the '{@link #getRefEAll() <em>Ref EAll</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefEAll()
   * @generated
   * @ordered
   */
  protected static final String REF_EALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRefEAll() <em>Ref EAll</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefEAll()
   * @generated
   * @ordered
   */
  protected String refEAll = REF_EALL_EDEFAULT;

  /**
   * The default value of the '{@link #getModality() <em>Modality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModality()
   * @generated
   * @ordered
   */
  protected static final String MODALITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModality() <em>Modality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModality()
   * @generated
   * @ordered
   */
  protected String modality = MODALITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DisclosureImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RSLIL4PrivacyPackage.Literals.DISCLOSURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(String newCondition)
  {
    String oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__CONDITION, oldCondition, condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Disclosure getPartDisclosure()
  {
    if (partDisclosure != null && partDisclosure.eIsProxy())
    {
      InternalEObject oldPartDisclosure = (InternalEObject)partDisclosure;
      partDisclosure = (Disclosure)eResolveProxy(oldPartDisclosure);
      if (partDisclosure != oldPartDisclosure)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLIL4PrivacyPackage.DISCLOSURE__PART_DISCLOSURE, oldPartDisclosure, partDisclosure));
      }
    }
    return partDisclosure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Disclosure basicGetPartDisclosure()
  {
    return partDisclosure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartDisclosure(Disclosure newPartDisclosure)
  {
    Disclosure oldPartDisclosure = partDisclosure;
    partDisclosure = newPartDisclosure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__PART_DISCLOSURE, oldPartDisclosure, partDisclosure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefRecipient getRefRecipient()
  {
    return refRecipient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefRecipient(RefRecipient newRefRecipient, NotificationChain msgs)
  {
    RefRecipient oldRefRecipient = refRecipient;
    refRecipient = newRefRecipient;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT, oldRefRecipient, newRefRecipient);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefRecipient(RefRecipient newRefRecipient)
  {
    if (newRefRecipient != refRecipient)
    {
      NotificationChain msgs = null;
      if (refRecipient != null)
        msgs = ((InternalEObject)refRecipient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT, null, msgs);
      if (newRefRecipient != null)
        msgs = ((InternalEObject)newRefRecipient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT, null, msgs);
      msgs = basicSetRefRecipient(newRefRecipient, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT, newRefRecipient, newRefRecipient));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRefRAll()
  {
    return refRAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefRAll(String newRefRAll)
  {
    String oldRefRAll = refRAll;
    refRAll = newRefRAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_RALL, oldRefRAll, refRAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefRecipientSource getRefRecipientSource()
  {
    return refRecipientSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefRecipientSource(RefRecipientSource newRefRecipientSource, NotificationChain msgs)
  {
    RefRecipientSource oldRefRecipientSource = refRecipientSource;
    refRecipientSource = newRefRecipientSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_SOURCE, oldRefRecipientSource, newRefRecipientSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefRecipientSource(RefRecipientSource newRefRecipientSource)
  {
    if (newRefRecipientSource != refRecipientSource)
    {
      NotificationChain msgs = null;
      if (refRecipientSource != null)
        msgs = ((InternalEObject)refRecipientSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_SOURCE, null, msgs);
      if (newRefRecipientSource != null)
        msgs = ((InternalEObject)newRefRecipientSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_SOURCE, null, msgs);
      msgs = basicSetRefRecipientSource(newRefRecipientSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_SOURCE, newRefRecipientSource, newRefRecipientSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRefRSAll()
  {
    return refRSAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefRSAll(String newRefRSAll)
  {
    String oldRefRSAll = refRSAll;
    refRSAll = newRefRSAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_RS_ALL, oldRefRSAll, refRSAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefRecipientTarget getRefRecipientTarget()
  {
    return refRecipientTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefRecipientTarget(RefRecipientTarget newRefRecipientTarget, NotificationChain msgs)
  {
    RefRecipientTarget oldRefRecipientTarget = refRecipientTarget;
    refRecipientTarget = newRefRecipientTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_TARGET, oldRefRecipientTarget, newRefRecipientTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefRecipientTarget(RefRecipientTarget newRefRecipientTarget)
  {
    if (newRefRecipientTarget != refRecipientTarget)
    {
      NotificationChain msgs = null;
      if (refRecipientTarget != null)
        msgs = ((InternalEObject)refRecipientTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_TARGET, null, msgs);
      if (newRefRecipientTarget != null)
        msgs = ((InternalEObject)newRefRecipientTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_TARGET, null, msgs);
      msgs = basicSetRefRecipientTarget(newRefRecipientTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_TARGET, newRefRecipientTarget, newRefRecipientTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRefRTAll()
  {
    return refRTAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefRTAll(String newRefRTAll)
  {
    String oldRefRTAll = refRTAll;
    refRTAll = newRefRTAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_RT_ALL, oldRefRTAll, refRTAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefPrivateData getRefPrivateData()
  {
    return refPrivateData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefPrivateData(RefPrivateData newRefPrivateData, NotificationChain msgs)
  {
    RefPrivateData oldRefPrivateData = refPrivateData;
    refPrivateData = newRefPrivateData;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_PRIVATE_DATA, oldRefPrivateData, newRefPrivateData);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefPrivateData(RefPrivateData newRefPrivateData)
  {
    if (newRefPrivateData != refPrivateData)
    {
      NotificationChain msgs = null;
      if (refPrivateData != null)
        msgs = ((InternalEObject)refPrivateData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.DISCLOSURE__REF_PRIVATE_DATA, null, msgs);
      if (newRefPrivateData != null)
        msgs = ((InternalEObject)newRefPrivateData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.DISCLOSURE__REF_PRIVATE_DATA, null, msgs);
      msgs = basicSetRefPrivateData(newRefPrivateData, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_PRIVATE_DATA, newRefPrivateData, newRefPrivateData));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRefPDAll()
  {
    return refPDAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefPDAll(String newRefPDAll)
  {
    String oldRefPDAll = refPDAll;
    refPDAll = newRefPDAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_PD_ALL, oldRefPDAll, refPDAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefService getRefService()
  {
    return refService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefService(RefService newRefService, NotificationChain msgs)
  {
    RefService oldRefService = refService;
    refService = newRefService;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_SERVICE, oldRefService, newRefService);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefService(RefService newRefService)
  {
    if (newRefService != refService)
    {
      NotificationChain msgs = null;
      if (refService != null)
        msgs = ((InternalEObject)refService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.DISCLOSURE__REF_SERVICE, null, msgs);
      if (newRefService != null)
        msgs = ((InternalEObject)newRefService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.DISCLOSURE__REF_SERVICE, null, msgs);
      msgs = basicSetRefService(newRefService, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_SERVICE, newRefService, newRefService));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRefSAll()
  {
    return refSAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefSAll(String newRefSAll)
  {
    String oldRefSAll = refSAll;
    refSAll = newRefSAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_SALL, oldRefSAll, refSAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefEnforcement getRefEnforcement()
  {
    return refEnforcement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefEnforcement(RefEnforcement newRefEnforcement, NotificationChain msgs)
  {
    RefEnforcement oldRefEnforcement = refEnforcement;
    refEnforcement = newRefEnforcement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_ENFORCEMENT, oldRefEnforcement, newRefEnforcement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefEnforcement(RefEnforcement newRefEnforcement)
  {
    if (newRefEnforcement != refEnforcement)
    {
      NotificationChain msgs = null;
      if (refEnforcement != null)
        msgs = ((InternalEObject)refEnforcement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.DISCLOSURE__REF_ENFORCEMENT, null, msgs);
      if (newRefEnforcement != null)
        msgs = ((InternalEObject)newRefEnforcement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.DISCLOSURE__REF_ENFORCEMENT, null, msgs);
      msgs = basicSetRefEnforcement(newRefEnforcement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_ENFORCEMENT, newRefEnforcement, newRefEnforcement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRefEAll()
  {
    return refEAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefEAll(String newRefEAll)
  {
    String oldRefEAll = refEAll;
    refEAll = newRefEAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__REF_EALL, oldRefEAll, refEAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModality()
  {
    return modality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModality(String newModality)
  {
    String oldModality = modality;
    modality = newModality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.DISCLOSURE__MODALITY, oldModality, modality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT:
        return basicSetRefRecipient(null, msgs);
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_SOURCE:
        return basicSetRefRecipientSource(null, msgs);
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_TARGET:
        return basicSetRefRecipientTarget(null, msgs);
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_PRIVATE_DATA:
        return basicSetRefPrivateData(null, msgs);
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_SERVICE:
        return basicSetRefService(null, msgs);
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_ENFORCEMENT:
        return basicSetRefEnforcement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RSLIL4PrivacyPackage.DISCLOSURE__NAME:
        return getName();
      case RSLIL4PrivacyPackage.DISCLOSURE__DESCRIPTION:
        return getDescription();
      case RSLIL4PrivacyPackage.DISCLOSURE__CONDITION:
        return getCondition();
      case RSLIL4PrivacyPackage.DISCLOSURE__PART_DISCLOSURE:
        if (resolve) return getPartDisclosure();
        return basicGetPartDisclosure();
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT:
        return getRefRecipient();
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RALL:
        return getRefRAll();
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_SOURCE:
        return getRefRecipientSource();
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RS_ALL:
        return getRefRSAll();
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_TARGET:
        return getRefRecipientTarget();
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RT_ALL:
        return getRefRTAll();
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_PRIVATE_DATA:
        return getRefPrivateData();
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_PD_ALL:
        return getRefPDAll();
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_SERVICE:
        return getRefService();
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_SALL:
        return getRefSAll();
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_ENFORCEMENT:
        return getRefEnforcement();
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_EALL:
        return getRefEAll();
      case RSLIL4PrivacyPackage.DISCLOSURE__MODALITY:
        return getModality();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RSLIL4PrivacyPackage.DISCLOSURE__NAME:
        setName((String)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__CONDITION:
        setCondition((String)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__PART_DISCLOSURE:
        setPartDisclosure((Disclosure)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT:
        setRefRecipient((RefRecipient)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RALL:
        setRefRAll((String)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_SOURCE:
        setRefRecipientSource((RefRecipientSource)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RS_ALL:
        setRefRSAll((String)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_TARGET:
        setRefRecipientTarget((RefRecipientTarget)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RT_ALL:
        setRefRTAll((String)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_PRIVATE_DATA:
        setRefPrivateData((RefPrivateData)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_PD_ALL:
        setRefPDAll((String)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_SERVICE:
        setRefService((RefService)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_SALL:
        setRefSAll((String)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_ENFORCEMENT:
        setRefEnforcement((RefEnforcement)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_EALL:
        setRefEAll((String)newValue);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__MODALITY:
        setModality((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RSLIL4PrivacyPackage.DISCLOSURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__CONDITION:
        setCondition(CONDITION_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__PART_DISCLOSURE:
        setPartDisclosure((Disclosure)null);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT:
        setRefRecipient((RefRecipient)null);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RALL:
        setRefRAll(REF_RALL_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_SOURCE:
        setRefRecipientSource((RefRecipientSource)null);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RS_ALL:
        setRefRSAll(REF_RS_ALL_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_TARGET:
        setRefRecipientTarget((RefRecipientTarget)null);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RT_ALL:
        setRefRTAll(REF_RT_ALL_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_PRIVATE_DATA:
        setRefPrivateData((RefPrivateData)null);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_PD_ALL:
        setRefPDAll(REF_PD_ALL_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_SERVICE:
        setRefService((RefService)null);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_SALL:
        setRefSAll(REF_SALL_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_ENFORCEMENT:
        setRefEnforcement((RefEnforcement)null);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_EALL:
        setRefEAll(REF_EALL_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.DISCLOSURE__MODALITY:
        setModality(MODALITY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RSLIL4PrivacyPackage.DISCLOSURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLIL4PrivacyPackage.DISCLOSURE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLIL4PrivacyPackage.DISCLOSURE__CONDITION:
        return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
      case RSLIL4PrivacyPackage.DISCLOSURE__PART_DISCLOSURE:
        return partDisclosure != null;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT:
        return refRecipient != null;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RALL:
        return REF_RALL_EDEFAULT == null ? refRAll != null : !REF_RALL_EDEFAULT.equals(refRAll);
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_SOURCE:
        return refRecipientSource != null;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RS_ALL:
        return REF_RS_ALL_EDEFAULT == null ? refRSAll != null : !REF_RS_ALL_EDEFAULT.equals(refRSAll);
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RECIPIENT_TARGET:
        return refRecipientTarget != null;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_RT_ALL:
        return REF_RT_ALL_EDEFAULT == null ? refRTAll != null : !REF_RT_ALL_EDEFAULT.equals(refRTAll);
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_PRIVATE_DATA:
        return refPrivateData != null;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_PD_ALL:
        return REF_PD_ALL_EDEFAULT == null ? refPDAll != null : !REF_PD_ALL_EDEFAULT.equals(refPDAll);
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_SERVICE:
        return refService != null;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_SALL:
        return REF_SALL_EDEFAULT == null ? refSAll != null : !REF_SALL_EDEFAULT.equals(refSAll);
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_ENFORCEMENT:
        return refEnforcement != null;
      case RSLIL4PrivacyPackage.DISCLOSURE__REF_EALL:
        return REF_EALL_EDEFAULT == null ? refEAll != null : !REF_EALL_EDEFAULT.equals(refEAll);
      case RSLIL4PrivacyPackage.DISCLOSURE__MODALITY:
        return MODALITY_EDEFAULT == null ? modality != null : !MODALITY_EDEFAULT.equals(modality);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", condition: ");
    result.append(condition);
    result.append(", refRAll: ");
    result.append(refRAll);
    result.append(", refRSAll: ");
    result.append(refRSAll);
    result.append(", refRTAll: ");
    result.append(refRTAll);
    result.append(", refPDAll: ");
    result.append(refPDAll);
    result.append(", refSAll: ");
    result.append(refSAll);
    result.append(", refEAll: ");
    result.append(refEAll);
    result.append(", modality: ");
    result.append(modality);
    result.append(')');
    return result.toString();
  }

} //DisclosureImpl
