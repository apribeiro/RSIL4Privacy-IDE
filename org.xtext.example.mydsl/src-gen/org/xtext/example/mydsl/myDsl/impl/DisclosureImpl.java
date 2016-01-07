/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Disclosure;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.RefPrivateData;
import org.xtext.example.mydsl.myDsl.ReferToRecipient;
import org.xtext.example.mydsl.myDsl.ReferToRecipientSource;
import org.xtext.example.mydsl.myDsl.ReferToRecipientTarget;
import org.xtext.example.mydsl.myDsl.ReferToService;
import org.xtext.example.mydsl.myDsl.RefertoEnforcement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disclosure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DisclosureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DisclosureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DisclosureImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DisclosureImpl#getPartof <em>Partof</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DisclosureImpl#getReferToRecipient <em>Refer To Recipient</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DisclosureImpl#getReferToRecipientsource <em>Refer To Recipientsource</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DisclosureImpl#getReferToRecipienttarget <em>Refer To Recipienttarget</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DisclosureImpl#getRefprivatedata <em>Refprivatedata</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DisclosureImpl#getRefertoservice <em>Refertoservice</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DisclosureImpl#getRefertoEnforcement <em>Referto Enforcement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DisclosureImpl#getModalitykind <em>Modalitykind</em>}</li>
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
   * The cached value of the '{@link #getPartof() <em>Partof</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartof()
   * @generated
   * @ordered
   */
  protected Disclosure partof;

  /**
   * The cached value of the '{@link #getReferToRecipient() <em>Refer To Recipient</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferToRecipient()
   * @generated
   * @ordered
   */
  protected EList<ReferToRecipient> referToRecipient;

  /**
   * The cached value of the '{@link #getReferToRecipientsource() <em>Refer To Recipientsource</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferToRecipientsource()
   * @generated
   * @ordered
   */
  protected EList<ReferToRecipientSource> referToRecipientsource;

  /**
   * The cached value of the '{@link #getReferToRecipienttarget() <em>Refer To Recipienttarget</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferToRecipienttarget()
   * @generated
   * @ordered
   */
  protected EList<ReferToRecipientTarget> referToRecipienttarget;

  /**
   * The cached value of the '{@link #getRefprivatedata() <em>Refprivatedata</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefprivatedata()
   * @generated
   * @ordered
   */
  protected EList<RefPrivateData> refprivatedata;

  /**
   * The cached value of the '{@link #getRefertoservice() <em>Refertoservice</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefertoservice()
   * @generated
   * @ordered
   */
  protected EList<ReferToService> refertoservice;

  /**
   * The cached value of the '{@link #getRefertoEnforcement() <em>Referto Enforcement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefertoEnforcement()
   * @generated
   * @ordered
   */
  protected EList<RefertoEnforcement> refertoEnforcement;

  /**
   * The default value of the '{@link #getModalitykind() <em>Modalitykind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModalitykind()
   * @generated
   * @ordered
   */
  protected static final String MODALITYKIND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModalitykind() <em>Modalitykind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModalitykind()
   * @generated
   * @ordered
   */
  protected String modalitykind = MODALITYKIND_EDEFAULT;

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
    return MyDslPackage.Literals.DISCLOSURE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DISCLOSURE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DISCLOSURE__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DISCLOSURE__CONDITION, oldCondition, condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Disclosure getPartof()
  {
    if (partof != null && partof.eIsProxy())
    {
      InternalEObject oldPartof = (InternalEObject)partof;
      partof = (Disclosure)eResolveProxy(oldPartof);
      if (partof != oldPartof)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.DISCLOSURE__PARTOF, oldPartof, partof));
      }
    }
    return partof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Disclosure basicGetPartof()
  {
    return partof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartof(Disclosure newPartof)
  {
    Disclosure oldPartof = partof;
    partof = newPartof;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DISCLOSURE__PARTOF, oldPartof, partof));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferToRecipient> getReferToRecipient()
  {
    if (referToRecipient == null)
    {
      referToRecipient = new EObjectContainmentEList<ReferToRecipient>(ReferToRecipient.class, this, MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENT);
    }
    return referToRecipient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferToRecipientSource> getReferToRecipientsource()
  {
    if (referToRecipientsource == null)
    {
      referToRecipientsource = new EObjectContainmentEList<ReferToRecipientSource>(ReferToRecipientSource.class, this, MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENTSOURCE);
    }
    return referToRecipientsource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferToRecipientTarget> getReferToRecipienttarget()
  {
    if (referToRecipienttarget == null)
    {
      referToRecipienttarget = new EObjectContainmentEList<ReferToRecipientTarget>(ReferToRecipientTarget.class, this, MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENTTARGET);
    }
    return referToRecipienttarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RefPrivateData> getRefprivatedata()
  {
    if (refprivatedata == null)
    {
      refprivatedata = new EObjectContainmentEList<RefPrivateData>(RefPrivateData.class, this, MyDslPackage.DISCLOSURE__REFPRIVATEDATA);
    }
    return refprivatedata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferToService> getRefertoservice()
  {
    if (refertoservice == null)
    {
      refertoservice = new EObjectContainmentEList<ReferToService>(ReferToService.class, this, MyDslPackage.DISCLOSURE__REFERTOSERVICE);
    }
    return refertoservice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RefertoEnforcement> getRefertoEnforcement()
  {
    if (refertoEnforcement == null)
    {
      refertoEnforcement = new EObjectContainmentEList<RefertoEnforcement>(RefertoEnforcement.class, this, MyDslPackage.DISCLOSURE__REFERTO_ENFORCEMENT);
    }
    return refertoEnforcement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModalitykind()
  {
    return modalitykind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModalitykind(String newModalitykind)
  {
    String oldModalitykind = modalitykind;
    modalitykind = newModalitykind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DISCLOSURE__MODALITYKIND, oldModalitykind, modalitykind));
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
      case MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENT:
        return ((InternalEList<?>)getReferToRecipient()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENTSOURCE:
        return ((InternalEList<?>)getReferToRecipientsource()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENTTARGET:
        return ((InternalEList<?>)getReferToRecipienttarget()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DISCLOSURE__REFPRIVATEDATA:
        return ((InternalEList<?>)getRefprivatedata()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DISCLOSURE__REFERTOSERVICE:
        return ((InternalEList<?>)getRefertoservice()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DISCLOSURE__REFERTO_ENFORCEMENT:
        return ((InternalEList<?>)getRefertoEnforcement()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.DISCLOSURE__NAME:
        return getName();
      case MyDslPackage.DISCLOSURE__DESCRIPTION:
        return getDescription();
      case MyDslPackage.DISCLOSURE__CONDITION:
        return getCondition();
      case MyDslPackage.DISCLOSURE__PARTOF:
        if (resolve) return getPartof();
        return basicGetPartof();
      case MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENT:
        return getReferToRecipient();
      case MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENTSOURCE:
        return getReferToRecipientsource();
      case MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENTTARGET:
        return getReferToRecipienttarget();
      case MyDslPackage.DISCLOSURE__REFPRIVATEDATA:
        return getRefprivatedata();
      case MyDslPackage.DISCLOSURE__REFERTOSERVICE:
        return getRefertoservice();
      case MyDslPackage.DISCLOSURE__REFERTO_ENFORCEMENT:
        return getRefertoEnforcement();
      case MyDslPackage.DISCLOSURE__MODALITYKIND:
        return getModalitykind();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.DISCLOSURE__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.DISCLOSURE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case MyDslPackage.DISCLOSURE__CONDITION:
        setCondition((String)newValue);
        return;
      case MyDslPackage.DISCLOSURE__PARTOF:
        setPartof((Disclosure)newValue);
        return;
      case MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENT:
        getReferToRecipient().clear();
        getReferToRecipient().addAll((Collection<? extends ReferToRecipient>)newValue);
        return;
      case MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENTSOURCE:
        getReferToRecipientsource().clear();
        getReferToRecipientsource().addAll((Collection<? extends ReferToRecipientSource>)newValue);
        return;
      case MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENTTARGET:
        getReferToRecipienttarget().clear();
        getReferToRecipienttarget().addAll((Collection<? extends ReferToRecipientTarget>)newValue);
        return;
      case MyDslPackage.DISCLOSURE__REFPRIVATEDATA:
        getRefprivatedata().clear();
        getRefprivatedata().addAll((Collection<? extends RefPrivateData>)newValue);
        return;
      case MyDslPackage.DISCLOSURE__REFERTOSERVICE:
        getRefertoservice().clear();
        getRefertoservice().addAll((Collection<? extends ReferToService>)newValue);
        return;
      case MyDslPackage.DISCLOSURE__REFERTO_ENFORCEMENT:
        getRefertoEnforcement().clear();
        getRefertoEnforcement().addAll((Collection<? extends RefertoEnforcement>)newValue);
        return;
      case MyDslPackage.DISCLOSURE__MODALITYKIND:
        setModalitykind((String)newValue);
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
      case MyDslPackage.DISCLOSURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.DISCLOSURE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case MyDslPackage.DISCLOSURE__CONDITION:
        setCondition(CONDITION_EDEFAULT);
        return;
      case MyDslPackage.DISCLOSURE__PARTOF:
        setPartof((Disclosure)null);
        return;
      case MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENT:
        getReferToRecipient().clear();
        return;
      case MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENTSOURCE:
        getReferToRecipientsource().clear();
        return;
      case MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENTTARGET:
        getReferToRecipienttarget().clear();
        return;
      case MyDslPackage.DISCLOSURE__REFPRIVATEDATA:
        getRefprivatedata().clear();
        return;
      case MyDslPackage.DISCLOSURE__REFERTOSERVICE:
        getRefertoservice().clear();
        return;
      case MyDslPackage.DISCLOSURE__REFERTO_ENFORCEMENT:
        getRefertoEnforcement().clear();
        return;
      case MyDslPackage.DISCLOSURE__MODALITYKIND:
        setModalitykind(MODALITYKIND_EDEFAULT);
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
      case MyDslPackage.DISCLOSURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.DISCLOSURE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case MyDslPackage.DISCLOSURE__CONDITION:
        return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
      case MyDslPackage.DISCLOSURE__PARTOF:
        return partof != null;
      case MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENT:
        return referToRecipient != null && !referToRecipient.isEmpty();
      case MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENTSOURCE:
        return referToRecipientsource != null && !referToRecipientsource.isEmpty();
      case MyDslPackage.DISCLOSURE__REFER_TO_RECIPIENTTARGET:
        return referToRecipienttarget != null && !referToRecipienttarget.isEmpty();
      case MyDslPackage.DISCLOSURE__REFPRIVATEDATA:
        return refprivatedata != null && !refprivatedata.isEmpty();
      case MyDslPackage.DISCLOSURE__REFERTOSERVICE:
        return refertoservice != null && !refertoservice.isEmpty();
      case MyDslPackage.DISCLOSURE__REFERTO_ENFORCEMENT:
        return refertoEnforcement != null && !refertoEnforcement.isEmpty();
      case MyDslPackage.DISCLOSURE__MODALITYKIND:
        return MODALITYKIND_EDEFAULT == null ? modalitykind != null : !MODALITYKIND_EDEFAULT.equals(modalitykind);
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
    result.append(", modalitykind: ");
    result.append(modalitykind);
    result.append(')');
    return result.toString();
  }

} //DisclosureImpl
