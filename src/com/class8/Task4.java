package com.class8;

public class Task4 {
   public static void main(String[] args) {
	
	// print even numbers from 20 to 1 (2 ways)
	   
	 for (int i=20; i>=1; i-=2)  {
		 System.out.print(i+" ");
	 }
	 System.out.println();
	 
	 // second way
	 
	 for (int i=20; i>=1; i--) {
		 if (i%2==0) {
			 System.out.print(i+" ");
		 }
	 }
}
}
