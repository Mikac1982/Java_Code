package com.class26;

public class Task3 {
   //Create a class in which you will have overloaded constructors.
   // Create and instance of the class that will execute both constructors.
	
	public static void main(String[] args) {
		Task3 obj1=new Task3(2,6);
	}
	
	Task3(){
		System.out.println("Constructor with no parameters");
	}
	
	Task3(int a, int b){
		this();
		System.out.println("Constructor with 2 integer parameters");
	}
	
	
}
