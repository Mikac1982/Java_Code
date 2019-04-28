package com.GroupTasks;

public class CarTest {

	public static void main(String[] args) {
		
	Car obj=new Sedan(22.5, 500);
	System.out.println(obj.calculateSalePrice());
	
	
	Car obj2=new Truck(1000, 60000);
	System.out.println(obj2.calculateSalePrice());	
		
		
	}
	
	
	
	
	
	
	
	
}
