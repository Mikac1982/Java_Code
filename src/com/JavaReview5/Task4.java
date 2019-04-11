package com.JavaReview5;

public class Task4 {
     public static void main(String[] args) {
		
    	// Write a program to produce the following pattern
          
        //   ....1
        //   ...2.
        //   ..3..
        //   .4...
        //   5.... 
    
    	   
     for (int i=1; i<=5; i++)  {
    	 for (int y=5; y>=1; y--)   {
    				
    		 if (y!=i) {
    			System.out.print(".");
    		 }else if (y==i) {
    			System.out.print(i);
    		 }
    	 }
    	 System.out.println();
     }    
  }
}
