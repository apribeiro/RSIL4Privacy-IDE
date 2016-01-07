/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Service;
import org.xtext.example.mydsl.myDsl.ServicePartof;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Partof</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ServicePartofImpl#getRefertoservice <em>Refertoservice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServicePartofImpl extends MinimalEObjectImpl.Container implements ServicePartof
{
  /**
   * The cached value of the '{@link #getRefertoservice() <em>Refertoservice</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefertoservice()
   * @generated
   * @ordered
   */
  protected Service refertoservice;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServicePartofImpl()
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
    return MyDslPackage.Literals.SERVICE_PARTOF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service getRefertoservice()
  {
    if (refertoservice != null && refertoservice.eIsProxy())
    {
      InternalEObject oldRefertoservice = (InternalEObject)refertoservice;
      refertoservice = (Service)eResolveProxy(oldRefertoservice);
      if (refertoservice != oldRefertoservice)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.SERVICE_PARTOF__REFERTOSERVICE, oldRefertoservice, refertoservice));
      }
    }
    return refertoservice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service basicGetRefertoservice()
  {
    return refertoservice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefertoservice(Service newRefertoservice)
  {
    Service oldRefertoservice = refertoservice;
    refertoservice = newRefertoservice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SERVICE_PARTOF__REFERTOSERVICE, oldRefertoservice, refertoservice));
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
      case MyDslPackage.SERVICE_PARTOF__REFERTOSERVICE:
        if (resolve) return getRefertoservice();
        return basicGetRefertoservice();
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
      case MyDslPackage.SERVICE_PARTOF__REFERTOSERVICE:
        setRefertoservice((Service)newValue);
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
      case MyDslPackage.SERVICE_PARTOF__REFERTOSERVICE:
        setRefertoservice((Service)null);
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
      case MyDslPackage.SERVICE_PARTOF__REFERTOSERVICE:
        return refertoservice != null;
    }
    return super.eIsSet(featureID);
  }

} //ServicePartofImpl
