package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xtext.example.mydsl.myDsl.Attribute
import org.xtext.example.mydsl.myDsl.Collection
import org.xtext.example.mydsl.myDsl.Disclosure
import org.xtext.example.mydsl.myDsl.Enforcement
import org.xtext.example.mydsl.myDsl.Informative
import org.xtext.example.mydsl.myDsl.Partof
import org.xtext.example.mydsl.myDsl.Policy
import org.xtext.example.mydsl.myDsl.PrivateData
import org.xtext.example.mydsl.myDsl.Recipient
import org.xtext.example.mydsl.myDsl.RefPrivateData
import org.xtext.example.mydsl.myDsl.ReferToRecipient
import org.xtext.example.mydsl.myDsl.ReferToService
import org.xtext.example.mydsl.myDsl.RefertoEnforcement
import org.xtext.example.mydsl.myDsl.Retention
import org.xtext.example.mydsl.myDsl.Service
import org.xtext.example.mydsl.myDsl.ServicePartof
import org.xtext.example.mydsl.myDsl.Usage

class MyDsl2JsonGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile(resource.className +'.json', 		
		resource.allContents.filter(typeof(Policy)).map[compilepo].join('
'))}       
//----------------------------------------------------  
def className(Resource res) {
    var name = res.URI.lastSegment
    return name.substring(0, name.indexOf('.'))
    }
//----------------------------------------------------
def compilepo(Policy policy)
'''{
	"name": "«policy.name»",
	«IF !policy.collection.empty»"Collections": [
    «FOR c:policy.collection SEPARATOR ','»«c.compileCollection»«ENDFOR»],«ENDIF»
    «IF !policy.disclosure.empty»"Disclosure": [
    «FOR d:policy.disclosure SEPARATOR ','»«d.compileDisclosure»«ENDFOR»],«ENDIF»
    «IF !policy.retention.empty»"Retention": [
    «FOR d:policy.retention SEPARATOR ','»«d.compileRetention»«ENDFOR»],«ENDIF»
    «IF !policy.usage.empty»"Usage": [
    «FOR d:policy.usage SEPARATOR ','»«d.compileUsage»«ENDFOR»],«ENDIF»
    «IF !policy.informative.empty»"Informative": [
    «FOR d:policy.informative SEPARATOR ','»«d.compileInformative»«ENDFOR»],«ENDIF»
    «IF !policy.privateData.empty» "PrivateDatums": [
    «FOR z:policy.privateData SEPARATOR ','»«z.compilePrivateData»«ENDFOR»],«ENDIF»
    «IF !policy.recipient.empty» "Recipients": [
    «FOR a:policy.recipient SEPARATOR ','»«a.compileallRecipient»«ENDFOR»],«ENDIF»
    «IF !policy.service.empty»"Services": [
    «FOR y:policy.service SEPARATOR ','»«y.compileService»«ENDFOR»],«ENDIF»
    «IF !policy.enforcement.empty»"Enforcements": [
    «FOR o:policy.enforcement SEPARATOR ','»«o.compileEnforcement»«ENDFOR»]«ENDIF»
}
'''
//----------------------------------------------------
def compileInformative (Informative inf)
'''	{
		"ID": "«inf.name»",
		"Description": "«inf.description»",
		"Condition": "«inf.condition»",
«««		«IF !inf. .empty»"PartOf": «FOR b:inf.infpartof SEPARATOR ','»«b.compilerpartinf»«ENDFOR»,«ENDIF»
		«IF !inf.refprivatedata.empty»"PrivateDatums": [«FOR b:inf.refprivatedata SEPARATOR ','»«b.compilerrefprivatedata5»«ENDFOR»],«ENDIF»
		«IF !inf.refertoservice.empty»"Services": [«FOR b:inf.refertoservice SEPARATOR ','»«b.compilerrefertoservice5»«ENDFOR»],«ENDIF»
		«IF !inf.refertoEnforcement.empty»"Enforcements": [«FOR b:inf.refertoEnforcement SEPARATOR ','»«b.compilerrefertoEnforcement5»«ENDFOR»],«ENDIF»
		"Type": "«IF inf.modalitykind=='Permission'»Permission«ELSEIF inf.modalitykind=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
	}
'''
//def compilerpartinf (Infpartof partinf)
//'''"«partinf.refinf.name»"'''
def compilerrefprivatedata5 (RefPrivateData refpr5)
'''"«refpr5.refpr.name»"'''
def compilerrefertoservice5 (ReferToService refse5)
'''"«refse5.refertose.name»"'''
def compilerrefertoEnforcement5 (RefertoEnforcement refe5)
'''"«refe5.refst.name»"'''
//----------------------------------------------------
def compileUsage (Usage use)
'''	{
		"ID": "«use.name»",
		"Description": "«use.description»",
		"Condition": "«use.condition»",
«««		«IF !use.usagepartof.empty»"PartOf": «FOR b:use.usagepartof SEPARATOR ','»«b.compilerpartusage»«ENDFOR»,«ENDIF»
		«IF !use.refprivatedata.empty»"PrivateDatums": [«FOR b:use.refprivatedata SEPARATOR ','»«b.compilerrefprivatedata4»«ENDFOR»],«ENDIF»
		«IF !use.refertoservice.empty»"Services": [«FOR b:use.refertoservice SEPARATOR ','»«b.compilerrefertoservice4»«ENDFOR»],«ENDIF»
		«IF !use.refertoEnforcement.empty»"Enforcements": [«FOR b:use.refertoEnforcement SEPARATOR ','»«b.compilerrefertoEnforcement4»«ENDFOR»],«ENDIF»
		"Type": "«IF use.modalitykind=='Permission'»Permission«ELSEIF use.modalitykind=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
	}
'''
//def compilerpartusage (Usagepartof partuse)
//'''"«partuse.partofusage.name»"'''
def compilerrefprivatedata4 (RefPrivateData refpr4)
'''"«refpr4.refpr.name»"'''
def compilerrefertoservice4 (ReferToService refse4)
'''"«refse4.refertose.name»"'''
def compilerrefertoEnforcement4 (RefertoEnforcement refe4)
'''"«refe4.refst.name»"'''
//----------------------------------------------------
def compileRetention (Retention ret)
'''	{
		"ID": "«ret.name»",
		"Description": "«ret.description»",
		"Condition": "«ret.condition»",
«««		«IF !ret.retentionpartof.empty»"PartOf": «FOR b:ret.retentionpartof SEPARATOR ','»«b.compilerpartret»«ENDFOR»,«ENDIF»
		«IF !ret.period.empty»"Period": "«ret.period»",«ENDIF»
		«IF !ret.refprivatedata.empty»"PrivateDatums": [«FOR b:ret.refprivatedata SEPARATOR ','»«b.compilerrefprivatedata3»«ENDFOR»],«ENDIF»
		«IF !ret.refertoservice.empty»"Services": [«FOR b:ret.refertoservice SEPARATOR ','»«b.compilerrefertoservice3»«ENDFOR»],«ENDIF»
		«IF !ret.refertoEnforcement.empty»"Enforcements": [«FOR b:ret.refertoEnforcement SEPARATOR ','»«b.compilerrefertoEnforcement3»«ENDFOR»],«ENDIF»
		"Type": "«IF ret.modalitykind=='Permission'»Permission«ELSEIF ret.modalitykind=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
	}
	'''
//def compilerpartret (Retentionpartof partcoll)
//'''"«partcoll.partofret.name»"'''
def compilerrefprivatedata3 (RefPrivateData refpr3)
'''"«refpr3.refpr.name»"'''
def compilerrefertoservice3 (ReferToService refse3)
'''"«refse3.refertose.name»"'''
def compilerrefertoEnforcement3 (RefertoEnforcement refe3)
'''"«refe3.refst.name»"'''
//----------------------------------------------------
def compileCollection (Collection coll)
'''	{
		"ID": "«coll.name»",
		"Description": "«coll.description»",
		"Condition": "«coll.condition»",
«««		«IF !coll.partofCollection.empty»"PartOf": «FOR b:coll.partofCollection SEPARATOR ','»«b.compilerpartcoll»«ENDFOR»,«ENDIF»
		«IF !coll.refprivatedata.empty»"PrivateDatums": [«FOR b:coll.refprivatedata SEPARATOR ','»«b.compilerrefprivatedata»«ENDFOR»],«ENDIF»
		«IF !coll.refertoservice.empty»"Services": [«FOR b:coll.refertoservice SEPARATOR ','»«b.compilerrefertoservice»«ENDFOR»],«ENDIF»
		«IF !coll.refertoEnforcement.empty»"Enforcements": [«FOR b:coll.refertoEnforcement SEPARATOR ','»«b.compilerrefertoEnforcement»«ENDFOR»],«ENDIF»
		"Type": "«IF coll.modalitykind=='Permission'»Permission«ELSEIF coll.modalitykind=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
	}
	'''
//def compilerpartcoll (PartofCollection partcoll)
//'''"«partcoll.partofcoll.name»"'''
def compilerrefprivatedata (RefPrivateData refpr)
'''"«refpr.refpr.name»"'''
def compilerrefertoservice (ReferToService refse)
'''"«refse.refertose.name»"'''
def compilerrefertoEnforcement (RefertoEnforcement refe)
'''"«refe.refst.name»"'''
//----------------------------------------------------
def compileDisclosure (Disclosure dis)
'''	{
		"ID": "«dis.name»",
		"Description": "«dis.description»",
		"Condition": "«dis.condition»",
«««		«IF !dis.partofdis.empty»"PartOf": «FOR b:dis.partofdis SEPARATOR ','»«b.compilerpartofdis»«ENDFOR»,«ENDIF»
		«IF !dis.referToRecipient.empty»"Recipients": [«FOR b:dis.referToRecipient SEPARATOR ','»«b.compilerreferToRecipient»«ENDFOR»],«ENDIF»
		«IF !dis.refprivatedata.empty»"PrivateDatums": [«FOR b:dis.refprivatedata SEPARATOR ','»«b.compilerrefprivatedata2»«ENDFOR»],«ENDIF»
		«IF !dis.refertoservice.empty»"Services": [«FOR b:dis.refertoservice SEPARATOR ','»«b.compilerrefertoservice2»«ENDFOR»],«ENDIF»
		«IF !dis.refertoEnforcement.empty»"Enforcements": [«FOR b:dis.refertoEnforcement SEPARATOR ','»«b.compilerrefertoEnforcement2»«ENDFOR»],«ENDIF»
		"Type": "«IF dis.modalitykind=='Permission'»Permission«ELSEIF dis.modalitykind=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
	}
'''
//def compilerpartofdis (Partofdis partdis)
//'''"«partdis.partofdis.name»"'''
def compilerreferToRecipient (ReferToRecipient refrec)
'''"«refrec.refertore.name»"'''
def compilerrefprivatedata2 (RefPrivateData refpr2)
'''"«refpr2.refpr.name»"'''
def compilerrefertoservice2 (ReferToService refse2)
'''"«refse2.refertose.name»"'''
def compilerrefertoEnforcement2 (RefertoEnforcement refe2)
'''"«refe2.refst.name»"'''
//----------------------------------------------------
def compileallRecipient (Recipient recip)
'''	{
		"ID": "«recip.name»",
		"Name": "«recip.recipientname»",
		"Description": "«recip.description»",
		«IF !recip.partof.empty»"Recipient_Parts": [«FOR b:recip.partof SEPARATOR ','»«b.compilerpartr»«ENDFOR»],«ENDIF»
		"Type": "«IF recip.recipientTypeKind=='Individual'»Individual«ELSEIF recip.recipientTypeKind=='Organization'»Organization«ELSE»Individual/Organization«ENDIF»",
		"Scope": "«IF recip.recipientScopeKind=='Internal'»Internal«ELSEIF recip.recipientScopeKind=='External'»External«ELSE»Internal/External«ENDIF»"
		
	}
'''
def compilerpartr (Partof partr)
'''"«partr.partof.recipientname»"'''
//----------------------------------------------------
def compileEnforcement (Enforcement en)
'''	{
		"ID": "«en.name»",
		"Name": "«en.enforcementName»",
		"Description": "«en.enforcementDescription»",
		"Type": "«IF en.enforcementKind=='Action'»Action«/*
		*/»«ELSEIF en.enforcementKind=='Algorithm'»Algorithm«/*
		*/»«ELSEIF en.enforcementKind=='Config'»Config«/*
		*/»«ELSEIF en.enforcementKind=='Process'»Process«/*
		*/»«ELSE»Tool«ENDIF»"
	}
'''
//----------------------------------------------------
def compileService (Service s)
'''	{
		"ID": "«s.name»",
		"Description": "«s.description»",
		«IF s.refprivatedata !=0»"PrivateDatums": [«FOR b:s.refprivatedata SEPARATOR ','»«b.compilerp»«ENDFOR»],«ENDIF»
		«IF !s.servicepartof.empty»"Service_Parts": [«FOR b:s.servicepartof SEPARATOR ','»«b.compilerservicepartof»«ENDFOR»]«ENDIF»
	}
'''
def compilerp (RefPrivateData rp)
'''"«rp.refpr.name»"'''
def compilerservicepartof (ServicePartof b)
'''"«b.refertoservice.name»"'''
//----------------------------------------------------
def compilePrivateData (PrivateData p)
'''	{
		"ID": "«p.name»",
		"Description": "«p.privatedata»",
		"Type": "«IF p.privateDataKind=='PersonalInformation'»PersonalInformation«/*
		*/»«ELSE»UsageInformation«ENDIF»",
		«IF p.attribute!=0»"Attributes": [
		«FOR b:p.attribute SEPARATOR ','»«b.compileatt»«ENDFOR»
		]«ENDIF»
	}
'''
def compileatt (Attribute att)
'''	{
		"name": "«att.name»",
		"Description": "«att.attributeName»"
	}
'''	
}
