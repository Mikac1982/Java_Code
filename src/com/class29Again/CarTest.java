package com.class29Again;

public class CarTest {

	public static void main(String[] args) {
		
		Car car1=new Truck(30000,3000);
		System.out.println("Price of a truck is: "+ car1.calculateSalePrice());
		
		Car car2=new Sedan(50000, 12);
		System.out.println("Price of a sedan is: "+car2.calculateSalePrice());
	}
	
	
	
	
	
	
	
	
	
}
