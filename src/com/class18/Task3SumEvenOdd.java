package com.class18;

import java.util.Scanner;

public class Task3SumEvenOdd {
  public static void main(String[] args) {
	
 // Write a program that reads a range of integers (start and end point), provided by a user. 
 // and then from that range prints the sum of the even and odd integers
	  
	 Scanner scan;
	 int startNum, endNum;
	 int sum=0; 
	 int sum1=0;
	 
	 scan=new Scanner(System.in);
	 System.out.println("Please enter starting number");
	 startNum=scan.nextInt();
	 System.out.println("Please enter ending number"); 
	 endNum=scan.nextInt();
	 
	 for (int i=startNum; i<=endNum; i++) {
		   if (i%2==0) {
		      sum=sum+i;	
		   }else {
			  sum1=sum1+i;
		   }
	  }
	  System.out.println("Sum of the even numbers is "+sum+", and sum of the odd numbers is "+sum1+".");   
      
}
}
