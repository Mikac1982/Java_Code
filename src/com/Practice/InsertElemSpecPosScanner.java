package com.Practice;

import java.util.Scanner;

public class InsertElemSpecPosScanner {
   public static void main(String[] args) {
	
	  // Write a Java program to insert an element (specific position) into an array
	   
	         // 0   1  2  3 4  5   6   
	int[] arr= {20,40,60,80,1,120,140};
	int num;
	int index;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter an element you want to insert in an array");
	num=scan.nextInt();
	System.out.println("Enter a position(index) in which you want to insert an element");
	index=scan.nextInt();
	
	System.out.println("After inserting an element "+num+":");  
	
	 for (int i=0; i<arr.length; i++)  {
		 if (i==index) {
			 arr[i]=num;
		 }
		 System.out.print(arr[i]+" ");
	 }
	   
}
}
