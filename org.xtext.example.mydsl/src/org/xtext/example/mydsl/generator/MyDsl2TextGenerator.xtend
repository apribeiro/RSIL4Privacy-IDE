package org.xtext.example.mydsl.generator


import org.eclipse.emf.ecore.resource.Resource
import org.xtext.example.mydsl.myDsl.Policy
import org.xtext.example.mydsl.myDsl.PrivateData
import org.xtext.example.mydsl.myDsl.Recipient
import org.xtext.example.mydsl.myDsl.Partof
import org.xtext.example.mydsl.myDsl.Service
import org.xtext.example.mydsl.myDsl.ReferToService
import org.xtext.example.mydsl.myDsl.Attribute
import org.xtext.example.mydsl.myDsl.Collection
import org.xtext.example.mydsl.myDsl.Disclosure
import org.xtext.example.mydsl.myDsl.Retention
import org.xtext.example.mydsl.myDsl.Usage
import org.xtext.example.mydsl.myDsl.Informative
import org.xtext.example.mydsl.myDsl.RefertoEnforcement
import org.xtext.example.mydsl.myDsl.Enforcement
import org.xtext.example.mydsl.myDsl.ReferToRecipientTarget
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.example.mydsl.myDsl.RefPrivateData
import org.xtext.example.mydsl.myDsl.ServicePartof

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDsl2TextGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile(resource.className + '.txt', 		
resource.allContents.filter(typeof(Policy)).map[compilepo].join('

'))}       
//----------------------------------------------------  

def className(Resource res) {
    var name = res.URI.lastSegment
    return name.substring(0, name.indexOf('.'))
    }
//----------------------------------------------------
def compilepo(Policy policy)
'''
«policy.name» Privacy Policy
----------------------------------------
«IF !policy.enforcement.empty»

#Enforcement 
------------------
«FOR x:policy.enforcement»«x.compileEn»«ENDFOR»«ENDIF»
«IF !policy.service.empty»

#Service 
------------------
«FOR x:policy.service»«x.compileSer»«ENDFOR»«ENDIF»
«IF !policy.recipient.empty»

#Recipients 
------------------
«FOR x:policy.recipient»«x.compileRec»«ENDFOR»«ENDIF»
«IF !policy.privateData.empty»

#PrivateData 
------------------
«FOR x:policy.privateData»«x.compilePr»«ENDFOR»«ENDIF»
«IF !policy.collection.empty»

#Collection 
------------------
«FOR x:policy.collection»«x.compilecol»«ENDFOR»«ENDIF»

«IF !policy.disclosure.empty»

#Disclosure 
------------------
«FOR x:policy.disclosure»«x.compiledis»«ENDFOR»«ENDIF»
«IF !policy.retention.empty»

#Retention 
------------------
«FOR x:policy.retention»«x.compileret»«ENDFOR»«ENDIF»
«IF !policy.usage.empty»

#Usage 
------------------
«FOR x:policy.usage»«x.compileuset»«ENDFOR»«ENDIF»
«IF !policy.informative.empty»

#Informative 
------------------
«FOR x:policy.informative»«x.compileinf»«ENDFOR»«ENDIF»
'''
//----------------------------------------------------      
def compileEn(Enforcement En)
'''
«En.name».«En.enforcementName»(«En.enforcementKind»):
«En.enforcementDescription»,
'''    
//----------------------------------------------------    
def compileSer(Service se)
'''
«se.servicename»:«se.description»,
	«IF !se.servicepartof.empty»Service_Part:«FOR part:se.servicepartof SEPARATOR ','»«part.compilerespart»«ENDFOR»,«ENDIF»
	«IF !se.refprivatedata.empty»Refers To PrivateData:«FOR part:se.refprivatedata SEPARATOR ','»«part.compilerrefp»«ENDFOR»,«ENDIF»
'''
//----------------------------------------------------
def compileRec (Recipient r)
'''
«r.name».«r.recipientname»(«r.recipientScopeKind»-«r.recipientTypeKind»):
   «r.description», 
   «IF !r.partof.empty»Recipient_Part:«FOR part:r.partof SEPARATOR ','»«part.compilepart»«ENDFOR»,«ENDIF»
'''
//----------------------------------------------------
def compilePr(PrivateData e)
'''
«e.name»(«e.privateDataKind»): «e.privatedata»,
	Attribute:«FOR a:e.attribute SEPARATOR ','»«a.compile»«ENDFOR»
'''
def compile(Attribute a)
'''«a.name»(«a.attributeName»)'''
//----------------------------------------------------
def compilecol(Collection col)
'''
«col.name»(«col.modalitykind»):«col.description»,
««««IF !col.partofCollection.empty»Part Of Collection:«FOR a:col.partofCollection SEPARATOR ','»«a.compilercolpart»«ENDFOR»,«ENDIF»
«IF !col.refertoservice.empty»Refers To Service:«FOR b:col.refertoservice SEPARATOR ','»«b.compilerespart»«ENDFOR»,«ENDIF»
«IF !col.refprivatedata.empty»Refers To PrivateData:«FOR p:col.refprivatedata SEPARATOR ','»«p.compilerrefp»«ENDFOR»,«ENDIF»
«IF !col.refertoEnforcement.empty»Refers To Enforcement:«FOR p:col.refertoEnforcement SEPARATOR ','»«p.compilerreEn»«ENDFOR»,«ENDIF»
'''
//def compilercolpart (PartofCollection partc)
//'''«partc.partofcoll.name»'''
//----------------------------------------------------
def compiledis(Disclosure dis)
'''
«dis.name»(«dis.modalitykind»):«dis.description»,
««««IF !dis.partofdis.empty»Part Of Disclosure:«FOR a:dis.partofdis SEPARATOR ','»«a.compilerdispart»«ENDFOR»,«ENDIF»
«IF !dis.referToRecipienttarget.empty»Refers To Recipient:«FOR p:dis.referToRecipienttarget SEPARATOR ','»«p.compileres»«ENDFOR»,«ENDIF»
«IF !dis.refertoservice.empty»Refers To Service:«FOR b:dis.refertoservice SEPARATOR ','»«b.compilerespart»«ENDFOR»,«ENDIF»
«IF !dis.refprivatedata.empty»Refers To PrivateData:«FOR p:dis.refprivatedata SEPARATOR ','»«p.compilerrefp»«ENDFOR»,«ENDIF»
«IF !dis.refertoEnforcement.empty»Refers To Enforcement:«FOR d:dis.refertoEnforcement SEPARATOR ','»«d.compilerreEn»«ENDFOR»,«ENDIF»
'''
//def compilerdispart (Partofdis partd)
//'''«partd.partofdis.name»'''
//----------------------------------------------------
def compileret(Retention ret)
'''
«ret.name»(«ret.modalitykind»-«ret.period»):«ret.description»,
««««IF !ret.retentionpartof.empty»Part Of Retention:«FOR a:ret.retentionpartof SEPARATOR ','»«a.compilerretpart»«ENDFOR»,«ENDIF»
«IF !ret.refertoservice.empty»Refers To Service:«FOR b:ret.refertoservice SEPARATOR ','»«b.compilerespart»«ENDFOR»,«ENDIF»
«IF !ret.refprivatedata.empty»Refers To PrivateData:«FOR p:ret.refprivatedata SEPARATOR ','»«p.compilerrefp»«ENDFOR»,«ENDIF»
«IF !ret.refertoEnforcement.empty»Refers To Enforcement:«FOR p:ret.refertoEnforcement SEPARATOR ','»«p.compilerreEn»«ENDFOR»,«ENDIF»
'''
//def compilerretpart (Retentionpartof partr)
//'''«partr.partofret.name»'''
//----------------------------------------------------
def compileuset(Usage u)
'''
«u.name»(«u.modalitykind»):«u.description»,
««««IF !u.usagepartof.empty»Part Of Usage:«FOR a:u.usagepartof SEPARATOR ','»«a.compilerusepart»«ENDFOR»,«ENDIF»
«IF !u.refertoservice.empty»Refers To Service:«FOR b:u.refertoservice SEPARATOR ','»«b.compilerespart»«ENDFOR»,«ENDIF»
«IF !u.refprivatedata.empty»Refers To PrivateData:«FOR p:u.refprivatedata SEPARATOR ','»«p.compilerrefp»«ENDFOR»,«ENDIF»
«IF !u.refertoEnforcement.empty»Refers To Enforcement:«FOR p:u.refertoEnforcement SEPARATOR ','»«p.compilerreEn»«ENDFOR»,«ENDIF»
'''
//def compilerusepart (Usagepartof partu)
//'''«partu.partofusage.name»'''
//----------------------------------------------------
def compileinf(Informative I)
'''
«I.name»(«I.modalitykind»):«I.description»,
««««IF !I.infpartof.empty»Part Of Informative:«FOR a:I.infpartof SEPARATOR ','»«a.compilerIpart»«ENDFOR»,«ENDIF»
«IF !I.refertoservice.empty»Refers To Service:«FOR b:I.refertoservice SEPARATOR ','»«b.compilerespart»«ENDFOR»,«ENDIF»
«IF !I.refprivatedata.empty»Refers To PrivateData:«FOR p:I.refprivatedata SEPARATOR ','»«p.compilerrefp»«ENDFOR»,«ENDIF»
«IF !I.refertoEnforcement.empty»Refers To Enforcement:«FOR p:I.refertoEnforcement SEPARATOR ','»«p.compilerreEn»«ENDFOR»,«ENDIF»
'''
//def compilerIpart (Infpartof partI)
//'''«partI.refinf.name»'''
//----------------------------------------------------
def compilepe(Retention pe) '''   Retention Period:«pe.period»''' 
def compileres(ReferToRecipientTarget r) 
'''«r.refertore.name»'''
def compilerespart (ReferToService sp)
'''«sp.refertose.name»'''
def compilerespart (ServicePartof sp)
'''«sp.refertoservice.name»'''
def compilerrefp (RefPrivateData pp)
'''«pp.refpr.name»'''
def compilepart (Partof part)
'''«part.partof.name»'''
def compilerreEn (RefertoEnforcement en)
'''«en.refst.name»'''
}   
