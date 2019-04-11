package com.class11;

public class Task1 {
   public static void main(String[] args) {
	
	// Create an array of cars and store 6 elements into it.
	// Using 2 different loops print all values from the array.   
	   
	String[] cars= {"BMW","Toyota","Nisan","Audi","Mercedes","Volvo"};
	
	 for (int i=0; i<cars.length; i++) {
		 System.out.print(cars[i]+" ");
	 }
	  System.out.println(); 
	  
	 for(String type:cars)  {
		 System.out.print(type+" ");
	 }
}
}
