package com.class14;

import java.util.Scanner;

public class IntQ6 {
   public static void main(String[] args) {
	
  // Write a Java Program to find whether a String is palindrome or not?
	   
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Please enter a String to check if it is a palindrome");
	 String str=scan.nextLine();
	 
	 String reverse="";
	  
	 for (int i=str.length()-1; i>=0; i--) {
         reverse+=str.charAt(i);
	 }
	 System.out.println(reverse);
	   
	 if (str.equalsIgnoreCase(reverse)) {
		 System.out.println("String is a palindrome");
	 }else {
		 System.out.println("String is not a palindrome");
	 }
}
}
