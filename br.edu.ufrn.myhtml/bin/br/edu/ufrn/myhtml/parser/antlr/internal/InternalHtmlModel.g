/*
 * generated by Xtext 2.26.0.M2
 */
grammar InternalHtmlModel;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package br.edu.ufrn.myhtml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package br.edu.ufrn.myhtml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.edu.ufrn.myhtml.services.HtmlModelGrammarAccess;

}

@parser::members {

 	private HtmlModelGrammarAccess grammarAccess;

    public InternalHtmlModelParser(TokenStream input, HtmlModelGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "MyHtmlModel";
   	}

   	@Override
   	protected HtmlModelGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMyHtmlModel
entryRuleMyHtmlModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMyHtmlModelRule()); }
	iv_ruleMyHtmlModel=ruleMyHtmlModel
	{ $current=$iv_ruleMyHtmlModel.current; }
	EOF;

// Rule MyHtmlModel
ruleMyHtmlModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getMyHtmlModelAccess().getArticleArticleParserRuleCall_0());
			}
			lv_article_0_0=ruleArticle
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getMyHtmlModelRule());
				}
				set(
					$current,
					"article",
					lv_article_0_0,
					"br.edu.ufrn.myhtml.HtmlModel.Article");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleArticle
entryRuleArticle returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArticleRule()); }
	iv_ruleArticle=ruleArticle
	{ $current=$iv_ruleArticle.current; }
	EOF;

// Rule Article
ruleArticle returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getArticleAccess().getArticleAction_0(),
					$current);
			}
		)
		otherlv_1='Article'
		{
			newLeafNode(otherlv_1, grammarAccess.getArticleAccess().getArticleKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getArticleAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getArticleAccess().getSectionsSectionParserRuleCall_3_0());
				}
				lv_sections_3_0=ruleSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getArticleRule());
					}
					add(
						$current,
						"sections",
						lv_sections_3_0,
						"br.edu.ufrn.myhtml.HtmlModel.Section");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getArticleAccess().getReferencesReferencesParserRuleCall_4_0());
				}
				lv_references_4_0=ruleReferences
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getArticleRule());
					}
					set(
						$current,
						"references",
						lv_references_4_0,
						"br.edu.ufrn.myhtml.HtmlModel.References");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleSection
entryRuleSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSectionRule()); }
	iv_ruleSection=ruleSection
	{ $current=$iv_ruleSection.current; }
	EOF;

// Rule Section
ruleSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Section'
		{
			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getLeftParenthesisKeyword_1());
		}
		otherlv_2='title'
		{
			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getTitleKeyword_2());
		}
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getEqualsSignKeyword_3());
		}
		(
			(
				lv_title_4_0=RULE_STRING
				{
					newLeafNode(lv_title_4_0, grammarAccess.getSectionAccess().getTitleSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSectionRule());
					}
					setWithLastConsumed(
						$current,
						"title",
						lv_title_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getSectionAccess().getCommaKeyword_5_0());
			}
			otherlv_6='size'
			{
				newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getSizeKeyword_5_1());
			}
			otherlv_7='='
			{
				newLeafNode(otherlv_7, grammarAccess.getSectionAccess().getEqualsSignKeyword_5_2());
			}
			(
				(
					lv_size_8_0=RULE_INT
					{
						newLeafNode(lv_size_8_0, grammarAccess.getSectionAccess().getSizeINTTerminalRuleCall_5_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSectionRule());
						}
						setWithLastConsumed(
							$current,
							"size",
							lv_size_8_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
		otherlv_9='){'
		{
			newLeafNode(otherlv_9, grammarAccess.getSectionAccess().getRightParenthesisLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSectionAccess().getParagraphsParagraphParserRuleCall_7_0());
				}
				lv_paragraphs_10_0=ruleParagraph
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSectionRule());
					}
					add(
						$current,
						"paragraphs",
						lv_paragraphs_10_0,
						"br.edu.ufrn.myhtml.HtmlModel.Paragraph");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleParagraph
entryRuleParagraph returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParagraphRule()); }
	iv_ruleParagraph=ruleParagraph
	{ $current=$iv_ruleParagraph.current; }
	EOF;

// Rule Paragraph
ruleParagraph returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Paragraph'
		{
			newLeafNode(otherlv_0, grammarAccess.getParagraphAccess().getParagraphKeyword_0());
		}
		(
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getParagraphAccess().getLeftParenthesisKeyword_1_0());
			}
			otherlv_2='color'
			{
				newLeafNode(otherlv_2, grammarAccess.getParagraphAccess().getColorKeyword_1_1());
			}
			otherlv_3='='
			{
				newLeafNode(otherlv_3, grammarAccess.getParagraphAccess().getEqualsSignKeyword_1_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getParagraphAccess().getColorBasicColorsEnumRuleCall_1_3_0());
					}
					lv_color_4_0=ruleBasicColors
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getParagraphRule());
						}
						set(
							$current,
							"color",
							lv_color_4_0,
							"br.edu.ufrn.myhtml.HtmlModel.BasicColors");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getParagraphAccess().getRightParenthesisKeyword_1_4());
			}
		)?
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getParagraphAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				lv_content_7_0=RULE_STRING
				{
					newLeafNode(lv_content_7_0, grammarAccess.getParagraphAccess().getContentSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParagraphRule());
					}
					setWithLastConsumed(
						$current,
						"content",
						lv_content_7_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getParagraphAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleReferences
entryRuleReferences returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferencesRule()); }
	iv_ruleReferences=ruleReferences
	{ $current=$iv_ruleReferences.current; }
	EOF;

// Rule References
ruleReferences returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getReferencesAccess().getReferencesAction_0(),
					$current);
			}
		)
		otherlv_1='References'
		{
			newLeafNode(otherlv_1, grammarAccess.getReferencesAccess().getReferencesKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getReferencesAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getReferencesAccess().getLinksLinkParserRuleCall_3_0());
				}
				lv_links_3_0=ruleLink
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferencesRule());
					}
					add(
						$current,
						"links",
						lv_links_3_0,
						"br.edu.ufrn.myhtml.HtmlModel.Link");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getReferencesAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleLink
entryRuleLink returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLinkRule()); }
	iv_ruleLink=ruleLink
	{ $current=$iv_ruleLink.current.getText(); }
	EOF;

// Rule Link
ruleLink returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getLinkAccess().getItemParserRuleCall_0());
		}
		this_Item_0=ruleItem
		{
			$current.merge(this_Item_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='.*'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getLinkAccess().getFullStopAsteriskKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleItem
entryRuleItem returns [String current=null]:
	{ newCompositeNode(grammarAccess.getItemRule()); }
	iv_ruleItem=ruleItem
	{ $current=$iv_ruleItem.current.getText(); }
	EOF;

// Rule Item
ruleItem returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getItemAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getItemAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getItemAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Rule BasicColors
ruleBasicColors returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='black'
			{
				$current = grammarAccess.getBasicColorsAccess().getBlackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getBasicColorsAccess().getBlackEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='red'
			{
				$current = grammarAccess.getBasicColorsAccess().getRedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getBasicColorsAccess().getRedEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='blue'
			{
				$current = grammarAccess.getBasicColorsAccess().getBlueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getBasicColorsAccess().getBlueEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='green'
			{
				$current = grammarAccess.getBasicColorsAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getBasicColorsAccess().getGreenEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;