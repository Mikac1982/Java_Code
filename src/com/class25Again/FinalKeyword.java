package com.class25Again;

public class FinalKeyword{
//public final class FinalKeyword { //final class can not have a children

	public  static final String name="Syntax";
	
	public static void main(String[] args) {
		
		final String str="Hello";
	    //str="John";
		//name="School";
		
		FinalKeyword obj=new FinalKeyword();
		obj.hello(5);
	}
	
	public final void hello() {
		System.out.println("Hello from Parent class");
	}	
	public final void hello(int a) {
		System.out.println("Hello from Parent class with int parameter "+a);
	}
}
 class ChildOfFinal extends FinalKeyword{
	//CANNOT OVERRIDE FINAL METHOD
	//public final void hello() {
	//	System.out.println("Hello from Child class");
	//}
	
	
	
}