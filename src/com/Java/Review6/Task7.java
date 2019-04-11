package com.Java.Review6;

public class Task7 {
   public static void main(String[] args) {
	   
// Print the average of values in column 3
	   
//	    2 6 9 3 7
//	    1 7 9 4 8
//	    0 4 6 2 5
//	    0 1 2 3
	   
	int[][] array = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };  
	
	System.out.println("-------For each loop-------");
	int sum2=0;

	for (int i=0; i<array.length; i++)  {  //we don't need second for loop because number of rows(i) is not changing
		sum2+=array[i][2];
	}
	System.out.println(sum2/array.length);
	
  // second way
  System.out.println("-----For loop------");
  
    int sum=0; 
   
    for (int i=0; i<array.length; i++)  {
	    for (int y=0; y<array[i].length; y++)  {
	    }
			    sum+=array[i][2];
	}
    
    int average=sum/array.length;
    System.out.println("The average of values in column 3 is "+average);
   
}
}
