import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Color;

public class Calculate {

	private JFrame frmDa;
	private JTextField textField;
	private String firstnum;
	private String lastnum;
	private String operation;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculate window = new Calculate();
					window.frmDa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDa = new JFrame();
		frmDa.getContentPane().setForeground(Color.MAGENTA);
		frmDa.setBounds(100, 100, 325, 446);
		frmDa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDa.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 280, 46);
		frmDa.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterpath=textField.getText()+btnNewButton.getText();
				textField.setText(enterpath);
			}
		});
		btnNewButton.setBounds(20, 71, 47, 46);
		frmDa.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"2");
			}
		});
		button.setBounds(96, 68, 47, 46);
		frmDa.getContentPane().add(button);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"3");
			}
		});
		button_1.setBounds(171, 68, 47, 46);
		frmDa.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=textField.getText();
				textField.setText("");
				operation="*";
			}
		});
		button_2.setBounds(243, 206, 47, 46);
		frmDa.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"4");
			}
		});
		button_3.setBounds(20, 141, 47, 46);
		frmDa.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setForeground(Color.BLACK);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"5");
			}
		});
		button_4.setBounds(96, 141, 47, 46);
		frmDa.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"6");
			}
		});
		button_5.setBounds(171, 141, 47, 46);
		frmDa.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=textField.getText();
				textField.setText("");
				operation="-";
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_6.setBounds(20, 351, 47, 40);
		frmDa.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"7");
			}
		});
		button_7.setBounds(20, 206, 47, 46);
		frmDa.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"8");
			}
		});
		button_8.setBounds(96, 206, 47, 46);
		frmDa.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"9");
			}
		});
		button_9.setBounds(171, 206, 47, 46);
		frmDa.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("/");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				firstnum=textField.getText();
				textField.setText("");
				operation="/";
			}
		});
		button_10.setBounds(243, 284, 47, 40);
		frmDa.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("0");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"0");
			}
		});
		button_11.setBounds(20, 281, 47, 46);
		frmDa.getContentPane().add(button_11);
		
		JButton button_12 = new JButton(".");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+".");
			}
		});
		button_12.setBounds(96, 281, 47, 46);
		frmDa.getContentPane().add(button_12);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		btnC.setBounds(171, 283, 47, 43);
		frmDa.getContentPane().add(btnC);
		
		JButton button_14 = new JButton("+");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=textField.getText();
				textField.setText("");
				operation="+";
			}
		});
		button_14.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		button_14.setBounds(96, 353, 47, 40);
		frmDa.getContentPane().add(button_14);
		
		JButton button_18 = new JButton("=");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double result;
				String printresult;
				lastnum=textField.getText();
				double l=Double.parseDouble(lastnum);
				double f=Double.parseDouble(firstnum);

				if (operation=="+"){
					result=f+l;
					firstnum=String.valueOf(result);
					printresult=String.valueOf( result);
					textField.setText(printresult);
					
				}
				else if (operation=="-"){
					result=f-l;
					firstnum=String.valueOf(result);
					printresult=String.valueOf( result);
					textField.setText(printresult);
				}
				else if (operation=="*"){
					result=f*l;
					firstnum=String.valueOf(result);
					printresult=String.valueOf( result);
					textField.setText(printresult);
				}
				else if (operation=="/"){
					result=f/l;
					firstnum=String.valueOf(result);
					printresult=String.valueOf( result);
					textField.setText(printresult);
				}
			}
		});
		 JButton button_13 = new JButton("<-");
		    button_13.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent arg0) {
		    		String key=textField.getText();
		    		if (key.length()>0) {
		    		String key2=key.substring(0, key.length()-1);
		    		textField.setText(key2);
		    		}else {
		    		textField.setText("");
		    		}
		    	}
		    });
		    button_13.setBounds(243, 149, 56, 46);
		    frmDa.getContentPane().add(button_13);
		    
		button_18.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_18.setBounds(171, 349, 119, 40);
		frmDa.getContentPane().add(button_18);
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_1.setEnabled(true);
				button_3.setEnabled(true);
				button_2.setEnabled(true);
				button_4.setEnabled(true);
				button_5.setEnabled(true);
				button_6.setEnabled(true);
				button_7.setEnabled(true);
				button_8.setEnabled(true);
				button_9.setEnabled(true);
				button_10.setEnabled(true);
				button_11.setEnabled(true);
				button_12.setEnabled(true);
				button_14.setEnabled(true);
				button_18.setEnabled(true);
				btnC.setEnabled(true);
				btnNewButton.setEnabled(true);
				button.setEnabled(true);
				textField.setEnabled(true);
				button_13.setEnabled(true);
		}
		});
		rdbtnNewRadioButton.setBounds(243, 64, 62, 33);
		frmDa.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_1.setEnabled(false);
				button_3.setEnabled(false);
				button_2.setEnabled(false);
				button_4.setEnabled(false);
				button_5.setEnabled(false);
				button_6.setEnabled(false);
				button_7.setEnabled(false);
				button_8.setEnabled(false);
				button_9.setEnabled(false);
				button_10.setEnabled(false);
				button_11.setEnabled(false);
				button_12.setEnabled(false);
				button_14.setEnabled(false);
				button_18.setEnabled(false);
				btnC.setEnabled(false);
				btnNewButton.setEnabled(false);
				button.setEnabled(false);
				textField.setText("");
				textField.setEnabled(false);
				button_13.setEnabled(false);
			}
		});
		rdbtnNewRadioButton_1.setBounds(243, 100, 56, 33);
		frmDa.getContentPane().add(rdbtnNewRadioButton_1);

		ButtonGroup group = new ButtonGroup(); 
	    group.add(rdbtnNewRadioButton_1);
	    group.add(rdbtnNewRadioButton);
	    

	}
}
