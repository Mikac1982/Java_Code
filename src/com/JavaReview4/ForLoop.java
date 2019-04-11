package com.JavaReview4;

public class ForLoop {
   public static void main(String[] args) {
	// Write a program that prints "I am feeling happy today" 10 times using for loop and while loop
	   
	 // while loop
	   int i=1;
	   while (i<=10) {
		   System.out.println("I am feeling happy today");
		   i++;
	   }
	   
	   System.out.println();
	   
	   //for loop 
	   for (int a=0; a<10; a++) {
		   System.out.println("I am feeling happy today");
	   }
	   System.out.println();
	
	// Write a program that prints starting at 18 decreasing in multiples of 3;
	   
	   // do loop
	  int c=18;
	   do {
		 System.out.println(c); 
		 c-=3;
	  }while (c>=0);
}
}
