 import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class CatalougeBackgroundWork extends JPanel implements ActionListener {
	
	 private MatisseConnector mtc;
	 private JPanel mainPanel,BasicPanel;
 	 private JList listAll;
	 private JButton searchButton,print;
	 private JComboBox searchCombo ;
	 private JTextField textSearch;
   
    public JTabbedPane catalougeTabbedPane(){
    	mainPanel = new JPanel();
    	mainPanel.setBounds(1, 30, 800,600);
    	mainPanel.setLayout(null);
       	 
    	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(30, 1, 800, 600);
		mainPanel.add(tabbedPane);
		
		BasicPanel = new JPanel();
		tabbedPane.addTab("Edit Item", null, BasicPanel, null);
		BasicPanel.setLayout(null);
		
		

		textSearch = new JTextField();
		textSearch.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textSearch.setToolTipText("");
		textSearch.setBounds(120, 20, 250, 20);
		BasicPanel.add(textSearch);
		textSearch.setColumns(10);
		
		JLabel lblSearching = new JLabel("Search...");
		lblSearching.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSearching.setBounds(10, 20, 100, 20);
		BasicPanel.add(lblSearching);
		
		searchCombo = new JComboBox();
		searchCombo.setModel(new DefaultComboBoxModel(new String[] {"Art Title", "Art Lot Number", "Artist", "Price", "Seller"}));
		searchCombo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		searchCombo.setBounds(380, 20, 130, 20);
		BasicPanel.add(searchCombo);
		
		listAll = new JList();
		listAll.setBounds(10, 80, 130, 480);
		BasicPanel.add(listAll);
		
	    searchButton  = new JButton("Search");
	    searchButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    searchButton.setBounds(520, 20, 80, 20);
		BasicPanel.add(searchButton);
		searchButton.addActionListener((ActionListener) this);
		
	    print  = new JButton("Print Catalouge");
	    print.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    print.setBounds(610, 20, 80, 20);
		BasicPanel.add(print);
		print.addActionListener((ActionListener) this);
	 
		
		JLabel lblSearching2 = new JLabel("Results");
		lblSearching2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSearching2.setBounds(10, 55, 200, 20);
		BasicPanel.add(lblSearching2);

		
		listAll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
 				if (listAll.getSelectedIndex() != -1) {
 					CategoryBackgroundWork v = new CategoryBackgroundWork(listAll.getSelectedValue()+"");
					BasicPanel.add(v.itemTabbedPane());
					BasicPanel.revalidate();
					BasicPanel.repaint();	
				}
			}
		});
			return tabbedPane;
 	}
	@Override
	public void actionPerformed(ActionEvent event)
    {
    	Object source = event.getSource();
    	if(source == searchButton)
    	{
    	searchMethod();
    	BasicPanel.revalidate();
    	BasicPanel.repaint();
    	}
    	if(source == print)
    	{
			CreateAuction y = new CreateAuction(listAll.getSelectedValue()+"");
		    final java.awt.Image pic = getImageOutOfPanel(y.itemTabbedPane());
	        String path = "C:\\Users\\Hussein\\Desktop\\newfile.pdf";
	        PrintImageToPDF(pic, path);
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
		if(searchCombo.getSelectedItem().equals("Art Title"))
		{
		while (e.hasNext()) {
			tempEmp = e.next();
			String temp = tempEmp.getArtTitle();
			if (temp.equals(textSearch.getText()) )
			{
			toDisplay[position] = tempEmp.getItemlotNo()+"    "+tempEmp.getArtTitle();
			position++;
			}
		}}
		if(searchCombo.getSelectedItem().equals("Artist")){
		while (e.hasNext()) {
			tempEmp = e.next();
			String temp = tempEmp.getArtistName();
			if (temp.equals(textSearch.getText()) )
			{
			toDisplay[position] = tempEmp.getItemlotNo()+"    "+tempEmp.getArtTitle();
			position++;
			}
		}}
		if(searchCombo.getSelectedItem().equals("Art Lot Number"))
		{
		while (e.hasNext()) {
			tempEmp = e.next();
			String temp = tempEmp.getItemlotNo()+"";
			if (temp.equals(textSearch.getText()) )
			{
			toDisplay[position] = tempEmp.getItemlotNo()+"    "+tempEmp.getArtTitle();
			position++;
			}
		}}
		
		if(searchCombo.getSelectedItem().equals("Seller"))
		{
		SellerClient sell = SellerClient.lookupFindSellerClient(mtc.getDB(),textSearch.getText());
		int empLength = sell.getSells().length;
  		for (int i = 0; i < empLength; i++) {
			toDisplay[i] = sell.getSells()[i].getItemlotNo()+"    ";
			toDisplay[i] += sell.getSells()[i].getArtTitle();
		}
		}
		if(searchCombo.getSelectedItem().equals("Price"))
		{
		while (e.hasNext()) {
			tempEmp = e.next();
			String temp = tempEmp.getEstimatedPrice()+"";
			if (temp.equals(textSearch.getText()) )
			{
			toDisplay[position] = tempEmp.getItemlotNo()+"    "+tempEmp.getArtTitle();
			position++;
			}
		}}
 		listAll.setListData(toDisplay);
		mtc.disconnect();	
	}
    public static java.awt.Image getImageOutOfPanel(Component component) {

        BufferedImage pic = new BufferedImage(component.getWidth(),
        component.getHeight(), BufferedImage.TYPE_INT_RGB);
        component.paint(pic.getGraphics());
        return pic;
    }
    
    public void PrintImageToPDF(java.awt.Image awtImage, String fileName) {
        try {
            Document ddd = new Document();
            PdfWriter writer = PdfWriter.getInstance(ddd, new FileOutputStream(fileName));
            ddd.open();

            Image iTextImage = Image.getInstance(writer, awtImage, 1);
            iTextImage.scalePercent(100);
            ddd.add(iTextImage);
            ddd.close();

        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
}
     