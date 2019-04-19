package com.class24;

public class FullTimeEmployee extends Employee{

	////OVERRIDING method
	public void getPaid() {  //child class modifies method from parent class, creating own behavior
		System.out.println("Full time employee gets paid salary + bonus");
		
	}
	
	
	
}
