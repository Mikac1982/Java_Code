package com.Practice;

public class Task2 {
   public static void main(String[] args) {
	
	// *    rows=5;  columns depend on rows <=
	// **
	// ***
	// ****
	// *****
		
		for (int i=1; i<=5; i++) {
			for (int y=1; y<=i; y++) {
				System.out.print("*");
			}
			System.out.println();
		} 
	System.out.println();  
	
	   //    *            rows=5+4
	   //    **           columns=5
	   //    ***
	   //    ****
	   //    *****
	   //    ****
	   //    ***
	   //    **
	   //    *
	
	for (int i=1; i<=5; i++) {
		for (int y=1; y<=i; y++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for (int i=1; i<=4; i++) {           //  for (int i=4; i>=1; i--) {
		for (int y=4; y>=i; y--) {       //       for (int y=1; y<=i; y++) {
			System.out.print("*");
		}
		System.out.println();
	}
    
 } 
}
