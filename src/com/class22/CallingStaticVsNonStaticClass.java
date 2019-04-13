package com.class22;

public class CallingStaticVsNonStaticClass {

	
	public static void main(String[] args) {
		
		StaticVsNonStatic obj=new StaticVsNonStatic();
		
		//accessing non static members(only true the object)
		System.out.println(obj.name);  //John
		obj.getInfo();                 //My name is John and my last name is Snow
		
		//access static members by using className they belong to
		System.out.println(StaticVsNonStatic.lastName);  //Snow
		StaticVsNonStatic.getInfo1();                    //I am a static method
		
			
		
	}
	
	
	
	
	
	
	
	
}
