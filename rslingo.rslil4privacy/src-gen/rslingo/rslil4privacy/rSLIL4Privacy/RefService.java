/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.RefService#getRefService <em>Ref Service</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.RefService#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefService()
 * @model
 * @generated
 */
public interface RefService extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Service</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Service</em>' reference.
   * @see #setRefService(Service)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefService_RefService()
   * @model
   * @generated
   */
  Service getRefService();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefService#getRefService <em>Ref Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Service</em>' reference.
   * @see #getRefService()
   * @generated
   */
  void setRefService(Service value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link rslingo.rslil4privacy.rSLIL4Privacy.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefService_Refs()
   * @model
   * @generated
   */
  EList<Service> getRefs();

} // RefService
