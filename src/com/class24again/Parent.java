package com.class24again;

public class Parent {

	public void love() {
		System.out.println("Parents love");
	}
	public void work() {
		System.out.println("Parents work");
	}
	
	public static void main(String[] args) {
		String a;
		a="10";
		
		double d=12; //we can put integer(smaller size) in the double(bigger) box
	//	int b=5.5;   //not possible cause double is bigger than integer 
		
	Parent parent=new Parent();	//creating an object of Parent class; reference variable(type of parent) - assigning the object
	parent.love();         
	parent.work();
	
	Child child=new Child();  //creating an object of Child class; reference variable (type of child)
	child.love(); //overriding method
	child.cry();
	child.work();
	
	//TYPE CASTING- smaller objects we /put in the bigger box
	
    Parent obj=new Child();  //creating a CHILD object, giving the reference to the PARENT
	obj.love(); //CHILD love -- overriding method, you can take it from the child class--common method
	obj.work(); //Parents work
//	obj.cry();  NOT ACCESSIBLE cause parent is taking the reference, but do not have access the child class
	
//	Child obj2=new Parent();  NOT POSIBLE
	}	
}

class Child extends Parent{
	public void love() {   //method overriding 
		System.out.println("Child love");
	}
	public void cry() {
		System.out.println("Child cry");
	}
}


