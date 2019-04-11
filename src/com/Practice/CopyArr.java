package com.Practice;

import java.util.Scanner;

public class CopyArr {
   public static void main(String[] args) {
	
	// Write a program to reverse an array of integer values   
	
	int size;
	
    Scanner scan=new Scanner(System.in);
    System.out.println("Please enter the size of an array");
    size=scan.nextInt();
    
    int[] num=new int[size];
    
    System.out.println("Please enter an array values");
    for (int i=0; i<size; i++) {
	    num[i]=scan.nextInt();
    }
	System.out.println("Reversed array:");
    
	for (int i=size-1; i>=0; i--) {
		System.out.println(num[i]);
	}
	
}
}
