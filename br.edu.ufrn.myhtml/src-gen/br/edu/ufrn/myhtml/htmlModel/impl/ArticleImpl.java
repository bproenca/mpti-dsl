/**
 * generated by Xtext 2.26.0.M2
 */
package br.edu.ufrn.myhtml.htmlModel.impl;

import br.edu.ufrn.myhtml.htmlModel.Article;
import br.edu.ufrn.myhtml.htmlModel.HtmlModelPackage;
import br.edu.ufrn.myhtml.htmlModel.References;
import br.edu.ufrn.myhtml.htmlModel.Section;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufrn.myhtml.htmlModel.impl.ArticleImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link br.edu.ufrn.myhtml.htmlModel.impl.ArticleImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArticleImpl extends MinimalEObjectImpl.Container implements Article
{
  /**
   * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSections()
   * @generated
   * @ordered
   */
  protected EList<Section> sections;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected References references;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArticleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HtmlModelPackage.Literals.ARTICLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Section> getSections()
  {
    if (sections == null)
    {
      sections = new EObjectContainmentEList<Section>(Section.class, this, HtmlModelPackage.ARTICLE__SECTIONS);
    }
    return sections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public References getReferences()
  {
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReferences(References newReferences, NotificationChain msgs)
  {
    References oldReferences = references;
    references = newReferences;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HtmlModelPackage.ARTICLE__REFERENCES, oldReferences, newReferences);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReferences(References newReferences)
  {
    if (newReferences != references)
    {
      NotificationChain msgs = null;
      if (references != null)
        msgs = ((InternalEObject)references).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HtmlModelPackage.ARTICLE__REFERENCES, null, msgs);
      if (newReferences != null)
        msgs = ((InternalEObject)newReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HtmlModelPackage.ARTICLE__REFERENCES, null, msgs);
      msgs = basicSetReferences(newReferences, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HtmlModelPackage.ARTICLE__REFERENCES, newReferences, newReferences));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HtmlModelPackage.ARTICLE__SECTIONS:
        return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
      case HtmlModelPackage.ARTICLE__REFERENCES:
        return basicSetReferences(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HtmlModelPackage.ARTICLE__SECTIONS:
        return getSections();
      case HtmlModelPackage.ARTICLE__REFERENCES:
        return getReferences();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HtmlModelPackage.ARTICLE__SECTIONS:
        getSections().clear();
        getSections().addAll((Collection<? extends Section>)newValue);
        return;
      case HtmlModelPackage.ARTICLE__REFERENCES:
        setReferences((References)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HtmlModelPackage.ARTICLE__SECTIONS:
        getSections().clear();
        return;
      case HtmlModelPackage.ARTICLE__REFERENCES:
        setReferences((References)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HtmlModelPackage.ARTICLE__SECTIONS:
        return sections != null && !sections.isEmpty();
      case HtmlModelPackage.ARTICLE__REFERENCES:
        return references != null;
    }
    return super.eIsSet(featureID);
  }

} //ArticleImpl
