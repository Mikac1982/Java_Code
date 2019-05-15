package com.class35Again;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Beginning of the code");
		
		//we are putting risky code in try block 
		try {
		    Thread.sleep(2000);    //this exception might occurs
		                           //object of exception might be thrown(new InterruptedException)
		//storing object InterruptedException in variable e of type InterruptedException
	    //Object of exception that is thrown has to match with catch
		}catch(InterruptedException e) {
			System.out.println("I am a catch block");
			e.getMessage();
		}
		
		System.out.println("The end of program");
	//	InterruptedException e=new InterruptedException(); //can not work; has to be matching catch, or parent class
	//  Exception e=new InterruptedException();	 
	}
}
