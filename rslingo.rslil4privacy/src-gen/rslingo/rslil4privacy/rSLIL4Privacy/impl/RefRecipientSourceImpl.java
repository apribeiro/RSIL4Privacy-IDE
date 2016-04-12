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
import rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Recipient Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientSourceImpl#getRefRecipientSource <em>Ref Recipient Source</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefRecipientSourceImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefRecipientSourceImpl extends MinimalEObjectImpl.Container implements RefRecipientSource
{
  /**
   * The cached value of the '{@link #getRefRecipientSource() <em>Ref Recipient Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefRecipientSource()
   * @generated
   * @ordered
   */
  protected Recipient refRecipientSource;

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
  protected RefRecipientSourceImpl()
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
    return RSLIL4PrivacyPackage.Literals.REF_RECIPIENT_SOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipient getRefRecipientSource()
  {
    if (refRecipientSource != null && refRecipientSource.eIsProxy())
    {
      InternalEObject oldRefRecipientSource = (InternalEObject)refRecipientSource;
      refRecipientSource = (Recipient)eResolveProxy(oldRefRecipientSource);
      if (refRecipientSource != oldRefRecipientSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLIL4PrivacyPackage.REF_RECIPIENT_SOURCE__REF_RECIPIENT_SOURCE, oldRefRecipientSource, refRecipientSource));
      }
    }
    return refRecipientSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recipient basicGetRefRecipientSource()
  {
    return refRecipientSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefRecipientSource(Recipient newRefRecipientSource)
  {
    Recipient oldRefRecipientSource = refRecipientSource;
    refRecipientSource = newRefRecipientSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.REF_RECIPIENT_SOURCE__REF_RECIPIENT_SOURCE, oldRefRecipientSource, refRecipientSource));
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
      refs = new EObjectResolvingEList<Recipient>(Recipient.class, this, RSLIL4PrivacyPackage.REF_RECIPIENT_SOURCE__REFS);
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
      case RSLIL4PrivacyPackage.REF_RECIPIENT_SOURCE__REF_RECIPIENT_SOURCE:
        if (resolve) return getRefRecipientSource();
        return basicGetRefRecipientSource();
      case RSLIL4PrivacyPackage.REF_RECIPIENT_SOURCE__REFS:
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
      case RSLIL4PrivacyPackage.REF_RECIPIENT_SOURCE__REF_RECIPIENT_SOURCE:
        setRefRecipientSource((Recipient)newValue);
        return;
      case RSLIL4PrivacyPackage.REF_RECIPIENT_SOURCE__REFS:
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
      case RSLIL4PrivacyPackage.REF_RECIPIENT_SOURCE__REF_RECIPIENT_SOURCE:
        setRefRecipientSource((Recipient)null);
        return;
      case RSLIL4PrivacyPackage.REF_RECIPIENT_SOURCE__REFS:
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
      case RSLIL4PrivacyPackage.REF_RECIPIENT_SOURCE__REF_RECIPIENT_SOURCE:
        return refRecipientSource != null;
      case RSLIL4PrivacyPackage.REF_RECIPIENT_SOURCE__REFS:
        return refs != null && !refs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefRecipientSourceImpl
