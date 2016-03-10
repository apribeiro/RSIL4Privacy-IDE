/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getPrivatedata <em>Privatedata</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getPrivateDataKind <em>Private Data Kind</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getPrivateData()
 * @model
 * @generated
 */
public interface PrivateData extends EObject
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
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getPrivateData_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Privatedata</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Privatedata</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Privatedata</em>' attribute.
   * @see #setPrivatedata(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getPrivateData_Privatedata()
   * @model
   * @generated
   */
  String getPrivatedata();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getPrivatedata <em>Privatedata</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Privatedata</em>' attribute.
   * @see #getPrivatedata()
   * @generated
   */
  void setPrivatedata(String value);

  /**
   * Returns the value of the '<em><b>Private Data Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Private Data Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Private Data Kind</em>' attribute.
   * @see #setPrivateDataKind(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getPrivateData_PrivateDataKind()
   * @model
   * @generated
   */
  String getPrivateDataKind();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.PrivateData#getPrivateDataKind <em>Private Data Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Private Data Kind</em>' attribute.
   * @see #getPrivateDataKind()
   * @generated
   */
  void setPrivateDataKind(String value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil4privacy.rSLIL4Privacy.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getPrivateData_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttribute();

} // PrivateData
