package com.class14;

public class SplitMethod {
   public static void main(String[] args) {
	
	   
	 String str="28/12/2019";
	 
	 // first way --> no limit on the substring
	 String[] array1=str.split("/");
	 
	 for (String  date: array1) {
		 System.out.println(date);
	 }
	  System.out.println(); 
	  
	 // second way --> there is a limit on the substrings  
	  String[] array2=str.split("/", 2); // limit=2
	   
		for (String date:array2) {
			System.out.println(date);
		}	  
	 System.out.println(); 
	 
	 String[] array3=str.split("/", 0);  // limit=0 same as no limit
	 
	 for (String date:array3) {
		 System.out.println(date);
	 }
	 
	
}
}
