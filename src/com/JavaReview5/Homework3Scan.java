package com.JavaReview5;

import java.util.Scanner;

public class Homework3Scan {
   public static void main(String[] args) {
	
	 int size;
	 Scanner scan=new Scanner(System.in);  
	   
     System.out.println("Please enter the size of an array");  
	 size=scan.nextInt();
	 
	 int[] num=new int[size];
	 
	 System.out.println("Please enter an array elements");
	 
	 for (int i=0; i<size; i++ ) {
		num[i]=scan.nextInt();
	 }
	 System.out.println("Reverse elements of an array:");
	 
	 for (int i=size-1; i>=0; i--) {
		 System.out.println(num[i]);
	 }
}
}
