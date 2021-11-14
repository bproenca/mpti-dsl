/*
 * generated by Xtext 2.26.0.M2
 */
package br.edu.ufrn.myhtml.serializer;

import br.edu.ufrn.myhtml.htmlModel.Article;
import br.edu.ufrn.myhtml.htmlModel.HtmlModelPackage;
import br.edu.ufrn.myhtml.htmlModel.MyHtmlModel;
import br.edu.ufrn.myhtml.htmlModel.Paragraph;
import br.edu.ufrn.myhtml.htmlModel.References;
import br.edu.ufrn.myhtml.htmlModel.Section;
import br.edu.ufrn.myhtml.services.HtmlModelGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class HtmlModelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private HtmlModelGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == HtmlModelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case HtmlModelPackage.ARTICLE:
				sequence_Article(context, (Article) semanticObject); 
				return; 
			case HtmlModelPackage.MY_HTML_MODEL:
				sequence_MyHtmlModel(context, (MyHtmlModel) semanticObject); 
				return; 
			case HtmlModelPackage.PARAGRAPH:
				sequence_Paragraph(context, (Paragraph) semanticObject); 
				return; 
			case HtmlModelPackage.REFERENCES:
				sequence_References(context, (References) semanticObject); 
				return; 
			case HtmlModelPackage.SECTION:
				sequence_Section(context, (Section) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Article returns Article
	 *
	 * Constraint:
	 *     (sections+=Section* references=References?)
	 * </pre>
	 */
	protected void sequence_Article(ISerializationContext context, Article semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MyHtmlModel returns MyHtmlModel
	 *
	 * Constraint:
	 *     article=Article
	 * </pre>
	 */
	protected void sequence_MyHtmlModel(ISerializationContext context, MyHtmlModel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HtmlModelPackage.Literals.MY_HTML_MODEL__ARTICLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HtmlModelPackage.Literals.MY_HTML_MODEL__ARTICLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMyHtmlModelAccess().getArticleArticleParserRuleCall_0(), semanticObject.getArticle());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Paragraph returns Paragraph
	 *
	 * Constraint:
	 *     (color=BasicColors? content=STRING)
	 * </pre>
	 */
	protected void sequence_Paragraph(ISerializationContext context, Paragraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     References returns References
	 *
	 * Constraint:
	 *     links+=Link*
	 * </pre>
	 */
	protected void sequence_References(ISerializationContext context, References semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Section returns Section
	 *
	 * Constraint:
	 *     (title=STRING size=INT? paragraphs+=Paragraph*)
	 * </pre>
	 */
	protected void sequence_Section(ISerializationContext context, Section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}