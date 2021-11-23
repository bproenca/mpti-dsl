/**
 * generated by Xtext 2.26.0.M2
 */
package br.edu.ufrn.myhtml.htmlModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.edu.ufrn.myhtml.htmlModel.HtmlModelPackage
 * @generated
 */
public interface HtmlModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HtmlModelFactory eINSTANCE = br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>My Html Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>My Html Model</em>'.
   * @generated
   */
  MyHtmlModel createMyHtmlModel();

  /**
   * Returns a new object of class '<em>Article</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Article</em>'.
   * @generated
   */
  Article createArticle();

  /**
   * Returns a new object of class '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Section</em>'.
   * @generated
   */
  Section createSection();

  /**
   * Returns a new object of class '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table</em>'.
   * @generated
   */
  Table createTable();

  /**
   * Returns a new object of class '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header</em>'.
   * @generated
   */
  Header createHeader();

  /**
   * Returns a new object of class '<em>Row</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Row</em>'.
   * @generated
   */
  Row createRow();

  /**
   * Returns a new object of class '<em>Paragraph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Paragraph</em>'.
   * @generated
   */
  Paragraph createParagraph();

  /**
   * Returns a new object of class '<em>References</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>References</em>'.
   * @generated
   */
  References createReferences();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HtmlModelPackage getHtmlModelPackage();

} //HtmlModelFactory
