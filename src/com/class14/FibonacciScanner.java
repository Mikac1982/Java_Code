package com.class14;

import java.util.Scanner;

public class FibonacciScanner {
  
	   //Create a method that will print whether given String is palindrome or not.
	   //Create a method that will check whether a given number is prime or not.
	   // Create a method to print first 10 numbers of Fibonacci series.
	   //   0,1,1,2,3,5,8,13,21,34
	
  public static void main(String[] args) {   
	  
	int a=0; 
	int b=1;
	int c;
	int num;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter first number in fibonacci series");
    num=scan.nextInt();
	
	System.out.print(a+" "+b);
	 
	for (int i=2; i<10; i++) {
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	}
	
	
}
}
