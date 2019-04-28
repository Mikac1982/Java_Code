package com.class29;

public class Student {

	private String name;
	private int age;
	
	//create SETTERS to set the value
	public void setName(String name) {
		if (!name.isEmpty()) {
			this.name=name;
		}
	}
	
	public void setAge(int age) {
		if (age>=18) {
		this.age=age; //constructor gives default value )
	    }
	}
	
	//create GETTERS to give/return the value of the variables
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	
	
}
