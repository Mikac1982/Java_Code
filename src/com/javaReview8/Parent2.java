package com.javaReview8;

//Create class Parent, create a constructor of parent and have constructor print "This is a Constructor".
// Call class within Parent class

public class Parent2 {
    
	int age;
	String name;
	boolean b;
	
	private Parent2(){
	//	System.out.println("This is constructor");
		age=123;
		name="John";
		b=true;
		System.out.println("I am parent "+age+" "+name+" "+b);
				
	}
	
	public static void main(String[] args) {
		Parent2 parent=new Parent2();
		parent.age=1;
		System.out.println(parent.age);
		
		Parent2 newOb=new Parent2();
		//parent.age=1;
		System.out.println(newOb.age);
	
	//create 3 instance variables in class parent 
	//and then assign values for those instance variables in your constructor class, 
	//then print those values in your main method by creating the object
	
//	System.out.println(obj.age);
//	System.out.println(obj.name);
//	System.out.println(obj.b);
	}
	
	
}
