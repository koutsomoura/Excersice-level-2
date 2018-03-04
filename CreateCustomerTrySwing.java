import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javafx.scene.paint.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class CreateCustomerTrySwing extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterThePhone;
	private JTextField txtEnterTheName;
	private JTextField txtEnterTheWork;
	File file=new File ("Zoo.txt");
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateCustomerTrySwing frame = new CreateCustomerTrySwing();
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
	public CreateCustomerTrySwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(29, 47, 102, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setBounds(29, 159, 102, 31);
		contentPane.add(lblPhone);
		
		JLabel lblWork = new JLabel("Work:");
		lblWork.setHorizontalAlignment(SwingConstants.CENTER);
		lblWork.setBounds(29, 277, 102, 31);
		contentPane.add(lblWork);
		
		
		txtEnterThePhone = new JTextField();
		txtEnterThePhone.setText("enter Phone");
		txtEnterThePhone.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterThePhone.setBounds(197, 159, 142, 31);
		txtEnterThePhone.setColumns(10);
		contentPane.add(txtEnterThePhone);

		txtEnterTheName = new JTextField();
		txtEnterTheName.setText("enter the name");
		txtEnterTheName.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterTheName.setColumns(10);
		txtEnterTheName.setBounds(197, 52, 142, 31);
		contentPane.add(txtEnterTheName);

		txtEnterTheWork = new JTextField();
		txtEnterTheWork.setText("enter the work");
		txtEnterTheWork.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterTheWork.setColumns(10);
		txtEnterTheWork.setBounds(197, 277, 142, 31);
		contentPane.add(txtEnterTheWork);

		JButton btnNewButton_1 = new JButton("Creat");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				paramString();
				try{
					if(file.exists()) {
						
					}else {
					file.createNewFile();
					}
					FileWriter write=new FileWriter (file,true);
					write.write(txtEnterTheName.getText()+":"+txtEnterThePhone.getText()+":"+txtEnterTheWork.getText()+"\r\n");
					
					write.close();
					JOptionPane.showMessageDialog(null, "Saved");
					txtEnterTheWork.setText("");
					txtEnterTheName.setText("");
					txtEnterThePhone.setText("");

				}catch(IOException e){
					
				}
			}
		});
		btnNewButton_1.setBounds(123, 341, 176, 44);
		contentPane.add(btnNewButton_1);

	}
}
