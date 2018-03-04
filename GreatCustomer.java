import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GreatCustomer extends JFrame{

	private JFrame frame;
	private JTextField txtEnterTheName;
	private JTextField txtEnterThePhone;
	private JTextField txtEnterWork;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GreatCustomer window = new GreatCustomer();
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
	public GreatCustomer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 442, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		panel.setBackground(Color.BLUE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(38, 11, 78, 30);
		panel.add(lblNewLabel);
		
		txtEnterTheName = new JTextField();
		txtEnterTheName.setText("enter the name");
		txtEnterTheName.setBounds(169, 16, 159, 20);
		panel.add(txtEnterTheName);
		txtEnterTheName.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(38, 73, 46, 14);
		panel.add(lblPhone);
		
		txtEnterThePhone = new JTextField();
		txtEnterThePhone.setText("enter the phone");
		txtEnterThePhone.setBounds(167, 70, 159, 17);
		panel.add(txtEnterThePhone);
		txtEnterThePhone.setColumns(10);
		
		JLabel lblWork = new JLabel("Work:");
		lblWork.setBounds(27, 170, 46, 14);
		panel.add(lblWork);
		
		txtEnterWork = new JTextField();
		txtEnterWork.setText("enter work");
		txtEnterWork.setBounds(169, 167, 86, 20);
		panel.add(txtEnterWork);
		txtEnterWork.setColumns(10);
		
	}
}
