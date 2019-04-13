package com.class22;

public class Car {

	public static String make="Toyota";
	String color;  //declaring instance variable
	String model;
	int doors;
	boolean engine;
	
	//constructor with no parameters
	Car() {     // Constructor is inside the CLASS!  this is DEFAULT(no parameters)
		System.out.println("I am constructor"); 
		System.out.println("Hello from constructor");
	}
	
	public static void main(String[] args) {
		
	    Car obj=new Car();  //new Car() - when we create an object constructor is called automatically (by default)
		
		//Car   - CLASS NAME
		//obj   - REFERENCE NAME/OBJECT NAME
		// =    - ASSIGNING OPERATOR
		//NEW   - KEYWORD THAT CREATES AN OBJECT
		//Car() - CONSTRUCTOR	
		
	    // constructor will initialize Object and it will give deafult value to any global variable 
	    // that was not initialized 
	    
	    System.out.println(obj.color);   //null
	    System.out.println(obj.doors);   // 0
	    System.out.println(obj.engine);  //false
	//	hello(); //I am static hello method

	}
	
	public static void hello() { 
		//before using local variable we have to initialize it 
		String name;
	//	System.out.println(name); compalier will give an error 
		
		System.out.println("I am static hello method");
	}
	
	
	
	
	
	
	
	
	
	
}
