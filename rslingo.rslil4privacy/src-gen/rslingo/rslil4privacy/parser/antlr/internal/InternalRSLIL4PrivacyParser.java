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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'PolicyMetadata {'", "'PolicyName'", "'Description'", "'Author(s)'", "'Organization(s)'", "'Date'", "'Version'", "'-'", "'Jan'", "'Feb'", "'Mar'", "'Apr'", "'May'", "'Jun'", "'Jul'", "'Aug'", "'Sep'", "'Oct'", "'Nov'", "'Dec'", "'Enforcement'", "'Name'", "'Type'", "'Action'", "'Algorithm'", "'Config'", "'Process'", "'Tool'", "'Service'", "'RefersTo PrivateData'", "'All'", "'Service_Part'", "'Recipient'", "'Recipient_Part'", "'Scope'", "'Internal'", "'External'", "'Internal/External'", "'Individual'", "'Organization'", "'Individual/Organization'", "'PrivateData'", "'PersonalInformation'", "'UsageInformation'", "'Attribute'", "','", "'Collection'", "'Condition'", "'PartOf Collection'", "'RefersTo Service'", "'RefersTo Enforcement'", "'Modality'", "'Permitted'", "'Obligation'", "'Forbidden'", "'Disclosure'", "'PartOf Disclosure'", "'RefersTo Recipient'", "'RefersTo Recipient-Source'", "'RefersTo Recipient-Target'", "'Retention'", "'PartOf Retention'", "'Period'", "'Usage'", "'PartOf Usage'", "'Informative'", "'PartOf Informative'"
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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:76:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_metadata_4_0= ruleMetadata ) )? ( (lv_collection_5_0= ruleCollection ) )* ( (lv_disclosure_6_0= ruleDisclosure ) )* ( (lv_retention_7_0= ruleRetention ) )* ( (lv_usage_8_0= ruleUsage ) )* ( (lv_informative_9_0= ruleInformative ) )* ( (lv_privateData_10_0= rulePrivateData ) )* ( (lv_recipient_11_0= ruleRecipient ) )* ( (lv_service_12_0= ruleService ) )* ( (lv_enforcement_13_0= ruleEnforcement ) )* otherlv_14= '}' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:79:28: ( (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_metadata_4_0= ruleMetadata ) )? ( (lv_collection_5_0= ruleCollection ) )* ( (lv_disclosure_6_0= ruleDisclosure ) )* ( (lv_retention_7_0= ruleRetention ) )* ( (lv_usage_8_0= ruleUsage ) )* ( (lv_informative_9_0= ruleInformative ) )* ( (lv_privateData_10_0= rulePrivateData ) )* ( (lv_recipient_11_0= ruleRecipient ) )* ( (lv_service_12_0= ruleService ) )* ( (lv_enforcement_13_0= ruleEnforcement ) )* otherlv_14= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:80:1: (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_metadata_4_0= ruleMetadata ) )? ( (lv_collection_5_0= ruleCollection ) )* ( (lv_disclosure_6_0= ruleDisclosure ) )* ( (lv_retention_7_0= ruleRetention ) )* ( (lv_usage_8_0= ruleUsage ) )* ( (lv_informative_9_0= ruleInformative ) )* ( (lv_privateData_10_0= rulePrivateData ) )* ( (lv_recipient_11_0= ruleRecipient ) )* ( (lv_service_12_0= ruleService ) )* ( (lv_enforcement_13_0= ruleEnforcement ) )* otherlv_14= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:80:1: (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_metadata_4_0= ruleMetadata ) )? ( (lv_collection_5_0= ruleCollection ) )* ( (lv_disclosure_6_0= ruleDisclosure ) )* ( (lv_retention_7_0= ruleRetention ) )* ( (lv_usage_8_0= ruleUsage ) )* ( (lv_informative_9_0= ruleInformative ) )* ( (lv_privateData_10_0= rulePrivateData ) )* ( (lv_recipient_11_0= ruleRecipient ) )* ( (lv_service_12_0= ruleService ) )* ( (lv_enforcement_13_0= ruleEnforcement ) )* otherlv_14= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:80:3: otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( (lv_metadata_4_0= ruleMetadata ) )? ( (lv_collection_5_0= ruleCollection ) )* ( (lv_disclosure_6_0= ruleDisclosure ) )* ( (lv_retention_7_0= ruleRetention ) )* ( (lv_usage_8_0= ruleUsage ) )* ( (lv_informative_9_0= ruleInformative ) )* ( (lv_privateData_10_0= rulePrivateData ) )* ( (lv_recipient_11_0= ruleRecipient ) )* ( (lv_service_12_0= ruleService ) )* ( (lv_enforcement_13_0= ruleEnforcement ) )* otherlv_14= '}'
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

                if ( (LA3_0==63) ) {
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

                if ( (LA4_0==72) ) {
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

                if ( (LA5_0==77) ) {
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

                if ( (LA6_0==80) ) {
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

                if ( (LA7_0==82) ) {
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

                if ( (LA10_0==45) ) {
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

                	newLeafNode(otherlv_14, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_14());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:447:1: ruleMetadata returns [EObject current=null] : (otherlv_0= 'PolicyMetadata {' otherlv_1= 'PolicyName' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Author(s)' ( (lv_authors_6_0= RULE_STRING ) ) otherlv_7= 'Organization(s)' ( (lv_organizations_8_0= RULE_STRING ) ) otherlv_9= 'Date' ( (lv_date_10_0= ruleDate ) ) otherlv_11= 'Version' ( (lv_version_12_0= RULE_STRING ) ) otherlv_13= '}' ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_authors_6_0=null;
        Token otherlv_7=null;
        Token lv_organizations_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_version_12_0=null;
        Token otherlv_13=null;
        EObject lv_date_10_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:450:28: ( (otherlv_0= 'PolicyMetadata {' otherlv_1= 'PolicyName' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Author(s)' ( (lv_authors_6_0= RULE_STRING ) ) otherlv_7= 'Organization(s)' ( (lv_organizations_8_0= RULE_STRING ) ) otherlv_9= 'Date' ( (lv_date_10_0= ruleDate ) ) otherlv_11= 'Version' ( (lv_version_12_0= RULE_STRING ) ) otherlv_13= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:451:1: (otherlv_0= 'PolicyMetadata {' otherlv_1= 'PolicyName' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Author(s)' ( (lv_authors_6_0= RULE_STRING ) ) otherlv_7= 'Organization(s)' ( (lv_organizations_8_0= RULE_STRING ) ) otherlv_9= 'Date' ( (lv_date_10_0= ruleDate ) ) otherlv_11= 'Version' ( (lv_version_12_0= RULE_STRING ) ) otherlv_13= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:451:1: (otherlv_0= 'PolicyMetadata {' otherlv_1= 'PolicyName' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Author(s)' ( (lv_authors_6_0= RULE_STRING ) ) otherlv_7= 'Organization(s)' ( (lv_organizations_8_0= RULE_STRING ) ) otherlv_9= 'Date' ( (lv_date_10_0= ruleDate ) ) otherlv_11= 'Version' ( (lv_version_12_0= RULE_STRING ) ) otherlv_13= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:451:3: otherlv_0= 'PolicyMetadata {' otherlv_1= 'PolicyName' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Author(s)' ( (lv_authors_6_0= RULE_STRING ) ) otherlv_7= 'Organization(s)' ( (lv_organizations_8_0= RULE_STRING ) ) otherlv_9= 'Date' ( (lv_date_10_0= ruleDate ) ) otherlv_11= 'Version' ( (lv_version_12_0= RULE_STRING ) ) otherlv_13= '}'
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

                	newLeafNode(otherlv_3, grammarAccess.getMetadataAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:481:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:482:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:482:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:483:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata912); 

            			newLeafNode(lv_description_4_0, grammarAccess.getMetadataAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleMetadata929); 

                	newLeafNode(otherlv_5, grammarAccess.getMetadataAccess().getAuthorSKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:503:1: ( (lv_authors_6_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:504:1: (lv_authors_6_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:504:1: (lv_authors_6_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:505:3: lv_authors_6_0= RULE_STRING
            {
            lv_authors_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata946); 

            			newLeafNode(lv_authors_6_0, grammarAccess.getMetadataAccess().getAuthorsSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"authors",
                    		lv_authors_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleMetadata963); 

                	newLeafNode(otherlv_7, grammarAccess.getMetadataAccess().getOrganizationSKeyword_7());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:525:1: ( (lv_organizations_8_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:526:1: (lv_organizations_8_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:526:1: (lv_organizations_8_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:527:3: lv_organizations_8_0= RULE_STRING
            {
            lv_organizations_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata980); 

            			newLeafNode(lv_organizations_8_0, grammarAccess.getMetadataAccess().getOrganizationsSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"organizations",
                    		lv_organizations_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleMetadata997); 

                	newLeafNode(otherlv_9, grammarAccess.getMetadataAccess().getDateKeyword_9());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:547:1: ( (lv_date_10_0= ruleDate ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:548:1: (lv_date_10_0= ruleDate )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:548:1: (lv_date_10_0= ruleDate )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:549:3: lv_date_10_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getMetadataAccess().getDateDateParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_in_ruleMetadata1018);
            lv_date_10_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetadataRule());
            	        }
                   		set(
                   			current, 
                   			"date",
                    		lv_date_10_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleMetadata1030); 

                	newLeafNode(otherlv_11, grammarAccess.getMetadataAccess().getVersionKeyword_11());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:569:1: ( (lv_version_12_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:570:1: (lv_version_12_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:570:1: (lv_version_12_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:571:3: lv_version_12_0= RULE_STRING
            {
            lv_version_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata1047); 

            			newLeafNode(lv_version_12_0, grammarAccess.getMetadataAccess().getVersionSTRINGTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"version",
                    		lv_version_12_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleMetadata1064); 

                	newLeafNode(otherlv_13, grammarAccess.getMetadataAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:599:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:600:2: (iv_ruleDate= ruleDate EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:601:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate1100);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate1110); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:608:1: ruleDate returns [EObject current=null] : ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token lv_day_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_year_4_0=null;
        EObject lv_month_2_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:611:28: ( ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:612:1: ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:612:1: ( ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:612:2: ( (lv_day_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_month_2_0= ruleMonth ) ) otherlv_3= '-' ( (lv_year_4_0= RULE_INT ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:612:2: ( (lv_day_0_0= RULE_INT ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:613:1: (lv_day_0_0= RULE_INT )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:613:1: (lv_day_0_0= RULE_INT )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:614:3: lv_day_0_0= RULE_INT
            {
            lv_day_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1152); 

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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleDate1169); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getHyphenMinusKeyword_1());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:634:1: ( (lv_month_2_0= ruleMonth ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:635:1: (lv_month_2_0= ruleMonth )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:635:1: (lv_month_2_0= ruleMonth )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:636:3: lv_month_2_0= ruleMonth
            {
             
            	        newCompositeNode(grammarAccess.getDateAccess().getMonthMonthParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMonth_in_ruleDate1190);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleDate1202); 

                	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getHyphenMinusKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:656:1: ( (lv_year_4_0= RULE_INT ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:657:1: (lv_year_4_0= RULE_INT )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:657:1: (lv_year_4_0= RULE_INT )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:658:3: lv_year_4_0= RULE_INT
            {
            lv_year_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1219); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:682:1: entryRuleMonth returns [EObject current=null] : iv_ruleMonth= ruleMonth EOF ;
    public final EObject entryRuleMonth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonth = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:683:2: (iv_ruleMonth= ruleMonth EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:684:2: iv_ruleMonth= ruleMonth EOF
            {
             newCompositeNode(grammarAccess.getMonthRule()); 
            pushFollow(FOLLOW_ruleMonth_in_entryRuleMonth1260);
            iv_ruleMonth=ruleMonth();

            state._fsp--;

             current =iv_ruleMonth; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonth1270); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:691:1: ruleMonth returns [EObject current=null] : ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:694:28: ( ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:695:1: ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:695:1: ( ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:696:1: ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:696:1: ( (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:697:1: (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:697:1: (lv_name_0_1= 'Jan' | lv_name_0_2= 'Feb' | lv_name_0_3= 'Mar' | lv_name_0_4= 'Apr' | lv_name_0_5= 'May' | lv_name_0_6= 'Jun' | lv_name_0_7= 'Jul' | lv_name_0_8= 'Aug' | lv_name_0_9= 'Sep' | lv_name_0_10= 'Oct' | lv_name_0_11= 'Nov' | lv_name_0_12= 'Dec' )
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:698:3: lv_name_0_1= 'Jan'
                    {
                    lv_name_0_1=(Token)match(input,25,FOLLOW_25_in_ruleMonth1314); 

                            newLeafNode(lv_name_0_1, grammarAccess.getMonthAccess().getNameJanKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:710:8: lv_name_0_2= 'Feb'
                    {
                    lv_name_0_2=(Token)match(input,26,FOLLOW_26_in_ruleMonth1343); 

                            newLeafNode(lv_name_0_2, grammarAccess.getMonthAccess().getNameFebKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:722:8: lv_name_0_3= 'Mar'
                    {
                    lv_name_0_3=(Token)match(input,27,FOLLOW_27_in_ruleMonth1372); 

                            newLeafNode(lv_name_0_3, grammarAccess.getMonthAccess().getNameMarKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:734:8: lv_name_0_4= 'Apr'
                    {
                    lv_name_0_4=(Token)match(input,28,FOLLOW_28_in_ruleMonth1401); 

                            newLeafNode(lv_name_0_4, grammarAccess.getMonthAccess().getNameAprKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:746:8: lv_name_0_5= 'May'
                    {
                    lv_name_0_5=(Token)match(input,29,FOLLOW_29_in_ruleMonth1430); 

                            newLeafNode(lv_name_0_5, grammarAccess.getMonthAccess().getNameMayKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:758:8: lv_name_0_6= 'Jun'
                    {
                    lv_name_0_6=(Token)match(input,30,FOLLOW_30_in_ruleMonth1459); 

                            newLeafNode(lv_name_0_6, grammarAccess.getMonthAccess().getNameJunKeyword_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:770:8: lv_name_0_7= 'Jul'
                    {
                    lv_name_0_7=(Token)match(input,31,FOLLOW_31_in_ruleMonth1488); 

                            newLeafNode(lv_name_0_7, grammarAccess.getMonthAccess().getNameJulKeyword_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:782:8: lv_name_0_8= 'Aug'
                    {
                    lv_name_0_8=(Token)match(input,32,FOLLOW_32_in_ruleMonth1517); 

                            newLeafNode(lv_name_0_8, grammarAccess.getMonthAccess().getNameAugKeyword_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:794:8: lv_name_0_9= 'Sep'
                    {
                    lv_name_0_9=(Token)match(input,33,FOLLOW_33_in_ruleMonth1546); 

                            newLeafNode(lv_name_0_9, grammarAccess.getMonthAccess().getNameSepKeyword_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:806:8: lv_name_0_10= 'Oct'
                    {
                    lv_name_0_10=(Token)match(input,34,FOLLOW_34_in_ruleMonth1575); 

                            newLeafNode(lv_name_0_10, grammarAccess.getMonthAccess().getNameOctKeyword_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:818:8: lv_name_0_11= 'Nov'
                    {
                    lv_name_0_11=(Token)match(input,35,FOLLOW_35_in_ruleMonth1604); 

                            newLeafNode(lv_name_0_11, grammarAccess.getMonthAccess().getNameNovKeyword_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMonthRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:830:8: lv_name_0_12= 'Dec'
                    {
                    lv_name_0_12=(Token)match(input,36,FOLLOW_36_in_ruleMonth1633); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:853:1: entryRuleEnforcement returns [EObject current=null] : iv_ruleEnforcement= ruleEnforcement EOF ;
    public final EObject entryRuleEnforcement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnforcement = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:854:2: (iv_ruleEnforcement= ruleEnforcement EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:855:2: iv_ruleEnforcement= ruleEnforcement EOF
            {
             newCompositeNode(grammarAccess.getEnforcementRule()); 
            pushFollow(FOLLOW_ruleEnforcement_in_entryRuleEnforcement1684);
            iv_ruleEnforcement=ruleEnforcement();

            state._fsp--;

             current =iv_ruleEnforcement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnforcement1694); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:862:1: ruleEnforcement returns [EObject current=null] : (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Action' | lv_type_8_2= 'Algorithm' | lv_type_8_3= 'Config' | lv_type_8_4= 'Process' | lv_type_8_5= 'Tool' ) ) ) otherlv_9= '}' ) ;
    public final EObject ruleEnforcement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_enforcementName_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_type_8_1=null;
        Token lv_type_8_2=null;
        Token lv_type_8_3=null;
        Token lv_type_8_4=null;
        Token lv_type_8_5=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:865:28: ( (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Action' | lv_type_8_2= 'Algorithm' | lv_type_8_3= 'Config' | lv_type_8_4= 'Process' | lv_type_8_5= 'Tool' ) ) ) otherlv_9= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:866:1: (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Action' | lv_type_8_2= 'Algorithm' | lv_type_8_3= 'Config' | lv_type_8_4= 'Process' | lv_type_8_5= 'Tool' ) ) ) otherlv_9= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:866:1: (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Action' | lv_type_8_2= 'Algorithm' | lv_type_8_3= 'Config' | lv_type_8_4= 'Process' | lv_type_8_5= 'Tool' ) ) ) otherlv_9= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:866:3: otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'Action' | lv_type_8_2= 'Algorithm' | lv_type_8_3= 'Config' | lv_type_8_4= 'Process' | lv_type_8_5= 'Tool' ) ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleEnforcement1731); 

                	newLeafNode(otherlv_0, grammarAccess.getEnforcementAccess().getEnforcementKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:870:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:871:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:871:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:872:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnforcement1748); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEnforcement1765); 

                	newLeafNode(otherlv_2, grammarAccess.getEnforcementAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleEnforcement1777); 

                	newLeafNode(otherlv_3, grammarAccess.getEnforcementAccess().getNameKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:896:1: ( (lv_enforcementName_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:897:1: (lv_enforcementName_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:897:1: (lv_enforcementName_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:898:3: lv_enforcementName_4_0= RULE_STRING
            {
            lv_enforcementName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnforcement1794); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEnforcement1811); 

                	newLeafNode(otherlv_5, grammarAccess.getEnforcementAccess().getDescriptionKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:918:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:919:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:919:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:920:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnforcement1828); 

            			newLeafNode(lv_description_6_0, grammarAccess.getEnforcementAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnforcementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleEnforcement1845); 

                	newLeafNode(otherlv_7, grammarAccess.getEnforcementAccess().getTypeKeyword_7());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:940:1: ( ( (lv_type_8_1= 'Action' | lv_type_8_2= 'Algorithm' | lv_type_8_3= 'Config' | lv_type_8_4= 'Process' | lv_type_8_5= 'Tool' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:941:1: ( (lv_type_8_1= 'Action' | lv_type_8_2= 'Algorithm' | lv_type_8_3= 'Config' | lv_type_8_4= 'Process' | lv_type_8_5= 'Tool' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:941:1: ( (lv_type_8_1= 'Action' | lv_type_8_2= 'Algorithm' | lv_type_8_3= 'Config' | lv_type_8_4= 'Process' | lv_type_8_5= 'Tool' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:942:1: (lv_type_8_1= 'Action' | lv_type_8_2= 'Algorithm' | lv_type_8_3= 'Config' | lv_type_8_4= 'Process' | lv_type_8_5= 'Tool' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:942:1: (lv_type_8_1= 'Action' | lv_type_8_2= 'Algorithm' | lv_type_8_3= 'Config' | lv_type_8_4= 'Process' | lv_type_8_5= 'Tool' )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt15=1;
                }
                break;
            case 41:
                {
                alt15=2;
                }
                break;
            case 42:
                {
                alt15=3;
                }
                break;
            case 43:
                {
                alt15=4;
                }
                break;
            case 44:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:943:3: lv_type_8_1= 'Action'
                    {
                    lv_type_8_1=(Token)match(input,40,FOLLOW_40_in_ruleEnforcement1865); 

                            newLeafNode(lv_type_8_1, grammarAccess.getEnforcementAccess().getTypeActionKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:955:8: lv_type_8_2= 'Algorithm'
                    {
                    lv_type_8_2=(Token)match(input,41,FOLLOW_41_in_ruleEnforcement1894); 

                            newLeafNode(lv_type_8_2, grammarAccess.getEnforcementAccess().getTypeAlgorithmKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:967:8: lv_type_8_3= 'Config'
                    {
                    lv_type_8_3=(Token)match(input,42,FOLLOW_42_in_ruleEnforcement1923); 

                            newLeafNode(lv_type_8_3, grammarAccess.getEnforcementAccess().getTypeConfigKeyword_8_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:979:8: lv_type_8_4= 'Process'
                    {
                    lv_type_8_4=(Token)match(input,43,FOLLOW_43_in_ruleEnforcement1952); 

                            newLeafNode(lv_type_8_4, grammarAccess.getEnforcementAccess().getTypeProcessKeyword_8_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:991:8: lv_type_8_5= 'Tool'
                    {
                    lv_type_8_5=(Token)match(input,44,FOLLOW_44_in_ruleEnforcement1981); 

                            newLeafNode(lv_type_8_5, grammarAccess.getEnforcementAccess().getTypeToolKeyword_8_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleEnforcement2009); 

                	newLeafNode(otherlv_9, grammarAccess.getEnforcementAccess().getRightCurlyBracketKeyword_9());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1018:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1019:2: (iv_ruleService= ruleService EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1020:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService2045);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2055); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1027:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'RefersTo PrivateData' ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_9_0= 'All' ) ) ) )? (otherlv_10= 'Service_Part' ( (lv_servicePart_11_0= ruleServicePart ) )* )? otherlv_12= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_serviceName_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_refPDAll_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_refPrivateData_8_0 = null;

        EObject lv_servicePart_11_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1030:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'RefersTo PrivateData' ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_9_0= 'All' ) ) ) )? (otherlv_10= 'Service_Part' ( (lv_servicePart_11_0= ruleServicePart ) )* )? otherlv_12= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1031:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'RefersTo PrivateData' ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_9_0= 'All' ) ) ) )? (otherlv_10= 'Service_Part' ( (lv_servicePart_11_0= ruleServicePart ) )* )? otherlv_12= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1031:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'RefersTo PrivateData' ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_9_0= 'All' ) ) ) )? (otherlv_10= 'Service_Part' ( (lv_servicePart_11_0= ruleServicePart ) )* )? otherlv_12= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1031:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'RefersTo PrivateData' ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_9_0= 'All' ) ) ) )? (otherlv_10= 'Service_Part' ( (lv_servicePart_11_0= ruleServicePart ) )* )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleService2092); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1035:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1036:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1036:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1037:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2109); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleService2126); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleService2138); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getNameKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1061:1: ( (lv_serviceName_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1062:1: (lv_serviceName_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1062:1: (lv_serviceName_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1063:3: lv_serviceName_4_0= RULE_STRING
            {
            lv_serviceName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService2155); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1079:2: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1079:4: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleService2173); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getDescriptionKeyword_5_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1083:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1084:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1084:1: (lv_description_6_0= RULE_STRING )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1085:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService2190); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getServiceAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1101:4: (otherlv_7= 'RefersTo PrivateData' ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_9_0= 'All' ) ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1101:6: otherlv_7= 'RefersTo PrivateData' ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_9_0= 'All' ) ) )
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleService2210); 

                        	newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getRefersToPrivateDataKeyword_6_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1105:1: ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_9_0= 'All' ) ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID||LA18_0==13||LA18_0==48) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==47) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1105:2: ( (lv_refPrivateData_8_0= ruleRefPrivateData ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1105:2: ( (lv_refPrivateData_8_0= ruleRefPrivateData ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==RULE_ID) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1106:1: (lv_refPrivateData_8_0= ruleRefPrivateData )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1106:1: (lv_refPrivateData_8_0= ruleRefPrivateData )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1107:3: lv_refPrivateData_8_0= ruleRefPrivateData
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getServiceAccess().getRefPrivateDataRefPrivateDataParserRuleCall_6_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleService2232);
                            	    lv_refPrivateData_8_0=ruleRefPrivateData();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refPrivateData",
                            	            		lv_refPrivateData_8_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1124:6: ( (lv_refPDAll_9_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1124:6: ( (lv_refPDAll_9_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1125:1: (lv_refPDAll_9_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1125:1: (lv_refPDAll_9_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1126:3: lv_refPDAll_9_0= 'All'
                            {
                            lv_refPDAll_9_0=(Token)match(input,47,FOLLOW_47_in_ruleService2257); 

                                    newLeafNode(lv_refPDAll_9_0, grammarAccess.getServiceAccess().getRefPDAllAllKeyword_6_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getServiceRule());
                            	        }
                                   		setWithLastConsumed(current, "refPDAll", lv_refPDAll_9_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1139:5: (otherlv_10= 'Service_Part' ( (lv_servicePart_11_0= ruleServicePart ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1139:7: otherlv_10= 'Service_Part' ( (lv_servicePart_11_0= ruleServicePart ) )*
                    {
                    otherlv_10=(Token)match(input,48,FOLLOW_48_in_ruleService2286); 

                        	newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getService_PartKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1143:1: ( (lv_servicePart_11_0= ruleServicePart ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1144:1: (lv_servicePart_11_0= ruleServicePart )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1144:1: (lv_servicePart_11_0= ruleServicePart )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1145:3: lv_servicePart_11_0= ruleServicePart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceAccess().getServicePartServicePartParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleServicePart_in_ruleService2307);
                    	    lv_servicePart_11_0=ruleServicePart();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"servicePart",
                    	            		lv_servicePart_11_0, 
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

            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleService2322); 

                	newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1173:1: entryRuleRecipient returns [EObject current=null] : iv_ruleRecipient= ruleRecipient EOF ;
    public final EObject entryRuleRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipient = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1174:2: (iv_ruleRecipient= ruleRecipient EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1175:2: iv_ruleRecipient= ruleRecipient EOF
            {
             newCompositeNode(grammarAccess.getRecipientRule()); 
            pushFollow(FOLLOW_ruleRecipient_in_entryRuleRecipient2358);
            iv_ruleRecipient=ruleRecipient();

            state._fsp--;

             current =iv_ruleRecipient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipient2368); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1182:1: ruleRecipient returns [EObject current=null] : (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Recipient_Part' ( (lv_recipientPart_8_0= ruleRecipientPart ) )* )? otherlv_9= 'Scope' ( ( (lv_scope_10_1= 'Internal' | lv_scope_10_2= 'External' | lv_scope_10_3= 'Internal/External' ) ) ) otherlv_11= 'Type' ( ( (lv_type_12_1= 'Individual' | lv_type_12_2= 'Organization' | lv_type_12_3= 'Individual/Organization' ) ) ) otherlv_13= '}' ) ;
    public final EObject ruleRecipient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_recipientName_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_scope_10_1=null;
        Token lv_scope_10_2=null;
        Token lv_scope_10_3=null;
        Token otherlv_11=null;
        Token lv_type_12_1=null;
        Token lv_type_12_2=null;
        Token lv_type_12_3=null;
        Token otherlv_13=null;
        EObject lv_recipientPart_8_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1185:28: ( (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Recipient_Part' ( (lv_recipientPart_8_0= ruleRecipientPart ) )* )? otherlv_9= 'Scope' ( ( (lv_scope_10_1= 'Internal' | lv_scope_10_2= 'External' | lv_scope_10_3= 'Internal/External' ) ) ) otherlv_11= 'Type' ( ( (lv_type_12_1= 'Individual' | lv_type_12_2= 'Organization' | lv_type_12_3= 'Individual/Organization' ) ) ) otherlv_13= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1186:1: (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Recipient_Part' ( (lv_recipientPart_8_0= ruleRecipientPart ) )* )? otherlv_9= 'Scope' ( ( (lv_scope_10_1= 'Internal' | lv_scope_10_2= 'External' | lv_scope_10_3= 'Internal/External' ) ) ) otherlv_11= 'Type' ( ( (lv_type_12_1= 'Individual' | lv_type_12_2= 'Organization' | lv_type_12_3= 'Individual/Organization' ) ) ) otherlv_13= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1186:1: (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Recipient_Part' ( (lv_recipientPart_8_0= ruleRecipientPart ) )* )? otherlv_9= 'Scope' ( ( (lv_scope_10_1= 'Internal' | lv_scope_10_2= 'External' | lv_scope_10_3= 'Internal/External' ) ) ) otherlv_11= 'Type' ( ( (lv_type_12_1= 'Individual' | lv_type_12_2= 'Organization' | lv_type_12_3= 'Individual/Organization' ) ) ) otherlv_13= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1186:3: otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientName_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) (otherlv_7= 'Recipient_Part' ( (lv_recipientPart_8_0= ruleRecipientPart ) )* )? otherlv_9= 'Scope' ( ( (lv_scope_10_1= 'Internal' | lv_scope_10_2= 'External' | lv_scope_10_3= 'Internal/External' ) ) ) otherlv_11= 'Type' ( ( (lv_type_12_1= 'Individual' | lv_type_12_2= 'Organization' | lv_type_12_3= 'Individual/Organization' ) ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleRecipient2405); 

                	newLeafNode(otherlv_0, grammarAccess.getRecipientAccess().getRecipientKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1190:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1191:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1191:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1192:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipient2422); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRecipient2439); 

                	newLeafNode(otherlv_2, grammarAccess.getRecipientAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleRecipient2451); 

                	newLeafNode(otherlv_3, grammarAccess.getRecipientAccess().getNameKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1216:1: ( (lv_recipientName_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1217:1: (lv_recipientName_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1217:1: (lv_recipientName_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1218:3: lv_recipientName_4_0= RULE_STRING
            {
            lv_recipientName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecipient2468); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRecipient2485); 

                	newLeafNode(otherlv_5, grammarAccess.getRecipientAccess().getDescriptionKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1238:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1239:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1239:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1240:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecipient2502); 

            			newLeafNode(lv_description_6_0, grammarAccess.getRecipientAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecipientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1256:2: (otherlv_7= 'Recipient_Part' ( (lv_recipientPart_8_0= ruleRecipientPart ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==50) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1256:4: otherlv_7= 'Recipient_Part' ( (lv_recipientPart_8_0= ruleRecipientPart ) )*
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleRecipient2520); 

                        	newLeafNode(otherlv_7, grammarAccess.getRecipientAccess().getRecipient_PartKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1260:1: ( (lv_recipientPart_8_0= ruleRecipientPart ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1261:1: (lv_recipientPart_8_0= ruleRecipientPart )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1261:1: (lv_recipientPart_8_0= ruleRecipientPart )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1262:3: lv_recipientPart_8_0= ruleRecipientPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRecipientAccess().getRecipientPartRecipientPartParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRecipientPart_in_ruleRecipient2541);
                    	    lv_recipientPart_8_0=ruleRecipientPart();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRecipientRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"recipientPart",
                    	            		lv_recipientPart_8_0, 
                    	            		"RecipientPart");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,51,FOLLOW_51_in_ruleRecipient2556); 

                	newLeafNode(otherlv_9, grammarAccess.getRecipientAccess().getScopeKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1282:1: ( ( (lv_scope_10_1= 'Internal' | lv_scope_10_2= 'External' | lv_scope_10_3= 'Internal/External' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1283:1: ( (lv_scope_10_1= 'Internal' | lv_scope_10_2= 'External' | lv_scope_10_3= 'Internal/External' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1283:1: ( (lv_scope_10_1= 'Internal' | lv_scope_10_2= 'External' | lv_scope_10_3= 'Internal/External' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1284:1: (lv_scope_10_1= 'Internal' | lv_scope_10_2= 'External' | lv_scope_10_3= 'Internal/External' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1284:1: (lv_scope_10_1= 'Internal' | lv_scope_10_2= 'External' | lv_scope_10_3= 'Internal/External' )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt24=1;
                }
                break;
            case 53:
                {
                alt24=2;
                }
                break;
            case 54:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1285:3: lv_scope_10_1= 'Internal'
                    {
                    lv_scope_10_1=(Token)match(input,52,FOLLOW_52_in_ruleRecipient2576); 

                            newLeafNode(lv_scope_10_1, grammarAccess.getRecipientAccess().getScopeInternalKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "scope", lv_scope_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1297:8: lv_scope_10_2= 'External'
                    {
                    lv_scope_10_2=(Token)match(input,53,FOLLOW_53_in_ruleRecipient2605); 

                            newLeafNode(lv_scope_10_2, grammarAccess.getRecipientAccess().getScopeExternalKeyword_9_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "scope", lv_scope_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1309:8: lv_scope_10_3= 'Internal/External'
                    {
                    lv_scope_10_3=(Token)match(input,54,FOLLOW_54_in_ruleRecipient2634); 

                            newLeafNode(lv_scope_10_3, grammarAccess.getRecipientAccess().getScopeInternalExternalKeyword_9_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "scope", lv_scope_10_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleRecipient2662); 

                	newLeafNode(otherlv_11, grammarAccess.getRecipientAccess().getTypeKeyword_10());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1328:1: ( ( (lv_type_12_1= 'Individual' | lv_type_12_2= 'Organization' | lv_type_12_3= 'Individual/Organization' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1329:1: ( (lv_type_12_1= 'Individual' | lv_type_12_2= 'Organization' | lv_type_12_3= 'Individual/Organization' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1329:1: ( (lv_type_12_1= 'Individual' | lv_type_12_2= 'Organization' | lv_type_12_3= 'Individual/Organization' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1330:1: (lv_type_12_1= 'Individual' | lv_type_12_2= 'Organization' | lv_type_12_3= 'Individual/Organization' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1330:1: (lv_type_12_1= 'Individual' | lv_type_12_2= 'Organization' | lv_type_12_3= 'Individual/Organization' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt25=1;
                }
                break;
            case 56:
                {
                alt25=2;
                }
                break;
            case 57:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1331:3: lv_type_12_1= 'Individual'
                    {
                    lv_type_12_1=(Token)match(input,55,FOLLOW_55_in_ruleRecipient2682); 

                            newLeafNode(lv_type_12_1, grammarAccess.getRecipientAccess().getTypeIndividualKeyword_11_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_12_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1343:8: lv_type_12_2= 'Organization'
                    {
                    lv_type_12_2=(Token)match(input,56,FOLLOW_56_in_ruleRecipient2711); 

                            newLeafNode(lv_type_12_2, grammarAccess.getRecipientAccess().getTypeOrganizationKeyword_11_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_12_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1355:8: lv_type_12_3= 'Individual/Organization'
                    {
                    lv_type_12_3=(Token)match(input,57,FOLLOW_57_in_ruleRecipient2740); 

                            newLeafNode(lv_type_12_3, grammarAccess.getRecipientAccess().getTypeIndividualOrganizationKeyword_11_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_12_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleRecipient2768); 

                	newLeafNode(otherlv_13, grammarAccess.getRecipientAccess().getRightCurlyBracketKeyword_12());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1382:1: entryRulePrivateData returns [EObject current=null] : iv_rulePrivateData= rulePrivateData EOF ;
    public final EObject entryRulePrivateData() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateData = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1383:2: (iv_rulePrivateData= rulePrivateData EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1384:2: iv_rulePrivateData= rulePrivateData EOF
            {
             newCompositeNode(grammarAccess.getPrivateDataRule()); 
            pushFollow(FOLLOW_rulePrivateData_in_entryRulePrivateData2804);
            iv_rulePrivateData=rulePrivateData();

            state._fsp--;

             current =iv_rulePrivateData; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrivateData2814); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1391:1: rulePrivateData returns [EObject current=null] : (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( ( (lv_type_6_1= 'PersonalInformation' | lv_type_6_2= 'UsageInformation' ) ) ) ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' ) ;
    public final EObject rulePrivateData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_type_6_1=null;
        Token lv_type_6_2=null;
        Token otherlv_8=null;
        EObject lv_attribute_7_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1394:28: ( (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( ( (lv_type_6_1= 'PersonalInformation' | lv_type_6_2= 'UsageInformation' ) ) ) ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1395:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( ( (lv_type_6_1= 'PersonalInformation' | lv_type_6_2= 'UsageInformation' ) ) ) ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1395:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( ( (lv_type_6_1= 'PersonalInformation' | lv_type_6_2= 'UsageInformation' ) ) ) ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1395:3: otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Type' ( ( (lv_type_6_1= 'PersonalInformation' | lv_type_6_2= 'UsageInformation' ) ) ) ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_rulePrivateData2851); 

                	newLeafNode(otherlv_0, grammarAccess.getPrivateDataAccess().getPrivateDataKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1399:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1400:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1400:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1401:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrivateData2868); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePrivateData2885); 

                	newLeafNode(otherlv_2, grammarAccess.getPrivateDataAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_rulePrivateData2897); 

                	newLeafNode(otherlv_3, grammarAccess.getPrivateDataAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1425:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1426:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1426:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1427:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrivateData2914); 

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

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_rulePrivateData2931); 

                	newLeafNode(otherlv_5, grammarAccess.getPrivateDataAccess().getTypeKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1447:1: ( ( (lv_type_6_1= 'PersonalInformation' | lv_type_6_2= 'UsageInformation' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1448:1: ( (lv_type_6_1= 'PersonalInformation' | lv_type_6_2= 'UsageInformation' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1448:1: ( (lv_type_6_1= 'PersonalInformation' | lv_type_6_2= 'UsageInformation' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1449:1: (lv_type_6_1= 'PersonalInformation' | lv_type_6_2= 'UsageInformation' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1449:1: (lv_type_6_1= 'PersonalInformation' | lv_type_6_2= 'UsageInformation' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==59) ) {
                alt26=1;
            }
            else if ( (LA26_0==60) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1450:3: lv_type_6_1= 'PersonalInformation'
                    {
                    lv_type_6_1=(Token)match(input,59,FOLLOW_59_in_rulePrivateData2951); 

                            newLeafNode(lv_type_6_1, grammarAccess.getPrivateDataAccess().getTypePersonalInformationKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrivateDataRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1462:8: lv_type_6_2= 'UsageInformation'
                    {
                    lv_type_6_2=(Token)match(input,60,FOLLOW_60_in_rulePrivateData2980); 

                            newLeafNode(lv_type_6_2, grammarAccess.getPrivateDataAccess().getTypeUsageInformationKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrivateDataRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1477:2: ( (lv_attribute_7_0= ruleAttribute ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==61) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1478:1: (lv_attribute_7_0= ruleAttribute )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1478:1: (lv_attribute_7_0= ruleAttribute )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1479:3: lv_attribute_7_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrivateDataAccess().getAttributeAttributeParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePrivateData3017);
            	    lv_attribute_7_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPrivateDataRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_7_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_rulePrivateData3030); 

                	newLeafNode(otherlv_8, grammarAccess.getPrivateDataAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1507:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1508:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1509:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute3066);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute3076); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1516:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1519:28: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1520:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1520:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1520:3: otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )?
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleAttribute3113); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1524:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1525:1: (lv_name_1_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1525:1: (lv_name_1_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1526:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute3130); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAttribute3147); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleAttribute3159); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1550:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1551:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1551:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1552:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute3176); 

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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleAttribute3193); 

                	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1572:1: (otherlv_6= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==62) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1572:3: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,62,FOLLOW_62_in_ruleAttribute3206); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1584:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1585:2: (iv_ruleCollection= ruleCollection EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1586:2: iv_ruleCollection= ruleCollection EOF
            {
             newCompositeNode(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection3244);
            iv_ruleCollection=ruleCollection();

            state._fsp--;

             current =iv_ruleCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection3254); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1593:1: ruleCollection returns [EObject current=null] : (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Collection' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_condition_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_refPDAll_11_0=null;
        Token otherlv_12=null;
        Token lv_refSAll_14_0=null;
        Token otherlv_15=null;
        Token lv_refEAll_17_0=null;
        Token otherlv_18=null;
        Token lv_modality_19_1=null;
        Token lv_modality_19_2=null;
        Token lv_modality_19_3=null;
        Token otherlv_20=null;
        EObject lv_refPrivateData_10_0 = null;

        EObject lv_refService_13_0 = null;

        EObject lv_refEnforcement_16_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1596:28: ( (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Collection' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1597:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Collection' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1597:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Collection' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1597:3: otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Collection' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleCollection3291); 

                	newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getCollectionKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1601:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1602:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1602:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1603:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollection3308); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCollection3325); 

                	newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleCollection3337); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1627:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1628:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1628:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1629:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection3354); 

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

            otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleCollection3371); 

                	newLeafNode(otherlv_5, grammarAccess.getCollectionAccess().getConditionKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1649:1: ( (lv_condition_6_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1650:1: (lv_condition_6_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1650:1: (lv_condition_6_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1651:3: lv_condition_6_0= RULE_STRING
            {
            lv_condition_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection3388); 

            			newLeafNode(lv_condition_6_0, grammarAccess.getCollectionAccess().getConditionSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCollectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"condition",
                    		lv_condition_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1667:2: (otherlv_7= 'PartOf Collection' ( (otherlv_8= RULE_ID ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==65) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1667:4: otherlv_7= 'PartOf Collection' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,65,FOLLOW_65_in_ruleCollection3406); 

                        	newLeafNode(otherlv_7, grammarAccess.getCollectionAccess().getPartOfCollectionKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1671:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1672:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1672:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1673:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollection3426); 

                    		newLeafNode(otherlv_8, grammarAccess.getCollectionAccess().getPartCollectionCollectionCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1684:4: (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1684:6: otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) )
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleCollection3441); 

                        	newLeafNode(otherlv_9, grammarAccess.getCollectionAccess().getRefersToPrivateDataKeyword_8_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1688:1: ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID||(LA31_0>=66 && LA31_0<=68)) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==47) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1688:2: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1688:2: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==RULE_ID) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1689:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1689:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1690:3: lv_refPrivateData_10_0= ruleRefPrivateData
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefPrivateDataRefPrivateDataParserRuleCall_8_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleCollection3463);
                            	    lv_refPrivateData_10_0=ruleRefPrivateData();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCollectionRule());
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
                            	    break loop30;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1707:6: ( (lv_refPDAll_11_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1707:6: ( (lv_refPDAll_11_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1708:1: (lv_refPDAll_11_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1708:1: (lv_refPDAll_11_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1709:3: lv_refPDAll_11_0= 'All'
                            {
                            lv_refPDAll_11_0=(Token)match(input,47,FOLLOW_47_in_ruleCollection3488); 

                                    newLeafNode(lv_refPDAll_11_0, grammarAccess.getCollectionAccess().getRefPDAllAllKeyword_8_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCollectionRule());
                            	        }
                                   		setWithLastConsumed(current, "refPDAll", lv_refPDAll_11_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1722:5: (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==66) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1722:7: otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) )
                    {
                    otherlv_12=(Token)match(input,66,FOLLOW_66_in_ruleCollection3517); 

                        	newLeafNode(otherlv_12, grammarAccess.getCollectionAccess().getRefersToServiceKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1726:1: ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID||(LA34_0>=67 && LA34_0<=68)) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==47) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1726:2: ( (lv_refService_13_0= ruleRefService ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1726:2: ( (lv_refService_13_0= ruleRefService ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==RULE_ID) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1727:1: (lv_refService_13_0= ruleRefService )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1727:1: (lv_refService_13_0= ruleRefService )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1728:3: lv_refService_13_0= ruleRefService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefServiceRefServiceParserRuleCall_9_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefService_in_ruleCollection3539);
                            	    lv_refService_13_0=ruleRefService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refService",
                            	            		lv_refService_13_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1745:6: ( (lv_refSAll_14_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1745:6: ( (lv_refSAll_14_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1746:1: (lv_refSAll_14_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1746:1: (lv_refSAll_14_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1747:3: lv_refSAll_14_0= 'All'
                            {
                            lv_refSAll_14_0=(Token)match(input,47,FOLLOW_47_in_ruleCollection3564); 

                                    newLeafNode(lv_refSAll_14_0, grammarAccess.getCollectionAccess().getRefSAllAllKeyword_9_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCollectionRule());
                            	        }
                                   		setWithLastConsumed(current, "refSAll", lv_refSAll_14_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1760:5: (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==67) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1760:7: otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) )
                    {
                    otherlv_15=(Token)match(input,67,FOLLOW_67_in_ruleCollection3593); 

                        	newLeafNode(otherlv_15, grammarAccess.getCollectionAccess().getRefersToEnforcementKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1764:1: ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ID||LA37_0==68) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==47) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1764:2: ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1764:2: ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==RULE_ID) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1765:1: (lv_refEnforcement_16_0= ruleRefEnforcement )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1765:1: (lv_refEnforcement_16_0= ruleRefEnforcement )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1766:3: lv_refEnforcement_16_0= ruleRefEnforcement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefEnforcementRefEnforcementParserRuleCall_10_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleCollection3615);
                            	    lv_refEnforcement_16_0=ruleRefEnforcement();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refEnforcement",
                            	            		lv_refEnforcement_16_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1783:6: ( (lv_refEAll_17_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1783:6: ( (lv_refEAll_17_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1784:1: (lv_refEAll_17_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1784:1: (lv_refEAll_17_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1785:3: lv_refEAll_17_0= 'All'
                            {
                            lv_refEAll_17_0=(Token)match(input,47,FOLLOW_47_in_ruleCollection3640); 

                                    newLeafNode(lv_refEAll_17_0, grammarAccess.getCollectionAccess().getRefEAllAllKeyword_10_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCollectionRule());
                            	        }
                                   		setWithLastConsumed(current, "refEAll", lv_refEAll_17_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,68,FOLLOW_68_in_ruleCollection3668); 

                	newLeafNode(otherlv_18, grammarAccess.getCollectionAccess().getModalityKeyword_11());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1802:1: ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1803:1: ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1803:1: ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1804:1: (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1804:1: (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt39=1;
                }
                break;
            case 70:
                {
                alt39=2;
                }
                break;
            case 71:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1805:3: lv_modality_19_1= 'Permitted'
                    {
                    lv_modality_19_1=(Token)match(input,69,FOLLOW_69_in_ruleCollection3688); 

                            newLeafNode(lv_modality_19_1, grammarAccess.getCollectionAccess().getModalityPermittedKeyword_12_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_19_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1817:8: lv_modality_19_2= 'Obligation'
                    {
                    lv_modality_19_2=(Token)match(input,70,FOLLOW_70_in_ruleCollection3717); 

                            newLeafNode(lv_modality_19_2, grammarAccess.getCollectionAccess().getModalityObligationKeyword_12_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_19_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1829:8: lv_modality_19_3= 'Forbidden'
                    {
                    lv_modality_19_3=(Token)match(input,71,FOLLOW_71_in_ruleCollection3746); 

                            newLeafNode(lv_modality_19_3, grammarAccess.getCollectionAccess().getModalityForbiddenKeyword_12_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_19_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_20=(Token)match(input,13,FOLLOW_13_in_ruleCollection3774); 

                	newLeafNode(otherlv_20, grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1856:1: entryRuleDisclosure returns [EObject current=null] : iv_ruleDisclosure= ruleDisclosure EOF ;
    public final EObject entryRuleDisclosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisclosure = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1857:2: (iv_ruleDisclosure= ruleDisclosure EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1858:2: iv_ruleDisclosure= ruleDisclosure EOF
            {
             newCompositeNode(grammarAccess.getDisclosureRule()); 
            pushFollow(FOLLOW_ruleDisclosure_in_entryRuleDisclosure3810);
            iv_ruleDisclosure=ruleDisclosure();

            state._fsp--;

             current =iv_ruleDisclosure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisclosure3820); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1865:1: ruleDisclosure returns [EObject current=null] : (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Disclosure' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo Recipient' ( ( (lv_refRecipient_10_0= ruleRefRecipient ) )* | ( (lv_refRAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_17_0= 'All' ) ) ) )? (otherlv_18= 'RefersTo PrivateData' ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_20_0= 'All' ) ) ) )? (otherlv_21= 'RefersTo Service' ( ( (lv_refService_22_0= ruleRefService ) )* | ( (lv_refSAll_23_0= 'All' ) ) ) )? (otherlv_24= 'RefersTo Enforcement' ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) )* | ( (lv_refEAll_26_0= 'All' ) ) ) )? otherlv_27= 'Modality' ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) ) otherlv_29= '}' ) ;
    public final EObject ruleDisclosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_condition_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_refRAll_11_0=null;
        Token otherlv_12=null;
        Token lv_refRSAll_14_0=null;
        Token otherlv_15=null;
        Token lv_refRTAll_17_0=null;
        Token otherlv_18=null;
        Token lv_refPDAll_20_0=null;
        Token otherlv_21=null;
        Token lv_refSAll_23_0=null;
        Token otherlv_24=null;
        Token lv_refEAll_26_0=null;
        Token otherlv_27=null;
        Token lv_modality_28_1=null;
        Token lv_modality_28_2=null;
        Token lv_modality_28_3=null;
        Token otherlv_29=null;
        EObject lv_refRecipient_10_0 = null;

        EObject lv_refRecipientSource_13_0 = null;

        EObject lv_refRecipientTarget_16_0 = null;

        EObject lv_refPrivateData_19_0 = null;

        EObject lv_refService_22_0 = null;

        EObject lv_refEnforcement_25_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1868:28: ( (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Disclosure' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo Recipient' ( ( (lv_refRecipient_10_0= ruleRefRecipient ) )* | ( (lv_refRAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_17_0= 'All' ) ) ) )? (otherlv_18= 'RefersTo PrivateData' ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_20_0= 'All' ) ) ) )? (otherlv_21= 'RefersTo Service' ( ( (lv_refService_22_0= ruleRefService ) )* | ( (lv_refSAll_23_0= 'All' ) ) ) )? (otherlv_24= 'RefersTo Enforcement' ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) )* | ( (lv_refEAll_26_0= 'All' ) ) ) )? otherlv_27= 'Modality' ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) ) otherlv_29= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1869:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Disclosure' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo Recipient' ( ( (lv_refRecipient_10_0= ruleRefRecipient ) )* | ( (lv_refRAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_17_0= 'All' ) ) ) )? (otherlv_18= 'RefersTo PrivateData' ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_20_0= 'All' ) ) ) )? (otherlv_21= 'RefersTo Service' ( ( (lv_refService_22_0= ruleRefService ) )* | ( (lv_refSAll_23_0= 'All' ) ) ) )? (otherlv_24= 'RefersTo Enforcement' ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) )* | ( (lv_refEAll_26_0= 'All' ) ) ) )? otherlv_27= 'Modality' ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) ) otherlv_29= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1869:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Disclosure' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo Recipient' ( ( (lv_refRecipient_10_0= ruleRefRecipient ) )* | ( (lv_refRAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_17_0= 'All' ) ) ) )? (otherlv_18= 'RefersTo PrivateData' ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_20_0= 'All' ) ) ) )? (otherlv_21= 'RefersTo Service' ( ( (lv_refService_22_0= ruleRefService ) )* | ( (lv_refSAll_23_0= 'All' ) ) ) )? (otherlv_24= 'RefersTo Enforcement' ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) )* | ( (lv_refEAll_26_0= 'All' ) ) ) )? otherlv_27= 'Modality' ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) ) otherlv_29= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1869:3: otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Disclosure' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo Recipient' ( ( (lv_refRecipient_10_0= ruleRefRecipient ) )* | ( (lv_refRAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_17_0= 'All' ) ) ) )? (otherlv_18= 'RefersTo PrivateData' ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_20_0= 'All' ) ) ) )? (otherlv_21= 'RefersTo Service' ( ( (lv_refService_22_0= ruleRefService ) )* | ( (lv_refSAll_23_0= 'All' ) ) ) )? (otherlv_24= 'RefersTo Enforcement' ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) )* | ( (lv_refEAll_26_0= 'All' ) ) ) )? otherlv_27= 'Modality' ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) ) otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleDisclosure3857); 

                	newLeafNode(otherlv_0, grammarAccess.getDisclosureAccess().getDisclosureKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1873:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1874:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1874:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1875:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisclosure3874); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDisclosure3891); 

                	newLeafNode(otherlv_2, grammarAccess.getDisclosureAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3903); 

                	newLeafNode(otherlv_3, grammarAccess.getDisclosureAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1899:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1900:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1900:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1901:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure3920); 

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

            otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleDisclosure3937); 

                	newLeafNode(otherlv_5, grammarAccess.getDisclosureAccess().getConditionKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1921:1: ( (lv_condition_6_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1922:1: (lv_condition_6_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1922:1: (lv_condition_6_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1923:3: lv_condition_6_0= RULE_STRING
            {
            lv_condition_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure3954); 

            			newLeafNode(lv_condition_6_0, grammarAccess.getDisclosureAccess().getConditionSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDisclosureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"condition",
                    		lv_condition_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1939:2: (otherlv_7= 'PartOf Disclosure' ( (otherlv_8= RULE_ID ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==73) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1939:4: otherlv_7= 'PartOf Disclosure' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,73,FOLLOW_73_in_ruleDisclosure3972); 

                        	newLeafNode(otherlv_7, grammarAccess.getDisclosureAccess().getPartOfDisclosureKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1943:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1944:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1944:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1945:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisclosure3992); 

                    		newLeafNode(otherlv_8, grammarAccess.getDisclosureAccess().getPartDisclosureDisclosureCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1956:4: (otherlv_9= 'RefersTo Recipient' ( ( (lv_refRecipient_10_0= ruleRefRecipient ) )* | ( (lv_refRAll_11_0= 'All' ) ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==74) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1956:6: otherlv_9= 'RefersTo Recipient' ( ( (lv_refRecipient_10_0= ruleRefRecipient ) )* | ( (lv_refRAll_11_0= 'All' ) ) )
                    {
                    otherlv_9=(Token)match(input,74,FOLLOW_74_in_ruleDisclosure4007); 

                        	newLeafNode(otherlv_9, grammarAccess.getDisclosureAccess().getRefersToRecipientKeyword_8_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1960:1: ( ( (lv_refRecipient_10_0= ruleRefRecipient ) )* | ( (lv_refRAll_11_0= 'All' ) ) )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID||LA42_0==46||(LA42_0>=66 && LA42_0<=68)||(LA42_0>=75 && LA42_0<=76)) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==47) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1960:2: ( (lv_refRecipient_10_0= ruleRefRecipient ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1960:2: ( (lv_refRecipient_10_0= ruleRefRecipient ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==RULE_ID) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1961:1: (lv_refRecipient_10_0= ruleRefRecipient )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1961:1: (lv_refRecipient_10_0= ruleRefRecipient )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1962:3: lv_refRecipient_10_0= ruleRefRecipient
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefRecipientRefRecipientParserRuleCall_8_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefRecipient_in_ruleDisclosure4029);
                            	    lv_refRecipient_10_0=ruleRefRecipient();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refRecipient",
                            	            		lv_refRecipient_10_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1979:6: ( (lv_refRAll_11_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1979:6: ( (lv_refRAll_11_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1980:1: (lv_refRAll_11_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1980:1: (lv_refRAll_11_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1981:3: lv_refRAll_11_0= 'All'
                            {
                            lv_refRAll_11_0=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure4054); 

                                    newLeafNode(lv_refRAll_11_0, grammarAccess.getDisclosureAccess().getRefRAllAllKeyword_8_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDisclosureRule());
                            	        }
                                   		setWithLastConsumed(current, "refRAll", lv_refRAll_11_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1994:5: (otherlv_12= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_14_0= 'All' ) ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==75) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1994:7: otherlv_12= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_14_0= 'All' ) ) )
                    {
                    otherlv_12=(Token)match(input,75,FOLLOW_75_in_ruleDisclosure4083); 

                        	newLeafNode(otherlv_12, grammarAccess.getDisclosureAccess().getRefersToRecipientSourceKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1998:1: ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) )* | ( (lv_refRSAll_14_0= 'All' ) ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_ID||LA45_0==46||(LA45_0>=66 && LA45_0<=68)||LA45_0==76) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==47) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1998:2: ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1998:2: ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==RULE_ID) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1999:1: (lv_refRecipientSource_13_0= ruleRefRecipientSource )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1999:1: (lv_refRecipientSource_13_0= ruleRefRecipientSource )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2000:3: lv_refRecipientSource_13_0= ruleRefRecipientSource
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefRecipientSourceRefRecipientSourceParserRuleCall_9_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefRecipientSource_in_ruleDisclosure4105);
                            	    lv_refRecipientSource_13_0=ruleRefRecipientSource();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refRecipientSource",
                            	            		lv_refRecipientSource_13_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2017:6: ( (lv_refRSAll_14_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2017:6: ( (lv_refRSAll_14_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2018:1: (lv_refRSAll_14_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2018:1: (lv_refRSAll_14_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2019:3: lv_refRSAll_14_0= 'All'
                            {
                            lv_refRSAll_14_0=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure4130); 

                                    newLeafNode(lv_refRSAll_14_0, grammarAccess.getDisclosureAccess().getRefRSAllAllKeyword_9_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDisclosureRule());
                            	        }
                                   		setWithLastConsumed(current, "refRSAll", lv_refRSAll_14_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2032:5: (otherlv_15= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_17_0= 'All' ) ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==76) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2032:7: otherlv_15= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_17_0= 'All' ) ) )
                    {
                    otherlv_15=(Token)match(input,76,FOLLOW_76_in_ruleDisclosure4159); 

                        	newLeafNode(otherlv_15, grammarAccess.getDisclosureAccess().getRefersToRecipientTargetKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2036:1: ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) )* | ( (lv_refRTAll_17_0= 'All' ) ) )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_ID||LA48_0==46||(LA48_0>=66 && LA48_0<=68)) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==47) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2036:2: ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2036:2: ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==RULE_ID) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2037:1: (lv_refRecipientTarget_16_0= ruleRefRecipientTarget )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2037:1: (lv_refRecipientTarget_16_0= ruleRefRecipientTarget )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2038:3: lv_refRecipientTarget_16_0= ruleRefRecipientTarget
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefRecipientTargetRefRecipientTargetParserRuleCall_10_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefRecipientTarget_in_ruleDisclosure4181);
                            	    lv_refRecipientTarget_16_0=ruleRefRecipientTarget();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refRecipientTarget",
                            	            		lv_refRecipientTarget_16_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2055:6: ( (lv_refRTAll_17_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2055:6: ( (lv_refRTAll_17_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2056:1: (lv_refRTAll_17_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2056:1: (lv_refRTAll_17_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2057:3: lv_refRTAll_17_0= 'All'
                            {
                            lv_refRTAll_17_0=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure4206); 

                                    newLeafNode(lv_refRTAll_17_0, grammarAccess.getDisclosureAccess().getRefRTAllAllKeyword_10_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDisclosureRule());
                            	        }
                                   		setWithLastConsumed(current, "refRTAll", lv_refRTAll_17_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2070:5: (otherlv_18= 'RefersTo PrivateData' ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_20_0= 'All' ) ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==46) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2070:7: otherlv_18= 'RefersTo PrivateData' ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_20_0= 'All' ) ) )
                    {
                    otherlv_18=(Token)match(input,46,FOLLOW_46_in_ruleDisclosure4235); 

                        	newLeafNode(otherlv_18, grammarAccess.getDisclosureAccess().getRefersToPrivateDataKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2074:1: ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_20_0= 'All' ) ) )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==RULE_ID||(LA51_0>=66 && LA51_0<=68)) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==47) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2074:2: ( (lv_refPrivateData_19_0= ruleRefPrivateData ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2074:2: ( (lv_refPrivateData_19_0= ruleRefPrivateData ) )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==RULE_ID) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2075:1: (lv_refPrivateData_19_0= ruleRefPrivateData )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2075:1: (lv_refPrivateData_19_0= ruleRefPrivateData )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2076:3: lv_refPrivateData_19_0= ruleRefPrivateData
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefPrivateDataRefPrivateDataParserRuleCall_11_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleDisclosure4257);
                            	    lv_refPrivateData_19_0=ruleRefPrivateData();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refPrivateData",
                            	            		lv_refPrivateData_19_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2093:6: ( (lv_refPDAll_20_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2093:6: ( (lv_refPDAll_20_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2094:1: (lv_refPDAll_20_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2094:1: (lv_refPDAll_20_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2095:3: lv_refPDAll_20_0= 'All'
                            {
                            lv_refPDAll_20_0=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure4282); 

                                    newLeafNode(lv_refPDAll_20_0, grammarAccess.getDisclosureAccess().getRefPDAllAllKeyword_11_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDisclosureRule());
                            	        }
                                   		setWithLastConsumed(current, "refPDAll", lv_refPDAll_20_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2108:5: (otherlv_21= 'RefersTo Service' ( ( (lv_refService_22_0= ruleRefService ) )* | ( (lv_refSAll_23_0= 'All' ) ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==66) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2108:7: otherlv_21= 'RefersTo Service' ( ( (lv_refService_22_0= ruleRefService ) )* | ( (lv_refSAll_23_0= 'All' ) ) )
                    {
                    otherlv_21=(Token)match(input,66,FOLLOW_66_in_ruleDisclosure4311); 

                        	newLeafNode(otherlv_21, grammarAccess.getDisclosureAccess().getRefersToServiceKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2112:1: ( ( (lv_refService_22_0= ruleRefService ) )* | ( (lv_refSAll_23_0= 'All' ) ) )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_ID||(LA54_0>=67 && LA54_0<=68)) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==47) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2112:2: ( (lv_refService_22_0= ruleRefService ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2112:2: ( (lv_refService_22_0= ruleRefService ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==RULE_ID) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2113:1: (lv_refService_22_0= ruleRefService )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2113:1: (lv_refService_22_0= ruleRefService )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2114:3: lv_refService_22_0= ruleRefService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefServiceRefServiceParserRuleCall_12_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefService_in_ruleDisclosure4333);
                            	    lv_refService_22_0=ruleRefService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refService",
                            	            		lv_refService_22_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2131:6: ( (lv_refSAll_23_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2131:6: ( (lv_refSAll_23_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2132:1: (lv_refSAll_23_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2132:1: (lv_refSAll_23_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2133:3: lv_refSAll_23_0= 'All'
                            {
                            lv_refSAll_23_0=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure4358); 

                                    newLeafNode(lv_refSAll_23_0, grammarAccess.getDisclosureAccess().getRefSAllAllKeyword_12_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDisclosureRule());
                            	        }
                                   		setWithLastConsumed(current, "refSAll", lv_refSAll_23_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2146:5: (otherlv_24= 'RefersTo Enforcement' ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) )* | ( (lv_refEAll_26_0= 'All' ) ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==67) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2146:7: otherlv_24= 'RefersTo Enforcement' ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) )* | ( (lv_refEAll_26_0= 'All' ) ) )
                    {
                    otherlv_24=(Token)match(input,67,FOLLOW_67_in_ruleDisclosure4387); 

                        	newLeafNode(otherlv_24, grammarAccess.getDisclosureAccess().getRefersToEnforcementKeyword_13_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2150:1: ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) )* | ( (lv_refEAll_26_0= 'All' ) ) )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_ID||LA57_0==68) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==47) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2150:2: ( (lv_refEnforcement_25_0= ruleRefEnforcement ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2150:2: ( (lv_refEnforcement_25_0= ruleRefEnforcement ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==RULE_ID) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2151:1: (lv_refEnforcement_25_0= ruleRefEnforcement )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2151:1: (lv_refEnforcement_25_0= ruleRefEnforcement )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2152:3: lv_refEnforcement_25_0= ruleRefEnforcement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefEnforcementRefEnforcementParserRuleCall_13_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleDisclosure4409);
                            	    lv_refEnforcement_25_0=ruleRefEnforcement();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refEnforcement",
                            	            		lv_refEnforcement_25_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2169:6: ( (lv_refEAll_26_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2169:6: ( (lv_refEAll_26_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2170:1: (lv_refEAll_26_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2170:1: (lv_refEAll_26_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2171:3: lv_refEAll_26_0= 'All'
                            {
                            lv_refEAll_26_0=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure4434); 

                                    newLeafNode(lv_refEAll_26_0, grammarAccess.getDisclosureAccess().getRefEAllAllKeyword_13_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDisclosureRule());
                            	        }
                                   		setWithLastConsumed(current, "refEAll", lv_refEAll_26_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_27=(Token)match(input,68,FOLLOW_68_in_ruleDisclosure4462); 

                	newLeafNode(otherlv_27, grammarAccess.getDisclosureAccess().getModalityKeyword_14());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2188:1: ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2189:1: ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2189:1: ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2190:1: (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2190:1: (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt59=1;
                }
                break;
            case 70:
                {
                alt59=2;
                }
                break;
            case 71:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2191:3: lv_modality_28_1= 'Permitted'
                    {
                    lv_modality_28_1=(Token)match(input,69,FOLLOW_69_in_ruleDisclosure4482); 

                            newLeafNode(lv_modality_28_1, grammarAccess.getDisclosureAccess().getModalityPermittedKeyword_15_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_28_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2203:8: lv_modality_28_2= 'Obligation'
                    {
                    lv_modality_28_2=(Token)match(input,70,FOLLOW_70_in_ruleDisclosure4511); 

                            newLeafNode(lv_modality_28_2, grammarAccess.getDisclosureAccess().getModalityObligationKeyword_15_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_28_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2215:8: lv_modality_28_3= 'Forbidden'
                    {
                    lv_modality_28_3=(Token)match(input,71,FOLLOW_71_in_ruleDisclosure4540); 

                            newLeafNode(lv_modality_28_3, grammarAccess.getDisclosureAccess().getModalityForbiddenKeyword_15_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_28_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_29=(Token)match(input,13,FOLLOW_13_in_ruleDisclosure4568); 

                	newLeafNode(otherlv_29, grammarAccess.getDisclosureAccess().getRightCurlyBracketKeyword_16());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2242:1: entryRuleRetention returns [EObject current=null] : iv_ruleRetention= ruleRetention EOF ;
    public final EObject entryRuleRetention() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetention = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2243:2: (iv_ruleRetention= ruleRetention EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2244:2: iv_ruleRetention= ruleRetention EOF
            {
             newCompositeNode(grammarAccess.getRetentionRule()); 
            pushFollow(FOLLOW_ruleRetention_in_entryRuleRetention4604);
            iv_ruleRetention=ruleRetention();

            state._fsp--;

             current =iv_ruleRetention; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRetention4614); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2251:1: ruleRetention returns [EObject current=null] : (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Retention' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Period' ( (lv_period_10_0= RULE_STRING ) ) (otherlv_11= 'RefersTo PrivateData' ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_13_0= 'All' ) ) ) )? (otherlv_14= 'RefersTo Service' ( ( (lv_refService_15_0= ruleRefService ) )* | ( (lv_refSAll_16_0= 'All' ) ) ) )? (otherlv_17= 'RefersTo Enforcement' ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) )* | ( (lv_refEAll_19_0= 'All' ) ) ) )? otherlv_20= 'Modality' ( ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) ) ) otherlv_22= '}' ) ;
    public final EObject ruleRetention() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_condition_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_period_10_0=null;
        Token otherlv_11=null;
        Token lv_refPDAll_13_0=null;
        Token otherlv_14=null;
        Token lv_refSAll_16_0=null;
        Token otherlv_17=null;
        Token lv_refEAll_19_0=null;
        Token otherlv_20=null;
        Token lv_modality_21_1=null;
        Token lv_modality_21_2=null;
        Token lv_modality_21_3=null;
        Token otherlv_22=null;
        EObject lv_refPrivateData_12_0 = null;

        EObject lv_refService_15_0 = null;

        EObject lv_refEnforcement_18_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2254:28: ( (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Retention' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Period' ( (lv_period_10_0= RULE_STRING ) ) (otherlv_11= 'RefersTo PrivateData' ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_13_0= 'All' ) ) ) )? (otherlv_14= 'RefersTo Service' ( ( (lv_refService_15_0= ruleRefService ) )* | ( (lv_refSAll_16_0= 'All' ) ) ) )? (otherlv_17= 'RefersTo Enforcement' ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) )* | ( (lv_refEAll_19_0= 'All' ) ) ) )? otherlv_20= 'Modality' ( ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) ) ) otherlv_22= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2255:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Retention' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Period' ( (lv_period_10_0= RULE_STRING ) ) (otherlv_11= 'RefersTo PrivateData' ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_13_0= 'All' ) ) ) )? (otherlv_14= 'RefersTo Service' ( ( (lv_refService_15_0= ruleRefService ) )* | ( (lv_refSAll_16_0= 'All' ) ) ) )? (otherlv_17= 'RefersTo Enforcement' ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) )* | ( (lv_refEAll_19_0= 'All' ) ) ) )? otherlv_20= 'Modality' ( ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) ) ) otherlv_22= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2255:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Retention' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Period' ( (lv_period_10_0= RULE_STRING ) ) (otherlv_11= 'RefersTo PrivateData' ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_13_0= 'All' ) ) ) )? (otherlv_14= 'RefersTo Service' ( ( (lv_refService_15_0= ruleRefService ) )* | ( (lv_refSAll_16_0= 'All' ) ) ) )? (otherlv_17= 'RefersTo Enforcement' ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) )* | ( (lv_refEAll_19_0= 'All' ) ) ) )? otherlv_20= 'Modality' ( ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) ) ) otherlv_22= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2255:3: otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Retention' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Period' ( (lv_period_10_0= RULE_STRING ) ) (otherlv_11= 'RefersTo PrivateData' ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_13_0= 'All' ) ) ) )? (otherlv_14= 'RefersTo Service' ( ( (lv_refService_15_0= ruleRefService ) )* | ( (lv_refSAll_16_0= 'All' ) ) ) )? (otherlv_17= 'RefersTo Enforcement' ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) )* | ( (lv_refEAll_19_0= 'All' ) ) ) )? otherlv_20= 'Modality' ( ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) ) ) otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleRetention4651); 

                	newLeafNode(otherlv_0, grammarAccess.getRetentionAccess().getRetentionKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2259:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2260:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2260:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2261:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRetention4668); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRetention4685); 

                	newLeafNode(otherlv_2, grammarAccess.getRetentionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleRetention4697); 

                	newLeafNode(otherlv_3, grammarAccess.getRetentionAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2285:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2286:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2286:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2287:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention4714); 

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

            otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleRetention4731); 

                	newLeafNode(otherlv_5, grammarAccess.getRetentionAccess().getConditionKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2307:1: ( (lv_condition_6_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2308:1: (lv_condition_6_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2308:1: (lv_condition_6_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2309:3: lv_condition_6_0= RULE_STRING
            {
            lv_condition_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention4748); 

            			newLeafNode(lv_condition_6_0, grammarAccess.getRetentionAccess().getConditionSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRetentionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"condition",
                    		lv_condition_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2325:2: (otherlv_7= 'PartOf Retention' ( (otherlv_8= RULE_ID ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==78) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2325:4: otherlv_7= 'PartOf Retention' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,78,FOLLOW_78_in_ruleRetention4766); 

                        	newLeafNode(otherlv_7, grammarAccess.getRetentionAccess().getPartOfRetentionKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2329:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2330:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2330:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2331:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRetention4786); 

                    		newLeafNode(otherlv_8, grammarAccess.getRetentionAccess().getPartRetentionRetentionCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,79,FOLLOW_79_in_ruleRetention4800); 

                	newLeafNode(otherlv_9, grammarAccess.getRetentionAccess().getPeriodKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2346:1: ( (lv_period_10_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2347:1: (lv_period_10_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2347:1: (lv_period_10_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2348:3: lv_period_10_0= RULE_STRING
            {
            lv_period_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention4817); 

            			newLeafNode(lv_period_10_0, grammarAccess.getRetentionAccess().getPeriodSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRetentionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"period",
                    		lv_period_10_0, 
                    		"STRING");
            	    

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2364:2: (otherlv_11= 'RefersTo PrivateData' ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_13_0= 'All' ) ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==46) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2364:4: otherlv_11= 'RefersTo PrivateData' ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_13_0= 'All' ) ) )
                    {
                    otherlv_11=(Token)match(input,46,FOLLOW_46_in_ruleRetention4835); 

                        	newLeafNode(otherlv_11, grammarAccess.getRetentionAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2368:1: ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_13_0= 'All' ) ) )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_ID||(LA62_0>=66 && LA62_0<=68)) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==47) ) {
                        alt62=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2368:2: ( (lv_refPrivateData_12_0= ruleRefPrivateData ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2368:2: ( (lv_refPrivateData_12_0= ruleRefPrivateData ) )*
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==RULE_ID) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2369:1: (lv_refPrivateData_12_0= ruleRefPrivateData )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2369:1: (lv_refPrivateData_12_0= ruleRefPrivateData )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2370:3: lv_refPrivateData_12_0= ruleRefPrivateData
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefPrivateDataRefPrivateDataParserRuleCall_10_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleRetention4857);
                            	    lv_refPrivateData_12_0=ruleRefPrivateData();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refPrivateData",
                            	            		lv_refPrivateData_12_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2387:6: ( (lv_refPDAll_13_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2387:6: ( (lv_refPDAll_13_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2388:1: (lv_refPDAll_13_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2388:1: (lv_refPDAll_13_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2389:3: lv_refPDAll_13_0= 'All'
                            {
                            lv_refPDAll_13_0=(Token)match(input,47,FOLLOW_47_in_ruleRetention4882); 

                                    newLeafNode(lv_refPDAll_13_0, grammarAccess.getRetentionAccess().getRefPDAllAllKeyword_10_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRetentionRule());
                            	        }
                                   		setWithLastConsumed(current, "refPDAll", lv_refPDAll_13_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2402:5: (otherlv_14= 'RefersTo Service' ( ( (lv_refService_15_0= ruleRefService ) )* | ( (lv_refSAll_16_0= 'All' ) ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==66) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2402:7: otherlv_14= 'RefersTo Service' ( ( (lv_refService_15_0= ruleRefService ) )* | ( (lv_refSAll_16_0= 'All' ) ) )
                    {
                    otherlv_14=(Token)match(input,66,FOLLOW_66_in_ruleRetention4911); 

                        	newLeafNode(otherlv_14, grammarAccess.getRetentionAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2406:1: ( ( (lv_refService_15_0= ruleRefService ) )* | ( (lv_refSAll_16_0= 'All' ) ) )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_ID||(LA65_0>=67 && LA65_0<=68)) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==47) ) {
                        alt65=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2406:2: ( (lv_refService_15_0= ruleRefService ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2406:2: ( (lv_refService_15_0= ruleRefService ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==RULE_ID) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2407:1: (lv_refService_15_0= ruleRefService )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2407:1: (lv_refService_15_0= ruleRefService )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2408:3: lv_refService_15_0= ruleRefService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefServiceRefServiceParserRuleCall_11_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefService_in_ruleRetention4933);
                            	    lv_refService_15_0=ruleRefService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refService",
                            	            		lv_refService_15_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2425:6: ( (lv_refSAll_16_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2425:6: ( (lv_refSAll_16_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2426:1: (lv_refSAll_16_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2426:1: (lv_refSAll_16_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2427:3: lv_refSAll_16_0= 'All'
                            {
                            lv_refSAll_16_0=(Token)match(input,47,FOLLOW_47_in_ruleRetention4958); 

                                    newLeafNode(lv_refSAll_16_0, grammarAccess.getRetentionAccess().getRefSAllAllKeyword_11_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRetentionRule());
                            	        }
                                   		setWithLastConsumed(current, "refSAll", lv_refSAll_16_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2440:5: (otherlv_17= 'RefersTo Enforcement' ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) )* | ( (lv_refEAll_19_0= 'All' ) ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==67) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2440:7: otherlv_17= 'RefersTo Enforcement' ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) )* | ( (lv_refEAll_19_0= 'All' ) ) )
                    {
                    otherlv_17=(Token)match(input,67,FOLLOW_67_in_ruleRetention4987); 

                        	newLeafNode(otherlv_17, grammarAccess.getRetentionAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2444:1: ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) )* | ( (lv_refEAll_19_0= 'All' ) ) )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_ID||LA68_0==68) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==47) ) {
                        alt68=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2444:2: ( (lv_refEnforcement_18_0= ruleRefEnforcement ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2444:2: ( (lv_refEnforcement_18_0= ruleRefEnforcement ) )*
                            loop67:
                            do {
                                int alt67=2;
                                int LA67_0 = input.LA(1);

                                if ( (LA67_0==RULE_ID) ) {
                                    alt67=1;
                                }


                                switch (alt67) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2445:1: (lv_refEnforcement_18_0= ruleRefEnforcement )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2445:1: (lv_refEnforcement_18_0= ruleRefEnforcement )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2446:3: lv_refEnforcement_18_0= ruleRefEnforcement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefEnforcementRefEnforcementParserRuleCall_12_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleRetention5009);
                            	    lv_refEnforcement_18_0=ruleRefEnforcement();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refEnforcement",
                            	            		lv_refEnforcement_18_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2463:6: ( (lv_refEAll_19_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2463:6: ( (lv_refEAll_19_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2464:1: (lv_refEAll_19_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2464:1: (lv_refEAll_19_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2465:3: lv_refEAll_19_0= 'All'
                            {
                            lv_refEAll_19_0=(Token)match(input,47,FOLLOW_47_in_ruleRetention5034); 

                                    newLeafNode(lv_refEAll_19_0, grammarAccess.getRetentionAccess().getRefEAllAllKeyword_12_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRetentionRule());
                            	        }
                                   		setWithLastConsumed(current, "refEAll", lv_refEAll_19_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,68,FOLLOW_68_in_ruleRetention5062); 

                	newLeafNode(otherlv_20, grammarAccess.getRetentionAccess().getModalityKeyword_13());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2482:1: ( ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2483:1: ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2483:1: ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2484:1: (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2484:1: (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' )
            int alt70=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt70=1;
                }
                break;
            case 70:
                {
                alt70=2;
                }
                break;
            case 71:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2485:3: lv_modality_21_1= 'Permitted'
                    {
                    lv_modality_21_1=(Token)match(input,69,FOLLOW_69_in_ruleRetention5082); 

                            newLeafNode(lv_modality_21_1, grammarAccess.getRetentionAccess().getModalityPermittedKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_21_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2497:8: lv_modality_21_2= 'Obligation'
                    {
                    lv_modality_21_2=(Token)match(input,70,FOLLOW_70_in_ruleRetention5111); 

                            newLeafNode(lv_modality_21_2, grammarAccess.getRetentionAccess().getModalityObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_21_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2509:8: lv_modality_21_3= 'Forbidden'
                    {
                    lv_modality_21_3=(Token)match(input,71,FOLLOW_71_in_ruleRetention5140); 

                            newLeafNode(lv_modality_21_3, grammarAccess.getRetentionAccess().getModalityForbiddenKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_21_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_22=(Token)match(input,13,FOLLOW_13_in_ruleRetention5168); 

                	newLeafNode(otherlv_22, grammarAccess.getRetentionAccess().getRightCurlyBracketKeyword_15());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2536:1: entryRuleUsage returns [EObject current=null] : iv_ruleUsage= ruleUsage EOF ;
    public final EObject entryRuleUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsage = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2537:2: (iv_ruleUsage= ruleUsage EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2538:2: iv_ruleUsage= ruleUsage EOF
            {
             newCompositeNode(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage5204);
            iv_ruleUsage=ruleUsage();

            state._fsp--;

             current =iv_ruleUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage5214); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2545:1: ruleUsage returns [EObject current=null] : (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Usage' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' ) ;
    public final EObject ruleUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_condition_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_refPDAll_11_0=null;
        Token otherlv_12=null;
        Token lv_refSAll_14_0=null;
        Token otherlv_15=null;
        Token lv_refEAll_17_0=null;
        Token otherlv_18=null;
        Token lv_modality_19_1=null;
        Token lv_modality_19_2=null;
        Token lv_modality_19_3=null;
        Token otherlv_20=null;
        EObject lv_refPrivateData_10_0 = null;

        EObject lv_refService_13_0 = null;

        EObject lv_refEnforcement_16_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2548:28: ( (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Usage' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2549:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Usage' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2549:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Usage' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2549:3: otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Usage' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleUsage5251); 

                	newLeafNode(otherlv_0, grammarAccess.getUsageAccess().getUsageKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2553:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2554:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2554:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2555:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage5268); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUsage5285); 

                	newLeafNode(otherlv_2, grammarAccess.getUsageAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleUsage5297); 

                	newLeafNode(otherlv_3, grammarAccess.getUsageAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2579:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2580:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2580:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2581:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage5314); 

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

            otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleUsage5331); 

                	newLeafNode(otherlv_5, grammarAccess.getUsageAccess().getConditionKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2601:1: ( (lv_condition_6_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2602:1: (lv_condition_6_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2602:1: (lv_condition_6_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2603:3: lv_condition_6_0= RULE_STRING
            {
            lv_condition_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage5348); 

            			newLeafNode(lv_condition_6_0, grammarAccess.getUsageAccess().getConditionSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUsageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"condition",
                    		lv_condition_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2619:2: (otherlv_7= 'PartOf Usage' ( (otherlv_8= RULE_ID ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==81) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2619:4: otherlv_7= 'PartOf Usage' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,81,FOLLOW_81_in_ruleUsage5366); 

                        	newLeafNode(otherlv_7, grammarAccess.getUsageAccess().getPartOfUsageKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2623:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2624:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2624:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2625:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage5386); 

                    		newLeafNode(otherlv_8, grammarAccess.getUsageAccess().getPartUsageUsageCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2636:4: (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==46) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2636:6: otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) )
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleUsage5401); 

                        	newLeafNode(otherlv_9, grammarAccess.getUsageAccess().getRefersToPrivateDataKeyword_8_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2640:1: ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==RULE_ID||(LA73_0>=66 && LA73_0<=68)) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==47) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2640:2: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2640:2: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )*
                            loop72:
                            do {
                                int alt72=2;
                                int LA72_0 = input.LA(1);

                                if ( (LA72_0==RULE_ID) ) {
                                    alt72=1;
                                }


                                switch (alt72) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2641:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2641:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2642:3: lv_refPrivateData_10_0= ruleRefPrivateData
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefPrivateDataRefPrivateDataParserRuleCall_8_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleUsage5423);
                            	    lv_refPrivateData_10_0=ruleRefPrivateData();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getUsageRule());
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
                            	    break loop72;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2659:6: ( (lv_refPDAll_11_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2659:6: ( (lv_refPDAll_11_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2660:1: (lv_refPDAll_11_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2660:1: (lv_refPDAll_11_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2661:3: lv_refPDAll_11_0= 'All'
                            {
                            lv_refPDAll_11_0=(Token)match(input,47,FOLLOW_47_in_ruleUsage5448); 

                                    newLeafNode(lv_refPDAll_11_0, grammarAccess.getUsageAccess().getRefPDAllAllKeyword_8_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUsageRule());
                            	        }
                                   		setWithLastConsumed(current, "refPDAll", lv_refPDAll_11_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2674:5: (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==66) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2674:7: otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) )
                    {
                    otherlv_12=(Token)match(input,66,FOLLOW_66_in_ruleUsage5477); 

                        	newLeafNode(otherlv_12, grammarAccess.getUsageAccess().getRefersToServiceKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2678:1: ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==RULE_ID||(LA76_0>=67 && LA76_0<=68)) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==47) ) {
                        alt76=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2678:2: ( (lv_refService_13_0= ruleRefService ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2678:2: ( (lv_refService_13_0= ruleRefService ) )*
                            loop75:
                            do {
                                int alt75=2;
                                int LA75_0 = input.LA(1);

                                if ( (LA75_0==RULE_ID) ) {
                                    alt75=1;
                                }


                                switch (alt75) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2679:1: (lv_refService_13_0= ruleRefService )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2679:1: (lv_refService_13_0= ruleRefService )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2680:3: lv_refService_13_0= ruleRefService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefServiceRefServiceParserRuleCall_9_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefService_in_ruleUsage5499);
                            	    lv_refService_13_0=ruleRefService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getUsageRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refService",
                            	            		lv_refService_13_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2697:6: ( (lv_refSAll_14_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2697:6: ( (lv_refSAll_14_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2698:1: (lv_refSAll_14_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2698:1: (lv_refSAll_14_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2699:3: lv_refSAll_14_0= 'All'
                            {
                            lv_refSAll_14_0=(Token)match(input,47,FOLLOW_47_in_ruleUsage5524); 

                                    newLeafNode(lv_refSAll_14_0, grammarAccess.getUsageAccess().getRefSAllAllKeyword_9_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUsageRule());
                            	        }
                                   		setWithLastConsumed(current, "refSAll", lv_refSAll_14_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2712:5: (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==67) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2712:7: otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) )
                    {
                    otherlv_15=(Token)match(input,67,FOLLOW_67_in_ruleUsage5553); 

                        	newLeafNode(otherlv_15, grammarAccess.getUsageAccess().getRefersToEnforcementKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2716:1: ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==RULE_ID||LA79_0==68) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==47) ) {
                        alt79=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2716:2: ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2716:2: ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )*
                            loop78:
                            do {
                                int alt78=2;
                                int LA78_0 = input.LA(1);

                                if ( (LA78_0==RULE_ID) ) {
                                    alt78=1;
                                }


                                switch (alt78) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2717:1: (lv_refEnforcement_16_0= ruleRefEnforcement )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2717:1: (lv_refEnforcement_16_0= ruleRefEnforcement )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2718:3: lv_refEnforcement_16_0= ruleRefEnforcement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefEnforcementRefEnforcementParserRuleCall_10_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleUsage5575);
                            	    lv_refEnforcement_16_0=ruleRefEnforcement();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getUsageRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refEnforcement",
                            	            		lv_refEnforcement_16_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2735:6: ( (lv_refEAll_17_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2735:6: ( (lv_refEAll_17_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2736:1: (lv_refEAll_17_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2736:1: (lv_refEAll_17_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2737:3: lv_refEAll_17_0= 'All'
                            {
                            lv_refEAll_17_0=(Token)match(input,47,FOLLOW_47_in_ruleUsage5600); 

                                    newLeafNode(lv_refEAll_17_0, grammarAccess.getUsageAccess().getRefEAllAllKeyword_10_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUsageRule());
                            	        }
                                   		setWithLastConsumed(current, "refEAll", lv_refEAll_17_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,68,FOLLOW_68_in_ruleUsage5628); 

                	newLeafNode(otherlv_18, grammarAccess.getUsageAccess().getModalityKeyword_11());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2754:1: ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2755:1: ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2755:1: ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2756:1: (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2756:1: (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' )
            int alt81=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt81=1;
                }
                break;
            case 70:
                {
                alt81=2;
                }
                break;
            case 71:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2757:3: lv_modality_19_1= 'Permitted'
                    {
                    lv_modality_19_1=(Token)match(input,69,FOLLOW_69_in_ruleUsage5648); 

                            newLeafNode(lv_modality_19_1, grammarAccess.getUsageAccess().getModalityPermittedKeyword_12_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_19_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2769:8: lv_modality_19_2= 'Obligation'
                    {
                    lv_modality_19_2=(Token)match(input,70,FOLLOW_70_in_ruleUsage5677); 

                            newLeafNode(lv_modality_19_2, grammarAccess.getUsageAccess().getModalityObligationKeyword_12_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_19_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2781:8: lv_modality_19_3= 'Forbidden'
                    {
                    lv_modality_19_3=(Token)match(input,71,FOLLOW_71_in_ruleUsage5706); 

                            newLeafNode(lv_modality_19_3, grammarAccess.getUsageAccess().getModalityForbiddenKeyword_12_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_19_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_20=(Token)match(input,13,FOLLOW_13_in_ruleUsage5734); 

                	newLeafNode(otherlv_20, grammarAccess.getUsageAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2808:1: entryRuleInformative returns [EObject current=null] : iv_ruleInformative= ruleInformative EOF ;
    public final EObject entryRuleInformative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformative = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2809:2: (iv_ruleInformative= ruleInformative EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2810:2: iv_ruleInformative= ruleInformative EOF
            {
             newCompositeNode(grammarAccess.getInformativeRule()); 
            pushFollow(FOLLOW_ruleInformative_in_entryRuleInformative5770);
            iv_ruleInformative=ruleInformative();

            state._fsp--;

             current =iv_ruleInformative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInformative5780); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2817:1: ruleInformative returns [EObject current=null] : (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Informative' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' ) ;
    public final EObject ruleInformative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_condition_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_refPDAll_11_0=null;
        Token otherlv_12=null;
        Token lv_refSAll_14_0=null;
        Token otherlv_15=null;
        Token lv_refEAll_17_0=null;
        Token otherlv_18=null;
        Token lv_modality_19_1=null;
        Token lv_modality_19_2=null;
        Token lv_modality_19_3=null;
        Token otherlv_20=null;
        EObject lv_refPrivateData_10_0 = null;

        EObject lv_refService_13_0 = null;

        EObject lv_refEnforcement_16_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2820:28: ( (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Informative' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2821:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Informative' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2821:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Informative' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2821:3: otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Informative' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleInformative5817); 

                	newLeafNode(otherlv_0, grammarAccess.getInformativeAccess().getInformativeKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2825:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2826:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2826:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2827:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformative5834); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInformative5851); 

                	newLeafNode(otherlv_2, grammarAccess.getInformativeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleInformative5863); 

                	newLeafNode(otherlv_3, grammarAccess.getInformativeAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2851:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2852:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2852:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2853:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative5880); 

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

            otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleInformative5897); 

                	newLeafNode(otherlv_5, grammarAccess.getInformativeAccess().getConditionKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2873:1: ( (lv_condition_6_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2874:1: (lv_condition_6_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2874:1: (lv_condition_6_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2875:3: lv_condition_6_0= RULE_STRING
            {
            lv_condition_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative5914); 

            			newLeafNode(lv_condition_6_0, grammarAccess.getInformativeAccess().getConditionSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInformativeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"condition",
                    		lv_condition_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2891:2: (otherlv_7= 'PartOf Informative' ( (otherlv_8= RULE_ID ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==83) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2891:4: otherlv_7= 'PartOf Informative' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,83,FOLLOW_83_in_ruleInformative5932); 

                        	newLeafNode(otherlv_7, grammarAccess.getInformativeAccess().getPartOfInformativeKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2895:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2896:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2896:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2897:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformative5952); 

                    		newLeafNode(otherlv_8, grammarAccess.getInformativeAccess().getPartInformativeInformativeCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2908:4: (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==46) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2908:6: otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) )
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleInformative5967); 

                        	newLeafNode(otherlv_9, grammarAccess.getInformativeAccess().getRefersToPrivateDataKeyword_8_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2912:1: ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )* | ( (lv_refPDAll_11_0= 'All' ) ) )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==RULE_ID||(LA84_0>=66 && LA84_0<=68)) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==47) ) {
                        alt84=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2912:2: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2912:2: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )*
                            loop83:
                            do {
                                int alt83=2;
                                int LA83_0 = input.LA(1);

                                if ( (LA83_0==RULE_ID) ) {
                                    alt83=1;
                                }


                                switch (alt83) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2913:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2913:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2914:3: lv_refPrivateData_10_0= ruleRefPrivateData
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefPrivateDataRefPrivateDataParserRuleCall_8_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleInformative5989);
                            	    lv_refPrivateData_10_0=ruleRefPrivateData();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getInformativeRule());
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
                            	    break loop83;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2931:6: ( (lv_refPDAll_11_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2931:6: ( (lv_refPDAll_11_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2932:1: (lv_refPDAll_11_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2932:1: (lv_refPDAll_11_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2933:3: lv_refPDAll_11_0= 'All'
                            {
                            lv_refPDAll_11_0=(Token)match(input,47,FOLLOW_47_in_ruleInformative6014); 

                                    newLeafNode(lv_refPDAll_11_0, grammarAccess.getInformativeAccess().getRefPDAllAllKeyword_8_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInformativeRule());
                            	        }
                                   		setWithLastConsumed(current, "refPDAll", lv_refPDAll_11_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2946:5: (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==66) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2946:7: otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) )
                    {
                    otherlv_12=(Token)match(input,66,FOLLOW_66_in_ruleInformative6043); 

                        	newLeafNode(otherlv_12, grammarAccess.getInformativeAccess().getRefersToServiceKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2950:1: ( ( (lv_refService_13_0= ruleRefService ) )* | ( (lv_refSAll_14_0= 'All' ) ) )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==RULE_ID||(LA87_0>=67 && LA87_0<=68)) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==47) ) {
                        alt87=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2950:2: ( (lv_refService_13_0= ruleRefService ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2950:2: ( (lv_refService_13_0= ruleRefService ) )*
                            loop86:
                            do {
                                int alt86=2;
                                int LA86_0 = input.LA(1);

                                if ( (LA86_0==RULE_ID) ) {
                                    alt86=1;
                                }


                                switch (alt86) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2951:1: (lv_refService_13_0= ruleRefService )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2951:1: (lv_refService_13_0= ruleRefService )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2952:3: lv_refService_13_0= ruleRefService
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefServiceRefServiceParserRuleCall_9_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefService_in_ruleInformative6065);
                            	    lv_refService_13_0=ruleRefService();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refService",
                            	            		lv_refService_13_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2969:6: ( (lv_refSAll_14_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2969:6: ( (lv_refSAll_14_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2970:1: (lv_refSAll_14_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2970:1: (lv_refSAll_14_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2971:3: lv_refSAll_14_0= 'All'
                            {
                            lv_refSAll_14_0=(Token)match(input,47,FOLLOW_47_in_ruleInformative6090); 

                                    newLeafNode(lv_refSAll_14_0, grammarAccess.getInformativeAccess().getRefSAllAllKeyword_9_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInformativeRule());
                            	        }
                                   		setWithLastConsumed(current, "refSAll", lv_refSAll_14_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2984:5: (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==67) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2984:7: otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) )
                    {
                    otherlv_15=(Token)match(input,67,FOLLOW_67_in_ruleInformative6119); 

                        	newLeafNode(otherlv_15, grammarAccess.getInformativeAccess().getRefersToEnforcementKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2988:1: ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )* | ( (lv_refEAll_17_0= 'All' ) ) )
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==RULE_ID||LA90_0==68) ) {
                        alt90=1;
                    }
                    else if ( (LA90_0==47) ) {
                        alt90=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 90, 0, input);

                        throw nvae;
                    }
                    switch (alt90) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2988:2: ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )*
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2988:2: ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )*
                            loop89:
                            do {
                                int alt89=2;
                                int LA89_0 = input.LA(1);

                                if ( (LA89_0==RULE_ID) ) {
                                    alt89=1;
                                }


                                switch (alt89) {
                            	case 1 :
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2989:1: (lv_refEnforcement_16_0= ruleRefEnforcement )
                            	    {
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2989:1: (lv_refEnforcement_16_0= ruleRefEnforcement )
                            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2990:3: lv_refEnforcement_16_0= ruleRefEnforcement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefEnforcementRefEnforcementParserRuleCall_10_1_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleRefEnforcement_in_ruleInformative6141);
                            	    lv_refEnforcement_16_0=ruleRefEnforcement();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"refEnforcement",
                            	            		lv_refEnforcement_16_0, 
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3007:6: ( (lv_refEAll_17_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3007:6: ( (lv_refEAll_17_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3008:1: (lv_refEAll_17_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3008:1: (lv_refEAll_17_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3009:3: lv_refEAll_17_0= 'All'
                            {
                            lv_refEAll_17_0=(Token)match(input,47,FOLLOW_47_in_ruleInformative6166); 

                                    newLeafNode(lv_refEAll_17_0, grammarAccess.getInformativeAccess().getRefEAllAllKeyword_10_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInformativeRule());
                            	        }
                                   		setWithLastConsumed(current, "refEAll", lv_refEAll_17_0, "All");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,68,FOLLOW_68_in_ruleInformative6194); 

                	newLeafNode(otherlv_18, grammarAccess.getInformativeAccess().getModalityKeyword_11());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3026:1: ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3027:1: ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3027:1: ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3028:1: (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3028:1: (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' )
            int alt92=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt92=1;
                }
                break;
            case 70:
                {
                alt92=2;
                }
                break;
            case 71:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3029:3: lv_modality_19_1= 'Permitted'
                    {
                    lv_modality_19_1=(Token)match(input,69,FOLLOW_69_in_ruleInformative6214); 

                            newLeafNode(lv_modality_19_1, grammarAccess.getInformativeAccess().getModalityPermittedKeyword_12_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_19_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3041:8: lv_modality_19_2= 'Obligation'
                    {
                    lv_modality_19_2=(Token)match(input,70,FOLLOW_70_in_ruleInformative6243); 

                            newLeafNode(lv_modality_19_2, grammarAccess.getInformativeAccess().getModalityObligationKeyword_12_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_19_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3053:8: lv_modality_19_3= 'Forbidden'
                    {
                    lv_modality_19_3=(Token)match(input,71,FOLLOW_71_in_ruleInformative6272); 

                            newLeafNode(lv_modality_19_3, grammarAccess.getInformativeAccess().getModalityForbiddenKeyword_12_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_19_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_20=(Token)match(input,13,FOLLOW_13_in_ruleInformative6300); 

                	newLeafNode(otherlv_20, grammarAccess.getInformativeAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3080:1: entryRuleRecipientPart returns [EObject current=null] : iv_ruleRecipientPart= ruleRecipientPart EOF ;
    public final EObject entryRuleRecipientPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipientPart = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3081:2: (iv_ruleRecipientPart= ruleRecipientPart EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3082:2: iv_ruleRecipientPart= ruleRecipientPart EOF
            {
             newCompositeNode(grammarAccess.getRecipientPartRule()); 
            pushFollow(FOLLOW_ruleRecipientPart_in_entryRuleRecipientPart6336);
            iv_ruleRecipientPart=ruleRecipientPart();

            state._fsp--;

             current =iv_ruleRecipientPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipientPart6346); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3089:1: ruleRecipientPart returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleRecipientPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3092:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3093:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3093:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3093:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3093:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3094:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3094:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3095:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRecipientPartRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipientPart6391); 

            		newLeafNode(otherlv_0, grammarAccess.getRecipientPartAccess().getRecipientPartRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3106:2: (otherlv_1= ',' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==62) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3106:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleRecipientPart6404); 

                        	newLeafNode(otherlv_1, grammarAccess.getRecipientPartAccess().getCommaKeyword_1());
                        

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3118:1: entryRuleRefRecipient returns [EObject current=null] : iv_ruleRefRecipient= ruleRefRecipient EOF ;
    public final EObject entryRuleRefRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefRecipient = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3119:2: (iv_ruleRefRecipient= ruleRefRecipient EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3120:2: iv_ruleRefRecipient= ruleRefRecipient EOF
            {
             newCompositeNode(grammarAccess.getRefRecipientRule()); 
            pushFollow(FOLLOW_ruleRefRecipient_in_entryRuleRefRecipient6442);
            iv_ruleRefRecipient=ruleRefRecipient();

            state._fsp--;

             current =iv_ruleRefRecipient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefRecipient6452); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3127:1: ruleRefRecipient returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleRefRecipient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3130:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3131:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3131:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3131:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3131:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3132:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3132:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3133:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRecipientRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipient6497); 

            		newLeafNode(otherlv_0, grammarAccess.getRefRecipientAccess().getRefRecipientRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3144:2: (otherlv_1= ',' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==62) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3144:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleRefRecipient6510); 

                        	newLeafNode(otherlv_1, grammarAccess.getRefRecipientAccess().getCommaKeyword_1());
                        

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3156:1: entryRuleRefRecipientSource returns [EObject current=null] : iv_ruleRefRecipientSource= ruleRefRecipientSource EOF ;
    public final EObject entryRuleRefRecipientSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefRecipientSource = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3157:2: (iv_ruleRefRecipientSource= ruleRefRecipientSource EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3158:2: iv_ruleRefRecipientSource= ruleRefRecipientSource EOF
            {
             newCompositeNode(grammarAccess.getRefRecipientSourceRule()); 
            pushFollow(FOLLOW_ruleRefRecipientSource_in_entryRuleRefRecipientSource6548);
            iv_ruleRefRecipientSource=ruleRefRecipientSource();

            state._fsp--;

             current =iv_ruleRefRecipientSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefRecipientSource6558); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3165:1: ruleRefRecipientSource returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleRefRecipientSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3168:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3169:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3169:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3169:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3169:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3170:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3170:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3171:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRecipientSourceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipientSource6603); 

            		newLeafNode(otherlv_0, grammarAccess.getRefRecipientSourceAccess().getRefRecipientSourceRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3182:2: (otherlv_1= ',' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==62) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3182:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleRefRecipientSource6616); 

                        	newLeafNode(otherlv_1, grammarAccess.getRefRecipientSourceAccess().getCommaKeyword_1());
                        

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3194:1: entryRuleRefRecipientTarget returns [EObject current=null] : iv_ruleRefRecipientTarget= ruleRefRecipientTarget EOF ;
    public final EObject entryRuleRefRecipientTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefRecipientTarget = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3195:2: (iv_ruleRefRecipientTarget= ruleRefRecipientTarget EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3196:2: iv_ruleRefRecipientTarget= ruleRefRecipientTarget EOF
            {
             newCompositeNode(grammarAccess.getRefRecipientTargetRule()); 
            pushFollow(FOLLOW_ruleRefRecipientTarget_in_entryRuleRefRecipientTarget6654);
            iv_ruleRefRecipientTarget=ruleRefRecipientTarget();

            state._fsp--;

             current =iv_ruleRefRecipientTarget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefRecipientTarget6664); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3203:1: ruleRefRecipientTarget returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleRefRecipientTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3206:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3207:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3207:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3207:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3207:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3208:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3208:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3209:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRecipientTargetRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipientTarget6709); 

            		newLeafNode(otherlv_0, grammarAccess.getRefRecipientTargetAccess().getRefRecipientTargetRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3220:2: (otherlv_1= ',' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==62) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3220:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleRefRecipientTarget6722); 

                        	newLeafNode(otherlv_1, grammarAccess.getRefRecipientTargetAccess().getCommaKeyword_1());
                        

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3232:1: entryRuleRefService returns [EObject current=null] : iv_ruleRefService= ruleRefService EOF ;
    public final EObject entryRuleRefService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefService = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3233:2: (iv_ruleRefService= ruleRefService EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3234:2: iv_ruleRefService= ruleRefService EOF
            {
             newCompositeNode(grammarAccess.getRefServiceRule()); 
            pushFollow(FOLLOW_ruleRefService_in_entryRuleRefService6760);
            iv_ruleRefService=ruleRefService();

            state._fsp--;

             current =iv_ruleRefService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefService6770); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3241:1: ruleRefService returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleRefService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3244:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3245:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3245:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3245:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3245:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3246:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3246:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3247:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefServiceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefService6815); 

            		newLeafNode(otherlv_0, grammarAccess.getRefServiceAccess().getRefServiceServiceCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3258:2: (otherlv_1= ',' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==62) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3258:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleRefService6828); 

                        	newLeafNode(otherlv_1, grammarAccess.getRefServiceAccess().getCommaKeyword_1());
                        

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3270:1: entryRuleServicePart returns [EObject current=null] : iv_ruleServicePart= ruleServicePart EOF ;
    public final EObject entryRuleServicePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServicePart = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3271:2: (iv_ruleServicePart= ruleServicePart EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3272:2: iv_ruleServicePart= ruleServicePart EOF
            {
             newCompositeNode(grammarAccess.getServicePartRule()); 
            pushFollow(FOLLOW_ruleServicePart_in_entryRuleServicePart6866);
            iv_ruleServicePart=ruleServicePart();

            state._fsp--;

             current =iv_ruleServicePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServicePart6876); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3279:1: ruleServicePart returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleServicePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3282:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3283:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3283:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3283:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3283:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3284:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3284:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3285:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServicePartRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServicePart6921); 

            		newLeafNode(otherlv_0, grammarAccess.getServicePartAccess().getServicePartServiceCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3296:2: (otherlv_1= ',' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==62) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3296:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleServicePart6934); 

                        	newLeafNode(otherlv_1, grammarAccess.getServicePartAccess().getCommaKeyword_1());
                        

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3308:1: entryRuleRefPrivateData returns [EObject current=null] : iv_ruleRefPrivateData= ruleRefPrivateData EOF ;
    public final EObject entryRuleRefPrivateData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPrivateData = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3309:2: (iv_ruleRefPrivateData= ruleRefPrivateData EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3310:2: iv_ruleRefPrivateData= ruleRefPrivateData EOF
            {
             newCompositeNode(grammarAccess.getRefPrivateDataRule()); 
            pushFollow(FOLLOW_ruleRefPrivateData_in_entryRuleRefPrivateData6972);
            iv_ruleRefPrivateData=ruleRefPrivateData();

            state._fsp--;

             current =iv_ruleRefPrivateData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefPrivateData6982); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3317:1: ruleRefPrivateData returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleRefPrivateData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3320:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3321:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3321:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3321:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3321:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3322:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3322:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3323:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefPrivateDataRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefPrivateData7027); 

            		newLeafNode(otherlv_0, grammarAccess.getRefPrivateDataAccess().getRefPrivateDataPrivateDataCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3334:2: (otherlv_1= ',' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==62) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3334:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleRefPrivateData7040); 

                        	newLeafNode(otherlv_1, grammarAccess.getRefPrivateDataAccess().getCommaKeyword_1());
                        

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3346:1: entryRuleRefEnforcement returns [EObject current=null] : iv_ruleRefEnforcement= ruleRefEnforcement EOF ;
    public final EObject entryRuleRefEnforcement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefEnforcement = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3347:2: (iv_ruleRefEnforcement= ruleRefEnforcement EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3348:2: iv_ruleRefEnforcement= ruleRefEnforcement EOF
            {
             newCompositeNode(grammarAccess.getRefEnforcementRule()); 
            pushFollow(FOLLOW_ruleRefEnforcement_in_entryRuleRefEnforcement7078);
            iv_ruleRefEnforcement=ruleRefEnforcement();

            state._fsp--;

             current =iv_ruleRefEnforcement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefEnforcement7088); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3355:1: ruleRefEnforcement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleRefEnforcement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3358:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3359:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3359:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3359:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3359:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3360:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3360:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3361:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefEnforcementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefEnforcement7133); 

            		newLeafNode(otherlv_0, grammarAccess.getRefEnforcementAccess().getRefEnforcementEnforcementCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3372:2: (otherlv_1= ',' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==62) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3372:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleRefEnforcement7146); 

                        	newLeafNode(otherlv_1, grammarAccess.getRefEnforcementAccess().getCommaKeyword_1());
                        

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
    public static final BitSet FOLLOW_12_in_rulePolicy155 = new BitSet(new long[]{0x840220200002A000L,0x0000000000052100L});
    public static final BitSet FOLLOW_ruleImport_in_rulePolicy176 = new BitSet(new long[]{0x840220200002A000L,0x0000000000052100L});
    public static final BitSet FOLLOW_ruleMetadata_in_rulePolicy198 = new BitSet(new long[]{0x8402202000002000L,0x0000000000052100L});
    public static final BitSet FOLLOW_ruleCollection_in_rulePolicy220 = new BitSet(new long[]{0x8402202000002000L,0x0000000000052100L});
    public static final BitSet FOLLOW_ruleDisclosure_in_rulePolicy242 = new BitSet(new long[]{0x0402202000002000L,0x0000000000052100L});
    public static final BitSet FOLLOW_ruleRetention_in_rulePolicy264 = new BitSet(new long[]{0x0402202000002000L,0x0000000000052000L});
    public static final BitSet FOLLOW_ruleUsage_in_rulePolicy286 = new BitSet(new long[]{0x0402202000002000L,0x0000000000050000L});
    public static final BitSet FOLLOW_ruleInformative_in_rulePolicy308 = new BitSet(new long[]{0x0402202000002000L,0x0000000000040000L});
    public static final BitSet FOLLOW_rulePrivateData_in_rulePolicy330 = new BitSet(new long[]{0x0402202000002000L});
    public static final BitSet FOLLOW_ruleRecipient_in_rulePolicy352 = new BitSet(new long[]{0x0002202000002000L});
    public static final BitSet FOLLOW_ruleService_in_rulePolicy374 = new BitSet(new long[]{0x0000202000002000L});
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
    public static final BitSet FOLLOW_19_in_ruleMetadata895 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadata912 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMetadata929 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadata946 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMetadata963 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadata980 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMetadata997 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDate_in_ruleMetadata1018 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMetadata1030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadata1047 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMetadata1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate1100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1152 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDate1169 = new BitSet(new long[]{0x0000001FFE000000L});
    public static final BitSet FOLLOW_ruleMonth_in_ruleDate1190 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDate1202 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonth_in_entryRuleMonth1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonth1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMonth1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMonth1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMonth1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMonth1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMonth1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMonth1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMonth1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMonth1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMonth1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMonth1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMonth1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMonth1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnforcement_in_entryRuleEnforcement1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnforcement1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEnforcement1731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnforcement1748 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnforcement1765 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleEnforcement1777 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnforcement1794 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnforcement1811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnforcement1828 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEnforcement1845 = new BitSet(new long[]{0x00001F0000000000L});
    public static final BitSet FOLLOW_40_in_ruleEnforcement1865 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_41_in_ruleEnforcement1894 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_42_in_ruleEnforcement1923 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_43_in_ruleEnforcement1952 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_44_in_ruleEnforcement1981 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnforcement2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleService2092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2109 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleService2126 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleService2138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService2155 = new BitSet(new long[]{0x0001400000082000L});
    public static final BitSet FOLLOW_19_in_ruleService2173 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService2190 = new BitSet(new long[]{0x0001400000002000L});
    public static final BitSet FOLLOW_46_in_ruleService2210 = new BitSet(new long[]{0x0001800000002010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleService2232 = new BitSet(new long[]{0x0001000000002010L});
    public static final BitSet FOLLOW_47_in_ruleService2257 = new BitSet(new long[]{0x0001000000002000L});
    public static final BitSet FOLLOW_48_in_ruleService2286 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleServicePart_in_ruleService2307 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleService2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipient_in_entryRuleRecipient2358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipient2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRecipient2405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipient2422 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRecipient2439 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRecipient2451 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecipient2468 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecipient2485 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecipient2502 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_50_in_ruleRecipient2520 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_ruleRecipientPart_in_ruleRecipient2541 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_51_in_ruleRecipient2556 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_52_in_ruleRecipient2576 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_53_in_ruleRecipient2605 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_54_in_ruleRecipient2634 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleRecipient2662 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_55_in_ruleRecipient2682 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_56_in_ruleRecipient2711 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_57_in_ruleRecipient2740 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecipient2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrivateData_in_entryRulePrivateData2804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrivateData2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePrivateData2851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrivateData2868 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePrivateData2885 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrivateData2897 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrivateData2914 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePrivateData2931 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_59_in_rulePrivateData2951 = new BitSet(new long[]{0x2000000000002000L});
    public static final BitSet FOLLOW_60_in_rulePrivateData2980 = new BitSet(new long[]{0x2000000000002000L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePrivateData3017 = new BitSet(new long[]{0x2000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePrivateData3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute3066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleAttribute3113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute3130 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute3147 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAttribute3159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute3176 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAttribute3193 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleAttribute3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection3244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCollection3291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollection3308 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollection3325 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection3337 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection3354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleCollection3371 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection3388 = new BitSet(new long[]{0x0000400000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_65_in_ruleCollection3406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollection3426 = new BitSet(new long[]{0x0000400000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_46_in_ruleCollection3441 = new BitSet(new long[]{0x0000800000000010L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleCollection3463 = new BitSet(new long[]{0x0000000000000010L,0x000000000000001CL});
    public static final BitSet FOLLOW_47_in_ruleCollection3488 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_66_in_ruleCollection3517 = new BitSet(new long[]{0x0000800000000010L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleCollection3539 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000018L});
    public static final BitSet FOLLOW_47_in_ruleCollection3564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleCollection3593 = new BitSet(new long[]{0x0000800000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleCollection3615 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_47_in_ruleCollection3640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleCollection3668 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_69_in_ruleCollection3688 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70_in_ruleCollection3717 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71_in_ruleCollection3746 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCollection3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisclosure_in_entryRuleDisclosure3810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisclosure3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDisclosure3857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisclosure3874 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDisclosure3891 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3903 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure3920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleDisclosure3937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure3954 = new BitSet(new long[]{0x0000400000000000L,0x0000000000001E1CL});
    public static final BitSet FOLLOW_73_in_ruleDisclosure3972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisclosure3992 = new BitSet(new long[]{0x0000400000000000L,0x0000000000001C1CL});
    public static final BitSet FOLLOW_74_in_ruleDisclosure4007 = new BitSet(new long[]{0x0000C00000000010L,0x000000000000181CL});
    public static final BitSet FOLLOW_ruleRefRecipient_in_ruleDisclosure4029 = new BitSet(new long[]{0x0000400000000010L,0x000000000000181CL});
    public static final BitSet FOLLOW_47_in_ruleDisclosure4054 = new BitSet(new long[]{0x0000400000000000L,0x000000000000181CL});
    public static final BitSet FOLLOW_75_in_ruleDisclosure4083 = new BitSet(new long[]{0x0000C00000000010L,0x000000000000101CL});
    public static final BitSet FOLLOW_ruleRefRecipientSource_in_ruleDisclosure4105 = new BitSet(new long[]{0x0000400000000010L,0x000000000000101CL});
    public static final BitSet FOLLOW_47_in_ruleDisclosure4130 = new BitSet(new long[]{0x0000400000000000L,0x000000000000101CL});
    public static final BitSet FOLLOW_76_in_ruleDisclosure4159 = new BitSet(new long[]{0x0000C00000000010L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleRefRecipientTarget_in_ruleDisclosure4181 = new BitSet(new long[]{0x0000400000000010L,0x000000000000001CL});
    public static final BitSet FOLLOW_47_in_ruleDisclosure4206 = new BitSet(new long[]{0x0000400000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_46_in_ruleDisclosure4235 = new BitSet(new long[]{0x0000800000000010L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleDisclosure4257 = new BitSet(new long[]{0x0000000000000010L,0x000000000000001CL});
    public static final BitSet FOLLOW_47_in_ruleDisclosure4282 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_66_in_ruleDisclosure4311 = new BitSet(new long[]{0x0000800000000010L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleDisclosure4333 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000018L});
    public static final BitSet FOLLOW_47_in_ruleDisclosure4358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleDisclosure4387 = new BitSet(new long[]{0x0000800000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleDisclosure4409 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_47_in_ruleDisclosure4434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleDisclosure4462 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_69_in_ruleDisclosure4482 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70_in_ruleDisclosure4511 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71_in_ruleDisclosure4540 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDisclosure4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRetention_in_entryRuleRetention4604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRetention4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleRetention4651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRetention4668 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRetention4685 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention4697 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention4714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleRetention4731 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention4748 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleRetention4766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRetention4786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleRetention4800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention4817 = new BitSet(new long[]{0x0000400000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_46_in_ruleRetention4835 = new BitSet(new long[]{0x0000800000000010L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleRetention4857 = new BitSet(new long[]{0x0000000000000010L,0x000000000000001CL});
    public static final BitSet FOLLOW_47_in_ruleRetention4882 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_66_in_ruleRetention4911 = new BitSet(new long[]{0x0000800000000010L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleRetention4933 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000018L});
    public static final BitSet FOLLOW_47_in_ruleRetention4958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleRetention4987 = new BitSet(new long[]{0x0000800000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleRetention5009 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_47_in_ruleRetention5034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleRetention5062 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_69_in_ruleRetention5082 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70_in_ruleRetention5111 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71_in_ruleRetention5140 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRetention5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage5204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleUsage5251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage5268 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUsage5285 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage5297 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage5314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleUsage5331 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage5348 = new BitSet(new long[]{0x0000400000000000L,0x000000000002001CL});
    public static final BitSet FOLLOW_81_in_ruleUsage5366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage5386 = new BitSet(new long[]{0x0000400000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_46_in_ruleUsage5401 = new BitSet(new long[]{0x0000800000000010L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleUsage5423 = new BitSet(new long[]{0x0000000000000010L,0x000000000000001CL});
    public static final BitSet FOLLOW_47_in_ruleUsage5448 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_66_in_ruleUsage5477 = new BitSet(new long[]{0x0000800000000010L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleUsage5499 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000018L});
    public static final BitSet FOLLOW_47_in_ruleUsage5524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleUsage5553 = new BitSet(new long[]{0x0000800000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleUsage5575 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_47_in_ruleUsage5600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleUsage5628 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_69_in_ruleUsage5648 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70_in_ruleUsage5677 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71_in_ruleUsage5706 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUsage5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInformative_in_entryRuleInformative5770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInformative5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleInformative5817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformative5834 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInformative5851 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative5863 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative5880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleInformative5897 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative5914 = new BitSet(new long[]{0x0000400000000000L,0x000000000008001CL});
    public static final BitSet FOLLOW_83_in_ruleInformative5932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformative5952 = new BitSet(new long[]{0x0000400000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_46_in_ruleInformative5967 = new BitSet(new long[]{0x0000800000000010L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleInformative5989 = new BitSet(new long[]{0x0000000000000010L,0x000000000000001CL});
    public static final BitSet FOLLOW_47_in_ruleInformative6014 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_66_in_ruleInformative6043 = new BitSet(new long[]{0x0000800000000010L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleInformative6065 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000018L});
    public static final BitSet FOLLOW_47_in_ruleInformative6090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleInformative6119 = new BitSet(new long[]{0x0000800000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleInformative6141 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_47_in_ruleInformative6166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleInformative6194 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_69_in_ruleInformative6214 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70_in_ruleInformative6243 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71_in_ruleInformative6272 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInformative6300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipientPart_in_entryRuleRecipientPart6336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipientPart6346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipientPart6391 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRecipientPart6404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefRecipient_in_entryRuleRefRecipient6442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefRecipient6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipient6497 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRefRecipient6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefRecipientSource_in_entryRuleRefRecipientSource6548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefRecipientSource6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipientSource6603 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRefRecipientSource6616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefRecipientTarget_in_entryRuleRefRecipientTarget6654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefRecipientTarget6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipientTarget6709 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRefRecipientTarget6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefService_in_entryRuleRefService6760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefService6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefService6815 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRefService6828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServicePart_in_entryRuleServicePart6866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServicePart6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServicePart6921 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleServicePart6934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_entryRuleRefPrivateData6972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefPrivateData6982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefPrivateData7027 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRefPrivateData7040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_entryRuleRefEnforcement7078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefEnforcement7088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefEnforcement7133 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRefEnforcement7146 = new BitSet(new long[]{0x0000000000000002L});

}