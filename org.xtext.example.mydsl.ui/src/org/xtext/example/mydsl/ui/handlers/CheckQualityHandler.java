package org.xtext.example.mydsl.ui.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.util.SimpleIRIMapper;
import org.xtext.example.mydsl.ui.windows.MenuCommand;
import org.xtext.example.mydsl.ui.windows.MenuCommandWindow;

import eddy.example.ConflictExample;
import eddy.lang.Policy;
import eddy.lang.analysis.CompilationProfile;
import eddy.lang.analysis.Conflict;
import eddy.lang.analysis.ConflictAnalyzer;
import eddy.lang.analysis.ConflictPrinter;
import eddy.lang.analysis.Extension;
import eddy.lang.analysis.ExtensionCalculator;
import eddy.lang.parser.Compilation;
import eddy.lang.parser.Compiler;
import eddy.lang.parser.Parser;

public class CheckQualityHandler extends AbstractHandler {

	private static final String FILE_EXT = ".policy";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveMenuSelection(event);
		
		// Check if the command was triggered using the ContextMenu
		if (selection != null) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			IFile file = (IFile) structuredSelection.getFirstElement();
			callEddyReasoner(file);
		} else {
			IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			MenuCommand cmd = new MenuCommand() {
				@Override
				public void execute(IProject project, IFile file) {
					callEddyReasoner(file);
				}
			};
			MenuCommandWindow window = new MenuCommandWindow(workbenchWindow.getShell(),
					cmd, false, FILE_EXT);
			window.open();
		}
		
		return null;
	}

	private void callEddyReasoner(IFile file) {
		System.out.println(file.getName() + " checked!");
		// TODO Call Eddy Engine
		try {
			final String filestub = "examples/example.conflicts";
			final String exampleName = ConflictExample.class.getName();
			boolean useLocal = true;
			
			long time = System.currentTimeMillis();
			Parser parser = new Parser();
			Policy policy = parser.parse(new File(file.getLocation().toOSString()));//filestub + ".policy"));
			Compiler compiler = new Compiler();
			
			// use the local copy of the upper ontology
			if (useLocal) {
				IRI docIRI = IRI.create("http://gaius.isri.cmu.edu/2011/8/policy-base.owl");
				SimpleIRIMapper mapper = new SimpleIRIMapper(docIRI, IRI.create(new File("examples/policy-base.owl")));
				compiler.getManager().addIRIMapper(mapper);
				
				// tell extension calculator to use local ontology
				ExtensionCalculator.setOntologyBasePolicy("examples/policy-base.owl");
			}
			
			// compile the policy
			Compilation comp = compiler.compile(policy);
			time = System.currentTimeMillis() - time;
			System.err.println(exampleName + ": Parsing policy... " + (time / 1000) + " secs");
			
			// compute extension and detect conflicts
			System.err.print(exampleName + ": Detecting conflicts..");
			time = System.currentTimeMillis();
			
			ConflictAnalyzer analyzer = new ConflictAnalyzer();
			ExtensionCalculator calc = new ExtensionCalculator();
			Extension ext = calc.extend(comp);
			ArrayList<Conflict> conflicts = analyzer.analyze(ext);
			
			time = System.currentTimeMillis() - time;
			System.err.println(". " + (time / 1000) + " secs");
			
			// report the conflicts
			ConflictPrinter printer = new ConflictPrinter(System.err);
			TreeSet<String> rules = new TreeSet<String>();
			for (Conflict c : conflicts) {
				/*
				System.err.println(exampleName + ": Conflict at " + c.toString());
				rules.add(c.rule1.id);
				rules.add(c.rule2.id);
				//*/
				printer.print(c);
			}
			printer.close();
			
			if (conflicts.size() > 0) {
				System.err.println(exampleName + ": Found " + conflicts.size() + " conflicting interpretations across " + rules.size() + " rules");
			}
			else {
				System.err.println(exampleName + ": No conflicts found");
			}
			
			// save the ontology to a file for inspection
			OWLOntology ontology = comp.getOntology();
			OWLOntologyManager manager = ontology.getOWLOntologyManager();
			manager.saveOntology(ontology, IRI.create(new File(filestub + ".owl")));
			System.err.println(exampleName + ": Saved ontology as '" + filestub + ".owl'");
			
			System.err.println(exampleName + ": Finished.");
			CompilationProfile.computeProfile(comp);
			comp.printProperties(System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
