package com.class21;

public class LocalVariables {

	String name;
	String lastName;
	
	
	public static void main(String[] args) {
		
		String name="John";        //visible just inside this method
	//	System.out.println(name);  //John
		
		LocalVariables obj=new LocalVariables();
		obj.hello(name);    //Hello(+)John -->hello Jack
		System.out.println(name);  //refers to main method
	}
	
	public void hello(String name) {    //local variable to hello method
		name="Jack";
		System.out.println("Hello "+name); 
		
		
	}
	
	
	
	
}
