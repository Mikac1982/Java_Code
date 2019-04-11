package com.PracticeAgain;

public class DuplicateValues {
   public static void main(String[] args) {
	
	 //  Write a Java program to find the duplicate values of an array of integer values  
	   
	int[] arr= {1,3,66,20,3,55,1,20,77};
	
	System.out.println("Duplicate values of an array are:");
	
	for (int i=0; i<arr.length; i++) {
		
		for (int y=i+1; y<arr.length; y++) {
			
			if (arr[i]==arr[y]) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	   
	   
	   
	   
}
}
