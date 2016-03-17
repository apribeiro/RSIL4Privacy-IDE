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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'};'", "'.'", "'import'", "'.*'", "'PolicyMetadata {'", "'PolicyName'", "','", "'Description'", "'Author(s)'", "'Organization(s)'", "'Date'", "'Version'", "'}'", "'-'", "'Jan'", "'Feb'", "'Mar'", "'Apr'", "'May'", "'Jun'", "'Jul'", "'Aug'", "'Sep'", "'Oct'", "'Nov'", "'Dec'", "'Enforcement'", "'Name'", "'Type'", "'Action'", "'Algorithm'", "'Config'", "'Process'", "'Tool'", "'Service'", "'RefersTo PrivateData'", "'All'", "'Service_Part'", "'Recipient'", "'Recipient_Part'", "'Scope'", "'Internal'", "'External'", "'Internal/External'", "'Individual'", "'Organization'", "'Individual/Organization'", "'PrivateData'", "'PersonalInformation'", "'UsageInformation'", "'Attribute'", "'Collection'", "'Condition'", "'PartOf Collection'", "'RefersTo Service'", "'RefersTo Enforcement'", "'Modality'", "'Permitted'", "'Obligation'", "'Forbidden'", "'Disclosure'", "'PartOf Disclosure'", "'RefersTo Recipient'", "'RefersTo Recipient-Source'", "'RefersTo Recipient-Target'", "'Retention'", "'PartOf Retention'", "'Period'", "'Usage'", "'PartOf Usage'", "'Informative'", "'PartOf Informative'"
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
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
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

                if ( (LA3_0==64) ) {
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

                if ( (LA4_0==73) ) {
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

                if ( (LA5_0==78) ) {
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

                if ( (LA6_0==81) ) {
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

                if ( (LA7_0==83) ) {
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

                if ( (LA8_0==60) ) {
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

                if ( (LA9_0==51) ) {
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

                if ( (LA10_0==47) ) {
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

                if ( (LA11_0==39) ) {
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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:447:1: ruleMetadata returns [EObject current=null] : (otherlv_0= 'PolicyMetadata {' otherlv_1= 'PolicyName' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'Author(s)' ( (lv_authors_8_0= RULE_STRING ) ) otherlv_9= ',' otherlv_10= 'Organization(s)' ( (lv_organizations_11_0= RULE_STRING ) ) otherlv_12= ',' otherlv_13= 'Date' ( (lv_date_14_0= ruleDate ) ) otherlv_15= ',' otherlv_16= 'Version' ( (lv_version_17_0= RULE_STRING ) ) otherlv_18= '}' ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_authors_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_organizations_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_version_17_0=null;
        Token otherlv_18=null;
        EObject lv_date_14_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:450:28: ( (otherlv_0= 'PolicyMetadata {' otherlv_1= 'PolicyName' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'Author(s)' ( (lv_authors_8_0= RULE_STRING ) ) otherlv_9= ',' otherlv_10= 'Organization(s)' ( (lv_organizations_11_0= RULE_STRING ) ) otherlv_12= ',' otherlv_13= 'Date' ( (lv_date_14_0= ruleDate ) ) otherlv_15= ',' otherlv_16= 'Version' ( (lv_version_17_0= RULE_STRING ) ) otherlv_18= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:451:1: (otherlv_0= 'PolicyMetadata {' otherlv_1= 'PolicyName' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'Author(s)' ( (lv_authors_8_0= RULE_STRING ) ) otherlv_9= ',' otherlv_10= 'Organization(s)' ( (lv_organizations_11_0= RULE_STRING ) ) otherlv_12= ',' otherlv_13= 'Date' ( (lv_date_14_0= ruleDate ) ) otherlv_15= ',' otherlv_16= 'Version' ( (lv_version_17_0= RULE_STRING ) ) otherlv_18= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:451:1: (otherlv_0= 'PolicyMetadata {' otherlv_1= 'PolicyName' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'Author(s)' ( (lv_authors_8_0= RULE_STRING ) ) otherlv_9= ',' otherlv_10= 'Organization(s)' ( (lv_organizations_11_0= RULE_STRING ) ) otherlv_12= ',' otherlv_13= 'Date' ( (lv_date_14_0= ruleDate ) ) otherlv_15= ',' otherlv_16= 'Version' ( (lv_version_17_0= RULE_STRING ) ) otherlv_18= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:451:3: otherlv_0= 'PolicyMetadata {' otherlv_1= 'PolicyName' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'Author(s)' ( (lv_authors_8_0= RULE_STRING ) ) otherlv_9= ',' otherlv_10= 'Organization(s)' ( (lv_organizations_11_0= RULE_STRING ) ) otherlv_12= ',' otherlv_13= 'Date' ( (lv_date_14_0= ruleDate ) ) otherlv_15= ',' otherlv_16= 'Version' ( (lv_version_17_0= RULE_STRING ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleMetadata849); 

                	newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getPolicyMetadataKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleMetadata861); 

                	newLeafNode(otherlv_1, grammarAccess.getMetadataAccess().getPolicyNameKeyword_1());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:459:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:460:1: (lv_name_2_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:460:1: (lv_name_2_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:461:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata878); 

            			newLeafNode(lv_name_2_0, grammarAccess.getMetadataAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleMetadata895); 

                	newLeafNode(otherlv_3, grammarAccess.getMetadataAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleMetadata907); 

                	newLeafNode(otherlv_4, grammarAccess.getMetadataAccess().getDescriptionKeyword_4());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:485:1: ( (lv_description_5_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:486:1: (lv_description_5_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:486:1: (lv_description_5_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:487:3: lv_description_5_0= RULE_STRING
            {
            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata924); 

            			newLeafNode(lv_description_5_0, grammarAccess.getMetadataAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleMetadata941); 

                	newLeafNode(otherlv_6, grammarAccess.getMetadataAccess().getCommaKeyword_6());
                
            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleMetadata953); 

                	newLeafNode(otherlv_7, grammarAccess.getMetadataAccess().getAuthorSKeyword_7());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:511:1: ( (lv_authors_8_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:512:1: (lv_authors_8_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:512:1: (lv_authors_8_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:513:3: lv_authors_8_0= RULE_STRING
            {
            lv_authors_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata970); 

            			newLeafNode(lv_authors_8_0, grammarAccess.getMetadataAccess().getAuthorsSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"authors",
                    		lv_authors_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleMetadata987); 

                	newLeafNode(otherlv_9, grammarAccess.getMetadataAccess().getCommaKeyword_9());
                
            otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleMetadata999); 

                	newLeafNode(otherlv_10, grammarAccess.getMetadataAccess().getOrganizationSKeyword_10());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:537:1: ( (lv_organizations_11_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:538:1: (lv_organizations_11_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:538:1: (lv_organizations_11_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:539:3: lv_organizations_11_0= RULE_STRING
            {
            lv_organizations_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata1016); 

            			newLeafNode(lv_organizations_11_0, grammarAccess.getMetadataAccess().getOrganizationsSTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"organizations",
                    		lv_organizations_11_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleMetadata1033); 

                	newLeafNode(otherlv_12, grammarAccess.getMetadataAccess().getCommaKeyword_12());
                
            otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleMetadata1045); 

                	newLeafNode(otherlv_13, grammarAccess.getMetadataAccess().getDateKeyword_13());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:563:1: ( (lv_date_14_0= ruleDate ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:564:1: (lv_date_14_0= ruleDate )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:564:1: (lv_date_14_0= ruleDate )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:565:3: lv_date_14_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getMetadataAccess().getDateDateParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_in_ruleMetadata1066);
            lv_date_14_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetadataRule());
            	        }
                   		set(
                   			current, 
                   			"date",
                    		lv_date_14_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleMetadata1078); 

                	newLeafNode(otherlv_15, grammarAccess.getMetadataAccess().getCommaKeyword_15());
                
            otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleMetadata1090); 

                	newLeafNode(otherlv_16, grammarAccess.getMetadataAccess().getVersionKeyword_16());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:589:1: ( (lv_version_17_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:590:1: (lv_version_17_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:590:1: (lv_version_17_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:591:3: lv_version_17_0= RULE_STRING
            {
            lv_version_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata1107); 

            			newLeafNode(lv_version_17_0, grammarAccess.getMetadataAccess().getVersionSTRINGTerminalRuleCall_17_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"version",
                    		lv_version_17_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_18=(Token)match(input,25,FOLLOW_25_in_ruleMetadata1124); 

                	newLeafNode(otherlv_18, grammarAccess.getMetadataAccess().getRightCurlyBracketKeyword_18());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:619:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:620:2: (iv_ruleDate= ruleDate EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:621:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate1160);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate1170); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:628:1: ruleDate returns [EObject current=null] : ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token lv_day_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_year_4_0=null;
        EObject lv_month_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:631:28: ( ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:632:1: ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:632:1: ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:632:2: ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:632:2: ( (lv_day_0_0= RULE_INT ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:633:1: (lv_day_0_0= RULE_INT )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:633:1: (lv_day_0_0= RULE_INT )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:634:3: lv_day_0_0= RULE_INT
            {
            lv_day_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1212); 

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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleDate1229); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getHyphenMinusKeyword_1());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:654:1: ( (lv_month_2_0= ruleMonth ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:655:1: (lv_month_2_0= ruleMonth )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:655:1: (lv_month_2_0= ruleMonth )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:656:3: lv_month_2_0= ruleMonth
            {
             
            	        newCompositeNode(grammarAccess.getDateAccess().getMonthMonthParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMonth_in_ruleDate1250);
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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleDate1262); 

                	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getHyphenMinusKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:676:1: ( (lv_year_4_0= RULE_INT ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:677:1: (lv_year_4_0= RULE_INT )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:677:1: (lv_year_4_0= RULE_INT )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:678:3: lv_year_4_0= RULE_INT
            {
            lv_year_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1279); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:702:1: entryRuleMonth returns [EObject current=null] : iv_ruleMonth= ruleMonth EOF ;
    public final EObject entryRuleMonth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonth = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:703:2: (iv_ruleMonth= ruleMonth EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:704:2: iv_ruleMonth= ruleMonth EOF
            {
             newCompositeNode(grammarAccess.getMonthRule()); 
            pushFollow(FOLLOW_ruleMonth_in_entryRuleMonth1320);
            iv_ruleMonth=ruleMonth();

            state._fsp--;

             current =iv_ruleMonth; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonth1330); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:711:1: ruleMonth returns [EObject current=null] : ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:714:28: ( ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:715:1: ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:715:1: ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:716:1: ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:716:1: ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:717:1: (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:717:1: (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' )
            int alt14=12;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case 28:
                {
                alt14=2;
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            case 30:
                {
                alt14=4;
                }
                break;
            case 31:
                {
                alt14=5;
                }
                break;
            case 32:
                {
                alt14=6;
                }
                break;
            case 33:
                {
                alt14=7;
                }
                break;
            case 34:
                {
                alt14=8;
                }
                break;
            case 35:
                {
                alt14=9;
                }
                break;
            case 36:
                {
                alt14=10;
                }
                break;
            case 37:
                {
                alt14=11;
                }
                break;
            case 38:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:718:3: lv_name_0_1= 'Jan'
                    {
                    lv_name_0_1=(Token)match(input,27,FOLLOW_27_in_ruleMonth1374); 

                            newLeafNode(lv_name_0_1, grammarAccess.getMonthAccess().getNameJanKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:730:8: lv_name_0_2= 'Feb'
                    {
                    lv_name_0_2=(Token)match(input,28,FOLLOW_28_in_ruleMonth1403); 

                            newLeafNode(lv_name_0_2, grammarAccess.getMonthAccess().getNameFebKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:742:8: lv_name_0_3= 'Mar'
                    {
                    lv_name_0_3=(Token)match(input,29,FOLLOW_29_in_ruleMonth1432); 

                            newLeafNode(lv_name_0_3, grammarAccess.getMonthAccess().getNameMarKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:754:8: lv_name_0_4= 'Apr'
                    {
                    lv_name_0_4=(Token)match(input,30,FOLLOW_30_in_ruleMonth1461); 

                            newLeafNode(lv_name_0_4, grammarAccess.getMonthAccess().getNameAprKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:766:8: lv_name_0_5= 'May'
                    {
                    lv_name_0_5=(Token)match(input,31,FOLLOW_31_in_ruleMonth1490); 

                            newLeafNode(lv_name_0_5, grammarAccess.getMonthAccess().getNameMayKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:778:8: lv_name_0_6= 'Jun'
                    {
                    lv_name_0_6=(Token)match(input,32,FOLLOW_32_in_ruleMonth1519); 

                            newLeafNode(lv_name_0_6, grammarAccess.getMonthAccess().getNameJunKeyword_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:790:8: lv_name_0_7= 'Jul'
                    {
                    lv_name_0_7=(Token)match(input,33,FOLLOW_33_in_ruleMonth1548); 

                            newLeafNode(lv_name_0_7, grammarAccess.getMonthAccess().getNameJulKeyword_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:802:8: lv_name_0_8= 'Aug'
                    {
                    lv_name_0_8=(Token)match(input,34,FOLLOW_34_in_ruleMonth1577); 

                            newLeafNode(lv_name_0_8, grammarAccess.getMonthAccess().getNameAugKeyword_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:814:8: lv_name_0_9= 'Sep'
                    {
                    lv_name_0_9=(Token)match(input,35,FOLLOW_35_in_ruleMonth1606); 

                            newLeafNode(lv_name_0_9, grammarAccess.getMonthAccess().getNameSepKeyword_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:826:8: lv_name_0_10= 'Oct'
                    {
                    lv_name_0_10=(Token)match(input,36,FOLLOW_36_in_ruleMonth1635); 

                            newLeafNode(lv_name_0_10, grammarAccess.getMonthAccess().getNameOctKeyword_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:838:8: lv_name_0_11= 'Nov'
                    {
                    lv_name_0_11=(Token)match(input,37,FOLLOW_37_in_ruleMonth1664); 

                            newLeafNode(lv_name_0_11, grammarAccess.getMonthAccess().getNameNovKeyword_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:850:8: lv_name_0_12= 'Dec'
                    {
                    lv_name_0_12=(Token)match(input,38,FOLLOW_38_in_ruleMonth1693); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:873:1: entryRuleEnforcement returns [EObject current=null] : iv_ruleEnforcement= ruleEnforcement EOF ;
    public final EObject entryRuleEnforcement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnforcement = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:874:2: (iv_ruleEnforcement= ruleEnforcement EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:875:2: iv_ruleEnforcement= ruleEnforcement EOF
            {
             newCompositeNode(grammarAccess.getEnforcementRule()); 
            pushFollow(FOLLOW_ruleEnforcement_in_entryRuleEnforcement1744);
            iv_ruleEnforcement=ruleEnforcement();

            state._fsp--;

             current =iv_ruleEnforcement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnforcement1754); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:882:1: ruleEnforcement returns [EObject current=null] : (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) ) otherlv_11= '};' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:885:28: ( (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) ) otherlv_11= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:886:1: (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) ) otherlv_11= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:886:1: (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) ) otherlv_11= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:886:3: otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) ) otherlv_11= '};'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEnforcement1791); 

                	newLeafNode(otherlv_0, grammarAccess.getEnforcementAccess().getEnforcementKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:890:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:891:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:891:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:892:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnforcement1808); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEnforcement1825); 

                	newLeafNode(otherlv_2, grammarAccess.getEnforcementAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleEnforcement1837); 

                	newLeafNode(otherlv_3, grammarAccess.getEnforcementAccess().getNameKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:916:1: ( (lv_enforcementName_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:917:1: (lv_enforcementName_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:917:1: (lv_enforcementName_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:918:3: lv_enforcementName_4_0= RULE_STRING
            {
            lv_enforcementName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnforcement1854); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEnforcement1871); 

                	newLeafNode(otherlv_5, grammarAccess.getEnforcementAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleEnforcement1883); 

                	newLeafNode(otherlv_6, grammarAccess.getEnforcementAccess().getDescriptionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:942:1: ( (lv_description_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:943:1: (lv_description_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:943:1: (lv_description_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:944:3: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnforcement1900); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleEnforcement1917); 

                	newLeafNode(otherlv_8, grammarAccess.getEnforcementAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleEnforcement1929); 

                	newLeafNode(otherlv_9, grammarAccess.getEnforcementAccess().getTypeKeyword_9());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:968:1: ( ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:969:1: ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:969:1: ( (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:970:1: (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:970:1: (lv_type_10_1= 'Action' | lv_type_10_2= 'Algorithm' | lv_type_10_3= 'Config' | lv_type_10_4= 'Process' | lv_type_10_5= 'Tool' )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt15=1;
                }
                break;
            case 43:
                {
                alt15=2;
                }
                break;
            case 44:
                {
                alt15=3;
                }
                break;
            case 45:
                {
                alt15=4;
                }
                break;
            case 46:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:971:3: lv_type_10_1= 'Action'
                    {
                    lv_type_10_1=(Token)match(input,42,FOLLOW_42_in_ruleEnforcement1949); 

                            newLeafNode(lv_type_10_1, grammarAccess.getEnforcementAccess().getTypeActionKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:983:8: lv_type_10_2= 'Algorithm'
                    {
                    lv_type_10_2=(Token)match(input,43,FOLLOW_43_in_ruleEnforcement1978); 

                            newLeafNode(lv_type_10_2, grammarAccess.getEnforcementAccess().getTypeAlgorithmKeyword_10_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:995:8: lv_type_10_3= 'Config'
                    {
                    lv_type_10_3=(Token)match(input,44,FOLLOW_44_in_ruleEnforcement2007); 

                            newLeafNode(lv_type_10_3, grammarAccess.getEnforcementAccess().getTypeConfigKeyword_10_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1007:8: lv_type_10_4= 'Process'
                    {
                    lv_type_10_4=(Token)match(input,45,FOLLOW_45_in_ruleEnforcement2036); 

                            newLeafNode(lv_type_10_4, grammarAccess.getEnforcementAccess().getTypeProcessKeyword_10_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1019:8: lv_type_10_5= 'Tool'
                    {
                    lv_type_10_5=(Token)match(input,46,FOLLOW_46_in_ruleEnforcement2065); 

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

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleEnforcement2093); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1046:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1047:2: (iv_ruleService= ruleService EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1048:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService2129);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2139); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1055:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) otherlv_12= ',' )? (otherlv_13= 'Service_Part' ( (lv_servicePart_14_0= ruleServicePart ) )* )? otherlv_15= '};' ) ;
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
        Token lv_refPDAll_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_refPrivateData_10_0 = null;

        EObject lv_servicePart_14_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1058:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) otherlv_12= ',' )? (otherlv_13= 'Service_Part' ( (lv_servicePart_14_0= ruleServicePart ) )* )? otherlv_15= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1059:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) otherlv_12= ',' )? (otherlv_13= 'Service_Part' ( (lv_servicePart_14_0= ruleServicePart ) )* )? otherlv_15= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1059:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) otherlv_12= ',' )? (otherlv_13= 'Service_Part' ( (lv_servicePart_14_0= ruleServicePart ) )* )? otherlv_15= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1059:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) otherlv_12= ',' )? (otherlv_13= 'Service_Part' ( (lv_servicePart_14_0= ruleServicePart ) )* )? otherlv_15= '};'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleService2176); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1063:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1064:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1064:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1065:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2193); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleService2210); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleService2222); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getNameKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1089:1: ( (lv_serviceName_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1090:1: (lv_serviceName_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1090:1: (lv_serviceName_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1091:3: lv_serviceName_4_0= RULE_STRING
            {
            lv_serviceName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService2239); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleService2256); 

                	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getCommaKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1111:1: (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1111:3: otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ','
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleService2269); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getDescriptionKeyword_6_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1115:1: ( (lv_description_7_0= RULE_STRING ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1116:1: (lv_description_7_0= RULE_STRING )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1116:1: (lv_description_7_0= RULE_STRING )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1117:3: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService2286); 

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

                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleService2303); 

                        	newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getCommaKeyword_6_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1137:3: (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) otherlv_12= ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==48) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1137:5: otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) otherlv_12= ','
                    {
                    otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleService2318); 

                        	newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRefersToPrivateDataKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1141:1: ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID||LA18_0==19) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==49) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1141:2: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1141:2: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==RULE_ID) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1142:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1142:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1143:3: lv_refPrivateData_10_0= ruleRefPrivateData
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getServiceAccess().getRefPrivateDataRefPrivateDataParserRuleCall_7_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleService2340);
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


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1160:6: ( (lv_refPDAll_11_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1160:6: ( (lv_refPDAll_11_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1161:1: (lv_refPDAll_11_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1161:1: (lv_refPDAll_11_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1162:3: lv_refPDAll_11_0= 'All'
                            {
                            lv_refPDAll_11_0=(Token)match(input,49,FOLLOW_49_in_ruleService2365); 

                                    newLeafNode(lv_refPDAll_11_0, grammarAccess.getServiceAccess().getRefPDAllAllKeyword_7_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getServiceRule());
                            	        }
                                   		setWithLastConsumed(current, "refPDAll", lv_refPDAll_11_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleService2391); 

                        	newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getCommaKeyword_7_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1179:3: (otherlv_13= 'Service_Part' ( (lv_servicePart_14_0= ruleServicePart ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==50) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1179:5: otherlv_13= 'Service_Part' ( (lv_servicePart_14_0= ruleServicePart ) )*
                    {
                    otherlv_13=(Token)match(input,50,FOLLOW_50_in_ruleService2406); 

                        	newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getService_PartKeyword_8_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1183:1: ( (lv_servicePart_14_0= ruleServicePart ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1184:1: (lv_servicePart_14_0= ruleServicePart )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1184:1: (lv_servicePart_14_0= ruleServicePart )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1185:3: lv_servicePart_14_0= ruleServicePart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceAccess().getServicePartServicePartParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleServicePart_in_ruleService2427);
                    	    lv_servicePart_14_0=ruleServicePart();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"servicePart",
                    	            		lv_servicePart_14_0, 
                    	            		"ServicePart");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleService2442); 

                	newLeafNode(otherlv_15, grammarAccess.getServiceAccess().getRightCurlyBracketSemicolonKeyword_9());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1213:1: entryRuleRecipient returns [EObject current=null] : iv_ruleRecipient= ruleRecipient EOF ;
    public final EObject entryRuleRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipient = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1214:2: (iv_ruleRecipient= ruleRecipient EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1215:2: iv_ruleRecipient= ruleRecipient EOF
            {
             newCompositeNode(grammarAccess.getRecipientRule()); 
            pushFollow(FOLLOW_ruleRecipient_in_entryRuleRecipient2478);
            iv_ruleRecipient=ruleRecipient();

            state._fsp--;

             current =iv_ruleRecipient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipient2488); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1222:1: ruleRecipient returns [EObject current=null] : (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1225:28: ( (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1226:1: (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1226:1: (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1226:3: otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleRecipient2525); 

                	newLeafNode(otherlv_0, grammarAccess.getRecipientAccess().getRecipientKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1230:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1231:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1231:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1232:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipient2542); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRecipient2559); 

                	newLeafNode(otherlv_2, grammarAccess.getRecipientAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleRecipient2571); 

                	newLeafNode(otherlv_3, grammarAccess.getRecipientAccess().getNameKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1256:1: ( (lv_recipientName_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1257:1: (lv_recipientName_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1257:1: (lv_recipientName_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1258:3: lv_recipientName_4_0= RULE_STRING
            {
            lv_recipientName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecipient2588); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRecipient2605); 

                	newLeafNode(otherlv_5, grammarAccess.getRecipientAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleRecipient2617); 

                	newLeafNode(otherlv_6, grammarAccess.getRecipientAccess().getDescriptionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1282:1: ( (lv_description_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1283:1: (lv_description_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1283:1: (lv_description_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1284:3: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecipient2634); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleRecipient2651); 

                	newLeafNode(otherlv_8, grammarAccess.getRecipientAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1304:1: (otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==52) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1304:3: otherlv_9= 'Recipient_Part' ( (lv_recipientPart_10_0= ruleRecipientPart ) )* otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,52,FOLLOW_52_in_ruleRecipient2664); 

                        	newLeafNode(otherlv_9, grammarAccess.getRecipientAccess().getRecipient_PartKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1308:1: ( (lv_recipientPart_10_0= ruleRecipientPart ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1309:1: (lv_recipientPart_10_0= ruleRecipientPart )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1309:1: (lv_recipientPart_10_0= ruleRecipientPart )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1310:3: lv_recipientPart_10_0= ruleRecipientPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRecipientAccess().getRecipientPartRecipientPartParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRecipientPart_in_ruleRecipient2685);
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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleRecipient2698); 

                        	newLeafNode(otherlv_11, grammarAccess.getRecipientAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,53,FOLLOW_53_in_ruleRecipient2712); 

                	newLeafNode(otherlv_12, grammarAccess.getRecipientAccess().getScopeKeyword_10());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1334:1: ( ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1335:1: ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1335:1: ( (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1336:1: (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1336:1: (lv_scope_13_1= 'Internal' | lv_scope_13_2= 'External' | lv_scope_13_3= 'Internal/External' )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt24=1;
                }
                break;
            case 55:
                {
                alt24=2;
                }
                break;
            case 56:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1337:3: lv_scope_13_1= 'Internal'
                    {
                    lv_scope_13_1=(Token)match(input,54,FOLLOW_54_in_ruleRecipient2732); 

                            newLeafNode(lv_scope_13_1, grammarAccess.getRecipientAccess().getScopeInternalKeyword_11_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "scope", lv_scope_13_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1349:8: lv_scope_13_2= 'External'
                    {
                    lv_scope_13_2=(Token)match(input,55,FOLLOW_55_in_ruleRecipient2761); 

                            newLeafNode(lv_scope_13_2, grammarAccess.getRecipientAccess().getScopeExternalKeyword_11_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "scope", lv_scope_13_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1361:8: lv_scope_13_3= 'Internal/External'
                    {
                    lv_scope_13_3=(Token)match(input,56,FOLLOW_56_in_ruleRecipient2790); 

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

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleRecipient2818); 

                	newLeafNode(otherlv_14, grammarAccess.getRecipientAccess().getCommaKeyword_12());
                
            otherlv_15=(Token)match(input,41,FOLLOW_41_in_ruleRecipient2830); 

                	newLeafNode(otherlv_15, grammarAccess.getRecipientAccess().getTypeKeyword_13());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1384:1: ( ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1385:1: ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1385:1: ( (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1386:1: (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1386:1: (lv_type_16_1= 'Individual' | lv_type_16_2= 'Organization' | lv_type_16_3= 'Individual/Organization' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt25=1;
                }
                break;
            case 58:
                {
                alt25=2;
                }
                break;
            case 59:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1387:3: lv_type_16_1= 'Individual'
                    {
                    lv_type_16_1=(Token)match(input,57,FOLLOW_57_in_ruleRecipient2850); 

                            newLeafNode(lv_type_16_1, grammarAccess.getRecipientAccess().getTypeIndividualKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_16_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1399:8: lv_type_16_2= 'Organization'
                    {
                    lv_type_16_2=(Token)match(input,58,FOLLOW_58_in_ruleRecipient2879); 

                            newLeafNode(lv_type_16_2, grammarAccess.getRecipientAccess().getTypeOrganizationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_16_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1411:8: lv_type_16_3= 'Individual/Organization'
                    {
                    lv_type_16_3=(Token)match(input,59,FOLLOW_59_in_ruleRecipient2908); 

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

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleRecipient2936); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1438:1: entryRulePrivateData returns [EObject current=null] : iv_rulePrivateData= rulePrivateData EOF ;
    public final EObject entryRulePrivateData() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateData = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1439:2: (iv_rulePrivateData= rulePrivateData EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1440:2: iv_rulePrivateData= rulePrivateData EOF
            {
             newCompositeNode(grammarAccess.getPrivateDataRule()); 
            pushFollow(FOLLOW_rulePrivateData_in_entryRulePrivateData2972);
            iv_rulePrivateData=rulePrivateData();

            state._fsp--;

             current =iv_rulePrivateData; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrivateData2982); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1447:1: rulePrivateData returns [EObject current=null] : (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1450:28: ( (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1451:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1451:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1451:3: otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_rulePrivateData3019); 

                	newLeafNode(otherlv_0, grammarAccess.getPrivateDataAccess().getPrivateDataKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1455:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1456:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1456:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1457:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrivateData3036); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePrivateData3053); 

                	newLeafNode(otherlv_2, grammarAccess.getPrivateDataAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_rulePrivateData3065); 

                	newLeafNode(otherlv_3, grammarAccess.getPrivateDataAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1481:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1482:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1482:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1483:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrivateData3082); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_rulePrivateData3099); 

                	newLeafNode(otherlv_5, grammarAccess.getPrivateDataAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,41,FOLLOW_41_in_rulePrivateData3111); 

                	newLeafNode(otherlv_6, grammarAccess.getPrivateDataAccess().getTypeKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1507:1: ( ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1508:1: ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1508:1: ( (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1509:1: (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1509:1: (lv_type_7_1= 'PersonalInformation' | lv_type_7_2= 'UsageInformation' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==61) ) {
                alt26=1;
            }
            else if ( (LA26_0==62) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1510:3: lv_type_7_1= 'PersonalInformation'
                    {
                    lv_type_7_1=(Token)match(input,61,FOLLOW_61_in_rulePrivateData3131); 

                            newLeafNode(lv_type_7_1, grammarAccess.getPrivateDataAccess().getTypePersonalInformationKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrivateDataRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_7_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1522:8: lv_type_7_2= 'UsageInformation'
                    {
                    lv_type_7_2=(Token)match(input,62,FOLLOW_62_in_rulePrivateData3160); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_rulePrivateData3188); 

                	newLeafNode(otherlv_8, grammarAccess.getPrivateDataAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1541:1: ( (lv_attribute_9_0= ruleAttribute ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==63) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1542:1: (lv_attribute_9_0= ruleAttribute )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1542:1: (lv_attribute_9_0= ruleAttribute )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1543:3: lv_attribute_9_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrivateDataAccess().getAttributeAttributeParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePrivateData3209);
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
            	    break loop27;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_rulePrivateData3222); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1571:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1572:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1573:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute3258);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute3268); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1580:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1583:28: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1584:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1584:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1584:3: otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleAttribute3305); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1588:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1589:1: (lv_name_1_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1589:1: (lv_name_1_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1590:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute3322); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAttribute3339); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAttribute3351); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1614:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1615:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1615:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1616:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute3368); 

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

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleAttribute3385); 

                	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1636:1: (otherlv_6= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1636:3: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleAttribute3398); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1648:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1649:2: (iv_ruleCollection= ruleCollection EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1650:2: iv_ruleCollection= ruleCollection EOF
            {
             newCompositeNode(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection3436);
            iv_ruleCollection=ruleCollection();

            state._fsp--;

             current =iv_ruleCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection3446); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1657:1: ruleCollection returns [EObject current=null] : (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' ) ;
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
        Token lv_refPDAll_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_refSAll_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_refEAll_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_modality_25_1=null;
        Token lv_modality_25_2=null;
        Token lv_modality_25_3=null;
        Token otherlv_26=null;
        EObject lv_refPrivateData_13_0 = null;

        EObject lv_refService_17_0 = null;

        EObject lv_refEnforcement_21_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1660:28: ( (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1661:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1661:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1661:3: otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleCollection3483); 

                	newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getCollectionKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1665:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1666:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1666:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1667:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollection3500); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCollection3517); 

                	newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCollection3529); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1691:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1692:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1692:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1693:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection3546); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleCollection3563); 

                	newLeafNode(otherlv_5, grammarAccess.getCollectionAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,65,FOLLOW_65_in_ruleCollection3575); 

                	newLeafNode(otherlv_6, grammarAccess.getCollectionAccess().getConditionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1717:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1718:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1718:1: (lv_condition_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1719:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection3592); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleCollection3609); 

                	newLeafNode(otherlv_8, grammarAccess.getCollectionAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1739:1: (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==66) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1739:3: otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,66,FOLLOW_66_in_ruleCollection3622); 

                        	newLeafNode(otherlv_9, grammarAccess.getCollectionAccess().getPartOfCollectionKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1743:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1744:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1744:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1745:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollection3642); 

                    		newLeafNode(otherlv_10, grammarAccess.getCollectionAccess().getPartCollectionCollectionCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleCollection3654); 

                        	newLeafNode(otherlv_11, grammarAccess.getCollectionAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1760:3: (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1760:5: otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ','
                    {
                    otherlv_12=(Token)match(input,48,FOLLOW_48_in_ruleCollection3669); 

                        	newLeafNode(otherlv_12, grammarAccess.getCollectionAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1764:1: ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID||LA31_0==19) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==49) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1764:2: ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1764:2: ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==RULE_ID) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1765:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1765:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1766:3: lv_refPrivateData_13_0= ruleRefPrivateData
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefPrivateDataRefPrivateDataParserRuleCall_10_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleCollection3691);
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
                            	    break loop30;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1783:6: ( (lv_refPDAll_14_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1783:6: ( (lv_refPDAll_14_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1784:1: (lv_refPDAll_14_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1784:1: (lv_refPDAll_14_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1785:3: lv_refPDAll_14_0= 'All'
                            {
                            lv_refPDAll_14_0=(Token)match(input,49,FOLLOW_49_in_ruleCollection3716); 

                                    newLeafNode(lv_refPDAll_14_0, grammarAccess.getCollectionAccess().getRefPDAllAllKeyword_10_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCollectionRule());
                            	        }
                                   		setWithLastConsumed(current, "refPDAll", lv_refPDAll_14_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleCollection3742); 

                        	newLeafNode(otherlv_15, grammarAccess.getCollectionAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1802:3: (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==67) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1802:5: otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ','
                    {
                    otherlv_16=(Token)match(input,67,FOLLOW_67_in_ruleCollection3757); 

                        	newLeafNode(otherlv_16, grammarAccess.getCollectionAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1806:1: ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID||LA34_0==19) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==49) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1806:2: ( (lv_refService_17_0= ruleRefService ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1806:2: ( (lv_refService_17_0= ruleRefService ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==RULE_ID) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1807:1: (lv_refService_17_0= ruleRefService )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1807:1: (lv_refService_17_0= ruleRefService )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1808:3: lv_refService_17_0= ruleRefService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefServiceRefServiceParserRuleCall_11_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefService_in_ruleCollection3779);
                            	    lv_refService_17_0=ruleRefService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refService",
                            	            		lv_refService_17_0, 
                            	            		"RefService");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1825:6: ( (lv_refSAll_18_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1825:6: ( (lv_refSAll_18_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1826:1: (lv_refSAll_18_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1826:1: (lv_refSAll_18_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1827:3: lv_refSAll_18_0= 'All'
                            {
                            lv_refSAll_18_0=(Token)match(input,49,FOLLOW_49_in_ruleCollection3804); 

                                    newLeafNode(lv_refSAll_18_0, grammarAccess.getCollectionAccess().getRefSAllAllKeyword_11_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCollectionRule());
                            	        }
                                   		setWithLastConsumed(current, "refSAll", lv_refSAll_18_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleCollection3830); 

                        	newLeafNode(otherlv_19, grammarAccess.getCollectionAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1844:3: (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==68) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1844:5: otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ','
                    {
                    otherlv_20=(Token)match(input,68,FOLLOW_68_in_ruleCollection3845); 

                        	newLeafNode(otherlv_20, grammarAccess.getCollectionAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1848:1: ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ID||LA37_0==19) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==49) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1848:2: ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1848:2: ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==RULE_ID) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1849:1: (lv_refEnforcement_21_0= ruleRefEnforcement )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1849:1: (lv_refEnforcement_21_0= ruleRefEnforcement )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1850:3: lv_refEnforcement_21_0= ruleRefEnforcement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefEnforcementRefEnforcementParserRuleCall_12_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleCollection3867);
                            	    lv_refEnforcement_21_0=ruleRefEnforcement();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refEnforcement",
                            	            		lv_refEnforcement_21_0, 
                            	            		"RefEnforcement");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop36;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1867:6: ( (lv_refEAll_22_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1867:6: ( (lv_refEAll_22_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1868:1: (lv_refEAll_22_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1868:1: (lv_refEAll_22_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1869:3: lv_refEAll_22_0= 'All'
                            {
                            lv_refEAll_22_0=(Token)match(input,49,FOLLOW_49_in_ruleCollection3892); 

                                    newLeafNode(lv_refEAll_22_0, grammarAccess.getCollectionAccess().getRefEAllAllKeyword_12_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCollectionRule());
                            	        }
                                   		setWithLastConsumed(current, "refEAll", lv_refEAll_22_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleCollection3918); 

                        	newLeafNode(otherlv_23, grammarAccess.getCollectionAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,69,FOLLOW_69_in_ruleCollection3932); 

                	newLeafNode(otherlv_24, grammarAccess.getCollectionAccess().getModalityKeyword_13());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1890:1: ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1891:1: ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1891:1: ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1892:1: (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1892:1: (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt39=1;
                }
                break;
            case 71:
                {
                alt39=2;
                }
                break;
            case 72:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1893:3: lv_modality_25_1= 'Permitted'
                    {
                    lv_modality_25_1=(Token)match(input,70,FOLLOW_70_in_ruleCollection3952); 

                            newLeafNode(lv_modality_25_1, grammarAccess.getCollectionAccess().getModalityPermittedKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_25_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1905:8: lv_modality_25_2= 'Obligation'
                    {
                    lv_modality_25_2=(Token)match(input,71,FOLLOW_71_in_ruleCollection3981); 

                            newLeafNode(lv_modality_25_2, grammarAccess.getCollectionAccess().getModalityObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_25_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1917:8: lv_modality_25_3= 'Forbidden'
                    {
                    lv_modality_25_3=(Token)match(input,72,FOLLOW_72_in_ruleCollection4010); 

                            newLeafNode(lv_modality_25_3, grammarAccess.getCollectionAccess().getModalityForbiddenKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_25_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_26=(Token)match(input,13,FOLLOW_13_in_ruleCollection4038); 

                	newLeafNode(otherlv_26, grammarAccess.getCollectionAccess().getRightCurlyBracketSemicolonKeyword_15());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1944:1: entryRuleDisclosure returns [EObject current=null] : iv_ruleDisclosure= ruleDisclosure EOF ;
    public final EObject entryRuleDisclosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisclosure = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1945:2: (iv_ruleDisclosure= ruleDisclosure EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1946:2: iv_ruleDisclosure= ruleDisclosure EOF
            {
             newCompositeNode(grammarAccess.getDisclosureRule()); 
            pushFollow(FOLLOW_ruleDisclosure_in_entryRuleDisclosure4074);
            iv_ruleDisclosure=ruleDisclosure();

            state._fsp--;

             current =iv_ruleDisclosure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisclosure4084); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1953:1: ruleDisclosure returns [EObject current=null] : (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( ( (lv_refRecipient_13_0= ruleRefRecipient ) )* | ( (lv_refRAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_17_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_21_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_22_0= 'All' ) ) ) otherlv_23= ',' )? (otherlv_24= 'RefersTo PrivateData' ( ( (lv_refPrivateData_25_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_26_0= 'All' ) ) ) otherlv_27= ',' )? (otherlv_28= 'RefersTo Service' ( ( (lv_refService_29_0= ruleRefService ) )* | ( (lv_refSAll_30_0= 'All' ) ) ) otherlv_31= ',' )? (otherlv_32= 'RefersTo Enforcement' ( ( (lv_refEnforcement_33_0= ruleRefEnforcement ) )* | ( (lv_refEAll_34_0= 'All' ) ) ) otherlv_35= ',' )? otherlv_36= 'Modality' ( ( (lv_modality_37_1= 'Permitted' | lv_modality_37_2= 'Obligation' | lv_modality_37_3= 'Forbidden' ) ) ) otherlv_38= '};' ) ;
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
        Token lv_refRAll_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_refRSAll_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_refRTAll_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_refPDAll_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_refSAll_30_0=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_refEAll_34_0=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token lv_modality_37_1=null;
        Token lv_modality_37_2=null;
        Token lv_modality_37_3=null;
        Token otherlv_38=null;
        EObject lv_refRecipient_13_0 = null;

        EObject lv_refRecipientSource_17_0 = null;

        EObject lv_refRecipientTarget_21_0 = null;

        EObject lv_refPrivateData_25_0 = null;

        EObject lv_refService_29_0 = null;

        EObject lv_refEnforcement_33_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1956:28: ( (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( ( (lv_refRecipient_13_0= ruleRefRecipient ) )* | ( (lv_refRAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_17_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_21_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_22_0= 'All' ) ) ) otherlv_23= ',' )? (otherlv_24= 'RefersTo PrivateData' ( ( (lv_refPrivateData_25_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_26_0= 'All' ) ) ) otherlv_27= ',' )? (otherlv_28= 'RefersTo Service' ( ( (lv_refService_29_0= ruleRefService ) )* | ( (lv_refSAll_30_0= 'All' ) ) ) otherlv_31= ',' )? (otherlv_32= 'RefersTo Enforcement' ( ( (lv_refEnforcement_33_0= ruleRefEnforcement ) )* | ( (lv_refEAll_34_0= 'All' ) ) ) otherlv_35= ',' )? otherlv_36= 'Modality' ( ( (lv_modality_37_1= 'Permitted' | lv_modality_37_2= 'Obligation' | lv_modality_37_3= 'Forbidden' ) ) ) otherlv_38= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1957:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( ( (lv_refRecipient_13_0= ruleRefRecipient ) )* | ( (lv_refRAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_17_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_21_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_22_0= 'All' ) ) ) otherlv_23= ',' )? (otherlv_24= 'RefersTo PrivateData' ( ( (lv_refPrivateData_25_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_26_0= 'All' ) ) ) otherlv_27= ',' )? (otherlv_28= 'RefersTo Service' ( ( (lv_refService_29_0= ruleRefService ) )* | ( (lv_refSAll_30_0= 'All' ) ) ) otherlv_31= ',' )? (otherlv_32= 'RefersTo Enforcement' ( ( (lv_refEnforcement_33_0= ruleRefEnforcement ) )* | ( (lv_refEAll_34_0= 'All' ) ) ) otherlv_35= ',' )? otherlv_36= 'Modality' ( ( (lv_modality_37_1= 'Permitted' | lv_modality_37_2= 'Obligation' | lv_modality_37_3= 'Forbidden' ) ) ) otherlv_38= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1957:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( ( (lv_refRecipient_13_0= ruleRefRecipient ) )* | ( (lv_refRAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_17_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_21_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_22_0= 'All' ) ) ) otherlv_23= ',' )? (otherlv_24= 'RefersTo PrivateData' ( ( (lv_refPrivateData_25_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_26_0= 'All' ) ) ) otherlv_27= ',' )? (otherlv_28= 'RefersTo Service' ( ( (lv_refService_29_0= ruleRefService ) )* | ( (lv_refSAll_30_0= 'All' ) ) ) otherlv_31= ',' )? (otherlv_32= 'RefersTo Enforcement' ( ( (lv_refEnforcement_33_0= ruleRefEnforcement ) )* | ( (lv_refEAll_34_0= 'All' ) ) ) otherlv_35= ',' )? otherlv_36= 'Modality' ( ( (lv_modality_37_1= 'Permitted' | lv_modality_37_2= 'Obligation' | lv_modality_37_3= 'Forbidden' ) ) ) otherlv_38= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1957:3: otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( ( (lv_refRecipient_13_0= ruleRefRecipient ) )* | ( (lv_refRAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_17_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_21_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_22_0= 'All' ) ) ) otherlv_23= ',' )? (otherlv_24= 'RefersTo PrivateData' ( ( (lv_refPrivateData_25_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_26_0= 'All' ) ) ) otherlv_27= ',' )? (otherlv_28= 'RefersTo Service' ( ( (lv_refService_29_0= ruleRefService ) )* | ( (lv_refSAll_30_0= 'All' ) ) ) otherlv_31= ',' )? (otherlv_32= 'RefersTo Enforcement' ( ( (lv_refEnforcement_33_0= ruleRefEnforcement ) )* | ( (lv_refEAll_34_0= 'All' ) ) ) otherlv_35= ',' )? otherlv_36= 'Modality' ( ( (lv_modality_37_1= 'Permitted' | lv_modality_37_2= 'Obligation' | lv_modality_37_3= 'Forbidden' ) ) ) otherlv_38= '};'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleDisclosure4121); 

                	newLeafNode(otherlv_0, grammarAccess.getDisclosureAccess().getDisclosureKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1961:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1962:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1962:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1963:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisclosure4138); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDisclosure4155); 

                	newLeafNode(otherlv_2, grammarAccess.getDisclosureAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleDisclosure4167); 

                	newLeafNode(otherlv_3, grammarAccess.getDisclosureAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1987:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1988:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1988:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1989:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure4184); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4201); 

                	newLeafNode(otherlv_5, grammarAccess.getDisclosureAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,65,FOLLOW_65_in_ruleDisclosure4213); 

                	newLeafNode(otherlv_6, grammarAccess.getDisclosureAccess().getConditionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2013:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2014:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2014:1: (lv_condition_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2015:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure4230); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4247); 

                	newLeafNode(otherlv_8, grammarAccess.getDisclosureAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2035:1: (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==74) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2035:3: otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,74,FOLLOW_74_in_ruleDisclosure4260); 

                        	newLeafNode(otherlv_9, grammarAccess.getDisclosureAccess().getPartOfDisclosureKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2039:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2040:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2040:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2041:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisclosure4280); 

                    		newLeafNode(otherlv_10, grammarAccess.getDisclosureAccess().getPartDisclosureDisclosureCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4292); 

                        	newLeafNode(otherlv_11, grammarAccess.getDisclosureAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2056:3: (otherlv_12= 'RefersTo Recipient' ( ( (lv_refRecipient_13_0= ruleRefRecipient ) )* | ( (lv_refRAll_14_0= 'All' ) ) ) otherlv_15= ',' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==75) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2056:5: otherlv_12= 'RefersTo Recipient' ( ( (lv_refRecipient_13_0= ruleRefRecipient ) )* | ( (lv_refRAll_14_0= 'All' ) ) ) otherlv_15= ','
                    {
                    otherlv_12=(Token)match(input,75,FOLLOW_75_in_ruleDisclosure4307); 

                        	newLeafNode(otherlv_12, grammarAccess.getDisclosureAccess().getRefersToRecipientKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2060:1: ( ( (lv_refRecipient_13_0= ruleRefRecipient ) )* | ( (lv_refRAll_14_0= 'All' ) ) )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID||LA42_0==19) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==49) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2060:2: ( (lv_refRecipient_13_0= ruleRefRecipient ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2060:2: ( (lv_refRecipient_13_0= ruleRefRecipient ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==RULE_ID) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2061:1: (lv_refRecipient_13_0= ruleRefRecipient )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2061:1: (lv_refRecipient_13_0= ruleRefRecipient )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2062:3: lv_refRecipient_13_0= ruleRefRecipient
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefRecipientRefRecipientParserRuleCall_10_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefRecipient_in_ruleDisclosure4329);
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
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2079:6: ( (lv_refRAll_14_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2079:6: ( (lv_refRAll_14_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2080:1: (lv_refRAll_14_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2080:1: (lv_refRAll_14_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2081:3: lv_refRAll_14_0= 'All'
                            {
                            lv_refRAll_14_0=(Token)match(input,49,FOLLOW_49_in_ruleDisclosure4354); 

                                    newLeafNode(lv_refRAll_14_0, grammarAccess.getDisclosureAccess().getRefRAllAllKeyword_10_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDisclosureRule());
                            	        }
                                   		setWithLastConsumed(current, "refRAll", lv_refRAll_14_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4380); 

                        	newLeafNode(otherlv_15, grammarAccess.getDisclosureAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2098:3: (otherlv_16= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_17_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_18_0= 'All' ) ) ) otherlv_19= ',' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==76) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2098:5: otherlv_16= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_17_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_18_0= 'All' ) ) ) otherlv_19= ','
                    {
                    otherlv_16=(Token)match(input,76,FOLLOW_76_in_ruleDisclosure4395); 

                        	newLeafNode(otherlv_16, grammarAccess.getDisclosureAccess().getRefersToRecipientSourceKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2102:1: ( ( (lv_refRecipientSource_17_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_18_0= 'All' ) ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_ID||LA45_0==19) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==49) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2102:2: ( (lv_refRecipientSource_17_0= ruleRefRecipientSource ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2102:2: ( (lv_refRecipientSource_17_0= ruleRefRecipientSource ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==RULE_ID) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2103:1: (lv_refRecipientSource_17_0= ruleRefRecipientSource )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2103:1: (lv_refRecipientSource_17_0= ruleRefRecipientSource )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2104:3: lv_refRecipientSource_17_0= ruleRefRecipientSource
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefRecipientSourceRefRecipientSourceParserRuleCall_11_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefRecipientSource_in_ruleDisclosure4417);
                            	    lv_refRecipientSource_17_0=ruleRefRecipientSource();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refRecipientSource",
                            	            		lv_refRecipientSource_17_0, 
                            	            		"RefRecipientSource");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop44;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2121:6: ( (lv_refRSAll_18_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2121:6: ( (lv_refRSAll_18_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2122:1: (lv_refRSAll_18_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2122:1: (lv_refRSAll_18_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2123:3: lv_refRSAll_18_0= 'All'
                            {
                            lv_refRSAll_18_0=(Token)match(input,49,FOLLOW_49_in_ruleDisclosure4442); 

                                    newLeafNode(lv_refRSAll_18_0, grammarAccess.getDisclosureAccess().getRefRSAllAllKeyword_11_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDisclosureRule());
                            	        }
                                   		setWithLastConsumed(current, "refRSAll", lv_refRSAll_18_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4468); 

                        	newLeafNode(otherlv_19, grammarAccess.getDisclosureAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2140:3: (otherlv_20= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_21_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_22_0= 'All' ) ) ) otherlv_23= ',' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==77) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2140:5: otherlv_20= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_21_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_22_0= 'All' ) ) ) otherlv_23= ','
                    {
                    otherlv_20=(Token)match(input,77,FOLLOW_77_in_ruleDisclosure4483); 

                        	newLeafNode(otherlv_20, grammarAccess.getDisclosureAccess().getRefersToRecipientTargetKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2144:1: ( ( (lv_refRecipientTarget_21_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_22_0= 'All' ) ) )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_ID||LA48_0==19) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==49) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2144:2: ( (lv_refRecipientTarget_21_0= ruleRefRecipientTarget ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2144:2: ( (lv_refRecipientTarget_21_0= ruleRefRecipientTarget ) )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==RULE_ID) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2145:1: (lv_refRecipientTarget_21_0= ruleRefRecipientTarget )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2145:1: (lv_refRecipientTarget_21_0= ruleRefRecipientTarget )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2146:3: lv_refRecipientTarget_21_0= ruleRefRecipientTarget
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefRecipientTargetRefRecipientTargetParserRuleCall_12_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefRecipientTarget_in_ruleDisclosure4505);
                            	    lv_refRecipientTarget_21_0=ruleRefRecipientTarget();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refRecipientTarget",
                            	            		lv_refRecipientTarget_21_0, 
                            	            		"RefRecipientTarget");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop47;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2163:6: ( (lv_refRTAll_22_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2163:6: ( (lv_refRTAll_22_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2164:1: (lv_refRTAll_22_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2164:1: (lv_refRTAll_22_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2165:3: lv_refRTAll_22_0= 'All'
                            {
                            lv_refRTAll_22_0=(Token)match(input,49,FOLLOW_49_in_ruleDisclosure4530); 

                                    newLeafNode(lv_refRTAll_22_0, grammarAccess.getDisclosureAccess().getRefRTAllAllKeyword_12_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDisclosureRule());
                            	        }
                                   		setWithLastConsumed(current, "refRTAll", lv_refRTAll_22_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4556); 

                        	newLeafNode(otherlv_23, grammarAccess.getDisclosureAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2182:3: (otherlv_24= 'RefersTo PrivateData' ( ( (lv_refPrivateData_25_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_26_0= 'All' ) ) ) otherlv_27= ',' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==48) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2182:5: otherlv_24= 'RefersTo PrivateData' ( ( (lv_refPrivateData_25_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_26_0= 'All' ) ) ) otherlv_27= ','
                    {
                    otherlv_24=(Token)match(input,48,FOLLOW_48_in_ruleDisclosure4571); 

                        	newLeafNode(otherlv_24, grammarAccess.getDisclosureAccess().getRefersToPrivateDataKeyword_13_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2186:1: ( ( (lv_refPrivateData_25_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_26_0= 'All' ) ) )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==RULE_ID||LA51_0==19) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==49) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2186:2: ( (lv_refPrivateData_25_0= ruleRefPrivateData ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2186:2: ( (lv_refPrivateData_25_0= ruleRefPrivateData ) )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==RULE_ID) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2187:1: (lv_refPrivateData_25_0= ruleRefPrivateData )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2187:1: (lv_refPrivateData_25_0= ruleRefPrivateData )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2188:3: lv_refPrivateData_25_0= ruleRefPrivateData
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefPrivateDataRefPrivateDataParserRuleCall_13_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleDisclosure4593);
                            	    lv_refPrivateData_25_0=ruleRefPrivateData();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refPrivateData",
                            	            		lv_refPrivateData_25_0, 
                            	            		"RefPrivateData");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop50;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2205:6: ( (lv_refPDAll_26_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2205:6: ( (lv_refPDAll_26_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2206:1: (lv_refPDAll_26_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2206:1: (lv_refPDAll_26_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2207:3: lv_refPDAll_26_0= 'All'
                            {
                            lv_refPDAll_26_0=(Token)match(input,49,FOLLOW_49_in_ruleDisclosure4618); 

                                    newLeafNode(lv_refPDAll_26_0, grammarAccess.getDisclosureAccess().getRefPDAllAllKeyword_13_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDisclosureRule());
                            	        }
                                   		setWithLastConsumed(current, "refPDAll", lv_refPDAll_26_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_27=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4644); 

                        	newLeafNode(otherlv_27, grammarAccess.getDisclosureAccess().getCommaKeyword_13_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2224:3: (otherlv_28= 'RefersTo Service' ( ( (lv_refService_29_0= ruleRefService ) )* | ( (lv_refSAll_30_0= 'All' ) ) ) otherlv_31= ',' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==67) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2224:5: otherlv_28= 'RefersTo Service' ( ( (lv_refService_29_0= ruleRefService ) )* | ( (lv_refSAll_30_0= 'All' ) ) ) otherlv_31= ','
                    {
                    otherlv_28=(Token)match(input,67,FOLLOW_67_in_ruleDisclosure4659); 

                        	newLeafNode(otherlv_28, grammarAccess.getDisclosureAccess().getRefersToServiceKeyword_14_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2228:1: ( ( (lv_refService_29_0= ruleRefService ) )* | ( (lv_refSAll_30_0= 'All' ) ) )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_ID||LA54_0==19) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==49) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2228:2: ( (lv_refService_29_0= ruleRefService ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2228:2: ( (lv_refService_29_0= ruleRefService ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==RULE_ID) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2229:1: (lv_refService_29_0= ruleRefService )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2229:1: (lv_refService_29_0= ruleRefService )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2230:3: lv_refService_29_0= ruleRefService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefServiceRefServiceParserRuleCall_14_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefService_in_ruleDisclosure4681);
                            	    lv_refService_29_0=ruleRefService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refService",
                            	            		lv_refService_29_0, 
                            	            		"RefService");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop53;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2247:6: ( (lv_refSAll_30_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2247:6: ( (lv_refSAll_30_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2248:1: (lv_refSAll_30_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2248:1: (lv_refSAll_30_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2249:3: lv_refSAll_30_0= 'All'
                            {
                            lv_refSAll_30_0=(Token)match(input,49,FOLLOW_49_in_ruleDisclosure4706); 

                                    newLeafNode(lv_refSAll_30_0, grammarAccess.getDisclosureAccess().getRefSAllAllKeyword_14_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDisclosureRule());
                            	        }
                                   		setWithLastConsumed(current, "refSAll", lv_refSAll_30_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_31=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4732); 

                        	newLeafNode(otherlv_31, grammarAccess.getDisclosureAccess().getCommaKeyword_14_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2266:3: (otherlv_32= 'RefersTo Enforcement' ( ( (lv_refEnforcement_33_0= ruleRefEnforcement ) )* | ( (lv_refEAll_34_0= 'All' ) ) ) otherlv_35= ',' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==68) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2266:5: otherlv_32= 'RefersTo Enforcement' ( ( (lv_refEnforcement_33_0= ruleRefEnforcement ) )* | ( (lv_refEAll_34_0= 'All' ) ) ) otherlv_35= ','
                    {
                    otherlv_32=(Token)match(input,68,FOLLOW_68_in_ruleDisclosure4747); 

                        	newLeafNode(otherlv_32, grammarAccess.getDisclosureAccess().getRefersToEnforcementKeyword_15_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2270:1: ( ( (lv_refEnforcement_33_0= ruleRefEnforcement ) )* | ( (lv_refEAll_34_0= 'All' ) ) )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_ID||LA57_0==19) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==49) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2270:2: ( (lv_refEnforcement_33_0= ruleRefEnforcement ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2270:2: ( (lv_refEnforcement_33_0= ruleRefEnforcement ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==RULE_ID) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2271:1: (lv_refEnforcement_33_0= ruleRefEnforcement )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2271:1: (lv_refEnforcement_33_0= ruleRefEnforcement )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2272:3: lv_refEnforcement_33_0= ruleRefEnforcement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefEnforcementRefEnforcementParserRuleCall_15_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleDisclosure4769);
                            	    lv_refEnforcement_33_0=ruleRefEnforcement();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refEnforcement",
                            	            		lv_refEnforcement_33_0, 
                            	            		"RefEnforcement");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop56;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2289:6: ( (lv_refEAll_34_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2289:6: ( (lv_refEAll_34_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2290:1: (lv_refEAll_34_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2290:1: (lv_refEAll_34_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2291:3: lv_refEAll_34_0= 'All'
                            {
                            lv_refEAll_34_0=(Token)match(input,49,FOLLOW_49_in_ruleDisclosure4794); 

                                    newLeafNode(lv_refEAll_34_0, grammarAccess.getDisclosureAccess().getRefEAllAllKeyword_15_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDisclosureRule());
                            	        }
                                   		setWithLastConsumed(current, "refEAll", lv_refEAll_34_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_35=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure4820); 

                        	newLeafNode(otherlv_35, grammarAccess.getDisclosureAccess().getCommaKeyword_15_2());
                        

                    }
                    break;

            }

            otherlv_36=(Token)match(input,69,FOLLOW_69_in_ruleDisclosure4834); 

                	newLeafNode(otherlv_36, grammarAccess.getDisclosureAccess().getModalityKeyword_16());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2312:1: ( ( (lv_modality_37_1= 'Permitted' | lv_modality_37_2= 'Obligation' | lv_modality_37_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2313:1: ( (lv_modality_37_1= 'Permitted' | lv_modality_37_2= 'Obligation' | lv_modality_37_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2313:1: ( (lv_modality_37_1= 'Permitted' | lv_modality_37_2= 'Obligation' | lv_modality_37_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2314:1: (lv_modality_37_1= 'Permitted' | lv_modality_37_2= 'Obligation' | lv_modality_37_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2314:1: (lv_modality_37_1= 'Permitted' | lv_modality_37_2= 'Obligation' | lv_modality_37_3= 'Forbidden' )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt59=1;
                }
                break;
            case 71:
                {
                alt59=2;
                }
                break;
            case 72:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2315:3: lv_modality_37_1= 'Permitted'
                    {
                    lv_modality_37_1=(Token)match(input,70,FOLLOW_70_in_ruleDisclosure4854); 

                            newLeafNode(lv_modality_37_1, grammarAccess.getDisclosureAccess().getModalityPermittedKeyword_17_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_37_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2327:8: lv_modality_37_2= 'Obligation'
                    {
                    lv_modality_37_2=(Token)match(input,71,FOLLOW_71_in_ruleDisclosure4883); 

                            newLeafNode(lv_modality_37_2, grammarAccess.getDisclosureAccess().getModalityObligationKeyword_17_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_37_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2339:8: lv_modality_37_3= 'Forbidden'
                    {
                    lv_modality_37_3=(Token)match(input,72,FOLLOW_72_in_ruleDisclosure4912); 

                            newLeafNode(lv_modality_37_3, grammarAccess.getDisclosureAccess().getModalityForbiddenKeyword_17_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_37_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_38=(Token)match(input,13,FOLLOW_13_in_ruleDisclosure4940); 

                	newLeafNode(otherlv_38, grammarAccess.getDisclosureAccess().getRightCurlyBracketSemicolonKeyword_18());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2366:1: entryRuleRetention returns [EObject current=null] : iv_ruleRetention= ruleRetention EOF ;
    public final EObject entryRuleRetention() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetention = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2367:2: (iv_ruleRetention= ruleRetention EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2368:2: iv_ruleRetention= ruleRetention EOF
            {
             newCompositeNode(grammarAccess.getRetentionRule()); 
            pushFollow(FOLLOW_ruleRetention_in_entryRuleRetention4976);
            iv_ruleRetention=ruleRetention();

            state._fsp--;

             current =iv_ruleRetention; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRetention4986); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2375:1: ruleRetention returns [EObject current=null] : (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_17_0= 'All' ) ) ) otherlv_18= ',' )? (otherlv_19= 'RefersTo Service' ( ( (lv_refService_20_0= ruleRefService ) )* | ( (lv_refSAll_21_0= 'All' ) ) ) otherlv_22= ',' )? (otherlv_23= 'RefersTo Enforcement' ( ( (lv_refEnforcement_24_0= ruleRefEnforcement ) )* | ( (lv_refEAll_25_0= 'All' ) ) ) otherlv_26= ',' )? otherlv_27= 'Modality' ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) ) otherlv_29= '};' ) ;
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
        Token lv_refPDAll_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_refSAll_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_refEAll_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_modality_28_1=null;
        Token lv_modality_28_2=null;
        Token lv_modality_28_3=null;
        Token otherlv_29=null;
        EObject lv_refPrivateData_16_0 = null;

        EObject lv_refService_20_0 = null;

        EObject lv_refEnforcement_24_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2378:28: ( (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_17_0= 'All' ) ) ) otherlv_18= ',' )? (otherlv_19= 'RefersTo Service' ( ( (lv_refService_20_0= ruleRefService ) )* | ( (lv_refSAll_21_0= 'All' ) ) ) otherlv_22= ',' )? (otherlv_23= 'RefersTo Enforcement' ( ( (lv_refEnforcement_24_0= ruleRefEnforcement ) )* | ( (lv_refEAll_25_0= 'All' ) ) ) otherlv_26= ',' )? otherlv_27= 'Modality' ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) ) otherlv_29= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2379:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_17_0= 'All' ) ) ) otherlv_18= ',' )? (otherlv_19= 'RefersTo Service' ( ( (lv_refService_20_0= ruleRefService ) )* | ( (lv_refSAll_21_0= 'All' ) ) ) otherlv_22= ',' )? (otherlv_23= 'RefersTo Enforcement' ( ( (lv_refEnforcement_24_0= ruleRefEnforcement ) )* | ( (lv_refEAll_25_0= 'All' ) ) ) otherlv_26= ',' )? otherlv_27= 'Modality' ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) ) otherlv_29= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2379:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_17_0= 'All' ) ) ) otherlv_18= ',' )? (otherlv_19= 'RefersTo Service' ( ( (lv_refService_20_0= ruleRefService ) )* | ( (lv_refSAll_21_0= 'All' ) ) ) otherlv_22= ',' )? (otherlv_23= 'RefersTo Enforcement' ( ( (lv_refEnforcement_24_0= ruleRefEnforcement ) )* | ( (lv_refEAll_25_0= 'All' ) ) ) otherlv_26= ',' )? otherlv_27= 'Modality' ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) ) otherlv_29= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2379:3: otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_17_0= 'All' ) ) ) otherlv_18= ',' )? (otherlv_19= 'RefersTo Service' ( ( (lv_refService_20_0= ruleRefService ) )* | ( (lv_refSAll_21_0= 'All' ) ) ) otherlv_22= ',' )? (otherlv_23= 'RefersTo Enforcement' ( ( (lv_refEnforcement_24_0= ruleRefEnforcement ) )* | ( (lv_refEAll_25_0= 'All' ) ) ) otherlv_26= ',' )? otherlv_27= 'Modality' ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) ) otherlv_29= '};'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleRetention5023); 

                	newLeafNode(otherlv_0, grammarAccess.getRetentionAccess().getRetentionKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2383:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2384:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2384:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2385:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRetention5040); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRetention5057); 

                	newLeafNode(otherlv_2, grammarAccess.getRetentionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleRetention5069); 

                	newLeafNode(otherlv_3, grammarAccess.getRetentionAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2409:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2410:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2410:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2411:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention5086); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRetention5103); 

                	newLeafNode(otherlv_5, grammarAccess.getRetentionAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,65,FOLLOW_65_in_ruleRetention5115); 

                	newLeafNode(otherlv_6, grammarAccess.getRetentionAccess().getConditionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2435:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2436:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2436:1: (lv_condition_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2437:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention5132); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleRetention5149); 

                	newLeafNode(otherlv_8, grammarAccess.getRetentionAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2457:1: (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==79) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2457:3: otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,79,FOLLOW_79_in_ruleRetention5162); 

                        	newLeafNode(otherlv_9, grammarAccess.getRetentionAccess().getPartOfRetentionKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2461:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2462:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2462:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2463:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRetention5182); 

                    		newLeafNode(otherlv_10, grammarAccess.getRetentionAccess().getPartRetentionRetentionCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleRetention5194); 

                        	newLeafNode(otherlv_11, grammarAccess.getRetentionAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,80,FOLLOW_80_in_ruleRetention5208); 

                	newLeafNode(otherlv_12, grammarAccess.getRetentionAccess().getPeriodKeyword_10());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2482:1: ( (lv_period_13_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2483:1: (lv_period_13_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2483:1: (lv_period_13_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2484:3: lv_period_13_0= RULE_STRING
            {
            lv_period_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention5225); 

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

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleRetention5242); 

                	newLeafNode(otherlv_14, grammarAccess.getRetentionAccess().getCommaKeyword_12());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2504:1: (otherlv_15= 'RefersTo PrivateData' ( ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_17_0= 'All' ) ) ) otherlv_18= ',' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==48) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2504:3: otherlv_15= 'RefersTo PrivateData' ( ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_17_0= 'All' ) ) ) otherlv_18= ','
                    {
                    otherlv_15=(Token)match(input,48,FOLLOW_48_in_ruleRetention5255); 

                        	newLeafNode(otherlv_15, grammarAccess.getRetentionAccess().getRefersToPrivateDataKeyword_13_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2508:1: ( ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_17_0= 'All' ) ) )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_ID||LA62_0==19) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==49) ) {
                        alt62=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2508:2: ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2508:2: ( (lv_refPrivateData_16_0= ruleRefPrivateData ) )*
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==RULE_ID) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2509:1: (lv_refPrivateData_16_0= ruleRefPrivateData )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2509:1: (lv_refPrivateData_16_0= ruleRefPrivateData )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2510:3: lv_refPrivateData_16_0= ruleRefPrivateData
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefPrivateDataRefPrivateDataParserRuleCall_13_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleRetention5277);
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
                            	    break loop61;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2527:6: ( (lv_refPDAll_17_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2527:6: ( (lv_refPDAll_17_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2528:1: (lv_refPDAll_17_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2528:1: (lv_refPDAll_17_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2529:3: lv_refPDAll_17_0= 'All'
                            {
                            lv_refPDAll_17_0=(Token)match(input,49,FOLLOW_49_in_ruleRetention5302); 

                                    newLeafNode(lv_refPDAll_17_0, grammarAccess.getRetentionAccess().getRefPDAllAllKeyword_13_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRetentionRule());
                            	        }
                                   		setWithLastConsumed(current, "refPDAll", lv_refPDAll_17_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleRetention5328); 

                        	newLeafNode(otherlv_18, grammarAccess.getRetentionAccess().getCommaKeyword_13_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2546:3: (otherlv_19= 'RefersTo Service' ( ( (lv_refService_20_0= ruleRefService ) )* | ( (lv_refSAll_21_0= 'All' ) ) ) otherlv_22= ',' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==67) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2546:5: otherlv_19= 'RefersTo Service' ( ( (lv_refService_20_0= ruleRefService ) )* | ( (lv_refSAll_21_0= 'All' ) ) ) otherlv_22= ','
                    {
                    otherlv_19=(Token)match(input,67,FOLLOW_67_in_ruleRetention5343); 

                        	newLeafNode(otherlv_19, grammarAccess.getRetentionAccess().getRefersToServiceKeyword_14_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2550:1: ( ( (lv_refService_20_0= ruleRefService ) )* | ( (lv_refSAll_21_0= 'All' ) ) )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_ID||LA65_0==19) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==49) ) {
                        alt65=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2550:2: ( (lv_refService_20_0= ruleRefService ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2550:2: ( (lv_refService_20_0= ruleRefService ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==RULE_ID) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2551:1: (lv_refService_20_0= ruleRefService )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2551:1: (lv_refService_20_0= ruleRefService )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2552:3: lv_refService_20_0= ruleRefService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefServiceRefServiceParserRuleCall_14_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefService_in_ruleRetention5365);
                            	    lv_refService_20_0=ruleRefService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refService",
                            	            		lv_refService_20_0, 
                            	            		"RefService");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop64;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2569:6: ( (lv_refSAll_21_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2569:6: ( (lv_refSAll_21_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2570:1: (lv_refSAll_21_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2570:1: (lv_refSAll_21_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2571:3: lv_refSAll_21_0= 'All'
                            {
                            lv_refSAll_21_0=(Token)match(input,49,FOLLOW_49_in_ruleRetention5390); 

                                    newLeafNode(lv_refSAll_21_0, grammarAccess.getRetentionAccess().getRefSAllAllKeyword_14_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRetentionRule());
                            	        }
                                   		setWithLastConsumed(current, "refSAll", lv_refSAll_21_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleRetention5416); 

                        	newLeafNode(otherlv_22, grammarAccess.getRetentionAccess().getCommaKeyword_14_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2588:3: (otherlv_23= 'RefersTo Enforcement' ( ( (lv_refEnforcement_24_0= ruleRefEnforcement ) )* | ( (lv_refEAll_25_0= 'All' ) ) ) otherlv_26= ',' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==68) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2588:5: otherlv_23= 'RefersTo Enforcement' ( ( (lv_refEnforcement_24_0= ruleRefEnforcement ) )* | ( (lv_refEAll_25_0= 'All' ) ) ) otherlv_26= ','
                    {
                    otherlv_23=(Token)match(input,68,FOLLOW_68_in_ruleRetention5431); 

                        	newLeafNode(otherlv_23, grammarAccess.getRetentionAccess().getRefersToEnforcementKeyword_15_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2592:1: ( ( (lv_refEnforcement_24_0= ruleRefEnforcement ) )* | ( (lv_refEAll_25_0= 'All' ) ) )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_ID||LA68_0==19) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==49) ) {
                        alt68=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2592:2: ( (lv_refEnforcement_24_0= ruleRefEnforcement ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2592:2: ( (lv_refEnforcement_24_0= ruleRefEnforcement ) )*
                            loop67:
                            do {
                                int alt67=2;
                                int LA67_0 = input.LA(1);

                                if ( (LA67_0==RULE_ID) ) {
                                    alt67=1;
                                }


                                switch (alt67) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2593:1: (lv_refEnforcement_24_0= ruleRefEnforcement )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2593:1: (lv_refEnforcement_24_0= ruleRefEnforcement )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2594:3: lv_refEnforcement_24_0= ruleRefEnforcement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefEnforcementRefEnforcementParserRuleCall_15_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleRetention5453);
                            	    lv_refEnforcement_24_0=ruleRefEnforcement();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refEnforcement",
                            	            		lv_refEnforcement_24_0, 
                            	            		"RefEnforcement");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop67;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2611:6: ( (lv_refEAll_25_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2611:6: ( (lv_refEAll_25_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2612:1: (lv_refEAll_25_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2612:1: (lv_refEAll_25_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2613:3: lv_refEAll_25_0= 'All'
                            {
                            lv_refEAll_25_0=(Token)match(input,49,FOLLOW_49_in_ruleRetention5478); 

                                    newLeafNode(lv_refEAll_25_0, grammarAccess.getRetentionAccess().getRefEAllAllKeyword_15_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRetentionRule());
                            	        }
                                   		setWithLastConsumed(current, "refEAll", lv_refEAll_25_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_26=(Token)match(input,19,FOLLOW_19_in_ruleRetention5504); 

                        	newLeafNode(otherlv_26, grammarAccess.getRetentionAccess().getCommaKeyword_15_2());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,69,FOLLOW_69_in_ruleRetention5518); 

                	newLeafNode(otherlv_27, grammarAccess.getRetentionAccess().getModalityKeyword_16());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2634:1: ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2635:1: ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2635:1: ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2636:1: (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2636:1: (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' )
            int alt70=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt70=1;
                }
                break;
            case 71:
                {
                alt70=2;
                }
                break;
            case 72:
                {
                alt70=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2637:3: lv_modality_28_1= 'Permitted'
                    {
                    lv_modality_28_1=(Token)match(input,70,FOLLOW_70_in_ruleRetention5538); 

                            newLeafNode(lv_modality_28_1, grammarAccess.getRetentionAccess().getModalityPermittedKeyword_17_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_28_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2649:8: lv_modality_28_2= 'Obligation'
                    {
                    lv_modality_28_2=(Token)match(input,71,FOLLOW_71_in_ruleRetention5567); 

                            newLeafNode(lv_modality_28_2, grammarAccess.getRetentionAccess().getModalityObligationKeyword_17_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_28_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2661:8: lv_modality_28_3= 'Forbidden'
                    {
                    lv_modality_28_3=(Token)match(input,72,FOLLOW_72_in_ruleRetention5596); 

                            newLeafNode(lv_modality_28_3, grammarAccess.getRetentionAccess().getModalityForbiddenKeyword_17_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_28_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_29=(Token)match(input,13,FOLLOW_13_in_ruleRetention5624); 

                	newLeafNode(otherlv_29, grammarAccess.getRetentionAccess().getRightCurlyBracketSemicolonKeyword_18());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2688:1: entryRuleUsage returns [EObject current=null] : iv_ruleUsage= ruleUsage EOF ;
    public final EObject entryRuleUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsage = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2689:2: (iv_ruleUsage= ruleUsage EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2690:2: iv_ruleUsage= ruleUsage EOF
            {
             newCompositeNode(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage5660);
            iv_ruleUsage=ruleUsage();

            state._fsp--;

             current =iv_ruleUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage5670); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2697:1: ruleUsage returns [EObject current=null] : (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' ) ;
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
        Token lv_refPDAll_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_refSAll_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_refEAll_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_modality_25_1=null;
        Token lv_modality_25_2=null;
        Token lv_modality_25_3=null;
        Token otherlv_26=null;
        EObject lv_refPrivateData_13_0 = null;

        EObject lv_refService_17_0 = null;

        EObject lv_refEnforcement_21_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2700:28: ( (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2701:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2701:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2701:3: otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleUsage5707); 

                	newLeafNode(otherlv_0, grammarAccess.getUsageAccess().getUsageKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2705:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2706:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2706:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2707:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage5724); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUsage5741); 

                	newLeafNode(otherlv_2, grammarAccess.getUsageAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleUsage5753); 

                	newLeafNode(otherlv_3, grammarAccess.getUsageAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2731:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2732:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2732:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2733:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage5770); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleUsage5787); 

                	newLeafNode(otherlv_5, grammarAccess.getUsageAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,65,FOLLOW_65_in_ruleUsage5799); 

                	newLeafNode(otherlv_6, grammarAccess.getUsageAccess().getConditionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2757:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2758:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2758:1: (lv_condition_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2759:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage5816); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleUsage5833); 

                	newLeafNode(otherlv_8, grammarAccess.getUsageAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2779:1: (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==82) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2779:3: otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,82,FOLLOW_82_in_ruleUsage5846); 

                        	newLeafNode(otherlv_9, grammarAccess.getUsageAccess().getPartOfUsageKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2783:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2784:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2784:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2785:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage5866); 

                    		newLeafNode(otherlv_10, grammarAccess.getUsageAccess().getPartUsageUsageCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleUsage5878); 

                        	newLeafNode(otherlv_11, grammarAccess.getUsageAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2800:3: (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==48) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2800:5: otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ','
                    {
                    otherlv_12=(Token)match(input,48,FOLLOW_48_in_ruleUsage5893); 

                        	newLeafNode(otherlv_12, grammarAccess.getUsageAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2804:1: ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==RULE_ID||LA73_0==19) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==49) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2804:2: ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2804:2: ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )*
                            loop72:
                            do {
                                int alt72=2;
                                int LA72_0 = input.LA(1);

                                if ( (LA72_0==RULE_ID) ) {
                                    alt72=1;
                                }


                                switch (alt72) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2805:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2805:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2806:3: lv_refPrivateData_13_0= ruleRefPrivateData
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefPrivateDataRefPrivateDataParserRuleCall_10_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleUsage5915);
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
                            	    break loop72;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2823:6: ( (lv_refPDAll_14_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2823:6: ( (lv_refPDAll_14_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2824:1: (lv_refPDAll_14_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2824:1: (lv_refPDAll_14_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2825:3: lv_refPDAll_14_0= 'All'
                            {
                            lv_refPDAll_14_0=(Token)match(input,49,FOLLOW_49_in_ruleUsage5940); 

                                    newLeafNode(lv_refPDAll_14_0, grammarAccess.getUsageAccess().getRefPDAllAllKeyword_10_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUsageRule());
                            	        }
                                   		setWithLastConsumed(current, "refPDAll", lv_refPDAll_14_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleUsage5966); 

                        	newLeafNode(otherlv_15, grammarAccess.getUsageAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2842:3: (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==67) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2842:5: otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ','
                    {
                    otherlv_16=(Token)match(input,67,FOLLOW_67_in_ruleUsage5981); 

                        	newLeafNode(otherlv_16, grammarAccess.getUsageAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2846:1: ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==RULE_ID||LA76_0==19) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==49) ) {
                        alt76=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2846:2: ( (lv_refService_17_0= ruleRefService ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2846:2: ( (lv_refService_17_0= ruleRefService ) )*
                            loop75:
                            do {
                                int alt75=2;
                                int LA75_0 = input.LA(1);

                                if ( (LA75_0==RULE_ID) ) {
                                    alt75=1;
                                }


                                switch (alt75) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2847:1: (lv_refService_17_0= ruleRefService )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2847:1: (lv_refService_17_0= ruleRefService )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2848:3: lv_refService_17_0= ruleRefService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefServiceRefServiceParserRuleCall_11_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefService_in_ruleUsage6003);
                            	    lv_refService_17_0=ruleRefService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getUsageRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refService",
                            	            		lv_refService_17_0, 
                            	            		"RefService");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop75;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2865:6: ( (lv_refSAll_18_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2865:6: ( (lv_refSAll_18_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2866:1: (lv_refSAll_18_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2866:1: (lv_refSAll_18_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2867:3: lv_refSAll_18_0= 'All'
                            {
                            lv_refSAll_18_0=(Token)match(input,49,FOLLOW_49_in_ruleUsage6028); 

                                    newLeafNode(lv_refSAll_18_0, grammarAccess.getUsageAccess().getRefSAllAllKeyword_11_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUsageRule());
                            	        }
                                   		setWithLastConsumed(current, "refSAll", lv_refSAll_18_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleUsage6054); 

                        	newLeafNode(otherlv_19, grammarAccess.getUsageAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2884:3: (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==68) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2884:5: otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ','
                    {
                    otherlv_20=(Token)match(input,68,FOLLOW_68_in_ruleUsage6069); 

                        	newLeafNode(otherlv_20, grammarAccess.getUsageAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2888:1: ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==RULE_ID||LA79_0==19) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==49) ) {
                        alt79=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2888:2: ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2888:2: ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )*
                            loop78:
                            do {
                                int alt78=2;
                                int LA78_0 = input.LA(1);

                                if ( (LA78_0==RULE_ID) ) {
                                    alt78=1;
                                }


                                switch (alt78) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2889:1: (lv_refEnforcement_21_0= ruleRefEnforcement )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2889:1: (lv_refEnforcement_21_0= ruleRefEnforcement )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2890:3: lv_refEnforcement_21_0= ruleRefEnforcement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefEnforcementRefEnforcementParserRuleCall_12_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleUsage6091);
                            	    lv_refEnforcement_21_0=ruleRefEnforcement();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getUsageRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refEnforcement",
                            	            		lv_refEnforcement_21_0, 
                            	            		"RefEnforcement");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop78;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2907:6: ( (lv_refEAll_22_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2907:6: ( (lv_refEAll_22_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2908:1: (lv_refEAll_22_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2908:1: (lv_refEAll_22_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2909:3: lv_refEAll_22_0= 'All'
                            {
                            lv_refEAll_22_0=(Token)match(input,49,FOLLOW_49_in_ruleUsage6116); 

                                    newLeafNode(lv_refEAll_22_0, grammarAccess.getUsageAccess().getRefEAllAllKeyword_12_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUsageRule());
                            	        }
                                   		setWithLastConsumed(current, "refEAll", lv_refEAll_22_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleUsage6142); 

                        	newLeafNode(otherlv_23, grammarAccess.getUsageAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,69,FOLLOW_69_in_ruleUsage6156); 

                	newLeafNode(otherlv_24, grammarAccess.getUsageAccess().getModalityKeyword_13());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2930:1: ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2931:1: ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2931:1: ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2932:1: (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2932:1: (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' )
            int alt81=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt81=1;
                }
                break;
            case 71:
                {
                alt81=2;
                }
                break;
            case 72:
                {
                alt81=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2933:3: lv_modality_25_1= 'Permitted'
                    {
                    lv_modality_25_1=(Token)match(input,70,FOLLOW_70_in_ruleUsage6176); 

                            newLeafNode(lv_modality_25_1, grammarAccess.getUsageAccess().getModalityPermittedKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_25_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2945:8: lv_modality_25_2= 'Obligation'
                    {
                    lv_modality_25_2=(Token)match(input,71,FOLLOW_71_in_ruleUsage6205); 

                            newLeafNode(lv_modality_25_2, grammarAccess.getUsageAccess().getModalityObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_25_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2957:8: lv_modality_25_3= 'Forbidden'
                    {
                    lv_modality_25_3=(Token)match(input,72,FOLLOW_72_in_ruleUsage6234); 

                            newLeafNode(lv_modality_25_3, grammarAccess.getUsageAccess().getModalityForbiddenKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_25_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_26=(Token)match(input,13,FOLLOW_13_in_ruleUsage6262); 

                	newLeafNode(otherlv_26, grammarAccess.getUsageAccess().getRightCurlyBracketSemicolonKeyword_15());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2984:1: entryRuleInformative returns [EObject current=null] : iv_ruleInformative= ruleInformative EOF ;
    public final EObject entryRuleInformative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformative = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2985:2: (iv_ruleInformative= ruleInformative EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2986:2: iv_ruleInformative= ruleInformative EOF
            {
             newCompositeNode(grammarAccess.getInformativeRule()); 
            pushFollow(FOLLOW_ruleInformative_in_entryRuleInformative6298);
            iv_ruleInformative=ruleInformative();

            state._fsp--;

             current =iv_ruleInformative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInformative6308); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2993:1: ruleInformative returns [EObject current=null] : (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' ) ;
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
        Token lv_refPDAll_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_refSAll_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_refEAll_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_modality_25_1=null;
        Token lv_modality_25_2=null;
        Token lv_modality_25_3=null;
        Token otherlv_26=null;
        EObject lv_refPrivateData_13_0 = null;

        EObject lv_refService_17_0 = null;

        EObject lv_refEnforcement_21_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2996:28: ( (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2997:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2997:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2997:3: otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )? (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )? (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) ) otherlv_26= '};'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_83_in_ruleInformative6345); 

                	newLeafNode(otherlv_0, grammarAccess.getInformativeAccess().getInformativeKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3001:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3002:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3002:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3003:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformative6362); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInformative6379); 

                	newLeafNode(otherlv_2, grammarAccess.getInformativeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInformative6391); 

                	newLeafNode(otherlv_3, grammarAccess.getInformativeAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3027:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3028:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3028:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3029:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative6408); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleInformative6425); 

                	newLeafNode(otherlv_5, grammarAccess.getInformativeAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,65,FOLLOW_65_in_ruleInformative6437); 

                	newLeafNode(otherlv_6, grammarAccess.getInformativeAccess().getConditionKeyword_6());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3053:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3054:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3054:1: (lv_condition_7_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3055:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative6454); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleInformative6471); 

                	newLeafNode(otherlv_8, grammarAccess.getInformativeAccess().getCommaKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3075:1: (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==84) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3075:3: otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,84,FOLLOW_84_in_ruleInformative6484); 

                        	newLeafNode(otherlv_9, grammarAccess.getInformativeAccess().getPartOfInformativeKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3079:1: ( (otherlv_10= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3080:1: (otherlv_10= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3080:1: (otherlv_10= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3081:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformative6504); 

                    		newLeafNode(otherlv_10, grammarAccess.getInformativeAccess().getPartInformativeInformativeCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleInformative6516); 

                        	newLeafNode(otherlv_11, grammarAccess.getInformativeAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3096:3: (otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ',' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==48) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3096:5: otherlv_12= 'RefersTo PrivateData' ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) ) otherlv_15= ','
                    {
                    otherlv_12=(Token)match(input,48,FOLLOW_48_in_ruleInformative6531); 

                        	newLeafNode(otherlv_12, grammarAccess.getInformativeAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3100:1: ( ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_14_0= 'All' ) ) )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==RULE_ID||LA84_0==19) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==49) ) {
                        alt84=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3100:2: ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3100:2: ( (lv_refPrivateData_13_0= ruleRefPrivateData ) )*
                            loop83:
                            do {
                                int alt83=2;
                                int LA83_0 = input.LA(1);

                                if ( (LA83_0==RULE_ID) ) {
                                    alt83=1;
                                }


                                switch (alt83) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3101:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3101:1: (lv_refPrivateData_13_0= ruleRefPrivateData )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3102:3: lv_refPrivateData_13_0= ruleRefPrivateData
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefPrivateDataRefPrivateDataParserRuleCall_10_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleInformative6553);
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
                            	    break loop83;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3119:6: ( (lv_refPDAll_14_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3119:6: ( (lv_refPDAll_14_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3120:1: (lv_refPDAll_14_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3120:1: (lv_refPDAll_14_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3121:3: lv_refPDAll_14_0= 'All'
                            {
                            lv_refPDAll_14_0=(Token)match(input,49,FOLLOW_49_in_ruleInformative6578); 

                                    newLeafNode(lv_refPDAll_14_0, grammarAccess.getInformativeAccess().getRefPDAllAllKeyword_10_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInformativeRule());
                            	        }
                                   		setWithLastConsumed(current, "refPDAll", lv_refPDAll_14_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleInformative6604); 

                        	newLeafNode(otherlv_15, grammarAccess.getInformativeAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3138:3: (otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ',' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==67) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3138:5: otherlv_16= 'RefersTo Service' ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) ) otherlv_19= ','
                    {
                    otherlv_16=(Token)match(input,67,FOLLOW_67_in_ruleInformative6619); 

                        	newLeafNode(otherlv_16, grammarAccess.getInformativeAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3142:1: ( ( (lv_refService_17_0= ruleRefService ) )* | ( (lv_refSAll_18_0= 'All' ) ) )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==RULE_ID||LA87_0==19) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==49) ) {
                        alt87=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3142:2: ( (lv_refService_17_0= ruleRefService ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3142:2: ( (lv_refService_17_0= ruleRefService ) )*
                            loop86:
                            do {
                                int alt86=2;
                                int LA86_0 = input.LA(1);

                                if ( (LA86_0==RULE_ID) ) {
                                    alt86=1;
                                }


                                switch (alt86) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3143:1: (lv_refService_17_0= ruleRefService )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3143:1: (lv_refService_17_0= ruleRefService )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3144:3: lv_refService_17_0= ruleRefService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefServiceRefServiceParserRuleCall_11_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefService_in_ruleInformative6641);
                            	    lv_refService_17_0=ruleRefService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refService",
                            	            		lv_refService_17_0, 
                            	            		"RefService");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop86;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3161:6: ( (lv_refSAll_18_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3161:6: ( (lv_refSAll_18_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3162:1: (lv_refSAll_18_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3162:1: (lv_refSAll_18_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3163:3: lv_refSAll_18_0= 'All'
                            {
                            lv_refSAll_18_0=(Token)match(input,49,FOLLOW_49_in_ruleInformative6666); 

                                    newLeafNode(lv_refSAll_18_0, grammarAccess.getInformativeAccess().getRefSAllAllKeyword_11_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInformativeRule());
                            	        }
                                   		setWithLastConsumed(current, "refSAll", lv_refSAll_18_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleInformative6692); 

                        	newLeafNode(otherlv_19, grammarAccess.getInformativeAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3180:3: (otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ',' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==68) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3180:5: otherlv_20= 'RefersTo Enforcement' ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) ) otherlv_23= ','
                    {
                    otherlv_20=(Token)match(input,68,FOLLOW_68_in_ruleInformative6707); 

                        	newLeafNode(otherlv_20, grammarAccess.getInformativeAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3184:1: ( ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )* | ( (lv_refEAll_22_0= 'All' ) ) )
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==RULE_ID||LA90_0==19) ) {
                        alt90=1;
                    }
                    else if ( (LA90_0==49) ) {
                        alt90=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 90, 0, input);

                        throw nvae;
                    }
                    switch (alt90) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3184:2: ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3184:2: ( (lv_refEnforcement_21_0= ruleRefEnforcement ) )*
                            loop89:
                            do {
                                int alt89=2;
                                int LA89_0 = input.LA(1);

                                if ( (LA89_0==RULE_ID) ) {
                                    alt89=1;
                                }


                                switch (alt89) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3185:1: (lv_refEnforcement_21_0= ruleRefEnforcement )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3185:1: (lv_refEnforcement_21_0= ruleRefEnforcement )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3186:3: lv_refEnforcement_21_0= ruleRefEnforcement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefEnforcementRefEnforcementParserRuleCall_12_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleInformative6729);
                            	    lv_refEnforcement_21_0=ruleRefEnforcement();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refEnforcement",
                            	            		lv_refEnforcement_21_0, 
                            	            		"RefEnforcement");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop89;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3203:6: ( (lv_refEAll_22_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3203:6: ( (lv_refEAll_22_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3204:1: (lv_refEAll_22_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3204:1: (lv_refEAll_22_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3205:3: lv_refEAll_22_0= 'All'
                            {
                            lv_refEAll_22_0=(Token)match(input,49,FOLLOW_49_in_ruleInformative6754); 

                                    newLeafNode(lv_refEAll_22_0, grammarAccess.getInformativeAccess().getRefEAllAllKeyword_12_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInformativeRule());
                            	        }
                                   		setWithLastConsumed(current, "refEAll", lv_refEAll_22_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleInformative6780); 

                        	newLeafNode(otherlv_23, grammarAccess.getInformativeAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,69,FOLLOW_69_in_ruleInformative6794); 

                	newLeafNode(otherlv_24, grammarAccess.getInformativeAccess().getModalityKeyword_13());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3226:1: ( ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3227:1: ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3227:1: ( (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3228:1: (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3228:1: (lv_modality_25_1= 'Permitted' | lv_modality_25_2= 'Obligation' | lv_modality_25_3= 'Forbidden' )
            int alt92=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt92=1;
                }
                break;
            case 71:
                {
                alt92=2;
                }
                break;
            case 72:
                {
                alt92=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3229:3: lv_modality_25_1= 'Permitted'
                    {
                    lv_modality_25_1=(Token)match(input,70,FOLLOW_70_in_ruleInformative6814); 

                            newLeafNode(lv_modality_25_1, grammarAccess.getInformativeAccess().getModalityPermittedKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_25_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3241:8: lv_modality_25_2= 'Obligation'
                    {
                    lv_modality_25_2=(Token)match(input,71,FOLLOW_71_in_ruleInformative6843); 

                            newLeafNode(lv_modality_25_2, grammarAccess.getInformativeAccess().getModalityObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_25_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3253:8: lv_modality_25_3= 'Forbidden'
                    {
                    lv_modality_25_3=(Token)match(input,72,FOLLOW_72_in_ruleInformative6872); 

                            newLeafNode(lv_modality_25_3, grammarAccess.getInformativeAccess().getModalityForbiddenKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_25_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_26=(Token)match(input,13,FOLLOW_13_in_ruleInformative6900); 

                	newLeafNode(otherlv_26, grammarAccess.getInformativeAccess().getRightCurlyBracketSemicolonKeyword_15());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3280:1: entryRuleRecipientPart returns [EObject current=null] : iv_ruleRecipientPart= ruleRecipientPart EOF ;
    public final EObject entryRuleRecipientPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipientPart = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3281:2: (iv_ruleRecipientPart= ruleRecipientPart EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3282:2: iv_ruleRecipientPart= ruleRecipientPart EOF
            {
             newCompositeNode(grammarAccess.getRecipientPartRule()); 
            pushFollow(FOLLOW_ruleRecipientPart_in_entryRuleRecipientPart6936);
            iv_ruleRecipientPart=ruleRecipientPart();

            state._fsp--;

             current =iv_ruleRecipientPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipientPart6946); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3289:1: ruleRecipientPart returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRecipientPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3292:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3293:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3293:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3293:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3293:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3294:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3294:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3295:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRecipientPartRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipientPart6991); 

            		newLeafNode(otherlv_0, grammarAccess.getRecipientPartAccess().getRecipientPartRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3306:2: (otherlv_1= '-' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==26) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3306:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleRecipientPart7004); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3318:1: entryRuleRefRecipient returns [EObject current=null] : iv_ruleRefRecipient= ruleRefRecipient EOF ;
    public final EObject entryRuleRefRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefRecipient = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3319:2: (iv_ruleRefRecipient= ruleRefRecipient EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3320:2: iv_ruleRefRecipient= ruleRefRecipient EOF
            {
             newCompositeNode(grammarAccess.getRefRecipientRule()); 
            pushFollow(FOLLOW_ruleRefRecipient_in_entryRuleRefRecipient7042);
            iv_ruleRefRecipient=ruleRefRecipient();

            state._fsp--;

             current =iv_ruleRefRecipient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefRecipient7052); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3327:1: ruleRefRecipient returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefRecipient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3330:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3331:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3331:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3331:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3331:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3332:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3332:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3333:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRecipientRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipient7097); 

            		newLeafNode(otherlv_0, grammarAccess.getRefRecipientAccess().getRefRecipientRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3344:2: (otherlv_1= '-' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==26) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3344:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleRefRecipient7110); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3356:1: entryRuleRefRecipientSource returns [EObject current=null] : iv_ruleRefRecipientSource= ruleRefRecipientSource EOF ;
    public final EObject entryRuleRefRecipientSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefRecipientSource = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3357:2: (iv_ruleRefRecipientSource= ruleRefRecipientSource EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3358:2: iv_ruleRefRecipientSource= ruleRefRecipientSource EOF
            {
             newCompositeNode(grammarAccess.getRefRecipientSourceRule()); 
            pushFollow(FOLLOW_ruleRefRecipientSource_in_entryRuleRefRecipientSource7148);
            iv_ruleRefRecipientSource=ruleRefRecipientSource();

            state._fsp--;

             current =iv_ruleRefRecipientSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefRecipientSource7158); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3365:1: ruleRefRecipientSource returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefRecipientSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3368:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3369:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3369:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3369:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3369:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3370:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3370:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3371:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRecipientSourceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipientSource7203); 

            		newLeafNode(otherlv_0, grammarAccess.getRefRecipientSourceAccess().getRefRecipientSourceRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3382:2: (otherlv_1= '-' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==26) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3382:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleRefRecipientSource7216); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3394:1: entryRuleRefRecipientTarget returns [EObject current=null] : iv_ruleRefRecipientTarget= ruleRefRecipientTarget EOF ;
    public final EObject entryRuleRefRecipientTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefRecipientTarget = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3395:2: (iv_ruleRefRecipientTarget= ruleRefRecipientTarget EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3396:2: iv_ruleRefRecipientTarget= ruleRefRecipientTarget EOF
            {
             newCompositeNode(grammarAccess.getRefRecipientTargetRule()); 
            pushFollow(FOLLOW_ruleRefRecipientTarget_in_entryRuleRefRecipientTarget7254);
            iv_ruleRefRecipientTarget=ruleRefRecipientTarget();

            state._fsp--;

             current =iv_ruleRefRecipientTarget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefRecipientTarget7264); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3403:1: ruleRefRecipientTarget returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefRecipientTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3406:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3407:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3407:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3407:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3407:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3408:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3408:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3409:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRecipientTargetRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipientTarget7309); 

            		newLeafNode(otherlv_0, grammarAccess.getRefRecipientTargetAccess().getRefRecipientTargetRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3420:2: (otherlv_1= '-' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==26) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3420:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleRefRecipientTarget7322); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3432:1: entryRuleRefService returns [EObject current=null] : iv_ruleRefService= ruleRefService EOF ;
    public final EObject entryRuleRefService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefService = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3433:2: (iv_ruleRefService= ruleRefService EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3434:2: iv_ruleRefService= ruleRefService EOF
            {
             newCompositeNode(grammarAccess.getRefServiceRule()); 
            pushFollow(FOLLOW_ruleRefService_in_entryRuleRefService7360);
            iv_ruleRefService=ruleRefService();

            state._fsp--;

             current =iv_ruleRefService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefService7370); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3441:1: ruleRefService returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3444:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3445:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3445:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3445:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3445:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3446:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3446:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3447:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefServiceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefService7415); 

            		newLeafNode(otherlv_0, grammarAccess.getRefServiceAccess().getRefServiceServiceCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3458:2: (otherlv_1= '-' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==26) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3458:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleRefService7428); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3470:1: entryRuleServicePart returns [EObject current=null] : iv_ruleServicePart= ruleServicePart EOF ;
    public final EObject entryRuleServicePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServicePart = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3471:2: (iv_ruleServicePart= ruleServicePart EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3472:2: iv_ruleServicePart= ruleServicePart EOF
            {
             newCompositeNode(grammarAccess.getServicePartRule()); 
            pushFollow(FOLLOW_ruleServicePart_in_entryRuleServicePart7466);
            iv_ruleServicePart=ruleServicePart();

            state._fsp--;

             current =iv_ruleServicePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServicePart7476); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3479:1: ruleServicePart returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleServicePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3482:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3483:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3483:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3483:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3483:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3484:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3484:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3485:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServicePartRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServicePart7521); 

            		newLeafNode(otherlv_0, grammarAccess.getServicePartAccess().getServicePartServiceCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3496:2: (otherlv_1= '-' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==26) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3496:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleServicePart7534); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3508:1: entryRuleRefPrivateData returns [EObject current=null] : iv_ruleRefPrivateData= ruleRefPrivateData EOF ;
    public final EObject entryRuleRefPrivateData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPrivateData = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3509:2: (iv_ruleRefPrivateData= ruleRefPrivateData EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3510:2: iv_ruleRefPrivateData= ruleRefPrivateData EOF
            {
             newCompositeNode(grammarAccess.getRefPrivateDataRule()); 
            pushFollow(FOLLOW_ruleRefPrivateData_in_entryRuleRefPrivateData7572);
            iv_ruleRefPrivateData=ruleRefPrivateData();

            state._fsp--;

             current =iv_ruleRefPrivateData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefPrivateData7582); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3517:1: ruleRefPrivateData returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefPrivateData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3520:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3521:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3521:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3521:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3521:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3522:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3522:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3523:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefPrivateDataRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefPrivateData7627); 

            		newLeafNode(otherlv_0, grammarAccess.getRefPrivateDataAccess().getRefPrivateDataPrivateDataCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3534:2: (otherlv_1= '-' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==26) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3534:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleRefPrivateData7640); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3546:1: entryRuleRefEnforcement returns [EObject current=null] : iv_ruleRefEnforcement= ruleRefEnforcement EOF ;
    public final EObject entryRuleRefEnforcement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefEnforcement = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3547:2: (iv_ruleRefEnforcement= ruleRefEnforcement EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3548:2: iv_ruleRefEnforcement= ruleRefEnforcement EOF
            {
             newCompositeNode(grammarAccess.getRefEnforcementRule()); 
            pushFollow(FOLLOW_ruleRefEnforcement_in_entryRuleRefEnforcement7678);
            iv_ruleRefEnforcement=ruleRefEnforcement();

            state._fsp--;

             current =iv_ruleRefEnforcement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefEnforcement7688); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3555:1: ruleRefEnforcement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefEnforcement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3558:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3559:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3559:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3559:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3559:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3560:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3560:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3561:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefEnforcementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefEnforcement7733); 

            		newLeafNode(otherlv_0, grammarAccess.getRefEnforcementAccess().getRefEnforcementEnforcementCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3572:2: (otherlv_1= '-' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==26) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3572:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleRefEnforcement7746); 

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
    public static final BitSet FOLLOW_12_in_rulePolicy155 = new BitSet(new long[]{0x100880800002A000L,0x00000000000A4201L});
    public static final BitSet FOLLOW_ruleImport_in_rulePolicy176 = new BitSet(new long[]{0x100880800002A000L,0x00000000000A4201L});
    public static final BitSet FOLLOW_ruleMetadata_in_rulePolicy198 = new BitSet(new long[]{0x1008808000002000L,0x00000000000A4201L});
    public static final BitSet FOLLOW_ruleCollection_in_rulePolicy220 = new BitSet(new long[]{0x1008808000002000L,0x00000000000A4201L});
    public static final BitSet FOLLOW_ruleDisclosure_in_rulePolicy242 = new BitSet(new long[]{0x1008808000002000L,0x00000000000A4200L});
    public static final BitSet FOLLOW_ruleRetention_in_rulePolicy264 = new BitSet(new long[]{0x1008808000002000L,0x00000000000A4000L});
    public static final BitSet FOLLOW_ruleUsage_in_rulePolicy286 = new BitSet(new long[]{0x1008808000002000L,0x00000000000A0000L});
    public static final BitSet FOLLOW_ruleInformative_in_rulePolicy308 = new BitSet(new long[]{0x1008808000002000L,0x0000000000080000L});
    public static final BitSet FOLLOW_rulePrivateData_in_rulePolicy330 = new BitSet(new long[]{0x1008808000002000L});
    public static final BitSet FOLLOW_ruleRecipient_in_rulePolicy352 = new BitSet(new long[]{0x0008808000002000L});
    public static final BitSet FOLLOW_ruleService_in_rulePolicy374 = new BitSet(new long[]{0x0000808000002000L});
    public static final BitSet FOLLOW_ruleEnforcement_in_rulePolicy396 = new BitSet(new long[]{0x0000008000002000L});
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
    public static final BitSet FOLLOW_21_in_ruleMetadata953 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadata970 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMetadata987 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMetadata999 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadata1016 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMetadata1033 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMetadata1045 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_ruleMetadata1066 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMetadata1078 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMetadata1090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadata1107 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMetadata1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate1160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1212 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDate1229 = new BitSet(new long[]{0x0000007FF8000000L});
    public static final BitSet FOLLOW_ruleMonth_in_ruleDate1250 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDate1262 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonth_in_entryRuleMonth1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonth1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMonth1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMonth1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMonth1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMonth1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMonth1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMonth1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMonth1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMonth1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMonth1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMonth1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMonth1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleMonth1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnforcement_in_entryRuleEnforcement1744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnforcement1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEnforcement1791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnforcement1808 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnforcement1825 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEnforcement1837 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnforcement1854 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnforcement1871 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnforcement1883 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnforcement1900 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnforcement1917 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleEnforcement1929 = new BitSet(new long[]{0x00007C0000000000L});
    public static final BitSet FOLLOW_42_in_ruleEnforcement1949 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_43_in_ruleEnforcement1978 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_44_in_ruleEnforcement2007 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_45_in_ruleEnforcement2036 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_46_in_ruleEnforcement2065 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnforcement2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleService2176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2193 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleService2210 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleService2222 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService2239 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleService2256 = new BitSet(new long[]{0x0005000000102000L});
    public static final BitSet FOLLOW_20_in_ruleService2269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService2286 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleService2303 = new BitSet(new long[]{0x0005000000002000L});
    public static final BitSet FOLLOW_48_in_ruleService2318 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleService2340 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleService2365 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleService2391 = new BitSet(new long[]{0x0004000000002000L});
    public static final BitSet FOLLOW_50_in_ruleService2406 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleServicePart_in_ruleService2427 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleService2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipient_in_entryRuleRecipient2478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipient2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleRecipient2525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipient2542 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRecipient2559 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleRecipient2571 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecipient2588 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecipient2605 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRecipient2617 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecipient2634 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecipient2651 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_ruleRecipient2664 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRecipientPart_in_ruleRecipient2685 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRecipient2698 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleRecipient2712 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_54_in_ruleRecipient2732 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_55_in_ruleRecipient2761 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_56_in_ruleRecipient2790 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecipient2818 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleRecipient2830 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_57_in_ruleRecipient2850 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_58_in_ruleRecipient2879 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_59_in_ruleRecipient2908 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecipient2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrivateData_in_entryRulePrivateData2972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrivateData2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePrivateData3019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrivateData3036 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePrivateData3053 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePrivateData3065 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrivateData3082 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrivateData3099 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulePrivateData3111 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_61_in_rulePrivateData3131 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_62_in_rulePrivateData3160 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrivateData3188 = new BitSet(new long[]{0x8000000000002000L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePrivateData3209 = new BitSet(new long[]{0x8000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePrivateData3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute3258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleAttribute3305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute3322 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute3339 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAttribute3351 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute3368 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAttribute3385 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAttribute3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection3436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleCollection3483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollection3500 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollection3517 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCollection3529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection3546 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection3563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCollection3575 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection3592 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection3609 = new BitSet(new long[]{0x0001000000000000L,0x000000000000003CL});
    public static final BitSet FOLLOW_66_in_ruleCollection3622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollection3642 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection3654 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_48_in_ruleCollection3669 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleCollection3691 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleCollection3716 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection3742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_67_in_ruleCollection3757 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleCollection3779 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleCollection3804 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection3830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleCollection3845 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleCollection3867 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleCollection3892 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection3918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleCollection3932 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_70_in_ruleCollection3952 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71_in_ruleCollection3981 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_72_in_ruleCollection4010 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCollection4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisclosure_in_entryRuleDisclosure4074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisclosure4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleDisclosure4121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisclosure4138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDisclosure4155 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDisclosure4167 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure4184 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDisclosure4213 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure4230 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4247 = new BitSet(new long[]{0x0001000000000000L,0x0000000000003C38L});
    public static final BitSet FOLLOW_74_in_ruleDisclosure4260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisclosure4280 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4292 = new BitSet(new long[]{0x0001000000000000L,0x0000000000003838L});
    public static final BitSet FOLLOW_75_in_ruleDisclosure4307 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefRecipient_in_ruleDisclosure4329 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleDisclosure4354 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4380 = new BitSet(new long[]{0x0001000000000000L,0x0000000000003038L});
    public static final BitSet FOLLOW_76_in_ruleDisclosure4395 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefRecipientSource_in_ruleDisclosure4417 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleDisclosure4442 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4468 = new BitSet(new long[]{0x0001000000000000L,0x0000000000002038L});
    public static final BitSet FOLLOW_77_in_ruleDisclosure4483 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefRecipientTarget_in_ruleDisclosure4505 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleDisclosure4530 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4556 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_48_in_ruleDisclosure4571 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleDisclosure4593 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleDisclosure4618 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_67_in_ruleDisclosure4659 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleDisclosure4681 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleDisclosure4706 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleDisclosure4747 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleDisclosure4769 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleDisclosure4794 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure4820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleDisclosure4834 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_70_in_ruleDisclosure4854 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71_in_ruleDisclosure4883 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_72_in_ruleDisclosure4912 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDisclosure4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRetention_in_entryRuleRetention4976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRetention4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleRetention5023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRetention5040 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRetention5057 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRetention5069 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention5086 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention5103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRetention5115 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention5132 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention5149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_79_in_ruleRetention5162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRetention5182 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention5194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleRetention5208 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention5225 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention5242 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_48_in_ruleRetention5255 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleRetention5277 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleRetention5302 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention5328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_67_in_ruleRetention5343 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleRetention5365 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleRetention5390 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention5416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleRetention5431 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleRetention5453 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleRetention5478 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention5504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleRetention5518 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_70_in_ruleRetention5538 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71_in_ruleRetention5567 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_72_in_ruleRetention5596 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRetention5624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage5660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleUsage5707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage5724 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUsage5741 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUsage5753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage5770 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage5787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleUsage5799 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage5816 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage5833 = new BitSet(new long[]{0x0001000000000000L,0x0000000000040038L});
    public static final BitSet FOLLOW_82_in_ruleUsage5846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage5866 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage5878 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_48_in_ruleUsage5893 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleUsage5915 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleUsage5940 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage5966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_67_in_ruleUsage5981 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleUsage6003 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleUsage6028 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage6054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleUsage6069 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleUsage6091 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleUsage6116 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage6142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleUsage6156 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_70_in_ruleUsage6176 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71_in_ruleUsage6205 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_72_in_ruleUsage6234 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUsage6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInformative_in_entryRuleInformative6298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInformative6308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleInformative6345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformative6362 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInformative6379 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInformative6391 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative6408 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative6425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleInformative6437 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative6454 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative6471 = new BitSet(new long[]{0x0001000000000000L,0x0000000000100038L});
    public static final BitSet FOLLOW_84_in_ruleInformative6484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformative6504 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative6516 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_48_in_ruleInformative6531 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleInformative6553 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleInformative6578 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative6604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_67_in_ruleInformative6619 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleInformative6641 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleInformative6666 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative6692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleInformative6707 = new BitSet(new long[]{0x0002000000080010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleInformative6729 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_49_in_ruleInformative6754 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative6780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleInformative6794 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_70_in_ruleInformative6814 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71_in_ruleInformative6843 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_72_in_ruleInformative6872 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInformative6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipientPart_in_entryRuleRecipientPart6936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipientPart6946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipientPart6991 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleRecipientPart7004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefRecipient_in_entryRuleRefRecipient7042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefRecipient7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipient7097 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleRefRecipient7110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefRecipientSource_in_entryRuleRefRecipientSource7148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefRecipientSource7158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipientSource7203 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleRefRecipientSource7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefRecipientTarget_in_entryRuleRefRecipientTarget7254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefRecipientTarget7264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipientTarget7309 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleRefRecipientTarget7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefService_in_entryRuleRefService7360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefService7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefService7415 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleRefService7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServicePart_in_entryRuleServicePart7466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServicePart7476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServicePart7521 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleServicePart7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_entryRuleRefPrivateData7572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefPrivateData7582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefPrivateData7627 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleRefPrivateData7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_entryRuleRefEnforcement7678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefEnforcement7688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefEnforcement7733 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleRefEnforcement7746 = new BitSet(new long[]{0x0000000000000002L});

}