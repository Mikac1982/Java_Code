package com.Practice;

public class JavaArray12 {
   public static void main(String[] args) {
	
   //  Write a Java program to find the duplicate values of an array of integer values   
	   
	int[] arr= {2,55,3,9,10,3,24,2,10};
	
	System.out.println("Duplicate values of an array are:");
	
	for (int i=0; i<arr.length-1; i++) {
		
		for (int y=i+1; y<arr.length; y++)	{
			
			if (arr[i]==arr[y]) {
				System.out.print(+arr[y]+" ");
			}
		}   
	}   
}
}
