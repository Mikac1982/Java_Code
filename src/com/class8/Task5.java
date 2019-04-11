package com.class8;

public class Task5 {
   public static void main(String[] args) {
	
	   // print even number between 20 and 50 (2 ways)
	   
	 for (int i=20; i<=50; i+=2) {
		 System.out.print(i+" ");
	 }
	 System.out.println();
	 
	 // second way
	 
	 for (int i=20; i<=50; i++) {
		 if (i%2==0) {
			 System.out.print(i+" ");
		 }
	 }
}
}
