package com.class35Again;

public class FinallyBlock {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try {
			System.out.println("Try block code");
			System.out.println(a/b);
			
		}catch(ArithmeticException e) {
			System.out.println("Catch block code");
		}finally {
			System.out.println("Finally block code");
		}
		
		try {
			System.out.println(a/b);  //object of exception is created, thrown but nobody is catching it 
		}finally {
			System.out.println("Finally block code");  //always getting executed, no matter if we have exception or not
		}
		
		System.out.println("Continues code......."); //java.lang.ArithmeticException
		
		
		
		
	}
}
