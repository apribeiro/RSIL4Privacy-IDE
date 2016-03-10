/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rslingo.rslil4privacy.rSLIL4Privacy.Attribute;
import rslingo.rslil4privacy.rSLIL4Privacy.PrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Private Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.PrivateDataImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.PrivateDataImpl#getPrivatedata <em>Privatedata</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.PrivateDataImpl#getPrivateDataKind <em>Private Data Kind</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.PrivateDataImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivateDataImpl extends MinimalEObjectImpl.Container implements PrivateData
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPrivatedata() <em>Privatedata</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrivatedata()
   * @generated
   * @ordered
   */
  protected static final String PRIVATEDATA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrivatedata() <em>Privatedata</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrivatedata()
   * @generated
   * @ordered
   */
  protected String privatedata = PRIVATEDATA_EDEFAULT;

  /**
   * The default value of the '{@link #getPrivateDataKind() <em>Private Data Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrivateDataKind()
   * @generated
   * @ordered
   */
  protected static final String PRIVATE_DATA_KIND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrivateDataKind() <em>Private Data Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrivateDataKind()
   * @generated
   * @ordered
   */
  protected String privateDataKind = PRIVATE_DATA_KIND_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrivateDataImpl()
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
    return RSLIL4PrivacyPackage.Literals.PRIVATE_DATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.PRIVATE_DATA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrivatedata()
  {
    return privatedata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrivatedata(String newPrivatedata)
  {
    String oldPrivatedata = privatedata;
    privatedata = newPrivatedata;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.PRIVATE_DATA__PRIVATEDATA, oldPrivatedata, privatedata));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrivateDataKind()
  {
    return privateDataKind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrivateDataKind(String newPrivateDataKind)
  {
    String oldPrivateDataKind = privateDataKind;
    privateDataKind = newPrivateDataKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.PRIVATE_DATA__PRIVATE_DATA_KIND, oldPrivateDataKind, privateDataKind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttribute()
  {
    if (attribute == null)
    {
      attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, RSLIL4PrivacyPackage.PRIVATE_DATA__ATTRIBUTE);
    }
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RSLIL4PrivacyPackage.PRIVATE_DATA__ATTRIBUTE:
        return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RSLIL4PrivacyPackage.PRIVATE_DATA__NAME:
        return getName();
      case RSLIL4PrivacyPackage.PRIVATE_DATA__PRIVATEDATA:
        return getPrivatedata();
      case RSLIL4PrivacyPackage.PRIVATE_DATA__PRIVATE_DATA_KIND:
        return getPrivateDataKind();
      case RSLIL4PrivacyPackage.PRIVATE_DATA__ATTRIBUTE:
        return getAttribute();
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
      case RSLIL4PrivacyPackage.PRIVATE_DATA__NAME:
        setName((String)newValue);
        return;
      case RSLIL4PrivacyPackage.PRIVATE_DATA__PRIVATEDATA:
        setPrivatedata((String)newValue);
        return;
      case RSLIL4PrivacyPackage.PRIVATE_DATA__PRIVATE_DATA_KIND:
        setPrivateDataKind((String)newValue);
        return;
      case RSLIL4PrivacyPackage.PRIVATE_DATA__ATTRIBUTE:
        getAttribute().clear();
        getAttribute().addAll((Collection<? extends Attribute>)newValue);
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
      case RSLIL4PrivacyPackage.PRIVATE_DATA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.PRIVATE_DATA__PRIVATEDATA:
        setPrivatedata(PRIVATEDATA_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.PRIVATE_DATA__PRIVATE_DATA_KIND:
        setPrivateDataKind(PRIVATE_DATA_KIND_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.PRIVATE_DATA__ATTRIBUTE:
        getAttribute().clear();
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
      case RSLIL4PrivacyPackage.PRIVATE_DATA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLIL4PrivacyPackage.PRIVATE_DATA__PRIVATEDATA:
        return PRIVATEDATA_EDEFAULT == null ? privatedata != null : !PRIVATEDATA_EDEFAULT.equals(privatedata);
      case RSLIL4PrivacyPackage.PRIVATE_DATA__PRIVATE_DATA_KIND:
        return PRIVATE_DATA_KIND_EDEFAULT == null ? privateDataKind != null : !PRIVATE_DATA_KIND_EDEFAULT.equals(privateDataKind);
      case RSLIL4PrivacyPackage.PRIVATE_DATA__ATTRIBUTE:
        return attribute != null && !attribute.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", privatedata: ");
    result.append(privatedata);
    result.append(", PrivateDataKind: ");
    result.append(privateDataKind);
    result.append(')');
    return result.toString();
  }

} //PrivateDataImpl
