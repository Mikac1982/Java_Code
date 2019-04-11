package com.class18;

public class Task1 {
   public static void main(String[] args) {
	
	/* I want to print pattern
	 *   *****   rows=4; columns=5;
	 *   *****
	 *   *****
	 *   *****
	 */  
	   
   for (int a=0; a<4; a++ )  {
		
		for (int b=0; b<5; b++) {
			System.out.print("*");
		}
		System.out.println();
	}
   System.out.println();
	 
   // *
   // **
   // ***
   // ****
   // *****
   // ******
   // *******
   
   for (int i=1; i<=7; i++) {
	   
	   for (int y=1; y<=i; y++) {
		   System.out.print("*");
	   }
	   System.out.println();
   }
	   
  }
   
}
