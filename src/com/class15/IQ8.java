package com.class15;

public class IQ8 {
  public static void main(String[] args) {
	
  //8. Write a Java Program to print first 10 numbers of Fibonacci series.
  //   0,1,1,2,3,5,8,13,21,34
	  
	int a=1;
	int b=0;
	int c=0;
	
	for (int i=0; i<10; i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.print(a+" ");
		
	}
	  
	  
	  
	  
}
}
