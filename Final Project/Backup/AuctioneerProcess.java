import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import java.awt.Color;
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
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class AuctioneerProcess {

	 private JPanel configPanel, contentPane, mainPanel;
	 private JTextArea addressTextArea, addressTextArea2, comments;
	 private JTextField buyerID, buyerTitle, buyerFirstName, buyerLastName, buyerAddress,
	 buyerPhoneNo, buyerEmail, buyerBankAccountNo, buyerBankSortCode,
	 buyerID2, buyerTitle2, buyerFirstName2, buyerLastName2, buyerAddress2,
	 buyerPhoneNo2, buyerEmail2, buyerBankAccountNo2, buyerBankSortCode2, price, buyer;
	 private JButton buttonBuyer, btnBuyer, btnCreateBuyer, auctioneerAction;
	 JLabel lblLotNo1;
	 private JList list,list2, list3, listClient, listOpen, listMax;
	 private JCheckBox buyerApproved, buyerApproved2, sold;
	 private MatisseConnector mtc;
	 private JTabbedPane tabbedPane;
	 private String selectedItemLotNo, selectedComissionBid, selectedReservedPrice;
	
	public JTabbedPane auctioneerTabbedPane(){
		 
		 configPanel = new JPanel();
		 configPanel.setBounds(1, 30, 800,600);
		 configPanel.setLayout(null);
		 
		 JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		 tabbedPane.setBounds(30, 1, 800, 600);
		 configPanel.add(tabbedPane);
		
		 JPanel panel = new JPanel();
		 tabbedPane.addTab("Auctioneer", null, panel, null);
		 panel.setLayout(null);
		 
		 JLabel lblLotNo = new JLabel("Lot No and Title");
		 lblLotNo.setBounds(10, 10, 90, 14);
	     panel.add(lblLotNo);
	     
		 JLabel lblCommBids = new JLabel("Commission Bids");
		 lblCommBids.setBounds(130, 10, 100, 14);
	     panel.add(lblCommBids);
	     
		 JLabel lblResPrice = new JLabel("Reserved Price");
		 lblResPrice.setBounds(240, 10, 90, 14);
	     panel.add(lblResPrice);
	     
		 JLabel lblSold = new JLabel("Sold");
		 lblSold.setBounds(380, 10, 30, 14);
	     panel.add(lblSold);
	     
		 JLabel lblPrice = new JLabel("Price");
		 lblPrice.setBounds(430, 10, 30, 14);
	     panel.add(lblPrice);
	     
		 JLabel lblClientNo = new JLabel("Buyer No");
		 lblClientNo.setBounds(500, 10, 60, 14);
	     panel.add(lblClientNo);
	     
		 JLabel lblComm = new JLabel("Auctioneer Comments");
		 lblComm.setBounds(560, 10, 150, 14);
	     panel.add(lblComm);

	     list = new JList(); 
	     list.setBounds(10, 30, 110, 300);
		 panel.add(list);
		 //displayItems();
		
		 JScrollPane scrollableList = new JScrollPane(list);
		 scrollableList.setBounds(10, 30, 110, 300);
		 panel.add(scrollableList);
		 
		 lblLotNo1 = new JLabel("");
		 lblLotNo1.setBounds(10, 350, 350, 20);
	     panel.add(lblLotNo1);
		
		 list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Check that an item is actually selected
				if (list.getSelectedIndex() != -1) {
					selectedItemLotNo = (String)list.getSelectedValue();
					if(selectedItemLotNo.contains(" ")){
						selectedItemLotNo = selectedItemLotNo.substring(0, selectedItemLotNo.indexOf(" ")); 
						}
				}
				displayItems();
				printLabel();
			}
		 });
			
	     list2 = new JList(); 
	     list2.setBounds(140, 30, 85, 300);
		 panel.add(list2);
		
		 JScrollPane scrollableList2 = new JScrollPane(list2);
		 scrollableList2.setBounds(140, 30, 85, 300);
		 panel.add(scrollableList2);
		
		 list2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Check that an item is actually selected
				if (list2.getSelectedIndex() != -1) {
					selectedComissionBid = (String)list2.getSelectedValue();
				}
			}
		 });
		 
	     list3 = new JList(); 
	     list3.setBounds(140, 30, 85, 300);
		 panel.add(list3);
		
		 JScrollPane scrollableList3 = new JScrollPane(list3);
		 scrollableList3.setBounds(240, 30, 85, 300);
		 panel.add(scrollableList3);
		
		 list3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Check that an item is actually selected
				if (list3.getSelectedIndex() != -1) {
					selectedReservedPrice = (String)list3.getSelectedValue();
				}
			}
		 });
		 //displayItems();
		 
		 sold = new JCheckBox("Yes");
		 sold.setBounds(370, 30, 50, 23);
		 panel.add(sold);
		 
		 price = new JTextField();
		 price.setBounds(430, 30, 60, 20);
		 panel.add(price);
		 
		 buyer = new JTextField();
		 buyer.setBounds(500, 30, 50, 20);
		 panel.add(buyer);

		 comments = new JTextArea();
		 comments.setBounds(560, 30, 200, 80);
		 panel.add(comments);
		 
		 JScrollPane scrollableList34 = new JScrollPane(comments);
		 scrollableList34.setBounds(560, 30, 200, 80);
		 panel.add(scrollableList34);
		 
		 JLabel lblClient = new JLabel("Buyer");
		 lblClient.setBounds(450, 200, 50, 14);
	     panel.add(lblClient);
	     
		 JLabel lblOpen = new JLabel("Open");
		 lblOpen.setBounds(550, 200, 50, 14);
	     panel.add(lblOpen);
	     
		 JLabel lblMax = new JLabel("Max");
		 lblMax.setBounds(650, 200, 50, 14);
	     panel.add(lblMax);

	     listClient = new JList(); 
	     listClient.setBounds(450, 225, 70, 200);
		 panel.add(listClient);
		
		 JScrollPane scrollableListClient = new JScrollPane(listClient);
		 scrollableListClient.setBounds(450, 225, 70, 200);
		 panel.add(scrollableListClient);
		 
	     listOpen = new JList(); 
	     listOpen.setBounds(550, 225, 70, 200);
		 panel.add(listOpen);
		
		 JScrollPane scrollableListOpen = new JScrollPane(listOpen);
		 scrollableListOpen.setBounds(550, 225, 70, 200);
		 panel.add(scrollableListOpen);
		 
	     listMax = new JList(); 
	     listMax.setBounds(650, 225, 70, 200);
		 panel.add(listMax);
		
		 JScrollPane scrollableListMax = new JScrollPane(listMax);
		 scrollableListMax.setBounds(650, 225, 70, 200);
		 panel.add(scrollableListMax);
		 
	     auctioneerAction = new JButton("Submit");
	     auctioneerAction.setBounds(550, 450, 114, 23);
		 panel.add(auctioneerAction);
		 auctioneerAction.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
		     		if(validateEntry(price.getText(), "Input price!")&&
		     		validateEntry(buyer.getText(), "Input buyer No!")&&
		     		selectedItemLotNo != "")
		     		{
			    		mtc = new MatisseConnector();
			    		mtc.connect();
			    		ArtItem item = ArtItem.lookupFindArtItem(mtc.getDB(), selectedItemLotNo);
		
			     		boolean soldChecker = false;
			    		if (sold.isSelected()) {
			    			soldChecker = true;
			    		}
			    		item.setSoldCheck(soldChecker);			     		
			    		item.setSoldPrice(Integer.parseInt(price.getText()));
			     		item.setAuctioneersComments(comments.getText());
			    		
			    		JOptionPane.showMessageDialog(null, "Item no ! " + selectedItemLotNo+
			    				" with sold status "+soldChecker +" and sold price of  "+ price.getText()); 
			    		mtc.disconnect();
			    		assignItemToBuyer();
			    		sold.setSelected(false);
			    		price.setText("");
			    		buyer.setText("");
			    		comments.setText("");
		     		}
		     		else
		     		{
		     			JOptionPane.showMessageDialog(null, "Select item sold!");
		     		}
				}
			});		 
		 displayItems();

		 return tabbedPane;
	}
	
	public void displayItems(){
		// Open a connection
		mtc = new MatisseConnector();
		mtc.connect();
		Iterator<ArtItem> e = ArtItem.instanceIterator(mtc.getDB());
		Iterator<BuyerClient> b = BuyerClient.instanceIterator(mtc.getDB());
		Iterator<ComissionBidsDetails> c = ComissionBidsDetails.instanceIterator(mtc.getDB());
		Iterator<ComissionBidsDetails> ccc = ComissionBidsDetails.instanceIterator(mtc.getDB());
		String[] toDisplay = new String[ (int) ArtItem.getInstanceNumber(mtc.getDB())];
		String[] toDisplay3 = new String[ (int) ArtItem.getInstanceNumber(mtc.getDB())];
		String[] toDisplay2 = new String[ (int) ComissionBidsDetails.getInstanceNumber(mtc.getDB())];
		String[] toDisplayTemp = new String[toDisplay.length];
		String[] allBuyers = new String[ (int) BuyerClient.getInstanceNumber(mtc.getDB())];
		
		// Populate array with LotNo and Title
		ArtItem tempEmp;
		int position = 0;
		while (e.hasNext()) {
			tempEmp = e.next();
			toDisplay[position] = tempEmp.getItemlotNo()+
					countCharacters(tempEmp.getItemlotNo()+"")+tempEmp.getArtTitle();
			toDisplay3[position] = tempEmp.getReservedPrice()+"";
			position++;
		}
		// Populate array with lotNo that has bids on
		ComissionBidsDetails tempComm;
		int position2 = 0;
		while (c.hasNext()) {
			tempComm = c.next();
			toDisplay2[position2] = tempComm.getArtLotNo()+"";
			position2++;
		}
		// Populate array that has a bid on
		for(int i = 0; i < toDisplay.length; i++){
			String firstWord = "";
			if(toDisplay[i].contains(" ")){
			   firstWord = toDisplay[i].substring(0, toDisplay[i].indexOf(" ")); 
			}
			for(int j = 0; j < toDisplay2.length; j++){
				if(firstWord.equals(toDisplay2[j])){
					toDisplayTemp[j] = "YES";
					break;
					//System.out.println(toDisplay2[j] + " este egal");
				}
			}
		}
		for(int x = 0; x < toDisplayTemp.length; x++){
			if (toDisplayTemp[x] == null)
				toDisplayTemp[x] = "NO";
		}
		//Populate array with commission bids
		BuyerClient tempBuyer;
		int positionBuyer = 0;
		while (b.hasNext()) {
			tempBuyer = b.next();
			allBuyers[positionBuyer] = tempBuyer.getBID()+"";
			positionBuyer++;
		}
		//Search through buyer to check the ones with bids
		BuyerClient buyer;
		ComissionBidsDetails comm;
		String tempItemLotNo = "";
		int asd = 0;
		int position222 = 0;
		String[] toDisplayClient = new String[(int) ComissionBidsDetails.getInstanceNumber(mtc.getDB())];
		String[] toDisplayOpen = new String[(int) ComissionBidsDetails.getInstanceNumber(mtc.getDB())];
		String[] toDisplayMax = new String[(int) ComissionBidsDetails.getInstanceNumber(mtc.getDB())];
		for(int ab = 0; ab < allBuyers.length; ab++){
			buyer = BuyerClient.lookupFindBuyerClient(mtc.getDB(), allBuyers[ab]);
			//tempItemLotNo = buyer.getBiding().getI+"";
		//	System.out.println(tempItemLotNo);
				while (ccc.hasNext()) {
					tempComm = ccc.next();
					tempItemLotNo = tempComm.getArtLotNo()+"";
 					if(tempItemLotNo.equals(selectedItemLotNo)){
						//System.out.println(tempItemLotNo);
						toDisplayOpen[position222] = tempComm.getStartFromBidding()+"";
						toDisplayMax[position222] = tempComm.getMaximumBidding()+"";
						if(position222 == 0){
							toDisplayClient[position222] = "1";
						}
						else toDisplayClient[position222] = position222+"";
					}
					position222++;
				}
				//System.out.println(buyer.getBiding()[as].getItemLotNo());
				//System.out.println(buyer.getBiding()[as].getOpenBid());
				//System.out.println(toDisplayClient[as]+" "+ab+" "+as+" "+buyer.getBiding().length);
			}
		// Use array to populate the Lists
		list.setListData(toDisplay);
		list3.setListData(toDisplay3);
		list2.setListData(toDisplayTemp);
		listClient.setListData(toDisplayClient);
		listOpen.setListData(toDisplayOpen);
		listMax.setListData(toDisplayMax);
		//System.out.println(toDisplay3[4]);
		//Close connection
		mtc.disconnect();
 	}
	
	public void printLabel(){
		mtc = new MatisseConnector();
		mtc.connect();
		ArtItem item34 = ArtItem.lookupFindArtItem(mtc.getDB(), selectedItemLotNo);
		try {
			if(item34.getSoldCheck()){
			lblLotNo1.setText("You selected lot item no " + selectedItemLotNo
					+" and this item's sold status is " + item34.getSoldCheck());
			}
			else 
				lblLotNo1.setText("You selected lot item no " + selectedItemLotNo
						+" and this item's sold status is FALSE");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	public void assignItemToBuyer()
	{
		mtc = new MatisseConnector();
		mtc.connect();
		String a = buyer.getText();
		BuyerClient buyer = BuyerClient.lookupFindBuyerClient(mtc.getDB(), a);
  		Iterator<ArtItem> itemIterator = ArtItem.findArtItemIterator(mtc.getDB(), selectedItemLotNo);
 
		if(itemIterator.hasNext())
		{ 
			buyer.appendBuy(itemIterator.next());		
		}
		mtc.disconnect();
		System.out.println("item assigned to buyer");
	}
}
