package com.class26Again;

public class SuperWithConstructor {

    SuperWithConstructor() {
		System.out.println("I am a parent class constructor");
	}
    SuperWithConstructor(String str) {
		System.out.println("I am a parent class constructor with 1 parameter");
	}
}

class ChildOfSuperWithConstructor extends SuperWithConstructor{
	
	ChildOfSuperWithConstructor(){
		//super(); - compiler adds it by default
		super("Hello");//calling constructor with 1 string parameter
	    System.out.println("I am Child class constructor");
	} 
}
