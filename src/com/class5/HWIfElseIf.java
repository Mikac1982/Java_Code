package com.class5;

import java.util.Scanner;

public class HWIfElseIf {
	public static void main(String[] args) {
		/*
		 * Write a program to find largest of 3 double values using if-else..if provided
		 * by a user Numbers must be distinct!
		 */

		double num1, num2, num3;
	
		Scanner scann = new Scanner(System.in);
		 System.out.println("Please enter 3 distinct double values");
		 num1=scann.nextDouble();
		 num2=scann.nextDouble();                                    // we can do it this way as well!
		 num3=scann.nextDouble();
		
		// System.out.println("please enter num1");
		// num1 = scann.nextDouble();
		// System.out.println("Please enter num2");
		// num2 = scann.nextDouble();
		// System.out.println("Pease enter num3");
		// num3 = scann.nextDouble();

		if (num1 > num2 && num1 > num3) {
			System.out.println("The largest number is num1: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("The largest number is num2: " + num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("The largest number is num3: " + num3);

		}

	}

}
