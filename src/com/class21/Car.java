package com.class21;

public class Car {

	public String color;          //null
	public static int totalCars;  //0+1=1+1=2  //we have ONLY ONE COPY
	
	
	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.color="white";
	//	car1.totalCars++;  //do not access it like this true object
		totalCars++;   // this way
		
		Car car2=new Car();
		car2.color="black";
		Car.totalCars++;  //or this way by class name (Car.)   //we incrementing by 1
		
		System.out.println("Total car we made is "+totalCars); //total number of objects we created 
	}
	
	
	
	
	
	
}
