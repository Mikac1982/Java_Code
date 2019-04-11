package com.class13;

public class Task2 {
  public static void main(String[] args) {
	
  // Create a String and if the String is not empty perform the following:
  // if the String has an odd number of characters and has 3 or more characters,
  // print the character in the middle of the String
	  
	String str="I love nice weather";  
		
	if (!str.isEmpty()) {
		if (str.length()%2!=0 && str.length()>=3 ) {
			System.out.println("The caracter in the middele of string is "+str.charAt(str.length()/2));
		}else {
			System.out.println("String has even number of characters orr less than 3 character");
		}
	}else {
		System.out.println("String is empty");
	}
		
	
	  
}
}
