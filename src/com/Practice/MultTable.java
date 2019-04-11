package com.Practice;

import java.util.Scanner;

public class MultTable {
   public static void main(String[] args) {
	
  // Write a program that prompts the user to input a positive integer.
  // It should then print the multiplication table of that number.    
	   
	 int num;
	 Scanner scan;
	 int multTable=0;
	 
	 scan=new Scanner(System.in);
	 System.out.println("Please enter a positive number");
	 num=scan.nextInt();
	 
	 System.out.println("The multiplication of a number "+num+" is:");
	 
	 for (int i=1; i<=10; i++)  {
		 multTable=i*num;
		System.out.println(i+"*"+num+"="+multTable);
	 }
	
}
}
