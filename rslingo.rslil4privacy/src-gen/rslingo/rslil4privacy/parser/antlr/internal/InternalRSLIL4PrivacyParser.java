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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'};'", "'.'", "'import'", "'.*'", "'PolicyMetadata {'", "'Author(s)'", "','", "'Organization(s)'", "'Date'", "'Version'", "'}'", "'-'", "'Jan'", "'Feb'", "'Mar'", "'Apr'", "'May'", "'Jun'", "'Jul'", "'Aug'", "'Sep'", "'Oct'", "'Nov'", "'Dec'", "'Enforcement'", "'Name'", "'Description'", "'Type'", "'Action'", "'Algorithm'", "'Config'", "'Process'", "'Tool'", "'Service'", "'RefersTo PrivateData'", "'Service_Part'", "'Recipient'", "'Recipient_Part'", "'Scope'", "'Internal'", "'External'", "'Internal/External'", "'Individual'", "'Organization'", "'Individual/Organization'", "'PrivateData'", "'PersonalInformation'", "'UsageInformation'", "'Attribute'", "'Collection'", "'Condition'", "'PartOf Collection'", "'RefersTo Service'", "'RefersTo Enforcement'", "'Modality'", "'Permitted'", "'Obligation'", "'Forbidden'", "'Disclosure'", "'PartOf Disclosure'", "'RefersTo Recipient'", "'RefersTo Recipient-Source'", "'RefersTo Recipient-Target'", "'Retention'", "'PartOf Retention'", "'Period'", "'Usage'", "'PartOf Usage'", "'Informative'", "'PartOf Informative'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:76:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_metadata_4_0= ruleMetadata ) )? ( (lv_collection_5_0= ruleCollection ) )* ( (lv_disclosure_6_0= ruleDisclosure ) )* ( (lv_retention_7_0= ruleRetention ) )* ( (lv_usage_8_0= ruleUsage ) )* ( (lv_informative_9_0= ruleInformative ) )* ( (lv_privateData_10_0= rulePrivateData ) )* ( (lv_recipient_11_0= ruleRecipient ) )* ( (lv_service_12_0= ruleService ) )* ( (lv_enforcement_13_0= ruleEnforcement ) )* otherlv_14= '};' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_importelements_3_0 = null;

        EObject lv_metadata_4_0 = null;

        EObject lv_collection_5_0 = null;

        EObject lv_disclosure_6_0 = null;

        EObject lv_retention_7_0 = null;

        EObject lv_usage_8_0 = null;

        EObject lv_informative_9_0 = null;

        EObject lv_privateData_10_0 = null;

        EObject lv_recipient_11_0 = null;

        EObject lv_service_12_0 = null;

        EObject lv_enforcement_13_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:79:28: ( (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_metadata_4_0= ruleMetadata ) )? ( (lv_collection_5_0= ruleCollection ) )* ( (lv_disclosure_6_0= ruleDisclosure ) )* ( (lv_retention_7_0= ruleRetention ) )* ( (lv_usage_8_0= ruleUsage ) )* ( (lv_informative_9_0= ruleInformative ) )* ( (lv_privateData_10_0= rulePrivateData ) )* ( (lv_recipient_11_0= ruleRecipient ) )* ( (lv_service_12_0= ruleService ) )* ( (lv_enforcement_13_0= ruleEnforcement ) )* otherlv_14= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:80:1: (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_metadata_4_0= ruleMetadata ) )? ( (lv_collection_5_0= ruleCollection ) )* ( (lv_disclosure_6_0= ruleDisclosure ) )* ( (lv_retention_7_0= ruleRetention ) )* ( (lv_usage_8_0= ruleUsage ) )* ( (lv_informative_9_0= ruleInformative ) )* ( (lv_privateData_10_0= rulePrivateData ) )* ( (lv_recipient_11_0= ruleRecipient ) )* ( (lv_service_12_0= ruleService ) )* ( (lv_enforcement_13_0= ruleEnforcement ) )* otherlv_14= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:80:1: (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_metadata_4_0= ruleMetadata ) )? ( (lv_collection_5_0= ruleCollection ) )* ( (lv_disclosure_6_0= ruleDisclosure ) )* ( (lv_retention_7_0= ruleRetention ) )* ( (lv_usage_8_0= ruleUsage ) )* ( (lv_informative_9_0= ruleInformative ) )* ( (lv_privateData_10_0= rulePrivateData ) )* ( (lv_recipient_11_0= ruleRecipient ) )* ( (lv_service_12_0= ruleService ) )* ( (lv_enforcement_13_0= ruleEnforcement ) )* otherlv_14= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:80:3: otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_metadata_4_0= ruleMetadata ) )? ( (lv_collection_5_0= ruleCollection ) )* ( (lv_disclosure_6_0= ruleDisclosure ) )* ( (lv_retention_7_0= ruleRetention ) )* ( (lv_usage_8_0= ruleUsage ) )* ( (lv_informative_9_0= ruleInformative ) )* ( (lv_privateData_10_0= rulePrivateData ) )* ( (lv_recipient_11_0= ruleRecipient ) )* ( (lv_service_12_0= ruleService ) )* ( (lv_enforcement_13_0= ruleEnforcement ) )* otherlv_14= '};'
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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:124:3: ( (lv_metadata_4_0= ruleMetadata ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:125:1: (lv_metadata_4_0= ruleMetadata )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:125:1: (lv_metadata_4_0= ruleMetadata )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:126:3: lv_metadata_4_0= ruleMetadata
                    {
                     
                    	        newCompositeNode(grammarAccess.getPolicyAccess().getMetadataMetadataParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMetadata_in_rulePolicy198);
                    lv_metadata_4_0=ruleMetadata();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
                    	        }
                           		set(
                           			current, 
                           			"metadata",
                            		lv_metadata_4_0, 
                            		"Metadata");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:142:3: ( (lv_collection_5_0= ruleCollection ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==62) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:143:1: (lv_collection_5_0= ruleCollection )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:143:1: (lv_collection_5_0= ruleCollection )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:144:3: lv_collection_5_0= ruleCollection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getCollectionCollectionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCollection_in_rulePolicy220);
            	    lv_collection_5_0=ruleCollection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"collection",
            	            		lv_collection_5_0, 
            	            		"Collection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:160:3: ( (lv_disclosure_6_0= ruleDisclosure ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==71) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:161:1: (lv_disclosure_6_0= ruleDisclosure )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:161:1: (lv_disclosure_6_0= ruleDisclosure )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:162:3: lv_disclosure_6_0= ruleDisclosure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getDisclosureDisclosureParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDisclosure_in_rulePolicy242);
            	    lv_disclosure_6_0=ruleDisclosure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"disclosure",
            	            		lv_disclosure_6_0, 
            	            		"Disclosure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:178:3: ( (lv_retention_7_0= ruleRetention ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==76) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:179:1: (lv_retention_7_0= ruleRetention )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:179:1: (lv_retention_7_0= ruleRetention )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:180:3: lv_retention_7_0= ruleRetention
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getRetentionRetentionParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRetention_in_rulePolicy264);
            	    lv_retention_7_0=ruleRetention();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"retention",
            	            		lv_retention_7_0, 
            	            		"Retention");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:196:3: ( (lv_usage_8_0= ruleUsage ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==79) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:197:1: (lv_usage_8_0= ruleUsage )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:197:1: (lv_usage_8_0= ruleUsage )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:198:3: lv_usage_8_0= ruleUsage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsageUsageParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsage_in_rulePolicy286);
            	    lv_usage_8_0=ruleUsage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"usage",
            	            		lv_usage_8_0, 
            	            		"Usage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:214:3: ( (lv_informative_9_0= ruleInformative ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==81) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:215:1: (lv_informative_9_0= ruleInformative )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:215:1: (lv_informative_9_0= ruleInformative )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:216:3: lv_informative_9_0= ruleInformative
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getInformativeInformativeParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInformative_in_rulePolicy308);
            	    lv_informative_9_0=ruleInformative();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"informative",
            	            		lv_informative_9_0, 
            	            		"Informative");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:232:3: ( (lv_privateData_10_0= rulePrivateData ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==58) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:233:1: (lv_privateData_10_0= rulePrivateData )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:233:1: (lv_privateData_10_0= rulePrivateData )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:234:3: lv_privateData_10_0= rulePrivateData
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getPrivateDataPrivateDataParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrivateData_in_rulePolicy330);
            	    lv_privateData_10_0=rulePrivateData();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"privateData",
            	            		lv_privateData_10_0, 
            	            		"PrivateData");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:250:3: ( (lv_recipient_11_0= ruleRecipient ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==49) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:251:1: (lv_recipient_11_0= ruleRecipient )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:251:1: (lv_recipient_11_0= ruleRecipient )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:252:3: lv_recipient_11_0= ruleRecipient
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getRecipientRecipientParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRecipient_in_rulePolicy352);
            	    lv_recipient_11_0=ruleRecipient();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"recipient",
            	            		lv_recipient_11_0, 
            	            		"Recipient");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:268:3: ( (lv_service_12_0= ruleService ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==46) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:269:1: (lv_service_12_0= ruleService )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:269:1: (lv_service_12_0= ruleService )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:270:3: lv_service_12_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getServiceServiceParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_rulePolicy374);
            	    lv_service_12_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"service",
            	            		lv_service_12_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:286:3: ( (lv_enforcement_13_0= ruleEnforcement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:287:1: (lv_enforcement_13_0= ruleEnforcement )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:287:1: (lv_enforcement_13_0= ruleEnforcement )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:288:3: lv_enforcement_13_0= ruleEnforcement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getEnforcementEnforcementParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnforcement_in_rulePolicy396);
            	    lv_enforcement_13_0=ruleEnforcement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"enforcement",
            	            		lv_enforcement_13_0, 
            	            		"Enforcement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_14=(Token)match(input,13,FOLLOW_13_in_rulePolicy409); 

                	newLeafNode(otherlv_14, grammarAccess.getPolicyAccess().getRightCurlyBracketSemicolonKeyword_14());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:316:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:317:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:318:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName446);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName457); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:325:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:328:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:329:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:329:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:329:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName497); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:336:1: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:337:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName516); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName531); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:357:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:358:2: (iv_ruleImport= ruleImport EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:359:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport578);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport588); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:366:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:369:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:370:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:370:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:370:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport625); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:374:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:375:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:375:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:376:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport646);
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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:400:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:401:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:402:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard683);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard694); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:409:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:412:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:413:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:413:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:414:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard741);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:424:1: (kw= '.*' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:425:2: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildcard760); 

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


    // $ANTLR start "entryRuleMetadata"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:438:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:439:2: (iv_ruleMetadata= ruleMetadata EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:440:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_ruleMetadata_in_entryRuleMetadata802);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadata812); 

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
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:447:1: ruleMetadata returns [EObject current=null] : (otherlv_0= 'PolicyMetadata {' otherlv_1= 'Author(s)' ( (lv_authors_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'Organization(s)' ( (lv_organizations_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'Date' ( (lv_date_8_0= ruleDate ) ) otherlv_9= ',' otherlv_10= 'Version' ( (lv_version_11_0= RULE_STRING ) ) otherlv_12= '}' ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_authors_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_organizations_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_version_11_0=null;
        Token otherlv_12=null;
        EObject lv_date_8_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:450:28: ( (otherlv_0= 'PolicyMetadata {' otherlv_1= 'Author(s)' ( (lv_authors_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'Organization(s)' ( (lv_organizations_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'Date' ( (lv_date_8_0= ruleDate ) ) otherlv_9= ',' otherlv_10= 'Version' ( (lv_version_11_0= RULE_STRING ) ) otherlv_12= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:451:1: (otherlv_0= 'PolicyMetadata {' otherlv_1= 'Author(s)' ( (lv_authors_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'Organization(s)' ( (lv_organizations_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'Date' ( (lv_date_8_0= ruleDate ) ) otherlv_9= ',' otherlv_10= 'Version' ( (lv_version_11_0= RULE_STRING ) ) otherlv_12= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:451:1: (otherlv_0= 'PolicyMetadata {' otherlv_1= 'Author(s)' ( (lv_authors_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'Organization(s)' ( (lv_organizations_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'Date' ( (lv_date_8_0= ruleDate ) ) otherlv_9= ',' otherlv_10= 'Version' ( (lv_version_11_0= RULE_STRING ) ) otherlv_12= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:451:3: otherlv_0= 'PolicyMetadata {' otherlv_1= 'Author(s)' ( (lv_authors_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'Organization(s)' ( (lv_organizations_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'Date' ( (lv_date_8_0= ruleDate ) ) otherlv_9= ',' otherlv_10= 'Version' ( (lv_version_11_0= RULE_STRING ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleMetadata849); 

                	newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getPolicyMetadataKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleMetadata861); 

                	newLeafNode(otherlv_1, grammarAccess.getMetadataAccess().getAuthorSKeyword_1());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:459:1: ( (lv_authors_2_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:460:1: (lv_authors_2_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:460:1: (lv_authors_2_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:461:3: lv_authors_2_0= RULE_STRING
            {
            lv_authors_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata878); 

            			newLeafNode(lv_authors_2_0, grammarAccess.getMetadataAccess().getAuthorsSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"authors",
                    		lv_authors_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleMetadata895); 

                	newLeafNode(otherlv_3, grammarAccess.getMetadataAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleMetadata907); 

                	newLeafNode(otherlv_4, grammarAccess.getMetadataAccess().getOrganizationSKeyword_4());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:485:1: ( (lv_organizations_5_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:486:1: (lv_organizations_5_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:486:1: (lv_organizations_5_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:487:3: lv_organizations_5_0= RULE_STRING
            {
            lv_organizations_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata924); 

            			newLeafNode(lv_organizations_5_0, grammarAccess.getMetadataAccess().getOrganizationsSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"organizations",
                    		lv_organizations_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleMetadata941); 

                	newLeafNode(otherlv_6, grammarAccess.getMetadataAccess().getCommaKeyword_6());
                
            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleMetadata953); 

                	newLeafNode(otherlv_7, grammarAccess.getMetadataAccess().getDateKeyword_7());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:511:1: ( (lv_date_8_0= ruleDate ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:512:1: (lv_date_8_0= ruleDate )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:512:1: (lv_date_8_0= ruleDate )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:513:3: lv_date_8_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getMetadataAccess().getDateDateParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_in_ruleMetadata974);
            lv_date_8_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetadataRule());
            	        }
                   		set(
                   			current, 
                   			"date",
                    		lv_date_8_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleMetadata986); 

                	newLeafNode(otherlv_9, grammarAccess.getMetadataAccess().getCommaKeyword_9());
                
            otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleMetadata998); 

                	newLeafNode(otherlv_10, grammarAccess.getMetadataAccess().getVersionKeyword_10());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:537:1: ( (lv_version_11_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:538:1: (lv_version_11_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:538:1: (lv_version_11_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:539:3: lv_version_11_0= RULE_STRING
            {
            lv_version_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata1015); 

            			newLeafNode(lv_version_11_0, grammarAccess.getMetadataAccess().getVersionSTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"version",
                    		lv_version_11_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleMetadata1032); 

                	newLeafNode(otherlv_12, grammarAccess.getMetadataAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleDate"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:567:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:568:2: (iv_ruleDate= ruleDate EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:569:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate1068);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate1078); 

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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:576:1: ruleDate returns [EObject current=null] : ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token lv_day_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_year_4_0=null;
        EObject lv_month_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:579:28: ( ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:580:1: ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:580:1: ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:580:2: ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:580:2: ( (lv_day_0_0= RULE_INT ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:581:1: (lv_day_0_0= RULE_INT )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:581:1: (lv_day_0_0= RULE_INT )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:582:3: lv_day_0_0= RULE_INT
            {
            lv_day_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1120); 

            			newLeafNode(lv_day_0_0, grammarAccess.getDateAccess().getDayINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"day",
                    		lv_day_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleDate1137); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getHyphenMinusKeyword_1());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:602:1: ( (lv_month_2_0= ruleMonth ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:603:1: (lv_month_2_0= ruleMonth )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:603:1: (lv_month_2_0= ruleMonth )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:604:3: lv_month_2_0= ruleMonth
            {
             
            	        newCompositeNode(grammarAccess.getDateAccess().getMonthMonthParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMonth_in_ruleDate1158);
            lv_month_2_0=ruleMonth();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDateRule());
            	        }
                   		set(
                   			current, 
                   			"month",
                    		lv_month_2_0, 
                    		"Month");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleDate1170); 

                	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getHyphenMinusKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:624:1: ( (lv_year_4_0= RULE_INT ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:625:1: (lv_year_4_0= RULE_INT )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:625:1: (lv_year_4_0= RULE_INT )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:626:3: lv_year_4_0= RULE_INT
            {
            lv_year_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1187); 

            			newLeafNode(lv_year_4_0, grammarAccess.getDateAccess().getYearINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"year",
                    		lv_year_4_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleMonth"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:650:1: entryRuleMonth returns [EObject current=null] : iv_ruleMonth= ruleMonth EOF ;
    public final EObject entryRuleMonth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonth = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:651:2: (iv_ruleMonth= ruleMonth EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:652:2: iv_ruleMonth= ruleMonth EOF
            {
             newCompositeNode(grammarAccess.getMonthRule()); 
            pushFollow(FOLLOW_ruleMonth_in_entryRuleMonth1228);
            iv_ruleMonth=ruleMonth();

            state._fsp--;

             current =iv_ruleMonth; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonth1238); 

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
    // $ANTLR end "entryRuleMonth"


    // $ANTLR start "ruleMonth"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:659:1: ruleMonth returns [EObject current=null] : ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) ) ;
    public final EObject ruleMonth() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;
        Token lv_name_0_7=null;
        Token lv_name_0_8=null;
        Token lv_name_0_9=null;
        Token lv_name_0_10=null;
        Token lv_name_0_11=null;
        Token lv_name_0_12=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:662:28: ( ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:663:1: ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:663:1: ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:664:1: ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:664:1: ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:665:1: (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:665:1: (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' )
            int alt14=12;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt14=1;
                }
                break;
            case 26:
                {
                alt14=2;
                }
                break;
            case 27:
                {
                alt14=3;
                }
                break;
            case 28:
                {
                alt14=4;
                }
                break;
            case 29:
                {
                alt14=5;
                }
                break;
            case 30:
                {
                alt14=6;
                }
                break;
            case 31:
                {
                alt14=7;
                }
                break;
            case 32:
                {
                alt14=8;
                }
                break;
            case 33:
                {
                alt14=9;
                }
                break;
            case 34:
                {
                alt14=10;
                }
                break;
            case 35:
                {
                alt14=11;
                }
                break;
            case 36:
                {
                alt14=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:666:3: lv_name_0_1= 'Jan'
                    {
                    lv_name_0_1=(Token)match(input,25,FOLLOW_25_in_ruleMonth1282); 

                            newLeafNode(lv_name_0_1, grammarAccess.getMonthAccess().getNameJanKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:678:8: lv_name_0_2= 'Feb'
                    {
                    lv_name_0_2=(Token)match(input,26,FOLLOW_26_in_ruleMonth1311); 

                            newLeafNode(lv_name_0_2, grammarAccess.getMonthAccess().getNameFebKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:690:8: lv_name_0_3= 'Mar'
                    {
                    lv_name_0_3=(Token)match(input,27,FOLLOW_27_in_ruleMonth1340); 

                            newLeafNode(lv_name_0_3, grammarAccess.getMonthAccess().getNameMarKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:702:8: lv_name_0_4= 'Apr'
                    {
                    lv_name_0_4=(Token)match(input,28,FOLLOW_28_in_ruleMonth1369); 

                            newLeafNode(lv_name_0_4, grammarAccess.getMonthAccess().getNameAprKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:714:8: lv_name_0_5= 'May'
                    {
                    lv_name_0_5=(Token)match(input,29,FOLLOW_29_in_ruleMonth1398); 

                            newLeafNode(lv_name_0_5, grammarAccess.getMonthAccess().getNameMayKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:726:8: lv_name_0_6= 'Jun'
                    {
                    lv_name_0_6=(Token)match(input,30,FOLLOW_30_in_ruleMonth1427); 

                            newLeafNode(lv_name_0_6, grammarAccess.getMonthAccess().getNameJunKeyword_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:738:8: lv_name_0_7= 'Jul'
                    {
                    lv_name_0_7=(Token)match(input,31,FOLLOW_31_in_ruleMonth1456); 

                            newLeafNode(lv_name_0_7, grammarAccess.getMonthAccess().getNameJulKeyword_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:750:8: lv_name_0_8= 'Aug'
                    {
                    lv_name_0_8=(Token)match(input,32,FOLLOW_32_in_ruleMonth1485); 

                            newLeafNode(lv_name_0_8, grammarAccess.getMonthAccess().getNameAugKeyword_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:762:8: lv_name_0_9= 'Sep'
                    {
                    lv_name_0_9=(Token)match(input,33,FOLLOW_33_in_ruleMonth1514); 

                            newLeafNode(lv_name_0_9, grammarAccess.getMonthAccess().getNameSepKeyword_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:774:8: lv_name_0_10= 'Oct'
                    {
                    lv_name_0_10=(Token)match(input,34,FOLLOW_34_in_ruleMonth1543); 

                            newLeafNode(lv_name_0_10, grammarAccess.getMonthAccess().getNameOctKeyword_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:786:8: lv_name_0_11= 'Nov'
                    {
                    lv_name_0_11=(Token)match(input,35,FOLLOW_35_in_ruleMonth1572); 

                            newLeafNode(lv_name_0_11, grammarAccess.getMonthAccess().getNameNovKeyword_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:798:8: lv_name_0_12= 'Dec'
                    {
                    lv_name_0_12=(Token)match(input,36,FOLLOW_36_in_ruleMonth1601); 

                            newLeafNode(lv_name_0_12, grammarAccess.getMonthAccess().getNameDecKeyword_0_11());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_12, null);
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleMonth"


    // $ANTLR start "entryRuleEnforcement"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:821:1: entryRuleEnforcement returns [EObject current=null] : iv_ruleEnforcement= ruleEnforcement EOF ;
    public final EObject entryRuleEnforcement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnforcement = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:822:2: (iv_ruleEnforcement= ruleEnforcement EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:823:2: iv_ruleEnforcement= ruleEnforcement EOF
            {
             newCompositeNode(grammarAccess.getEnforcementRule()); 
            pushFollow(FOLLOW_ruleEnforcement_in_entryRuleEnforcement1652);
            iv_ruleEnforcement=ruleEnforcement();

            state._fsp--;

             current =iv_ruleEnforcement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnforcement1662); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:830:1: ruleEnforcement returns [EObject current=null] : (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) ) otherlv_11= '};' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:833:28: ( (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) ) otherlv_11= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:834:1: (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) ) otherlv_11= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:834:1: (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) ) otherlv_11= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:834:3: otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) ) otherlv_11= '};'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleEnforcement1699); 

                	newLeafNode(otherlv_0, grammarAccess.getEnforcementAccess().getEnforcementKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:838:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:839:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:839:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:840:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnforcement1716); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEnforcement1733); 

                	newLeafNode(otherlv_2, grammarAccess.getEnforcementAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleEnforcement1745); 

                	newLeafNode(otherlv_3, grammarAccess.getEnforcementAccess().getNameKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:864:1: ( (lv_enforcementName_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:865:1: (lv_enforcementName_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:865:1: (lv_enforcementName_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:866:3: lv_enforcementName_4_0= RULE_STRING
            {
            lv_enforcementName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnforcement1762); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEnforcement1779); 

                	newLeafNode(otherlv_5, grammarAccess.getEnforcementAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleEnforcement1791); 

                	newLeafNode(otherlv_6, grammarAccess.getEnforcementAccess().getDescriptionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:890:1: ( (lv_description_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:891:1: (lv_description_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:891:1: (lv_description_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:892:3: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnforcement1808); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleEnforcement1825); 

                	newLeafNode(otherlv_8, grammarAccess.getEnforcementAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleEnforcement1837); 

                	newLeafNode(otherlv_9, grammarAccess.getEnforcementAccess().getTypeKeyword_9());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:916:1: ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:917:1: ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:917:1: ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:918:1: (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:918:1: (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt15=1;
                }
                break;
            case 42:
                {
                alt15=2;
                }
                break;
            case 43:
                {
                alt15=3;
                }
                break;
            case 44:
                {
                alt15=4;
                }
                break;
            case 45:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:919:3: lv_type_10_1= 'Action'
                    {
                    lv_type_10_1=(Token)match(input,41,FOLLOW_41_in_ruleEnforcement1857); 

                            newLeafNode(lv_type_10_1, grammarAccess.getEnforcementAccess().getTypeActionKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:931:8: lv_type_10_2= 'Algorithm'
                    {
                    lv_type_10_2=(Token)match(input,42,FOLLOW_42_in_ruleEnforcement1886); 

                            newLeafNode(lv_type_10_2, grammarAccess.getEnforcementAccess().getTypeAlgorithmKeyword_10_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:943:8: lv_type_10_3= 'Config'
                    {
                    lv_type_10_3=(Token)match(input,43,FOLLOW_43_in_ruleEnforcement1915); 

                            newLeafNode(lv_type_10_3, grammarAccess.getEnforcementAccess().getTypeConfigKeyword_10_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:955:8: lv_type_10_4= 'Process'
                    {
                    lv_type_10_4=(Token)match(input,44,FOLLOW_44_in_ruleEnforcement1944); 

                            newLeafNode(lv_type_10_4, grammarAccess.getEnforcementAccess().getTypeProcessKeyword_10_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:967:8: lv_type_10_5= 'Tool'
                    {
                    lv_type_10_5=(Token)match(input,45,FOLLOW_45_in_ruleEnforcement1973); 

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

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleEnforcement2001); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:994:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:995:2: (iv_ruleService= ruleService EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:996:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService2037);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2047); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1003:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicePart_13_0= ruleServicePart ) )* )? otherlv_14= '};' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1006:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicePart_13_0= ruleServicePart ) )* )? otherlv_14= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1007:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicePart_13_0= ruleServicePart ) )* )? otherlv_14= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1007:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicePart_13_0= ruleServicePart ) )* )? otherlv_14= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1007:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicePart_13_0= ruleServicePart ) )* )? otherlv_14= '};'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleService2084); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1011:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1012:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1012:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1013:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2101); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleService2118); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleService2130); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getNameKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1037:1: ( (lv_serviceName_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1038:1: (lv_serviceName_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1038:1: (lv_serviceName_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1039:3: lv_serviceName_4_0= RULE_STRING
            {
            lv_serviceName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService2147); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleService2164); 

                	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getCommaKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1059:1: (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1059:3: otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ','
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleService2177); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getDescriptionKeyword_6_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1063:1: ( (lv_description_7_0= RULE_STRING ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1064:1: (lv_description_7_0= RULE_STRING )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1064:1: (lv_description_7_0= RULE_STRING )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1065:3: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService2194); 

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

                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleService2211); 

                        	newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getCommaKeyword_6_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1085:3: (otherlv_9= 'RefersTo PrivateData' ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1085:5: otherlv_9= 'RefersTo PrivateData' ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleService2226); 

                        	newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRefersToPrivateDataKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1089:1: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1090:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1090:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1091:3: lv_refPrivateData_10_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceAccess().getRefPrivateDataRefPrivateDataParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleService2247);
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
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleService2260); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getCommaKeyword_7_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1111:3: (otherlv_12= 'Service_Part' ( (lv_servicePart_13_0= ruleServicePart ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==48) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1111:5: otherlv_12= 'Service_Part' ( (lv_servicePart_13_0= ruleServicePart ) )*
                    {
                    otherlv_12=(Token)match(input,48,FOLLOW_48_in_ruleService2275); 

                        	newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getService_PartKeyword_8_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1115:1: ( (lv_servicePart_13_0= ruleServicePart ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1116:1: (lv_servicePart_13_0= ruleServicePart )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1116:1: (lv_servicePart_13_0= ruleServicePart )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1117:3: lv_servicePart_13_0= ruleServicePart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceAccess().getServicePartServicePartParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleServicePart_in_ruleService2296);
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleService2311); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1145:1: entryRuleRecipient returns [EObject current=null] : iv_ruleRecipient= ruleRecipient EOF ;
    public final EObject entryRuleRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipient = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1146:2: (iv_ruleRecipient= ruleRecipient EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1147:2: iv_ruleRecipient= ruleRecipient EOF
            {
             newCompositeNode(grammarAccess.getRecipientRule()); 
            pushFollow(FOLLOW_ruleRecipient_in_entryRuleRecipient2347);
            iv_ruleRecipient=ruleRecipient();

            state._fsp--;

             current =iv_ruleRecipient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipient2357); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1154:1: ruleRecipient returns [EObject current=null] : (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1157:28: ( (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1158:1: (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1158:1: (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1158:3: otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleRecipient2394); 

                	newLeafNode(otherlv_0, grammarAccess.getRecipientAccess().getRecipientKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1162:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1163:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1163:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1164:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipient2411); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRecipient2428); 

                	newLeafNode(otherlv_2, grammarAccess.getRecipientAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleRecipient2440); 

                	newLeafNode(otherlv_3, grammarAccess.getRecipientAccess().getNameKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1188:1: ( (lv_recipientName_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1189:1: (lv_recipientName_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1189:1: (lv_recipientName_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1190:3: lv_recipientName_4_0= RULE_STRING
            {
            lv_recipientName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecipient2457); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRecipient2474); 

                	newLeafNode(otherlv_5, grammarAccess.getRecipientAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleRecipient2486); 

                	newLeafNode(otherlv_6, grammarAccess.getRecipientAccess().getDescriptionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1214:1: ( (lv_description_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1215:1: (lv_description_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1215:1: (lv_description_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1216:3: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecipient2503); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleRecipient2520); 

                	newLeafNode(otherlv_8, grammarAccess.getRecipientAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1236:1: (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==50) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1236:3: otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,50,FOLLOW_50_in_ruleRecipient2533); 

                        	newLeafNode(otherlv_9, grammarAccess.getRecipientAccess().getRecipient_PartKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1240:1: ( (lv_recipientPart_10_0= ruleRecipientPart ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1241:1: (lv_recipientPart_10_0= ruleRecipientPart )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1241:1: (lv_recipientPart_10_0= ruleRecipientPart )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1242:3: lv_recipientPart_10_0= ruleRecipientPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRecipientAccess().getRecipientPartRecipientPartParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRecipientPart_in_ruleRecipient2554);
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
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleRecipient2567); 

                        	newLeafNode(otherlv_11, grammarAccess.getRecipientAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,51,FOLLOW_51_in_ruleRecipient2581); 

                	newLeafNode(otherlv_12, grammarAccess.getRecipientAccess().getScopeKeyword_10());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1266:1: ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1267:1: ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1267:1: ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1268:1: (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1268:1: (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt23=1;
                }
                break;
            case 53:
                {
                alt23=2;
                }
                break;
            case 54:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1269:3: lv_scope_13_1= 'Internal'
                    {
                    lv_scope_13_1=(Token)match(input,52,FOLLOW_52_in_ruleRecipient2601); 

                            newLeafNode(lv_scope_13_1, grammarAccess.getRecipientAccess().getScopeInternalKeyword_11_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "scope", lv_scope_13_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1281:8: lv_scope_13_2= 'External'
                    {
                    lv_scope_13_2=(Token)match(input,53,FOLLOW_53_in_ruleRecipient2630); 

                            newLeafNode(lv_scope_13_2, grammarAccess.getRecipientAccess().getScopeExternalKeyword_11_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "scope", lv_scope_13_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1293:8: lv_scope_13_3= 'Internal/External'
                    {
                    lv_scope_13_3=(Token)match(input,54,FOLLOW_54_in_ruleRecipient2659); 

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

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleRecipient2687); 

                	newLeafNode(otherlv_14, grammarAccess.getRecipientAccess().getCommaKeyword_12());
                
            otherlv_15=(Token)match(input,40,FOLLOW_40_in_ruleRecipient2699); 

                	newLeafNode(otherlv_15, grammarAccess.getRecipientAccess().getTypeKeyword_13());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1316:1: ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1317:1: ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1317:1: ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1318:1: (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1318:1: (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt24=1;
                }
                break;
            case 56:
                {
                alt24=2;
                }
                break;
            case 57:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1319:3: lv_type_16_1= 'Individual'
                    {
                    lv_type_16_1=(Token)match(input,55,FOLLOW_55_in_ruleRecipient2719); 

                            newLeafNode(lv_type_16_1, grammarAccess.getRecipientAccess().getTypeIndividualKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_16_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1331:8: lv_type_16_2= 'Organization'
                    {
                    lv_type_16_2=(Token)match(input,56,FOLLOW_56_in_ruleRecipient2748); 

                            newLeafNode(lv_type_16_2, grammarAccess.getRecipientAccess().getTypeOrganizationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_16_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1343:8: lv_type_16_3= 'Individual/Organization'
                    {
                    lv_type_16_3=(Token)match(input,57,FOLLOW_57_in_ruleRecipient2777); 

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

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleRecipient2805); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1370:1: entryRulePrivateData returns [EObject current=null] : iv_rulePrivateData= rulePrivateData EOF ;
    public final EObject entryRulePrivateData() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateData = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1371:2: (iv_rulePrivateData= rulePrivateData EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1372:2: iv_rulePrivateData= rulePrivateData EOF
            {
             newCompositeNode(grammarAccess.getPrivateDataRule()); 
            pushFollow(FOLLOW_rulePrivateData_in_entryRulePrivateData2841);
            iv_rulePrivateData=rulePrivateData();

            state._fsp--;

             current =iv_rulePrivateData; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrivateData2851); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1379:1: rulePrivateData returns [EObject current=null] : (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1382:28: ( (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1383:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1383:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1383:3: otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_rulePrivateData2888); 

                	newLeafNode(otherlv_0, grammarAccess.getPrivateDataAccess().getPrivateDataKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1387:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1388:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1388:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1389:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrivateData2905); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePrivateData2922); 

                	newLeafNode(otherlv_2, grammarAccess.getPrivateDataAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,39,FOLLOW_39_in_rulePrivateData2934); 

                	newLeafNode(otherlv_3, grammarAccess.getPrivateDataAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1413:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1414:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1414:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1415:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrivateData2951); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_rulePrivateData2968); 

                	newLeafNode(otherlv_5, grammarAccess.getPrivateDataAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,40,FOLLOW_40_in_rulePrivateData2980); 

                	newLeafNode(otherlv_6, grammarAccess.getPrivateDataAccess().getTypeKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1439:1: ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1440:1: ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1440:1: ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1441:1: (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1441:1: (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==59) ) {
                alt25=1;
            }
            else if ( (LA25_0==60) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1442:3: lv_type_7_1= 'PersonalInformation'
                    {
                    lv_type_7_1=(Token)match(input,59,FOLLOW_59_in_rulePrivateData3000); 

                            newLeafNode(lv_type_7_1, grammarAccess.getPrivateDataAccess().getTypePersonalInformationKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrivateDataRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1454:8: lv_type_7_2= 'UsageInformation'
                    {
                    lv_type_7_2=(Token)match(input,60,FOLLOW_60_in_rulePrivateData3029); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_rulePrivateData3057); 

                	newLeafNode(otherlv_8, grammarAccess.getPrivateDataAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1473:1: ( (lv_attribute_9_0= ruleAttribute ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==61) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1474:1: (lv_attribute_9_0= ruleAttribute )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1474:1: (lv_attribute_9_0= ruleAttribute )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1475:3: lv_attribute_9_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrivateDataAccess().getAttributeAttributeParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePrivateData3078);
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
            	    break loop26;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_rulePrivateData3091); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1503:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1504:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1505:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute3127);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute3137); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1512:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1515:28: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1516:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1516:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1516:3: otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )?
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleAttribute3174); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1520:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1521:1: (lv_name_1_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1521:1: (lv_name_1_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1522:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute3191); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAttribute3208); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleAttribute3220); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1546:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1547:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1547:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1548:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute3237); 

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

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleAttribute3254); 

                	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1568:1: (otherlv_6= ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1568:3: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleAttribute3267); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1580:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1581:2: (iv_ruleCollection= ruleCollection EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1582:2: iv_ruleCollection= ruleCollection EOF
            {
             newCompositeNode(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection3305);
            iv_ruleCollection=ruleCollection();

            state._fsp--;

             current =iv_ruleCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection3315); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1589:1: ruleCollection returns [EObject current=null] : (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1592:28: ( (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1593:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1593:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1593:3: otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleCollection3352); 

                	newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getCollectionKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1597:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1598:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1598:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1599:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollection3369); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCollection3386); 

                	newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleCollection3398); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1623:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1624:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1624:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1625:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection3415); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleCollection3432); 

                	newLeafNode(otherlv_5, grammarAccess.getCollectionAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleCollection3444); 

                	newLeafNode(otherlv_6, grammarAccess.getCollectionAccess().getConditionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1649:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1650:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1650:1: (lv_condition_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1651:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection3461); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleCollection3478); 

                	newLeafNode(otherlv_8, grammarAccess.getCollectionAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1671:1: (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==64) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1671:3: otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,64,FOLLOW_64_in_ruleCollection3491); 

                        	newLeafNode(otherlv_9, grammarAccess.getCollectionAccess().getPartOfCollectionKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1675:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1676:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1676:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1677:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollection3511); 

                    		newLeafNode(otherlv_10, grammarAccess.getCollectionAccess().getPartCollectionCollectionCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleCollection3523); 

                        	newLeafNode(otherlv_11, grammarAccess.getCollectionAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1692:3: (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1692:5: otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,47,FOLLOW_47_in_ruleCollection3538); 

                        	newLeafNode(otherlv_12, grammarAccess.getCollectionAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1696:1: ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1697:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1697:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1698:3: lv_refPrivateData_13_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefPrivateDataRefPrivateDataParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleCollection3559);
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
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleCollection3572); 

                        	newLeafNode(otherlv_14, grammarAccess.getCollectionAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1718:3: (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==65) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1718:5: otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,65,FOLLOW_65_in_ruleCollection3587); 

                        	newLeafNode(otherlv_15, grammarAccess.getCollectionAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1722:1: ( (lv_refService_16_0= ruleRefService ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1723:1: (lv_refService_16_0= ruleRefService )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1723:1: (lv_refService_16_0= ruleRefService )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1724:3: lv_refService_16_0= ruleRefService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefServiceRefServiceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefService_in_ruleCollection3608);
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
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleCollection3621); 

                        	newLeafNode(otherlv_17, grammarAccess.getCollectionAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1744:3: (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==66) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1744:5: otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,66,FOLLOW_66_in_ruleCollection3636); 

                        	newLeafNode(otherlv_18, grammarAccess.getCollectionAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1748:1: ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_ID) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1749:1: (lv_refEnforcement_19_0= ruleRefEnforcement )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1749:1: (lv_refEnforcement_19_0= ruleRefEnforcement )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1750:3: lv_refEnforcement_19_0= ruleRefEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefEnforcementRefEnforcementParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleCollection3657);
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
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleCollection3670); 

                        	newLeafNode(otherlv_20, grammarAccess.getCollectionAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,67,FOLLOW_67_in_ruleCollection3684); 

                	newLeafNode(otherlv_21, grammarAccess.getCollectionAccess().getModalityKeyword_13());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1774:1: ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1775:1: ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1775:1: ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1776:1: (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1776:1: (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt35=1;
                }
                break;
            case 69:
                {
                alt35=2;
                }
                break;
            case 70:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1777:3: lv_modality_22_1= 'Permitted'
                    {
                    lv_modality_22_1=(Token)match(input,68,FOLLOW_68_in_ruleCollection3704); 

                            newLeafNode(lv_modality_22_1, grammarAccess.getCollectionAccess().getModalityPermittedKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_22_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1789:8: lv_modality_22_2= 'Obligation'
                    {
                    lv_modality_22_2=(Token)match(input,69,FOLLOW_69_in_ruleCollection3733); 

                            newLeafNode(lv_modality_22_2, grammarAccess.getCollectionAccess().getModalityObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_22_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1801:8: lv_modality_22_3= 'Forbidden'
                    {
                    lv_modality_22_3=(Token)match(input,70,FOLLOW_70_in_ruleCollection3762); 

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

            otherlv_23=(Token)match(input,13,FOLLOW_13_in_ruleCollection3790); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1828:1: entryRuleDisclosure returns [EObject current=null] : iv_ruleDisclosure= ruleDisclosure EOF ;
    public final EObject entryRuleDisclosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisclosure = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1829:2: (iv_ruleDisclosure= ruleDisclosure EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1830:2: iv_ruleDisclosure= ruleDisclosure EOF
            {
             newCompositeNode(grammarAccess.getDisclosureRule()); 
            pushFollow(FOLLOW_ruleDisclosure_in_entryRuleDisclosure3826);
            iv_ruleDisclosure=ruleDisclosure();

            state._fsp--;

             current =iv_ruleDisclosure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisclosure3836); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1837:1: ruleDisclosure returns [EObject current=null] : (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_refRecipient_13_0= ruleRefRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refService_25_0= ruleRefService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) ) ) otherlv_32= '};' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1840:28: ( (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_refRecipient_13_0= ruleRefRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refService_25_0= ruleRefService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) ) ) otherlv_32= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1841:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_refRecipient_13_0= ruleRefRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refService_25_0= ruleRefService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) ) ) otherlv_32= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1841:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_refRecipient_13_0= ruleRefRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refService_25_0= ruleRefService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) ) ) otherlv_32= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1841:3: otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_refRecipient_13_0= ruleRefRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refService_25_0= ruleRefService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) ) ) otherlv_32= '};'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleDisclosure3873); 

                	newLeafNode(otherlv_0, grammarAccess.getDisclosureAccess().getDisclosureKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1845:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1846:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1846:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1847:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisclosure3890); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDisclosure3907); 

                	newLeafNode(otherlv_2, grammarAccess.getDisclosureAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleDisclosure3919); 

                	newLeafNode(otherlv_3, grammarAccess.getDisclosureAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1871:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1872:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1872:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1873:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure3936); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3953); 

                	newLeafNode(otherlv_5, grammarAccess.getDisclosureAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleDisclosure3965); 

                	newLeafNode(otherlv_6, grammarAccess.getDisclosureAccess().getConditionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1897:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1898:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1898:1: (lv_condition_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1899:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure3982); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3999); 

                	newLeafNode(otherlv_8, grammarAccess.getDisclosureAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1919:1: (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==72) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1919:3: otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,72,FOLLOW_72_in_ruleDisclosure4012); 

                        	newLeafNode(otherlv_9, grammarAccess.getDisclosureAccess().getPartOfDisclosureKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1923:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1924:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1924:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1925:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisclosure4032); 

                    		newLeafNode(otherlv_10, grammarAccess.getDisclosureAccess().getPartDisclosureDisclosureCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4044); 

                        	newLeafNode(otherlv_11, grammarAccess.getDisclosureAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1940:3: (otherlv_12= 'RefersTo Recipient' ( (lv_refRecipient_13_0= ruleRefRecipient ) )* otherlv_14= ',' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==73) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1940:5: otherlv_12= 'RefersTo Recipient' ( (lv_refRecipient_13_0= ruleRefRecipient ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,73,FOLLOW_73_in_ruleDisclosure4059); 

                        	newLeafNode(otherlv_12, grammarAccess.getDisclosureAccess().getRefersToRecipientKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1944:1: ( (lv_refRecipient_13_0= ruleRefRecipient ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ID) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1945:1: (lv_refRecipient_13_0= ruleRefRecipient )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1945:1: (lv_refRecipient_13_0= ruleRefRecipient )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1946:3: lv_refRecipient_13_0= ruleRefRecipient
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefRecipientRefRecipientParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefRecipient_in_ruleDisclosure4080);
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
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4093); 

                        	newLeafNode(otherlv_14, grammarAccess.getDisclosureAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1966:3: (otherlv_15= 'RefersTo Recipient-Source' ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )* otherlv_17= ',' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==74) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1966:5: otherlv_15= 'RefersTo Recipient-Source' ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,74,FOLLOW_74_in_ruleDisclosure4108); 

                        	newLeafNode(otherlv_15, grammarAccess.getDisclosureAccess().getRefersToRecipientSourceKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1970:1: ( (lv_refRecipientSource_16_0= ruleRefRecipientSource ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1971:1: (lv_refRecipientSource_16_0= ruleRefRecipientSource )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1971:1: (lv_refRecipientSource_16_0= ruleRefRecipientSource )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1972:3: lv_refRecipientSource_16_0= ruleRefRecipientSource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefRecipientSourceRefRecipientSourceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefRecipientSource_in_ruleDisclosure4129);
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
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4142); 

                        	newLeafNode(otherlv_17, grammarAccess.getDisclosureAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1992:3: (otherlv_18= 'RefersTo Recipient-Target' ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )* otherlv_20= ',' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==75) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1992:5: otherlv_18= 'RefersTo Recipient-Target' ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,75,FOLLOW_75_in_ruleDisclosure4157); 

                        	newLeafNode(otherlv_18, grammarAccess.getDisclosureAccess().getRefersToRecipientTargetKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1996:1: ( (lv_refRecipientTarget_19_0= ruleRefRecipientTarget ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_ID) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1997:1: (lv_refRecipientTarget_19_0= ruleRefRecipientTarget )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1997:1: (lv_refRecipientTarget_19_0= ruleRefRecipientTarget )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1998:3: lv_refRecipientTarget_19_0= ruleRefRecipientTarget
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefRecipientTargetRefRecipientTargetParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefRecipientTarget_in_ruleDisclosure4178);
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
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4191); 

                        	newLeafNode(otherlv_20, grammarAccess.getDisclosureAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2018:3: (otherlv_21= 'RefersTo PrivateData' ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2018:5: otherlv_21= 'RefersTo PrivateData' ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )* otherlv_23= ','
                    {
                    otherlv_21=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure4206); 

                        	newLeafNode(otherlv_21, grammarAccess.getDisclosureAccess().getRefersToPrivateDataKeyword_13_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2022:1: ( (lv_refPrivateData_22_0= ruleRefPrivateData ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_ID) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2023:1: (lv_refPrivateData_22_0= ruleRefPrivateData )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2023:1: (lv_refPrivateData_22_0= ruleRefPrivateData )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2024:3: lv_refPrivateData_22_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefPrivateDataRefPrivateDataParserRuleCall_13_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleDisclosure4227);
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
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4240); 

                        	newLeafNode(otherlv_23, grammarAccess.getDisclosureAccess().getCommaKeyword_13_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2044:3: (otherlv_24= 'RefersTo Service' ( (lv_refService_25_0= ruleRefService ) )* otherlv_26= ',' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==65) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2044:5: otherlv_24= 'RefersTo Service' ( (lv_refService_25_0= ruleRefService ) )* otherlv_26= ','
                    {
                    otherlv_24=(Token)match(input,65,FOLLOW_65_in_ruleDisclosure4255); 

                        	newLeafNode(otherlv_24, grammarAccess.getDisclosureAccess().getRefersToServiceKeyword_14_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2048:1: ( (lv_refService_25_0= ruleRefService ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_ID) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2049:1: (lv_refService_25_0= ruleRefService )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2049:1: (lv_refService_25_0= ruleRefService )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2050:3: lv_refService_25_0= ruleRefService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefServiceRefServiceParserRuleCall_14_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefService_in_ruleDisclosure4276);
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
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4289); 

                        	newLeafNode(otherlv_26, grammarAccess.getDisclosureAccess().getCommaKeyword_14_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2070:3: (otherlv_27= 'RefersTo Enforcement' ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )* otherlv_29= ',' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==66) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2070:5: otherlv_27= 'RefersTo Enforcement' ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )* otherlv_29= ','
                    {
                    otherlv_27=(Token)match(input,66,FOLLOW_66_in_ruleDisclosure4304); 

                        	newLeafNode(otherlv_27, grammarAccess.getDisclosureAccess().getRefersToEnforcementKeyword_15_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2074:1: ( (lv_refEnforcement_28_0= ruleRefEnforcement ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==RULE_ID) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2075:1: (lv_refEnforcement_28_0= ruleRefEnforcement )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2075:1: (lv_refEnforcement_28_0= ruleRefEnforcement )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2076:3: lv_refEnforcement_28_0= ruleRefEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefEnforcementRefEnforcementParserRuleCall_15_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleDisclosure4325);
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
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4338); 

                        	newLeafNode(otherlv_29, grammarAccess.getDisclosureAccess().getCommaKeyword_15_2());
                        

                    }
                    break;

            }

            otherlv_30=(Token)match(input,67,FOLLOW_67_in_ruleDisclosure4352); 

                	newLeafNode(otherlv_30, grammarAccess.getDisclosureAccess().getModalityKeyword_16());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2100:1: ( ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2101:1: ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2101:1: ( (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2102:1: (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2102:1: (lv_modality_31_1= 'Permitted' | lv_modality_31_2= 'Obligation' | lv_modality_31_3= 'Forbidden' )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt49=1;
                }
                break;
            case 69:
                {
                alt49=2;
                }
                break;
            case 70:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2103:3: lv_modality_31_1= 'Permitted'
                    {
                    lv_modality_31_1=(Token)match(input,68,FOLLOW_68_in_ruleDisclosure4372); 

                            newLeafNode(lv_modality_31_1, grammarAccess.getDisclosureAccess().getModalityPermittedKeyword_17_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_31_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2115:8: lv_modality_31_2= 'Obligation'
                    {
                    lv_modality_31_2=(Token)match(input,69,FOLLOW_69_in_ruleDisclosure4401); 

                            newLeafNode(lv_modality_31_2, grammarAccess.getDisclosureAccess().getModalityObligationKeyword_17_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_31_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2127:8: lv_modality_31_3= 'Forbidden'
                    {
                    lv_modality_31_3=(Token)match(input,70,FOLLOW_70_in_ruleDisclosure4430); 

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

            otherlv_32=(Token)match(input,13,FOLLOW_13_in_ruleDisclosure4458); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2154:1: entryRuleRetention returns [EObject current=null] : iv_ruleRetention= ruleRetention EOF ;
    public final EObject entryRuleRetention() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetention = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2155:2: (iv_ruleRetention= ruleRetention EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2156:2: iv_ruleRetention= ruleRetention EOF
            {
             newCompositeNode(grammarAccess.getRetentionRule()); 
            pushFollow(FOLLOW_ruleRetention_in_entryRuleRetention4494);
            iv_ruleRetention=ruleRetention();

            state._fsp--;

             current =iv_ruleRetention; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRetention4504); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2163:1: ruleRetention returns [EObject current=null] : (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refService_19_0= ruleRefService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2166:28: ( (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refService_19_0= ruleRefService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2167:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refService_19_0= ruleRefService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2167:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refService_19_0= ruleRefService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2167:3: otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refService_19_0= ruleRefService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleRetention4541); 

                	newLeafNode(otherlv_0, grammarAccess.getRetentionAccess().getRetentionKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2171:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2172:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2172:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2173:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRetention4558); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRetention4575); 

                	newLeafNode(otherlv_2, grammarAccess.getRetentionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleRetention4587); 

                	newLeafNode(otherlv_3, grammarAccess.getRetentionAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2197:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2198:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2198:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2199:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention4604); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRetention4621); 

                	newLeafNode(otherlv_5, grammarAccess.getRetentionAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleRetention4633); 

                	newLeafNode(otherlv_6, grammarAccess.getRetentionAccess().getConditionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2223:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2224:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2224:1: (lv_condition_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2225:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention4650); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleRetention4667); 

                	newLeafNode(otherlv_8, grammarAccess.getRetentionAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2245:1: (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==77) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2245:3: otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,77,FOLLOW_77_in_ruleRetention4680); 

                        	newLeafNode(otherlv_9, grammarAccess.getRetentionAccess().getPartOfRetentionKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2249:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2250:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2250:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2251:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRetention4700); 

                    		newLeafNode(otherlv_10, grammarAccess.getRetentionAccess().getPartRetentionRetentionCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleRetention4712); 

                        	newLeafNode(otherlv_11, grammarAccess.getRetentionAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,78,FOLLOW_78_in_ruleRetention4726); 

                	newLeafNode(otherlv_12, grammarAccess.getRetentionAccess().getPeriodKeyword_10());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2270:1: ( (lv_period_13_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2271:1: (lv_period_13_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2271:1: (lv_period_13_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2272:3: lv_period_13_0= RULE_STRING
            {
            lv_period_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention4743); 

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

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleRetention4760); 

                	newLeafNode(otherlv_14, grammarAccess.getRetentionAccess().getCommaKeyword_12());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2292:1: (otherlv_15= 'RefersTo PrivateData' ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==47) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2292:3: otherlv_15= 'RefersTo PrivateData' ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,47,FOLLOW_47_in_ruleRetention4773); 

                        	newLeafNode(otherlv_15, grammarAccess.getRetentionAccess().getRefersToPrivateDataKeyword_13_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2296:1: ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==RULE_ID) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2297:1: (lv_refPrivateData_16_0= ruleRefPrivateData )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2297:1: (lv_refPrivateData_16_0= ruleRefPrivateData )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2298:3: lv_refPrivateData_16_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefPrivateDataRefPrivateDataParserRuleCall_13_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleRetention4794);
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
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleRetention4807); 

                        	newLeafNode(otherlv_17, grammarAccess.getRetentionAccess().getCommaKeyword_13_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2318:3: (otherlv_18= 'RefersTo Service' ( (lv_refService_19_0= ruleRefService ) )* otherlv_20= ',' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==65) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2318:5: otherlv_18= 'RefersTo Service' ( (lv_refService_19_0= ruleRefService ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,65,FOLLOW_65_in_ruleRetention4822); 

                        	newLeafNode(otherlv_18, grammarAccess.getRetentionAccess().getRefersToServiceKeyword_14_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2322:1: ( (lv_refService_19_0= ruleRefService ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==RULE_ID) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2323:1: (lv_refService_19_0= ruleRefService )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2323:1: (lv_refService_19_0= ruleRefService )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2324:3: lv_refService_19_0= ruleRefService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefServiceRefServiceParserRuleCall_14_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefService_in_ruleRetention4843);
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
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleRetention4856); 

                        	newLeafNode(otherlv_20, grammarAccess.getRetentionAccess().getCommaKeyword_14_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2344:3: (otherlv_21= 'RefersTo Enforcement' ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )* otherlv_23= ',' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==66) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2344:5: otherlv_21= 'RefersTo Enforcement' ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )* otherlv_23= ','
                    {
                    otherlv_21=(Token)match(input,66,FOLLOW_66_in_ruleRetention4871); 

                        	newLeafNode(otherlv_21, grammarAccess.getRetentionAccess().getRefersToEnforcementKeyword_15_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2348:1: ( (lv_refEnforcement_22_0= ruleRefEnforcement ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==RULE_ID) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2349:1: (lv_refEnforcement_22_0= ruleRefEnforcement )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2349:1: (lv_refEnforcement_22_0= ruleRefEnforcement )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2350:3: lv_refEnforcement_22_0= ruleRefEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefEnforcementRefEnforcementParserRuleCall_15_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleRetention4892);
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleRetention4905); 

                        	newLeafNode(otherlv_23, grammarAccess.getRetentionAccess().getCommaKeyword_15_2());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,67,FOLLOW_67_in_ruleRetention4919); 

                	newLeafNode(otherlv_24, grammarAccess.getRetentionAccess().getModalityKeyword_16());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2374:1: ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2375:1: ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2375:1: ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2376:1: (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2376:1: (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt57=1;
                }
                break;
            case 69:
                {
                alt57=2;
                }
                break;
            case 70:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2377:3: lv_modality_25_1= 'Permitted'
                    {
                    lv_modality_25_1=(Token)match(input,68,FOLLOW_68_in_ruleRetention4939); 

                            newLeafNode(lv_modality_25_1, grammarAccess.getRetentionAccess().getModalityPermittedKeyword_17_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_25_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2389:8: lv_modality_25_2= 'Obligation'
                    {
                    lv_modality_25_2=(Token)match(input,69,FOLLOW_69_in_ruleRetention4968); 

                            newLeafNode(lv_modality_25_2, grammarAccess.getRetentionAccess().getModalityObligationKeyword_17_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_25_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2401:8: lv_modality_25_3= 'Forbidden'
                    {
                    lv_modality_25_3=(Token)match(input,70,FOLLOW_70_in_ruleRetention4997); 

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

            otherlv_26=(Token)match(input,13,FOLLOW_13_in_ruleRetention5025); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2428:1: entryRuleUsage returns [EObject current=null] : iv_ruleUsage= ruleUsage EOF ;
    public final EObject entryRuleUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsage = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2429:2: (iv_ruleUsage= ruleUsage EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2430:2: iv_ruleUsage= ruleUsage EOF
            {
             newCompositeNode(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage5061);
            iv_ruleUsage=ruleUsage();

            state._fsp--;

             current =iv_ruleUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage5071); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2437:1: ruleUsage returns [EObject current=null] : (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2440:28: ( (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2441:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2441:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2441:3: otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleUsage5108); 

                	newLeafNode(otherlv_0, grammarAccess.getUsageAccess().getUsageKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2445:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2446:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2446:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2447:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage5125); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUsage5142); 

                	newLeafNode(otherlv_2, grammarAccess.getUsageAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleUsage5154); 

                	newLeafNode(otherlv_3, grammarAccess.getUsageAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2471:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2472:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2472:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2473:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage5171); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleUsage5188); 

                	newLeafNode(otherlv_5, grammarAccess.getUsageAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleUsage5200); 

                	newLeafNode(otherlv_6, grammarAccess.getUsageAccess().getConditionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2497:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2498:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2498:1: (lv_condition_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2499:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage5217); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleUsage5234); 

                	newLeafNode(otherlv_8, grammarAccess.getUsageAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2519:1: (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==80) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2519:3: otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,80,FOLLOW_80_in_ruleUsage5247); 

                        	newLeafNode(otherlv_9, grammarAccess.getUsageAccess().getPartOfUsageKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2523:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2524:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2524:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2525:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage5267); 

                    		newLeafNode(otherlv_10, grammarAccess.getUsageAccess().getPartUsageUsageCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleUsage5279); 

                        	newLeafNode(otherlv_11, grammarAccess.getUsageAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2540:3: (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==47) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2540:5: otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,47,FOLLOW_47_in_ruleUsage5294); 

                        	newLeafNode(otherlv_12, grammarAccess.getUsageAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2544:1: ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_ID) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2545:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2545:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2546:3: lv_refPrivateData_13_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefPrivateDataRefPrivateDataParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleUsage5315);
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
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleUsage5328); 

                        	newLeafNode(otherlv_14, grammarAccess.getUsageAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2566:3: (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==65) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2566:5: otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,65,FOLLOW_65_in_ruleUsage5343); 

                        	newLeafNode(otherlv_15, grammarAccess.getUsageAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2570:1: ( (lv_refService_16_0= ruleRefService ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==RULE_ID) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2571:1: (lv_refService_16_0= ruleRefService )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2571:1: (lv_refService_16_0= ruleRefService )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2572:3: lv_refService_16_0= ruleRefService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefServiceRefServiceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefService_in_ruleUsage5364);
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
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleUsage5377); 

                        	newLeafNode(otherlv_17, grammarAccess.getUsageAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2592:3: (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==66) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2592:5: otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,66,FOLLOW_66_in_ruleUsage5392); 

                        	newLeafNode(otherlv_18, grammarAccess.getUsageAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2596:1: ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==RULE_ID) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2597:1: (lv_refEnforcement_19_0= ruleRefEnforcement )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2597:1: (lv_refEnforcement_19_0= ruleRefEnforcement )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2598:3: lv_refEnforcement_19_0= ruleRefEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefEnforcementRefEnforcementParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleUsage5413);
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
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleUsage5426); 

                        	newLeafNode(otherlv_20, grammarAccess.getUsageAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,67,FOLLOW_67_in_ruleUsage5440); 

                	newLeafNode(otherlv_21, grammarAccess.getUsageAccess().getModalityKeyword_13());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2622:1: ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2623:1: ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2623:1: ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2624:1: (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2624:1: (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt65=1;
                }
                break;
            case 69:
                {
                alt65=2;
                }
                break;
            case 70:
                {
                alt65=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2625:3: lv_modality_22_1= 'Permitted'
                    {
                    lv_modality_22_1=(Token)match(input,68,FOLLOW_68_in_ruleUsage5460); 

                            newLeafNode(lv_modality_22_1, grammarAccess.getUsageAccess().getModalityPermittedKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_22_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2637:8: lv_modality_22_2= 'Obligation'
                    {
                    lv_modality_22_2=(Token)match(input,69,FOLLOW_69_in_ruleUsage5489); 

                            newLeafNode(lv_modality_22_2, grammarAccess.getUsageAccess().getModalityObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_22_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2649:8: lv_modality_22_3= 'Forbidden'
                    {
                    lv_modality_22_3=(Token)match(input,70,FOLLOW_70_in_ruleUsage5518); 

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

            otherlv_23=(Token)match(input,13,FOLLOW_13_in_ruleUsage5546); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2676:1: entryRuleInformative returns [EObject current=null] : iv_ruleInformative= ruleInformative EOF ;
    public final EObject entryRuleInformative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformative = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2677:2: (iv_ruleInformative= ruleInformative EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2678:2: iv_ruleInformative= ruleInformative EOF
            {
             newCompositeNode(grammarAccess.getInformativeRule()); 
            pushFollow(FOLLOW_ruleInformative_in_entryRuleInformative5582);
            iv_ruleInformative=ruleInformative();

            state._fsp--;

             current =iv_ruleInformative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInformative5592); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2685:1: ruleInformative returns [EObject current=null] : (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2688:28: ( (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2689:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2689:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2689:3: otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) ) otherlv_23= '};'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleInformative5629); 

                	newLeafNode(otherlv_0, grammarAccess.getInformativeAccess().getInformativeKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2693:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2694:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2694:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2695:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformative5646); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInformative5663); 

                	newLeafNode(otherlv_2, grammarAccess.getInformativeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleInformative5675); 

                	newLeafNode(otherlv_3, grammarAccess.getInformativeAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2719:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2720:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2720:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2721:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative5692); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleInformative5709); 

                	newLeafNode(otherlv_5, grammarAccess.getInformativeAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleInformative5721); 

                	newLeafNode(otherlv_6, grammarAccess.getInformativeAccess().getConditionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2745:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2746:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2746:1: (lv_condition_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2747:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative5738); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleInformative5755); 

                	newLeafNode(otherlv_8, grammarAccess.getInformativeAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2767:1: (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==82) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2767:3: otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,82,FOLLOW_82_in_ruleInformative5768); 

                        	newLeafNode(otherlv_9, grammarAccess.getInformativeAccess().getPartOfInformativeKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2771:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2772:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2772:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2773:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformative5788); 

                    		newLeafNode(otherlv_10, grammarAccess.getInformativeAccess().getPartInformativeInformativeCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleInformative5800); 

                        	newLeafNode(otherlv_11, grammarAccess.getInformativeAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2788:3: (otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==47) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2788:5: otherlv_12= 'RefersTo PrivateData' ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,47,FOLLOW_47_in_ruleInformative5815); 

                        	newLeafNode(otherlv_12, grammarAccess.getInformativeAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2792:1: ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==RULE_ID) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2793:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2793:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2794:3: lv_refPrivateData_13_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefPrivateDataRefPrivateDataParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleInformative5836);
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
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleInformative5849); 

                        	newLeafNode(otherlv_14, grammarAccess.getInformativeAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2814:3: (otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ',' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==65) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2814:5: otherlv_15= 'RefersTo Service' ( (lv_refService_16_0= ruleRefService ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,65,FOLLOW_65_in_ruleInformative5864); 

                        	newLeafNode(otherlv_15, grammarAccess.getInformativeAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2818:1: ( (lv_refService_16_0= ruleRefService ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==RULE_ID) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2819:1: (lv_refService_16_0= ruleRefService )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2819:1: (lv_refService_16_0= ruleRefService )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2820:3: lv_refService_16_0= ruleRefService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefServiceRefServiceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefService_in_ruleInformative5885);
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
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleInformative5898); 

                        	newLeafNode(otherlv_17, grammarAccess.getInformativeAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2840:3: (otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ',' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==66) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2840:5: otherlv_18= 'RefersTo Enforcement' ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,66,FOLLOW_66_in_ruleInformative5913); 

                        	newLeafNode(otherlv_18, grammarAccess.getInformativeAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2844:1: ( (lv_refEnforcement_19_0= ruleRefEnforcement ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==RULE_ID) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2845:1: (lv_refEnforcement_19_0= ruleRefEnforcement )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2845:1: (lv_refEnforcement_19_0= ruleRefEnforcement )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2846:3: lv_refEnforcement_19_0= ruleRefEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefEnforcementRefEnforcementParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleInformative5934);
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
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleInformative5947); 

                        	newLeafNode(otherlv_20, grammarAccess.getInformativeAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,67,FOLLOW_67_in_ruleInformative5961); 

                	newLeafNode(otherlv_21, grammarAccess.getInformativeAccess().getModalityKeyword_13());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2870:1: ( ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2871:1: ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2871:1: ( (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2872:1: (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2872:1: (lv_modality_22_1= 'Permitted' | lv_modality_22_2= 'Obligation' | lv_modality_22_3= 'Forbidden' )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt73=1;
                }
                break;
            case 69:
                {
                alt73=2;
                }
                break;
            case 70:
                {
                alt73=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2873:3: lv_modality_22_1= 'Permitted'
                    {
                    lv_modality_22_1=(Token)match(input,68,FOLLOW_68_in_ruleInformative5981); 

                            newLeafNode(lv_modality_22_1, grammarAccess.getInformativeAccess().getModalityPermittedKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_22_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2885:8: lv_modality_22_2= 'Obligation'
                    {
                    lv_modality_22_2=(Token)match(input,69,FOLLOW_69_in_ruleInformative6010); 

                            newLeafNode(lv_modality_22_2, grammarAccess.getInformativeAccess().getModalityObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_22_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2897:8: lv_modality_22_3= 'Forbidden'
                    {
                    lv_modality_22_3=(Token)match(input,70,FOLLOW_70_in_ruleInformative6039); 

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

            otherlv_23=(Token)match(input,13,FOLLOW_13_in_ruleInformative6067); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2924:1: entryRuleRecipientPart returns [EObject current=null] : iv_ruleRecipientPart= ruleRecipientPart EOF ;
    public final EObject entryRuleRecipientPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipientPart = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2925:2: (iv_ruleRecipientPart= ruleRecipientPart EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2926:2: iv_ruleRecipientPart= ruleRecipientPart EOF
            {
             newCompositeNode(grammarAccess.getRecipientPartRule()); 
            pushFollow(FOLLOW_ruleRecipientPart_in_entryRuleRecipientPart6103);
            iv_ruleRecipientPart=ruleRecipientPart();

            state._fsp--;

             current =iv_ruleRecipientPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipientPart6113); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2933:1: ruleRecipientPart returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRecipientPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2936:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2937:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2937:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2937:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2937:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2938:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2938:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2939:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRecipientPartRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipientPart6158); 

            		newLeafNode(otherlv_0, grammarAccess.getRecipientPartAccess().getRecipientPartRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2950:2: (otherlv_1= '-' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==24) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2950:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleRecipientPart6171); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2962:1: entryRuleRefRecipient returns [EObject current=null] : iv_ruleRefRecipient= ruleRefRecipient EOF ;
    public final EObject entryRuleRefRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefRecipient = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2963:2: (iv_ruleRefRecipient= ruleRefRecipient EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2964:2: iv_ruleRefRecipient= ruleRefRecipient EOF
            {
             newCompositeNode(grammarAccess.getRefRecipientRule()); 
            pushFollow(FOLLOW_ruleRefRecipient_in_entryRuleRefRecipient6209);
            iv_ruleRefRecipient=ruleRefRecipient();

            state._fsp--;

             current =iv_ruleRefRecipient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefRecipient6219); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2971:1: ruleRefRecipient returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefRecipient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2974:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2975:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2975:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2975:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2975:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2976:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2976:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2977:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRecipientRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipient6264); 

            		newLeafNode(otherlv_0, grammarAccess.getRefRecipientAccess().getRefRecipientRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2988:2: (otherlv_1= '-' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==24) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2988:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleRefRecipient6277); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3000:1: entryRuleRefRecipientSource returns [EObject current=null] : iv_ruleRefRecipientSource= ruleRefRecipientSource EOF ;
    public final EObject entryRuleRefRecipientSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefRecipientSource = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3001:2: (iv_ruleRefRecipientSource= ruleRefRecipientSource EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3002:2: iv_ruleRefRecipientSource= ruleRefRecipientSource EOF
            {
             newCompositeNode(grammarAccess.getRefRecipientSourceRule()); 
            pushFollow(FOLLOW_ruleRefRecipientSource_in_entryRuleRefRecipientSource6315);
            iv_ruleRefRecipientSource=ruleRefRecipientSource();

            state._fsp--;

             current =iv_ruleRefRecipientSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefRecipientSource6325); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3009:1: ruleRefRecipientSource returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefRecipientSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3012:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3013:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3013:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3013:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3013:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3014:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3014:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3015:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRecipientSourceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipientSource6370); 

            		newLeafNode(otherlv_0, grammarAccess.getRefRecipientSourceAccess().getRefRecipientSourceRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3026:2: (otherlv_1= '-' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==24) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3026:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleRefRecipientSource6383); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3038:1: entryRuleRefRecipientTarget returns [EObject current=null] : iv_ruleRefRecipientTarget= ruleRefRecipientTarget EOF ;
    public final EObject entryRuleRefRecipientTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefRecipientTarget = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3039:2: (iv_ruleRefRecipientTarget= ruleRefRecipientTarget EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3040:2: iv_ruleRefRecipientTarget= ruleRefRecipientTarget EOF
            {
             newCompositeNode(grammarAccess.getRefRecipientTargetRule()); 
            pushFollow(FOLLOW_ruleRefRecipientTarget_in_entryRuleRefRecipientTarget6421);
            iv_ruleRefRecipientTarget=ruleRefRecipientTarget();

            state._fsp--;

             current =iv_ruleRefRecipientTarget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefRecipientTarget6431); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3047:1: ruleRefRecipientTarget returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefRecipientTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3050:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3051:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3051:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3051:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3051:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3052:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3052:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3053:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRecipientTargetRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipientTarget6476); 

            		newLeafNode(otherlv_0, grammarAccess.getRefRecipientTargetAccess().getRefRecipientTargetRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3064:2: (otherlv_1= '-' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==24) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3064:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleRefRecipientTarget6489); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3076:1: entryRuleRefService returns [EObject current=null] : iv_ruleRefService= ruleRefService EOF ;
    public final EObject entryRuleRefService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefService = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3077:2: (iv_ruleRefService= ruleRefService EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3078:2: iv_ruleRefService= ruleRefService EOF
            {
             newCompositeNode(grammarAccess.getRefServiceRule()); 
            pushFollow(FOLLOW_ruleRefService_in_entryRuleRefService6527);
            iv_ruleRefService=ruleRefService();

            state._fsp--;

             current =iv_ruleRefService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefService6537); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3085:1: ruleRefService returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3088:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3089:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3089:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3089:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3089:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3090:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3090:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3091:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefServiceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefService6582); 

            		newLeafNode(otherlv_0, grammarAccess.getRefServiceAccess().getRefServiceServiceCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3102:2: (otherlv_1= '-' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==24) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3102:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleRefService6595); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3114:1: entryRuleServicePart returns [EObject current=null] : iv_ruleServicePart= ruleServicePart EOF ;
    public final EObject entryRuleServicePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServicePart = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3115:2: (iv_ruleServicePart= ruleServicePart EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3116:2: iv_ruleServicePart= ruleServicePart EOF
            {
             newCompositeNode(grammarAccess.getServicePartRule()); 
            pushFollow(FOLLOW_ruleServicePart_in_entryRuleServicePart6633);
            iv_ruleServicePart=ruleServicePart();

            state._fsp--;

             current =iv_ruleServicePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServicePart6643); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3123:1: ruleServicePart returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleServicePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3126:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3127:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3127:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3127:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3127:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3128:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3128:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3129:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServicePartRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServicePart6688); 

            		newLeafNode(otherlv_0, grammarAccess.getServicePartAccess().getServicePartServiceCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3140:2: (otherlv_1= '-' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==24) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3140:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleServicePart6701); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3152:1: entryRuleRefPrivateData returns [EObject current=null] : iv_ruleRefPrivateData= ruleRefPrivateData EOF ;
    public final EObject entryRuleRefPrivateData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPrivateData = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3153:2: (iv_ruleRefPrivateData= ruleRefPrivateData EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3154:2: iv_ruleRefPrivateData= ruleRefPrivateData EOF
            {
             newCompositeNode(grammarAccess.getRefPrivateDataRule()); 
            pushFollow(FOLLOW_ruleRefPrivateData_in_entryRuleRefPrivateData6739);
            iv_ruleRefPrivateData=ruleRefPrivateData();

            state._fsp--;

             current =iv_ruleRefPrivateData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefPrivateData6749); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3161:1: ruleRefPrivateData returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefPrivateData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3164:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3165:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3165:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3165:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3165:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3166:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3166:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3167:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefPrivateDataRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefPrivateData6794); 

            		newLeafNode(otherlv_0, grammarAccess.getRefPrivateDataAccess().getRefPrivateDataPrivateDataCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3178:2: (otherlv_1= '-' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==24) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3178:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleRefPrivateData6807); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3190:1: entryRuleRefEnforcement returns [EObject current=null] : iv_ruleRefEnforcement= ruleRefEnforcement EOF ;
    public final EObject entryRuleRefEnforcement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefEnforcement = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3191:2: (iv_ruleRefEnforcement= ruleRefEnforcement EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3192:2: iv_ruleRefEnforcement= ruleRefEnforcement EOF
            {
             newCompositeNode(grammarAccess.getRefEnforcementRule()); 
            pushFollow(FOLLOW_ruleRefEnforcement_in_entryRuleRefEnforcement6845);
            iv_ruleRefEnforcement=ruleRefEnforcement();

            state._fsp--;

             current =iv_ruleRefEnforcement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefEnforcement6855); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3199:1: ruleRefEnforcement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefEnforcement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3202:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3203:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3203:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3203:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3203:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3204:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3204:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3205:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefEnforcementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefEnforcement6900); 

            		newLeafNode(otherlv_0, grammarAccess.getRefEnforcementAccess().getRefEnforcementEnforcementCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3216:2: (otherlv_1= '-' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==24) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3216:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleRefEnforcement6913); 

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
    public static final BitSet FOLLOW_12_in_rulePolicy155 = new BitSet(new long[]{0x440240200002A000L,0x0000000000029080L});
    public static final BitSet FOLLOW_ruleImport_in_rulePolicy176 = new BitSet(new long[]{0x440240200002A000L,0x0000000000029080L});
    public static final BitSet FOLLOW_ruleMetadata_in_rulePolicy198 = new BitSet(new long[]{0x4402402000002000L,0x0000000000029080L});
    public static final BitSet FOLLOW_ruleCollection_in_rulePolicy220 = new BitSet(new long[]{0x4402402000002000L,0x0000000000029080L});
    public static final BitSet FOLLOW_ruleDisclosure_in_rulePolicy242 = new BitSet(new long[]{0x0402402000002000L,0x0000000000029080L});
    public static final BitSet FOLLOW_ruleRetention_in_rulePolicy264 = new BitSet(new long[]{0x0402402000002000L,0x0000000000029000L});
    public static final BitSet FOLLOW_ruleUsage_in_rulePolicy286 = new BitSet(new long[]{0x0402402000002000L,0x0000000000028000L});
    public static final BitSet FOLLOW_ruleInformative_in_rulePolicy308 = new BitSet(new long[]{0x0402402000002000L,0x0000000000020000L});
    public static final BitSet FOLLOW_rulePrivateData_in_rulePolicy330 = new BitSet(new long[]{0x0402402000002000L});
    public static final BitSet FOLLOW_ruleRecipient_in_rulePolicy352 = new BitSet(new long[]{0x0002402000002000L});
    public static final BitSet FOLLOW_ruleService_in_rulePolicy374 = new BitSet(new long[]{0x0000402000002000L});
    public static final BitSet FOLLOW_ruleEnforcement_in_rulePolicy396 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_rulePolicy409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName497 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName531 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard741 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildcard760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_entryRuleMetadata802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadata812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMetadata849 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMetadata861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadata878 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMetadata895 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMetadata907 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadata924 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMetadata941 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMetadata953 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_ruleMetadata974 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMetadata986 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMetadata998 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadata1015 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMetadata1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate1068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1120 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDate1137 = new BitSet(new long[]{0x0000001FFE000000L});
    public static final BitSet FOLLOW_ruleMonth_in_ruleDate1158 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDate1170 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonth_in_entryRuleMonth1228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonth1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMonth1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMonth1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMonth1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMonth1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMonth1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMonth1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMonth1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMonth1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMonth1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMonth1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMonth1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMonth1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnforcement_in_entryRuleEnforcement1652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnforcement1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEnforcement1699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnforcement1716 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnforcement1733 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleEnforcement1745 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnforcement1762 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnforcement1779 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEnforcement1791 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnforcement1808 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnforcement1825 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEnforcement1837 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_41_in_ruleEnforcement1857 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_42_in_ruleEnforcement1886 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_43_in_ruleEnforcement1915 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_44_in_ruleEnforcement1944 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_45_in_ruleEnforcement1973 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnforcement2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleService2084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2101 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleService2118 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleService2130 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService2147 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleService2164 = new BitSet(new long[]{0x0001808000002000L});
    public static final BitSet FOLLOW_39_in_ruleService2177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService2194 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleService2211 = new BitSet(new long[]{0x0001800000002000L});
    public static final BitSet FOLLOW_47_in_ruleService2226 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleService2247 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleService2260 = new BitSet(new long[]{0x0001000000002000L});
    public static final BitSet FOLLOW_48_in_ruleService2275 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleServicePart_in_ruleService2296 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleService2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipient_in_entryRuleRecipient2347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipient2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRecipient2394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipient2411 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRecipient2428 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRecipient2440 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecipient2457 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecipient2474 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleRecipient2486 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecipient2503 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecipient2520 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_50_in_ruleRecipient2533 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRecipientPart_in_ruleRecipient2554 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRecipient2567 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleRecipient2581 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_52_in_ruleRecipient2601 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_53_in_ruleRecipient2630 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_54_in_ruleRecipient2659 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecipient2687 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleRecipient2699 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_55_in_ruleRecipient2719 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_56_in_ruleRecipient2748 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_57_in_ruleRecipient2777 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecipient2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrivateData_in_entryRulePrivateData2841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrivateData2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePrivateData2888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrivateData2905 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePrivateData2922 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePrivateData2934 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrivateData2951 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrivateData2968 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_rulePrivateData2980 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_59_in_rulePrivateData3000 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_60_in_rulePrivateData3029 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrivateData3057 = new BitSet(new long[]{0x2000000000002000L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePrivateData3078 = new BitSet(new long[]{0x2000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePrivateData3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute3127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleAttribute3174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute3191 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute3208 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleAttribute3220 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute3237 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAttribute3254 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAttribute3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection3305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleCollection3352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollection3369 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollection3386 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCollection3398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection3415 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection3432 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleCollection3444 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection3461 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection3478 = new BitSet(new long[]{0x0000800000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_64_in_ruleCollection3491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollection3511 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection3523 = new BitSet(new long[]{0x0000800000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_47_in_ruleCollection3538 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleCollection3559 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleCollection3572 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_65_in_ruleCollection3587 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleCollection3608 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleCollection3621 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_ruleCollection3636 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleCollection3657 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleCollection3670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleCollection3684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_68_in_ruleCollection3704 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_69_in_ruleCollection3733 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70_in_ruleCollection3762 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCollection3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisclosure_in_entryRuleDisclosure3826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisclosure3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDisclosure3873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisclosure3890 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDisclosure3907 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleDisclosure3919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure3936 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3953 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleDisclosure3965 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure3982 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3999 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000F0EL});
    public static final BitSet FOLLOW_72_in_ruleDisclosure4012 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisclosure4032 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4044 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000E0EL});
    public static final BitSet FOLLOW_73_in_ruleDisclosure4059 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefRecipient_in_ruleDisclosure4080 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4093 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000C0EL});
    public static final BitSet FOLLOW_74_in_ruleDisclosure4108 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefRecipientSource_in_ruleDisclosure4129 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4142 = new BitSet(new long[]{0x0000800000000000L,0x000000000000080EL});
    public static final BitSet FOLLOW_75_in_ruleDisclosure4157 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefRecipientTarget_in_ruleDisclosure4178 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4191 = new BitSet(new long[]{0x0000800000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_47_in_ruleDisclosure4206 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleDisclosure4227 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4240 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_65_in_ruleDisclosure4255 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleDisclosure4276 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4289 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_ruleDisclosure4304 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleDisclosure4325 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleDisclosure4352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_68_in_ruleDisclosure4372 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_69_in_ruleDisclosure4401 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70_in_ruleDisclosure4430 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDisclosure4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRetention_in_entryRuleRetention4494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRetention4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleRetention4541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRetention4558 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRetention4575 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleRetention4587 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention4604 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention4621 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleRetention4633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention4650 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention4667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_ruleRetention4680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRetention4700 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention4712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleRetention4726 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention4743 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention4760 = new BitSet(new long[]{0x0000800000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_47_in_ruleRetention4773 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleRetention4794 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRetention4807 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_65_in_ruleRetention4822 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleRetention4843 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRetention4856 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_ruleRetention4871 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleRetention4892 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRetention4905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleRetention4919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_68_in_ruleRetention4939 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_69_in_ruleRetention4968 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70_in_ruleRetention4997 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRetention5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage5061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleUsage5108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage5125 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUsage5142 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleUsage5154 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage5171 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage5188 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleUsage5200 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage5217 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage5234 = new BitSet(new long[]{0x0000800000000000L,0x000000000001000EL});
    public static final BitSet FOLLOW_80_in_ruleUsage5247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage5267 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage5279 = new BitSet(new long[]{0x0000800000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_47_in_ruleUsage5294 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleUsage5315 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleUsage5328 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_65_in_ruleUsage5343 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleUsage5364 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleUsage5377 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_ruleUsage5392 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleUsage5413 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleUsage5426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleUsage5440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_68_in_ruleUsage5460 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_69_in_ruleUsage5489 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70_in_ruleUsage5518 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUsage5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInformative_in_entryRuleInformative5582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInformative5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleInformative5629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformative5646 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInformative5663 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleInformative5675 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative5692 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative5709 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleInformative5721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative5738 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative5755 = new BitSet(new long[]{0x0000800000000000L,0x000000000004000EL});
    public static final BitSet FOLLOW_82_in_ruleInformative5768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformative5788 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative5800 = new BitSet(new long[]{0x0000800000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_47_in_ruleInformative5815 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleInformative5836 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleInformative5849 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_65_in_ruleInformative5864 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleInformative5885 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleInformative5898 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_ruleInformative5913 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleInformative5934 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleInformative5947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleInformative5961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_68_in_ruleInformative5981 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_69_in_ruleInformative6010 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70_in_ruleInformative6039 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInformative6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipientPart_in_entryRuleRecipientPart6103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipientPart6113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipientPart6158 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleRecipientPart6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefRecipient_in_entryRuleRefRecipient6209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefRecipient6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipient6264 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleRefRecipient6277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefRecipientSource_in_entryRuleRefRecipientSource6315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefRecipientSource6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipientSource6370 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleRefRecipientSource6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefRecipientTarget_in_entryRuleRefRecipientTarget6421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefRecipientTarget6431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipientTarget6476 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleRefRecipientTarget6489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefService_in_entryRuleRefService6527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefService6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefService6582 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleRefService6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServicePart_in_entryRuleServicePart6633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServicePart6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServicePart6688 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleServicePart6701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_entryRuleRefPrivateData6739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefPrivateData6749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefPrivateData6794 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleRefPrivateData6807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_entryRuleRefEnforcement6845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefEnforcement6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefEnforcement6900 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleRefEnforcement6913 = new BitSet(new long[]{0x0000000000000002L});

}