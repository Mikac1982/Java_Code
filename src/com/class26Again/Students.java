package com.class26Again;

public class Students {
    
	//instance variables
	String fullName;
	int age;
	
	//this is used to differentiate between instance and local variables
	public Students(String fullName, int age) { //using constructor we are initializing instance variables
		this.fullName=fullName;   //refers to instance variable
		this.age=age;
	}
	
	public void didplayDiteails() {
		System.out.println("Student full name is "+fullName+" and age is "+age);
	}
	
	public static void main(String[] args) {
		
		Students obj=new Students("John Snow", 30);
		obj.didplayDiteails();
		
	}
}
