/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.Service;
import rslingo.rslil4privacy.rSLIL4Privacy.ServicePart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ServicePartImpl#getServicePart <em>Service Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServicePartImpl extends MinimalEObjectImpl.Container implements ServicePart
{
  /**
   * The cached value of the '{@link #getServicePart() <em>Service Part</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServicePart()
   * @generated
   * @ordered
   */
  protected Service servicePart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServicePartImpl()
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
    return RSLIL4PrivacyPackage.Literals.SERVICE_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service getServicePart()
  {
    if (servicePart != null && servicePart.eIsProxy())
    {
      InternalEObject oldServicePart = (InternalEObject)servicePart;
      servicePart = (Service)eResolveProxy(oldServicePart);
      if (servicePart != oldServicePart)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLIL4PrivacyPackage.SERVICE_PART__SERVICE_PART, oldServicePart, servicePart));
      }
    }
    return servicePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service basicGetServicePart()
  {
    return servicePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServicePart(Service newServicePart)
  {
    Service oldServicePart = servicePart;
    servicePart = newServicePart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.SERVICE_PART__SERVICE_PART, oldServicePart, servicePart));
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
      case RSLIL4PrivacyPackage.SERVICE_PART__SERVICE_PART:
        if (resolve) return getServicePart();
        return basicGetServicePart();
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
      case RSLIL4PrivacyPackage.SERVICE_PART__SERVICE_PART:
        setServicePart((Service)newValue);
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
      case RSLIL4PrivacyPackage.SERVICE_PART__SERVICE_PART:
        setServicePart((Service)null);
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
      case RSLIL4PrivacyPackage.SERVICE_PART__SERVICE_PART:
        return servicePart != null;
    }
    return super.eIsSet(featureID);
  }

} //ServicePartImpl
