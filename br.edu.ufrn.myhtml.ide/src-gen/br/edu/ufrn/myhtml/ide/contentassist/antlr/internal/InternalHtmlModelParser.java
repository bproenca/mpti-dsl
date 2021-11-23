package br.edu.ufrn.myhtml.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import br.edu.ufrn.myhtml.services.HtmlModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHtmlModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HINT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'black'", "'red'", "'blue'", "'green'", "'Article'", "'{'", "'}'", "'Section'", "'('", "'title'", "'='", "')'", "','", "'size'", "'Table'", "'Header'", "'Row'", "'Paragraph'", "'color'", "'References'", "'.'"
    };
    public static final int RULE_HINT=6;
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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

    	public void setGrammarAccess(HtmlModelGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMyHtmlModel"
    // InternalHtmlModel.g:53:1: entryRuleMyHtmlModel : ruleMyHtmlModel EOF ;
    public final void entryRuleMyHtmlModel() throws RecognitionException {
        try {
            // InternalHtmlModel.g:54:1: ( ruleMyHtmlModel EOF )
            // InternalHtmlModel.g:55:1: ruleMyHtmlModel EOF
            {
             before(grammarAccess.getMyHtmlModelRule()); 
            pushFollow(FOLLOW_1);
            ruleMyHtmlModel();

            state._fsp--;

             after(grammarAccess.getMyHtmlModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMyHtmlModel"


    // $ANTLR start "ruleMyHtmlModel"
    // InternalHtmlModel.g:62:1: ruleMyHtmlModel : ( ( rule__MyHtmlModel__ArticleAssignment ) ) ;
    public final void ruleMyHtmlModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:66:2: ( ( ( rule__MyHtmlModel__ArticleAssignment ) ) )
            // InternalHtmlModel.g:67:2: ( ( rule__MyHtmlModel__ArticleAssignment ) )
            {
            // InternalHtmlModel.g:67:2: ( ( rule__MyHtmlModel__ArticleAssignment ) )
            // InternalHtmlModel.g:68:3: ( rule__MyHtmlModel__ArticleAssignment )
            {
             before(grammarAccess.getMyHtmlModelAccess().getArticleAssignment()); 
            // InternalHtmlModel.g:69:3: ( rule__MyHtmlModel__ArticleAssignment )
            // InternalHtmlModel.g:69:4: rule__MyHtmlModel__ArticleAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MyHtmlModel__ArticleAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyHtmlModelAccess().getArticleAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyHtmlModel"


    // $ANTLR start "entryRuleArticle"
    // InternalHtmlModel.g:78:1: entryRuleArticle : ruleArticle EOF ;
    public final void entryRuleArticle() throws RecognitionException {
        try {
            // InternalHtmlModel.g:79:1: ( ruleArticle EOF )
            // InternalHtmlModel.g:80:1: ruleArticle EOF
            {
             before(grammarAccess.getArticleRule()); 
            pushFollow(FOLLOW_1);
            ruleArticle();

            state._fsp--;

             after(grammarAccess.getArticleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArticle"


    // $ANTLR start "ruleArticle"
    // InternalHtmlModel.g:87:1: ruleArticle : ( ( rule__Article__Group__0 ) ) ;
    public final void ruleArticle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:91:2: ( ( ( rule__Article__Group__0 ) ) )
            // InternalHtmlModel.g:92:2: ( ( rule__Article__Group__0 ) )
            {
            // InternalHtmlModel.g:92:2: ( ( rule__Article__Group__0 ) )
            // InternalHtmlModel.g:93:3: ( rule__Article__Group__0 )
            {
             before(grammarAccess.getArticleAccess().getGroup()); 
            // InternalHtmlModel.g:94:3: ( rule__Article__Group__0 )
            // InternalHtmlModel.g:94:4: rule__Article__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Article__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArticle"


    // $ANTLR start "entryRuleSection"
    // InternalHtmlModel.g:103:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalHtmlModel.g:104:1: ( ruleSection EOF )
            // InternalHtmlModel.g:105:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalHtmlModel.g:112:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:116:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalHtmlModel.g:117:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalHtmlModel.g:117:2: ( ( rule__Section__Group__0 ) )
            // InternalHtmlModel.g:118:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalHtmlModel.g:119:3: ( rule__Section__Group__0 )
            // InternalHtmlModel.g:119:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleTable"
    // InternalHtmlModel.g:128:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalHtmlModel.g:129:1: ( ruleTable EOF )
            // InternalHtmlModel.g:130:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalHtmlModel.g:137:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:141:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalHtmlModel.g:142:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalHtmlModel.g:142:2: ( ( rule__Table__Group__0 ) )
            // InternalHtmlModel.g:143:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalHtmlModel.g:144:3: ( rule__Table__Group__0 )
            // InternalHtmlModel.g:144:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleHeader"
    // InternalHtmlModel.g:153:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalHtmlModel.g:154:1: ( ruleHeader EOF )
            // InternalHtmlModel.g:155:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalHtmlModel.g:162:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:166:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalHtmlModel.g:167:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalHtmlModel.g:167:2: ( ( rule__Header__Group__0 ) )
            // InternalHtmlModel.g:168:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalHtmlModel.g:169:3: ( rule__Header__Group__0 )
            // InternalHtmlModel.g:169:4: rule__Header__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleRow"
    // InternalHtmlModel.g:178:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalHtmlModel.g:179:1: ( ruleRow EOF )
            // InternalHtmlModel.g:180:1: ruleRow EOF
            {
             before(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getRowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalHtmlModel.g:187:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:191:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalHtmlModel.g:192:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalHtmlModel.g:192:2: ( ( rule__Row__Group__0 ) )
            // InternalHtmlModel.g:193:3: ( rule__Row__Group__0 )
            {
             before(grammarAccess.getRowAccess().getGroup()); 
            // InternalHtmlModel.g:194:3: ( rule__Row__Group__0 )
            // InternalHtmlModel.g:194:4: rule__Row__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleParagraph"
    // InternalHtmlModel.g:203:1: entryRuleParagraph : ruleParagraph EOF ;
    public final void entryRuleParagraph() throws RecognitionException {
        try {
            // InternalHtmlModel.g:204:1: ( ruleParagraph EOF )
            // InternalHtmlModel.g:205:1: ruleParagraph EOF
            {
             before(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_1);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getParagraphRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // InternalHtmlModel.g:212:1: ruleParagraph : ( ( rule__Paragraph__Group__0 ) ) ;
    public final void ruleParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:216:2: ( ( ( rule__Paragraph__Group__0 ) ) )
            // InternalHtmlModel.g:217:2: ( ( rule__Paragraph__Group__0 ) )
            {
            // InternalHtmlModel.g:217:2: ( ( rule__Paragraph__Group__0 ) )
            // InternalHtmlModel.g:218:3: ( rule__Paragraph__Group__0 )
            {
             before(grammarAccess.getParagraphAccess().getGroup()); 
            // InternalHtmlModel.g:219:3: ( rule__Paragraph__Group__0 )
            // InternalHtmlModel.g:219:4: rule__Paragraph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParagraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleReferences"
    // InternalHtmlModel.g:228:1: entryRuleReferences : ruleReferences EOF ;
    public final void entryRuleReferences() throws RecognitionException {
        try {
            // InternalHtmlModel.g:229:1: ( ruleReferences EOF )
            // InternalHtmlModel.g:230:1: ruleReferences EOF
            {
             before(grammarAccess.getReferencesRule()); 
            pushFollow(FOLLOW_1);
            ruleReferences();

            state._fsp--;

             after(grammarAccess.getReferencesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReferences"


    // $ANTLR start "ruleReferences"
    // InternalHtmlModel.g:237:1: ruleReferences : ( ( rule__References__Group__0 ) ) ;
    public final void ruleReferences() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:241:2: ( ( ( rule__References__Group__0 ) ) )
            // InternalHtmlModel.g:242:2: ( ( rule__References__Group__0 ) )
            {
            // InternalHtmlModel.g:242:2: ( ( rule__References__Group__0 ) )
            // InternalHtmlModel.g:243:3: ( rule__References__Group__0 )
            {
             before(grammarAccess.getReferencesAccess().getGroup()); 
            // InternalHtmlModel.g:244:3: ( rule__References__Group__0 )
            // InternalHtmlModel.g:244:4: rule__References__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__References__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferencesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferences"


    // $ANTLR start "entryRuleLink"
    // InternalHtmlModel.g:253:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalHtmlModel.g:254:1: ( ruleLink EOF )
            // InternalHtmlModel.g:255:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalHtmlModel.g:262:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:266:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalHtmlModel.g:267:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalHtmlModel.g:267:2: ( ( rule__Link__Group__0 ) )
            // InternalHtmlModel.g:268:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalHtmlModel.g:269:3: ( rule__Link__Group__0 )
            // InternalHtmlModel.g:269:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "ruleBasicColors"
    // InternalHtmlModel.g:278:1: ruleBasicColors : ( ( rule__BasicColors__Alternatives ) ) ;
    public final void ruleBasicColors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:282:1: ( ( ( rule__BasicColors__Alternatives ) ) )
            // InternalHtmlModel.g:283:2: ( ( rule__BasicColors__Alternatives ) )
            {
            // InternalHtmlModel.g:283:2: ( ( rule__BasicColors__Alternatives ) )
            // InternalHtmlModel.g:284:3: ( rule__BasicColors__Alternatives )
            {
             before(grammarAccess.getBasicColorsAccess().getAlternatives()); 
            // InternalHtmlModel.g:285:3: ( rule__BasicColors__Alternatives )
            // InternalHtmlModel.g:285:4: rule__BasicColors__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicColors__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicColorsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicColors"


    // $ANTLR start "rule__BasicColors__Alternatives"
    // InternalHtmlModel.g:293:1: rule__BasicColors__Alternatives : ( ( ( 'black' ) ) | ( ( 'red' ) ) | ( ( 'blue' ) ) | ( ( 'green' ) ) );
    public final void rule__BasicColors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:297:1: ( ( ( 'black' ) ) | ( ( 'red' ) ) | ( ( 'blue' ) ) | ( ( 'green' ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalHtmlModel.g:298:2: ( ( 'black' ) )
                    {
                    // InternalHtmlModel.g:298:2: ( ( 'black' ) )
                    // InternalHtmlModel.g:299:3: ( 'black' )
                    {
                     before(grammarAccess.getBasicColorsAccess().getBlackEnumLiteralDeclaration_0()); 
                    // InternalHtmlModel.g:300:3: ( 'black' )
                    // InternalHtmlModel.g:300:4: 'black'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicColorsAccess().getBlackEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHtmlModel.g:304:2: ( ( 'red' ) )
                    {
                    // InternalHtmlModel.g:304:2: ( ( 'red' ) )
                    // InternalHtmlModel.g:305:3: ( 'red' )
                    {
                     before(grammarAccess.getBasicColorsAccess().getRedEnumLiteralDeclaration_1()); 
                    // InternalHtmlModel.g:306:3: ( 'red' )
                    // InternalHtmlModel.g:306:4: 'red'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicColorsAccess().getRedEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHtmlModel.g:310:2: ( ( 'blue' ) )
                    {
                    // InternalHtmlModel.g:310:2: ( ( 'blue' ) )
                    // InternalHtmlModel.g:311:3: ( 'blue' )
                    {
                     before(grammarAccess.getBasicColorsAccess().getBlueEnumLiteralDeclaration_2()); 
                    // InternalHtmlModel.g:312:3: ( 'blue' )
                    // InternalHtmlModel.g:312:4: 'blue'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicColorsAccess().getBlueEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHtmlModel.g:316:2: ( ( 'green' ) )
                    {
                    // InternalHtmlModel.g:316:2: ( ( 'green' ) )
                    // InternalHtmlModel.g:317:3: ( 'green' )
                    {
                     before(grammarAccess.getBasicColorsAccess().getGreenEnumLiteralDeclaration_3()); 
                    // InternalHtmlModel.g:318:3: ( 'green' )
                    // InternalHtmlModel.g:318:4: 'green'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicColorsAccess().getGreenEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicColors__Alternatives"


    // $ANTLR start "rule__Article__Group__0"
    // InternalHtmlModel.g:326:1: rule__Article__Group__0 : rule__Article__Group__0__Impl rule__Article__Group__1 ;
    public final void rule__Article__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:330:1: ( rule__Article__Group__0__Impl rule__Article__Group__1 )
            // InternalHtmlModel.g:331:2: rule__Article__Group__0__Impl rule__Article__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Article__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Article__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__0"


    // $ANTLR start "rule__Article__Group__0__Impl"
    // InternalHtmlModel.g:338:1: rule__Article__Group__0__Impl : ( () ) ;
    public final void rule__Article__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:342:1: ( ( () ) )
            // InternalHtmlModel.g:343:1: ( () )
            {
            // InternalHtmlModel.g:343:1: ( () )
            // InternalHtmlModel.g:344:2: ()
            {
             before(grammarAccess.getArticleAccess().getArticleAction_0()); 
            // InternalHtmlModel.g:345:2: ()
            // InternalHtmlModel.g:345:3: 
            {
            }

             after(grammarAccess.getArticleAccess().getArticleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__0__Impl"


    // $ANTLR start "rule__Article__Group__1"
    // InternalHtmlModel.g:353:1: rule__Article__Group__1 : rule__Article__Group__1__Impl rule__Article__Group__2 ;
    public final void rule__Article__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:357:1: ( rule__Article__Group__1__Impl rule__Article__Group__2 )
            // InternalHtmlModel.g:358:2: rule__Article__Group__1__Impl rule__Article__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Article__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Article__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__1"


    // $ANTLR start "rule__Article__Group__1__Impl"
    // InternalHtmlModel.g:365:1: rule__Article__Group__1__Impl : ( 'Article' ) ;
    public final void rule__Article__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:369:1: ( ( 'Article' ) )
            // InternalHtmlModel.g:370:1: ( 'Article' )
            {
            // InternalHtmlModel.g:370:1: ( 'Article' )
            // InternalHtmlModel.g:371:2: 'Article'
            {
             before(grammarAccess.getArticleAccess().getArticleKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getArticleAccess().getArticleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__1__Impl"


    // $ANTLR start "rule__Article__Group__2"
    // InternalHtmlModel.g:380:1: rule__Article__Group__2 : rule__Article__Group__2__Impl rule__Article__Group__3 ;
    public final void rule__Article__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:384:1: ( rule__Article__Group__2__Impl rule__Article__Group__3 )
            // InternalHtmlModel.g:385:2: rule__Article__Group__2__Impl rule__Article__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Article__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Article__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__2"


    // $ANTLR start "rule__Article__Group__2__Impl"
    // InternalHtmlModel.g:392:1: rule__Article__Group__2__Impl : ( '{' ) ;
    public final void rule__Article__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:396:1: ( ( '{' ) )
            // InternalHtmlModel.g:397:1: ( '{' )
            {
            // InternalHtmlModel.g:397:1: ( '{' )
            // InternalHtmlModel.g:398:2: '{'
            {
             before(grammarAccess.getArticleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getArticleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__2__Impl"


    // $ANTLR start "rule__Article__Group__3"
    // InternalHtmlModel.g:407:1: rule__Article__Group__3 : rule__Article__Group__3__Impl rule__Article__Group__4 ;
    public final void rule__Article__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:411:1: ( rule__Article__Group__3__Impl rule__Article__Group__4 )
            // InternalHtmlModel.g:412:2: rule__Article__Group__3__Impl rule__Article__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Article__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Article__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__3"


    // $ANTLR start "rule__Article__Group__3__Impl"
    // InternalHtmlModel.g:419:1: rule__Article__Group__3__Impl : ( ( rule__Article__SectionsAssignment_3 )* ) ;
    public final void rule__Article__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:423:1: ( ( ( rule__Article__SectionsAssignment_3 )* ) )
            // InternalHtmlModel.g:424:1: ( ( rule__Article__SectionsAssignment_3 )* )
            {
            // InternalHtmlModel.g:424:1: ( ( rule__Article__SectionsAssignment_3 )* )
            // InternalHtmlModel.g:425:2: ( rule__Article__SectionsAssignment_3 )*
            {
             before(grammarAccess.getArticleAccess().getSectionsAssignment_3()); 
            // InternalHtmlModel.g:426:2: ( rule__Article__SectionsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalHtmlModel.g:426:3: rule__Article__SectionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Article__SectionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getArticleAccess().getSectionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__3__Impl"


    // $ANTLR start "rule__Article__Group__4"
    // InternalHtmlModel.g:434:1: rule__Article__Group__4 : rule__Article__Group__4__Impl rule__Article__Group__5 ;
    public final void rule__Article__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:438:1: ( rule__Article__Group__4__Impl rule__Article__Group__5 )
            // InternalHtmlModel.g:439:2: rule__Article__Group__4__Impl rule__Article__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Article__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Article__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__4"


    // $ANTLR start "rule__Article__Group__4__Impl"
    // InternalHtmlModel.g:446:1: rule__Article__Group__4__Impl : ( ( rule__Article__ReferencesAssignment_4 )? ) ;
    public final void rule__Article__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:450:1: ( ( ( rule__Article__ReferencesAssignment_4 )? ) )
            // InternalHtmlModel.g:451:1: ( ( rule__Article__ReferencesAssignment_4 )? )
            {
            // InternalHtmlModel.g:451:1: ( ( rule__Article__ReferencesAssignment_4 )? )
            // InternalHtmlModel.g:452:2: ( rule__Article__ReferencesAssignment_4 )?
            {
             before(grammarAccess.getArticleAccess().getReferencesAssignment_4()); 
            // InternalHtmlModel.g:453:2: ( rule__Article__ReferencesAssignment_4 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalHtmlModel.g:453:3: rule__Article__ReferencesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Article__ReferencesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArticleAccess().getReferencesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__4__Impl"


    // $ANTLR start "rule__Article__Group__5"
    // InternalHtmlModel.g:461:1: rule__Article__Group__5 : rule__Article__Group__5__Impl ;
    public final void rule__Article__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:465:1: ( rule__Article__Group__5__Impl )
            // InternalHtmlModel.g:466:2: rule__Article__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Article__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__5"


    // $ANTLR start "rule__Article__Group__5__Impl"
    // InternalHtmlModel.g:472:1: rule__Article__Group__5__Impl : ( '}' ) ;
    public final void rule__Article__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:476:1: ( ( '}' ) )
            // InternalHtmlModel.g:477:1: ( '}' )
            {
            // InternalHtmlModel.g:477:1: ( '}' )
            // InternalHtmlModel.g:478:2: '}'
            {
             before(grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__5__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalHtmlModel.g:488:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:492:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalHtmlModel.g:493:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalHtmlModel.g:500:1: rule__Section__Group__0__Impl : ( 'Section' ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:504:1: ( ( 'Section' ) )
            // InternalHtmlModel.g:505:1: ( 'Section' )
            {
            // InternalHtmlModel.g:505:1: ( 'Section' )
            // InternalHtmlModel.g:506:2: 'Section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalHtmlModel.g:515:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:519:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalHtmlModel.g:520:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalHtmlModel.g:527:1: rule__Section__Group__1__Impl : ( '(' ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:531:1: ( ( '(' ) )
            // InternalHtmlModel.g:532:1: ( '(' )
            {
            // InternalHtmlModel.g:532:1: ( '(' )
            // InternalHtmlModel.g:533:2: '('
            {
             before(grammarAccess.getSectionAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalHtmlModel.g:542:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:546:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalHtmlModel.g:547:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalHtmlModel.g:554:1: rule__Section__Group__2__Impl : ( 'title' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:558:1: ( ( 'title' ) )
            // InternalHtmlModel.g:559:1: ( 'title' )
            {
            // InternalHtmlModel.g:559:1: ( 'title' )
            // InternalHtmlModel.g:560:2: 'title'
            {
             before(grammarAccess.getSectionAccess().getTitleKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getTitleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // InternalHtmlModel.g:569:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:573:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalHtmlModel.g:574:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Section__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // InternalHtmlModel.g:581:1: rule__Section__Group__3__Impl : ( '=' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:585:1: ( ( '=' ) )
            // InternalHtmlModel.g:586:1: ( '=' )
            {
            // InternalHtmlModel.g:586:1: ( '=' )
            // InternalHtmlModel.g:587:2: '='
            {
             before(grammarAccess.getSectionAccess().getEqualsSignKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__Section__Group__4"
    // InternalHtmlModel.g:596:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:600:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalHtmlModel.g:601:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Section__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4"


    // $ANTLR start "rule__Section__Group__4__Impl"
    // InternalHtmlModel.g:608:1: rule__Section__Group__4__Impl : ( ( rule__Section__TitleAssignment_4 ) ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:612:1: ( ( ( rule__Section__TitleAssignment_4 ) ) )
            // InternalHtmlModel.g:613:1: ( ( rule__Section__TitleAssignment_4 ) )
            {
            // InternalHtmlModel.g:613:1: ( ( rule__Section__TitleAssignment_4 ) )
            // InternalHtmlModel.g:614:2: ( rule__Section__TitleAssignment_4 )
            {
             before(grammarAccess.getSectionAccess().getTitleAssignment_4()); 
            // InternalHtmlModel.g:615:2: ( rule__Section__TitleAssignment_4 )
            // InternalHtmlModel.g:615:3: rule__Section__TitleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Section__TitleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getTitleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4__Impl"


    // $ANTLR start "rule__Section__Group__5"
    // InternalHtmlModel.g:623:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:627:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalHtmlModel.g:628:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Section__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__5"


    // $ANTLR start "rule__Section__Group__5__Impl"
    // InternalHtmlModel.g:635:1: rule__Section__Group__5__Impl : ( ( rule__Section__Group_5__0 )? ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:639:1: ( ( ( rule__Section__Group_5__0 )? ) )
            // InternalHtmlModel.g:640:1: ( ( rule__Section__Group_5__0 )? )
            {
            // InternalHtmlModel.g:640:1: ( ( rule__Section__Group_5__0 )? )
            // InternalHtmlModel.g:641:2: ( rule__Section__Group_5__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_5()); 
            // InternalHtmlModel.g:642:2: ( rule__Section__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalHtmlModel.g:642:3: rule__Section__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__5__Impl"


    // $ANTLR start "rule__Section__Group__6"
    // InternalHtmlModel.g:650:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:654:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // InternalHtmlModel.g:655:2: rule__Section__Group__6__Impl rule__Section__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Section__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__6"


    // $ANTLR start "rule__Section__Group__6__Impl"
    // InternalHtmlModel.g:662:1: rule__Section__Group__6__Impl : ( ')' ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:666:1: ( ( ')' ) )
            // InternalHtmlModel.g:667:1: ( ')' )
            {
            // InternalHtmlModel.g:667:1: ( ')' )
            // InternalHtmlModel.g:668:2: ')'
            {
             before(grammarAccess.getSectionAccess().getRightParenthesisKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__6__Impl"


    // $ANTLR start "rule__Section__Group__7"
    // InternalHtmlModel.g:677:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:681:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // InternalHtmlModel.g:682:2: rule__Section__Group__7__Impl rule__Section__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Section__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__7"


    // $ANTLR start "rule__Section__Group__7__Impl"
    // InternalHtmlModel.g:689:1: rule__Section__Group__7__Impl : ( '{' ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:693:1: ( ( '{' ) )
            // InternalHtmlModel.g:694:1: ( '{' )
            {
            // InternalHtmlModel.g:694:1: ( '{' )
            // InternalHtmlModel.g:695:2: '{'
            {
             before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__7__Impl"


    // $ANTLR start "rule__Section__Group__8"
    // InternalHtmlModel.g:704:1: rule__Section__Group__8 : rule__Section__Group__8__Impl rule__Section__Group__9 ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:708:1: ( rule__Section__Group__8__Impl rule__Section__Group__9 )
            // InternalHtmlModel.g:709:2: rule__Section__Group__8__Impl rule__Section__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Section__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__8"


    // $ANTLR start "rule__Section__Group__8__Impl"
    // InternalHtmlModel.g:716:1: rule__Section__Group__8__Impl : ( ( rule__Section__ParagraphsAssignment_8 )* ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:720:1: ( ( ( rule__Section__ParagraphsAssignment_8 )* ) )
            // InternalHtmlModel.g:721:1: ( ( rule__Section__ParagraphsAssignment_8 )* )
            {
            // InternalHtmlModel.g:721:1: ( ( rule__Section__ParagraphsAssignment_8 )* )
            // InternalHtmlModel.g:722:2: ( rule__Section__ParagraphsAssignment_8 )*
            {
             before(grammarAccess.getSectionAccess().getParagraphsAssignment_8()); 
            // InternalHtmlModel.g:723:2: ( rule__Section__ParagraphsAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHtmlModel.g:723:3: rule__Section__ParagraphsAssignment_8
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Section__ParagraphsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getParagraphsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__8__Impl"


    // $ANTLR start "rule__Section__Group__9"
    // InternalHtmlModel.g:731:1: rule__Section__Group__9 : rule__Section__Group__9__Impl rule__Section__Group__10 ;
    public final void rule__Section__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:735:1: ( rule__Section__Group__9__Impl rule__Section__Group__10 )
            // InternalHtmlModel.g:736:2: rule__Section__Group__9__Impl rule__Section__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Section__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__9"


    // $ANTLR start "rule__Section__Group__9__Impl"
    // InternalHtmlModel.g:743:1: rule__Section__Group__9__Impl : ( ( rule__Section__TablesAssignment_9 )* ) ;
    public final void rule__Section__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:747:1: ( ( ( rule__Section__TablesAssignment_9 )* ) )
            // InternalHtmlModel.g:748:1: ( ( rule__Section__TablesAssignment_9 )* )
            {
            // InternalHtmlModel.g:748:1: ( ( rule__Section__TablesAssignment_9 )* )
            // InternalHtmlModel.g:749:2: ( rule__Section__TablesAssignment_9 )*
            {
             before(grammarAccess.getSectionAccess().getTablesAssignment_9()); 
            // InternalHtmlModel.g:750:2: ( rule__Section__TablesAssignment_9 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalHtmlModel.g:750:3: rule__Section__TablesAssignment_9
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Section__TablesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getTablesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__9__Impl"


    // $ANTLR start "rule__Section__Group__10"
    // InternalHtmlModel.g:758:1: rule__Section__Group__10 : rule__Section__Group__10__Impl ;
    public final void rule__Section__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:762:1: ( rule__Section__Group__10__Impl )
            // InternalHtmlModel.g:763:2: rule__Section__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__10"


    // $ANTLR start "rule__Section__Group__10__Impl"
    // InternalHtmlModel.g:769:1: rule__Section__Group__10__Impl : ( '}' ) ;
    public final void rule__Section__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:773:1: ( ( '}' ) )
            // InternalHtmlModel.g:774:1: ( '}' )
            {
            // InternalHtmlModel.g:774:1: ( '}' )
            // InternalHtmlModel.g:775:2: '}'
            {
             before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__10__Impl"


    // $ANTLR start "rule__Section__Group_5__0"
    // InternalHtmlModel.g:785:1: rule__Section__Group_5__0 : rule__Section__Group_5__0__Impl rule__Section__Group_5__1 ;
    public final void rule__Section__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:789:1: ( rule__Section__Group_5__0__Impl rule__Section__Group_5__1 )
            // InternalHtmlModel.g:790:2: rule__Section__Group_5__0__Impl rule__Section__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__Section__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__0"


    // $ANTLR start "rule__Section__Group_5__0__Impl"
    // InternalHtmlModel.g:797:1: rule__Section__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Section__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:801:1: ( ( ',' ) )
            // InternalHtmlModel.g:802:1: ( ',' )
            {
            // InternalHtmlModel.g:802:1: ( ',' )
            // InternalHtmlModel.g:803:2: ','
            {
             before(grammarAccess.getSectionAccess().getCommaKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__0__Impl"


    // $ANTLR start "rule__Section__Group_5__1"
    // InternalHtmlModel.g:812:1: rule__Section__Group_5__1 : rule__Section__Group_5__1__Impl rule__Section__Group_5__2 ;
    public final void rule__Section__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:816:1: ( rule__Section__Group_5__1__Impl rule__Section__Group_5__2 )
            // InternalHtmlModel.g:817:2: rule__Section__Group_5__1__Impl rule__Section__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Section__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__1"


    // $ANTLR start "rule__Section__Group_5__1__Impl"
    // InternalHtmlModel.g:824:1: rule__Section__Group_5__1__Impl : ( 'size' ) ;
    public final void rule__Section__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:828:1: ( ( 'size' ) )
            // InternalHtmlModel.g:829:1: ( 'size' )
            {
            // InternalHtmlModel.g:829:1: ( 'size' )
            // InternalHtmlModel.g:830:2: 'size'
            {
             before(grammarAccess.getSectionAccess().getSizeKeyword_5_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSizeKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__1__Impl"


    // $ANTLR start "rule__Section__Group_5__2"
    // InternalHtmlModel.g:839:1: rule__Section__Group_5__2 : rule__Section__Group_5__2__Impl rule__Section__Group_5__3 ;
    public final void rule__Section__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:843:1: ( rule__Section__Group_5__2__Impl rule__Section__Group_5__3 )
            // InternalHtmlModel.g:844:2: rule__Section__Group_5__2__Impl rule__Section__Group_5__3
            {
            pushFollow(FOLLOW_16);
            rule__Section__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__2"


    // $ANTLR start "rule__Section__Group_5__2__Impl"
    // InternalHtmlModel.g:851:1: rule__Section__Group_5__2__Impl : ( '=' ) ;
    public final void rule__Section__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:855:1: ( ( '=' ) )
            // InternalHtmlModel.g:856:1: ( '=' )
            {
            // InternalHtmlModel.g:856:1: ( '=' )
            // InternalHtmlModel.g:857:2: '='
            {
             before(grammarAccess.getSectionAccess().getEqualsSignKeyword_5_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getEqualsSignKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__2__Impl"


    // $ANTLR start "rule__Section__Group_5__3"
    // InternalHtmlModel.g:866:1: rule__Section__Group_5__3 : rule__Section__Group_5__3__Impl ;
    public final void rule__Section__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:870:1: ( rule__Section__Group_5__3__Impl )
            // InternalHtmlModel.g:871:2: rule__Section__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__3"


    // $ANTLR start "rule__Section__Group_5__3__Impl"
    // InternalHtmlModel.g:877:1: rule__Section__Group_5__3__Impl : ( ( rule__Section__SizeAssignment_5_3 ) ) ;
    public final void rule__Section__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:881:1: ( ( ( rule__Section__SizeAssignment_5_3 ) ) )
            // InternalHtmlModel.g:882:1: ( ( rule__Section__SizeAssignment_5_3 ) )
            {
            // InternalHtmlModel.g:882:1: ( ( rule__Section__SizeAssignment_5_3 ) )
            // InternalHtmlModel.g:883:2: ( rule__Section__SizeAssignment_5_3 )
            {
             before(grammarAccess.getSectionAccess().getSizeAssignment_5_3()); 
            // InternalHtmlModel.g:884:2: ( rule__Section__SizeAssignment_5_3 )
            // InternalHtmlModel.g:884:3: rule__Section__SizeAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Section__SizeAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getSizeAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__3__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalHtmlModel.g:893:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:897:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalHtmlModel.g:898:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalHtmlModel.g:905:1: rule__Table__Group__0__Impl : ( 'Table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:909:1: ( ( 'Table' ) )
            // InternalHtmlModel.g:910:1: ( 'Table' )
            {
            // InternalHtmlModel.g:910:1: ( 'Table' )
            // InternalHtmlModel.g:911:2: 'Table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalHtmlModel.g:920:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:924:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalHtmlModel.g:925:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalHtmlModel.g:932:1: rule__Table__Group__1__Impl : ( '{' ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:936:1: ( ( '{' ) )
            // InternalHtmlModel.g:937:1: ( '{' )
            {
            // InternalHtmlModel.g:937:1: ( '{' )
            // InternalHtmlModel.g:938:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalHtmlModel.g:947:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:951:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalHtmlModel.g:952:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalHtmlModel.g:959:1: rule__Table__Group__2__Impl : ( ( rule__Table__HeaderAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:963:1: ( ( ( rule__Table__HeaderAssignment_2 ) ) )
            // InternalHtmlModel.g:964:1: ( ( rule__Table__HeaderAssignment_2 ) )
            {
            // InternalHtmlModel.g:964:1: ( ( rule__Table__HeaderAssignment_2 ) )
            // InternalHtmlModel.g:965:2: ( rule__Table__HeaderAssignment_2 )
            {
             before(grammarAccess.getTableAccess().getHeaderAssignment_2()); 
            // InternalHtmlModel.g:966:2: ( rule__Table__HeaderAssignment_2 )
            // InternalHtmlModel.g:966:3: rule__Table__HeaderAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Table__HeaderAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getHeaderAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalHtmlModel.g:974:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:978:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalHtmlModel.g:979:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalHtmlModel.g:986:1: rule__Table__Group__3__Impl : ( ( ( rule__Table__RowsAssignment_3 ) ) ( ( rule__Table__RowsAssignment_3 )* ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:990:1: ( ( ( ( rule__Table__RowsAssignment_3 ) ) ( ( rule__Table__RowsAssignment_3 )* ) ) )
            // InternalHtmlModel.g:991:1: ( ( ( rule__Table__RowsAssignment_3 ) ) ( ( rule__Table__RowsAssignment_3 )* ) )
            {
            // InternalHtmlModel.g:991:1: ( ( ( rule__Table__RowsAssignment_3 ) ) ( ( rule__Table__RowsAssignment_3 )* ) )
            // InternalHtmlModel.g:992:2: ( ( rule__Table__RowsAssignment_3 ) ) ( ( rule__Table__RowsAssignment_3 )* )
            {
            // InternalHtmlModel.g:992:2: ( ( rule__Table__RowsAssignment_3 ) )
            // InternalHtmlModel.g:993:3: ( rule__Table__RowsAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_3()); 
            // InternalHtmlModel.g:994:3: ( rule__Table__RowsAssignment_3 )
            // InternalHtmlModel.g:994:4: rule__Table__RowsAssignment_3
            {
            pushFollow(FOLLOW_20);
            rule__Table__RowsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getRowsAssignment_3()); 

            }

            // InternalHtmlModel.g:997:2: ( ( rule__Table__RowsAssignment_3 )* )
            // InternalHtmlModel.g:998:3: ( rule__Table__RowsAssignment_3 )*
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_3()); 
            // InternalHtmlModel.g:999:3: ( rule__Table__RowsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalHtmlModel.g:999:4: rule__Table__RowsAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Table__RowsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getRowsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalHtmlModel.g:1008:1: rule__Table__Group__4 : rule__Table__Group__4__Impl ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1012:1: ( rule__Table__Group__4__Impl )
            // InternalHtmlModel.g:1013:2: rule__Table__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalHtmlModel.g:1019:1: rule__Table__Group__4__Impl : ( '}' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1023:1: ( ( '}' ) )
            // InternalHtmlModel.g:1024:1: ( '}' )
            {
            // InternalHtmlModel.g:1024:1: ( '}' )
            // InternalHtmlModel.g:1025:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // InternalHtmlModel.g:1035:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1039:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalHtmlModel.g:1040:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // InternalHtmlModel.g:1047:1: rule__Header__Group__0__Impl : ( () ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1051:1: ( ( () ) )
            // InternalHtmlModel.g:1052:1: ( () )
            {
            // InternalHtmlModel.g:1052:1: ( () )
            // InternalHtmlModel.g:1053:2: ()
            {
             before(grammarAccess.getHeaderAccess().getHeaderAction_0()); 
            // InternalHtmlModel.g:1054:2: ()
            // InternalHtmlModel.g:1054:3: 
            {
            }

             after(grammarAccess.getHeaderAccess().getHeaderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // InternalHtmlModel.g:1062:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1066:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalHtmlModel.g:1067:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // InternalHtmlModel.g:1074:1: rule__Header__Group__1__Impl : ( 'Header' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1078:1: ( ( 'Header' ) )
            // InternalHtmlModel.g:1079:1: ( 'Header' )
            {
            // InternalHtmlModel.g:1079:1: ( 'Header' )
            // InternalHtmlModel.g:1080:2: 'Header'
            {
             before(grammarAccess.getHeaderAccess().getHeaderKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getHeaderKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__2"
    // InternalHtmlModel.g:1089:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1093:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // InternalHtmlModel.g:1094:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Header__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__2"


    // $ANTLR start "rule__Header__Group__2__Impl"
    // InternalHtmlModel.g:1101:1: rule__Header__Group__2__Impl : ( '{' ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1105:1: ( ( '{' ) )
            // InternalHtmlModel.g:1106:1: ( '{' )
            {
            // InternalHtmlModel.g:1106:1: ( '{' )
            // InternalHtmlModel.g:1107:2: '{'
            {
             before(grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__2__Impl"


    // $ANTLR start "rule__Header__Group__3"
    // InternalHtmlModel.g:1116:1: rule__Header__Group__3 : rule__Header__Group__3__Impl rule__Header__Group__4 ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1120:1: ( rule__Header__Group__3__Impl rule__Header__Group__4 )
            // InternalHtmlModel.g:1121:2: rule__Header__Group__3__Impl rule__Header__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Header__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__3"


    // $ANTLR start "rule__Header__Group__3__Impl"
    // InternalHtmlModel.g:1128:1: rule__Header__Group__3__Impl : ( ( rule__Header__TableHeaderDataAssignment_3 )* ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1132:1: ( ( ( rule__Header__TableHeaderDataAssignment_3 )* ) )
            // InternalHtmlModel.g:1133:1: ( ( rule__Header__TableHeaderDataAssignment_3 )* )
            {
            // InternalHtmlModel.g:1133:1: ( ( rule__Header__TableHeaderDataAssignment_3 )* )
            // InternalHtmlModel.g:1134:2: ( rule__Header__TableHeaderDataAssignment_3 )*
            {
             before(grammarAccess.getHeaderAccess().getTableHeaderDataAssignment_3()); 
            // InternalHtmlModel.g:1135:2: ( rule__Header__TableHeaderDataAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalHtmlModel.g:1135:3: rule__Header__TableHeaderDataAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Header__TableHeaderDataAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getHeaderAccess().getTableHeaderDataAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__3__Impl"


    // $ANTLR start "rule__Header__Group__4"
    // InternalHtmlModel.g:1143:1: rule__Header__Group__4 : rule__Header__Group__4__Impl ;
    public final void rule__Header__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1147:1: ( rule__Header__Group__4__Impl )
            // InternalHtmlModel.g:1148:2: rule__Header__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__4"


    // $ANTLR start "rule__Header__Group__4__Impl"
    // InternalHtmlModel.g:1154:1: rule__Header__Group__4__Impl : ( '}' ) ;
    public final void rule__Header__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1158:1: ( ( '}' ) )
            // InternalHtmlModel.g:1159:1: ( '}' )
            {
            // InternalHtmlModel.g:1159:1: ( '}' )
            // InternalHtmlModel.g:1160:2: '}'
            {
             before(grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__4__Impl"


    // $ANTLR start "rule__Row__Group__0"
    // InternalHtmlModel.g:1170:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1174:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalHtmlModel.g:1175:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Row__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0"


    // $ANTLR start "rule__Row__Group__0__Impl"
    // InternalHtmlModel.g:1182:1: rule__Row__Group__0__Impl : ( () ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1186:1: ( ( () ) )
            // InternalHtmlModel.g:1187:1: ( () )
            {
            // InternalHtmlModel.g:1187:1: ( () )
            // InternalHtmlModel.g:1188:2: ()
            {
             before(grammarAccess.getRowAccess().getRowAction_0()); 
            // InternalHtmlModel.g:1189:2: ()
            // InternalHtmlModel.g:1189:3: 
            {
            }

             after(grammarAccess.getRowAccess().getRowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0__Impl"


    // $ANTLR start "rule__Row__Group__1"
    // InternalHtmlModel.g:1197:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1201:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalHtmlModel.g:1202:2: rule__Row__Group__1__Impl rule__Row__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Row__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1"


    // $ANTLR start "rule__Row__Group__1__Impl"
    // InternalHtmlModel.g:1209:1: rule__Row__Group__1__Impl : ( 'Row' ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1213:1: ( ( 'Row' ) )
            // InternalHtmlModel.g:1214:1: ( 'Row' )
            {
            // InternalHtmlModel.g:1214:1: ( 'Row' )
            // InternalHtmlModel.g:1215:2: 'Row'
            {
             before(grammarAccess.getRowAccess().getRowKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getRowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1__Impl"


    // $ANTLR start "rule__Row__Group__2"
    // InternalHtmlModel.g:1224:1: rule__Row__Group__2 : rule__Row__Group__2__Impl rule__Row__Group__3 ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1228:1: ( rule__Row__Group__2__Impl rule__Row__Group__3 )
            // InternalHtmlModel.g:1229:2: rule__Row__Group__2__Impl rule__Row__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Row__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2"


    // $ANTLR start "rule__Row__Group__2__Impl"
    // InternalHtmlModel.g:1236:1: rule__Row__Group__2__Impl : ( '{' ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1240:1: ( ( '{' ) )
            // InternalHtmlModel.g:1241:1: ( '{' )
            {
            // InternalHtmlModel.g:1241:1: ( '{' )
            // InternalHtmlModel.g:1242:2: '{'
            {
             before(grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2__Impl"


    // $ANTLR start "rule__Row__Group__3"
    // InternalHtmlModel.g:1251:1: rule__Row__Group__3 : rule__Row__Group__3__Impl rule__Row__Group__4 ;
    public final void rule__Row__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1255:1: ( rule__Row__Group__3__Impl rule__Row__Group__4 )
            // InternalHtmlModel.g:1256:2: rule__Row__Group__3__Impl rule__Row__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Row__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3"


    // $ANTLR start "rule__Row__Group__3__Impl"
    // InternalHtmlModel.g:1263:1: rule__Row__Group__3__Impl : ( ( rule__Row__TableRowDataAssignment_3 )* ) ;
    public final void rule__Row__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1267:1: ( ( ( rule__Row__TableRowDataAssignment_3 )* ) )
            // InternalHtmlModel.g:1268:1: ( ( rule__Row__TableRowDataAssignment_3 )* )
            {
            // InternalHtmlModel.g:1268:1: ( ( rule__Row__TableRowDataAssignment_3 )* )
            // InternalHtmlModel.g:1269:2: ( rule__Row__TableRowDataAssignment_3 )*
            {
             before(grammarAccess.getRowAccess().getTableRowDataAssignment_3()); 
            // InternalHtmlModel.g:1270:2: ( rule__Row__TableRowDataAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHtmlModel.g:1270:3: rule__Row__TableRowDataAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Row__TableRowDataAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRowAccess().getTableRowDataAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3__Impl"


    // $ANTLR start "rule__Row__Group__4"
    // InternalHtmlModel.g:1278:1: rule__Row__Group__4 : rule__Row__Group__4__Impl ;
    public final void rule__Row__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1282:1: ( rule__Row__Group__4__Impl )
            // InternalHtmlModel.g:1283:2: rule__Row__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__4"


    // $ANTLR start "rule__Row__Group__4__Impl"
    // InternalHtmlModel.g:1289:1: rule__Row__Group__4__Impl : ( '}' ) ;
    public final void rule__Row__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1293:1: ( ( '}' ) )
            // InternalHtmlModel.g:1294:1: ( '}' )
            {
            // InternalHtmlModel.g:1294:1: ( '}' )
            // InternalHtmlModel.g:1295:2: '}'
            {
             before(grammarAccess.getRowAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__4__Impl"


    // $ANTLR start "rule__Paragraph__Group__0"
    // InternalHtmlModel.g:1305:1: rule__Paragraph__Group__0 : rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 ;
    public final void rule__Paragraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1309:1: ( rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 )
            // InternalHtmlModel.g:1310:2: rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Paragraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__0"


    // $ANTLR start "rule__Paragraph__Group__0__Impl"
    // InternalHtmlModel.g:1317:1: rule__Paragraph__Group__0__Impl : ( 'Paragraph' ) ;
    public final void rule__Paragraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1321:1: ( ( 'Paragraph' ) )
            // InternalHtmlModel.g:1322:1: ( 'Paragraph' )
            {
            // InternalHtmlModel.g:1322:1: ( 'Paragraph' )
            // InternalHtmlModel.g:1323:2: 'Paragraph'
            {
             before(grammarAccess.getParagraphAccess().getParagraphKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getParagraphAccess().getParagraphKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__0__Impl"


    // $ANTLR start "rule__Paragraph__Group__1"
    // InternalHtmlModel.g:1332:1: rule__Paragraph__Group__1 : rule__Paragraph__Group__1__Impl rule__Paragraph__Group__2 ;
    public final void rule__Paragraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1336:1: ( rule__Paragraph__Group__1__Impl rule__Paragraph__Group__2 )
            // InternalHtmlModel.g:1337:2: rule__Paragraph__Group__1__Impl rule__Paragraph__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Paragraph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__1"


    // $ANTLR start "rule__Paragraph__Group__1__Impl"
    // InternalHtmlModel.g:1344:1: rule__Paragraph__Group__1__Impl : ( ( rule__Paragraph__Group_1__0 )? ) ;
    public final void rule__Paragraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1348:1: ( ( ( rule__Paragraph__Group_1__0 )? ) )
            // InternalHtmlModel.g:1349:1: ( ( rule__Paragraph__Group_1__0 )? )
            {
            // InternalHtmlModel.g:1349:1: ( ( rule__Paragraph__Group_1__0 )? )
            // InternalHtmlModel.g:1350:2: ( rule__Paragraph__Group_1__0 )?
            {
             before(grammarAccess.getParagraphAccess().getGroup_1()); 
            // InternalHtmlModel.g:1351:2: ( rule__Paragraph__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalHtmlModel.g:1351:3: rule__Paragraph__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Paragraph__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParagraphAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__1__Impl"


    // $ANTLR start "rule__Paragraph__Group__2"
    // InternalHtmlModel.g:1359:1: rule__Paragraph__Group__2 : rule__Paragraph__Group__2__Impl rule__Paragraph__Group__3 ;
    public final void rule__Paragraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1363:1: ( rule__Paragraph__Group__2__Impl rule__Paragraph__Group__3 )
            // InternalHtmlModel.g:1364:2: rule__Paragraph__Group__2__Impl rule__Paragraph__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Paragraph__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__2"


    // $ANTLR start "rule__Paragraph__Group__2__Impl"
    // InternalHtmlModel.g:1371:1: rule__Paragraph__Group__2__Impl : ( '{' ) ;
    public final void rule__Paragraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1375:1: ( ( '{' ) )
            // InternalHtmlModel.g:1376:1: ( '{' )
            {
            // InternalHtmlModel.g:1376:1: ( '{' )
            // InternalHtmlModel.g:1377:2: '{'
            {
             before(grammarAccess.getParagraphAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParagraphAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__2__Impl"


    // $ANTLR start "rule__Paragraph__Group__3"
    // InternalHtmlModel.g:1386:1: rule__Paragraph__Group__3 : rule__Paragraph__Group__3__Impl rule__Paragraph__Group__4 ;
    public final void rule__Paragraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1390:1: ( rule__Paragraph__Group__3__Impl rule__Paragraph__Group__4 )
            // InternalHtmlModel.g:1391:2: rule__Paragraph__Group__3__Impl rule__Paragraph__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Paragraph__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__3"


    // $ANTLR start "rule__Paragraph__Group__3__Impl"
    // InternalHtmlModel.g:1398:1: rule__Paragraph__Group__3__Impl : ( ( rule__Paragraph__ContentAssignment_3 ) ) ;
    public final void rule__Paragraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1402:1: ( ( ( rule__Paragraph__ContentAssignment_3 ) ) )
            // InternalHtmlModel.g:1403:1: ( ( rule__Paragraph__ContentAssignment_3 ) )
            {
            // InternalHtmlModel.g:1403:1: ( ( rule__Paragraph__ContentAssignment_3 ) )
            // InternalHtmlModel.g:1404:2: ( rule__Paragraph__ContentAssignment_3 )
            {
             before(grammarAccess.getParagraphAccess().getContentAssignment_3()); 
            // InternalHtmlModel.g:1405:2: ( rule__Paragraph__ContentAssignment_3 )
            // InternalHtmlModel.g:1405:3: rule__Paragraph__ContentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__ContentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParagraphAccess().getContentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__3__Impl"


    // $ANTLR start "rule__Paragraph__Group__4"
    // InternalHtmlModel.g:1413:1: rule__Paragraph__Group__4 : rule__Paragraph__Group__4__Impl ;
    public final void rule__Paragraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1417:1: ( rule__Paragraph__Group__4__Impl )
            // InternalHtmlModel.g:1418:2: rule__Paragraph__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__4"


    // $ANTLR start "rule__Paragraph__Group__4__Impl"
    // InternalHtmlModel.g:1424:1: rule__Paragraph__Group__4__Impl : ( '}' ) ;
    public final void rule__Paragraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1428:1: ( ( '}' ) )
            // InternalHtmlModel.g:1429:1: ( '}' )
            {
            // InternalHtmlModel.g:1429:1: ( '}' )
            // InternalHtmlModel.g:1430:2: '}'
            {
             before(grammarAccess.getParagraphAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParagraphAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__4__Impl"


    // $ANTLR start "rule__Paragraph__Group_1__0"
    // InternalHtmlModel.g:1440:1: rule__Paragraph__Group_1__0 : rule__Paragraph__Group_1__0__Impl rule__Paragraph__Group_1__1 ;
    public final void rule__Paragraph__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1444:1: ( rule__Paragraph__Group_1__0__Impl rule__Paragraph__Group_1__1 )
            // InternalHtmlModel.g:1445:2: rule__Paragraph__Group_1__0__Impl rule__Paragraph__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Paragraph__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragraph__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group_1__0"


    // $ANTLR start "rule__Paragraph__Group_1__0__Impl"
    // InternalHtmlModel.g:1452:1: rule__Paragraph__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Paragraph__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1456:1: ( ( '(' ) )
            // InternalHtmlModel.g:1457:1: ( '(' )
            {
            // InternalHtmlModel.g:1457:1: ( '(' )
            // InternalHtmlModel.g:1458:2: '('
            {
             before(grammarAccess.getParagraphAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParagraphAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group_1__0__Impl"


    // $ANTLR start "rule__Paragraph__Group_1__1"
    // InternalHtmlModel.g:1467:1: rule__Paragraph__Group_1__1 : rule__Paragraph__Group_1__1__Impl rule__Paragraph__Group_1__2 ;
    public final void rule__Paragraph__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1471:1: ( rule__Paragraph__Group_1__1__Impl rule__Paragraph__Group_1__2 )
            // InternalHtmlModel.g:1472:2: rule__Paragraph__Group_1__1__Impl rule__Paragraph__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Paragraph__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragraph__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group_1__1"


    // $ANTLR start "rule__Paragraph__Group_1__1__Impl"
    // InternalHtmlModel.g:1479:1: rule__Paragraph__Group_1__1__Impl : ( 'color' ) ;
    public final void rule__Paragraph__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1483:1: ( ( 'color' ) )
            // InternalHtmlModel.g:1484:1: ( 'color' )
            {
            // InternalHtmlModel.g:1484:1: ( 'color' )
            // InternalHtmlModel.g:1485:2: 'color'
            {
             before(grammarAccess.getParagraphAccess().getColorKeyword_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getParagraphAccess().getColorKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group_1__1__Impl"


    // $ANTLR start "rule__Paragraph__Group_1__2"
    // InternalHtmlModel.g:1494:1: rule__Paragraph__Group_1__2 : rule__Paragraph__Group_1__2__Impl rule__Paragraph__Group_1__3 ;
    public final void rule__Paragraph__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1498:1: ( rule__Paragraph__Group_1__2__Impl rule__Paragraph__Group_1__3 )
            // InternalHtmlModel.g:1499:2: rule__Paragraph__Group_1__2__Impl rule__Paragraph__Group_1__3
            {
            pushFollow(FOLLOW_25);
            rule__Paragraph__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragraph__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group_1__2"


    // $ANTLR start "rule__Paragraph__Group_1__2__Impl"
    // InternalHtmlModel.g:1506:1: rule__Paragraph__Group_1__2__Impl : ( '=' ) ;
    public final void rule__Paragraph__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1510:1: ( ( '=' ) )
            // InternalHtmlModel.g:1511:1: ( '=' )
            {
            // InternalHtmlModel.g:1511:1: ( '=' )
            // InternalHtmlModel.g:1512:2: '='
            {
             before(grammarAccess.getParagraphAccess().getEqualsSignKeyword_1_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParagraphAccess().getEqualsSignKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group_1__2__Impl"


    // $ANTLR start "rule__Paragraph__Group_1__3"
    // InternalHtmlModel.g:1521:1: rule__Paragraph__Group_1__3 : rule__Paragraph__Group_1__3__Impl rule__Paragraph__Group_1__4 ;
    public final void rule__Paragraph__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1525:1: ( rule__Paragraph__Group_1__3__Impl rule__Paragraph__Group_1__4 )
            // InternalHtmlModel.g:1526:2: rule__Paragraph__Group_1__3__Impl rule__Paragraph__Group_1__4
            {
            pushFollow(FOLLOW_26);
            rule__Paragraph__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragraph__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group_1__3"


    // $ANTLR start "rule__Paragraph__Group_1__3__Impl"
    // InternalHtmlModel.g:1533:1: rule__Paragraph__Group_1__3__Impl : ( ( rule__Paragraph__ColorAssignment_1_3 ) ) ;
    public final void rule__Paragraph__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1537:1: ( ( ( rule__Paragraph__ColorAssignment_1_3 ) ) )
            // InternalHtmlModel.g:1538:1: ( ( rule__Paragraph__ColorAssignment_1_3 ) )
            {
            // InternalHtmlModel.g:1538:1: ( ( rule__Paragraph__ColorAssignment_1_3 ) )
            // InternalHtmlModel.g:1539:2: ( rule__Paragraph__ColorAssignment_1_3 )
            {
             before(grammarAccess.getParagraphAccess().getColorAssignment_1_3()); 
            // InternalHtmlModel.g:1540:2: ( rule__Paragraph__ColorAssignment_1_3 )
            // InternalHtmlModel.g:1540:3: rule__Paragraph__ColorAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__ColorAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getParagraphAccess().getColorAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group_1__3__Impl"


    // $ANTLR start "rule__Paragraph__Group_1__4"
    // InternalHtmlModel.g:1548:1: rule__Paragraph__Group_1__4 : rule__Paragraph__Group_1__4__Impl ;
    public final void rule__Paragraph__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1552:1: ( rule__Paragraph__Group_1__4__Impl )
            // InternalHtmlModel.g:1553:2: rule__Paragraph__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group_1__4"


    // $ANTLR start "rule__Paragraph__Group_1__4__Impl"
    // InternalHtmlModel.g:1559:1: rule__Paragraph__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Paragraph__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1563:1: ( ( ')' ) )
            // InternalHtmlModel.g:1564:1: ( ')' )
            {
            // InternalHtmlModel.g:1564:1: ( ')' )
            // InternalHtmlModel.g:1565:2: ')'
            {
             before(grammarAccess.getParagraphAccess().getRightParenthesisKeyword_1_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getParagraphAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group_1__4__Impl"


    // $ANTLR start "rule__References__Group__0"
    // InternalHtmlModel.g:1575:1: rule__References__Group__0 : rule__References__Group__0__Impl rule__References__Group__1 ;
    public final void rule__References__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1579:1: ( rule__References__Group__0__Impl rule__References__Group__1 )
            // InternalHtmlModel.g:1580:2: rule__References__Group__0__Impl rule__References__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__References__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__References__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__References__Group__0"


    // $ANTLR start "rule__References__Group__0__Impl"
    // InternalHtmlModel.g:1587:1: rule__References__Group__0__Impl : ( () ) ;
    public final void rule__References__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1591:1: ( ( () ) )
            // InternalHtmlModel.g:1592:1: ( () )
            {
            // InternalHtmlModel.g:1592:1: ( () )
            // InternalHtmlModel.g:1593:2: ()
            {
             before(grammarAccess.getReferencesAccess().getReferencesAction_0()); 
            // InternalHtmlModel.g:1594:2: ()
            // InternalHtmlModel.g:1594:3: 
            {
            }

             after(grammarAccess.getReferencesAccess().getReferencesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__References__Group__0__Impl"


    // $ANTLR start "rule__References__Group__1"
    // InternalHtmlModel.g:1602:1: rule__References__Group__1 : rule__References__Group__1__Impl rule__References__Group__2 ;
    public final void rule__References__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1606:1: ( rule__References__Group__1__Impl rule__References__Group__2 )
            // InternalHtmlModel.g:1607:2: rule__References__Group__1__Impl rule__References__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__References__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__References__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__References__Group__1"


    // $ANTLR start "rule__References__Group__1__Impl"
    // InternalHtmlModel.g:1614:1: rule__References__Group__1__Impl : ( 'References' ) ;
    public final void rule__References__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1618:1: ( ( 'References' ) )
            // InternalHtmlModel.g:1619:1: ( 'References' )
            {
            // InternalHtmlModel.g:1619:1: ( 'References' )
            // InternalHtmlModel.g:1620:2: 'References'
            {
             before(grammarAccess.getReferencesAccess().getReferencesKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getReferencesAccess().getReferencesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__References__Group__1__Impl"


    // $ANTLR start "rule__References__Group__2"
    // InternalHtmlModel.g:1629:1: rule__References__Group__2 : rule__References__Group__2__Impl rule__References__Group__3 ;
    public final void rule__References__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1633:1: ( rule__References__Group__2__Impl rule__References__Group__3 )
            // InternalHtmlModel.g:1634:2: rule__References__Group__2__Impl rule__References__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__References__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__References__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__References__Group__2"


    // $ANTLR start "rule__References__Group__2__Impl"
    // InternalHtmlModel.g:1641:1: rule__References__Group__2__Impl : ( '{' ) ;
    public final void rule__References__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1645:1: ( ( '{' ) )
            // InternalHtmlModel.g:1646:1: ( '{' )
            {
            // InternalHtmlModel.g:1646:1: ( '{' )
            // InternalHtmlModel.g:1647:2: '{'
            {
             before(grammarAccess.getReferencesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getReferencesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__References__Group__2__Impl"


    // $ANTLR start "rule__References__Group__3"
    // InternalHtmlModel.g:1656:1: rule__References__Group__3 : rule__References__Group__3__Impl rule__References__Group__4 ;
    public final void rule__References__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1660:1: ( rule__References__Group__3__Impl rule__References__Group__4 )
            // InternalHtmlModel.g:1661:2: rule__References__Group__3__Impl rule__References__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__References__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__References__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__References__Group__3"


    // $ANTLR start "rule__References__Group__3__Impl"
    // InternalHtmlModel.g:1668:1: rule__References__Group__3__Impl : ( ( rule__References__LinksAssignment_3 )* ) ;
    public final void rule__References__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1672:1: ( ( ( rule__References__LinksAssignment_3 )* ) )
            // InternalHtmlModel.g:1673:1: ( ( rule__References__LinksAssignment_3 )* )
            {
            // InternalHtmlModel.g:1673:1: ( ( rule__References__LinksAssignment_3 )* )
            // InternalHtmlModel.g:1674:2: ( rule__References__LinksAssignment_3 )*
            {
             before(grammarAccess.getReferencesAccess().getLinksAssignment_3()); 
            // InternalHtmlModel.g:1675:2: ( rule__References__LinksAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHtmlModel.g:1675:3: rule__References__LinksAssignment_3
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__References__LinksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getReferencesAccess().getLinksAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__References__Group__3__Impl"


    // $ANTLR start "rule__References__Group__4"
    // InternalHtmlModel.g:1683:1: rule__References__Group__4 : rule__References__Group__4__Impl ;
    public final void rule__References__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1687:1: ( rule__References__Group__4__Impl )
            // InternalHtmlModel.g:1688:2: rule__References__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__References__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__References__Group__4"


    // $ANTLR start "rule__References__Group__4__Impl"
    // InternalHtmlModel.g:1694:1: rule__References__Group__4__Impl : ( '}' ) ;
    public final void rule__References__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1698:1: ( ( '}' ) )
            // InternalHtmlModel.g:1699:1: ( '}' )
            {
            // InternalHtmlModel.g:1699:1: ( '}' )
            // InternalHtmlModel.g:1700:2: '}'
            {
             before(grammarAccess.getReferencesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getReferencesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__References__Group__4__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalHtmlModel.g:1710:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1714:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalHtmlModel.g:1715:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalHtmlModel.g:1722:1: rule__Link__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1726:1: ( ( RULE_ID ) )
            // InternalHtmlModel.g:1727:1: ( RULE_ID )
            {
            // InternalHtmlModel.g:1727:1: ( RULE_ID )
            // InternalHtmlModel.g:1728:2: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalHtmlModel.g:1737:1: rule__Link__Group__1 : rule__Link__Group__1__Impl ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1741:1: ( rule__Link__Group__1__Impl )
            // InternalHtmlModel.g:1742:2: rule__Link__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalHtmlModel.g:1748:1: rule__Link__Group__1__Impl : ( ( rule__Link__Group_1__0 )* ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1752:1: ( ( ( rule__Link__Group_1__0 )* ) )
            // InternalHtmlModel.g:1753:1: ( ( rule__Link__Group_1__0 )* )
            {
            // InternalHtmlModel.g:1753:1: ( ( rule__Link__Group_1__0 )* )
            // InternalHtmlModel.g:1754:2: ( rule__Link__Group_1__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_1()); 
            // InternalHtmlModel.g:1755:2: ( rule__Link__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHtmlModel.g:1755:3: rule__Link__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Link__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group_1__0"
    // InternalHtmlModel.g:1764:1: rule__Link__Group_1__0 : rule__Link__Group_1__0__Impl rule__Link__Group_1__1 ;
    public final void rule__Link__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1768:1: ( rule__Link__Group_1__0__Impl rule__Link__Group_1__1 )
            // InternalHtmlModel.g:1769:2: rule__Link__Group_1__0__Impl rule__Link__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Link__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_1__0"


    // $ANTLR start "rule__Link__Group_1__0__Impl"
    // InternalHtmlModel.g:1776:1: rule__Link__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Link__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1780:1: ( ( '.' ) )
            // InternalHtmlModel.g:1781:1: ( '.' )
            {
            // InternalHtmlModel.g:1781:1: ( '.' )
            // InternalHtmlModel.g:1782:2: '.'
            {
             before(grammarAccess.getLinkAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_1__0__Impl"


    // $ANTLR start "rule__Link__Group_1__1"
    // InternalHtmlModel.g:1791:1: rule__Link__Group_1__1 : rule__Link__Group_1__1__Impl ;
    public final void rule__Link__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1795:1: ( rule__Link__Group_1__1__Impl )
            // InternalHtmlModel.g:1796:2: rule__Link__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_1__1"


    // $ANTLR start "rule__Link__Group_1__1__Impl"
    // InternalHtmlModel.g:1802:1: rule__Link__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Link__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1806:1: ( ( RULE_ID ) )
            // InternalHtmlModel.g:1807:1: ( RULE_ID )
            {
            // InternalHtmlModel.g:1807:1: ( RULE_ID )
            // InternalHtmlModel.g:1808:2: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_1__1__Impl"


    // $ANTLR start "rule__MyHtmlModel__ArticleAssignment"
    // InternalHtmlModel.g:1818:1: rule__MyHtmlModel__ArticleAssignment : ( ruleArticle ) ;
    public final void rule__MyHtmlModel__ArticleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1822:1: ( ( ruleArticle ) )
            // InternalHtmlModel.g:1823:2: ( ruleArticle )
            {
            // InternalHtmlModel.g:1823:2: ( ruleArticle )
            // InternalHtmlModel.g:1824:3: ruleArticle
            {
             before(grammarAccess.getMyHtmlModelAccess().getArticleArticleParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleArticle();

            state._fsp--;

             after(grammarAccess.getMyHtmlModelAccess().getArticleArticleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyHtmlModel__ArticleAssignment"


    // $ANTLR start "rule__Article__SectionsAssignment_3"
    // InternalHtmlModel.g:1833:1: rule__Article__SectionsAssignment_3 : ( ruleSection ) ;
    public final void rule__Article__SectionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1837:1: ( ( ruleSection ) )
            // InternalHtmlModel.g:1838:2: ( ruleSection )
            {
            // InternalHtmlModel.g:1838:2: ( ruleSection )
            // InternalHtmlModel.g:1839:3: ruleSection
            {
             before(grammarAccess.getArticleAccess().getSectionsSectionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getArticleAccess().getSectionsSectionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__SectionsAssignment_3"


    // $ANTLR start "rule__Article__ReferencesAssignment_4"
    // InternalHtmlModel.g:1848:1: rule__Article__ReferencesAssignment_4 : ( ruleReferences ) ;
    public final void rule__Article__ReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1852:1: ( ( ruleReferences ) )
            // InternalHtmlModel.g:1853:2: ( ruleReferences )
            {
            // InternalHtmlModel.g:1853:2: ( ruleReferences )
            // InternalHtmlModel.g:1854:3: ruleReferences
            {
             before(grammarAccess.getArticleAccess().getReferencesReferencesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleReferences();

            state._fsp--;

             after(grammarAccess.getArticleAccess().getReferencesReferencesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__ReferencesAssignment_4"


    // $ANTLR start "rule__Section__TitleAssignment_4"
    // InternalHtmlModel.g:1863:1: rule__Section__TitleAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Section__TitleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1867:1: ( ( RULE_STRING ) )
            // InternalHtmlModel.g:1868:2: ( RULE_STRING )
            {
            // InternalHtmlModel.g:1868:2: ( RULE_STRING )
            // InternalHtmlModel.g:1869:3: RULE_STRING
            {
             before(grammarAccess.getSectionAccess().getTitleSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getTitleSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__TitleAssignment_4"


    // $ANTLR start "rule__Section__SizeAssignment_5_3"
    // InternalHtmlModel.g:1878:1: rule__Section__SizeAssignment_5_3 : ( RULE_HINT ) ;
    public final void rule__Section__SizeAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1882:1: ( ( RULE_HINT ) )
            // InternalHtmlModel.g:1883:2: ( RULE_HINT )
            {
            // InternalHtmlModel.g:1883:2: ( RULE_HINT )
            // InternalHtmlModel.g:1884:3: RULE_HINT
            {
             before(grammarAccess.getSectionAccess().getSizeHINTTerminalRuleCall_5_3_0()); 
            match(input,RULE_HINT,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSizeHINTTerminalRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__SizeAssignment_5_3"


    // $ANTLR start "rule__Section__ParagraphsAssignment_8"
    // InternalHtmlModel.g:1893:1: rule__Section__ParagraphsAssignment_8 : ( ruleParagraph ) ;
    public final void rule__Section__ParagraphsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1897:1: ( ( ruleParagraph ) )
            // InternalHtmlModel.g:1898:2: ( ruleParagraph )
            {
            // InternalHtmlModel.g:1898:2: ( ruleParagraph )
            // InternalHtmlModel.g:1899:3: ruleParagraph
            {
             before(grammarAccess.getSectionAccess().getParagraphsParagraphParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getParagraphsParagraphParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__ParagraphsAssignment_8"


    // $ANTLR start "rule__Section__TablesAssignment_9"
    // InternalHtmlModel.g:1908:1: rule__Section__TablesAssignment_9 : ( ruleTable ) ;
    public final void rule__Section__TablesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1912:1: ( ( ruleTable ) )
            // InternalHtmlModel.g:1913:2: ( ruleTable )
            {
            // InternalHtmlModel.g:1913:2: ( ruleTable )
            // InternalHtmlModel.g:1914:3: ruleTable
            {
             before(grammarAccess.getSectionAccess().getTablesTableParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getTablesTableParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__TablesAssignment_9"


    // $ANTLR start "rule__Table__HeaderAssignment_2"
    // InternalHtmlModel.g:1923:1: rule__Table__HeaderAssignment_2 : ( ruleHeader ) ;
    public final void rule__Table__HeaderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1927:1: ( ( ruleHeader ) )
            // InternalHtmlModel.g:1928:2: ( ruleHeader )
            {
            // InternalHtmlModel.g:1928:2: ( ruleHeader )
            // InternalHtmlModel.g:1929:3: ruleHeader
            {
             before(grammarAccess.getTableAccess().getHeaderHeaderParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getTableAccess().getHeaderHeaderParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__HeaderAssignment_2"


    // $ANTLR start "rule__Table__RowsAssignment_3"
    // InternalHtmlModel.g:1938:1: rule__Table__RowsAssignment_3 : ( ruleRow ) ;
    public final void rule__Table__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1942:1: ( ( ruleRow ) )
            // InternalHtmlModel.g:1943:2: ( ruleRow )
            {
            // InternalHtmlModel.g:1943:2: ( ruleRow )
            // InternalHtmlModel.g:1944:3: ruleRow
            {
             before(grammarAccess.getTableAccess().getRowsRowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getTableAccess().getRowsRowParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__RowsAssignment_3"


    // $ANTLR start "rule__Header__TableHeaderDataAssignment_3"
    // InternalHtmlModel.g:1953:1: rule__Header__TableHeaderDataAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Header__TableHeaderDataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1957:1: ( ( RULE_STRING ) )
            // InternalHtmlModel.g:1958:2: ( RULE_STRING )
            {
            // InternalHtmlModel.g:1958:2: ( RULE_STRING )
            // InternalHtmlModel.g:1959:3: RULE_STRING
            {
             before(grammarAccess.getHeaderAccess().getTableHeaderDataSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getTableHeaderDataSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__TableHeaderDataAssignment_3"


    // $ANTLR start "rule__Row__TableRowDataAssignment_3"
    // InternalHtmlModel.g:1968:1: rule__Row__TableRowDataAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Row__TableRowDataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1972:1: ( ( RULE_STRING ) )
            // InternalHtmlModel.g:1973:2: ( RULE_STRING )
            {
            // InternalHtmlModel.g:1973:2: ( RULE_STRING )
            // InternalHtmlModel.g:1974:3: RULE_STRING
            {
             before(grammarAccess.getRowAccess().getTableRowDataSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getTableRowDataSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__TableRowDataAssignment_3"


    // $ANTLR start "rule__Paragraph__ColorAssignment_1_3"
    // InternalHtmlModel.g:1983:1: rule__Paragraph__ColorAssignment_1_3 : ( ruleBasicColors ) ;
    public final void rule__Paragraph__ColorAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:1987:1: ( ( ruleBasicColors ) )
            // InternalHtmlModel.g:1988:2: ( ruleBasicColors )
            {
            // InternalHtmlModel.g:1988:2: ( ruleBasicColors )
            // InternalHtmlModel.g:1989:3: ruleBasicColors
            {
             before(grammarAccess.getParagraphAccess().getColorBasicColorsEnumRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicColors();

            state._fsp--;

             after(grammarAccess.getParagraphAccess().getColorBasicColorsEnumRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__ColorAssignment_1_3"


    // $ANTLR start "rule__Paragraph__ContentAssignment_3"
    // InternalHtmlModel.g:1998:1: rule__Paragraph__ContentAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Paragraph__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:2002:1: ( ( RULE_STRING ) )
            // InternalHtmlModel.g:2003:2: ( RULE_STRING )
            {
            // InternalHtmlModel.g:2003:2: ( RULE_STRING )
            // InternalHtmlModel.g:2004:3: RULE_STRING
            {
             before(grammarAccess.getParagraphAccess().getContentSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParagraphAccess().getContentSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__ContentAssignment_3"


    // $ANTLR start "rule__References__LinksAssignment_3"
    // InternalHtmlModel.g:2013:1: rule__References__LinksAssignment_3 : ( ruleLink ) ;
    public final void rule__References__LinksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHtmlModel.g:2017:1: ( ( ruleLink ) )
            // InternalHtmlModel.g:2018:2: ( ruleLink )
            {
            // InternalHtmlModel.g:2018:2: ( ruleLink )
            // InternalHtmlModel.g:2019:3: ruleLink
            {
             before(grammarAccess.getReferencesAccess().getLinksLinkParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getReferencesAccess().getLinksLinkParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__References__LinksAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000800C0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000024040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000010L});

}