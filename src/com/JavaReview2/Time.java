package com.JavaReview2;

import java.util.Scanner;

public class Time {
	public static void main(String[] args) {

		// Write a program to find if the variable time is either morning or the
		// afternoon
		// or the evening using military time;
		// Print out "Good morning." or "Good afternoon." or "Good evening."
		// Must use if then a else if and lastly else

		// less than 0700->morning //1205 //1800

//		
//		int time = 1300;
//		if (time < 0700) {
//			System.out.println("Good morning.");
//		} else if (time > 1800) {
//			System.out.println("Good evening.");
//		} else {
//			System.out.println("Good day.");
//		}
		int time;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter time in the military system");
		time = input.nextInt();
		if (time < 0700) {
			System.out.println("Good morning.");

		} else if (time > 1800) {
			System.out.println("Good evening.");

		} else {
			System.out.println("Good day.");
		}

	}

}
