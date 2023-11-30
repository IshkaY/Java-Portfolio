//name:Ishka Yao
//creation date:21 April 2022
//importing different packs for each function such as adding image,frames,button,text
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;//importing img enabled
import javax.swing.JTextField;//so you can add a field to write text in
import java.awt.GridLayout;//layout package for panels so you can add rows and columns
import java.awt.Color;//pack to add colour to frame
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//click listener allows button to be clicked which triggers the action listener to perform the algorithim you tell them to do e.g click button
public class StoreFrame extends JFrame
{
  private JButton button;//creating variables
  private JButton button2;//add-button to add game in basket
  private JButton button3;
  private JButton button4;
  private JButton button5;
  private JButton button6;
  private JButton button7;
  private JButton button8;
  private JButton button9;
  private JButton button10;
  private JButton mbutton;//minus-button to get rid of game in basket
  private JButton mbutton2;
  private JButton mbutton3;
  private JButton mbutton4;
  private JButton mbutton5;
  private JButton mbutton6;
  private JButton mbutton7;
  private JButton mbutton8;
  private JButton mbutton9;
  private JButton mbutton10;
  private JButton discbutton;//apply discount button
  private JLabel lblGamename;//game name labels
  private JLabel lblGamename2;
  private JLabel lblGamename3;
  private JLabel lblGamename4;
  private JLabel lblGamename5;
  private JLabel lblGamename6;
  private JLabel lblGamename7;
  private JLabel lblGamename8;
  private JLabel lblGamename9;
  private JLabel lblGamename10;
  private JLabel lblStock;//stock label for e.g stock availability or quantity
  private JLabel lblStock2;
  private JLabel lblStock3;
  private JLabel lblStock4;
  private JLabel lblStock5;
  private JLabel lblStock6;
  private JLabel lblStock7;
  private JLabel lblStock8;
  private JLabel lblStock9;
  private JLabel lblStock10;
  private JLabel total;//label for the total cost
  private JLabel discimg;//discount image / banner display
  private JLabel disc;//apply discount
  private JTextField disctxt;//display string/text area for discount
  private double price[]={15.99,20,45.99,4.20,200,13,89,7.99,0.01,17};//price of games
  private int num[]={1,78,23,5,2,180,9,31,999,5};//array for stock amount
  private int refnum[]={1,78,23,5,2,180,9,31,999,5};//copy of array num
  private double totalamount=0;//Amount before games is purchased
  private double number;//Discount number variable
  
  private static final int FRAME_WIDTH = 1000;//frame size
  private static final int FRAME_HEIGHT = 1000;

public StoreFrame()//creating default constructor setting default values StoreFrame 
{	  
	  setLayout(new GridLayout (6,2));//panel/grid layout is 6 rows by 2 columns
	  createComponents();
	  setSize(FRAME_WIDTH,FRAME_HEIGHT);//applying the width and height of frame from the above variable
}  
class StockListenerapply implements ActionListener
  {
    public void actionPerformed(ActionEvent event)//when the code is entered correctly adds 15% disc
    {
	number=Double.parseDouble(disctxt.getText());
	if(number==2111000)	//must be the correct discount code to add 15% off discount
	totalamount = totalamount/1.15;	//applying 15% of calculation if code is correct
	total.setText("Total = " + totalamount);//displaying total after discount has been added
    }
  }
class StockListener1 implements ActionListener
  {
    public void actionPerformed(ActionEvent event)//when button is clicked reduce stock
    {
	 if(num[0]==0)
	 {
	  lblStock.setText("Out Of Stock");	 //unless if it goes below 0
	 }
	 else
	 {
	 num[0]--;
	 totalamount = totalamount + price[0];//adding the price to the total in basket
	 lblStock.setText("Stock Quantity:"+ num[0]);
	 total.setText("Total = " + totalamount);}//shows total for game
    }
  }
//stock 2  
class StockListener2 implements ActionListener//using if else if the game stock reaches 0 or less display out of stock
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[1]==0)
	 {
	 lblStock2.setText("Out Of Stock");	 
	 }
	 else
	 {	
	  num[1]--;
	   totalamount = totalamount + price[1];//Adds item into into shopping cart
	 lblStock2.setText("Stock Quantity:"+ num[1]);//displaying stock quantity
	  total.setText("Total = " + totalamount);}//adds on price to the total amount each time purchase button is pressed
    }
  }
//stock 3  
class StockListener3 implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[2]==0)
	 {
	  lblStock3.setText("Out Of Stock");	
	 }
	 else
	 {	
	  num[2]--;
	   totalamount = totalamount + price[2];
	 lblStock3.setText("Stock Quantity:"+ num[2]);
	 total.setText("Total = " + totalamount); }
    }
  }  
//stock 4 
class StockListener4 implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[3]==0)
	 {
	  lblStock4.setText("Out Of Stock");	 
	 }
	 else
	 {	
	  num[3]--;
	   totalamount = totalamount + price[3];
	 lblStock4.setText("Stock Quantity:"+ num[3]);
	  total.setText("Total = " + totalamount);}
    }
  }
//stock 5  
class StockListener5 implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[4]==0)
	 {
	  lblStock5.setText("Out Of Stock");	 
	 }
	 else
	 {	
	  num[4]--;
	  totalamount = totalamount + price[4]; 
	 lblStock5.setText("Stock Quantity:"+ num[4]);
	  total.setText("Total = " + totalamount);}
    }
  } 
//stock 6  
class StockListener6 implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[5]==0)
	 {
	  lblStock6.setText("Out Of Stock");	
	 }
	 else
	 {	
	  num[5]--;
	   totalamount = totalamount + price[5];
	 lblStock6.setText("Stock Quantity:"+ num[5]);
	  total.setText("Total = " + totalamount);}
    }
  }
//stock 7  
class StockListener7 implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[6]==0)
	 {
	  lblStock7.setText("Out Of Stock");	 
	 }
	 else
	 {	
	  num[6]--;
	  totalamount = totalamount + price[6]; 
	 lblStock7.setText("Stock Quantity:"+ num[6]);
	  total.setText("Total = " + totalamount);}
    }
  }
//stock 8  
class StockListener8 implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[7]==0)
	 {
	  lblStock8.setText("Out Of Stock");	 
	 }
	 else
	 {	
	  num[7]--;
	   totalamount = totalamount + price[7];
	 lblStock8.setText("Stock Quantity:"+ num[7]);
	  total.setText("Total = " + totalamount);}
    }
  }  
//stock 9  
class StockListener9 implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[8]==0)
	 {
	  lblStock9.setText("Out Of Stock");	
	 }
	 else
	 {	
	  num[8]--;
	   totalamount = totalamount + price[8];
	 lblStock9.setText("Stock Quantity:"+ num[8]);
	 total.setText("Total = " + totalamount);}
    }
  }   
//stock 10  
class StockListener10 implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[9]==0)
	 {
	  lblStock10.setText("Out Of Stock");	 
	 }
	 else
	 {	
	  num[9]--;
	   totalamount = totalamount + price[9];
	 lblStock10.setText("Stock Quantity:"+ num[9]); 
	 total.setText("Total = " + totalamount);}
    }
  }      
 //minus stock 1 creating different listeners for each button so we can imply it on actionlistener
  class StockListener1m implements ActionListener
  {
    public void actionPerformed(ActionEvent event)//prevents going over stock amount
    {
	if(num[0]<refnum[0])//This is to increase stock when remove button is clicked
	{
	  num[0]++;
	  totalamount = totalamount - price[0];//if you remove a game the total amount will also get rid of the game cost 
	lblStock.setText("Stock Quantity:"+ num[0]); //displaying stock quantity
	total.setText("Total = " + totalamount);}//Total amount
    }
  }
//minus stock 2  
class StockListener2m implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[1]<refnum[1])	
	{	
	  num[1]++;
	  totalamount = totalamount - price[1];
	lblStock2.setText("Stock Quantity:"+ num[1]);
	total.setText("Total = " + totalamount);}
    }
  }  
//minus stock 3  
class StockListener3m implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[2]<refnum[2])	
	{	
	  num[2]++;
	  totalamount = totalamount - price[2];
	lblStock3.setText("Stock Quantity:"+ num[2]);
	total.setText("Total = " + totalamount);}
    }
  }  
//minus stock 4  
class StockListener4m implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[3]<refnum[3])	
	{	
	  num[3]++;
	  totalamount = totalamount - price[3];
	lblStock4.setText("Stock Quantity:"+ num[3]);
	total.setText("Total = " + totalamount);}
    }
  }
//minus stock 5  
class StockListener5m implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[4]<refnum[4])	
	{	
	  num[4]++;
	  totalamount = totalamount - price[4];
	lblStock5.setText("Stock Quantity:"+ num[4]);
	total.setText("Total = " + totalamount);}
    }
  }  
 //minus stock 6 
class StockListener6m implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[5]<refnum[5])	
	{	
	  num[5]++;
	  totalamount = totalamount - price[5];
	lblStock6.setText("Stock Quantity:"+ num[5]); 
	total.setText("Total = " + totalamount);}
    }
  }  
//minus stock 7  
class StockListener7m implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[6]<refnum[6])	
	{	
	  num[6]++;
	 totalamount = totalamount - price[6]; 
	lblStock7.setText("Stock Quantity:"+ num[6]);
	total.setText("Total = " + totalamount);}
    }
  }
//minus stock 8  
class StockListener8m implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[7]<refnum[7])	
	{	
	  num[7]++;
	  totalamount = totalamount - price[7];
	lblStock8.setText("Stock Quantity:"+ num[7]); 
	total.setText("Total = " + totalamount);}
    }
  }  
//minus stock 9  
class StockListener9m implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[8]<refnum[8])	
	{	
	  num[8]++;
	  totalamount = totalamount - price[8];
	lblStock9.setText("Stock Quantity:"+ num[8]); 
	total.setText("Total = " + totalamount);}
    }
  }   
//minus stock 10  
class StockListener10m implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
	if(num[9]<refnum[9])	
	{	
	  num[9]++;
	  totalamount = totalamount - price[9];
	lblStock10.setText("Stock Quantity:"+ num[9]);
	total.setText("Total = " + totalamount);}
    }
  }      
private void createComponents()
	{
	button = new JButton ("Purchase");//creating button to purchase games
	button2 = new JButton ("Purchase");
	button3 = new JButton ("Purchase");
	button4 = new JButton ("Purchase");
	button5 = new JButton ("Purchase");
	button6 = new JButton ("Purchase");
	button7 = new JButton ("Purchase");
	button8 = new JButton ("Purchase");
	button9 = new JButton ("Purchase");
	button10 = new JButton ("Purchase");
	//creating buttons to remove games for each game i have
	mbutton = new JButton ("Remove");
	mbutton2 = new JButton ("Remove");
	mbutton3 = new JButton ("Remove");
	mbutton4 = new JButton ("Remove");
	mbutton5 = new JButton ("Remove");
	mbutton6 = new JButton ("Remove");
	mbutton7 = new JButton ("Remove");
	mbutton8 = new JButton ("Remove");
	mbutton9 = new JButton ("Remove");
	mbutton10 = new JButton ("Remove");
	discbutton = new JButton ("Apply");
	
	ActionListener listener1 = new StockListener1();//creating listener object to add stock/remove stock
	ActionListener listener2 = new StockListener2();//adding stock
	ActionListener listener3 = new StockListener3();
	ActionListener listener4 = new StockListener4();
	ActionListener listener5 = new StockListener5();
	ActionListener listener6 = new StockListener6();
	ActionListener listener7 = new StockListener7();
	ActionListener listener8 = new StockListener8();
	ActionListener listener9 = new StockListener9();
	//removing stock quantity using actionlistener
	ActionListener listener10 = new StockListener10();
	ActionListener mlistener1 = new StockListener1m();
	ActionListener mlistener2 = new StockListener2m();
	ActionListener mlistener3 = new StockListener3m();
	ActionListener mlistener4 = new StockListener4m();
	ActionListener mlistener5 = new StockListener5m();
	ActionListener mlistener6 = new StockListener6m();
	ActionListener mlistener7 = new StockListener7m();
	ActionListener mlistener8 = new StockListener8m();
	ActionListener mlistener9 = new StockListener9m();
	ActionListener mlistener10 = new StockListener10m();
	//applying discount now available 
	ActionListener listenerapply = new StockListenerapply();
	discbutton.addActionListener(listenerapply);
	
	button.addActionListener(listener1);//Adds actionlistener to button so the user can perform a event e.g click/enter
	button2.addActionListener(listener2);
	button3.addActionListener(listener3);
	button4.addActionListener(listener4);
	button5.addActionListener(listener5);
	button6.addActionListener(listener6);
	button7.addActionListener(listener7);
	button8.addActionListener(listener8);
	button9.addActionListener(listener9);
	button10.addActionListener(listener10);
	//Adds actionlistener to minus button
	mbutton.addActionListener(mlistener1);
	mbutton2.addActionListener(mlistener2);
	mbutton3.addActionListener(mlistener3);
	mbutton4.addActionListener(mlistener4);
	mbutton5.addActionListener(mlistener5);
	mbutton6.addActionListener(mlistener6);
	mbutton7.addActionListener(mlistener7);
	mbutton8.addActionListener(mlistener8);
	mbutton9.addActionListener(mlistener9);
	mbutton10.addActionListener(mlistener10);
	
	//label to display all game name
	lblGamename = new JLabel("SKY COTL $15.99 ");
	lblGamename2 = new JLabel("GTAV $20 ");
	lblGamename3 = new JLabel("Amnesia $45.99 ");
	lblGamename4 = new JLabel("DBD $4.20 ");
	lblGamename5 = new JLabel("Mario Kart $200 ");
	lblGamename6 = new JLabel("Mortal Combat $13 ");
	lblGamename7 = new JLabel("Resident Evil Village $89");
	lblGamename8 = new JLabel("Silent Hill V $7.99");
	lblGamename9 = new JLabel("Fortnite $0.01");
	lblGamename10 = new JLabel("Legends Of Zelda $17");
	//label for available stock for each game
	lblStock = new JLabel("Stock Available: "+num[0]);
	lblStock2 = new JLabel("Stock Available: "+num[1]);
	lblStock3 = new JLabel("Stock Available: "+num[2]);
	lblStock4 = new JLabel("Stock Available: "+num[3]);
	lblStock5 = new JLabel("Stock Available: "+num[4]);
	lblStock6 = new JLabel("Stock Available: "+num[5]);
	lblStock7 = new JLabel("Stock Available: "+num[6]);
	lblStock8 = new JLabel("Stock Available: "+num[7]);
	lblStock9 = new JLabel("Stock Available: "+num[8]);
	lblStock10 = new JLabel("Stock Available: "+num[9]);
	//Discount display panel,label image,discount button
	disc=new JLabel ("DISCOUNT CODE");
	ImageIcon image=new ImageIcon("star.png");//adding image of discount
	discimg = new JLabel(image);//setting image as new label
	disctxt = new JTextField(7);//making sure only 7 digits is allowed to be inputted
	//calculate/display totalamount
	total = new JLabel("Total = "+totalamount);
	
	
	
	JPanel panel = new JPanel();//multiple panels for multiple games
	panel.setBackground(Color.pink);//setting colour to background using colour code must require a # and another set of round brackets 
	panel.add(lblGamename);//seting label of game name to panel
	panel.add(lblStock);//setting in stock quantity to panel
	panel.add(button);//adding the minus and add buttons to panels
	panel.add(mbutton);//this is order of game name,stock,buttons
	//creating panel 2
	JPanel panel2 = new JPanel();
	panel2.setBackground(Color.decode("#f00fcf"));
	panel2.add(lblGamename2);
	panel2.add(lblStock2);
	panel2.add(button2);
	panel2.add(mbutton2);
	//creating panel 3
	JPanel panel3 = new JPanel();
	panel3.setBackground(Color.decode("#c624db"));
	panel3.add(lblGamename3);
	panel3.add(lblStock3);
	panel3.add(button3);
	panel3.add(mbutton3);
	//creating panel 4
	JPanel panel4 = new JPanel();
	panel4.setBackground(Color.cyan);
	panel4.add(lblGamename4);
	panel4.add(lblStock4);
	panel4.add(button4);
	panel4.add(mbutton4);
	//creating panel 5
	JPanel panel5 = new JPanel();
	panel5.setBackground(Color.decode("#2297dd"));
	panel5.add(lblGamename5);
	panel5.add(lblStock5);
	panel5.add(button5);
	panel5.add(mbutton5);
	//creating panel 6
	JPanel panel6 = new JPanel();
	panel6.setBackground(Color.decode("#39e01f"));
	panel6.add(lblGamename6);
	panel6.add(lblStock6);
	panel6.add(button6);
	panel6.add(mbutton6);
	//creating panel 7
	JPanel panel7 = new JPanel();
	panel7.setBackground(Color.green);
	panel7.add(lblGamename7);
	panel7.add(lblStock7);
	panel7.add(button7);
	panel7.add(mbutton7);
	//creating panel 8
	JPanel panel8 = new JPanel();
	panel8.setBackground(Color.yellow);
	panel8.add(lblGamename8);
	panel8.add(lblStock8);
	panel8.add(button8);
	panel8.add(mbutton8);
	//creating panel 9
	JPanel panel9 = new JPanel();
	panel9.setBackground(Color.orange);
	panel9.add(lblGamename9);
	panel9.add(lblStock9);
	panel9.add(button9);
	panel9.add(mbutton9);
	//creating panel; 10
	JPanel panel10 = new JPanel();
	panel10.setBackground(Color.red);
	panel10.add(lblGamename10);
	panel10.add(lblStock10);
	panel10.add(button10);
	panel10.add(mbutton10);
	//creating panel 11
	JPanel panel11 = new JPanel();
	panel11.add(discimg);//adding the disc image in panel
	panel11.add(disc);//adding discount label
	panel11.add(disctxt);//Text area for code input
	panel11.add(discbutton);//apply button added
	//creating panel 12
	JPanel panel12 = new JPanel();
	panel12.add(total);//displaying total
	//changing add game button colour
	button.setBackground(Color.red);//colour that isnt a colour code doesnt require the hashtag and brackets
	button2.setBackground(Color.orange);
	button3.setBackground(Color.yellow);
	button4.setBackground(Color.green);
	button5.setBackground(Color.decode("#39e01f"));
	button6.setBackground(Color.decode("#2297dd"));
	button7.setBackground(Color.cyan);
	button8.setBackground(Color.decode("#c624db"));
	button9.setBackground(Color.decode("#f00fcf"));
	button10.setBackground(Color.pink);
	//changing remove game button colour
	mbutton.setBackground(Color.red);
	mbutton2.setBackground(Color.orange);
	mbutton3.setBackground(Color.yellow);
	mbutton4.setBackground(Color.green);
	mbutton5.setBackground(Color.decode("#39e01f"));
	mbutton6.setBackground(Color.decode("#2297dd"));
	mbutton7.setBackground(Color.cyan);
	mbutton8.setBackground(Color.decode("#c624db"));
	mbutton9.setBackground(Color.decode("#f00fcf"));
	mbutton10.setBackground(Color.pink);
	//panel added so it displays on screen
	add(panel);
	add(panel2);
	add(panel3);
	add(panel4);
	add(panel5);
	add(panel6);
	add(panel7);
	add(panel8);
	add(panel9);
	add(panel10);
	add(panel11);
	add(panel12);
	}
	
}	
