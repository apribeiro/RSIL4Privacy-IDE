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

import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.Service;
import rslingo.rslil4privacy.rSLIL4Privacy.ServicePart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServiceImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServiceImpl#getRefPrivateData <em>Ref Private Data</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServiceImpl#getRefPDAll <em>Ref PD All</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServiceImpl#getServicePart <em>Service Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service
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
   * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceName()
   * @generated
   * @ordered
   */
  protected static final String SERVICE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceName()
   * @generated
   * @ordered
   */
  protected String serviceName = SERVICE_NAME_EDEFAULT;

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
   * The cached value of the '{@link #getServicePart() <em>Service Part</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServicePart()
   * @generated
   * @ordered
   */
  protected EList<ServicePart> servicePart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceImpl()
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
    return RSLIL4PrivacyPackage.Literals.SERVICE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.SERVICE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServiceName()
  {
    return serviceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceName(String newServiceName)
  {
    String oldServiceName = serviceName;
    serviceName = newServiceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.SERVICE__SERVICE_NAME, oldServiceName, serviceName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.SERVICE__DESCRIPTION, oldDescription, description));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.SERVICE__REF_PRIVATE_DATA, oldRefPrivateData, newRefPrivateData);
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
        msgs = ((InternalEObject)refPrivateData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.SERVICE__REF_PRIVATE_DATA, null, msgs);
      if (newRefPrivateData != null)
        msgs = ((InternalEObject)newRefPrivateData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.SERVICE__REF_PRIVATE_DATA, null, msgs);
      msgs = basicSetRefPrivateData(newRefPrivateData, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.SERVICE__REF_PRIVATE_DATA, newRefPrivateData, newRefPrivateData));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.SERVICE__REF_PD_ALL, oldRefPDAll, refPDAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServicePart> getServicePart()
  {
    if (servicePart == null)
    {
      servicePart = new EObjectContainmentEList<ServicePart>(ServicePart.class, this, RSLIL4PrivacyPackage.SERVICE__SERVICE_PART);
    }
    return servicePart;
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
      case RSLIL4PrivacyPackage.SERVICE__REF_PRIVATE_DATA:
        return basicSetRefPrivateData(null, msgs);
      case RSLIL4PrivacyPackage.SERVICE__SERVICE_PART:
        return ((InternalEList<?>)getServicePart()).basicRemove(otherEnd, msgs);
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
      case RSLIL4PrivacyPackage.SERVICE__NAME:
        return getName();
      case RSLIL4PrivacyPackage.SERVICE__SERVICE_NAME:
        return getServiceName();
      case RSLIL4PrivacyPackage.SERVICE__DESCRIPTION:
        return getDescription();
      case RSLIL4PrivacyPackage.SERVICE__REF_PRIVATE_DATA:
        return getRefPrivateData();
      case RSLIL4PrivacyPackage.SERVICE__REF_PD_ALL:
        return getRefPDAll();
      case RSLIL4PrivacyPackage.SERVICE__SERVICE_PART:
        return getServicePart();
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
      case RSLIL4PrivacyPackage.SERVICE__NAME:
        setName((String)newValue);
        return;
      case RSLIL4PrivacyPackage.SERVICE__SERVICE_NAME:
        setServiceName((String)newValue);
        return;
      case RSLIL4PrivacyPackage.SERVICE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLIL4PrivacyPackage.SERVICE__REF_PRIVATE_DATA:
        setRefPrivateData((RefPrivateData)newValue);
        return;
      case RSLIL4PrivacyPackage.SERVICE__REF_PD_ALL:
        setRefPDAll((String)newValue);
        return;
      case RSLIL4PrivacyPackage.SERVICE__SERVICE_PART:
        getServicePart().clear();
        getServicePart().addAll((Collection<? extends ServicePart>)newValue);
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
      case RSLIL4PrivacyPackage.SERVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.SERVICE__SERVICE_NAME:
        setServiceName(SERVICE_NAME_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.SERVICE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.SERVICE__REF_PRIVATE_DATA:
        setRefPrivateData((RefPrivateData)null);
        return;
      case RSLIL4PrivacyPackage.SERVICE__REF_PD_ALL:
        setRefPDAll(REF_PD_ALL_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.SERVICE__SERVICE_PART:
        getServicePart().clear();
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
      case RSLIL4PrivacyPackage.SERVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLIL4PrivacyPackage.SERVICE__SERVICE_NAME:
        return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
      case RSLIL4PrivacyPackage.SERVICE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLIL4PrivacyPackage.SERVICE__REF_PRIVATE_DATA:
        return refPrivateData != null;
      case RSLIL4PrivacyPackage.SERVICE__REF_PD_ALL:
        return REF_PD_ALL_EDEFAULT == null ? refPDAll != null : !REF_PD_ALL_EDEFAULT.equals(refPDAll);
      case RSLIL4PrivacyPackage.SERVICE__SERVICE_PART:
        return servicePart != null && !servicePart.isEmpty();
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
    result.append(", serviceName: ");
    result.append(serviceName);
    result.append(", description: ");
    result.append(description);
    result.append(", refPDAll: ");
    result.append(refPDAll);
    result.append(')');
    return result.toString();
  }

} //ServiceImpl
