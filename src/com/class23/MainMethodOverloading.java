package com.class23;

public class MainMethodOverloading {
    
	//Java will executed this one, if we run it
	public static void main(String[] args) {
		System.out.println("I am main method with string argument array");
		main();
		main("Hello");
		main(10);
	}
	
	public static void main() {
		System.out.println("I am main method with no parameters: ");
	}
	
	public static void main(String args) {
		System.out.println("I am main method with 1 String parameters: "+args);
	}
	
	public static void main(int a) {
		System.out.println("I am main method with int parameters: "+a);
		
	}
	
	
}
