import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


public class GM extends JFrame{
	private BoardPanel panel;
	private Mouse m;
	/**
	 * Launch the application.
	 */
	public GM() {
		panel=new BoardPanel();
		m=new Mouse();
		this.setContentPane(panel);
		panel.addMouseListener(m);
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class BoardPanel extends JPanel{
		private static final int rows=3;
		private static final int columns=3;
	
		int xcrood;
		int ycrood;
		public void setXcrood(int w) {
			xcrood=w;
		}
		public void setYcrood(int r) {
			ycrood=r;
		}
		public void paintComponent(Graphics g) {
			int x=this.getHeight()/rows;
			int y=this.getWidth()/columns;
			
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					int a=i*x;
					int b=j*y;
					g.drawRect(a, b, x, y);
				}
			}
			g.setColor(Color.green);
			g.fillOval(xcrood, ycrood, 50, 50);
			panel.repaint(100, 100, 100, 100);
			
			
		}
		
	}
	
	class Mouse implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			
			int x=e.getX();
			int y=e.getY();
			panel.setXcrood(x);
			panel.setYcrood(y);
			panel.repaint();
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		
	}

}
