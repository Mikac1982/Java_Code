package com.class26Again;

public class Employee {
           
	String name, lastName;//these 2 variables have to be initialized in parent class
	
	Employee(){ //by default this constructor is called by creating child constructor
		System.out.println("I am parent class constructor");
	}
	            //John            Snow
	Employee(String name, String lastName){
		System.out.println("I am parent class constructor");
		this.name=name; //initializing instance parent class variables   
		this.lastName=lastName;//using local variable we are initializing instance variable
	}
}

class Tester extends Employee{
	int salary; //105000
	
	Tester(String name, String lastName, int salary){
//passing 2 variables from parent class that have to be initialized in parent class
		super(name, lastName); //calling parent class constructor with 2 string par-> line 11
		this.salary=salary; //initializing instance variable child class-105000
	}
	
	public void displayDetails() {
		System.out.println("Employee "+name+" "+lastName+" has a salary of "+salary);
	}
}
