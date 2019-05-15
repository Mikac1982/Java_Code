package com.class35Again;

public class ExceptionIntro {

	public static void main(String[] args) {
		
	//	int a=10;
	//	int b=0;
		
	//	System.out.println(a/b); //ArithmeticException
		
	//	System.out.println("Code after an exception");//won't be executed cause of exception
		
		//behind the code/scene this is what happened:
		    //new object of ArithmeticException is getting created and 
		ArithmeticException exception=new ArithmeticException();
		//that object is thrown in program; nobody is catching it so we have error message
		throw exception;
		
		
		
		
		
		
	}
}
