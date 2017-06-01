import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

public class CategoryBackgroundWork {
private int lotItemNo;
	public CategoryBackgroundWork(String lot)
	   {
	 	   if(lot.contains(" ")){
			   lotItemNo = Integer.parseInt(lot.substring(0, lot.indexOf(" "))); 
		   }
	   }
	 private MatisseConnector mtc;
	 private String pic;
     
public JScrollPane itemTabbedPane()
{
	
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    scrollPane.setBounds(160, 60, 600, 510);
    scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
 
    JPanel TheFirstPanel = new JPanel();
    scrollPane.setViewportView(TheFirstPanel);
    scrollPane.setVisible(true);
     
    Color ColourCombination = new Color(202,225,255);	
    Color ColourCombination2 = new Color(159,182,205);	
    		
    JPanel insidePanel = new JPanel();
    TheFirstPanel.add(insidePanel, BorderLayout.CENTER);
    insidePanel.setLayout(new GridLayout(0,1,0,1));
    insidePanel.setBackground(Color.WHITE);

    
    JPanel ThirdPanel = new JPanel();
    ThirdPanel.setLayout(new GridLayout(0,1,0,1));
    insidePanel.add(ThirdPanel, BorderLayout.CENTER);
    
        JPanel SomePanel = new JPanel();
        SomePanel.setPreferredSize(new Dimension(580,50));
        ThirdPanel.add(SomePanel, BorderLayout.WEST);
        SomePanel.setLayout(null);

        JLabel auctionTitle = new JLabel("Auction Title");
        auctionTitle.setForeground(Color.WHITE);
        auctionTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
        auctionTitle.setBounds(102, 0, 82, 20);
        SomePanel.add(auctionTitle); 
        SomePanel.setBackground(ColourCombination2);
        
        JTextArea textArea1 = new JTextArea();
        textArea1.setBackground(ColourCombination);
        textArea1.setBounds(189, 0, 386, 50);
        SomePanel.add(textArea1);
         
        JPanel locationp1 = new JPanel();
        locationp1.setPreferredSize(new Dimension(580,50));
        ThirdPanel.add(locationp1, BorderLayout.WEST);
        locationp1.setLayout(null);
        locationp1.setBackground(ColourCombination2);
        
        JLabel Loca= new JLabel("Location");
        Loca.setForeground(Color.WHITE);
        Loca.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Loca.setBounds(123, 0, 65, 20);
        locationp1.add(Loca); 
        SomePanel.setBackground(ColourCombination2);
        
        JTextArea LocationText = new JTextArea();
        LocationText.setBackground(ColourCombination);
        LocationText.setBounds(189, 0, 386, 50);
        locationp1.add(LocationText);
 		            
		JPanel datePanel = new JPanel();
		datePanel.setPreferredSize(new Dimension(580,50));
		ThirdPanel.add(datePanel, BorderLayout.WEST);
		datePanel.setLayout(null);
		datePanel.setBackground(ColourCombination2);
		
		JLabel dateLabel = new JLabel("Auction Date");
		dateLabel.setForeground(Color.WHITE);
		dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dateLabel.setBounds(98, 0, 90, 20);
		datePanel.add(dateLabel); 
		SomePanel.setBackground(ColourCombination2);
		
		JTextArea dateText = new JTextArea();
		dateText.setBackground(ColourCombination);
		dateText.setBounds(189, 0, 386, 50);
		datePanel.add(dateText);
 		
		JPanel timePanel = new JPanel();
		timePanel.setPreferredSize(new Dimension(580,50));
		ThirdPanel.add(timePanel, BorderLayout.WEST);
		timePanel.setLayout(null);
		timePanel.setBackground(ColourCombination2);
		
		JLabel timeLabel = new JLabel("Auction Time");
		timeLabel.setForeground(Color.WHITE);
		timeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		timeLabel.setBounds(98, 0, 90, 20);
		timePanel.add(timeLabel); 
		SomePanel.setBackground(ColourCombination2);
		
		JTextArea timeText = new JTextArea();
		timeText.setBackground(ColourCombination);
		timeText.setBounds(189, 0, 386, 50);
		timePanel.add(timeText);
				
		JPanel lotPanel = new JPanel();
		lotPanel.setPreferredSize(new Dimension(580,50));
		ThirdPanel.add(lotPanel, BorderLayout.WEST);
		lotPanel.setLayout(null);
		lotPanel.setBackground(ColourCombination2);
		
		JLabel lotl = new JLabel("Lot Refrence Number");
		lotl.setForeground(Color.WHITE);
		lotl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lotl.setBounds(47, 0, 141, 20);
		lotPanel.add(lotl); 
		SomePanel.setBackground(ColourCombination2);
		
		JTextArea lotText = new JTextArea();
		lotText.setBackground(ColourCombination);
		lotText.setBounds(189, 0, 386, 50);
		lotPanel.add(lotText);
				
		JPanel titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension(580,50));
		ThirdPanel.add(titlePanel, BorderLayout.WEST);
		titlePanel.setLayout(null);
		titlePanel.setBackground(ColourCombination2);
		
		JLabel titleLabel = new JLabel("Piece Title");
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		titleLabel.setBounds(117, 0, 71, 20);
		titlePanel.add(titleLabel); 
		SomePanel.setBackground(ColourCombination2);
		
		JTextArea titleText = new JTextArea();
		titleText.setBackground(ColourCombination);
		titleText.setBounds(189, 0, 386, 50);
		titlePanel.add(titleText);
				
		JPanel epricePanel = new JPanel();
		epricePanel.setPreferredSize(new Dimension(580,50));
		ThirdPanel.add(epricePanel, BorderLayout.WEST);
		epricePanel.setLayout(null);
		epricePanel.setBackground(ColourCombination2);
		
		JLabel epriceLabel = new JLabel("Estimate Price");
		epriceLabel.setForeground(Color.WHITE);
		epriceLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		epriceLabel.setBounds(93, 0, 95, 20);
		epricePanel.add(epriceLabel); 
		SomePanel.setBackground(ColourCombination2);
		
		JTextArea epriceText = new JTextArea();
		epriceText.setBackground(ColourCombination);
		epriceText.setBounds(189, 0, 386, 50);
		epricePanel.add(epriceText);
			
		JPanel dimentionsPanel = new JPanel();
		dimentionsPanel.setPreferredSize(new Dimension(580,50));
		ThirdPanel.add(dimentionsPanel, BorderLayout.WEST);
		dimentionsPanel.setLayout(null);
		dimentionsPanel.setBackground(ColourCombination2);
		
		JLabel dimentionsLabel = new JLabel("Dimentions");
		dimentionsLabel.setForeground(Color.WHITE);
		dimentionsLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dimentionsLabel.setBounds(109, 0, 79, 20);
		dimentionsPanel.add(dimentionsLabel); 
		SomePanel.setBackground(ColourCombination2);
		
		JTextArea dimentionsText = new JTextArea();
		dimentionsText.setBackground(ColourCombination);
		dimentionsText.setBounds(189, 0, 386, 50);
		dimentionsPanel.add(dimentionsText);
				
		JPanel framePanel = new JPanel();
		framePanel.setPreferredSize(new Dimension(580,50));
		ThirdPanel.add(framePanel, BorderLayout.WEST);
		framePanel.setLayout(null);
		framePanel.setBackground(ColourCombination2);
		
		JLabel framedLabel = new JLabel("Framed");
		framedLabel.setForeground(Color.WHITE);
		framedLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		framedLabel.setBounds(131, 0, 57, 20);
		framePanel.add(framedLabel); 
		SomePanel.setBackground(ColourCombination2);
		
		JTextArea framedText = new JTextArea();
		framedText.setBackground(ColourCombination);
		framedText.setBounds(189, 0, 386, 50);
		framePanel.add(framedText);
				
		JPanel weightPanel = new JPanel();
		weightPanel.setPreferredSize(new Dimension(580,50));
		ThirdPanel.add(weightPanel, BorderLayout.WEST);
		weightPanel.setLayout(null);
		weightPanel.setBackground(ColourCombination2);
		
		JLabel weightLabel = new JLabel("Weight");
		weightLabel.setForeground(Color.WHITE);
		weightLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		weightLabel.setBounds(131, 0, 57, 20);
		weightPanel.add(weightLabel); 
		SomePanel.setBackground(ColourCombination2);
		
		JTextArea weightText = new JTextArea();
		weightText.setBackground(ColourCombination);
		weightText.setBounds(189, 0, 386, 50);
		weightPanel.add(weightText);
				
		JPanel mediumPanel = new JPanel();
		mediumPanel.setPreferredSize(new Dimension(580,50));
		ThirdPanel.add(mediumPanel, BorderLayout.WEST);
		mediumPanel.setLayout(null);
		mediumPanel.setBackground(ColourCombination2);
		
		JLabel mediumLabel = new JLabel("Medium");
		mediumLabel.setForeground(Color.WHITE);
		mediumLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mediumLabel.setBounds(131, 0, 57, 20);
		mediumPanel.add(mediumLabel); 
		SomePanel.setBackground(ColourCombination2);
		
		JTextArea mediumText = new JTextArea();
		mediumText.setBackground(ColourCombination);
		mediumText.setBounds(189, 0, 386, 50);
		mediumPanel.add(mediumText);
				
		JPanel typePanel = new JPanel();
		typePanel.setPreferredSize(new Dimension(580,50));
		ThirdPanel.add(typePanel, BorderLayout.WEST);
		typePanel.setLayout(null);
		typePanel.setBackground(ColourCombination2);
		
		JLabel typeLabel = new JLabel("Type");
		typeLabel.setForeground(Color.WHITE);
		typeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		typeLabel.setBounds(131, 0, 57, 20);
		typePanel.add(typeLabel); 
		SomePanel.setBackground(ColourCombination2);
		
		JTextArea typeText = new JTextArea();
		typeText.setBackground(ColourCombination);
		typeText.setBounds(189, 0, 386, 50);
		typePanel.add(typeText);
						
		JPanel materialPanel = new JPanel();
		materialPanel.setPreferredSize(new Dimension(580,50));
		ThirdPanel.add(materialPanel, BorderLayout.WEST);
		materialPanel.setLayout(null);
		materialPanel.setBackground(ColourCombination2);
		
		JLabel materialLabel = new JLabel("Material");
		materialLabel.setForeground(Color.WHITE);
		materialLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		materialLabel.setBounds(131, 0, 57, 20);
		materialPanel.add(materialLabel); 
		SomePanel.setBackground(ColourCombination2);
		
		JTextArea materialText = new JTextArea();
		materialText.setBackground(ColourCombination);
		materialText.setBounds(189, 0, 386, 50);
		materialPanel.add(materialText);
		
		JPanel artistPanel = new JPanel();
		artistPanel.setPreferredSize(new Dimension(580,50));
		ThirdPanel.add(artistPanel, BorderLayout.WEST);
		artistPanel.setLayout(null);
		artistPanel.setBackground(ColourCombination2);
		
		JLabel artistLabel = new JLabel("Artist");
		artistLabel.setForeground(Color.WHITE);
		artistLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		artistLabel.setBounds(131, 0, 57, 20);
		artistPanel.add(artistLabel); 
		SomePanel.setBackground(ColourCombination2);
		
		JTextArea artistText = new JTextArea();
		artistText.setBackground(ColourCombination);
		artistText.setBounds(189, 0, 386, 50);
		artistPanel.add(artistText);
				
		JPanel picturePanel = new JPanel();
		picturePanel.setPreferredSize(new Dimension(580,50));
		insidePanel.add(picturePanel, BorderLayout.SOUTH);
		picturePanel.setLayout(new GridLayout(0,1,0,1));
		picturePanel.setBackground(ColourCombination2);
		
		JPanel picturePanel1 = new JPanel();
		JPanel picturePanel2 = new JPanel();
 
		picturePanel1.setPreferredSize(new Dimension(580,50));
		picturePanel.add(picturePanel1);
		picturePanel1.setBackground(ColourCombination2);
		
		JLabel desclLabel1 = new JLabel("Lot Description");
		desclLabel1.setForeground(Color.WHITE);
		desclLabel1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		desclLabel1.setBounds(89, 7, 92, 17);
		picturePanel1.add(desclLabel1); 
		desclLabel1.setBackground(ColourCombination2);
		
		JTextArea descText1 = new JTextArea();
		descText1.setBackground(ColourCombination);
		descText1.setBounds(191, 0, 389, 360);
		picturePanel1.add(descText1);

	    mtc = new MatisseConnector();
		mtc.connect();
 		ArtItem objectT = ArtItem.lookupFindArtItem(mtc.getDB(), lotItemNo+"");
		titleText.setText(objectT.getArtTitle());
 		lotText.setText(lotItemNo+"");
		artistText.setText(objectT.getArtistName());
 		epriceText.setText(objectT.getEstimatedPrice()+"");
  		pic = objectT.getPicture();
  		TheFirstPanel.revalidate();
  		TheFirstPanel.repaint();
  		
 		descText1.setText(objectT.getDescription());  
		textArea1.setText(objectT.getTarget_auction()[0].getAuctionName()+"");
		LocationText.setText(objectT.getTarget_auction()[0].getAuctionLocation()+"");
		dateText.setText(objectT.getTarget_auction()[0].getAuctionDate()+"");
		timeText.setText(objectT.getTarget_auction()[0].getAuctionPeriod()+"");
		mtc.disconnect();
		
		picturePanel2.setPreferredSize(new Dimension(580,50));
		picturePanel.add(picturePanel2);
		picturePanel2.setBackground(ColourCombination2);
		picturePanel1.setLayout(null);
		picturePanel2.setLayout(null);
		
		JLabel picturel = new JLabel("Item Picture");
		picturel.setForeground(Color.WHITE);
		picturel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		picturel.setBounds(250, 11, 74, 17);
		picturePanel2.add(picturel); 
		picturel.setBackground(ColourCombination2);
		
		JLabel ImageEx = new JLabel("");
		ImageEx.setIcon(new ImageIcon(pic));
		ImageEx.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 1);
		ImageEx.setBorder(border);
		ImageEx.setBounds(129,31, 320, 320);
		picturePanel2.add(ImageEx); 
		
		String caty = ItemProperty();
		if (caty.equals("drawing"))
		{
			mtc = new MatisseConnector();
			mtc.connect();
			 
			ArtItem ObjectTemp = ArtItem.lookupFindArtItem(mtc.getDB(),lotItemNo+"");
		  			dimentionsText.setText(ObjectTemp.getTo_drawing()[0].getDrawingDimension());
		  			mediumText.setText(ObjectTemp.getTo_drawing()[0].getDrawingMedium());
 		  			framedText.setText(ObjectTemp.getTo_drawing()[0].getDrawingFrame());
		  			mtc.disconnect();
		}
		
		else if (caty.equals("painting"))
		{
			mtc = new MatisseConnector();
			mtc.connect();
			 
			ArtItem item2 = ArtItem.lookupFindArtItem(mtc.getDB(),lotItemNo+"");
		  			dimentionsText.setText(item2.getTo_painting()[0].getPaintingDimension());
		  			mediumText.setText(item2.getTo_painting()[0].getPaintingMedium());
		  		    framedText.setText(item2.getTo_painting()[0].getPaintingFrame());
		  			mtc.disconnect();
		}
		
		else if (caty.equals("photo"))
		{
			mtc = new MatisseConnector();
			mtc.connect();

			ArtItem item2 = ArtItem.lookupFindArtItem(mtc.getDB(),lotItemNo+"");
		  			dimentionsText.setText(item2.getTo_photo()[0].getPhotoDimension());
		  			typeText.setText(item2.getTo_photo()[0].getPhotoType());
		  			mtc.disconnect();
		}
		
		else if (caty.equals("carving"))
		{
			mtc = new MatisseConnector();
			mtc.connect();
			
			ArtItem item2 = ArtItem.lookupFindArtItem(mtc.getDB(),lotItemNo+"");
		  			dimentionsText.setText(item2.getTo_carving()[0].getCarvingDimension());
		  			materialText.setText(item2.getTo_carving()[0].getCarvingMaterial());
		  			weightText.setText(item2.getTo_carving()[0].getCarvingWeight()+"");
		  			mtc.disconnect();
		}
		else if (caty.equals("scalpture"))
		{
			mtc = new MatisseConnector();
			mtc.connect();
			ArtItem item2 = ArtItem.lookupFindArtItem(mtc.getDB(),lotItemNo+"");
		  			dimentionsText.setText(item2.getTo_sculpture()[0].getSculptureDimension());
		  			materialText.setText(item2.getTo_sculpture()[0].getSculptureMaterial());
		  			weightText.setText(item2.getTo_sculpture()[0].getSculptureWeight()+"");
		  			mtc.disconnect();
		}
		return scrollPane;
}
public String ItemProperty()
{
	mtc = new MatisseConnector();
	mtc.connect();
	ArtItem ObjectTemp = ArtItem.lookupFindArtItem(mtc.getDB(), lotItemNo+"");
	if(ObjectTemp.getTo_drawing().length > 0){
		mtc.disconnect();
		return "drawing";
 	}
	else if(ObjectTemp.getTo_carving().length > 0){
		System.out.println("is carving");
		mtc.disconnect();
		return "carving";
	}
	else if(ObjectTemp.getTo_sculpture().length > 0){
		System.out.println("is sculpture");
		mtc.disconnect();
		return "sculpture";
	}
	else if(ObjectTemp.getTo_painting().length > 0){
		System.out.println("is painting");
		mtc.disconnect();
		return "painting";
	}
	else if(ObjectTemp.getTo_photo().length > 0){
		System.out.println("is photo");
		mtc.disconnect();
		return "photo";
	}
	else
		return "nothing";
	
}

 


}