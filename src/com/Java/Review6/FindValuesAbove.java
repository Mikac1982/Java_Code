package com.Java.Review6;

public class FindValuesAbove {
   public static void main(String[] args) {
	
   // Find the number of values above the value of 7.   
	  //  2 6 9 3 7
	  //  1 7 9 4 8
	  //  0 4 6 2 5
	  //  0 1 2 3
	    	 
	 int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };	
	 
	 int count=0;
	 System.out.println("-------For Loop------");
	 
	 for (int i=0; i<rating.length; i++)  {
		 for (int y=0; y<rating[i].length; y++)  {
			 
			 if (rating[i][y]>7) {
				 count+=1;
			 }
		 }
	 }
	 System.out.println("The number of values above 7 is "+count);  //3
	 
	 System.out.println("------For Each loop------");
	 
	 int count1=0;
	 
	 for (int[] inner:rating) {
		 for (int elements:inner) {
			 
			 if (elements>7) {
				 count1+=1;
			 }
		 }
	 }
	 System.out.println("The number of elements above value 7 is "+count);  //????????????????? why 6?
}
}
