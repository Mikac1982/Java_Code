package com.class26;

//Write a program as a Student Class that has instance variables name and address.
//Create a constructor that will initialize those variables.
//Print name& address of given student by the display method

public class Student {
    String name, address;
	
	Student (String name, String address){
		this.name=name;
		this.address=address;
	}
	public void display() {
		System.out.println("Student's name is "+name+" and his address is "+address);
	}
	 
}
