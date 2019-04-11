package com.class20;

public class AccessModifiers2 {
	
    public static void main(String[] args) {
    	
    	AccessModifiers2 obj=new AccessModifiers2();	
    	//1.
    	String reversed=obj.reverseString("How are you?");
    	System.out.println(reversed);
    	//2.
        boolean isPalindrome=obj.isPalindrome("madam");
    	System.out.println(isPalindrome);
    	//3.
    	String[] array=obj.getWordsFromString("Have a good night students");
    	for (String word:array) {
    		System.out.println(word);
    	}
    	System.out.println("----------------------");
    	
    	for (int i=0; i<array.length; i++) {
    		System.out.println(array[i]);
    	}
    }     
    // Create a method that will take 1 parameter as a String and return reversed String.
    // Method should be visibly only within same package.	
    	
    protected String reverseString(String str)	{
    	String reversed="";
    	
    	for (int i=str.length()-1; i>=0; i--) {
    		reversed=reversed+str.charAt(i);
    	}
    	return reversed;
    }

    // Create a method that will take a String and return whether String is palindrome or not. 
 	// Method should available to all classes within your projects.
    
    public boolean isPalindrome(String str) {
    	boolean flag=true;
    	
    //  String reversed="";                      // we have this code in reverseString method so we will use that method
    //	for (int i=str.length()-1; i>=0; i--) {  // instead of reputing same lines
    //		reversed=reversed+str.charAt(i);
    //	}
    	String reversed=reverseString(str);     // we are calling method reverseString within this method isPalindrome
    	                                        // we are storing return value reversed in String
    	if (reversed.equalsIgnoreCase(str)) {
    		flag= true;
    	}else {
    		flag=false;
    	}
    	return flag;
    }
    
    // Create a method that will take a string and return array of words from that string.
    // Method should be available only within same class.
    
    private String[] getWordsFromString (String str) { //method returns an Array of String
    	
    	String[] words=str.split(" ");
    	return words;
    }
    
    
    
}