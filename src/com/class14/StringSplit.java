package com.class14;

public class StringSplit {
   public static void main(String[] args) {
	
	   // split(); cut your string (when we cut string we are getting arrays);
	   
	 String str="Welcome my dear Syntax Students";
	 
	 String[] array= str.split("my dear");  //returns String in an Array of Strings
	 
	 System.out.println("The length of the array is: "+array.length);  // 2 (how many strings we get after split=2) 
	 
	 for (String substring:array) {
		 System.out.println(substring);
	 }
	 System.out.println("--------------");
	 
	 for (int i=0; i<array.length; i++) {
		 System.out.println(array[i]);
	 }
}
}
