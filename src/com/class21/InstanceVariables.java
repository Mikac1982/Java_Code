package com.class21;

public class InstanceVariables {

	protected String name="John";  //INSTANCE variable (GLOBAL) can have Access modifiers
	
    public static void main(String[] args) {
		
	String name="Anna";	
	System.out.println(name);	//Anna
	System.out.println("---Changing value of local variable----");
	name="Olga";
	System.out.println(name);  //Olga
	
	//Creating first object
	InstanceVariables obj=new InstanceVariables();
	System.out.println(obj.name);  //John
	System.out.println("--Changing value of instance variable---");
	obj.name="Jack";
	System.out.println(obj.name);  //Jack
	
	//creating second object
	InstanceVariables obj1=new InstanceVariables();
	System.out.println(obj1.name);  //John (gets copy from instance variable =John)
	
//	obj1.hello("Michael");
	}
	public void hello() {
		System.out.println("Hello "+name);
	}
	
	
	
}
