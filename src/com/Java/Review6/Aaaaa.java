package com.Java.Review6;

public class Aaaaa {
   public static void main(String[] args) {
	
   // Print the average of values in column 5.   
		   //  2 6 9 3 7
		   //  1 7 9 4 8
		   //  0 4 6 2 5
		   //  0 1 2 3
		    	 
    int[][] ar = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };	
	
    double sum4=0;
    
	for (int i=0; i<ar.length-1; i++ ) {
		for (int y=0; y<ar[i].length-1; y++) {
			
		}
	sum4+=ar[i][4];
	}
	System.out.println(sum4);
    System.out.println("The average of values in colum 5 is "+sum4/(ar.length-1));
    
    
}
}
