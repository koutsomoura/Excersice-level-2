import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Font;

public class TryFrame extends JFrame {
	private JPanel contentPane;
	File file=new File ("Zoo.txt");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryFrame frame = new TryFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TryFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.DARK_GRAY);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Create new customer");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreateCustomerTrySwing c=new CreateCustomerTrySwing();
				c.setVisible(true);
			}
		});
		btnNewButton.setBounds(118, 36, 181, 54);
		contentPane.add(btnNewButton);
		
		JButton btnSeeAllCustomers = new JButton("See All Customers");
		btnSeeAllCustomers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SeeAllCustomers s=new SeeAllCustomers();
				s.setVisible(true);
			}
		});
		btnSeeAllCustomers.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSeeAllCustomers.setForeground(Color.BLACK);
		btnSeeAllCustomers.setBounds(117, 132, 182, 54);
		contentPane.add(btnSeeAllCustomers);
	}
}
