package com.class26;

public class Students {
    
	//instance variable
	String fullName;
	int age;
	
	//this is uded to differentiate between instance and local variables
	public Students(String fullName, int age) {
		this.fullName=fullName;
		this.age=age;
	}
	
	public void displayDetails() {
		System.out.println("Student full name is "+fullName+" and age is "+age);
	}
	
	public static void main(String[] args) {
		
		Students obj=new Students("John Snow", 30);
		obj.displayDetails();
		
	}
}
