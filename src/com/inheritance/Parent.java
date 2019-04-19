package com.inheritance;

/*Create a new package with name of inheritance. Then create a class called Parent. 
 * In Parent class create a constructor and have it print “i am from Parent Class” then Create a Child Class
   And then Create a constructor and have it print "I am from Child Class".
   Extend Parent to Child Class and then create an object of child class in main method in child class.
   Then see your output. 
 */

public class Parent {

	Parent(){
		System.out.println("I am from Parent Class");
	}
/*Create Methods in your Parent Class,
 * one method i want you to return a reverse method for a string with one parameter. 
 * Then create a second method same name as the reverse string but taking two string parameters. 
 * For method taking two parameters reverse(one, two)
 *  Output should be eonwot
 *  Make sure both strings are equal in length!!
 */
	
  //This will reverse 1 parameter string
  String reverseString(String str)	{
	 String reversed="";
	 
	 for (int i=str.length()-1; i>=0; i--) {
		 reversed+=str.charAt(i);
	 }
	return reversed; 
  }
  
  String reverseString(String str1, String str2) {
		String reversed="";
	//	if (str1.length()==str2.length()) {
		for (int i=str1.length()-1; i>=0; i--) {
			reversed+=str1.charAt(i);
		}
		String reversed2="";
		for (int i=str2.length()-1; i>=0; i--) {
			reversed+=str2.charAt(i);
		}
		
		return reversed+" "+reversed2;
		
  }
 
 public static void main(String[] args) {
	Parent obj=new Parent();
	System.out.println(obj.reverseString("hello"));
    System.out.println(obj.reverseString("one", "two"));
	 
}
  
  
  
  
  
  
  
  
  
  
  
  
	
}
