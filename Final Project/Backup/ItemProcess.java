
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

public class ItemProcess extends JPanel implements ActionListener {
 	 private JTextField ItemLot, pieceTitle, ItemArtist, MedDrawing, DimentionsDrawing,
 	 ItemYear, ItemClassification,  EstimatedPrice, AuctionDate, ReservedPrice,framedDrawing ;
	 
 	 private JCheckBox  CustomerAggrement, Authentification;
 	 private JButton addDrawing, addDrawingPicture;
	 private MatisseConnector mtc;
	 private JPanel contentPane;
	 private JPanel mainPanel,EditPane;
	 private JTabbedPane tabbedPane;
	 private JComboBox sellerdisplay ;
	 private JTextArea ItemDescription, ItemProvenace;
	 private JLabel DrawingPicture;
	 private JFileChooser Drawingchooser;
	 
 	 private JTextField PaintingItemLot, PaintingItemArtist,
	 PaintingItemYear, PaintingAuctionDate, PaintingReservedPrice ,MeduPainting,DimentionsPainting,
	 PaintingPieceTitle, PaintingItemClassification, PaintingEstimatedPrice, framePainting;
 	 private JPanel  PaintingPane;
	 private JComboBox PaintingSellerdisplay ;
	 private JTextArea PaintingItemDescription, PaitingItemProvenace;
 	 private JCheckBox PaintingCustomerAggrement, PaintingAuthentification ;
 	 private JButton addPainting,addPaintingPicture;
 	 private JLabel PaintingPicture;
	 private JFileChooser PaintingChooser;
 	 
 	 private JTextField PhotoItemLot, PhotoItemArtist,
 	PhotoItemYear,PhotoAuctionDate,PhotoReservedPrice ,DimentionsPhoto,PhotoType, 
 	PhotoPieceTitle, PhotoItemClassification, PhotoEstimatedPrice;
	 private JComboBox PhotoSellerdisplay ;
	 private JPanel PhotoPane;
	 private JTextArea PhotoItemDescription, PhotoItemProvenace;
	 private JCheckBox PhotoCustomerAggrement, PhotoAuthentification ;
	 private JButton addPhotography, addPhotoPicture;
	 private JLabel PhotoPicture;
	 private JFileChooser PhotoChooser;
	 
    private JTextField SculItemLot, SculItemArtist,
    SculItemYear,SculAuctionDate,SculReservedPrice ,DimentionsScul,SculWeight, SculMaterial,
    SculPieceTitle, SculItemClassification, SculEstimatedPrice;
	 private JComboBox SculSellerdisplay ;
	 private JPanel SculPane;
	 private JTextArea SculItemDescription, SculItemProvenace;
	 private JCheckBox SculCustomerAggrement, SculAuthentification ;
	 private JButton addSculpture, addSculpturePicture;
	 private JLabel SculpturePicture;
	 private JFileChooser SculptureChooser;

 
    private JTextField CarvItemLot, CarvItemArtist,
    CarvItemYear,CarvAuctionDate,CarvReservedPrice ,DimentionsCarv,CarvWeight, CarvMaterial,
    CarvPieceTitle, CarvItemClassification, CarvEstimatedPrice;
	 private JComboBox CarvSellerdisplay ;
	 private JPanel CarvPane;
	 private JTextArea CarvItemDescription, CarvItemProvenace;
	 private JCheckBox CarvCustomerAggrement, CarvAuthentification ;
	 private JButton addCarving, addCarvingPicture;
	 private JLabel CarvingPicture;
	 private JFileChooser CarvingChooser;

	 
	 private JLabel searchResault;
	 private JList list;
	 private JButton searchButton;
	 private JComboBox searchSelector ;
	 private JTextField txtSearch;


   
     
    public JTabbedPane itemTabbedPane(){
    	mainPanel = new JPanel();
    	mainPanel.setBounds(1, 30, 800,600);
    	mainPanel.setLayout(null);
       	 
    	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(30, 1, 800, 600);
		mainPanel.add(tabbedPane);
		
       /////////////Drawing General////////////////
		contentPane = new JPanel();
		tabbedPane.addTab("Add Drawing", null, contentPane, null);
		contentPane.setLayout(null);
		
		ItemLot = new JTextField();
		ItemLot.setBounds(155, 25, 160, 20);
		contentPane.add(ItemLot);
		ItemLot.setColumns(10);
		
		pieceTitle = new JTextField();
		pieceTitle.setBounds(155, 60, 160, 20);
		contentPane.add(pieceTitle);
		pieceTitle.setColumns(10);
		
		ItemArtist = new JTextField();
		ItemArtist.setBounds(155, 95, 160, 20);
		contentPane.add(ItemArtist);
		ItemArtist.setColumns(10);
		
		ItemYear = new JTextField();
		ItemYear.setBounds(155, 130, 160, 20);
		contentPane.add(ItemYear);
		ItemYear.setColumns(10);
		
		ItemClassification = new JTextField();
		ItemClassification.setBounds(155, 165, 160, 20);
		contentPane.add(ItemClassification);
		ItemClassification.setColumns(10);
		
		AuctionDate = new JTextField();
		AuctionDate.setBounds(155, 200, 160, 20);
		contentPane.add(AuctionDate);
		AuctionDate.setColumns(10);
		
		EstimatedPrice = new JTextField();
		EstimatedPrice.setBounds(155, 235, 160, 20);
		contentPane.add(EstimatedPrice);
		EstimatedPrice.setColumns(10);
		
		ReservedPrice = new JTextField();
		ReservedPrice.setBounds(155, 270, 160, 20);
		contentPane.add(ReservedPrice);
		ReservedPrice.setColumns(10);
		
		sellerdisplay = new JComboBox(displaySellers());
		sellerdisplay.setBounds(155, 305, 86, 20);
		contentPane.add(sellerdisplay);
		
		CustomerAggrement = new JCheckBox("Customer Aggrement");
		CustomerAggrement.setBounds(155, 335, 150, 23);
		contentPane.add(CustomerAggrement);
		
		Authentification = new JCheckBox("Authentification");
		Authentification.setBounds(155, 360, 150, 23);
		contentPane.add(Authentification);
		
		ItemProvenace = new JTextArea();
		ItemProvenace.setBounds(155, 390, 200, 50);
		contentPane.add(ItemProvenace);
		
		ItemDescription = new JTextArea();
		ItemDescription.setBounds(155, 475, 200, 50);
		contentPane.add(ItemDescription);
				
		
		JLabel lblLotNumber = new JLabel("Lot Number");
		lblLotNumber.setBounds(25, 25, 100, 20);
		contentPane.add(lblLotNumber);
		
		JLabel lblTitle = new JLabel("Piece Title");
		lblTitle.setBounds(25, 60, 100, 20);
		contentPane.add(lblTitle);
		
		JLabel lblItemName = new JLabel("Artist Name");
		lblItemName.setBounds(25, 95, 100, 20);
		contentPane.add(lblItemName);
		
		JLabel lblYear = new JLabel("Estimated Period");
		lblYear.setBounds(25, 130, 100, 20);
		contentPane.add(lblYear);
		
		JLabel lblClassification = new JLabel("Classification");
		lblClassification.setBounds(25, 165, 100, 20);
		contentPane.add(lblClassification);
		
		
		JLabel lblAuctionDate = new JLabel("Auction Date");
		lblAuctionDate.setBounds(25, 200, 100, 20);
		contentPane.add(lblAuctionDate);
		
		JLabel lblEstimatedPrice = new JLabel("Estimated Price");
		lblEstimatedPrice.setBounds(25, 235, 100, 20);
		contentPane.add(lblEstimatedPrice);
		
		JLabel lblReservedPrice = new JLabel("Reserved Price");
		lblReservedPrice.setBounds(25, 270, 100, 20);
		contentPane.add(lblReservedPrice);
		
		JLabel lblUser = new JLabel("User Name");
		lblUser.setBounds(25, 305, 120, 23);
		contentPane.add(lblUser);
		
		JLabel lblAuthentification = new JLabel("Authentification");
		lblAuthentification.setBounds(25, 340, 100, 20);
		//contentPane.add(lblAuthentification);
		
		JLabel lblProvenance = new JLabel("Provenance");
		lblProvenance.setBounds(25, 390, 100, 20);
		contentPane.add(lblProvenance);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(25, 475, 100, 20);
		contentPane.add(lblDescription);
		
        /////////////////Drawing Specific///////////////////
		
		JLabel lblMedumDrawing = new JLabel("Drawing Medium");
		lblMedumDrawing.setBounds(380, 25, 150, 20);
		contentPane.add(lblMedumDrawing);
		
		JLabel lblDimentionsDrawing = new JLabel("Drawing Dimentions");
		lblDimentionsDrawing.setBounds(380, 60, 150, 20);
		contentPane.add(lblDimentionsDrawing);
		
		MedDrawing = new JTextField();
		MedDrawing.setBounds(520, 25, 160, 20);
		contentPane.add(MedDrawing);
		MedDrawing.setColumns(10);
		
		DimentionsDrawing = new JTextField();
		DimentionsDrawing.setBounds(520, 60, 160, 20);
		contentPane.add(DimentionsDrawing);
		DimentionsDrawing.setColumns(10);
		
		framedDrawing = new JTextField("Framed");
		framedDrawing.setBounds(520, 95, 97, 23);
		contentPane.add(framedDrawing);
		
		DrawingPicture = new JLabel("Please select a picture!");
		
		//DrawingPicture.setIcon(new ImageIcon("image2.jpg"));
		Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 1);
		DrawingPicture.setBorder(border);
		DrawingPicture.setBounds(400, 160, 300, 300);
		contentPane.add(DrawingPicture);
		
		addDrawingPicture= new JButton("Select Picture");
		addDrawingPicture.setBounds(480, 130, 120, 20);
		contentPane.add(addDrawingPicture);
		addDrawingPicture.addActionListener((ActionListener) this);
		
		addDrawing = new JButton("Add To Database");
		addDrawing.setBounds(550, 500, 150, 25);
		contentPane.add(addDrawing);
		addDrawing.addActionListener((ActionListener) this);
		
		/////////////Photographic General////////////////
		
		PhotoPane = new JPanel();
		tabbedPane.addTab("Add Photographic", null, PhotoPane, null);
		PhotoPane.setLayout(null);
		
		PhotoItemLot = new JTextField();
		PhotoItemLot.setBounds(155, 25, 160, 20);
		PhotoPane.add(PhotoItemLot);
		PhotoItemLot.setColumns(10);
		
		PhotoPieceTitle = new JTextField();
		PhotoPieceTitle.setBounds(155, 60, 160, 20);
		PhotoPane.add(PhotoPieceTitle);
		PhotoPieceTitle.setColumns(10);
		
		PhotoItemArtist = new JTextField();
		PhotoItemArtist.setBounds(155, 95, 160, 20);
		PhotoPane.add(PhotoItemArtist);
		PhotoItemArtist.setColumns(10);
		
		PhotoItemYear = new JTextField();
		PhotoItemYear.setBounds(155, 130, 160, 20);
		PhotoPane.add(PhotoItemYear);
		PhotoItemYear.setColumns(10);
		
		PhotoItemClassification = new JTextField();
		PhotoItemClassification.setBounds(155, 165, 160, 20);
		PhotoPane.add(PhotoItemClassification);
		PhotoItemClassification.setColumns(10);
		
		PhotoAuctionDate = new JTextField();
		PhotoAuctionDate.setBounds(155, 200, 160, 20);
		PhotoPane.add(PhotoAuctionDate);
		PhotoAuctionDate.setColumns(10);
		
		PhotoEstimatedPrice = new JTextField();
		PhotoEstimatedPrice.setBounds(155, 235, 160, 20);
		PhotoPane.add(PhotoEstimatedPrice);
		PhotoEstimatedPrice.setColumns(10);
		
		PhotoReservedPrice = new JTextField();
		PhotoReservedPrice.setBounds(155, 270, 160, 20);
		PhotoPane.add(PhotoReservedPrice);
		PhotoReservedPrice.setColumns(10);
		
		PhotoSellerdisplay = new JComboBox(displaySellers());
		PhotoSellerdisplay.setBounds(155, 305, 86, 20);
		PhotoPane.add(PhotoSellerdisplay);
		
		PhotoCustomerAggrement = new JCheckBox("Customer Aggrement");
		PhotoCustomerAggrement.setBounds(155, 335, 150, 23);
		PhotoPane.add(PhotoCustomerAggrement);
		
		PhotoAuthentification = new JCheckBox("Authentification");
		PhotoAuthentification.setBounds(155, 360, 150, 23);
		PhotoPane.add(PhotoAuthentification);
		
		PhotoItemProvenace = new JTextArea();
		PhotoItemProvenace.setBounds(155, 390, 200, 50);
		PhotoPane.add(PhotoItemProvenace);
		
		PhotoItemDescription = new JTextArea();
		PhotoItemDescription.setBounds(155, 475, 200, 50);
		PhotoPane.add(PhotoItemDescription);
				
		
		JLabel lblLotNumberPhoto = new JLabel("Lot Number");
		lblLotNumberPhoto.setBounds(25, 25, 100, 20);
		PhotoPane.add(lblLotNumberPhoto);
		
		JLabel lblTitlePhoto = new JLabel("Piece Title");
		lblTitlePhoto.setBounds(25, 60, 100, 20);
		PhotoPane.add(lblTitlePhoto);
		
		JLabel lblItemNamePhoto = new JLabel("Artist Name");
		lblItemNamePhoto.setBounds(25, 95, 100, 20);
		PhotoPane.add(lblItemNamePhoto);
		
		JLabel lblYearPhoto = new JLabel("Estimated Period");
		lblYearPhoto.setBounds(25, 130, 100, 20);
		PhotoPane.add(lblYearPhoto);
		
		JLabel lblClassificationPhoto = new JLabel("Classification");
		lblClassificationPhoto.setBounds(25, 165, 100, 20);
		PhotoPane.add(lblClassificationPhoto);
		
		
		JLabel lblAuctionDatePhoto = new JLabel("Auction Date");
		lblAuctionDatePhoto.setBounds(25, 200, 100, 20);
		PhotoPane.add(lblAuctionDatePhoto);
		
		JLabel lblEstimatedPricePhoto= new JLabel("Estimated Price");
		lblEstimatedPricePhoto.setBounds(25, 235, 100, 20);
		PhotoPane.add(lblEstimatedPricePhoto);
		
		JLabel lblReservedPricePhoto = new JLabel("Reserved Price");
		lblReservedPricePhoto.setBounds(25, 270, 100, 20);
		PhotoPane.add(lblReservedPricePhoto);
		
		JLabel lblUserPhoto = new JLabel("User Name");
		lblUserPhoto.setBounds(25, 305, 120, 23);
		PhotoPane.add(lblUserPhoto);

		
		JLabel lblProvenancePhoto = new JLabel("Provenance");
		lblProvenancePhoto.setBounds(25, 390, 100, 20);
		PhotoPane.add(lblProvenancePhoto);
		
		JLabel lblDescriptionPhoto = new JLabel("Description");
		lblDescriptionPhoto.setBounds(25, 475, 100, 20);
		PhotoPane.add(lblDescriptionPhoto);
		
        ///////////////Photo Specific/////////////////////
		
		JLabel lblTypePhoto = new JLabel("Photographic Type");
		lblTypePhoto.setBounds(380, 25, 150, 20);
		PhotoPane.add(lblTypePhoto);
		
		JLabel lblDimentionsPhoto = new JLabel("Photographic Dimentions");
		lblDimentionsPhoto.setBounds(380, 60, 150, 20);
		PhotoPane.add(lblDimentionsPhoto);
		
		PhotoType = new JTextField();
		PhotoType.setBounds(530, 25, 160, 20);
		PhotoPane.add(PhotoType);
		PhotoType.setColumns(10);
		
		DimentionsPhoto = new JTextField();
		DimentionsPhoto.setBounds(530, 60, 160, 20);
		PhotoPane.add(DimentionsPhoto);
		DimentionsPhoto.setColumns(10);
		
		addPhotography = new JButton("Add To Database");
		addPhotography.setBounds(550, 500, 150, 25);
		PhotoPane.add(addPhotography);
		addPhotography.addActionListener((ActionListener) this);
		
		PhotoPicture = new JLabel("Please select a picture!");
		
		PhotoPicture.setBorder(border);
		PhotoPicture.setBounds(400, 160, 300, 300);
		PhotoPane.add(PhotoPicture);
		
		addPhotoPicture= new JButton("Select Picture");
		addPhotoPicture.setBounds(480, 130, 120, 20);
		PhotoPane.add(addPhotoPicture);
		addPhotoPicture.addActionListener((ActionListener) this);
    /////////////Painting General////////////////
		
	PaintingPane = new JPanel();
	tabbedPane.addTab("Add Painting", null, PaintingPane, null);
	PaintingPane.setLayout(null);
	
	PaintingItemLot = new JTextField();
	PaintingItemLot.setBounds(155, 25, 160, 20);
	PaintingPane.add(PaintingItemLot);
	PaintingItemLot.setColumns(10);
	
	PaintingPieceTitle = new JTextField();
	PaintingPieceTitle.setBounds(155, 60, 160, 20);
	PaintingPane.add(PaintingPieceTitle);
	PaintingPieceTitle.setColumns(10);
	
	PaintingItemArtist = new JTextField();
	PaintingItemArtist.setBounds(155, 95, 160, 20);
	PaintingPane.add(PaintingItemArtist);
	PaintingItemArtist.setColumns(10);
	
	PaintingItemYear = new JTextField();
	PaintingItemYear.setBounds(155, 130, 160, 20);
	PaintingPane.add(PaintingItemYear);
	PaintingItemYear.setColumns(10);
	
	PaintingItemClassification = new JTextField();
	PaintingItemClassification.setBounds(155, 165, 160, 20);
	PaintingPane.add(PaintingItemClassification);
	PaintingItemClassification.setColumns(10);
	
	PaintingAuctionDate = new JTextField();
	PaintingAuctionDate.setBounds(155, 200, 160, 20);
	PaintingPane.add(PaintingAuctionDate);
	PaintingAuctionDate.setColumns(10);
	
	PaintingEstimatedPrice = new JTextField();
	PaintingEstimatedPrice.setBounds(155, 235, 160, 20);
	PaintingPane.add(PaintingEstimatedPrice);
	PaintingEstimatedPrice.setColumns(10);
	
	PaintingReservedPrice = new JTextField();
	PaintingReservedPrice.setBounds(155, 270, 160, 20);
	PaintingPane.add(PaintingReservedPrice);
	PaintingReservedPrice.setColumns(10);
	
	PaintingSellerdisplay = new JComboBox(displaySellers());
	PaintingSellerdisplay.setBounds(155, 305, 86, 20);
	PaintingPane.add(PaintingSellerdisplay);
	
	PaintingCustomerAggrement = new JCheckBox("Customer Aggrement");
	PaintingCustomerAggrement.setBounds(155, 335, 150, 23);
	PaintingPane.add(PaintingCustomerAggrement);
	
	PaintingAuthentification = new JCheckBox("Authentification");
	PaintingAuthentification.setBounds(155, 360, 150, 23);
	PaintingPane.add(PaintingAuthentification);
	
	PaitingItemProvenace = new JTextArea();
	PaitingItemProvenace.setBounds(155, 390, 200, 50);
	PaintingPane.add(PaitingItemProvenace);
	
	PaintingItemDescription = new JTextArea();
	PaintingItemDescription.setBounds(155, 475, 200, 50);
	PaintingPane.add(PaintingItemDescription);
			
	
	JLabel lblLotNumberp = new JLabel("Lot Number");
	lblLotNumberp.setBounds(25, 25, 100, 20);
	PaintingPane.add(lblLotNumberp);
	
	JLabel lblTitlep = new JLabel("Piece Title");
	lblTitlep.setBounds(25, 60, 100, 20);
	PaintingPane.add(lblTitlep);
	
	JLabel lblItemNamep = new JLabel("Artist Name");
	lblItemNamep.setBounds(25, 95, 100, 20);
	PaintingPane.add(lblItemNamep);
	
	JLabel lblYearp = new JLabel("Estimated Period");
	lblYearp.setBounds(25, 130, 100, 20);
	PaintingPane.add(lblYearp);
	
	JLabel lblClassificationp = new JLabel("Classification");
	lblClassificationp.setBounds(25, 165, 100, 20);
	PaintingPane.add(lblClassificationp);
	
	
	JLabel lblAuctionDatep = new JLabel("Auction Date");
	lblAuctionDatep.setBounds(25, 200, 100, 20);
	PaintingPane.add(lblAuctionDatep);
	
	JLabel lblEstimatedPricep = new JLabel("Estimated Price");
	lblEstimatedPricep.setBounds(25, 235, 100, 20);
	PaintingPane.add(lblEstimatedPricep);
	
	JLabel lblReservedPricep = new JLabel("Reserved Price");
	lblReservedPricep.setBounds(25, 270, 100, 20);
	PaintingPane.add(lblReservedPricep);
	
	JLabel lblUserp = new JLabel("User Name");
	lblUserp.setBounds(25, 305, 120, 23);
	PaintingPane.add(lblUserp);
	
	JLabel lblAuthentificationp = new JLabel("Authentification");
	lblAuthentificationp.setBounds(25, 340, 100, 20);
	//contentPane.add(lblAuthentification);
	
	JLabel lblProvenancep = new JLabel("Provenance");
	lblProvenancep.setBounds(25, 390, 100, 20);
	PaintingPane.add(lblProvenancep);
	
	JLabel lblDescriptionp = new JLabel("Description");
	lblDescriptionp.setBounds(25, 475, 100, 20);
	PaintingPane.add(lblDescriptionp);
	
    ///////////////Painting Specific/////////////////////
	
	JLabel lblMedumPainting = new JLabel("Painting Medium");
	lblMedumPainting.setBounds(380, 25, 150, 20);
	PaintingPane.add(lblMedumPainting);
	
	JLabel lblDimentionsPainging = new JLabel("Painting Dimentions");
	lblDimentionsPainging.setBounds(380, 60, 150, 20);
	PaintingPane.add(lblDimentionsPainging);
	
	MeduPainting = new JTextField();
	MeduPainting.setBounds(520, 25, 160, 20);
	PaintingPane.add(MeduPainting);
	MeduPainting.setColumns(10);
	
	DimentionsPainting = new JTextField();
	DimentionsPainting.setBounds(520, 60, 160, 20);
	PaintingPane.add(DimentionsPainting);
	DimentionsPainting.setColumns(10);
	
	framePainting = new JTextField("Framed");
	framePainting.setBounds(520, 95, 97, 23);
	PaintingPane.add(framePainting);
	
	addPainting = new JButton("Add To Database");
	addPainting.setBounds(550, 500, 150, 25);
	PaintingPane.add(addPainting);
	addPainting.addActionListener((ActionListener) this);
	
	PaintingPicture = new JLabel("Please select a picture!");
	
	PaintingPicture.setBorder(border);
	PaintingPicture.setBounds(400, 160, 300, 300);
	PaintingPane.add(PaintingPicture);
	
	addPaintingPicture= new JButton("Select Picture");
	addPaintingPicture.setBounds(480, 130, 120, 20);
	PaintingPane.add(addPaintingPicture);
	addPaintingPicture.addActionListener((ActionListener) this);

	/////////////Sculpture General////////////////
	
	SculPane = new JPanel();
	tabbedPane.addTab("Add Sculpture", null, SculPane, null);
	SculPane.setLayout(null);
	
	SculItemLot = new JTextField();
	SculItemLot.setBounds(155, 25, 160, 20);
	SculPane.add(SculItemLot);
	SculItemLot.setColumns(10);
	
	SculPieceTitle = new JTextField();
	SculPieceTitle.setBounds(155, 60, 160, 20);
	SculPane.add(SculPieceTitle);
	SculPieceTitle.setColumns(10);
	
	SculItemArtist = new JTextField();
	SculItemArtist.setBounds(155, 95, 160, 20);
	SculPane.add(SculItemArtist);
	SculItemArtist.setColumns(10);
	
	SculItemYear = new JTextField();
	SculItemYear.setBounds(155, 130, 160, 20);
	SculPane.add(SculItemYear);
	SculItemYear.setColumns(10);
	
	SculItemClassification = new JTextField();
	SculItemClassification.setBounds(155, 165, 160, 20);
	SculPane.add(SculItemClassification);
	SculItemClassification.setColumns(10);
	
	SculAuctionDate = new JTextField();
	SculAuctionDate.setBounds(155, 200, 160, 20);
	SculPane.add(SculAuctionDate);
	SculAuctionDate.setColumns(10);
	
	SculEstimatedPrice = new JTextField();
	SculEstimatedPrice.setBounds(155, 235, 160, 20);
	SculPane.add(SculEstimatedPrice);
	SculEstimatedPrice.setColumns(10);
	
	SculReservedPrice = new JTextField();
	SculReservedPrice.setBounds(155, 270, 160, 20);
	SculPane.add(SculReservedPrice);
	SculReservedPrice.setColumns(10);
	
	SculSellerdisplay = new JComboBox(displaySellers());
	SculSellerdisplay.setBounds(155, 305, 86, 20);
	SculPane.add(SculSellerdisplay);
	
	SculCustomerAggrement = new JCheckBox("Customer Aggrement");
	SculCustomerAggrement.setBounds(155, 335, 150, 23);
	SculPane.add(SculCustomerAggrement);
	
	SculAuthentification = new JCheckBox("Authentification");
	SculAuthentification.setBounds(155, 360, 150, 23);
	SculPane.add(SculAuthentification);
	
	SculItemProvenace = new JTextArea();
	SculItemProvenace.setBounds(155, 390, 200, 50);
	SculPane.add(SculItemProvenace);
	
	SculItemDescription = new JTextArea();
	SculItemDescription.setBounds(155, 475, 200, 50);
	SculPane.add(SculItemDescription);
			
	
	JLabel lblLotNumberScul = new JLabel("Lot Number");
	lblLotNumberScul.setBounds(25, 25, 100, 20);
	SculPane.add(lblLotNumberScul);
	
	JLabel lblTitleScul= new JLabel("Piece Title");
	lblTitleScul.setBounds(25, 60, 100, 20);
	SculPane.add(lblTitleScul);
	
	JLabel lblItemNameScul= new JLabel("Artist Name");
	lblItemNameScul.setBounds(25, 95, 100, 20);
	SculPane.add(lblItemNameScul);
	
	JLabel lblYearScul= new JLabel("Estimated Period");
	lblYearScul.setBounds(25, 130, 100, 20);
	SculPane.add(lblYearScul);
	
	JLabel lblClassificationScul = new JLabel("Classification");
	lblClassificationScul.setBounds(25, 165, 100, 20);
	SculPane.add(lblClassificationScul);
	
	
	JLabel lblAuctionDateScul = new JLabel("Auction Date");
	lblAuctionDateScul.setBounds(25, 200, 100, 20);
	SculPane.add(lblAuctionDateScul);
	
	JLabel lblEstimatedPriceScul= new JLabel("Estimated Price");
	lblEstimatedPriceScul.setBounds(25, 235, 100, 20);
	SculPane.add(lblEstimatedPriceScul);
	
	JLabel lblReservedPriceScul = new JLabel("Reserved Price");
	lblReservedPriceScul.setBounds(25, 270, 100, 20);
	SculPane.add(lblReservedPriceScul);
	
	JLabel lblUserScul= new JLabel("User Name");
	lblUserScul.setBounds(25, 305, 120, 23);
	SculPane.add(lblUserScul);

	
	JLabel lblProvenanceScul = new JLabel("Provenance");
	lblProvenanceScul.setBounds(25, 390, 100, 20);
	SculPane.add(lblProvenanceScul);
	
	JLabel lblDescriptionScul = new JLabel("Description");
	lblDescriptionScul.setBounds(25, 475, 100, 20);
	SculPane.add(lblDescriptionScul);
	
    ///////////////Sculpture Specific/////////////////////
	
	JLabel lblDimentionScul= new JLabel("Sculpture Dimention");
	lblDimentionScul.setBounds(380, 25, 150, 20);
	SculPane.add(lblDimentionScul);
	
	JLabel lblMaterialScul = new JLabel("Sculpture Material");
	lblMaterialScul.setBounds(380, 60, 150, 20);
	SculPane.add(lblMaterialScul);
	
	JLabel lblWeightScul = new JLabel("Sculpture Weight");
	lblWeightScul.setBounds(380, 95, 150, 20);
	SculPane.add(lblWeightScul);
	
	DimentionsScul = new JTextField();
	DimentionsScul.setBounds(520, 25, 160, 20);
	SculPane.add(DimentionsScul);
	DimentionsScul.setColumns(10);
	
	SculMaterial = new JTextField();
	SculMaterial.setBounds(520, 60, 160, 20);
	SculPane.add(SculMaterial);
	SculMaterial.setColumns(10);
	
	SculWeight = new JTextField();
	SculWeight.setBounds(520, 95, 160, 20);
	SculPane.add(SculWeight);
	SculWeight.setColumns(10);
	
	addSculpture = new JButton("Add To Database");
	addSculpture.setBounds(550, 500, 150, 25);
	SculPane.add(addSculpture);
	addSculpture.addActionListener((ActionListener) this);
	
	SculpturePicture = new JLabel("Please select a picture!");
	
	SculpturePicture.setBorder(border);
	SculpturePicture.setBounds(400, 160, 300, 300);
	SculPane.add(SculpturePicture);
	
	addSculpturePicture= new JButton("Select Picture");
	addSculpturePicture.setBounds(480, 130, 120, 20);
	SculPane.add(addSculpturePicture);
	addSculpturePicture.addActionListener((ActionListener) this);
	
	/////////////Carving General////////////////
	
	CarvPane = new JPanel();
	tabbedPane.addTab("Add Carvpture", null, CarvPane, null);
	CarvPane.setLayout(null);
	
	CarvItemLot = new JTextField();
	CarvItemLot.setBounds(155, 25, 160, 20);
	CarvPane.add(CarvItemLot);
	CarvItemLot.setColumns(10);
	
	CarvPieceTitle = new JTextField();
	CarvPieceTitle.setBounds(155, 60, 160, 20);
	CarvPane.add(CarvPieceTitle);
	CarvPieceTitle.setColumns(10);
	
	CarvItemArtist = new JTextField();
	CarvItemArtist.setBounds(155, 95, 160, 20);
	CarvPane.add(CarvItemArtist);
	CarvItemArtist.setColumns(10);
	
	CarvItemYear = new JTextField();
	CarvItemYear.setBounds(155, 130, 160, 20);
	CarvPane.add(CarvItemYear);
	CarvItemYear.setColumns(10);
	
	CarvItemClassification = new JTextField();
	CarvItemClassification.setBounds(155, 165, 160, 20);
	CarvPane.add(CarvItemClassification);
	CarvItemClassification.setColumns(10);
	
	CarvAuctionDate = new JTextField();
	CarvAuctionDate.setBounds(155, 200, 160, 20);
	CarvPane.add(CarvAuctionDate);
	CarvAuctionDate.setColumns(10);
	
	CarvEstimatedPrice = new JTextField();
	CarvEstimatedPrice.setBounds(155, 235, 160, 20);
	CarvPane.add(CarvEstimatedPrice);
	CarvEstimatedPrice.setColumns(10);
	
	CarvReservedPrice = new JTextField();
	CarvReservedPrice.setBounds(155, 270, 160, 20);
	CarvPane.add(CarvReservedPrice);
	CarvReservedPrice.setColumns(10);
	
	CarvSellerdisplay = new JComboBox(displaySellers());
	CarvSellerdisplay.setBounds(155, 305, 86, 20);
	CarvPane.add(CarvSellerdisplay);
	
	CarvCustomerAggrement = new JCheckBox("Customer Aggrement");
	CarvCustomerAggrement.setBounds(155, 335, 150, 23);
	CarvPane.add(CarvCustomerAggrement);
	
	CarvAuthentification = new JCheckBox("Authentification");
	CarvAuthentification.setBounds(155, 360, 150, 23);
	CarvPane.add(CarvAuthentification);
	
	CarvItemProvenace = new JTextArea();
	CarvItemProvenace.setBounds(155, 390, 200, 50);
	CarvPane.add(CarvItemProvenace);
	
	CarvItemDescription = new JTextArea();
	CarvItemDescription.setBounds(155, 475, 200, 50);
	CarvPane.add(CarvItemDescription);
			
	
	JLabel lblLotNumberCarv = new JLabel("Lot Number");
	lblLotNumberCarv.setBounds(25, 25, 100, 20);
	CarvPane.add(lblLotNumberCarv);
	
	JLabel lblTitleCarv= new JLabel("Piece Title");
	lblTitleCarv.setBounds(25, 60, 100, 20);
	CarvPane.add(lblTitleCarv);
	
	JLabel lblItemNameCarv= new JLabel("Artist Name");
	lblItemNameCarv.setBounds(25, 95, 100, 20);
	CarvPane.add(lblItemNameCarv);
	
	JLabel lblYearCarv= new JLabel("Estimated Period");
	lblYearCarv.setBounds(25, 130, 100, 20);
	CarvPane.add(lblYearCarv);
	
	JLabel lblClassificationCarv = new JLabel("Classification");
	lblClassificationCarv.setBounds(25, 165, 100, 20);
	CarvPane.add(lblClassificationCarv);
	
	
	JLabel lblAuctionDateCarv = new JLabel("Auction Date");
	lblAuctionDateCarv.setBounds(25, 200, 100, 20);
	CarvPane.add(lblAuctionDateCarv);
	
	JLabel lblEstimatedPriceCarv= new JLabel("Estimated Price");
	lblEstimatedPriceCarv.setBounds(25, 235, 100, 20);
	CarvPane.add(lblEstimatedPriceCarv);
	
	JLabel lblReservedPriceCarv = new JLabel("Reserved Price");
	lblReservedPriceCarv.setBounds(25, 270, 100, 20);
	CarvPane.add(lblReservedPriceCarv);
	
	JLabel lblUserCarv= new JLabel("User Name");
	lblUserCarv.setBounds(25, 305, 120, 23);
	CarvPane.add(lblUserCarv);

	
	JLabel lblProvenanceCarv = new JLabel("Provenance");
	lblProvenanceCarv.setBounds(25, 390, 100, 20);
	CarvPane.add(lblProvenanceCarv);
	
	JLabel lblDescriptionCarv = new JLabel("Description");
	lblDescriptionCarv.setBounds(25, 475, 100, 20);
	CarvPane.add(lblDescriptionCarv);
	
    ///////////////Carving Specific/////////////////////
	
	JLabel lblDimentionCarv= new JLabel("Carving Dimention");
	lblDimentionCarv.setBounds(380, 25, 150, 20);
	CarvPane.add(lblDimentionCarv);
	
	JLabel lblMaterialCarv = new JLabel("Carving Material");
	lblMaterialCarv.setBounds(380, 60, 150, 20);
	CarvPane.add(lblMaterialCarv);
	
	JLabel lblWeightCarv = new JLabel("Carving Weight");
	lblWeightCarv.setBounds(380, 95, 150, 20);
	CarvPane.add(lblWeightCarv);
	
	DimentionsCarv = new JTextField();
	DimentionsCarv.setBounds(520, 25, 160, 20);
	CarvPane.add(DimentionsCarv);
	DimentionsCarv.setColumns(10);
	
	CarvMaterial = new JTextField();
	CarvMaterial.setBounds(520, 60, 160, 20);
	CarvPane.add(CarvMaterial);
	CarvMaterial.setColumns(10);
	
	CarvWeight = new JTextField();
	CarvWeight.setBounds(520, 95, 160, 20);
	CarvPane.add(CarvWeight);
	CarvWeight.setColumns(10);
	
	addCarving = new JButton("Add To Database");
	addCarving.setBounds(550, 500, 150, 25);
	CarvPane.add(addCarving);
	addCarving.addActionListener((ActionListener) this);
	
	CarvingPicture = new JLabel("Please select a picture!");
	
	CarvingPicture.setBorder(border);
	CarvingPicture.setBounds(400, 160, 300, 300);
	CarvPane.add(CarvingPicture);
	
	addCarvingPicture= new JButton("Select Picture");
	addCarvingPicture.setBounds(480, 130, 120, 20);
	CarvPane.add(addCarvingPicture);
	addCarvingPicture.addActionListener((ActionListener) this);
	
	///////
	
	EditPane = new JPanel();
	tabbedPane.addTab("Edit Item", null, EditPane, null);
	EditPane.setLayout(null);
	

	txtSearch = new JTextField();
	txtSearch.setFont(new Font("Tahoma", Font.PLAIN, 12));
	txtSearch.setToolTipText("");
	txtSearch.setBounds(120, 20, 250, 20);
	EditPane.add(txtSearch);
	
	txtSearch.setColumns(10);
	
	JLabel lblSearch = new JLabel("Search...");
	lblSearch.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblSearch.setBounds(10, 20, 100, 20);
	EditPane.add(lblSearch);
	
	searchSelector = new JComboBox();
	searchSelector.setModel(new DefaultComboBoxModel(new String[] {"Item Title", "Item Lot Number", "Artist", "Price", "Seller"}));
	searchSelector.setFont(new Font("Tahoma", Font.PLAIN, 12));
	searchSelector.setBounds(380, 20, 130, 20);
	EditPane.add(searchSelector);
	
    searchButton  = new JButton("Search");
    searchButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
    searchButton.setBounds(520, 20, 80, 20);
	EditPane.add(searchButton);
	searchButton.addActionListener((ActionListener) this);
 
	
	JLabel lblSearch1 = new JLabel("Searching result");
	lblSearch1.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblSearch1.setBounds(10, 55, 200, 20);
	EditPane.add(lblSearch1);
	
	list = new JList();
	list.setBounds(10, 80, 130, 480);
	EditPane.add(list);
	
	list.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			// Check that an item is actually selected
			if (list.getSelectedIndex() != -1) {
				//EditPane.removeAll();
				editItem v = new editItem(list.getSelectedValue()+"");
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
    	//when the button "jBOption1" is pressed:
    	if (source == addDrawing)
    	{
    		//contentPane.removeAll();
    		//mainPanel.add(itemTabbedPane());
    		addNewDrawing();
    		contentPane.revalidate();
    		contentPane.repaint();
    	}
    	if(source == addPainting)
    	{
    	addPaintingToDatabase();
    	PaintingPane.revalidate();
    	PaintingPane.repaint();
    	}
    	if(source == addPhotography)
    	{
    	addPhotographicToDatabase();
    	addPhotography.revalidate();
    	addPhotography.repaint();
    	}
    	if(source == addSculpture)
    	{
    	addSculptureToDatabase();
    	addSculpture.revalidate();
    	addSculpture.repaint();
    	}
    	if(source == addCarving)
    	{
    	addCarvingToDatabase();
    	addCarving.revalidate();
    	addCarving.repaint();
    	}
    	if(source == searchButton)
    	{
    	searchMethod();
    	addCarving.revalidate();
    	addCarving.repaint();
    	}
    	if(source == addDrawingPicture)	
    	{
    		Drawingchooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & GIF Images", "jpg", "gif");
		    Drawingchooser.setFileFilter(filter);
		    int returnVal = Drawingchooser.showOpenDialog(getParent());
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		     Drawingchooser.getSelectedFile().getName());
		       DrawingPicture.setText("");
		       DrawingPicture.setIcon(new ImageIcon( Drawingchooser.getSelectedFile().getName()));	
				contentPane.repaint();
				contentPane.revalidate();
		      
    	}
    	}
    	if(source == addPhotoPicture)	
    	{
    		PhotoChooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & GIF Images", "jpg", "gif");
		    PhotoChooser.setFileFilter(filter);
		    int returnVal = PhotoChooser.showOpenDialog(getParent());
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		    		   PhotoChooser.getSelectedFile().getName());
		       PhotoPicture.setText("");
		       PhotoPicture.setIcon(new ImageIcon( PhotoChooser.getSelectedFile().getName()));	
		       PhotoPane.repaint();
		       PhotoPane.revalidate();
		      
    	}
    	}
    	if(source == addCarvingPicture)	
    	{
    		CarvingChooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & GIF Images", "jpg", "gif");
		    CarvingChooser.setFileFilter(filter);
		    int returnVal = CarvingChooser.showOpenDialog(getParent());
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		    		   CarvingChooser.getSelectedFile().getName());
		       CarvingPicture.setText("");
		       CarvingPicture.setIcon(new ImageIcon(CarvingChooser.getSelectedFile().getName()));	
		       CarvPane.repaint();
		       CarvPane.revalidate();
		      
    	}
    	}
    	if(source == addPaintingPicture)	
    	{
    		PaintingChooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & GIF Images", "jpg", "gif");
		    PaintingChooser.setFileFilter(filter);
		    int returnVal = PaintingChooser.showOpenDialog(getParent());
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		    		   PaintingChooser.getSelectedFile().getName());
		       PaintingPicture.setText("");
		       PaintingPicture.setIcon(new ImageIcon(PaintingChooser.getSelectedFile().getName()));	
		       PaintingPane.repaint();
		       PaintingPane.revalidate();
		      
    	}
    	}
    	if(source == addSculpturePicture)	
    	{
    		SculptureChooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & GIF Images", "jpg", "gif");
		    SculptureChooser.setFileFilter(filter);
		    int returnVal = SculptureChooser.showOpenDialog(getParent());
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		    		   SculptureChooser.getSelectedFile().getName());
		       SculpturePicture.setText("");
		       SculpturePicture.setIcon(new ImageIcon(SculptureChooser.getSelectedFile().getName()));	
		       SculPane.repaint();
		       SculPane.revalidate();
		      
    	}
    	}
    	 
    }
	public void searchMethod()
	{
		mtc = new MatisseConnector();
		mtc.connect();
 		Iterator<ArtItem> e = ArtItem.instanceIterator(mtc.getDB());
		String[] toDisplay = new String[ (int) ArtItem.getInstanceNumber(mtc.getDB())];
		ArtItem tempEmp;
		int position = 0;
		if(searchSelector.getSelectedItem().equals("Item Title"))
		{
		while (e.hasNext()) {
			tempEmp = e.next();
			String temp = tempEmp.getArtTitle();
			if (temp.equals(txtSearch.getText()) )
			{
			toDisplay[position] = tempEmp.getItemlotNo()+"    "+tempEmp.getArtTitle();
			position++;
			}
		}}
		if(searchSelector.getSelectedItem().equals("Artist"))
		{
		while (e.hasNext()) {
			tempEmp = e.next();
			String temp = tempEmp.getArtistName();
			if (temp.equals(txtSearch.getText()) )
			{
			toDisplay[position] = tempEmp.getItemlotNo()+"    "+tempEmp.getArtTitle();
			position++;
			}
		}}
		if(searchSelector.getSelectedItem().equals("Item Lot Number"))
		{
		while (e.hasNext()) {
			tempEmp = e.next();
			String temp = tempEmp.getItemlotNo()+"";
			if (temp.equals(txtSearch.getText()) )
			{
			toDisplay[position] = tempEmp.getItemlotNo()+"    "+tempEmp.getArtTitle();
			position++;
			}
		}}
		if(searchSelector.getSelectedItem().equals("Price"))
		{
		while (e.hasNext()) {
			tempEmp = e.next();
			String temp = tempEmp.getEstimatedPrice()+"";
			if (temp.equals(txtSearch.getText()) )
			{
			toDisplay[position] = tempEmp.getItemlotNo()+"    "+tempEmp.getArtTitle();
			position++;
			}
		}}
		if(searchSelector.getSelectedItem().equals("Seller"))
		{
		SellerClient sell = SellerClient.lookupFindSellerClient(mtc.getDB(),txtSearch.getText());
		int empLength = sell.getSells().length;
  		for (int i = 0; i < empLength; i++) {
			toDisplay[i] = sell.getSells()[i].getItemlotNo()+"    ";
			toDisplay[i] += sell.getSells()[i].getArtTitle();
		}
		}
	 
		
		// Use array to populate the Lists
		list.setListData(toDisplay);
		mtc.disconnect();	
	}
	public void addNewDrawing(){
		mtc = new MatisseConnector();
		mtc.connect();
 
		ArtItem item = new ArtItem(mtc.getDB());
 		DrawingCategory drw = new DrawingCategory(mtc.getDB());
		boolean checker = false;
 
		 
		drw.setDrawingMedium(MedDrawing.getText());
		drw.setDrawingFrame(framedDrawing.getText());
		drw.setDrawingDimension(DimentionsDrawing.getText());
		
		
		//Iterator<Seller> seller = Seller.findSellerIterator(mtc.getDB(), sellerdisplay.getSelectedItem().toString());
		Iterator<DrawingCategory> drow = DrawingCategory.findDrawingCategoryIterator(mtc.getDB(), MedDrawing.getText());
		//Iterator<Item> itiimeIterator = Item.findItemIterator(mtc.getDB(), Integer.parseInt(ItemLot.getText())+"");
		if(drow.hasNext() )
		{
			item.appendTo_drawing(drow.next());	
		}
		item.setArtistName(ItemArtist.getText());
		item.setItemlotNo(Integer.parseInt(ItemLot.getText()));
		item.setArtTitle(pieceTitle.getText());
		item.setPeriodFrom(ItemYear.getText());
		item.setClassification(ItemClassification.getText());
		item.setDescription(ItemDescription.getText());
		item.setProvenanceDetails(ItemProvenace.getText());
		item.setPicture(Drawingchooser.getSelectedFile().getName());
		item.setSoldCheck(false);

		
		
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
		
	 
		 System.out.println("Before Disconnect");
		 mtc.disconnect();
		 System.out.println("After Dissconenct");
		assignDrawingToSeller();
	}
	public void assignDrawingToSeller()
	{
		 System.out.println(sellerdisplay.getSelectedItem().toString()+" Start "+ItemLot.getText()+"");
		 mtc = new MatisseConnector();
		 mtc.connect();
		SellerClient seller = SellerClient.lookupFindSellerClient(mtc.getDB(), sellerdisplay.getSelectedItem().toString());
  		Iterator<ArtItem> itiimeIterator = ArtItem.findArtItemIterator(mtc.getDB(), Integer.parseInt(ItemLot.getText())+"");
 
  		
		if(itiimeIterator.hasNext())
		{ 
			seller.appendSells(itiimeIterator.next());		
		}
		System.out.println("Done");
		mtc.disconnect();
	}
	
	
	public void addPaintingToDatabase(){
		mtc = new MatisseConnector();
		mtc.connect();
 
		ArtItem item = new ArtItem(mtc.getDB());
 		PaintingCategory paint = new PaintingCategory(mtc.getDB());
 
		 paint.setPaintingMedium(MeduPainting.getText());
		 paint.setPaintingFrame(framePainting.getText());
		 paint.setPaintingDimension(DimentionsPainting.getText());
		
		Iterator<PaintingCategory> pain = PaintingCategory.findPaintingCategoryIterator(mtc.getDB(), MeduPainting.getText());
		
		if(pain.hasNext() )
		{
			item.appendTo_painting(pain.next());		
		}
		item.setArtistName(PaintingItemArtist.getText());
		item.setItemlotNo(Integer.parseInt(PaintingItemLot.getText()));
		item.setArtTitle(PaintingPieceTitle.getText());
		item.setPeriodFrom(PaintingItemYear.getText());
		item.setClassification(PaintingItemClassification.getText());
		item.setDescription(PaintingItemDescription.getText());
		item.setProvenanceDetails(PaitingItemProvenace.getText());
		item.setPicture(PaintingChooser.getSelectedFile().getName());
		item.setSoldCheck(false);

		boolean AuthentificationChecker = false;
		 if (PaintingAuthentification.isSelected()){
			 AuthentificationChecker = true;
	        }
		 item.setAuthentification(AuthentificationChecker);
		 
		boolean AggrementChecker = false;
		 if (PaintingCustomerAggrement.isSelected()){
			 AggrementChecker = true;
	        }
		 item.setCustomerAgreement(AggrementChecker);
		 item.setAuctionEstimatedDateDate(PaintingAuctionDate.getText());
		 item.setEstimatedPrice(Double.parseDouble(PaintingEstimatedPrice.getText()));
		 item.setReservedPrice(Double.parseDouble(PaintingReservedPrice.getText()));
		mtc.disconnect();
		assignPaintingToSeller();
	

	}
	public void assignPaintingToSeller()
	{
 		 mtc = new MatisseConnector();
		 mtc.connect();
		SellerClient seller = SellerClient.lookupFindSellerClient(mtc.getDB(), PaintingSellerdisplay.getSelectedItem().toString());
 		Iterator<ArtItem> itiimeIterator = ArtItem.findArtItemIterator(mtc.getDB(), Integer.parseInt(PaintingItemLot.getText())+"");

		if(itiimeIterator.hasNext())
		{ 
			seller.appendSells(itiimeIterator.next());		
		}
 		mtc.disconnect();
	}
	public void addPhotographicToDatabase(){
		mtc = new MatisseConnector();
		mtc.connect();
 
		ArtItem item = new ArtItem(mtc.getDB());
 		PhotographicCategory photo = new PhotographicCategory(mtc.getDB());
 		
 
 		photo.setPhotoType(PhotoType.getText());
 		photo.setPhotoDimension(DimentionsPhoto.getText());
		
		Iterator<PhotographicCategory> pho = PhotographicCategory.findPhotographicCategoryIterator(mtc.getDB(), PhotoType.getText());
		
		if(pho.hasNext() )
		{
			item.appendTo_photo(pho.next());		
		}
		item.setArtistName(PhotoItemArtist.getText());
		item.setItemlotNo(Integer.parseInt(PhotoItemLot.getText()));
		item.setArtTitle(PhotoPieceTitle.getText());
		item.setPeriodFrom(PhotoItemYear.getText());
		item.setClassification(PhotoItemClassification.getText());
		item.setDescription(PhotoItemDescription.getText());
		item.setProvenanceDetails(PhotoItemProvenace.getText());
		item.setPicture(PhotoChooser.getSelectedFile().getName());
		item.setSoldCheck(false);

		boolean AuthentificationChecker = false;
		 if (PhotoAuthentification.isSelected()){
			 AuthentificationChecker = true;
	        }
		 item.setAuthentification(AuthentificationChecker);
		 
		boolean AggrementChecker = false;
		 if (PhotoCustomerAggrement.isSelected()){
			 AggrementChecker = true;
	        }
		 item.setCustomerAgreement(AggrementChecker);
		 item.setAuctionEstimatedDateDate(PhotoAuctionDate.getText());
		 item.setEstimatedPrice(Double.parseDouble(PhotoEstimatedPrice.getText()));
		 item.setReservedPrice(Double.parseDouble(PhotoReservedPrice.getText()));
		mtc.disconnect();
		assignPhotographyToSeller();
	

	}
	public void assignPhotographyToSeller()
	{
 		 mtc = new MatisseConnector();
		 mtc.connect();
		SellerClient seller = SellerClient.lookupFindSellerClient(mtc.getDB(), PhotoSellerdisplay.getSelectedItem().toString());
 		Iterator<ArtItem> itiimeIterator = ArtItem.findArtItemIterator(mtc.getDB(), Integer.parseInt(PhotoItemLot.getText())+"");

		if(itiimeIterator.hasNext())
		{ 
			seller.appendSells(itiimeIterator.next());		
		}
 		mtc.disconnect();
	}

	
	public void addSculptureToDatabase(){
		mtc = new MatisseConnector();
		mtc.connect();
 
		ArtItem item = new ArtItem(mtc.getDB());
 		SculptureCategory scul= new SculptureCategory(mtc.getDB());
 		
 
 		scul.setSculptureDimension(DimentionsScul.getText());
 		scul.setSculptureWeight(Integer.parseInt(SculWeight.getText()));
 		scul.setSculptureMaterial(SculMaterial.getText());
		
		Iterator<SculptureCategory> scu = SculptureCategory.findSculptureCategoryIterator(mtc.getDB(), SculMaterial.getText());
		
		if(scu.hasNext() )
		{
			item.appendTo_sculpture(scu.next());	
		}
		item.setArtistName(SculItemArtist.getText());
		item.setItemlotNo(Integer.parseInt(SculItemLot.getText()));
		item.setArtTitle(SculPieceTitle.getText());
		item.setPeriodFrom(SculItemYear.getText());
		item.setClassification(SculItemClassification.getText());
		item.setDescription(SculItemDescription.getText());
		item.setProvenanceDetails(SculItemProvenace.getText());
		item.setPicture(SculptureChooser.getSelectedFile().getName());
		item.setSoldCheck(false);

		boolean AuthentificationChecker = false;
		 if (SculAuthentification.isSelected()){
			 AuthentificationChecker = true;
	        }
		 item.setAuthentification(AuthentificationChecker);
		 
		boolean AggrementChecker = false;
		 if (SculCustomerAggrement.isSelected()){
			 AggrementChecker = true;
	        }
		 item.setCustomerAgreement(AggrementChecker);
		 item.setAuctionEstimatedDateDate(SculAuctionDate.getText());
		 item.setEstimatedPrice(Double.parseDouble(SculEstimatedPrice.getText()));
		 item.setReservedPrice(Double.parseDouble(SculReservedPrice.getText()));
		mtc.disconnect();
		assignSculptureToSeller();
	

	}
	public void assignSculptureToSeller()
	{
 		 mtc = new MatisseConnector();
		 mtc.connect();
		SellerClient seller = SellerClient.lookupFindSellerClient(mtc.getDB(), SculSellerdisplay.getSelectedItem().toString());
 		Iterator<ArtItem> itiimeIterator = ArtItem.findArtItemIterator(mtc.getDB(), Integer.parseInt(SculItemLot.getText())+"");

		if(itiimeIterator.hasNext())
		{ 
			seller.appendSells(itiimeIterator.next());		
		}
 		mtc.disconnect();
	}
	
	public void addCarvingToDatabase(){
		mtc = new MatisseConnector();
		mtc.connect();
 
		ArtItem item = new ArtItem(mtc.getDB());
		CarvingCategory carv= new CarvingCategory(mtc.getDB());
 		
 
		carv.setCarvingDimension(DimentionsCarv.getText());
		carv.setCarvingWeight(Integer.parseInt(CarvWeight.getText()));
		carv.setCarvingMaterial(CarvMaterial.getText());
		
		Iterator<CarvingCategory> carvIte = CarvingCategory.findCarvingCategoryIterator(mtc.getDB(), CarvMaterial.getText());
		
		if(carvIte.hasNext() )
		{
			item.appendTo_carving(carvIte.next());	
		}
		item.setArtistName(CarvItemArtist.getText());
		item.setItemlotNo(Integer.parseInt(CarvItemLot.getText()));
		item.setArtTitle(CarvPieceTitle.getText());
		item.setPeriodFrom(CarvItemYear.getText());
		item.setClassification(CarvItemClassification.getText());
		item.setDescription(CarvItemDescription.getText());
		item.setProvenanceDetails(CarvItemProvenace.getText());
		item.setPicture(CarvingChooser.getSelectedFile().getName());
		item.setSoldCheck(false);

		boolean AuthentificationChecker = false;
		 if (CarvAuthentification.isSelected()){
			 AuthentificationChecker = true;
	        }
		 item.setAuthentification(AuthentificationChecker);
		 
		boolean AggrementChecker = false;
		 if (CarvCustomerAggrement.isSelected()){
			 AggrementChecker = true;
	        }
		 item.setCustomerAgreement(AggrementChecker);
		 item.setAuctionEstimatedDateDate(CarvAuctionDate.getText());
		 item.setEstimatedPrice(Double.parseDouble(CarvEstimatedPrice.getText()));
		 item.setReservedPrice(Double.parseDouble(CarvReservedPrice.getText()));
		mtc.disconnect();
		assignCarvingToSeller();
	

	}
	public void assignCarvingToSeller()
	{
 		 mtc = new MatisseConnector();
		 mtc.connect();
		SellerClient seller = SellerClient.lookupFindSellerClient(mtc.getDB(), CarvSellerdisplay.getSelectedItem().toString());
 		Iterator<ArtItem> itiimeIterator = ArtItem.findArtItemIterator(mtc.getDB(), Integer.parseInt(CarvItemLot.getText())+"");

		if(itiimeIterator.hasNext())
		{ 
			seller.appendSells(itiimeIterator.next());		
		}
 		mtc.disconnect();
	}
	
	public  String[]  displaySellers(){
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
			toDisplay[position] = tempEmp.getSellerFirstName();
			position++;

		}
		// Use array to populate the Lists
		//list.setListData(toDisplay);
		mtc.disconnect();
		return toDisplay;
	} 
}
     