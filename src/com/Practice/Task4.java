package com.Practice;

public class Task4 {
  public static void main(String[] args) {
	
		
	    // ....1   rows=5 columns=5
	    // ...22
	    // ..333
	    // .4444	
	    // 55555 
	  
	 for (int i=1; i<=5; i++) {
		 for (int y=1; y<=5; y++) {
			 if (y<=(5-i)) {
			    System.out.print(".");
		     }else {
		    	System.out.print(i);
		     }
	     }
		 System.out.println();
	 }  
	 System.out.println();
	 
	// second way 
	 for (int i=1; i<=5; i++) {
		 for (int y=5; y>=1; y--) {
			 if (y>i) {
				 System.out.print(".");
			 }else {
				 System.out.print(i);
			 }
		 }
		 System.out.println();
		 
	 }
}
}
