package com.class8;

public class Task3 {
   public static void main(String[] args) {
	
	  // print odd numbers from 1 to 20 (2 ways) 
	  
	for (int i=1; i<=20; i+=2) {
		System.out.print(i+" ");
	}
	System.out.println();
	
	// second way 
	
	for (int i=1; i<=20; i++) {
		if (i%2!=0) {
			System.out.print(i+" ");
		}
	}
	
}
}
