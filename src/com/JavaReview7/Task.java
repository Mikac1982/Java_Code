package com.JavaReview7;

public class Task {

	// Create a method that has no return type
	// and have it print it "I do not have a return type"
	// do not use system.out.println() in main method
	
	public static void main(String[] args) {
	
		Task first=new Task();
		first.noReturn();
		
	}
	void noReturn() {
		System.out.println("I do not have a return type");
	}
}
