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
import rslingo.rslil4privacy.rSLIL4Privacy.ServicePartof;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServiceImpl#getServicename <em>Servicename</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServiceImpl#getRefprivatedata <em>Refprivatedata</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServiceImpl#getServicepartof <em>Servicepartof</em>}</li>
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
   * The default value of the '{@link #getServicename() <em>Servicename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServicename()
   * @generated
   * @ordered
   */
  protected static final String SERVICENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServicename() <em>Servicename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServicename()
   * @generated
   * @ordered
   */
  protected String servicename = SERVICENAME_EDEFAULT;

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
   * The cached value of the '{@link #getRefprivatedata() <em>Refprivatedata</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefprivatedata()
   * @generated
   * @ordered
   */
  protected EList<RefPrivateData> refprivatedata;

  /**
   * The cached value of the '{@link #getServicepartof() <em>Servicepartof</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServicepartof()
   * @generated
   * @ordered
   */
  protected EList<ServicePartof> servicepartof;

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
  public String getServicename()
  {
    return servicename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServicename(String newServicename)
  {
    String oldServicename = servicename;
    servicename = newServicename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.SERVICE__SERVICENAME, oldServicename, servicename));
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
  public EList<RefPrivateData> getRefprivatedata()
  {
    if (refprivatedata == null)
    {
      refprivatedata = new EObjectContainmentEList<RefPrivateData>(RefPrivateData.class, this, RSLIL4PrivacyPackage.SERVICE__REFPRIVATEDATA);
    }
    return refprivatedata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServicePartof> getServicepartof()
  {
    if (servicepartof == null)
    {
      servicepartof = new EObjectContainmentEList<ServicePartof>(ServicePartof.class, this, RSLIL4PrivacyPackage.SERVICE__SERVICEPARTOF);
    }
    return servicepartof;
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
      case RSLIL4PrivacyPackage.SERVICE__REFPRIVATEDATA:
        return ((InternalEList<?>)getRefprivatedata()).basicRemove(otherEnd, msgs);
      case RSLIL4PrivacyPackage.SERVICE__SERVICEPARTOF:
        return ((InternalEList<?>)getServicepartof()).basicRemove(otherEnd, msgs);
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
      case RSLIL4PrivacyPackage.SERVICE__SERVICENAME:
        return getServicename();
      case RSLIL4PrivacyPackage.SERVICE__DESCRIPTION:
        return getDescription();
      case RSLIL4PrivacyPackage.SERVICE__REFPRIVATEDATA:
        return getRefprivatedata();
      case RSLIL4PrivacyPackage.SERVICE__SERVICEPARTOF:
        return getServicepartof();
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
      case RSLIL4PrivacyPackage.SERVICE__SERVICENAME:
        setServicename((String)newValue);
        return;
      case RSLIL4PrivacyPackage.SERVICE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLIL4PrivacyPackage.SERVICE__REFPRIVATEDATA:
        getRefprivatedata().clear();
        getRefprivatedata().addAll((Collection<? extends RefPrivateData>)newValue);
        return;
      case RSLIL4PrivacyPackage.SERVICE__SERVICEPARTOF:
        getServicepartof().clear();
        getServicepartof().addAll((Collection<? extends ServicePartof>)newValue);
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
      case RSLIL4PrivacyPackage.SERVICE__SERVICENAME:
        setServicename(SERVICENAME_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.SERVICE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.SERVICE__REFPRIVATEDATA:
        getRefprivatedata().clear();
        return;
      case RSLIL4PrivacyPackage.SERVICE__SERVICEPARTOF:
        getServicepartof().clear();
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
      case RSLIL4PrivacyPackage.SERVICE__SERVICENAME:
        return SERVICENAME_EDEFAULT == null ? servicename != null : !SERVICENAME_EDEFAULT.equals(servicename);
      case RSLIL4PrivacyPackage.SERVICE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLIL4PrivacyPackage.SERVICE__REFPRIVATEDATA:
        return refprivatedata != null && !refprivatedata.isEmpty();
      case RSLIL4PrivacyPackage.SERVICE__SERVICEPARTOF:
        return servicepartof != null && !servicepartof.isEmpty();
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
    result.append(", servicename: ");
    result.append(servicename);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ServiceImpl
