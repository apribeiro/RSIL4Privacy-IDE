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
import rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientTarget
import rslingo.rslil4privacy.rSLIL4Privacy.RefService
import rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement
import rslingo.rslil4privacy.rSLIL4Privacy.Retention
import rslingo.rslil4privacy.rSLIL4Privacy.Service
import rslingo.rslil4privacy.rSLIL4Privacy.ServicePart
import rslingo.rslil4privacy.rSLIL4Privacy.Usage

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RSLIL4Privacy2TextGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile(resource.className + '.txt',
			resource.allContents.filter(typeof(Policy)).map[compile].join(' ')
		)
	}

	def className(Resource res) {
	    var name = res.URI.lastSegment
	    return name.substring(0, name.indexOf('.'))
	}
	
//----------------------------------------------------
def compile(Policy policy)
'''
«policy.name» Privacy Policy
----------------------------------------
«IF !policy.enforcement.empty»

#Enforcement 
------------------
«FOR e:policy.enforcement»«e.compile»«ENDFOR»«ENDIF»
«IF !policy.service.empty»

#Service 
------------------
«FOR s:policy.service»«s.compile»«ENDFOR»«ENDIF»
«IF !policy.recipient.empty»

#Recipients 
------------------
«FOR r:policy.recipient»«r.compile»«ENDFOR»«ENDIF»
«IF !policy.privateData.empty»

#PrivateData 
------------------
«FOR p:policy.privateData»«p.compile»«ENDFOR»«ENDIF»
«IF !policy.collection.empty»

#Collection 
------------------
«FOR c:policy.collection»«c.compile»«ENDFOR»«ENDIF»
«IF !policy.disclosure.empty»

#Disclosure 
------------------
«FOR d:policy.disclosure»«d.compile»«ENDFOR»«ENDIF»
«IF !policy.retention.empty»

#Retention 
------------------
«FOR r:policy.retention»«r.compile»«ENDFOR»«ENDIF»
«IF !policy.usage.empty»

#Usage 
------------------
«FOR u:policy.usage»«u.compile»«ENDFOR»«ENDIF»
«IF !policy.informative.empty»

#Informative 
------------------
«FOR i:policy.informative»«i.compile»«ENDFOR»«ENDIF»
'''
//----------------------------------------------------      
def compile(Enforcement e)
'''
«e.name».«e.enforcementName»(«e.type»):
«e.description»,
'''    
//----------------------------------------------------    
def compile(Service s)
'''
«s.serviceName»:«s.description»,
	«IF !s.servicePart.empty»Service_Part:«FOR part:s.servicePart SEPARATOR ','»«part.compileServicePart»«ENDFOR»,«ENDIF»
	«IF !s.refPrivateData.empty»Refers To PrivateData:«FOR part:s.refPrivateData SEPARATOR ','»«part.compileRefPrivateData»«ENDFOR»,«ENDIF»
'''
//----------------------------------------------------
def compile(Recipient r)
'''
«r.name».«r.recipientName»(«r.scope»-«r.type»):
   «r.description», 
   «IF !r.recipientPart.empty»Recipient_Part:«FOR part:r.recipientPart SEPARATOR ','»«part.compileRecipientPart»«ENDFOR»,«ENDIF»
'''
//----------------------------------------------------
def compile(PrivateData p)
'''
«p.name»(«p.type»): «p.description»,
	Attribute:«FOR a:p.attribute SEPARATOR ','»«a.compile»«ENDFOR»
'''
def compile(Attribute a)
'''«a.name»(«a.name»)'''
//----------------------------------------------------
def compile(Collection c)
'''
«c.name»(«c.modality»):«c.description»,
««««IF !col.partofCollection.empty»Part Of Collection:«FOR a:col.partofCollection SEPARATOR ','»«a.compilercolpart»«ENDFOR»,«ENDIF»
«IF !c.refService.empty»Refers To Service:«FOR s:c.refService SEPARATOR ','»«s.compileRefService»«ENDFOR»,«ENDIF»
«IF !c.refPrivateData.empty»Refers To PrivateData:«FOR p:c.refPrivateData SEPARATOR ','»«p.compileRefPrivateData»«ENDFOR»,«ENDIF»
«IF !c.refEnforcement.empty»Refers To Enforcement:«FOR e:c.refEnforcement SEPARATOR ','»«e.compileRefEnforcement»«ENDFOR»,«ENDIF»
'''
//def compilercolpart (PartofCollection partc)
//'''«partc.partofcoll.name»'''
//----------------------------------------------------
def compile(Disclosure d)
'''
«d.name»(«d.modality»):«d.description»,
««««IF !dis.partofdis.empty»Part Of Disclosure:«FOR a:dis.partofdis SEPARATOR ','»«a.compilerdispart»«ENDFOR»,«ENDIF»
«IF !d.refRecipientTarget.empty»Refers To Recipient:«FOR p:d.refRecipientTarget SEPARATOR ','»«p.compileRefRecipientTarget»«ENDFOR»,«ENDIF»
«IF !d.refService.empty»Refers To Service:«FOR s:d.refService SEPARATOR ','»«s.compileRefService»«ENDFOR»,«ENDIF»
«IF !d.refPrivateData.empty»Refers To PrivateData:«FOR p:d.refPrivateData SEPARATOR ','»«p.compileRefPrivateData»«ENDFOR»,«ENDIF»
«IF !d.refEnforcement.empty»Refers To Enforcement:«FOR e:d.refEnforcement SEPARATOR ','»«e.compileRefEnforcement»«ENDFOR»,«ENDIF»
'''
//def compilerdispart (Partofdis partd)
//'''«partd.partofdis.name»'''
//----------------------------------------------------
def compile(Retention r)
'''
«r.name»(«r.modality»-«r.period»):«r.description»,
««««IF !ret.retentionpartof.empty»Part Of Retention:«FOR a:ret.retentionpartof SEPARATOR ','»«a.compilerretpart»«ENDFOR»,«ENDIF»
«IF !r.refService.empty»Refers To Service:«FOR s:r.refService SEPARATOR ','»«s.compileRefService»«ENDFOR»,«ENDIF»
«IF !r.refPrivateData.empty»Refers To PrivateData:«FOR p:r.refPrivateData SEPARATOR ','»«p.compileRefPrivateData»«ENDFOR»,«ENDIF»
«IF !r.refEnforcement.empty»Refers To Enforcement:«FOR e:r.refEnforcement SEPARATOR ','»«e.compileRefEnforcement»«ENDFOR»,«ENDIF»
'''
//def compilerretpart (Retentionpartof partr)
//'''«partr.partofret.name»'''
//----------------------------------------------------
def compile(Usage u)
'''
«u.name»(«u.modality»):«u.description»,
««««IF !u.usagepartof.empty»Part Of Usage:«FOR a:u.usagepartof SEPARATOR ','»«a.compilerusepart»«ENDFOR»,«ENDIF»
«IF !u.refService.empty»Refers To Service:«FOR b:u.refService SEPARATOR ','»«b.compileRefService»«ENDFOR»,«ENDIF»
«IF !u.refPrivateData.empty»Refers To PrivateData:«FOR p:u.refPrivateData SEPARATOR ','»«p.compileRefPrivateData»«ENDFOR»,«ENDIF»
«IF !u.refEnforcement.empty»Refers To Enforcement:«FOR e:u.refEnforcement SEPARATOR ','»«e.compileRefEnforcement»«ENDFOR»,«ENDIF»
'''
//def compilerusepart (Usagepartof partu)
//'''«partu.partofusage.name»'''
//----------------------------------------------------
def compile(Informative i)
'''
«i.name»(«i.modality»):«i.description»,
««««IF !I.infpartof.empty»Part Of Informative:«FOR a:I.infpartof SEPARATOR ','»«a.compilerIpart»«ENDFOR»,«ENDIF»
«IF !i.refService.empty»Refers To Service:«FOR s:i.refService SEPARATOR ','»«s.compileRefService»«ENDFOR»,«ENDIF»
«IF !i.refPrivateData.empty»Refers To PrivateData:«FOR p:i.refPrivateData SEPARATOR ','»«p.compileRefPrivateData»«ENDFOR»,«ENDIF»
«IF !i.refEnforcement.empty»Refers To Enforcement:«FOR e:i.refEnforcement SEPARATOR ','»«e.compileRefEnforcement»«ENDFOR»,«ENDIF»
'''
//def compilerIpart (Infpartof partI)
//'''«partI.refinf.name»'''
//----------------------------------------------------
def compilePeriod(Retention r) '''   Retention Period:«r.period»''' 

def compileRefRecipientTarget(RefRecipientTarget r) 
'''«r.refRecipientTarget.name»'''

def compileRefService(RefService r)
'''«r.refService.name»'''

def compileServicePart(ServicePart s)
'''«s.servicePart.name»'''

def compileRefPrivateData(RefPrivateData r)
'''«r.refPrivateData.name»'''

def compileRecipientPart(RecipientPart r)
'''«r.recipientPart.name»'''

def compileRefEnforcement(RefEnforcement e)
'''«e.refEnforcement.name»'''

}