package com.class4;

import java.util.Scanner;

public class CityAndTemperature2 {
	public static void main(String[] args) {
		
		// ask user to enter city and temperature in Fahrenheit
		// your program should convert F -->C
		// your program should say "The temperature in city __ is__."
		
	// declaring the variables
    String cityName;
    int temp;
    
    // bringing the scanner class
    Scanner scanner=new Scanner(System.in);
    System.out.println("Please enter your city");
    
    cityName=scanner.nextLine(); //to capture the value 
    
    System.out.println("Please enter temperature in Fahrenheit");
    
    temp=scanner.nextInt();
    
    // System.out.println(cityName);
    // System.out.println(temp);
		
	// convert F to C; 
    // formula (F-32)*5/9
    
    int convertedTemp=(temp-32)*5/9;
    // System.out.println(convertedTemp);
    
	System.out.println("The temperature in the city "+cityName+" is "+convertedTemp+"C");
	
		
		
	}

}
