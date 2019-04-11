package com.class5;

import java.util.Scanner;

public class HomeworkNested {
   public static void main(String[] args) {
	  // Write a program to find largest of 3 double values using Nested if
	  // provided by a user (Numbers must be distinct!)
	   
	  Scanner scan;
	  double num1,num2,num3;
	   
	  scan= new Scanner(System.in);
	  System.out.println("Please enter 3 double distinct values");
	  num1=scan.nextDouble();
	  num2=scan.nextDouble();
	  num3=scan.nextDouble();
	  
	  if (num1>num2) {
		  if (num1>num3) {
			  System.out.println(num1+" is the largest");  
		  }else {
			  System.out.println(num3+" is the largest");
		  }
	  }else {  // assuming that num2>num1
		  if (num2>num3) {
			  System.out.println(num2+" is the largest");
		  }else {
			  System.out.println(num3+" is the largest");
		  }
	  }
	   
   }
}
