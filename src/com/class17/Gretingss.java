package com.class17;

public class Gretingss {

	public static void main(String[] args) {
		
		Gretingss obj=new Gretingss();
		obj.hello();
   //how to find largest number
		obj.findLargest(20,10);   //calling method findLargest and passing values as 20 and 10
		obj.findLargest(33,137);  //calling method findLargest and passing values as 33 and 137
		obj.findLargest(333, 11);
		obj.helloToInstructor("Awet"); //this string is getting loaded inside variables->string name
		obj.helloToInstructor("Weqas");
		
	}
	
	void hello() {
		System.out.println("Hello");
	}
	
	void helloToInstructor(String name) {  //using parameters, passing parameters
		System.out.println("Hello "+name);
	}
	
	
	void findLargest(int a,int b) {
	//int a=10;
	//int b=20;  we hard coding our method(only comparing same numbers-10 and 20) 
		
		if (a>b) {
			System.out.println("A is larger than B");
		}else {
			System.out.println("B is larger than A");
		}
		
	}
	
	
	
}
