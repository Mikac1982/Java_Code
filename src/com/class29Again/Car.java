package com.class29Again;

/* Create a Class Car that would have the following fields: 
   carPrice and color and method calculateSalePrice() which should be returning a price of the car.
   Create 2 sub classes: Sedan and Truck. 
   The Truck class has field as weight and has its own implementation of calculateSalePrice() method  
       in which returned price calculated as following:
       if weight>2000 then returned price should include 10%discount, otherwise 20%discount.
   The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): 
       if length of Sedan is >20 feet then returned car price should include 5%discount, otherwise 10%discount
*/

public abstract class Car {

	double carPrice;
	String color;
	double returnPrice;
	
	public abstract double calculateSalePrice();
}
class Truck extends Car{
    double weight;
    
    Truck(double carPrice, double weight){
    	super.carPrice=carPrice;
    	this.weight=weight;
    }
    
	public double calculateSalePrice() {
		if (weight>2000) {
			returnPrice=carPrice-(carPrice*10)/100;
		}else {
			returnPrice=carPrice-(carPrice*20)/100;
		}
		return returnPrice;
	}
}

class Sedan extends Car{
   double length;
	
   Sedan(double carPrice, double length){
	   super.carPrice=carPrice;
	   this.length=length;
   } 
   
   public double calculateSalePrice() {
		if (length>20) {
			returnPrice=carPrice-(carPrice*5)/100;
		}else {
			returnPrice=carPrice-(carPrice*10)/100;
		}
		return returnPrice;
	}
}