import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.MutableComboBoxModel;

public class auctionProcess extends JPanel implements ActionListener {
	 private JPanel addAuction, configPanel;
 	 private JTextField auctionTitle, auctionTheme, auctionDate, auctionTime, auctionLotNo;
	 private JButton addAuctionToDatabase;
 	 private MatisseConnector mtc;
  	 private JTabbedPane tabbedPane;
  	 private JComboBox Locations;
  	 
  	 private JPanel UpdateAuction;
	 private JTextField auctionTitleUpdate, auctionThemeUpdate, auctionDateUpdate, auctionTimeUpdate;
	 private JButton UpdateAuctionToDatabase;
  	 private JComboBox LocationsUpdate, auctionLotNoUpdate;
  	 
  	 private JPanel AssignAuction;
  	 private JComboBox AssignCategory, UnAssignCategory;
  	 private JList AssignedList, UnassignedList;
  	 private JButton AssiButton, UnAssiButton;
   
     
    public JTabbedPane sellerTabbedPane(){
   	 configPanel = new JPanel();
   	 configPanel.setBounds(1, 30, 800,600);
   	 configPanel.setLayout(null);
   	 
   	    tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(30, 1, 800, 600);
		configPanel.add(tabbedPane);
		
		addAuction = new JPanel();
 		tabbedPane.addTab("New Auction", null, addAuction, null);
		addAuction.setLayout(null);
		
		auctionLotNo = new JTextField();
		auctionLotNo.setBounds(160, 30, 200, 20);
		addAuction.add(auctionLotNo);
		auctionLotNo.setColumns(30);
		
		auctionTitle = new JTextField();
		auctionTitle.setBounds(160, 60, 200, 20);
		addAuction.add(auctionTitle);
		auctionTitle.setColumns(30);
		
		auctionTheme = new JTextField();
		auctionTheme.setColumns(30);
		auctionTheme.setBounds(160, 90, 200, 20);
		addAuction.add(auctionTheme);
		
		auctionDate = new JTextField();
		auctionDate.setColumns(30);
		auctionDate.setBounds(160, 120, 200, 20);
		addAuction.add(auctionDate);
		
		auctionTime = new JTextField();
		auctionTime.setColumns(30);
		auctionTime.setBounds(160, 150, 200, 20);
		addAuction.add(auctionTime);
		 
		JLabel lblLot = new JLabel("Auction Lot Number");
		lblLot.setBounds(30, 30, 120, 14);
		addAuction.add(lblLot);
		
		JLabel lblName = new JLabel("Auction Title");
		lblName.setBounds(30, 60, 120, 14);
		addAuction.add(lblName);
		
		JLabel lblId = new JLabel("Auction Theme");
		lblId.setBounds(30, 90, 120, 14);
		addAuction.add(lblId);
		
		JLabel lblDate = new JLabel("Auction Date");
		lblDate.setBounds(30, 120, 120, 14);
		addAuction.add(lblDate);
		
		JLabel lblTime = new JLabel("Auction Time");
		lblTime.setBounds(30, 150, 120, 14);
		addAuction.add(lblTime);
		
		JLabel lblLocate= new JLabel("Select Location");
		lblLocate.setBounds(30, 180, 120, 14);
		addAuction.add(lblLocate);
		
		Locations = new JComboBox();
		Locations.setModel(new DefaultComboBoxModel(new String[] {"London", "Paris", "New York"}));
		Locations.setBounds(160, 180, 86, 20);
		addAuction.add(Locations);
 
		
		addAuctionToDatabase = new JButton("Add To Database");
		addAuctionToDatabase.setBounds(90, 230, 135, 23);
		addAuction.add(addAuctionToDatabase);
		addAuctionToDatabase.addActionListener((ActionListener) this);
		
		//////////Update Auction/////////////
		
		UpdateAuction = new JPanel();
 		tabbedPane.addTab("Update Auction Information", null, UpdateAuction, null);
 		UpdateAuction.setLayout(null);
		
 		auctionLotNoUpdate = new JComboBox(displayAuctionLot());
 		auctionLotNoUpdate.addActionListener (new ActionListener (){
 		    public void actionPerformed(ActionEvent e) {
 		    	mtc = new MatisseConnector();
 				mtc.connect();
 		 
 				AuctionDetails auc = AuctionDetails.lookupFindAuction(mtc.getDB(), auctionLotNoUpdate.getSelectedItem()+"");
  				auctionTitleUpdate.setText(auc.getAuctionName());
 				auctionDateUpdate.setText(auc.getAuctionDate());
 				auctionThemeUpdate.setText(auc.getAuctionTheme());
 				LocationsUpdate.setSelectedItem(auc.getAuctionLocation());
 				auctionTimeUpdate.setText(auc.getAuctionPeriod());
  				mtc.disconnect();
 		    }
 		});
 		auctionLotNoUpdate.setBounds(160, 30, 86, 20);
		UpdateAuction.add(auctionLotNoUpdate);
 		
		auctionTitleUpdate = new JTextField();
		auctionTitleUpdate.setBounds(160, 60, 200, 20);
		UpdateAuction.add(auctionTitleUpdate);
		auctionTitleUpdate.setColumns(30);
		
		auctionThemeUpdate = new JTextField();
		auctionThemeUpdate.setColumns(30);
		auctionThemeUpdate.setBounds(160, 90, 200, 20);
		UpdateAuction.add(auctionThemeUpdate);
		
		auctionDateUpdate = new JTextField();
		auctionDateUpdate.setColumns(30);
		auctionDateUpdate.setBounds(160, 120, 200, 20);
		UpdateAuction.add(auctionDateUpdate);
		
		auctionTimeUpdate = new JTextField();
		auctionTimeUpdate.setColumns(30);
		auctionTimeUpdate.setBounds(160, 150, 200, 20);
		UpdateAuction.add(auctionTimeUpdate);
		 
		JLabel lblLotU = new JLabel("Auction Lot Number");
		lblLotU.setBounds(30, 30, 120, 14);
		UpdateAuction.add(lblLotU);
	 
		JLabel lblNameU = new JLabel("Auction Title");
		lblNameU.setBounds(30, 60, 120, 14);
		UpdateAuction.add(lblNameU);
		
		JLabel lblIdU = new JLabel("Auction Theme");
		lblIdU.setBounds(30, 90, 120, 14);
		UpdateAuction.add(lblIdU);
		
		JLabel lblDateU = new JLabel("Auction Date");
		lblDateU.setBounds(30, 120, 120, 14);
		UpdateAuction.add(lblDateU);
		
		JLabel lblTimeU = new JLabel("Auction Time");
		lblTimeU.setBounds(30, 150, 120, 14);
		UpdateAuction.add(lblTimeU);
		
		JLabel lblLocateU= new JLabel("Select Location");
		lblLocateU.setBounds(30, 180, 120, 14);
		UpdateAuction.add(lblLocateU);
		
		LocationsUpdate = new JComboBox();
		LocationsUpdate.setModel(new DefaultComboBoxModel(new String[] {"London", "Paris", "New York"}));
		LocationsUpdate.setBounds(160, 180, 86, 20);
		UpdateAuction.add(LocationsUpdate);
 
		
		UpdateAuctionToDatabase = new JButton("Update Information");
		UpdateAuctionToDatabase.setBounds(90, 210, 135, 23);
		UpdateAuction.add(UpdateAuctionToDatabase);
		UpdateAuctionToDatabase.addActionListener((ActionListener) this);
		
		
		//////////Assign Items to Auction/////////////
		
		AssignAuction = new JPanel();
 		tabbedPane.addTab("Assign Items to Auctions", null, AssignAuction, null);
 		AssignAuction.setLayout(null);
		
 		JLabel lblCat= new JLabel("Categoriy: ");
 		lblCat.setBounds(30, 50, 120, 14);
 		AssignAuction.add(lblCat);
		
 		AssignCategory = new JComboBox();
 		AssignCategory.setModel(new DefaultComboBoxModel(new String[] {"All","Drawing", "Painting", "Photographic","Sculpture","Carving" }));
 		AssignCategory.setBounds(100, 50, 86, 20);
		AssignAuction.add(AssignCategory);
		
		AssignCategory.addActionListener (new ActionListener (){
 		    public void actionPerformed(ActionEvent e) {
 		    	DisplayItems();
 		    }
 		});
		
		JLabel lblAuction= new JLabel("Auction Title: ");
		lblAuction.setBounds(350, 50, 120, 14);
 		AssignAuction.add(lblAuction);
		
 		UnAssignCategory = new JComboBox(displayAuctionTitle());
  		UnAssignCategory.setBounds(430, 50, 86, 20);
		AssignAuction.add(UnAssignCategory);
		UnAssignCategory.addActionListener (new ActionListener (){
 		    public void actionPerformed(ActionEvent e) {
 				populateAssignedList(); 
 		    }
 		});
		
		UnassignedList = new JList() ;
		UnassignedList.setBounds(60, 100, 180, 450);
		AssignAuction.add(UnassignedList);
		DisplayItems();
		
		
		
		
		JLabel lblArraw= new JLabel("Assign To --->");
		lblArraw.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblArraw.setBounds(260, 200, 120, 20);
 		AssignAuction.add(lblArraw);
 		
 		AssiButton = new JButton("Assign");
 		AssiButton.setBounds(270, 230, 80, 20);
 		AssignAuction.add(AssiButton);
 		AssiButton.addActionListener((ActionListener) this);

 		
 		JLabel lblUnArraw= new JLabel("<--- Unassign");
 		lblUnArraw.setFont(new Font("Tahoma", Font.PLAIN, 15));
 		lblUnArraw.setBounds(260, 360, 120, 20);
 		AssignAuction.add(lblUnArraw);
 		
 		UnAssiButton = new JButton("Assign");
 		UnAssiButton.setBounds(270, 390, 80, 20);
 		AssignAuction.add(UnAssiButton);
 		UnAssiButton.addActionListener((ActionListener) this);

 		AssignedList = new JList() ;
		AssignedList.setBounds(380, 100, 180, 450);
		AssignAuction.add(AssignedList);
		populateAssignedList();
		
		
 		  
		
		return tabbedPane;
	}
	public void actionPerformed(ActionEvent event)
    {
    	Object source = event.getSource();
    	//when the button "jBOption1" is pressed:
    	if (source == addAuctionToDatabase)
    	{
    		UploadAuctionToDatabase();
    		addAuction.revalidate();
    		addAuction.repaint();
    	}	
    	if (source == UpdateAuctionToDatabase)
    	{
    		UpdateAuctionInfo();
    		UpdateAuction.revalidate();
    		UpdateAuction.repaint();
    	}
    	if (source == AssiButton)
    	{
    		AssiginSpecificItem();
    		populateAssignedList();
     		AssignAuction.revalidate();
    		AssignAuction.repaint();
    	}
    	if (source == UnAssiButton)
    	{
    		UnsiginItemFromAuction();
    		populateAssignedList();
     		AssignAuction.revalidate();
    		AssignAuction.repaint();
    	}
    	
    	
    }
	public void UnsiginItemFromAuction()
	{
		 mtc = new MatisseConnector();
		 mtc.connect();
		ArtItem item = ArtItem.lookupFindArtItemTitle(mtc.getDB(), AssignedList.getSelectedValue()+""); 
		System.out.println( AssignedList.getSelectedValue());
		item.clearTarget_auction();	
		 
		mtc.disconnect();
	}
	public void AssiginSpecificItem()
	{	   	
		 mtc = new MatisseConnector();
		 mtc.connect();
		 ArtItem item = ArtItem.lookupFindArtItemTitle(mtc.getDB(), UnassignedList.getSelectedValue()+"");
		Iterator<AuctionDetails> itiimeIterator = AuctionDetails.findAuctionTitleIterator(mtc.getDB(), UnAssignCategory.getSelectedItem()+"");

		if(itiimeIterator.hasNext())
		{ 
			item.appendTarget_auction(itiimeIterator.next());		
		}
		mtc.disconnect();
 	}
	public void DisplayItems()
	{
		String selectedItemValue = (String) AssignCategory.getSelectedItem();
		mtc = new MatisseConnector();
		mtc.connect();
		String[] toDisplay ;
		if(selectedItemValue.equals("Drawing"))
		{
			Iterator<DrawingCategory> e = DrawingCategory.instanceIterator(mtc.getDB());
			toDisplay = new String[ (int) DrawingCategory.getInstanceNumber(mtc.getDB())];

			Iterator<ArtItem> ite = ArtItem.instanceIterator(mtc.getDB());
			ArtItem item;
			int position = 0;
			while (ite.hasNext()) {
				item = ite.next();
				if(item.getTo_drawing().length > 0){
				toDisplay[position] = item.getArtTitle();
				position++;
				}
			}
			UnassignedList.setListData(toDisplay);
			mtc.disconnect();	 
		 }
		else if(selectedItemValue.equals("All"))
		{
 			toDisplay = new String[ (int) ArtItem.getInstanceNumber(mtc.getDB())];
			Iterator<ArtItem> ite = ArtItem.instanceIterator(mtc.getDB());
			ArtItem item;
			int position = 0;
			while (ite.hasNext()) {
				item = ite.next();
 				toDisplay[position] = item.getArtTitle();
				position++;
 			}
			UnassignedList.setListData(toDisplay);
			mtc.disconnect();	 
		 }	
		if(selectedItemValue.equals("Painting"))
		{
			Iterator<PaintingCategory> e = PaintingCategory.instanceIterator(mtc.getDB());
			toDisplay = new String[ (int) PaintingCategory.getInstanceNumber(mtc.getDB())];

			Iterator<ArtItem> ite = ArtItem.instanceIterator(mtc.getDB());
			ArtItem item;
			int position = 0;
			while (ite.hasNext()) {
				item = ite.next();
				if(item.getTo_painting().length > 0){
				toDisplay[position] = item.getArtTitle();
				position++;
				}
			}
			UnassignedList.setListData(toDisplay);
			mtc.disconnect();	 
		 }
		if(selectedItemValue.equals("Sculpture"))
		{
			Iterator<SculptureCategory> e = SculptureCategory.instanceIterator(mtc.getDB());
			toDisplay = new String[ (int) SculptureCategory.getInstanceNumber(mtc.getDB())];

			Iterator<ArtItem> ite = ArtItem.instanceIterator(mtc.getDB());
			ArtItem item;
			int position = 0;
			while (ite.hasNext()) {
				item = ite.next();
				if(item.getTo_sculpture().length > 0){
				toDisplay[position] = item.getArtTitle();
				position++;
				}
			}
			UnassignedList.setListData(toDisplay);
			mtc.disconnect();	 
		 }
		if(selectedItemValue.equals("Carving"))
		{
			Iterator<CarvingCategory> e = CarvingCategory.instanceIterator(mtc.getDB());
			toDisplay = new String[ (int) CarvingCategory.getInstanceNumber(mtc.getDB())];

			Iterator<ArtItem> ite = ArtItem.instanceIterator(mtc.getDB());
			ArtItem item;
			int position = 0;
			while (ite.hasNext()) {
				item = ite.next();
				if(item.getTo_carving().length > 0){
				toDisplay[position] = item.getArtTitle();
				position++;
				}
			}
			UnassignedList.setListData(toDisplay);
			mtc.disconnect();	 
		 }
		if(selectedItemValue.equals("Photographic"))
		{
			Iterator<PhotographicCategory> e = PhotographicCategory.instanceIterator(mtc.getDB());
			toDisplay = new String[ (int) PhotographicCategory.getInstanceNumber(mtc.getDB())];

			Iterator<ArtItem> ite = ArtItem.instanceIterator(mtc.getDB());
			ArtItem item;
			int position = 0;
			while (ite.hasNext()) {
				item = ite.next();
				if(item.getTo_photo().length > 0){
				toDisplay[position] = item.getArtTitle();
				position++;
				}
			}
			UnassignedList.setListData(toDisplay);
			mtc.disconnect();	 
		 }
		
	}
	public void UpdateAuctionInfo() 
	{
		mtc = new MatisseConnector();
		mtc.connect();
 
		AuctionDetails auc = AuctionDetails.lookupFindAuction(mtc.getDB(), auctionLotNoUpdate.getSelectedItem()+"");
 		auc.setAuctionName(auctionTitleUpdate.getText());
		auc.setAuctionDate(auctionDateUpdate.getText());
		auc.setAuctionTheme(auctionThemeUpdate.getText());
		auc.setAuctionLocation(LocationsUpdate.getSelectedItem()+"");
		auc.setAuctionPeriod(auctionTimeUpdate.getText());
 		mtc.disconnect();
	}
	
	public void UploadAuctionToDatabase()
	{
		mtc = new MatisseConnector();
		mtc.connect();
 
		AuctionDetails auc = new AuctionDetails(mtc.getDB());
		auc.setAuctionName(auctionTitle.getText());
		auc.setAuctionDate(auctionDate.getText());
		auc.setAuctionTheme(auctionTheme.getText());
		auc.setAuctionLocation(Locations.getSelectedItem()+"");
		auc.setAuctionPeriod(auctionTime.getText());
		auc.setAuctionLotNumber(Integer.parseInt(auctionLotNo.getText()));
		mtc.disconnect();
	}
	public  String[]  displayAuctionLot(){
		mtc = new MatisseConnector();
		mtc.connect();
 		Iterator<AuctionDetails> a = AuctionDetails.instanceIterator(mtc.getDB());

		String[] toDisplay = new String[ (int) AuctionDetails.getInstanceNumber(mtc.getDB())];

		// Search through Employees and add their ID's to an array
		AuctionDetails temp;
		int position = 0;
		while (a.hasNext()) {
			temp = a.next();
			toDisplay[position] = temp.getAuctionLotNumber()+"";
			position++;
		}
		mtc.disconnect();
		return toDisplay;
	}
	public  String[]  displayAuctionTitle(){
		mtc = new MatisseConnector();
		mtc.connect();
 		Iterator<AuctionDetails> a = AuctionDetails.instanceIterator(mtc.getDB());

		String[] toDisplay = new String[ (int) AuctionDetails.getInstanceNumber(mtc.getDB())];

		AuctionDetails temp;
		int position = 0;
		while (a.hasNext()) {
			temp = a.next();
			toDisplay[position] = temp.getAuctionName();
			position++;
		}
		mtc.disconnect();
		return toDisplay;
	}
	public void  populateAssignedList()
	{
		mtc = new MatisseConnector();
		mtc.connect();
		String[] toDisplay = new String[ (int) ArtItem.getInstanceNumber(mtc.getDB())];
  		String selectedItemValue = UnAssignCategory.getSelectedItem()+"";

 			Iterator<ArtItem> e = ArtItem.instanceIterator(mtc.getDB());
 			ArtItem tempEmp;
 			int position = 0;
 			while (e.hasNext()) {
 				tempEmp = e.next();
 				int temp = tempEmp.getItemlotNo();

  				if(tempEmp.getTarget_auction().length > 0)
 				    if(tempEmp.getTarget_auction()[0].getAuctionName().equals(selectedItemValue))
 				    {
 				    	toDisplay[position]	= tempEmp.getArtTitle(); //+"  "+tempEmp.getFor_auction()[0].getTitle();
 				    	position++;
 				    }
 			}
 			mtc.disconnect();
 			AssignedList.setListData(toDisplay);
  			
	}
	
}