package com.class29;

public interface TakesScreenshot {

	String fileExtentsion=".png"; //by default this is public static final-CONSTANT and has to be DEFINED
	                              //and must be INITIALIZED
	void takesScreenShot();
	
	//from java 8 we can have defined methods in interface: only STATIC and DEFAULT
	
	static void m1() {
		System.out.println("Static m1 method");
	}
	
	default void m2() {
		System.out.println("Default m2 method");
	}
	
	
	
	
	
	
}
