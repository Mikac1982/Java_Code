package com.class08;

import java.util.Scanner;

public class ForAndScanner {
	public static void main(String[] args) {

		// prompt user to enter 2 integers 5 times and compare them
		// at the end print larger

	Scanner scan;
	int num1, num2;
	int largest=0;

	scan = new Scanner(System.in);
		
	for (int i=1; i<=5; i++) {   // to enter 5 times
		
		System.out.println("Please enter two numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		   if (num1 > num2) {
			   largest = num1;
		   } else if (num2 > num1) {
			   largest = num2;
		   } else {
			   System.out.println(num1 + " is equal to " + num2);
		   }
        System.out.println(largest+" is the largest");
   
		}
	}
}
