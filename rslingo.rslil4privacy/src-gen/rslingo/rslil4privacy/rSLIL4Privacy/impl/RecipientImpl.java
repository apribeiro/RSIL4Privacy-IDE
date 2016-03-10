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

import rslingo.rslil4privacy.rSLIL4Privacy.Partof;
import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.Recipient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl#getRecipientname <em>Recipientname</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl#getPartof <em>Partof</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl#getRecipientScopeKind <em>Recipient Scope Kind</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RecipientImpl#getRecipientTypeKind <em>Recipient Type Kind</em>}</li>
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
   * The default value of the '{@link #getRecipientname() <em>Recipientname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientname()
   * @generated
   * @ordered
   */
  protected static final String RECIPIENTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRecipientname() <em>Recipientname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientname()
   * @generated
   * @ordered
   */
  protected String recipientname = RECIPIENTNAME_EDEFAULT;

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
   * The cached value of the '{@link #getPartof() <em>Partof</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartof()
   * @generated
   * @ordered
   */
  protected EList<Partof> partof;

  /**
   * The default value of the '{@link #getRecipientScopeKind() <em>Recipient Scope Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientScopeKind()
   * @generated
   * @ordered
   */
  protected static final String RECIPIENT_SCOPE_KIND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRecipientScopeKind() <em>Recipient Scope Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientScopeKind()
   * @generated
   * @ordered
   */
  protected String recipientScopeKind = RECIPIENT_SCOPE_KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getRecipientTypeKind() <em>Recipient Type Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientTypeKind()
   * @generated
   * @ordered
   */
  protected static final String RECIPIENT_TYPE_KIND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRecipientTypeKind() <em>Recipient Type Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecipientTypeKind()
   * @generated
   * @ordered
   */
  protected String recipientTypeKind = RECIPIENT_TYPE_KIND_EDEFAULT;

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
  public String getRecipientname()
  {
    return recipientname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecipientname(String newRecipientname)
  {
    String oldRecipientname = recipientname;
    recipientname = newRecipientname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RECIPIENT__RECIPIENTNAME, oldRecipientname, recipientname));
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
  public EList<Partof> getPartof()
  {
    if (partof == null)
    {
      partof = new EObjectContainmentEList<Partof>(Partof.class, this, RSLIL4PrivacyPackage.RECIPIENT__PARTOF);
    }
    return partof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRecipientScopeKind()
  {
    return recipientScopeKind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecipientScopeKind(String newRecipientScopeKind)
  {
    String oldRecipientScopeKind = recipientScopeKind;
    recipientScopeKind = newRecipientScopeKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_SCOPE_KIND, oldRecipientScopeKind, recipientScopeKind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRecipientTypeKind()
  {
    return recipientTypeKind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecipientTypeKind(String newRecipientTypeKind)
  {
    String oldRecipientTypeKind = recipientTypeKind;
    recipientTypeKind = newRecipientTypeKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_TYPE_KIND, oldRecipientTypeKind, recipientTypeKind));
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
      case RSLIL4PrivacyPackage.RECIPIENT__PARTOF:
        return ((InternalEList<?>)getPartof()).basicRemove(otherEnd, msgs);
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
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENTNAME:
        return getRecipientname();
      case RSLIL4PrivacyPackage.RECIPIENT__DESCRIPTION:
        return getDescription();
      case RSLIL4PrivacyPackage.RECIPIENT__PARTOF:
        return getPartof();
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_SCOPE_KIND:
        return getRecipientScopeKind();
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_TYPE_KIND:
        return getRecipientTypeKind();
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
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENTNAME:
        setRecipientname((String)newValue);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__PARTOF:
        getPartof().clear();
        getPartof().addAll((Collection<? extends Partof>)newValue);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_SCOPE_KIND:
        setRecipientScopeKind((String)newValue);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_TYPE_KIND:
        setRecipientTypeKind((String)newValue);
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
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENTNAME:
        setRecipientname(RECIPIENTNAME_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__PARTOF:
        getPartof().clear();
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_SCOPE_KIND:
        setRecipientScopeKind(RECIPIENT_SCOPE_KIND_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_TYPE_KIND:
        setRecipientTypeKind(RECIPIENT_TYPE_KIND_EDEFAULT);
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
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENTNAME:
        return RECIPIENTNAME_EDEFAULT == null ? recipientname != null : !RECIPIENTNAME_EDEFAULT.equals(recipientname);
      case RSLIL4PrivacyPackage.RECIPIENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLIL4PrivacyPackage.RECIPIENT__PARTOF:
        return partof != null && !partof.isEmpty();
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_SCOPE_KIND:
        return RECIPIENT_SCOPE_KIND_EDEFAULT == null ? recipientScopeKind != null : !RECIPIENT_SCOPE_KIND_EDEFAULT.equals(recipientScopeKind);
      case RSLIL4PrivacyPackage.RECIPIENT__RECIPIENT_TYPE_KIND:
        return RECIPIENT_TYPE_KIND_EDEFAULT == null ? recipientTypeKind != null : !RECIPIENT_TYPE_KIND_EDEFAULT.equals(recipientTypeKind);
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
    result.append(", recipientname: ");
    result.append(recipientname);
    result.append(", description: ");
    result.append(description);
    result.append(", RecipientScopeKind: ");
    result.append(recipientScopeKind);
    result.append(", RecipientTypeKind: ");
    result.append(recipientTypeKind);
    result.append(')');
    return result.toString();
  }

} //RecipientImpl
