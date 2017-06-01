import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UpdateBuyer {
	private JPanel panel;
	private JButton buttonBuyer, btnBuyer, btnCreateBuyer, btnUpdateBuyer;
	private JList list,list2;
	private JCheckBox buyerApproved, buyerApproved2;
	private MatisseConnector mtc;
	private JTextField minTF, maxTF;
	private JButton btnAllocate;
	private String selectedItemLotNo="", selectedBuyerId="";
	private JTextArea addressTextArea, addressTextArea2;
	private JTextField buyerID, buyerTitle, buyerFirstName, buyerLastName, buyerAddress,
	buyerPhoneNo, buyerEmail, buyerBankAccountNo, buyerBankSortCode,
	buyerID2, buyerTitle2, buyerFirstName2, buyerLastName2, buyerAddress2,
	buyerPhoneNo2, buyerEmail2, buyerBankAccountNo2, buyerBankSortCode2;
	
	public JPanel updateBuyerTabbedPane(){
		panel = new JPanel();
		panel.setLayout(null);
		
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

	    
		JLabel lblListOfItems = new JLabel("List of items bidded on");
		lblListOfItems.setBounds(520, 50, 200, 14);
		panel.add(lblListOfItems);
		
		list2 = new JList(); 
		list2.setBounds(520, 70, 150, 490);
		panel.add(list2);
		
		JScrollPane scrollableList2 = new JScrollPane(list2);
		scrollableList2.setBounds(520, 70, 150, 490);
		panel.add(scrollableList2);
		
		JLabel lblListOfBuyers = new JLabel("List of buyers");
		lblListOfBuyers.setBounds(350, 30, 109, 14);
		panel.add(lblListOfBuyers);
		
		JLabel lblInstructions = new JLabel("*Click on the buyer to check details!");
		lblInstructions.setBounds(360, 10, 350, 14);
		panel.add(lblInstructions);
		
		JLabel lblListOfBuyers2 = new JLabel("ID and Name");
		lblListOfBuyers2.setBounds(350, 50, 109, 14);
		panel.add(lblListOfBuyers2);
		
		list = new JList(); 
		list.setBounds(350, 70, 150, 490);
		panel.add(list);
		displayBuyers();
		
		JScrollPane scrollableList = new JScrollPane(list);
		scrollableList.setBounds(350, 70, 150, 490);
		panel.add(scrollableList);
		
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Check that an item is actually selected
				if (list.getSelectedIndex() != -1) {
					selectedBuyerId = (String)list.getSelectedValue();
					if(selectedBuyerId.contains(" ")){
						selectedBuyerId = selectedBuyerId.substring(0, selectedBuyerId.indexOf(" ")); 
						}
					System.out.println(selectedBuyerId);
					// Open a connection
					mtc = new MatisseConnector();
					mtc.connect();
					//Find the selected Department
					BuyerClient buyer = BuyerClient.lookupFindBuyerClient(mtc.getDB(), selectedBuyerId);
					buyerID.setText(buyer.getBID()+"");
					buyerTitle.setText(buyer.getBTitle()+"");
					buyerFirstName.setText(buyer.getBFirstName()+"");
					buyerLastName.setText(buyer.getBLastName()+"");
					addressTextArea.setText(buyer.getBAddress()+"");
					buyerPhoneNo.setText(buyer.getBPhone()+"");
					buyerEmail.setText(buyer.getBEmail()+"");
					buyerApproved.setSelected(buyer.getBApproved());
					buyerBankAccountNo.setText(buyer.getBBankAccountNo()+"");
					buyerBankSortCode.setText(buyer.getBBankSortCode()+"");
					mtc.disconnect();
					displayItems();
				}
			}
		});
	     
        btnCreateBuyer = new JButton("Update buyer");
        btnCreateBuyer.setBounds(70, 350, 114, 23);
	    panel.add(btnCreateBuyer);
		btnCreateBuyer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mtc = new MatisseConnector();
				mtc.connect();
				BuyerClient buyer = BuyerClient.lookupFindBuyerClient(mtc.getDB(), selectedBuyerId);
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
				displayBuyers();
			    
			}
			});
		
	return panel;
	}
	
	public void displayItems(){
		// Open a connection
		mtc = new MatisseConnector();
		mtc.connect();
		//Find the selected Department
		BuyerClient buyer = BuyerClient.lookupFindBuyerClient(mtc.getDB(), selectedBuyerId);
		System.out.println(selectedBuyerId);
		//Create an array with size of staff in found department.
		int empLength = buyer.getBidding().length;
		String [] toDisplay = new String[empLength];
        System.out.println(list.getSelectedValue()+""+empLength+"");
		//Increment through the staff and add them to a display array
		for (int i = 0; i < empLength; i++) {
			toDisplay[i] = buyer.getBidding()[i].getArtLotNo()+"";
		}

		// Use array to populate the Lists
		
		list2.setListData(toDisplay);
		//Close connection
		mtc.disconnect();
 	}
	
	public void displayBuyers(){
		mtc = new MatisseConnector();
		mtc.connect();
		// Create Iterator for Employee
		Iterator<BuyerClient> e = BuyerClient.instanceIterator(mtc.getDB());
		String[] toDisplay = new String[ (int) BuyerClient.getInstanceNumber(mtc.getDB())];
		// Search through Buyers and add their ID's to an array
		BuyerClient tempEmp;
		int position = 0;
		while (e.hasNext()) {
			tempEmp = e.next();
			toDisplay[position] = tempEmp.getBID()+
					countCharacters(tempEmp.getBID()+"")+tempEmp.getBFirstName();
			position++;

		}
		// Use array to populate the Lists
		list.setListData(toDisplay);
		mtc.disconnect();
	}
	
	public String countCharacters(String s)
	{
		String str = "   ";
		if (s.length() == 1)
		{
			str = "            ";
		}
		else if (s.length() == 2)
		{
			str = "         ";
		}
		else if (s.length() == 3)
		{
			str = "       ";
		}
		else if (s.length() == 4)
		{
			str = "     ";
		}
		return str;
	}
}
