//Name:Ishka Yao
//Craetion date:08/11/22
public class Bicycle {
        
    // the Bicycle class has three fields-int variables
    public int cadence;
    public int gear;
    public int speed;
	// the Bicycle class has one parameterized constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
     // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
	//Polymorphism can be demonstrated with a minor modification to the Bicycle class. For example, a printDescription method could be added to the class that displays all the data currently stored in an instance.
	public void printDescription(){
    System.out.println("\nBike is " + "in gear " + this.gear
        + " with a cadence of " + this.cadence +
        " and travelling at a speed of " + this.speed + ". ");
}
	//get methods
	public int getCadence(){
	return cadence;
	}
	public int getGear(){
	return gear;
	}
	public int getSpeed(){
	return speed;
	}
	
    public String toString()
{
	String output;
	output=super.toString()+"The cadence: "+ cadence + " The gear:  " + gear + " The speed: "+ speed;	
	return output;
}	    
}   
