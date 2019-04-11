package com.JavaReview5;

public class SpecValueArray {
   public static void main(String[] args) {
	
	//  Write a program to test if an array contains a specific value. 6
	//  Hint: use a boolean flag 
		      
	  int[] numbers= {1,2,3,4,5,6,7,8,9,10};  
	  int num=6;
	  
	  boolean found=false;  // by default
	  
	  for (int i=0; i<numbers.length; i++)  {
		  
		  if ( numbers[i]==6) {
			  found=true;
			  break;
		  }
	 }
	  if (found) {
		  System.out.println("The array contains a value 6");
	  }else {
		  System.out.println("The array do not contain the value 6 ");
	  }
}
}
