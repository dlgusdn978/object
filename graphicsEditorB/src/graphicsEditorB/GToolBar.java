package graphicsEditorB;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class GToolBar extends JToolBar{

	private static final long serialVersionUID = 1L;
	
	private JButton rectButton;
	private JButton ovalButton;
	
	private GPanel panel;
	
	public GToolBar() {
		ActionHandler actionHandler = new ActionHandler();
		
		this.rectButton = new JButton("Rect");
		this.rectButton.addActionListener(actionHandler);
		this.add(this.rectButton);
		
		this.ovalButton = new JButton("Oval");
		this.ovalButton.addActionListener(actionHandler);
		this.add(this.ovalButton);
	}
	public void setAssociation(GPanel panel) {
		this.panel = panel;
	}
	private class ActionHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(rectButton)) {
				panel.setSelection("rectButton");
			} else if(e.getSource().equals(ovalButton)) {
				panel.setSelection("ovalButton");
			}
		}
	}
}
