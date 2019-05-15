package com.class36;

public class StringIsImmutable {

	public static void main(String[] args) {
		
		//2 ways to create a String:
		
		//1 way - using String literal
		String str="Hello";              //string is not changeable
		
		//2 way 
		String str2=new String("Bye");
		
	//  str.toUpperCase(); we have to resign completely object	
		
		str=str.toUpperCase();    //string is not changing, but new object is getting created,assigning to str variable
		str=str.replace("O", "a"); 
		
		System.out.println(str); //Hello
		
		
	}
}
