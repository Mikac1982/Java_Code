package com.class4;

import java.util.Scanner;

public class CityAndTemperature {

	// ask user to enter city and temperature in Fahrenheit
	// your program should convert F -->C
	// your program should say "The temperature in city __ is__."

	public static void main(String[] args) {

		// Task 1 enter city and temp; declairing the variable;
		String cityName;
		int temp;

		// bringing the scanner class
		Scanner myScanner = new Scanner(System.in); // telling the message to the user
		System.out.println("Please enter your city.");

		cityName = myScanner.nextLine();

		System.out.println("Please enter temperature in Fahrenheit");
		temp = myScanner.nextInt();

		// Task 2 convert F-->C;
		// formula (F-32)* 5/9:

		int convertedTemp = (temp - 32) * 5 / 9;
		System.out.println(convertedTemp);

		// Task 3
		System.out.println("The temperature in the city " + cityName + " is " + convertedTemp + "C");

	}

}
