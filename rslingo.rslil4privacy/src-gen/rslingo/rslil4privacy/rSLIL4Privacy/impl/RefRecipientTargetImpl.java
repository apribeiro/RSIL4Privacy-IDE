/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.Recipient;
import rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Recipient Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientTargetImpl#getRefRecipientTarget <em>Ref Recipient Target</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientTargetImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefRecipientTargetImpl extends MinimalEObjectImpl.Container implements RefRecipientTarget
{
  /**
   * The cached value of the '{@link #getRefRecipientTarget() <em>Ref Recipient Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefRecipientTarget()
   * @generated
   * @ordered
   */
  protected Recipient refRecipientTarget;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<Recipient> refs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefRecipientTargetImpl()
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
    return RSLIL4PrivacyPackage.Literals.REF_RECIPIENT_TARGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipient getRefRecipientTarget()
  {
    if (refRecipientTarget != null && refRecipientTarget.eIsProxy())
    {
      InternalEObject oldRefRecipientTarget = (InternalEObject)refRecipientTarget;
      refRecipientTarget = (Recipient)eResolveProxy(oldRefRecipientTarget);
      if (refRecipientTarget != oldRefRecipientTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLIL4PrivacyPackage.REF_RECIPIENT_TARGET__REF_RECIPIENT_TARGET, oldRefRecipientTarget, refRecipientTarget));
      }
    }
    return refRecipientTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipient basicGetRefRecipientTarget()
  {
    return refRecipientTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefRecipientTarget(Recipient newRefRecipientTarget)
  {
    Recipient oldRefRecipientTarget = refRecipientTarget;
    refRecipientTarget = newRefRecipientTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.REF_RECIPIENT_TARGET__REF_RECIPIENT_TARGET, oldRefRecipientTarget, refRecipientTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Recipient> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectResolvingEList<Recipient>(Recipient.class, this, RSLIL4PrivacyPackage.REF_RECIPIENT_TARGET__REFS);
    }
    return refs;
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
      case RSLIL4PrivacyPackage.REF_RECIPIENT_TARGET__REF_RECIPIENT_TARGET:
        if (resolve) return getRefRecipientTarget();
        return basicGetRefRecipientTarget();
      case RSLIL4PrivacyPackage.REF_RECIPIENT_TARGET__REFS:
        return getRefs();
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
      case RSLIL4PrivacyPackage.REF_RECIPIENT_TARGET__REF_RECIPIENT_TARGET:
        setRefRecipientTarget((Recipient)newValue);
        return;
      case RSLIL4PrivacyPackage.REF_RECIPIENT_TARGET__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends Recipient>)newValue);
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
      case RSLIL4PrivacyPackage.REF_RECIPIENT_TARGET__REF_RECIPIENT_TARGET:
        setRefRecipientTarget((Recipient)null);
        return;
      case RSLIL4PrivacyPackage.REF_RECIPIENT_TARGET__REFS:
        getRefs().clear();
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
      case RSLIL4PrivacyPackage.REF_RECIPIENT_TARGET__REF_RECIPIENT_TARGET:
        return refRecipientTarget != null;
      case RSLIL4PrivacyPackage.REF_RECIPIENT_TARGET__REFS:
        return refs != null && !refs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefRecipientTargetImpl
