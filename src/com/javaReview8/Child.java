package com.javaReview8;

public class Child extends Parent{

	Child() {
		System.out.println("I am from Child"); //I am parent class
		                                       // I am from Child
	}
	
	
	public static void main(String[] args) {
		
	//	Parent obj1=new Parent();           //this when we do not extends
	//	Parent obj2=new Parent(1,"Hello");
		
	    Child child=new Child();	
	//	child.a=1234;  //12
		System.out.println(child.a);  //1234
		
		Parent.instanceVariable();
		Child.instanceVariable();
	//	child.privateString(); private is not accessible in other class
		child.protectedInt();
		child.noReturn();
	}
	
}
