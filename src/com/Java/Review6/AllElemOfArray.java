package com.Java.Review6;

public class AllElemOfArray {
   public static void main(String[] args) {

   // Write a program to Print all elements of 2D array Using Loop and For Each loop

	   int[][] ar = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7, 8 }, };
	   
    System.out.println("------For Loop-------");
    
    for (int i=0; i<ar.length; i++) {
    	for (int y=0; y<ar[i].length; y++) {
    		System.out.print(ar[i][y]+" ");
    	}
    	System.out.println();	
    }
	   
	System.out.println("-----For Each Loop-------");   
	 
	for (int[]row:ar)  {
		for (int elements:row)  {
			System.out.print(elements+" ");
		}
		System.out.println();
	}
	   
}
}
