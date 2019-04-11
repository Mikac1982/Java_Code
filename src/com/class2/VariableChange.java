package com.class2;

public class VariableChange {

	public static void main(String[] args) {

		String name="John";
		name="Adam";
		//String name="Adam"; do not work
		
		String lastName="Smith";
		lastName="Douglas";
		
		char grade='B';
		grade='A';
		// char grade='A'; do not work!
		
		
		String city="Washington";
		city="New York";    //value of variable is changed!
		
		String state="DC";
		state="NY";
			
		long phoneNumber=1234567890l;	
		phoneNumber=987654321;
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
	
		
		
		
	}
}
