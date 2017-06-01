import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Iterator;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblNewLabel_1;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private String nameToTravel;
	private int levelToMove;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 private MatisseConnector mtc;

	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		user = new JTextField();
		user.setBounds(414, 304, 192, 45);
		contentPane.add(user);
		user.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(414, 360, 192, 45);
		contentPane.add(pass);
		
		JButton Login = new JButton("Login");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			   int userId=Integer.parseInt(user.getText());
			   String password=pass.getText();
			   if (FindStaff(userId,password ) == true ) {
			   SelectOption page=new SelectOption(nameToTravel,levelToMove);
			   page.setVisible(true);
		 	                      }
			   else{
				   JOptionPane.showMessageDialog(contentPane,
						    "Wrong username or password",
						    "Inane error",
						    JOptionPane.ERROR_MESSAGE);
			   }
		}});
		Login.setBounds(462, 427, 89, 23);
		contentPane.add(Login);
		JLabel lblNewLabel = new JLabel("Please Sigin In");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(434, 229, 158, 53);
		contentPane.add(lblNewLabel);
		
		lblUsername = new JLabel("User ID");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsername.setBounds(308, 298, 96, 53);
		contentPane.add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(308, 352, 96, 53);
		contentPane.add(lblPassword);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Hussein\\Desktop\\ecqlips pro\\Final Project\\logo.jpg"));
		lblNewLabel_1.setBounds(32, 29, 309, 87);
		contentPane.add(lblNewLabel_1);
		
		separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBackground(Color.RED);
		separator.setBounds(0, 19, 984, 5);
		contentPane.add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(Color.GRAY);
		separator_1.setBackground(Color.RED);
		separator_1.setBounds(0, 20, 984, 5);
		contentPane.add(separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.GRAY);
		separator_2.setBackground(new Color(75, 0, 130));
		separator_2.setBounds(21, 0, 5, 661);
		contentPane.add(separator_2);
		
		separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.GRAY);
		separator_3.setBackground(new Color(75, 0, 130));
		separator_3.setBounds(22, 0, 5, 661);
		contentPane.add(separator_3);
		
		separator_4 = new JSeparator();
		separator_4.setForeground(Color.GRAY);
		separator_4.setBackground(Color.RED);
		separator_4.setBounds(0, 21, 984, 5);
		contentPane.add(separator_4);
		
		separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setForeground(Color.GRAY);
		separator_5.setBackground(new Color(75, 0, 130));
		separator_5.setBounds(23, 0, 5, 661);
		contentPane.add(separator_5);
	}
	public boolean FindStaff(int userVal,String passVal ) 
	{
		mtc = new MatisseConnector();
		mtc.connect();
 		Iterator<Staff> e = Staff.instanceIterator(mtc.getDB());
        boolean checker = false;
 		Staff tempEmp;
		int position = 0;
		while (e.hasNext()) {
		 	tempEmp = e.next();
		    if(tempEmp.getStaffId() == userVal && tempEmp.getPassword().equals(passVal))
		    {
		    	levelToMove =  tempEmp.getStaffLevel();
		    	nameToTravel = tempEmp.getStaffName();
		    	checker = true;
		    	break;
		    }
		}
		mtc.disconnect();
	if(checker == true)
		return true;
	else 
		return false;
	}
	public void popAppra()
	{
		mtc = new MatisseConnector();
		mtc.connect();
 
 
		Staff tempEmp = new Staff(mtc.getDB());
		tempEmp.setStaffId(3333);
		tempEmp.setStaffName("Hussein");
		tempEmp.setStaffLevel(3);
		tempEmp.setPassword("3333");
 		//tempEmp.setAppraiserName("Sica");
 		//tempEmp.setSpecialism("Specialists in Sculpture");

 		System.out.println("dddd");
 		mtc.disconnect();
	}
 
 }


