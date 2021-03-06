

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class CreateAuction {
	 private MatisseConnector mtc;
	 private String image;
	 
	 private int lotNo;
		public CreateAuction(String lot)
		   {
		 	   if(lot.contains(" ")){
				   lotNo = Integer.parseInt(lot.substring(0, lot.indexOf(" "))); 
			   }
		   }

	public JPanel itemTabbedPane()
	{
 
		     
		JPanel test = new JPanel();
		test.setBounds(10, 10, 580, 1200);
		test.setBorder(new EmptyBorder(5, 5, 5, 5));
		test.setLayout(null);
		
	    Color veryLight = new Color(239,230,230);
		JPanel rowPanel = new JPanel();
		rowPanel.setBounds(10, 10,500, 30);
        rowPanel.setPreferredSize(new Dimension(580,50));
        test.add(rowPanel, BorderLayout.WEST);
        rowPanel.setLayout(null);

        JLabel auctionTitle = new JLabel("Auction Title");
        auctionTitle.setForeground(Color.WHITE);
        auctionTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
        auctionTitle.setBounds(102, 0, 82, 20);
        rowPanel.add(auctionTitle); 
        rowPanel.setBackground(SystemColor.GRAY);
        
        JTextArea textArea = new JTextArea();
        textArea.setBackground(veryLight);
        textArea.setBounds(191, 0, 309, 30);
        rowPanel.add(textArea);
        ////////////////////////////
        
        JPanel locationp = new JPanel();
        locationp.setBounds(10, 41, 500, 30);
        locationp.setPreferredSize(new Dimension(580,50));
        test.add(locationp, BorderLayout.WEST);
        locationp.setLayout(null);
        locationp.setBackground(SystemColor.GRAY);
        
        JLabel Location = new JLabel("Location");
        Location.setForeground(Color.WHITE);
        Location.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Location.setBounds(123, 0, 65, 20);
        locationp.add(Location); 
        rowPanel.setBackground(SystemColor.GRAY);
        
        JTextArea Locationt = new JTextArea();
        Locationt.setBackground(veryLight);
        Locationt.setBounds(191, 0, 309, 30);
        locationp.add(Locationt);
		//////////////////////////////////////
		            
		JPanel datep = new JPanel();
		datep.setBounds(10, 72,500, 30);

		datep.setPreferredSize(new Dimension(580,50));
		test.add(datep, BorderLayout.WEST);
		datep.setLayout(null);
		datep.setBackground(SystemColor.GRAY);
		
		JLabel datel = new JLabel("Auction Date");
		datel.setForeground(Color.WHITE);
		datel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		datel.setBounds(99, 0, 89, 20);
		datep.add(datel); 
		rowPanel.setBackground(SystemColor.GRAY);
		
		JTextArea datet = new JTextArea();
		datet.setBackground(veryLight);
		datet.setBounds(191, 0, 309, 30);
		datep.add(datet);
		//////////////////////////////////////
		
		JPanel timep = new JPanel();
		timep.setBounds(10, 103,500, 30);
		timep.setPreferredSize(new Dimension(580,50));
		test.add(timep, BorderLayout.WEST);
		timep.setLayout(null);
		timep.setBackground(SystemColor.GRAY);
		
		JLabel timel = new JLabel("Auction Time");
		timel.setForeground(Color.WHITE);
		timel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		timel.setBounds(99, 0, 89, 20);
		timep.add(timel); 
		rowPanel.setBackground(SystemColor.GRAY);
		
		JTextArea timet = new JTextArea();
		timet.setBackground(veryLight);
		timet.setBounds(191, 0, 309, 30);
		timep.add(timet);
		
		//////////////////////////////////////
		
		JPanel lotp = new JPanel();
		lotp.setBounds(10, 134,500, 30);
		lotp.setPreferredSize(new Dimension(580,50));
		test.add(lotp, BorderLayout.WEST);
		lotp.setLayout(null);
		lotp.setBackground(SystemColor.GRAY);
		
		JLabel lotl = new JLabel("Lot Refrence Number");
		lotl.setForeground(Color.WHITE);
		lotl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lotl.setBounds(47, 0, 141, 20);
		lotp.add(lotl); 
		rowPanel.setBackground(SystemColor.GRAY);
		
		JTextArea lott = new JTextArea();
		lott.setBackground(veryLight);
		lott.setBounds(191, 0, 309, 30);
		lotp.add(lott);
		
		//////////////////////////////////////
		
		JPanel titlep = new JPanel();
		titlep.setBounds(10, 165,500, 30);
		titlep.setPreferredSize(new Dimension(580,50));
		test.add(titlep, BorderLayout.WEST);
		titlep.setLayout(null);
		titlep.setBackground(SystemColor.GRAY);
		
		JLabel titlel = new JLabel("Piece Title");
		titlel.setForeground(Color.WHITE);
		titlel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		titlel.setBounds(117, 0, 71, 20);
		titlep.add(titlel); 
		rowPanel.setBackground(SystemColor.GRAY);
		
		JTextArea titlet = new JTextArea();
		titlet.setBackground(veryLight);
		titlet.setBounds(191, 0, 309, 30);
		titlep.add(titlet);
		
		//////////////////////////////////////
		
		JPanel epricep = new JPanel();
		epricep.setBounds(10, 196,500, 30);

		epricep.setPreferredSize(new Dimension(580,50));
		test.add(epricep, BorderLayout.WEST);
		epricep.setLayout(null);
		epricep.setBackground(SystemColor.GRAY);
		
		JLabel epricel = new JLabel("Estimate Price");
		epricel.setForeground(Color.WHITE);
		epricel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		epricel.setBounds(93, 0, 95, 20);
		epricep.add(epricel); 
		rowPanel.setBackground(SystemColor.GRAY);
		
		JTextArea epricet = new JTextArea();
		epricet.setBackground(veryLight);
		epricet.setBounds(191, 0, 309, 30);
		epricep.add(epricet);
		
		//////////////////////////////////////
		
		JPanel dimentionsp = new JPanel();
		dimentionsp.setBounds(10, 227,500, 30);
		dimentionsp.setPreferredSize(new Dimension(580,50));
		test.add(dimentionsp, BorderLayout.WEST);
		dimentionsp.setLayout(null);
		dimentionsp.setBackground(SystemColor.GRAY);
		
		JLabel dimentionsl = new JLabel("Dimentions");
		dimentionsl.setForeground(Color.WHITE);
		dimentionsl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dimentionsl.setBounds(109, 0, 79, 20);
		dimentionsp.add(dimentionsl); 
		rowPanel.setBackground(SystemColor.GRAY);
		
		JTextArea dimentionst = new JTextArea();
		dimentionst.setBackground(veryLight);
		dimentionst.setBounds(191, 0, 309, 30);
		dimentionsp.add(dimentionst);
		
		//////////////////////////////////////
		
		JPanel framedp = new JPanel();
		framedp.setBounds(10, 258,500, 30);

		framedp.setPreferredSize(new Dimension(580,50));
		test.add(framedp, BorderLayout.WEST);
		framedp.setLayout(null);
		framedp.setBackground(SystemColor.GRAY);
		
		JLabel framedl = new JLabel("Framed");
		framedl.setForeground(Color.WHITE);
		framedl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		framedl.setBounds(131, 0, 57, 20);
		framedp.add(framedl); 
		rowPanel.setBackground(SystemColor.GRAY);
		
		JTextArea framedt = new JTextArea();
		framedt.setBackground(veryLight);
		framedt.setBounds(191, 0, 309, 30);
		framedp.add(framedt);
		
		//////////////////////////////////////
		
		JPanel weightp = new JPanel();
		weightp.setBounds(10, 289,500, 30);

		weightp.setPreferredSize(new Dimension(580,50));
		test.add(weightp, BorderLayout.WEST);
		weightp.setLayout(null);
		weightp.setBackground(SystemColor.GRAY);
		
		JLabel weightl = new JLabel("Weight");
		weightl.setForeground(Color.WHITE);
		weightl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		weightl.setBounds(131, 0, 57, 20);
		weightp.add(weightl); 
		rowPanel.setBackground(SystemColor.GRAY);
		
		JTextArea weightt = new JTextArea();
		weightt.setBackground(veryLight);
		weightt.setBounds(191, 0, 309, 30);
		weightp.add(weightt);
		
		//////////////////////////////////////
		
		JPanel mediump = new JPanel();
		mediump.setBounds(10, 320,500, 30);

		mediump.setPreferredSize(new Dimension(580,50));
		test.add(mediump, BorderLayout.WEST);
		mediump.setLayout(null);
		mediump.setBackground(SystemColor.GRAY);
		
		JLabel mediuml = new JLabel("Medium");
		mediuml.setForeground(Color.WHITE);
		mediuml.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mediuml.setBounds(131, 0, 57, 20);
		mediump.add(mediuml); 
		rowPanel.setBackground(SystemColor.GRAY);
		
		JTextArea mediumt = new JTextArea();
		mediumt.setBackground(veryLight);
		mediumt.setBounds(191, 0, 309, 30);
		mediump.add(mediumt);
		
		//////////////////////////////////////
		
		JPanel typep = new JPanel();
		typep.setBounds(10, 351,500, 30);

		
		typep.setPreferredSize(new Dimension(580,50));
		test.add(typep, BorderLayout.WEST);
		typep.setLayout(null);
		typep.setBackground(SystemColor.GRAY);
		
		JLabel typel = new JLabel("Type");
		typel.setForeground(Color.WHITE);
		typel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		typel.setBounds(131, 0, 57, 20);
		typep.add(typel); 
		rowPanel.setBackground(SystemColor.GRAY);
		
		JTextArea typet = new JTextArea();
		typet.setBackground(veryLight);
		typet.setBounds(191, 0, 309, 30);
		typep.add(typet);
		
		//////////////////////////////////////
				
		JPanel materialp = new JPanel();
		materialp.setBounds(10, 382,500, 30);

		materialp.setPreferredSize(new Dimension(580,50));
		test.add(materialp, BorderLayout.WEST);
		materialp.setLayout(null);
		materialp.setBackground(SystemColor.GRAY);
		
		JLabel materiall = new JLabel("Material");
		materiall.setForeground(Color.WHITE);
		materiall.setFont(new Font("Tahoma", Font.PLAIN, 14));
		materiall.setBounds(131, 0, 57, 20);
		materialp.add(materiall); 
		rowPanel.setBackground(SystemColor.GRAY);
		
		JTextArea materialt = new JTextArea();
		materialt.setBackground(veryLight);
		materialt.setBounds(191, 0, 309, 30);
		materialp.add(materialt);
		//////////////////////////////////////
		
		JPanel artistp = new JPanel();
		artistp.setBounds(10, 413,500, 30);

		artistp.setPreferredSize(new Dimension(580,50));
		test.add(artistp, BorderLayout.WEST);
		artistp.setLayout(null);
		artistp.setBackground(SystemColor.GRAY);
		
		JLabel artistl = new JLabel("Artist");
		artistl.setForeground(Color.WHITE);
		artistl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		artistl.setBounds(131, 0, 57, 20);
		artistp.add(artistl); 
		rowPanel.setBackground(SystemColor.GRAY);
		
		JTextArea artistt = new JTextArea();
		artistt.setBackground(veryLight);
		artistt.setBounds(191, 0, 309, 30);
		artistp.add(artistt);
		
		//////////////////////////////////////
 				
 
		
		JPanel picp1 = new JPanel();
		picp1.setBounds(10, 444,500, 200);
		 
		picp1.setPreferredSize(new Dimension(580,50));
		test.add(picp1, BorderLayout.WEST);
 		picp1.setBackground(SystemColor.GRAY);
		picp1.setLayout(null);
		
 		
		JLabel descl1 = new JLabel("Lot Description");
		descl1.setForeground(Color.WHITE);
		descl1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		descl1.setBounds(89, 7, 92, 17);
		picp1.add(descl1); 
		descl1.setBackground(SystemColor.GRAY);
		
		JTextArea desct1 = new JTextArea();
		desct1.setBackground(veryLight);
		desct1.setBounds(191, 0, 309, 200);
		picp1.add(desct1);
			
		    mtc = new MatisseConnector();
			mtc.connect();
	 		ArtItem tempD = ArtItem.lookupFindArtItem(mtc.getDB(), lotNo+"");
			titlet.setText(tempD.getArtTitle());
	 		lott.setText(lotNo+"");
			artistt.setText(tempD.getArtistName());
	 		epricet.setText(tempD.getEstimatedPrice()+"");
	  		image = tempD.getPicture();
	  		test.revalidate();
	  		test.repaint();
	  		
	 		desct1.setText(tempD.getDescription());  
			textArea.setText(tempD.getTarget_auction()[0].getAuctionName()+"");
			Locationt.setText(tempD.getTarget_auction()[0].getAuctionLocation()+"");
			datet.setText(tempD.getTarget_auction()[0].getAuctionDate()+"");
			timet.setText(tempD.getTarget_auction()[0].getAuctionPeriod()+"");
	 		
			mtc.disconnect();
			
		JPanel picp2 = new JPanel();
		picp2.setBounds(10, 645,500, 400);
		 
		picp2.setPreferredSize(new Dimension(580,50));
		test.add(picp2, BorderLayout.WEST);
 		picp2.setBackground(SystemColor.GRAY);
		picp2.setLayout(null);
		
		JLabel actualImage = new JLabel("");
		actualImage.setIcon(new ImageIcon(image));
		actualImage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 1);
		actualImage.setBorder(border);
		actualImage.setBounds(69,11, 380, 194);
		picp2.add(actualImage); 
				
		
		
				String category = itemProperties();
				if (category.equals("drawing"))
				{
					mtc = new MatisseConnector();
					mtc.connect();
					 
					ArtItem item = ArtItem.lookupFindArtItem(mtc.getDB(),lotNo+"");
				  			dimentionst.setText(item.getTo_drawing()[0].getDrawingDimension());
				  			mediumt.setText(item.getTo_drawing()[0].getDrawingMedium());
				  				framedt.setText(item.getTo_drawing()[0].getDrawingFrame());
				  			mtc.disconnect();
				}
				
				else if (category.equals("painting"))
				{
					mtc = new MatisseConnector();
					mtc.connect();
					 
					ArtItem item2 = ArtItem.lookupFindArtItem(mtc.getDB(),lotNo+"");
				  			dimentionst.setText(item2.getTo_painting()[0].getPaintingDimension());
				  			mediumt.setText(item2.getTo_painting()[0].getPaintingMedium());
				  			framedt.setText(item2.getTo_painting()[0].getPaintingFrame());
				  			mtc.disconnect();
				}
				
				else if (category.equals("photo"))
				{
					mtc = new MatisseConnector();
					mtc.connect();

					ArtItem item2 = ArtItem.lookupFindArtItem(mtc.getDB(),lotNo+"");
				  			dimentionst.setText(item2.getTo_photo()[0].getPhotoDimension());
				  			typet.setText(item2.getTo_photo()[0].getPhotoType());
				  			mtc.disconnect();
				}
				
				else if (category.equals("carving"))
				{
					mtc = new MatisseConnector();
					mtc.connect();
					
					ArtItem item2 = ArtItem.lookupFindArtItem(mtc.getDB(),lotNo+"");
				  			dimentionst.setText(item2.getTo_carving()[0].getCarvingDimension());
				  			materialt.setText(item2.getTo_carving()[0].getCarvingMaterial());
				  			weightt.setText(item2.getTo_carving()[0].getCarvingWeight()+"");
				  			mtc.disconnect();
				}
				else if (category.equals("scalpture"))
				{
					mtc = new MatisseConnector();
					mtc.connect();
					ArtItem item2 = ArtItem.lookupFindArtItem(mtc.getDB(),lotNo+"");
				  			dimentionst.setText(item2.getTo_sculpture()[0].getSculptureDimension());
				  			materialt.setText(item2.getTo_sculpture()[0].getSculptureMaterial());
				  			weightt.setText(item2.getTo_sculpture()[0].getSculptureWeight()+"");
				  			mtc.disconnect();
				}
				
				return test;
		}
		public String itemProperties()
		{
			mtc = new MatisseConnector();
			mtc.connect();
			ArtItem item = ArtItem.lookupFindArtItem(mtc.getDB(), lotNo+"");
			if(item.getTo_drawing().length > 0){
				mtc.disconnect();
				return "drawing";
		 	}
			else if(item.getTo_carving().length > 0){
				System.out.println("is carving");
				mtc.disconnect();
				return "carving";
			}
			else if(item.getTo_painting().length > 0){
				System.out.println("is painting");
				mtc.disconnect();
				return "painting";
			}
			else if(item.getTo_photo().length > 0){
				System.out.println("is photo");
				mtc.disconnect();
				return "photo";
			}
			else if(item.getTo_sculpture().length > 0){
				System.out.println("is sculpture");
				mtc.disconnect();
				return "sculpture";
			}
			else
				return "dd";
			
		}

		 


		}