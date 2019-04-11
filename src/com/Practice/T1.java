package com.Practice;

public class T1 {
	public static void main(String[] args) {

		// Write a program to calculate the sum of first 10 natural number.

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
        System.out.println("The sum of first 10 numbers is " + sum);
        
     System.out.println();  

  //   **********  r=4; col=10
  //   **********
  //   **********
  //   **********
        for (int i=1; i<=4; i++) {
        	for (int y=1; y<=10; y++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println();
        
   // *        row=5; col=5;
   // **
   // ***
   // ****
   // *****
     for (int i=1; i<=5; i++)   {
    	 for (int y=1; y<=i; y++) {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
     System.out.println();
     
   //    *
   //   **
   //  ***
   // ****
   //*****
     for (int i=1; i<=5; i++) {
    	 for (int y=5; y>=1; y--) {
    		 if (y>i) {
    		 System.out.print(" ");
    	     }else {
    	     System.out.print("*");
    	     }
    	 }
    System.out.println();
     }
	}
}
