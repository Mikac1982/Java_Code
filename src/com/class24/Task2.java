package com.class24;

public class Task2 {

	// Create 1 class with a static method that has 3 overloaded forms.
	// Then call each overloaded method with specific arguments and observe result.
	
	
	public static void display(int a) {
		System.out.println("Static method with 1 intiger parameter: "+a);
	}
	
	public static void display(int a, int b) {
		System.out.println("Static method with 2 intiger parameter: "+a+","+b);
	}
	
	public static void display(String str) {
		System.out.println("Static method with 1 String parameter: "+str);
	}
	
	
	public static void main(String[] args) {
		display(55);
		display(34,56);
		display("Heloo there");
	}
	
}
