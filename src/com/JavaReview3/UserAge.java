package com.JavaReview3;

import java.util.Scanner;

public class UserAge {
	public static void main(String[] args) {
 // //Write a program that allows a user to input age to find out if the user is either Too Young, Young Person, Middle Age Person, or  too Old
        // Age should NOT be greater than 18  print out  Too Young
        // Age should be between 18 AND 35 inclusive  print out Young Person
        // Age should be greater or equal to 36 OR less than or equal to 60 inclusive print out  You are Middle Age Person
        // If the age is greater than 60 print print out  You are too Old
        // Create an int variable named age
        // Must use a Scanner
		
		Scanner scan;
		int age;
		String output = null;

		scan = new Scanner(System.in);   // import the scanner class
		System.out.println("Please enter your age");
		age = scan.nextInt();

		if (!(age>18)) {
			output = "Too young";
		} else if (age >=18 && age <= 35) {
			output = "Young Person";
		} else if (age >=36 || age <= 60) {
			output = "You are Middle Age Person";
		} else if (age>60){
		    output = "You are Too Old";
		}
		System.out.println(output);
	
 } 
}
