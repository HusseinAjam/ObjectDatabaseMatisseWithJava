import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BuyerProcess extends JPanel implements ActionListener {
	 private JPanel configPanel, contentPane, mainPanel;
	 private JTextArea addressTextArea, addressTextArea2;
	 private JTextField buyerID, buyerTitle, buyerFirstName, buyerLastName, buyerAddress,
	 buyerPhoneNo, buyerEmail, buyerBankAccountNo, buyerBankSortCode,
	 buyerID2, buyerTitle2, buyerFirstName2, buyerLastName2, buyerAddress2,
	 buyerPhoneNo2, buyerEmail2, buyerBankAccountNo2, buyerBankSortCode2;
	 private JButton buttonBuyer, btnBuyer, btnCreateBuyer, btnUpdateBuyer;
	 private JList list,list2;
	 private JCheckBox buyerApproved, buyerApproved2;
	 private MatisseConnector mtc;
	 private JTabbedPane tabbedPane;
	 
	 public JTabbedPane buyerTabbedPane(){
		 
		 configPanel = new JPanel();
		 configPanel.setBounds(1, 30, 800,600);
		 configPanel.setLayout(null);
		 
		 JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		 tabbedPane.setBounds(30, 1, 800, 600);
		 configPanel.add(tabbedPane);
		 
		 ComissionProcess comission = new ComissionProcess();
		 tabbedPane.addTab("Comission", null, comission.comissionTabbedPane(), null);
		
		 JPanel panel = new JPanel();
		 tabbedPane.addTab("New Buyer", null, panel, null);
		 panel.setLayout(null);
		 
		 UpdateBuyer updateBuyer = new UpdateBuyer();
		 tabbedPane.addTab("Update Buyer", null, updateBuyer.updateBuyerTabbedPane(), null);
		
		 JLabel lblBuyerID = new JLabel("ID");
		 lblBuyerID.setBounds(10, 10, 90, 14);
	     panel.add(lblBuyerID);
	     
		 JLabel lblBuyerTitle = new JLabel("Title");
		 lblBuyerTitle.setBounds(10, 40, 90, 14);
	     panel.add(lblBuyerTitle);
	     
		 JLabel lblBuyerFirstName = new JLabel("First Name");
		 lblBuyerFirstName.setBounds(10, 70, 90, 14);
	     panel.add(lblBuyerFirstName);
	     
		 JLabel lblBuyerLastName = new JLabel("Last Name");
		 lblBuyerLastName.setBounds(10, 100, 90, 14);
	     panel.add(lblBuyerLastName);
	     
		 JLabel lblAddressTextArea = new JLabel("Address");
		 lblAddressTextArea.setBounds(10, 130, 90, 14);
	     panel.add(lblAddressTextArea);
	     
		 JLabel lblBuyerPhoneNo = new JLabel("Phone Number");
		 lblBuyerPhoneNo.setBounds(10, 190, 90, 14);
	     panel.add(lblBuyerPhoneNo);
	     
		 JLabel lblBuyerEmail = new JLabel("Email");
		 lblBuyerEmail.setBounds(10, 220, 90, 14);
	     panel.add(lblBuyerEmail);
	     
		 JLabel lblBuyerApproved = new JLabel("Approved");
		 lblBuyerApproved.setBounds(10, 250, 90, 14);
	     panel.add(lblBuyerApproved);
	     
		 JLabel lblBuyerBankAccountNo = new JLabel("Account Number");
		 lblBuyerBankAccountNo.setBounds(10, 280, 100, 14);
	     panel.add(lblBuyerBankAccountNo);
	     
		 JLabel lblBuyerBankSortCode = new JLabel("Sort Code");
		 lblBuyerBankSortCode.setBounds(10, 310, 90, 14);
	     panel.add(lblBuyerBankSortCode);
		 
		 buyerID = new JTextField();
		 buyerID.setBounds(120, 10, 200, 20);
		 panel.add(buyerID);
		
		 buyerTitle = new JTextField();
		 buyerTitle.setBounds(120, 40, 200, 20);
		 panel.add(buyerTitle);
		
		 buyerFirstName = new JTextField();
		 buyerFirstName.setBounds(120, 70, 200, 20);
		 panel.add(buyerFirstName);
		
		 buyerLastName = new JTextField();
		 buyerLastName.setBounds(120, 100, 200, 20);
		 panel.add(buyerLastName);
		
		 addressTextArea = new JTextArea();
		 addressTextArea.setBounds(120, 130, 200, 50);
		 panel.add(addressTextArea);
		 
		 buyerPhoneNo = new JTextField();
		 buyerPhoneNo.setBounds(120, 190, 200, 20);
		 panel.add(buyerPhoneNo);
		 
		 buyerEmail = new JTextField();
		 buyerEmail.setBounds(120, 220, 200, 20);
		 panel.add(buyerEmail);
		 
		 buyerApproved = new JCheckBox();
		 buyerApproved.setBounds(120, 250, 200, 20);
		 panel.add(buyerApproved);
		 
		 buyerBankAccountNo = new JTextField();
		 buyerBankAccountNo.setBounds(120, 280, 200, 20);
		 panel.add(buyerBankAccountNo);
		 
		 buyerBankSortCode = new JTextField();
		 buyerBankSortCode.setBounds(120, 310, 200, 20);
		 panel.add(buyerBankSortCode);

	     
	     btnCreateBuyer = new JButton("Create buyer");
	     btnCreateBuyer.setBounds(70, 350, 114, 23);
		 panel.add(btnCreateBuyer);
		 btnCreateBuyer.addActionListener((ActionListener) this);
		 
		 return tabbedPane;
	 }
	 
	 public void actionPerformed(ActionEvent event)
	    {
	    	Object source = event.getSource();
//	    	if (source == btnSeller)
//	    	{
//	    		//mainPanel.removeAll();
//	    		mainPanel.add(buyerTabbedPane());
//	       		mainPanel.revalidate();
//	       		mainPanel.repaint();
//	    	}
	    	if (source == btnCreateBuyer)
	    	{
	    		if(validateEntry(buyerID.getText(), "Please enter ID!")&&
	    		validateEntry(buyerTitle.getText(), "Please enter Title!")&&
	    		validateEntry(buyerFirstName.getText(), "Please enter First Name!")&&
	    		validateEntry(buyerLastName.getText(), "Please enter Last Name!")&&
	    		validateEntry(addressTextArea.getText(), "Please enter Address!")&&
	    		validateEntry(buyerPhoneNo.getText(), "Please enter Phone Number!")&&
	    		validateEntry(buyerEmail.getText(), "Please enter Email!")&&
	    		validateEntry(buyerBankAccountNo.getText(), "Please enter Account Number!")&&
	    		validateEntry(buyerBankSortCode.getText(), "Please enter Sort Code!"))
	    		{
	    			addNewBuyer();
	    			buyerID.setText("");
	    			buyerTitle.setText("");
	    			buyerFirstName.setText("");
	    			buyerLastName.setText("");
	    			addressTextArea.setText("");
	    			buyerPhoneNo.setText("");
	    			buyerEmail.setText("");
	    			buyerApproved.setSelected(false);
	    			buyerBankAccountNo.setText("");
	    			buyerBankSortCode.setText("");
	    		}
	    	}	 
	    }
	 
	public void addNewBuyer() {
		mtc = new MatisseConnector();
		mtc.connect();
		BuyerClient buyer = new BuyerClient(mtc.getDB());
		buyer.setBID(Integer.parseInt(buyerID.getText()));
		buyer.setBTitle(buyerTitle.getText());
		buyer.setBFirstName(buyerFirstName.getText());
		buyer.setBLastName(buyerLastName.getText());
		buyer.setBAddress(addressTextArea.getText());
		buyer.setBPhone(buyerPhoneNo.getText());
		buyer.setBEmail(buyerEmail.getText());
		boolean BuyerApprovedChecker = false;
		if (buyerApproved.isSelected()) {
			BuyerApprovedChecker = true;
		}
		buyer.setBApproved(BuyerApprovedChecker);
		buyer.setBBankAccountNo(buyerBankAccountNo.getText());
		buyer.setBBankSortCode(buyerBankSortCode.getText());
		mtc.disconnect();
	    JOptionPane.showMessageDialog(null, "Buyer created! \nTitle: "+buyerTitle.getText() +
	    		"\nFirst Name: " + buyerFirstName.getText()+
	    		"\nLast Name: " + buyerLastName.getText());

	}
	
	public boolean validateEntry(String name, String message)
	{
		boolean b = true;
		if(name.isEmpty()) {
			b = false;
			JOptionPane.showMessageDialog(null,message); 
		}
		return b;
	}
}
