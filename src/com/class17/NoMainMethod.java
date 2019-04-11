package com.class17;

public class NoMainMethod {
	
   //variable and methods are called MEMBER OF THE CLASS
	String str;  //variables or DATA MEMBERS
	int num;
	
	void hello() {
		System.out.println("Hello");
		System.out.println("Hello friends");
	//	System.out.println("Hello");
	//	System.out.println("Hello friends");
	}
	void bye() {
		System.out.println("Bye");
	}
	
	public static void main(String[] args) {  //method signature 
		
		NoMainMethod obj=new NoMainMethod();  // method body
		obj.hello();     //we are CALLING a method hello (trying to access, to use a method)
		obj.bye();
	}
	
	void howAreYou() {
		System.out.println("How are you?");
	}
	
	
	
	
}
