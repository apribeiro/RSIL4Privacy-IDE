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

import rslingo.rslil4privacy.rSLIL4Privacy.Enforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Enforcement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefEnforcementImpl#getRefEnforcement <em>Ref Enforcement</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RefEnforcementImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefEnforcementImpl extends MinimalEObjectImpl.Container implements RefEnforcement
{
  /**
   * The cached value of the '{@link #getRefEnforcement() <em>Ref Enforcement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefEnforcement()
   * @generated
   * @ordered
   */
  protected Enforcement refEnforcement;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<Enforcement> refs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefEnforcementImpl()
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
    return RSLIL4PrivacyPackage.Literals.REF_ENFORCEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enforcement getRefEnforcement()
  {
    if (refEnforcement != null && refEnforcement.eIsProxy())
    {
      InternalEObject oldRefEnforcement = (InternalEObject)refEnforcement;
      refEnforcement = (Enforcement)eResolveProxy(oldRefEnforcement);
      if (refEnforcement != oldRefEnforcement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLIL4PrivacyPackage.REF_ENFORCEMENT__REF_ENFORCEMENT, oldRefEnforcement, refEnforcement));
      }
    }
    return refEnforcement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enforcement basicGetRefEnforcement()
  {
    return refEnforcement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefEnforcement(Enforcement newRefEnforcement)
  {
    Enforcement oldRefEnforcement = refEnforcement;
    refEnforcement = newRefEnforcement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.REF_ENFORCEMENT__REF_ENFORCEMENT, oldRefEnforcement, refEnforcement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Enforcement> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectResolvingEList<Enforcement>(Enforcement.class, this, RSLIL4PrivacyPackage.REF_ENFORCEMENT__REFS);
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
      case RSLIL4PrivacyPackage.REF_ENFORCEMENT__REF_ENFORCEMENT:
        if (resolve) return getRefEnforcement();
        return basicGetRefEnforcement();
      case RSLIL4PrivacyPackage.REF_ENFORCEMENT__REFS:
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
      case RSLIL4PrivacyPackage.REF_ENFORCEMENT__REF_ENFORCEMENT:
        setRefEnforcement((Enforcement)newValue);
        return;
      case RSLIL4PrivacyPackage.REF_ENFORCEMENT__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends Enforcement>)newValue);
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
      case RSLIL4PrivacyPackage.REF_ENFORCEMENT__REF_ENFORCEMENT:
        setRefEnforcement((Enforcement)null);
        return;
      case RSLIL4PrivacyPackage.REF_ENFORCEMENT__REFS:
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
      case RSLIL4PrivacyPackage.REF_ENFORCEMENT__REF_ENFORCEMENT:
        return refEnforcement != null;
      case RSLIL4PrivacyPackage.REF_ENFORCEMENT__REFS:
        return refs != null && !refs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefEnforcementImpl
