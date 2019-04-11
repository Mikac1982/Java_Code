package com.Java.Review6;

public class Homework {
   public static void main(String[] args) {
	
	// Write a program that prints last character of each word in a string

       String str = "Syntax Technologies";  
	   
	 for (int i=0; i<str.length(); i++)  {
		 if (str.charAt(i)==' ') {
			System.out.println(str.charAt(i-1)+" "+str.charAt(str.length()-1)); 
		 }
	 }
	// System.out.println(str.charAt(5));
	// System.out.println(str.charAt(18)); 
}
}
