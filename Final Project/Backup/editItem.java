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

public class editItem extends JPanel implements ActionListener {
 
    private JTextField ItemLot, ItemArtist,
    ItemYear,AuctionDate, ReservedPrice ,Dimentions , Weight,  Material,
     PieceTitle, ItemClassification,  EstimatedPrice, Sellerdisplay, Type, Medium, Frame;
    private JLabel lblDimention, lblMaterial, lblWeight, lblType, lblMedium, pictureHolder;
     private MatisseConnector mtc;
	 private JPanel  Pane;
	 private JTextArea  ItemDescription,  ItemProvenace;
	 private JCheckBox  CustomerAggrement,  Authentification ;
	 private JButton deleteButton, updateButton, changeImage;
	 private int lotNo;
	 private String picture;
	 private JFileChooser Drawingchooser;

   public editItem(String lotNumber)
   {
 	   if(lotNumber.contains(" ")){
		   lotNo = Integer.parseInt(lotNumber.substring(0, lotNumber.indexOf(" "))); 
	   }
   }
     
    public JPanel itemTabbedPane(){
	
	 Pane = new JPanel();
	 Pane.setBounds(160, 60, 600, 510);
	 Pane.setLayout(null);
	 Pane.setBackground(Color.GRAY);
	
	 ItemLot = new JTextField();
	 ItemLot.setBounds(120, 25, 160, 20);
	 Pane.add( ItemLot);
	 ItemLot.setColumns(10);
	
	 PieceTitle = new JTextField();
	 PieceTitle.setBounds(120, 60, 160, 20);
	 Pane.add( PieceTitle);
	 PieceTitle.setColumns(10);
	
	 ItemArtist = new JTextField();
	 ItemArtist.setBounds(120, 95, 160, 20);
	 Pane.add( ItemArtist);
	 ItemArtist.setColumns(10);
	
	 ItemYear = new JTextField();
	 ItemYear.setBounds(120, 130, 160, 20);
	 Pane.add( ItemYear);
	 ItemYear.setColumns(10);
	
	 ItemClassification = new JTextField();
	 ItemClassification.setBounds(120, 165, 160, 20);
	 Pane.add( ItemClassification);
	 ItemClassification.setColumns(10);
	
	 AuctionDate = new JTextField();
	 AuctionDate.setBounds(120, 200, 160, 20);
	 Pane.add( AuctionDate);
	 AuctionDate.setColumns(10);
	
	 EstimatedPrice = new JTextField();
	 EstimatedPrice.setBounds(120, 235, 160, 20);
	 Pane.add( EstimatedPrice);
	 EstimatedPrice.setColumns(10);
	
	 ReservedPrice = new JTextField();
	 ReservedPrice.setBounds(120, 270, 160, 20);
     Pane.add( ReservedPrice);
	 ReservedPrice.setColumns(10);
	
	 Sellerdisplay = new JTextField();
	 Sellerdisplay.setBounds(120, 305, 160, 20);
	 Pane.add( Sellerdisplay);
	
	 CustomerAggrement = new JCheckBox("Customer Aggrement");
	 CustomerAggrement.setBounds(120, 335, 160, 23);
	 Pane.add( CustomerAggrement);
	
	 Authentification = new JCheckBox("Authentification");
	 Authentification.setBounds(120, 360, 160, 23);
	 Pane.add( Authentification);
	
	 ItemProvenace = new JTextArea();
	 ItemProvenace.setBounds(120, 390, 160, 40);
	 Pane.add( ItemProvenace);
	
	 ItemDescription = new JTextArea();
	 ItemDescription.setBounds(120, 440, 160, 40);
	 Pane.add( ItemDescription);
	
	JLabel lblLotNumberCarv = new JLabel("Lot Number");
	lblLotNumberCarv.setBounds(10, 25, 100, 20);
	 Pane.add(lblLotNumberCarv);
	
	JLabel lblTitleCarv= new JLabel("Piece Title");
	lblTitleCarv.setBounds(10, 60, 100, 20);
	 Pane.add(lblTitleCarv);
	
	JLabel lblItemNameCarv= new JLabel("Artist Name");
	lblItemNameCarv.setBounds(10, 95, 100, 20);
	 Pane.add(lblItemNameCarv);
	
	JLabel lblYearCarv= new JLabel("Estimated Period");
	lblYearCarv.setBounds(10, 130, 100, 20);
	 Pane.add(lblYearCarv);
	
	JLabel lblClassificationCarv = new JLabel("Classification");
	lblClassificationCarv.setBounds(10, 165, 100, 20);
	 Pane.add(lblClassificationCarv);
	
	
	JLabel lblAuctionDateCarv = new JLabel("Auction Date");
	lblAuctionDateCarv.setBounds(10, 200, 100, 20);
	 Pane.add(lblAuctionDateCarv);
	
	JLabel lblEstimatedPriceCarv= new JLabel("Estimated Price");
	lblEstimatedPriceCarv.setBounds(10, 235, 100, 20);
	 Pane.add(lblEstimatedPriceCarv);
	
	JLabel lblReservedPriceCarv = new JLabel("Reserved Price");
	lblReservedPriceCarv.setBounds(10, 270, 100, 20);
	 Pane.add(lblReservedPriceCarv);
	
	JLabel lblUserCarv= new JLabel("User Name");
	lblUserCarv.setBounds(10, 305, 120, 23);
	 Pane.add(lblUserCarv);

	
	JLabel lblProvenanceCarv = new JLabel("Provenance");
	lblProvenanceCarv.setBounds(10, 390, 100, 20);
	 Pane.add(lblProvenanceCarv);
	
	JLabel lblDescriptionCarv = new JLabel("Description");
	lblDescriptionCarv.setBounds(10, 440, 100, 20);
	 Pane.add(lblDescriptionCarv);
	
    
	
	updateButton  = new JButton("Update Item");
	updateButton .setBounds(320, 460, 120, 20);
	 Pane.add(updateButton );
	 updateButton.addActionListener((ActionListener) this);

	 
	deleteButton  = new JButton("Delete Item");
	deleteButton .setBounds(450, 460, 120, 20);
	 Pane.add(deleteButton );
	 deleteButton.addActionListener((ActionListener) this);

	 
	 displaySeller();
	 itemProperties();
	 //Carving.addActionListener((ActionListener) this);
		
	    mtc = new MatisseConnector();
		mtc.connect();
		ArtItem tempD = ArtItem.lookupFindArtItem(mtc.getDB(), lotNo+"");
		ItemLot.setText(tempD.getItemlotNo()+"");
		PieceTitle.setText(tempD.getArtTitle());
		ItemArtist.setText(tempD.getArtistName());
		ItemYear.setText(tempD.getPeriodFrom());
		ItemClassification.setText(tempD.getClassification()+"");
		AuctionDate.setText(tempD.getAuctionEstimatedDateDate());
		EstimatedPrice.setText(tempD.getEstimatedPrice()+"");
		ReservedPrice.setText(tempD.getReservedPrice()+"");  
 		picture = tempD.getPicture();
		if (tempD.getCustomerAgreement()){
			 CustomerAggrement.setSelected(true);
	        }
		if (tempD.getAuthentification()){
			Authentification.setSelected(true);
	        }
		ItemProvenace.setText(tempD.getProvenanceDetails());
		ItemDescription.setText(tempD.getDescription());
		mtc.disconnect();
		
		changeImage = new JButton("Change Picture");
		changeImage.setBounds(300, 155, 130, 20);
		Pane.add(changeImage);
		changeImage.addActionListener((ActionListener) this);
		
		pictureHolder = new JLabel("");
		pictureHolder.setBounds(300, 180, 270, 270);
		pictureHolder.setIcon(new ImageIcon(picture));	
		Pane.add(pictureHolder);

		
		return Pane;
 
	}
    
	@Override
	public void actionPerformed(ActionEvent event)
    {
    	Object source = event.getSource();
    	//when the button "jBOption1" is pressed:
    	if (source == changeImage)
    	{
    		Drawingchooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & GIF Images", "jpg", "gif");
		    Drawingchooser.setFileFilter(filter);
		    int returnVal = Drawingchooser.showOpenDialog(getParent());
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       pictureHolder.setIcon(new ImageIcon( Drawingchooser.getSelectedFile().getName()));	
		       picture = Drawingchooser.getSelectedFile().getName();
		       Pane.repaint();
			   Pane.revalidate();
    	}
    	}
    	if (source == updateButton)
    	{
    		 updateItemInfo();
    		 Pane.revalidate();
    	     Pane.repaint();
    	}
    	if (source == deleteButton)
    	{
    		 deleteItem();
    		 Pane.revalidate();
    	     Pane.repaint();
    	} 	 
    }
	
	public void deleteItem()
	{
		mtc = new MatisseConnector();
		mtc.connect();
		
		//Item tempItem = Item.lookupFindItem(mtc.getDB(), lotNo+"");
 		ArtItem item = ArtItem.lookupFindArtItem(mtc.getDB(), lotNo+"");
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
 		ArtItem item = ArtItem.lookupFindArtItem(mtc.getDB(), lotNo+"");
		if(item.getTo_drawing().length > 0){
		    item.getTo_drawing()[0].setDrawingDimension(Dimentions.getText());
  			item.getTo_drawing()[0].setDrawingMedium(Medium.getText());
  			 
  			item.getTo_drawing()[0].setDrawingFrame(Frame.getText());
  			//mtc.disconnect();
		}
		else if(item.getTo_painting().length > 0){
		    item.getTo_painting()[0].setPaintingDimension(Dimentions.getText());
  			item.getTo_painting()[0].setPaintingMedium(Medium.getText());
  			 
  			item.getTo_painting()[0].setPaintingFrame(Frame.getText()); 
 		}
		else if(item.getTo_sculpture().length > 0){
		    item.getTo_sculpture()[0].setSculptureDimension(Dimentions.getText());
   			item.getTo_sculpture()[0].setSculptureMaterial(Material.getText());
    		item.getTo_sculpture()[0].setSculptureWeight(Integer.parseInt(Weight.getText()));
 		}
		else if(item.getTo_carving().length > 0){
		    item.getTo_carving()[0].setCarvingDimension(Dimentions.getText());
   			item.getTo_carving()[0].setCarvingMaterial(Material.getText());
    		item.getTo_carving()[0].setCarvingWeight(Integer.parseInt(Weight.getText()));
 		}
		else if(item.getTo_photo().length > 0){
		    item.getTo_photo()[0].setPhotoDimension(Dimentions.getText());
   			item.getTo_photo()[0].setPhotoType(Type.getText()); 
  		}
		item.setArtistName(ItemArtist.getText());
		item.setItemlotNo(Integer.parseInt(ItemLot.getText()));
		item.setArtTitle(PieceTitle.getText());
		item.setPeriodFrom(ItemYear.getText());
		item.setClassification(ItemClassification.getText());
		item.setDescription(ItemDescription.getText());
		item.setProvenanceDetails(ItemProvenace.getText());
		item.setPicture(picture);
		
		
		boolean AuthentificationChecker = false;
		 if (Authentification.isSelected()){
			 AuthentificationChecker = true;
	        }
		 item.setAuthentification(AuthentificationChecker);
		 
		boolean AggrementChecker = false;
		 if (CustomerAggrement.isSelected()){
			 AggrementChecker = true;
	        }
		 item.setCustomerAgreement(AggrementChecker);
		 item.setAuctionEstimatedDateDate(AuctionDate.getText());
		 item.setEstimatedPrice(Double.parseDouble(EstimatedPrice.getText()));
		 item.setReservedPrice(Double.parseDouble(ReservedPrice.getText()));
		
 
		 mtc.disconnect();
	 
	
	}
	public  void  displaySeller(){

		mtc = new MatisseConnector();
		mtc.connect();
		
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
		
		for (int i = 0; i < toDisplay.length; i++) {
			SellerClient sell = SellerClient.lookupFindSellerClient(mtc.getDB(), toDisplay[i]);
			int itemLength = sell.getSells().length;
			for (int j = 0; j < itemLength; j++) {
				if(sell.getSells()[j].getItemlotNo() == lotNo){
					Sellerdisplay.setText(toDisplay[i]);
					break;
				}
			}
		}

		mtc.disconnect();
	} 
	
	public void itemProperties()
	{
		mtc = new MatisseConnector();
		mtc.connect();
		ArtItem item = ArtItem.lookupFindArtItem(mtc.getDB(), lotNo+"");
		if(item.getTo_drawing().length > 0){
			mtc.disconnect();
			properties("drawing");
			System.out.println("is drawing");
		}
		else if(item.getTo_carving().length > 0){
			System.out.println("is carving");
			mtc.disconnect();
			properties("carving");
		}
		else if(item.getTo_painting().length > 0){
			System.out.println("is painting");
			mtc.disconnect();
			properties("painting");
		}
		else if(item.getTo_photo().length > 0){
			System.out.println("is photo");
			mtc.disconnect();
			properties("photo");
		}
		else if(item.getTo_sculpture().length > 0){
			System.out.println("is sculpture");
			mtc.disconnect();
			properties("sculpture");
		}
	

		//mtc.disconnect();

	}
	
	public void properties(String category)
	{
		
		
		lblDimention = new JLabel("Dimensions");
		lblDimention.setBounds(320, 25, 100, 20);
		Pane.add(lblDimention);
		lblMaterial = new JLabel("Material");
		lblWeight = new JLabel("Weight");
		lblType = new JLabel("Type");
		lblMedium = new JLabel("Medium");
		Dimentions = new JTextField();
		Dimentions .setBounds(410, 25, 160, 20);
		Pane.add(Dimentions );
		Material = new JTextField();
		Weight = new JTextField();
		Type = new JTextField();
		Medium = new JTextField();
		Frame = new JTextField("Framed");

		
		if (category.equals("drawing"))
		{
			mtc = new MatisseConnector();
			mtc.connect();
			lblMedium.setBounds(320, 60, 100, 20);
			Pane.add(lblMedium);
			Medium.setBounds(410, 60, 160, 20);
			Pane.add( Medium);
			Frame.setBounds(410, 95, 100, 20);
			Pane.add(Frame);
			ArtItem item = ArtItem.lookupFindArtItem(mtc.getDB(),lotNo+"");
 	  			Dimentions.setText(item.getTo_drawing()[0].getDrawingDimension());
 	  			Medium.setText(item.getTo_drawing()[0].getDrawingMedium());
 	  			Frame.setText(item.getTo_drawing()[0].getDrawingFrame());
 	  			mtc.disconnect();
		}
		
		else if (category.equals("painting"))
		{
			mtc = new MatisseConnector();
			mtc.connect();
			lblMedium.setBounds(320, 60, 100, 20);
			Pane.add(lblMedium);
			Medium.setBounds(410, 60, 160, 20);
			Pane.add( Medium);
			Frame.setBounds(410, 95, 100, 20);
			Pane.add(Frame);
			ArtItem item2 = ArtItem.lookupFindArtItem(mtc.getDB(),lotNo+"");
 	  			Dimentions.setText(item2.getTo_painting()[0].getPaintingDimension());
 	  			Medium.setText(item2.getTo_painting()[0].getPaintingMedium());
 	  			Frame.setText(item2.getTo_painting()[0].getPaintingFrame());;
 	  			mtc.disconnect();
		}
		
		else if (category.equals("photo"))
		{
			mtc = new MatisseConnector();
			mtc.connect();
			lblType.setBounds(320, 60, 100, 20);
			Pane.add(lblType);
			Type.setBounds(410, 60, 160, 20);
			Pane.add( Type);
			 
			ArtItem item2 = ArtItem.lookupFindArtItem(mtc.getDB(),lotNo+"");
 	  			Dimentions.setText(item2.getTo_photo()[0].getPhotoDimension());
 	  			Type.setText(item2.getTo_photo()[0].getPhotoType());
 	  			mtc.disconnect();
		}
		
		else if (category.equals("carving"))
		{
			mtc = new MatisseConnector();
			mtc.connect();
			lblMaterial.setBounds(320, 60, 100, 20);
			Pane.add(lblMaterial);
			Material.setBounds(410, 60, 160, 20);
			Pane.add(Material);
			
			lblWeight.setBounds(320, 95, 100, 20);
			Pane.add(lblWeight);
			Weight.setBounds(410, 95, 160, 20);
			Pane.add(Weight);
			
			 
			ArtItem item2 = ArtItem.lookupFindArtItem(mtc.getDB(),lotNo+"");
 	  			Dimentions.setText(item2.getTo_carving()[0].getCarvingDimension());
 	  			Material.setText(item2.getTo_carving()[0].getCarvingMaterial());
 	  			Weight.setText(item2.getTo_carving()[0].getCarvingWeight()+"");
 	  			mtc.disconnect();
		}
		else if (category.equals("scalpture"))
		{
			mtc = new MatisseConnector();
			mtc.connect();
			lblMaterial.setBounds(320, 60, 100, 20);
			Pane.add(lblMaterial);
			Material.setBounds(410, 60, 160, 20);
			Pane.add(Material);
			
			lblWeight.setBounds(320, 95, 100, 20);
			Pane.add(lblWeight);
			Weight.setBounds(410, 95, 160, 20);
			Pane.add(Weight);
			
			 
			ArtItem item2 = ArtItem.lookupFindArtItem(mtc.getDB(),lotNo+"");
 	  			Dimentions.setText(item2.getTo_sculpture()[0].getSculptureDimension());
 	  			Material.setText(item2.getTo_sculpture()[0].getSculptureMaterial());
 	  			Weight.setText(item2.getTo_sculpture()[0].getSculptureWeight()+"");
 	  			mtc.disconnect();
		}
	
	}

}
     