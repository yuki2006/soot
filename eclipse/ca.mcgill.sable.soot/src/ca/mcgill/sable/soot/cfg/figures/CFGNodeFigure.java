/*
 * Created on Jan 15, 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package ca.mcgill.sable.soot.cfg.figures;

import org.eclipse.draw2d.*;
import java.util.*;
import org.eclipse.swt.*;
import org.eclipse.swt.graphics.*;
import ca.mcgill.sable.soot.*;
import org.eclipse.draw2d.text.*;
import ca.mcgill.sable.soot.editors.*;
/**
 * @author jlhotak
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CFGNodeFigure extends Figure {

	private Panel nodeFigure;//RectangleFigure rect;

	private XYAnchor srcAnchor;
	private XYAnchor tgtAnchor;	

	private CFGNodeDataFigure data;
	private CFGFlowFigure before;
	private CFGFlowFigure after;
	
	private boolean hasBefore;
	private boolean hasAfter;
	
	Font f = new Font(null, "Arial", 8, SWT.NORMAL);
		
	
	/**
	 * 
	 */
	public CFGNodeFigure() {
		super();
		

		ToolbarLayout layout = new ToolbarLayout();
		layout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
	
		this.setLayoutManager(layout);
		layout.setStretchMinorAxis(false);
	
	}

	
	private int getLineBreak(String text){
		return text.lastIndexOf(" ", 50);
	}
	


	/**
	 * @return
	 */
	public Panel getNodeFigure() {
		return nodeFigure;
	}

	/**
	 * @param panel
	 */
	public void setNodeFigure(Panel panel) {
		nodeFigure = panel;
	}



	

	/**
	 * @param figure
	 */
	public void setAfter(CFGFlowFigure figure) {
		after = figure;
	}

	/**
	 * @param figure
	 */
	public void setBefore(CFGFlowFigure figure) {
		before = figure;
	}

	/**
	 * @param figure
	 */
	public void setData(CFGNodeDataFigure figure) {
		data = figure;
	}

	/**
	 * @return
	 */
	public CFGFlowFigure getAfter() {
		return after;
	}

	/**
	 * @return
	 */
	public CFGFlowFigure getBefore() {
		return before;
	}

	/**
	 * @return
	 */
	public CFGNodeDataFigure getData() {
		return data;
	}

	/**
	 * @return
	 */
	public XYAnchor getSrcAnchor() {
		int x = this.getBounds().x;
		int y = this.getBounds().y;
		int width = this.getBounds().width;
		int height = this.getBounds().height;
		org.eclipse.draw2d.geometry.Point p = new org.eclipse.draw2d.geometry.Point(x+width/2, y+height);
		return new XYAnchor(p);
	}

	/**
	 * @return
	 */
	public XYAnchor getTgtAnchor() {
		return tgtAnchor;
	}

	

}