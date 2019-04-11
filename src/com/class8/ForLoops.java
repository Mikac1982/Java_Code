package com.class8;

public class ForLoops {
   public static void main(String[] args) {
	
 // initialize variable    condition      increment/decrement
	   
	for (int i=1;            i<=10;             i++)   {
		
		System.out.println("Good morning "+i);
	}
	
	// I want to print numbers from 10 to 1
	
	for (int i=10;  i>=1; i--) {
		
		System.out.println(i);
	}
	
	for (int a=0; a<=20; a+=2) {  // incrementing by 2
		System.out.println(a);
	}
	for (int b=1; b<=50; b+=5) {  // incrementing by 5
		System.out.println(b);
	}
	for (int b=5; b!=5; b++) {
		System.out.println(b);   // not getting executed
	}
}
}
