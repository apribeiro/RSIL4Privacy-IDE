package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'};'", "'.'", "'import'", "'.*'", "'Enforcement'", "'Name'", "','", "'Description'", "'Type'", "'Action'", "'Algorithm'", "'Config'", "'Process'", "'Tool'", "'Service'", "'RefersTo PrivateData'", "'Service_Part'", "'Recipient'", "'Recipient_Part'", "'Scope'", "'Internal'", "'External'", "'Internal/External'", "'Individual'", "'Organization'", "'Individual/Organization'", "'PrivateData'", "'PersonalInformation'", "'UsageInformation'", "'Attribute'", "'Collection'", "'Condition'", "'PartOf Collection'", "'RefersTo Service'", "'RefersTo Enforcement'", "'Modality'", "'Permitted'", "'Obligation'", "'Forbidden'", "'Disclosure'", "'PartOf Disclosure'", "'RefersTo Recipient'", "'RefersTo Recipient-Source'", "'RefersTo Recipient-Target'", "'Retention'", "'PartOf Retention'", "'Period'", "'Usage'", "'PartOf Usage'", "'Informative'", "'PartOf Informative'", "'-'"
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Policy";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePolicy"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_rulePolicy= rulePolicy EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_rulePolicy= rulePolicy EOF
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_collection_4_0= ruleCollection ) )* ( (lv_disclosure_5_0= ruleDisclosure ) )* ( (lv_retention_6_0= ruleRetention ) )* ( (lv_usage_7_0= ruleUsage ) )* ( (lv_informative_8_0= ruleInformative ) )* ( (lv_privateData_9_0= rulePrivateData ) )* ( (lv_recipient_10_0= ruleRecipient ) )* ( (lv_service_11_0= ruleService ) )* ( (lv_enforcement_12_0= ruleEnforcement ) )* otherlv_13= '};' ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_collection_4_0= ruleCollection ) )* ( (lv_disclosure_5_0= ruleDisclosure ) )* ( (lv_retention_6_0= ruleRetention ) )* ( (lv_usage_7_0= ruleUsage ) )* ( (lv_informative_8_0= ruleInformative ) )* ( (lv_privateData_9_0= rulePrivateData ) )* ( (lv_recipient_10_0= ruleRecipient ) )* ( (lv_service_11_0= ruleService ) )* ( (lv_enforcement_12_0= ruleEnforcement ) )* otherlv_13= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_collection_4_0= ruleCollection ) )* ( (lv_disclosure_5_0= ruleDisclosure ) )* ( (lv_retention_6_0= ruleRetention ) )* ( (lv_usage_7_0= ruleUsage ) )* ( (lv_informative_8_0= ruleInformative ) )* ( (lv_privateData_9_0= rulePrivateData ) )* ( (lv_recipient_10_0= ruleRecipient ) )* ( (lv_service_11_0= ruleService ) )* ( (lv_enforcement_12_0= ruleEnforcement ) )* otherlv_13= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_collection_4_0= ruleCollection ) )* ( (lv_disclosure_5_0= ruleDisclosure ) )* ( (lv_retention_6_0= ruleRetention ) )* ( (lv_usage_7_0= ruleUsage ) )* ( (lv_informative_8_0= ruleInformative ) )* ( (lv_privateData_9_0= rulePrivateData ) )* ( (lv_recipient_10_0= ruleRecipient ) )* ( (lv_service_11_0= ruleService ) )* ( (lv_enforcement_12_0= ruleEnforcement ) )* otherlv_13= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_collection_4_0= ruleCollection ) )* ( (lv_disclosure_5_0= ruleDisclosure ) )* ( (lv_retention_6_0= ruleRetention ) )* ( (lv_usage_7_0= ruleUsage ) )* ( (lv_informative_8_0= ruleInformative ) )* ( (lv_privateData_9_0= rulePrivateData ) )* ( (lv_recipient_10_0= ruleRecipient ) )* ( (lv_service_11_0= ruleService ) )* ( (lv_enforcement_12_0= ruleEnforcement ) )* otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePolicy122); 

                	newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPackageKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:3: lv_name_1_0= ruleQualifiedName
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
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:106:1: ( (lv_importelements_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:107:1: (lv_importelements_3_0= ruleImport )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:107:1: (lv_importelements_3_0= ruleImport )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:108:3: lv_importelements_3_0= ruleImport
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:3: ( (lv_collection_4_0= ruleCollection ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==43) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: (lv_collection_4_0= ruleCollection )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: (lv_collection_4_0= ruleCollection )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:3: lv_collection_4_0= ruleCollection
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:142:3: ( (lv_disclosure_5_0= ruleDisclosure ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==52) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:143:1: (lv_disclosure_5_0= ruleDisclosure )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:143:1: (lv_disclosure_5_0= ruleDisclosure )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:144:3: lv_disclosure_5_0= ruleDisclosure
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:3: ( (lv_retention_6_0= ruleRetention ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==57) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:161:1: (lv_retention_6_0= ruleRetention )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:161:1: (lv_retention_6_0= ruleRetention )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:3: lv_retention_6_0= ruleRetention
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:178:3: ( (lv_usage_7_0= ruleUsage ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==60) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:1: (lv_usage_7_0= ruleUsage )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:1: (lv_usage_7_0= ruleUsage )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:180:3: lv_usage_7_0= ruleUsage
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:196:3: ( (lv_informative_8_0= ruleInformative ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==62) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:197:1: (lv_informative_8_0= ruleInformative )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:197:1: (lv_informative_8_0= ruleInformative )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:3: lv_informative_8_0= ruleInformative
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:214:3: ( (lv_privateData_9_0= rulePrivateData ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:215:1: (lv_privateData_9_0= rulePrivateData )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:215:1: (lv_privateData_9_0= rulePrivateData )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:216:3: lv_privateData_9_0= rulePrivateData
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:232:3: ( (lv_recipient_10_0= ruleRecipient ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:233:1: (lv_recipient_10_0= ruleRecipient )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:233:1: (lv_recipient_10_0= ruleRecipient )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:3: lv_recipient_10_0= ruleRecipient
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:250:3: ( (lv_service_11_0= ruleService ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:251:1: (lv_service_11_0= ruleService )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:251:1: (lv_service_11_0= ruleService )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:252:3: lv_service_11_0= ruleService
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:268:3: ( (lv_enforcement_12_0= ruleEnforcement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:269:1: (lv_enforcement_12_0= ruleEnforcement )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:269:1: (lv_enforcement_12_0= ruleEnforcement )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:270:3: lv_enforcement_12_0= ruleEnforcement
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:298:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:299:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:300:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:307:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:310:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName475); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:318:1: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:319:2: kw= '.' this_ID_2= RULE_ID
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:339:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:340:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:341:2: iv_ruleImport= ruleImport EOF
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:348:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:352:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:352:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:352:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport603); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:356:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:357:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:357:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:358:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:382:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:383:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:384:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:391:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:394:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard719);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:406:1: (kw= '.*' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:407:2: kw= '.*'
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:420:1: entryRuleEnforcement returns [EObject current=null] : iv_ruleEnforcement= ruleEnforcement EOF ;
    public final EObject entryRuleEnforcement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnforcement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:421:2: (iv_ruleEnforcement= ruleEnforcement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:422:2: iv_ruleEnforcement= ruleEnforcement EOF
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:429:1: ruleEnforcement returns [EObject current=null] : (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_enforcementDescription_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) ) otherlv_11= '};' ) ;
    public final EObject ruleEnforcement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_enforcementName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_enforcementDescription_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_enforcementKind_10_1=null;
        Token lv_enforcementKind_10_2=null;
        Token lv_enforcementKind_10_3=null;
        Token lv_enforcementKind_10_4=null;
        Token lv_enforcementKind_10_5=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:432:28: ( (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_enforcementDescription_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) ) otherlv_11= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:1: (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_enforcementDescription_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) ) otherlv_11= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:1: (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_enforcementDescription_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) ) otherlv_11= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:3: otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_enforcementDescription_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) ) otherlv_11= '};'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEnforcement827); 

                	newLeafNode(otherlv_0, grammarAccess.getEnforcementAccess().getEnforcementKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:437:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:438:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:438:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:439:3: lv_name_1_0= RULE_ID
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
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:463:1: ( (lv_enforcementName_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:464:1: (lv_enforcementName_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:464:1: (lv_enforcementName_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:3: lv_enforcementName_4_0= RULE_STRING
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
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:489:1: ( (lv_enforcementDescription_7_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:490:1: (lv_enforcementDescription_7_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:490:1: (lv_enforcementDescription_7_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:491:3: lv_enforcementDescription_7_0= RULE_STRING
            {
            lv_enforcementDescription_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnforcement936); 

            			newLeafNode(lv_enforcementDescription_7_0, grammarAccess.getEnforcementAccess().getEnforcementDescriptionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnforcementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"enforcementDescription",
                    		lv_enforcementDescription_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleEnforcement953); 

                	newLeafNode(otherlv_8, grammarAccess.getEnforcementAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleEnforcement965); 

                	newLeafNode(otherlv_9, grammarAccess.getEnforcementAccess().getTypeKeyword_9());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:1: ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:516:1: ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:516:1: ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:517:1: (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:517:1: (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' )
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:518:3: lv_enforcementKind_10_1= 'Action'
                    {
                    lv_enforcementKind_10_1=(Token)match(input,22,FOLLOW_22_in_ruleEnforcement985); 

                            newLeafNode(lv_enforcementKind_10_1, grammarAccess.getEnforcementAccess().getEnforcementKindActionKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "enforcementKind", lv_enforcementKind_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:530:8: lv_enforcementKind_10_2= 'Algorithm'
                    {
                    lv_enforcementKind_10_2=(Token)match(input,23,FOLLOW_23_in_ruleEnforcement1014); 

                            newLeafNode(lv_enforcementKind_10_2, grammarAccess.getEnforcementAccess().getEnforcementKindAlgorithmKeyword_10_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "enforcementKind", lv_enforcementKind_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:542:8: lv_enforcementKind_10_3= 'Config'
                    {
                    lv_enforcementKind_10_3=(Token)match(input,24,FOLLOW_24_in_ruleEnforcement1043); 

                            newLeafNode(lv_enforcementKind_10_3, grammarAccess.getEnforcementAccess().getEnforcementKindConfigKeyword_10_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "enforcementKind", lv_enforcementKind_10_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:554:8: lv_enforcementKind_10_4= 'Process'
                    {
                    lv_enforcementKind_10_4=(Token)match(input,25,FOLLOW_25_in_ruleEnforcement1072); 

                            newLeafNode(lv_enforcementKind_10_4, grammarAccess.getEnforcementAccess().getEnforcementKindProcessKeyword_10_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "enforcementKind", lv_enforcementKind_10_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:8: lv_enforcementKind_10_5= 'Tool'
                    {
                    lv_enforcementKind_10_5=(Token)match(input,26,FOLLOW_26_in_ruleEnforcement1101); 

                            newLeafNode(lv_enforcementKind_10_5, grammarAccess.getEnforcementAccess().getEnforcementKindToolKeyword_10_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "enforcementKind", lv_enforcementKind_10_5, null);
                    	    

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:593:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:2: (iv_ruleService= ruleService EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:595:2: iv_ruleService= ruleService EOF
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicepartof_13_0= ruleServicePartof ) )* )? otherlv_14= '};' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_servicename_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_refprivatedata_10_0 = null;

        EObject lv_servicepartof_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicepartof_13_0= ruleServicePartof ) )* )? otherlv_14= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:606:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicepartof_13_0= ruleServicePartof ) )* )? otherlv_14= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:606:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicepartof_13_0= ruleServicePartof ) )* )? otherlv_14= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:606:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicepartof_13_0= ruleServicePartof ) )* )? otherlv_14= '};'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleService1212); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:610:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:611:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:611:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:612:3: lv_name_1_0= RULE_ID
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
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:636:1: ( (lv_servicename_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:637:1: (lv_servicename_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:637:1: (lv_servicename_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:638:3: lv_servicename_4_0= RULE_STRING
            {
            lv_servicename_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService1275); 

            			newLeafNode(lv_servicename_4_0, grammarAccess.getServiceAccess().getServicenameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"servicename",
                    		lv_servicename_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleService1292); 

                	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getCommaKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:658:1: (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:658:3: otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ','
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleService1305); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getDescriptionKeyword_6_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:662:1: ( (lv_description_7_0= RULE_STRING ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:663:1: (lv_description_7_0= RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:663:1: (lv_description_7_0= RULE_STRING )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:664:3: lv_description_7_0= RULE_STRING
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:684:3: (otherlv_9= 'RefersTo PrivateData' ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:684:5: otherlv_9= 'RefersTo PrivateData' ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )* otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleService1354); 

                        	newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRefersToPrivateDataKeyword_7_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:688:1: ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:689:1: (lv_refprivatedata_10_0= ruleRefPrivateData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:689:1: (lv_refprivatedata_10_0= ruleRefPrivateData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:3: lv_refprivatedata_10_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceAccess().getRefprivatedataRefPrivateDataParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleService1375);
                    	    lv_refprivatedata_10_0=ruleRefPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refprivatedata",
                    	            		lv_refprivatedata_10_0, 
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:710:3: (otherlv_12= 'Service_Part' ( (lv_servicepartof_13_0= ruleServicePartof ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:710:5: otherlv_12= 'Service_Part' ( (lv_servicepartof_13_0= ruleServicePartof ) )*
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleService1403); 

                        	newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getService_PartKeyword_8_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:1: ( (lv_servicepartof_13_0= ruleServicePartof ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:715:1: (lv_servicepartof_13_0= ruleServicePartof )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:715:1: (lv_servicepartof_13_0= ruleServicePartof )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:716:3: lv_servicepartof_13_0= ruleServicePartof
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceAccess().getServicepartofServicePartofParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleServicePartof_in_ruleService1424);
                    	    lv_servicepartof_13_0=ruleServicePartof();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"servicepartof",
                    	            		lv_servicepartof_13_0, 
                    	            		"ServicePartof");
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:744:1: entryRuleRecipient returns [EObject current=null] : iv_ruleRecipient= ruleRecipient EOF ;
    public final EObject entryRuleRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipient = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:745:2: (iv_ruleRecipient= ruleRecipient EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:746:2: iv_ruleRecipient= ruleRecipient EOF
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:753:1: ruleRecipient returns [EObject current=null] : (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' ) ;
    public final EObject ruleRecipient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_recipientname_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_RecipientScopeKind_13_1=null;
        Token lv_RecipientScopeKind_13_2=null;
        Token lv_RecipientScopeKind_13_3=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_RecipientTypeKind_16_1=null;
        Token lv_RecipientTypeKind_16_2=null;
        Token lv_RecipientTypeKind_16_3=null;
        Token otherlv_17=null;
        EObject lv_partof_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:756:28: ( (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:757:1: (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:757:1: (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:757:3: otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleRecipient1522); 

                	newLeafNode(otherlv_0, grammarAccess.getRecipientAccess().getRecipientKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:761:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:762:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:762:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:763:3: lv_name_1_0= RULE_ID
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
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:787:1: ( (lv_recipientname_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:788:1: (lv_recipientname_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:788:1: (lv_recipientname_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:789:3: lv_recipientname_4_0= RULE_STRING
            {
            lv_recipientname_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecipient1585); 

            			newLeafNode(lv_recipientname_4_0, grammarAccess.getRecipientAccess().getRecipientnameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecipientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"recipientname",
                    		lv_recipientname_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRecipient1602); 

                	newLeafNode(otherlv_5, grammarAccess.getRecipientAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleRecipient1614); 

                	newLeafNode(otherlv_6, grammarAccess.getRecipientAccess().getDescriptionKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:813:1: ( (lv_description_7_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:814:1: (lv_description_7_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:814:1: (lv_description_7_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:815:3: lv_description_7_0= RULE_STRING
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
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:1: (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:3: otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleRecipient1661); 

                        	newLeafNode(otherlv_9, grammarAccess.getRecipientAccess().getRecipient_PartKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:839:1: ( (lv_partof_10_0= rulePartof ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:840:1: (lv_partof_10_0= rulePartof )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:840:1: (lv_partof_10_0= rulePartof )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:841:3: lv_partof_10_0= rulePartof
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRecipientAccess().getPartofPartofParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePartof_in_ruleRecipient1682);
                    	    lv_partof_10_0=rulePartof();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRecipientRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"partof",
                    	            		lv_partof_10_0, 
                    	            		"Partof");
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
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:865:1: ( ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:866:1: ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:866:1: ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:867:1: (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:867:1: (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' )
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:868:3: lv_RecipientScopeKind_13_1= 'Internal'
                    {
                    lv_RecipientScopeKind_13_1=(Token)match(input,33,FOLLOW_33_in_ruleRecipient1729); 

                            newLeafNode(lv_RecipientScopeKind_13_1, grammarAccess.getRecipientAccess().getRecipientScopeKindInternalKeyword_11_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "RecipientScopeKind", lv_RecipientScopeKind_13_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:880:8: lv_RecipientScopeKind_13_2= 'External'
                    {
                    lv_RecipientScopeKind_13_2=(Token)match(input,34,FOLLOW_34_in_ruleRecipient1758); 

                            newLeafNode(lv_RecipientScopeKind_13_2, grammarAccess.getRecipientAccess().getRecipientScopeKindExternalKeyword_11_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "RecipientScopeKind", lv_RecipientScopeKind_13_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:892:8: lv_RecipientScopeKind_13_3= 'Internal/External'
                    {
                    lv_RecipientScopeKind_13_3=(Token)match(input,35,FOLLOW_35_in_ruleRecipient1787); 

                            newLeafNode(lv_RecipientScopeKind_13_3, grammarAccess.getRecipientAccess().getRecipientScopeKindInternalExternalKeyword_11_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "RecipientScopeKind", lv_RecipientScopeKind_13_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleRecipient1815); 

                	newLeafNode(otherlv_14, grammarAccess.getRecipientAccess().getCommaKeyword_12());
                
            otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleRecipient1827); 

                	newLeafNode(otherlv_15, grammarAccess.getRecipientAccess().getTypeKeyword_13());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:915:1: ( ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:1: ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:1: ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:1: (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:1: (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' )
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:918:3: lv_RecipientTypeKind_16_1= 'Individual'
                    {
                    lv_RecipientTypeKind_16_1=(Token)match(input,36,FOLLOW_36_in_ruleRecipient1847); 

                            newLeafNode(lv_RecipientTypeKind_16_1, grammarAccess.getRecipientAccess().getRecipientTypeKindIndividualKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "RecipientTypeKind", lv_RecipientTypeKind_16_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:930:8: lv_RecipientTypeKind_16_2= 'Organization'
                    {
                    lv_RecipientTypeKind_16_2=(Token)match(input,37,FOLLOW_37_in_ruleRecipient1876); 

                            newLeafNode(lv_RecipientTypeKind_16_2, grammarAccess.getRecipientAccess().getRecipientTypeKindOrganizationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "RecipientTypeKind", lv_RecipientTypeKind_16_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:942:8: lv_RecipientTypeKind_16_3= 'Individual/Organization'
                    {
                    lv_RecipientTypeKind_16_3=(Token)match(input,38,FOLLOW_38_in_ruleRecipient1905); 

                            newLeafNode(lv_RecipientTypeKind_16_3, grammarAccess.getRecipientAccess().getRecipientTypeKindIndividualOrganizationKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "RecipientTypeKind", lv_RecipientTypeKind_16_3, null);
                    	    

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:969:1: entryRulePrivateData returns [EObject current=null] : iv_rulePrivateData= rulePrivateData EOF ;
    public final EObject entryRulePrivateData() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateData = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:970:2: (iv_rulePrivateData= rulePrivateData EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:971:2: iv_rulePrivateData= rulePrivateData EOF
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:978:1: rulePrivateData returns [EObject current=null] : (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_privatedata_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' ) ;
    public final EObject rulePrivateData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_privatedata_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_PrivateDataKind_7_1=null;
        Token lv_PrivateDataKind_7_2=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_attribute_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:981:28: ( (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_privatedata_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:982:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_privatedata_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:982:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_privatedata_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:982:3: otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_privatedata_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_rulePrivateData2016); 

                	newLeafNode(otherlv_0, grammarAccess.getPrivateDataAccess().getPrivateDataKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:986:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:987:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:987:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:3: lv_name_1_0= RULE_ID
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
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1012:1: ( (lv_privatedata_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1013:1: (lv_privatedata_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1013:1: (lv_privatedata_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1014:3: lv_privatedata_4_0= RULE_STRING
            {
            lv_privatedata_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrivateData2079); 

            			newLeafNode(lv_privatedata_4_0, grammarAccess.getPrivateDataAccess().getPrivatedataSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrivateDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"privatedata",
                    		lv_privatedata_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_rulePrivateData2096); 

                	newLeafNode(otherlv_5, grammarAccess.getPrivateDataAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,21,FOLLOW_21_in_rulePrivateData2108); 

                	newLeafNode(otherlv_6, grammarAccess.getPrivateDataAccess().getTypeKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1038:1: ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1039:1: ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1039:1: ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1040:1: (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1040:1: (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' )
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:3: lv_PrivateDataKind_7_1= 'PersonalInformation'
                    {
                    lv_PrivateDataKind_7_1=(Token)match(input,40,FOLLOW_40_in_rulePrivateData2128); 

                            newLeafNode(lv_PrivateDataKind_7_1, grammarAccess.getPrivateDataAccess().getPrivateDataKindPersonalInformationKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrivateDataRule());
                    	        }
                           		setWithLastConsumed(current, "PrivateDataKind", lv_PrivateDataKind_7_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:8: lv_PrivateDataKind_7_2= 'UsageInformation'
                    {
                    lv_PrivateDataKind_7_2=(Token)match(input,41,FOLLOW_41_in_rulePrivateData2157); 

                            newLeafNode(lv_PrivateDataKind_7_2, grammarAccess.getPrivateDataAccess().getPrivateDataKindUsageInformationKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrivateDataRule());
                    	        }
                           		setWithLastConsumed(current, "PrivateDataKind", lv_PrivateDataKind_7_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_rulePrivateData2185); 

                	newLeafNode(otherlv_8, grammarAccess.getPrivateDataAccess().getCommaKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:1: ( (lv_attribute_9_0= ruleAttribute ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==42) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:1: (lv_attribute_9_0= ruleAttribute )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:1: (lv_attribute_9_0= ruleAttribute )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1074:3: lv_attribute_9_0= ruleAttribute
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1102:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1103:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1104:2: iv_ruleAttribute= ruleAttribute EOF
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1111:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_attributeName_3_0= RULE_STRING ) ) (otherlv_4= ',' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_attributeName_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1114:28: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_attributeName_3_0= RULE_STRING ) ) (otherlv_4= ',' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_attributeName_3_0= RULE_STRING ) ) (otherlv_4= ',' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_attributeName_3_0= RULE_STRING ) ) (otherlv_4= ',' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:3: otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_attributeName_3_0= RULE_STRING ) ) (otherlv_4= ',' )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleAttribute2302); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1119:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:3: lv_name_1_0= RULE_STRING
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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAttribute2336); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getDescriptionKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1141:1: ( (lv_attributeName_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1142:1: (lv_attributeName_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1142:1: (lv_attributeName_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1143:3: lv_attributeName_3_0= RULE_STRING
            {
            lv_attributeName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2353); 

            			newLeafNode(lv_attributeName_3_0, grammarAccess.getAttributeAccess().getAttributeNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attributeName",
                    		lv_attributeName_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1159:2: (otherlv_4= ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1159:4: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleAttribute2371); 

                        	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getCommaKeyword_4());
                        

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1171:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1172:2: (iv_ruleCollection= ruleCollection EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1173:2: iv_ruleCollection= ruleCollection EOF
            {
             newCompositeNode(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection2409);
            iv_ruleCollection=ruleCollection();

            state._fsp--;

             current =iv_ruleCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection2419); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1180:1: ruleCollection returns [EObject current=null] : (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) ;
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
        Token lv_modalitykind_22_1=null;
        Token lv_modalitykind_22_2=null;
        Token lv_modalitykind_22_3=null;
        Token otherlv_23=null;
        EObject lv_refprivatedata_13_0 = null;

        EObject lv_refertoservice_16_0 = null;

        EObject lv_refertoEnforcement_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1183:28: ( (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1184:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1184:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1184:3: otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleCollection2456); 

                	newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getCollectionKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1189:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1189:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1190:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollection2473); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCollection2490); 

                	newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCollection2502); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1215:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1215:1: (lv_description_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1216:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection2519); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleCollection2536); 

                	newLeafNode(otherlv_5, grammarAccess.getCollectionAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleCollection2548); 

                	newLeafNode(otherlv_6, grammarAccess.getCollectionAccess().getConditionKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1240:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1241:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1241:1: (lv_condition_7_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1242:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection2565); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleCollection2582); 

                	newLeafNode(otherlv_8, grammarAccess.getCollectionAccess().getCommaKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1262:1: (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1262:3: otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,45,FOLLOW_45_in_ruleCollection2595); 

                        	newLeafNode(otherlv_9, grammarAccess.getCollectionAccess().getPartOfCollectionKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1266:1: ( (otherlv_10= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1267:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1267:1: (otherlv_10= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1268:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollection2615); 

                    		newLeafNode(otherlv_10, grammarAccess.getCollectionAccess().getPartofCollectionCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleCollection2627); 

                        	newLeafNode(otherlv_11, grammarAccess.getCollectionAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1283:3: (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1283:5: otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleCollection2642); 

                        	newLeafNode(otherlv_12, grammarAccess.getCollectionAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1287:1: ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1288:1: (lv_refprivatedata_13_0= ruleRefPrivateData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1288:1: (lv_refprivatedata_13_0= ruleRefPrivateData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1289:3: lv_refprivatedata_13_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefprivatedataRefPrivateDataParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleCollection2663);
                    	    lv_refprivatedata_13_0=ruleRefPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refprivatedata",
                    	            		lv_refprivatedata_13_0, 
                    	            		"RefPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleCollection2676); 

                        	newLeafNode(otherlv_14, grammarAccess.getCollectionAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1309:3: (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1309:5: otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,46,FOLLOW_46_in_ruleCollection2691); 

                        	newLeafNode(otherlv_15, grammarAccess.getCollectionAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1313:1: ( (lv_refertoservice_16_0= ruleReferToService ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:1: (lv_refertoservice_16_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:1: (lv_refertoservice_16_0= ruleReferToService )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1315:3: lv_refertoservice_16_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefertoserviceReferToServiceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleCollection2712);
                    	    lv_refertoservice_16_0=ruleReferToService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoservice",
                    	            		lv_refertoservice_16_0, 
                    	            		"ReferToService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleCollection2725); 

                        	newLeafNode(otherlv_17, grammarAccess.getCollectionAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1335:3: (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1335:5: otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,47,FOLLOW_47_in_ruleCollection2740); 

                        	newLeafNode(otherlv_18, grammarAccess.getCollectionAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1339:1: ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1340:1: (lv_refertoEnforcement_19_0= ruleRefertoEnforcement )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1340:1: (lv_refertoEnforcement_19_0= ruleRefertoEnforcement )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1341:3: lv_refertoEnforcement_19_0= ruleRefertoEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefertoEnforcementRefertoEnforcementParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefertoEnforcement_in_ruleCollection2761);
                    	    lv_refertoEnforcement_19_0=ruleRefertoEnforcement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoEnforcement",
                    	            		lv_refertoEnforcement_19_0, 
                    	            		"RefertoEnforcement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleCollection2774); 

                        	newLeafNode(otherlv_20, grammarAccess.getCollectionAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,48,FOLLOW_48_in_ruleCollection2788); 

                	newLeafNode(otherlv_21, grammarAccess.getCollectionAccess().getModalityKeyword_13());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1365:1: ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1366:1: ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1366:1: ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1367:1: (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1367:1: (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt33=1;
                }
                break;
            case 50:
                {
                alt33=2;
                }
                break;
            case 51:
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1368:3: lv_modalitykind_22_1= 'Permitted'
                    {
                    lv_modalitykind_22_1=(Token)match(input,49,FOLLOW_49_in_ruleCollection2808); 

                            newLeafNode(lv_modalitykind_22_1, grammarAccess.getCollectionAccess().getModalitykindPermittedKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1380:8: lv_modalitykind_22_2= 'Obligation'
                    {
                    lv_modalitykind_22_2=(Token)match(input,50,FOLLOW_50_in_ruleCollection2837); 

                            newLeafNode(lv_modalitykind_22_2, grammarAccess.getCollectionAccess().getModalitykindObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1392:8: lv_modalitykind_22_3= 'Forbidden'
                    {
                    lv_modalitykind_22_3=(Token)match(input,51,FOLLOW_51_in_ruleCollection2866); 

                            newLeafNode(lv_modalitykind_22_3, grammarAccess.getCollectionAccess().getModalitykindForbiddenKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_23=(Token)match(input,13,FOLLOW_13_in_ruleCollection2894); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1419:1: entryRuleDisclosure returns [EObject current=null] : iv_ruleDisclosure= ruleDisclosure EOF ;
    public final EObject entryRuleDisclosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisclosure = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1420:2: (iv_ruleDisclosure= ruleDisclosure EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1421:2: iv_ruleDisclosure= ruleDisclosure EOF
            {
             newCompositeNode(grammarAccess.getDisclosureRule()); 
            pushFollow(FOLLOW_ruleDisclosure_in_entryRuleDisclosure2930);
            iv_ruleDisclosure=ruleDisclosure();

            state._fsp--;

             current =iv_ruleDisclosure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisclosure2940); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1428:1: ruleDisclosure returns [EObject current=null] : (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refertoservice_25_0= ruleReferToService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modalitykind_31_1= 'Permitted' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Forbidden' ) ) ) otherlv_32= '};' ) ;
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
        Token lv_modalitykind_31_1=null;
        Token lv_modalitykind_31_2=null;
        Token lv_modalitykind_31_3=null;
        Token otherlv_32=null;
        EObject lv_referToRecipient_13_0 = null;

        EObject lv_referToRecipientsource_16_0 = null;

        EObject lv_referToRecipienttarget_19_0 = null;

        EObject lv_refprivatedata_22_0 = null;

        EObject lv_refertoservice_25_0 = null;

        EObject lv_refertoEnforcement_28_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1431:28: ( (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refertoservice_25_0= ruleReferToService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modalitykind_31_1= 'Permitted' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Forbidden' ) ) ) otherlv_32= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1432:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refertoservice_25_0= ruleReferToService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modalitykind_31_1= 'Permitted' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Forbidden' ) ) ) otherlv_32= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1432:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refertoservice_25_0= ruleReferToService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modalitykind_31_1= 'Permitted' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Forbidden' ) ) ) otherlv_32= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1432:3: otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refertoservice_25_0= ruleReferToService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modalitykind_31_1= 'Permitted' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Forbidden' ) ) ) otherlv_32= '};'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleDisclosure2977); 

                	newLeafNode(otherlv_0, grammarAccess.getDisclosureAccess().getDisclosureKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1436:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1437:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1437:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1438:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisclosure2994); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDisclosure3011); 

                	newLeafNode(otherlv_2, grammarAccess.getDisclosureAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleDisclosure3023); 

                	newLeafNode(otherlv_3, grammarAccess.getDisclosureAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1462:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1463:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1463:1: (lv_description_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1464:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure3040); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3057); 

                	newLeafNode(otherlv_5, grammarAccess.getDisclosureAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleDisclosure3069); 

                	newLeafNode(otherlv_6, grammarAccess.getDisclosureAccess().getConditionKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1488:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1489:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1489:1: (lv_condition_7_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1490:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure3086); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3103); 

                	newLeafNode(otherlv_8, grammarAccess.getDisclosureAccess().getCommaKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1510:1: (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==53) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1510:3: otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,53,FOLLOW_53_in_ruleDisclosure3116); 

                        	newLeafNode(otherlv_9, grammarAccess.getDisclosureAccess().getPartOfDisclosureKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1514:1: ( (otherlv_10= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1515:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1515:1: (otherlv_10= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1516:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisclosure3136); 

                    		newLeafNode(otherlv_10, grammarAccess.getDisclosureAccess().getPartofDisclosureCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3148); 

                        	newLeafNode(otherlv_11, grammarAccess.getDisclosureAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1531:3: (otherlv_12= 'RefersTo Recipient' ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )* otherlv_14= ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==54) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1531:5: otherlv_12= 'RefersTo Recipient' ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,54,FOLLOW_54_in_ruleDisclosure3163); 

                        	newLeafNode(otherlv_12, grammarAccess.getDisclosureAccess().getRefersToRecipientKeyword_10_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1535:1: ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_ID) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1536:1: (lv_referToRecipient_13_0= ruleReferToRecipient )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1536:1: (lv_referToRecipient_13_0= ruleReferToRecipient )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1537:3: lv_referToRecipient_13_0= ruleReferToRecipient
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getReferToRecipientReferToRecipientParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToRecipient_in_ruleDisclosure3184);
                    	    lv_referToRecipient_13_0=ruleReferToRecipient();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"referToRecipient",
                    	            		lv_referToRecipient_13_0, 
                    	            		"ReferToRecipient");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3197); 

                        	newLeafNode(otherlv_14, grammarAccess.getDisclosureAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1557:3: (otherlv_15= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )* otherlv_17= ',' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==55) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1557:5: otherlv_15= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,55,FOLLOW_55_in_ruleDisclosure3212); 

                        	newLeafNode(otherlv_15, grammarAccess.getDisclosureAccess().getRefersToRecipientSourceKeyword_11_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1561:1: ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ID) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1562:1: (lv_referToRecipientsource_16_0= ruleReferToRecipientSource )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1562:1: (lv_referToRecipientsource_16_0= ruleReferToRecipientSource )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1563:3: lv_referToRecipientsource_16_0= ruleReferToRecipientSource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getReferToRecipientsourceReferToRecipientSourceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToRecipientSource_in_ruleDisclosure3233);
                    	    lv_referToRecipientsource_16_0=ruleReferToRecipientSource();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"referToRecipientsource",
                    	            		lv_referToRecipientsource_16_0, 
                    	            		"ReferToRecipientSource");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3246); 

                        	newLeafNode(otherlv_17, grammarAccess.getDisclosureAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1583:3: (otherlv_18= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )* otherlv_20= ',' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==56) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1583:5: otherlv_18= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,56,FOLLOW_56_in_ruleDisclosure3261); 

                        	newLeafNode(otherlv_18, grammarAccess.getDisclosureAccess().getRefersToRecipientTargetKeyword_12_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1587:1: ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1588:1: (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1588:1: (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1589:3: lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getReferToRecipienttargetReferToRecipientTargetParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToRecipientTarget_in_ruleDisclosure3282);
                    	    lv_referToRecipienttarget_19_0=ruleReferToRecipientTarget();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"referToRecipienttarget",
                    	            		lv_referToRecipienttarget_19_0, 
                    	            		"ReferToRecipientTarget");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3295); 

                        	newLeafNode(otherlv_20, grammarAccess.getDisclosureAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1609:3: (otherlv_21= 'RefersTo PrivateData' ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==28) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1609:5: otherlv_21= 'RefersTo PrivateData' ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )* otherlv_23= ','
                    {
                    otherlv_21=(Token)match(input,28,FOLLOW_28_in_ruleDisclosure3310); 

                        	newLeafNode(otherlv_21, grammarAccess.getDisclosureAccess().getRefersToPrivateDataKeyword_13_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:1: ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_ID) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1614:1: (lv_refprivatedata_22_0= ruleRefPrivateData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1614:1: (lv_refprivatedata_22_0= ruleRefPrivateData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1615:3: lv_refprivatedata_22_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefprivatedataRefPrivateDataParserRuleCall_13_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleDisclosure3331);
                    	    lv_refprivatedata_22_0=ruleRefPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refprivatedata",
                    	            		lv_refprivatedata_22_0, 
                    	            		"RefPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3344); 

                        	newLeafNode(otherlv_23, grammarAccess.getDisclosureAccess().getCommaKeyword_13_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1635:3: (otherlv_24= 'RefersTo Service' ( (lv_refertoservice_25_0= ruleReferToService ) )* otherlv_26= ',' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1635:5: otherlv_24= 'RefersTo Service' ( (lv_refertoservice_25_0= ruleReferToService ) )* otherlv_26= ','
                    {
                    otherlv_24=(Token)match(input,46,FOLLOW_46_in_ruleDisclosure3359); 

                        	newLeafNode(otherlv_24, grammarAccess.getDisclosureAccess().getRefersToServiceKeyword_14_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1639:1: ( (lv_refertoservice_25_0= ruleReferToService ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_ID) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1640:1: (lv_refertoservice_25_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1640:1: (lv_refertoservice_25_0= ruleReferToService )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1641:3: lv_refertoservice_25_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefertoserviceReferToServiceParserRuleCall_14_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleDisclosure3380);
                    	    lv_refertoservice_25_0=ruleReferToService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoservice",
                    	            		lv_refertoservice_25_0, 
                    	            		"ReferToService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3393); 

                        	newLeafNode(otherlv_26, grammarAccess.getDisclosureAccess().getCommaKeyword_14_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1661:3: (otherlv_27= 'RefersTo Enforcement' ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )* otherlv_29= ',' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==47) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1661:5: otherlv_27= 'RefersTo Enforcement' ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )* otherlv_29= ','
                    {
                    otherlv_27=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure3408); 

                        	newLeafNode(otherlv_27, grammarAccess.getDisclosureAccess().getRefersToEnforcementKeyword_15_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1665:1: ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_ID) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1666:1: (lv_refertoEnforcement_28_0= ruleRefertoEnforcement )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1666:1: (lv_refertoEnforcement_28_0= ruleRefertoEnforcement )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1667:3: lv_refertoEnforcement_28_0= ruleRefertoEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefertoEnforcementRefertoEnforcementParserRuleCall_15_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefertoEnforcement_in_ruleDisclosure3429);
                    	    lv_refertoEnforcement_28_0=ruleRefertoEnforcement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoEnforcement",
                    	            		lv_refertoEnforcement_28_0, 
                    	            		"RefertoEnforcement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3442); 

                        	newLeafNode(otherlv_29, grammarAccess.getDisclosureAccess().getCommaKeyword_15_2());
                        

                    }
                    break;

            }

            otherlv_30=(Token)match(input,48,FOLLOW_48_in_ruleDisclosure3456); 

                	newLeafNode(otherlv_30, grammarAccess.getDisclosureAccess().getModalityKeyword_16());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1691:1: ( ( (lv_modalitykind_31_1= 'Permitted' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Forbidden' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1692:1: ( (lv_modalitykind_31_1= 'Permitted' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Forbidden' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1692:1: ( (lv_modalitykind_31_1= 'Permitted' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Forbidden' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1693:1: (lv_modalitykind_31_1= 'Permitted' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Forbidden' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1693:1: (lv_modalitykind_31_1= 'Permitted' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Forbidden' )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt47=1;
                }
                break;
            case 50:
                {
                alt47=2;
                }
                break;
            case 51:
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1694:3: lv_modalitykind_31_1= 'Permitted'
                    {
                    lv_modalitykind_31_1=(Token)match(input,49,FOLLOW_49_in_ruleDisclosure3476); 

                            newLeafNode(lv_modalitykind_31_1, grammarAccess.getDisclosureAccess().getModalitykindPermittedKeyword_17_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_31_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1706:8: lv_modalitykind_31_2= 'Obligation'
                    {
                    lv_modalitykind_31_2=(Token)match(input,50,FOLLOW_50_in_ruleDisclosure3505); 

                            newLeafNode(lv_modalitykind_31_2, grammarAccess.getDisclosureAccess().getModalitykindObligationKeyword_17_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_31_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1718:8: lv_modalitykind_31_3= 'Forbidden'
                    {
                    lv_modalitykind_31_3=(Token)match(input,51,FOLLOW_51_in_ruleDisclosure3534); 

                            newLeafNode(lv_modalitykind_31_3, grammarAccess.getDisclosureAccess().getModalitykindForbiddenKeyword_17_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_31_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_32=(Token)match(input,13,FOLLOW_13_in_ruleDisclosure3562); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1745:1: entryRuleRetention returns [EObject current=null] : iv_ruleRetention= ruleRetention EOF ;
    public final EObject entryRuleRetention() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetention = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1746:2: (iv_ruleRetention= ruleRetention EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1747:2: iv_ruleRetention= ruleRetention EOF
            {
             newCompositeNode(grammarAccess.getRetentionRule()); 
            pushFollow(FOLLOW_ruleRetention_in_entryRuleRetention3598);
            iv_ruleRetention=ruleRetention();

            state._fsp--;

             current =iv_ruleRetention; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRetention3608); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1754:1: ruleRetention returns [EObject current=null] : (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refertoservice_19_0= ruleReferToService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modalitykind_25_1= 'Permitted' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Forbidden' ) ) ) otherlv_26= '};' ) ;
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
        Token lv_modalitykind_25_1=null;
        Token lv_modalitykind_25_2=null;
        Token lv_modalitykind_25_3=null;
        Token otherlv_26=null;
        EObject lv_refprivatedata_16_0 = null;

        EObject lv_refertoservice_19_0 = null;

        EObject lv_refertoEnforcement_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1757:28: ( (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refertoservice_19_0= ruleReferToService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modalitykind_25_1= 'Permitted' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Forbidden' ) ) ) otherlv_26= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1758:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refertoservice_19_0= ruleReferToService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modalitykind_25_1= 'Permitted' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Forbidden' ) ) ) otherlv_26= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1758:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refertoservice_19_0= ruleReferToService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modalitykind_25_1= 'Permitted' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Forbidden' ) ) ) otherlv_26= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1758:3: otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refertoservice_19_0= ruleReferToService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modalitykind_25_1= 'Permitted' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Forbidden' ) ) ) otherlv_26= '};'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleRetention3645); 

                	newLeafNode(otherlv_0, grammarAccess.getRetentionAccess().getRetentionKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1762:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1763:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1763:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1764:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRetention3662); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRetention3679); 

                	newLeafNode(otherlv_2, grammarAccess.getRetentionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleRetention3691); 

                	newLeafNode(otherlv_3, grammarAccess.getRetentionAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1788:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1789:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1789:1: (lv_description_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1790:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention3708); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRetention3725); 

                	newLeafNode(otherlv_5, grammarAccess.getRetentionAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleRetention3737); 

                	newLeafNode(otherlv_6, grammarAccess.getRetentionAccess().getConditionKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1814:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1815:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1815:1: (lv_condition_7_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1816:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention3754); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleRetention3771); 

                	newLeafNode(otherlv_8, grammarAccess.getRetentionAccess().getCommaKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1836:1: (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==58) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1836:3: otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,58,FOLLOW_58_in_ruleRetention3784); 

                        	newLeafNode(otherlv_9, grammarAccess.getRetentionAccess().getPartOfRetentionKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1840:1: ( (otherlv_10= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1841:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1841:1: (otherlv_10= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1842:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRetention3804); 

                    		newLeafNode(otherlv_10, grammarAccess.getRetentionAccess().getPartofRetentionCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleRetention3816); 

                        	newLeafNode(otherlv_11, grammarAccess.getRetentionAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,59,FOLLOW_59_in_ruleRetention3830); 

                	newLeafNode(otherlv_12, grammarAccess.getRetentionAccess().getPeriodKeyword_10());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1861:1: ( (lv_period_13_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1862:1: (lv_period_13_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1862:1: (lv_period_13_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1863:3: lv_period_13_0= RULE_STRING
            {
            lv_period_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention3847); 

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

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleRetention3864); 

                	newLeafNode(otherlv_14, grammarAccess.getRetentionAccess().getCommaKeyword_12());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:1: (otherlv_15= 'RefersTo PrivateData' ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==28) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:3: otherlv_15= 'RefersTo PrivateData' ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_28_in_ruleRetention3877); 

                        	newLeafNode(otherlv_15, grammarAccess.getRetentionAccess().getRefersToPrivateDataKeyword_13_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1887:1: ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==RULE_ID) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1888:1: (lv_refprivatedata_16_0= ruleRefPrivateData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1888:1: (lv_refprivatedata_16_0= ruleRefPrivateData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1889:3: lv_refprivatedata_16_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefprivatedataRefPrivateDataParserRuleCall_13_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleRetention3898);
                    	    lv_refprivatedata_16_0=ruleRefPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refprivatedata",
                    	            		lv_refprivatedata_16_0, 
                    	            		"RefPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleRetention3911); 

                        	newLeafNode(otherlv_17, grammarAccess.getRetentionAccess().getCommaKeyword_13_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1909:3: (otherlv_18= 'RefersTo Service' ( (lv_refertoservice_19_0= ruleReferToService ) )* otherlv_20= ',' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==46) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1909:5: otherlv_18= 'RefersTo Service' ( (lv_refertoservice_19_0= ruleReferToService ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,46,FOLLOW_46_in_ruleRetention3926); 

                        	newLeafNode(otherlv_18, grammarAccess.getRetentionAccess().getRefersToServiceKeyword_14_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1913:1: ( (lv_refertoservice_19_0= ruleReferToService ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==RULE_ID) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1914:1: (lv_refertoservice_19_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1914:1: (lv_refertoservice_19_0= ruleReferToService )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1915:3: lv_refertoservice_19_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefertoserviceReferToServiceParserRuleCall_14_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleRetention3947);
                    	    lv_refertoservice_19_0=ruleReferToService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoservice",
                    	            		lv_refertoservice_19_0, 
                    	            		"ReferToService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleRetention3960); 

                        	newLeafNode(otherlv_20, grammarAccess.getRetentionAccess().getCommaKeyword_14_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1935:3: (otherlv_21= 'RefersTo Enforcement' ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )* otherlv_23= ',' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==47) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1935:5: otherlv_21= 'RefersTo Enforcement' ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )* otherlv_23= ','
                    {
                    otherlv_21=(Token)match(input,47,FOLLOW_47_in_ruleRetention3975); 

                        	newLeafNode(otherlv_21, grammarAccess.getRetentionAccess().getRefersToEnforcementKeyword_15_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1939:1: ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==RULE_ID) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1940:1: (lv_refertoEnforcement_22_0= ruleRefertoEnforcement )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1940:1: (lv_refertoEnforcement_22_0= ruleRefertoEnforcement )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1941:3: lv_refertoEnforcement_22_0= ruleRefertoEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefertoEnforcementRefertoEnforcementParserRuleCall_15_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefertoEnforcement_in_ruleRetention3996);
                    	    lv_refertoEnforcement_22_0=ruleRefertoEnforcement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoEnforcement",
                    	            		lv_refertoEnforcement_22_0, 
                    	            		"RefertoEnforcement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleRetention4009); 

                        	newLeafNode(otherlv_23, grammarAccess.getRetentionAccess().getCommaKeyword_15_2());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,48,FOLLOW_48_in_ruleRetention4023); 

                	newLeafNode(otherlv_24, grammarAccess.getRetentionAccess().getModalityKeyword_16());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1965:1: ( ( (lv_modalitykind_25_1= 'Permitted' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Forbidden' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1966:1: ( (lv_modalitykind_25_1= 'Permitted' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Forbidden' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1966:1: ( (lv_modalitykind_25_1= 'Permitted' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Forbidden' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1967:1: (lv_modalitykind_25_1= 'Permitted' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Forbidden' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1967:1: (lv_modalitykind_25_1= 'Permitted' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Forbidden' )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt55=1;
                }
                break;
            case 50:
                {
                alt55=2;
                }
                break;
            case 51:
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1968:3: lv_modalitykind_25_1= 'Permitted'
                    {
                    lv_modalitykind_25_1=(Token)match(input,49,FOLLOW_49_in_ruleRetention4043); 

                            newLeafNode(lv_modalitykind_25_1, grammarAccess.getRetentionAccess().getModalitykindPermittedKeyword_17_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_25_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1980:8: lv_modalitykind_25_2= 'Obligation'
                    {
                    lv_modalitykind_25_2=(Token)match(input,50,FOLLOW_50_in_ruleRetention4072); 

                            newLeafNode(lv_modalitykind_25_2, grammarAccess.getRetentionAccess().getModalitykindObligationKeyword_17_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_25_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1992:8: lv_modalitykind_25_3= 'Forbidden'
                    {
                    lv_modalitykind_25_3=(Token)match(input,51,FOLLOW_51_in_ruleRetention4101); 

                            newLeafNode(lv_modalitykind_25_3, grammarAccess.getRetentionAccess().getModalitykindForbiddenKeyword_17_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_25_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_26=(Token)match(input,13,FOLLOW_13_in_ruleRetention4129); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2019:1: entryRuleUsage returns [EObject current=null] : iv_ruleUsage= ruleUsage EOF ;
    public final EObject entryRuleUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsage = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2020:2: (iv_ruleUsage= ruleUsage EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2021:2: iv_ruleUsage= ruleUsage EOF
            {
             newCompositeNode(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage4165);
            iv_ruleUsage=ruleUsage();

            state._fsp--;

             current =iv_ruleUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage4175); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2028:1: ruleUsage returns [EObject current=null] : (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) ;
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
        Token lv_modalitykind_22_1=null;
        Token lv_modalitykind_22_2=null;
        Token lv_modalitykind_22_3=null;
        Token otherlv_23=null;
        EObject lv_refprivatedata_13_0 = null;

        EObject lv_refertoservice_16_0 = null;

        EObject lv_refertoEnforcement_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2031:28: ( (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2032:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2032:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2032:3: otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleUsage4212); 

                	newLeafNode(otherlv_0, grammarAccess.getUsageAccess().getUsageKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2036:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2037:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2037:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2038:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage4229); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUsage4246); 

                	newLeafNode(otherlv_2, grammarAccess.getUsageAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleUsage4258); 

                	newLeafNode(otherlv_3, grammarAccess.getUsageAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2062:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2063:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2063:1: (lv_description_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2064:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage4275); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleUsage4292); 

                	newLeafNode(otherlv_5, grammarAccess.getUsageAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleUsage4304); 

                	newLeafNode(otherlv_6, grammarAccess.getUsageAccess().getConditionKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2088:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2089:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2089:1: (lv_condition_7_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2090:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage4321); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleUsage4338); 

                	newLeafNode(otherlv_8, grammarAccess.getUsageAccess().getCommaKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2110:1: (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==61) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2110:3: otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,61,FOLLOW_61_in_ruleUsage4351); 

                        	newLeafNode(otherlv_9, grammarAccess.getUsageAccess().getPartOfUsageKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2114:1: ( (otherlv_10= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2115:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2115:1: (otherlv_10= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2116:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage4371); 

                    		newLeafNode(otherlv_10, grammarAccess.getUsageAccess().getPartofUsageCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleUsage4383); 

                        	newLeafNode(otherlv_11, grammarAccess.getUsageAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2131:3: (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==28) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2131:5: otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleUsage4398); 

                        	newLeafNode(otherlv_12, grammarAccess.getUsageAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2135:1: ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==RULE_ID) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2136:1: (lv_refprivatedata_13_0= ruleRefPrivateData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2136:1: (lv_refprivatedata_13_0= ruleRefPrivateData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2137:3: lv_refprivatedata_13_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefprivatedataRefPrivateDataParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleUsage4419);
                    	    lv_refprivatedata_13_0=ruleRefPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUsageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refprivatedata",
                    	            		lv_refprivatedata_13_0, 
                    	            		"RefPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleUsage4432); 

                        	newLeafNode(otherlv_14, grammarAccess.getUsageAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2157:3: (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==46) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2157:5: otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,46,FOLLOW_46_in_ruleUsage4447); 

                        	newLeafNode(otherlv_15, grammarAccess.getUsageAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2161:1: ( (lv_refertoservice_16_0= ruleReferToService ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_ID) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2162:1: (lv_refertoservice_16_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2162:1: (lv_refertoservice_16_0= ruleReferToService )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2163:3: lv_refertoservice_16_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefertoserviceReferToServiceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleUsage4468);
                    	    lv_refertoservice_16_0=ruleReferToService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUsageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoservice",
                    	            		lv_refertoservice_16_0, 
                    	            		"ReferToService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleUsage4481); 

                        	newLeafNode(otherlv_17, grammarAccess.getUsageAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2183:3: (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==47) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2183:5: otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,47,FOLLOW_47_in_ruleUsage4496); 

                        	newLeafNode(otherlv_18, grammarAccess.getUsageAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2187:1: ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==RULE_ID) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2188:1: (lv_refertoEnforcement_19_0= ruleRefertoEnforcement )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2188:1: (lv_refertoEnforcement_19_0= ruleRefertoEnforcement )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2189:3: lv_refertoEnforcement_19_0= ruleRefertoEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefertoEnforcementRefertoEnforcementParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefertoEnforcement_in_ruleUsage4517);
                    	    lv_refertoEnforcement_19_0=ruleRefertoEnforcement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUsageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoEnforcement",
                    	            		lv_refertoEnforcement_19_0, 
                    	            		"RefertoEnforcement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleUsage4530); 

                        	newLeafNode(otherlv_20, grammarAccess.getUsageAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,48,FOLLOW_48_in_ruleUsage4544); 

                	newLeafNode(otherlv_21, grammarAccess.getUsageAccess().getModalityKeyword_13());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2213:1: ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2214:1: ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2214:1: ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2215:1: (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2215:1: (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' )
            int alt63=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt63=1;
                }
                break;
            case 50:
                {
                alt63=2;
                }
                break;
            case 51:
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2216:3: lv_modalitykind_22_1= 'Permitted'
                    {
                    lv_modalitykind_22_1=(Token)match(input,49,FOLLOW_49_in_ruleUsage4564); 

                            newLeafNode(lv_modalitykind_22_1, grammarAccess.getUsageAccess().getModalitykindPermittedKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2228:8: lv_modalitykind_22_2= 'Obligation'
                    {
                    lv_modalitykind_22_2=(Token)match(input,50,FOLLOW_50_in_ruleUsage4593); 

                            newLeafNode(lv_modalitykind_22_2, grammarAccess.getUsageAccess().getModalitykindObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2240:8: lv_modalitykind_22_3= 'Forbidden'
                    {
                    lv_modalitykind_22_3=(Token)match(input,51,FOLLOW_51_in_ruleUsage4622); 

                            newLeafNode(lv_modalitykind_22_3, grammarAccess.getUsageAccess().getModalitykindForbiddenKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_23=(Token)match(input,13,FOLLOW_13_in_ruleUsage4650); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2267:1: entryRuleInformative returns [EObject current=null] : iv_ruleInformative= ruleInformative EOF ;
    public final EObject entryRuleInformative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformative = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2268:2: (iv_ruleInformative= ruleInformative EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2269:2: iv_ruleInformative= ruleInformative EOF
            {
             newCompositeNode(grammarAccess.getInformativeRule()); 
            pushFollow(FOLLOW_ruleInformative_in_entryRuleInformative4686);
            iv_ruleInformative=ruleInformative();

            state._fsp--;

             current =iv_ruleInformative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInformative4696); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2276:1: ruleInformative returns [EObject current=null] : (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) ;
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
        Token lv_modalitykind_22_1=null;
        Token lv_modalitykind_22_2=null;
        Token lv_modalitykind_22_3=null;
        Token otherlv_23=null;
        EObject lv_refprivatedata_13_0 = null;

        EObject lv_refertoservice_16_0 = null;

        EObject lv_refertoEnforcement_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2279:28: ( (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2280:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2280:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2280:3: otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleInformative4733); 

                	newLeafNode(otherlv_0, grammarAccess.getInformativeAccess().getInformativeKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2284:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2285:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2285:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2286:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformative4750); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInformative4767); 

                	newLeafNode(otherlv_2, grammarAccess.getInformativeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInformative4779); 

                	newLeafNode(otherlv_3, grammarAccess.getInformativeAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2310:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2311:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2311:1: (lv_description_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2312:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative4796); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleInformative4813); 

                	newLeafNode(otherlv_5, grammarAccess.getInformativeAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleInformative4825); 

                	newLeafNode(otherlv_6, grammarAccess.getInformativeAccess().getConditionKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2337:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2337:1: (lv_condition_7_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2338:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative4842); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleInformative4859); 

                	newLeafNode(otherlv_8, grammarAccess.getInformativeAccess().getCommaKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2358:1: (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==63) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2358:3: otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,63,FOLLOW_63_in_ruleInformative4872); 

                        	newLeafNode(otherlv_9, grammarAccess.getInformativeAccess().getPartOfInformativeKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2362:1: ( (otherlv_10= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2363:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2363:1: (otherlv_10= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2364:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformative4892); 

                    		newLeafNode(otherlv_10, grammarAccess.getInformativeAccess().getPartofInformativeCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleInformative4904); 

                        	newLeafNode(otherlv_11, grammarAccess.getInformativeAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2379:3: (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==28) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2379:5: otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleInformative4919); 

                        	newLeafNode(otherlv_12, grammarAccess.getInformativeAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2383:1: ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==RULE_ID) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2384:1: (lv_refprivatedata_13_0= ruleRefPrivateData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2384:1: (lv_refprivatedata_13_0= ruleRefPrivateData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2385:3: lv_refprivatedata_13_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefprivatedataRefPrivateDataParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleInformative4940);
                    	    lv_refprivatedata_13_0=ruleRefPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refprivatedata",
                    	            		lv_refprivatedata_13_0, 
                    	            		"RefPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleInformative4953); 

                        	newLeafNode(otherlv_14, grammarAccess.getInformativeAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2405:3: (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==46) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2405:5: otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,46,FOLLOW_46_in_ruleInformative4968); 

                        	newLeafNode(otherlv_15, grammarAccess.getInformativeAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2409:1: ( (lv_refertoservice_16_0= ruleReferToService ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==RULE_ID) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2410:1: (lv_refertoservice_16_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2410:1: (lv_refertoservice_16_0= ruleReferToService )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2411:3: lv_refertoservice_16_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefertoserviceReferToServiceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleInformative4989);
                    	    lv_refertoservice_16_0=ruleReferToService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoservice",
                    	            		lv_refertoservice_16_0, 
                    	            		"ReferToService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleInformative5002); 

                        	newLeafNode(otherlv_17, grammarAccess.getInformativeAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2431:3: (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==47) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2431:5: otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,47,FOLLOW_47_in_ruleInformative5017); 

                        	newLeafNode(otherlv_18, grammarAccess.getInformativeAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2435:1: ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==RULE_ID) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2436:1: (lv_refertoEnforcement_19_0= ruleRefertoEnforcement )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2436:1: (lv_refertoEnforcement_19_0= ruleRefertoEnforcement )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2437:3: lv_refertoEnforcement_19_0= ruleRefertoEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefertoEnforcementRefertoEnforcementParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefertoEnforcement_in_ruleInformative5038);
                    	    lv_refertoEnforcement_19_0=ruleRefertoEnforcement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoEnforcement",
                    	            		lv_refertoEnforcement_19_0, 
                    	            		"RefertoEnforcement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleInformative5051); 

                        	newLeafNode(otherlv_20, grammarAccess.getInformativeAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,48,FOLLOW_48_in_ruleInformative5065); 

                	newLeafNode(otherlv_21, grammarAccess.getInformativeAccess().getModalityKeyword_13());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2461:1: ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2462:1: ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2462:1: ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2463:1: (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2463:1: (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt71=1;
                }
                break;
            case 50:
                {
                alt71=2;
                }
                break;
            case 51:
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2464:3: lv_modalitykind_22_1= 'Permitted'
                    {
                    lv_modalitykind_22_1=(Token)match(input,49,FOLLOW_49_in_ruleInformative5085); 

                            newLeafNode(lv_modalitykind_22_1, grammarAccess.getInformativeAccess().getModalitykindPermittedKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2476:8: lv_modalitykind_22_2= 'Obligation'
                    {
                    lv_modalitykind_22_2=(Token)match(input,50,FOLLOW_50_in_ruleInformative5114); 

                            newLeafNode(lv_modalitykind_22_2, grammarAccess.getInformativeAccess().getModalitykindObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2488:8: lv_modalitykind_22_3= 'Forbidden'
                    {
                    lv_modalitykind_22_3=(Token)match(input,51,FOLLOW_51_in_ruleInformative5143); 

                            newLeafNode(lv_modalitykind_22_3, grammarAccess.getInformativeAccess().getModalitykindForbiddenKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_23=(Token)match(input,13,FOLLOW_13_in_ruleInformative5171); 

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


    // $ANTLR start "entryRulePartof"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2515:1: entryRulePartof returns [EObject current=null] : iv_rulePartof= rulePartof EOF ;
    public final EObject entryRulePartof() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartof = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2516:2: (iv_rulePartof= rulePartof EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2517:2: iv_rulePartof= rulePartof EOF
            {
             newCompositeNode(grammarAccess.getPartofRule()); 
            pushFollow(FOLLOW_rulePartof_in_entryRulePartof5207);
            iv_rulePartof=rulePartof();

            state._fsp--;

             current =iv_rulePartof; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePartof5217); 

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
    // $ANTLR end "entryRulePartof"


    // $ANTLR start "rulePartof"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2524:1: rulePartof returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject rulePartof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2527:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2528:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2528:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2528:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2528:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2529:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2529:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2530:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPartofRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePartof5262); 

            		newLeafNode(otherlv_0, grammarAccess.getPartofAccess().getPartofRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2541:2: (otherlv_1= '-' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==64) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2541:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_rulePartof5275); 

                        	newLeafNode(otherlv_1, grammarAccess.getPartofAccess().getHyphenMinusKeyword_1());
                        

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
    // $ANTLR end "rulePartof"


    // $ANTLR start "entryRuleReferToRecipient"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2553:1: entryRuleReferToRecipient returns [EObject current=null] : iv_ruleReferToRecipient= ruleReferToRecipient EOF ;
    public final EObject entryRuleReferToRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferToRecipient = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2554:2: (iv_ruleReferToRecipient= ruleReferToRecipient EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2555:2: iv_ruleReferToRecipient= ruleReferToRecipient EOF
            {
             newCompositeNode(grammarAccess.getReferToRecipientRule()); 
            pushFollow(FOLLOW_ruleReferToRecipient_in_entryRuleReferToRecipient5313);
            iv_ruleReferToRecipient=ruleReferToRecipient();

            state._fsp--;

             current =iv_ruleReferToRecipient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferToRecipient5323); 

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
    // $ANTLR end "entryRuleReferToRecipient"


    // $ANTLR start "ruleReferToRecipient"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2562:1: ruleReferToRecipient returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleReferToRecipient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2565:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2566:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2566:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2566:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2566:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2567:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2567:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2568:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferToRecipientRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferToRecipient5368); 

            		newLeafNode(otherlv_0, grammarAccess.getReferToRecipientAccess().getRefertoreRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2579:2: (otherlv_1= '-' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==64) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2579:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleReferToRecipient5381); 

                        	newLeafNode(otherlv_1, grammarAccess.getReferToRecipientAccess().getHyphenMinusKeyword_1());
                        

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
    // $ANTLR end "ruleReferToRecipient"


    // $ANTLR start "entryRuleReferToRecipientSource"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2591:1: entryRuleReferToRecipientSource returns [EObject current=null] : iv_ruleReferToRecipientSource= ruleReferToRecipientSource EOF ;
    public final EObject entryRuleReferToRecipientSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferToRecipientSource = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2592:2: (iv_ruleReferToRecipientSource= ruleReferToRecipientSource EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2593:2: iv_ruleReferToRecipientSource= ruleReferToRecipientSource EOF
            {
             newCompositeNode(grammarAccess.getReferToRecipientSourceRule()); 
            pushFollow(FOLLOW_ruleReferToRecipientSource_in_entryRuleReferToRecipientSource5419);
            iv_ruleReferToRecipientSource=ruleReferToRecipientSource();

            state._fsp--;

             current =iv_ruleReferToRecipientSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferToRecipientSource5429); 

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
    // $ANTLR end "entryRuleReferToRecipientSource"


    // $ANTLR start "ruleReferToRecipientSource"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2600:1: ruleReferToRecipientSource returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleReferToRecipientSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2603:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2604:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2604:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2604:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2604:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2605:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2605:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2606:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferToRecipientSourceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferToRecipientSource5474); 

            		newLeafNode(otherlv_0, grammarAccess.getReferToRecipientSourceAccess().getRefertoreRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2617:2: (otherlv_1= '-' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==64) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2617:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleReferToRecipientSource5487); 

                        	newLeafNode(otherlv_1, grammarAccess.getReferToRecipientSourceAccess().getHyphenMinusKeyword_1());
                        

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
    // $ANTLR end "ruleReferToRecipientSource"


    // $ANTLR start "entryRuleReferToRecipientTarget"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2629:1: entryRuleReferToRecipientTarget returns [EObject current=null] : iv_ruleReferToRecipientTarget= ruleReferToRecipientTarget EOF ;
    public final EObject entryRuleReferToRecipientTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferToRecipientTarget = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2630:2: (iv_ruleReferToRecipientTarget= ruleReferToRecipientTarget EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2631:2: iv_ruleReferToRecipientTarget= ruleReferToRecipientTarget EOF
            {
             newCompositeNode(grammarAccess.getReferToRecipientTargetRule()); 
            pushFollow(FOLLOW_ruleReferToRecipientTarget_in_entryRuleReferToRecipientTarget5525);
            iv_ruleReferToRecipientTarget=ruleReferToRecipientTarget();

            state._fsp--;

             current =iv_ruleReferToRecipientTarget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferToRecipientTarget5535); 

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
    // $ANTLR end "entryRuleReferToRecipientTarget"


    // $ANTLR start "ruleReferToRecipientTarget"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2638:1: ruleReferToRecipientTarget returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleReferToRecipientTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2641:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2642:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2642:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2642:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2642:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2643:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2643:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2644:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferToRecipientTargetRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferToRecipientTarget5580); 

            		newLeafNode(otherlv_0, grammarAccess.getReferToRecipientTargetAccess().getRefertoreRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2655:2: (otherlv_1= '-' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==64) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2655:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleReferToRecipientTarget5593); 

                        	newLeafNode(otherlv_1, grammarAccess.getReferToRecipientTargetAccess().getHyphenMinusKeyword_1());
                        

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
    // $ANTLR end "ruleReferToRecipientTarget"


    // $ANTLR start "entryRuleReferToService"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2667:1: entryRuleReferToService returns [EObject current=null] : iv_ruleReferToService= ruleReferToService EOF ;
    public final EObject entryRuleReferToService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferToService = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2668:2: (iv_ruleReferToService= ruleReferToService EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2669:2: iv_ruleReferToService= ruleReferToService EOF
            {
             newCompositeNode(grammarAccess.getReferToServiceRule()); 
            pushFollow(FOLLOW_ruleReferToService_in_entryRuleReferToService5631);
            iv_ruleReferToService=ruleReferToService();

            state._fsp--;

             current =iv_ruleReferToService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferToService5641); 

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
    // $ANTLR end "entryRuleReferToService"


    // $ANTLR start "ruleReferToService"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2676:1: ruleReferToService returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleReferToService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2679:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2680:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2680:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2680:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2680:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2681:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2681:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2682:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferToServiceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferToService5686); 

            		newLeafNode(otherlv_0, grammarAccess.getReferToServiceAccess().getRefertoseServiceCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2693:2: (otherlv_1= '-' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==64) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2693:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleReferToService5699); 

                        	newLeafNode(otherlv_1, grammarAccess.getReferToServiceAccess().getHyphenMinusKeyword_1());
                        

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
    // $ANTLR end "ruleReferToService"


    // $ANTLR start "entryRuleServicePartof"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2705:1: entryRuleServicePartof returns [EObject current=null] : iv_ruleServicePartof= ruleServicePartof EOF ;
    public final EObject entryRuleServicePartof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServicePartof = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2706:2: (iv_ruleServicePartof= ruleServicePartof EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2707:2: iv_ruleServicePartof= ruleServicePartof EOF
            {
             newCompositeNode(grammarAccess.getServicePartofRule()); 
            pushFollow(FOLLOW_ruleServicePartof_in_entryRuleServicePartof5737);
            iv_ruleServicePartof=ruleServicePartof();

            state._fsp--;

             current =iv_ruleServicePartof; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServicePartof5747); 

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
    // $ANTLR end "entryRuleServicePartof"


    // $ANTLR start "ruleServicePartof"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2714:1: ruleServicePartof returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleServicePartof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2717:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2718:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2718:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2718:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2718:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2719:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2719:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2720:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServicePartofRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServicePartof5792); 

            		newLeafNode(otherlv_0, grammarAccess.getServicePartofAccess().getRefertoserviceServiceCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2731:2: (otherlv_1= '-' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==64) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2731:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleServicePartof5805); 

                        	newLeafNode(otherlv_1, grammarAccess.getServicePartofAccess().getHyphenMinusKeyword_1());
                        

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
    // $ANTLR end "ruleServicePartof"


    // $ANTLR start "entryRuleRefPrivateData"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2743:1: entryRuleRefPrivateData returns [EObject current=null] : iv_ruleRefPrivateData= ruleRefPrivateData EOF ;
    public final EObject entryRuleRefPrivateData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPrivateData = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2744:2: (iv_ruleRefPrivateData= ruleRefPrivateData EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2745:2: iv_ruleRefPrivateData= ruleRefPrivateData EOF
            {
             newCompositeNode(grammarAccess.getRefPrivateDataRule()); 
            pushFollow(FOLLOW_ruleRefPrivateData_in_entryRuleRefPrivateData5843);
            iv_ruleRefPrivateData=ruleRefPrivateData();

            state._fsp--;

             current =iv_ruleRefPrivateData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefPrivateData5853); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2752:1: ruleRefPrivateData returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefPrivateData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2755:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2756:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2756:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2756:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2756:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2757:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2757:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2758:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefPrivateDataRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefPrivateData5898); 

            		newLeafNode(otherlv_0, grammarAccess.getRefPrivateDataAccess().getRefprPrivateDataCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2769:2: (otherlv_1= '-' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==64) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2769:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleRefPrivateData5911); 

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


    // $ANTLR start "entryRuleRefertoEnforcement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2781:1: entryRuleRefertoEnforcement returns [EObject current=null] : iv_ruleRefertoEnforcement= ruleRefertoEnforcement EOF ;
    public final EObject entryRuleRefertoEnforcement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefertoEnforcement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2782:2: (iv_ruleRefertoEnforcement= ruleRefertoEnforcement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2783:2: iv_ruleRefertoEnforcement= ruleRefertoEnforcement EOF
            {
             newCompositeNode(grammarAccess.getRefertoEnforcementRule()); 
            pushFollow(FOLLOW_ruleRefertoEnforcement_in_entryRuleRefertoEnforcement5949);
            iv_ruleRefertoEnforcement=ruleRefertoEnforcement();

            state._fsp--;

             current =iv_ruleRefertoEnforcement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefertoEnforcement5959); 

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
    // $ANTLR end "entryRuleRefertoEnforcement"


    // $ANTLR start "ruleRefertoEnforcement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2790:1: ruleRefertoEnforcement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefertoEnforcement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2793:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2794:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2794:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2794:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2794:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2795:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2795:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2796:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefertoEnforcementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefertoEnforcement6004); 

            		newLeafNode(otherlv_0, grammarAccess.getRefertoEnforcementAccess().getRefstEnforcementCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2807:2: (otherlv_1= '-' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==64) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2807:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleRefertoEnforcement6017); 

                        	newLeafNode(otherlv_1, grammarAccess.getRefertoEnforcementAccess().getHyphenMinusKeyword_1());
                        

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
    // $ANTLR end "ruleRefertoEnforcement"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePolicy_in_entryRulePolicy75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolicy85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePolicy122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePolicy143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePolicy155 = new BitSet(new long[]{0x521008804802A000L});
    public static final BitSet FOLLOW_ruleImport_in_rulePolicy176 = new BitSet(new long[]{0x521008804802A000L});
    public static final BitSet FOLLOW_ruleCollection_in_rulePolicy198 = new BitSet(new long[]{0x5210088048022000L});
    public static final BitSet FOLLOW_ruleDisclosure_in_rulePolicy220 = new BitSet(new long[]{0x5210008048022000L});
    public static final BitSet FOLLOW_ruleRetention_in_rulePolicy242 = new BitSet(new long[]{0x5200008048022000L});
    public static final BitSet FOLLOW_ruleUsage_in_rulePolicy264 = new BitSet(new long[]{0x5000008048022000L});
    public static final BitSet FOLLOW_ruleInformative_in_rulePolicy286 = new BitSet(new long[]{0x4000008048022000L});
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
    public static final BitSet FOLLOW_ruleServicePartof_in_ruleService1424 = new BitSet(new long[]{0x0000000000002010L});
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
    public static final BitSet FOLLOW_rulePartof_in_ruleRecipient1682 = new BitSet(new long[]{0x0000000000080010L});
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
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2319 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAttribute2336 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2353 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAttribute2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection2409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCollection2456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollection2473 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollection2490 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCollection2502 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection2519 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection2536 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleCollection2548 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection2565 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection2582 = new BitSet(new long[]{0x0001E00010000000L});
    public static final BitSet FOLLOW_45_in_ruleCollection2595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollection2615 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection2627 = new BitSet(new long[]{0x0001C00010000000L});
    public static final BitSet FOLLOW_28_in_ruleCollection2642 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleCollection2663 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleCollection2676 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleCollection2691 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleCollection2712 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleCollection2725 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCollection2740 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_ruleCollection2761 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleCollection2774 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleCollection2788 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_49_in_ruleCollection2808 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_50_in_ruleCollection2837 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_51_in_ruleCollection2866 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCollection2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisclosure_in_entryRuleDisclosure2930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisclosure2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDisclosure2977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisclosure2994 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDisclosure3011 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDisclosure3023 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure3040 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3057 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDisclosure3069 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure3086 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3103 = new BitSet(new long[]{0x01E1C00010000000L});
    public static final BitSet FOLLOW_53_in_ruleDisclosure3116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisclosure3136 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3148 = new BitSet(new long[]{0x01C1C00010000000L});
    public static final BitSet FOLLOW_54_in_ruleDisclosure3163 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToRecipient_in_ruleDisclosure3184 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3197 = new BitSet(new long[]{0x0181C00010000000L});
    public static final BitSet FOLLOW_55_in_ruleDisclosure3212 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToRecipientSource_in_ruleDisclosure3233 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3246 = new BitSet(new long[]{0x0101C00010000000L});
    public static final BitSet FOLLOW_56_in_ruleDisclosure3261 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToRecipientTarget_in_ruleDisclosure3282 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3295 = new BitSet(new long[]{0x0001C00010000000L});
    public static final BitSet FOLLOW_28_in_ruleDisclosure3310 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleDisclosure3331 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3344 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleDisclosure3359 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleDisclosure3380 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3393 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_47_in_ruleDisclosure3408 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_ruleDisclosure3429 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3442 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleDisclosure3456 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_49_in_ruleDisclosure3476 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_50_in_ruleDisclosure3505 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_51_in_ruleDisclosure3534 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDisclosure3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRetention_in_entryRuleRetention3598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRetention3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleRetention3645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRetention3662 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRetention3679 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRetention3691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention3708 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention3725 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleRetention3737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention3754 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention3771 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_ruleRetention3784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRetention3804 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention3816 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleRetention3830 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention3847 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention3864 = new BitSet(new long[]{0x0001C00010000000L});
    public static final BitSet FOLLOW_28_in_ruleRetention3877 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleRetention3898 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRetention3911 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleRetention3926 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleRetention3947 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRetention3960 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRetention3975 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_ruleRetention3996 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRetention4009 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleRetention4023 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_49_in_ruleRetention4043 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_50_in_ruleRetention4072 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_51_in_ruleRetention4101 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRetention4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage4165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleUsage4212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage4229 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUsage4246 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUsage4258 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage4275 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage4292 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleUsage4304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage4321 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage4338 = new BitSet(new long[]{0x2001C00010000000L});
    public static final BitSet FOLLOW_61_in_ruleUsage4351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage4371 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage4383 = new BitSet(new long[]{0x0001C00010000000L});
    public static final BitSet FOLLOW_28_in_ruleUsage4398 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleUsage4419 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleUsage4432 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleUsage4447 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleUsage4468 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleUsage4481 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_47_in_ruleUsage4496 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_ruleUsage4517 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleUsage4530 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleUsage4544 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_49_in_ruleUsage4564 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_50_in_ruleUsage4593 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_51_in_ruleUsage4622 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUsage4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInformative_in_entryRuleInformative4686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInformative4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleInformative4733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformative4750 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInformative4767 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInformative4779 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative4796 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative4813 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleInformative4825 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative4842 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative4859 = new BitSet(new long[]{0x8001C00010000000L});
    public static final BitSet FOLLOW_63_in_ruleInformative4872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformative4892 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative4904 = new BitSet(new long[]{0x0001C00010000000L});
    public static final BitSet FOLLOW_28_in_ruleInformative4919 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleInformative4940 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleInformative4953 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleInformative4968 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleInformative4989 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleInformative5002 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_47_in_ruleInformative5017 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_ruleInformative5038 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleInformative5051 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleInformative5065 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_49_in_ruleInformative5085 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_50_in_ruleInformative5114 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_51_in_ruleInformative5143 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInformative5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartof_in_entryRulePartof5207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartof5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePartof5262 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_rulePartof5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferToRecipient_in_entryRuleReferToRecipient5313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferToRecipient5323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferToRecipient5368 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleReferToRecipient5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferToRecipientSource_in_entryRuleReferToRecipientSource5419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferToRecipientSource5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferToRecipientSource5474 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleReferToRecipientSource5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferToRecipientTarget_in_entryRuleReferToRecipientTarget5525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferToRecipientTarget5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferToRecipientTarget5580 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleReferToRecipientTarget5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferToService_in_entryRuleReferToService5631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferToService5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferToService5686 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleReferToService5699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServicePartof_in_entryRuleServicePartof5737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServicePartof5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServicePartof5792 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleServicePartof5805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_entryRuleRefPrivateData5843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefPrivateData5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefPrivateData5898 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleRefPrivateData5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_entryRuleRefertoEnforcement5949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefertoEnforcement5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefertoEnforcement6004 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleRefertoEnforcement6017 = new BitSet(new long[]{0x0000000000000002L});

}