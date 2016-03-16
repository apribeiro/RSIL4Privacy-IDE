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

import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.Recipient;
import rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl#getRecipientName <em>Recipient Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl#getRecipientPart <em>Recipient Part</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipientImpl extends MinimalEObjectImpl.Container implements Recipient
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
   * The default value of the '{@link #getRecipientName() <em>Recipient Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientName()
   * @generated
   * @ordered
   */
  protected static final String RECIPIENT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRecipientName() <em>Recipient Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientName()
   * @generated
   * @ordered
   */
  protected String recipientName = RECIPIENT_NAME_EDEFAULT;

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
   * The cached value of the '{@link #getRecipientPart() <em>Recipient Part</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientPart()
   * @generated
   * @ordered
   */
  protected EList<RecipientPart> recipientPart;

  /**
   * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected static final String SCOPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected String scope = SCOPE_EDEFAULT;

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
  protected RecipientImpl()
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
    return RSLIL4PrivacyPackage.Literals.RECIPIENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RECIPIENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRecipientName()
  {
    return recipientName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecipientName(String newRecipientName)
  {
    String oldRecipientName = recipientName;
    recipientName = newRecipientName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_NAME, oldRecipientName, recipientName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RECIPIENT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RecipientPart> getRecipientPart()
  {
    if (recipientPart == null)
    {
      recipientPart = new EObjectContainmentEList<RecipientPart>(RecipientPart.class, this, RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_PART);
    }
    return recipientPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScope()
  {
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScope(String newScope)
  {
    String oldScope = scope;
    scope = newScope;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RECIPIENT__SCOPE, oldScope, scope));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RECIPIENT__TYPE, oldType, type));
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
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_PART:
        return ((InternalEList<?>)getRecipientPart()).basicRemove(otherEnd, msgs);
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
      case RSLIL4PrivacyPackage.RECIPIENT__NAME:
        return getName();
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_NAME:
        return getRecipientName();
      case RSLIL4PrivacyPackage.RECIPIENT__DESCRIPTION:
        return getDescription();
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_PART:
        return getRecipientPart();
      case RSLIL4PrivacyPackage.RECIPIENT__SCOPE:
        return getScope();
      case RSLIL4PrivacyPackage.RECIPIENT__TYPE:
        return getType();
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
      case RSLIL4PrivacyPackage.RECIPIENT__NAME:
        setName((String)newValue);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_NAME:
        setRecipientName((String)newValue);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_PART:
        getRecipientPart().clear();
        getRecipientPart().addAll((Collection<? extends RecipientPart>)newValue);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__SCOPE:
        setScope((String)newValue);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__TYPE:
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
      case RSLIL4PrivacyPackage.RECIPIENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_NAME:
        setRecipientName(RECIPIENT_NAME_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_PART:
        getRecipientPart().clear();
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__SCOPE:
        setScope(SCOPE_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__TYPE:
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
      case RSLIL4PrivacyPackage.RECIPIENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_NAME:
        return RECIPIENT_NAME_EDEFAULT == null ? recipientName != null : !RECIPIENT_NAME_EDEFAULT.equals(recipientName);
      case RSLIL4PrivacyPackage.RECIPIENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_PART:
        return recipientPart != null && !recipientPart.isEmpty();
      case RSLIL4PrivacyPackage.RECIPIENT__SCOPE:
        return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
      case RSLIL4PrivacyPackage.RECIPIENT__TYPE:
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
    result.append(", recipientName: ");
    result.append(recipientName);
    result.append(", description: ");
    result.append(description);
    result.append(", scope: ");
    result.append(scope);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //RecipientImpl
