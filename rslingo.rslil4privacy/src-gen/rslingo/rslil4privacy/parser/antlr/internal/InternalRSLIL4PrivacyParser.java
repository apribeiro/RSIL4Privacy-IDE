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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1027:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'RefersTo PrivateData' ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_9_0= 'All' ) ) ) )? (otherlv_10= 'Service_Part' ( (lv_servicePart_11_0= ruleServicePart ) )* )? otherlv_12= '}' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1030:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'RefersTo PrivateData' ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_9_0= 'All' ) ) ) )? (otherlv_10= 'Service_Part' ( (lv_servicePart_11_0= ruleServicePart ) )* )? otherlv_12= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1031:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'RefersTo PrivateData' ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_9_0= 'All' ) ) ) )? (otherlv_10= 'Service_Part' ( (lv_servicePart_11_0= ruleServicePart ) )* )? otherlv_12= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1031:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'RefersTo PrivateData' ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_9_0= 'All' ) ) ) )? (otherlv_10= 'Service_Part' ( (lv_servicePart_11_0= ruleServicePart ) )* )? otherlv_12= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1031:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_serviceName_4_0= RULE_STRING ) ) (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'RefersTo PrivateData' ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_9_0= 'All' ) ) ) )? (otherlv_10= 'Service_Part' ( (lv_servicePart_11_0= ruleServicePart ) )* )? otherlv_12= '}'
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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1101:4: (otherlv_7= 'RefersTo PrivateData' ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_9_0= 'All' ) ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==46) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1101:6: otherlv_7= 'RefersTo PrivateData' ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_9_0= 'All' ) ) )
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleService2210); 

                        	newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getRefersToPrivateDataKeyword_6_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1105:1: ( ( (lv_refPrivateData_8_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_9_0= 'All' ) ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==47) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1105:2: ( (lv_refPrivateData_8_0= ruleRefPrivateData ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1105:2: ( (lv_refPrivateData_8_0= ruleRefPrivateData ) )
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
                                   		set(
                                   			current, 
                                   			"refPrivateData",
                                    		lv_refPrivateData_8_0, 
                                    		"RefPrivateData");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


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
                            lv_refPDAll_9_0=(Token)match(input,47,FOLLOW_47_in_ruleService2256); 

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
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==48) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1139:7: otherlv_10= 'Service_Part' ( (lv_servicePart_11_0= ruleServicePart ) )*
                    {
                    otherlv_10=(Token)match(input,48,FOLLOW_48_in_ruleService2285); 

                        	newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getService_PartKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1143:1: ( (lv_servicePart_11_0= ruleServicePart ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1144:1: (lv_servicePart_11_0= ruleServicePart )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1144:1: (lv_servicePart_11_0= ruleServicePart )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1145:3: lv_servicePart_11_0= ruleServicePart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceAccess().getServicePartServicePartParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleServicePart_in_ruleService2306);
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleService2321); 

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
            pushFollow(FOLLOW_ruleRecipient_in_entryRuleRecipient2357);
            iv_ruleRecipient=ruleRecipient();

            state._fsp--;

             current =iv_ruleRecipient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipient2367); 

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
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleRecipient2404); 

                	newLeafNode(otherlv_0, grammarAccess.getRecipientAccess().getRecipientKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1190:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1191:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1191:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1192:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipient2421); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRecipient2438); 

                	newLeafNode(otherlv_2, grammarAccess.getRecipientAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleRecipient2450); 

                	newLeafNode(otherlv_3, grammarAccess.getRecipientAccess().getNameKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1216:1: ( (lv_recipientName_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1217:1: (lv_recipientName_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1217:1: (lv_recipientName_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1218:3: lv_recipientName_4_0= RULE_STRING
            {
            lv_recipientName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecipient2467); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRecipient2484); 

                	newLeafNode(otherlv_5, grammarAccess.getRecipientAccess().getDescriptionKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1238:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1239:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1239:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1240:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecipient2501); 

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
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==50) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1256:4: otherlv_7= 'Recipient_Part' ( (lv_recipientPart_8_0= ruleRecipientPart ) )*
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleRecipient2519); 

                        	newLeafNode(otherlv_7, grammarAccess.getRecipientAccess().getRecipient_PartKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1260:1: ( (lv_recipientPart_8_0= ruleRecipientPart ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1261:1: (lv_recipientPart_8_0= ruleRecipientPart )
                    	    {
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1261:1: (lv_recipientPart_8_0= ruleRecipientPart )
                    	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1262:3: lv_recipientPart_8_0= ruleRecipientPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRecipientAccess().getRecipientPartRecipientPartParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRecipientPart_in_ruleRecipient2540);
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
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,51,FOLLOW_51_in_ruleRecipient2555); 

                	newLeafNode(otherlv_9, grammarAccess.getRecipientAccess().getScopeKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1282:1: ( ( (lv_scope_10_1= 'Internal' | lv_scope_10_2= 'External' | lv_scope_10_3= 'Internal/External' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1283:1: ( (lv_scope_10_1= 'Internal' | lv_scope_10_2= 'External' | lv_scope_10_3= 'Internal/External' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1283:1: ( (lv_scope_10_1= 'Internal' | lv_scope_10_2= 'External' | lv_scope_10_3= 'Internal/External' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1284:1: (lv_scope_10_1= 'Internal' | lv_scope_10_2= 'External' | lv_scope_10_3= 'Internal/External' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1284:1: (lv_scope_10_1= 'Internal' | lv_scope_10_2= 'External' | lv_scope_10_3= 'Internal/External' )
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1285:3: lv_scope_10_1= 'Internal'
                    {
                    lv_scope_10_1=(Token)match(input,52,FOLLOW_52_in_ruleRecipient2575); 

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
                    lv_scope_10_2=(Token)match(input,53,FOLLOW_53_in_ruleRecipient2604); 

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
                    lv_scope_10_3=(Token)match(input,54,FOLLOW_54_in_ruleRecipient2633); 

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

            otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleRecipient2661); 

                	newLeafNode(otherlv_11, grammarAccess.getRecipientAccess().getTypeKeyword_10());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1328:1: ( ( (lv_type_12_1= 'Individual' | lv_type_12_2= 'Organization' | lv_type_12_3= 'Individual/Organization' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1329:1: ( (lv_type_12_1= 'Individual' | lv_type_12_2= 'Organization' | lv_type_12_3= 'Individual/Organization' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1329:1: ( (lv_type_12_1= 'Individual' | lv_type_12_2= 'Organization' | lv_type_12_3= 'Individual/Organization' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1330:1: (lv_type_12_1= 'Individual' | lv_type_12_2= 'Organization' | lv_type_12_3= 'Individual/Organization' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1330:1: (lv_type_12_1= 'Individual' | lv_type_12_2= 'Organization' | lv_type_12_3= 'Individual/Organization' )
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1331:3: lv_type_12_1= 'Individual'
                    {
                    lv_type_12_1=(Token)match(input,55,FOLLOW_55_in_ruleRecipient2681); 

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
                    lv_type_12_2=(Token)match(input,56,FOLLOW_56_in_ruleRecipient2710); 

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
                    lv_type_12_3=(Token)match(input,57,FOLLOW_57_in_ruleRecipient2739); 

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

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleRecipient2767); 

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
            pushFollow(FOLLOW_rulePrivateData_in_entryRulePrivateData2803);
            iv_rulePrivateData=rulePrivateData();

            state._fsp--;

             current =iv_rulePrivateData; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrivateData2813); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1391:1: rulePrivateData returns [EObject current=null] : (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_privateDataName_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'PersonalInformation' | lv_type_8_2= 'UsageInformation' ) ) ) ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '}' ) ;
    public final EObject rulePrivateData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_privateDataName_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_type_8_1=null;
        Token lv_type_8_2=null;
        Token otherlv_10=null;
        EObject lv_attribute_9_0 = null;


         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1394:28: ( (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_privateDataName_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'PersonalInformation' | lv_type_8_2= 'UsageInformation' ) ) ) ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1395:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_privateDataName_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'PersonalInformation' | lv_type_8_2= 'UsageInformation' ) ) ) ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1395:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_privateDataName_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'PersonalInformation' | lv_type_8_2= 'UsageInformation' ) ) ) ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1395:3: otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_privateDataName_4_0= RULE_STRING ) ) otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= 'Type' ( ( (lv_type_8_1= 'PersonalInformation' | lv_type_8_2= 'UsageInformation' ) ) ) ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_rulePrivateData2850); 

                	newLeafNode(otherlv_0, grammarAccess.getPrivateDataAccess().getPrivateDataKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1399:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1400:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1400:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1401:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrivateData2867); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePrivateData2884); 

                	newLeafNode(otherlv_2, grammarAccess.getPrivateDataAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,38,FOLLOW_38_in_rulePrivateData2896); 

                	newLeafNode(otherlv_3, grammarAccess.getPrivateDataAccess().getNameKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1425:1: ( (lv_privateDataName_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1426:1: (lv_privateDataName_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1426:1: (lv_privateDataName_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1427:3: lv_privateDataName_4_0= RULE_STRING
            {
            lv_privateDataName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrivateData2913); 

            			newLeafNode(lv_privateDataName_4_0, grammarAccess.getPrivateDataAccess().getPrivateDataNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrivateDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"privateDataName",
                    		lv_privateDataName_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_rulePrivateData2930); 

                	newLeafNode(otherlv_5, grammarAccess.getPrivateDataAccess().getDescriptionKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1447:1: ( (lv_description_6_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1448:1: (lv_description_6_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1448:1: (lv_description_6_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1449:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrivateData2947); 

            			newLeafNode(lv_description_6_0, grammarAccess.getPrivateDataAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrivateDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,39,FOLLOW_39_in_rulePrivateData2964); 

                	newLeafNode(otherlv_7, grammarAccess.getPrivateDataAccess().getTypeKeyword_7());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1469:1: ( ( (lv_type_8_1= 'PersonalInformation' | lv_type_8_2= 'UsageInformation' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1470:1: ( (lv_type_8_1= 'PersonalInformation' | lv_type_8_2= 'UsageInformation' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1470:1: ( (lv_type_8_1= 'PersonalInformation' | lv_type_8_2= 'UsageInformation' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1471:1: (lv_type_8_1= 'PersonalInformation' | lv_type_8_2= 'UsageInformation' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1471:1: (lv_type_8_1= 'PersonalInformation' | lv_type_8_2= 'UsageInformation' )
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1472:3: lv_type_8_1= 'PersonalInformation'
                    {
                    lv_type_8_1=(Token)match(input,59,FOLLOW_59_in_rulePrivateData2984); 

                            newLeafNode(lv_type_8_1, grammarAccess.getPrivateDataAccess().getTypePersonalInformationKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrivateDataRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1484:8: lv_type_8_2= 'UsageInformation'
                    {
                    lv_type_8_2=(Token)match(input,60,FOLLOW_60_in_rulePrivateData3013); 

                            newLeafNode(lv_type_8_2, grammarAccess.getPrivateDataAccess().getTypeUsageInformationKeyword_8_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrivateDataRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1499:2: ( (lv_attribute_9_0= ruleAttribute ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==61) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1500:1: (lv_attribute_9_0= ruleAttribute )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1500:1: (lv_attribute_9_0= ruleAttribute )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1501:3: lv_attribute_9_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrivateDataAccess().getAttributeAttributeParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePrivateData3050);
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

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_rulePrivateData3063); 

                	newLeafNode(otherlv_10, grammarAccess.getPrivateDataAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1529:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1530:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1531:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute3099);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute3109); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1538:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1541:28: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1542:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1542:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )? )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1542:3: otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '}' (otherlv_6= ',' )?
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleAttribute3146); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1546:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1547:1: (lv_name_1_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1547:1: (lv_name_1_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1548:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute3163); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAttribute3180); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleAttribute3192); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1572:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1573:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1573:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1574:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute3209); 

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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleAttribute3226); 

                	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1594:1: (otherlv_6= ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==62) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1594:3: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,62,FOLLOW_62_in_ruleAttribute3239); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1606:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1607:2: (iv_ruleCollection= ruleCollection EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1608:2: iv_ruleCollection= ruleCollection EOF
            {
             newCompositeNode(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection3277);
            iv_ruleCollection=ruleCollection();

            state._fsp--;

             current =iv_ruleCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection3287); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1615:1: ruleCollection returns [EObject current=null] : (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Collection' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1618:28: ( (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Collection' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1619:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Collection' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1619:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Collection' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1619:3: otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Collection' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleCollection3324); 

                	newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getCollectionKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1623:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1624:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1624:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1625:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollection3341); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCollection3358); 

                	newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleCollection3370); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1649:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1650:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1650:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1651:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection3387); 

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

            otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleCollection3404); 

                	newLeafNode(otherlv_5, grammarAccess.getCollectionAccess().getConditionKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1671:1: ( (lv_condition_6_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1672:1: (lv_condition_6_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1672:1: (lv_condition_6_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1673:3: lv_condition_6_0= RULE_STRING
            {
            lv_condition_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection3421); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1689:2: (otherlv_7= 'PartOf Collection' ( (otherlv_8= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==65) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1689:4: otherlv_7= 'PartOf Collection' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,65,FOLLOW_65_in_ruleCollection3439); 

                        	newLeafNode(otherlv_7, grammarAccess.getCollectionAccess().getPartOfCollectionKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1693:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1694:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1694:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1695:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollection3459); 

                    		newLeafNode(otherlv_8, grammarAccess.getCollectionAccess().getPartCollectionCollectionCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1706:4: (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1706:6: otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) )
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleCollection3474); 

                        	newLeafNode(otherlv_9, grammarAccess.getCollectionAccess().getRefersToPrivateDataKeyword_8_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1710:1: ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_ID) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==47) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1710:2: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1710:2: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1711:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1711:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1712:3: lv_refPrivateData_10_0= ruleRefPrivateData
                            {
                             
                            	        newCompositeNode(grammarAccess.getCollectionAccess().getRefPrivateDataRefPrivateDataParserRuleCall_8_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefPrivateData_in_ruleCollection3496);
                            lv_refPrivateData_10_0=ruleRefPrivateData();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refPrivateData",
                                    		lv_refPrivateData_10_0, 
                                    		"RefPrivateData");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1729:6: ( (lv_refPDAll_11_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1729:6: ( (lv_refPDAll_11_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1730:1: (lv_refPDAll_11_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1730:1: (lv_refPDAll_11_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1731:3: lv_refPDAll_11_0= 'All'
                            {
                            lv_refPDAll_11_0=(Token)match(input,47,FOLLOW_47_in_ruleCollection3520); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1744:5: (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==66) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1744:7: otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) )
                    {
                    otherlv_12=(Token)match(input,66,FOLLOW_66_in_ruleCollection3549); 

                        	newLeafNode(otherlv_12, grammarAccess.getCollectionAccess().getRefersToServiceKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1748:1: ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID) ) {
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1748:2: ( (lv_refService_13_0= ruleRefService ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1748:2: ( (lv_refService_13_0= ruleRefService ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1749:1: (lv_refService_13_0= ruleRefService )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1749:1: (lv_refService_13_0= ruleRefService )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1750:3: lv_refService_13_0= ruleRefService
                            {
                             
                            	        newCompositeNode(grammarAccess.getCollectionAccess().getRefServiceRefServiceParserRuleCall_9_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefService_in_ruleCollection3571);
                            lv_refService_13_0=ruleRefService();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refService",
                                    		lv_refService_13_0, 
                                    		"RefService");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1767:6: ( (lv_refSAll_14_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1767:6: ( (lv_refSAll_14_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1768:1: (lv_refSAll_14_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1768:1: (lv_refSAll_14_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1769:3: lv_refSAll_14_0= 'All'
                            {
                            lv_refSAll_14_0=(Token)match(input,47,FOLLOW_47_in_ruleCollection3595); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1782:5: (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==67) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1782:7: otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) )
                    {
                    otherlv_15=(Token)match(input,67,FOLLOW_67_in_ruleCollection3624); 

                        	newLeafNode(otherlv_15, grammarAccess.getCollectionAccess().getRefersToEnforcementKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1786:1: ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==47) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1786:2: ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1786:2: ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1787:1: (lv_refEnforcement_16_0= ruleRefEnforcement )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1787:1: (lv_refEnforcement_16_0= ruleRefEnforcement )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1788:3: lv_refEnforcement_16_0= ruleRefEnforcement
                            {
                             
                            	        newCompositeNode(grammarAccess.getCollectionAccess().getRefEnforcementRefEnforcementParserRuleCall_10_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefEnforcement_in_ruleCollection3646);
                            lv_refEnforcement_16_0=ruleRefEnforcement();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refEnforcement",
                                    		lv_refEnforcement_16_0, 
                                    		"RefEnforcement");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1805:6: ( (lv_refEAll_17_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1805:6: ( (lv_refEAll_17_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1806:1: (lv_refEAll_17_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1806:1: (lv_refEAll_17_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1807:3: lv_refEAll_17_0= 'All'
                            {
                            lv_refEAll_17_0=(Token)match(input,47,FOLLOW_47_in_ruleCollection3670); 

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

            otherlv_18=(Token)match(input,68,FOLLOW_68_in_ruleCollection3698); 

                	newLeafNode(otherlv_18, grammarAccess.getCollectionAccess().getModalityKeyword_11());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1824:1: ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1825:1: ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1825:1: ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1826:1: (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1826:1: (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt35=1;
                }
                break;
            case 70:
                {
                alt35=2;
                }
                break;
            case 71:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1827:3: lv_modality_19_1= 'Permitted'
                    {
                    lv_modality_19_1=(Token)match(input,69,FOLLOW_69_in_ruleCollection3718); 

                            newLeafNode(lv_modality_19_1, grammarAccess.getCollectionAccess().getModalityPermittedKeyword_12_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_19_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1839:8: lv_modality_19_2= 'Obligation'
                    {
                    lv_modality_19_2=(Token)match(input,70,FOLLOW_70_in_ruleCollection3747); 

                            newLeafNode(lv_modality_19_2, grammarAccess.getCollectionAccess().getModalityObligationKeyword_12_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_19_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1851:8: lv_modality_19_3= 'Forbidden'
                    {
                    lv_modality_19_3=(Token)match(input,71,FOLLOW_71_in_ruleCollection3776); 

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

            otherlv_20=(Token)match(input,13,FOLLOW_13_in_ruleCollection3804); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1878:1: entryRuleDisclosure returns [EObject current=null] : iv_ruleDisclosure= ruleDisclosure EOF ;
    public final EObject entryRuleDisclosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisclosure = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1879:2: (iv_ruleDisclosure= ruleDisclosure EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1880:2: iv_ruleDisclosure= ruleDisclosure EOF
            {
             newCompositeNode(grammarAccess.getDisclosureRule()); 
            pushFollow(FOLLOW_ruleDisclosure_in_entryRuleDisclosure3840);
            iv_ruleDisclosure=ruleDisclosure();

            state._fsp--;

             current =iv_ruleDisclosure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisclosure3850); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1887:1: ruleDisclosure returns [EObject current=null] : (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Disclosure' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo Recipient' ( ( (lv_refRecipient_10_0= ruleRefRecipient ) ) | ( (lv_refRAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) ) | ( (lv_refRSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) ) | ( (lv_refRTAll_17_0= 'All' ) ) ) )? (otherlv_18= 'RefersTo PrivateData' ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_20_0= 'All' ) ) ) )? (otherlv_21= 'RefersTo Service' ( ( (lv_refService_22_0= ruleRefService ) ) | ( (lv_refSAll_23_0= 'All' ) ) ) )? (otherlv_24= 'RefersTo Enforcement' ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) ) | ( (lv_refEAll_26_0= 'All' ) ) ) )? otherlv_27= 'Modality' ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) ) otherlv_29= '}' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1890:28: ( (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Disclosure' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo Recipient' ( ( (lv_refRecipient_10_0= ruleRefRecipient ) ) | ( (lv_refRAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) ) | ( (lv_refRSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) ) | ( (lv_refRTAll_17_0= 'All' ) ) ) )? (otherlv_18= 'RefersTo PrivateData' ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_20_0= 'All' ) ) ) )? (otherlv_21= 'RefersTo Service' ( ( (lv_refService_22_0= ruleRefService ) ) | ( (lv_refSAll_23_0= 'All' ) ) ) )? (otherlv_24= 'RefersTo Enforcement' ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) ) | ( (lv_refEAll_26_0= 'All' ) ) ) )? otherlv_27= 'Modality' ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) ) otherlv_29= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1891:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Disclosure' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo Recipient' ( ( (lv_refRecipient_10_0= ruleRefRecipient ) ) | ( (lv_refRAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) ) | ( (lv_refRSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) ) | ( (lv_refRTAll_17_0= 'All' ) ) ) )? (otherlv_18= 'RefersTo PrivateData' ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_20_0= 'All' ) ) ) )? (otherlv_21= 'RefersTo Service' ( ( (lv_refService_22_0= ruleRefService ) ) | ( (lv_refSAll_23_0= 'All' ) ) ) )? (otherlv_24= 'RefersTo Enforcement' ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) ) | ( (lv_refEAll_26_0= 'All' ) ) ) )? otherlv_27= 'Modality' ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) ) otherlv_29= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1891:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Disclosure' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo Recipient' ( ( (lv_refRecipient_10_0= ruleRefRecipient ) ) | ( (lv_refRAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) ) | ( (lv_refRSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) ) | ( (lv_refRTAll_17_0= 'All' ) ) ) )? (otherlv_18= 'RefersTo PrivateData' ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_20_0= 'All' ) ) ) )? (otherlv_21= 'RefersTo Service' ( ( (lv_refService_22_0= ruleRefService ) ) | ( (lv_refSAll_23_0= 'All' ) ) ) )? (otherlv_24= 'RefersTo Enforcement' ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) ) | ( (lv_refEAll_26_0= 'All' ) ) ) )? otherlv_27= 'Modality' ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) ) otherlv_29= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1891:3: otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Disclosure' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo Recipient' ( ( (lv_refRecipient_10_0= ruleRefRecipient ) ) | ( (lv_refRAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) ) | ( (lv_refRSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) ) | ( (lv_refRTAll_17_0= 'All' ) ) ) )? (otherlv_18= 'RefersTo PrivateData' ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_20_0= 'All' ) ) ) )? (otherlv_21= 'RefersTo Service' ( ( (lv_refService_22_0= ruleRefService ) ) | ( (lv_refSAll_23_0= 'All' ) ) ) )? (otherlv_24= 'RefersTo Enforcement' ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) ) | ( (lv_refEAll_26_0= 'All' ) ) ) )? otherlv_27= 'Modality' ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) ) otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleDisclosure3887); 

                	newLeafNode(otherlv_0, grammarAccess.getDisclosureAccess().getDisclosureKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1895:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1896:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1896:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1897:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisclosure3904); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDisclosure3921); 

                	newLeafNode(otherlv_2, grammarAccess.getDisclosureAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3933); 

                	newLeafNode(otherlv_3, grammarAccess.getDisclosureAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1921:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1922:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1922:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1923:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure3950); 

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

            otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleDisclosure3967); 

                	newLeafNode(otherlv_5, grammarAccess.getDisclosureAccess().getConditionKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1943:1: ( (lv_condition_6_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1944:1: (lv_condition_6_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1944:1: (lv_condition_6_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1945:3: lv_condition_6_0= RULE_STRING
            {
            lv_condition_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure3984); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1961:2: (otherlv_7= 'PartOf Disclosure' ( (otherlv_8= RULE_ID ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==73) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1961:4: otherlv_7= 'PartOf Disclosure' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,73,FOLLOW_73_in_ruleDisclosure4002); 

                        	newLeafNode(otherlv_7, grammarAccess.getDisclosureAccess().getPartOfDisclosureKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1965:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1966:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1966:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1967:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisclosure4022); 

                    		newLeafNode(otherlv_8, grammarAccess.getDisclosureAccess().getPartDisclosureDisclosureCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1978:4: (otherlv_9= 'RefersTo Recipient' ( ( (lv_refRecipient_10_0= ruleRefRecipient ) ) | ( (lv_refRAll_11_0= 'All' ) ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==74) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1978:6: otherlv_9= 'RefersTo Recipient' ( ( (lv_refRecipient_10_0= ruleRefRecipient ) ) | ( (lv_refRAll_11_0= 'All' ) ) )
                    {
                    otherlv_9=(Token)match(input,74,FOLLOW_74_in_ruleDisclosure4037); 

                        	newLeafNode(otherlv_9, grammarAccess.getDisclosureAccess().getRefersToRecipientKeyword_8_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1982:1: ( ( (lv_refRecipient_10_0= ruleRefRecipient ) ) | ( (lv_refRAll_11_0= 'All' ) ) )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ID) ) {
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1982:2: ( (lv_refRecipient_10_0= ruleRefRecipient ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1982:2: ( (lv_refRecipient_10_0= ruleRefRecipient ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1983:1: (lv_refRecipient_10_0= ruleRefRecipient )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1983:1: (lv_refRecipient_10_0= ruleRefRecipient )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:1984:3: lv_refRecipient_10_0= ruleRefRecipient
                            {
                             
                            	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefRecipientRefRecipientParserRuleCall_8_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefRecipient_in_ruleDisclosure4059);
                            lv_refRecipient_10_0=ruleRefRecipient();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refRecipient",
                                    		lv_refRecipient_10_0, 
                                    		"RefRecipient");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2001:6: ( (lv_refRAll_11_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2001:6: ( (lv_refRAll_11_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2002:1: (lv_refRAll_11_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2002:1: (lv_refRAll_11_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2003:3: lv_refRAll_11_0= 'All'
                            {
                            lv_refRAll_11_0=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure4083); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2016:5: (otherlv_12= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) ) | ( (lv_refRSAll_14_0= 'All' ) ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==75) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2016:7: otherlv_12= 'RefersTo Recipient-Source' ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) ) | ( (lv_refRSAll_14_0= 'All' ) ) )
                    {
                    otherlv_12=(Token)match(input,75,FOLLOW_75_in_ruleDisclosure4112); 

                        	newLeafNode(otherlv_12, grammarAccess.getDisclosureAccess().getRefersToRecipientSourceKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2020:1: ( ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) ) | ( (lv_refRSAll_14_0= 'All' ) ) )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==47) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2020:2: ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2020:2: ( (lv_refRecipientSource_13_0= ruleRefRecipientSource ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2021:1: (lv_refRecipientSource_13_0= ruleRefRecipientSource )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2021:1: (lv_refRecipientSource_13_0= ruleRefRecipientSource )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2022:3: lv_refRecipientSource_13_0= ruleRefRecipientSource
                            {
                             
                            	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefRecipientSourceRefRecipientSourceParserRuleCall_9_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefRecipientSource_in_ruleDisclosure4134);
                            lv_refRecipientSource_13_0=ruleRefRecipientSource();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refRecipientSource",
                                    		lv_refRecipientSource_13_0, 
                                    		"RefRecipientSource");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2039:6: ( (lv_refRSAll_14_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2039:6: ( (lv_refRSAll_14_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2040:1: (lv_refRSAll_14_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2040:1: (lv_refRSAll_14_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2041:3: lv_refRSAll_14_0= 'All'
                            {
                            lv_refRSAll_14_0=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure4158); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2054:5: (otherlv_15= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) ) | ( (lv_refRTAll_17_0= 'All' ) ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==76) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2054:7: otherlv_15= 'RefersTo Recipient-Target' ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) ) | ( (lv_refRTAll_17_0= 'All' ) ) )
                    {
                    otherlv_15=(Token)match(input,76,FOLLOW_76_in_ruleDisclosure4187); 

                        	newLeafNode(otherlv_15, grammarAccess.getDisclosureAccess().getRefersToRecipientTargetKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2058:1: ( ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) ) | ( (lv_refRTAll_17_0= 'All' ) ) )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==47) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2058:2: ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2058:2: ( (lv_refRecipientTarget_16_0= ruleRefRecipientTarget ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2059:1: (lv_refRecipientTarget_16_0= ruleRefRecipientTarget )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2059:1: (lv_refRecipientTarget_16_0= ruleRefRecipientTarget )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2060:3: lv_refRecipientTarget_16_0= ruleRefRecipientTarget
                            {
                             
                            	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefRecipientTargetRefRecipientTargetParserRuleCall_10_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefRecipientTarget_in_ruleDisclosure4209);
                            lv_refRecipientTarget_16_0=ruleRefRecipientTarget();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refRecipientTarget",
                                    		lv_refRecipientTarget_16_0, 
                                    		"RefRecipientTarget");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2077:6: ( (lv_refRTAll_17_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2077:6: ( (lv_refRTAll_17_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2078:1: (lv_refRTAll_17_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2078:1: (lv_refRTAll_17_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2079:3: lv_refRTAll_17_0= 'All'
                            {
                            lv_refRTAll_17_0=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure4233); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2092:5: (otherlv_18= 'RefersTo PrivateData' ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_20_0= 'All' ) ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2092:7: otherlv_18= 'RefersTo PrivateData' ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_20_0= 'All' ) ) )
                    {
                    otherlv_18=(Token)match(input,46,FOLLOW_46_in_ruleDisclosure4262); 

                        	newLeafNode(otherlv_18, grammarAccess.getDisclosureAccess().getRefersToPrivateDataKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2096:1: ( ( (lv_refPrivateData_19_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_20_0= 'All' ) ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_ID) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==47) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2096:2: ( (lv_refPrivateData_19_0= ruleRefPrivateData ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2096:2: ( (lv_refPrivateData_19_0= ruleRefPrivateData ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2097:1: (lv_refPrivateData_19_0= ruleRefPrivateData )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2097:1: (lv_refPrivateData_19_0= ruleRefPrivateData )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2098:3: lv_refPrivateData_19_0= ruleRefPrivateData
                            {
                             
                            	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefPrivateDataRefPrivateDataParserRuleCall_11_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefPrivateData_in_ruleDisclosure4284);
                            lv_refPrivateData_19_0=ruleRefPrivateData();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refPrivateData",
                                    		lv_refPrivateData_19_0, 
                                    		"RefPrivateData");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2115:6: ( (lv_refPDAll_20_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2115:6: ( (lv_refPDAll_20_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2116:1: (lv_refPDAll_20_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2116:1: (lv_refPDAll_20_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2117:3: lv_refPDAll_20_0= 'All'
                            {
                            lv_refPDAll_20_0=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure4308); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2130:5: (otherlv_21= 'RefersTo Service' ( ( (lv_refService_22_0= ruleRefService ) ) | ( (lv_refSAll_23_0= 'All' ) ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==66) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2130:7: otherlv_21= 'RefersTo Service' ( ( (lv_refService_22_0= ruleRefService ) ) | ( (lv_refSAll_23_0= 'All' ) ) )
                    {
                    otherlv_21=(Token)match(input,66,FOLLOW_66_in_ruleDisclosure4337); 

                        	newLeafNode(otherlv_21, grammarAccess.getDisclosureAccess().getRefersToServiceKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2134:1: ( ( (lv_refService_22_0= ruleRefService ) ) | ( (lv_refSAll_23_0= 'All' ) ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_ID) ) {
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2134:2: ( (lv_refService_22_0= ruleRefService ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2134:2: ( (lv_refService_22_0= ruleRefService ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2135:1: (lv_refService_22_0= ruleRefService )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2135:1: (lv_refService_22_0= ruleRefService )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2136:3: lv_refService_22_0= ruleRefService
                            {
                             
                            	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefServiceRefServiceParserRuleCall_12_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefService_in_ruleDisclosure4359);
                            lv_refService_22_0=ruleRefService();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refService",
                                    		lv_refService_22_0, 
                                    		"RefService");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2153:6: ( (lv_refSAll_23_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2153:6: ( (lv_refSAll_23_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2154:1: (lv_refSAll_23_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2154:1: (lv_refSAll_23_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2155:3: lv_refSAll_23_0= 'All'
                            {
                            lv_refSAll_23_0=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure4383); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2168:5: (otherlv_24= 'RefersTo Enforcement' ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) ) | ( (lv_refEAll_26_0= 'All' ) ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==67) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2168:7: otherlv_24= 'RefersTo Enforcement' ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) ) | ( (lv_refEAll_26_0= 'All' ) ) )
                    {
                    otherlv_24=(Token)match(input,67,FOLLOW_67_in_ruleDisclosure4412); 

                        	newLeafNode(otherlv_24, grammarAccess.getDisclosureAccess().getRefersToEnforcementKeyword_13_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2172:1: ( ( (lv_refEnforcement_25_0= ruleRefEnforcement ) ) | ( (lv_refEAll_26_0= 'All' ) ) )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==47) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2172:2: ( (lv_refEnforcement_25_0= ruleRefEnforcement ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2172:2: ( (lv_refEnforcement_25_0= ruleRefEnforcement ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2173:1: (lv_refEnforcement_25_0= ruleRefEnforcement )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2173:1: (lv_refEnforcement_25_0= ruleRefEnforcement )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2174:3: lv_refEnforcement_25_0= ruleRefEnforcement
                            {
                             
                            	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefEnforcementRefEnforcementParserRuleCall_13_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefEnforcement_in_ruleDisclosure4434);
                            lv_refEnforcement_25_0=ruleRefEnforcement();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refEnforcement",
                                    		lv_refEnforcement_25_0, 
                                    		"RefEnforcement");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2191:6: ( (lv_refEAll_26_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2191:6: ( (lv_refEAll_26_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2192:1: (lv_refEAll_26_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2192:1: (lv_refEAll_26_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2193:3: lv_refEAll_26_0= 'All'
                            {
                            lv_refEAll_26_0=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure4458); 

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

            otherlv_27=(Token)match(input,68,FOLLOW_68_in_ruleDisclosure4486); 

                	newLeafNode(otherlv_27, grammarAccess.getDisclosureAccess().getModalityKeyword_14());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2210:1: ( ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2211:1: ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2211:1: ( (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2212:1: (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2212:1: (lv_modality_28_1= 'Permitted' | lv_modality_28_2= 'Obligation' | lv_modality_28_3= 'Forbidden' )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt49=1;
                }
                break;
            case 70:
                {
                alt49=2;
                }
                break;
            case 71:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2213:3: lv_modality_28_1= 'Permitted'
                    {
                    lv_modality_28_1=(Token)match(input,69,FOLLOW_69_in_ruleDisclosure4506); 

                            newLeafNode(lv_modality_28_1, grammarAccess.getDisclosureAccess().getModalityPermittedKeyword_15_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_28_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2225:8: lv_modality_28_2= 'Obligation'
                    {
                    lv_modality_28_2=(Token)match(input,70,FOLLOW_70_in_ruleDisclosure4535); 

                            newLeafNode(lv_modality_28_2, grammarAccess.getDisclosureAccess().getModalityObligationKeyword_15_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_28_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2237:8: lv_modality_28_3= 'Forbidden'
                    {
                    lv_modality_28_3=(Token)match(input,71,FOLLOW_71_in_ruleDisclosure4564); 

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

            otherlv_29=(Token)match(input,13,FOLLOW_13_in_ruleDisclosure4592); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2264:1: entryRuleRetention returns [EObject current=null] : iv_ruleRetention= ruleRetention EOF ;
    public final EObject entryRuleRetention() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetention = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2265:2: (iv_ruleRetention= ruleRetention EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2266:2: iv_ruleRetention= ruleRetention EOF
            {
             newCompositeNode(grammarAccess.getRetentionRule()); 
            pushFollow(FOLLOW_ruleRetention_in_entryRuleRetention4628);
            iv_ruleRetention=ruleRetention();

            state._fsp--;

             current =iv_ruleRetention; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRetention4638); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2273:1: ruleRetention returns [EObject current=null] : (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Retention' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Period' ( (lv_period_10_0= RULE_STRING ) ) (otherlv_11= 'RefersTo PrivateData' ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_13_0= 'All' ) ) ) )? (otherlv_14= 'RefersTo Service' ( ( (lv_refService_15_0= ruleRefService ) ) | ( (lv_refSAll_16_0= 'All' ) ) ) )? (otherlv_17= 'RefersTo Enforcement' ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) ) | ( (lv_refEAll_19_0= 'All' ) ) ) )? otherlv_20= 'Modality' ( ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) ) ) otherlv_22= '}' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2276:28: ( (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Retention' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Period' ( (lv_period_10_0= RULE_STRING ) ) (otherlv_11= 'RefersTo PrivateData' ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_13_0= 'All' ) ) ) )? (otherlv_14= 'RefersTo Service' ( ( (lv_refService_15_0= ruleRefService ) ) | ( (lv_refSAll_16_0= 'All' ) ) ) )? (otherlv_17= 'RefersTo Enforcement' ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) ) | ( (lv_refEAll_19_0= 'All' ) ) ) )? otherlv_20= 'Modality' ( ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) ) ) otherlv_22= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2277:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Retention' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Period' ( (lv_period_10_0= RULE_STRING ) ) (otherlv_11= 'RefersTo PrivateData' ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_13_0= 'All' ) ) ) )? (otherlv_14= 'RefersTo Service' ( ( (lv_refService_15_0= ruleRefService ) ) | ( (lv_refSAll_16_0= 'All' ) ) ) )? (otherlv_17= 'RefersTo Enforcement' ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) ) | ( (lv_refEAll_19_0= 'All' ) ) ) )? otherlv_20= 'Modality' ( ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) ) ) otherlv_22= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2277:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Retention' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Period' ( (lv_period_10_0= RULE_STRING ) ) (otherlv_11= 'RefersTo PrivateData' ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_13_0= 'All' ) ) ) )? (otherlv_14= 'RefersTo Service' ( ( (lv_refService_15_0= ruleRefService ) ) | ( (lv_refSAll_16_0= 'All' ) ) ) )? (otherlv_17= 'RefersTo Enforcement' ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) ) | ( (lv_refEAll_19_0= 'All' ) ) ) )? otherlv_20= 'Modality' ( ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) ) ) otherlv_22= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2277:3: otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Retention' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= 'Period' ( (lv_period_10_0= RULE_STRING ) ) (otherlv_11= 'RefersTo PrivateData' ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_13_0= 'All' ) ) ) )? (otherlv_14= 'RefersTo Service' ( ( (lv_refService_15_0= ruleRefService ) ) | ( (lv_refSAll_16_0= 'All' ) ) ) )? (otherlv_17= 'RefersTo Enforcement' ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) ) | ( (lv_refEAll_19_0= 'All' ) ) ) )? otherlv_20= 'Modality' ( ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) ) ) otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleRetention4675); 

                	newLeafNode(otherlv_0, grammarAccess.getRetentionAccess().getRetentionKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2281:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2282:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2282:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2283:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRetention4692); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRetention4709); 

                	newLeafNode(otherlv_2, grammarAccess.getRetentionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleRetention4721); 

                	newLeafNode(otherlv_3, grammarAccess.getRetentionAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2307:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2308:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2308:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2309:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention4738); 

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

            otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleRetention4755); 

                	newLeafNode(otherlv_5, grammarAccess.getRetentionAccess().getConditionKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2329:1: ( (lv_condition_6_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2330:1: (lv_condition_6_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2330:1: (lv_condition_6_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2331:3: lv_condition_6_0= RULE_STRING
            {
            lv_condition_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention4772); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2347:2: (otherlv_7= 'PartOf Retention' ( (otherlv_8= RULE_ID ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==78) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2347:4: otherlv_7= 'PartOf Retention' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,78,FOLLOW_78_in_ruleRetention4790); 

                        	newLeafNode(otherlv_7, grammarAccess.getRetentionAccess().getPartOfRetentionKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2351:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2352:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2352:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2353:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRetention4810); 

                    		newLeafNode(otherlv_8, grammarAccess.getRetentionAccess().getPartRetentionRetentionCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,79,FOLLOW_79_in_ruleRetention4824); 

                	newLeafNode(otherlv_9, grammarAccess.getRetentionAccess().getPeriodKeyword_8());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2368:1: ( (lv_period_10_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2369:1: (lv_period_10_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2369:1: (lv_period_10_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2370:3: lv_period_10_0= RULE_STRING
            {
            lv_period_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention4841); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2386:2: (otherlv_11= 'RefersTo PrivateData' ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_13_0= 'All' ) ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==46) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2386:4: otherlv_11= 'RefersTo PrivateData' ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_13_0= 'All' ) ) )
                    {
                    otherlv_11=(Token)match(input,46,FOLLOW_46_in_ruleRetention4859); 

                        	newLeafNode(otherlv_11, grammarAccess.getRetentionAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2390:1: ( ( (lv_refPrivateData_12_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_13_0= 'All' ) ) )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==RULE_ID) ) {
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
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2390:2: ( (lv_refPrivateData_12_0= ruleRefPrivateData ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2390:2: ( (lv_refPrivateData_12_0= ruleRefPrivateData ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2391:1: (lv_refPrivateData_12_0= ruleRefPrivateData )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2391:1: (lv_refPrivateData_12_0= ruleRefPrivateData )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2392:3: lv_refPrivateData_12_0= ruleRefPrivateData
                            {
                             
                            	        newCompositeNode(grammarAccess.getRetentionAccess().getRefPrivateDataRefPrivateDataParserRuleCall_10_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefPrivateData_in_ruleRetention4881);
                            lv_refPrivateData_12_0=ruleRefPrivateData();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refPrivateData",
                                    		lv_refPrivateData_12_0, 
                                    		"RefPrivateData");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2409:6: ( (lv_refPDAll_13_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2409:6: ( (lv_refPDAll_13_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2410:1: (lv_refPDAll_13_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2410:1: (lv_refPDAll_13_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2411:3: lv_refPDAll_13_0= 'All'
                            {
                            lv_refPDAll_13_0=(Token)match(input,47,FOLLOW_47_in_ruleRetention4905); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2424:5: (otherlv_14= 'RefersTo Service' ( ( (lv_refService_15_0= ruleRefService ) ) | ( (lv_refSAll_16_0= 'All' ) ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==66) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2424:7: otherlv_14= 'RefersTo Service' ( ( (lv_refService_15_0= ruleRefService ) ) | ( (lv_refSAll_16_0= 'All' ) ) )
                    {
                    otherlv_14=(Token)match(input,66,FOLLOW_66_in_ruleRetention4934); 

                        	newLeafNode(otherlv_14, grammarAccess.getRetentionAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2428:1: ( ( (lv_refService_15_0= ruleRefService ) ) | ( (lv_refSAll_16_0= 'All' ) ) )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==RULE_ID) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==47) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2428:2: ( (lv_refService_15_0= ruleRefService ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2428:2: ( (lv_refService_15_0= ruleRefService ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2429:1: (lv_refService_15_0= ruleRefService )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2429:1: (lv_refService_15_0= ruleRefService )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2430:3: lv_refService_15_0= ruleRefService
                            {
                             
                            	        newCompositeNode(grammarAccess.getRetentionAccess().getRefServiceRefServiceParserRuleCall_11_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefService_in_ruleRetention4956);
                            lv_refService_15_0=ruleRefService();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refService",
                                    		lv_refService_15_0, 
                                    		"RefService");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2447:6: ( (lv_refSAll_16_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2447:6: ( (lv_refSAll_16_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2448:1: (lv_refSAll_16_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2448:1: (lv_refSAll_16_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2449:3: lv_refSAll_16_0= 'All'
                            {
                            lv_refSAll_16_0=(Token)match(input,47,FOLLOW_47_in_ruleRetention4980); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2462:5: (otherlv_17= 'RefersTo Enforcement' ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) ) | ( (lv_refEAll_19_0= 'All' ) ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==67) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2462:7: otherlv_17= 'RefersTo Enforcement' ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) ) | ( (lv_refEAll_19_0= 'All' ) ) )
                    {
                    otherlv_17=(Token)match(input,67,FOLLOW_67_in_ruleRetention5009); 

                        	newLeafNode(otherlv_17, grammarAccess.getRetentionAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2466:1: ( ( (lv_refEnforcement_18_0= ruleRefEnforcement ) ) | ( (lv_refEAll_19_0= 'All' ) ) )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_ID) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==47) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2466:2: ( (lv_refEnforcement_18_0= ruleRefEnforcement ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2466:2: ( (lv_refEnforcement_18_0= ruleRefEnforcement ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2467:1: (lv_refEnforcement_18_0= ruleRefEnforcement )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2467:1: (lv_refEnforcement_18_0= ruleRefEnforcement )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2468:3: lv_refEnforcement_18_0= ruleRefEnforcement
                            {
                             
                            	        newCompositeNode(grammarAccess.getRetentionAccess().getRefEnforcementRefEnforcementParserRuleCall_12_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefEnforcement_in_ruleRetention5031);
                            lv_refEnforcement_18_0=ruleRefEnforcement();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refEnforcement",
                                    		lv_refEnforcement_18_0, 
                                    		"RefEnforcement");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2485:6: ( (lv_refEAll_19_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2485:6: ( (lv_refEAll_19_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2486:1: (lv_refEAll_19_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2486:1: (lv_refEAll_19_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2487:3: lv_refEAll_19_0= 'All'
                            {
                            lv_refEAll_19_0=(Token)match(input,47,FOLLOW_47_in_ruleRetention5055); 

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

            otherlv_20=(Token)match(input,68,FOLLOW_68_in_ruleRetention5083); 

                	newLeafNode(otherlv_20, grammarAccess.getRetentionAccess().getModalityKeyword_13());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2504:1: ( ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2505:1: ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2505:1: ( (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2506:1: (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2506:1: (lv_modality_21_1= 'Permitted' | lv_modality_21_2= 'Obligation' | lv_modality_21_3= 'Forbidden' )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt57=1;
                }
                break;
            case 70:
                {
                alt57=2;
                }
                break;
            case 71:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2507:3: lv_modality_21_1= 'Permitted'
                    {
                    lv_modality_21_1=(Token)match(input,69,FOLLOW_69_in_ruleRetention5103); 

                            newLeafNode(lv_modality_21_1, grammarAccess.getRetentionAccess().getModalityPermittedKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_21_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2519:8: lv_modality_21_2= 'Obligation'
                    {
                    lv_modality_21_2=(Token)match(input,70,FOLLOW_70_in_ruleRetention5132); 

                            newLeafNode(lv_modality_21_2, grammarAccess.getRetentionAccess().getModalityObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_21_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2531:8: lv_modality_21_3= 'Forbidden'
                    {
                    lv_modality_21_3=(Token)match(input,71,FOLLOW_71_in_ruleRetention5161); 

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

            otherlv_22=(Token)match(input,13,FOLLOW_13_in_ruleRetention5189); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2558:1: entryRuleUsage returns [EObject current=null] : iv_ruleUsage= ruleUsage EOF ;
    public final EObject entryRuleUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsage = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2559:2: (iv_ruleUsage= ruleUsage EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2560:2: iv_ruleUsage= ruleUsage EOF
            {
             newCompositeNode(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage5225);
            iv_ruleUsage=ruleUsage();

            state._fsp--;

             current =iv_ruleUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage5235); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2567:1: ruleUsage returns [EObject current=null] : (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Usage' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2570:28: ( (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Usage' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2571:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Usage' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2571:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Usage' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2571:3: otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Usage' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleUsage5272); 

                	newLeafNode(otherlv_0, grammarAccess.getUsageAccess().getUsageKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2575:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2576:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2576:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2577:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage5289); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUsage5306); 

                	newLeafNode(otherlv_2, grammarAccess.getUsageAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleUsage5318); 

                	newLeafNode(otherlv_3, grammarAccess.getUsageAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2601:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2602:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2602:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2603:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage5335); 

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

            otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleUsage5352); 

                	newLeafNode(otherlv_5, grammarAccess.getUsageAccess().getConditionKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2623:1: ( (lv_condition_6_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2624:1: (lv_condition_6_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2624:1: (lv_condition_6_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2625:3: lv_condition_6_0= RULE_STRING
            {
            lv_condition_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage5369); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2641:2: (otherlv_7= 'PartOf Usage' ( (otherlv_8= RULE_ID ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==81) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2641:4: otherlv_7= 'PartOf Usage' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,81,FOLLOW_81_in_ruleUsage5387); 

                        	newLeafNode(otherlv_7, grammarAccess.getUsageAccess().getPartOfUsageKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2645:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2646:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2646:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2647:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage5407); 

                    		newLeafNode(otherlv_8, grammarAccess.getUsageAccess().getPartUsageUsageCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2658:4: (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==46) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2658:6: otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) )
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleUsage5422); 

                        	newLeafNode(otherlv_9, grammarAccess.getUsageAccess().getRefersToPrivateDataKeyword_8_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2662:1: ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==RULE_ID) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==47) ) {
                        alt59=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2662:2: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2662:2: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2663:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2663:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2664:3: lv_refPrivateData_10_0= ruleRefPrivateData
                            {
                             
                            	        newCompositeNode(grammarAccess.getUsageAccess().getRefPrivateDataRefPrivateDataParserRuleCall_8_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefPrivateData_in_ruleUsage5444);
                            lv_refPrivateData_10_0=ruleRefPrivateData();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getUsageRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refPrivateData",
                                    		lv_refPrivateData_10_0, 
                                    		"RefPrivateData");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2681:6: ( (lv_refPDAll_11_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2681:6: ( (lv_refPDAll_11_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2682:1: (lv_refPDAll_11_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2682:1: (lv_refPDAll_11_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2683:3: lv_refPDAll_11_0= 'All'
                            {
                            lv_refPDAll_11_0=(Token)match(input,47,FOLLOW_47_in_ruleUsage5468); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2696:5: (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==66) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2696:7: otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) )
                    {
                    otherlv_12=(Token)match(input,66,FOLLOW_66_in_ruleUsage5497); 

                        	newLeafNode(otherlv_12, grammarAccess.getUsageAccess().getRefersToServiceKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2700:1: ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_ID) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==47) ) {
                        alt61=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2700:2: ( (lv_refService_13_0= ruleRefService ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2700:2: ( (lv_refService_13_0= ruleRefService ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2701:1: (lv_refService_13_0= ruleRefService )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2701:1: (lv_refService_13_0= ruleRefService )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2702:3: lv_refService_13_0= ruleRefService
                            {
                             
                            	        newCompositeNode(grammarAccess.getUsageAccess().getRefServiceRefServiceParserRuleCall_9_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefService_in_ruleUsage5519);
                            lv_refService_13_0=ruleRefService();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getUsageRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refService",
                                    		lv_refService_13_0, 
                                    		"RefService");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2719:6: ( (lv_refSAll_14_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2719:6: ( (lv_refSAll_14_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2720:1: (lv_refSAll_14_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2720:1: (lv_refSAll_14_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2721:3: lv_refSAll_14_0= 'All'
                            {
                            lv_refSAll_14_0=(Token)match(input,47,FOLLOW_47_in_ruleUsage5543); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2734:5: (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==67) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2734:7: otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) )
                    {
                    otherlv_15=(Token)match(input,67,FOLLOW_67_in_ruleUsage5572); 

                        	newLeafNode(otherlv_15, grammarAccess.getUsageAccess().getRefersToEnforcementKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2738:1: ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_ID) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==47) ) {
                        alt63=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2738:2: ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2738:2: ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2739:1: (lv_refEnforcement_16_0= ruleRefEnforcement )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2739:1: (lv_refEnforcement_16_0= ruleRefEnforcement )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2740:3: lv_refEnforcement_16_0= ruleRefEnforcement
                            {
                             
                            	        newCompositeNode(grammarAccess.getUsageAccess().getRefEnforcementRefEnforcementParserRuleCall_10_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefEnforcement_in_ruleUsage5594);
                            lv_refEnforcement_16_0=ruleRefEnforcement();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getUsageRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refEnforcement",
                                    		lv_refEnforcement_16_0, 
                                    		"RefEnforcement");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2757:6: ( (lv_refEAll_17_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2757:6: ( (lv_refEAll_17_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2758:1: (lv_refEAll_17_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2758:1: (lv_refEAll_17_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2759:3: lv_refEAll_17_0= 'All'
                            {
                            lv_refEAll_17_0=(Token)match(input,47,FOLLOW_47_in_ruleUsage5618); 

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

            otherlv_18=(Token)match(input,68,FOLLOW_68_in_ruleUsage5646); 

                	newLeafNode(otherlv_18, grammarAccess.getUsageAccess().getModalityKeyword_11());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2776:1: ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2777:1: ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2777:1: ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2778:1: (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2778:1: (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt65=1;
                }
                break;
            case 70:
                {
                alt65=2;
                }
                break;
            case 71:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2779:3: lv_modality_19_1= 'Permitted'
                    {
                    lv_modality_19_1=(Token)match(input,69,FOLLOW_69_in_ruleUsage5666); 

                            newLeafNode(lv_modality_19_1, grammarAccess.getUsageAccess().getModalityPermittedKeyword_12_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_19_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2791:8: lv_modality_19_2= 'Obligation'
                    {
                    lv_modality_19_2=(Token)match(input,70,FOLLOW_70_in_ruleUsage5695); 

                            newLeafNode(lv_modality_19_2, grammarAccess.getUsageAccess().getModalityObligationKeyword_12_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_19_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2803:8: lv_modality_19_3= 'Forbidden'
                    {
                    lv_modality_19_3=(Token)match(input,71,FOLLOW_71_in_ruleUsage5724); 

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

            otherlv_20=(Token)match(input,13,FOLLOW_13_in_ruleUsage5752); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2830:1: entryRuleInformative returns [EObject current=null] : iv_ruleInformative= ruleInformative EOF ;
    public final EObject entryRuleInformative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformative = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2831:2: (iv_ruleInformative= ruleInformative EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2832:2: iv_ruleInformative= ruleInformative EOF
            {
             newCompositeNode(grammarAccess.getInformativeRule()); 
            pushFollow(FOLLOW_ruleInformative_in_entryRuleInformative5788);
            iv_ruleInformative=ruleInformative();

            state._fsp--;

             current =iv_ruleInformative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInformative5798); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2839:1: ruleInformative returns [EObject current=null] : (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Informative' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' ) ;
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
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2842:28: ( (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Informative' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2843:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Informative' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2843:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Informative' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}' )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2843:3: otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'Condition' ( (lv_condition_6_0= RULE_STRING ) ) (otherlv_7= 'PartOf Informative' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )? (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )? (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )? otherlv_18= 'Modality' ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleInformative5835); 

                	newLeafNode(otherlv_0, grammarAccess.getInformativeAccess().getInformativeKeyword_0());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2847:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2848:1: (lv_name_1_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2848:1: (lv_name_1_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2849:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformative5852); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInformative5869); 

                	newLeafNode(otherlv_2, grammarAccess.getInformativeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleInformative5881); 

                	newLeafNode(otherlv_3, grammarAccess.getInformativeAccess().getDescriptionKeyword_3());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2873:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2874:1: (lv_description_4_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2874:1: (lv_description_4_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2875:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative5898); 

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

            otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleInformative5915); 

                	newLeafNode(otherlv_5, grammarAccess.getInformativeAccess().getConditionKeyword_5());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2895:1: ( (lv_condition_6_0= RULE_STRING ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2896:1: (lv_condition_6_0= RULE_STRING )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2896:1: (lv_condition_6_0= RULE_STRING )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2897:3: lv_condition_6_0= RULE_STRING
            {
            lv_condition_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative5932); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2913:2: (otherlv_7= 'PartOf Informative' ( (otherlv_8= RULE_ID ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==83) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2913:4: otherlv_7= 'PartOf Informative' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,83,FOLLOW_83_in_ruleInformative5950); 

                        	newLeafNode(otherlv_7, grammarAccess.getInformativeAccess().getPartOfInformativeKeyword_7_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2917:1: ( (otherlv_8= RULE_ID ) )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2918:1: (otherlv_8= RULE_ID )
                    {
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2918:1: (otherlv_8= RULE_ID )
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2919:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformative5970); 

                    		newLeafNode(otherlv_8, grammarAccess.getInformativeAccess().getPartInformativeInformativeCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2930:4: (otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==46) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2930:6: otherlv_9= 'RefersTo PrivateData' ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) )
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleInformative5985); 

                        	newLeafNode(otherlv_9, grammarAccess.getInformativeAccess().getRefersToPrivateDataKeyword_8_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2934:1: ( ( (lv_refPrivateData_10_0= ruleRefPrivateData ) ) | ( (lv_refPDAll_11_0= 'All' ) ) )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==RULE_ID) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==47) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2934:2: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2934:2: ( (lv_refPrivateData_10_0= ruleRefPrivateData ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2935:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2935:1: (lv_refPrivateData_10_0= ruleRefPrivateData )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2936:3: lv_refPrivateData_10_0= ruleRefPrivateData
                            {
                             
                            	        newCompositeNode(grammarAccess.getInformativeAccess().getRefPrivateDataRefPrivateDataParserRuleCall_8_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefPrivateData_in_ruleInformative6007);
                            lv_refPrivateData_10_0=ruleRefPrivateData();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refPrivateData",
                                    		lv_refPrivateData_10_0, 
                                    		"RefPrivateData");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2953:6: ( (lv_refPDAll_11_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2953:6: ( (lv_refPDAll_11_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2954:1: (lv_refPDAll_11_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2954:1: (lv_refPDAll_11_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2955:3: lv_refPDAll_11_0= 'All'
                            {
                            lv_refPDAll_11_0=(Token)match(input,47,FOLLOW_47_in_ruleInformative6031); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2968:5: (otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==66) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2968:7: otherlv_12= 'RefersTo Service' ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) )
                    {
                    otherlv_12=(Token)match(input,66,FOLLOW_66_in_ruleInformative6060); 

                        	newLeafNode(otherlv_12, grammarAccess.getInformativeAccess().getRefersToServiceKeyword_9_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2972:1: ( ( (lv_refService_13_0= ruleRefService ) ) | ( (lv_refSAll_14_0= 'All' ) ) )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_ID) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==47) ) {
                        alt69=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2972:2: ( (lv_refService_13_0= ruleRefService ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2972:2: ( (lv_refService_13_0= ruleRefService ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2973:1: (lv_refService_13_0= ruleRefService )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2973:1: (lv_refService_13_0= ruleRefService )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2974:3: lv_refService_13_0= ruleRefService
                            {
                             
                            	        newCompositeNode(grammarAccess.getInformativeAccess().getRefServiceRefServiceParserRuleCall_9_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefService_in_ruleInformative6082);
                            lv_refService_13_0=ruleRefService();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refService",
                                    		lv_refService_13_0, 
                                    		"RefService");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2991:6: ( (lv_refSAll_14_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2991:6: ( (lv_refSAll_14_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2992:1: (lv_refSAll_14_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2992:1: (lv_refSAll_14_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:2993:3: lv_refSAll_14_0= 'All'
                            {
                            lv_refSAll_14_0=(Token)match(input,47,FOLLOW_47_in_ruleInformative6106); 

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

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3006:5: (otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==67) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3006:7: otherlv_15= 'RefersTo Enforcement' ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) )
                    {
                    otherlv_15=(Token)match(input,67,FOLLOW_67_in_ruleInformative6135); 

                        	newLeafNode(otherlv_15, grammarAccess.getInformativeAccess().getRefersToEnforcementKeyword_10_0());
                        
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3010:1: ( ( (lv_refEnforcement_16_0= ruleRefEnforcement ) ) | ( (lv_refEAll_17_0= 'All' ) ) )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==RULE_ID) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==47) ) {
                        alt71=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3010:2: ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3010:2: ( (lv_refEnforcement_16_0= ruleRefEnforcement ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3011:1: (lv_refEnforcement_16_0= ruleRefEnforcement )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3011:1: (lv_refEnforcement_16_0= ruleRefEnforcement )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3012:3: lv_refEnforcement_16_0= ruleRefEnforcement
                            {
                             
                            	        newCompositeNode(grammarAccess.getInformativeAccess().getRefEnforcementRefEnforcementParserRuleCall_10_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRefEnforcement_in_ruleInformative6157);
                            lv_refEnforcement_16_0=ruleRefEnforcement();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"refEnforcement",
                                    		lv_refEnforcement_16_0, 
                                    		"RefEnforcement");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3029:6: ( (lv_refEAll_17_0= 'All' ) )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3029:6: ( (lv_refEAll_17_0= 'All' ) )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3030:1: (lv_refEAll_17_0= 'All' )
                            {
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3030:1: (lv_refEAll_17_0= 'All' )
                            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3031:3: lv_refEAll_17_0= 'All'
                            {
                            lv_refEAll_17_0=(Token)match(input,47,FOLLOW_47_in_ruleInformative6181); 

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

            otherlv_18=(Token)match(input,68,FOLLOW_68_in_ruleInformative6209); 

                	newLeafNode(otherlv_18, grammarAccess.getInformativeAccess().getModalityKeyword_11());
                
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3048:1: ( ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3049:1: ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3049:1: ( (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3050:1: (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3050:1: (lv_modality_19_1= 'Permitted' | lv_modality_19_2= 'Obligation' | lv_modality_19_3= 'Forbidden' )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt73=1;
                }
                break;
            case 70:
                {
                alt73=2;
                }
                break;
            case 71:
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
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3051:3: lv_modality_19_1= 'Permitted'
                    {
                    lv_modality_19_1=(Token)match(input,69,FOLLOW_69_in_ruleInformative6229); 

                            newLeafNode(lv_modality_19_1, grammarAccess.getInformativeAccess().getModalityPermittedKeyword_12_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_19_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3063:8: lv_modality_19_2= 'Obligation'
                    {
                    lv_modality_19_2=(Token)match(input,70,FOLLOW_70_in_ruleInformative6258); 

                            newLeafNode(lv_modality_19_2, grammarAccess.getInformativeAccess().getModalityObligationKeyword_12_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modality", lv_modality_19_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3075:8: lv_modality_19_3= 'Forbidden'
                    {
                    lv_modality_19_3=(Token)match(input,71,FOLLOW_71_in_ruleInformative6287); 

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

            otherlv_20=(Token)match(input,13,FOLLOW_13_in_ruleInformative6315); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3102:1: entryRuleRecipientPart returns [EObject current=null] : iv_ruleRecipientPart= ruleRecipientPart EOF ;
    public final EObject entryRuleRecipientPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipientPart = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3103:2: (iv_ruleRecipientPart= ruleRecipientPart EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3104:2: iv_ruleRecipientPart= ruleRecipientPart EOF
            {
             newCompositeNode(grammarAccess.getRecipientPartRule()); 
            pushFollow(FOLLOW_ruleRecipientPart_in_entryRuleRecipientPart6351);
            iv_ruleRecipientPart=ruleRecipientPart();

            state._fsp--;

             current =iv_ruleRecipientPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipientPart6361); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3111:1: ruleRecipientPart returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRecipientPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3114:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3115:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3115:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3115:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3115:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3116:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3116:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3117:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRecipientPartRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipientPart6406); 

            		newLeafNode(otherlv_0, grammarAccess.getRecipientPartAccess().getRecipientPartRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3128:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==62) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3128:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleRecipientPart6419); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRecipientPartAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3132:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3133:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3133:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3134:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRecipientPartRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipientPart6439); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRecipientPartAccess().getRefsRecipientCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
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
    // $ANTLR end "ruleRecipientPart"


    // $ANTLR start "entryRuleRefRecipient"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3153:1: entryRuleRefRecipient returns [EObject current=null] : iv_ruleRefRecipient= ruleRefRecipient EOF ;
    public final EObject entryRuleRefRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefRecipient = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3154:2: (iv_ruleRefRecipient= ruleRefRecipient EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3155:2: iv_ruleRefRecipient= ruleRefRecipient EOF
            {
             newCompositeNode(grammarAccess.getRefRecipientRule()); 
            pushFollow(FOLLOW_ruleRefRecipient_in_entryRuleRefRecipient6477);
            iv_ruleRefRecipient=ruleRefRecipient();

            state._fsp--;

             current =iv_ruleRefRecipient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefRecipient6487); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3162:1: ruleRefRecipient returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefRecipient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3165:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3166:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3166:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3166:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3166:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3167:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3167:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3168:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRecipientRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipient6532); 

            		newLeafNode(otherlv_0, grammarAccess.getRefRecipientAccess().getRefRecipientRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3179:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==62) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3179:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleRefRecipient6545); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefRecipientAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3183:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3184:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3184:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3185:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefRecipientRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipient6565); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefRecipientAccess().getRefsRecipientCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
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
    // $ANTLR end "ruleRefRecipient"


    // $ANTLR start "entryRuleRefRecipientSource"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3204:1: entryRuleRefRecipientSource returns [EObject current=null] : iv_ruleRefRecipientSource= ruleRefRecipientSource EOF ;
    public final EObject entryRuleRefRecipientSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefRecipientSource = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3205:2: (iv_ruleRefRecipientSource= ruleRefRecipientSource EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3206:2: iv_ruleRefRecipientSource= ruleRefRecipientSource EOF
            {
             newCompositeNode(grammarAccess.getRefRecipientSourceRule()); 
            pushFollow(FOLLOW_ruleRefRecipientSource_in_entryRuleRefRecipientSource6603);
            iv_ruleRefRecipientSource=ruleRefRecipientSource();

            state._fsp--;

             current =iv_ruleRefRecipientSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefRecipientSource6613); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3213:1: ruleRefRecipientSource returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefRecipientSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3216:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3217:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3217:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3217:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3217:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3218:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3218:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3219:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRecipientSourceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipientSource6658); 

            		newLeafNode(otherlv_0, grammarAccess.getRefRecipientSourceAccess().getRefRecipientSourceRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3230:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==62) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3230:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleRefRecipientSource6671); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefRecipientSourceAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3234:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3235:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3235:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3236:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefRecipientSourceRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipientSource6691); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefRecipientSourceAccess().getRefsRecipientCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
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
    // $ANTLR end "ruleRefRecipientSource"


    // $ANTLR start "entryRuleRefRecipientTarget"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3255:1: entryRuleRefRecipientTarget returns [EObject current=null] : iv_ruleRefRecipientTarget= ruleRefRecipientTarget EOF ;
    public final EObject entryRuleRefRecipientTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefRecipientTarget = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3256:2: (iv_ruleRefRecipientTarget= ruleRefRecipientTarget EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3257:2: iv_ruleRefRecipientTarget= ruleRefRecipientTarget EOF
            {
             newCompositeNode(grammarAccess.getRefRecipientTargetRule()); 
            pushFollow(FOLLOW_ruleRefRecipientTarget_in_entryRuleRefRecipientTarget6729);
            iv_ruleRefRecipientTarget=ruleRefRecipientTarget();

            state._fsp--;

             current =iv_ruleRefRecipientTarget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefRecipientTarget6739); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3264:1: ruleRefRecipientTarget returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefRecipientTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3267:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3268:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3268:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3268:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3268:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3269:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3269:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3270:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRecipientTargetRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipientTarget6784); 

            		newLeafNode(otherlv_0, grammarAccess.getRefRecipientTargetAccess().getRefRecipientTargetRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3281:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==62) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3281:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleRefRecipientTarget6797); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefRecipientTargetAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3285:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3286:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3286:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3287:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefRecipientTargetRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefRecipientTarget6817); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefRecipientTargetAccess().getRefsRecipientCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
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
    // $ANTLR end "ruleRefRecipientTarget"


    // $ANTLR start "entryRuleRefService"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3306:1: entryRuleRefService returns [EObject current=null] : iv_ruleRefService= ruleRefService EOF ;
    public final EObject entryRuleRefService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefService = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3307:2: (iv_ruleRefService= ruleRefService EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3308:2: iv_ruleRefService= ruleRefService EOF
            {
             newCompositeNode(grammarAccess.getRefServiceRule()); 
            pushFollow(FOLLOW_ruleRefService_in_entryRuleRefService6855);
            iv_ruleRefService=ruleRefService();

            state._fsp--;

             current =iv_ruleRefService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefService6865); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3315:1: ruleRefService returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3318:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3319:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3319:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3319:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3319:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3320:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3320:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3321:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefServiceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefService6910); 

            		newLeafNode(otherlv_0, grammarAccess.getRefServiceAccess().getRefServiceServiceCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3332:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==62) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3332:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleRefService6923); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefServiceAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3336:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3337:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3337:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3338:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefServiceRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefService6943); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefServiceAccess().getRefsServiceCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
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
    // $ANTLR end "ruleRefService"


    // $ANTLR start "entryRuleServicePart"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3357:1: entryRuleServicePart returns [EObject current=null] : iv_ruleServicePart= ruleServicePart EOF ;
    public final EObject entryRuleServicePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServicePart = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3358:2: (iv_ruleServicePart= ruleServicePart EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3359:2: iv_ruleServicePart= ruleServicePart EOF
            {
             newCompositeNode(grammarAccess.getServicePartRule()); 
            pushFollow(FOLLOW_ruleServicePart_in_entryRuleServicePart6981);
            iv_ruleServicePart=ruleServicePart();

            state._fsp--;

             current =iv_ruleServicePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServicePart6991); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3366:1: ruleServicePart returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleServicePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3369:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3370:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3370:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3370:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3370:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3371:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3371:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3372:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServicePartRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServicePart7036); 

            		newLeafNode(otherlv_0, grammarAccess.getServicePartAccess().getServicePartServiceCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3383:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==62) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3383:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleServicePart7049); 

            	        	newLeafNode(otherlv_1, grammarAccess.getServicePartAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3387:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3388:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3388:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3389:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getServicePartRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServicePart7069); 

            	    		newLeafNode(otherlv_2, grammarAccess.getServicePartAccess().getRefsServiceCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
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
    // $ANTLR end "ruleServicePart"


    // $ANTLR start "entryRuleRefPrivateData"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3408:1: entryRuleRefPrivateData returns [EObject current=null] : iv_ruleRefPrivateData= ruleRefPrivateData EOF ;
    public final EObject entryRuleRefPrivateData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPrivateData = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3409:2: (iv_ruleRefPrivateData= ruleRefPrivateData EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3410:2: iv_ruleRefPrivateData= ruleRefPrivateData EOF
            {
             newCompositeNode(grammarAccess.getRefPrivateDataRule()); 
            pushFollow(FOLLOW_ruleRefPrivateData_in_entryRuleRefPrivateData7107);
            iv_ruleRefPrivateData=ruleRefPrivateData();

            state._fsp--;

             current =iv_ruleRefPrivateData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefPrivateData7117); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3417:1: ruleRefPrivateData returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefPrivateData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3420:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3421:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3421:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3421:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3421:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3422:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3422:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3423:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefPrivateDataRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefPrivateData7162); 

            		newLeafNode(otherlv_0, grammarAccess.getRefPrivateDataAccess().getRefPrivateDataPrivateDataCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3434:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==62) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3434:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleRefPrivateData7175); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefPrivateDataAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3438:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3439:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3439:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3440:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefPrivateDataRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefPrivateData7195); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefPrivateDataAccess().getRefsPrivateDataCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
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
    // $ANTLR end "ruleRefPrivateData"


    // $ANTLR start "entryRuleRefEnforcement"
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3459:1: entryRuleRefEnforcement returns [EObject current=null] : iv_ruleRefEnforcement= ruleRefEnforcement EOF ;
    public final EObject entryRuleRefEnforcement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefEnforcement = null;


        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3460:2: (iv_ruleRefEnforcement= ruleRefEnforcement EOF )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3461:2: iv_ruleRefEnforcement= ruleRefEnforcement EOF
            {
             newCompositeNode(grammarAccess.getRefEnforcementRule()); 
            pushFollow(FOLLOW_ruleRefEnforcement_in_entryRuleRefEnforcement7233);
            iv_ruleRefEnforcement=ruleRefEnforcement();

            state._fsp--;

             current =iv_ruleRefEnforcement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefEnforcement7243); 

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
    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3468:1: ruleRefEnforcement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRefEnforcement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3471:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3472:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3472:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3472:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3472:2: ( (otherlv_0= RULE_ID ) )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3473:1: (otherlv_0= RULE_ID )
            {
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3473:1: (otherlv_0= RULE_ID )
            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3474:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefEnforcementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefEnforcement7288); 

            		newLeafNode(otherlv_0, grammarAccess.getRefEnforcementAccess().getRefEnforcementEnforcementCrossReference_0_0()); 
            	

            }


            }

            // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3485:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==62) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3485:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleRefEnforcement7301); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRefEnforcementAccess().getCommaKeyword_1_0());
            	        
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3489:1: ( (otherlv_2= RULE_ID ) )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3490:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3490:1: (otherlv_2= RULE_ID )
            	    // ../rslingo.rslil4privacy/src-gen/rslingo/rslil4privacy/parser/antlr/internal/InternalRSLIL4Privacy.g:3491:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRefEnforcementRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefEnforcement7321); 

            	    		newLeafNode(otherlv_2, grammarAccess.getRefEnforcementAccess().getRefsEnforcementCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
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
    public static final BitSet FOLLOW_46_in_ruleService2210 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleService2232 = new BitSet(new long[]{0x0001000000002000L});
    public static final BitSet FOLLOW_47_in_ruleService2256 = new BitSet(new long[]{0x0001000000002000L});
    public static final BitSet FOLLOW_48_in_ruleService2285 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleServicePart_in_ruleService2306 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleService2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipient_in_entryRuleRecipient2357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipient2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRecipient2404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipient2421 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRecipient2438 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRecipient2450 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecipient2467 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecipient2484 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecipient2501 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_50_in_ruleRecipient2519 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_ruleRecipientPart_in_ruleRecipient2540 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_51_in_ruleRecipient2555 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_52_in_ruleRecipient2575 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_53_in_ruleRecipient2604 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_54_in_ruleRecipient2633 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleRecipient2661 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_55_in_ruleRecipient2681 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_56_in_ruleRecipient2710 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_57_in_ruleRecipient2739 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecipient2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrivateData_in_entryRulePrivateData2803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrivateData2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePrivateData2850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrivateData2867 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePrivateData2884 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulePrivateData2896 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrivateData2913 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrivateData2930 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrivateData2947 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePrivateData2964 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_59_in_rulePrivateData2984 = new BitSet(new long[]{0x2000000000002000L});
    public static final BitSet FOLLOW_60_in_rulePrivateData3013 = new BitSet(new long[]{0x2000000000002000L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePrivateData3050 = new BitSet(new long[]{0x2000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePrivateData3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute3099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleAttribute3146 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute3163 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute3180 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAttribute3192 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute3209 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAttribute3226 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleAttribute3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection3277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCollection3324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollection3341 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollection3358 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection3370 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection3387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleCollection3404 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection3421 = new BitSet(new long[]{0x0000400000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_65_in_ruleCollection3439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollection3459 = new BitSet(new long[]{0x0000400000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_46_in_ruleCollection3474 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleCollection3496 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_47_in_ruleCollection3520 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_66_in_ruleCollection3549 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleCollection3571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_47_in_ruleCollection3595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleCollection3624 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleCollection3646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_47_in_ruleCollection3670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleCollection3698 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_69_in_ruleCollection3718 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70_in_ruleCollection3747 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71_in_ruleCollection3776 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCollection3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisclosure_in_entryRuleDisclosure3840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisclosure3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDisclosure3887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisclosure3904 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDisclosure3921 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3933 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure3950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleDisclosure3967 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure3984 = new BitSet(new long[]{0x0000400000000000L,0x0000000000001E1CL});
    public static final BitSet FOLLOW_73_in_ruleDisclosure4002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisclosure4022 = new BitSet(new long[]{0x0000400000000000L,0x0000000000001C1CL});
    public static final BitSet FOLLOW_74_in_ruleDisclosure4037 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefRecipient_in_ruleDisclosure4059 = new BitSet(new long[]{0x0000400000000000L,0x000000000000181CL});
    public static final BitSet FOLLOW_47_in_ruleDisclosure4083 = new BitSet(new long[]{0x0000400000000000L,0x000000000000181CL});
    public static final BitSet FOLLOW_75_in_ruleDisclosure4112 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefRecipientSource_in_ruleDisclosure4134 = new BitSet(new long[]{0x0000400000000000L,0x000000000000101CL});
    public static final BitSet FOLLOW_47_in_ruleDisclosure4158 = new BitSet(new long[]{0x0000400000000000L,0x000000000000101CL});
    public static final BitSet FOLLOW_76_in_ruleDisclosure4187 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefRecipientTarget_in_ruleDisclosure4209 = new BitSet(new long[]{0x0000400000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_47_in_ruleDisclosure4233 = new BitSet(new long[]{0x0000400000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_46_in_ruleDisclosure4262 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleDisclosure4284 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_47_in_ruleDisclosure4308 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_66_in_ruleDisclosure4337 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleDisclosure4359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_47_in_ruleDisclosure4383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleDisclosure4412 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleDisclosure4434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_47_in_ruleDisclosure4458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleDisclosure4486 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_69_in_ruleDisclosure4506 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70_in_ruleDisclosure4535 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71_in_ruleDisclosure4564 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDisclosure4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRetention_in_entryRuleRetention4628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRetention4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleRetention4675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRetention4692 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRetention4709 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention4721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention4738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleRetention4755 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention4772 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleRetention4790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRetention4810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleRetention4824 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention4841 = new BitSet(new long[]{0x0000400000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_46_in_ruleRetention4859 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleRetention4881 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_47_in_ruleRetention4905 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_66_in_ruleRetention4934 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleRetention4956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_47_in_ruleRetention4980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleRetention5009 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleRetention5031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_47_in_ruleRetention5055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleRetention5083 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_69_in_ruleRetention5103 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70_in_ruleRetention5132 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71_in_ruleRetention5161 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRetention5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage5225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleUsage5272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage5289 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUsage5306 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage5318 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage5335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleUsage5352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage5369 = new BitSet(new long[]{0x0000400000000000L,0x000000000002001CL});
    public static final BitSet FOLLOW_81_in_ruleUsage5387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage5407 = new BitSet(new long[]{0x0000400000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_46_in_ruleUsage5422 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleUsage5444 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_47_in_ruleUsage5468 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_66_in_ruleUsage5497 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleUsage5519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_47_in_ruleUsage5543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleUsage5572 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleUsage5594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_47_in_ruleUsage5618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleUsage5646 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_69_in_ruleUsage5666 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70_in_ruleUsage5695 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71_in_ruleUsage5724 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUsage5752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInformative_in_entryRuleInformative5788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInformative5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleInformative5835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformative5852 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInformative5869 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative5881 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative5898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleInformative5915 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative5932 = new BitSet(new long[]{0x0000400000000000L,0x000000000008001CL});
    public static final BitSet FOLLOW_83_in_ruleInformative5950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformative5970 = new BitSet(new long[]{0x0000400000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_46_in_ruleInformative5985 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleInformative6007 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_47_in_ruleInformative6031 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_66_in_ruleInformative6060 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefService_in_ruleInformative6082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_47_in_ruleInformative6106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleInformative6135 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_ruleInformative6157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_47_in_ruleInformative6181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleInformative6209 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_69_in_ruleInformative6229 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70_in_ruleInformative6258 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_71_in_ruleInformative6287 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInformative6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipientPart_in_entryRuleRecipientPart6351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipientPart6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipientPart6406 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRecipientPart6419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipientPart6439 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleRefRecipient_in_entryRuleRefRecipient6477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefRecipient6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipient6532 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRefRecipient6545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipient6565 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleRefRecipientSource_in_entryRuleRefRecipientSource6603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefRecipientSource6613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipientSource6658 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRefRecipientSource6671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipientSource6691 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleRefRecipientTarget_in_entryRuleRefRecipientTarget6729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefRecipientTarget6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipientTarget6784 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRefRecipientTarget6797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefRecipientTarget6817 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleRefService_in_entryRuleRefService6855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefService6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefService6910 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRefService6923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefService6943 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleServicePart_in_entryRuleServicePart6981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServicePart6991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServicePart7036 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleServicePart7049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServicePart7069 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_entryRuleRefPrivateData7107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefPrivateData7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefPrivateData7162 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRefPrivateData7175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefPrivateData7195 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleRefEnforcement_in_entryRuleRefEnforcement7233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefEnforcement7243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefEnforcement7288 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRefEnforcement7301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefEnforcement7321 = new BitSet(new long[]{0x4000000000000002L});

}