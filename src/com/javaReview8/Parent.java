package com.javaReview8;

public class Parent {

	int a;
	
	Parent(){
	//	a=12;  
		System.out.println("I am parent class");
	}
	Parent(int a, String b){
		System.out.println(a+b);
	}
	Parent(String a, int b){
		
	}
	static void instanceVariable() {
	//	a=1234; we can not access instance variable in static method
		System.out.println("I am static");
	}
	
	private String privateString() {
		return "This is private";
	}
	
	protected int protectedInt() {
		return 0;
	}
	//default method
	void noReturn() {
		System.out.println("I am default");
	}
	
	
	
	
	
	
}
