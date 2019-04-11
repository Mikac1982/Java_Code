package com.class14;

public class ToCharArray {
   public static void main(String[] args) {
	
	// Convert String to Character array    
	   
	 String str="I been practicing all day";
	 
	 char[] array=str.toCharArray();
	 for (char c: array) {
		 System.out.print(c);
	 }
	   
}
}
