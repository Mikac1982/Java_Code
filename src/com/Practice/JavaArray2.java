package com.Practice;

public class JavaArray2 {
   public static void main(String[] args) {
	
	// Write a program to sum the values of an array   
		
	  int[] numbers= {1,2,3,4,5,6,7,8,9,10};
	  int sum=0;
		  
		for (int i=0; i<numbers.length; i++)  {
			 // sum=sum+numbers[i];
			   sum+=numbers[i];
	    }
	  System.out.println("The sum of all array elements is "+sum);
			      
	   
}
}
