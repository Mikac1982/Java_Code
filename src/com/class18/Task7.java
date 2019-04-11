package com.class18;

public class Task7 {
   public static void main(String[] args) {   
	   
 // *	     rows=6+5; columns=6;
 //  *
 //   *
 //    *
 //	    *  
 //      *
 //     *
 //    *
 //   *	   
 //  *	   
 // *	   
	   
	  for (int i=1; i<=6; i++) {
		  for (int y=1; y<=i; y++) {
			  System.out.print(" ");
		  }
		  System.out.println("*");
	  } 
	  for (int i=5; i>=1; i--) {
		  for (int y=1; y<=i; y++) {
			  System.out.print(" ");
		  }
		  System.out.println("*");
	  }
	  System.out.println();
	  
	  // second way
	  
	  for (int i=1; i<=6; i++) {
		   for (int y=1; y<=i; y++) {
			   System.out.print(" ");
		   }
		   System.out.println("*");
	   }
	   for (int i=1; i<=5; i++) {
		   for (int y=5; y>=i; y--) {
			   System.out.print(" ");
		   }
		   System.out.println("*");
	   }
}
}
