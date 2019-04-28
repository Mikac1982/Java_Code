package com.class28Again;

public abstract class Vehicle { //ABSTRACT class
    
	//int vehicleCount;      //we CAN HAVE instance variables
	static int vehicleCount; //static variable -value=0-available to all objects
	
	Vehicle(){ //we CAN have CONSTRUCTOR in ABSTRACT class
		vehicleCount++; //0+1=1 we counting object that are created
	}
	
    //public static abstract void gps();  can NOT have STATIC abstract methods -cannot override static
	//private abstract void speed();      can NOT have PRIVATE abstract methods - do not part of inheritance 
	//public abstract final void break(); can NOT have FINAL abstract methods - can not override

	public abstract void start(); //abstract method
	public abstract void drive(); //abstract method
	
	public void stop() {          //regular method
		System.out.println("Stop vehicle by pressing brak");
	}
	
	public static void displayToyotaVehicles() {  //we CAN HAVE regular static method
		System.out.println("Total vehicles we build="+vehicleCount);
	}
}
abstract class Car extends Vehicle{ //child ABSTRACT class
	// by default compiler will create a default constructor and
	// by default inside child constructor we call a parent child constructor (if we do not create own)
	// Car(){
	//   super();
	// }          
	           // (bmw)
	public String make; //instance variable allowed in the abstract class
	
	//we can not create an object of abstract class, so we need constructor to INITIALIZE INSTANCE variables 
	Car(String make){  
		this.make=make;
	}
	
	
}
//normal class-100% defined -->CONCRETE CLASS
class BMW extends Car{ 
	// by default compiler will create a default constructor and
	// by default inside child constructor we call a parent child constructor (if we do not create own)
	// BMW(){
	//   super(); -calls immediate parent class constructor ->Car
	// }
	
	BMW(String make){ //own constructor
		super(make);
	}
	
	@Override
	public void start() {
		System.out.println("BMW car starts remote");
	}

	@Override
	public void drive() {
		System.out.println("BMW car drives fast");
	}
}
class Toyota extends Car{ //CONCRETE CLASS
	
	Toyota(String make){
		super(make);
	}
	@Override
	public void start() {
		System.out.println("Toyota car starts with push button");	
	}
	@Override
	public void drive() {
		System.out.println("Toyota car drives safe");	
	}
	
}