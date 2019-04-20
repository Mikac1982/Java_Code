package com.class26;

public class SuperWithConstructor {

	public SuperWithConstructor(){
		System.out.println("I am a parent class constructor");
	}
	
	public SuperWithConstructor(String str){
		System.out.println("I am a parent class constructor with 1 parameter");
	}
}

class ChildSuperWithConstructor extends SuperWithConstructor{
	
	public ChildSuperWithConstructor(){
		//super(); - compiler adds it by default
		super("Hello"); //calling parent constructor with 1 parameter
		System.out.println("I am a child class constructor");
	}
}