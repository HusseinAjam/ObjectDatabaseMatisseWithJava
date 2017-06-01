import java.awt.Color;
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
import javax.swing.SwingConstants;

public class AuctionBackgroundWork extends JPanel implements ActionListener {
	 private MatisseConnector mtc;
	 private JPanel UploadAuction, ContainerPanel,EditAuctionDetails,AssignItemsToAuction;
 	 private JTextField AuctionTitleName, AuctionETheme, AuctionRunningDate, AuctionLotNumber,
 	 AuctionTitleForUpdate, AuctionThemeForUpdate, AuctionDateForUpdate;
	 private JButton UploadAuctionToDatabase,UpdateAuctionButton,AssiginButton, UnassiginButton;
  	 private JTabbedPane tabbedPane;
  	 private JComboBox AuctionLocation,AuctionTime,AuctionLocationForUpdate, AuctionLotNumberForUpdate,
  	 CategoryForAssigin, CategoryForUnassigin,AuctionTimeForUpdate;
  	 private JList FirstList, SecondList;
  	
    public JTabbedPane sellerTabbedPane(){
   	 ContainerPanel = new JPanel();
   	 ContainerPanel.setBounds(1, 30, 800,600);
   	 ContainerPanel.setLayout(null);
   	 
   	    tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(30, 1, 800, 600);
		ContainerPanel.add(tabbedPane);
		
		UploadAuction = new JPanel();
 		tabbedPane.addTab("Create New Auction", null, UploadAuction, null);
		UploadAuction.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBackground(Color.RED);
		separator.setBounds(0, 150, 850, 5);
		UploadAuction.add(separator);
		
		JSeparator separator3 = new JSeparator();
		separator3.setForeground(Color.GRAY);
		separator3.setBackground(Color.RED);
		separator3.setBounds(0, 420, 850, 5);
		UploadAuction.add(separator3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.GRAY);
		separator_2.setBackground(new Color(75, 0, 130));
		separator_2.setBounds(120, 0, 5, 661);
		UploadAuction.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.GRAY);
		separator_3.setBackground(new Color(75, 0, 130));
		separator_3.setBounds(640, 0, 5, 661);
		UploadAuction.add(separator_3);

		
		AuctionLotNumber = new JTextField();
		AuctionLotNumber.setBounds(300, 185, 190, 20);
		UploadAuction.add(AuctionLotNumber);
		AuctionLotNumber.setColumns(30);
		
		AuctionTitleName = new JTextField();
		AuctionTitleName.setBounds(300, 215, 190, 20);
		UploadAuction.add(AuctionTitleName);
		AuctionTitleName.setColumns(30);
		
		AuctionETheme = new JTextField();
		AuctionETheme.setColumns(30);
		AuctionETheme.setBounds(300, 245, 190, 20);
		UploadAuction.add(AuctionETheme);
		
		AuctionRunningDate = new JTextField();
		AuctionRunningDate.setColumns(30);
		AuctionRunningDate.setBounds(300, 275, 190, 20);
		UploadAuction.add(AuctionRunningDate);
		
		AuctionTime = new JComboBox();
		AuctionTime.setModel(new DefaultComboBoxModel(new String[] {"Morning", "Afternoon", "Evening"}));
 		AuctionTime.setBounds(300, 305, 190, 20);
		UploadAuction.add(AuctionTime);
		 
		JLabel lblLotNumber = new JLabel("Lot Number");
		lblLotNumber.setBounds(150, 185, 120, 14);
		UploadAuction.add(lblLotNumber);
		
		JLabel lblAuctionName = new JLabel("Title");
		lblAuctionName.setBounds(150, 215, 120, 14);
		UploadAuction.add(lblAuctionName);
		
		JLabel lblTheme = new JLabel("Theme");
		lblTheme.setBounds(150, 245, 120, 14);
		UploadAuction.add(lblTheme);
		
		JLabel uction = new JLabel("Date");
		uction.setBounds(150, 275, 120, 14);
		UploadAuction.add(uction);
		
		JLabel lblAuctionTime = new JLabel("Time");
		lblAuctionTime.setBounds(150, 305, 120, 14);
		UploadAuction.add(lblAuctionTime);
		
		JLabel lblHouse= new JLabel("House");
		lblHouse.setBounds(150, 335, 120, 14);
		UploadAuction.add(lblHouse);
		
		AuctionLocation = new JComboBox();
		AuctionLocation.setModel(new DefaultComboBoxModel(new String[] {"London", "Paris", "New York"}));
		AuctionLocation.setBounds(300, 335, 190, 20);
		UploadAuction.add(AuctionLocation);
 
		
		UploadAuctionToDatabase = new JButton("Upload To Database");
		UploadAuctionToDatabase.setBounds(320, 375, 160, 20);
		UploadAuction.add(UploadAuctionToDatabase);
		UploadAuctionToDatabase.addActionListener((ActionListener) this);
				
		EditAuctionDetails = new JPanel();
 		tabbedPane.addTab("Update Auction Information", null, EditAuctionDetails, null);
 		EditAuctionDetails.setLayout(null);
		
 		AuctionLotNumberForUpdate = new JComboBox(displayAuctionLot());
 		AuctionLotNumberForUpdate.addActionListener (new ActionListener (){
 		    public void actionPerformed(ActionEvent a) {
 		    	mtc = new MatisseConnector();
 				mtc.connect();
 		 
 				AuctionDetails auc = AuctionDetails.lookupFindAuction(mtc.getDB(), AuctionLotNumberForUpdate.getSelectedItem()+"");
  				AuctionTitleForUpdate.setText(auc.getAuctionName());
 				AuctionDateForUpdate.setText(auc.getAuctionDate());
 				AuctionThemeForUpdate.setText(auc.getAuctionTheme());
 				AuctionLocationForUpdate.setSelectedItem(auc.getAuctionLocation());
 				AuctionTimeForUpdate.setSelectedItem(auc.getAuctionPeriod());
  				mtc.disconnect();
 		    }
 		});
 		AuctionLotNumberForUpdate.setBounds(300, 185, 190, 20);
		EditAuctionDetails.add(AuctionLotNumberForUpdate);
 		
		JSeparator separatore = new JSeparator();
		separatore.setForeground(Color.GRAY);
		separatore.setBackground(Color.RED);
		separatore.setBounds(0, 150, 850, 5);
		EditAuctionDetails.add(separatore);
		
		JSeparator separator3e = new JSeparator();
		separator3e.setForeground(Color.GRAY);
		separator3e.setBackground(Color.RED);
		separator3e.setBounds(0, 420, 850, 5);
		EditAuctionDetails.add(separator3e);
		
		JSeparator separator_2e = new JSeparator();
		separator_2e.setOrientation(SwingConstants.VERTICAL);
		separator_2e.setForeground(Color.GRAY);
		separator_2e.setBackground(new Color(75, 0, 130));
		separator_2e.setBounds(120, 0, 5, 661);
		EditAuctionDetails.add(separator_2e);
		
		JSeparator separator_3e = new JSeparator();
		separator_3e.setOrientation(SwingConstants.VERTICAL);
		separator_3e.setForeground(Color.GRAY);
		separator_3e.setBackground(new Color(75, 0, 130));
		separator_3e.setBounds(640, 0, 5, 661);
		EditAuctionDetails.add(separator_3e);
		
		AuctionTitleForUpdate = new JTextField();
		AuctionTitleForUpdate.setBounds(300, 215, 190, 20);
		EditAuctionDetails.add(AuctionTitleForUpdate);
		AuctionTitleForUpdate.setColumns(30);
		
		AuctionThemeForUpdate = new JTextField();
		AuctionThemeForUpdate.setColumns(30);
		AuctionThemeForUpdate.setBounds(300, 245, 190, 20);
		EditAuctionDetails.add(AuctionThemeForUpdate);
		
		AuctionDateForUpdate = new JTextField();
		AuctionDateForUpdate.setColumns(30);
		AuctionDateForUpdate.setBounds(300, 275, 190, 20);
		EditAuctionDetails.add(AuctionDateForUpdate);
		
		AuctionTimeForUpdate = new JComboBox();	
		AuctionTimeForUpdate.setModel(new DefaultComboBoxModel(new String[] {"Morning", "Afternoon", "Evening"}));
		AuctionTimeForUpdate.setBounds(300, 305, 190, 20);
		EditAuctionDetails.add(AuctionTimeForUpdate);
		 
		JLabel lblLotU = new JLabel("Lot Number");
		lblLotU.setBounds(150, 185, 120, 14);
		EditAuctionDetails.add(lblLotU);
	 
		JLabel lblNameU = new JLabel("Title");
		lblNameU.setBounds(150, 215, 120, 14);
		EditAuctionDetails.add(lblNameU);
		
		JLabel lblIdU = new JLabel("Theme");
		lblIdU.setBounds(150, 245, 120, 14);
		EditAuctionDetails.add(lblIdU);
		
		JLabel lblDateU = new JLabel("Auction Date");
		lblDateU.setBounds(150, 275, 120, 14);
		EditAuctionDetails.add(lblDateU);
		
		JLabel lblTimeU = new JLabel("Auction Time");
		lblTimeU.setBounds(150, 305, 120, 14);
		EditAuctionDetails.add(lblTimeU);
		
		JLabel lblLocateU= new JLabel("Select Location");
		lblLocateU.setBounds(150, 335, 120, 14);
		EditAuctionDetails.add(lblLocateU);
		
		AuctionLocationForUpdate = new JComboBox();
		AuctionLocationForUpdate.setModel(new DefaultComboBoxModel(new String[] {"London", "Paris", "New York"}));
		AuctionLocationForUpdate.setBounds(300, 335, 190, 20);
		EditAuctionDetails.add(AuctionLocationForUpdate);
		
		UpdateAuctionButton = new JButton("Update");
		UpdateAuctionButton.setBounds(320, 375, 160, 20);
		EditAuctionDetails.add(UpdateAuctionButton);
		UpdateAuctionButton.addActionListener((ActionListener) this);
				
		AssignItemsToAuction = new JPanel();
 		tabbedPane.addTab("Assign Items to Auctions", null, AssignItemsToAuction, null);
 		AssignItemsToAuction.setLayout(null);
		
 		
		JSeparator separatorea = new JSeparator();
		separatorea.setForeground(Color.GRAY);
		separatorea.setBackground(Color.RED);
		separatorea.setBounds(0, 70, 850, 5);
		AssignItemsToAuction.add(separatorea);
		
		JSeparator separator3ea = new JSeparator();
		separator3ea.setForeground(Color.GRAY);
		separator3ea.setBackground(Color.RED);
		separator3ea.setBounds(0, 500, 850, 5);
		AssignItemsToAuction.add(separator3ea);
		
		JSeparator separator_2ea = new JSeparator();
		separator_2ea.setOrientation(SwingConstants.VERTICAL);
		separator_2ea.setForeground(Color.GRAY);
		separator_2ea.setBackground(new Color(75, 0, 130));
		separator_2ea.setBounds(80, 0, 5, 661);
		AssignItemsToAuction.add(separator_2ea);
		
		JSeparator separator_3ea = new JSeparator();
		separator_3ea.setOrientation(SwingConstants.VERTICAL);
		separator_3ea.setForeground(Color.GRAY);
		separator_3ea.setBackground(new Color(75, 0, 130));
		separator_3ea.setBounds(700, 0, 5, 661);
		AssignItemsToAuction.add(separator_3ea);
		
 		JLabel lblDisplay= new JLabel("Display");
 		lblDisplay.setBounds(110, 90, 80, 14);
 		AssignItemsToAuction.add(lblDisplay);
		
 		CategoryForAssigin = new JComboBox();
 		CategoryForAssigin.setModel(new DefaultComboBoxModel(new String[] {"All","Drawing", "Painting", "Photographic","Sculpture","Carving" }));
 		CategoryForAssigin.setBounds(200, 90, 86, 20);
		AssignItemsToAuction.add(CategoryForAssigin);
		
		CategoryForAssigin.addActionListener (new ActionListener (){
 		    public void actionPerformed(ActionEvent a) {
 		    	DisplayArts();
 		    }
 		});
		
		JLabel lblAuctionAssigin= new JLabel("For Auction:");
		lblAuctionAssigin.setBounds(300, 90, 90, 14);
 		AssignItemsToAuction.add(lblAuctionAssigin);
		
 		CategoryForUnassigin = new JComboBox(displayAuctionTitle());
  		CategoryForUnassigin.setBounds(380, 90, 86, 20);
		AssignItemsToAuction.add(CategoryForUnassigin);
		CategoryForUnassigin.addActionListener (new ActionListener (){
 		    public void actionPerformed(ActionEvent a) {
 				populateSecondList(); 
 		    }
 		});
		
		SecondList = new JList() ;
		SecondList.setBounds(110, 130, 180, 350);
		AssignItemsToAuction.add(SecondList);
		DisplayArts();
		
 		AssiginButton = new JButton("Assign");
 		AssiginButton.setBounds(490, 230, 120, 30);
 		AssignItemsToAuction.add(AssiginButton);
 		AssiginButton.addActionListener((ActionListener) this);
 		
 		UnassiginButton = new JButton("Unassign");
 		UnassiginButton.setBounds(490, 280, 120, 30);
 		AssignItemsToAuction.add(UnassiginButton);
 		UnassiginButton.addActionListener((ActionListener) this);

 		FirstList = new JList() ;
		FirstList.setBounds(295, 130, 180, 350);
		AssignItemsToAuction.add(FirstList);
		populateSecondList();
		return tabbedPane;
	}
	public void actionPerformed(ActionEvent event)
    {
    	Object source = event.getSource();
     	if (source == UploadAuctionToDatabase)
    	{
    		UploadToDatabase();
    		UploadAuction.revalidate();
    		UploadAuction.repaint();
    	}	
    	if (source == UpdateAuctionButton)
    	{
    		UpdateInformation();
    		EditAuctionDetails.revalidate();
    		EditAuctionDetails.repaint();
    	}
    	if (source == AssiginButton)
    	{
    		AssiginSpec();
    		populateSecondList();
     		AssignItemsToAuction.revalidate();
    		AssignItemsToAuction.repaint();
    	}
    	if (source == UnassiginButton)
    	{
    		UnassiginFromAuction();
    		populateSecondList();
     		AssignItemsToAuction.revalidate();
    		AssignItemsToAuction.repaint();
    	}
    	
    	
    }
	public void UnassiginFromAuction()
	{
		 mtc = new MatisseConnector();
		 mtc.connect();
		ArtItem item = ArtItem.lookupFindArtItemTitle(mtc.getDB(), FirstList.getSelectedValue()+""); 
		System.out.println( FirstList.getSelectedValue());
		item.clearTarget_auction();	
		 
		mtc.disconnect();
	}
	public void AssiginSpec()
	{	   	
		 mtc = new MatisseConnector();
		 mtc.connect();
		 ArtItem item = ArtItem.lookupFindArtItemTitle(mtc.getDB(), SecondList.getSelectedValue()+"");
		Iterator<AuctionDetails> itiimeIterator = AuctionDetails.findAuctionTitleIterator(mtc.getDB(), CategoryForUnassigin.getSelectedItem()+"");

		if(itiimeIterator.hasNext())
		{ 
			item.appendTarget_auction(itiimeIterator.next());		
		}
		mtc.disconnect();
 	}
	public void DisplayArts()
	{
		String selectedItemValue = (String) CategoryForAssigin.getSelectedItem();
		mtc = new MatisseConnector();
		mtc.connect();
		String[] ArrayToReturn ;
		if(selectedItemValue.equals("Drawing"))
		{
			Iterator<DrawingCategory> a = DrawingCategory.instanceIterator(mtc.getDB());
			ArrayToReturn = new String[ (int) DrawingCategory.getInstanceNumber(mtc.getDB())];

			Iterator<ArtItem> ite = ArtItem.instanceIterator(mtc.getDB());
			ArtItem item;
			int position = 0;
			while (ite.hasNext()) {
				item = ite.next();
				if(item.getTo_drawing().length > 0){
				ArrayToReturn[position] = item.getArtTitle();
				position++;
				}
			}
			SecondList.setListData(ArrayToReturn);
			mtc.disconnect();	 
		 }
		else if(selectedItemValue.equals("All"))
		{
 			ArrayToReturn = new String[ (int) ArtItem.getInstanceNumber(mtc.getDB())];
			Iterator<ArtItem> ite = ArtItem.instanceIterator(mtc.getDB());
			ArtItem item;
			int position = 0;
			while (ite.hasNext()) {
				item = ite.next();
 				ArrayToReturn[position] = item.getArtTitle();
				position++;
 			}
			SecondList.setListData(ArrayToReturn);
			mtc.disconnect();	 
		 }	
		if(selectedItemValue.equals("Painting"))
		{
			Iterator<PaintingCategory> a = PaintingCategory.instanceIterator(mtc.getDB());
			ArrayToReturn = new String[ (int) PaintingCategory.getInstanceNumber(mtc.getDB())];
			Iterator<ArtItem> ite = ArtItem.instanceIterator(mtc.getDB());
			ArtItem item;
			int position = 0;
			while (ite.hasNext()) {
				item = ite.next();
				if(item.getTo_painting().length > 0){
				ArrayToReturn[position] = item.getArtTitle();
				position++;
				}
			}
			SecondList.setListData(ArrayToReturn);
			mtc.disconnect();	 
		 }
		if(selectedItemValue.equals("Sculpture"))
		{
			Iterator<SculptureCategory> a = SculptureCategory.instanceIterator(mtc.getDB());
			ArrayToReturn = new String[ (int) SculptureCategory.getInstanceNumber(mtc.getDB())];
			Iterator<ArtItem> ite = ArtItem.instanceIterator(mtc.getDB());
			ArtItem item;
			int position = 0;
			while (ite.hasNext()) {
				item = ite.next();
				if(item.getTo_sculpture().length > 0){
				ArrayToReturn[position] = item.getArtTitle();
				position++;
				}
			}
			SecondList.setListData(ArrayToReturn);
			mtc.disconnect();	 
		 }
		if(selectedItemValue.equals("Carving"))
		{
			Iterator<CarvingCategory> a = CarvingCategory.instanceIterator(mtc.getDB());
			ArrayToReturn = new String[ (int) CarvingCategory.getInstanceNumber(mtc.getDB())];
			Iterator<ArtItem> ite = ArtItem.instanceIterator(mtc.getDB());
			ArtItem item;
			int position = 0;
			while (ite.hasNext()) {
				item = ite.next();
				if(item.getTo_carving().length > 0){
				ArrayToReturn[position] = item.getArtTitle();
				position++;
				}
			}
			SecondList.setListData(ArrayToReturn);
			mtc.disconnect();	 
		 }
		
		if(selectedItemValue.equals("Photographic"))
		{
			Iterator<PhotographicCategory> a = PhotographicCategory.instanceIterator(mtc.getDB());
			ArrayToReturn = new String[ (int) PhotographicCategory.getInstanceNumber(mtc.getDB())];
			Iterator<ArtItem> ite = ArtItem.instanceIterator(mtc.getDB());
			ArtItem item;
			int position = 0;
			while (ite.hasNext()) {
				item = ite.next();
				if(item.getTo_photo().length > 0){
				ArrayToReturn[position] = item.getArtTitle();
				position++;
				}
			}
			SecondList.setListData(ArrayToReturn);
			mtc.disconnect();	 
		 }
		
	}
	public void  populateSecondList()
	{
		mtc = new MatisseConnector();
		mtc.connect();
		String[] ArrayToReturn = new String[ (int) ArtItem.getInstanceNumber(mtc.getDB())];
  		String selectedItemValue = CategoryForUnassigin.getSelectedItem()+"";

 			Iterator<ArtItem> a = ArtItem.instanceIterator(mtc.getDB());
 			ArtItem dataPicture;
 			int position = 0;
 			while (a.hasNext()) {
 				dataPicture = a.next();
 				int temporaryPicture = dataPicture.getItemlotNo();
  				if(dataPicture.getTarget_auction().length > 0)
 				    if(dataPicture.getTarget_auction()[0].getAuctionName().equals(selectedItemValue))
 				    {
 				    	ArrayToReturn[position]	= dataPicture.getArtTitle();  
 				    	position++;
 				    }
 			}
 			mtc.disconnect();
 			FirstList.setListData(ArrayToReturn);
  			
	}
	
	public void UpdateInformation() 
	{
		mtc = new MatisseConnector();
		mtc.connect();
 
		AuctionDetails auc = AuctionDetails.lookupFindAuction(mtc.getDB(), AuctionLotNumberForUpdate.getSelectedItem()+"");
 		auc.setAuctionName(AuctionTitleForUpdate.getText());
		auc.setAuctionDate(AuctionDateForUpdate.getText());
		auc.setAuctionTheme(AuctionThemeForUpdate.getText());
		auc.setAuctionLocation(AuctionLocationForUpdate.getSelectedItem()+"");
		auc.setAuctionPeriod(AuctionTimeForUpdate.getSelectedItem()+"");
 		mtc.disconnect();
	}
	
	public void UploadToDatabase()
	{
		mtc = new MatisseConnector();
		mtc.connect();
 
		AuctionDetails auc = new AuctionDetails(mtc.getDB());
		auc.setAuctionName(AuctionTitleName.getText());
		auc.setAuctionDate(AuctionRunningDate.getText());
		auc.setAuctionTheme(AuctionETheme.getText());
		auc.setAuctionLocation(AuctionLocation.getSelectedItem()+"");
		auc.setAuctionPeriod(AuctionTime.getSelectedItem()+"");
		auc.setAuctionLotNumber(Integer.parseInt(AuctionLotNumber.getText()));
		mtc.disconnect();
	}
	public  String[]  displayAuctionLot(){
		mtc = new MatisseConnector();
		mtc.connect();
 		Iterator<AuctionDetails> a = AuctionDetails.instanceIterator(mtc.getDB());

		String[] ArrayToReturn = new String[ (int) AuctionDetails.getInstanceNumber(mtc.getDB())];

 		AuctionDetails temporaryPicture;
		int position = 0;
		while (a.hasNext()) {
			temporaryPicture = a.next();
			ArrayToReturn[position] = temporaryPicture.getAuctionLotNumber()+"";
			position++;
		}
		mtc.disconnect();
		return ArrayToReturn;
	}
	public  String[]  displayAuctionTitle(){
		mtc = new MatisseConnector();
		mtc.connect();
 		Iterator<AuctionDetails> a = AuctionDetails.instanceIterator(mtc.getDB());

		String[] ArrayToReturn = new String[ (int) AuctionDetails.getInstanceNumber(mtc.getDB())];

		AuctionDetails temporaryPicture;
		int position = 0;
		while (a.hasNext()) {
			temporaryPicture = a.next();
			ArrayToReturn[position] = temporaryPicture.getAuctionName();
			position++;
		}
		mtc.disconnect();
		return ArrayToReturn;
	}
	
}