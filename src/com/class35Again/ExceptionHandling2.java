package com.class35Again;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		System.out.println("Beginning of the code");
		int a=10;
		int b=10;
		
		try {
		    System.out.println(a/b);   //gives exception. object is getting created. it's trown to catch block
		    System.out.println("Code inside try block");
		
		    //entire code of catch block is getting executed; try block is not executed
		}catch(ArithmeticException e) {
			System.out.println("Code inside catch block");
		}
		
		System.out.println("The end of the program");
		
		
		
		
		
		
		
		
		
	}
}
