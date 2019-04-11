package com.class6;

import java.util.Scanner;

public class StringsSwitchAgain {
  public static void main(String[] args) {
	  // Prompt user to enter their country
	  // Based on the country --> specify favorite food 
	  
	Scanner scan;
	String country, favFood;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter which country you are from");
	country=scan.nextLine();
	
	switch (country) {
	
	case "USA":
		favFood="Burger";
		break;
	case "Serbia":
		favFood="Cevapi";
		break;
	case "Russia":
		favFood="Dumplings";
		break;
	case "Turkey":
		favFood="Baklava";
		break;
	case "Italy":
		favFood="Pasta";
		break;
	case "Morocco":
		favFood="Couscous";
		break;
	case "Pakistan":
		favFood="Biryani";
		break;
	default:
		favFood="Unknown";
	}		
	
	System.out.println("My favorite food is "+favFood);
	
	  
}
}
