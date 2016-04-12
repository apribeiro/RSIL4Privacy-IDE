/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Enforcement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement#getRefEnforcement <em>Ref Enforcement</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefEnforcement()
 * @model
 * @generated
 */
public interface RefEnforcement extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Enforcement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Enforcement</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Enforcement</em>' reference.
   * @see #setRefEnforcement(Enforcement)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefEnforcement_RefEnforcement()
   * @model
   * @generated
   */
  Enforcement getRefEnforcement();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement#getRefEnforcement <em>Ref Enforcement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Enforcement</em>' reference.
   * @see #getRefEnforcement()
   * @generated
   */
  void setRefEnforcement(Enforcement value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link rslingo.rslil4privacy.rSLIL4Privacy.Enforcement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getRefEnforcement_Refs()
   * @model
   * @generated
   */
  EList<Enforcement> getRefs();

} // RefEnforcement
