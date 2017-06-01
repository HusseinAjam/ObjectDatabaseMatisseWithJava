import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ReportProcess extends JPanel implements ActionListener {
	 private JPanel configPanel;	 
	 private JComboBox year, month, auct, periodStart, periodEnd;
	 private JButton yearb, monthb, auctb,  period;
	 private double totalPrice = 0;
	 private  JLabel Rate, totalAll , presentedAll ,soldAll, totalL, presentedL,soldL, totalP, presntedP , soldP , totalN, presntedN , soldN;
 
	 JButton btnUpdateSeller;
	 private MatisseConnector mtc;
 		JPanel contentPane;
		JPanel mainPanel;
		JPanel panel;
		//JTextField textField;
 		JTabbedPane tabbedPane;
   
     
    public JTabbedPane reportTabbedPane(){
   	 configPanel = new JPanel();
   	 configPanel.setBounds(1, 30, 800,600);
   	 configPanel.setLayout(null);
   	 
   	 JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(30, 1, 800, 600);
		configPanel.add(tabbedPane);

		panel = new JPanel();
		tabbedPane.addTab("Generate Different Reports", null, panel, null);
		panel.setLayout(null);
		
		year = new JComboBox(new String[] {"2015", "2014", "2013", "2012", "2011"});
		year.setBounds(120, 10, 200, 20);
		panel.add(year);
		
		month = new JComboBox(new String[] {"January", "February", "March", "April", "May", "Jun", "July", "August", "September", "October", "November", "December"});
		month.setBounds(120, 40, 200, 20);
		panel.add(month);
		
		auct = new JComboBox(auctionTitles());
		auct.setBounds(120, 70, 200, 20);
		panel.add(auct);
		
		periodStart= new JComboBox(new String[] {"January", "February", "March", "April", "May", "Jun", "July", "August", "September", "October", "November", "December"});
		periodStart.setBounds(120, 100, 200, 20);
		panel.add(periodStart);
		
		periodEnd= new JComboBox(new String[] {"January", "February", "March", "April", "May", "Jun", "July", "August", "September", "October", "November", "December"});
		periodEnd.setBounds(120, 130, 200, 20);
		panel.add(periodEnd);
		
		JLabel lblId = new JLabel("Year report");
		lblId.setBounds(10, 10, 90, 14);
		panel.add(lblId);
		
		JLabel lblTitle = new JLabel("Month Report");
		lblTitle.setBounds(10, 40, 90, 14);
		panel.add(lblTitle);
		
		JLabel lblName = new JLabel("Auction Report");
		lblName.setBounds(10, 70, 90, 14);
		panel.add(lblName);
		
		JLabel lblNamew = new JLabel("Period From");
		lblNamew.setBounds(10, 100, 90, 14);
		panel.add(lblNamew);
		
		JLabel lblNamet = new JLabel("To ");
		lblNamet.setBounds(10, 130, 50, 14);
		panel.add(lblNamet);
	
		JLabel allHouses = new JLabel("ALL Houses:");
		allHouses.setBounds(15, 180, 200, 25);
		allHouses.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(allHouses);
		
		 
		
		JLabel itemSold= new JLabel("Number of Items sold");
		itemSold.setBounds(15, 220, 200, 25);
		itemSold.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(itemSold);
		
		JLabel totalMoney= new JLabel("Total Money");
		totalMoney.setBounds(15, 240, 200, 25);
		totalMoney.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(totalMoney);
		
		JLabel LondonHouses = new JLabel("London House:");
		LondonHouses.setBounds(15, 280, 200, 25);
		LondonHouses.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(LondonHouses);
		
	 
		JLabel itemSoldL= new JLabel("Number of Items sold");
		itemSoldL.setBounds(15, 320, 200, 25);
		itemSoldL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(itemSoldL);
		
		JLabel totalMoneyL= new JLabel("Total Money");
		totalMoneyL.setBounds(15, 340, 200, 25);
		totalMoneyL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(totalMoneyL);
		
		JLabel ParisHouses = new JLabel("Paris House:");
		ParisHouses.setBounds(15, 380, 200, 25);
		ParisHouses.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(ParisHouses);
		
	 
		
		JLabel itemSoldP= new JLabel("Number of Items sold");
		itemSoldP.setBounds(15, 420, 200, 25);
		itemSoldP.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(itemSoldP);
		
		JLabel totalMoneyP= new JLabel("Total Money");
		totalMoneyP.setBounds(15, 440, 200, 25);
		totalMoneyP.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(totalMoneyP);
		
		JLabel NewYorkHouses = new JLabel("NewYork House:");
		NewYorkHouses.setBounds(15, 480, 200, 25);
		NewYorkHouses.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(NewYorkHouses);
		
	 
		
		JLabel itemSoldN= new JLabel("Number of Items sold");
		itemSoldN.setBounds(15, 520, 200, 25);
		itemSoldN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(itemSoldN);
		
		JLabel totalMoneyN= new JLabel("Total Money");
		totalMoneyN.setBounds(15, 540, 200, 25);
		totalMoneyN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(totalMoneyN);
		
		
		Rate = new JLabel("The company imports ratios");
		Rate.setBounds(510, 175, 200, 20);
 		panel.add(Rate);
		Rate.setVisible(false);
		
		yearb = new JButton("Generate");
		yearb.setBounds(330, 10, 100, 21);
		panel.add(yearb);
		yearb.addActionListener((ActionListener) this);
		
		monthb = new JButton("Generate");
		monthb.setBounds(330, 40, 100, 21);
		panel.add(monthb);
		monthb.addActionListener((ActionListener) this);
		
		auctb = new JButton("Generate");
		auctb.setBounds(330, 70, 100, 21);
		panel.add(auctb);
		auctb.addActionListener((ActionListener) this);
		
 
		
		period  = new JButton("Generate");
		period .setBounds(330, 130, 100, 21);
		panel.add(period );
		period .addActionListener((ActionListener) this);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(1, 165, 850, 2);
		panel.add(separator);
		
		 
		return tabbedPane;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object source = arg0.getSource();
     	if (source == yearb)
    	{ 
     		try {
				fillLabelsYear();
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
     		
		   List<Double> points = new ArrayList<>();
		   try {
			points = getTotalMoneyForYear();
		   } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   } 	
		   
 		   LineChart o = new LineChart(points, "fff");
		   panel.add(o.runnning());
		   Rate.setVisible(true);
		   configPanel.revalidate();
		   configPanel.repaint();
    	}
     	if (source == monthb)
    	{
     		try {
				fillLabelsMonth();
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		   List<Double> pointsm = new ArrayList<>();
		   try {
			pointsm = getTotalMoneyForMonth();
		   } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   } 	
 		   System.out.println(pointsm.size());
 		   LineChart o = new LineChart(pointsm, "fff");
		   panel.add(o.runnning());
		   Rate.setVisible(true);
    		panel.revalidate();
    		panel.repaint();
    	}
     	if (source == auctb)
    	{
     		try {
				fillLabelsAuc() ;
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		   List<Double> pointsm = new ArrayList<>();
		   try {
			pointsm = getTotalMoneyForAuction();
		   } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   } 	
 		   System.out.println(pointsm.size());
 		   LineChart o = new LineChart(pointsm, "fff");
		   panel.add(o.runnning());
		   Rate.setVisible(true);
    		panel.revalidate();
    		panel.repaint();
    	}
     	
     	if (source == period)
    	{
     		try {
				fillLabelsPeriod();
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		   List<Double> pointsm = new ArrayList<>();
		   try {
			pointsm = getTotalMoneyForPeriod();
		   } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   } 	
 		   System.out.println(pointsm.size());
 		   LineChart o = new LineChart(pointsm, "fff");
		   panel.add(o.runnning());
		   Rate.setVisible(true);
    		panel.revalidate();
    		panel.repaint();
    	}
		
	}
	
	public List<Double> getTotalMoneyForYear() throws ParseException {
	 	List<Double> points = new ArrayList<>();

		mtc = new MatisseConnector();
		mtc.connect();
		
 		Iterator<ArtItem> e = ArtItem.instanceIterator(mtc.getDB());
 		ArtItem tempEmp;
		double total = 0;
		while (e.hasNext()) {
			tempEmp = e.next();
			if(tempEmp.getSoldCheck() == true)
			{
				String string = tempEmp.getTarget_auction()[0].getAuctionDate();
				DateFormat format1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
				Date date1 = format1.parse(string);
				Calendar cale = Calendar.getInstance();
				cale.setTime(date1);
				int yearNumber = cale.get(Calendar.YEAR);
				String x = yearNumber+"";
				if(x.equals(year.getSelectedItem()))
				{
					total=total + tempEmp.getSoldPrice();
					points.add((double) tempEmp.getSoldPrice());
				}	
			}
		}
		totalPrice = total;
		mtc.disconnect();
		return (points);
	}

	public List<Double> getTotalMoneyForMonth() throws ParseException {
	 	List<Double> points = new ArrayList<>();

		mtc = new MatisseConnector();
		mtc.connect();
		
 		Iterator<ArtItem> e = ArtItem.instanceIterator(mtc.getDB());
 		ArtItem tempEmp;
		double total = 0;
		while (e.hasNext()) {
			tempEmp = e.next();
			if(tempEmp.getSoldCheck() == true)
			{
				String string = tempEmp.getTarget_auction()[0].getAuctionDate();
				DateFormat format1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
				Date date1 = format1.parse(string);
				Calendar cale = Calendar.getInstance();
				cale.setTime(date1);
				int monthNumber = cale.get(Calendar.MONTH);
  				if(monthNumber == month.getSelectedIndex())
				{
					total=total + tempEmp.getSoldPrice();
					points.add((double) tempEmp.getSoldPrice());
				}	
			}
		}
		totalPrice = total;
		mtc.disconnect();
		return (points);
	}
	public List<Double> getTotalMoneyForAuction() throws ParseException {
	 	List<Double> points = new ArrayList<>();

		mtc = new MatisseConnector();
		mtc.connect();
		
 		Iterator<ArtItem> e = ArtItem.instanceIterator(mtc.getDB());
 		ArtItem tempEmp;
		double total = 0;
		while (e.hasNext()) {
			tempEmp = e.next();
			if(tempEmp.getSoldCheck() == true)
			{
  				if(tempEmp.getTarget_auction()[0].getAuctionName().equals(auct.getSelectedItem()))
				{
					total=total + tempEmp.getSoldPrice();
					points.add((double) tempEmp.getSoldPrice());
				}	
			}
		}
 		mtc.disconnect();
		return (points);
	}
	public List<Double> getTotalMoneyForPeriod() throws ParseException {
		
		List<Double> points = new ArrayList<>();
		mtc = new MatisseConnector();
		mtc.connect();
		
 		Iterator<ArtItem> e = ArtItem.instanceIterator(mtc.getDB());
 		ArtItem tempEmp;
		double total = 0;
		while (e.hasNext()) {
			tempEmp = e.next();
			if(tempEmp.getSoldCheck() == true)
			{
				String string = tempEmp.getTarget_auction()[0].getAuctionDate();
				DateFormat format1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
				Date date1 = format1.parse(string);
				Calendar cale = Calendar.getInstance();
				cale.setTime(date1);
				int monthNumber = cale.get(Calendar.MONTH);
				
				if (monthNumber >= periodStart.getSelectedIndex() && monthNumber < periodEnd.getSelectedIndex() )
 				{
					total=total + tempEmp.getSoldPrice();
					points.add((double) tempEmp.getSoldPrice());
				}	
			}
		}
		totalPrice = total;
		mtc.disconnect();
		return (points);
	}
	
	public String[] auctionTitles()
	{
		mtc = new MatisseConnector();
		mtc.connect();
 		Iterator<AuctionDetails> e = AuctionDetails.instanceIterator(mtc.getDB());

		String[] toDisplay = new String[ (int) AuctionDetails.getInstanceNumber(mtc.getDB())];

		AuctionDetails tempEmp;
		int position = 0;
		while (e.hasNext()) {
			tempEmp = e.next();
			toDisplay[position] = tempEmp.getAuctionName();
			position++;

		}
 
		mtc.disconnect();
		return toDisplay;
	}
	
	public void fillLabelsPeriod() throws ParseException {
 
		soldAll= new JLabel("");
		soldAll.setBounds(180, 220, 200, 25);
		soldAll.setFont(new Font("Tahoma", Font.BOLD, 12));

		
		totalAll= new JLabel("");
		totalAll.setBounds(180, 240, 200, 25);
		totalAll.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		soldL= new JLabel("");
		soldL.setBounds(180, 320, 200, 25);
		soldL.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		totalL= new JLabel("");
		totalL.setBounds(180, 340, 200, 25);
		totalL.setFont(new Font("Tahoma", Font.BOLD, 12));
 
		soldP= new JLabel("");
		soldP.setBounds(180, 420, 200, 25);
		soldP.setFont(new Font("Tahoma", Font.BOLD, 12));

		
		 totalP= new JLabel("");
		 totalP.setBounds(180, 440, 200, 25);
		 totalP.setFont(new Font("Tahoma", Font.BOLD, 12));
 
		soldN= new JLabel("");
		soldN.setBounds(180, 520, 200, 25);
		soldN.setFont(new Font("Tahoma", Font.BOLD, 12));

		
		totalN= new JLabel("");
		totalN.setBounds(180, 540, 200, 25);
		totalN.setFont(new Font("Tahoma", Font.BOLD, 12));

		
 		mtc = new MatisseConnector();
		mtc.connect();
		
 		Iterator<ArtItem> e = ArtItem.instanceIterator(mtc.getDB());
 		ArtItem tempEmp;
		int totalA = 0;
		int totall =0;
		int  totalp = 0;
		int totaln = 0;
		int solda = 0;
		int  soldl= 0;
		int soldp =0;
		int soldn =0;
		int presenteda =0;
 
		
		
		while (e.hasNext()) {
			tempEmp = e.next();
			if(tempEmp.getSoldCheck() == true)
			{
				String string = tempEmp.getTarget_auction()[0].getAuctionDate();
				DateFormat format1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
				Date date1 = format1.parse(string);
				Calendar cale = Calendar.getInstance();
				cale.setTime(date1);
				int monthNumber = cale.get(Calendar.MONTH);
				
				if (monthNumber >= periodStart.getSelectedIndex() && monthNumber <= periodEnd.getSelectedIndex() )
 				{

					totalA = totalA + tempEmp.getSoldPrice();
					solda++;
					presenteda++;
						if(tempEmp.getTarget_auction()[0].getAuctionLocation().equals("London"))
						{
							totall = totall + tempEmp.getSoldPrice(); 
							soldl++;
						}
						if(tempEmp.getTarget_auction()[0].getAuctionLocation().equals("Paris"))
						{
							totalp = totalp + tempEmp.getSoldPrice(); 
							soldp++;
						}
						if(tempEmp.getTarget_auction()[0].getAuctionLocation().equals("New York"))
						{
							totaln = totaln + tempEmp.getSoldPrice(); 
							soldn++;
						}
					}
					else
					{
					presenteda++;
					}
 				}	
			
		}
 		mtc.disconnect();
 
 		soldAll.setText(solda+"");
		panel.add(soldAll);
		totalAll.setText(totalA+"");
		panel.add(totalAll);
		soldL.setText(soldl+"");
		panel.add(soldL);
		totalL.setText(totall+"");
		panel.add(totalL);
		soldP.setText(soldp+"");
		panel.add(soldP);
		totalP.setText(totalp+"");
		panel.add(totalP);
		soldN.setText(soldn+"");
		panel.add(soldN);
		totalN.setText(totaln+"");
		panel.add(totalN);
 	}
	public void fillLabelsYear() throws ParseException {
		 
		soldAll= new JLabel("");
		soldAll.setBounds(180, 220, 200, 25);
		soldAll.setFont(new Font("Tahoma", Font.BOLD, 12));

		
		totalAll= new JLabel("");
		totalAll.setBounds(180, 240, 200, 25);
		totalAll.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		soldL= new JLabel("");
		soldL.setBounds(180, 320, 200, 25);
		soldL.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		totalL= new JLabel("");
		totalL.setBounds(180, 340, 200, 25);
		totalL.setFont(new Font("Tahoma", Font.BOLD, 12));
 
		soldP= new JLabel("");
		soldP.setBounds(180, 420, 200, 25);
		soldP.setFont(new Font("Tahoma", Font.BOLD, 12));

		
		 totalP= new JLabel("");
		 totalP.setBounds(180, 440, 200, 25);
		 totalP.setFont(new Font("Tahoma", Font.BOLD, 12));
 
		soldN= new JLabel("");
		soldN.setBounds(180, 520, 200, 25);
		soldN.setFont(new Font("Tahoma", Font.BOLD, 12));

		
		totalN= new JLabel("");
		totalN.setBounds(180, 540, 200, 25);
		totalN.setFont(new Font("Tahoma", Font.BOLD, 12));

		
 		mtc = new MatisseConnector();
		mtc.connect();
		
 		Iterator<ArtItem> e = ArtItem.instanceIterator(mtc.getDB());
 		ArtItem tempEmp;
		int totalA = 0;
		int totall =0;
		int  totalp = 0;
		int totaln = 0;
		int solda = 0;
		int  soldl= 0;
		int soldp =0;
		int soldn =0;
		int presenteda =0;
 
		
		
		while (e.hasNext()) {
			tempEmp = e.next();
			if(tempEmp.getSoldCheck() == true)
			{
				String string = tempEmp.getTarget_auction()[0].getAuctionDate();
				DateFormat format1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
				Date date1 = format1.parse(string);
				Calendar cale = Calendar.getInstance();
				cale.setTime(date1);
				int yearNumber = cale.get(Calendar.YEAR);
				String x = yearNumber+"";
				if(x.equals(year.getSelectedItem()))
 				{

					totalA = totalA + tempEmp.getSoldPrice();
					solda++;
					presenteda++;
						if(tempEmp.getTarget_auction()[0].getAuctionLocation().equals("London"))
						{
							totall = totall + tempEmp.getSoldPrice(); 
							soldl++;
						}
						if(tempEmp.getTarget_auction()[0].getAuctionLocation().equals("Paris"))
						{
							totalp = totalp + tempEmp.getSoldPrice(); 
							soldp++;
						}
						if(tempEmp.getTarget_auction()[0].getAuctionLocation().equals("New York"))
						{
							totaln = totaln + tempEmp.getSoldPrice(); 
							soldn++;
						}
					}
					else
					{
					presenteda++;
					}
 				}	
			
		}
 		mtc.disconnect();
 
 		soldAll.setText(solda+"");
		panel.add(soldAll);
		totalAll.setText(totalA+"");
		panel.add(totalAll);
		soldL.setText(soldl+"");
		panel.add(soldL);
		totalL.setText(totall+"");
		panel.add(totalL);
		soldP.setText(soldp+"");
		panel.add(soldP);
		totalP.setText(totalp+"");
		panel.add(totalP);
		soldN.setText(soldn+"");
		panel.add(soldN);
		totalN.setText(totaln+"");
		panel.add(totalN);
 	}
	
	public void fillLabelsMonth() throws ParseException {
		 
		soldAll= new JLabel("");
		soldAll.setBounds(180, 220, 200, 25);
		soldAll.setFont(new Font("Tahoma", Font.BOLD, 12));

		
		totalAll= new JLabel("");
		totalAll.setBounds(180, 240, 200, 25);
		totalAll.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		soldL= new JLabel("");
		soldL.setBounds(180, 320, 200, 25);
		soldL.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		totalL= new JLabel("");
		totalL.setBounds(180, 340, 200, 25);
		totalL.setFont(new Font("Tahoma", Font.BOLD, 12));
 
		soldP= new JLabel("");
		soldP.setBounds(180, 420, 200, 25);
		soldP.setFont(new Font("Tahoma", Font.BOLD, 12));

		
		 totalP= new JLabel("");
		 totalP.setBounds(180, 440, 200, 25);
		 totalP.setFont(new Font("Tahoma", Font.BOLD, 12));
 
		soldN= new JLabel("");
		soldN.setBounds(180, 520, 200, 25);
		soldN.setFont(new Font("Tahoma", Font.BOLD, 12));

		
		totalN= new JLabel("");
		totalN.setBounds(180, 540, 200, 25);
		totalN.setFont(new Font("Tahoma", Font.BOLD, 12));

		
 		mtc = new MatisseConnector();
		mtc.connect();
		
 		Iterator<ArtItem> e = ArtItem.instanceIterator(mtc.getDB());
 		ArtItem tempEmp;
		int totalA = 0;
		int totall =0;
		int  totalp = 0;
		int totaln = 0;
		int solda = 0;
		int  soldl= 0;
		int soldp =0;
		int soldn =0;
		int presenteda =0;
 
		
		
		while (e.hasNext()) {
			tempEmp = e.next();
			if(tempEmp.getSoldCheck() == true)
			{
				String string = tempEmp.getTarget_auction()[0].getAuctionDate();
				DateFormat format1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
				Date date1 = format1.parse(string);
				Calendar cale = Calendar.getInstance();
				cale.setTime(date1);
				int monthNumber = cale.get(Calendar.MONTH);
  				if(monthNumber == month.getSelectedIndex())
 				{

					totalA = totalA + tempEmp.getSoldPrice();
					solda++;
					presenteda++;
						if(tempEmp.getTarget_auction()[0].getAuctionLocation().equals("London"))
						{
							totall = totall + tempEmp.getSoldPrice(); 
							soldl++;
						}
						if(tempEmp.getTarget_auction()[0].getAuctionLocation().equals("Paris"))
						{
							totalp = totalp + tempEmp.getSoldPrice(); 
							soldp++;
						}
						if(tempEmp.getTarget_auction()[0].getAuctionLocation().equals("New York"))
						{
							totaln = totaln + tempEmp.getSoldPrice(); 
							soldn++;
						}
					}
					else
					{
					presenteda++;
					}
 				}	
			
		}
 		mtc.disconnect();
 
 		soldAll.setText(solda+"");
		panel.add(soldAll);
		totalAll.setText(totalA+"");
		panel.add(totalAll);
		soldL.setText(soldl+"");
		panel.add(soldL);
		totalL.setText(totall+"");
		panel.add(totalL);
		soldP.setText(soldp+"");
		panel.add(soldP);
		totalP.setText(totalp+"");
		panel.add(totalP);
		soldN.setText(soldn+"");
		panel.add(soldN);
		totalN.setText(totaln+"");
		panel.add(totalN);
 	}
	
	public void fillLabelsAuc() throws ParseException {
		 
		soldAll= new JLabel("");
		soldAll.setBounds(180, 220, 200, 25);
		soldAll.setFont(new Font("Tahoma", Font.BOLD, 12));

		
		totalAll= new JLabel("");
		totalAll.setBounds(180, 240, 200, 25);
		totalAll.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		soldL= new JLabel("");
		soldL.setBounds(180, 320, 200, 25);
		soldL.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		totalL= new JLabel("");
		totalL.setBounds(180, 340, 200, 25);
		totalL.setFont(new Font("Tahoma", Font.BOLD, 12));
 
		soldP= new JLabel("");
		soldP.setBounds(180, 420, 200, 25);
		soldP.setFont(new Font("Tahoma", Font.BOLD, 12));

		
		 totalP= new JLabel("");
		 totalP.setBounds(180, 440, 200, 25);
		 totalP.setFont(new Font("Tahoma", Font.BOLD, 12));
 
		soldN= new JLabel("");
		soldN.setBounds(180, 520, 200, 25);
		soldN.setFont(new Font("Tahoma", Font.BOLD, 12));

		
		totalN= new JLabel("");
		totalN.setBounds(180, 540, 200, 25);
		totalN.setFont(new Font("Tahoma", Font.BOLD, 12));

		
 		mtc = new MatisseConnector();
		mtc.connect();
		
 		Iterator<ArtItem> e = ArtItem.instanceIterator(mtc.getDB());
 		ArtItem tempEmp;
		int totalA = 0;
		int totall =0;
		int  totalp = 0;
		int totaln = 0;
		int solda = 0;
		int  soldl= 0;
		int soldp =0;
		int soldn =0;
		int presenteda =0;
 
		
		
		while (e.hasNext()) {
			tempEmp = e.next();
			if(tempEmp.getSoldCheck() == true)
			{
  				if(tempEmp.getTarget_auction()[0].getAuctionName().equals(auct.getSelectedItem()))
				{

					totalA = totalA + tempEmp.getSoldPrice();
					solda++;
					presenteda++;
						if(tempEmp.getTarget_auction()[0].getAuctionLocation().equals("London"))
						{
							totall = totall + tempEmp.getSoldPrice(); 
							soldl++;
						}
						if(tempEmp.getTarget_auction()[0].getAuctionLocation().equals("Paris"))
						{
							totalp = totalp + tempEmp.getSoldPrice(); 
							soldp++;
						}
						if(tempEmp.getTarget_auction()[0].getAuctionLocation().equals("New York"))
						{
							totaln = totaln + tempEmp.getSoldPrice(); 
							soldn++;
						}
					}
					else
					{
					presenteda++;
					}
 				}	
			
		}
 		mtc.disconnect();
 
 		soldAll.setText(solda+"");
		panel.add(soldAll);
		totalAll.setText(totalA+"");
		panel.add(totalAll);
		soldL.setText(soldl+"");
		panel.add(soldL);
		totalL.setText(totall+"");
		panel.add(totalL);
		soldP.setText(soldp+"");
		panel.add(soldP);
		totalP.setText(totalp+"");
		panel.add(totalP);
		soldN.setText(soldn+"");
		panel.add(soldN);
		totalN.setText(totaln+"");
		panel.add(totalN);
 	}
	
}
