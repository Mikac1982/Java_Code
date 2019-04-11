package com.class3;

public class RelationalOperators {
	
	public static void main (String [] args) {
		
		int a=196;
		int b=196;
		
		boolean result= a>b;
		boolean result1= a==b;  // == is equal to;
		
		System.out.println(result);
		System.out.println(result1);
		
		//compare 2 numbers and if a is larger than b -->print
		
		if (a!=b) {    // we are checking condition!
			System.out.println("Hello");
			
		}  else {    //otherwise -->else (when first condition is false)
			System.out.println("Bye");
		}    
		
		//declare price and if price is higher than expected price -->I will not buy shoes
		
		double shoesPrice=39.99;
		double allowedPrice=31.99;
		
		   // decision making just when we have if(){ and }else{
		
		if(shoesPrice<=allowedPrice) {
			 System.out.println("I am buying those shoes");
			
		}else {
		     System.out.println("I am NOT buying those shoes");
		}
		
		    System.out.println("I am conitnues code");
	        System.out.println("I am conitnues code");
	}

}
