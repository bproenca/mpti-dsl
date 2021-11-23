/**
 * generated by Xtext 2.26.0.M2
 */
package br.edu.ufrn.myhtml.htmlModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufrn.myhtml.htmlModel.Table#getHeader <em>Header</em>}</li>
 *   <li>{@link br.edu.ufrn.myhtml.htmlModel.Table#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see br.edu.ufrn.myhtml.htmlModel.HtmlModelPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject
{
  /**
   * Returns the value of the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' containment reference.
   * @see #setHeader(Header)
   * @see br.edu.ufrn.myhtml.htmlModel.HtmlModelPackage#getTable_Header()
   * @model containment="true"
   * @generated
   */
  Header getHeader();

  /**
   * Sets the value of the '{@link br.edu.ufrn.myhtml.htmlModel.Table#getHeader <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' containment reference.
   * @see #getHeader()
   * @generated
   */
  void setHeader(Header value);

  /**
   * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
   * The list contents are of type {@link br.edu.ufrn.myhtml.htmlModel.Row}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rows</em>' containment reference list.
   * @see br.edu.ufrn.myhtml.htmlModel.HtmlModelPackage#getTable_Rows()
   * @model containment="true"
   * @generated
   */
  EList<Row> getRows();

} // Table