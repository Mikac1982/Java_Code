package com.class36;

public class Task2 {

	public static void main(String[] args) {
		
	//How would you reverse a string?	
	//Using reverse function	
	//Without using reverse function	
		
	String str="Sunday";
	
	//1. using reverse function
	StringBuffer sb=new StringBuffer("Sunday");
	System.out.println(sb.reverse());
		
	//2. without using reverse function
	
	//a- using charAt();	
	String reversed1="";
	
	for (int i=str.length()-1; i>=0; i--) {
		reversed1=reversed1+str.charAt(i);
	}
	System.out.println(reversed1);
	
	//b - using to charArray():
	String reversed2="";
	char[] array=str.toCharArray();
	
	for (int i=str.length()-1; i>=0; i--) {
		reversed2+=array[i];
	}
	System.out.println(reversed2);
	
	
	 //c - using substring();
	String reversed3="";
	
	for (int i=str.length(); i>0; i--) {
		reversed3=reversed3+str.substring(i-1,i);
	}
	System.out.println(reversed3);
	
	
	//Reverse a string word by word:
	
	String str2="Today is very cold";
	String reverse="";
	String[] word=str2.split(" ");
	
	for (int i=word.length-1; i>=0; i--) {
		reverse=reverse+word[i]+" ";
	}
	System.out.println(reverse);
	
	
}
}
