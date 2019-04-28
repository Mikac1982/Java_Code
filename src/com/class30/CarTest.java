package com.class30;

public class CarTest {

	public static void main(String[] args) {
		
		Car car;
		
		car=new Truck("blue", 25000, 3000);
		double carPrice=car.calculatePrice();
		System.out.println(carPrice);
		
		car=new Sedan("blue", 25000, 3000);
		double carPrice2=car.calculatePrice();
		System.out.println(carPrice2);
		
	}
	
	
	
	
	
}
