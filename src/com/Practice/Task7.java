package com.Practice;

public class Task7 {
   public static void main(String[] args) {
	 
 // *	     rows=6+5; cplumns=6;
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
		 for (int y=1; y<=6; y++) {
			 if (i==y) {
				 System.out.print("*");
			 }else {
				 System.out.print(" ");
			 }
		 }
		 System.out.println();
	 }
	 for (int i=5; i>=1; i--) {
		 for (int y=1; y<=5; y++)  {
			 if (y==i) {
				 System.out.print("*");
			 }else {
				 System.out.print(" ");
			 }
		 }
		 System.out.println();
	 }
	   
}
}
