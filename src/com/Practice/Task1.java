package com.Practice;

public class Task1 {
   public static void main(String[] args) {
	
		/* I want to print pattern
		 *   *****   rows=4; columns=5;
		 *   *****
		 *   *****
		 *   *****
		 */    
	   
	for (int i=1; i<=4; i++)  {
		for (int y=1; y<=5; y++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	
	/* I want to print pattern
	  * 54321
	  * 54321 
	  * 54321 
	  * 54321 
	  */
	
	for (int i=1; i<=4; i++) {
		for (int y=5; y>=1; y--) {
			System.out.print(y);
		}
		System.out.println();
	}
	System.out.println(); 
	
	// 55555
	// 44444
	// 33333
	// 22222
	// 11111
	
	for (int i=5; i>=1; i--) {
		for (int y=5; y>=1; y--)  {
			System.out.print(i);
		}
		System.out.println();
	}
	System.out.println();
	
	
}
}
