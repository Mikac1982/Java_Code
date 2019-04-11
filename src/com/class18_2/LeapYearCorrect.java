package com.class18_2;

import java.util.Scanner;

public class LeapYearCorrect {
   public static void main(String[] args) {
	
	// Ask a user to input a leap year. 
	// Give the user 10 chances to enter a correct leap year.  
	// As soon as the user enters the correct leap year exit the loop.
		   
	// leap year is the year  divisible by 400--> leap year
	// if year is divisible by 100 --> NOT a leap year    // try at home!
	// if year is divisible by 4 --> a leap year   
	// (year%400==0) || ((year%4==0)&&(year%100!=0) --> same thing	
	   
		Scanner scan;
		int year;
		
		scan=new Scanner(System.in);
		
		for (int i=1; i<=10; i++) {   // we know how many times we have to enter, number of iteration is known! 
			
		System.out.println("Please enter a guessed leap year");
		year=scan.nextInt();

		if (year%400==0) {
			System.out.println("Year is a leap year"); 
			break;                                        //as soon as it matching we exit the loop
		}else if (year%4==0 && year%100!=0) {
			System.out.println("Year is a leap year");
			break;
		}else {
			System.out.println("Year is not a leap year"); //if is not matching we keep asking
		}
		}	
}
}
