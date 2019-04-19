package com.class24;

public class Task3 {
      
	//Create 1 class with a private method that has 3 overloaded forms.
	//Then call each overloaded method with specific arguments and observe result
	
	
	private void display(double a) {
		System.out.println("Private method 1 double parameter: "+a);
	}
	
	private void display(String str) {
		System.out.println("Private method with 1 String parameter: "+str);
	}
	
	private void display(String str1, String str2) {
		System.out.println("Private method with 2 string parameters: "+str1+", "+str2);
	}
	
	public static void main(String[] args) {
		
		Task3 obj=new Task3();
		obj.display("not bad");
		obj.display(5.5);
		obj.display("Not bad", "at all");
		
	}
	
	
}
