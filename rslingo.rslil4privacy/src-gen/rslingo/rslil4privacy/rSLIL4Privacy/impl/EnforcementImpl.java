/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil4privacy.rSLIL4Privacy.Enforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enforcement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.EnforcementImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.EnforcementImpl#getEnforcementName <em>Enforcement Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.EnforcementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.EnforcementImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnforcementImpl extends MinimalEObjectImpl.Container implements Enforcement
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
   * The default value of the '{@link #getEnforcementName() <em>Enforcement Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnforcementName()
   * @generated
   * @ordered
   */
  protected static final String ENFORCEMENT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnforcementName() <em>Enforcement Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnforcementName()
   * @generated
   * @ordered
   */
  protected String enforcementName = ENFORCEMENT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnforcementImpl()
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
    return RSLIL4PrivacyPackage.Literals.ENFORCEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.ENFORCEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnforcementName()
  {
    return enforcementName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnforcementName(String newEnforcementName)
  {
    String oldEnforcementName = enforcementName;
    enforcementName = newEnforcementName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.ENFORCEMENT__ENFORCEMENT_NAME, oldEnforcementName, enforcementName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.ENFORCEMENT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.ENFORCEMENT__TYPE, oldType, type));
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
      case RSLIL4PrivacyPackage.ENFORCEMENT__NAME:
        return getName();
      case RSLIL4PrivacyPackage.ENFORCEMENT__ENFORCEMENT_NAME:
        return getEnforcementName();
      case RSLIL4PrivacyPackage.ENFORCEMENT__DESCRIPTION:
        return getDescription();
      case RSLIL4PrivacyPackage.ENFORCEMENT__TYPE:
        return getType();
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
      case RSLIL4PrivacyPackage.ENFORCEMENT__NAME:
        setName((String)newValue);
        return;
      case RSLIL4PrivacyPackage.ENFORCEMENT__ENFORCEMENT_NAME:
        setEnforcementName((String)newValue);
        return;
      case RSLIL4PrivacyPackage.ENFORCEMENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLIL4PrivacyPackage.ENFORCEMENT__TYPE:
        setType((String)newValue);
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
      case RSLIL4PrivacyPackage.ENFORCEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.ENFORCEMENT__ENFORCEMENT_NAME:
        setEnforcementName(ENFORCEMENT_NAME_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.ENFORCEMENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.ENFORCEMENT__TYPE:
        setType(TYPE_EDEFAULT);
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
      case RSLIL4PrivacyPackage.ENFORCEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLIL4PrivacyPackage.ENFORCEMENT__ENFORCEMENT_NAME:
        return ENFORCEMENT_NAME_EDEFAULT == null ? enforcementName != null : !ENFORCEMENT_NAME_EDEFAULT.equals(enforcementName);
      case RSLIL4PrivacyPackage.ENFORCEMENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLIL4PrivacyPackage.ENFORCEMENT__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
    result.append(", enforcementName: ");
    result.append(enforcementName);
    result.append(", description: ");
    result.append(description);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //EnforcementImpl
