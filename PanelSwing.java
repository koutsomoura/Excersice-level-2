import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.DebugGraphics;

public class PanelSwing extends JFrame{

	private JFrame frame;
	private JPanel panel;
	/** 	
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelSwing window = new PanelSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PanelSwing() {
		initialize();
	}
	public  void close() {
		WindowEvent winclosingEvent= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent (winclosingEvent);
		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 411, 746);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panel = new JPanel();
		panel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GreatCustomer greatCustomner=new GreatCustomer();
				greatCustomner.setVisible(true);
				close();
			}
		});
		btnNewButton.setBounds(111, 68, 125, 57);
		panel.add(btnNewButton);
		

		
		
	}
}
