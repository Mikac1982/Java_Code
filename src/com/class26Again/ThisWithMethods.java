package com.class26Again;

public class ThisWithMethods {

	
	public void m1() {
		System.out.println("I am m1 method");
	}
	
	public void m2() {
		//by default compiler adds this.
		this.m1(); //calling m1 method inside m2 method  //m1(); same
		System.out.println("I am m2 method");
	}
	
	public static void main(String[] args) {
		
		ThisWithMethods obj=new ThisWithMethods();
		obj.m2();
		
	}
}
