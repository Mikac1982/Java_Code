package com.SuperAndThis;

public class Super {

	
	Super(){
		System.out.println("Parent class with no parameters");	
	}
	public static void main(String[] args) {
		
			new Child();
			System.out.println("Inside main");
			
		}
}
class Child extends Super{
	
	Child(){
		
		super();
		System.out.println("Child class no parameters");
	}
	
}
