/**
 * generated by Xtext 2.26.0.M2
 */
package br.edu.ufrn.myhtml.htmlModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Html Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufrn.myhtml.htmlModel.MyHtmlModel#getArticle <em>Article</em>}</li>
 * </ul>
 *
 * @see br.edu.ufrn.myhtml.htmlModel.HtmlModelPackage#getMyHtmlModel()
 * @model
 * @generated
 */
public interface MyHtmlModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Article</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Article</em>' containment reference.
   * @see #setArticle(Article)
   * @see br.edu.ufrn.myhtml.htmlModel.HtmlModelPackage#getMyHtmlModel_Article()
   * @model containment="true"
   * @generated
   */
  Article getArticle();

  /**
   * Sets the value of the '{@link br.edu.ufrn.myhtml.htmlModel.MyHtmlModel#getArticle <em>Article</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Article</em>' containment reference.
   * @see #getArticle()
   * @generated
   */
  void setArticle(Article value);

} // MyHtmlModel
