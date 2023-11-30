//name:Ishka Yao
//creation date:10/12/2022
public abstract class BackgroundChanger {//abstract class to change background colours
	int maxcolour = 6;//max colour is 6
	int colour;//colour is an int 
	
public BackgroundChanger()//default constructor
{
	colour = 0;//setting colour int to 0
}
public int getcolour()//get method to return colour
{
	return colour;
}
public void setColour(int colour) // set method sets colour value
{
	this.colour = colour;
}
}