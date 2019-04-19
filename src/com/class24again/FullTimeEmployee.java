package com.class24again;

public class FullTimeEmployee extends Employee {
	
	//OVERRIDing method
	public void getPaid() {  //child class modified method, creates it's own behavior
		System.out.println("Full time employee gets paid salary and bonus");
	}
	

}
