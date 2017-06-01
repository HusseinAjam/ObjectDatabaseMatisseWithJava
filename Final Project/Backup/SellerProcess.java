 import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SellerProcess extends JPanel implements ActionListener {
	 private JPanel configPanel;
	 private JTextArea addressTextArea, textArea_addressTextArea;
	 private JTextField SellerTitle, SellerSurname, SellerAddress, SellerPhone, 
	 SellerBankSortCode, SellerFirstName, SellerId, textField_SellerFirstName, textField_sellerId, 
	 SellerBankDetailTextField, textField_SellerEmail, textField_SellerBankDetail, SellerEmailTextField,
	 addressTextField, textField_SellerTitle, textField_SellerSurname, textField_SellerPhone,
	 textField_SellerBankSortCode;
	 private JButton btnSeller, btnBuyer,btnCreateSeller ;
	 private JList list,list2;
	 JButton btnUpdateSeller;
	 private MatisseConnector mtc;
 		JPanel contentPane;
		JPanel mainPanel;
		//JTextField textField;
 		JTabbedPane tabbedPane;
   
     
    public JTabbedPane sellerTabbedPane(){
   	 configPanel = new JPanel();
   	 configPanel.setBounds(1, 30, 800,600);
   	 configPanel.setLayout(null);
   	 
   	 JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(30, 1, 800, 600);
		configPanel.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("New Seller", null, panel, null);
		panel.setLayout(null);
		
		SellerId = new JTextField();
		SellerId.setBounds(120, 10, 200, 20);
		panel.add(SellerId);
		
		SellerTitle = new JTextField();
		SellerTitle.setBounds(120, 40, 200, 20);
		panel.add(SellerTitle);
		
		SellerFirstName = new JTextField();
		SellerFirstName.setBounds(120, 70, 200, 20);
		panel.add(SellerFirstName);
		
		SellerSurname = new JTextField();
		SellerSurname.setBounds(120, 100, 200, 20);
		panel.add(SellerSurname);
		
		addressTextArea = new JTextArea();
		addressTextArea.setBounds(120, 130, 200, 50);
		panel.add(addressTextArea);
		
		SellerPhone = new JTextField();
		SellerPhone.setBounds(120, 190, 200, 20);
		panel.add(SellerPhone);
		
		SellerEmailTextField = new JTextField();
		SellerEmailTextField.setBounds(120, 220, 200, 20);
		panel.add(SellerEmailTextField);
		
		SellerBankDetailTextField = new JTextField();
		SellerBankDetailTextField.setBounds(120, 250, 200, 20);
		panel.add(SellerBankDetailTextField);
		
		SellerBankSortCode = new JTextField();
		SellerBankSortCode.setBounds(120, 280, 200, 20);
		panel.add(SellerBankSortCode);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(10, 10, 90, 14);
		panel.add(lblId);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(10, 40, 90, 14);
		panel.add(lblTitle);
		
		JLabel lblName = new JLabel("First Name");
		lblName.setBounds(10, 70, 90, 14);
		panel.add(lblName);
		
		JLabel lblSurName = new JLabel("Last Name");
		lblSurName.setBounds(10, 100, 90, 14);
		panel.add(lblSurName);
		
		JLabel lblAddress = new JLabel("Home Address");
		lblAddress.setBounds(10, 130, 90, 14);
		panel.add(lblAddress);
		
		JLabel lblPhoneNo = new JLabel("Phone number");
		lblPhoneNo.setBounds(10, 190, 90, 14);
		panel.add(lblPhoneNo);
		
		JLabel lblSellerEmail = new JLabel("SellerEmail");
		lblSellerEmail.setBounds(10, 220, 90, 14);
		panel.add(lblSellerEmail);
		
		JLabel lblSellerBankDetail = new JLabel("Account Number");
		lblSellerBankDetail.setBounds(10, 250, 120, 14);
		panel.add(lblSellerBankDetail);
		
		JLabel lblSellerBankSortCode = new JLabel("Sort Code");
		lblSellerBankSortCode.setBounds(10, 280, 90, 14);
		panel.add(lblSellerBankSortCode);
		
		btnCreateSeller = new JButton("Create seller");
		btnCreateSeller.setBounds(70, 320, 114, 23);
		panel.add(btnCreateSeller);
	 
		btnCreateSeller.addActionListener((ActionListener) this);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Display", null, panel_1, null);
		panel_1.setLayout(null);
		
		list = new JList(); 
		list.setBounds(15, 30, 150, 530);
		panel_1.add(list);
		displaySellers();
		
		JScrollPane scrollableList = new JScrollPane(list);
		scrollableList.setBounds(15, 30, 150, 530);
		panel_1.add(scrollableList);
		
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Check that an item is actually selected
				if (list.getSelectedIndex() != -1) {
					// Get the selected item value
					String selectedItemValue = (String) list.getSelectedValue();

					// Open a connection
					mtc = new MatisseConnector();
					mtc.connect();

					//Find the selected Department
					SellerClient tempD = SellerClient.lookupFindSellerClient(mtc.getDB(), selectedItemValue+"");
					System.out.println(selectedItemValue+"");
					textField_SellerTitle.setText(tempD.getSellerTitle());
					textField_SellerFirstName.setText(tempD.getSellerFirstName());
					textField_SellerSurname.setText(tempD.getSellerSurname());
					textField_sellerId.setText(tempD.getSellerId()+"");
					textField_SellerPhone.setText(tempD.getSellerPhone()+"");
					textField_SellerEmail.setText(tempD.getSellerEmail()+"");
					textField_SellerBankDetail.setText(tempD.getSellerBankDetail()+"");
					textField_SellerBankSortCode.setText(tempD.getSellerBankSortCode()+"");
					textArea_addressTextArea.setText(tempD.getSellerAddress()+"");
					mtc.disconnect();
					displayItems();
				}
			}
		});
		
		JLabel lblListOfSellers = new JLabel("List of sellers");
		lblListOfSellers.setBounds(10, 10, 109, 14);
		panel_1.add(lblListOfSellers);
		
		JLabel lblListOfItems = new JLabel("List of items");
		lblListOfItems.setBounds(205, 10, 109, 14);
		panel_1.add(lblListOfItems);
		
		list2 = new JList();
		list2.setBounds(170, 30, 150, 530);
		panel_1.add(list2);
		
		JScrollPane scrollableList1 = new JScrollPane(list2);
		scrollableList1.setBounds(170, 30, 150, 530);
		panel_1.add(scrollableList1);
		
		textField_sellerId = new JTextField();
		textField_sellerId.setBounds(480, 30, 200, 20);
		panel_1.add(textField_sellerId);
		
		textField_SellerTitle = new JTextField();
		textField_SellerTitle.setBounds(480, 60, 200, 20);
		panel_1.add(textField_SellerTitle);
		
		textField_SellerFirstName = new JTextField();
		textField_SellerFirstName.setBounds(480, 90, 200, 20);
		panel_1.add(textField_SellerFirstName);
		
		textField_SellerSurname = new JTextField();
		textField_SellerSurname.setBounds(480, 120, 200, 20);
		panel_1.add(textField_SellerSurname);
		
		textArea_addressTextArea = new JTextArea();
		textArea_addressTextArea.setBounds(480, 150, 200, 50);
		panel_1.add(textArea_addressTextArea);
		
		textField_SellerPhone = new JTextField();
		textField_SellerPhone.setBounds(480, 210, 200, 20);
		panel_1.add(textField_SellerPhone);
		
		textField_SellerEmail = new JTextField();
		textField_SellerEmail.setBounds(480, 240, 200, 20);
		panel_1.add(textField_SellerEmail);
		
		textField_SellerBankDetail = new JTextField();
		textField_SellerBankDetail.setBounds(480, 270, 200, 20);
		panel_1.add(textField_SellerBankDetail);
		
		textField_SellerBankSortCode = new JTextField();
		textField_SellerBankSortCode.setBounds(480, 300, 200, 20);
		panel_1.add(textField_SellerBankSortCode);
		
	    btnUpdateSeller = new JButton("Update");
		btnUpdateSeller.setBounds(480, 350, 90, 20);
		panel_1.add(btnUpdateSeller);
		btnUpdateSeller.addActionListener((ActionListener) this);
		
		//JTextArea textArea = new JTextArea();
		//textArea.setBounds(365, 32, 109, 251);
		//panel_1.add(textArea);
		
		//JLabel lblItemList = new JLabel("Item list");
		//lblItemList.setBounds(365, 11, 109, 14);
		//panel_1.add(lblItemList);
		
		JLabel lblId_1 = new JLabel("ID");
		lblId_1.setBounds(360, 30, 200, 20);
		panel_1.add(lblId_1);
		
		JLabel lblTitle_1 = new JLabel("Title");
		lblTitle_1.setBounds(360, 60, 200, 20);
		panel_1.add(lblTitle_1);
		
		JLabel lblName_1 = new JLabel("First Name");
		lblName_1.setBounds(360, 90, 200, 20);
		panel_1.add(lblName_1);
		
		JLabel lblLastName_1 = new JLabel("Last Name");
		lblLastName_1.setBounds(360, 120, 200, 20);
		panel_1.add(lblLastName_1);
		
		JLabel lblAddress_1 = new JLabel("Home Address");
		lblAddress_1.setBounds(360, 150, 200, 50);
		panel_1.add(lblAddress_1);
		
		JLabel lblPhone_1 = new JLabel("Phone Number");
		lblPhone_1.setBounds(360, 210, 200, 20);
		panel_1.add(lblPhone_1);
		
		JLabel lblSellerEmail_1 = new JLabel("SellerEmail");
		lblSellerEmail_1.setBounds(360, 240, 200, 20);
		panel_1.add(lblSellerEmail_1);
		
		JLabel lblSellerBankDetail_1 = new JLabel("Account Number");
		lblSellerBankDetail_1.setBounds(360, 270, 200, 20);
		panel_1.add(lblSellerBankDetail_1);
		
		JLabel lblSellerBankSortCode_1 = new JLabel("Sort Code");
		lblSellerBankSortCode_1.setBounds(360, 300, 200, 20);
		panel_1.add(lblSellerBankSortCode_1);
		
		return tabbedPane;
	}
	@Override
	public void actionPerformed(ActionEvent event)
    {
    	Object source = event.getSource();
    	if (source == btnSeller)
    	{
    		//mainPanel.removeAll();
    		mainPanel.add(sellerTabbedPane());
       		mainPanel.revalidate();
       		mainPanel.repaint();
    	}

    	if (source == btnCreateSeller)
    	{
    		addNewSeller();
    	}
    	if (source == btnUpdateSeller)
    	{
     		updateSeller();
    	}
    	 
    }
	public void addNewSeller(){
		mtc = new MatisseConnector();
		mtc.connect();
		JOptionPane.showMessageDialog(null,"Added seller name as " +SellerFirstName.getText()+ " and id as " +SellerId.getText());
		SellerClient seller = new SellerClient(mtc.getDB());
		seller.setSellerTitle(SellerTitle.getText());
		seller.setSellerSurname(SellerSurname.getText());
		seller.setSellerFirstName(SellerFirstName.getText());
		seller.setSellerId(Integer.parseInt(SellerId.getText()));
		seller.setSellerPhone(SellerPhone.getText());
		seller.setSellerEmail(SellerEmailTextField.getText());
		seller.setSellerBankDetail(SellerBankDetailTextField.getText());
		seller.setSellerBankSortCode(SellerBankSortCode.getText());
		seller.setSellerAddress(addressTextArea.getText());
		mtc.disconnect();
	}
	
	public void displaySellers(){
		mtc = new MatisseConnector();
		mtc.connect();
		// Create Iterator for Employee
		Iterator<SellerClient> e = SellerClient.instanceIterator(mtc.getDB());

		String[] toDisplay = new String[ (int) SellerClient.getInstanceNumber(mtc.getDB())];

		// Search through Employees and add their ID's to an array
		SellerClient tempEmp;
		int position = 0;
		while (e.hasNext()) {
			tempEmp = e.next();
			toDisplay[position] = tempEmp.getSellerId()+"";
			position++;
		}
		// Use array to populate the Lists
		list.setListData(toDisplay);
		mtc.disconnect();
	}
	public void updateSeller()
	{
		mtc = new MatisseConnector();
		mtc.connect();
		System.out.println("Updated seller name as " +textField_SellerFirstName.getText()+ " and id as " +textField_sellerId.getText());
		String selectedItemValue = (String) list.getSelectedValue();
		SellerClient seller =SellerClient.lookupFindSellerClient(mtc.getDB(), selectedItemValue);
		seller.setSellerTitle(textField_SellerTitle.getText());
		seller.setSellerSurname(textField_SellerSurname.getText());
		seller.setSellerFirstName(textField_SellerFirstName.getText());
		seller.setSellerId(Integer.parseInt(textField_sellerId.getText()));
		seller.setSellerPhone(textField_SellerPhone.getText());
		seller.setSellerEmail(textField_SellerEmail.getText());
		seller.setSellerBankDetail(textField_SellerBankDetail.getText());
		seller.setSellerBankSortCode(textField_SellerBankSortCode.getText());
		seller.setSellerAddress(textArea_addressTextArea.getText());	    
		mtc.disconnect();
		displaySellers();
	}
	
	public void displayItems(){
		// Get the selected item value
		String selectedItemValue = (String) list.getSelectedValue();
		// Open a connection
		mtc = new MatisseConnector();
		mtc.connect();
		//Find the selected Department
		SellerClient sell = SellerClient.lookupFindSellerClient(mtc.getDB(), selectedItemValue);
		System.out.println(selectedItemValue);
		//Create an array with size of staff in found department.
		int empLength = sell.getSells().length;
		String [] toDisplay = new String[empLength];
        System.out.println(list.getSelectedValue()+""+empLength+"");
		//Increment through the staff and add them to a display array
		for (int i = 0; i < empLength; i++) {
			toDisplay[i] = sell.getSells()[i].getArtTitle();
		}
		// Use array to populate the Lists
		list2.setListData(toDisplay);
		//Close connection
		mtc.disconnect();
 	}
	
	
	
	 
}
     