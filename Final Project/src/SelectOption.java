import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SelectOption extends JFrame{
	
	private JPanel contentPane;
	private JPanel panel;
	public SelectOption(String UserName, int level) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1090, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    panel = new JPanel();
		panel.setBounds(220, 40, 840, 630);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.GRAY);
		separator_2.setBackground(new Color(75, 0, 130));
		separator_2.setBounds(21, 0, 5, 725);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.GRAY);
		separator_3.setBackground(new Color(75, 0, 130));
		separator_3.setBounds(20, 0, 5, 725);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.GRAY);
		separator_4.setBackground(Color.RED);
		separator_4.setBounds(0, 19, 1120, 5);
		contentPane.add(separator_4);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.GRAY);
		separator_1.setBackground(Color.RED);
		separator_1.setBounds(0, 20, 1120, 5);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Hussein\\Desktop\\ecqlips pro\\Final Project\\logo2.jpg"));
		lblNewLabel_1.setBounds(32, 29, 185, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hello "+UserName);
 		lblNewLabel_2.setBounds(35, 80, 100, 22);
		contentPane.add(lblNewLabel_2);
		
		
		
		
		
		
		JButton btnNewButton_1 = new JButton("Items");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.removeAll();
				ItemBackgroundWork v = new ItemBackgroundWork();
				panel.add(v.itemTabbedPane());
				panel.revalidate();
				panel.repaint();
			}
		});
		btnNewButton_1.setBounds(40, 120, 110, 23);
		
		JButton btnNewButton_3 = new JButton("Auction");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.removeAll();
				AuctionBackgroundWork v = new AuctionBackgroundWork();
				panel.add(v.sellerTabbedPane());
				panel.revalidate();
				panel.repaint();
			}
		});
 		btnNewButton_3.setBounds(40, 150, 110, 23);
 		
		JButton btnNewButton = new JButton("Seller");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				SellerBackgroundWork v = new SellerBackgroundWork();
				panel.add(v.sellerTabbedPane());
				panel.revalidate();
				panel.repaint();
			}
		});
		btnNewButton.setBounds(40, 180, 110, 23);
		
		JButton btnNewButton_2 = new JButton("Buyer");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.removeAll();
				BuyerBackgroundWork b = new BuyerBackgroundWork();
				panel.add(b.buyerTabbedPane());
				panel.revalidate();
				panel.repaint();
			}
		});
		btnNewButton_2.setBounds(40, 210, 110, 23);

		

		
		JButton btnNewButton_4 = new JButton("Auctioneer");
		btnNewButton_4.setBounds(40, 240, 110, 23);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.removeAll();
				AuctioneerTable a = new AuctioneerTable();
				panel.add(a.auctioneerTabbedPane());
				panel.revalidate();
				panel.repaint();
			}
		});
		
		JButton btnNewButton_5 = new JButton("Catalougues");
		btnNewButton_5.setBounds(40, 270, 110, 23);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.removeAll();
				CatalougeBackgroundWork a = new CatalougeBackgroundWork();
				panel.add(a.catalougeTabbedPane());
				panel.revalidate();
				panel.repaint();
			}
		});
		
		JButton btnNewButton_6 = new JButton("Reports");
		btnNewButton_6.setBounds(40, 300, 110, 23);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.removeAll();
				ReportBackgroundWork a = new ReportBackgroundWork();
				panel.add(a.reportTabbedPane());
				panel.revalidate();
				panel.repaint();
			}
		});
		
		
	 if(level == 1)
	 {
			contentPane.add(btnNewButton_1); // item
			contentPane.add(btnNewButton_3); // auction
			contentPane.add(btnNewButton); // seller
			contentPane.add(btnNewButton_2); // buyer
			contentPane.add(btnNewButton_4); // auctioneer
			contentPane.add(btnNewButton_5); // catalouge
			contentPane.add(btnNewButton_6); // report
	 }
	 if(level == 2)
	 {
			contentPane.add(btnNewButton_1); // item
			contentPane.add(btnNewButton_3); // auction
			contentPane.add(btnNewButton); // seller
			contentPane.add(btnNewButton_2); // buyer
			contentPane.add(btnNewButton_4); // auctioneer
			contentPane.add(btnNewButton_5); // catalouge
 	 }
	 if(level == 3)
	 {
			panel.removeAll();
			AuctioneerTable a = new AuctioneerTable();
			panel.add(a.auctioneerTabbedPane());
			panel.revalidate();
			panel.repaint();    			
    			
 	 }
	 
	}
	
}
