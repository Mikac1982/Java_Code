package com.class26Again;

public class EmployeeTest {

	public static void main(String[] args) {
		//creating object of a child class
		//we have to pass 3 arguments
		Tester tester=new Tester("John","Snow",105000);//calling child constructor Tester
		tester.displayDetails();	//calling the method
		
		
	}
	
	
}
