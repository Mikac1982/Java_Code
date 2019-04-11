package com.JavaReview5;

public class Task6 {
   public static void main(String[] args) {
	
	// ....5   
	// ...4.   
	// ..3..   
	// .2...   
	// 1....   
	   
	 for (int i=5; i>=1; i--)  {
		 for (int y=1; y<=5; y++)  {
			  if (y==i) {
				 System.out.print(i);
			 }else {
				 System.out.print(".");
			 }
		 }
		 System.out.println();
	 }
	 System.out.println();
	 
	// 5.... 
	// .4...
	// ..3..
	// ...2.
	// ....1
	 
	 for (int i=5; i>=1; i--) {
		 for (int y=5; y>=1; y--)  {
			if (y==i) {
				System.out.print(i);
			}else {
				System.out.print(".");
			}
		 }
		 System.out.println();
	 }
	 
	 
}
}
