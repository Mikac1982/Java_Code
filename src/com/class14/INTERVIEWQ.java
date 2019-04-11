package com.class14;

public class INTERVIEWQ {
   public static void main(String[] args) {
	
	// INTERVIW QUESTION!!!!!
	  	   
	// Reverse a String without using a reverse function   
	 	 
	 	// first-- using toCharArray();   
	   
	String str="Today is a Java Class";
	String reversed="";
//	System.out.println(str.length());  //21
	
	char[] array=str.toCharArray();
	
	for (int i=array.length-1; i>=0; i--) {
		reversed+=array[i];
	}
	System.out.println(reversed);  
	
	  // second - using atChart() ;
	
	String reversed1="";
	
	for (int i=str.length()-1; i>=0; i--) {
		reversed1=reversed1+str.charAt(i);
	}
	System.out.println(reversed1);   
	   
	  // third - using substring();
	
	String reversed2="";
	
	for (int i=str.length(); i>0; i--) {
		reversed2=reversed2+str.substring(i-1,i);
	}
	System.out.println(reversed2);
	
	
	   
}
}
