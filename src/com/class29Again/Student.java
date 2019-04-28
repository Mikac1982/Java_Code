package com.class29Again;

public class Student {

	private String name;
	private int age;
	
	//create SETTERS to set the values
	public void setName(String name) {
		if (!name.isEmpty()){
		  this.name=name;
		}
	}
	
	public void setAge(int age) {
		if(age>=18) {
		   this.age=age; 
		}
	}
	
	//create GETTERS to return the value of the variables
	public String getName() {
		return name;
	}
	
	public int getAge() {
	   return age;
	}
	
	
}
