package com.Practice;

public class Task6 {
   public static void main(String[] args) {
	
	//   ....1
    //   ...2.
    //   ..3..
    //   .4...
    //   5.... 
           
	  for (int i=1; i<=5; i++) {
		  for (int y=5; y>=1; y--) {
			  
			  if (y!=i) {
				  System.out.print(".");
			  }else {
				  System.out.print(i);
			  }
		  }
		  System.out.println();
	  }
	   
	   
}
}
