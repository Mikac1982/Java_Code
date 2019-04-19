package com.rep116;

public class Main {

	
	public static void main(String[] args) {
		
		Employee obj1=new Employee();
		obj1.name="Joe";
		obj1.age=35;
		obj1.salary=35000;
		obj1.print1();
		
		Student obj2=new Student();
		obj2.name="Adam";
		obj2.age=15;
		obj2.grade=10;
		obj2.print2();
		
		
		Retiree obj3=new Retiree();
		obj3.name="Frank";
		obj3.age=15;
		obj3.seniorActivity="tour";
		obj3.print3();
	}
	
	
	
	
	
}
