package com.class2;

public class Variable {
	public static void main(String[] args) {

		String name="John";
		String lastName="Smith";
		String grade="B";
		String city="Washington";
		String state="DC";
		long phoneNumber=1234567890l;

		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);

		// My name is __ and my last name is __.
		// I am __ student.
		// I live in city of __ in a state of __.
		// My phone number is ____.

		System.out.println("My name is " + name + " and my last name is " + lastName + ".");
		System.out.println("I am " + grade + " student.");
		System.out.println("I live in city of " + city + " in a state of " + state + ".");
		System.out.println("My phone number is " + phoneNumber+".");

	}
}
