//name:Ishka Yao
//creation date:06/12/2022
public class WordChecker
{
 //Instance Variables
 private String correctCharacter;
 private String enteredCharacter;

 private boolean charactersEqual;

 //Parameterized Constructor
 public WordChecker(String correctCharacter){//takes in string correctCharacter
  this.correctCharacter = correctCharacter.toLowerCase();//Saving inputted variable
 }


 public void setEnteredCharacter(String enteredCharacter){ //Set method
  this.enteredCharacter = enteredCharacter.toLowerCase();//Saving lower case inputted variable
 }


 public boolean checkCharacters(){ //Check method
   //Checking if correct character equals the entered character
   if(correctCharacter.equals(enteredCharacter))
   {
       charactersEqual = true;
   }
   else
   {
       charactersEqual = false;
   }
   return charactersEqual;//Returning result
 }
}
