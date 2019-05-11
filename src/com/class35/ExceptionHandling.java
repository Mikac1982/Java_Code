package com.class35;

public class ExceptionHandling {

	public static void main(String[] args) {
		
	System.out.println("Beginning of the code");	
	
	 //checked exception; compiler tells you there is possibility that some uncerd exception might occur
	// how you want to fix it?
	
	try {
	   Thread.sleep(2000);	//object of an exception might be thrown (new InterruptedException)
	} catch (InterruptedException e)	{ // object stored inside variable e
		System.out.println("I am a catch block code");
		e.getMessage();
	}	
	//InterruptedException e =new InterruptedException(); //we do not see this, it happens behind	
	//object has to be matching 	
		
	//or: 
	// Exception e =new InterruptedException();
		
	System.out.println("The end of the program");	
		
		
		
		
		
		
	}
}
