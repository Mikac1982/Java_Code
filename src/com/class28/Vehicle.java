package com.class28;

public abstract class Vehicle { //abstract class

	static int vehicleCount; //0 static 
	
    Vehicle(){
    	vehicleCount++; //0+1=1
    }
    
 // public abstract final void(); can NOT have abstract methods as FINAL (can not override)
 // private abstract static void speed(); can NOT have abstract methods as PRIVATE(do not participate in inheritance)
//	public static abstract void gps(); can NOT have STATIC abstract methods (can not override)
    
	public abstract void start();
	public abstract void drive();
	public void stop(){
		System.out.println("Stop vehicle by pressing break");
	}
	
	public static void displayTotalVehicles() {
		System.out.println("Total vehicle we build="+vehicleCount);
	}
	
}
abstract class Car extends Vehicle{ //if we do not want to provide implementation we make class ABSTRACT again!
	//  by default compiler will create a default constructor and
	// by default inside child constructor we call a parent child constructor (if we do not create own)
	//Car(){ 
	//super();
	//}
	
	public String make; //INSTANCE VARIABLES allowed in the abstract class
	//we can NOT create object of abstract class, but since we have an instance variables inside the class
	// we need someone to initialize them -> performed by CONSTRUCTOR
	
	Car(String make){ // when we have constructor we parameters we need to create/call constructor in a Child class
		this.make=make;
	}
	
	
}
class BMW extends Car{ //CONCRETE class
	// by default compiler will create a default constructor and
	// by default inside child constructor we call a parent child constructor (if we do not create own)
	//BMW(){ 
	//super(); -calls immediate parent class constructor ->car() constructor
	//}
	
	BMW(String make){ //we have to call constructor with 1 parameter
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
class Toyota extends Car{
	
	Toyota(String make){
		super(make);
	}
    @Override
	public void start() {
		System.out.println("Toyoota car starts with push button");
	}

	@Override
	public void drive() {
		System.out.println("Toyota car drives safe");
		
	}
	
}