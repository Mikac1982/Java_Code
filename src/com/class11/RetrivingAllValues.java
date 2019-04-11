package com.class11;

public class RetrivingAllValues {
   public static void main(String[] args) {
	
	int[][] num= {
			{11,12,13,14},     //4
			{21,22,23},        //3
			{31,32,33,34,35}   //5
	};
	int rows=num.length;      //3 try to get length of each array-row
	System.out.println(rows);
	
	int cols=num[2].length;   // columns lives inside the rows
	System.out.println(cols);
	
	System.out.println("-------Print all the elements of the 2D array-------");
	
	for (int row=0; row<num.length; row++) {    // gives us number of arrays or rows
		
		for (int col=0; col<num[row].length; col++ )  {  // look true the each rows and give us number of columns
			System.out.print(num[row][col]+" ");
		}
		System.out.println();
	}
	
	String[][] food= {  //3,4
			{"burger", "fries", "hot dog", "meatloaf"},  // 1 array or 1 row
			{"lo mein", "fried rice"},                   // 2 array or 2 row
			{"biriyani", "korma", "naan", "chich peas"}
	};
	
	for (int i=0; i<food.length; i++ )  {     
		
		for (int j=0; j<food[i].length; j++) {
			System.out.print(food[i][j]+" ");
		}
		System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
