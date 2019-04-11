package com.class15;

import java.util.Scanner;

public class IQ7 {
  public static void main(String[] args) {
	
  // 7. Write a java program to check whether a given number is prime or not?     
  // A prime number --> can be divided just by itself and 1 
  // 2,3,4,7,11,13,17,19,23,29,31,37  
	
	int num;
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter a number to check if it is prime");  
	num=scan.nextInt();
	
	boolean prime=true;
	
	for (int i=2; i<num; i++) {
		if (num%i!=0) {

		}else {
			prime=false;
			break;
	}
	}
	System.out.println(prime);
	
	
}
}
