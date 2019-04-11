package com.class20;

public class AccessModifiers {

	public static void main(String[] args) {
	
		AccessModifiers obj=new AccessModifiers();
		
		System.out.println(obj.reverse("How are you?"));
		
		System.out.println(obj.isPalindrome("madam"));
		
		String[] array=obj.getWordsFromString("Have a good night students");
    	for (String word:array) {
    		System.out.println(word);
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
	
}
