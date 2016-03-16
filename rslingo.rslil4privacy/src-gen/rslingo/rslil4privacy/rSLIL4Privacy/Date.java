/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Date#getDay <em>Day</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Date#getMonth <em>Month</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.Date#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDate()
 * @model
 * @generated
 */
public interface Date extends EObject
{
  /**
   * Returns the value of the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Day</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Day</em>' attribute.
   * @see #setDay(int)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDate_Day()
   * @model
   * @generated
   */
  int getDay();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Date#getDay <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Day</em>' attribute.
   * @see #getDay()
   * @generated
   */
  void setDay(int value);

  /**
   * Returns the value of the '<em><b>Month</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Month</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Month</em>' containment reference.
   * @see #setMonth(Month)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDate_Month()
   * @model containment="true"
   * @generated
   */
  Month getMonth();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Date#getMonth <em>Month</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Month</em>' containment reference.
   * @see #getMonth()
   * @generated
   */
  void setMonth(Month value);

  /**
   * Returns the value of the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Year</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Year</em>' attribute.
   * @see #setYear(int)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getDate_Year()
   * @model
   * @generated
   */
  int getYear();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.Date#getYear <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Year</em>' attribute.
   * @see #getYear()
   * @generated
   */
  void setYear(int value);

} // Date
