package com.class35;

public class MultipleCatch {

	public static void main(String[] args) {
	
		System.out.println("Beginning of the code");
	try {
		Thread.sleep(2000);        //new InterruptedException
		System.out.println(10/0);  //new ArithmeticException
		
	}catch (ArithmeticException e) 	{
		//3 WAYS /METHODS to print name and details of an exception:
		
		//1. print the name, details and locations of exception
	//	e.printStackTrace();
		
		System.out.println(e); //2. name of the E an details
		
		//3. just print details of Exception
     	System.out.println(e.getMessage());
		
		
		System.out.println("Code of Arithmetic Exception catch");
	}catch(InterruptedException e) {
		System.out.println("Code of Interrupted Exception catch");
	}
		
	System.out.println("End of the code");	
		
		
		
		
		
		
		
	}
}
