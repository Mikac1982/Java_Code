package com.GroupTasks;

public class Car {
  /*Create a Class Car that would have the following fields: 
    regularPrice and color and method calculateSalePrice() which should be returning a price of the car.
	Create 2 sub classes: Sedan and Truck.
	The Truck class has field as weight and has its own implementation of  calculateSalePrice() method 
    in which returned price calculated as following: 
	if weight>2000 then returned price should include 10%discount, otherwise 20%discount.
	The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): 
	if length of sedan is >20 feet then returned price should include 5%discount, otherwise 10%discount
	*/
	
	double regularPrice;
	String color;
	
	public double calculateSalePrice() {
		return regularPrice;
	}
}
class Sedan extends Car{
	double length;
	
	Sedan(double length, double regularPrice){
		this.length=length;
		super.regularPrice=regularPrice;
	}
	
	
	public double calculateSalePrice() {
		double newPrice;
		if (length>20) {
			newPrice=regularPrice-(regularPrice*5)/100;
		}else {
			newPrice=regularPrice-(regularPrice*10)/100;
		}
		return newPrice;	
	}
}
class Truck extends Car{
	double weight;

	Truck(double weight, double regularPrice){
		this.weight=weight;
		super.regularPrice=regularPrice;
	}
	
	
	public double calculateSalePrice() {
		double newPrice;
		if (weight>2000) {
			newPrice=regularPrice-(regularPrice*10)/100;
		}else {
			newPrice=regularPrice-(regularPrice*20)/100;
		}
		return newPrice;	
	}
}










