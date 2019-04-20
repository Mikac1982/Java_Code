package com.class26;

public class ThisWithMethods {

	public void m1() {
		System.out.println("I am m1 method");
	}
	
	public void m2() {
		m1(); //calling m1 method inside m2 method  //I am m1 method
		System.out.println("I am m2 method");            //I am m2 method
	}
	
	public static void main(String[] args) {
		
		ThisWithMethods obj=new ThisWithMethods();
		obj.m2();
		
	}
	
}
