/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.impl;

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

import rslingo.rslil4privacy.rSLIL4Privacy.Informative;
import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.RefService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Informative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.InformativeImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.InformativeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.InformativeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.InformativeImpl#getPartInformative <em>Part Informative</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.InformativeImpl#getRefPrivateData <em>Ref Private Data</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.InformativeImpl#getRefPDAll <em>Ref PD All</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.InformativeImpl#getRefService <em>Ref Service</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.InformativeImpl#getRefSAll <em>Ref SAll</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.InformativeImpl#getRefEnforcement <em>Ref Enforcement</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.InformativeImpl#getRefEAll <em>Ref EAll</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.InformativeImpl#getModality <em>Modality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformativeImpl extends MinimalEObjectImpl.Container implements Informative
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
   * The cached value of the '{@link #getPartInformative() <em>Part Informative</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartInformative()
   * @generated
   * @ordered
   */
  protected Informative partInformative;

  /**
   * The cached value of the '{@link #getRefPrivateData() <em>Ref Private Data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefPrivateData()
   * @generated
   * @ordered
   */
  protected EList<RefPrivateData> refPrivateData;

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
   * The cached value of the '{@link #getRefService() <em>Ref Service</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefService()
   * @generated
   * @ordered
   */
  protected EList<RefService> refService;

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
   * The cached value of the '{@link #getRefEnforcement() <em>Ref Enforcement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefEnforcement()
   * @generated
   * @ordered
   */
  protected EList<RefEnforcement> refEnforcement;

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
  protected InformativeImpl()
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
    return RSLIL4PrivacyPackage.Literals.INFORMATIVE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.INFORMATIVE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.INFORMATIVE__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.INFORMATIVE__CONDITION, oldCondition, condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Informative getPartInformative()
  {
    if (partInformative != null && partInformative.eIsProxy())
    {
      InternalEObject oldPartInformative = (InternalEObject)partInformative;
      partInformative = (Informative)eResolveProxy(oldPartInformative);
      if (partInformative != oldPartInformative)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLIL4PrivacyPackage.INFORMATIVE__PART_INFORMATIVE, oldPartInformative, partInformative));
      }
    }
    return partInformative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Informative basicGetPartInformative()
  {
    return partInformative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartInformative(Informative newPartInformative)
  {
    Informative oldPartInformative = partInformative;
    partInformative = newPartInformative;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.INFORMATIVE__PART_INFORMATIVE, oldPartInformative, partInformative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RefPrivateData> getRefPrivateData()
  {
    if (refPrivateData == null)
    {
      refPrivateData = new EObjectContainmentEList<RefPrivateData>(RefPrivateData.class, this, RSLIL4PrivacyPackage.INFORMATIVE__REF_PRIVATE_DATA);
    }
    return refPrivateData;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.INFORMATIVE__REF_PD_ALL, oldRefPDAll, refPDAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RefService> getRefService()
  {
    if (refService == null)
    {
      refService = new EObjectContainmentEList<RefService>(RefService.class, this, RSLIL4PrivacyPackage.INFORMATIVE__REF_SERVICE);
    }
    return refService;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.INFORMATIVE__REF_SALL, oldRefSAll, refSAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RefEnforcement> getRefEnforcement()
  {
    if (refEnforcement == null)
    {
      refEnforcement = new EObjectContainmentEList<RefEnforcement>(RefEnforcement.class, this, RSLIL4PrivacyPackage.INFORMATIVE__REF_ENFORCEMENT);
    }
    return refEnforcement;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.INFORMATIVE__REF_EALL, oldRefEAll, refEAll));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.INFORMATIVE__MODALITY, oldModality, modality));
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
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_PRIVATE_DATA:
        return ((InternalEList<?>)getRefPrivateData()).basicRemove(otherEnd, msgs);
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_SERVICE:
        return ((InternalEList<?>)getRefService()).basicRemove(otherEnd, msgs);
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_ENFORCEMENT:
        return ((InternalEList<?>)getRefEnforcement()).basicRemove(otherEnd, msgs);
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
      case RSLIL4PrivacyPackage.INFORMATIVE__NAME:
        return getName();
      case RSLIL4PrivacyPackage.INFORMATIVE__DESCRIPTION:
        return getDescription();
      case RSLIL4PrivacyPackage.INFORMATIVE__CONDITION:
        return getCondition();
      case RSLIL4PrivacyPackage.INFORMATIVE__PART_INFORMATIVE:
        if (resolve) return getPartInformative();
        return basicGetPartInformative();
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_PRIVATE_DATA:
        return getRefPrivateData();
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_PD_ALL:
        return getRefPDAll();
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_SERVICE:
        return getRefService();
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_SALL:
        return getRefSAll();
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_ENFORCEMENT:
        return getRefEnforcement();
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_EALL:
        return getRefEAll();
      case RSLIL4PrivacyPackage.INFORMATIVE__MODALITY:
        return getModality();
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
      case RSLIL4PrivacyPackage.INFORMATIVE__NAME:
        setName((String)newValue);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__CONDITION:
        setCondition((String)newValue);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__PART_INFORMATIVE:
        setPartInformative((Informative)newValue);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_PRIVATE_DATA:
        getRefPrivateData().clear();
        getRefPrivateData().addAll((Collection<? extends RefPrivateData>)newValue);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_PD_ALL:
        setRefPDAll((String)newValue);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_SERVICE:
        getRefService().clear();
        getRefService().addAll((Collection<? extends RefService>)newValue);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_SALL:
        setRefSAll((String)newValue);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_ENFORCEMENT:
        getRefEnforcement().clear();
        getRefEnforcement().addAll((Collection<? extends RefEnforcement>)newValue);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_EALL:
        setRefEAll((String)newValue);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__MODALITY:
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
      case RSLIL4PrivacyPackage.INFORMATIVE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__CONDITION:
        setCondition(CONDITION_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__PART_INFORMATIVE:
        setPartInformative((Informative)null);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_PRIVATE_DATA:
        getRefPrivateData().clear();
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_PD_ALL:
        setRefPDAll(REF_PD_ALL_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_SERVICE:
        getRefService().clear();
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_SALL:
        setRefSAll(REF_SALL_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_ENFORCEMENT:
        getRefEnforcement().clear();
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_EALL:
        setRefEAll(REF_EALL_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.INFORMATIVE__MODALITY:
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
      case RSLIL4PrivacyPackage.INFORMATIVE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLIL4PrivacyPackage.INFORMATIVE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLIL4PrivacyPackage.INFORMATIVE__CONDITION:
        return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
      case RSLIL4PrivacyPackage.INFORMATIVE__PART_INFORMATIVE:
        return partInformative != null;
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_PRIVATE_DATA:
        return refPrivateData != null && !refPrivateData.isEmpty();
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_PD_ALL:
        return REF_PD_ALL_EDEFAULT == null ? refPDAll != null : !REF_PD_ALL_EDEFAULT.equals(refPDAll);
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_SERVICE:
        return refService != null && !refService.isEmpty();
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_SALL:
        return REF_SALL_EDEFAULT == null ? refSAll != null : !REF_SALL_EDEFAULT.equals(refSAll);
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_ENFORCEMENT:
        return refEnforcement != null && !refEnforcement.isEmpty();
      case RSLIL4PrivacyPackage.INFORMATIVE__REF_EALL:
        return REF_EALL_EDEFAULT == null ? refEAll != null : !REF_EALL_EDEFAULT.equals(refEAll);
      case RSLIL4PrivacyPackage.INFORMATIVE__MODALITY:
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

} //InformativeImpl
