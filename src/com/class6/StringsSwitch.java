package com.class6;

import java.util.Scanner;

public class StringsSwitch {
	public static void main(String[] args) {
		/* Prompt user to enter their country
		 * based on the country --> specify favorite food 
		 */
	
//	int a=18;          our case has to be in int format    --> 18
//	char b='c';        our case has to be in chart format  --> 'b'        
//	String c="Hello";  our case has to be in String format --> "c"
	
	Scanner scan;
	String country;
	String favoriteFood;
		
    scan=new Scanner(System.in);
    System.out.println("Please enter which country you are from");
    country=scan.nextLine();
    
    switch (country) {       // in switch we use value that we are matching, comparing-->country
    
    case "USA":
    	favoriteFood="Burger";
    	break;
    case "Afganistan":
    	favoriteFood="Palau";
    	break;
    case "Russia":
    	favoriteFood="Pelmeni";
    	break;
    case "Italy":
        favoriteFood="Pasta";
        break;
    case "Turkey":
    	favoriteFood="Baklava";
    	break;
    case "Marocco":
    	favoriteFood="Couscous";
    	break;
    case "Kazahstan":
    	favoriteFood="Beshparmak";
    	break;
    case "Pakistan":
    	favoriteFood="Biryani";
    	break;
    default:
    	favoriteFood="Unknown";
    		
      }
		
System.out.println("My favorite food is "+favoriteFood);	
		
		
		
	}

}
