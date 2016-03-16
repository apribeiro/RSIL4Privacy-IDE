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
import rslingo.rslil4privacy.rSLIL4Privacy.RefRecipient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Recipient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientImpl#getRefRecipient <em>Ref Recipient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefRecipientImpl extends MinimalEObjectImpl.Container implements RefRecipient
{
  /**
   * The cached value of the '{@link #getRefRecipient() <em>Ref Recipient</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefRecipient()
   * @generated
   * @ordered
   */
  protected Recipient refRecipient;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefRecipientImpl()
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
    return RSLIL4PrivacyPackage.Literals.REF_RECIPIENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipient getRefRecipient()
  {
    if (refRecipient != null && refRecipient.eIsProxy())
    {
      InternalEObject oldRefRecipient = (InternalEObject)refRecipient;
      refRecipient = (Recipient)eResolveProxy(oldRefRecipient);
      if (refRecipient != oldRefRecipient)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLIL4PrivacyPackage.REF_RECIPIENT__REF_RECIPIENT, oldRefRecipient, refRecipient));
      }
    }
    return refRecipient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipient basicGetRefRecipient()
  {
    return refRecipient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefRecipient(Recipient newRefRecipient)
  {
    Recipient oldRefRecipient = refRecipient;
    refRecipient = newRefRecipient;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.REF_RECIPIENT__REF_RECIPIENT, oldRefRecipient, refRecipient));
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
      case RSLIL4PrivacyPackage.REF_RECIPIENT__REF_RECIPIENT:
        if (resolve) return getRefRecipient();
        return basicGetRefRecipient();
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
      case RSLIL4PrivacyPackage.REF_RECIPIENT__REF_RECIPIENT:
        setRefRecipient((Recipient)newValue);
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
      case RSLIL4PrivacyPackage.REF_RECIPIENT__REF_RECIPIENT:
        setRefRecipient((Recipient)null);
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
      case RSLIL4PrivacyPackage.REF_RECIPIENT__REF_RECIPIENT:
        return refRecipient != null;
    }
    return super.eIsSet(featureID);
  }

} //RefRecipientImpl
