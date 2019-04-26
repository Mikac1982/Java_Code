package com.class28;

public class VehicleTest {

	public static void main(String[] args) {
		
		Car car1=new BMW("bmw");  //UpCasting
		car1.drive();
		car1.start();
		car1.stop();
		Vehicle.displayTotalVehicles();  //Total vehicle we build=1
		
		System.out.println(Vehicle.vehicleCount); //1
		
		new BMW("bmw");
		new Toyota("camry");
		
		System.out.println(Vehicle.vehicleCount); //3
		Vehicle.displayTotalVehicles(); //Total vehicle we build=3
		
		
		
	}
	
	
	
	
	
}
