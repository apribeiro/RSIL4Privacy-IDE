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
import rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipient Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientPartImpl#getRecipientPart <em>Recipient Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipientPartImpl extends MinimalEObjectImpl.Container implements RecipientPart
{
  /**
   * The cached value of the '{@link #getRecipientPart() <em>Recipient Part</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientPart()
   * @generated
   * @ordered
   */
  protected Recipient recipientPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecipientPartImpl()
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
    return RSLIL4PrivacyPackage.Literals.RECIPIENT_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipient getRecipientPart()
  {
    if (recipientPart != null && recipientPart.eIsProxy())
    {
      InternalEObject oldRecipientPart = (InternalEObject)recipientPart;
      recipientPart = (Recipient)eResolveProxy(oldRecipientPart);
      if (recipientPart != oldRecipientPart)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLIL4PrivacyPackage.RECIPIENT_PART__RECIPIENT_PART, oldRecipientPart, recipientPart));
      }
    }
    return recipientPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipient basicGetRecipientPart()
  {
    return recipientPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecipientPart(Recipient newRecipientPart)
  {
    Recipient oldRecipientPart = recipientPart;
    recipientPart = newRecipientPart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RECIPIENT_PART__RECIPIENT_PART, oldRecipientPart, recipientPart));
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
      case RSLIL4PrivacyPackage.RECIPIENT_PART__RECIPIENT_PART:
        if (resolve) return getRecipientPart();
        return basicGetRecipientPart();
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
      case RSLIL4PrivacyPackage.RECIPIENT_PART__RECIPIENT_PART:
        setRecipientPart((Recipient)newValue);
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
      case RSLIL4PrivacyPackage.RECIPIENT_PART__RECIPIENT_PART:
        setRecipientPart((Recipient)null);
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
      case RSLIL4PrivacyPackage.RECIPIENT_PART__RECIPIENT_PART:
        return recipientPart != null;
    }
    return super.eIsSet(featureID);
  }

} //RecipientPartImpl
