package com.class22;

public class Task1 {

	/* Write a program that will have a constructor: 
	 * one with parameters and second without any parameters. 
	 * Create a separate Test class where you will execute both of the constructors.
	 */
	
	
	public Task1(String str, int a) {
		System.out.println("Constructor with parameters "+str+" and "+a);
	}
	
	public Task1 () {
		System.out.println("Constructor with no parameter");
	}
	
	

	//4.Write program that have static constructor and observe result.
	
	//WE CAN NOT MAKE A CONSTRUCTOR AS STATIC!
	
	// static public Task4() {  not possible to use static for constructor
	//}
	
	
	
}
