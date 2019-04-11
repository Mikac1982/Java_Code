package com.class18_2;

public class Task2 {
   public static void main(String[] args) {
	
	 /* I want to print pattern
	  * 54321
	  * 54321 
	  * 54321 
	  * 54321 
	  */
	   
	for (int i=1; i<5; i++)  {
		
		for (int y=5; y>=1; y--) {
			
			System.out.print(y);
		}
		System.out.println();
	}
	System.out.println();
	
	// I want to print this pattern:
	// *    rows=4;  columns depend on rows <=
	// **
	// ***
	// ****
	
	for (int i=1; i<=4; i++) {
		
		for (int y=1; y<=i; y++) {  //columns are depending on the rows
			
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	
	// I want to print this pattern:
	// 55555
	// 44444
	// 33333
	// 22222
	// 11111
	
	for (int i=5; i>=1; i--) {
		
		for (int y=5; y>=1; y--) {
			System.out.print(i);
		}
		System.out.println();
	}
}
}
