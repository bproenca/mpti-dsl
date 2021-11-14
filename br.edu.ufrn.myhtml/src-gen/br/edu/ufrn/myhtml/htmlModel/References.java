/**
 * generated by Xtext 2.26.0.M2
 */
package br.edu.ufrn.myhtml.htmlModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>References</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufrn.myhtml.htmlModel.References#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see br.edu.ufrn.myhtml.htmlModel.HtmlModelPackage#getReferences()
 * @model
 * @generated
 */
public interface References extends EObject
{
  /**
   * Returns the value of the '<em><b>Links</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' attribute list.
   * @see br.edu.ufrn.myhtml.htmlModel.HtmlModelPackage#getReferences_Links()
   * @model unique="false"
   * @generated
   */
  EList<String> getLinks();

} // References
