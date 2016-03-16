/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getCondition <em>Condition</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getPartCollection <em>Part Collection</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getRefPrivateData <em>Ref Private Data</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getRefService <em>Ref Service</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getRefEnforcement <em>Ref Enforcement</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getModality <em>Modality</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getCollection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getCollection_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute.
   * @see #setCondition(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getCollection_Condition()
   * @model
   * @generated
   */
  String getCondition();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getCondition <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' attribute.
   * @see #getCondition()
   * @generated
   */
  void setCondition(String value);

  /**
   * Returns the value of the '<em><b>Part Collection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Collection</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Collection</em>' reference.
   * @see #setPartCollection(Collection)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getCollection_PartCollection()
   * @model
   * @generated
   */
  Collection getPartCollection();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getPartCollection <em>Part Collection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part Collection</em>' reference.
   * @see #getPartCollection()
   * @generated
   */
  void setPartCollection(Collection value);

  /**
   * Returns the value of the '<em><b>Ref Private Data</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Private Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Private Data</em>' containment reference list.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getCollection_RefPrivateData()
   * @model containment="true"
   * @generated
   */
  EList<RefPrivateData> getRefPrivateData();

  /**
   * Returns the value of the '<em><b>Ref Service</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil4privacy.rSLIL4Privacy.RefService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Service</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Service</em>' containment reference list.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getCollection_RefService()
   * @model containment="true"
   * @generated
   */
  EList<RefService> getRefService();

  /**
   * Returns the value of the '<em><b>Ref Enforcement</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Enforcement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Enforcement</em>' containment reference list.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getCollection_RefEnforcement()
   * @model containment="true"
   * @generated
   */
  EList<RefEnforcement> getRefEnforcement();

  /**
   * Returns the value of the '<em><b>Modality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modality</em>' attribute.
   * @see #setModality(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getCollection_Modality()
   * @model
   * @generated
   */
  String getModality();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Collection#getModality <em>Modality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modality</em>' attribute.
   * @see #getModality()
   * @generated
   */
  void setModality(String value);

} // Collection
