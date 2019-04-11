package com.class4;

import java.util.Scanner;

public class ScannerClass12 {
	public static void main(String[] args) {
		
		//take a number from the user and print that number;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your favorite number");
		
		int myNumber=scanner.nextInt();
		System.out.println("Number you entered is "+myNumber+".");
		
		// ask user for the name and print Good morning__.
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String name=input.nextLine();
		System.out.println("Good morning "+name+".");
	}

}
