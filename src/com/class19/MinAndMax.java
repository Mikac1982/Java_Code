package com.class19;

public class MinAndMax {
	
   // Write a program to find the maximum and minimum value of an array.
   // in the same class have 2 static methods one for min one for max
  
	static int minOfValues(int[]arr) {
		
		int min=arr[0];
  
		for (int a:arr) {
			if (a<min) {
				min=a;
			}
		}
		return min; 
		 
	}	
	
	static int maxOfValues(int[]arr) {
		
		int max=arr[0];
		
		for (int a:arr) {
			if(a>max) {
				max=a;
			}
		}
		return max;
	}
}
