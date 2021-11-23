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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHtmlModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HINT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Article'", "'{'", "'}'", "'Section'", "'('", "'title'", "'='", "','", "'size'", "')'", "'Table'", "'Header'", "'Row'", "'Paragraph'", "'color'", "'References'", "'.'", "'black'", "'red'", "'blue'", "'green'"
    };
    public static final int RULE_HINT=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalHtmlModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHtmlModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHtmlModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHtmlModel.g"; }



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




    // $ANTLR start "entryRuleMyHtmlModel"
    // InternalHtmlModel.g:65:1: entryRuleMyHtmlModel returns [EObject current=null] : iv_ruleMyHtmlModel= ruleMyHtmlModel EOF ;
    public final EObject entryRuleMyHtmlModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyHtmlModel = null;


        try {
            // InternalHtmlModel.g:65:52: (iv_ruleMyHtmlModel= ruleMyHtmlModel EOF )
            // InternalHtmlModel.g:66:2: iv_ruleMyHtmlModel= ruleMyHtmlModel EOF
            {
             newCompositeNode(grammarAccess.getMyHtmlModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyHtmlModel=ruleMyHtmlModel();

            state._fsp--;

             current =iv_ruleMyHtmlModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMyHtmlModel"


    // $ANTLR start "ruleMyHtmlModel"
    // InternalHtmlModel.g:72:1: ruleMyHtmlModel returns [EObject current=null] : ( (lv_article_0_0= ruleArticle ) ) ;
    public final EObject ruleMyHtmlModel() throws RecognitionException {
        EObject current = null;

        EObject lv_article_0_0 = null;



        	enterRule();

        try {
            // InternalHtmlModel.g:78:2: ( ( (lv_article_0_0= ruleArticle ) ) )
            // InternalHtmlModel.g:79:2: ( (lv_article_0_0= ruleArticle ) )
            {
            // InternalHtmlModel.g:79:2: ( (lv_article_0_0= ruleArticle ) )
            // InternalHtmlModel.g:80:3: (lv_article_0_0= ruleArticle )
            {
            // InternalHtmlModel.g:80:3: (lv_article_0_0= ruleArticle )
            // InternalHtmlModel.g:81:4: lv_article_0_0= ruleArticle
            {

            				newCompositeNode(grammarAccess.getMyHtmlModelAccess().getArticleArticleParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_article_0_0=ruleArticle();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMyHtmlModelRule());
            				}
            				set(
            					current,
            					"article",
            					lv_article_0_0,
            					"br.edu.ufrn.myhtml.HtmlModel.Article");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyHtmlModel"


    // $ANTLR start "entryRuleArticle"
    // InternalHtmlModel.g:101:1: entryRuleArticle returns [EObject current=null] : iv_ruleArticle= ruleArticle EOF ;
    public final EObject entryRuleArticle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArticle = null;


        try {
            // InternalHtmlModel.g:101:48: (iv_ruleArticle= ruleArticle EOF )
            // InternalHtmlModel.g:102:2: iv_ruleArticle= ruleArticle EOF
            {
             newCompositeNode(grammarAccess.getArticleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArticle=ruleArticle();

            state._fsp--;

             current =iv_ruleArticle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArticle"


    // $ANTLR start "ruleArticle"
    // InternalHtmlModel.g:108:1: ruleArticle returns [EObject current=null] : ( () otherlv_1= 'Article' otherlv_2= '{' ( (lv_sections_3_0= ruleSection ) )* ( (lv_references_4_0= ruleReferences ) )? otherlv_5= '}' ) ;
    public final EObject ruleArticle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_sections_3_0 = null;

        EObject lv_references_4_0 = null;



        	enterRule();

        try {
            // InternalHtmlModel.g:114:2: ( ( () otherlv_1= 'Article' otherlv_2= '{' ( (lv_sections_3_0= ruleSection ) )* ( (lv_references_4_0= ruleReferences ) )? otherlv_5= '}' ) )
            // InternalHtmlModel.g:115:2: ( () otherlv_1= 'Article' otherlv_2= '{' ( (lv_sections_3_0= ruleSection ) )* ( (lv_references_4_0= ruleReferences ) )? otherlv_5= '}' )
            {
            // InternalHtmlModel.g:115:2: ( () otherlv_1= 'Article' otherlv_2= '{' ( (lv_sections_3_0= ruleSection ) )* ( (lv_references_4_0= ruleReferences ) )? otherlv_5= '}' )
            // InternalHtmlModel.g:116:3: () otherlv_1= 'Article' otherlv_2= '{' ( (lv_sections_3_0= ruleSection ) )* ( (lv_references_4_0= ruleReferences ) )? otherlv_5= '}'
            {
            // InternalHtmlModel.g:116:3: ()
            // InternalHtmlModel.g:117:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArticleAccess().getArticleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getArticleAccess().getArticleKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getArticleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHtmlModel.g:131:3: ( (lv_sections_3_0= ruleSection ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHtmlModel.g:132:4: (lv_sections_3_0= ruleSection )
            	    {
            	    // InternalHtmlModel.g:132:4: (lv_sections_3_0= ruleSection )
            	    // InternalHtmlModel.g:133:5: lv_sections_3_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getArticleAccess().getSectionsSectionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_sections_3_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArticleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_3_0,
            	    						"br.edu.ufrn.myhtml.HtmlModel.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalHtmlModel.g:150:3: ( (lv_references_4_0= ruleReferences ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalHtmlModel.g:151:4: (lv_references_4_0= ruleReferences )
                    {
                    // InternalHtmlModel.g:151:4: (lv_references_4_0= ruleReferences )
                    // InternalHtmlModel.g:152:5: lv_references_4_0= ruleReferences
                    {

                    					newCompositeNode(grammarAccess.getArticleAccess().getReferencesReferencesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_references_4_0=ruleReferences();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getArticleRule());
                    					}
                    					set(
                    						current,
                    						"references",
                    						lv_references_4_0,
                    						"br.edu.ufrn.myhtml.HtmlModel.References");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArticle"


    // $ANTLR start "entryRuleSection"
    // InternalHtmlModel.g:177:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalHtmlModel.g:177:48: (iv_ruleSection= ruleSection EOF )
            // InternalHtmlModel.g:178:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalHtmlModel.g:184:1: ruleSection returns [EObject current=null] : (otherlv_0= 'Section' otherlv_1= '(' otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= RULE_HINT ) ) )? otherlv_9= ')' otherlv_10= '{' ( (lv_paragraphs_11_0= ruleParagraph ) )* ( (lv_tables_12_0= ruleTable ) )* otherlv_13= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_size_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_paragraphs_11_0 = null;

        EObject lv_tables_12_0 = null;



        	enterRule();

        try {
            // InternalHtmlModel.g:190:2: ( (otherlv_0= 'Section' otherlv_1= '(' otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= RULE_HINT ) ) )? otherlv_9= ')' otherlv_10= '{' ( (lv_paragraphs_11_0= ruleParagraph ) )* ( (lv_tables_12_0= ruleTable ) )* otherlv_13= '}' ) )
            // InternalHtmlModel.g:191:2: (otherlv_0= 'Section' otherlv_1= '(' otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= RULE_HINT ) ) )? otherlv_9= ')' otherlv_10= '{' ( (lv_paragraphs_11_0= ruleParagraph ) )* ( (lv_tables_12_0= ruleTable ) )* otherlv_13= '}' )
            {
            // InternalHtmlModel.g:191:2: (otherlv_0= 'Section' otherlv_1= '(' otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= RULE_HINT ) ) )? otherlv_9= ')' otherlv_10= '{' ( (lv_paragraphs_11_0= ruleParagraph ) )* ( (lv_tables_12_0= ruleTable ) )* otherlv_13= '}' )
            // InternalHtmlModel.g:192:3: otherlv_0= 'Section' otherlv_1= '(' otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= RULE_HINT ) ) )? otherlv_9= ')' otherlv_10= '{' ( (lv_paragraphs_11_0= ruleParagraph ) )* ( (lv_tables_12_0= ruleTable ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getTitleKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getEqualsSignKeyword_3());
            		
            // InternalHtmlModel.g:208:3: ( (lv_title_4_0= RULE_STRING ) )
            // InternalHtmlModel.g:209:4: (lv_title_4_0= RULE_STRING )
            {
            // InternalHtmlModel.g:209:4: (lv_title_4_0= RULE_STRING )
            // InternalHtmlModel.g:210:5: lv_title_4_0= RULE_STRING
            {
            lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_title_4_0, grammarAccess.getSectionAccess().getTitleSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalHtmlModel.g:226:3: (otherlv_5= ',' otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= RULE_HINT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalHtmlModel.g:227:4: otherlv_5= ',' otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= RULE_HINT ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getSectionAccess().getCommaKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getSizeKeyword_5_1());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getSectionAccess().getEqualsSignKeyword_5_2());
                    			
                    // InternalHtmlModel.g:239:4: ( (lv_size_8_0= RULE_HINT ) )
                    // InternalHtmlModel.g:240:5: (lv_size_8_0= RULE_HINT )
                    {
                    // InternalHtmlModel.g:240:5: (lv_size_8_0= RULE_HINT )
                    // InternalHtmlModel.g:241:6: lv_size_8_0= RULE_HINT
                    {
                    lv_size_8_0=(Token)match(input,RULE_HINT,FOLLOW_13); 

                    						newLeafNode(lv_size_8_0, grammarAccess.getSectionAccess().getSizeHINTTerminalRuleCall_5_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_8_0,
                    							"br.edu.ufrn.myhtml.HtmlModel.HINT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getSectionAccess().getRightParenthesisKeyword_6());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalHtmlModel.g:266:3: ( (lv_paragraphs_11_0= ruleParagraph ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHtmlModel.g:267:4: (lv_paragraphs_11_0= ruleParagraph )
            	    {
            	    // InternalHtmlModel.g:267:4: (lv_paragraphs_11_0= ruleParagraph )
            	    // InternalHtmlModel.g:268:5: lv_paragraphs_11_0= ruleParagraph
            	    {

            	    					newCompositeNode(grammarAccess.getSectionAccess().getParagraphsParagraphParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_paragraphs_11_0=ruleParagraph();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"paragraphs",
            	    						lv_paragraphs_11_0,
            	    						"br.edu.ufrn.myhtml.HtmlModel.Paragraph");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalHtmlModel.g:285:3: ( (lv_tables_12_0= ruleTable ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHtmlModel.g:286:4: (lv_tables_12_0= ruleTable )
            	    {
            	    // InternalHtmlModel.g:286:4: (lv_tables_12_0= ruleTable )
            	    // InternalHtmlModel.g:287:5: lv_tables_12_0= ruleTable
            	    {

            	    					newCompositeNode(grammarAccess.getSectionAccess().getTablesTableParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_tables_12_0=ruleTable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tables",
            	    						lv_tables_12_0,
            	    						"br.edu.ufrn.myhtml.HtmlModel.Table");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleTable"
    // InternalHtmlModel.g:312:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalHtmlModel.g:312:46: (iv_ruleTable= ruleTable EOF )
            // InternalHtmlModel.g:313:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalHtmlModel.g:319:1: ruleTable returns [EObject current=null] : (otherlv_0= 'Table' otherlv_1= '{' ( (lv_header_2_0= ruleHeader ) ) ( (lv_rows_3_0= ruleRow ) )+ otherlv_4= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_header_2_0 = null;

        EObject lv_rows_3_0 = null;



        	enterRule();

        try {
            // InternalHtmlModel.g:325:2: ( (otherlv_0= 'Table' otherlv_1= '{' ( (lv_header_2_0= ruleHeader ) ) ( (lv_rows_3_0= ruleRow ) )+ otherlv_4= '}' ) )
            // InternalHtmlModel.g:326:2: (otherlv_0= 'Table' otherlv_1= '{' ( (lv_header_2_0= ruleHeader ) ) ( (lv_rows_3_0= ruleRow ) )+ otherlv_4= '}' )
            {
            // InternalHtmlModel.g:326:2: (otherlv_0= 'Table' otherlv_1= '{' ( (lv_header_2_0= ruleHeader ) ) ( (lv_rows_3_0= ruleRow ) )+ otherlv_4= '}' )
            // InternalHtmlModel.g:327:3: otherlv_0= 'Table' otherlv_1= '{' ( (lv_header_2_0= ruleHeader ) ) ( (lv_rows_3_0= ruleRow ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalHtmlModel.g:335:3: ( (lv_header_2_0= ruleHeader ) )
            // InternalHtmlModel.g:336:4: (lv_header_2_0= ruleHeader )
            {
            // InternalHtmlModel.g:336:4: (lv_header_2_0= ruleHeader )
            // InternalHtmlModel.g:337:5: lv_header_2_0= ruleHeader
            {

            					newCompositeNode(grammarAccess.getTableAccess().getHeaderHeaderParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_header_2_0=ruleHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_2_0,
            						"br.edu.ufrn.myhtml.HtmlModel.Header");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHtmlModel.g:354:3: ( (lv_rows_3_0= ruleRow ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalHtmlModel.g:355:4: (lv_rows_3_0= ruleRow )
            	    {
            	    // InternalHtmlModel.g:355:4: (lv_rows_3_0= ruleRow )
            	    // InternalHtmlModel.g:356:5: lv_rows_3_0= ruleRow
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getRowsRowParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_rows_3_0=ruleRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rows",
            	    						lv_rows_3_0,
            	    						"br.edu.ufrn.myhtml.HtmlModel.Row");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleHeader"
    // InternalHtmlModel.g:381:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalHtmlModel.g:381:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalHtmlModel.g:382:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalHtmlModel.g:388:1: ruleHeader returns [EObject current=null] : ( () otherlv_1= 'Header' otherlv_2= '{' ( (lv_tableHeaderData_3_0= RULE_STRING ) )* otherlv_4= '}' ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_tableHeaderData_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalHtmlModel.g:394:2: ( ( () otherlv_1= 'Header' otherlv_2= '{' ( (lv_tableHeaderData_3_0= RULE_STRING ) )* otherlv_4= '}' ) )
            // InternalHtmlModel.g:395:2: ( () otherlv_1= 'Header' otherlv_2= '{' ( (lv_tableHeaderData_3_0= RULE_STRING ) )* otherlv_4= '}' )
            {
            // InternalHtmlModel.g:395:2: ( () otherlv_1= 'Header' otherlv_2= '{' ( (lv_tableHeaderData_3_0= RULE_STRING ) )* otherlv_4= '}' )
            // InternalHtmlModel.g:396:3: () otherlv_1= 'Header' otherlv_2= '{' ( (lv_tableHeaderData_3_0= RULE_STRING ) )* otherlv_4= '}'
            {
            // InternalHtmlModel.g:396:3: ()
            // InternalHtmlModel.g:397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeaderAccess().getHeaderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getHeaderKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHtmlModel.g:411:3: ( (lv_tableHeaderData_3_0= RULE_STRING ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalHtmlModel.g:412:4: (lv_tableHeaderData_3_0= RULE_STRING )
            	    {
            	    // InternalHtmlModel.g:412:4: (lv_tableHeaderData_3_0= RULE_STRING )
            	    // InternalHtmlModel.g:413:5: lv_tableHeaderData_3_0= RULE_STRING
            	    {
            	    lv_tableHeaderData_3_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            	    					newLeafNode(lv_tableHeaderData_3_0, grammarAccess.getHeaderAccess().getTableHeaderDataSTRINGTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getHeaderRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"tableHeaderData",
            	    						lv_tableHeaderData_3_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleRow"
    // InternalHtmlModel.g:437:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalHtmlModel.g:437:44: (iv_ruleRow= ruleRow EOF )
            // InternalHtmlModel.g:438:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalHtmlModel.g:444:1: ruleRow returns [EObject current=null] : ( () otherlv_1= 'Row' otherlv_2= '{' ( (lv_tableRowData_3_0= RULE_STRING ) )* otherlv_4= '}' ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_tableRowData_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalHtmlModel.g:450:2: ( ( () otherlv_1= 'Row' otherlv_2= '{' ( (lv_tableRowData_3_0= RULE_STRING ) )* otherlv_4= '}' ) )
            // InternalHtmlModel.g:451:2: ( () otherlv_1= 'Row' otherlv_2= '{' ( (lv_tableRowData_3_0= RULE_STRING ) )* otherlv_4= '}' )
            {
            // InternalHtmlModel.g:451:2: ( () otherlv_1= 'Row' otherlv_2= '{' ( (lv_tableRowData_3_0= RULE_STRING ) )* otherlv_4= '}' )
            // InternalHtmlModel.g:452:3: () otherlv_1= 'Row' otherlv_2= '{' ( (lv_tableRowData_3_0= RULE_STRING ) )* otherlv_4= '}'
            {
            // InternalHtmlModel.g:452:3: ()
            // InternalHtmlModel.g:453:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRowAccess().getRowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getRowKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHtmlModel.g:467:3: ( (lv_tableRowData_3_0= RULE_STRING ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalHtmlModel.g:468:4: (lv_tableRowData_3_0= RULE_STRING )
            	    {
            	    // InternalHtmlModel.g:468:4: (lv_tableRowData_3_0= RULE_STRING )
            	    // InternalHtmlModel.g:469:5: lv_tableRowData_3_0= RULE_STRING
            	    {
            	    lv_tableRowData_3_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            	    					newLeafNode(lv_tableRowData_3_0, grammarAccess.getRowAccess().getTableRowDataSTRINGTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getRowRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"tableRowData",
            	    						lv_tableRowData_3_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRowAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleParagraph"
    // InternalHtmlModel.g:493:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // InternalHtmlModel.g:493:50: (iv_ruleParagraph= ruleParagraph EOF )
            // InternalHtmlModel.g:494:2: iv_ruleParagraph= ruleParagraph EOF
            {
             newCompositeNode(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParagraph=ruleParagraph();

            state._fsp--;

             current =iv_ruleParagraph; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // InternalHtmlModel.g:500:1: ruleParagraph returns [EObject current=null] : (otherlv_0= 'Paragraph' (otherlv_1= '(' otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleBasicColors ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_content_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_content_7_0=null;
        Token otherlv_8=null;
        Enumerator lv_color_4_0 = null;



        	enterRule();

        try {
            // InternalHtmlModel.g:506:2: ( (otherlv_0= 'Paragraph' (otherlv_1= '(' otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleBasicColors ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_content_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // InternalHtmlModel.g:507:2: (otherlv_0= 'Paragraph' (otherlv_1= '(' otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleBasicColors ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_content_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // InternalHtmlModel.g:507:2: (otherlv_0= 'Paragraph' (otherlv_1= '(' otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleBasicColors ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_content_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // InternalHtmlModel.g:508:3: otherlv_0= 'Paragraph' (otherlv_1= '(' otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleBasicColors ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_content_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getParagraphAccess().getParagraphKeyword_0());
            		
            // InternalHtmlModel.g:512:3: (otherlv_1= '(' otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleBasicColors ) ) otherlv_5= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalHtmlModel.g:513:4: otherlv_1= '(' otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleBasicColors ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getParagraphAccess().getLeftParenthesisKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getParagraphAccess().getColorKeyword_1_1());
                    			
                    otherlv_3=(Token)match(input,18,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getParagraphAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalHtmlModel.g:525:4: ( (lv_color_4_0= ruleBasicColors ) )
                    // InternalHtmlModel.g:526:5: (lv_color_4_0= ruleBasicColors )
                    {
                    // InternalHtmlModel.g:526:5: (lv_color_4_0= ruleBasicColors )
                    // InternalHtmlModel.g:527:6: lv_color_4_0= ruleBasicColors
                    {

                    						newCompositeNode(grammarAccess.getParagraphAccess().getColorBasicColorsEnumRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_color_4_0=ruleBasicColors();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParagraphRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_4_0,
                    							"br.edu.ufrn.myhtml.HtmlModel.BasicColors");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getParagraphAccess().getRightParenthesisKeyword_1_4());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getParagraphAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHtmlModel.g:553:3: ( (lv_content_7_0= RULE_STRING ) )
            // InternalHtmlModel.g:554:4: (lv_content_7_0= RULE_STRING )
            {
            // InternalHtmlModel.g:554:4: (lv_content_7_0= RULE_STRING )
            // InternalHtmlModel.g:555:5: lv_content_7_0= RULE_STRING
            {
            lv_content_7_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_content_7_0, grammarAccess.getParagraphAccess().getContentSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParagraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getParagraphAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleReferences"
    // InternalHtmlModel.g:579:1: entryRuleReferences returns [EObject current=null] : iv_ruleReferences= ruleReferences EOF ;
    public final EObject entryRuleReferences() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferences = null;


        try {
            // InternalHtmlModel.g:579:51: (iv_ruleReferences= ruleReferences EOF )
            // InternalHtmlModel.g:580:2: iv_ruleReferences= ruleReferences EOF
            {
             newCompositeNode(grammarAccess.getReferencesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferences=ruleReferences();

            state._fsp--;

             current =iv_ruleReferences; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferences"


    // $ANTLR start "ruleReferences"
    // InternalHtmlModel.g:586:1: ruleReferences returns [EObject current=null] : ( () otherlv_1= 'References' otherlv_2= '{' ( (lv_links_3_0= ruleLink ) )* otherlv_4= '}' ) ;
    public final EObject ruleReferences() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_links_3_0 = null;



        	enterRule();

        try {
            // InternalHtmlModel.g:592:2: ( ( () otherlv_1= 'References' otherlv_2= '{' ( (lv_links_3_0= ruleLink ) )* otherlv_4= '}' ) )
            // InternalHtmlModel.g:593:2: ( () otherlv_1= 'References' otherlv_2= '{' ( (lv_links_3_0= ruleLink ) )* otherlv_4= '}' )
            {
            // InternalHtmlModel.g:593:2: ( () otherlv_1= 'References' otherlv_2= '{' ( (lv_links_3_0= ruleLink ) )* otherlv_4= '}' )
            // InternalHtmlModel.g:594:3: () otherlv_1= 'References' otherlv_2= '{' ( (lv_links_3_0= ruleLink ) )* otherlv_4= '}'
            {
            // InternalHtmlModel.g:594:3: ()
            // InternalHtmlModel.g:595:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReferencesAccess().getReferencesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReferencesAccess().getReferencesKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getReferencesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHtmlModel.g:609:3: ( (lv_links_3_0= ruleLink ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalHtmlModel.g:610:4: (lv_links_3_0= ruleLink )
            	    {
            	    // InternalHtmlModel.g:610:4: (lv_links_3_0= ruleLink )
            	    // InternalHtmlModel.g:611:5: lv_links_3_0= ruleLink
            	    {

            	    					newCompositeNode(grammarAccess.getReferencesAccess().getLinksLinkParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_links_3_0=ruleLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReferencesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"links",
            	    						lv_links_3_0,
            	    						"br.edu.ufrn.myhtml.HtmlModel.Link");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReferencesAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferences"


    // $ANTLR start "entryRuleLink"
    // InternalHtmlModel.g:636:1: entryRuleLink returns [String current=null] : iv_ruleLink= ruleLink EOF ;
    public final String entryRuleLink() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLink = null;


        try {
            // InternalHtmlModel.g:636:44: (iv_ruleLink= ruleLink EOF )
            // InternalHtmlModel.g:637:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalHtmlModel.g:643:1: ruleLink returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleLink() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalHtmlModel.g:649:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalHtmlModel.g:650:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalHtmlModel.g:650:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalHtmlModel.g:651:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getLinkAccess().getIDTerminalRuleCall_0());
            		
            // InternalHtmlModel.g:658:3: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHtmlModel.g:659:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_25); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getLinkAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getLinkAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "ruleBasicColors"
    // InternalHtmlModel.g:676:1: ruleBasicColors returns [Enumerator current=null] : ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) ) ;
    public final Enumerator ruleBasicColors() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalHtmlModel.g:682:2: ( ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) ) )
            // InternalHtmlModel.g:683:2: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) )
            {
            // InternalHtmlModel.g:683:2: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalHtmlModel.g:684:3: (enumLiteral_0= 'black' )
                    {
                    // InternalHtmlModel.g:684:3: (enumLiteral_0= 'black' )
                    // InternalHtmlModel.g:685:4: enumLiteral_0= 'black'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getBasicColorsAccess().getBlackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBasicColorsAccess().getBlackEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHtmlModel.g:692:3: (enumLiteral_1= 'red' )
                    {
                    // InternalHtmlModel.g:692:3: (enumLiteral_1= 'red' )
                    // InternalHtmlModel.g:693:4: enumLiteral_1= 'red'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getBasicColorsAccess().getRedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBasicColorsAccess().getRedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHtmlModel.g:700:3: (enumLiteral_2= 'blue' )
                    {
                    // InternalHtmlModel.g:700:3: (enumLiteral_2= 'blue' )
                    // InternalHtmlModel.g:701:4: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getBasicColorsAccess().getBlueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBasicColorsAccess().getBlueEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHtmlModel.g:708:3: (enumLiteral_3= 'green' )
                    {
                    // InternalHtmlModel.g:708:3: (enumLiteral_3= 'green' )
                    // InternalHtmlModel.g:709:4: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getBasicColorsAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBasicColorsAccess().getGreenEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicColors"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000800C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002404000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});

}