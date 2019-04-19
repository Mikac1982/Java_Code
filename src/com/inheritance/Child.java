package com.inheritance;

public class Child extends Parent{

	Child(){
	//	for (int i=0; i<10; i++) {
	//		System.out.println("I am from Child Class");
	//	}
		System.out.println("I am from Child Class");
	}
	
	public static void main(String[] args) {
		Child obj=new Child();
		System.out.println(obj.reverseString("Hello"));
		System.out.println(obj.reverseString("one", "two"));
		
		
		
	}
}
   //child constructor also inheritance parent class as well
   //purpose of constructor is initailazing 