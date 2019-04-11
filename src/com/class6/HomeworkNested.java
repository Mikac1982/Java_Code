package com.class6;

import java.util.Scanner;

public class HomeworkNested {
	public static void main(String[] args) {
		// Write a program to find largest of 3 double values using Nested if provided
		// by a user
		// Numbers must be distinct!

		double num1, num2, num3, largest;    //we are declaring one more variable, largest!

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();

		if (num1 > num2) {
			     if (num1 > num3) {
				    largest=num1;         //the other way of doing it (we are trying to perform some operations!
			     }else {                                             // instead of printing!)
				    largest=num3;                                    // easier and cleaner way
			  }
		} else { // we are assuming num2>num1
			     if (num2 > num3) {
			 	     largest=num2;
			     }else {
				    largest=num3;
			}  
		}
		
        System.out.println("The largest number is "+largest);
	}

}
