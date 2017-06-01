
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ItemBackgroundWork extends JPanel implements ActionListener {
	 private MatisseConnector mtc;
	 
 	 private JTextField ItemLotNumber, PieceTitleName, ItemArtistName, MediumDrawingDetails, DimentionsDrawingDetails,
 	 ArtDateOfMake, ArtClassification,  EstimatedPrice, EstimatedAuctionDate, ReservedPrice,framedDrawingDetails ,PaintingItemLotNumber, PaintingArtArtistName,
	 PaintingItemYearOfMake, PaintingEstimatedAuctionDate, PaintingReservedPrice ,MediumPainting,DimentionsOfPainting,
	 PaintingArtTitleName, PaintingItemClassificationDetails, PaintingArtEstimatedPrice, FramePaintingDetails ,
	 PhotographicItemLot, PhotographicItemArtistName,
	 PhotographicItemYearOfMake,PhotographicAuctionEstimatedDate,PhotographicReservedPrice ,DimentionsOfPhotographic,PhotographicType, 
	 PhotographicPieceTitleName, PhotographicItemClassificationDetails, PhotographicEstimatedPrice,
	 SculptureItemLot, SculptureItemArtistName,
	 SculIpturetemYearOfMake,SculptureAuctionEstimatedDate,SculptureReservedPrice ,DimentionsOfSculpture,SculptureWeight, SculptureMaterial,
	 SculpturePieceTitleName, SculptureItemClassification, SculptureEstimatedPrice,
	 CarvingItemLotNumber, CarvingItemArtistName,
	 CarvingItemYearOfMake,CarvingAuctionEstimatedDate,CarvingReservedPrice ,DimentionsOfCarving,CarvingWeight, CarvingMaterial,
	 CarvingPieceTitleName, CarvingItemClassificationDetails, CarvingEstimatedPrice,TextSearch;
	 
 	 private JCheckBox  CustomerAggrementChecking, AuthentificationChecking ,PaintingCustomerAggrementDetails, PaintingAuthentificationChecking 
 	 ,PhotoCustomerAggrementChecking, PhotographicAuthentificationChecking, SculptureCustomerAggrementChecking, SculptureAuthentificationChecking 
 	 ,CarvingCustomerAggrement, CarvingAuthentification;
 	 
 	 private JButton UploadDrawing, UploadDrawingPicture, UploadPainting,UploadPaintingPicture ,  UploadPhotography, UploadPhotoPicture
 	 , addCarving, UploadCarvingPicture,  UploadSculpture, UploadSculpturePicture, SearchButton;
 	 
	
	 private JPanel DrawingCategoryPane, mainPanel,EditPane,PaintingCategoryPane,PhotographicCategoryPane
	 , SculptureCategoryPane,CarvingCategoryPane;
	 
	 private JTabbedPane tabbedPane;
	 
	 private JComboBox SellerList ,PaintingSellersList , PhotographicSellersList ,SculptureSellersList ,
	 CarvingSellersList ,SearchSelector ,ApprasersListPainting, ApprasersListCarving,ApprasersListPhoto,ApprasersListScul,ApprasersListDrawing  ;
	 
	 private JTextArea DrawingDescriptionDetails, DrawingProvenaceDetails,PaintingDescriptionDetails, PaitingProvenaceDetails
	 , PhotographicDescriptionDetails, PhotographicProvenaceDetails,SculptureDescriptionDetails, SculptureProvenaceDetails
	 ,CarvingDescriptionDetails, CarvingProvenaceDetails;
	 
	 private JLabel DrawingPictureFrame, PhotographicPictureFrame,PaintingPictureFrame, SculpturePictureFrame
	 ,CarvingPictureFrame,SearchResault;
	 
	 private JFileChooser DrawingJChooser,PaintingJChooser,PhotographicJChooser,SculptureJChooser,CarvingJChooser;
 
	 private JList list;

    public JTabbedPane itemTabbedPane(){
    	mainPanel = new JPanel();
    	mainPanel.setBounds(1, 30, 800,600);
    	mainPanel.setLayout(null);
       	 
    	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(30, 1, 800, 600);
		mainPanel.add(tabbedPane);
		
       ////////////////Drawing.....//
		
		DrawingCategoryPane = new JPanel();
		tabbedPane.addTab("New Drawing", null, DrawingCategoryPane, null);
		DrawingCategoryPane.setLayout(null);
		DrawingCategoryPane.setBackground(Color.GRAY);
		
		ItemLotNumber = new JTextField();
		ItemLotNumber.setBounds(166, 20, 160, 20);
		DrawingCategoryPane.add(ItemLotNumber);
		ItemLotNumber.setColumns(10);
		JLabel lblLotNumber = new JLabel("Lot Number");
		lblLotNumber.setBounds(25, 20, 100, 20);
		DrawingCategoryPane.add(lblLotNumber);
		
		
		PieceTitleName = new JTextField();
		PieceTitleName.setBounds(166, 45, 160, 20);
		DrawingCategoryPane.add(PieceTitleName);
		PieceTitleName.setColumns(10);
		JLabel lblTitle = new JLabel("Item Title");
		lblTitle.setBounds(25, 45, 100, 20);
		DrawingCategoryPane.add(lblTitle);
		
		ItemArtistName = new JTextField();
		ItemArtistName.setBounds(166, 80, 160, 20);
		DrawingCategoryPane.add(ItemArtistName);
		ItemArtistName.setColumns(10);
		JLabel lblItemName = new JLabel("Item Artist Name");
		lblItemName.setBounds(25, 80, 100, 20);
		DrawingCategoryPane.add(lblItemName);
		
		ArtDateOfMake = new JTextField();
		ArtDateOfMake.setBounds(166, 105, 160, 20);
		DrawingCategoryPane.add(ArtDateOfMake);
		ArtDateOfMake.setColumns(10);
		JLabel lblYear = new JLabel("Founded Period ");
		lblYear.setBounds(25, 105, 100, 20);
		DrawingCategoryPane.add(lblYear);
		
		ArtClassification = new JTextField();
		ArtClassification.setBounds(166, 130, 160, 20);
		DrawingCategoryPane.add(ArtClassification);
		ArtClassification.setColumns(10);
		JLabel lblClassification = new JLabel("Art Classification");
		lblClassification.setBounds(25, 130, 100, 20);
		DrawingCategoryPane.add(lblClassification);
		
		EstimatedAuctionDate = new JTextField();
		EstimatedAuctionDate.setBounds(166, 155, 160, 20);
		DrawingCategoryPane.add(EstimatedAuctionDate);
		EstimatedAuctionDate.setColumns(10);
		JLabel lblAuctionDate = new JLabel("Auction Estimated Date");
		lblAuctionDate.setBounds(25, 155, 100, 20);
		DrawingCategoryPane.add(lblAuctionDate);
		
		EstimatedPrice = new JTextField();
		EstimatedPrice.setBounds(166, 180, 160, 20);
		DrawingCategoryPane.add(EstimatedPrice);
		EstimatedPrice.setColumns(10);
		JLabel lblEstimatedPrice = new JLabel("Estimated Price");
		lblEstimatedPrice.setBounds(25, 180, 100, 20);
		DrawingCategoryPane.add(lblEstimatedPrice);
		
		ReservedPrice = new JTextField();
		ReservedPrice.setBounds(166, 205, 160, 20);
		DrawingCategoryPane.add(ReservedPrice);
		ReservedPrice.setColumns(10);
		JLabel lblReservedPrice = new JLabel("Reserved Price");
		lblReservedPrice.setBounds(25, 205, 100, 20);
		DrawingCategoryPane.add(lblReservedPrice);
		
		SellerList = new JComboBox(DisplaySellers());
		SellerList.setBounds(166, 230, 150, 20);
		DrawingCategoryPane.add(SellerList);
		JLabel lblUser = new JLabel("Seller Name");
		lblUser.setBounds(25, 230, 120, 23);
		DrawingCategoryPane.add(lblUser);
		
		ApprasersListDrawing = new JComboBox(DisplayApprasers());
		ApprasersListDrawing.setBounds(166, 255, 170, 20);
		DrawingCategoryPane.add(ApprasersListDrawing);		
		JLabel lblapp = new JLabel("Appraisr Name");
		lblapp.setBounds(25, 255, 120, 23);
		DrawingCategoryPane.add(lblapp);
		
		CustomerAggrementChecking = new JCheckBox("Customer Aggrement");
		CustomerAggrementChecking.setBounds(166, 280, 150, 23);
		DrawingCategoryPane.add(CustomerAggrementChecking);
		
		AuthentificationChecking = new JCheckBox("AuthentificationChecking");
		AuthentificationChecking.setBounds(166, 305, 150, 23);
		DrawingCategoryPane.add(AuthentificationChecking);
		
		DrawingProvenaceDetails = new JTextArea();
		DrawingProvenaceDetails.setBounds(166, 340, 200, 90);
		DrawingCategoryPane.add(DrawingProvenaceDetails);
		JLabel lblProvenance = new JLabel("Provenance");
		lblProvenance.setBounds(25, 340, 100, 20);
		DrawingCategoryPane.add(lblProvenance);
		
		
		DrawingDescriptionDetails = new JTextArea();
		DrawingDescriptionDetails.setBounds(166, 450, 200, 100);
		DrawingCategoryPane.add(DrawingDescriptionDetails);
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(25, 450, 100, 20);
		DrawingCategoryPane.add(lblDescription);

        /////Spec Drawing..........////
		
		JLabel lblMedumDrawing = new JLabel("Drawing Medium");
		lblMedumDrawing.setBounds(400, 375, 150, 20);
		DrawingCategoryPane.add(lblMedumDrawing);
		MediumDrawingDetails = new JTextField();
		MediumDrawingDetails.setBounds(540, 375, 160, 20);
		DrawingCategoryPane.add(MediumDrawingDetails);
		MediumDrawingDetails.setColumns(10);
		
		JLabel lblDimentionsDrawing = new JLabel("Drawing Dimentions");
		lblDimentionsDrawing.setBounds(400, 400, 150, 20);
		DrawingCategoryPane.add(lblDimentionsDrawing);
		DimentionsDrawingDetails = new JTextField();
		DimentionsDrawingDetails.setBounds(540, 400, 160, 20);
		DrawingCategoryPane.add(DimentionsDrawingDetails);
		DimentionsDrawingDetails.setColumns(10);
		
		framedDrawingDetails = new JTextField("Framed");
		framedDrawingDetails.setBounds(540, 425, 97, 23);
		DrawingCategoryPane.add(framedDrawingDetails);
		JLabel lblDi  = new JLabel("Drawing Frame");
		lblDi .setBounds(400, 425, 150, 20);
		DrawingCategoryPane.add(lblDi );
		
		DrawingPictureFrame = new JLabel("Select a picture!");
 		Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 1);
		DrawingPictureFrame.setBorder(border);
		DrawingPictureFrame.setBounds(400, 40, 300, 300);
		DrawingCategoryPane.add(DrawingPictureFrame);
		
		UploadDrawingPicture= new JButton("Select Picture");
		UploadDrawingPicture.setBounds(420, 15, 120, 20);
		DrawingCategoryPane.add(UploadDrawingPicture);
		UploadDrawingPicture.addActionListener((ActionListener) this);
		
		UploadDrawing = new JButton("Add To Database");
		UploadDrawing.setBounds(530, 500, 150, 25);
		DrawingCategoryPane.add(UploadDrawing);
		UploadDrawing.addActionListener((ActionListener) this);
		
		//////////Photographic...../
		
		PhotographicCategoryPane = new JPanel();
		tabbedPane.addTab("New Photographic", null,PhotographicCategoryPane, null);
		PhotographicCategoryPane.setLayout(null);
		PhotographicCategoryPane.setBackground(Color.GRAY);

		
		PhotographicItemLot = new JTextField();
		PhotographicItemLot.setBounds(166, 20, 160, 20);
		PhotographicCategoryPane.add(PhotographicItemLot);
		PhotographicItemLot.setColumns(10);
		JLabel lblLotNumberPhotographic = new JLabel("Lot Number");
		lblLotNumberPhotographic.setBounds(25, 20, 100, 20);
		PhotographicCategoryPane.add(lblLotNumberPhotographic);
		
		
		PhotographicPieceTitleName = new JTextField();
		PhotographicPieceTitleName.setBounds(166, 45, 160, 20);
		PhotographicCategoryPane.add(PhotographicPieceTitleName);
		PhotographicPieceTitleName.setColumns(10);
		JLabel lblTitlePhotographic = new JLabel("Item Title");
		lblTitlePhotographic.setBounds(25, 45, 100, 20);
		PhotographicCategoryPane.add(lblTitlePhotographic);
		
		PhotographicItemArtistName = new JTextField();
		PhotographicItemArtistName.setBounds(166, 80, 160, 20);
		PhotographicCategoryPane.add(PhotographicItemArtistName);
		PhotographicItemArtistName.setColumns(10);
		JLabel lblItemNamePhotographic = new JLabel("Item Artist Name");
		lblItemNamePhotographic.setBounds(25, 80, 100, 20);
		PhotographicCategoryPane.add(lblItemNamePhotographic);
		
		PhotographicItemYearOfMake = new JTextField();
		PhotographicItemYearOfMake.setBounds(166, 105, 160, 20);
		PhotographicCategoryPane.add(PhotographicItemYearOfMake);
		PhotographicItemYearOfMake.setColumns(10);
		JLabel lblPhotographicItemYearOfMake= new JLabel("Founded Period ");
		lblPhotographicItemYearOfMake.setBounds(25, 105, 100, 20);
		PhotographicCategoryPane.add(lblPhotographicItemYearOfMake);
		
		PhotographicItemClassificationDetails = new JTextField();
		PhotographicItemClassificationDetails.setBounds(166, 130, 160, 20);
		PhotographicCategoryPane.add(PhotographicItemClassificationDetails);
		PhotographicItemClassificationDetails.setColumns(10);
		
		JLabel lblClassificationPhoto = new JLabel("Art Classification");
		lblClassificationPhoto.setBounds(25, 130, 100, 20);
		PhotographicCategoryPane.add(lblClassificationPhoto);
		
		PhotographicAuctionEstimatedDate = new JTextField();
		PhotographicAuctionEstimatedDate.setBounds(166, 155, 160, 20);
		PhotographicCategoryPane.add(PhotographicAuctionEstimatedDate);
		PhotographicAuctionEstimatedDate.setColumns(10);
		JLabel lblPhotographicAuctionEstimatedDate = new JLabel("Auction Estimated Date");
		lblPhotographicAuctionEstimatedDate.setBounds(25, 155, 100, 20);
		PhotographicCategoryPane.add(lblPhotographicAuctionEstimatedDate);
		
		PhotographicEstimatedPrice = new JTextField();
		PhotographicEstimatedPrice.setBounds(166, 180, 160, 20);
		PhotographicCategoryPane.add(PhotographicEstimatedPrice);
		PhotographicEstimatedPrice.setColumns(10);
		JLabel lblPhotographicEstimatedPrice= new JLabel("Estimated Price");
		lblPhotographicEstimatedPrice.setBounds(25, 180, 100, 20);
		PhotographicCategoryPane.add(lblPhotographicEstimatedPrice);
		
		PhotographicReservedPrice = new JTextField();
		PhotographicReservedPrice.setBounds(166, 205, 160, 20);
		PhotographicCategoryPane.add(PhotographicReservedPrice);
		PhotographicReservedPrice.setColumns(10);
		JLabel lblPhotographicReservedPrice = new JLabel("Reserved Price");
		lblPhotographicReservedPrice.setBounds(25, 205, 100, 20);
		PhotographicCategoryPane.add(lblPhotographicReservedPrice);
		
		PhotographicSellersList = new JComboBox(DisplaySellers());
		PhotographicSellersList.setBounds(166, 230, 150, 20);
		PhotographicCategoryPane.add(PhotographicSellersList);
		JLabel lblPhotographicSellersList = new JLabel("Seller Name");
		lblPhotographicSellersList.setBounds(25, 230, 120, 23);
		PhotographicCategoryPane.add(lblPhotographicSellersList);
		
		ApprasersListPhoto = new JComboBox(DisplayApprasers());
		ApprasersListPhoto.setBounds(166, 255, 170, 20);
		PhotographicCategoryPane.add(ApprasersListPhoto);	
		JLabel lblPhotographicapp = new JLabel("Appraisr Name");
		lblPhotographicapp.setBounds(25, 255, 120, 23);
		PhotographicCategoryPane.add(lblPhotographicapp);
		
		PhotoCustomerAggrementChecking = new JCheckBox("Customer Aggrement");
		PhotoCustomerAggrementChecking.setBounds(166, 280, 150, 23);
		PhotographicCategoryPane.add(PhotoCustomerAggrementChecking);
		
		PhotographicAuthentificationChecking = new JCheckBox("Authentification Checking");
		PhotographicAuthentificationChecking.setBounds(166, 305, 150, 30);
		PhotographicCategoryPane.add(PhotographicAuthentificationChecking);
		
		PhotographicProvenaceDetails = new JTextArea();
		PhotographicProvenaceDetails.setBounds(166, 340, 200, 90);
		PhotographicCategoryPane.add(PhotographicProvenaceDetails);
		JLabel lblProvenancePhotographic = new JLabel("Provenance");
		lblProvenancePhotographic.setBounds(25, 340, 100, 20);
		PhotographicCategoryPane.add(lblProvenancePhotographic);
		
		
		PhotographicDescriptionDetails = new JTextArea();
		PhotographicDescriptionDetails.setBounds(166, 450, 200, 100);
		PhotographicCategoryPane.add(PhotographicDescriptionDetails);
		JLabel lblDescriptionPhotographic = new JLabel("Description");
		lblDescriptionPhotographic.setBounds(25, 450, 100, 20);
		PhotographicCategoryPane.add(lblDescriptionPhotographic);

        ////////////Pho Spec...........//
		
		UploadPhotoPicture= new JButton("Select Picture");
		UploadPhotoPicture.setBounds(420, 15, 120, 20);
		PhotographicCategoryPane.add(UploadPhotoPicture);
		UploadPhotoPicture.addActionListener((ActionListener) this);
		
		PhotographicPictureFrame = new JLabel("Select a picture!");
		PhotographicPictureFrame.setBorder(border);
		PhotographicPictureFrame.setBounds(400, 40, 300, 300);
		PhotographicCategoryPane.add(PhotographicPictureFrame);
		

		PhotographicType = new JTextField();
		PhotographicType.setBounds(540, 375, 160, 20);
		PhotographicCategoryPane.add(PhotographicType);
		PhotographicType.setColumns(10);
		JLabel lblTypePhoto = new JLabel("Photographic Type");
		lblTypePhoto.setBounds(400, 375, 150, 20);
		PhotographicCategoryPane.add(lblTypePhoto);
		
		
		DimentionsOfPhotographic = new JTextField();
		DimentionsOfPhotographic.setBounds(540, 400, 160, 20);
		PhotographicCategoryPane.add(DimentionsOfPhotographic);
		DimentionsOfPhotographic.setColumns(10);
		JLabel lblDimentionsPhoto = new JLabel("Photographic Dimentions");
		lblDimentionsPhoto.setBounds(400, 400, 150, 20);
		PhotographicCategoryPane.add(lblDimentionsPhoto);
		
		UploadPhotography = new JButton("Add To Database");
		UploadPhotography.setBounds(530, 500, 150, 25);
		PhotographicCategoryPane.add(UploadPhotography);
		UploadPhotography.addActionListener((ActionListener) this);
		

		

    /// Painting....../
		
		
		PaintingCategoryPane = new JPanel();
		tabbedPane.addTab("New Painting", null,PaintingCategoryPane, null);
		PaintingCategoryPane.setLayout(null);
		PaintingCategoryPane.setBackground(Color.GRAY);

		PaintingItemLotNumber = new JTextField();
		PaintingItemLotNumber.setBounds(166, 20, 160, 20);
		PaintingCategoryPane.add(PaintingItemLotNumber);
		PaintingItemLotNumber.setColumns(10);
		JLabel lblPaintingItemLotNumber = new JLabel("Lot Number");
		lblPaintingItemLotNumber.setBounds(25, 20, 100, 20);
		PaintingCategoryPane.add(lblPaintingItemLotNumber);
		
		
		PaintingArtTitleName= new JTextField();
		PaintingArtTitleName.setBounds(166, 45, 160, 20);
		PaintingCategoryPane.add(PaintingArtTitleName);
		PaintingArtTitleName.setColumns(10);
		JLabel lblPaintingArtTitleName = new JLabel("Item Title");
		lblPaintingArtTitleName.setBounds(25, 45, 100, 20);
		PaintingCategoryPane.add(lblPaintingArtTitleName);
		
		PaintingArtArtistName = new JTextField();
		PaintingArtArtistName.setBounds(166, 80, 160, 20);
		PaintingCategoryPane.add(PaintingArtArtistName);
		PaintingArtArtistName.setColumns(10);
		JLabel lblPaintingArtArtistName = new JLabel("Item Artist Name");
		lblPaintingArtArtistName.setBounds(25, 80, 100, 20);
		PaintingCategoryPane.add(lblPaintingArtArtistName);
		
		PaintingItemYearOfMake = new JTextField();
		PaintingItemYearOfMake.setBounds(166, 105, 160, 20);
		PaintingCategoryPane.add(PaintingItemYearOfMake);
		PaintingItemYearOfMake.setColumns(10);
		JLabel lblPaintingItemYearOfMake= new JLabel("Founded Period ");
		lblPaintingItemYearOfMake.setBounds(25, 105, 100, 20);
		PaintingCategoryPane.add(lblPaintingItemYearOfMake);
		
		PaintingItemClassificationDetails = new JTextField();
		PaintingItemClassificationDetails.setBounds(166, 130, 160, 20);
		PaintingCategoryPane.add(PaintingItemClassificationDetails);
		PaintingItemClassificationDetails.setColumns(10);
		
		JLabel lblPaintingItemClassificationDetails = new JLabel("Art Classification");
		lblPaintingItemClassificationDetails.setBounds(25, 130, 100, 20);
		PaintingCategoryPane.add(lblPaintingItemClassificationDetails);
		
		PaintingEstimatedAuctionDate= new JTextField();
		PaintingEstimatedAuctionDate.setBounds(166, 155, 160, 20);
		PaintingCategoryPane.add(PaintingEstimatedAuctionDate);
		PaintingEstimatedAuctionDate.setColumns(10);
		JLabel lblPaintingEstimatedAuctionDate = new JLabel("Auction Estimated Date");
		lblPaintingEstimatedAuctionDate.setBounds(25, 155, 100, 20);
		PaintingCategoryPane.add(lblPaintingEstimatedAuctionDate);
		
		PaintingArtEstimatedPrice = new JTextField();
		PaintingArtEstimatedPrice.setBounds(166, 180, 160, 20);
		PaintingCategoryPane.add(PaintingArtEstimatedPrice);
		PaintingArtEstimatedPrice.setColumns(10);
		JLabel lblPaintingArtEstimatedPrice= new JLabel("Estimated Price");
		lblPaintingArtEstimatedPrice.setBounds(25, 180, 100, 20);
		PaintingCategoryPane.add(lblPaintingArtEstimatedPrice);
		
		PaintingReservedPrice = new JTextField();
		PaintingReservedPrice.setBounds(166, 205, 160, 20);
		PaintingCategoryPane.add(PaintingReservedPrice);
		PaintingReservedPrice.setColumns(10);
		JLabel lblPaintingReservedPrice = new JLabel("Reserved Price");
		lblPaintingReservedPrice.setBounds(25, 205, 100, 20);
		PaintingCategoryPane.add(lblPaintingReservedPrice);
		
		PaintingSellersList = new JComboBox(DisplaySellers());
		PaintingSellersList.setBounds(166, 230, 150, 20);
		PaintingCategoryPane.add(PaintingSellersList);
		JLabel lblPaintingSellersList = new JLabel("Seller Name");
		lblPaintingSellersList.setBounds(25, 230, 120, 23);
		PaintingCategoryPane.add(lblPaintingSellersList);
		
		ApprasersListPainting= new JComboBox(DisplayApprasers());
		ApprasersListPainting.setBounds(166, 255, 170, 20);
		PaintingCategoryPane.add(ApprasersListPainting);
		JLabel lblPainintgapp = new JLabel("Appraisr Name");
		lblPainintgapp.setBounds(25, 255, 120, 23);
		PaintingCategoryPane.add(lblPainintgapp);
		
		PaintingCustomerAggrementDetails= new JCheckBox("Customer Aggrement");
		PaintingCustomerAggrementDetails.setBounds(166, 280, 150, 23);
		PaintingCategoryPane.add(PaintingCustomerAggrementDetails);
		
		PaintingAuthentificationChecking = new JCheckBox("Authentification Checking");
		PaintingAuthentificationChecking.setBounds(166, 305, 150, 30);
		PaintingCategoryPane.add(PaintingAuthentificationChecking);
		
		PaitingProvenaceDetails = new JTextArea();
		PaitingProvenaceDetails.setBounds(166, 340, 200, 90);
		PaintingCategoryPane.add(PaitingProvenaceDetails);
		JLabel lblPaitingProvenaceDetails= new JLabel("Provenance");
		lblPaitingProvenaceDetails.setBounds(25, 340, 100, 20);
		PaintingCategoryPane.add(lblPaitingProvenaceDetails);
		
		
		PaintingDescriptionDetails = new JTextArea();
		PaintingDescriptionDetails.setBounds(166, 450, 200, 100);
		PaintingCategoryPane.add(PaintingDescriptionDetails);
		JLabel lblPaintingDescriptionDetails= new JLabel("Description");
		lblPaintingDescriptionDetails.setBounds(25, 450, 100, 20);
		PaintingCategoryPane.add(lblPaintingDescriptionDetails);
	
    ////////////////Painting Spec........./
		MediumPainting = new JTextField();
		MediumPainting.setBounds(540, 375, 160, 20);
		PaintingCategoryPane.add(MediumPainting);
		MediumPainting.setColumns(10);
		
	JLabel lblMedumPainting = new JLabel("Painting Medium");
	lblMedumPainting.setBounds(400, 375, 150, 20);
	PaintingCategoryPane.add(lblMedumPainting);
	
	
	DimentionsOfPainting = new JTextField();
	DimentionsOfPainting.setBounds(540, 400, 160, 20);
	PaintingCategoryPane.add(DimentionsOfPainting);
	DimentionsOfPainting.setColumns(10);
	JLabel lblDimentionsPainging = new JLabel("Painting Dimentions");
	lblDimentionsPainging.setBounds(400, 400, 150, 20);
	PaintingCategoryPane.add(lblDimentionsPainging);
	
	FramePaintingDetails = new JTextField();
	FramePaintingDetails.setBounds(540, 425, 160, 20);
	PaintingCategoryPane.add(FramePaintingDetails);
	JLabel lblFramePainging = new JLabel("Painting Frame");
	lblFramePainging.setBounds(400, 425, 150, 20);
	PaintingCategoryPane.add(lblFramePainging);
	
	UploadPainting = new JButton("Add To Database");
	UploadPainting.setBounds(530, 500, 150, 25);
	PaintingCategoryPane.add(UploadPainting);
	UploadPainting.addActionListener((ActionListener) this);
	
	PaintingPictureFrame = new JLabel("Select a picture!");
	
	PaintingPictureFrame.setBorder(border);
	PaintingPictureFrame.setBounds(400, 40, 300, 300);
	PaintingCategoryPane.add(PaintingPictureFrame);
	
	UploadPaintingPicture= new JButton("Select Picture");
	UploadPaintingPicture.setBounds(420, 15, 120, 20);
	PaintingCategoryPane.add(UploadPaintingPicture);
	UploadPaintingPicture.addActionListener((ActionListener) this);

	
	/////////////Sculpture General////////////////
	
	SculptureCategoryPane = new JPanel();
	tabbedPane.addTab("New Sculpture", null,SculptureCategoryPane, null);
	SculptureCategoryPane.setLayout(null);
	SculptureCategoryPane.setBackground(Color.GRAY);

	
	SculptureItemLot = new JTextField();
	SculptureItemLot.setBounds(166, 20, 160, 20);
	SculptureCategoryPane.add(SculptureItemLot);
	SculptureItemLot.setColumns(10);
	JLabel lblSculptureItemLot = new JLabel("Lot Number");
	lblSculptureItemLot.setBounds(25, 20, 100, 20);
	SculptureCategoryPane.add(lblSculptureItemLot);
	
	
	SculpturePieceTitleName= new JTextField();
	SculpturePieceTitleName.setBounds(166, 45, 160, 20);
	SculptureCategoryPane.add(SculpturePieceTitleName);
	SculpturePieceTitleName.setColumns(10);
	JLabel lblSculpturePieceTitleName = new JLabel("Item Title");
	lblSculpturePieceTitleName.setBounds(25, 45, 100, 20);
	SculptureCategoryPane.add(lblSculpturePieceTitleName);
	
	SculptureItemArtistName = new JTextField();
	SculptureItemArtistName.setBounds(166, 80, 160, 20);
	SculptureCategoryPane.add(SculptureItemArtistName);
	SculptureItemArtistName.setColumns(10);
	JLabel lblSculptureItemArtistName = new JLabel("Item Artist Name");
	lblSculptureItemArtistName.setBounds(25, 80, 100, 20);
	SculptureCategoryPane.add(lblSculptureItemArtistName);
	
	SculIpturetemYearOfMake = new JTextField();
	SculIpturetemYearOfMake.setBounds(166, 105, 160, 20);
	SculptureCategoryPane.add(SculIpturetemYearOfMake);
	SculIpturetemYearOfMake.setColumns(10);
	JLabel lblSculIpturetemYearOfMake= new JLabel("Founded Period ");
	lblSculIpturetemYearOfMake.setBounds(25, 105, 100, 20);
	SculptureCategoryPane.add(lblSculIpturetemYearOfMake);
	
     SculptureItemClassification = new JTextField();
     SculptureItemClassification.setBounds(166, 130, 160, 20);
	SculptureCategoryPane.add(SculptureItemClassification);
	SculptureItemClassification.setColumns(10);
	
	JLabel lblSculptureItemClassification= new JLabel("Art Classification");
	lblSculptureItemClassification.setBounds(25, 130, 100, 20);
	SculptureCategoryPane.add(lblSculptureItemClassification);
	
	SculptureAuctionEstimatedDate= new JTextField();
	SculptureAuctionEstimatedDate.setBounds(166, 155, 160, 20);
	SculptureCategoryPane.add(SculptureAuctionEstimatedDate);
	SculptureAuctionEstimatedDate.setColumns(10);
	JLabel lblSculptureAuctionEstimatedDate = new JLabel("Auction Estimated Date");
	lblSculptureAuctionEstimatedDate.setBounds(25, 155, 100, 20);
	SculptureCategoryPane.add(lblSculptureAuctionEstimatedDate);
	
	SculptureEstimatedPrice = new JTextField();
	SculptureEstimatedPrice.setBounds(166, 180, 160, 20);
	SculptureCategoryPane.add(SculptureEstimatedPrice);
	SculptureEstimatedPrice.setColumns(10);
	JLabel lblSculptureEstimatedPrice= new JLabel("Estimated Price");
	lblSculptureEstimatedPrice.setBounds(25, 180, 100, 20);
	SculptureCategoryPane.add(lblSculptureEstimatedPrice);
	
	SculptureReservedPrice = new JTextField();
	SculptureReservedPrice.setBounds(166, 205, 160, 20);
	SculptureCategoryPane.add(SculptureReservedPrice);
	SculptureReservedPrice.setColumns(10);
	JLabel lblSculptureReservedPrice = new JLabel("Reserved Price");
	lblSculptureReservedPrice.setBounds(25, 205, 100, 20);
	SculptureCategoryPane.add(lblSculptureReservedPrice);
	
	SculptureSellersList = new JComboBox(DisplaySellers());
	SculptureSellersList.setBounds(166, 230, 150, 20);
	SculptureCategoryPane.add(SculptureSellersList);
	JLabel lblSculptureSellersList = new JLabel("Seller Name");
	lblSculptureSellersList.setBounds(25, 230, 120, 23);
	SculptureCategoryPane.add(lblSculptureSellersList);
	
	ApprasersListScul= new JComboBox(DisplayApprasers());
	ApprasersListScul.setBounds(166, 255, 170, 20);
	SculptureCategoryPane.add(ApprasersListScul);
	JLabel lblSculptureapp = new JLabel("Appraisr Name");
	lblSculptureapp.setBounds(25, 255, 120, 23);
	SculptureCategoryPane.add(lblSculptureapp);
	
	SculptureCustomerAggrementChecking= new JCheckBox("Customer Aggrement");
	SculptureCustomerAggrementChecking.setBounds(166, 280, 150, 23);
	SculptureCategoryPane.add(SculptureCustomerAggrementChecking);
	
	SculptureAuthentificationChecking = new JCheckBox("Authentification Checking");
	SculptureAuthentificationChecking.setBounds(166, 305, 150, 30);
	SculptureCategoryPane.add(SculptureAuthentificationChecking);
	
	SculptureProvenaceDetails = new JTextArea();
	SculptureProvenaceDetails.setBounds(166, 340, 200, 90);
	SculptureCategoryPane.add(SculptureProvenaceDetails);
	JLabel lblSculptureProvenaceDetails= new JLabel("Provenance");
	lblSculptureProvenaceDetails.setBounds(25, 340, 100, 20);
	SculptureCategoryPane.add(lblSculptureProvenaceDetails);
	
	
	SculptureDescriptionDetails = new JTextArea();
	SculptureDescriptionDetails.setBounds(166, 450, 200, 100);
	SculptureCategoryPane.add(SculptureDescriptionDetails);
	JLabel lblSculptureDescriptionDetails= new JLabel("Description");
	lblSculptureDescriptionDetails.setBounds(25, 450, 100, 20);
	SculptureCategoryPane.add(lblSculptureDescriptionDetails);
	
    //////////Scul spec.........................//
	
	JLabel lblDimentionScul= new JLabel("Sculpture Dimention");
	lblDimentionScul.setBounds(400, 400, 150, 20);
	SculptureCategoryPane.add(lblDimentionScul);
	
	JLabel lblMaterialScul = new JLabel("Sculpture Material");
	lblMaterialScul.setBounds(400, 375, 150, 20);
	SculptureCategoryPane.add(lblMaterialScul);
	
	JLabel lblWeightScul = new JLabel("Sculpture Weight");
	lblWeightScul.setBounds(400, 425, 150, 20);
	SculptureCategoryPane.add(lblWeightScul);
	
	DimentionsOfSculpture = new JTextField();
	DimentionsOfSculpture.setBounds(540, 400, 160, 20);
	SculptureCategoryPane.add(DimentionsOfSculpture);
	DimentionsOfSculpture.setColumns(10);
	
	SculptureMaterial = new JTextField();
	SculptureMaterial.setBounds(540, 375, 160, 20);
	SculptureCategoryPane.add(SculptureMaterial);
	SculptureMaterial.setColumns(10);
	
	SculptureWeight = new JTextField();
	SculptureWeight.setBounds(540, 425, 160, 20);
	SculptureCategoryPane.add(SculptureWeight);
	SculptureWeight.setColumns(10);
	
	UploadSculpture = new JButton("Add To Database");
	UploadSculpture.setBounds(530, 500, 150, 25);
	SculptureCategoryPane.add(UploadSculpture);
	UploadSculpture.addActionListener((ActionListener) this);
	
	SculpturePictureFrame = new JLabel("Please select a picture!");
	
	SculpturePictureFrame.setBorder(border);
	SculpturePictureFrame.setBounds(400, 40, 300, 300);
	SculptureCategoryPane.add(SculpturePictureFrame);
	
	UploadSculpturePicture= new JButton("Select Picture");
	UploadSculpturePicture.setBounds(420, 15, 120, 20);
	SculptureCategoryPane.add(UploadSculpturePicture);
	UploadSculpturePicture.addActionListener((ActionListener) this);
	
	
  
	/////////////Carving General////////////////
	
	CarvingCategoryPane = new JPanel();
	tabbedPane.addTab("New Carving", null,CarvingCategoryPane, null);
	CarvingCategoryPane.setLayout(null);
	CarvingCategoryPane.setBackground(Color.GRAY);

	
	CarvingItemLotNumber = new JTextField();
	CarvingItemLotNumber.setBounds(166, 20, 160, 20);
	CarvingCategoryPane.add(CarvingItemLotNumber);
	CarvingItemLotNumber.setColumns(10);
	JLabel lblCarvingItemLotNumber = new JLabel("Lot Number");
	lblCarvingItemLotNumber.setBounds(25, 20, 100, 20);
	CarvingCategoryPane.add(lblCarvingItemLotNumber);
	
	
	CarvingPieceTitleName= new JTextField();
	CarvingPieceTitleName.setBounds(166, 45, 160, 20);
	CarvingCategoryPane.add(CarvingPieceTitleName);
	CarvingPieceTitleName.setColumns(10);
	JLabel lblCarvingPieceTitleName = new JLabel("Item Title");
	lblCarvingPieceTitleName.setBounds(25, 45, 100, 20);
	CarvingCategoryPane.add(lblCarvingPieceTitleName);
	
	CarvingItemArtistName = new JTextField();
	CarvingItemArtistName.setBounds(166, 80, 160, 20);
	CarvingCategoryPane.add(CarvingItemArtistName);
	CarvingItemArtistName.setColumns(10);
	JLabel lblCarvingItemArtistName = new JLabel("Item Artist Name");
	lblCarvingItemArtistName.setBounds(25, 80, 100, 20);
	CarvingCategoryPane.add(lblCarvingItemArtistName);
	
	CarvingItemYearOfMake = new JTextField();
	CarvingItemYearOfMake.setBounds(166, 105, 160, 20);
	CarvingCategoryPane.add(CarvingItemYearOfMake);
	CarvingItemYearOfMake.setColumns(10);
	JLabel lblCarvingItemYearOfMake= new JLabel("Founded Period ");
	lblCarvingItemYearOfMake.setBounds(25, 105, 100, 20);
	CarvingCategoryPane.add(lblCarvingItemYearOfMake);
	
     CarvingItemClassificationDetails = new JTextField();
     CarvingItemClassificationDetails.setBounds(166, 130, 160, 20);
     CarvingCategoryPane.add(CarvingItemClassificationDetails);
     CarvingItemClassificationDetails.setColumns(10);
	
	JLabel lblCarvingItemClassificationDetails= new JLabel("Art Classification");
	lblCarvingItemClassificationDetails.setBounds(25, 130, 100, 20);
	CarvingCategoryPane.add(lblCarvingItemClassificationDetails);
	
	CarvingAuctionEstimatedDate= new JTextField();
	CarvingAuctionEstimatedDate.setBounds(166, 155, 160, 20);
	CarvingCategoryPane.add(CarvingAuctionEstimatedDate);
	CarvingAuctionEstimatedDate.setColumns(10);
	JLabel lblCarvingAuctionEstimatedDate = new JLabel("Auction Estimated Date");
	lblCarvingAuctionEstimatedDate.setBounds(25, 155, 100, 20);
	CarvingCategoryPane.add(lblCarvingAuctionEstimatedDate);
	
	CarvingEstimatedPrice = new JTextField();
	CarvingEstimatedPrice.setBounds(166, 180, 160, 20);
	CarvingCategoryPane.add(CarvingEstimatedPrice);
	CarvingEstimatedPrice.setColumns(10);
	JLabel lblCarvingEstimatedPrice= new JLabel("Estimated Price");
	lblCarvingEstimatedPrice.setBounds(25, 180, 100, 20);
	CarvingCategoryPane.add(lblCarvingEstimatedPrice);
	
	CarvingReservedPrice = new JTextField();
	CarvingReservedPrice.setBounds(166, 205, 160, 20);
	CarvingCategoryPane.add(CarvingReservedPrice);
	CarvingReservedPrice.setColumns(10);
	JLabel lblCarvingReservedPrice = new JLabel("Reserved Price");
	lblCarvingReservedPrice.setBounds(25, 205, 100, 20);
	CarvingCategoryPane.add(lblCarvingReservedPrice);
	
	CarvingSellersList = new JComboBox(DisplaySellers());
	CarvingSellersList.setBounds(166, 230, 150, 20);
	CarvingCategoryPane.add(CarvingSellersList);
	JLabel lblCarvingSellersList = new JLabel("Seller Name");
	lblCarvingSellersList.setBounds(25, 230, 120, 23);
	CarvingCategoryPane.add(lblCarvingSellersList);
	
	ApprasersListCarving= new JComboBox(DisplayApprasers());
	ApprasersListCarving.setBounds(166, 255, 170, 20);
	CarvingCategoryPane.add(ApprasersListCarving);
	JLabel lblCarvingapp = new JLabel("Appraisr Name");
	lblCarvingapp.setBounds(25, 255, 120, 23);
	CarvingCategoryPane.add(lblCarvingapp);
	
	CarvingCustomerAggrement= new JCheckBox("Customer Aggrement");
	CarvingCustomerAggrement.setBounds(166, 280, 150, 23);
	CarvingCategoryPane.add(CarvingCustomerAggrement);
	
	CarvingAuthentification = new JCheckBox("Authentification Checking");
	CarvingAuthentification.setBounds(166, 305, 150, 30);
	CarvingCategoryPane.add(CarvingAuthentification);
	
	CarvingProvenaceDetails = new JTextArea();
	CarvingProvenaceDetails.setBounds(166, 340, 200, 90);
	CarvingCategoryPane.add(CarvingProvenaceDetails);
	JLabel lblCarvingProvenaceDetails= new JLabel("Provenance");
	lblCarvingProvenaceDetails.setBounds(25, 340, 100, 20);
	CarvingCategoryPane.add(lblCarvingProvenaceDetails);
	
	
	CarvingDescriptionDetails = new JTextArea();
	CarvingDescriptionDetails.setBounds(166, 450, 200, 100);
	CarvingCategoryPane.add(CarvingDescriptionDetails);
	JLabel lblCarvingDescriptionDetails= new JLabel("Description");
	lblCarvingDescriptionDetails.setBounds(25, 450, 100, 20);
	CarvingCategoryPane.add(lblCarvingDescriptionDetails);
	
    ///////////////Car  Spec............////
	
	JLabel lblDimentionCarv= new JLabel("Carving Dimention");
	lblDimentionCarv.setBounds(400, 400, 150, 20);
	CarvingCategoryPane.add(lblDimentionCarv);
	
	JLabel lblMaterialCarv = new JLabel("Carving Material");
	lblMaterialCarv.setBounds(400, 375, 150, 20);
	CarvingCategoryPane.add(lblMaterialCarv);
	
	JLabel lblWeightCarv = new JLabel("Carving Weight");
	lblWeightCarv.setBounds(400, 425, 150, 20);
	CarvingCategoryPane.add(lblWeightCarv);
	
	DimentionsOfCarving = new JTextField();
	DimentionsOfCarving.setBounds(540, 400, 160, 20);
	CarvingCategoryPane.add(DimentionsOfCarving);
	DimentionsOfCarving.setColumns(10);
	
	CarvingMaterial = new JTextField();
	CarvingMaterial.setBounds(540, 375, 160, 20);
	CarvingCategoryPane.add(CarvingMaterial);
	CarvingMaterial.setColumns(10);
	
	CarvingWeight = new JTextField();
	CarvingWeight.setBounds(540, 425, 160, 20);
	CarvingCategoryPane.add(CarvingWeight);
	CarvingWeight.setColumns(10);
	
	addCarving = new JButton("Add To Database");
	addCarving.setBounds(530, 500, 150, 25);
	CarvingCategoryPane.add(addCarving);
	addCarving.addActionListener((ActionListener) this);
	
	CarvingPictureFrame = new JLabel("Please select a picture!");
	
	CarvingPictureFrame.setBorder(border);
	CarvingPictureFrame.setBounds(400, 40, 300, 300);
	CarvingCategoryPane.add(CarvingPictureFrame);
	
	UploadCarvingPicture= new JButton("Select Picture");
	UploadCarvingPicture.setBounds(420, 15, 120, 20);
	CarvingCategoryPane.add(UploadCarvingPicture);
	UploadCarvingPicture.addActionListener((ActionListener) this);
	
	
	/////////Edit Pan......................////////////
	
	EditPane = new JPanel();
	tabbedPane.addTab("Edit Item", null, EditPane, null);
	EditPane.setBackground(Color.GRAY);

	EditPane.setLayout(null);
	

	TextSearch = new JTextField();
	TextSearch.setFont(new Font("Tahoma", Font.PLAIN, 12));
	TextSearch.setToolTipText("");
	TextSearch.setBounds(130, 20, 250, 20);
	EditPane.add(TextSearch);
	
	TextSearch.setColumns(10);
	
	JLabel lblSearch = new JLabel("Search...");
	lblSearch.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblSearch.setBounds(20, 20, 100, 20);
	EditPane.add(lblSearch);
	
	SearchSelector = new JComboBox();
	SearchSelector.setModel(new DefaultComboBoxModel(new String[] {"Art Title", "Art Lot Number", "Artist", "Price", "Seller"}));
	SearchSelector.setFont(new Font("Tahoma", Font.PLAIN, 12));
	SearchSelector.setBounds(390, 20, 130, 20);
	EditPane.add(SearchSelector);
	
    SearchButton  = new JButton("Search");
    SearchButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
    SearchButton.setBounds(520, 20, 80, 20);
	EditPane.add(SearchButton);
	SearchButton.addActionListener((ActionListener) this);
 
	
	JLabel lblSear = new JLabel("Results");
	lblSear.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblSear.setBounds(10, 55, 200, 20);
	EditPane.add(lblSear);
	
	list = new JList();
	list.setBounds(10, 80, 130, 480);
	EditPane.add(list);
	
	
	list.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
 			if (list.getSelectedIndex() != -1) {
 				EditItemsPanel v = new EditItemsPanel(list.getSelectedValue()+"");
				EditPane.add(v.itemTabbedPane());
				EditPane.revalidate();
				EditPane.repaint();	
			}
		}
	});
		
		return tabbedPane;
 
	}
	@Override
	public void actionPerformed(ActionEvent event)
    {
    	Object source = event.getSource();
    	if (source == UploadDrawing)
    	{
    		UploadNewDrawingItem();
    		DrawingCategoryPane.revalidate();
    		DrawingCategoryPane.repaint();
    	}
    	if(source == UploadPainting)
    	{
    	UploadNewPaintingItem();
    	PaintingCategoryPane.revalidate();
    	PaintingCategoryPane.repaint();
    	}
    	if(source == UploadPhotography)
    	{
    	UploadNewPhotographicItem();
    	UploadPhotography.revalidate();
    	UploadPhotography.repaint();
    	}
    	if(source == UploadSculpture)
    	{
    	UploadNewSculptureItem();
    	UploadSculpture.revalidate();
    	UploadSculpture.repaint();
    	}
    	if(source == addCarving)
    	{
    	UploadNewCarvingItem();
    	addCarving.revalidate();
    	addCarving.repaint();
    	}
    	if(source == SearchButton)
    	{
    	SearchMethod();
    	addCarving.revalidate();
    	addCarving.repaint();
    	}
    	if(source == UploadDrawingPicture)	
    	{
    		DrawingJChooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		     "JPG & GIF Images", "jpg", "gif");
		    DrawingJChooser.setFileFilter(filter);
		    int returnVal = DrawingJChooser.showOpenDialog(getParent());
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		       DrawingJChooser.getSelectedFile().getName());
		       DrawingPictureFrame.setText("");
		       DrawingPictureFrame.setIcon(new ImageIcon( DrawingJChooser.getSelectedFile().getName()));	
			   DrawingCategoryPane.repaint();
			   DrawingCategoryPane.revalidate();
		      
    	}
    	}
    	if(source == UploadPhotoPicture)	
    	{
    		PhotographicJChooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & GIF Images", "jpg", "gif");
		    PhotographicJChooser.setFileFilter(filter);
		    int returnVal = PhotographicJChooser.showOpenDialog(getParent());
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		       PhotographicJChooser.getSelectedFile().getName());
		       PhotographicPictureFrame.setText("");
		       PhotographicPictureFrame.setIcon(new ImageIcon( PhotographicJChooser.getSelectedFile().getName()));	
		       PhotographicCategoryPane.repaint();
		       PhotographicCategoryPane.revalidate();
		      
    	}
    	}
    	if(source == UploadCarvingPicture)	
    	{
    		CarvingJChooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & GIF Images", "jpg", "gif");
		    CarvingJChooser.setFileFilter(filter);
		    int returnVal = CarvingJChooser.showOpenDialog(getParent());
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		       CarvingJChooser.getSelectedFile().getName());
		       CarvingPictureFrame.setText("");
		       CarvingPictureFrame.setIcon(new ImageIcon(CarvingJChooser.getSelectedFile().getName()));	
		       CarvingCategoryPane.repaint();
		       CarvingCategoryPane.revalidate();
		      
    	}
    	}
    	if(source == UploadPaintingPicture)	
    	{
    		PaintingJChooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & GIF Images", "jpg", "gif");
		    PaintingJChooser.setFileFilter(filter);
		    int returnVal = PaintingJChooser.showOpenDialog(getParent());
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		       PaintingJChooser.getSelectedFile().getName());
		       PaintingPictureFrame.setText("");
		       PaintingPictureFrame.setIcon(new ImageIcon(PaintingJChooser.getSelectedFile().getName()));	
		       PaintingCategoryPane.repaint();
		       PaintingCategoryPane.revalidate();
		      
    	}
    	}
    	if(source == UploadSculpturePicture)	
    	{
    		SculptureJChooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & GIF Images", "jpg", "gif");
		    SculptureJChooser.setFileFilter(filter);
		    int returnVal = SculptureJChooser.showOpenDialog(getParent());
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		       SculptureJChooser.getSelectedFile().getName());
		       SculpturePictureFrame.setText("");
		       SculpturePictureFrame.setIcon(new ImageIcon(SculptureJChooser.getSelectedFile().getName()));	
		       SculptureCategoryPane.repaint();
		       SculptureCategoryPane.revalidate();
		      
    	}
    	}
    	 
    }
	
	public void UploadNewDrawingItem(){
		mtc = new MatisseConnector();
		mtc.connect();
 
		ArtItem item = new ArtItem(mtc.getDB());
 		DrawingCategory drw = new DrawingCategory(mtc.getDB());
		boolean checker = false;
 
		drw.setDrawingMedium(MediumDrawingDetails.getText());
		drw.setDrawingFrame(framedDrawingDetails.getText());
		drw.setDrawingDimension(DimentionsDrawingDetails.getText());

 		Iterator<DrawingCategory> drow = DrawingCategory.findDrawingCategoryIterator(mtc.getDB(), MediumDrawingDetails.getText());
 		if(drow.hasNext() )
		{
			item.appendTo_drawing(drow.next());	
		}
		item.setArtistName(ItemArtistName.getText());
		item.setItemlotNo(Integer.parseInt(ItemLotNumber.getText()));
		item.setArtTitle(PieceTitleName.getText());
		item.setPeriodFrom(ArtDateOfMake.getText());
		item.setClassification(ArtClassification.getText());
		item.setDescription(DrawingDescriptionDetails.getText());
		item.setProvenanceDetails(DrawingProvenaceDetails.getText());
		item.setPicture(DrawingJChooser.getSelectedFile().getName());
		item.setSoldCheck(false);

		boolean AuthentificationChecker = false;
		 if (AuthentificationChecking.isSelected()){
			 AuthentificationChecker = true;
	        }
		 item.setAuthentification(AuthentificationChecker);
		 
		boolean AggrementChecker = false;
		 if (CustomerAggrementChecking.isSelected()){
			 AggrementChecker = true;
	        }
		 item.setCustomerAgreement(AggrementChecker);
		 item.setAuctionEstimatedDateDate(EstimatedAuctionDate.getText());
		 item.setEstimatedPrice(Double.parseDouble(EstimatedPrice.getText()));
		 item.setReservedPrice(Double.parseDouble(ReservedPrice.getText()));
		
	 
		 System.out.println("Before Disconnect");
		 mtc.disconnect();
		 System.out.println("After Dissconenct");
		 AssignDrawingCategoryToSeller();
	}
	
	public void UploadNewPaintingItem(){
		mtc = new MatisseConnector();
		mtc.connect();
 
		ArtItem item = new ArtItem(mtc.getDB());
 		PaintingCategory paint = new PaintingCategory(mtc.getDB());
 
		 paint.setPaintingMedium(MediumPainting.getText());
		 paint.setPaintingFrame(FramePaintingDetails.getText());
		 paint.setPaintingDimension(DimentionsOfPainting.getText());
		
		Iterator<PaintingCategory> pain = PaintingCategory.findPaintingCategoryIterator(mtc.getDB(), MediumPainting.getText());
		
		if(pain.hasNext() )
		{
			item.appendTo_painting(pain.next());		
		}
		item.setArtistName(PaintingArtArtistName.getText());
		item.setItemlotNo(Integer.parseInt(PaintingItemLotNumber.getText()));
		item.setArtTitle(PaintingArtTitleName.getText());
		item.setPeriodFrom(PaintingItemYearOfMake.getText());
		item.setClassification(PaintingItemClassificationDetails.getText());
		item.setDescription(PaintingDescriptionDetails.getText());
		item.setProvenanceDetails(PaitingProvenaceDetails.getText());
		item.setPicture(PaintingJChooser.getSelectedFile().getName());
		item.setSoldCheck(false);

		boolean AuthentificationChecker = false;
		 if (PaintingAuthentificationChecking.isSelected()){
			 AuthentificationChecker = true;
	        }
		 item.setAuthentification(AuthentificationChecker);
		 
		boolean AggrementChecker = false;
		 if (PaintingCustomerAggrementDetails.isSelected()){
			 AggrementChecker = true;
	        }
		item.setCustomerAgreement(AggrementChecker);
		item.setAuctionEstimatedDateDate(PaintingEstimatedAuctionDate.getText());
		item.setEstimatedPrice(Double.parseDouble(PaintingArtEstimatedPrice.getText()));
		item.setReservedPrice(Double.parseDouble(PaintingReservedPrice.getText()));
		mtc.disconnect();
		AssignPaintingCategoryToSeller();
	

	}

	public void UploadNewPhotographicItem(){
		mtc = new MatisseConnector();
		mtc.connect();
 
		ArtItem item = new ArtItem(mtc.getDB());
 		PhotographicCategory photo = new PhotographicCategory(mtc.getDB());
 		
 
 		photo.setPhotoType(PhotographicType.getText());
 		photo.setPhotoDimension(DimentionsOfPhotographic.getText());
		
		Iterator<PhotographicCategory> pho = PhotographicCategory.findPhotographicCategoryIterator(mtc.getDB(), PhotographicType.getText());
		
		if(pho.hasNext() )
		{
			item.appendTo_photo(pho.next());		
		}
		item.setArtistName(PhotographicItemArtistName.getText());
		item.setItemlotNo(Integer.parseInt(PhotographicItemLot.getText()));
		item.setArtTitle(PhotographicPieceTitleName.getText());
		item.setPeriodFrom(PhotographicItemYearOfMake.getText());
		item.setClassification(PhotographicItemClassificationDetails.getText());
		item.setDescription(PhotographicDescriptionDetails.getText());
		item.setProvenanceDetails(PhotographicProvenaceDetails.getText());
		item.setPicture(PhotographicJChooser.getSelectedFile().getName());
		item.setSoldCheck(false);

		boolean AuthentificationChecker = false;
		 if (PhotographicAuthentificationChecking.isSelected()){
			 AuthentificationChecker = true;
	        }
		 item.setAuthentification(AuthentificationChecker);
		 
		boolean AggrementChecker = false;
		 if (PhotoCustomerAggrementChecking.isSelected()){
			 AggrementChecker = true;
	        }
		 item.setCustomerAgreement(AggrementChecker);
		 item.setAuctionEstimatedDateDate(PhotographicAuctionEstimatedDate.getText());
		 item.setEstimatedPrice(Double.parseDouble(PhotographicEstimatedPrice.getText()));
		 item.setReservedPrice(Double.parseDouble(PhotographicReservedPrice.getText()));
		 mtc.disconnect();
		AssignPhotographyCategoryToSeller();
	

	}

	public void UploadNewSculptureItem(){
		mtc = new MatisseConnector();
		mtc.connect();
 
		ArtItem item = new ArtItem(mtc.getDB());
 		SculptureCategory scul= new SculptureCategory(mtc.getDB());
 		
 
 		scul.setSculptureDimension(DimentionsOfSculpture.getText());
 		scul.setSculptureWeight(Integer.parseInt(SculptureWeight.getText()));
 		scul.setSculptureMaterial(SculptureMaterial.getText());
		
		Iterator<SculptureCategory> scu = SculptureCategory.findSculptureCategoryIterator(mtc.getDB(), SculptureMaterial.getText());
		
		if(scu.hasNext() )
		{
			item.appendTo_sculpture(scu.next());	
		}
		item.setArtistName(SculptureItemArtistName.getText());
		item.setItemlotNo(Integer.parseInt(SculptureItemLot.getText()));
		item.setArtTitle(SculpturePieceTitleName.getText());
		item.setPeriodFrom(SculIpturetemYearOfMake.getText());
		item.setClassification(SculptureItemClassification.getText());
		item.setDescription(SculptureDescriptionDetails.getText());
		item.setProvenanceDetails(SculptureProvenaceDetails.getText());
		item.setPicture(SculptureJChooser.getSelectedFile().getName());
		item.setSoldCheck(false);

		boolean AuthentificationChecker = false;
		 if (SculptureAuthentificationChecking.isSelected()){
			 AuthentificationChecker = true;
	        }
		 item.setAuthentification(AuthentificationChecker);
		 
		boolean AggrementChecker = false;
		 if (SculptureCustomerAggrementChecking.isSelected()){
			 AggrementChecker = true;
	        }
		 item.setCustomerAgreement(AggrementChecker);
		 item.setAuctionEstimatedDateDate(SculptureAuctionEstimatedDate.getText());
		 item.setEstimatedPrice(Double.parseDouble(SculptureEstimatedPrice.getText()));
		 item.setReservedPrice(Double.parseDouble(SculptureReservedPrice.getText()));
		mtc.disconnect();
		AssignSculptureCategortToSeller();
	

	}
	public void UploadNewCarvingItem(){
		mtc = new MatisseConnector();
		mtc.connect();
 
		ArtItem item = new ArtItem(mtc.getDB());
		CarvingCategory carv= new CarvingCategory(mtc.getDB());
 		
 
		carv.setCarvingDimension(DimentionsOfCarving.getText());
		carv.setCarvingWeight(Integer.parseInt(CarvingWeight.getText()));
		carv.setCarvingMaterial(CarvingMaterial.getText());
		
		Iterator<CarvingCategory> carvIte = CarvingCategory.findCarvingCategoryIterator(mtc.getDB(), CarvingMaterial.getText());
		
		if(carvIte.hasNext() )
		{
			item.appendTo_carving(carvIte.next());	
		}
		item.setArtistName(CarvingItemArtistName.getText());
		item.setItemlotNo(Integer.parseInt(CarvingItemLotNumber.getText()));
		item.setArtTitle(CarvingPieceTitleName.getText());
		item.setPeriodFrom(CarvingItemYearOfMake.getText());
		item.setClassification(CarvingItemClassificationDetails.getText());
		item.setDescription(CarvingDescriptionDetails.getText());
		item.setProvenanceDetails(CarvingProvenaceDetails.getText());
		item.setPicture(CarvingJChooser.getSelectedFile().getName());
		item.setSoldCheck(false);

		boolean AuthentificationChecker = false;
		 if (CarvingAuthentification.isSelected()){
			 AuthentificationChecker = true;
	        }
		 item.setAuthentification(AuthentificationChecker);
		 
		boolean AggrementChecker = false;
		 if (CarvingCustomerAggrement.isSelected()){
			 AggrementChecker = true;
	        }
		 item.setCustomerAgreement(AggrementChecker);
		 item.setAuctionEstimatedDateDate(CarvingAuctionEstimatedDate.getText());
		 item.setEstimatedPrice(Double.parseDouble(CarvingEstimatedPrice.getText()));
		 item.setReservedPrice(Double.parseDouble(CarvingReservedPrice.getText()));
		mtc.disconnect();
		AssignCarvingCategoryToSeller();
	

	}

	public String[] DisplayApprasers()
	{
		mtc = new MatisseConnector();
		mtc.connect();
		Iterator<Appraiser> e = Appraiser.instanceIterator(mtc.getDB());
		String[] TemporaryArray = new String[ (int) Appraiser.getInstanceNumber(mtc.getDB())];
		Appraiser dataPicture;
		int position = 0;
		while (e.hasNext()) {
			dataPicture = e.next();
			TemporaryArray[position] = dataPicture.getAppraiserName()+" "+dataPicture.getSpecialism();
			position++;
		}
		mtc.disconnect();
		return TemporaryArray;
	}
	public  String[]  DisplaySellers(){
		mtc = new MatisseConnector();
		mtc.connect();
		Iterator<SellerClient> e = SellerClient.instanceIterator(mtc.getDB());
		String[] TemporaryArray = new String[ (int) SellerClient.getInstanceNumber(mtc.getDB())];
		SellerClient dataPicture;
		int position = 0;
		while (e.hasNext()) {
			dataPicture = e.next();
			TemporaryArray[position] = dataPicture.getSellerFirstName();
			position++;
		}
		mtc.disconnect();
		return TemporaryArray;
	} 
	public void SearchMethod()
	{
		mtc = new MatisseConnector();
		mtc.connect();
 		Iterator<ArtItem> e = ArtItem.instanceIterator(mtc.getDB());
		String[] TemporaryArray = new String[ (int) ArtItem.getInstanceNumber(mtc.getDB())];
		ArtItem dataPicture;
		int position = 0;
		if(SearchSelector.getSelectedItem().equals("Art Title"))
		{
		while (e.hasNext()) {
			dataPicture = e.next();
			String objectPicture = dataPicture.getArtTitle();
			if (objectPicture.equals(TextSearch.getText()) )
			{
			TemporaryArray[position] = dataPicture.getItemlotNo()+"    "+dataPicture.getArtTitle();
			position++;
			}
		}}
		if(SearchSelector.getSelectedItem().equals("Artist"))
		{
		while (e.hasNext()) {
			dataPicture = e.next();
			String objectPicture = dataPicture.getArtistName();
			if (objectPicture.equals(TextSearch.getText()) )
			{
			TemporaryArray[position] = dataPicture.getItemlotNo()+"    "+dataPicture.getArtTitle();
			position++;
			}
		}}
		if(SearchSelector.getSelectedItem().equals("Art Lot Number"))
		{
		while (e.hasNext()) {
			dataPicture = e.next();
			String objectPicture = dataPicture.getItemlotNo()+"";
			if (objectPicture.equals(TextSearch.getText()) )
			{
			TemporaryArray[position] = dataPicture.getItemlotNo()+"    "+dataPicture.getArtTitle();
			position++;
			}
		}}
		if(SearchSelector.getSelectedItem().equals("Price"))
		{
		while (e.hasNext()) {
			dataPicture = e.next();
			String objectPicture = dataPicture.getEstimatedPrice()+"";
			if (objectPicture.equals(TextSearch.getText()) )
			{
			TemporaryArray[position] = dataPicture.getItemlotNo()+"    "+dataPicture.getArtTitle();
			position++;
			}
		}}
		if(SearchSelector.getSelectedItem().equals("Seller"))
		{
		SellerClient sell = SellerClient.lookupFindSellerClient(mtc.getDB(),TextSearch.getText());
		int empLength = sell.getSells().length;
  		for (int i = 0; i < empLength; i++) {
			TemporaryArray[i] = sell.getSells()[i].getItemlotNo()+"    ";
			TemporaryArray[i] += sell.getSells()[i].getArtTitle();
		}
		}		
		list.setListData(TemporaryArray);
		mtc.disconnect();	
	}
	public void AssignCarvingCategoryToSeller()
	{
 		 mtc = new MatisseConnector();
		 mtc.connect();
		SellerClient seller = SellerClient.lookupFindSellerClient(mtc.getDB(), CarvingSellersList.getSelectedItem().toString());
 		Iterator<ArtItem> itiimeIterator = ArtItem.findArtItemIterator(mtc.getDB(), Integer.parseInt(CarvingItemLotNumber.getText())+"");
		if(itiimeIterator.hasNext())
		{ 
			seller.appendSells(itiimeIterator.next());		
		}
 		mtc.disconnect();
	}
	public void AssignSculptureCategortToSeller()
	{
 		 mtc = new MatisseConnector();
		 mtc.connect();
		SellerClient seller = SellerClient.lookupFindSellerClient(mtc.getDB(), SculptureSellersList.getSelectedItem().toString());
 		Iterator<ArtItem> itiimeIterator = ArtItem.findArtItemIterator(mtc.getDB(), Integer.parseInt(SculptureItemLot.getText())+"");

		if(itiimeIterator.hasNext())
		{ 
			seller.appendSells(itiimeIterator.next());		
		}
 		mtc.disconnect();
	}
	public void AssignDrawingCategoryToSeller()
	{
		 System.out.println(SellerList.getSelectedItem().toString()+" Start "+ItemLotNumber.getText()+"");
		 mtc = new MatisseConnector();
		 mtc.connect();
		SellerClient seller = SellerClient.lookupFindSellerClient(mtc.getDB(), SellerList.getSelectedItem().toString());
  		Iterator<ArtItem> itiimeIterator = ArtItem.findArtItemIterator(mtc.getDB(), Integer.parseInt(ItemLotNumber.getText())+"");
 
  		
		if(itiimeIterator.hasNext())
		{ 
			seller.appendSells(itiimeIterator.next());		
		}
		System.out.println("Done");
		mtc.disconnect();
	}
	public void AssignPaintingCategoryToSeller()
	{
 		 mtc = new MatisseConnector();
		 mtc.connect();
		SellerClient seller = SellerClient.lookupFindSellerClient(mtc.getDB(), PaintingSellersList.getSelectedItem().toString());
 		Iterator<ArtItem> itiimeIterator = ArtItem.findArtItemIterator(mtc.getDB(), Integer.parseInt(PaintingItemLotNumber.getText())+"");

		if(itiimeIterator.hasNext())
		{ 
			seller.appendSells(itiimeIterator.next());		
		}
 		mtc.disconnect();
	}
	public void AssignPhotographyCategoryToSeller()
	{
 		 mtc = new MatisseConnector();
		 mtc.connect();
		SellerClient seller = SellerClient.lookupFindSellerClient(mtc.getDB(), PhotographicSellersList.getSelectedItem().toString());
 		Iterator<ArtItem> itiimeIterator = ArtItem.findArtItemIterator(mtc.getDB(), Integer.parseInt(PhotographicItemLot.getText())+"");

		if(itiimeIterator.hasNext())
		{ 
			seller.appendSells(itiimeIterator.next());		
		}
 		mtc.disconnect();
	}
	
}
     