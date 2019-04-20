package com.SuperAndThis;

public class Person {

	void message() {
		System.out.println("This is Super class");
	}
}
class Student extends Person{
	

	void message() {
		System.out.println("This is student class");
	}
	
	
	void display() {
		
		// will invoke or call current class message() method
				message();
				
		// will invoke or call parent class message() method 
		super.message();
		
		
		
	}
}
 