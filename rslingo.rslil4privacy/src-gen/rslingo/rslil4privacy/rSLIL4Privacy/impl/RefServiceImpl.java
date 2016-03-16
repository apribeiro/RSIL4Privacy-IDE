/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.RefService;
import rslingo.rslil4privacy.rSLIL4Privacy.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefServiceImpl#getRefService <em>Ref Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefServiceImpl extends MinimalEObjectImpl.Container implements RefService
{
  /**
   * The cached value of the '{@link #getRefService() <em>Ref Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefService()
   * @generated
   * @ordered
   */
  protected Service refService;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefServiceImpl()
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
    return RSLIL4PrivacyPackage.Literals.REF_SERVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service getRefService()
  {
    if (refService != null && refService.eIsProxy())
    {
      InternalEObject oldRefService = (InternalEObject)refService;
      refService = (Service)eResolveProxy(oldRefService);
      if (refService != oldRefService)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLIL4PrivacyPackage.REF_SERVICE__REF_SERVICE, oldRefService, refService));
      }
    }
    return refService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service basicGetRefService()
  {
    return refService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefService(Service newRefService)
  {
    Service oldRefService = refService;
    refService = newRefService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.REF_SERVICE__REF_SERVICE, oldRefService, refService));
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
      case RSLIL4PrivacyPackage.REF_SERVICE__REF_SERVICE:
        if (resolve) return getRefService();
        return basicGetRefService();
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
      case RSLIL4PrivacyPackage.REF_SERVICE__REF_SERVICE:
        setRefService((Service)newValue);
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
      case RSLIL4PrivacyPackage.REF_SERVICE__REF_SERVICE:
        setRefService((Service)null);
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
      case RSLIL4PrivacyPackage.REF_SERVICE__REF_SERVICE:
        return refService != null;
    }
    return super.eIsSet(featureID);
  }

} //RefServiceImpl
