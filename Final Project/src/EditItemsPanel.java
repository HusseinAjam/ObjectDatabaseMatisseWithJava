import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
  import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
 import javax.swing.JPanel;
 
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EditItemsPanel extends JPanel implements ActionListener {
     private MatisseConnector mtc;
     private JTextField ArtLotNumber, ArtArtistName,
     YearOfMake,AuctionEstimatedDate, ReservedPrice ,Dimentions , ArtWeight,  MaterialUsed,
     ArtTitle, ArtClassification,  EstimatedPrice, SellersList, ArtType, Medium, FrameDescription;
     private JLabel lblDimentions, lblMaterialUsed, lblArtWeight, lblArtType, lblMedium, pictureFrame,lblFrame;
	 private JPanel  ActualPane;
	 private JTextArea  ArtDescription,  ArtProvenace;
	 private JButton DeleteItem, UpdateItem, ReplacePicture;
	 private JCheckBox  CustomerAggrementChecker,  AuthentificationDetails ;
	 private String Picture;
	 private JFileChooser chooserSelector;
	 private int ItemNo;

   public EditItemsPanel(String lotNumber)
   {
 	   if(lotNumber.contains(" ")){
		   ItemNo = Integer.parseInt(lotNumber.substring(0, lotNumber.indexOf(" "))); 
	   }
   }
     
    public JPanel itemTabbedPane(){
	
	 ActualPane = new JPanel();
	 ActualPane.setBounds(160, 60, 600, 510);
	 ActualPane.setLayout(null);
	// ActualPane.setBackground(Color);
	
	 ArtLotNumber = new JTextField();
	 ArtLotNumber.setBounds(120, 25, 160, 20);
	 ActualPane.add( ArtLotNumber);
	 ArtLotNumber.setColumns(10);
	
	 ArtTitle = new JTextField();
	 ArtTitle.setBounds(120, 60, 160, 20);
	 ActualPane.add( ArtTitle);
	 ArtTitle.setColumns(10);
	
	 ArtArtistName = new JTextField();
	 ArtArtistName.setBounds(120, 95, 160, 20);
	 ActualPane.add(ArtArtistName);
	 ArtArtistName.setColumns(10);
	
	 YearOfMake = new JTextField();
	 YearOfMake.setBounds(120, 130, 160, 20);
	 ActualPane.add( YearOfMake);
	 YearOfMake.setColumns(10);
	
	 ArtClassification = new JTextField();
	 ArtClassification.setBounds(120, 165, 160, 20);
	 ActualPane.add( ArtClassification);
	 ArtClassification.setColumns(10);
	
	 AuctionEstimatedDate = new JTextField();
	 AuctionEstimatedDate.setBounds(120, 200, 160, 20);
	 ActualPane.add( AuctionEstimatedDate);
	 AuctionEstimatedDate.setColumns(10);
	
	 EstimatedPrice = new JTextField();
	 EstimatedPrice.setBounds(120, 235, 160, 20);
	 ActualPane.add( EstimatedPrice);
	 EstimatedPrice.setColumns(10);
	
	 ReservedPrice = new JTextField();
	 ReservedPrice.setBounds(120, 270, 160, 20);
     ActualPane.add( ReservedPrice);
	 ReservedPrice.setColumns(10);
	
	 SellersList = new JTextField();
	 SellersList.setBounds(120, 305, 160, 20);
	 ActualPane.add( SellersList);
	
	 CustomerAggrementChecker = new JCheckBox("Customer Aggrement");
	 CustomerAggrementChecker.setBounds(120, 335, 160, 23);
	 ActualPane.add( CustomerAggrementChecker);
	
	 AuthentificationDetails = new JCheckBox("AuthentificationDetails");
	 AuthentificationDetails.setBounds(120, 360, 160, 23);
	 ActualPane.add( AuthentificationDetails);
	
	 ArtProvenace = new JTextArea();
	 ArtProvenace.setBounds(120, 390, 160, 40);
	 ActualPane.add( ArtProvenace);
	
	 ArtDescription = new JTextArea();
	 ArtDescription.setBounds(120, 440, 160, 40);
	 ActualPane.add( ArtDescription);
	
	 JLabel lblLotNo = new JLabel("Lot Number");
	 lblLotNo.setBounds(10, 25, 100, 20);
	 ActualPane.add(lblLotNo);
	
	JLabel lblTitle= new JLabel("Art Title");
	lblTitle.setBounds(10, 60, 100, 20);
	 ActualPane.add(lblTitle);
	
	JLabel lblItemName= new JLabel("Artist Name");
	lblItemName.setBounds(10, 95, 100, 20);
	 ActualPane.add(lblItemName);
	
	JLabel lblYear= new JLabel("Date of Build");
	lblYear.setBounds(10, 130, 100, 20);
	 ActualPane.add(lblYear);
	
	JLabel lblClassification = new JLabel("Classification");
	lblClassification.setBounds(10, 165, 100, 20);
	 ActualPane.add(lblClassification);
	
	
	JLabel lblAuctionDate = new JLabel("Auction Estimated Date");
	lblAuctionDate.setBounds(10, 200, 100, 20);
	 ActualPane.add(lblAuctionDate);
	
	JLabel lblEstimatedPrice= new JLabel("Estimated Price");
	lblEstimatedPrice.setBounds(10, 235, 100, 20);
	 ActualPane.add(lblEstimatedPrice);
	
	JLabel lblReservedPrice = new JLabel("Reserved Price");
	lblReservedPrice.setBounds(10, 270, 100, 20);
	 ActualPane.add(lblReservedPrice);
	
	JLabel lblUser= new JLabel("Seller Name");
	lblUser.setBounds(10, 305, 120, 23);
	 ActualPane.add(lblUser);

	
	JLabel lblProvenance = new JLabel("Provenance");
	lblProvenance.setBounds(10, 390, 100, 20);
	 ActualPane.add(lblProvenance);
	
	JLabel lblDescription = new JLabel("Description");
	lblDescription.setBounds(10, 440, 100, 20);
	 ActualPane.add(lblDescription);
	
	UpdateItem  = new JButton("Update Item");
	UpdateItem .setBounds(320, 460, 120, 20);
	 ActualPane.add(UpdateItem );
	 UpdateItem.addActionListener((ActionListener) this);

	 
	DeleteItem  = new JButton("Remove Item from Databse");
	DeleteItem .setBounds(450, 460, 120, 20);
	 ActualPane.add(DeleteItem );
	 DeleteItem.addActionListener((ActionListener) this);

	 
	 DisplaySellers();
	 ItemProperty();
		
	    mtc = new MatisseConnector();
		mtc.connect();
		ArtItem tempD = ArtItem.lookupFindArtItem(mtc.getDB(), ItemNo+"");
		ArtLotNumber.setText(tempD.getItemlotNo()+"");
		ArtTitle.setText(tempD.getArtTitle());
		ArtArtistName.setText(tempD.getArtistName());
		YearOfMake.setText(tempD.getPeriodFrom());
		ArtClassification.setText(tempD.getClassification()+"");
		AuctionEstimatedDate.setText(tempD.getAuctionEstimatedDateDate());
		EstimatedPrice.setText(tempD.getEstimatedPrice()+"");
		ReservedPrice.setText(tempD.getReservedPrice()+"");  
 		Picture = tempD.getPicture();
		if (tempD.getCustomerAgreement()){
			 CustomerAggrementChecker.setSelected(true);
	        }
		if (tempD.getAuthentification()){
			AuthentificationDetails.setSelected(true);
	        }
		ArtProvenace.setText(tempD.getProvenanceDetails());
		ArtDescription.setText(tempD.getDescription());
		mtc.disconnect();
		
		ReplacePicture = new JButton("Change Picture");
		ReplacePicture.setBounds(300, 155, 130, 20);
		ActualPane.add(ReplacePicture);
		ReplacePicture.addActionListener((ActionListener) this);
		
		pictureFrame = new JLabel("");
		pictureFrame.setBounds(300, 180, 270, 270);
		pictureFrame.setIcon(new ImageIcon(Picture));	
		ActualPane.add(pictureFrame);

		
		return ActualPane;
 
	}
    
	@Override
	public void actionPerformed(ActionEvent event)
    {
    	Object source = event.getSource();
     	if (source == ReplacePicture)
    	{
    		chooserSelector = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		     "JPG & GIF Images", "jpg", "gif");
		    chooserSelector.setFileFilter(filter);
		    int returnVal = chooserSelector.showOpenDialog(getParent());
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       pictureFrame.setIcon(new ImageIcon( chooserSelector.getSelectedFile().getName()));	
		       Picture = chooserSelector.getSelectedFile().getName();
		       ActualPane.repaint();
			   ActualPane.revalidate();
    	}
    	}
    	if (source == UpdateItem)
    	{
    		 updateItemInfo();
    		 ActualPane.revalidate();
    	     ActualPane.repaint();
    	}
    	if (source == DeleteItem)
    	{
    		DeleteItems();
    		 ActualPane.revalidate();
    	     ActualPane.repaint();
    	} 	 
    }
	
	public void DeleteItems()
	{
		mtc = new MatisseConnector();
		mtc.connect();
		
  		ArtItem item = ArtItem.lookupFindArtItem(mtc.getDB(), ItemNo+"");
 		if(item.getTo_drawing().length > 0){
		item.getTo_drawing()[0].remove();
		item.remove();
 		}
 		else if(item.getTo_painting().length > 0){
 			item.getTo_painting()[0].remove();
 			item.remove();
 		}
 		else if(item.getTo_sculpture().length > 0){
 			item.getTo_sculpture()[0].remove();
 			item.remove();
 		}
		else if(item.getTo_carving().length > 0){
 			item.getTo_carving()[0].remove();
 			item.remove();
 		}
		else if(item.getTo_photo().length > 0){
 			item.getTo_photo()[0].remove();
 			item.remove();
  		}
		mtc.disconnect();
	}
	
	public void  updateItemInfo()
	{
		mtc = new MatisseConnector();
		mtc.connect();
 		ArtItem item = ArtItem.lookupFindArtItem(mtc.getDB(), ItemNo+"");
		if(item.getTo_drawing().length > 0){
		    item.getTo_drawing()[0].setDrawingDimension(Dimentions.getText());
  			item.getTo_drawing()[0].setDrawingMedium(Medium.getText());	 
  			item.getTo_drawing()[0].setDrawingFrame(FrameDescription.getText());
 		}
		else if(item.getTo_painting().length > 0){
		    item.getTo_painting()[0].setPaintingDimension(Dimentions.getText());
  			item.getTo_painting()[0].setPaintingMedium(Medium.getText());
   			item.getTo_painting()[0].setPaintingFrame(FrameDescription.getText()); 
 		}
		else if(item.getTo_sculpture().length > 0){
		    item.getTo_sculpture()[0].setSculptureDimension(Dimentions.getText());
   			item.getTo_sculpture()[0].setSculptureMaterial(MaterialUsed.getText());
    		item.getTo_sculpture()[0].setSculptureWeight(Integer.parseInt(ArtWeight.getText()));
 		}
		else if(item.getTo_carving().length > 0){
		    item.getTo_carving()[0].setCarvingDimension(Dimentions.getText());
   			item.getTo_carving()[0].setCarvingMaterial(MaterialUsed.getText());
    		item.getTo_carving()[0].setCarvingWeight(Integer.parseInt(ArtWeight.getText()));
 		}
		else if(item.getTo_photo().length > 0){
		    item.getTo_photo()[0].setPhotoDimension(Dimentions.getText());
   			item.getTo_photo()[0].setPhotoType(ArtType.getText()); 
  		}
		item.setArtistName(ArtArtistName.getText());
		item.setItemlotNo(Integer.parseInt(ArtLotNumber.getText()));
		item.setArtTitle(ArtTitle.getText());
		item.setPeriodFrom(YearOfMake.getText());
		item.setClassification(ArtClassification.getText());
		item.setDescription(ArtDescription.getText());
		item.setProvenanceDetails(ArtProvenace.getText());
		item.setPicture(Picture);
			
		boolean AuthentificationChecker = false;
		 if (AuthentificationDetails.isSelected()){
			 AuthentificationChecker = true;
	        }
		 item.setAuthentification(AuthentificationChecker);
		 
		boolean AggrementChecker = false;
		 if (CustomerAggrementChecker.isSelected()){
			 AggrementChecker = true;
	        }
		 item.setCustomerAgreement(AggrementChecker);
		 item.setAuctionEstimatedDateDate(AuctionEstimatedDate.getText());
		 item.setEstimatedPrice(Double.parseDouble(EstimatedPrice.getText()));
		 item.setReservedPrice(Double.parseDouble(ReservedPrice.getText()));
		 mtc.disconnect();
	 
	
	}
	public  void  DisplaySellers(){

		mtc = new MatisseConnector();
		mtc.connect();
		Iterator<SellerClient> e = SellerClient.instanceIterator(mtc.getDB());
		String[] toDisplay = new String[ (int) SellerClient.getInstanceNumber(mtc.getDB())];
 		SellerClient tempEmp;
		int position = 0;
		while (e.hasNext()) {
			tempEmp = e.next();
			toDisplay[position] = tempEmp.getSellerId()+"";
			position++;
		}
		for (int i = 0; i < toDisplay.length; i++) {
			SellerClient sell = SellerClient.lookupFindSellerClient(mtc.getDB(), toDisplay[i]);
			int itemLength = sell.getSells().length;
			for (int j = 0; j < itemLength; j++) {
				if(sell.getSells()[j].getItemlotNo() == ItemNo){
					SellersList.setText(toDisplay[i]);
					break;
				}
			}
		}
		mtc.disconnect();
	} 
	public void ItemProperty()
	{
		mtc = new MatisseConnector();
		mtc.connect();
		ArtItem art = ArtItem.lookupFindArtItem(mtc.getDB(), ItemNo+"");
		if(art.getTo_drawing().length > 0){
			mtc.disconnect();
			properties("drawing");
 		}
		else if(art.getTo_carving().length > 0){
 			mtc.disconnect();
			properties("carving");
		}
		else if(art.getTo_photo().length > 0){
 			mtc.disconnect();
			properties("photo");
		}
		else if(art.getTo_sculpture().length > 0){
 			mtc.disconnect();
			properties("sculpture");
		}
		else if(art.getTo_painting().length > 0){
 			mtc.disconnect();
			properties("painting");
		}
	}
	
	public void properties(String category)
	{
		lblDimentions = new JLabel("Dimensions");
		lblDimentions.setBounds(320, 25, 100, 20);
		ActualPane.add(lblDimentions);
		lblMaterialUsed = new JLabel("MaterialUsed");
		lblArtWeight = new JLabel("ArtWeight");
		lblArtType = new JLabel("ArtType");
		lblMedium = new JLabel("Medium");
		lblFrame = new JLabel("Frame");
		Dimentions = new JTextField();
		Dimentions .setBounds(410, 25, 160, 20);
		ActualPane.add(Dimentions );
		MaterialUsed = new JTextField();
		ArtWeight = new JTextField();
		ArtType = new JTextField();
		Medium = new JTextField();
		FrameDescription = new JTextField();
		
		if (category.equals("drawing"))
		{
			mtc = new MatisseConnector();
			mtc.connect();
			lblMedium.setBounds(320, 60, 100, 20);
			ActualPane.add(lblMedium);
			Medium.setBounds(410, 60, 160, 20);
			ActualPane.add( Medium);
			FrameDescription.setBounds(410, 95, 100, 20);
			ActualPane.add(FrameDescription);
			lblFrame.setBounds(320, 95, 100, 20);
			ActualPane.add(lblFrame);
			ArtItem item = ArtItem.lookupFindArtItem(mtc.getDB(),ItemNo+"");
  			Dimentions.setText(item.getTo_drawing()[0].getDrawingDimension());
  			Medium.setText(item.getTo_drawing()[0].getDrawingMedium());
  			FrameDescription.setText(item.getTo_drawing()[0].getDrawingFrame());
  			mtc.disconnect();
		}
		else if (category.equals("painting"))
		{
			mtc = new MatisseConnector();
			mtc.connect();
			lblMedium.setBounds(320, 60, 100, 20);
			ActualPane.add(lblMedium);
			Medium.setBounds(410, 60, 160, 20);
			ActualPane.add( Medium);
			FrameDescription.setBounds(410, 95, 100, 20);
			ActualPane.add(FrameDescription);
			lblFrame.setBounds(320, 95, 100, 20);
			ActualPane.add(lblFrame);
			ArtItem item2 = ArtItem.lookupFindArtItem(mtc.getDB(),ItemNo+"");
  			Dimentions.setText(item2.getTo_painting()[0].getPaintingDimension());
  			Medium.setText(item2.getTo_painting()[0].getPaintingMedium());
  			FrameDescription.setText(item2.getTo_painting()[0].getPaintingFrame());;
  			mtc.disconnect();
		}
		else if (category.equals("photo"))
		{
			mtc = new MatisseConnector();
			mtc.connect();
			lblArtType.setBounds(320, 60, 100, 20);
			ActualPane.add(lblArtType);
			ArtType.setBounds(410, 60, 160, 20);
			ActualPane.add( ArtType);
		    ArtItem art = ArtItem.lookupFindArtItem(mtc.getDB(),ItemNo+"");
  			Dimentions.setText(art.getTo_photo()[0].getPhotoDimension());
  			ArtType.setText(art.getTo_photo()[0].getPhotoType());
  			mtc.disconnect();
		}
		else if (category.equals("scalpture"))
		{
			mtc = new MatisseConnector();
			mtc.connect();
			lblMaterialUsed.setBounds(320, 60, 100, 20);
			ActualPane.add(lblMaterialUsed);
			MaterialUsed.setBounds(410, 60, 160, 20);
			ActualPane.add(MaterialUsed);
			
			lblArtWeight.setBounds(320, 95, 100, 20);
			ActualPane.add(lblArtWeight);
			ArtWeight.setBounds(410, 95, 160, 20);
			ActualPane.add(ArtWeight);
		 
			    ArtItem art = ArtItem.lookupFindArtItem(mtc.getDB(),ItemNo+"");
 	  			Dimentions.setText(art.getTo_sculpture()[0].getSculptureDimension());
 	  			MaterialUsed.setText(art.getTo_sculpture()[0].getSculptureMaterial());
 	  			ArtWeight.setText(art.getTo_sculpture()[0].getSculptureWeight()+"");
 	  			mtc.disconnect();
		}
		
		else if (category.equals("carving"))
		{
			mtc = new MatisseConnector();
			mtc.connect();
			lblMaterialUsed.setBounds(320, 60, 100, 20);
			ActualPane.add(lblMaterialUsed);
			MaterialUsed.setBounds(410, 60, 160, 20);
			ActualPane.add(MaterialUsed);
			lblArtWeight.setBounds(320, 95, 100, 20);
			ActualPane.add(lblArtWeight);
			ArtWeight.setBounds(410, 95, 160, 20);
			ActualPane.add(ArtWeight);
		    ArtItem art = ArtItem.lookupFindArtItem(mtc.getDB(),ItemNo+"");
  			Dimentions.setText(art.getTo_carving()[0].getCarvingDimension());
  			MaterialUsed.setText(art.getTo_carving()[0].getCarvingMaterial());
  			ArtWeight.setText(art.getTo_carving()[0].getCarvingWeight()+"");
  			mtc.disconnect();
		}

	}
}
     