package com.class23;

public class Employee {

	public static String department="IT"; //STATIC VARIABLE
    int salary;  //DEFAULT
	protected int salary1;  //PROTECTED variable (for waterfall class)
    //protected method
	protected void getPaid() {
		System.out.println("Employee get's paid "+salary);	
	}
	
	//STATIC METHOD 
	public static void work() {
		System.out.println("Employee works in "+department+" department");
	}
//	private void work1() {
	// PRIVATE VARIABLES/METHODS CAN NOT BE INHERITANCED!	
//	}
	
	
	//protected method
	protected void test() {
		System.out.println("I am a protected method");
	}
	//default method
	void test1() {  
		System.out.println("I am a default method");
	}
	
	
}
