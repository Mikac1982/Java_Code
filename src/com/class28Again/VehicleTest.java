package com.class28Again;

public class VehicleTest {

	public static void main(String[] args) {
		
		Car car1=new BMW("bmw");
		car1.start();
		car1.drive();
		car1.stop();
		Vehicle.displayToyotaVehicles(); //1
		
	//	System.out.println(car1.vehicleCount); //1 (1 object created)
		
		new BMW("bmw");
		new Toyota("camry");
		
		Vehicle.displayToyotaVehicles(); //3
		
	 // Car car3=new Toyota(); for instance variable 
		
	//	System.out.println(Vehicle.vehicleCount); //3 (3 objects created)
	//	System.out.println(car3.vehicleCount);  //1
	
		
	}
	
	
	
	
	
}
