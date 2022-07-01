package graphicsEditorB;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JPanel;

public class GPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private String selection;
	
	public GPanel() {
		//initialize attributes
		this.setBackground(Color.WHITE);
		//initialize components
		MouseHandler mouseHandler = new MouseHandler();
		this.addMouseListener(mouseHandler);
		this.addMouseMotionListener(mouseHandler);
		this.addMouseWheelListener(mouseHandler);
		
	}
	public void setSelection(String selection) {
		this.selection = selection;
	}
	public void paint(Graphics graphics) {
		super.paint(graphics);
	}

	private class MouseHandler implements MouseListener, MouseMotionListener, MouseWheelListener{
		private int x0, y0, x1, y1;
		
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			x0 = e.getX();
			y0 = e.getY();
			x1 = x0;
			y1 = y0;
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			Graphics2D graphics2D = (Graphics2D) getGraphics();
			graphics2D.setXORMode(getBackground());
			if(selection.equals("rectButton")) {
				graphics2D.drawRect(x0,y0, x1-x0, y1-y0);
				x1 = e.getX();
				y1 = e.getY();
				graphics2D.drawRect(x0,y0, x1-x0, y1-y0);
			} else if(selection.equals("ovalButton")) {
				graphics2D.drawOval(x0,y0, x1-x0, y1-y0);
				x1 = e.getX();
				y1 = e.getY();
				graphics2D.drawOval(x0,y0, x1-x0, y1-y0);
			}
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}
