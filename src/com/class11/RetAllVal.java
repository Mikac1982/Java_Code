package com.class11;

public class RetAllVal {
   public static void main(String[] args) {
	
	   int[][] num= {
				{11,12,13,14},     //4
				{21,22,23},        //3
				{31,32,33,34,35}   //5
		};   
	   
	 int rows=num.length;  
	 System.out.println(rows);  
	   
	 int columns= num[2].length;   // columns depends on the rows/	 System.out.println(columns);
	   
	 System.out.println("-------Print all the elements of the 2D array------");  
	 
	 for (int row=0; row<num.length; row++) {  // how many rows
		 
		 for (int col=0; col<num[row].length; col++) {
			 System.out.print(num[row][col]+" ");
		 }
		 System.out.println();
	 }
	 
	 
	 
	 
	 
	 
	 
}
}
