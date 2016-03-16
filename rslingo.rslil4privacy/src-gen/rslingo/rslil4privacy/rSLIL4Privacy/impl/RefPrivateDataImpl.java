/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil4privacy.rSLIL4Privacy.PrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Private Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefPrivateDataImpl#getRefPrivateData <em>Ref Private Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefPrivateDataImpl extends MinimalEObjectImpl.Container implements RefPrivateData
{
  /**
   * The cached value of the '{@link #getRefPrivateData() <em>Ref Private Data</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefPrivateData()
   * @generated
   * @ordered
   */
  protected PrivateData refPrivateData;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefPrivateDataImpl()
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
    return RSLIL4PrivacyPackage.Literals.REF_PRIVATE_DATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrivateData getRefPrivateData()
  {
    if (refPrivateData != null && refPrivateData.eIsProxy())
    {
      InternalEObject oldRefPrivateData = (InternalEObject)refPrivateData;
      refPrivateData = (PrivateData)eResolveProxy(oldRefPrivateData);
      if (refPrivateData != oldRefPrivateData)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLIL4PrivacyPackage.REF_PRIVATE_DATA__REF_PRIVATE_DATA, oldRefPrivateData, refPrivateData));
      }
    }
    return refPrivateData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrivateData basicGetRefPrivateData()
  {
    return refPrivateData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefPrivateData(PrivateData newRefPrivateData)
  {
    PrivateData oldRefPrivateData = refPrivateData;
    refPrivateData = newRefPrivateData;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.REF_PRIVATE_DATA__REF_PRIVATE_DATA, oldRefPrivateData, refPrivateData));
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
      case RSLIL4PrivacyPackage.REF_PRIVATE_DATA__REF_PRIVATE_DATA:
        if (resolve) return getRefPrivateData();
        return basicGetRefPrivateData();
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
      case RSLIL4PrivacyPackage.REF_PRIVATE_DATA__REF_PRIVATE_DATA:
        setRefPrivateData((PrivateData)newValue);
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
      case RSLIL4PrivacyPackage.REF_PRIVATE_DATA__REF_PRIVATE_DATA:
        setRefPrivateData((PrivateData)null);
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
      case RSLIL4PrivacyPackage.REF_PRIVATE_DATA__REF_PRIVATE_DATA:
        return refPrivateData != null;
    }
    return super.eIsSet(featureID);
  }

} //RefPrivateDataImpl
