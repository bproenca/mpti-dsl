/**
 * generated by Xtext 2.26.0.M2
 */
package br.edu.ufrn.myhtml.htmlModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.edu.ufrn.myhtml.htmlModel.HtmlModelFactory
 * @model kind="package"
 * @generated
 */
public interface HtmlModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "htmlModel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.edu.br/ufrn/myhtml/HtmlModel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "htmlModel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HtmlModelPackage eINSTANCE = br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl.init();

  /**
   * The meta object id for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.MyHtmlModelImpl <em>My Html Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.ufrn.myhtml.htmlModel.impl.MyHtmlModelImpl
   * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getMyHtmlModel()
   * @generated
   */
  int MY_HTML_MODEL = 0;

  /**
   * The feature id for the '<em><b>Article</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_HTML_MODEL__ARTICLE = 0;

  /**
   * The number of structural features of the '<em>My Html Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_HTML_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.ArticleImpl <em>Article</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.ufrn.myhtml.htmlModel.impl.ArticleImpl
   * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getArticle()
   * @generated
   */
  int ARTICLE = 1;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICLE__SECTIONS = 0;

  /**
   * The feature id for the '<em><b>References</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICLE__REFERENCES = 1;

  /**
   * The number of structural features of the '<em>Article</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.ufrn.myhtml.htmlModel.impl.SectionImpl
   * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getSection()
   * @generated
   */
  int SECTION = 2;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__TITLE = 0;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__SIZE = 1;

  /**
   * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__PARAGRAPHS = 2;

  /**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__TABLES = 3;

  /**
   * The number of structural features of the '<em>Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.ufrn.myhtml.htmlModel.impl.TableImpl
   * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getTable()
   * @generated
   */
  int TABLE = 3;

  /**
   * The feature id for the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__HEADER = 0;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__ROWS = 1;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.ufrn.myhtml.htmlModel.impl.HeaderImpl
   * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getHeader()
   * @generated
   */
  int HEADER = 4;

  /**
   * The feature id for the '<em><b>Table Header Data</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__TABLE_HEADER_DATA = 0;

  /**
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.RowImpl <em>Row</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.ufrn.myhtml.htmlModel.impl.RowImpl
   * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getRow()
   * @generated
   */
  int ROW = 5;

  /**
   * The feature id for the '<em><b>Table Row Data</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__TABLE_ROW_DATA = 0;

  /**
   * The number of structural features of the '<em>Row</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.ParagraphImpl <em>Paragraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.ufrn.myhtml.htmlModel.impl.ParagraphImpl
   * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getParagraph()
   * @generated
   */
  int PARAGRAPH = 6;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH__COLOR = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH__CONTENT = 1;

  /**
   * The number of structural features of the '<em>Paragraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.ReferencesImpl <em>References</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.ufrn.myhtml.htmlModel.impl.ReferencesImpl
   * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getReferences()
   * @generated
   */
  int REFERENCES = 7;

  /**
   * The feature id for the '<em><b>Links</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCES__LINKS = 0;

  /**
   * The number of structural features of the '<em>References</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.edu.ufrn.myhtml.htmlModel.BasicColors <em>Basic Colors</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.ufrn.myhtml.htmlModel.BasicColors
   * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getBasicColors()
   * @generated
   */
  int BASIC_COLORS = 8;


  /**
   * Returns the meta object for class '{@link br.edu.ufrn.myhtml.htmlModel.MyHtmlModel <em>My Html Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Html Model</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.MyHtmlModel
   * @generated
   */
  EClass getMyHtmlModel();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.ufrn.myhtml.htmlModel.MyHtmlModel#getArticle <em>Article</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Article</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.MyHtmlModel#getArticle()
   * @see #getMyHtmlModel()
   * @generated
   */
  EReference getMyHtmlModel_Article();

  /**
   * Returns the meta object for class '{@link br.edu.ufrn.myhtml.htmlModel.Article <em>Article</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Article</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Article
   * @generated
   */
  EClass getArticle();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.ufrn.myhtml.htmlModel.Article#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Article#getSections()
   * @see #getArticle()
   * @generated
   */
  EReference getArticle_Sections();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.ufrn.myhtml.htmlModel.Article#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>References</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Article#getReferences()
   * @see #getArticle()
   * @generated
   */
  EReference getArticle_References();

  /**
   * Returns the meta object for class '{@link br.edu.ufrn.myhtml.htmlModel.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for the attribute '{@link br.edu.ufrn.myhtml.htmlModel.Section#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Section#getTitle()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Title();

  /**
   * Returns the meta object for the attribute '{@link br.edu.ufrn.myhtml.htmlModel.Section#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Section#getSize()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Size();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.ufrn.myhtml.htmlModel.Section#getParagraphs <em>Paragraphs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Paragraphs</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Section#getParagraphs()
   * @see #getSection()
   * @generated
   */
  EReference getSection_Paragraphs();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.ufrn.myhtml.htmlModel.Section#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Section#getTables()
   * @see #getSection()
   * @generated
   */
  EReference getSection_Tables();

  /**
   * Returns the meta object for class '{@link br.edu.ufrn.myhtml.htmlModel.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.ufrn.myhtml.htmlModel.Table#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Header</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Table#getHeader()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Header();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.ufrn.myhtml.htmlModel.Table#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rows</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Table#getRows()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Rows();

  /**
   * Returns the meta object for class '{@link br.edu.ufrn.myhtml.htmlModel.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for the attribute list '{@link br.edu.ufrn.myhtml.htmlModel.Header#getTableHeaderData <em>Table Header Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Table Header Data</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Header#getTableHeaderData()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_TableHeaderData();

  /**
   * Returns the meta object for class '{@link br.edu.ufrn.myhtml.htmlModel.Row <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Row</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Row
   * @generated
   */
  EClass getRow();

  /**
   * Returns the meta object for the attribute list '{@link br.edu.ufrn.myhtml.htmlModel.Row#getTableRowData <em>Table Row Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Table Row Data</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Row#getTableRowData()
   * @see #getRow()
   * @generated
   */
  EAttribute getRow_TableRowData();

  /**
   * Returns the meta object for class '{@link br.edu.ufrn.myhtml.htmlModel.Paragraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paragraph</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Paragraph
   * @generated
   */
  EClass getParagraph();

  /**
   * Returns the meta object for the attribute '{@link br.edu.ufrn.myhtml.htmlModel.Paragraph#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Paragraph#getColor()
   * @see #getParagraph()
   * @generated
   */
  EAttribute getParagraph_Color();

  /**
   * Returns the meta object for the attribute '{@link br.edu.ufrn.myhtml.htmlModel.Paragraph#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.Paragraph#getContent()
   * @see #getParagraph()
   * @generated
   */
  EAttribute getParagraph_Content();

  /**
   * Returns the meta object for class '{@link br.edu.ufrn.myhtml.htmlModel.References <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>References</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.References
   * @generated
   */
  EClass getReferences();

  /**
   * Returns the meta object for the attribute list '{@link br.edu.ufrn.myhtml.htmlModel.References#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Links</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.References#getLinks()
   * @see #getReferences()
   * @generated
   */
  EAttribute getReferences_Links();

  /**
   * Returns the meta object for enum '{@link br.edu.ufrn.myhtml.htmlModel.BasicColors <em>Basic Colors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Basic Colors</em>'.
   * @see br.edu.ufrn.myhtml.htmlModel.BasicColors
   * @generated
   */
  EEnum getBasicColors();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HtmlModelFactory getHtmlModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.MyHtmlModelImpl <em>My Html Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.ufrn.myhtml.htmlModel.impl.MyHtmlModelImpl
     * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getMyHtmlModel()
     * @generated
     */
    EClass MY_HTML_MODEL = eINSTANCE.getMyHtmlModel();

    /**
     * The meta object literal for the '<em><b>Article</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MY_HTML_MODEL__ARTICLE = eINSTANCE.getMyHtmlModel_Article();

    /**
     * The meta object literal for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.ArticleImpl <em>Article</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.ufrn.myhtml.htmlModel.impl.ArticleImpl
     * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getArticle()
     * @generated
     */
    EClass ARTICLE = eINSTANCE.getArticle();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTICLE__SECTIONS = eINSTANCE.getArticle_Sections();

    /**
     * The meta object literal for the '<em><b>References</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTICLE__REFERENCES = eINSTANCE.getArticle_References();

    /**
     * The meta object literal for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.ufrn.myhtml.htmlModel.impl.SectionImpl
     * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getSection()
     * @generated
     */
    EClass SECTION = eINSTANCE.getSection();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__TITLE = eINSTANCE.getSection_Title();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__SIZE = eINSTANCE.getSection_Size();

    /**
     * The meta object literal for the '<em><b>Paragraphs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION__PARAGRAPHS = eINSTANCE.getSection_Paragraphs();

    /**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION__TABLES = eINSTANCE.getSection_Tables();

    /**
     * The meta object literal for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.ufrn.myhtml.htmlModel.impl.TableImpl
     * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getTable()
     * @generated
     */
    EClass TABLE = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__HEADER = eINSTANCE.getTable_Header();

    /**
     * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__ROWS = eINSTANCE.getTable_Rows();

    /**
     * The meta object literal for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.HeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.ufrn.myhtml.htmlModel.impl.HeaderImpl
     * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getHeader()
     * @generated
     */
    EClass HEADER = eINSTANCE.getHeader();

    /**
     * The meta object literal for the '<em><b>Table Header Data</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__TABLE_HEADER_DATA = eINSTANCE.getHeader_TableHeaderData();

    /**
     * The meta object literal for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.RowImpl <em>Row</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.ufrn.myhtml.htmlModel.impl.RowImpl
     * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getRow()
     * @generated
     */
    EClass ROW = eINSTANCE.getRow();

    /**
     * The meta object literal for the '<em><b>Table Row Data</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROW__TABLE_ROW_DATA = eINSTANCE.getRow_TableRowData();

    /**
     * The meta object literal for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.ParagraphImpl <em>Paragraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.ufrn.myhtml.htmlModel.impl.ParagraphImpl
     * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getParagraph()
     * @generated
     */
    EClass PARAGRAPH = eINSTANCE.getParagraph();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAGRAPH__COLOR = eINSTANCE.getParagraph_Color();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAGRAPH__CONTENT = eINSTANCE.getParagraph_Content();

    /**
     * The meta object literal for the '{@link br.edu.ufrn.myhtml.htmlModel.impl.ReferencesImpl <em>References</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.ufrn.myhtml.htmlModel.impl.ReferencesImpl
     * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getReferences()
     * @generated
     */
    EClass REFERENCES = eINSTANCE.getReferences();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCES__LINKS = eINSTANCE.getReferences_Links();

    /**
     * The meta object literal for the '{@link br.edu.ufrn.myhtml.htmlModel.BasicColors <em>Basic Colors</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.ufrn.myhtml.htmlModel.BasicColors
     * @see br.edu.ufrn.myhtml.htmlModel.impl.HtmlModelPackageImpl#getBasicColors()
     * @generated
     */
    EEnum BASIC_COLORS = eINSTANCE.getBasicColors();

  }

} //HtmlModelPackage
