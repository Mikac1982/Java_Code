package com.JavaReview5;

public class Homework2 {
  public static void main(String[] args) {
	
	// Write a program to find the maximum and minimum value of an array.    
	   
	int[] numbers= {34,6,186,66,41,151,79,21,45};
	
	int max=numbers[0];
	int min=numbers[0];
	
	for (int i=0; i<numbers.length; i++) {
		
		if (numbers[i]>max) {
			max=numbers[i];
		}
		if (numbers[i]<min) {
			min=numbers[i];
		}
	}
	System.out.println("The maximum value of an array is "+max);   
	System.out.println("The minimum value of an array is "+min);
	
}
}
