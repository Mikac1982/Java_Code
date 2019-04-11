package com.JavaReview5;

import java.util.Scanner;

public class Homework3 {
   public static void main(String[] args) {
	
	 // Write a program to reverse an array of integer values
	   
	int[] num= {2,4,6,8,10,12,14,16,18,20};  
	 
	System.out.println("Reverse elements of an array are:");
	
	for (int i=num.length-1; i>=0; i--) {
		System.out.print(num[i]+" ");
	}
	
 }
}
