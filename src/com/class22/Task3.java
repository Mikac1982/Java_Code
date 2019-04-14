package com.class22;

public class Task3 {

	// Write a program  that will have a private default constructor class and create 2 objects of this class:
	// 1 - inside same class; 2 - from outside the class.
	
	
	private Task3() {
		System.out.println("This is a private constructor");
		
	}

	//when we make constructor PRIVATE, we can only have one instance of that class and
	// that instance of the class will be ONLY within the SAME class
	public static void main(String[] args) {
		
		Task3 obj1=new Task3();
		
		
	}
	
	
	
	
}
