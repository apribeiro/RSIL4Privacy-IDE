/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPolicyAccess().getMonthAlternatives_4_0(), "rule__Policy__MonthAlternatives_4_0");
					put(grammarAccess.getPolicyAccess().getAlternatives_7(), "rule__Policy__Alternatives_7");
					put(grammarAccess.getEnforcementAccess().getEnforcementKindAlternatives_10_0(), "rule__Enforcement__EnforcementKindAlternatives_10_0");
					put(grammarAccess.getRecipientAccess().getRecipientScopeKindAlternatives_11_0(), "rule__Recipient__RecipientScopeKindAlternatives_11_0");
					put(grammarAccess.getRecipientAccess().getRecipientTypeKindAlternatives_14_0(), "rule__Recipient__RecipientTypeKindAlternatives_14_0");
					put(grammarAccess.getPrivateDataAccess().getPrivateDataKindAlternatives_7_0(), "rule__PrivateData__PrivateDataKindAlternatives_7_0");
					put(grammarAccess.getCollectionAccess().getModalitykindAlternatives_14_0(), "rule__Collection__ModalitykindAlternatives_14_0");
					put(grammarAccess.getDisclosureAccess().getModalitykindAlternatives_17_0(), "rule__Disclosure__ModalitykindAlternatives_17_0");
					put(grammarAccess.getRetentionAccess().getModalitykindAlternatives_17_0(), "rule__Retention__ModalitykindAlternatives_17_0");
					put(grammarAccess.getUsageAccess().getModalitykindAlternatives_14_0(), "rule__Usage__ModalitykindAlternatives_14_0");
					put(grammarAccess.getInformativeAccess().getModalitykindAlternatives_14_0(), "rule__Informative__ModalitykindAlternatives_14_0");
					put(grammarAccess.getPolicyAccess().getGroup(), "rule__Policy__Group__0");
					put(grammarAccess.getEnforcementAccess().getGroup(), "rule__Enforcement__Group__0");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getServiceAccess().getGroup_6(), "rule__Service__Group_6__0");
					put(grammarAccess.getServiceAccess().getGroup_7(), "rule__Service__Group_7__0");
					put(grammarAccess.getServiceAccess().getGroup_8(), "rule__Service__Group_8__0");
					put(grammarAccess.getRecipientAccess().getGroup(), "rule__Recipient__Group__0");
					put(grammarAccess.getRecipientAccess().getGroup_9(), "rule__Recipient__Group_9__0");
					put(grammarAccess.getPrivateDataAccess().getGroup(), "rule__PrivateData__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getCollectionAccess().getGroup(), "rule__Collection__Group__0");
					put(grammarAccess.getCollectionAccess().getGroup_9(), "rule__Collection__Group_9__0");
					put(grammarAccess.getCollectionAccess().getGroup_10(), "rule__Collection__Group_10__0");
					put(grammarAccess.getCollectionAccess().getGroup_11(), "rule__Collection__Group_11__0");
					put(grammarAccess.getCollectionAccess().getGroup_12(), "rule__Collection__Group_12__0");
					put(grammarAccess.getDisclosureAccess().getGroup(), "rule__Disclosure__Group__0");
					put(grammarAccess.getDisclosureAccess().getGroup_9(), "rule__Disclosure__Group_9__0");
					put(grammarAccess.getDisclosureAccess().getGroup_10(), "rule__Disclosure__Group_10__0");
					put(grammarAccess.getDisclosureAccess().getGroup_11(), "rule__Disclosure__Group_11__0");
					put(grammarAccess.getDisclosureAccess().getGroup_12(), "rule__Disclosure__Group_12__0");
					put(grammarAccess.getDisclosureAccess().getGroup_13(), "rule__Disclosure__Group_13__0");
					put(grammarAccess.getDisclosureAccess().getGroup_14(), "rule__Disclosure__Group_14__0");
					put(grammarAccess.getDisclosureAccess().getGroup_15(), "rule__Disclosure__Group_15__0");
					put(grammarAccess.getRetentionAccess().getGroup(), "rule__Retention__Group__0");
					put(grammarAccess.getRetentionAccess().getGroup_9(), "rule__Retention__Group_9__0");
					put(grammarAccess.getRetentionAccess().getGroup_13(), "rule__Retention__Group_13__0");
					put(grammarAccess.getRetentionAccess().getGroup_14(), "rule__Retention__Group_14__0");
					put(grammarAccess.getRetentionAccess().getGroup_15(), "rule__Retention__Group_15__0");
					put(grammarAccess.getUsageAccess().getGroup(), "rule__Usage__Group__0");
					put(grammarAccess.getUsageAccess().getGroup_9(), "rule__Usage__Group_9__0");
					put(grammarAccess.getUsageAccess().getGroup_10(), "rule__Usage__Group_10__0");
					put(grammarAccess.getUsageAccess().getGroup_11(), "rule__Usage__Group_11__0");
					put(grammarAccess.getUsageAccess().getGroup_12(), "rule__Usage__Group_12__0");
					put(grammarAccess.getInformativeAccess().getGroup(), "rule__Informative__Group__0");
					put(grammarAccess.getInformativeAccess().getGroup_9(), "rule__Informative__Group_9__0");
					put(grammarAccess.getInformativeAccess().getGroup_10(), "rule__Informative__Group_10__0");
					put(grammarAccess.getInformativeAccess().getGroup_11(), "rule__Informative__Group_11__0");
					put(grammarAccess.getInformativeAccess().getGroup_12(), "rule__Informative__Group_12__0");
					put(grammarAccess.getPartofAccess().getGroup(), "rule__Partof__Group__0");
					put(grammarAccess.getReferToRecipientAccess().getGroup(), "rule__ReferToRecipient__Group__0");
					put(grammarAccess.getReferToRecipientSourceAccess().getGroup(), "rule__ReferToRecipientSource__Group__0");
					put(grammarAccess.getReferToRecipientTargetAccess().getGroup(), "rule__ReferToRecipientTarget__Group__0");
					put(grammarAccess.getReferToServiceAccess().getGroup(), "rule__ReferToService__Group__0");
					put(grammarAccess.getServicePartofAccess().getGroup(), "rule__ServicePartof__Group__0");
					put(grammarAccess.getRefPrivateDataAccess().getGroup(), "rule__RefPrivateData__Group__0");
					put(grammarAccess.getRefertoEnforcementAccess().getGroup(), "rule__RefertoEnforcement__Group__0");
					put(grammarAccess.getPolicyAccess().getNameAssignment_1(), "rule__Policy__NameAssignment_1");
					put(grammarAccess.getPolicyAccess().getDayAssignment_3(), "rule__Policy__DayAssignment_3");
					put(grammarAccess.getPolicyAccess().getMonthAssignment_4(), "rule__Policy__MonthAssignment_4");
					put(grammarAccess.getPolicyAccess().getYearAssignment_5(), "rule__Policy__YearAssignment_5");
					put(grammarAccess.getPolicyAccess().getCollectionAssignment_7_0(), "rule__Policy__CollectionAssignment_7_0");
					put(grammarAccess.getPolicyAccess().getDisclosureAssignment_7_1(), "rule__Policy__DisclosureAssignment_7_1");
					put(grammarAccess.getPolicyAccess().getRetentionAssignment_7_2(), "rule__Policy__RetentionAssignment_7_2");
					put(grammarAccess.getPolicyAccess().getUsageAssignment_7_3(), "rule__Policy__UsageAssignment_7_3");
					put(grammarAccess.getPolicyAccess().getInformativeAssignment_7_4(), "rule__Policy__InformativeAssignment_7_4");
					put(grammarAccess.getPolicyAccess().getPrivateDataAssignment_8(), "rule__Policy__PrivateDataAssignment_8");
					put(grammarAccess.getPolicyAccess().getRecipientAssignment_9(), "rule__Policy__RecipientAssignment_9");
					put(grammarAccess.getPolicyAccess().getServiceAssignment_10(), "rule__Policy__ServiceAssignment_10");
					put(grammarAccess.getPolicyAccess().getEnforcementAssignment_11(), "rule__Policy__EnforcementAssignment_11");
					put(grammarAccess.getEnforcementAccess().getNameAssignment_1(), "rule__Enforcement__NameAssignment_1");
					put(grammarAccess.getEnforcementAccess().getEnforcementNameAssignment_4(), "rule__Enforcement__EnforcementNameAssignment_4");
					put(grammarAccess.getEnforcementAccess().getEnforcementDescriptionAssignment_7(), "rule__Enforcement__EnforcementDescriptionAssignment_7");
					put(grammarAccess.getEnforcementAccess().getEnforcementKindAssignment_10(), "rule__Enforcement__EnforcementKindAssignment_10");
					put(grammarAccess.getServiceAccess().getNameAssignment_1(), "rule__Service__NameAssignment_1");
					put(grammarAccess.getServiceAccess().getServicenameAssignment_4(), "rule__Service__ServicenameAssignment_4");
					put(grammarAccess.getServiceAccess().getDescriptionAssignment_6_1(), "rule__Service__DescriptionAssignment_6_1");
					put(grammarAccess.getServiceAccess().getRefprivatedataAssignment_7_1(), "rule__Service__RefprivatedataAssignment_7_1");
					put(grammarAccess.getServiceAccess().getServicepartofAssignment_8_1(), "rule__Service__ServicepartofAssignment_8_1");
					put(grammarAccess.getRecipientAccess().getNameAssignment_1(), "rule__Recipient__NameAssignment_1");
					put(grammarAccess.getRecipientAccess().getRecipientnameAssignment_4(), "rule__Recipient__RecipientnameAssignment_4");
					put(grammarAccess.getRecipientAccess().getDescriptionAssignment_7(), "rule__Recipient__DescriptionAssignment_7");
					put(grammarAccess.getRecipientAccess().getPartofAssignment_9_1(), "rule__Recipient__PartofAssignment_9_1");
					put(grammarAccess.getRecipientAccess().getRecipientScopeKindAssignment_11(), "rule__Recipient__RecipientScopeKindAssignment_11");
					put(grammarAccess.getRecipientAccess().getRecipientTypeKindAssignment_14(), "rule__Recipient__RecipientTypeKindAssignment_14");
					put(grammarAccess.getPrivateDataAccess().getNameAssignment_1(), "rule__PrivateData__NameAssignment_1");
					put(grammarAccess.getPrivateDataAccess().getPrivatedataAssignment_4(), "rule__PrivateData__PrivatedataAssignment_4");
					put(grammarAccess.getPrivateDataAccess().getPrivateDataKindAssignment_7(), "rule__PrivateData__PrivateDataKindAssignment_7");
					put(grammarAccess.getPrivateDataAccess().getAttributeAssignment_9(), "rule__PrivateData__AttributeAssignment_9");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getAttributeNameAssignment_3(), "rule__Attribute__AttributeNameAssignment_3");
					put(grammarAccess.getCollectionAccess().getNameAssignment_1(), "rule__Collection__NameAssignment_1");
					put(grammarAccess.getCollectionAccess().getDescriptionAssignment_4(), "rule__Collection__DescriptionAssignment_4");
					put(grammarAccess.getCollectionAccess().getConditionAssignment_7(), "rule__Collection__ConditionAssignment_7");
					put(grammarAccess.getCollectionAccess().getPartofAssignment_9_1(), "rule__Collection__PartofAssignment_9_1");
					put(grammarAccess.getCollectionAccess().getRefprivatedataAssignment_10_1(), "rule__Collection__RefprivatedataAssignment_10_1");
					put(grammarAccess.getCollectionAccess().getRefertoserviceAssignment_11_1(), "rule__Collection__RefertoserviceAssignment_11_1");
					put(grammarAccess.getCollectionAccess().getRefertoEnforcementAssignment_12_1(), "rule__Collection__RefertoEnforcementAssignment_12_1");
					put(grammarAccess.getCollectionAccess().getModalitykindAssignment_14(), "rule__Collection__ModalitykindAssignment_14");
					put(grammarAccess.getDisclosureAccess().getNameAssignment_1(), "rule__Disclosure__NameAssignment_1");
					put(grammarAccess.getDisclosureAccess().getDescriptionAssignment_4(), "rule__Disclosure__DescriptionAssignment_4");
					put(grammarAccess.getDisclosureAccess().getConditionAssignment_7(), "rule__Disclosure__ConditionAssignment_7");
					put(grammarAccess.getDisclosureAccess().getPartofAssignment_9_1(), "rule__Disclosure__PartofAssignment_9_1");
					put(grammarAccess.getDisclosureAccess().getReferToRecipientAssignment_10_1(), "rule__Disclosure__ReferToRecipientAssignment_10_1");
					put(grammarAccess.getDisclosureAccess().getReferToRecipientsourceAssignment_11_1(), "rule__Disclosure__ReferToRecipientsourceAssignment_11_1");
					put(grammarAccess.getDisclosureAccess().getReferToRecipienttargetAssignment_12_1(), "rule__Disclosure__ReferToRecipienttargetAssignment_12_1");
					put(grammarAccess.getDisclosureAccess().getRefprivatedataAssignment_13_1(), "rule__Disclosure__RefprivatedataAssignment_13_1");
					put(grammarAccess.getDisclosureAccess().getRefertoserviceAssignment_14_1(), "rule__Disclosure__RefertoserviceAssignment_14_1");
					put(grammarAccess.getDisclosureAccess().getRefertoEnforcementAssignment_15_1(), "rule__Disclosure__RefertoEnforcementAssignment_15_1");
					put(grammarAccess.getDisclosureAccess().getModalitykindAssignment_17(), "rule__Disclosure__ModalitykindAssignment_17");
					put(grammarAccess.getRetentionAccess().getNameAssignment_1(), "rule__Retention__NameAssignment_1");
					put(grammarAccess.getRetentionAccess().getDescriptionAssignment_4(), "rule__Retention__DescriptionAssignment_4");
					put(grammarAccess.getRetentionAccess().getConditionAssignment_7(), "rule__Retention__ConditionAssignment_7");
					put(grammarAccess.getRetentionAccess().getPartofAssignment_9_1(), "rule__Retention__PartofAssignment_9_1");
					put(grammarAccess.getRetentionAccess().getPeriodAssignment_11(), "rule__Retention__PeriodAssignment_11");
					put(grammarAccess.getRetentionAccess().getRefprivatedataAssignment_13_1(), "rule__Retention__RefprivatedataAssignment_13_1");
					put(grammarAccess.getRetentionAccess().getRefertoserviceAssignment_14_1(), "rule__Retention__RefertoserviceAssignment_14_1");
					put(grammarAccess.getRetentionAccess().getRefertoEnforcementAssignment_15_1(), "rule__Retention__RefertoEnforcementAssignment_15_1");
					put(grammarAccess.getRetentionAccess().getModalitykindAssignment_17(), "rule__Retention__ModalitykindAssignment_17");
					put(grammarAccess.getUsageAccess().getNameAssignment_1(), "rule__Usage__NameAssignment_1");
					put(grammarAccess.getUsageAccess().getDescriptionAssignment_4(), "rule__Usage__DescriptionAssignment_4");
					put(grammarAccess.getUsageAccess().getConditionAssignment_7(), "rule__Usage__ConditionAssignment_7");
					put(grammarAccess.getUsageAccess().getPartofAssignment_9_1(), "rule__Usage__PartofAssignment_9_1");
					put(grammarAccess.getUsageAccess().getRefprivatedataAssignment_10_1(), "rule__Usage__RefprivatedataAssignment_10_1");
					put(grammarAccess.getUsageAccess().getRefertoserviceAssignment_11_1(), "rule__Usage__RefertoserviceAssignment_11_1");
					put(grammarAccess.getUsageAccess().getRefertoEnforcementAssignment_12_1(), "rule__Usage__RefertoEnforcementAssignment_12_1");
					put(grammarAccess.getUsageAccess().getModalitykindAssignment_14(), "rule__Usage__ModalitykindAssignment_14");
					put(grammarAccess.getInformativeAccess().getNameAssignment_1(), "rule__Informative__NameAssignment_1");
					put(grammarAccess.getInformativeAccess().getDescriptionAssignment_4(), "rule__Informative__DescriptionAssignment_4");
					put(grammarAccess.getInformativeAccess().getConditionAssignment_7(), "rule__Informative__ConditionAssignment_7");
					put(grammarAccess.getInformativeAccess().getPartofAssignment_9_1(), "rule__Informative__PartofAssignment_9_1");
					put(grammarAccess.getInformativeAccess().getRefprivatedataAssignment_10_1(), "rule__Informative__RefprivatedataAssignment_10_1");
					put(grammarAccess.getInformativeAccess().getRefertoserviceAssignment_11_1(), "rule__Informative__RefertoserviceAssignment_11_1");
					put(grammarAccess.getInformativeAccess().getRefertoEnforcementAssignment_12_1(), "rule__Informative__RefertoEnforcementAssignment_12_1");
					put(grammarAccess.getInformativeAccess().getModalitykindAssignment_14(), "rule__Informative__ModalitykindAssignment_14");
					put(grammarAccess.getPartofAccess().getPartofAssignment_0(), "rule__Partof__PartofAssignment_0");
					put(grammarAccess.getReferToRecipientAccess().getRefertoreAssignment_0(), "rule__ReferToRecipient__RefertoreAssignment_0");
					put(grammarAccess.getReferToRecipientSourceAccess().getRefertoreAssignment_0(), "rule__ReferToRecipientSource__RefertoreAssignment_0");
					put(grammarAccess.getReferToRecipientTargetAccess().getRefertoreAssignment_0(), "rule__ReferToRecipientTarget__RefertoreAssignment_0");
					put(grammarAccess.getReferToServiceAccess().getRefertoseAssignment_0(), "rule__ReferToService__RefertoseAssignment_0");
					put(grammarAccess.getServicePartofAccess().getRefertoserviceAssignment_0(), "rule__ServicePartof__RefertoserviceAssignment_0");
					put(grammarAccess.getRefPrivateDataAccess().getRefprAssignment_0(), "rule__RefPrivateData__RefprAssignment_0");
					put(grammarAccess.getRefertoEnforcementAccess().getRefstAssignment_0(), "rule__RefertoEnforcement__RefstAssignment_0");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
			typedParser.entryRulePolicy();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
