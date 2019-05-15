package com.class35;

public class ExceptionHandaling2 {

	public static void main(String[] args) {
		
		System.out.println("Beginning of the code");	
		int a=10;
		int b=0;
		
		try {
		System.out.println(a/b);  //here we are getting exception ->new AE (object is getting creating) 
		System.out.println("Code inside try block"); //we do not see this, do not print
		
		//if there is no exception, catch is not getting executed
		}catch (ArithmeticException e) {  //code comes inside catch code; entire block get executed
			System.out.println("Code inside catch block");
		}
		
		System.out.println("The end of the program");	//normal flow
		
		
		
		
		
		
		
	}
}
