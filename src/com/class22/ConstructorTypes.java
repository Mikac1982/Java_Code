package com.class22;

public class ConstructorTypes {

	//default constructor-no parameters
	
//	ConstructorTypes(){
//		System.out.println("I am a constructor with NO parameters");
//	}
	
	//parameterized constructor
	ConstructorTypes(String str ){
		System.out.println("I am a constructor with 1 parameter "+str);//str-local variable to a constructor
	}
	
	ConstructorTypes(int a, String str){
		System.out.println("I am a constructor with 2 parameters "+a+" and "+str);
		
	}
	
	public static void main(String[] args) { 
		
	    ConstructorTypes obj1=new ConstructorTypes("String1"); //executions jumps to line 7
		
		ConstructorTypes obj2=new ConstructorTypes("String");  //I am a constructor with 1 parameter String
		
		ConstructorTypes obj3=new ConstructorTypes(123,"String");//I am a constructor with 1 parameter 123 and String

	}
	
	
	
	
	
	
}
