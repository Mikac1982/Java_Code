package com.class19;

public class Human {

	static String eyeColor="Brown";
	String gender="F";  //instance variables, belong to the instance(object that we created)
	int height=6;     // available (can be used) everywhere!
	int weight=180;
	
	String programmingLanguage="java";
	
	void speak() {
		
		String language="English";  //LOCAL variables, available just inside the method; not outside
		System.out.println("Humans can speak "+language);
	}
	
	void coding() {
		
		System.out.println("Syntax students can code");
	}
	
	void print () {
		System.out.println();
	}
	

	
	
	
}
