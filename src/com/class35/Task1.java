package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    // How would you handle InputMismatchException?
	// Input Mismatch Exception occur when user enters mismatch value then programmer expected
	
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your age");	
	
	try {
	   int age=scan.nextInt();
	   System.out.println(age);
	}catch(InputMismatchException e)  {
		System.out.println("Sorry, you enterd wrong data type");
	} 
	
	}
}