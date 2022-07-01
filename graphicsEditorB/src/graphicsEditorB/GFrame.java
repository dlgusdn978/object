package graphicsEditorB;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GFrame extends JFrame{
	//attributes
	private static final long serialVersionUID = 1L;
	
	//components
	private GToolBar toolBar;
	private GPanel panel;
	
	public GFrame() {
		//initialize attribute
		this.setLocation(100, 200);
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//initialize components
		BorderLayout layoutManager = new BorderLayout();
		this.getContentPane().setLayout(layoutManager);
		
		this.toolBar = new GToolBar();
		this.getContentPane().add(this.toolBar, BorderLayout.NORTH);
		
		this.panel = new GPanel();
		this.getContentPane().add(panel, BorderLayout.CENTER);
		
		this.toolBar.setAssociation(this.panel);
	}
	
}
