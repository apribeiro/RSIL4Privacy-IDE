/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.ReferToService;
import rslingo.rslil4privacy.rSLIL4Privacy.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refer To Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToServiceImpl#getRefertose <em>Refertose</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferToServiceImpl extends MinimalEObjectImpl.Container implements ReferToService
{
  /**
   * The cached value of the '{@link #getRefertose() <em>Refertose</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefertose()
   * @generated
   * @ordered
   */
  protected Service refertose;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferToServiceImpl()
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
    return RSLIL4PrivacyPackage.Literals.REFER_TO_SERVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service getRefertose()
  {
    if (refertose != null && refertose.eIsProxy())
    {
      InternalEObject oldRefertose = (InternalEObject)refertose;
      refertose = (Service)eResolveProxy(oldRefertose);
      if (refertose != oldRefertose)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLIL4PrivacyPackage.REFER_TO_SERVICE__REFERTOSE, oldRefertose, refertose));
      }
    }
    return refertose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service basicGetRefertose()
  {
    return refertose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefertose(Service newRefertose)
  {
    Service oldRefertose = refertose;
    refertose = newRefertose;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.REFER_TO_SERVICE__REFERTOSE, oldRefertose, refertose));
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
      case RSLIL4PrivacyPackage.REFER_TO_SERVICE__REFERTOSE:
        if (resolve) return getRefertose();
        return basicGetRefertose();
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
      case RSLIL4PrivacyPackage.REFER_TO_SERVICE__REFERTOSE:
        setRefertose((Service)newValue);
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
      case RSLIL4PrivacyPackage.REFER_TO_SERVICE__REFERTOSE:
        setRefertose((Service)null);
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
      case RSLIL4PrivacyPackage.REFER_TO_SERVICE__REFERTOSE:
        return refertose != null;
    }
    return super.eIsSet(featureID);
  }

} //ReferToServiceImpl
