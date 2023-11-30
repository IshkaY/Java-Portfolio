//name:Ishka Yao
//creation date:05/12/2022
//Class Files=Wordleviewer
//Abstraction=Using JFrame GUI doesn't allow user to see how code words non access modifier
//Encapsulation=WordleViewer is a child of all the super classes
//Inheritance=WordleFrame extends Jframe it inherits all attributes/behaviours from Jframe
//Aggregation=Actionlistener wouldnt exit without the wordleframe parent
//Composition=WordleFrame'Is A' Jframe but it 'has a' word checker class
//Abstract Classes=BackgroundChanger abstract class
//Interfaces=Actionlistener is my inetrface
//Polymorphism=Default constructor & parameterized constructor has same name but different behaviours
//Arrays= ans array for letters 
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Scanner;
public class WordleViewer {
    public static void main(String[]args) {
     Scanner scan = new Scanner(System.in);//System checks keyboard input
        System.out.println("Please Enter 1 to play game, 2 to view rules and 3 to exit");
        int ans= scan.nextInt();//checks keyboard for num input
        if(ans==1){
            JFrame frame = new WordleFrame();
            frame.setTitle("Wordle Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
        else if (ans==2) {
            System.out.println("-Wordle is a word guessing game.");
			System.out.println("-----------------------------------------------------------------------");
            System.out.println("-If a letter is apart of the word and in right place it turns green.");
			System.out.println("-----------------------------------------------------------------------");
            System.out.println("-If a letter is not apart of the word it turns red.");
			System.out.println("-----------------------------------------------------------------------");
            System.out.println("-When you guessed the word all the letters should be green.");
			System.out.println("-----------------------------------------------------------------------");
        }
        else{
            System.out.println("Exiting Game..");
        }

    }
}
