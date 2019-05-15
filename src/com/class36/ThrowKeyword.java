package com.class36;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
	//	System.out.println(a/b); //new ArithmeticException object is created
		                         //we did not created, it's -by JVM (automatically)
		
	//	checkAgeEligibility (15);
	//	twoNumDiv(10, 0);
		checkUserNameLength("hi");
	}
//we can create our own exception; but we have to make sure our class is throwable	
//if we want to write our own custom exception and throw it manually, we can do that using keyword THROW:
	
        //if person is >18 years old --> issue driving license	
        //	           else --> throw an exception
	
	public static void checkAgeEligibility (int age) {
		if (age>=18) {
			System.out.println("Congratulations on your driver licence");
		}else {
			//creating this object manually and providing your own message!
			//exception has to be throwable -
			throw new ArithmeticException("You are not eligible to get driver license");
		}
	}
	
	public static void twoNumDiv(int a, int b) {
		if (b!=0) {
			System.out.println(a/b);
		}else {
		     throw new ArithmeticException("We can not divide by zero");
		}
	}
	
	public static void checkUserNameLength(String userName) {
		if (userName.length()>3) {
			System.out.println("User name is accepted");
		}else {
			throw new NullPointerException("User name must be longer than 3 characters");
		}
	}
	
}
