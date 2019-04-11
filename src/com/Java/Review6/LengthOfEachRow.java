package com.Java.Review6;

public class LengthOfEachRow {
   public static void main(String[] args) {
	
	   //  Write a program to print the length of each array.

       int[][] ar = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7, 8 }, };

       System.out.println("Length of row 1: " + ar[0].length);
       System.out.println("Length of row 2: " + ar[1].length);
       System.out.println("Length of row 3: " + ar[2].length);

   System.out.println("----For Each loop");
       
       for (int[] innerArr : ar) {
           int i=1;
           System.out.println("Length of row " + i + ": " + innerArr.length);
           i++;
       }
   System.out.println("------For loop--------");  
	    
       for (int i=0; i<ar.length; i++)  {
    	   System.out.println("The length of row "+i+" is "+ar[i].length);
       }
}
}
