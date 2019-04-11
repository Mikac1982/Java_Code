package com.class14;

import java.util.Scanner;

public class PrimeNumScanner {
   public static void main(String[] args) {
	
	// 7. Write a java program to check whether a given number is prime or not?      
	// a prime number --> can be divided just by itself and 1 
	   
	int num;
	boolean isPrime=true;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter a number");
	num=scan.nextInt();
	
	for (int i=2; i<num; i++) {   //or i<num/2;
		
		if (num%i==0) {
			isPrime=false;
			break;
		}
	}
	if (isPrime)  {
		System.out.println(num+" is a prime number!");
	}else {
		System.out.println(num+" is NOT a prime number!");
	}	
  }
}
