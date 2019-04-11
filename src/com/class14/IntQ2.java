package com.class14;

public class IntQ2 {
  public static void main(String[] args) {
	  
 // 2.Write a java program to find the second largest number in the array? 
 //   Maximum and minimum number in the array?	  
	  
	int[] array= {52,-9,490,181,-43,-65};
	
	int largest=0;
	int min=0;
	int secondLar=0;
	
	 for(int a : array) {
         
         if(a < min) {
             min = a;
             
         }else if(a > largest) {
             secondLar = largest;
             largest = a;
             
         }else if(a > secondLar) {
             secondLar = a;
         }
     }
    System.out.println("Largest number           : "+largest);
	System.out.println("The second largest       : "+secondLar);
	System.out.println("Minimum number           : "+min);
	
}
}
