//name:Ishka Yao
//creation date:3/11/2022
//game analytic turn greens if correct turns red if incorrect
import javax.swing.JFrame;//importing packages 
import java.awt.*;
import java.awt.font.*;//font package
import javax.swing.JButton;//import a button library
import javax.swing.JLabel;//import a label library
import javax.swing.JPanel;//import a panellibrary
import javax.swing.JTextField;//add a field to write text in
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//click listener allows button to be clicked which triggers the action listener to perform the algorithim you tell them to do e.g click button
public class WordleFrame extends JFrame
{
  private JButton button1;//creating variables
  private JButton button2;//submit buttons created
  private JButton button3;
  private JButton button4;
  private JButton button5;
  private JButton button6;
  private JLabel letter1;//creating JLabels for each letter
  private JLabel letter2;
  private JLabel letter3;
  private JLabel letter4;
  private JLabel letter5;
  private JLabel letter6;
  private JTextField insert1;//Creating text field to enter guesses
  private JTextField insert2;
  private JTextField insert3;
  private JTextField insert4;
  private JTextField insert5;
  private JTextField insert6;

  private JPanel panelTitle;//creating a title section on screen
  private JPanel panelLetterRow;//panel holding all the letters will display ? if nothing is guessed/entered
  private JPanel panelEnterLetters;//panel holding textfields for guessing letters
  private JPanel panelSubmitButtons;//panel holding all the submit buttons

  private String ans[]={"c","h","a","s","e","r"};//array for word checker checks string

  WordChecker character1 = new WordChecker(ans[0]);//Creating 6 objects to check players input
  WordChecker character2 = new WordChecker(ans[1]);//For each object i passed in its corresponding location in the ans array e.g 0=C
  WordChecker character3 = new WordChecker(ans[2]);
  WordChecker character4 = new WordChecker(ans[3]);
  WordChecker character5 = new WordChecker(ans[4]);
  WordChecker character6 = new WordChecker(ans[5]);

  changebackground bg =new changebackground();//creates object changebackground
  private static final int FRAME_WIDTH = 1000;//frame size
  private static final int FRAME_HEIGHT = 1000;
  final int FIELD_WIDTH = 10;//textfield size


  //Creating default constructor
  public WordleFrame()
  {
    createComponents();//calls create components method
    setLayout(new GridLayout(4,1));//4 rows 1 column 
    setSize(FRAME_WIDTH,FRAME_HEIGHT);//setting frame size
  }


  private void createComponents()
  {
    button1 = new JButton("Submit");//intializing button1
    button2 = new JButton("Submit");//intializing button2
    button3 = new JButton("Submit");//intializing button3
    button4 = new JButton("Submit");//intializing button4
    button5 = new JButton("Submit");//intializing button5
    button6 = new JButton("Submit");//intializing button6
    letter1 = new JLabel("?");//intializing letter1
    letter2 = new JLabel("?");//intializing letter2
    letter3 = new JLabel("?");//intializing letter3
    letter4 = new JLabel("?");//intializing letter4
    letter5 = new JLabel("?");//intializing letter5
    letter6 = new JLabel("?");//intializing letter6
    Font labelFont = letter1.getFont();//Getting a font from Jlabel letter1 and Creating font object
    letter1.setFont(new Font("Serif", Font.PLAIN, 48));//Setting font to serif and size to 48 
    letter2.setFont(new Font("Serif", Font.PLAIN, 48));
    letter3.setFont(new Font("Serif", Font.PLAIN, 48));
    letter4.setFont(new Font("Serif", Font.PLAIN, 48));
    letter5.setFont(new Font("Serif", Font.PLAIN, 48));
    letter6.setFont(new Font("Serif", Font.PLAIN, 48));

    insert1 = new JTextField(FIELD_WIDTH);//intializing text field of size 10
    insert2 = new JTextField(FIELD_WIDTH);
    insert3 = new JTextField(FIELD_WIDTH);
    insert4 = new JTextField(FIELD_WIDTH);
    insert5 = new JTextField(FIELD_WIDTH);
    insert6 = new JTextField(FIELD_WIDTH);
    insert1.setText("Enter 1 Letter");//Setting text of text field
    insert2.setText("Enter 1 Letter");
    insert3.setText("Enter 1 Letter");
    insert4.setText("Enter 1 Letter");
    insert5.setText("Enter 1 Letter");
    insert6.setText("Enter 1 Letter");




    //Creating action listners
    ActionListener listener1 = new submitListener1();//Creating new action listeners for each button
    ActionListener listener2 = new submitListener2();
    ActionListener listener3 = new submitListener3();
    ActionListener listener4 = new submitListener4();
    ActionListener listener5 = new submitListener5();
    ActionListener listener6 = new submitListener6();

    button1.addActionListener(listener1);//Adding action listener to button1
    button2.addActionListener(listener2);//Adding action listener to button2
    button3.addActionListener(listener3);//Adding action listener to button3
    button4.addActionListener(listener4);//Adding action listener to button4
    button5.addActionListener(listener5);//Adding action listener to button5
    button6.addActionListener(listener6);//Adding action listener to button6


    //Setting colour of buttons to rainbow
    button1.setBackground(Color.red);
    button2.setBackground(Color.orange);
    button3.setBackground(Color.yellow);
    button4.setBackground(Color.green);
    button5.setBackground(Color.blue);
    button6.setBackground(Color.decode("#4B0082"));//indigo

    //Setting the colour of text fields to rainbow
    insert1.setBackground(Color.red);
    insert2.setBackground(Color.orange);
    insert3.setBackground(Color.yellow);
    insert4.setBackground(Color.green);
    insert5.setBackground(Color.blue);
    insert6.setBackground(Color.decode("#4B0082"));//indigo

    //Adding components to panels
    panelTitle = new JPanel();//each component is a new panel
    panelLetterRow = new JPanel();
    panelEnterLetters = new JPanel();
    panelSubmitButtons = new JPanel();

    panelLetterRow.add(letter1);//Adding letters "?" to each panel
    panelLetterRow.add(letter2);
    panelLetterRow.add(letter3);
    panelLetterRow.add(letter4);
    panelLetterRow.add(letter5);
    panelLetterRow.add(letter6);

    panelEnterLetters.add(insert1);//Adding text fields to panel
    panelEnterLetters.add(insert2);
    panelEnterLetters.add(insert3);
    panelEnterLetters.add(insert4);
    panelEnterLetters.add(insert5);
    panelEnterLetters.add(insert6);

    panelSubmitButtons.add(button1);//Adding submit buttons to panel
    panelSubmitButtons.add(button2);
    panelSubmitButtons.add(button3);
    panelSubmitButtons.add(button4);
    panelSubmitButtons.add(button5);
    panelSubmitButtons.add(button6);

    add(panelTitle);//adding title panel to JFrame
    add(panelLetterRow);//adding letter ? panel to JFrame
    add(panelEnterLetters);//adding user input panel to JFrame
    add(panelSubmitButtons);//adding submit button panels to JFrame

  }


  class submitListener1 implements ActionListener//adds actionlistener to corresponding button and if the button is pressed action event is triggered
  {
    public void actionPerformed(ActionEvent event)
    {//action event start
      //Creating new variables to store data
      String enteredCharacter;
      boolean charactersEqual;
      bg.checkcolour();//calls checkcolour method from object bg
      enteredCharacter = insert1.getText();//Getting text in text field
      character1.setEnteredCharacter(enteredCharacter);//Setting objects variable to the entered variable
      charactersEqual = character1.checkCharacters();//Checking if the strings equal using object

      //Checking if the string do equal
      if(charactersEqual==true)
      {
        letter1.setText(enteredCharacter);//Setting text of displayed letter to entered letter instead of ? sign
        panelTitle.setBackground(Color.green);//Setting top of the screen to green to congratulate player
      }
      else
      {
        panelTitle.setBackground(Color.red);//Setting top of the screen to red to punish player
      }

    }
  }//action event ends
  class submitListener2 implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      //Creating new variables to store data
      String enteredCharacter;
      boolean charactersEqual;
      bg.checkcolour();//calls checkcolour method from object bg
      enteredCharacter = insert2.getText();//Getting text in text field
      character2.setEnteredCharacter(enteredCharacter);//Setting objects variable to the entered variable
      charactersEqual = character2.checkCharacters();//Checking if the strings equal using object

      //Checking if the string do equal
      if(charactersEqual==true)
      {
        letter2.setText(enteredCharacter);//Setting text of displayed letter to entered letter instead of ? sign
        panelTitle.setBackground(Color.green);//Setting top of the screen to green to congratulate player
      }
      else
      {
        panelTitle.setBackground(Color.red);//Setting top of the screen to red to punish player
      }

    }
  }
  class submitListener3 implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      //Creating new variables to store data
      String enteredCharacter;
      boolean charactersEqual;
      bg.checkcolour();//calls checkcolour method from object bg
      enteredCharacter = insert3.getText();//Getting text in text field
      character3.setEnteredCharacter(enteredCharacter);;//Setting objects variable to the entered variable
      charactersEqual = character3.checkCharacters();//Checking if the strings equal using object

      //Checking if the string do equal
      if(charactersEqual==true)
      {
        letter3.setText(enteredCharacter);//Setting text of displayed letter to entered letter instead of ? sign
        panelTitle.setBackground(Color.green);//Setting top of the screen to green to congratulate player
      }
      else
      {
        panelTitle.setBackground(Color.red);//Setting top of the screen to red to punish player
      }

    }
  }
  class submitListener4 implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      //Creating new variables to store data
      String enteredCharacter;
      boolean charactersEqual;
      bg.checkcolour();//calls checkcolour method from object bg
      enteredCharacter = insert4.getText();//Getting text in text field
      character4.setEnteredCharacter(enteredCharacter);//Setting objects variable to the entered variable
      charactersEqual = character4.checkCharacters();//Checking if the strings equal using object

      //Checking if the string do equal
      if(charactersEqual==true)
      {
        letter4.setText(enteredCharacter);//Setting text of displayed letter to entered letter instead of ? sign
        panelTitle.setBackground(Color.green);//Setting top of the screen to green to congratulate player
      }
      else
      {
        panelTitle.setBackground(Color.red);//Setting top of the screen to red to punish player
      }

    }
  }
  class submitListener5 implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      //Creating new variables to store data
      String enteredCharacter;
      boolean charactersEqual;
      bg.checkcolour();//calls checkcolour method from object bg
      enteredCharacter = insert5.getText();//Getting text in text field
      character5.setEnteredCharacter(enteredCharacter);//Setting objects variable to the entered variable
      charactersEqual = character5.checkCharacters();//Checking if the strings equal using object

      //Checking if the string do equal
      if(charactersEqual==true)
      {
        letter5.setText(enteredCharacter);//Setting text of displayed letter to entered letter instead of ? sign
        panelTitle.setBackground(Color.green);//Setting top of the screen to green to congratulate player
      }
      else
      {
        panelTitle.setBackground(Color.red);//Setting top of the screen to red to punish player
      }

    }
  }
  class submitListener6 implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      //Creating new variables to store data
      String enteredCharacter;
      boolean charactersEqual;


      bg.checkcolour();//calls checkcolour method from object bg

      enteredCharacter = insert6.getText();//Getting text in text field
      character6.setEnteredCharacter(enteredCharacter);//Setting objects variable to the entered variable
      charactersEqual = character6.checkCharacters();//Checking if the strings equal using object

      //Checking if the string do equal
      if(charactersEqual==true)
      {
        letter6.setText(enteredCharacter);//Setting text of displayed letter to entered letter instead of ? sign
        panelTitle.setBackground(Color.green);//Setting top of the screen to green to congratulate player
      }
      else
      {
        panelTitle.setBackground(Color.red);//Setting top of the screen to red to punish player
      }

    }

  }
  class changebackground extends BackgroundChanger//inner class extending background changer
  {
    public changebackground()
    {

    }
    public void checkcolour(){//method checkcolour sets background colour
      setColour(getcolour()+1);//increments colour 
      if(getcolour()==1){
        panelSubmitButtons.setBackground(Color.red);
      }
      else if(getcolour()==2){
        panelSubmitButtons.setBackground(Color.orange);
      }
      else if(getcolour()==3){
        panelSubmitButtons.setBackground(Color.yellow);
      }
      else if(getcolour()==4){
        panelSubmitButtons.setBackground(Color.green);
      }
      else if(getcolour()==5){
        panelSubmitButtons.setBackground(Color.blue);
      }
      else if(getcolour()==6){
        panelSubmitButtons.setBackground(Color.decode("#4B0082"));
      }
      else{
        setColour(1);
      }
    }
  }
}