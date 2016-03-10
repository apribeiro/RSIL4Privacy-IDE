/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.Recipient;
import rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipientSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refer To Recipient Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.ReferToRecipientSourceImpl#getRefertore <em>Refertore</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferToRecipientSourceImpl extends MinimalEObjectImpl.Container implements ReferToRecipientSource
{
  /**
   * The cached value of the '{@link #getRefertore() <em>Refertore</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefertore()
   * @generated
   * @ordered
   */
  protected Recipient refertore;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferToRecipientSourceImpl()
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
    return RSLIL4PrivacyPackage.Literals.REFER_TO_RECIPIENT_SOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipient getRefertore()
  {
    if (refertore != null && refertore.eIsProxy())
    {
      InternalEObject oldRefertore = (InternalEObject)refertore;
      refertore = (Recipient)eResolveProxy(oldRefertore);
      if (refertore != oldRefertore)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLIL4PrivacyPackage.REFER_TO_RECIPIENT_SOURCE__REFERTORE, oldRefertore, refertore));
      }
    }
    return refertore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipient basicGetRefertore()
  {
    return refertore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefertore(Recipient newRefertore)
  {
    Recipient oldRefertore = refertore;
    refertore = newRefertore;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.REFER_TO_RECIPIENT_SOURCE__REFERTORE, oldRefertore, refertore));
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
      case RSLIL4PrivacyPackage.REFER_TO_RECIPIENT_SOURCE__REFERTORE:
        if (resolve) return getRefertore();
        return basicGetRefertore();
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
      case RSLIL4PrivacyPackage.REFER_TO_RECIPIENT_SOURCE__REFERTORE:
        setRefertore((Recipient)newValue);
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
      case RSLIL4PrivacyPackage.REFER_TO_RECIPIENT_SOURCE__REFERTORE:
        setRefertore((Recipient)null);
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
      case RSLIL4PrivacyPackage.REFER_TO_RECIPIENT_SOURCE__REFERTORE:
        return refertore != null;
    }
    return super.eIsSet(featureID);
  }

} //ReferToRecipientSourceImpl
