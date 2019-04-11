package com.Practice;

import java.util.Scanner;

public class RemoveSpecElScanner {
   public static void main(String[] args) {
	
	   //Write a program to remove specific element from an array
	int[] arr= {1,3,5,-55,7,9, 11};   
	int[] arr1=new int[arr.length-1];
	int num;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter an element you want to remove from an array");
	num=scan.nextInt();
	
	System.out.println("An array after removeng specific element "+num+":");
	
	for (int i=0; i<arr.length; i++) {
		if (arr[i]!=num) {
			
			for (int y=0; y<arr.length-1; y++) {
				arr1[y]=arr[i];
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	
}
}
