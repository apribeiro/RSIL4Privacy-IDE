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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PrivacyPolicy'", "'Last revised:'", "'Jan'", "'Feb'", "'Mar'", "'Apr'", "'May'", "'Jun'", "'Jul'", "'Aug'", "'Sep'", "'Oct'", "'Nov'", "'Dec'", "';'", "'Enforcement'", "'{'", "'Name'", "','", "'Description'", "'Type'", "'Action'", "'Algorithm'", "'Config'", "'Process'", "'Tool'", "'};'", "'Service'", "'RefersTo PrivateData'", "'Service_Part'", "'Recipient'", "'Recipient_Part'", "'Scope'", "'Internal'", "'External'", "'Internal/External'", "'Individual'", "'Organization'", "'Individual/Organization'", "'PrivateData'", "'PersonalInformation'", "'UsageInformation'", "'Attribute'", "'Collection'", "'Condition'", "'PartOf Collection'", "'RefersTo Service'", "'RefersTo Enforcement'", "'Modality'", "'Permission'", "'Obligation'", "'Prohibition'", "'Disclosure'", "'PartOf Disclosure'", "'RefersTo Recipient'", "'RefersTo Recipient-Source'", "'RefersTo Recipient-Target'", "'Retention'", "'PartOf Retention'", "'Period'", "'Usage'", "'PartOf Usage'", "'Informative'", "'PartOf Informative'", "'-'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'PrivacyPolicy' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Last revised:' ( (lv_Day_3_0= RULE_INT ) ) ( ( (lv_Month_4_1= 'Jan' | lv_Month_4_2= 'Feb' | lv_Month_4_3= 'Mar' | lv_Month_4_4= 'Apr' | lv_Month_4_5= 'May' | lv_Month_4_6= 'Jun' | lv_Month_4_7= 'Jul' | lv_Month_4_8= 'Aug' | lv_Month_4_9= 'Sep' | lv_Month_4_10= 'Oct' | lv_Month_4_11= 'Nov' | lv_Month_4_12= 'Dec' ) ) ) ( (lv_Year_5_0= RULE_INT ) ) otherlv_6= ';' ( ( (lv_collection_7_0= ruleCollection ) ) | ( (lv_disclosure_8_0= ruleDisclosure ) ) | ( (lv_retention_9_0= ruleRetention ) ) | ( (lv_usage_10_0= ruleUsage ) ) | ( (lv_informative_11_0= ruleInformative ) ) )* ( (lv_privateData_12_0= rulePrivateData ) )* ( (lv_recipient_13_0= ruleRecipient ) )* ( (lv_service_14_0= ruleService ) )* ( (lv_enforcement_15_0= ruleEnforcement ) )* ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_Day_3_0=null;
        Token lv_Month_4_1=null;
        Token lv_Month_4_2=null;
        Token lv_Month_4_3=null;
        Token lv_Month_4_4=null;
        Token lv_Month_4_5=null;
        Token lv_Month_4_6=null;
        Token lv_Month_4_7=null;
        Token lv_Month_4_8=null;
        Token lv_Month_4_9=null;
        Token lv_Month_4_10=null;
        Token lv_Month_4_11=null;
        Token lv_Month_4_12=null;
        Token lv_Year_5_0=null;
        Token otherlv_6=null;
        EObject lv_collection_7_0 = null;

        EObject lv_disclosure_8_0 = null;

        EObject lv_retention_9_0 = null;

        EObject lv_usage_10_0 = null;

        EObject lv_informative_11_0 = null;

        EObject lv_privateData_12_0 = null;

        EObject lv_recipient_13_0 = null;

        EObject lv_service_14_0 = null;

        EObject lv_enforcement_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'PrivacyPolicy' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Last revised:' ( (lv_Day_3_0= RULE_INT ) ) ( ( (lv_Month_4_1= 'Jan' | lv_Month_4_2= 'Feb' | lv_Month_4_3= 'Mar' | lv_Month_4_4= 'Apr' | lv_Month_4_5= 'May' | lv_Month_4_6= 'Jun' | lv_Month_4_7= 'Jul' | lv_Month_4_8= 'Aug' | lv_Month_4_9= 'Sep' | lv_Month_4_10= 'Oct' | lv_Month_4_11= 'Nov' | lv_Month_4_12= 'Dec' ) ) ) ( (lv_Year_5_0= RULE_INT ) ) otherlv_6= ';' ( ( (lv_collection_7_0= ruleCollection ) ) | ( (lv_disclosure_8_0= ruleDisclosure ) ) | ( (lv_retention_9_0= ruleRetention ) ) | ( (lv_usage_10_0= ruleUsage ) ) | ( (lv_informative_11_0= ruleInformative ) ) )* ( (lv_privateData_12_0= rulePrivateData ) )* ( (lv_recipient_13_0= ruleRecipient ) )* ( (lv_service_14_0= ruleService ) )* ( (lv_enforcement_15_0= ruleEnforcement ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'PrivacyPolicy' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Last revised:' ( (lv_Day_3_0= RULE_INT ) ) ( ( (lv_Month_4_1= 'Jan' | lv_Month_4_2= 'Feb' | lv_Month_4_3= 'Mar' | lv_Month_4_4= 'Apr' | lv_Month_4_5= 'May' | lv_Month_4_6= 'Jun' | lv_Month_4_7= 'Jul' | lv_Month_4_8= 'Aug' | lv_Month_4_9= 'Sep' | lv_Month_4_10= 'Oct' | lv_Month_4_11= 'Nov' | lv_Month_4_12= 'Dec' ) ) ) ( (lv_Year_5_0= RULE_INT ) ) otherlv_6= ';' ( ( (lv_collection_7_0= ruleCollection ) ) | ( (lv_disclosure_8_0= ruleDisclosure ) ) | ( (lv_retention_9_0= ruleRetention ) ) | ( (lv_usage_10_0= ruleUsage ) ) | ( (lv_informative_11_0= ruleInformative ) ) )* ( (lv_privateData_12_0= rulePrivateData ) )* ( (lv_recipient_13_0= ruleRecipient ) )* ( (lv_service_14_0= ruleService ) )* ( (lv_enforcement_15_0= ruleEnforcement ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'PrivacyPolicy' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Last revised:' ( (lv_Day_3_0= RULE_INT ) ) ( ( (lv_Month_4_1= 'Jan' | lv_Month_4_2= 'Feb' | lv_Month_4_3= 'Mar' | lv_Month_4_4= 'Apr' | lv_Month_4_5= 'May' | lv_Month_4_6= 'Jun' | lv_Month_4_7= 'Jul' | lv_Month_4_8= 'Aug' | lv_Month_4_9= 'Sep' | lv_Month_4_10= 'Oct' | lv_Month_4_11= 'Nov' | lv_Month_4_12= 'Dec' ) ) ) ( (lv_Year_5_0= RULE_INT ) ) otherlv_6= ';' ( ( (lv_collection_7_0= ruleCollection ) ) | ( (lv_disclosure_8_0= ruleDisclosure ) ) | ( (lv_retention_9_0= ruleRetention ) ) | ( (lv_usage_10_0= ruleUsage ) ) | ( (lv_informative_11_0= ruleInformative ) ) )* ( (lv_privateData_12_0= rulePrivateData ) )* ( (lv_recipient_13_0= ruleRecipient ) )* ( (lv_service_14_0= ruleService ) )* ( (lv_enforcement_15_0= ruleEnforcement ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'PrivacyPolicy' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Last revised:' ( (lv_Day_3_0= RULE_INT ) ) ( ( (lv_Month_4_1= 'Jan' | lv_Month_4_2= 'Feb' | lv_Month_4_3= 'Mar' | lv_Month_4_4= 'Apr' | lv_Month_4_5= 'May' | lv_Month_4_6= 'Jun' | lv_Month_4_7= 'Jul' | lv_Month_4_8= 'Aug' | lv_Month_4_9= 'Sep' | lv_Month_4_10= 'Oct' | lv_Month_4_11= 'Nov' | lv_Month_4_12= 'Dec' ) ) ) ( (lv_Year_5_0= RULE_INT ) ) otherlv_6= ';' ( ( (lv_collection_7_0= ruleCollection ) ) | ( (lv_disclosure_8_0= ruleDisclosure ) ) | ( (lv_retention_9_0= ruleRetention ) ) | ( (lv_usage_10_0= ruleUsage ) ) | ( (lv_informative_11_0= ruleInformative ) ) )* ( (lv_privateData_12_0= rulePrivateData ) )* ( (lv_recipient_13_0= ruleRecipient ) )* ( (lv_service_14_0= ruleService ) )* ( (lv_enforcement_15_0= ruleEnforcement ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePolicy122); 

                	newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPrivacyPolicyKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:84:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePolicy139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPolicyAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPolicyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePolicy156); 

                	newLeafNode(otherlv_2, grammarAccess.getPolicyAccess().getLastRevisedKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:106:1: ( (lv_Day_3_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:107:1: (lv_Day_3_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:107:1: (lv_Day_3_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:108:3: lv_Day_3_0= RULE_INT
            {
            lv_Day_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePolicy173); 

            			newLeafNode(lv_Day_3_0, grammarAccess.getPolicyAccess().getDayINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPolicyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"Day",
                    		lv_Day_3_0, 
                    		"INT");
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:2: ( ( (lv_Month_4_1= 'Jan' | lv_Month_4_2= 'Feb' | lv_Month_4_3= 'Mar' | lv_Month_4_4= 'Apr' | lv_Month_4_5= 'May' | lv_Month_4_6= 'Jun' | lv_Month_4_7= 'Jul' | lv_Month_4_8= 'Aug' | lv_Month_4_9= 'Sep' | lv_Month_4_10= 'Oct' | lv_Month_4_11= 'Nov' | lv_Month_4_12= 'Dec' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: ( (lv_Month_4_1= 'Jan' | lv_Month_4_2= 'Feb' | lv_Month_4_3= 'Mar' | lv_Month_4_4= 'Apr' | lv_Month_4_5= 'May' | lv_Month_4_6= 'Jun' | lv_Month_4_7= 'Jul' | lv_Month_4_8= 'Aug' | lv_Month_4_9= 'Sep' | lv_Month_4_10= 'Oct' | lv_Month_4_11= 'Nov' | lv_Month_4_12= 'Dec' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: ( (lv_Month_4_1= 'Jan' | lv_Month_4_2= 'Feb' | lv_Month_4_3= 'Mar' | lv_Month_4_4= 'Apr' | lv_Month_4_5= 'May' | lv_Month_4_6= 'Jun' | lv_Month_4_7= 'Jul' | lv_Month_4_8= 'Aug' | lv_Month_4_9= 'Sep' | lv_Month_4_10= 'Oct' | lv_Month_4_11= 'Nov' | lv_Month_4_12= 'Dec' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:1: (lv_Month_4_1= 'Jan' | lv_Month_4_2= 'Feb' | lv_Month_4_3= 'Mar' | lv_Month_4_4= 'Apr' | lv_Month_4_5= 'May' | lv_Month_4_6= 'Jun' | lv_Month_4_7= 'Jul' | lv_Month_4_8= 'Aug' | lv_Month_4_9= 'Sep' | lv_Month_4_10= 'Oct' | lv_Month_4_11= 'Nov' | lv_Month_4_12= 'Dec' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:1: (lv_Month_4_1= 'Jan' | lv_Month_4_2= 'Feb' | lv_Month_4_3= 'Mar' | lv_Month_4_4= 'Apr' | lv_Month_4_5= 'May' | lv_Month_4_6= 'Jun' | lv_Month_4_7= 'Jul' | lv_Month_4_8= 'Aug' | lv_Month_4_9= 'Sep' | lv_Month_4_10= 'Oct' | lv_Month_4_11= 'Nov' | lv_Month_4_12= 'Dec' )
            int alt1=12;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 16:
                {
                alt1=4;
                }
                break;
            case 17:
                {
                alt1=5;
                }
                break;
            case 18:
                {
                alt1=6;
                }
                break;
            case 19:
                {
                alt1=7;
                }
                break;
            case 20:
                {
                alt1=8;
                }
                break;
            case 21:
                {
                alt1=9;
                }
                break;
            case 22:
                {
                alt1=10;
                }
                break;
            case 23:
                {
                alt1=11;
                }
                break;
            case 24:
                {
                alt1=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:127:3: lv_Month_4_1= 'Jan'
                    {
                    lv_Month_4_1=(Token)match(input,13,FOLLOW_13_in_rulePolicy198); 

                            newLeafNode(lv_Month_4_1, grammarAccess.getPolicyAccess().getMonthJanKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "Month", lv_Month_4_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:139:8: lv_Month_4_2= 'Feb'
                    {
                    lv_Month_4_2=(Token)match(input,14,FOLLOW_14_in_rulePolicy227); 

                            newLeafNode(lv_Month_4_2, grammarAccess.getPolicyAccess().getMonthFebKeyword_4_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "Month", lv_Month_4_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:151:8: lv_Month_4_3= 'Mar'
                    {
                    lv_Month_4_3=(Token)match(input,15,FOLLOW_15_in_rulePolicy256); 

                            newLeafNode(lv_Month_4_3, grammarAccess.getPolicyAccess().getMonthMarKeyword_4_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "Month", lv_Month_4_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:163:8: lv_Month_4_4= 'Apr'
                    {
                    lv_Month_4_4=(Token)match(input,16,FOLLOW_16_in_rulePolicy285); 

                            newLeafNode(lv_Month_4_4, grammarAccess.getPolicyAccess().getMonthAprKeyword_4_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "Month", lv_Month_4_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:175:8: lv_Month_4_5= 'May'
                    {
                    lv_Month_4_5=(Token)match(input,17,FOLLOW_17_in_rulePolicy314); 

                            newLeafNode(lv_Month_4_5, grammarAccess.getPolicyAccess().getMonthMayKeyword_4_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "Month", lv_Month_4_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:187:8: lv_Month_4_6= 'Jun'
                    {
                    lv_Month_4_6=(Token)match(input,18,FOLLOW_18_in_rulePolicy343); 

                            newLeafNode(lv_Month_4_6, grammarAccess.getPolicyAccess().getMonthJunKeyword_4_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "Month", lv_Month_4_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:199:8: lv_Month_4_7= 'Jul'
                    {
                    lv_Month_4_7=(Token)match(input,19,FOLLOW_19_in_rulePolicy372); 

                            newLeafNode(lv_Month_4_7, grammarAccess.getPolicyAccess().getMonthJulKeyword_4_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "Month", lv_Month_4_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:211:8: lv_Month_4_8= 'Aug'
                    {
                    lv_Month_4_8=(Token)match(input,20,FOLLOW_20_in_rulePolicy401); 

                            newLeafNode(lv_Month_4_8, grammarAccess.getPolicyAccess().getMonthAugKeyword_4_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "Month", lv_Month_4_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:223:8: lv_Month_4_9= 'Sep'
                    {
                    lv_Month_4_9=(Token)match(input,21,FOLLOW_21_in_rulePolicy430); 

                            newLeafNode(lv_Month_4_9, grammarAccess.getPolicyAccess().getMonthSepKeyword_4_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "Month", lv_Month_4_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:235:8: lv_Month_4_10= 'Oct'
                    {
                    lv_Month_4_10=(Token)match(input,22,FOLLOW_22_in_rulePolicy459); 

                            newLeafNode(lv_Month_4_10, grammarAccess.getPolicyAccess().getMonthOctKeyword_4_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "Month", lv_Month_4_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:247:8: lv_Month_4_11= 'Nov'
                    {
                    lv_Month_4_11=(Token)match(input,23,FOLLOW_23_in_rulePolicy488); 

                            newLeafNode(lv_Month_4_11, grammarAccess.getPolicyAccess().getMonthNovKeyword_4_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "Month", lv_Month_4_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:259:8: lv_Month_4_12= 'Dec'
                    {
                    lv_Month_4_12=(Token)match(input,24,FOLLOW_24_in_rulePolicy517); 

                            newLeafNode(lv_Month_4_12, grammarAccess.getPolicyAccess().getMonthDecKeyword_4_0_11());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "Month", lv_Month_4_12, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:274:2: ( (lv_Year_5_0= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:275:1: (lv_Year_5_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:275:1: (lv_Year_5_0= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:276:3: lv_Year_5_0= RULE_INT
            {
            lv_Year_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePolicy550); 

            			newLeafNode(lv_Year_5_0, grammarAccess.getPolicyAccess().getYearINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPolicyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"Year",
                    		lv_Year_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_rulePolicy567); 

                	newLeafNode(otherlv_6, grammarAccess.getPolicyAccess().getSemicolonKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:296:1: ( ( (lv_collection_7_0= ruleCollection ) ) | ( (lv_disclosure_8_0= ruleDisclosure ) ) | ( (lv_retention_9_0= ruleRetention ) ) | ( (lv_usage_10_0= ruleUsage ) ) | ( (lv_informative_11_0= ruleInformative ) ) )*
            loop2:
            do {
                int alt2=6;
                switch ( input.LA(1) ) {
                case 54:
                    {
                    alt2=1;
                    }
                    break;
                case 63:
                    {
                    alt2=2;
                    }
                    break;
                case 68:
                    {
                    alt2=3;
                    }
                    break;
                case 71:
                    {
                    alt2=4;
                    }
                    break;
                case 73:
                    {
                    alt2=5;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:296:2: ( (lv_collection_7_0= ruleCollection ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:296:2: ( (lv_collection_7_0= ruleCollection ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:297:1: (lv_collection_7_0= ruleCollection )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:297:1: (lv_collection_7_0= ruleCollection )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:298:3: lv_collection_7_0= ruleCollection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getCollectionCollectionParserRuleCall_7_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCollection_in_rulePolicy589);
            	    lv_collection_7_0=ruleCollection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"collection",
            	            		lv_collection_7_0, 
            	            		"Collection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:315:6: ( (lv_disclosure_8_0= ruleDisclosure ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:315:6: ( (lv_disclosure_8_0= ruleDisclosure ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:316:1: (lv_disclosure_8_0= ruleDisclosure )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:316:1: (lv_disclosure_8_0= ruleDisclosure )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:317:3: lv_disclosure_8_0= ruleDisclosure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getDisclosureDisclosureParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDisclosure_in_rulePolicy616);
            	    lv_disclosure_8_0=ruleDisclosure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"disclosure",
            	            		lv_disclosure_8_0, 
            	            		"Disclosure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:6: ( (lv_retention_9_0= ruleRetention ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:6: ( (lv_retention_9_0= ruleRetention ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:335:1: (lv_retention_9_0= ruleRetention )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:335:1: (lv_retention_9_0= ruleRetention )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:336:3: lv_retention_9_0= ruleRetention
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getRetentionRetentionParserRuleCall_7_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRetention_in_rulePolicy643);
            	    lv_retention_9_0=ruleRetention();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"retention",
            	            		lv_retention_9_0, 
            	            		"Retention");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:353:6: ( (lv_usage_10_0= ruleUsage ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:353:6: ( (lv_usage_10_0= ruleUsage ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:1: (lv_usage_10_0= ruleUsage )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:1: (lv_usage_10_0= ruleUsage )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:355:3: lv_usage_10_0= ruleUsage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsageUsageParserRuleCall_7_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsage_in_rulePolicy670);
            	    lv_usage_10_0=ruleUsage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"usage",
            	            		lv_usage_10_0, 
            	            		"Usage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:372:6: ( (lv_informative_11_0= ruleInformative ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:372:6: ( (lv_informative_11_0= ruleInformative ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:373:1: (lv_informative_11_0= ruleInformative )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:373:1: (lv_informative_11_0= ruleInformative )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:374:3: lv_informative_11_0= ruleInformative
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getInformativeInformativeParserRuleCall_7_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInformative_in_rulePolicy697);
            	    lv_informative_11_0=ruleInformative();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"informative",
            	            		lv_informative_11_0, 
            	            		"Informative");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:390:4: ( (lv_privateData_12_0= rulePrivateData ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==50) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:391:1: (lv_privateData_12_0= rulePrivateData )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:391:1: (lv_privateData_12_0= rulePrivateData )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:392:3: lv_privateData_12_0= rulePrivateData
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getPrivateDataPrivateDataParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrivateData_in_rulePolicy720);
            	    lv_privateData_12_0=rulePrivateData();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"privateData",
            	            		lv_privateData_12_0, 
            	            		"PrivateData");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:408:3: ( (lv_recipient_13_0= ruleRecipient ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==41) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:409:1: (lv_recipient_13_0= ruleRecipient )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:409:1: (lv_recipient_13_0= ruleRecipient )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:410:3: lv_recipient_13_0= ruleRecipient
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getRecipientRecipientParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRecipient_in_rulePolicy742);
            	    lv_recipient_13_0=ruleRecipient();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"recipient",
            	            		lv_recipient_13_0, 
            	            		"Recipient");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:426:3: ( (lv_service_14_0= ruleService ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==38) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:427:1: (lv_service_14_0= ruleService )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:427:1: (lv_service_14_0= ruleService )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:428:3: lv_service_14_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getServiceServiceParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_rulePolicy764);
            	    lv_service_14_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"service",
            	            		lv_service_14_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:444:3: ( (lv_enforcement_15_0= ruleEnforcement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:445:1: (lv_enforcement_15_0= ruleEnforcement )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:445:1: (lv_enforcement_15_0= ruleEnforcement )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:446:3: lv_enforcement_15_0= ruleEnforcement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getEnforcementEnforcementParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnforcement_in_rulePolicy786);
            	    lv_enforcement_15_0=ruleEnforcement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"enforcement",
            	            		lv_enforcement_15_0, 
            	            		"Enforcement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleEnforcement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:470:1: entryRuleEnforcement returns [EObject current=null] : iv_ruleEnforcement= ruleEnforcement EOF ;
    public final EObject entryRuleEnforcement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnforcement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:471:2: (iv_ruleEnforcement= ruleEnforcement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:2: iv_ruleEnforcement= ruleEnforcement EOF
            {
             newCompositeNode(grammarAccess.getEnforcementRule()); 
            pushFollow(FOLLOW_ruleEnforcement_in_entryRuleEnforcement823);
            iv_ruleEnforcement=ruleEnforcement();

            state._fsp--;

             current =iv_ruleEnforcement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnforcement833); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:479:1: ruleEnforcement returns [EObject current=null] : (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_enforcementDescription_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) ) otherlv_11= '};' ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:482:28: ( (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_enforcementDescription_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) ) otherlv_11= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:483:1: (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_enforcementDescription_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) ) otherlv_11= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:483:1: (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_enforcementDescription_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) ) otherlv_11= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:483:3: otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_enforcementDescription_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) ) otherlv_11= '};'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleEnforcement870); 

                	newLeafNode(otherlv_0, grammarAccess.getEnforcementAccess().getEnforcementKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:487:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:488:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:488:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:489:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnforcement887); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleEnforcement904); 

                	newLeafNode(otherlv_2, grammarAccess.getEnforcementAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleEnforcement916); 

                	newLeafNode(otherlv_3, grammarAccess.getEnforcementAccess().getNameKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:513:1: ( (lv_enforcementName_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:514:1: (lv_enforcementName_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:514:1: (lv_enforcementName_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:3: lv_enforcementName_4_0= RULE_STRING
            {
            lv_enforcementName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnforcement933); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleEnforcement950); 

                	newLeafNode(otherlv_5, grammarAccess.getEnforcementAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleEnforcement962); 

                	newLeafNode(otherlv_6, grammarAccess.getEnforcementAccess().getDescriptionKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:539:1: ( (lv_enforcementDescription_7_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:540:1: (lv_enforcementDescription_7_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:540:1: (lv_enforcementDescription_7_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:3: lv_enforcementDescription_7_0= RULE_STRING
            {
            lv_enforcementDescription_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnforcement979); 

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

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleEnforcement996); 

                	newLeafNode(otherlv_8, grammarAccess.getEnforcementAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleEnforcement1008); 

                	newLeafNode(otherlv_9, grammarAccess.getEnforcementAccess().getTypeKeyword_9());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:565:1: ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:1: ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:1: ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:567:1: (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:567:1: (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt7=1;
                }
                break;
            case 33:
                {
                alt7=2;
                }
                break;
            case 34:
                {
                alt7=3;
                }
                break;
            case 35:
                {
                alt7=4;
                }
                break;
            case 36:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:568:3: lv_enforcementKind_10_1= 'Action'
                    {
                    lv_enforcementKind_10_1=(Token)match(input,32,FOLLOW_32_in_ruleEnforcement1028); 

                            newLeafNode(lv_enforcementKind_10_1, grammarAccess.getEnforcementAccess().getEnforcementKindActionKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "enforcementKind", lv_enforcementKind_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:580:8: lv_enforcementKind_10_2= 'Algorithm'
                    {
                    lv_enforcementKind_10_2=(Token)match(input,33,FOLLOW_33_in_ruleEnforcement1057); 

                            newLeafNode(lv_enforcementKind_10_2, grammarAccess.getEnforcementAccess().getEnforcementKindAlgorithmKeyword_10_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "enforcementKind", lv_enforcementKind_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:8: lv_enforcementKind_10_3= 'Config'
                    {
                    lv_enforcementKind_10_3=(Token)match(input,34,FOLLOW_34_in_ruleEnforcement1086); 

                            newLeafNode(lv_enforcementKind_10_3, grammarAccess.getEnforcementAccess().getEnforcementKindConfigKeyword_10_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "enforcementKind", lv_enforcementKind_10_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:604:8: lv_enforcementKind_10_4= 'Process'
                    {
                    lv_enforcementKind_10_4=(Token)match(input,35,FOLLOW_35_in_ruleEnforcement1115); 

                            newLeafNode(lv_enforcementKind_10_4, grammarAccess.getEnforcementAccess().getEnforcementKindProcessKeyword_10_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "enforcementKind", lv_enforcementKind_10_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:616:8: lv_enforcementKind_10_5= 'Tool'
                    {
                    lv_enforcementKind_10_5=(Token)match(input,36,FOLLOW_36_in_ruleEnforcement1144); 

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

            otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleEnforcement1172); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:643:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:644:2: (iv_ruleService= ruleService EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:645:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService1208);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService1218); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:652:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicepartof_13_0= ruleServicePartof ) )* )? otherlv_14= '};' ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:655:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicepartof_13_0= ruleServicePartof ) )* )? otherlv_14= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicepartof_13_0= ruleServicePartof ) )* )? otherlv_14= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicepartof_13_0= ruleServicePartof ) )* )? otherlv_14= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_servicepartof_13_0= ruleServicePartof ) )* )? otherlv_14= '};'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleService1255); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:660:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:661:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:661:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:662:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService1272); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleService1289); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleService1301); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getNameKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:686:1: ( (lv_servicename_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:687:1: (lv_servicename_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:687:1: (lv_servicename_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:688:3: lv_servicename_4_0= RULE_STRING
            {
            lv_servicename_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService1318); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleService1335); 

                	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getCommaKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:708:1: (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:708:3: otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ','
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleService1348); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getDescriptionKeyword_6_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:712:1: ( (lv_description_7_0= RULE_STRING ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:1: (lv_description_7_0= RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:1: (lv_description_7_0= RULE_STRING )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:3: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService1365); 

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

                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleService1382); 

                        	newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getCommaKeyword_6_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:3: (otherlv_9= 'RefersTo PrivateData' ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )* otherlv_11= ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:5: otherlv_9= 'RefersTo PrivateData' ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )* otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleService1397); 

                        	newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRefersToPrivateDataKeyword_7_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:738:1: ( (lv_refprivatedata_10_0= ruleRefPrivateData ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:739:1: (lv_refprivatedata_10_0= ruleRefPrivateData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:739:1: (lv_refprivatedata_10_0= ruleRefPrivateData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:740:3: lv_refprivatedata_10_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceAccess().getRefprivatedataRefPrivateDataParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleService1418);
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
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleService1431); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getCommaKeyword_7_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:760:3: (otherlv_12= 'Service_Part' ( (lv_servicepartof_13_0= ruleServicePartof ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:760:5: otherlv_12= 'Service_Part' ( (lv_servicepartof_13_0= ruleServicePartof ) )*
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_40_in_ruleService1446); 

                        	newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getService_PartKeyword_8_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:764:1: ( (lv_servicepartof_13_0= ruleServicePartof ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:765:1: (lv_servicepartof_13_0= ruleServicePartof )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:765:1: (lv_servicepartof_13_0= ruleServicePartof )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:766:3: lv_servicepartof_13_0= ruleServicePartof
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceAccess().getServicepartofServicePartofParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleServicePartof_in_ruleService1467);
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
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,37,FOLLOW_37_in_ruleService1482); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:794:1: entryRuleRecipient returns [EObject current=null] : iv_ruleRecipient= ruleRecipient EOF ;
    public final EObject entryRuleRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipient = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:795:2: (iv_ruleRecipient= ruleRecipient EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:796:2: iv_ruleRecipient= ruleRecipient EOF
            {
             newCompositeNode(grammarAccess.getRecipientRule()); 
            pushFollow(FOLLOW_ruleRecipient_in_entryRuleRecipient1518);
            iv_ruleRecipient=ruleRecipient();

            state._fsp--;

             current =iv_ruleRecipient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipient1528); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:803:1: ruleRecipient returns [EObject current=null] : (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:806:28: ( (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:807:1: (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:807:1: (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:807:3: otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleRecipient1565); 

                	newLeafNode(otherlv_0, grammarAccess.getRecipientAccess().getRecipientKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:811:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:812:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:812:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:813:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipient1582); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleRecipient1599); 

                	newLeafNode(otherlv_2, grammarAccess.getRecipientAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleRecipient1611); 

                	newLeafNode(otherlv_3, grammarAccess.getRecipientAccess().getNameKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:837:1: ( (lv_recipientname_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:838:1: (lv_recipientname_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:838:1: (lv_recipientname_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:839:3: lv_recipientname_4_0= RULE_STRING
            {
            lv_recipientname_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecipient1628); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleRecipient1645); 

                	newLeafNode(otherlv_5, grammarAccess.getRecipientAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleRecipient1657); 

                	newLeafNode(otherlv_6, grammarAccess.getRecipientAccess().getDescriptionKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:863:1: ( (lv_description_7_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:864:1: (lv_description_7_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:864:1: (lv_description_7_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:865:3: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecipient1674); 

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

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleRecipient1691); 

                	newLeafNode(otherlv_8, grammarAccess.getRecipientAccess().getCommaKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:885:1: (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:885:3: otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_42_in_ruleRecipient1704); 

                        	newLeafNode(otherlv_9, grammarAccess.getRecipientAccess().getRecipient_PartKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:889:1: ( (lv_partof_10_0= rulePartof ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:890:1: (lv_partof_10_0= rulePartof )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:890:1: (lv_partof_10_0= rulePartof )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:891:3: lv_partof_10_0= rulePartof
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRecipientAccess().getPartofPartofParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePartof_in_ruleRecipient1725);
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleRecipient1738); 

                        	newLeafNode(otherlv_11, grammarAccess.getRecipientAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,43,FOLLOW_43_in_ruleRecipient1752); 

                	newLeafNode(otherlv_12, grammarAccess.getRecipientAccess().getScopeKeyword_10());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:915:1: ( ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:1: ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:1: ( (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:1: (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:1: (lv_RecipientScopeKind_13_1= 'Internal' | lv_RecipientScopeKind_13_2= 'External' | lv_RecipientScopeKind_13_3= 'Internal/External' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt15=1;
                }
                break;
            case 45:
                {
                alt15=2;
                }
                break;
            case 46:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:918:3: lv_RecipientScopeKind_13_1= 'Internal'
                    {
                    lv_RecipientScopeKind_13_1=(Token)match(input,44,FOLLOW_44_in_ruleRecipient1772); 

                            newLeafNode(lv_RecipientScopeKind_13_1, grammarAccess.getRecipientAccess().getRecipientScopeKindInternalKeyword_11_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "RecipientScopeKind", lv_RecipientScopeKind_13_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:930:8: lv_RecipientScopeKind_13_2= 'External'
                    {
                    lv_RecipientScopeKind_13_2=(Token)match(input,45,FOLLOW_45_in_ruleRecipient1801); 

                            newLeafNode(lv_RecipientScopeKind_13_2, grammarAccess.getRecipientAccess().getRecipientScopeKindExternalKeyword_11_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "RecipientScopeKind", lv_RecipientScopeKind_13_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:942:8: lv_RecipientScopeKind_13_3= 'Internal/External'
                    {
                    lv_RecipientScopeKind_13_3=(Token)match(input,46,FOLLOW_46_in_ruleRecipient1830); 

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

            otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleRecipient1858); 

                	newLeafNode(otherlv_14, grammarAccess.getRecipientAccess().getCommaKeyword_12());
                
            otherlv_15=(Token)match(input,31,FOLLOW_31_in_ruleRecipient1870); 

                	newLeafNode(otherlv_15, grammarAccess.getRecipientAccess().getTypeKeyword_13());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:965:1: ( ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:966:1: ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:966:1: ( (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:967:1: (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:967:1: (lv_RecipientTypeKind_16_1= 'Individual' | lv_RecipientTypeKind_16_2= 'Organization' | lv_RecipientTypeKind_16_3= 'Individual/Organization' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt16=1;
                }
                break;
            case 48:
                {
                alt16=2;
                }
                break;
            case 49:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:3: lv_RecipientTypeKind_16_1= 'Individual'
                    {
                    lv_RecipientTypeKind_16_1=(Token)match(input,47,FOLLOW_47_in_ruleRecipient1890); 

                            newLeafNode(lv_RecipientTypeKind_16_1, grammarAccess.getRecipientAccess().getRecipientTypeKindIndividualKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "RecipientTypeKind", lv_RecipientTypeKind_16_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:980:8: lv_RecipientTypeKind_16_2= 'Organization'
                    {
                    lv_RecipientTypeKind_16_2=(Token)match(input,48,FOLLOW_48_in_ruleRecipient1919); 

                            newLeafNode(lv_RecipientTypeKind_16_2, grammarAccess.getRecipientAccess().getRecipientTypeKindOrganizationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "RecipientTypeKind", lv_RecipientTypeKind_16_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:8: lv_RecipientTypeKind_16_3= 'Individual/Organization'
                    {
                    lv_RecipientTypeKind_16_3=(Token)match(input,49,FOLLOW_49_in_ruleRecipient1948); 

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

            otherlv_17=(Token)match(input,37,FOLLOW_37_in_ruleRecipient1976); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1019:1: entryRulePrivateData returns [EObject current=null] : iv_rulePrivateData= rulePrivateData EOF ;
    public final EObject entryRulePrivateData() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateData = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1020:2: (iv_rulePrivateData= rulePrivateData EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1021:2: iv_rulePrivateData= rulePrivateData EOF
            {
             newCompositeNode(grammarAccess.getPrivateDataRule()); 
            pushFollow(FOLLOW_rulePrivateData_in_entryRulePrivateData2012);
            iv_rulePrivateData=rulePrivateData();

            state._fsp--;

             current =iv_rulePrivateData; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrivateData2022); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1028:1: rulePrivateData returns [EObject current=null] : (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_privatedata_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1031:28: ( (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_privatedata_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1032:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_privatedata_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1032:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_privatedata_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1032:3: otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_privatedata_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_rulePrivateData2059); 

                	newLeafNode(otherlv_0, grammarAccess.getPrivateDataAccess().getPrivateDataKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1036:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1037:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1037:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1038:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrivateData2076); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_rulePrivateData2093); 

                	newLeafNode(otherlv_2, grammarAccess.getPrivateDataAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_rulePrivateData2105); 

                	newLeafNode(otherlv_3, grammarAccess.getPrivateDataAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1062:1: ( (lv_privatedata_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1063:1: (lv_privatedata_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1063:1: (lv_privatedata_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1064:3: lv_privatedata_4_0= RULE_STRING
            {
            lv_privatedata_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrivateData2122); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_rulePrivateData2139); 

                	newLeafNode(otherlv_5, grammarAccess.getPrivateDataAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,31,FOLLOW_31_in_rulePrivateData2151); 

                	newLeafNode(otherlv_6, grammarAccess.getPrivateDataAccess().getTypeKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1088:1: ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1089:1: ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1089:1: ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1090:1: (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1090:1: (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==51) ) {
                alt17=1;
            }
            else if ( (LA17_0==52) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:3: lv_PrivateDataKind_7_1= 'PersonalInformation'
                    {
                    lv_PrivateDataKind_7_1=(Token)match(input,51,FOLLOW_51_in_rulePrivateData2171); 

                            newLeafNode(lv_PrivateDataKind_7_1, grammarAccess.getPrivateDataAccess().getPrivateDataKindPersonalInformationKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrivateDataRule());
                    	        }
                           		setWithLastConsumed(current, "PrivateDataKind", lv_PrivateDataKind_7_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1103:8: lv_PrivateDataKind_7_2= 'UsageInformation'
                    {
                    lv_PrivateDataKind_7_2=(Token)match(input,52,FOLLOW_52_in_rulePrivateData2200); 

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

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_rulePrivateData2228); 

                	newLeafNode(otherlv_8, grammarAccess.getPrivateDataAccess().getCommaKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1122:1: ( (lv_attribute_9_0= ruleAttribute ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==53) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1123:1: (lv_attribute_9_0= ruleAttribute )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1123:1: (lv_attribute_9_0= ruleAttribute )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1124:3: lv_attribute_9_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrivateDataAccess().getAttributeAttributeParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePrivateData2249);
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
            	    break loop18;
                }
            } while (true);

            otherlv_10=(Token)match(input,37,FOLLOW_37_in_rulePrivateData2262); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1152:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1153:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1154:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2298);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2308); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1161:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_attributeName_3_0= RULE_STRING ) ) (otherlv_4= ',' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_attributeName_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1164:28: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_attributeName_3_0= RULE_STRING ) ) (otherlv_4= ',' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1165:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_attributeName_3_0= RULE_STRING ) ) (otherlv_4= ',' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1165:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_attributeName_3_0= RULE_STRING ) ) (otherlv_4= ',' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1165:3: otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_attributeName_3_0= RULE_STRING ) ) (otherlv_4= ',' )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleAttribute2345); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1169:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1170:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1170:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1171:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2362); 

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

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleAttribute2379); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getDescriptionKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1191:1: ( (lv_attributeName_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:1: (lv_attributeName_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:1: (lv_attributeName_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1193:3: lv_attributeName_3_0= RULE_STRING
            {
            lv_attributeName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2396); 

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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1209:2: (otherlv_4= ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1209:4: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleAttribute2414); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1221:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1222:2: (iv_ruleCollection= ruleCollection EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1223:2: iv_ruleCollection= ruleCollection EOF
            {
             newCompositeNode(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection2452);
            iv_ruleCollection=ruleCollection();

            state._fsp--;

             current =iv_ruleCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection2462); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1230:1: ruleCollection returns [EObject current=null] : (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) ) otherlv_23= '};' ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1233:28: ( (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) ) otherlv_23= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) ) otherlv_23= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) ) otherlv_23= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:3: otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) ) otherlv_23= '};'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleCollection2499); 

                	newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getCollectionKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1238:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1239:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1239:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1240:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollection2516); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleCollection2533); 

                	newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleCollection2545); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1264:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1265:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1265:1: (lv_description_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1266:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection2562); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleCollection2579); 

                	newLeafNode(otherlv_5, grammarAccess.getCollectionAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleCollection2591); 

                	newLeafNode(otherlv_6, grammarAccess.getCollectionAccess().getConditionKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1290:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1291:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1291:1: (lv_condition_7_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1292:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection2608); 

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

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleCollection2625); 

                	newLeafNode(otherlv_8, grammarAccess.getCollectionAccess().getCommaKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1312:1: (otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==56) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1312:3: otherlv_9= 'PartOf Collection' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,56,FOLLOW_56_in_ruleCollection2638); 

                        	newLeafNode(otherlv_9, grammarAccess.getCollectionAccess().getPartOfCollectionKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1316:1: ( (otherlv_10= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1317:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1317:1: (otherlv_10= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1318:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollection2658); 

                    		newLeafNode(otherlv_10, grammarAccess.getCollectionAccess().getPartofCollectionCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleCollection2670); 

                        	newLeafNode(otherlv_11, grammarAccess.getCollectionAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1333:3: (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1333:5: otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleCollection2685); 

                        	newLeafNode(otherlv_12, grammarAccess.getCollectionAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1337:1: ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1338:1: (lv_refprivatedata_13_0= ruleRefPrivateData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1338:1: (lv_refprivatedata_13_0= ruleRefPrivateData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1339:3: lv_refprivatedata_13_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefprivatedataRefPrivateDataParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleCollection2706);
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
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleCollection2719); 

                        	newLeafNode(otherlv_14, grammarAccess.getCollectionAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1359:3: (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==57) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1359:5: otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,57,FOLLOW_57_in_ruleCollection2734); 

                        	newLeafNode(otherlv_15, grammarAccess.getCollectionAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1363:1: ( (lv_refertoservice_16_0= ruleReferToService ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:1: (lv_refertoservice_16_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:1: (lv_refertoservice_16_0= ruleReferToService )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1365:3: lv_refertoservice_16_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefertoserviceReferToServiceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleCollection2755);
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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,29,FOLLOW_29_in_ruleCollection2768); 

                        	newLeafNode(otherlv_17, grammarAccess.getCollectionAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1385:3: (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==58) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1385:5: otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,58,FOLLOW_58_in_ruleCollection2783); 

                        	newLeafNode(otherlv_18, grammarAccess.getCollectionAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1389:1: ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1390:1: (lv_refertoEnforcement_19_0= ruleRefertoEnforcement )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1390:1: (lv_refertoEnforcement_19_0= ruleRefertoEnforcement )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1391:3: lv_refertoEnforcement_19_0= ruleRefertoEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefertoEnforcementRefertoEnforcementParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefertoEnforcement_in_ruleCollection2804);
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
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,29,FOLLOW_29_in_ruleCollection2817); 

                        	newLeafNode(otherlv_20, grammarAccess.getCollectionAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,59,FOLLOW_59_in_ruleCollection2831); 

                	newLeafNode(otherlv_21, grammarAccess.getCollectionAccess().getModalityKeyword_13());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1415:1: ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1416:1: ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1416:1: ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1417:1: (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1417:1: (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt27=1;
                }
                break;
            case 61:
                {
                alt27=2;
                }
                break;
            case 62:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1418:3: lv_modalitykind_22_1= 'Permission'
                    {
                    lv_modalitykind_22_1=(Token)match(input,60,FOLLOW_60_in_ruleCollection2851); 

                            newLeafNode(lv_modalitykind_22_1, grammarAccess.getCollectionAccess().getModalitykindPermissionKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1430:8: lv_modalitykind_22_2= 'Obligation'
                    {
                    lv_modalitykind_22_2=(Token)match(input,61,FOLLOW_61_in_ruleCollection2880); 

                            newLeafNode(lv_modalitykind_22_2, grammarAccess.getCollectionAccess().getModalitykindObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:8: lv_modalitykind_22_3= 'Prohibition'
                    {
                    lv_modalitykind_22_3=(Token)match(input,62,FOLLOW_62_in_ruleCollection2909); 

                            newLeafNode(lv_modalitykind_22_3, grammarAccess.getCollectionAccess().getModalitykindProhibitionKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_23=(Token)match(input,37,FOLLOW_37_in_ruleCollection2937); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1469:1: entryRuleDisclosure returns [EObject current=null] : iv_ruleDisclosure= ruleDisclosure EOF ;
    public final EObject entryRuleDisclosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisclosure = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1470:2: (iv_ruleDisclosure= ruleDisclosure EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1471:2: iv_ruleDisclosure= ruleDisclosure EOF
            {
             newCompositeNode(grammarAccess.getDisclosureRule()); 
            pushFollow(FOLLOW_ruleDisclosure_in_entryRuleDisclosure2973);
            iv_ruleDisclosure=ruleDisclosure();

            state._fsp--;

             current =iv_ruleDisclosure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisclosure2983); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1478:1: ruleDisclosure returns [EObject current=null] : (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refertoservice_25_0= ruleReferToService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modalitykind_31_1= 'Permission' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Prohibition' ) ) ) otherlv_32= '};' ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1481:28: ( (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refertoservice_25_0= ruleReferToService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modalitykind_31_1= 'Permission' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Prohibition' ) ) ) otherlv_32= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1482:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refertoservice_25_0= ruleReferToService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modalitykind_31_1= 'Permission' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Prohibition' ) ) ) otherlv_32= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1482:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refertoservice_25_0= ruleReferToService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modalitykind_31_1= 'Permission' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Prohibition' ) ) ) otherlv_32= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1482:3: otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient' ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo PrivateData' ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Service' ( (lv_refertoservice_25_0= ruleReferToService ) )* otherlv_26= ',' )? (otherlv_27= 'RefersTo Enforcement' ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )* otherlv_29= ',' )? otherlv_30= 'Modality' ( ( (lv_modalitykind_31_1= 'Permission' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Prohibition' ) ) ) otherlv_32= '};'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleDisclosure3020); 

                	newLeafNode(otherlv_0, grammarAccess.getDisclosureAccess().getDisclosureKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1486:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1487:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1487:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1488:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisclosure3037); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleDisclosure3054); 

                	newLeafNode(otherlv_2, grammarAccess.getDisclosureAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleDisclosure3066); 

                	newLeafNode(otherlv_3, grammarAccess.getDisclosureAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1512:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1513:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1513:1: (lv_description_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1514:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure3083); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleDisclosure3100); 

                	newLeafNode(otherlv_5, grammarAccess.getDisclosureAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleDisclosure3112); 

                	newLeafNode(otherlv_6, grammarAccess.getDisclosureAccess().getConditionKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1538:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1539:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1539:1: (lv_condition_7_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1540:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure3129); 

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

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleDisclosure3146); 

                	newLeafNode(otherlv_8, grammarAccess.getDisclosureAccess().getCommaKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1560:1: (otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==64) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1560:3: otherlv_9= 'PartOf Disclosure' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,64,FOLLOW_64_in_ruleDisclosure3159); 

                        	newLeafNode(otherlv_9, grammarAccess.getDisclosureAccess().getPartOfDisclosureKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1564:1: ( (otherlv_10= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1565:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1565:1: (otherlv_10= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1566:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisclosure3179); 

                    		newLeafNode(otherlv_10, grammarAccess.getDisclosureAccess().getPartofDisclosureCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleDisclosure3191); 

                        	newLeafNode(otherlv_11, grammarAccess.getDisclosureAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1581:3: (otherlv_12= 'RefersTo Recipient' ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )* otherlv_14= ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==65) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1581:5: otherlv_12= 'RefersTo Recipient' ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,65,FOLLOW_65_in_ruleDisclosure3206); 

                        	newLeafNode(otherlv_12, grammarAccess.getDisclosureAccess().getRefersToRecipientKeyword_10_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1585:1: ( (lv_referToRecipient_13_0= ruleReferToRecipient ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1586:1: (lv_referToRecipient_13_0= ruleReferToRecipient )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1586:1: (lv_referToRecipient_13_0= ruleReferToRecipient )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1587:3: lv_referToRecipient_13_0= ruleReferToRecipient
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getReferToRecipientReferToRecipientParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToRecipient_in_ruleDisclosure3227);
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
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleDisclosure3240); 

                        	newLeafNode(otherlv_14, grammarAccess.getDisclosureAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1607:3: (otherlv_15= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )* otherlv_17= ',' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==66) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1607:5: otherlv_15= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,66,FOLLOW_66_in_ruleDisclosure3255); 

                        	newLeafNode(otherlv_15, grammarAccess.getDisclosureAccess().getRefersToRecipientSourceKeyword_11_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1611:1: ( (lv_referToRecipientsource_16_0= ruleReferToRecipientSource ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1612:1: (lv_referToRecipientsource_16_0= ruleReferToRecipientSource )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1612:1: (lv_referToRecipientsource_16_0= ruleReferToRecipientSource )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:3: lv_referToRecipientsource_16_0= ruleReferToRecipientSource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getReferToRecipientsourceReferToRecipientSourceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToRecipientSource_in_ruleDisclosure3276);
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
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,29,FOLLOW_29_in_ruleDisclosure3289); 

                        	newLeafNode(otherlv_17, grammarAccess.getDisclosureAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1633:3: (otherlv_18= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )* otherlv_20= ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==67) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1633:5: otherlv_18= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,67,FOLLOW_67_in_ruleDisclosure3304); 

                        	newLeafNode(otherlv_18, grammarAccess.getDisclosureAccess().getRefersToRecipientTargetKeyword_12_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1637:1: ( (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_ID) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1638:1: (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1638:1: (lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1639:3: lv_referToRecipienttarget_19_0= ruleReferToRecipientTarget
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getReferToRecipienttargetReferToRecipientTargetParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToRecipientTarget_in_ruleDisclosure3325);
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
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,29,FOLLOW_29_in_ruleDisclosure3338); 

                        	newLeafNode(otherlv_20, grammarAccess.getDisclosureAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1659:3: (otherlv_21= 'RefersTo PrivateData' ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )* otherlv_23= ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1659:5: otherlv_21= 'RefersTo PrivateData' ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )* otherlv_23= ','
                    {
                    otherlv_21=(Token)match(input,39,FOLLOW_39_in_ruleDisclosure3353); 

                        	newLeafNode(otherlv_21, grammarAccess.getDisclosureAccess().getRefersToPrivateDataKeyword_13_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1663:1: ( (lv_refprivatedata_22_0= ruleRefPrivateData ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_ID) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1664:1: (lv_refprivatedata_22_0= ruleRefPrivateData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1664:1: (lv_refprivatedata_22_0= ruleRefPrivateData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1665:3: lv_refprivatedata_22_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefprivatedataRefPrivateDataParserRuleCall_13_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleDisclosure3374);
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
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,29,FOLLOW_29_in_ruleDisclosure3387); 

                        	newLeafNode(otherlv_23, grammarAccess.getDisclosureAccess().getCommaKeyword_13_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1685:3: (otherlv_24= 'RefersTo Service' ( (lv_refertoservice_25_0= ruleReferToService ) )* otherlv_26= ',' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==57) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1685:5: otherlv_24= 'RefersTo Service' ( (lv_refertoservice_25_0= ruleReferToService ) )* otherlv_26= ','
                    {
                    otherlv_24=(Token)match(input,57,FOLLOW_57_in_ruleDisclosure3402); 

                        	newLeafNode(otherlv_24, grammarAccess.getDisclosureAccess().getRefersToServiceKeyword_14_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1689:1: ( (lv_refertoservice_25_0= ruleReferToService ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ID) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1690:1: (lv_refertoservice_25_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1690:1: (lv_refertoservice_25_0= ruleReferToService )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1691:3: lv_refertoservice_25_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefertoserviceReferToServiceParserRuleCall_14_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleDisclosure3423);
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
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,29,FOLLOW_29_in_ruleDisclosure3436); 

                        	newLeafNode(otherlv_26, grammarAccess.getDisclosureAccess().getCommaKeyword_14_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1711:3: (otherlv_27= 'RefersTo Enforcement' ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )* otherlv_29= ',' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==58) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1711:5: otherlv_27= 'RefersTo Enforcement' ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )* otherlv_29= ','
                    {
                    otherlv_27=(Token)match(input,58,FOLLOW_58_in_ruleDisclosure3451); 

                        	newLeafNode(otherlv_27, grammarAccess.getDisclosureAccess().getRefersToEnforcementKeyword_15_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1715:1: ( (lv_refertoEnforcement_28_0= ruleRefertoEnforcement ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1716:1: (lv_refertoEnforcement_28_0= ruleRefertoEnforcement )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1716:1: (lv_refertoEnforcement_28_0= ruleRefertoEnforcement )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1717:3: lv_refertoEnforcement_28_0= ruleRefertoEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefertoEnforcementRefertoEnforcementParserRuleCall_15_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefertoEnforcement_in_ruleDisclosure3472);
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
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,29,FOLLOW_29_in_ruleDisclosure3485); 

                        	newLeafNode(otherlv_29, grammarAccess.getDisclosureAccess().getCommaKeyword_15_2());
                        

                    }
                    break;

            }

            otherlv_30=(Token)match(input,59,FOLLOW_59_in_ruleDisclosure3499); 

                	newLeafNode(otherlv_30, grammarAccess.getDisclosureAccess().getModalityKeyword_16());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1741:1: ( ( (lv_modalitykind_31_1= 'Permission' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Prohibition' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1742:1: ( (lv_modalitykind_31_1= 'Permission' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Prohibition' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1742:1: ( (lv_modalitykind_31_1= 'Permission' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Prohibition' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1743:1: (lv_modalitykind_31_1= 'Permission' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Prohibition' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1743:1: (lv_modalitykind_31_1= 'Permission' | lv_modalitykind_31_2= 'Obligation' | lv_modalitykind_31_3= 'Prohibition' )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt41=1;
                }
                break;
            case 61:
                {
                alt41=2;
                }
                break;
            case 62:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1744:3: lv_modalitykind_31_1= 'Permission'
                    {
                    lv_modalitykind_31_1=(Token)match(input,60,FOLLOW_60_in_ruleDisclosure3519); 

                            newLeafNode(lv_modalitykind_31_1, grammarAccess.getDisclosureAccess().getModalitykindPermissionKeyword_17_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_31_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1756:8: lv_modalitykind_31_2= 'Obligation'
                    {
                    lv_modalitykind_31_2=(Token)match(input,61,FOLLOW_61_in_ruleDisclosure3548); 

                            newLeafNode(lv_modalitykind_31_2, grammarAccess.getDisclosureAccess().getModalitykindObligationKeyword_17_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_31_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1768:8: lv_modalitykind_31_3= 'Prohibition'
                    {
                    lv_modalitykind_31_3=(Token)match(input,62,FOLLOW_62_in_ruleDisclosure3577); 

                            newLeafNode(lv_modalitykind_31_3, grammarAccess.getDisclosureAccess().getModalitykindProhibitionKeyword_17_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_31_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_32=(Token)match(input,37,FOLLOW_37_in_ruleDisclosure3605); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1795:1: entryRuleRetention returns [EObject current=null] : iv_ruleRetention= ruleRetention EOF ;
    public final EObject entryRuleRetention() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetention = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1796:2: (iv_ruleRetention= ruleRetention EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1797:2: iv_ruleRetention= ruleRetention EOF
            {
             newCompositeNode(grammarAccess.getRetentionRule()); 
            pushFollow(FOLLOW_ruleRetention_in_entryRuleRetention3641);
            iv_ruleRetention=ruleRetention();

            state._fsp--;

             current =iv_ruleRetention; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRetention3651); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1804:1: ruleRetention returns [EObject current=null] : (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refertoservice_19_0= ruleReferToService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modalitykind_25_1= 'Permission' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Prohibition' ) ) ) otherlv_26= '};' ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1807:28: ( (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refertoservice_19_0= ruleReferToService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modalitykind_25_1= 'Permission' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Prohibition' ) ) ) otherlv_26= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1808:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refertoservice_19_0= ruleReferToService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modalitykind_25_1= 'Permission' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Prohibition' ) ) ) otherlv_26= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1808:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refertoservice_19_0= ruleReferToService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modalitykind_25_1= 'Permission' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Prohibition' ) ) ) otherlv_26= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1808:3: otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'Period' ( (lv_period_13_0= RULE_STRING ) ) otherlv_14= ',' (otherlv_15= 'RefersTo PrivateData' ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Service' ( (lv_refertoservice_19_0= ruleReferToService ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Enforcement' ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )* otherlv_23= ',' )? otherlv_24= 'Modality' ( ( (lv_modalitykind_25_1= 'Permission' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Prohibition' ) ) ) otherlv_26= '};'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleRetention3688); 

                	newLeafNode(otherlv_0, grammarAccess.getRetentionAccess().getRetentionKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1812:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1813:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1813:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1814:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRetention3705); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleRetention3722); 

                	newLeafNode(otherlv_2, grammarAccess.getRetentionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleRetention3734); 

                	newLeafNode(otherlv_3, grammarAccess.getRetentionAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1838:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1839:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1839:1: (lv_description_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1840:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention3751); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleRetention3768); 

                	newLeafNode(otherlv_5, grammarAccess.getRetentionAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleRetention3780); 

                	newLeafNode(otherlv_6, grammarAccess.getRetentionAccess().getConditionKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1864:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1865:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1865:1: (lv_condition_7_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1866:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention3797); 

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

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleRetention3814); 

                	newLeafNode(otherlv_8, grammarAccess.getRetentionAccess().getCommaKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1886:1: (otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==69) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1886:3: otherlv_9= 'PartOf Retention' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,69,FOLLOW_69_in_ruleRetention3827); 

                        	newLeafNode(otherlv_9, grammarAccess.getRetentionAccess().getPartOfRetentionKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1890:1: ( (otherlv_10= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1891:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1891:1: (otherlv_10= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1892:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRetention3847); 

                    		newLeafNode(otherlv_10, grammarAccess.getRetentionAccess().getPartofRetentionCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleRetention3859); 

                        	newLeafNode(otherlv_11, grammarAccess.getRetentionAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,70,FOLLOW_70_in_ruleRetention3873); 

                	newLeafNode(otherlv_12, grammarAccess.getRetentionAccess().getPeriodKeyword_10());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1911:1: ( (lv_period_13_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1912:1: (lv_period_13_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1912:1: (lv_period_13_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1913:3: lv_period_13_0= RULE_STRING
            {
            lv_period_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention3890); 

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

            otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleRetention3907); 

                	newLeafNode(otherlv_14, grammarAccess.getRetentionAccess().getCommaKeyword_12());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1933:1: (otherlv_15= 'RefersTo PrivateData' ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )* otherlv_17= ',' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1933:3: otherlv_15= 'RefersTo PrivateData' ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,39,FOLLOW_39_in_ruleRetention3920); 

                        	newLeafNode(otherlv_15, grammarAccess.getRetentionAccess().getRefersToPrivateDataKeyword_13_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1937:1: ( (lv_refprivatedata_16_0= ruleRefPrivateData ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_ID) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1938:1: (lv_refprivatedata_16_0= ruleRefPrivateData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1938:1: (lv_refprivatedata_16_0= ruleRefPrivateData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1939:3: lv_refprivatedata_16_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefprivatedataRefPrivateDataParserRuleCall_13_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleRetention3941);
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
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,29,FOLLOW_29_in_ruleRetention3954); 

                        	newLeafNode(otherlv_17, grammarAccess.getRetentionAccess().getCommaKeyword_13_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1959:3: (otherlv_18= 'RefersTo Service' ( (lv_refertoservice_19_0= ruleReferToService ) )* otherlv_20= ',' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==57) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1959:5: otherlv_18= 'RefersTo Service' ( (lv_refertoservice_19_0= ruleReferToService ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,57,FOLLOW_57_in_ruleRetention3969); 

                        	newLeafNode(otherlv_18, grammarAccess.getRetentionAccess().getRefersToServiceKeyword_14_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1963:1: ( (lv_refertoservice_19_0= ruleReferToService ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_ID) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1964:1: (lv_refertoservice_19_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1964:1: (lv_refertoservice_19_0= ruleReferToService )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1965:3: lv_refertoservice_19_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefertoserviceReferToServiceParserRuleCall_14_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleRetention3990);
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
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,29,FOLLOW_29_in_ruleRetention4003); 

                        	newLeafNode(otherlv_20, grammarAccess.getRetentionAccess().getCommaKeyword_14_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1985:3: (otherlv_21= 'RefersTo Enforcement' ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )* otherlv_23= ',' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==58) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1985:5: otherlv_21= 'RefersTo Enforcement' ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )* otherlv_23= ','
                    {
                    otherlv_21=(Token)match(input,58,FOLLOW_58_in_ruleRetention4018); 

                        	newLeafNode(otherlv_21, grammarAccess.getRetentionAccess().getRefersToEnforcementKeyword_15_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1989:1: ( (lv_refertoEnforcement_22_0= ruleRefertoEnforcement ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==RULE_ID) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1990:1: (lv_refertoEnforcement_22_0= ruleRefertoEnforcement )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1990:1: (lv_refertoEnforcement_22_0= ruleRefertoEnforcement )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1991:3: lv_refertoEnforcement_22_0= ruleRefertoEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefertoEnforcementRefertoEnforcementParserRuleCall_15_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefertoEnforcement_in_ruleRetention4039);
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
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,29,FOLLOW_29_in_ruleRetention4052); 

                        	newLeafNode(otherlv_23, grammarAccess.getRetentionAccess().getCommaKeyword_15_2());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,59,FOLLOW_59_in_ruleRetention4066); 

                	newLeafNode(otherlv_24, grammarAccess.getRetentionAccess().getModalityKeyword_16());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2015:1: ( ( (lv_modalitykind_25_1= 'Permission' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Prohibition' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2016:1: ( (lv_modalitykind_25_1= 'Permission' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Prohibition' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2016:1: ( (lv_modalitykind_25_1= 'Permission' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Prohibition' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2017:1: (lv_modalitykind_25_1= 'Permission' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Prohibition' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2017:1: (lv_modalitykind_25_1= 'Permission' | lv_modalitykind_25_2= 'Obligation' | lv_modalitykind_25_3= 'Prohibition' )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt49=1;
                }
                break;
            case 61:
                {
                alt49=2;
                }
                break;
            case 62:
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2018:3: lv_modalitykind_25_1= 'Permission'
                    {
                    lv_modalitykind_25_1=(Token)match(input,60,FOLLOW_60_in_ruleRetention4086); 

                            newLeafNode(lv_modalitykind_25_1, grammarAccess.getRetentionAccess().getModalitykindPermissionKeyword_17_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_25_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2030:8: lv_modalitykind_25_2= 'Obligation'
                    {
                    lv_modalitykind_25_2=(Token)match(input,61,FOLLOW_61_in_ruleRetention4115); 

                            newLeafNode(lv_modalitykind_25_2, grammarAccess.getRetentionAccess().getModalitykindObligationKeyword_17_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_25_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2042:8: lv_modalitykind_25_3= 'Prohibition'
                    {
                    lv_modalitykind_25_3=(Token)match(input,62,FOLLOW_62_in_ruleRetention4144); 

                            newLeafNode(lv_modalitykind_25_3, grammarAccess.getRetentionAccess().getModalitykindProhibitionKeyword_17_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_25_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_26=(Token)match(input,37,FOLLOW_37_in_ruleRetention4172); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2069:1: entryRuleUsage returns [EObject current=null] : iv_ruleUsage= ruleUsage EOF ;
    public final EObject entryRuleUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsage = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2070:2: (iv_ruleUsage= ruleUsage EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2071:2: iv_ruleUsage= ruleUsage EOF
            {
             newCompositeNode(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage4208);
            iv_ruleUsage=ruleUsage();

            state._fsp--;

             current =iv_ruleUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage4218); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2078:1: ruleUsage returns [EObject current=null] : (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) ) otherlv_23= '};' ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2081:28: ( (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) ) otherlv_23= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2082:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) ) otherlv_23= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2082:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) ) otherlv_23= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2082:3: otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) ) otherlv_23= '};'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleUsage4255); 

                	newLeafNode(otherlv_0, grammarAccess.getUsageAccess().getUsageKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2086:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2087:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2087:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2088:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage4272); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleUsage4289); 

                	newLeafNode(otherlv_2, grammarAccess.getUsageAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleUsage4301); 

                	newLeafNode(otherlv_3, grammarAccess.getUsageAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2112:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2113:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2113:1: (lv_description_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2114:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage4318); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleUsage4335); 

                	newLeafNode(otherlv_5, grammarAccess.getUsageAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleUsage4347); 

                	newLeafNode(otherlv_6, grammarAccess.getUsageAccess().getConditionKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2138:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2139:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2139:1: (lv_condition_7_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2140:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage4364); 

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

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleUsage4381); 

                	newLeafNode(otherlv_8, grammarAccess.getUsageAccess().getCommaKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2160:1: (otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==72) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2160:3: otherlv_9= 'PartOf Usage' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,72,FOLLOW_72_in_ruleUsage4394); 

                        	newLeafNode(otherlv_9, grammarAccess.getUsageAccess().getPartOfUsageKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2164:1: ( (otherlv_10= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2165:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2165:1: (otherlv_10= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2166:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage4414); 

                    		newLeafNode(otherlv_10, grammarAccess.getUsageAccess().getPartofUsageCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleUsage4426); 

                        	newLeafNode(otherlv_11, grammarAccess.getUsageAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2181:3: (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==39) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2181:5: otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleUsage4441); 

                        	newLeafNode(otherlv_12, grammarAccess.getUsageAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2185:1: ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==RULE_ID) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2186:1: (lv_refprivatedata_13_0= ruleRefPrivateData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2186:1: (lv_refprivatedata_13_0= ruleRefPrivateData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2187:3: lv_refprivatedata_13_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefprivatedataRefPrivateDataParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleUsage4462);
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
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleUsage4475); 

                        	newLeafNode(otherlv_14, grammarAccess.getUsageAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2207:3: (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==57) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2207:5: otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,57,FOLLOW_57_in_ruleUsage4490); 

                        	newLeafNode(otherlv_15, grammarAccess.getUsageAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2211:1: ( (lv_refertoservice_16_0= ruleReferToService ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==RULE_ID) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2212:1: (lv_refertoservice_16_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2212:1: (lv_refertoservice_16_0= ruleReferToService )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2213:3: lv_refertoservice_16_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefertoserviceReferToServiceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleUsage4511);
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
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,29,FOLLOW_29_in_ruleUsage4524); 

                        	newLeafNode(otherlv_17, grammarAccess.getUsageAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2233:3: (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==58) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2233:5: otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,58,FOLLOW_58_in_ruleUsage4539); 

                        	newLeafNode(otherlv_18, grammarAccess.getUsageAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2237:1: ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==RULE_ID) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2238:1: (lv_refertoEnforcement_19_0= ruleRefertoEnforcement )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2238:1: (lv_refertoEnforcement_19_0= ruleRefertoEnforcement )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2239:3: lv_refertoEnforcement_19_0= ruleRefertoEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefertoEnforcementRefertoEnforcementParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefertoEnforcement_in_ruleUsage4560);
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,29,FOLLOW_29_in_ruleUsage4573); 

                        	newLeafNode(otherlv_20, grammarAccess.getUsageAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,59,FOLLOW_59_in_ruleUsage4587); 

                	newLeafNode(otherlv_21, grammarAccess.getUsageAccess().getModalityKeyword_13());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2263:1: ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2264:1: ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2264:1: ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2265:1: (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2265:1: (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt57=1;
                }
                break;
            case 61:
                {
                alt57=2;
                }
                break;
            case 62:
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2266:3: lv_modalitykind_22_1= 'Permission'
                    {
                    lv_modalitykind_22_1=(Token)match(input,60,FOLLOW_60_in_ruleUsage4607); 

                            newLeafNode(lv_modalitykind_22_1, grammarAccess.getUsageAccess().getModalitykindPermissionKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2278:8: lv_modalitykind_22_2= 'Obligation'
                    {
                    lv_modalitykind_22_2=(Token)match(input,61,FOLLOW_61_in_ruleUsage4636); 

                            newLeafNode(lv_modalitykind_22_2, grammarAccess.getUsageAccess().getModalitykindObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2290:8: lv_modalitykind_22_3= 'Prohibition'
                    {
                    lv_modalitykind_22_3=(Token)match(input,62,FOLLOW_62_in_ruleUsage4665); 

                            newLeafNode(lv_modalitykind_22_3, grammarAccess.getUsageAccess().getModalitykindProhibitionKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_23=(Token)match(input,37,FOLLOW_37_in_ruleUsage4693); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2317:1: entryRuleInformative returns [EObject current=null] : iv_ruleInformative= ruleInformative EOF ;
    public final EObject entryRuleInformative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformative = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2318:2: (iv_ruleInformative= ruleInformative EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2319:2: iv_ruleInformative= ruleInformative EOF
            {
             newCompositeNode(grammarAccess.getInformativeRule()); 
            pushFollow(FOLLOW_ruleInformative_in_entryRuleInformative4729);
            iv_ruleInformative=ruleInformative();

            state._fsp--;

             current =iv_ruleInformative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInformative4739); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2326:1: ruleInformative returns [EObject current=null] : (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) ) otherlv_23= '};' ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2329:28: ( (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) ) otherlv_23= '};' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2330:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) ) otherlv_23= '};' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2330:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) ) otherlv_23= '};' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2330:3: otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_condition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) ) otherlv_23= '};'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleInformative4776); 

                	newLeafNode(otherlv_0, grammarAccess.getInformativeAccess().getInformativeKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2334:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2335:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2335:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformative4793); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleInformative4810); 

                	newLeafNode(otherlv_2, grammarAccess.getInformativeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleInformative4822); 

                	newLeafNode(otherlv_3, grammarAccess.getInformativeAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2360:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2361:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2361:1: (lv_description_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2362:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative4839); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleInformative4856); 

                	newLeafNode(otherlv_5, grammarAccess.getInformativeAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleInformative4868); 

                	newLeafNode(otherlv_6, grammarAccess.getInformativeAccess().getConditionKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2386:1: ( (lv_condition_7_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2387:1: (lv_condition_7_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2387:1: (lv_condition_7_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2388:3: lv_condition_7_0= RULE_STRING
            {
            lv_condition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative4885); 

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

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleInformative4902); 

                	newLeafNode(otherlv_8, grammarAccess.getInformativeAccess().getCommaKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2408:1: (otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==74) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2408:3: otherlv_9= 'PartOf Informative' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,74,FOLLOW_74_in_ruleInformative4915); 

                        	newLeafNode(otherlv_9, grammarAccess.getInformativeAccess().getPartOfInformativeKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2412:1: ( (otherlv_10= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2413:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2413:1: (otherlv_10= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2414:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformative4935); 

                    		newLeafNode(otherlv_10, grammarAccess.getInformativeAccess().getPartofInformativeCrossReference_9_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleInformative4947); 

                        	newLeafNode(otherlv_11, grammarAccess.getInformativeAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2429:3: (otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ',' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==39) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2429:5: otherlv_12= 'RefersTo PrivateData' ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleInformative4962); 

                        	newLeafNode(otherlv_12, grammarAccess.getInformativeAccess().getRefersToPrivateDataKeyword_10_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2433:1: ( (lv_refprivatedata_13_0= ruleRefPrivateData ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_ID) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2434:1: (lv_refprivatedata_13_0= ruleRefPrivateData )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2434:1: (lv_refprivatedata_13_0= ruleRefPrivateData )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2435:3: lv_refprivatedata_13_0= ruleRefPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefprivatedataRefPrivateDataParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefPrivateData_in_ruleInformative4983);
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
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleInformative4996); 

                        	newLeafNode(otherlv_14, grammarAccess.getInformativeAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2455:3: (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==57) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2455:5: otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,57,FOLLOW_57_in_ruleInformative5011); 

                        	newLeafNode(otherlv_15, grammarAccess.getInformativeAccess().getRefersToServiceKeyword_11_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2459:1: ( (lv_refertoservice_16_0= ruleReferToService ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==RULE_ID) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2460:1: (lv_refertoservice_16_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2460:1: (lv_refertoservice_16_0= ruleReferToService )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2461:3: lv_refertoservice_16_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefertoserviceReferToServiceParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleInformative5032);
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
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,29,FOLLOW_29_in_ruleInformative5045); 

                        	newLeafNode(otherlv_17, grammarAccess.getInformativeAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2481:3: (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==58) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2481:5: otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,58,FOLLOW_58_in_ruleInformative5060); 

                        	newLeafNode(otherlv_18, grammarAccess.getInformativeAccess().getRefersToEnforcementKeyword_12_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2485:1: ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==RULE_ID) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2486:1: (lv_refertoEnforcement_19_0= ruleRefertoEnforcement )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2486:1: (lv_refertoEnforcement_19_0= ruleRefertoEnforcement )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2487:3: lv_refertoEnforcement_19_0= ruleRefertoEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefertoEnforcementRefertoEnforcementParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefertoEnforcement_in_ruleInformative5081);
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
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,29,FOLLOW_29_in_ruleInformative5094); 

                        	newLeafNode(otherlv_20, grammarAccess.getInformativeAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,59,FOLLOW_59_in_ruleInformative5108); 

                	newLeafNode(otherlv_21, grammarAccess.getInformativeAccess().getModalityKeyword_13());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2511:1: ( ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2512:1: ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2512:1: ( (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2513:1: (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2513:1: (lv_modalitykind_22_1= 'Permission' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Prohibition' )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt65=1;
                }
                break;
            case 61:
                {
                alt65=2;
                }
                break;
            case 62:
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2514:3: lv_modalitykind_22_1= 'Permission'
                    {
                    lv_modalitykind_22_1=(Token)match(input,60,FOLLOW_60_in_ruleInformative5128); 

                            newLeafNode(lv_modalitykind_22_1, grammarAccess.getInformativeAccess().getModalitykindPermissionKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2526:8: lv_modalitykind_22_2= 'Obligation'
                    {
                    lv_modalitykind_22_2=(Token)match(input,61,FOLLOW_61_in_ruleInformative5157); 

                            newLeafNode(lv_modalitykind_22_2, grammarAccess.getInformativeAccess().getModalitykindObligationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2538:8: lv_modalitykind_22_3= 'Prohibition'
                    {
                    lv_modalitykind_22_3=(Token)match(input,62,FOLLOW_62_in_ruleInformative5186); 

                            newLeafNode(lv_modalitykind_22_3, grammarAccess.getInformativeAccess().getModalitykindProhibitionKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_23=(Token)match(input,37,FOLLOW_37_in_ruleInformative5214); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2565:1: entryRulePartof returns [EObject current=null] : iv_rulePartof= rulePartof EOF ;
    public final EObject entryRulePartof() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartof = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2566:2: (iv_rulePartof= rulePartof EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2567:2: iv_rulePartof= rulePartof EOF
            {
             newCompositeNode(grammarAccess.getPartofRule()); 
            pushFollow(FOLLOW_rulePartof_in_entryRulePartof5250);
            iv_rulePartof=rulePartof();

            state._fsp--;

             current =iv_rulePartof; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePartof5260); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2574:1: rulePartof returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject rulePartof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2577:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2578:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2578:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2578:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2578:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2579:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2579:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2580:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPartofRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePartof5305); 

            		newLeafNode(otherlv_0, grammarAccess.getPartofAccess().getPartofRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2591:2: (otherlv_1= '-' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==75) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2591:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_75_in_rulePartof5318); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2603:1: entryRuleReferToRecipient returns [EObject current=null] : iv_ruleReferToRecipient= ruleReferToRecipient EOF ;
    public final EObject entryRuleReferToRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferToRecipient = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2604:2: (iv_ruleReferToRecipient= ruleReferToRecipient EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2605:2: iv_ruleReferToRecipient= ruleReferToRecipient EOF
            {
             newCompositeNode(grammarAccess.getReferToRecipientRule()); 
            pushFollow(FOLLOW_ruleReferToRecipient_in_entryRuleReferToRecipient5356);
            iv_ruleReferToRecipient=ruleReferToRecipient();

            state._fsp--;

             current =iv_ruleReferToRecipient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferToRecipient5366); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2612:1: ruleReferToRecipient returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleReferToRecipient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2615:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2616:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2616:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2616:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2616:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2617:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2617:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2618:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferToRecipientRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferToRecipient5411); 

            		newLeafNode(otherlv_0, grammarAccess.getReferToRecipientAccess().getRefertoreRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2629:2: (otherlv_1= '-' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==75) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2629:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleReferToRecipient5424); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2641:1: entryRuleReferToRecipientSource returns [EObject current=null] : iv_ruleReferToRecipientSource= ruleReferToRecipientSource EOF ;
    public final EObject entryRuleReferToRecipientSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferToRecipientSource = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2642:2: (iv_ruleReferToRecipientSource= ruleReferToRecipientSource EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2643:2: iv_ruleReferToRecipientSource= ruleReferToRecipientSource EOF
            {
             newCompositeNode(grammarAccess.getReferToRecipientSourceRule()); 
            pushFollow(FOLLOW_ruleReferToRecipientSource_in_entryRuleReferToRecipientSource5462);
            iv_ruleReferToRecipientSource=ruleReferToRecipientSource();

            state._fsp--;

             current =iv_ruleReferToRecipientSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferToRecipientSource5472); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2650:1: ruleReferToRecipientSource returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleReferToRecipientSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2653:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2654:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2654:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2654:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2654:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2655:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2655:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2656:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferToRecipientSourceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferToRecipientSource5517); 

            		newLeafNode(otherlv_0, grammarAccess.getReferToRecipientSourceAccess().getRefertoreRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2667:2: (otherlv_1= '-' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==75) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2667:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleReferToRecipientSource5530); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2679:1: entryRuleReferToRecipientTarget returns [EObject current=null] : iv_ruleReferToRecipientTarget= ruleReferToRecipientTarget EOF ;
    public final EObject entryRuleReferToRecipientTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferToRecipientTarget = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2680:2: (iv_ruleReferToRecipientTarget= ruleReferToRecipientTarget EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2681:2: iv_ruleReferToRecipientTarget= ruleReferToRecipientTarget EOF
            {
             newCompositeNode(grammarAccess.getReferToRecipientTargetRule()); 
            pushFollow(FOLLOW_ruleReferToRecipientTarget_in_entryRuleReferToRecipientTarget5568);
            iv_ruleReferToRecipientTarget=ruleReferToRecipientTarget();

            state._fsp--;

             current =iv_ruleReferToRecipientTarget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferToRecipientTarget5578); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2688:1: ruleReferToRecipientTarget returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleReferToRecipientTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2691:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2692:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2692:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2692:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2692:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2693:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2693:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2694:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferToRecipientTargetRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferToRecipientTarget5623); 

            		newLeafNode(otherlv_0, grammarAccess.getReferToRecipientTargetAccess().getRefertoreRecipientCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2705:2: (otherlv_1= '-' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==75) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2705:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleReferToRecipientTarget5636); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2717:1: entryRuleReferToService returns [EObject current=null] : iv_ruleReferToService= ruleReferToService EOF ;
    public final EObject entryRuleReferToService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferToService = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2718:2: (iv_ruleReferToService= ruleReferToService EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2719:2: iv_ruleReferToService= ruleReferToService EOF
            {
             newCompositeNode(grammarAccess.getReferToServiceRule()); 
            pushFollow(FOLLOW_ruleReferToService_in_entryRuleReferToService5674);
            iv_ruleReferToService=ruleReferToService();

            state._fsp--;

             current =iv_ruleReferToService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferToService5684); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2726:1: ruleReferToService returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleReferToService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2729:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2730:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2730:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2730:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2730:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2731:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2731:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2732:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferToServiceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferToService5729); 

            		newLeafNode(otherlv_0, grammarAccess.getReferToServiceAccess().getRefertoseServiceCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2743:2: (otherlv_1= '-' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==75) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2743:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleReferToService5742); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2755:1: entryRuleServicePartof returns [EObject current=null] : iv_ruleServicePartof= ruleServicePartof EOF ;
    public final EObject entryRuleServicePartof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServicePartof = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2756:2: (iv_ruleServicePartof= ruleServicePartof EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2757:2: iv_ruleServicePartof= ruleServicePartof EOF
            {
             newCompositeNode(grammarAccess.getServicePartofRule()); 
            pushFollow(FOLLOW_ruleServicePartof_in_entryRuleServicePartof5780);
            iv_ruleServicePartof=ruleServicePartof();

            state._fsp--;

             current =iv_ruleServicePartof; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServicePartof5790); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2764:1: ruleServicePartof returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleServicePartof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2767:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2768:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2768:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2768:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2768:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2769:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2769:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2770:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServicePartofRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServicePartof5835); 

            		newLeafNode(otherlv_0, grammarAccess.getServicePartofAccess().getRefertoserviceServiceCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2781:2: (otherlv_1= '-' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==75) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2781:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleServicePartof5848); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2793:1: entryRuleRefPrivateData returns [EObject current=null] : iv_ruleRefPrivateData= ruleRefPrivateData EOF ;
    public final EObject entryRuleRefPrivateData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPrivateData = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2794:2: (iv_ruleRefPrivateData= ruleRefPrivateData EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2795:2: iv_ruleRefPrivateData= ruleRefPrivateData EOF
            {
             newCompositeNode(grammarAccess.getRefPrivateDataRule()); 
            pushFollow(FOLLOW_ruleRefPrivateData_in_entryRuleRefPrivateData5886);
            iv_ruleRefPrivateData=ruleRefPrivateData();

            state._fsp--;

             current =iv_ruleRefPrivateData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefPrivateData5896); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2802:1: ruleRefPrivateData returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefPrivateData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2805:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2806:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2806:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2806:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2806:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2807:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2807:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2808:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefPrivateDataRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefPrivateData5941); 

            		newLeafNode(otherlv_0, grammarAccess.getRefPrivateDataAccess().getRefprPrivateDataCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2819:2: (otherlv_1= '-' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==75) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2819:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleRefPrivateData5954); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2831:1: entryRuleRefertoEnforcement returns [EObject current=null] : iv_ruleRefertoEnforcement= ruleRefertoEnforcement EOF ;
    public final EObject entryRuleRefertoEnforcement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefertoEnforcement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2832:2: (iv_ruleRefertoEnforcement= ruleRefertoEnforcement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2833:2: iv_ruleRefertoEnforcement= ruleRefertoEnforcement EOF
            {
             newCompositeNode(grammarAccess.getRefertoEnforcementRule()); 
            pushFollow(FOLLOW_ruleRefertoEnforcement_in_entryRuleRefertoEnforcement5992);
            iv_ruleRefertoEnforcement=ruleRefertoEnforcement();

            state._fsp--;

             current =iv_ruleRefertoEnforcement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefertoEnforcement6002); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2840:1: ruleRefertoEnforcement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefertoEnforcement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2843:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2844:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2844:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2844:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2844:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2845:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2845:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2846:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefertoEnforcementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefertoEnforcement6047); 

            		newLeafNode(otherlv_0, grammarAccess.getRefertoEnforcementAccess().getRefstEnforcementCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2857:2: (otherlv_1= '-' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==75) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2857:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleRefertoEnforcement6060); 

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
    public static final BitSet FOLLOW_RULE_STRING_in_rulePolicy139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePolicy156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePolicy173 = new BitSet(new long[]{0x0000000001FFE000L});
    public static final BitSet FOLLOW_13_in_rulePolicy198 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14_in_rulePolicy227 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15_in_rulePolicy256 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16_in_rulePolicy285 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17_in_rulePolicy314 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18_in_rulePolicy343 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19_in_rulePolicy372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20_in_rulePolicy401 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21_in_rulePolicy430 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22_in_rulePolicy459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23_in_rulePolicy488 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24_in_rulePolicy517 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePolicy550 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePolicy567 = new BitSet(new long[]{0x8044024004000002L,0x0000000000000290L});
    public static final BitSet FOLLOW_ruleCollection_in_rulePolicy589 = new BitSet(new long[]{0x8044024004000002L,0x0000000000000290L});
    public static final BitSet FOLLOW_ruleDisclosure_in_rulePolicy616 = new BitSet(new long[]{0x8044024004000002L,0x0000000000000290L});
    public static final BitSet FOLLOW_ruleRetention_in_rulePolicy643 = new BitSet(new long[]{0x8044024004000002L,0x0000000000000290L});
    public static final BitSet FOLLOW_ruleUsage_in_rulePolicy670 = new BitSet(new long[]{0x8044024004000002L,0x0000000000000290L});
    public static final BitSet FOLLOW_ruleInformative_in_rulePolicy697 = new BitSet(new long[]{0x8044024004000002L,0x0000000000000290L});
    public static final BitSet FOLLOW_rulePrivateData_in_rulePolicy720 = new BitSet(new long[]{0x0004024004000002L});
    public static final BitSet FOLLOW_ruleRecipient_in_rulePolicy742 = new BitSet(new long[]{0x0000024004000002L});
    public static final BitSet FOLLOW_ruleService_in_rulePolicy764 = new BitSet(new long[]{0x0000004004000002L});
    public static final BitSet FOLLOW_ruleEnforcement_in_rulePolicy786 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleEnforcement_in_entryRuleEnforcement823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnforcement833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEnforcement870 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnforcement887 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEnforcement904 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEnforcement916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnforcement933 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEnforcement950 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEnforcement962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnforcement979 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEnforcement996 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEnforcement1008 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_32_in_ruleEnforcement1028 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33_in_ruleEnforcement1057 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34_in_ruleEnforcement1086 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35_in_ruleEnforcement1115 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36_in_ruleEnforcement1144 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleEnforcement1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleService1255 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService1272 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleService1289 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleService1301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService1318 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleService1335 = new BitSet(new long[]{0x000001A040000000L});
    public static final BitSet FOLLOW_30_in_ruleService1348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService1365 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleService1382 = new BitSet(new long[]{0x000001A000000000L});
    public static final BitSet FOLLOW_39_in_ruleService1397 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleService1418 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleService1431 = new BitSet(new long[]{0x0000012000000000L});
    public static final BitSet FOLLOW_40_in_ruleService1446 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_ruleServicePartof_in_ruleService1467 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_37_in_ruleService1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipient_in_entryRuleRecipient1518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipient1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRecipient1565 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipient1582 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRecipient1599 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRecipient1611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecipient1628 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRecipient1645 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRecipient1657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecipient1674 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRecipient1691 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_42_in_ruleRecipient1704 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_rulePartof_in_ruleRecipient1725 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleRecipient1738 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleRecipient1752 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_44_in_ruleRecipient1772 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_45_in_ruleRecipient1801 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_46_in_ruleRecipient1830 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRecipient1858 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleRecipient1870 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRecipient1890 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_48_in_ruleRecipient1919 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_49_in_ruleRecipient1948 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRecipient1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrivateData_in_entryRulePrivateData2012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrivateData2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePrivateData2059 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrivateData2076 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePrivateData2093 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePrivateData2105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrivateData2122 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePrivateData2139 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePrivateData2151 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_51_in_rulePrivateData2171 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_52_in_rulePrivateData2200 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePrivateData2228 = new BitSet(new long[]{0x0020002000000000L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePrivateData2249 = new BitSet(new long[]{0x0020002000000000L});
    public static final BitSet FOLLOW_37_in_rulePrivateData2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAttribute2345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2362 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAttribute2379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2396 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleAttribute2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection2452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleCollection2499 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollection2516 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCollection2533 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCollection2545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection2562 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCollection2579 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleCollection2591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection2608 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCollection2625 = new BitSet(new long[]{0x0F00008000000000L});
    public static final BitSet FOLLOW_56_in_ruleCollection2638 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollection2658 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCollection2670 = new BitSet(new long[]{0x0E00008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCollection2685 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleCollection2706 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleCollection2719 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_57_in_ruleCollection2734 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleCollection2755 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleCollection2768 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_ruleCollection2783 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_ruleCollection2804 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleCollection2817 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleCollection2831 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleCollection2851 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_61_in_ruleCollection2880 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_62_in_ruleCollection2909 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCollection2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisclosure_in_entryRuleDisclosure2973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisclosure2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDisclosure3020 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisclosure3037 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDisclosure3054 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDisclosure3066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure3083 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDisclosure3100 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleDisclosure3112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure3129 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDisclosure3146 = new BitSet(new long[]{0x0E00008000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_64_in_ruleDisclosure3159 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisclosure3179 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDisclosure3191 = new BitSet(new long[]{0x0E00008000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_65_in_ruleDisclosure3206 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleReferToRecipient_in_ruleDisclosure3227 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleDisclosure3240 = new BitSet(new long[]{0x0E00008000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_ruleDisclosure3255 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleReferToRecipientSource_in_ruleDisclosure3276 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleDisclosure3289 = new BitSet(new long[]{0x0E00008000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleDisclosure3304 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleReferToRecipientTarget_in_ruleDisclosure3325 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleDisclosure3338 = new BitSet(new long[]{0x0E00008000000000L});
    public static final BitSet FOLLOW_39_in_ruleDisclosure3353 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleDisclosure3374 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleDisclosure3387 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_57_in_ruleDisclosure3402 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleDisclosure3423 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleDisclosure3436 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_ruleDisclosure3451 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_ruleDisclosure3472 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleDisclosure3485 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleDisclosure3499 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleDisclosure3519 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_61_in_ruleDisclosure3548 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_62_in_ruleDisclosure3577 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDisclosure3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRetention_in_entryRuleRetention3641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRetention3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleRetention3688 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRetention3705 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRetention3722 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRetention3734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention3751 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRetention3768 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleRetention3780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention3797 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRetention3814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_ruleRetention3827 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRetention3847 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRetention3859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleRetention3873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention3890 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRetention3907 = new BitSet(new long[]{0x0E00008000000000L});
    public static final BitSet FOLLOW_39_in_ruleRetention3920 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleRetention3941 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleRetention3954 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_57_in_ruleRetention3969 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleRetention3990 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleRetention4003 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_ruleRetention4018 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_ruleRetention4039 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleRetention4052 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleRetention4066 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleRetention4086 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_61_in_ruleRetention4115 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_62_in_ruleRetention4144 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRetention4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage4208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleUsage4255 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage4272 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUsage4289 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleUsage4301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage4318 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleUsage4335 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleUsage4347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage4364 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleUsage4381 = new BitSet(new long[]{0x0E00008000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleUsage4394 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage4414 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleUsage4426 = new BitSet(new long[]{0x0E00008000000000L});
    public static final BitSet FOLLOW_39_in_ruleUsage4441 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleUsage4462 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleUsage4475 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_57_in_ruleUsage4490 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleUsage4511 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleUsage4524 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_ruleUsage4539 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_ruleUsage4560 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleUsage4573 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleUsage4587 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleUsage4607 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_61_in_ruleUsage4636 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_62_in_ruleUsage4665 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleUsage4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInformative_in_entryRuleInformative4729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInformative4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleInformative4776 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformative4793 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleInformative4810 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleInformative4822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative4839 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleInformative4856 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleInformative4868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative4885 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleInformative4902 = new BitSet(new long[]{0x0E00008000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleInformative4915 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformative4935 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleInformative4947 = new BitSet(new long[]{0x0E00008000000000L});
    public static final BitSet FOLLOW_39_in_ruleInformative4962 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_ruleInformative4983 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleInformative4996 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_57_in_ruleInformative5011 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleInformative5032 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleInformative5045 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_ruleInformative5060 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_ruleInformative5081 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_ruleInformative5094 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleInformative5108 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleInformative5128 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_61_in_ruleInformative5157 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_62_in_ruleInformative5186 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleInformative5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartof_in_entryRulePartof5250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartof5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePartof5305 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_rulePartof5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferToRecipient_in_entryRuleReferToRecipient5356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferToRecipient5366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferToRecipient5411 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleReferToRecipient5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferToRecipientSource_in_entryRuleReferToRecipientSource5462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferToRecipientSource5472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferToRecipientSource5517 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleReferToRecipientSource5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferToRecipientTarget_in_entryRuleReferToRecipientTarget5568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferToRecipientTarget5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferToRecipientTarget5623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleReferToRecipientTarget5636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferToService_in_entryRuleReferToService5674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferToService5684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferToService5729 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleReferToService5742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServicePartof_in_entryRuleServicePartof5780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServicePartof5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServicePartof5835 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleServicePartof5848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefPrivateData_in_entryRuleRefPrivateData5886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefPrivateData5896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefPrivateData5941 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleRefPrivateData5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_entryRuleRefertoEnforcement5992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefertoEnforcement6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefertoEnforcement6047 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleRefertoEnforcement6060 = new BitSet(new long[]{0x0000000000000002L});

}