package com.class29Again;

public interface TakesScreenshot {
   
	//by default this is public static final variable and it has to be defined 
	String fileExtension=".png";
	
   void takesScreenshot();	
	
    //starting from java 8, in interface we can have DEFINED methods: but only STATIC or DEFAULT
    static void m1() {
		System.out.println("Static m1 method");
	}
	//we have to write default
	default void m2() {
		System.out.println("Default m2 method");
	}
   
   
   
   
}
