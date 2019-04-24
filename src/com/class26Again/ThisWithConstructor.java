package com.class26Again;

public class ThisWithConstructor {
    //this() calls current class constructor --> CONSTRUCTOR CHAINING
	ThisWithConstructor() {
		System.out.println("I am inside constructor with no parameters"); //1.line to be executed
		System.out.println("I have no parameters");                       //2.line to be executed
	}
	                    //Hello
	ThisWithConstructor(String str) {
		this(); //calling constructor with no parameters -> line 5
		System.out.println("I am inside constructor with 1 parameter");   //3.line to be executed
		System.out.println("I have 1 string parameter "+str);             //4.line to be executed
	}
	
	ThisWithConstructor(String str1, String str2) {
		this(str1); //=Hello    //calling constructor with 1 string parameter ->line 10
		System.out.println("I am inside constructor with 2 parameters");    //5.line to be executed
		System.out.println("I have 2 string parameters "+str1+" "+str2);    //6.line to be executed
	}
	
	public static void main(String[] args) {
		
	//	ThisWithConstructor obj1=new ThisWithConstructor();
	//	ThisWithConstructor obj2=new ThisWithConstructor("Hello");
		
		ThisWithConstructor obj3=new ThisWithConstructor("Hello", "Bye"); //calling constructor with 2 string arguments ->line 16
		
		
	}
}
