package com.class18;

import java.util.Scanner;

public class LeapYear {
   public static void main(String[] args) {
	
	// Ask a user to input a leap year. 
	// Give the user 10 chances to enter a correct leap year.  
	// As soon as the user enters the correct leap year exit the loop.
	   
	// leap year is the year  devisible by 4--> leap year
	// if year is divisible by 100 --> NOT a leap year    // try at home!
	// if year is divisible by 4 --> a leap year   
	   
	Scanner scan;
	int year;
	
	scan=new Scanner(System.in);
	
	for (int i=1; i<=10; i++) {   // we know how many times we have to enter 
		
	System.out.println("Please enter a guessed leap year");
	year=scan.nextInt();
	
	if (year%4==0) {
		System.out.println("The year is a leap year!");
		break; 
		
	}else if (year%4!=0) {
		System.out.println("The year is NOT lep year!");
		
	}
	}   
}
}
