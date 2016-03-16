package rslingo.rslil4privacy.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import rslingo.rslil4privacy.services.RSLIL4PrivacyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRSLIL4PrivacyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'};'", "'.'", "'import'", "'.*'", "'Enforcement'", "'Name'", "','", "'Description'", "'Type'", "'Action'", "'Algorithm'", "'Config'", "'Process'", "'Tool'", "'Service'", "'RefersTo PrivateData'", "'Service_Part'", "'Recipient'", "'Recipient_Part'", "'Scope'", "'Internal'", "'External'", "'Internal/External'", "'Individual'", "'Organization'", "'Individual/Organization'", "'PrivateData'", "'PersonalInformation'", "'UsageInformation'", "'Attribute'", "'}'", "'Collection'", "'Condition'", "'PartOf Collection'", "'RefersTo Service'", "'RefersTo Enforcement'", "'Modality'", "'Permitted'", "'Obligation'", "'Forbidden'", "'Disclosure'", "'PartOf Disclosure'", "'RefersTo Recipient'", "'RefersTo Recipient-Source'", "'RefersTo Recipient-Target'", "'Retention'", "'PartOf Retention'", "'Period'", "'Usage'", "'PartOf Usage'", "'Informative'", "'PartOf Informative'", "'-'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRSLIL4PrivacyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRSLIL4PrivacyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRSLIL4PrivacyParser.tokenNames; }
    public String getGrammarFileName() { return "../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g"; }



     	private RSLIL4PrivacyGrammarAccess grammarAccess;
     	
        public InternalRSLIL4PrivacyParser(TokenStream input, RSLIL4PrivacyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Policy";	
       	}
       	
       	@Override
       	protected RSLIL4PrivacyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePolicy"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:67:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:68:2: (iv_rulePolicy= rulePolicy EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:69:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_rulePolicy_in_entryRulePolicy75);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolicy85); 

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
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:76:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_collection_4_0= ruleCollection ) )* ( (lv_disclosure_5_0= ruleDisclosure ) )* ( (lv_retention_6_0= ruleRetention ) )* ( (lv_usage_7_0= ruleUsage ) )* ( (lv_informative_8_0= ruleInformative ) )* ( (lv_privateData_9_0= rulePrivateData ) )* ( (lv_recipient_10_0= ruleRecipient ) )* ( (lv_service_11_0= ruleService ) )* ( (lv_enforcement_12_0= ruleEnforcement ) )* otherlv_13= '};' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_importelements_3_0 = null;

        EObject lv_collection_4_0 = null;

        EObject lv_disclosure_5_0 = null;

        EObject lv_retention_6_0 = null;

        EObject lv_usage_7_0 = null;

        EObject lv_informative_8_0 = null;

        EObject lv_privateData_9_0 = null;

        EObject lv_recipient_10_0 = null;

        EObject lv_service_11_0 = null;

        EObject lv_enforcement_12_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:79:28: ( (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_collection_4_0= ruleCollection ) )* ( (lv_disclosure_5_0= ruleDisclosure ) )* ( (lv_retention_6_0= ruleRetention ) )* ( (lv_usage_7_0= ruleUsage ) )* ( (lv_informative_8_0= ruleInformative ) )* ( (lv_privateData_9_0= rulePrivateData ) )* ( (lv_recipient_10_0= ruleRecipient ) )* ( (lv_service_11_0= ruleService ) )* ( (lv_enforcement_12_0= ruleEnforcement ) )* otherlv_13= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:80:1: (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_collection_4_0= ruleCollection ) )* ( (lv_disclosure_5_0= ruleDisclosure ) )* ( (lv_retention_6_0= ruleRetention ) )* ( (lv_usage_7_0= ruleUsage ) )* ( (lv_informative_8_0= ruleInformative ) )* ( (lv_privateData_9_0= rulePrivateData ) )* ( (lv_recipient_10_0= ruleRecipient ) )* ( (lv_service_11_0= ruleService ) )* ( (lv_enforcement_12_0= ruleEnforcement ) )* otherlv_13= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:80:1: (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_collection_4_0= ruleCollection ) )* ( (lv_disclosure_5_0= ruleDisclosure ) )* ( (lv_retention_6_0= ruleRetention ) )* ( (lv_usage_7_0= ruleUsage ) )* ( (lv_informative_8_0= ruleInformative ) )* ( (lv_privateData_9_0= rulePrivateData ) )* ( (lv_recipient_10_0= ruleRecipient ) )* ( (lv_service_11_0= ruleService ) )* ( (lv_enforcement_12_0= ruleEnforcement ) )* otherlv_13= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:80:3: otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_collection_4_0= ruleCollection ) )* ( (lv_disclosure_5_0= ruleDisclosure ) )* ( (lv_retention_6_0= ruleRetention ) )* ( (lv_usage_7_0= ruleUsage ) )* ( (lv_informative_8_0= ruleInformative ) )* ( (lv_privateData_9_0= rulePrivateData ) )* ( (lv_recipient_10_0= ruleRecipient ) )* ( (lv_service_11_0= ruleService ) )* ( (lv_enforcement_12_0= ruleEnforcement ) )* otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePolicy122); 

                	newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPackageKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:86:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPolicyAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePolicy143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePolicy155); 

                	newLeafNode(otherlv_2, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:106:1: ( (lv_importelements_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:107:1: (lv_importelements_3_0= ruleImport )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:107:1: (lv_importelements_3_0= ruleImport )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:108:3: lv_importelements_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getImportelementsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_rulePolicy176);
            	    lv_importelements_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"importelements",
            	            		lv_importelements_3_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:124:3: ( (lv_collection_4_0= ruleCollection ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==44) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:125:1: (lv_collection_4_0= ruleCollection )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:125:1: (lv_collection_4_0= ruleCollection )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:126:3: lv_collection_4_0= ruleCollection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getCollectionCollectionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCollection_in_rulePolicy198);
            	    lv_collection_4_0=ruleCollection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"collection",
            	            		lv_collection_4_0, 
            	            		"Collection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:142:3: ( (lv_disclosure_5_0= ruleDisclosure ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==53) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:143:1: (lv_disclosure_5_0= ruleDisclosure )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:143:1: (lv_disclosure_5_0= ruleDisclosure )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:144:3: lv_disclosure_5_0= ruleDisclosure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getDisclosureDisclosureParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDisclosure_in_rulePolicy220);
            	    lv_disclosure_5_0=ruleDisclosure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"disclosure",
            	            		lv_disclosure_5_0, 
            	            		"Disclosure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:160:3: ( (lv_retention_6_0= ruleRetention ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==58) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:161:1: (lv_retention_6_0= ruleRetention )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:161:1: (lv_retention_6_0= ruleRetention )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:162:3: lv_retention_6_0= ruleRetention
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getRetentionRetentionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRetention_in_rulePolicy242);
            	    lv_retention_6_0=ruleRetention();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"retention",
            	            		lv_retention_6_0, 
            	            		"Retention");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:178:3: ( (lv_usage_7_0= ruleUsage ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==61) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:179:1: (lv_usage_7_0= ruleUsage )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:179:1: (lv_usage_7_0= ruleUsage )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:180:3: lv_usage_7_0= ruleUsage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsageUsageParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsage_in_rulePolicy264);
            	    lv_usage_7_0=ruleUsage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"usage",
            	            		lv_usage_7_0, 
            	            		"Usage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:196:3: ( (lv_informative_8_0= ruleInformative ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==63) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:197:1: (lv_informative_8_0= ruleInformative )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:197:1: (lv_informative_8_0= ruleInformative )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:198:3: lv_informative_8_0= ruleInformative
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getInformativeInformativeParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInformative_in_rulePolicy286);
            	    lv_informative_8_0=ruleInformative();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"informative",
            	            		lv_informative_8_0, 
            	            		"Informative");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:214:3: ( (lv_privateData_9_0= rulePrivateData ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:215:1: (lv_privateData_9_0= rulePrivateData )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:215:1: (lv_privateData_9_0= rulePrivateData )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:216:3: lv_privateData_9_0= rulePrivateData
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getPrivateDataPrivateDataParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrivateData_in_rulePolicy308);
            	    lv_privateData_9_0=rulePrivateData();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"privateData",
            	            		lv_privateData_9_0, 
            	            		"PrivateData");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:232:3: ( (lv_recipient_10_0= ruleRecipient ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:233:1: (lv_recipient_10_0= ruleRecipient )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:233:1: (lv_recipient_10_0= ruleRecipient )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:234:3: lv_recipient_10_0= ruleRecipient
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getRecipientRecipientParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRecipient_in_rulePolicy330);
            	    lv_recipient_10_0=ruleRecipient();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"recipient",
            	            		lv_recipient_10_0, 
            	            		"Recipient");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:250:3: ( (lv_service_11_0= ruleService ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:251:1: (lv_service_11_0= ruleService )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:251:1: (lv_service_11_0= ruleService )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:252:3: lv_service_11_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getServiceServiceParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_rulePolicy352);
            	    lv_service_11_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"service",
            	            		lv_service_11_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:268:3: ( (lv_enforcement_12_0= ruleEnforcement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:269:1: (lv_enforcement_12_0= ruleEnforcement )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:269:1: (lv_enforcement_12_0= ruleEnforcement )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:270:3: lv_enforcement_12_0= ruleEnforcement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getEnforcementEnforcementParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnforcement_in_rulePolicy374);
            	    lv_enforcement_12_0=ruleEnforcement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"enforcement",
            	            		lv_enforcement_12_0, 
            	            		"Enforcement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_rulePolicy387); 

                	newLeafNode(otherlv_13, grammarAccess.getPolicyAccess().getRightCurlyBracketSemicolonKeyword_13());
                

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
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleQualifiedName"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:298:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:299:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:300:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName424);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName435); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:307:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:310:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:311:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:311:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:311:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName475); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:318:1: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:319:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName494); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName509); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:339:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:340:2: (iv_ruleImport= ruleImport EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:341:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport556);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport566); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:348:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:351:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:352:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:352:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:352:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport603); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:356:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:357:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:357:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:358:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport624);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:382:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:383:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:384:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard661);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard672); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:391:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:394:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:395:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:395:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:396:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard719);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:406:1: (kw= '.*' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:407:2: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildcard738); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleEnforcement"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:420:1: entryRuleEnforcement returns [EObject current=null] : iv_ruleEnforcement= ruleEnforcement EOF ;
    public final EObject entryRuleEnforcement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnforcement = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:421:2: (iv_ruleEnforcement= ruleEnforcement EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:422:2: iv_ruleEnforcement= ruleEnforcement EOF
            {
             newCompositeNode(grammarAccess.getEnforcementRule()); 
            pushFollow(FOLLOW_ruleEnforcement_in_entryRuleEnforcement780);
            iv_ruleEnforcement=ruleEnforcement();

            state._fsp--;

             current =iv_ruleEnforcement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnforcement790); 

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
    // $ANTLR end "entryRuleEnforcement"


    // $ANTLR start "ruleEnforcement"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:429:1: ruleEnforcement returns [EObject current=null] : (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) ) otherlv_11= '};' ) ;
    public final EObject ruleEnforcement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_enforcementName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_type_10_1=null;
        Token lv_type_10_2=null;
        Token lv_type_10_3=null;
        Token lv_type_10_4=null;
        Token lv_type_10_5=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:432:28: ( (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) ) otherlv_11= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:433:1: (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) ) otherlv_11= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:433:1: (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) ) otherlv_11= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:433:3: otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) ) otherlv_11= '};'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEnforcement827); 

                	newLeafNode(otherlv_0, grammarAccess.getEnforcementAccess().getEnforcementKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:437:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:438:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:438:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:439:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnforcement844); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnforcementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnforcementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEnforcement861); 

                	newLeafNode(otherlv_2, grammarAccess.getEnforcementAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleEnforcement873); 

                	newLeafNode(otherlv_3, grammarAccess.getEnforcementAccess().getNameKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:463:1: ( (lv_enforcementName_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:464:1: (lv_enforcementName_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:464:1: (lv_enforcementName_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:465:3: lv_enforcementName_4_0= RULE_STRING
            {
            lv_enforcementName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnforcement890); 

            			newLeafNode(lv_enforcementName_4_0, grammarAccess.getEnforcementAccess().getEnforcementNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnforcementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"enforcementName",
                    		lv_enforcementName_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEnforcement907); 

                	newLeafNode(otherlv_5, grammarAccess.getEnforcementAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleEnforcement919); 

                	newLeafNode(otherlv_6, grammarAccess.getEnforcementAccess().getDescriptionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:489:1: ( (lv_description_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:490:1: (lv_description_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:490:1: (lv_description_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:491:3: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnforcement936); 

            			newLeafNode(lv_description_7_0, grammarAccess.getEnforcementAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnforcementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleEnforcement953); 

                	newLeafNode(otherlv_8, grammarAccess.getEnforcementAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleEnforcement965); 

                	newLeafNode(otherlv_9, grammarAccess.getEnforcementAccess().getTypeKeyword_9());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:515:1: ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:516:1: ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:516:1: ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:517:1: (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:517:1: (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt13=1;
                }
                break;
            case 23:
                {
                alt13=2;
                }
                break;
            case 24:
                {
                alt13=3;
                }
                break;
            case 25:
                {
                alt13=4;
                }
                break;
            case 26:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:518:3: lv_type_10_1= 'Action'
                    {
                    lv_type_10_1=(Token)match(input,22,FOLLOW_22_in_ruleEnforcement985); 

                            newLeafNode(lv_type_10_1, grammarAccess.getEnforcementAccess().getTypeActionKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:530:8: lv_type_10_2= 'Algorithm'
                    {
                    lv_type_10_2=(Token)match(input,23,FOLLOW_23_in_ruleEnforcement1014); 

                            newLeafNode(lv_type_10_2, grammarAccess.getEnforcementAccess().getTypeAlgorithmKeyword_10_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:542:8: lv_type_10_3= 'Config'
                    {
                    lv_type_10_3=(Token)match(input,24,FOLLOW_24_in_ruleEnforcement1043); 

                            newLeafNode(lv_type_10_3, grammarAccess.getEnforcementAccess().getTypeConfigKeyword_10_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:554:8: lv_type_10_4= 'Process'
                    {
                    lv_type_10_4=(Token)match(input,25,FOLLOW_25_in_ruleEnforcement1072); 

                            newLeafNode(lv_type_10_4, grammarAccess.getEnforcementAccess().getTypeProcessKeyword_10_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:566:8: lv_type_10_5= 'Tool'
                    {
                    lv_type_10_5=(Token)match(input,26,FOLLOW_26_in_ruleEnforcement1101); 

                            newLeafNode(lv_type_10_5, grammarAccess.getEnforcementAccess().getTypeToolKeyword_10_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleEnforcement1129); 

                	newLeafNode(otherlv_11, grammarAccess.getEnforcementAccess().getRightCurlyBracketSemicolonKeyword_11());
                

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
    // $ANTLR end "ruleEnforcement"


    // $ANTLR start "entryRuleService"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:593:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:594:2: (iv_ruleService= ruleService EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:595:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService1165);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService1175); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:602:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicePart_13_0= ruleServicePart ) )* )? otherlv_14= '};' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_serviceName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_refPrivateData_10_0 = null;

        EObject lv_servicePart_13_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:605:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicePart_13_0= ruleServicePart ) )* )? otherlv_14= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:606:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicePart_13_0= ruleServicePart ) )* )? otherlv_14= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:606:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicePart_13_0= ruleServicePart ) )* )? otherlv_14= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:606:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicePart_13_0= ruleServicePart ) )* )? otherlv_14= '};'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleService1212); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:610:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:611:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:611:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:612:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService1229); 

            			newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleService1246); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleService1258); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getNameKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:636:1: ( (lv_serviceName_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:637:1: (lv_serviceName_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:637:1: (lv_serviceName_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:638:3: lv_serviceName_4_0= RULE_STRING
            {
            lv_serviceName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService1275); 

            			newLeafNode(lv_serviceName_4_0, grammarAccess.getServiceAccess().getServiceNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"serviceName",
                    		lv_serviceName_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleService1292); 

                	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getCommaKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:658:1: (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:658:3: otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ','
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleService1305); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getDescriptionKeyword_6_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:662:1: ( (lv_description_7_0= RULE_STRING ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:663:1: (lv_description_7_0= RULE_STRING )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:663:1: (lv_description_7_0= RULE_STRING )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:664:3: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService1322); 

                    			newLeafNode(lv_description_7_0, grammarAccess.getServiceAccess().getDescriptionSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleService1339); 

                        	newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getCommaKeyword_6_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:684:3: (otherlv_9= 'RefersTo PrivateData' ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:684:5: otherlv_9= 'RefersTo PrivateData' ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleService1354); 

                        	newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRefersToPrivateDataKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:688:1: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:689:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:689:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:690:3: lv_refPrivateData_10_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceAccess().getRefPrivateDataRefPrivateDataParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleService1375);
                    	    lv_refPrivateData_10_0=ruleRefPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refPrivateData",
                    	            		lv_refPrivateData_10_0, 
                    	            		"RefPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleService1388); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getCommaKeyword_7_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:710:3: (otherlv_12= 'Service_Part' ( (lv_servicePart_13_0= ruleServicePart ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:710:5: otherlv_12= 'Service_Part' ( (lv_servicePart_13_0= ruleServicePart ) )*
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleService1403); 

                        	newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getService_PartKeyword_8_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:714:1: ( (lv_servicePart_13_0= ruleServicePart ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:715:1: (lv_servicePart_13_0= ruleServicePart )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:715:1: (lv_servicePart_13_0= ruleServicePart )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:716:3: lv_servicePart_13_0= ruleServicePart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceAccess().getServicePartServicePartParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleServicePart_in_ruleService1424);
                    	    lv_servicePart_13_0=ruleServicePart();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"servicePart",
                    	            		lv_servicePart_13_0, 
                    	            		"ServicePart");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleService1439); 

                	newLeafNode(otherlv_14, grammarAccess.getServiceAccess().getRightCurlyBracketSemicolonKeyword_9());
                

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleRecipient"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:744:1: entryRuleRecipient returns [EObject current=null] : iv_ruleRecipient= ruleRecipient EOF ;
    public final EObject entryRuleRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipient = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:745:2: (iv_ruleRecipient= ruleRecipient EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:746:2: iv_ruleRecipient= ruleRecipient EOF
            {
             newCompositeNode(grammarAccess.getRecipientRule()); 
            pushFollow(FOLLOW_ruleRecipient_in_entryRuleRecipient1475);
            iv_ruleRecipient=ruleRecipient();

            state._fsp--;

             current =iv_ruleRecipient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipient1485); 

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
    // $ANTLR end "entryRuleRecipient"


    // $ANTLR start "ruleRecipient"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:753:1: ruleRecipient returns [EObject current=null] : (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' ) ;
    public final EObject ruleRecipient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_recipientName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_scope_13_1=null;
        Token lv_scope_13_2=null;
        Token lv_scope_13_3=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_type_16_1=null;
        Token lv_type_16_2=null;
        Token lv_type_16_3=null;
        Token otherlv_17=null;
        EObject lv_recipientPart_10_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:756:28: ( (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:757:1: (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:757:1: (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:757:3: otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleRecipient1522); 

                	newLeafNode(otherlv_0, grammarAccess.getRecipientAccess().getRecipientKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:761:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:762:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:762:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:763:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipient1539); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRecipientAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecipientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRecipient1556); 

                	newLeafNode(otherlv_2, grammarAccess.getRecipientAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleRecipient1568); 

                	newLeafNode(otherlv_3, grammarAccess.getRecipientAccess().getNameKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:787:1: ( (lv_recipientName_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:788:1: (lv_recipientName_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:788:1: (lv_recipientName_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:789:3: lv_recipientName_4_0= RULE_STRING
            {
            lv_recipientName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecipient1585); 

            			newLeafNode(lv_recipientName_4_0, grammarAccess.getRecipientAccess().getRecipientNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecipientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"recipientName",
                    		lv_recipientName_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRecipient1602); 

                	newLeafNode(otherlv_5, grammarAccess.getRecipientAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleRecipient1614); 

                	newLeafNode(otherlv_6, grammarAccess.getRecipientAccess().getDescriptionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:813:1: ( (lv_description_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:814:1: (lv_description_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:814:1: (lv_description_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:815:3: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecipient1631); 

            			newLeafNode(lv_description_7_0, grammarAccess.getRecipientAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecipientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleRecipient1648); 

                	newLeafNode(otherlv_8, grammarAccess.getRecipientAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:835:1: (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:835:3: otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleRecipient1661); 

                        	newLeafNode(otherlv_9, grammarAccess.getRecipientAccess().getRecipient_PartKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:839:1: ( (lv_recipientPart_10_0= ruleRecipientPart ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:840:1: (lv_recipientPart_10_0= ruleRecipientPart )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:840:1: (lv_recipientPart_10_0= ruleRecipientPart )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:841:3: lv_recipientPart_10_0= ruleRecipientPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRecipientAccess().getRecipientPartRecipientPartParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRecipientPart_in_ruleRecipient1682);
                    	    lv_recipientPart_10_0=ruleRecipientPart();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRecipientRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"recipientPart",
                    	            		lv_recipientPart_10_0, 
                    	            		"RecipientPart");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleRecipient1695); 

                        	newLeafNode(otherlv_11, grammarAccess.getRecipientAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,32,FOLLOW_32_in_ruleRecipient1709); 

                	newLeafNode(otherlv_12, grammarAccess.getRecipientAccess().getScopeKeyword_10());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:865:1: ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:866:1: ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:866:1: ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:867:1: (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:867:1: (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt21=1;
                }
                break;
            case 34:
                {
                alt21=2;
                }
                break;
            case 35:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:868:3: lv_scope_13_1= 'Internal'
                    {
                    lv_scope_13_1=(Token)match(input,33,FOLLOW_33_in_ruleRecipient1729); 

                            newLeafNode(lv_scope_13_1, grammarAccess.getRecipientAccess().getScopeInternalKeyword_11_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "scope", lv_scope_13_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:880:8: lv_scope_13_2= 'External'
                    {
                    lv_scope_13_2=(Token)match(input,34,FOLLOW_34_in_ruleRecipient1758); 

                            newLeafNode(lv_scope_13_2, grammarAccess.getRecipientAccess().getScopeExternalKeyword_11_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "scope", lv_scope_13_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:892:8: lv_scope_13_3= 'Internal/External'
                    {
                    lv_scope_13_3=(Token)match(input,35,FOLLOW_35_in_ruleRecipient1787); 

                            newLeafNode(lv_scope_13_3, grammarAccess.getRecipientAccess().getScopeInternalExternalKeyword_11_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "scope", lv_scope_13_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleRecipient1815); 

                	newLeafNode(otherlv_14, grammarAccess.getRecipientAccess().getCommaKeyword_12());
                
            otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleRecipient1827); 

                	newLeafNode(otherlv_15, grammarAccess.getRecipientAccess().getTypeKeyword_13());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:915:1: ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:916:1: ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:916:1: ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:917:1: (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:917:1: (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt22=1;
                }
                break;
            case 37:
                {
                alt22=2;
                }
                break;
            case 38:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:918:3: lv_type_16_1= 'Individual'
                    {
                    lv_type_16_1=(Token)match(input,36,FOLLOW_36_in_ruleRecipient1847); 

                            newLeafNode(lv_type_16_1, grammarAccess.getRecipientAccess().getTypeIndividualKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_16_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:930:8: lv_type_16_2= 'Organization'
                    {
                    lv_type_16_2=(Token)match(input,37,FOLLOW_37_in_ruleRecipient1876); 

                            newLeafNode(lv_type_16_2, grammarAccess.getRecipientAccess().getTypeOrganizationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_16_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:942:8: lv_type_16_3= 'Individual/Organization'
                    {
                    lv_type_16_3=(Token)match(input,38,FOLLOW_38_in_ruleRecipient1905); 

                            newLeafNode(lv_type_16_3, grammarAccess.getRecipientAccess().getTypeIndividualOrganizationKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_16_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleRecipient1933); 

                	newLeafNode(otherlv_17, grammarAccess.getRecipientAccess().getRightCurlyBracketSemicolonKeyword_15());
                

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
    // $ANTLR end "ruleRecipient"


    // $ANTLR start "entryRulePrivateData"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:969:1: entryRulePrivateData returns [EObject current=null] : iv_rulePrivateData= rulePrivateData EOF ;
    public final EObject entryRulePrivateData() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateData = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:970:2: (iv_rulePrivateData= rulePrivateData EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:971:2: iv_rulePrivateData= rulePrivateData EOF
            {
             newCompositeNode(grammarAccess.getPrivateDataRule()); 
            pushFollow(FOLLOW_rulePrivateData_in_entryRulePrivateData1969);
            iv_rulePrivateData=rulePrivateData();

            state._fsp--;

             current =iv_rulePrivateData; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrivateData1979); 

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
    // $ANTLR end "entryRulePrivateData"


    // $ANTLR start "rulePrivateData"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:978:1: rulePrivateData returns [EObject current=null] : (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' ) ;
    public final EObject rulePrivateData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_type_7_1=null;
        Token lv_type_7_2=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_attribute_9_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:981:28: ( (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:982:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:982:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:982:3: otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_rulePrivateData2016); 

                	newLeafNode(otherlv_0, grammarAccess.getPrivateDataAccess().getPrivateDataKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:986:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:987:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:987:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:988:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrivateData2033); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrivateDataAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrivateDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePrivateData2050); 

                	newLeafNode(otherlv_2, grammarAccess.getPrivateDataAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_rulePrivateData2062); 

                	newLeafNode(otherlv_3, grammarAccess.getPrivateDataAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1012:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1013:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1013:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1014:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrivateData2079); 

            			newLeafNode(lv_description_4_0, grammarAccess.getPrivateDataAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrivateDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_rulePrivateData2096); 

                	newLeafNode(otherlv_5, grammarAccess.getPrivateDataAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,21,FOLLOW_21_in_rulePrivateData2108); 

                	newLeafNode(otherlv_6, grammarAccess.getPrivateDataAccess().getTypeKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1038:1: ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1039:1: ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1039:1: ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1040:1: (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1040:1: (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            else if ( (LA23_0==41) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1041:3: lv_type_7_1= 'PersonalInformation'
                    {
                    lv_type_7_1=(Token)match(input,40,FOLLOW_40_in_rulePrivateData2128); 

                            newLeafNode(lv_type_7_1, grammarAccess.getPrivateDataAccess().getTypePersonalInformationKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrivateDataRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1053:8: lv_type_7_2= 'UsageInformation'
                    {
                    lv_type_7_2=(Token)match(input,41,FOLLOW_41_in_rulePrivateData2157); 

                            newLeafNode(lv_type_7_2, grammarAccess.getPrivateDataAccess().getTypeUsageInformationKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrivateDataRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_rulePrivateData2185); 

                	newLeafNode(otherlv_8, grammarAccess.getPrivateDataAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1072:1: ( (lv_attribute_9_0= ruleAttribute ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==42) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1073:1: (lv_attribute_9_0= ruleAttribute )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1073:1: (lv_attribute_9_0= ruleAttribute )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1074:3: lv_attribute_9_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrivateDataAccess().getAttributeAttributeParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePrivateData2206);
            	    lv_attribute_9_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPrivateDataRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_9_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_rulePrivateData2219); 

                	newLeafNode(otherlv_10, grammarAccess.getPrivateDataAccess().getRightCurlyBracketSemicolonKeyword_10());
                

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
    // $ANTLR end "rulePrivateData"


    // $ANTLR start "entryRuleAttribute"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1102:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1103:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1104:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2255);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2265); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1111:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1114:28: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1115:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1115:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1115:3: otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleAttribute2302); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1119:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1120:1: (lv_name_1_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1120:1: (lv_name_1_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1121:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2319); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAttribute2336); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAttribute2348); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1145:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1146:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1146:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1147:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2365); 

            			newLeafNode(lv_description_4_0, grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleAttribute2382); 

                	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1167:1: (otherlv_6= ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1167:3: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleAttribute2395); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getCommaKeyword_6());
                        

                    }
                    break;

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleCollection"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1179:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1180:2: (iv_ruleCollection= ruleCollection EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1181:2: iv_ruleCollection= ruleCollection EOF
            {
             newCompositeNode(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection2433);
            iv_ruleCollection=ruleCollection();

            state._fsp--;

             current =iv_ruleCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection2443); 

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
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1188:1: ruleCollection returns [EObject current=null] : (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_condition_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_modality_22_1=null;
        Token lv_modality_22_2=null;
        Token lv_modality_22_3=null;
        Token otherlv_23=null;
        EObject lv_refPrivateData_13_0 = null;

        EObject lv_refService_16_0 = null;

        EObject lv_refEnforcement_19_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1191:28: ( (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1192:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1192:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1192:3: otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleCollection2480); 

                	newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getCollectionKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1196:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1197:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1197:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1198:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollection2497); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCollectionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCollectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCollection2514); 

                	newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCollection2526); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1222:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1223:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1223:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1224:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection2543); 

            			newLeafNode(lv_description_4_0, grammarAccess.getCollectionAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCollectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleCollection2560); 

                	newLeafNode(otherlv_5, grammarAccess.getCollectionAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleCollection2572); 

                	newLeafNode(otherlv_6, grammarAccess.getCollectionAccess().getConditionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1248:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1249:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1249:1: (lv_condition_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1250:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection2589); 

            			newLeafNode(lv_condition_7_0, grammarAccess.getCollectionAccess().getConditionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCollectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"condition",
                    		lv_condition_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleCollection2606); 

                	newLeafNode(otherlv_8, grammarAccess.getCollectionAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1270:1: (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1270:3: otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleCollection2619); 

                        	newLeafNode(otherlv_9, grammarAccess.getCollectionAccess().getPartOfCollectionKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1274:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1275:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1275:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1276:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollection2639); 

                    		newLeafNode(otherlv_10, grammarAccess.getCollectionAccess().getPartCollectionCollectionCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleCollection2651); 

                        	newLeafNode(otherlv_11, grammarAccess.getCollectionAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1291:3: (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1291:5: otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleCollection2666); 

                        	newLeafNode(otherlv_12, grammarAccess.getCollectionAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1295:1: ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1296:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1296:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1297:3: lv_refPrivateData_13_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefPrivateDataRefPrivateDataParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleCollection2687);
                    	    lv_refPrivateData_13_0=ruleRefPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refPrivateData",
                    	            		lv_refPrivateData_13_0, 
                    	            		"RefPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleCollection2700); 

                        	newLeafNode(otherlv_14, grammarAccess.getCollectionAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1317:3: (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1317:5: otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,47,FOLLOW_47_in_ruleCollection2715); 

                        	newLeafNode(otherlv_15, grammarAccess.getCollectionAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1321:1: ( (lv_refService_16_0= ruleRefService ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1322:1: (lv_refService_16_0= ruleRefService )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1322:1: (lv_refService_16_0= ruleRefService )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1323:3: lv_refService_16_0= ruleRefService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefServiceRefServiceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefService_in_ruleCollection2736);
                    	    lv_refService_16_0=ruleRefService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refService",
                    	            		lv_refService_16_0, 
                    	            		"RefService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleCollection2749); 

                        	newLeafNode(otherlv_17, grammarAccess.getCollectionAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1343:3: (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1343:5: otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,48,FOLLOW_48_in_ruleCollection2764); 

                        	newLeafNode(otherlv_18, grammarAccess.getCollectionAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1347:1: ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1348:1: (lv_refEnforcement_19_0= ruleRefEnforcement )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1348:1: (lv_refEnforcement_19_0= ruleRefEnforcement )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1349:3: lv_refEnforcement_19_0= ruleRefEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefEnforcementRefEnforcementParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleCollection2785);
                    	    lv_refEnforcement_19_0=ruleRefEnforcement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refEnforcement",
                    	            		lv_refEnforcement_19_0, 
                    	            		"RefEnforcement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleCollection2798); 

                        	newLeafNode(otherlv_20, grammarAccess.getCollectionAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,49,FOLLOW_49_in_ruleCollection2812); 

                	newLeafNode(otherlv_21, grammarAccess.getCollectionAccess().getModalityKeyword_13());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1373:1: ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1374:1: ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1374:1: ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1375:1: (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1375:1: (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt33=1;
                }
                break;
            case 51:
                {
                alt33=2;
                }
                break;
            case 52:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1376:3: lv_modality_22_1= 'Permitted'
                    {
                    lv_modality_22_1=(Token)match(input,50,FOLLOW_50_in_ruleCollection2832); 

                            newLeafNode(lv_modality_22_1, grammarAccess.getCollectionAccess().getModalityPermittedKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_22_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1388:8: lv_modality_22_2= 'Obligation'
                    {
                    lv_modality_22_2=(Token)match(input,51,FOLLOW_51_in_ruleCollection2861); 

                            newLeafNode(lv_modality_22_2, grammarAccess.getCollectionAccess().getModalityObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_22_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1400:8: lv_modality_22_3= 'Forbidden'
                    {
                    lv_modality_22_3=(Token)match(input,52,FOLLOW_52_in_ruleCollection2890); 

                            newLeafNode(lv_modality_22_3, grammarAccess.getCollectionAccess().getModalityForbiddenKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_22_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_23=(Token)match(input,13,FOLLOW_13_in_ruleCollection2918); 

                	newLeafNode(otherlv_23, grammarAccess.getCollectionAccess().getRightCurlyBracketSemicolonKeyword_15());
                

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
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleDisclosure"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1427:1: entryRuleDisclosure returns [EObject current=null] : iv_ruleDisclosure= ruleDisclosure EOF ;
    public final EObject entryRuleDisclosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisclosure = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1428:2: (iv_ruleDisclosure= ruleDisclosure EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1429:2: iv_ruleDisclosure= ruleDisclosure EOF
            {
             newCompositeNode(grammarAccess.getDisclosureRule()); 
            pushFollow(FOLLOW_ruleDisclosure_in_entryRuleDisclosure2954);
            iv_ruleDisclosure=ruleDisclosure();

            state._fsp--;

             current =iv_ruleDisclosure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisclosure2964); 

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
    // $ANTLR end "entryRuleDisclosure"


    // $ANTLR start "ruleDisclosure"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1436:1: ruleDisclosure returns [EObject current=null] : (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_refRecipient_13_0= ruleRefRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refService_25_0= ruleRefService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) ) ) otherlv_32= '};' ) ;
    public final EObject ruleDisclosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_condition_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token lv_modality_31_1=null;
        Token lv_modality_31_2=null;
        Token lv_modality_31_3=null;
        Token otherlv_32=null;
        EObject lv_refRecipient_13_0 = null;

        EObject lv_refRecipientSource_16_0 = null;

        EObject lv_refRecipientTarget_19_0 = null;

        EObject lv_refPrivateData_22_0 = null;

        EObject lv_refService_25_0 = null;

        EObject lv_refEnforcement_28_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1439:28: ( (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_refRecipient_13_0= ruleRefRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refService_25_0= ruleRefService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) ) ) otherlv_32= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1440:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_refRecipient_13_0= ruleRefRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refService_25_0= ruleRefService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) ) ) otherlv_32= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1440:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_refRecipient_13_0= ruleRefRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refService_25_0= ruleRefService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) ) ) otherlv_32= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1440:3: otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_refRecipient_13_0= ruleRefRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refService_25_0= ruleRefService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) ) ) otherlv_32= '};'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleDisclosure3001); 

                	newLeafNode(otherlv_0, grammarAccess.getDisclosureAccess().getDisclosureKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1444:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1445:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1445:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1446:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisclosure3018); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDisclosureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDisclosureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDisclosure3035); 

                	newLeafNode(otherlv_2, grammarAccess.getDisclosureAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleDisclosure3047); 

                	newLeafNode(otherlv_3, grammarAccess.getDisclosureAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1470:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1471:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1471:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1472:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure3064); 

            			newLeafNode(lv_description_4_0, grammarAccess.getDisclosureAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDisclosureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3081); 

                	newLeafNode(otherlv_5, grammarAccess.getDisclosureAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleDisclosure3093); 

                	newLeafNode(otherlv_6, grammarAccess.getDisclosureAccess().getConditionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1496:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1497:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1497:1: (lv_condition_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1498:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure3110); 

            			newLeafNode(lv_condition_7_0, grammarAccess.getDisclosureAccess().getConditionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDisclosureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"condition",
                    		lv_condition_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3127); 

                	newLeafNode(otherlv_8, grammarAccess.getDisclosureAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1518:1: (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==54) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1518:3: otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_54_in_ruleDisclosure3140); 

                        	newLeafNode(otherlv_9, grammarAccess.getDisclosureAccess().getPartOfDisclosureKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1522:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1523:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1523:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1524:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisclosure3160); 

                    		newLeafNode(otherlv_10, grammarAccess.getDisclosureAccess().getPartDisclosureDisclosureCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3172); 

                        	newLeafNode(otherlv_11, grammarAccess.getDisclosureAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1539:3: (otherlv_12= 'RefersTo Recipient' ( (lv_refRecipient_13_0= ruleRefRecipient ) )* otherlv_14= ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==55) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1539:5: otherlv_12= 'RefersTo Recipient' ( (lv_refRecipient_13_0= ruleRefRecipient ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,55,FOLLOW_55_in_ruleDisclosure3187); 

                        	newLeafNode(otherlv_12, grammarAccess.getDisclosureAccess().getRefersToRecipientKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1543:1: ( (lv_refRecipient_13_0= ruleRefRecipient ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_ID) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1544:1: (lv_refRecipient_13_0= ruleRefRecipient )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1544:1: (lv_refRecipient_13_0= ruleRefRecipient )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1545:3: lv_refRecipient_13_0= ruleRefRecipient
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefRecipientRefRecipientParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefRecipient_in_ruleDisclosure3208);
                    	    lv_refRecipient_13_0=ruleRefRecipient();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refRecipient",
                    	            		lv_refRecipient_13_0, 
                    	            		"RefRecipient");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3221); 

                        	newLeafNode(otherlv_14, grammarAccess.getDisclosureAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1565:3: (otherlv_15= 'RefersTo Recipient-Source' ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )* otherlv_17= ',' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1565:5: otherlv_15= 'RefersTo Recipient-Source' ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,56,FOLLOW_56_in_ruleDisclosure3236); 

                        	newLeafNode(otherlv_15, grammarAccess.getDisclosureAccess().getRefersToRecipientSourceKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1569:1: ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ID) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1570:1: (lv_refRecipientSource_16_0= ruleRefRecipientSource )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1570:1: (lv_refRecipientSource_16_0= ruleRefRecipientSource )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1571:3: lv_refRecipientSource_16_0= ruleRefRecipientSource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefRecipientSourceRefRecipientSourceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefRecipientSource_in_ruleDisclosure3257);
                    	    lv_refRecipientSource_16_0=ruleRefRecipientSource();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refRecipientSource",
                    	            		lv_refRecipientSource_16_0, 
                    	            		"RefRecipientSource");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3270); 

                        	newLeafNode(otherlv_17, grammarAccess.getDisclosureAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1591:3: (otherlv_18= 'RefersTo Recipient-Target' ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )* otherlv_20= ',' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==57) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1591:5: otherlv_18= 'RefersTo Recipient-Target' ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,57,FOLLOW_57_in_ruleDisclosure3285); 

                        	newLeafNode(otherlv_18, grammarAccess.getDisclosureAccess().getRefersToRecipientTargetKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1595:1: ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1596:1: (lv_refRecipientTarget_19_0= ruleRefRecipientTarget )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1596:1: (lv_refRecipientTarget_19_0= ruleRefRecipientTarget )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1597:3: lv_refRecipientTarget_19_0= ruleRefRecipientTarget
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefRecipientTargetRefRecipientTargetParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefRecipientTarget_in_ruleDisclosure3306);
                    	    lv_refRecipientTarget_19_0=ruleRefRecipientTarget();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refRecipientTarget",
                    	            		lv_refRecipientTarget_19_0, 
                    	            		"RefRecipientTarget");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3319); 

                        	newLeafNode(otherlv_20, grammarAccess.getDisclosureAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1617:3: (otherlv_21= 'RefersTo PrivateData' ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==28) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1617:5: otherlv_21= 'RefersTo PrivateData' ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )* otherlv_23= ','
                    {
                    otherlv_21=(Token)match(input,28,FOLLOW_28_in_ruleDisclosure3334); 

                        	newLeafNode(otherlv_21, grammarAccess.getDisclosureAccess().getRefersToPrivateDataKeyword_13_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1621:1: ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_ID) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1622:1: (lv_refPrivateData_22_0= ruleRefPrivateData )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1622:1: (lv_refPrivateData_22_0= ruleRefPrivateData )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1623:3: lv_refPrivateData_22_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefPrivateDataRefPrivateDataParserRuleCall_13_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleDisclosure3355);
                    	    lv_refPrivateData_22_0=ruleRefPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refPrivateData",
                    	            		lv_refPrivateData_22_0, 
                    	            		"RefPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3368); 

                        	newLeafNode(otherlv_23, grammarAccess.getDisclosureAccess().getCommaKeyword_13_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1643:3: (otherlv_24= 'RefersTo Service' ( (lv_refService_25_0= ruleRefService ) )* otherlv_26= ',' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1643:5: otherlv_24= 'RefersTo Service' ( (lv_refService_25_0= ruleRefService ) )* otherlv_26= ','
                    {
                    otherlv_24=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure3383); 

                        	newLeafNode(otherlv_24, grammarAccess.getDisclosureAccess().getRefersToServiceKeyword_14_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1647:1: ( (lv_refService_25_0= ruleRefService ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_ID) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1648:1: (lv_refService_25_0= ruleRefService )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1648:1: (lv_refService_25_0= ruleRefService )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1649:3: lv_refService_25_0= ruleRefService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefServiceRefServiceParserRuleCall_14_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefService_in_ruleDisclosure3404);
                    	    lv_refService_25_0=ruleRefService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refService",
                    	            		lv_refService_25_0, 
                    	            		"RefService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3417); 

                        	newLeafNode(otherlv_26, grammarAccess.getDisclosureAccess().getCommaKeyword_14_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1669:3: (otherlv_27= 'RefersTo Enforcement' ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )* otherlv_29= ',' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==48) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1669:5: otherlv_27= 'RefersTo Enforcement' ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )* otherlv_29= ','
                    {
                    otherlv_27=(Token)match(input,48,FOLLOW_48_in_ruleDisclosure3432); 

                        	newLeafNode(otherlv_27, grammarAccess.getDisclosureAccess().getRefersToEnforcementKeyword_15_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1673:1: ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_ID) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1674:1: (lv_refEnforcement_28_0= ruleRefEnforcement )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1674:1: (lv_refEnforcement_28_0= ruleRefEnforcement )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1675:3: lv_refEnforcement_28_0= ruleRefEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefEnforcementRefEnforcementParserRuleCall_15_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleDisclosure3453);
                    	    lv_refEnforcement_28_0=ruleRefEnforcement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refEnforcement",
                    	            		lv_refEnforcement_28_0, 
                    	            		"RefEnforcement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3466); 

                        	newLeafNode(otherlv_29, grammarAccess.getDisclosureAccess().getCommaKeyword_15_2());
                        

                    }
                    break;

            }

            otherlv_30=(Token)match(input,49,FOLLOW_49_in_ruleDisclosure3480); 

                	newLeafNode(otherlv_30, grammarAccess.getDisclosureAccess().getModalityKeyword_16());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1699:1: ( ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1700:1: ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1700:1: ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1701:1: (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1701:1: (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt47=1;
                }
                break;
            case 51:
                {
                alt47=2;
                }
                break;
            case 52:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1702:3: lv_modality_31_1= 'Permitted'
                    {
                    lv_modality_31_1=(Token)match(input,50,FOLLOW_50_in_ruleDisclosure3500); 

                            newLeafNode(lv_modality_31_1, grammarAccess.getDisclosureAccess().getModalityPermittedKeyword_17_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_31_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1714:8: lv_modality_31_2= 'Obligation'
                    {
                    lv_modality_31_2=(Token)match(input,51,FOLLOW_51_in_ruleDisclosure3529); 

                            newLeafNode(lv_modality_31_2, grammarAccess.getDisclosureAccess().getModalityObligationKeyword_17_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_31_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1726:8: lv_modality_31_3= 'Forbidden'
                    {
                    lv_modality_31_3=(Token)match(input,52,FOLLOW_52_in_ruleDisclosure3558); 

                            newLeafNode(lv_modality_31_3, grammarAccess.getDisclosureAccess().getModalityForbiddenKeyword_17_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_31_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_32=(Token)match(input,13,FOLLOW_13_in_ruleDisclosure3586); 

                	newLeafNode(otherlv_32, grammarAccess.getDisclosureAccess().getRightCurlyBracketSemicolonKeyword_18());
                

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
    // $ANTLR end "ruleDisclosure"


    // $ANTLR start "entryRuleRetention"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1753:1: entryRuleRetention returns [EObject current=null] : iv_ruleRetention= ruleRetention EOF ;
    public final EObject entryRuleRetention() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetention = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1754:2: (iv_ruleRetention= ruleRetention EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1755:2: iv_ruleRetention= ruleRetention EOF
            {
             newCompositeNode(grammarAccess.getRetentionRule()); 
            pushFollow(FOLLOW_ruleRetention_in_entryRuleRetention3622);
            iv_ruleRetention=ruleRetention();

            state._fsp--;

             current =iv_ruleRetention; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRetention3632); 

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
    // $ANTLR end "entryRuleRetention"


    // $ANTLR start "ruleRetention"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1762:1: ruleRetention returns [EObject current=null] : (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refService_19_0= ruleRefService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' ) ;
    public final EObject ruleRetention() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_condition_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_period_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_modality_25_1=null;
        Token lv_modality_25_2=null;
        Token lv_modality_25_3=null;
        Token otherlv_26=null;
        EObject lv_refPrivateData_16_0 = null;

        EObject lv_refService_19_0 = null;

        EObject lv_refEnforcement_22_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1765:28: ( (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refService_19_0= ruleRefService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1766:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refService_19_0= ruleRefService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1766:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refService_19_0= ruleRefService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1766:3: otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refService_19_0= ruleRefService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleRetention3669); 

                	newLeafNode(otherlv_0, grammarAccess.getRetentionAccess().getRetentionKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1770:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1771:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1771:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1772:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRetention3686); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRetentionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRetentionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRetention3703); 

                	newLeafNode(otherlv_2, grammarAccess.getRetentionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleRetention3715); 

                	newLeafNode(otherlv_3, grammarAccess.getRetentionAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1796:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1797:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1797:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1798:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention3732); 

            			newLeafNode(lv_description_4_0, grammarAccess.getRetentionAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRetentionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRetention3749); 

                	newLeafNode(otherlv_5, grammarAccess.getRetentionAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleRetention3761); 

                	newLeafNode(otherlv_6, grammarAccess.getRetentionAccess().getConditionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1822:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1823:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1823:1: (lv_condition_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1824:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention3778); 

            			newLeafNode(lv_condition_7_0, grammarAccess.getRetentionAccess().getConditionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRetentionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"condition",
                    		lv_condition_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleRetention3795); 

                	newLeafNode(otherlv_8, grammarAccess.getRetentionAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1844:1: (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==59) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1844:3: otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,59,FOLLOW_59_in_ruleRetention3808); 

                        	newLeafNode(otherlv_9, grammarAccess.getRetentionAccess().getPartOfRetentionKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1848:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1849:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1849:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1850:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRetention3828); 

                    		newLeafNode(otherlv_10, grammarAccess.getRetentionAccess().getPartRetentionRetentionCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleRetention3840); 

                        	newLeafNode(otherlv_11, grammarAccess.getRetentionAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,60,FOLLOW_60_in_ruleRetention3854); 

                	newLeafNode(otherlv_12, grammarAccess.getRetentionAccess().getPeriodKeyword_10());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1869:1: ( (lv_period_13_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1870:1: (lv_period_13_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1870:1: (lv_period_13_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1871:3: lv_period_13_0= RULE_STRING
            {
            lv_period_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention3871); 

            			newLeafNode(lv_period_13_0, grammarAccess.getRetentionAccess().getPeriodSTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRetentionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"period",
                    		lv_period_13_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleRetention3888); 

                	newLeafNode(otherlv_14, grammarAccess.getRetentionAccess().getCommaKeyword_12());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1891:1: (otherlv_15= 'RefersTo PrivateData' ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==28) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1891:3: otherlv_15= 'RefersTo PrivateData' ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_28_in_ruleRetention3901); 

                        	newLeafNode(otherlv_15, grammarAccess.getRetentionAccess().getRefersToPrivateDataKeyword_13_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1895:1: ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==RULE_ID) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1896:1: (lv_refPrivateData_16_0= ruleRefPrivateData )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1896:1: (lv_refPrivateData_16_0= ruleRefPrivateData )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1897:3: lv_refPrivateData_16_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefPrivateDataRefPrivateDataParserRuleCall_13_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleRetention3922);
                    	    lv_refPrivateData_16_0=ruleRefPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refPrivateData",
                    	            		lv_refPrivateData_16_0, 
                    	            		"RefPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleRetention3935); 

                        	newLeafNode(otherlv_17, grammarAccess.getRetentionAccess().getCommaKeyword_13_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1917:3: (otherlv_18= 'RefersTo Service' ( (lv_refService_19_0= ruleRefService ) )* otherlv_20= ',' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==47) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1917:5: otherlv_18= 'RefersTo Service' ( (lv_refService_19_0= ruleRefService ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,47,FOLLOW_47_in_ruleRetention3950); 

                        	newLeafNode(otherlv_18, grammarAccess.getRetentionAccess().getRefersToServiceKeyword_14_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1921:1: ( (lv_refService_19_0= ruleRefService ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==RULE_ID) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1922:1: (lv_refService_19_0= ruleRefService )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1922:1: (lv_refService_19_0= ruleRefService )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1923:3: lv_refService_19_0= ruleRefService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefServiceRefServiceParserRuleCall_14_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefService_in_ruleRetention3971);
                    	    lv_refService_19_0=ruleRefService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refService",
                    	            		lv_refService_19_0, 
                    	            		"RefService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleRetention3984); 

                        	newLeafNode(otherlv_20, grammarAccess.getRetentionAccess().getCommaKeyword_14_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1943:3: (otherlv_21= 'RefersTo Enforcement' ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )* otherlv_23= ',' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==48) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1943:5: otherlv_21= 'RefersTo Enforcement' ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )* otherlv_23= ','
                    {
                    otherlv_21=(Token)match(input,48,FOLLOW_48_in_ruleRetention3999); 

                        	newLeafNode(otherlv_21, grammarAccess.getRetentionAccess().getRefersToEnforcementKeyword_15_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1947:1: ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==RULE_ID) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1948:1: (lv_refEnforcement_22_0= ruleRefEnforcement )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1948:1: (lv_refEnforcement_22_0= ruleRefEnforcement )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1949:3: lv_refEnforcement_22_0= ruleRefEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefEnforcementRefEnforcementParserRuleCall_15_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleRetention4020);
                    	    lv_refEnforcement_22_0=ruleRefEnforcement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refEnforcement",
                    	            		lv_refEnforcement_22_0, 
                    	            		"RefEnforcement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleRetention4033); 

                        	newLeafNode(otherlv_23, grammarAccess.getRetentionAccess().getCommaKeyword_15_2());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,49,FOLLOW_49_in_ruleRetention4047); 

                	newLeafNode(otherlv_24, grammarAccess.getRetentionAccess().getModalityKeyword_16());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1973:1: ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1974:1: ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1974:1: ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1975:1: (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1975:1: (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt55=1;
                }
                break;
            case 51:
                {
                alt55=2;
                }
                break;
            case 52:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1976:3: lv_modality_25_1= 'Permitted'
                    {
                    lv_modality_25_1=(Token)match(input,50,FOLLOW_50_in_ruleRetention4067); 

                            newLeafNode(lv_modality_25_1, grammarAccess.getRetentionAccess().getModalityPermittedKeyword_17_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_25_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1988:8: lv_modality_25_2= 'Obligation'
                    {
                    lv_modality_25_2=(Token)match(input,51,FOLLOW_51_in_ruleRetention4096); 

                            newLeafNode(lv_modality_25_2, grammarAccess.getRetentionAccess().getModalityObligationKeyword_17_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_25_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2000:8: lv_modality_25_3= 'Forbidden'
                    {
                    lv_modality_25_3=(Token)match(input,52,FOLLOW_52_in_ruleRetention4125); 

                            newLeafNode(lv_modality_25_3, grammarAccess.getRetentionAccess().getModalityForbiddenKeyword_17_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_25_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_26=(Token)match(input,13,FOLLOW_13_in_ruleRetention4153); 

                	newLeafNode(otherlv_26, grammarAccess.getRetentionAccess().getRightCurlyBracketSemicolonKeyword_18());
                

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
    // $ANTLR end "ruleRetention"


    // $ANTLR start "entryRuleUsage"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2027:1: entryRuleUsage returns [EObject current=null] : iv_ruleUsage= ruleUsage EOF ;
    public final EObject entryRuleUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsage = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2028:2: (iv_ruleUsage= ruleUsage EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2029:2: iv_ruleUsage= ruleUsage EOF
            {
             newCompositeNode(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage4189);
            iv_ruleUsage=ruleUsage();

            state._fsp--;

             current =iv_ruleUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage4199); 

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
    // $ANTLR end "entryRuleUsage"


    // $ANTLR start "ruleUsage"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2036:1: ruleUsage returns [EObject current=null] : (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) ;
    public final EObject ruleUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_condition_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_modality_22_1=null;
        Token lv_modality_22_2=null;
        Token lv_modality_22_3=null;
        Token otherlv_23=null;
        EObject lv_refPrivateData_13_0 = null;

        EObject lv_refService_16_0 = null;

        EObject lv_refEnforcement_19_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2039:28: ( (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2040:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2040:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2040:3: otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleUsage4236); 

                	newLeafNode(otherlv_0, grammarAccess.getUsageAccess().getUsageKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2044:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2045:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2045:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2046:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage4253); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUsageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUsageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUsage4270); 

                	newLeafNode(otherlv_2, grammarAccess.getUsageAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleUsage4282); 

                	newLeafNode(otherlv_3, grammarAccess.getUsageAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2070:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2071:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2071:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2072:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage4299); 

            			newLeafNode(lv_description_4_0, grammarAccess.getUsageAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUsageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleUsage4316); 

                	newLeafNode(otherlv_5, grammarAccess.getUsageAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleUsage4328); 

                	newLeafNode(otherlv_6, grammarAccess.getUsageAccess().getConditionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2096:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2097:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2097:1: (lv_condition_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2098:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage4345); 

            			newLeafNode(lv_condition_7_0, grammarAccess.getUsageAccess().getConditionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUsageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"condition",
                    		lv_condition_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleUsage4362); 

                	newLeafNode(otherlv_8, grammarAccess.getUsageAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2118:1: (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==62) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2118:3: otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,62,FOLLOW_62_in_ruleUsage4375); 

                        	newLeafNode(otherlv_9, grammarAccess.getUsageAccess().getPartOfUsageKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2122:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2123:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2123:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2124:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage4395); 

                    		newLeafNode(otherlv_10, grammarAccess.getUsageAccess().getPartUsageUsageCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleUsage4407); 

                        	newLeafNode(otherlv_11, grammarAccess.getUsageAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2139:3: (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==28) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2139:5: otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleUsage4422); 

                        	newLeafNode(otherlv_12, grammarAccess.getUsageAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2143:1: ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==RULE_ID) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2144:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2144:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2145:3: lv_refPrivateData_13_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefPrivateDataRefPrivateDataParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleUsage4443);
                    	    lv_refPrivateData_13_0=ruleRefPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUsageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refPrivateData",
                    	            		lv_refPrivateData_13_0, 
                    	            		"RefPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleUsage4456); 

                        	newLeafNode(otherlv_14, grammarAccess.getUsageAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2165:3: (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==47) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2165:5: otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,47,FOLLOW_47_in_ruleUsage4471); 

                        	newLeafNode(otherlv_15, grammarAccess.getUsageAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2169:1: ( (lv_refService_16_0= ruleRefService ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_ID) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2170:1: (lv_refService_16_0= ruleRefService )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2170:1: (lv_refService_16_0= ruleRefService )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2171:3: lv_refService_16_0= ruleRefService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefServiceRefServiceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefService_in_ruleUsage4492);
                    	    lv_refService_16_0=ruleRefService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUsageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refService",
                    	            		lv_refService_16_0, 
                    	            		"RefService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleUsage4505); 

                        	newLeafNode(otherlv_17, grammarAccess.getUsageAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2191:3: (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==48) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2191:5: otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,48,FOLLOW_48_in_ruleUsage4520); 

                        	newLeafNode(otherlv_18, grammarAccess.getUsageAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2195:1: ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==RULE_ID) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2196:1: (lv_refEnforcement_19_0= ruleRefEnforcement )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2196:1: (lv_refEnforcement_19_0= ruleRefEnforcement )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2197:3: lv_refEnforcement_19_0= ruleRefEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefEnforcementRefEnforcementParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleUsage4541);
                    	    lv_refEnforcement_19_0=ruleRefEnforcement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUsageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refEnforcement",
                    	            		lv_refEnforcement_19_0, 
                    	            		"RefEnforcement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleUsage4554); 

                        	newLeafNode(otherlv_20, grammarAccess.getUsageAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,49,FOLLOW_49_in_ruleUsage4568); 

                	newLeafNode(otherlv_21, grammarAccess.getUsageAccess().getModalityKeyword_13());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2221:1: ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2222:1: ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2222:1: ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2223:1: (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2223:1: (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' )
            int alt63=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt63=1;
                }
                break;
            case 51:
                {
                alt63=2;
                }
                break;
            case 52:
                {
                alt63=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2224:3: lv_modality_22_1= 'Permitted'
                    {
                    lv_modality_22_1=(Token)match(input,50,FOLLOW_50_in_ruleUsage4588); 

                            newLeafNode(lv_modality_22_1, grammarAccess.getUsageAccess().getModalityPermittedKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_22_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2236:8: lv_modality_22_2= 'Obligation'
                    {
                    lv_modality_22_2=(Token)match(input,51,FOLLOW_51_in_ruleUsage4617); 

                            newLeafNode(lv_modality_22_2, grammarAccess.getUsageAccess().getModalityObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_22_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2248:8: lv_modality_22_3= 'Forbidden'
                    {
                    lv_modality_22_3=(Token)match(input,52,FOLLOW_52_in_ruleUsage4646); 

                            newLeafNode(lv_modality_22_3, grammarAccess.getUsageAccess().getModalityForbiddenKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_22_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_23=(Token)match(input,13,FOLLOW_13_in_ruleUsage4674); 

                	newLeafNode(otherlv_23, grammarAccess.getUsageAccess().getRightCurlyBracketSemicolonKeyword_15());
                

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
    // $ANTLR end "ruleUsage"


    // $ANTLR start "entryRuleInformative"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2275:1: entryRuleInformative returns [EObject current=null] : iv_ruleInformative= ruleInformative EOF ;
    public final EObject entryRuleInformative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformative = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2276:2: (iv_ruleInformative= ruleInformative EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2277:2: iv_ruleInformative= ruleInformative EOF
            {
             newCompositeNode(grammarAccess.getInformativeRule()); 
            pushFollow(FOLLOW_ruleInformative_in_entryRuleInformative4710);
            iv_ruleInformative=ruleInformative();

            state._fsp--;

             current =iv_ruleInformative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInformative4720); 

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
    // $ANTLR end "entryRuleInformative"


    // $ANTLR start "ruleInformative"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2284:1: ruleInformative returns [EObject current=null] : (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) ;
    public final EObject ruleInformative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_condition_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_modality_22_1=null;
        Token lv_modality_22_2=null;
        Token lv_modality_22_3=null;
        Token otherlv_23=null;
        EObject lv_refPrivateData_13_0 = null;

        EObject lv_refService_16_0 = null;

        EObject lv_refEnforcement_19_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2287:28: ( (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2288:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2288:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2288:3: otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleInformative4757); 

                	newLeafNode(otherlv_0, grammarAccess.getInformativeAccess().getInformativeKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2292:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2293:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2293:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2294:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformative4774); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInformativeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInformativeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInformative4791); 

                	newLeafNode(otherlv_2, grammarAccess.getInformativeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInformative4803); 

                	newLeafNode(otherlv_3, grammarAccess.getInformativeAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2318:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2319:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2319:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2320:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative4820); 

            			newLeafNode(lv_description_4_0, grammarAccess.getInformativeAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInformativeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleInformative4837); 

                	newLeafNode(otherlv_5, grammarAccess.getInformativeAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleInformative4849); 

                	newLeafNode(otherlv_6, grammarAccess.getInformativeAccess().getConditionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2344:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2345:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2345:1: (lv_condition_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2346:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative4866); 

            			newLeafNode(lv_condition_7_0, grammarAccess.getInformativeAccess().getConditionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInformativeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"condition",
                    		lv_condition_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleInformative4883); 

                	newLeafNode(otherlv_8, grammarAccess.getInformativeAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2366:1: (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==64) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2366:3: otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,64,FOLLOW_64_in_ruleInformative4896); 

                        	newLeafNode(otherlv_9, grammarAccess.getInformativeAccess().getPartOfInformativeKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2370:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2371:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2371:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2372:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformative4916); 

                    		newLeafNode(otherlv_10, grammarAccess.getInformativeAccess().getPartInformativeInformativeCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleInformative4928); 

                        	newLeafNode(otherlv_11, grammarAccess.getInformativeAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2387:3: (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==28) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2387:5: otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleInformative4943); 

                        	newLeafNode(otherlv_12, grammarAccess.getInformativeAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2391:1: ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==RULE_ID) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2392:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2392:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2393:3: lv_refPrivateData_13_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefPrivateDataRefPrivateDataParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleInformative4964);
                    	    lv_refPrivateData_13_0=ruleRefPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refPrivateData",
                    	            		lv_refPrivateData_13_0, 
                    	            		"RefPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleInformative4977); 

                        	newLeafNode(otherlv_14, grammarAccess.getInformativeAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2413:3: (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==47) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2413:5: otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,47,FOLLOW_47_in_ruleInformative4992); 

                        	newLeafNode(otherlv_15, grammarAccess.getInformativeAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2417:1: ( (lv_refService_16_0= ruleRefService ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==RULE_ID) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2418:1: (lv_refService_16_0= ruleRefService )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2418:1: (lv_refService_16_0= ruleRefService )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2419:3: lv_refService_16_0= ruleRefService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefServiceRefServiceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefService_in_ruleInformative5013);
                    	    lv_refService_16_0=ruleRefService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refService",
                    	            		lv_refService_16_0, 
                    	            		"RefService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleInformative5026); 

                        	newLeafNode(otherlv_17, grammarAccess.getInformativeAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2439:3: (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==48) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2439:5: otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,48,FOLLOW_48_in_ruleInformative5041); 

                        	newLeafNode(otherlv_18, grammarAccess.getInformativeAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2443:1: ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==RULE_ID) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2444:1: (lv_refEnforcement_19_0= ruleRefEnforcement )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2444:1: (lv_refEnforcement_19_0= ruleRefEnforcement )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2445:3: lv_refEnforcement_19_0= ruleRefEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefEnforcementRefEnforcementParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleInformative5062);
                    	    lv_refEnforcement_19_0=ruleRefEnforcement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refEnforcement",
                    	            		lv_refEnforcement_19_0, 
                    	            		"RefEnforcement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleInformative5075); 

                        	newLeafNode(otherlv_20, grammarAccess.getInformativeAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,49,FOLLOW_49_in_ruleInformative5089); 

                	newLeafNode(otherlv_21, grammarAccess.getInformativeAccess().getModalityKeyword_13());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2469:1: ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2470:1: ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2470:1: ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2471:1: (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2471:1: (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt71=1;
                }
                break;
            case 51:
                {
                alt71=2;
                }
                break;
            case 52:
                {
                alt71=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2472:3: lv_modality_22_1= 'Permitted'
                    {
                    lv_modality_22_1=(Token)match(input,50,FOLLOW_50_in_ruleInformative5109); 

                            newLeafNode(lv_modality_22_1, grammarAccess.getInformativeAccess().getModalityPermittedKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_22_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2484:8: lv_modality_22_2= 'Obligation'
                    {
                    lv_modality_22_2=(Token)match(input,51,FOLLOW_51_in_ruleInformative5138); 

                            newLeafNode(lv_modality_22_2, grammarAccess.getInformativeAccess().getModalityObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_22_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2496:8: lv_modality_22_3= 'Forbidden'
                    {
                    lv_modality_22_3=(Token)match(input,52,FOLLOW_52_in_ruleInformative5167); 

                            newLeafNode(lv_modality_22_3, grammarAccess.getInformativeAccess().getModalityForbiddenKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_22_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_23=(Token)match(input,13,FOLLOW_13_in_ruleInformative5195); 

                	newLeafNode(otherlv_23, grammarAccess.getInformativeAccess().getRightCurlyBracketSemicolonKeyword_15());
                

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
    // $ANTLR end "ruleInformative"


    // $ANTLR start "entryRuleRecipientPart"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2523:1: entryRuleRecipientPart returns [EObject current=null] : iv_ruleRecipientPart= ruleRecipientPart EOF ;
    public final EObject entryRuleRecipientPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipientPart = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2524:2: (iv_ruleRecipientPart= ruleRecipientPart EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2525:2: iv_ruleRecipientPart= ruleRecipientPart EOF
            {
             newCompositeNode(grammarAccess.getRecipientPartRule()); 
            pushFollow(FOLLOW_ruleRecipientPart_in_entryRuleRecipientPart5231);
            iv_ruleRecipientPart=ruleRecipientPart();

            state._fsp--;

             current =iv_ruleRecipientPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipientPart5241); 

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
    // $ANTLR end "entryRuleRecipientPart"


    // $ANTLR start "ruleRecipientPart"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2532:1: ruleRecipientPart returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRecipientPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2535:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2536:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2536:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2536:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2536:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2537:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2537:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2538:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRecipientPartRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipientPart5286); 

            		newLeafNode(otherlv_0, grammarAccess.getRecipientPartAccess().getRecipientPartRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2549:2: (otherlv_1= '-' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==65) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2549:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleRecipientPart5299); 

                        	newLeafNode(otherlv_1, grammarAccess.getRecipientPartAccess().getHyphenMinusKeyword_1());
                        

                    }
                    break;

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
    // $ANTLR end "ruleRecipientPart"


    // $ANTLR start "entryRuleRefRecipient"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2561:1: entryRuleRefRecipient returns [EObject current=null] : iv_ruleRefRecipient= ruleRefRecipient EOF ;
    public final EObject entryRuleRefRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefRecipient = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2562:2: (iv_ruleRefRecipient= ruleRefRecipient EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2563:2: iv_ruleRefRecipient= ruleRefRecipient EOF
            {
             newCompositeNode(grammarAccess.getRefRecipientRule()); 
            pushFollow(FOLLOW_ruleRefRecipient_in_entryRuleRefRecipient5337);
            iv_ruleRefRecipient=ruleRefRecipient();

            state._fsp--;

             current =iv_ruleRefRecipient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefRecipient5347); 

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
    // $ANTLR end "entryRuleRefRecipient"


    // $ANTLR start "ruleRefRecipient"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2570:1: ruleRefRecipient returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefRecipient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2573:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2574:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2574:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2574:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2574:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2575:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2575:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2576:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRecipientRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipient5392); 

            		newLeafNode(otherlv_0, grammarAccess.getRefRecipientAccess().getRefRecipientRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2587:2: (otherlv_1= '-' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==65) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2587:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleRefRecipient5405); 

                        	newLeafNode(otherlv_1, grammarAccess.getRefRecipientAccess().getHyphenMinusKeyword_1());
                        

                    }
                    break;

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
    // $ANTLR end "ruleRefRecipient"


    // $ANTLR start "entryRuleRefRecipientSource"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2599:1: entryRuleRefRecipientSource returns [EObject current=null] : iv_ruleRefRecipientSource= ruleRefRecipientSource EOF ;
    public final EObject entryRuleRefRecipientSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefRecipientSource = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2600:2: (iv_ruleRefRecipientSource= ruleRefRecipientSource EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2601:2: iv_ruleRefRecipientSource= ruleRefRecipientSource EOF
            {
             newCompositeNode(grammarAccess.getRefRecipientSourceRule()); 
            pushFollow(FOLLOW_ruleRefRecipientSource_in_entryRuleRefRecipientSource5443);
            iv_ruleRefRecipientSource=ruleRefRecipientSource();

            state._fsp--;

             current =iv_ruleRefRecipientSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefRecipientSource5453); 

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
    // $ANTLR end "entryRuleRefRecipientSource"


    // $ANTLR start "ruleRefRecipientSource"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2608:1: ruleRefRecipientSource returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefRecipientSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2611:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2612:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2612:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2612:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2612:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2613:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2613:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2614:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRecipientSourceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipientSource5498); 

            		newLeafNode(otherlv_0, grammarAccess.getRefRecipientSourceAccess().getRefRecipientSourceRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2625:2: (otherlv_1= '-' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==65) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2625:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleRefRecipientSource5511); 

                        	newLeafNode(otherlv_1, grammarAccess.getRefRecipientSourceAccess().getHyphenMinusKeyword_1());
                        

                    }
                    break;

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
    // $ANTLR end "ruleRefRecipientSource"


    // $ANTLR start "entryRuleRefRecipientTarget"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2637:1: entryRuleRefRecipientTarget returns [EObject current=null] : iv_ruleRefRecipientTarget= ruleRefRecipientTarget EOF ;
    public final EObject entryRuleRefRecipientTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefRecipientTarget = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2638:2: (iv_ruleRefRecipientTarget= ruleRefRecipientTarget EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2639:2: iv_ruleRefRecipientTarget= ruleRefRecipientTarget EOF
            {
             newCompositeNode(grammarAccess.getRefRecipientTargetRule()); 
            pushFollow(FOLLOW_ruleRefRecipientTarget_in_entryRuleRefRecipientTarget5549);
            iv_ruleRefRecipientTarget=ruleRefRecipientTarget();

            state._fsp--;

             current =iv_ruleRefRecipientTarget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefRecipientTarget5559); 

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
    // $ANTLR end "entryRuleRefRecipientTarget"


    // $ANTLR start "ruleRefRecipientTarget"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2646:1: ruleRefRecipientTarget returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefRecipientTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2649:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2650:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2650:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2650:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2650:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2651:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2651:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2652:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRecipientTargetRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipientTarget5604); 

            		newLeafNode(otherlv_0, grammarAccess.getRefRecipientTargetAccess().getRefRecipientTargetRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2663:2: (otherlv_1= '-' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==65) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2663:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleRefRecipientTarget5617); 

                        	newLeafNode(otherlv_1, grammarAccess.getRefRecipientTargetAccess().getHyphenMinusKeyword_1());
                        

                    }
                    break;

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
    // $ANTLR end "ruleRefRecipientTarget"


    // $ANTLR start "entryRuleRefService"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2675:1: entryRuleRefService returns [EObject current=null] : iv_ruleRefService= ruleRefService EOF ;
    public final EObject entryRuleRefService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefService = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2676:2: (iv_ruleRefService= ruleRefService EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2677:2: iv_ruleRefService= ruleRefService EOF
            {
             newCompositeNode(grammarAccess.getRefServiceRule()); 
            pushFollow(FOLLOW_ruleRefService_in_entryRuleRefService5655);
            iv_ruleRefService=ruleRefService();

            state._fsp--;

             current =iv_ruleRefService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefService5665); 

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
    // $ANTLR end "entryRuleRefService"


    // $ANTLR start "ruleRefService"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2684:1: ruleRefService returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2687:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2688:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2688:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2688:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2688:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2689:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2689:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2690:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefServiceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefService5710); 

            		newLeafNode(otherlv_0, grammarAccess.getRefServiceAccess().getRefServiceServiceCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2701:2: (otherlv_1= '-' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==65) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2701:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleRefService5723); 

                        	newLeafNode(otherlv_1, grammarAccess.getRefServiceAccess().getHyphenMinusKeyword_1());
                        

                    }
                    break;

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
    // $ANTLR end "ruleRefService"


    // $ANTLR start "entryRuleServicePart"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2713:1: entryRuleServicePart returns [EObject current=null] : iv_ruleServicePart= ruleServicePart EOF ;
    public final EObject entryRuleServicePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServicePart = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2714:2: (iv_ruleServicePart= ruleServicePart EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2715:2: iv_ruleServicePart= ruleServicePart EOF
            {
             newCompositeNode(grammarAccess.getServicePartRule()); 
            pushFollow(FOLLOW_ruleServicePart_in_entryRuleServicePart5761);
            iv_ruleServicePart=ruleServicePart();

            state._fsp--;

             current =iv_ruleServicePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServicePart5771); 

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
    // $ANTLR end "entryRuleServicePart"


    // $ANTLR start "ruleServicePart"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2722:1: ruleServicePart returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleServicePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2725:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2726:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2726:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2726:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2726:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2727:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2727:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2728:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServicePartRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServicePart5816); 

            		newLeafNode(otherlv_0, grammarAccess.getServicePartAccess().getServicePartServiceCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2739:2: (otherlv_1= '-' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==65) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2739:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleServicePart5829); 

                        	newLeafNode(otherlv_1, grammarAccess.getServicePartAccess().getHyphenMinusKeyword_1());
                        

                    }
                    break;

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
    // $ANTLR end "ruleServicePart"


    // $ANTLR start "entryRuleRefPrivateData"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2751:1: entryRuleRefPrivateData returns [EObject current=null] : iv_ruleRefPrivateData= ruleRefPrivateData EOF ;
    public final EObject entryRuleRefPrivateData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPrivateData = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2752:2: (iv_ruleRefPrivateData= ruleRefPrivateData EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2753:2: iv_ruleRefPrivateData= ruleRefPrivateData EOF
            {
             newCompositeNode(grammarAccess.getRefPrivateDataRule()); 
            pushFollow(FOLLOW_ruleRefPrivateData_in_entryRuleRefPrivateData5867);
            iv_ruleRefPrivateData=ruleRefPrivateData();

            state._fsp--;

             current =iv_ruleRefPrivateData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefPrivateData5877); 

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
    // $ANTLR end "entryRuleRefPrivateData"


    // $ANTLR start "ruleRefPrivateData"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2760:1: ruleRefPrivateData returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefPrivateData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2763:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2764:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2764:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2764:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2764:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2765:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2765:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2766:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefPrivateDataRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefPrivateData5922); 

            		newLeafNode(otherlv_0, grammarAccess.getRefPrivateDataAccess().getRefPrivateDataPrivateDataCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2777:2: (otherlv_1= '-' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==65) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2777:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleRefPrivateData5935); 

                        	newLeafNode(otherlv_1, grammarAccess.getRefPrivateDataAccess().getHyphenMinusKeyword_1());
                        

                    }
                    break;

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
    // $ANTLR end "ruleRefPrivateData"


    // $ANTLR start "entryRuleRefEnforcement"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2789:1: entryRuleRefEnforcement returns [EObject current=null] : iv_ruleRefEnforcement= ruleRefEnforcement EOF ;
    public final EObject entryRuleRefEnforcement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefEnforcement = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2790:2: (iv_ruleRefEnforcement= ruleRefEnforcement EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2791:2: iv_ruleRefEnforcement= ruleRefEnforcement EOF
            {
             newCompositeNode(grammarAccess.getRefEnforcementRule()); 
            pushFollow(FOLLOW_ruleRefEnforcement_in_entryRuleRefEnforcement5973);
            iv_ruleRefEnforcement=ruleRefEnforcement();

            state._fsp--;

             current =iv_ruleRefEnforcement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefEnforcement5983); 

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
    // $ANTLR end "entryRuleRefEnforcement"


    // $ANTLR start "ruleRefEnforcement"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2798:1: ruleRefEnforcement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefEnforcement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2801:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2802:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2802:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2802:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2802:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2803:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2803:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2804:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefEnforcementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefEnforcement6028); 

            		newLeafNode(otherlv_0, grammarAccess.getRefEnforcementAccess().getRefEnforcementEnforcementCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2815:2: (otherlv_1= '-' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==65) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2815:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleRefEnforcement6041); 

                        	newLeafNode(otherlv_1, grammarAccess.getRefEnforcementAccess().getHyphenMinusKeyword_1());
                        

                    }
                    break;

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
    // $ANTLR end "ruleRefEnforcement"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePolicy_in_entryRulePolicy75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolicy85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePolicy122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePolicy143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePolicy155 = new BitSet(new long[]{0xA42010804802A000L});
    public static final BitSet FOLLOW_ruleImport_in_rulePolicy176 = new BitSet(new long[]{0xA42010804802A000L});
    public static final BitSet FOLLOW_ruleCollection_in_rulePolicy198 = new BitSet(new long[]{0xA420108048022000L});
    public static final BitSet FOLLOW_ruleDisclosure_in_rulePolicy220 = new BitSet(new long[]{0xA420008048022000L});
    public static final BitSet FOLLOW_ruleRetention_in_rulePolicy242 = new BitSet(new long[]{0xA400008048022000L});
    public static final BitSet FOLLOW_ruleUsage_in_rulePolicy264 = new BitSet(new long[]{0xA000008048022000L});
    public static final BitSet FOLLOW_ruleInformative_in_rulePolicy286 = new BitSet(new long[]{0x8000008048022000L});
    public static final BitSet FOLLOW_rulePrivateData_in_rulePolicy308 = new BitSet(new long[]{0x0000008048022000L});
    public static final BitSet FOLLOW_ruleRecipient_in_rulePolicy330 = new BitSet(new long[]{0x0000000048022000L});
    public static final BitSet FOLLOW_ruleService_in_rulePolicy352 = new BitSet(new long[]{0x0000000008022000L});
    public static final BitSet FOLLOW_ruleEnforcement_in_rulePolicy374 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_rulePolicy387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName475 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName509 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard719 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildcard738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnforcement_in_entryRuleEnforcement780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnforcement790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEnforcement827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnforcement844 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnforcement861 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEnforcement873 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnforcement890 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnforcement907 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnforcement919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnforcement936 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnforcement953 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEnforcement965 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_22_in_ruleEnforcement985 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23_in_ruleEnforcement1014 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_24_in_ruleEnforcement1043 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_25_in_ruleEnforcement1072 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_26_in_ruleEnforcement1101 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnforcement1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService1165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleService1212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService1229 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleService1246 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleService1258 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService1275 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleService1292 = new BitSet(new long[]{0x0000000030102000L});
    public static final BitSet FOLLOW_20_in_ruleService1305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService1322 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleService1339 = new BitSet(new long[]{0x0000000030002000L});
    public static final BitSet FOLLOW_28_in_ruleService1354 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleService1375 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleService1388 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_29_in_ruleService1403 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleServicePart_in_ruleService1424 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleService1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipient_in_entryRuleRecipient1475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipient1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRecipient1522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipient1539 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRecipient1556 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRecipient1568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecipient1585 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecipient1602 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRecipient1614 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecipient1631 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecipient1648 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleRecipient1661 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRecipientPart_in_ruleRecipient1682 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRecipient1695 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRecipient1709 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_33_in_ruleRecipient1729 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_34_in_ruleRecipient1758 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_35_in_ruleRecipient1787 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecipient1815 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRecipient1827 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_36_in_ruleRecipient1847 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_37_in_ruleRecipient1876 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_38_in_ruleRecipient1905 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecipient1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrivateData_in_entryRulePrivateData1969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrivateData1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePrivateData2016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrivateData2033 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePrivateData2050 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePrivateData2062 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrivateData2079 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrivateData2096 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrivateData2108 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_40_in_rulePrivateData2128 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_41_in_rulePrivateData2157 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrivateData2185 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePrivateData2206 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_13_in_rulePrivateData2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAttribute2302 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2319 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute2336 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAttribute2348 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2365 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAttribute2382 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAttribute2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection2433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCollection2480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollection2497 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollection2514 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCollection2526 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection2543 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection2560 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleCollection2572 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection2589 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection2606 = new BitSet(new long[]{0x0003C00010000000L});
    public static final BitSet FOLLOW_46_in_ruleCollection2619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollection2639 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection2651 = new BitSet(new long[]{0x0003800010000000L});
    public static final BitSet FOLLOW_28_in_ruleCollection2666 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleCollection2687 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleCollection2700 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCollection2715 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleCollection2736 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleCollection2749 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_ruleCollection2764 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleCollection2785 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleCollection2798 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleCollection2812 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_50_in_ruleCollection2832 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_51_in_ruleCollection2861 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_52_in_ruleCollection2890 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCollection2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisclosure_in_entryRuleDisclosure2954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisclosure2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDisclosure3001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisclosure3018 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDisclosure3035 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDisclosure3047 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure3064 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3081 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleDisclosure3093 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure3110 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3127 = new BitSet(new long[]{0x03C3800010000000L});
    public static final BitSet FOLLOW_54_in_ruleDisclosure3140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisclosure3160 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3172 = new BitSet(new long[]{0x0383800010000000L});
    public static final BitSet FOLLOW_55_in_ruleDisclosure3187 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefRecipient_in_ruleDisclosure3208 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3221 = new BitSet(new long[]{0x0303800010000000L});
    public static final BitSet FOLLOW_56_in_ruleDisclosure3236 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefRecipientSource_in_ruleDisclosure3257 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3270 = new BitSet(new long[]{0x0203800010000000L});
    public static final BitSet FOLLOW_57_in_ruleDisclosure3285 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefRecipientTarget_in_ruleDisclosure3306 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3319 = new BitSet(new long[]{0x0003800010000000L});
    public static final BitSet FOLLOW_28_in_ruleDisclosure3334 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleDisclosure3355 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3368 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_47_in_ruleDisclosure3383 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleDisclosure3404 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3417 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_ruleDisclosure3432 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleDisclosure3453 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3466 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleDisclosure3480 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_50_in_ruleDisclosure3500 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_51_in_ruleDisclosure3529 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_52_in_ruleDisclosure3558 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDisclosure3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRetention_in_entryRuleRetention3622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRetention3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleRetention3669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRetention3686 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRetention3703 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRetention3715 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention3732 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention3749 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleRetention3761 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention3778 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention3795 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleRetention3808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRetention3828 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention3840 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleRetention3854 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention3871 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention3888 = new BitSet(new long[]{0x0003800010000000L});
    public static final BitSet FOLLOW_28_in_ruleRetention3901 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleRetention3922 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRetention3935 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRetention3950 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleRetention3971 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRetention3984 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_ruleRetention3999 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleRetention4020 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRetention4033 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleRetention4047 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_50_in_ruleRetention4067 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_51_in_ruleRetention4096 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_52_in_ruleRetention4125 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRetention4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage4189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleUsage4236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage4253 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUsage4270 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUsage4282 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage4299 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage4316 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleUsage4328 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage4345 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage4362 = new BitSet(new long[]{0x4003800010000000L});
    public static final BitSet FOLLOW_62_in_ruleUsage4375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage4395 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage4407 = new BitSet(new long[]{0x0003800010000000L});
    public static final BitSet FOLLOW_28_in_ruleUsage4422 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleUsage4443 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleUsage4456 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_47_in_ruleUsage4471 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleUsage4492 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleUsage4505 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_ruleUsage4520 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleUsage4541 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleUsage4554 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleUsage4568 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_50_in_ruleUsage4588 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_51_in_ruleUsage4617 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_52_in_ruleUsage4646 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUsage4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInformative_in_entryRuleInformative4710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInformative4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleInformative4757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformative4774 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInformative4791 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInformative4803 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative4820 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative4837 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleInformative4849 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative4866 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative4883 = new BitSet(new long[]{0x0003800010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleInformative4896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformative4916 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative4928 = new BitSet(new long[]{0x0003800010000000L});
    public static final BitSet FOLLOW_28_in_ruleInformative4943 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleInformative4964 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleInformative4977 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_47_in_ruleInformative4992 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleInformative5013 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleInformative5026 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_ruleInformative5041 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleInformative5062 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleInformative5075 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleInformative5089 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_50_in_ruleInformative5109 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_51_in_ruleInformative5138 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_52_in_ruleInformative5167 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInformative5195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipientPart_in_entryRuleRecipientPart5231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipientPart5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipientPart5286 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRecipientPart5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefRecipient_in_entryRuleRefRecipient5337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefRecipient5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipient5392 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRefRecipient5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefRecipientSource_in_entryRuleRefRecipientSource5443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefRecipientSource5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipientSource5498 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRefRecipientSource5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefRecipientTarget_in_entryRuleRefRecipientTarget5549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefRecipientTarget5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipientTarget5604 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRefRecipientTarget5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefService_in_entryRuleRefService5655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefService5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefService5710 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRefService5723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServicePart_in_entryRuleServicePart5761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServicePart5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServicePart5816 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleServicePart5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_entryRuleRefPrivateData5867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefPrivateData5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefPrivateData5922 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRefPrivateData5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_entryRuleRefEnforcement5973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefEnforcement5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefEnforcement6028 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRefEnforcement6041 = new BitSet(new long[]{0x0000000000000002L});

}