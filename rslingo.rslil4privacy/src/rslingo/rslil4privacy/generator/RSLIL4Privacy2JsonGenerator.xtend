package rslingo.rslil4privacy.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import rslingo.rslil4privacy.rSLIL4Privacy.Attribute
import rslingo.rslil4privacy.rSLIL4Privacy.Collection
import rslingo.rslil4privacy.rSLIL4Privacy.Disclosure
import rslingo.rslil4privacy.rSLIL4Privacy.Enforcement
import rslingo.rslil4privacy.rSLIL4Privacy.Informative
import rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart
import rslingo.rslil4privacy.rSLIL4Privacy.Policy
import rslingo.rslil4privacy.rSLIL4Privacy.PrivateData
import rslingo.rslil4privacy.rSLIL4Privacy.Recipient
import rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData
import rslingo.rslil4privacy.rSLIL4Privacy.RefRecipient
import rslingo.rslil4privacy.rSLIL4Privacy.RefService
import rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement
import rslingo.rslil4privacy.rSLIL4Privacy.Retention
import rslingo.rslil4privacy.rSLIL4Privacy.Service
import rslingo.rslil4privacy.rSLIL4Privacy.ServicePart
import rslingo.rslil4privacy.rSLIL4Privacy.Usage

class RSLIL4Privacy2JsonGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile(resource.className +'.json', 		
			resource.allContents.filter(typeof(Policy)).map[compile].join(' ')
		)
	}
//----------------------------------------------------  
def className(Resource res) {
    var name = res.URI.lastSegment
    return name.substring(0, name.indexOf('.'))
}
//----------------------------------------------------
def compile(Policy policy)
'''{
	"name": "«policy.name»",
	«IF !policy.collection.empty»"Collections": [
    «FOR c:policy.collection SEPARATOR ','»«c.compileCollection»«ENDFOR»],«ENDIF»
    «IF !policy.disclosure.empty»"Disclosure": [
    «FOR d:policy.disclosure SEPARATOR ','»«d.compileDisclosure»«ENDFOR»],«ENDIF»
    «IF !policy.retention.empty»"Retention": [
    «FOR r:policy.retention SEPARATOR ','»«r.compileRetention»«ENDFOR»],«ENDIF»
    «IF !policy.usage.empty»"Usage": [
    «FOR u:policy.usage SEPARATOR ','»«u.compileUsage»«ENDFOR»],«ENDIF»
    «IF !policy.informative.empty»"Informative": [
    «FOR i:policy.informative SEPARATOR ','»«i.compileInformative»«ENDFOR»],«ENDIF»
    «IF !policy.privateData.empty» "PrivateDatums": [
    «FOR pd:policy.privateData SEPARATOR ','»«pd.compilePrivateData»«ENDFOR»],«ENDIF»
    «IF !policy.recipient.empty» "Recipients": [
    «FOR r:policy.recipient SEPARATOR ','»«r.compileRecipient»«ENDFOR»],«ENDIF»
    «IF !policy.service.empty»"Services": [
    «FOR s:policy.service SEPARATOR ','»«s.compileService»«ENDFOR»],«ENDIF»
    «IF !policy.enforcement.empty»"Enforcements": [
    «FOR e:policy.enforcement SEPARATOR ','»«e.compileEnforcement»«ENDFOR»]«ENDIF»
}
'''

def compileCollection(Collection c)
'''	{
		"ID": "«c.name»",
		"Description": "«c.description»",
		"Condition": "«c.condition»",
«««		«IF !coll.recipientPartCollection.empty»"PartOf": «FOR b:coll.recipientPartCollection SEPARATOR ','»«b.compilerpartcoll»«ENDFOR»,«ENDIF»
		«IF !c.refPrivateData.empty»"PrivateDatums": [«FOR p:c.refPrivateData SEPARATOR ','»«p.compilerrefPrivateData»«ENDFOR»],«ENDIF»
		«IF !c.refService.empty»"Services": [«FOR s:c.refService SEPARATOR ','»«s.compilerrefertoservice»«ENDFOR»],«ENDIF»
		«IF !c.refEnforcement.empty»"Enforcements": [«FOR e:c.refEnforcement SEPARATOR ','»«e.compilerrefEnforcement»«ENDFOR»],«ENDIF»
		"Type": "«IF c.modality=='Permission'»Permission«ELSEIF c.modality=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
	}
'''

def compileDisclosure(Disclosure d)
'''	{
		"ID": "«d.name»",
		"Description": "«d.description»",
		"Condition": "«d.condition»",
«««		«IF !dis.recipientPartdis.empty»"PartOf": «FOR b:dis.recipientPartdis SEPARATOR ','»«b.compilerrecipientPartdis»«ENDFOR»,«ENDIF»
		«IF !d.refRecipient.empty»"Recipients": [«FOR r:d.refRecipient SEPARATOR ','»«r.compilerreferToRecipient»«ENDFOR»],«ENDIF»
		«IF !d.refPrivateData.empty»"PrivateDatums": [«FOR p:d.refPrivateData SEPARATOR ','»«p.compilerrefPrivateData»«ENDFOR»],«ENDIF»
		«IF !d.refService.empty»"Services": [«FOR s:d.refService SEPARATOR ','»«s.compilerrefertoservice»«ENDFOR»],«ENDIF»
		«IF !d.refEnforcement.empty»"Enforcements": [«FOR e:d.refEnforcement SEPARATOR ','»«e.compilerrefEnforcement»«ENDFOR»],«ENDIF»
		"Type": "«IF d.modality=='Permission'»Permission«ELSEIF d.modality=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
	}
'''

def compileRetention(Retention r)
'''	{
		"ID": "«r.name»",
		"Description": "«r.description»",
		"Condition": "«r.condition»",
«««		«IF !ret.retentionrecipientPart.empty»"PartOf": «FOR b:ret.retentionrecipientPart SEPARATOR ','»«b.compilerpartret»«ENDFOR»,«ENDIF»
		«IF !r.period.empty»"Period": "«r.period»",«ENDIF»
		«IF !r.refPrivateData.empty»"PrivateDatums": [«FOR p:r.refPrivateData SEPARATOR ','»«p.compilerrefPrivateData»«ENDFOR»],«ENDIF»
		«IF !r.refService.empty»"Services": [«FOR s:r.refService SEPARATOR ','»«s.compilerrefertoservice»«ENDFOR»],«ENDIF»
		«IF !r.refEnforcement.empty»"Enforcements": [«FOR e:r.refEnforcement SEPARATOR ','»«e.compilerrefEnforcement»«ENDFOR»],«ENDIF»
		"Type": "«IF r.modality=='Permission'»Permission«ELSEIF r.modality=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
	}
'''

def compileUsage(Usage u)
'''	{
		"ID": "«u.name»",
		"Description": "«u.description»",
		"Condition": "«u.condition»",
«««		«IF !use.usagerecipientPart.empty»"PartOf": «FOR b:use.usagerecipientPart SEPARATOR ','»«b.compilerpartusage»«ENDFOR»,«ENDIF»
		«IF !u.refPrivateData.empty»"PrivateDatums": [«FOR p:u.refPrivateData SEPARATOR ','»«p.compilerrefPrivateData»«ENDFOR»],«ENDIF»
		«IF !u.refService.empty»"Services": [«FOR s:u.refService SEPARATOR ','»«s.compilerrefertoservice»«ENDFOR»],«ENDIF»
		«IF !u.refEnforcement.empty»"Enforcements": [«FOR e:u.refEnforcement SEPARATOR ','»«e.compilerrefEnforcement»«ENDFOR»],«ENDIF»
		"Type": "«IF u.modality=='Permission'»Permission«ELSEIF u.modality=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
	}
'''

def compileInformative(Informative i)
'''	{
		"ID": "«i.name»",
		"Description": "«i.description»",
		"Condition": "«i.condition»",
«««		«IF !inf. .empty»"PartOf": «FOR b:inf.infrecipientPart SEPARATOR ','»«b.compilerpartinf»«ENDFOR»,«ENDIF»
		«IF !i.refPrivateData.empty»"PrivateDatums": [«FOR p:i.refPrivateData SEPARATOR ','»«p.compilerrefPrivateData»«ENDFOR»],«ENDIF»
		«IF !i.refService.empty»"Services": [«FOR s:i.refService SEPARATOR ','»«s.compilerrefertoservice»«ENDFOR»],«ENDIF»
		«IF !i.refEnforcement.empty»"Enforcements": [«FOR e:i.refEnforcement SEPARATOR ','»«e.compilerrefEnforcement»«ENDFOR»],«ENDIF»
		"Type": "«IF i.modality=='Permission'»Permission«ELSEIF i.modality=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
	}
'''

def compilerreferToRecipient(RefRecipient r)
'''"«r.refRecipient.name»"'''

def compilerrefPrivateData(RefPrivateData r)
'''"«r.refPrivateData.name»"'''

def compilerrefertoservice(RefService r)
'''"«r.refService.name»"'''

def compilerrefEnforcement(RefEnforcement r)
'''"«r.refEnforcement.name»"'''

//----------------------------------------------------
def compilePrivateData(PrivateData p)
'''	{
		"ID": "«p.name»",
		"Description": "«p.description»",
		"Type": "«IF p.type=='PersonalInformation'»PersonalInformation«/*
		*/»«ELSE»UsageInformation«ENDIF»",
		«IF p.attribute!=0»"Attributes": [
		«FOR a:p.attribute SEPARATOR ','»«a.compileatt»«ENDFOR»
		]«ENDIF»
	}
'''

def compileatt(Attribute a)
'''	{
		"name": "«a.name»",
		"Description": "«a.description»"
	}
'''

//----------------------------------------------------
def compileRecipient(Recipient r)
'''	{
		"ID": "«r.name»",
		"Name": "«r.recipientName»",
		"Description": "«r.description»",
		«IF !r.recipientPart.empty»"Recipient_Parts": [«FOR rp:r.recipientPart SEPARATOR ','»«rp.compilerpartr»«ENDFOR»],«ENDIF»
		"Type": "«IF r.type=='Individual'»Individual«ELSEIF r.type=='Organization'»Organization«ELSE»Individual/Organization«ENDIF»",
		"Scope": "«IF r.scope=='Internal'»Internal«ELSEIF r.scope=='External'»External«ELSE»Internal/External«ENDIF»"
		
	}
'''

def compilerpartr(RecipientPart r)
'''"«r.recipientPart.recipientName»"'''

//----------------------------------------------------
def compileService(Service s)
'''	{
		"ID": "«s.name»",
		"Description": "«s.description»",
		«IF s.refPrivateData !=0»"PrivateDatums": [«FOR p:s.refPrivateData SEPARATOR ','»«p.compilerp»«ENDFOR»],«ENDIF»
		«IF !s.servicePart.empty»"Service_Parts": [«FOR sp:s.servicePart SEPARATOR ','»«sp.compilerservicePart»«ENDFOR»]«ENDIF»
	}
'''

def compilerp(RefPrivateData r)
'''"«r.refPrivateData.name»"'''

def compilerservicePart(ServicePart s)
'''"«s.servicePart.name»"'''

//----------------------------------------------------
def compileEnforcement(Enforcement e)
'''	{
		"ID": "«e.name»",
		"Name": "«e.enforcementName»",
		"Description": "«e.description»",
		"Type": "«IF e.type=='Action'»Action«/*
		*/»«ELSEIF e.type=='Algorithm'»Algorithm«/*
		*/»«ELSEIF e.type=='Config'»Config«/*
		*/»«ELSEIF e.type=='Process'»Process«/*
		*/»«ELSE»Tool«ENDIF»"
	}
'''

}
