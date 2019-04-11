package com.Practice;

public class JavaArray9 {
    public static void main(String[] args) {
		
    // Write a Java program to insert an element (specific position) into an array
    	
              // 0  1  2  3 4  5  6
	int[] arr= {111,3,55,76,9,54,231};
	
	int a=19;   // insert 19 into position of 5
	
	for (int i=0; i<arr.length; i++) {
		if (i==5) {
			arr[i]=a;
		}
	System.out.print(arr[i]+" ");
	}
	
    	
    	
    	
	}
}
