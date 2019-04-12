package com.class21;

import com.class20.AccessModifiers; //we have to import to access class from other package

public class TestAccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers obj=new AccessModifiers();
		
		obj.isPalindrome("Hello");     //accessing PUBLIC METHOD in different package
		System.out.println(obj.name3); //accessing PUBLIC VARIABLE in different package
		
	}
	
	
}
