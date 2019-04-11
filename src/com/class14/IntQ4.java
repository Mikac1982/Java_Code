package com.class14;

public class IntQ4 {
   public static void main(String[] args) {
	
	// 4.How to find out the part of the string from a string?
	// What is substring? Find number of words in string?
   
	String str="Today is not a good day";
	
	String newStr=str.substring(9);
	System.out.println(newStr);      //not a good day
	
	String[] array=str.split(" ");
	
	for (String substring:array) {
	System.out.println(substring);
	
	}
	System.out.println("The number of words in string is "+array.length);  //5 words
	
 }
}