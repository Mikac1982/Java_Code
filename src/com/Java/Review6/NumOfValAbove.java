package com.Java.Review6;

public class NumOfValAbove {
   public static void main(String[] args) {
	
	   
	   
  int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };     
	
  int count=0;
  
	for (int[] inner:rating)  {
		for (int element:inner) {
			
			if (element>7) {
				count++;
			}
		}
	} 
	System.out.println("THe number of all elements above 7 is "+count);   
	   
}
}
