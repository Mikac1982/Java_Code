package com.class5;

import java.util.Scanner;

public class HomeworkElseIf {
public static void main(String[] args) {
	// Write a program to find largest of 3 double values using if-else..if 
	//  provided by a user (numbers must be distinct!)
	
	Scanner scan;
	double num1,num2,num3;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter first number");
	num1=scan.nextDouble();
	System.out.println("Please enter second number");
	num2=scan.nextDouble();
	System.out.println("Please enter tird number");
	num3=scan.nextDouble();
	
	if (num1>num2 && num1>num3) {
		System.out.println(num1+" is the largest number");
	}else if (num2>num1 && num2>num3) {
		System.out.println(num2+" is the largest number");
	}else if (num3>num1 && num3>num2) {
		System.out.println(num3+" is the largest number");
	}
	
	
	//int can go in double because double is bigger variable
	
}
}
