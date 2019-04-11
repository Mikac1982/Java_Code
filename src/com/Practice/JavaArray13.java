package com.Practice;

public class JavaArray13 {
   public static void main(String[] args) {
	
	// Write a Java program to find the duplicate values of an array of string values.   
	 
	String[] arr= {"car","boy","girl","fun","girl","car","day" }; 
	 
	System.out.println("Duplicate values of a String are: ");
	
	for (int i=0; i<arr.length-1; i++)   {
		
		for (int y=i+1; y<arr.length; y++) {
		
		    if ((arr[i].equals(arr[y]))) {    //&&(i!=y))
		    	System.out.println(arr[y]);
			}
			
		}
	
	}
	   
	   
	   
}
}
