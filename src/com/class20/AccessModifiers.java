package com.class20;

public class AccessModifiers {
    
	// VARIABLES:
	private String name="John";
	String name1="Bilal";          //default variable
	protected String name2="Asha";
	public String name3="Tetiana";
	
	public static void main(String[] args) {
		
	//BEHAVIORS:
		AccessModifiers obj=new AccessModifiers();
		//protected
		System.out.println(obj.reverse("How are you?"));
		//public
		System.out.println(obj.isPalindrome("madam"));
		//private
		String[] array=obj.getWordsFromString("Have a good night students");
    	for (String word:array) {
    		System.out.println(word);
    	//default	
    	obj.sayHello();
    	}
      
	}
	// Create a method that will take 1 parameter as a String and return reversed String.
	// Method should be visibly only within same package.
    
	protected String reverse(String name) {
		
		String reversed="";
		
		for (int i=name.length()-1; i>=0; i--) {
			reversed+=name.charAt(i);
		}
		return reversed;
	}
	// Create a method that will take a String and return whether String is palindrome or not. 
	// Method should available to all classes within your projects.
	   
	public boolean isPalindrome (String str) {
		boolean flag=true;
		
		String reverse="";
		
		for (int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
		}
	    if (reverse.equalsIgnoreCase(str)) {
			flag= true;
	    }else {
			flag= false;		
	    }
		return flag;	
	}
	
  // Create a method that will take a string and return array of words from that string.
  // Method should be available only within same class.
	
	
	private String[] getWordsFromString(String str) {
		
		String[] words=str.split(" ");
		
		return words;
	}
	
	void sayHello() {
		System.out.println("Hello students");
	}
	
	
}
