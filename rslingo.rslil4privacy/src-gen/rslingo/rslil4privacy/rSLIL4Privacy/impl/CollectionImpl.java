/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rslingo.rslil4privacy.rSLIL4Privacy.Collection;
import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.RefService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.CollectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.CollectionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.CollectionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.CollectionImpl#getPartCollection <em>Part Collection</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.CollectionImpl#getRefPrivateData <em>Ref Private Data</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.CollectionImpl#getRefService <em>Ref Service</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.CollectionImpl#getRefEnforcement <em>Ref Enforcement</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.CollectionImpl#getModality <em>Modality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionImpl extends MinimalEObjectImpl.Container implements Collection
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
   * The cached value of the '{@link #getPartCollection() <em>Part Collection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartCollection()
   * @generated
   * @ordered
   */
  protected Collection partCollection;

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
   * The cached value of the '{@link #getRefService() <em>Ref Service</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefService()
   * @generated
   * @ordered
   */
  protected EList<RefService> refService;

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
  protected CollectionImpl()
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
    return RSLIL4PrivacyPackage.Literals.COLLECTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.COLLECTION__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.COLLECTION__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.COLLECTION__CONDITION, oldCondition, condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection getPartCollection()
  {
    if (partCollection != null && partCollection.eIsProxy())
    {
      InternalEObject oldPartCollection = (InternalEObject)partCollection;
      partCollection = (Collection)eResolveProxy(oldPartCollection);
      if (partCollection != oldPartCollection)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLIL4PrivacyPackage.COLLECTION__PART_COLLECTION, oldPartCollection, partCollection));
      }
    }
    return partCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection basicGetPartCollection()
  {
    return partCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartCollection(Collection newPartCollection)
  {
    Collection oldPartCollection = partCollection;
    partCollection = newPartCollection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.COLLECTION__PART_COLLECTION, oldPartCollection, partCollection));
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
      refPrivateData = new EObjectContainmentEList<RefPrivateData>(RefPrivateData.class, this, RSLIL4PrivacyPackage.COLLECTION__REF_PRIVATE_DATA);
    }
    return refPrivateData;
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
      refService = new EObjectContainmentEList<RefService>(RefService.class, this, RSLIL4PrivacyPackage.COLLECTION__REF_SERVICE);
    }
    return refService;
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
      refEnforcement = new EObjectContainmentEList<RefEnforcement>(RefEnforcement.class, this, RSLIL4PrivacyPackage.COLLECTION__REF_ENFORCEMENT);
    }
    return refEnforcement;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.COLLECTION__MODALITY, oldModality, modality));
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
      case RSLIL4PrivacyPackage.COLLECTION__REF_PRIVATE_DATA:
        return ((InternalEList<?>)getRefPrivateData()).basicRemove(otherEnd, msgs);
      case RSLIL4PrivacyPackage.COLLECTION__REF_SERVICE:
        return ((InternalEList<?>)getRefService()).basicRemove(otherEnd, msgs);
      case RSLIL4PrivacyPackage.COLLECTION__REF_ENFORCEMENT:
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
      case RSLIL4PrivacyPackage.COLLECTION__NAME:
        return getName();
      case RSLIL4PrivacyPackage.COLLECTION__DESCRIPTION:
        return getDescription();
      case RSLIL4PrivacyPackage.COLLECTION__CONDITION:
        return getCondition();
      case RSLIL4PrivacyPackage.COLLECTION__PART_COLLECTION:
        if (resolve) return getPartCollection();
        return basicGetPartCollection();
      case RSLIL4PrivacyPackage.COLLECTION__REF_PRIVATE_DATA:
        return getRefPrivateData();
      case RSLIL4PrivacyPackage.COLLECTION__REF_SERVICE:
        return getRefService();
      case RSLIL4PrivacyPackage.COLLECTION__REF_ENFORCEMENT:
        return getRefEnforcement();
      case RSLIL4PrivacyPackage.COLLECTION__MODALITY:
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
      case RSLIL4PrivacyPackage.COLLECTION__NAME:
        setName((String)newValue);
        return;
      case RSLIL4PrivacyPackage.COLLECTION__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLIL4PrivacyPackage.COLLECTION__CONDITION:
        setCondition((String)newValue);
        return;
      case RSLIL4PrivacyPackage.COLLECTION__PART_COLLECTION:
        setPartCollection((Collection)newValue);
        return;
      case RSLIL4PrivacyPackage.COLLECTION__REF_PRIVATE_DATA:
        getRefPrivateData().clear();
        getRefPrivateData().addAll((java.util.Collection<? extends RefPrivateData>)newValue);
        return;
      case RSLIL4PrivacyPackage.COLLECTION__REF_SERVICE:
        getRefService().clear();
        getRefService().addAll((java.util.Collection<? extends RefService>)newValue);
        return;
      case RSLIL4PrivacyPackage.COLLECTION__REF_ENFORCEMENT:
        getRefEnforcement().clear();
        getRefEnforcement().addAll((java.util.Collection<? extends RefEnforcement>)newValue);
        return;
      case RSLIL4PrivacyPackage.COLLECTION__MODALITY:
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
      case RSLIL4PrivacyPackage.COLLECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.COLLECTION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.COLLECTION__CONDITION:
        setCondition(CONDITION_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.COLLECTION__PART_COLLECTION:
        setPartCollection((Collection)null);
        return;
      case RSLIL4PrivacyPackage.COLLECTION__REF_PRIVATE_DATA:
        getRefPrivateData().clear();
        return;
      case RSLIL4PrivacyPackage.COLLECTION__REF_SERVICE:
        getRefService().clear();
        return;
      case RSLIL4PrivacyPackage.COLLECTION__REF_ENFORCEMENT:
        getRefEnforcement().clear();
        return;
      case RSLIL4PrivacyPackage.COLLECTION__MODALITY:
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
      case RSLIL4PrivacyPackage.COLLECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLIL4PrivacyPackage.COLLECTION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLIL4PrivacyPackage.COLLECTION__CONDITION:
        return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
      case RSLIL4PrivacyPackage.COLLECTION__PART_COLLECTION:
        return partCollection != null;
      case RSLIL4PrivacyPackage.COLLECTION__REF_PRIVATE_DATA:
        return refPrivateData != null && !refPrivateData.isEmpty();
      case RSLIL4PrivacyPackage.COLLECTION__REF_SERVICE:
        return refService != null && !refService.isEmpty();
      case RSLIL4PrivacyPackage.COLLECTION__REF_ENFORCEMENT:
        return refEnforcement != null && !refEnforcement.isEmpty();
      case RSLIL4PrivacyPackage.COLLECTION__MODALITY:
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
    result.append(", modality: ");
    result.append(modality);
    result.append(')');
    return result.toString();
  }

} //CollectionImpl
