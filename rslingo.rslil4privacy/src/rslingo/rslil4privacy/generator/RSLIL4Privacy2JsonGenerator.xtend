package rslingo.rslil4privacy.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import rslingo.rslil4privacy.rSLIL4Privacy.Attribute
import rslingo.rslil4privacy.rSLIL4Privacy.Collection
import rslingo.rslil4privacy.rSLIL4Privacy.Disclosure
import rslingo.rslil4privacy.rSLIL4Privacy.Enforcement
import rslingo.rslil4privacy.rSLIL4Privacy.Informative
import rslingo.rslil4privacy.rSLIL4Privacy.Policy
import rslingo.rslil4privacy.rSLIL4Privacy.PrivateData
import rslingo.rslil4privacy.rSLIL4Privacy.Recipient
import rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart
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
	
	def className(Resource res) {
	    var name = res.URI.lastSegment
	    return name.substring(0, name.indexOf('.'))
	}
	
	def compile(Policy policy)
'''{
	"name": "«policy.metadata.name»",
	«IF !policy.collection.empty»"Collections": [
    «FOR c:policy.collection SEPARATOR ', '»«c.compileCollection»«ENDFOR»],«ENDIF»
    «IF !policy.disclosure.empty»"Disclosure": [
    «FOR d:policy.disclosure SEPARATOR ', '»«d.compileDisclosure»«ENDFOR»],«ENDIF»
    «IF !policy.retention.empty»"Retention": [
    «FOR r:policy.retention SEPARATOR ', '»«r.compileRetention»«ENDFOR»],«ENDIF»
    «IF !policy.usage.empty»"Usage": [
    «FOR u:policy.usage SEPARATOR ','»«u.compileUsage»«ENDFOR»],«ENDIF»
    «IF !policy.informative.empty»"Informative": [
    «FOR i:policy.informative SEPARATOR ', '»«i.compileInformative»«ENDFOR»],«ENDIF»
    «IF !policy.privateData.empty»"PrivateDatums": [
    «FOR pd:policy.privateData SEPARATOR ', '»«pd.compilePrivateData»«ENDFOR»],«ENDIF»
    «IF !policy.recipient.empty»"Recipients": [
    «FOR r:policy.recipient SEPARATOR ', '»«r.compileRecipient»«ENDFOR»],«ENDIF»
    «IF !policy.service.empty»"Services": [
    «FOR s:policy.service SEPARATOR ', '»«s.compileService»«ENDFOR»],«ENDIF»
    «IF !policy.enforcement.empty»"Enforcements": [
    «FOR e:policy.enforcement SEPARATOR ', '»«e.compileEnforcement»«ENDFOR»]«ENDIF»
}'''
	
	def compileCollection(Collection c)
'''{
	"ID": "«c.name»",
	"Description": "«c.description»",
	"Condition": "«c.condition»",
	«IF c.refPrivateData != null»"PrivateDatums": [«c.refPrivateData.refPrivateData.compileRefPrivateData»«FOR p:c.refPrivateData.refs», «p.compileRefPrivateData»«ENDFOR»],«ELSEIF c.refPDAll == 'All'»"PrivateDatums": ["All"],«ENDIF»
	«IF c.refService != null»"Services": [«c.refService.refService.compileRefService»«FOR s:c.refService.refs», «s.compileRefService»«ENDFOR»],«ELSEIF c.refSAll == 'All'»"Services": ["All"],«ENDIF»
	«IF c.refEnforcement != null»"Enforcements": [«c.refEnforcement.refEnforcement.compileRefEnforcement»«FOR e:c.refEnforcement.refs», «e.compileRefEnforcement»«ENDFOR»],«ELSEIF c.refEAll == 'All'»"Enforcements": ["All"],«ENDIF»
	"Type": "«IF c.modality=='Permission'»Permission«ELSEIF c.modality=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
}'''
	
	def compileDisclosure(Disclosure d)
'''{
	"ID": "«d.name»",
	"Description": "«d.description»",
	"Condition": "«d.condition»",
	«IF d.refRecipient != null»"Recipients": [«d.refRecipient.refRecipient.compileRefRecipient»«FOR r:d.refRecipient.refs», «r.compileRefRecipient»«ENDFOR»],«ELSEIF d.refRAll == 'All'»"Recipients": ["All"],«ENDIF»
	«IF d.refPrivateData != null»"PrivateDatums": [«d.refPrivateData.refPrivateData.compileRefPrivateData»«FOR p:d.refPrivateData.refs», «p.compileRefPrivateData»«ENDFOR»],«ELSEIF d.refPDAll == 'All'»"PrivateDatums": ["All"],«ENDIF»
	«IF d.refService != null»"Services": [«d.refService.refService.compileRefService»«FOR s:d.refService.refs», «s.compileRefService»«ENDFOR»],«ELSEIF d.refSAll == 'All'»"Services": ["All"],«ENDIF»
	«IF d.refEnforcement != null»"Enforcements": [«d.refEnforcement.refEnforcement.compileRefEnforcement»«FOR e:d.refEnforcement.refs», «e.compileRefEnforcement»«ENDFOR»],«ELSEIF d.refEAll == 'All'»"Enforcements": ["All"],«ENDIF»
	"Type": "«IF d.modality=='Permission'»Permission«ELSEIF d.modality=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
}'''
	
	def compileRetention(Retention r)
'''{
	"ID": "«r.name»",
	"Description": "«r.description»",
	"Condition": "«r.condition»",
	«IF r.period.empty»"Period": "«r.period»",«ENDIF»
	«IF r.refPrivateData != null»"PrivateDatums": [«r.refPrivateData.refPrivateData.compileRefPrivateData»«FOR p:r.refPrivateData.refs», «p.compileRefPrivateData»«ENDFOR»],«ELSEIF r.refPDAll == 'All'»"PrivateDatums": ["All"],«ENDIF»
	«IF r.refService != null»"Services": [«r.refService.refService.compileRefService»«FOR s:r.refService.refs», «s.compileRefService»«ENDFOR»],«ELSEIF r.refSAll == 'All'»"Services": ["All"],«ENDIF»
	«IF r.refEnforcement != null»"Enforcements": [«r.refEnforcement.refEnforcement.compileRefEnforcement»«FOR e:r.refEnforcement.refs», «e.compileRefEnforcement»«ENDFOR»],«ELSEIF r.refEAll == 'All'»"Enforcements": ["All"],«ENDIF»
	"Type": "«IF r.modality=='Permission'»Permission«ELSEIF r.modality=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
}'''
	
	def compileUsage(Usage u)
'''{
	"ID": "«u.name»",
	"Description": "«u.description»",
	"Condition": "«u.condition»",
	«IF u.refPrivateData != null»"PrivateDatums": [«u.refPrivateData.refPrivateData.compileRefPrivateData»«FOR p:u.refPrivateData.refs», «p.compileRefPrivateData»«ENDFOR»],«ELSEIF u.refPDAll == 'All'»"PrivateDatums": ["All"],«ENDIF»
	«IF u.refService != null»"Services": [«u.refService.refService.compileRefService»«FOR s:u.refService.refs», «s.compileRefService»«ENDFOR»],«ELSEIF u.refSAll == 'All'»"Services": ["All"],«ENDIF»
	«IF u.refEnforcement != null»"Enforcements": [«u.refEnforcement.refEnforcement.compileRefEnforcement»«FOR e:u.refEnforcement.refs», «e.compileRefEnforcement»«ENDFOR»],«ELSEIF u.refEAll == 'All'»"Enforcements": ["All"],«ENDIF»
	"Type": "«IF u.modality=='Permission'»Permission«ELSEIF u.modality=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
}'''
	
	def compileInformative(Informative i)
'''{
	"ID": "«i.name»",
	"Description": "«i.description»",
	"Condition": "«i.condition»",
	«IF i.refPrivateData != null»"PrivateDatums": [«i.refPrivateData.refPrivateData.compileRefPrivateData»«FOR p:i.refPrivateData.refs», «p.compileRefPrivateData»«ENDFOR»],«ELSEIF i.refPDAll == 'All'»"PrivateDatums": ["All"],«ENDIF»
	«IF i.refService != null»"Services": [«i.refService.refService.compileRefService»«FOR s:i.refService.refs», «s.compileRefService»«ENDFOR»],«ELSEIF i.refSAll == 'All'»"Services": ["All"],«ENDIF»
	«IF i.refEnforcement != null»"Enforcements": [«i.refEnforcement.refEnforcement.compileRefEnforcement»«FOR e:i.refEnforcement.refs», «e.compileRefEnforcement»«ENDFOR»],«ELSEIF i.refEAll == 'All'»"Enforcements": ["All"],«ENDIF»
	"Type": "«IF i.modality=='Permission'»Permission«ELSEIF i.modality=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
}'''
	
	def compileRefRecipient(Recipient r)
	'''"«r.name»"'''
	
	def compileRefPrivateData(PrivateData p)
	'''"«p.name»"'''
	
	def compileRefService(Service s)
	'''"«s.name»"'''
	
	def compileRefEnforcement(Enforcement e)
	'''"«e.name»"'''
	
	def compilePrivateData(PrivateData p)
'''{
	"ID": "«p.name»",
	"Description": "«p.description»",
	"Type": "«IF p.type=='PersonalInformation'»PersonalInformation«/*
	*/»«ELSE»UsageInformation«ENDIF»",
	«IF !p.attribute.empty»"Attributes": [
	«FOR a:p.attribute SEPARATOR ','»«a.compileAttr»«ENDFOR»
	]«ENDIF»
}'''
	
	def compileAttr(Attribute a)
'''{
	"name": "«a.name»",
	"Description": "«a.description»"
}'''
	
	def compileRecipient(Recipient r)
'''{
	"ID": "«r.name»",
	"Name": "«r.recipientName»",
	"Description": "«r.description»",
	«IF !r.recipientPart.empty»"Recipient_Parts": [«FOR rp:r.recipientPart SEPARATOR ','»«rp.compilerpartr»«ENDFOR»],«ENDIF»
	"Type": "«IF r.type=='Individual'»Individual«ELSEIF r.type=='Organization'»Organization«ELSE»Individual/Organization«ENDIF»",
	"Scope": "«IF r.scope=='Internal'»Internal«ELSEIF r.scope=='External'»External«ELSE»Internal/External«ENDIF»"
}'''
	
	def compilerpartr(RecipientPart r)
	'''"«r.recipientPart.recipientName»"'''
	
	def compileService(Service s)
'''{
	"ID": "«s.name»",
	"Description": "«s.description»",
	«IF s.refPrivateData != null»"PrivateDatums": [«s.refPrivateData.refPrivateData.compileRefPrivateData»«FOR p:s.refPrivateData.refs», «p.compileRefPrivateData»«ENDFOR»],«ELSEIF s.refPDAll == 'All'»"PrivateDatums": ["All"],«ENDIF»
	«IF !s.servicePart.empty»"Service_Parts": [«FOR sp:s.servicePart SEPARATOR ','»«sp.compilerservicePart»«ENDFOR»]«ENDIF»
}'''
	
	def compilerservicePart(ServicePart s)
	'''"«s.servicePart.name»"'''
	
	def compileEnforcement(Enforcement e)
'''{
	"ID": "«e.name»",
	"Name": "«e.enforcementName»",
	"Description": "«e.description»",
	"Type": "«IF e.type=='Action'»Action«/*
	*/»«ELSEIF e.type=='Algorithm'»Algorithm«/*
	*/»«ELSEIF e.type=='Config'»Config«/*
	*/»«ELSEIF e.type=='Process'»Process«/*
	*/»«ELSE»Tool«ENDIF»"
}'''

}