package com.class17;

public class Greetings {

	public static void main(String[] args) {
		
		Greetings obj=new Greetings();
	//	obj.hello();
	  //how to find largest number
	//	obj.findLargest(20,10);          //calling method findLargest and passing values as 20 and 10
	//	obj.findLargest(30,31);          //calling method findLargest and passing values as 30 and 31
	//	obj.findLargest(2000,  66666);  //calling method findLargest and passing values as 2000 and 6666
		
		obj.helloToInstructor("Awet");  //calling a method helloToInstructor
		obj.helloToInstructor("Arif");
		
	}
	void hello() {  //method signature(header) 
		System.out.println("Hello");  //method body (with name of method)
	}
	void helloToInstructor(String name) {  //name="Awet" //method with 1 parameter
		System.out.println("Hello "+name);  
	}
	
	void findLargest(int a, int b) {  //method with 2 parameters
		
		if (a>b) {
			System.out.println("A is larger than B");
		}else {
			System.out.println("B is larger than A");
		}
		
	}
}
