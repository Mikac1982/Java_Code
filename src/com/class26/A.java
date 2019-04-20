package com.class26;

// Write program in class A has final display method and try overload
// and override this method and observe result .

public class A {

	public final void display() {
		System.out.println("Final method");
	}
	
	public final void display(int a) {  //method overloading
		System.out.println("Final method with parameters");
	}
}
//class B extends A{
	
//}