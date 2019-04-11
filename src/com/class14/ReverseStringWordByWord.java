package com.class14;

public class ReverseStringWordByWord {
   public static void main(String[] args) {
	
	// Write a java program to reverse String? Reverse a string word by word?    
	   
	String str="Everything is going to be fine!"; //fine be to going is Everything
	
	String reversed="";
	for (int i=str.length()-1; i>=0; i--) {
		reversed+=str.charAt(i);
	}
	System.out.println("Reversed String :"+reversed);
	
	System.out.println();
	
	// the other way
	String[] array=str.split(" ");
	
	for (String word:array) {
		
	}
	System.out.println("Reversed String word by word:");
	for (int i=array.length-1; i>=0; i--) {
		System.out.println(array[i]);
	}
	   
}
}
