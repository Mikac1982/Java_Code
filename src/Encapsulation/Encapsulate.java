package Encapsulation;

public class Encapsulate {

	
	private String myName; //private variable declared
	private int myRoll;
	private int myAge;
	
	//public GET methods to access private variables:
	public String getName() {
		return myName;
	}
	public int getRoll() {
		return myRoll;
	}
	
	public int getAge() {
		return myAge;
	}
	
	//public SET methods to set the values of the variables:
	public void setName(String newName) {
		myName=newName;
	}
	public void setRoll(int newRoll) {
		myRoll=newRoll;
	}
	
	public void setAge(int newAge) {
		myAge=newAge;
	}
	
	
	
	
	
	
	
	
}
