package org.coode.owlviz.apitest;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import edu.stanford.smi.protegex.owl.ProtegeOWL;
import edu.stanford.smi.protegex.owl.model.OWLClass;
import edu.stanford.smi.protegex.owl.model.OWLModel;
import edu.stanford.smi.protegex.owl.model.OWLNamedClass;
import uk.ac.man.cs.mig.coode.owlviz.model.OWLKBAssertedGraphModel;
import uk.ac.man.cs.mig.coode.owlviz.ui.renderer.OWLClsNodeLabelRenderer;
import uk.ac.man.cs.mig.coode.owlviz.ui.renderer.OWLClsNodeRenderer;
import uk.ac.man.cs.mig.util.graph.controller.impl.DefaultController;
import uk.ac.man.cs.mig.util.graph.export.impl.PNGExportFormat;
import uk.ac.man.cs.mig.util.graph.layout.dotlayoutengine.DotLayoutEngineProperties;


/**
 * User: matthewhorridge<br>
 * The Univeristy Of Manchester<br>
 * Medical Informatics Group<br>
 * Date: May 4, 2005<br><br>
 * <p/>
 * matthew.horridge@cs.man.ac.uk<br>
 * www.cs.man.ac.uk/~horridgm<br><br>
 */
public class OwlVizCaller {

	public OwlVizCaller() throws Exception {
		FileInputStream is = new FileInputStream("C:\\Users\\User\\Desktop\\runtime-EclipseApplication\\TestLanguage\\src-gen\\linkedin.owl"); 
		OWLModel model = ProtegeOWL.createJenaOWLModelFromInputStream(is);
		
		final DefaultController controller = new DefaultController(new OWLKBAssertedGraphModel(model));
		controller.setNodeRenderer(new OWLClsNodeRenderer(controller,
		                                                  controller.getVisualisedObjectManager(),
		                                                  new OWLClsNodeLabelRenderer(),
		                                                  model));		
		
		OWLNamedClass thing = model.getOWLNamedClass("owl:Thing");
		
		if (thing != null) {
			controller.getVisualisedObjectManager().showObject(thing);
			controller.getVisualisedObjectManager().showChildren(thing, 4, OWLClass.class);
		}
		
		controller.getGraphView().setPreferredSize(new Dimension(400, 400));
		JPanel panel = new JPanel() {
			private static final long serialVersionUID = 1L;

			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				controller.getGraphView().draw((Graphics2D)g, false, false, true, true);
			}
		};

		DotLayoutEngineProperties properties = DotLayoutEngineProperties.getInstance();
		properties.setDotProcessPath("C:/Program Files (x86)/Graphviz2.24/bin/dot.exe");
		controller.getGraphView().revalidateGraph();

		JFrame frm = new JFrame();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setPreferredSize(new Dimension(500, 500));
		frm.setLayout(new BorderLayout());
		frm.add(panel, BorderLayout.CENTER);
		frm.pack();
		frm.setVisible(true);
		frm.show();
		String path = "C:/Users/User/Desktop/test.png";
		PNGExportFormat exportFormat = new PNGExportFormat();
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			exportFormat.export(controller, fos);
			try {
				fos.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String [] args) {
		try {
			new OwlVizCaller();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

