package com.Java.Review6;

public class AverageOfRow {
     public static void main(String[] args) {
		
    //  Write a program to find the average of row 2.
    //     2 6 9 3 7
    //     1 7 9 4 8
    //     0 4 6 2 5
    //     0 1 2 3
    	 
    int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };	 
    
    double sum =0;
  //double average;
    
    for (int i=0; i<rating[1].length; i++)	 {
    	 sum+=rating[1][i];
    }
 // average=sum/rating.length;
    System.out.println("The average of row 2 is "+sum/rating[1].length);
    	 
	}
}
