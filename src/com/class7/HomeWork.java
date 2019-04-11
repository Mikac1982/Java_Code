package com.class7;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {

		// Ask user to pay for a soda
		// keep asking user to pay for soda until entered price is not equal to 1.99
		// after user got a right amount print "Please enjoy your soda"

		Scanner scan;
		double price;

		scan = new Scanner(System.in);

		do {
			System.out.println("Please pay for soda");
			price = scan.nextDouble();  //capturing
         
	//		System.out.println("I am inside while loop");
			
		} while (price != 1.99);
	//	System.out.println("I am outside of loop");
		System.out.println("Please enjoy your soda");

	}
}
