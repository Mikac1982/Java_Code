package com.class32Again;

import java.util.Arrays;

//Create an array of Strings and using Arrays class sort the values of that array of Strings.

public class Task2 {
 
	public static void main(String[] args) {
	
	String[] stringAr= {"hello", "bye", "welcome", "thank you", "please"};	
	
	System.out.println("Array of Strings before sorting:");
	for (String word:stringAr) {
		System.out.println(word);
	}
	System.out.println();
	
	System.out.println("Array of Strings after sorting:");
	Arrays.sort(stringAr);
	for (String word:stringAr) {
		System.out.println(word);
	}
	
  
   
}
}
