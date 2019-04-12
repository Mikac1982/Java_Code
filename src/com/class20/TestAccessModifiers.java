package com.class20;

public class TestAccessModifiers {

	public static void main(String[] args) {
		
		//accessing AccessModifiers class
	AccessModifiers obj=new AccessModifiers();
	
	obj.isPalindrome("madam");     //accessing PUBLIC method within same package
	obj.reverse("hello");	       //accessing PROTECTED method within same package
	obj.sayHello();	               //accessing DEFAULT method within same package
//	obj.get.getWordsFromString();  //PRIVATE method is NOT accessible within same package                   //
		
	
	System.out.println(obj.name1); //accessing default variable
	System.out.println(obj.name2); //accessing protected variable
	System.out.println(obj.name3); //accessing Public variable
//  obj.name()	;   can not access private variable
	}
}
