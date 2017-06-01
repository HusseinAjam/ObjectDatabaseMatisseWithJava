import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ComissionProcess {
	private JPanel panel;
	private JList list, list2;
	private MatisseConnector mtc;
	private JTextField minTF, maxTF;
	private JButton btnAllocate;
	private String selectedItemLotNo="", selectedBuyerId="";
	
	public JPanel comissionTabbedPane(){
		panel = new JPanel();
		panel.setLayout(null);
		
		JLabel lblListOfBuyers = new JLabel("List of buyers");
		lblListOfBuyers.setBounds(15, 30, 109, 14);
		panel.add(lblListOfBuyers);
		
		JLabel lblInstructions = new JLabel("*Click on the buyer and the item you want to allocate to buyer!");
		lblInstructions.setBounds(20, 10, 350, 14);
		panel.add(lblInstructions);
		
		JLabel lblListOfBuyers2 = new JLabel("ID and Name");
		lblListOfBuyers2.setBounds(15, 50, 109, 14);
		panel.add(lblListOfBuyers2);
		
		list = new JList(); 
		list.setBounds(15, 70, 150, 490);
		panel.add(list);
		displayBuyers();
		
		JScrollPane scrollableList = new JScrollPane(list);
		scrollableList.setBounds(15, 70, 150, 490);
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
				}
			}
		});
		
		JLabel lblListOfItems = new JLabel("List of items");
		lblListOfItems.setBounds(180, 30, 109, 14);
		panel.add(lblListOfItems);
		
		JLabel lblListOfItems2 = new JLabel("Lot No and Title");
		lblListOfItems2.setBounds(180, 50, 109, 14);
		panel.add(lblListOfItems2);
		
		list2 = new JList(); 
		list2.setBounds(180, 70, 150, 490);
		panel.add(list2);
		displayItems();
		
		JScrollPane scrollableList2 = new JScrollPane(list2);
		scrollableList2.setBounds(180, 70, 150, 490);
		panel.add(scrollableList2);
		
		list2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Check that an item is actually selected
				if (list2.getSelectedIndex() != -1) {
					selectedItemLotNo = (String)list2.getSelectedValue();
					if(selectedItemLotNo.contains(" ")){
						selectedItemLotNo = selectedItemLotNo.substring(0, selectedItemLotNo.indexOf(" ")); 
						}
					System.out.println(selectedItemLotNo);
				}
			}
		});
		
		JLabel comission = new JLabel("Comission");
		comission.setBounds(400, 30, 200, 20);
		panel.add(comission);
		
		JLabel min = new JLabel("Min");
		min.setBounds(400, 70, 100, 20);
		panel.add(min);
		
		JLabel max = new JLabel("Max");
		max.setBounds(400, 110, 100, 20);
		panel.add(max);
		
		minTF = new JTextField();
		minTF.setBounds(500, 70, 200, 20);
		panel.add(minTF);
		
		maxTF = new JTextField();
		maxTF.setBounds(500, 110, 200, 20);
		panel.add(maxTF);
		
		btnAllocate = new JButton("Allocate comissions");
		btnAllocate.setBounds(450, 150, 150, 23);
		panel.add(btnAllocate);
		btnAllocate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	     		if(validateEntry(minTF.getText(), "Input a minimum value!")&&
	     		validateEntry(maxTF.getText(), "Input a maximum value!")&&
	     		selectedBuyerId != "" && selectedItemLotNo != "")
	     		{
		    		mtc = new MatisseConnector();
		    		mtc.connect();
		     
		     		ComissionBidsDetails comissionBids = new ComissionBidsDetails(mtc.getDB());
	
		     		comissionBids.setArtLotNo(Integer.parseInt(selectedItemLotNo));
		     		comissionBids.setStartFromBidding(Integer.parseInt(minTF.getText()));
		     		comissionBids.setMaximumBidding(Integer.parseInt(maxTF.getText()));
		    		
		    		JOptionPane.showMessageDialog(null, "Bid created! " + selectedItemLotNo+
		    				minTF.getText() +" "+ maxTF.getText()); 
		    		mtc.disconnect();
		    		assignBidToBuyer();
		    		minTF.setText("");
		    		maxTF.setText("");
	     		}
	     		else
	     		{
	     			JOptionPane.showMessageDialog(null, "Select buyer and/or item!");
	     		}
			}
		});
		//btnAllocate.addActionListener((ActionListener) this);

		return panel; 
	}
	
	public void assignBidToBuyer()
	{
		mtc = new MatisseConnector();
		mtc.connect();
		BuyerClient buyer = BuyerClient.lookupFindBuyerClient(mtc.getDB(), selectedBuyerId);
  		Iterator<ComissionBidsDetails> comissionIterator = ComissionBidsDetails.findBiddingIterator(mtc.getDB(), selectedItemLotNo);
 
		if(comissionIterator.hasNext())
		{ 
			buyer.appendBidding(comissionIterator.next());		
		}
		mtc.disconnect();
		System.out.println("bid assigned to buyer");
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
	
	public void displayItems(){
		// Get the selected item value
		String selectedItemValue = (String) list.getSelectedValue();

		// Open a connection
		mtc = new MatisseConnector();
		mtc.connect();
		Iterator<ArtItem> e = ArtItem.instanceIterator(mtc.getDB());
		String[] toDisplay = new String[ (int) ArtItem.getInstanceNumber(mtc.getDB())];
		// Search through Buyers and add their ID's to an array
		ArtItem tempEmp;
		int position = 0;
		while (e.hasNext()) {
			tempEmp = e.next();
			toDisplay[position] = tempEmp.getItemlotNo()+
					countCharacters(tempEmp.getItemlotNo()+"")+tempEmp.getArtTitle();
			position++;
		}
		// Use array to populate the Lists
		list2.setListData(toDisplay);
		//Close connection
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
