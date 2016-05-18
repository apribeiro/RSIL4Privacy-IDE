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
	
	def compile(Policy policy)
	'''
	«policy.metadata.name» Privacy Policy
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
	      
	def compile(Enforcement e)
	'''
	«e.name».«e.enforcementName»(«e.type»):
	«e.description»,
	'''
	    
	def compile(Service s)
	'''
	«s.serviceName»:«s.description»,
		«IF !s.servicePart.empty»Service_Part: «FOR part:s.servicePart SEPARATOR ','»«part.compileServicePart»«ENDFOR»,«ENDIF»
		«IF s.refPrivateData != null»Refers To PrivateData: «s.refPrivateData.refPrivateData.compileRefPrivateData»«FOR part:s.refPrivateData.refs», «part.compileRefPrivateData»«ENDFOR»,«ELSEIF s.refPDAll == 'All'»Refers To PrivateData: All,«ENDIF»
	'''
	
	def compile(Recipient r)
	'''
	«r.name».«r.recipientName»(«r.scope»-«r.type»):
	   «r.description», 
	   «IF !r.recipientPart.empty»Recipient_Part: «FOR part:r.recipientPart SEPARATOR ','»«part.compileRecipientPart»«ENDFOR»,«ENDIF»
	'''
	
	def compile(PrivateData p)
	'''
	«p.name»(«p.type»): «p.description»,
		Attribute: «FOR a:p.attribute SEPARATOR ','»«a.compile»«ENDFOR»
	'''
	
	def compile(Attribute a)
	'''«a.name»(«a.name»)'''
	
	def compile(Collection c)
	'''
	«c.name»(«c.modality»): «c.description»,
	«IF c.refService != null»Refers To Service: «c.refService.refService.compileRefService»«FOR s:c.refService.refs», «s.compileRefService»«ENDFOR»,«ELSEIF c.refSAll == 'All'»Refers To Service: All,«ENDIF»
	«IF c.refPrivateData != null»Refers To PrivateData: «c.refPrivateData.refPrivateData.compileRefPrivateData»«FOR p:c.refPrivateData.refs», «p.compileRefPrivateData»«ENDFOR»,«ELSEIF c.refPDAll == 'All'»Refers To PrivateData: All,«ENDIF»
	«IF c.refEnforcement != null»Refers To Enforcement: «c.refEnforcement.refEnforcement.compileRefEnforcement»«FOR e:c.refEnforcement.refs», «e.compileRefEnforcement»«ENDFOR»,«ELSEIF c.refEAll == 'All'»Refers To Enforcement: All,«ENDIF»
	'''
	
	def compile(Disclosure d)
	'''
	«d.name»(«d.modality»): «d.description»,
	«IF d.refRecipient != null»Refers To Recipient: «d.refRecipient.refRecipient.compileRefRecipient»«FOR p:d.refRecipient.refs», «p.compileRefRecipient»«ENDFOR»,«ELSEIF d.refRAll == 'All'»Refers To Recipient: All,«ENDIF»
	«IF d.refService != null»Refers To Service: «d.refService.refService.compileRefService»«FOR s:d.refService.refs», «s.compileRefService»«ENDFOR»,«ELSEIF d.refSAll == 'All'»Refers To Service: All,«ENDIF»
	«IF d.refEnforcement != null»Refers To Enforcement: «d.refEnforcement.refEnforcement.compileRefEnforcement»«FOR e:d.refEnforcement.refs», «e.compileRefEnforcement»«ENDFOR»,«ELSEIF d.refEAll == 'All'»Refers To Enforcement: All,«ENDIF»
	'''
	
	def compile(Retention r)
	'''
	«r.name»(«r.modality»-«r.period»): «r.description»,
	«IF r.refService != null»Refers To Service: «r.refService.refService.compileRefService»«FOR s:r.refService.refs», «s.compileRefService»«ENDFOR»,«ELSEIF r.refSAll == 'All'»Refers To Service: All,«ENDIF»
	«IF r.refPrivateData != null»Refers To PrivateData: «r.refPrivateData.refPrivateData.compileRefPrivateData»«FOR p:r.refPrivateData.refs», «p.compileRefPrivateData»«ENDFOR»,«ELSEIF r.refPDAll == 'All'»Refers To PrivateData: All,«ENDIF»
	«IF r.refEnforcement != null»Refers To Enforcement: «r.refEnforcement.refEnforcement.compileRefEnforcement»«FOR e:r.refEnforcement.refs», «e.compileRefEnforcement»«ENDFOR»,«ELSEIF r.refEAll == 'All'»Refers To Enforcement: All,«ENDIF»
	'''
	
	def compile(Usage u)
	'''
	«u.name»(«u.modality»): «u.description»,
	«IF u.refService != null»Refers To Service: «u.refService.refService.compileRefService»«FOR s:u.refService.refs», «s.compileRefService»«ENDFOR»,«ELSEIF u.refSAll == 'All'»Refers To Service: All,«ENDIF»
	«IF u.refPrivateData != null»Refers To PrivateData: «u.refPrivateData.refPrivateData.compileRefPrivateData»«FOR p:u.refPrivateData.refs», «p.compileRefPrivateData»«ENDFOR»,«ELSEIF u.refPDAll == 'All'»Refers To PrivateData: All,«ENDIF»
	«IF u.refEnforcement != null»Refers To Enforcement: «u.refEnforcement.refEnforcement.compileRefEnforcement»«FOR e:u.refEnforcement.refs», «e.compileRefEnforcement»«ENDFOR»,«ELSEIF u.refEAll == 'All'»Refers To Enforcement: All,«ENDIF»
	'''
	
	def compile(Informative i)
	'''
	«i.name»(«i.modality»): «i.description»,
	«IF i.refService != null»Refers To Service: «i.refService.refService.compileRefService»«FOR s:i.refService.refs», «s.compileRefService»«ENDFOR»,«ELSEIF i.refSAll == 'All'»Refers To Service: All,«ENDIF»
	«IF i.refPrivateData != null»Refers To PrivateData: «i.refPrivateData.refPrivateData.compileRefPrivateData»«FOR p:i.refPrivateData.refs», «p.compileRefPrivateData»«ENDFOR»,«ELSEIF i.refPDAll == 'All'»Refers To PrivateData: All,«ENDIF»
	«IF i.refEnforcement != null»Refers To Enforcement: «i.refEnforcement.refEnforcement.compileRefEnforcement»«FOR e:i.refEnforcement.refs», «e.compileRefEnforcement»«ENDFOR»,«ELSEIF i.refEAll == 'All'»Refers To Enforcement: All,«ENDIF»
	'''
	
	def compilePeriod(Retention r)
	'''   Retention Period:«r.period»''' 
	
	def compileRefRecipient(Recipient r) 
	'''«r.name»'''
	
	def compileRefService(Service s)
	'''«s.name»'''
	
	def compileServicePart(ServicePart s)
	'''«s.servicePart.name»'''
	
	def compileRefPrivateData(PrivateData p)
	'''«p.name»'''
	
	def compileRecipientPart(RecipientPart r)
	'''«r.recipientPart.name»'''
	
	def compileRefEnforcement(Enforcement e)
	'''«e.name»'''

}