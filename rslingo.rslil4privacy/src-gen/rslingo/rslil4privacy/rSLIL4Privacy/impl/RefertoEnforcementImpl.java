/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil4privacy.rSLIL4Privacy.Enforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.RefertoEnforcement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referto Enforcement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefertoEnforcementImpl#getRefst <em>Refst</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefertoEnforcementImpl extends MinimalEObjectImpl.Container implements RefertoEnforcement
{
  /**
   * The cached value of the '{@link #getRefst() <em>Refst</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefst()
   * @generated
   * @ordered
   */
  protected Enforcement refst;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefertoEnforcementImpl()
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
    return RSLIL4PrivacyPackage.Literals.REFERTO_ENFORCEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enforcement getRefst()
  {
    if (refst != null && refst.eIsProxy())
    {
      InternalEObject oldRefst = (InternalEObject)refst;
      refst = (Enforcement)eResolveProxy(oldRefst);
      if (refst != oldRefst)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLIL4PrivacyPackage.REFERTO_ENFORCEMENT__REFST, oldRefst, refst));
      }
    }
    return refst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enforcement basicGetRefst()
  {
    return refst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefst(Enforcement newRefst)
  {
    Enforcement oldRefst = refst;
    refst = newRefst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.REFERTO_ENFORCEMENT__REFST, oldRefst, refst));
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
      case RSLIL4PrivacyPackage.REFERTO_ENFORCEMENT__REFST:
        if (resolve) return getRefst();
        return basicGetRefst();
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
      case RSLIL4PrivacyPackage.REFERTO_ENFORCEMENT__REFST:
        setRefst((Enforcement)newValue);
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
      case RSLIL4PrivacyPackage.REFERTO_ENFORCEMENT__REFST:
        setRefst((Enforcement)null);
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
      case RSLIL4PrivacyPackage.REFERTO_ENFORCEMENT__REFST:
        return refst != null;
    }
    return super.eIsSet(featureID);
  }

} //RefertoEnforcementImpl
