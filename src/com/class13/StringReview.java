package com.class13;

public class StringReview {
   public static void main(String[] args) {
	
	// Create a string and print it in reverse order   
	   
	 String str="We are learning some interesting stuff"; 
	 
	 for (int i=str.length()-1; i>=0; i--) {
		 System.out.print(str.charAt(i));
	 }
	 
}
}
