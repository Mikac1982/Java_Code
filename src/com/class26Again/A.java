package com.class26Again;

public class A {
	
  public static void main(String[] args) {
	A obj=new A();
	 obj.display();
	 obj.display(5, 7); 
}
	final void display() {
		System.out.println("Final method no constructor");
	}
	final void display(int a, int b) {
		System.out.println("Final method with 2 integer constructors-method overloading");
	}
}

class B extends A{
	//	final void display() {
    //		System.out.println("Final method no constructor");
    //	}
}
