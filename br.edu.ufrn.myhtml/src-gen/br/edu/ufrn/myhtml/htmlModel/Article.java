/**
 * generated by Xtext 2.26.0.M2
 */
package br.edu.ufrn.myhtml.htmlModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufrn.myhtml.htmlModel.Article#getSections <em>Sections</em>}</li>
 *   <li>{@link br.edu.ufrn.myhtml.htmlModel.Article#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see br.edu.ufrn.myhtml.htmlModel.HtmlModelPackage#getArticle()
 * @model
 * @generated
 */
public interface Article extends EObject
{
  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link br.edu.ufrn.myhtml.htmlModel.Section}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see br.edu.ufrn.myhtml.htmlModel.HtmlModelPackage#getArticle_Sections()
   * @model containment="true"
   * @generated
   */
  EList<Section> getSections();

  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference.
   * @see #setReferences(References)
   * @see br.edu.ufrn.myhtml.htmlModel.HtmlModelPackage#getArticle_References()
   * @model containment="true"
   * @generated
   */
  References getReferences();

  /**
   * Sets the value of the '{@link br.edu.ufrn.myhtml.htmlModel.Article#getReferences <em>References</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>References</em>' containment reference.
   * @see #getReferences()
   * @generated
   */
  void setReferences(References value);

} // Article