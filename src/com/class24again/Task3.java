package com.class24again;

public class Task3 {

	//Create 1 class with a private method that has 3 overloaded forms.
	//Then call each overloaded method with specific arguments and observe result
	
	private void display(double a) {
		System.out.println("Private method with 1 double parameter: "+a);
	}
	
	private void display(double a, double b) {
		System.out.println("Private method with 2 double parameters: "+a+","+b);
	}
	
	private void display(int a) {
		System.out.println("Private method with 1 int parameter: "+a);
	}
	public static void main(String[] args) {
		
		Task3 obj=new Task3();
		obj.display(5.5);
		obj.display(3.3, 4.4);
		obj.display(22);
	}
}
