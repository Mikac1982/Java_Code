package com.class11;

import java.util.Scanner;

public class Task2 {
   public static void main(String[] args) {
	
	// Create an array of countries. 
	// While retrieving all values from an array print capital for each country. (use 2 different loops).   
	   
	String[] country={"Serbia","USA","Italy","Spain"};
	
	System.out.println("--------For Loop------"); 
	
	for (int i=0; i<country.length; i++) {
		
		if (country[i].equals("Serbia")) {
			System.out.println("Belgrade");
		
		}else if (country[i].equals("USA")) {
			System.out.println("Washington DC");
	
		}else if (country[i].equals("Italy"))  {
			System.out.println("Rim");
		
		}else if (country[i].equals("Spain")) {
			System.out.println("Madrid");
		}
	}
	System.out.println("--------Each Loop--------");
	
	String[] contries={"Serbia","USA","Italy","Spain"};
	
	for(String country1 :contries) { //1.countries=Serbia 2.countries=USA 3.
		
		switch(country1) {    // looks for equal (look true each element and then stop)
		case "Serbia":
			System.out.println("Belgrade");
			break;
		case "USA":
			System.out.println("Washington DC");
			break;
		case "Italy":
			System.out.println("Rim");
			break;
		case "Spain":
			System.out.println("Madrid");
			break;

		}
	}
	
}
}
