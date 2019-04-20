package com.SuperAndThis;

public class SuperDemo {

	public static void main(String[] args) {
		
	B obj=new B(7);
	
	}
}

class A{
	
	public A() {
		System.out.println("in A");
	}
	public A(int a) {
		System.out.println("in A with int");
	}
}

class B extends A{
	
	public B() {
		super();
	    System.out.println("in B");
	}
	public B(int a) {
		super(6);
	    System.out.println("in B with int");
	}
	

	
}