package com.class35Again;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	// How would you handle InputMismatchException?
	// Input Mismatch Exception occur when user enters mismatch value then programmer expected
	
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter a number");			
	
	try {
	    int num=scan.nextInt();	
	    System.out.println(num);
	}catch(InputMismatchException e) {
		System.out.println("Please enter right data type");
	}	
		
		
		
		
		
		
	}
}
