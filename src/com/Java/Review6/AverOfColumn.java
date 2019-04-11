package com.Java.Review6;

public class AverOfColumn {
   public static void main(String[] args) {
	
   // Print the average of values in column 3.   
	   //  2 6 9 3 7
	   //  1 7 9 4 8
	   //  0 4 6 2 5
	   //  0 1 2 3
	    	 
	 int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };	
	
	 double sum2=0;
	 
	 for (int i=0; i<rating.length; i++) {
		 for (int y=0; y<rating[i].length; y++) {
		 }	
		 sum2+=rating[i][2];
	 }
	 System.out.println("The average of values in column 3 is "+sum2/rating.length);
	 
	 double sum=0;
	 
	 for (int i=0; i<rating.length; i++) {  // we do not need second loop because number of rows is not changing
		 sum+=rating[i][2];
	 }
	 System.out.println(sum/rating.length);
}
}
