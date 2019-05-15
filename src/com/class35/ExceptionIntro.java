package com.class35;

import java.util.ArrayList;
import java.util.List;

public class ExceptionIntro {

	public static void main(String[] args) {
		
	// int a=10;
	// int b=0;
	// System.out.println(a/b);  //ArithmeticException
			
	//System.out.println("Code after an exception");  //won't be executed 
	  
//	ArithmeticException exception=new ArithmeticException(); //new object is created and object is thrown at you	
//	throw exception;	
		
	List<Object> fixedData= new ArrayList<>();
	while (true) {
		Object data=new byte[64 * 1024 - 1];  //OutOfMemoryError: ->ERROR can Not be handled
		fixedData.add(data);
	}
	//System.out.println("Code after an error"); //will get an c error -unreachable code
	
	
	
	
		
	}
}
