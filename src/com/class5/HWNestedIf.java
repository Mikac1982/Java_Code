package com.class5;

import java.util.Scanner;

public class HWNestedIf {
	public static void main(String[] args) {
		/*
		 * Write a program to find largest of 3 double values using Nested if provided by a user
		 * Numbers must be distinct!
		 */

		double num1, num2, num3, largest = 0;        
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		
		// if numbers are not equal
		if (!(num1==num2 && num1==num3 && num2==num3)) {
			
		      if (num1 > num2) {
			         if (num1 > num3) {
				          largest=num1;  //we are performing some operations; we initialing our largest variable
			         }else {
				          largest=num3;
			         }
		      }else { // we are assuming num2>num1
			         if (num2 > num3) {
			 	          largest=num2;
			         }else {
			   	          largest=num3;
			         }    
		       }
		}else {
				System.out.println("All numbers are equal");
			}
	
			System.out.println("The largest number is "+largest);
			   
		}
		
	}
	
	
	
 

