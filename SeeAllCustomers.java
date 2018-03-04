import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JRadioButton;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JScrollBar;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.ScrollPane;
import javax.swing.JTextField;
import javax.swing.DropMode;

public class SeeAllCustomers extends JFrame {

	private JPanel contentPane;
	File file=new File ("Zoo.txt");
	
	private final ScrollPane scrollPane = new ScrollPane();
	private JLabel textField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeeAllCustomers frame = new SeeAllCustomers();
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
	public SeeAllCustomers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 776);
		contentPane = new JPanel();
	
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JLabel();
		JScrollPane ScrollPane = new JScrollPane(textField,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		ScrollPane.setBounds( 0, 0, 600, 600);
		contentPane.add(ScrollPane);

		
		
		if( file.exists()) {
			try {
				 FileReader r=new FileReader(file);
				 BufferedReader b=new BufferedReader(r);
				 String line;
				 int y=1;
				 int heigth =50;
				 int x=Short.MAX_VALUE;
				while ((line=b.readLine())!=null) {
				
					JLabel lblNewLabel = new JLabel(line);
					lblNewLabel.setBounds(0, y, x, heigth);
					lblNewLabel.setOpaque(true);
					lblNewLabel.setBackground(Color.WHITE);
					lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
					y=y+heigth;
					textField.add(lblNewLabel);
					}
				 b.close();
				 r.close();
			}catch(IOException e) {
				
			}
		}
		
	 }
}
