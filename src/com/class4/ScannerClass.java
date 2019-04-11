package com.class4;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// take an number from a user and print that numberrgtt5

		Scanner scanner = new Scanner(System.in);
		// we are trying to take input(from user) to the system; keyboardinput
		
		System.out.println("Please enter any number");
		// telling the users what to do
		
		int myNumber = scanner.nextInt();
		//how to read the value
		
		System.out.println("The number you entered is " + myNumber);
		

	}

}
