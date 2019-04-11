package com.Java.Review6;

public class Task5 {
   public static void main(String[] args) {
	
//  Write a program to find the average of row 2 (index 1)
  //     2 6 9 3 7
  //     1 7 9 4 8
  //     0 4 6 2 5
  //     0 1 2 3
   int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };  
	   
	double sum=0; 
//	double average;
	
	for (int i=0; i<rating[1].length; i++) {
	    sum+=rating[1][i];
	}
	System.out.println("The length of the second row is "+sum/rating[1].length);
	
//	average=sum/rating[1].length;
//	System.out.println("The average of the second row is "+average);
	
}
}
