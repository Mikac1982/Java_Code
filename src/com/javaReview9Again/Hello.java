package com.javaReview9Again;

public class Hello {

	/*Create a class called Hello
    * create 1 constructor with one parameter
    * create 1 constructor with two parameters
    * create 1 constructor with three parameters
    * I want you to use "this" key word and access those constructors pass values for each
    * but have one print statement for each constructor with one variable. make sure you use same data type
    */
	
	Hello(String a){
		System.out.println("I am constructor with 1 parameter "+a);
	}
	
    Hello(String a, String b){
    	this(a);
    	System.out.println("I am constructor with 2 parameters "+b);
	}
    
    Hello(String a, String b, String c){
    	this(a,b);
    	System.out.println("I am constructor with 3 parameters "+c);
	}
    
    public static void main(String[] args) {
		Hello obj=new Hello("How", "are", "you");
    	
	}
}
