package com.Practice;

public class JavaArray17 {
  public static void main(String[] args) {
	
	// Write a Java program to find the second largest element in an array.  
	  
	int[]  arr= {22,155,-8,1,14,454};
	
	int largest=0;
	int secondLar=0;
	
	for (int i=0; i<arr.length; i++) {
		
		if (arr[i]>largest) {
		   secondLar=largest;
		   largest=arr[i];
		   
		} else if (arr[i] > secondLar) {
        secondLar = arr[i];
	}
	}
	System.out.println("The second largest element in an array is "+secondLar);  
	 
}
}
