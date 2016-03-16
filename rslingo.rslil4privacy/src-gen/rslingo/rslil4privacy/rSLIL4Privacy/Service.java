/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getRefPrivateData <em>Ref Private Data</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getServicePart <em>Service Part</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject
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
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getService_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Service Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Name</em>' attribute.
   * @see #setServiceName(String)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getService_ServiceName()
   * @model
   * @generated
   */
  String getServiceName();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getServiceName <em>Service Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service Name</em>' attribute.
   * @see #getServiceName()
   * @generated
   */
  void setServiceName(String value);

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
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getService_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Service#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getService_RefPrivateData()
   * @model containment="true"
   * @generated
   */
  EList<RefPrivateData> getRefPrivateData();

  /**
   * Returns the value of the '<em><b>Service Part</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rslil4privacy.rSLIL4Privacy.ServicePart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Part</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Part</em>' containment reference list.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getService_ServicePart()
   * @model containment="true"
   * @generated
   */
  EList<ServicePart> getServicePart();

} // Service
