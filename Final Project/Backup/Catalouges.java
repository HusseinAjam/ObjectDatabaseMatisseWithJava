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

public class Catalouges extends JPanel implements ActionListener {
  
	 private JPanel mainPanel,EditPane;
	 private MatisseConnector mtc;
	 private JLabel searchResault;
	 private JList list;
	 private JButton searchButton;
	 private JComboBox searchSelector ;
	 private JTextField txtSearch;
   
    public JTabbedPane catalougeTabbedPane(){
    	mainPanel = new JPanel();
    	mainPanel.setBounds(1, 30, 800,600);
    	mainPanel.setLayout(null);
       	 
    	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(30, 1, 800, 600);
		mainPanel.add(tabbedPane);
		
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
					CategoryProcess v = new CategoryProcess(list.getSelectedValue()+"");
					EditPane.add(v.itemTabbedPane());
					EditPane.revalidate();
					EditPane.repaint();	
					CreatPanel x = new CreatPanel(list.getSelectedValue()+"");
				    final java.awt.Image image = getImageFromPanel(x.itemTabbedPane());
			        String fileName = "C:\\Users\\Hussein\\Desktop\\newfile.pdf";
			        printToPDF(image, fileName);
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
     
 
    	if(source == searchButton)
    	{
    	searchMethod();
    	EditPane.revalidate();
    	EditPane.repaint();
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
	
    public void printToPDF(java.awt.Image awtImage, String fileName) {
        try {
            Document d = new Document();
            PdfWriter writer = PdfWriter.getInstance(d, new FileOutputStream(fileName));
            d.open();

            Image iTextImage = Image.getInstance(writer, awtImage, 1);
            //iTextImage.setAbsolutePosition(100,300);
            iTextImage.scalePercent(100);
            d.add(iTextImage);
            d.close();

        } catch (Exception e) {
            e.printStackTrace();
        }   
    }

    public static java.awt.Image getImageFromPanel(Component component) {

        BufferedImage image = new BufferedImage(component.getWidth(),
        component.getHeight(), BufferedImage.TYPE_INT_RGB);
        component.paint(image.getGraphics());
        return image;
    }
}
     