package com.class8;

public class Task1For {
   public static void main(String[] args) {
	
	   //1. print numbers from 1 to 100
	   
	 for (int i=1; i<=100; i++) {
		 System.out.print(i+" ");
	 }
	 System.out.println();
	 
	  //2. print numbers from 100 to 1
	 
	 for (int i=100; i>=1; i--) {
		 System.out.print(i+" ");
	 }
	 System.out.println();
	 
	 //3. print odd numbers from 1 to 20
	 
	 // first way
	 for (int i=1; i<=20; i+=2) {
		 System.out.print(i+" ");
	 }
	 System.out.println();
	 // second way
	 for (int i=1; i<=20; i++) {
		 if (i%2!=0) {
			 System.out.print(i+" ");
		 }
	 }
	 System.out.println();
	 
	 // 4. print even numbers from 20 to 1
	 
	 // first way
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
		 System.out.println();

	 // 5. print even numbers between 20 and 50
		 
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
	 System.out.println();
	 
	 // 6. print odd numbers between 20 and 50
	 
	 for (int i=21; i<=50; i+=2) {
		 System.out.print(i+" ");
	 }
	 System.out.println();
	 // second way
	 for (int i=20; i<=50; i++) {
		 if (i%2!=0) {
			 System.out.print(i+" ");
		 }
	 }
}
}
