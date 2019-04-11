package com.Java.Review6;

public class Task4 {
   public static void main(String[] args) {
	
//     Write a program to Print all elements of 2d array Using a for Loop   
	   
	  int[][] ar = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7, 8 } };  
	  
	  System.out.println("----- For loop-------");
	  
	 for (int i=0; i<ar.length; i++) {
		  for (int y=0; y<ar[i].length; y++)  {
			 System.out.print(ar[i][y]);
		  }
		  System.out.println();
	  }
	 System.out.println("------For Each Loop------");  
	  
	 for (int[] inner:ar)  {
		 for (int elements:inner)  {
			 System.out.print(elements);
		 }
		 System.out.println();
	 }
}
}
