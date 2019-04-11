package com.Practice;

public class JavaArray6 {
  public static void main(String[] args) {
	
	// Write a Java program to find the index of an array element  
	  
	 int[] array= {35,16,23,94,6,71,33,57};
	 int a=33;
	 
	 for (int i=0; i<array.length; i++)  {
		 
		 if (array[i]==a) {
			 System.out.println(i);
		 }
	 }


  }
}
