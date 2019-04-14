package com.class23;

public class Addition {

	//1. OVERLOADING METHOD by changing NUMBER of parameters
	public void add(int a, int b) {
		System.out.println("Method to add 2 integers");
		System.out.println(a+b);
	}
	//we changed number of parameters to one
	public void add(int a) {  
		System.out.println("Method to add 100 to an integer");
		System.out.println(a+100);
	}
	//we changed number of parameters to 3
	public void add(int a, int b, int c) {
		System.out.println("Method to add 3 integers");
		System.out.println(a+b+c);
	}
	
	//2. OVERLOADING METHOD by changing the DATA TYPE of the parameters
	public void add(double a, double b) {
		System.out.println("Method to add 2 double values");
		System.out.println(a+b);
	}
	
	public void add(int a, double b) {
		System.out.println("Method to add 1 integer value and 1 double value");
		System.out.println(a+b);
	}

	public void add(double b,int a) {
		System.out.println("Method to add 1 double value and 1 iniger value");
		System.out.println(a+b);
	}
	
	public void add(double a, double b, double c) {
		System.out.println("Method to add 3 double values");
		System.out.println(a+b+c);
	}
	
	
	
}
