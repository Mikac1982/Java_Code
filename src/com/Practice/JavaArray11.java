package com.Practice;

import java.util.Scanner;

public class JavaArray11 {
   public static void main(String[] args) {
	
	// Write a program to reverse an array of integer values   
	
	 int[] arr= {1,3,4,7,11,18,29};
	 
	 // with for loop
	 for (int i=arr.length-1; i>=0; i--) { 
	     System.out.print(arr[i]+" ");
	 } 
	      
	 System.out.println();  
	// with Scanner
	int size;
	
	Scanner scan=new Scanner(System.in); // create a scanner object for taking input
	System.out.println("Enter the size of an array"); 
	size=scan.nextInt();       // capturing the number of elements in to size
	
	int[] num=new int[size];   // creating an array with size 
	
	System.out.println("Enter an array values"); 
	
	for (int i=0; i<size; i++) {    
		num[i]=scan.nextInt();
	}
	System.out.println("Reverse elements of an array: ");
	
	for (int i=size-1; i>=0; i--)  {
		System.out.println(num[i]);
	}
	
	
}
}
