package com.Java.Review6;

public class Task1 {
  public static void main(String[] args) {
	  
	// Write a program to print a sum of the second row
	  
	int[][]  arr= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	
	int sum=0;
	
	for (int i=0; i<arr[1].length; i++) {
		System.out.print(arr[1][i]+", ");     // sum of the second row [with index 1]
		
		sum+=arr[1][i];
	}
	System.out.println();
	System.out.println(sum);  
}
}
