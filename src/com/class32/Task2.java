package com.class32;

import java.util.Arrays;
//Create an array of Strings and using Arrays class class sort the values of that array of Strings.

public class Task2 {

	public static void main(String[] args) {
		
	String[] arrayString= {"dog", "cat", "bird","mouse", "lion", "animals"};
	
	System.out.println("Array of Strings before sorting:");
	for (String word:arrayString) {
		System.out.print(word+" ");
	}	
	System.out.println();
	
	System.out.println("Array of Strings after sorting:");
	Arrays.sort(arrayString);
	for (String words:arrayString) {
		System.out.print(words+" ");
	}
	
	
	
	
	
	}	
}
