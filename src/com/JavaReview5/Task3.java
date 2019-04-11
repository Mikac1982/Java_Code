package com.JavaReview5;

public class Task3 {
   public static void main(String[] args) {
	
	// ....1   
	// ...2   
	// ..3   
	// .4   
	// 5   
		         
	for (int i=1; i<=5; i++)   {
		for (int y=1; y<=5-i; y++)  {
			System.out.print(".");
		}
		System.out.print(i);
		System.out.println();
	}
	   
	 System.out.println();
	 
	 // second way (more lines)
	 
	 for (int i=1; i<=5; i++) {
		 for (int y=5; y>=1; y--) {
			if (y>i) {
			 System.out.print(".");
		    }else if (y==i) {
		    	System.out.print(i);
		    }
		    }
		 System.out.println();
	 }
}
}
