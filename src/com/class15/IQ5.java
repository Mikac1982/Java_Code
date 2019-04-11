package com.class15;

public class IQ5 {
   public static void main(String[] args) {
	   
	//5. Write a java program to reverse String? Reverse a string word by word?
	   
	String str="The master is speaking";     //??????????/
	
	String reverse="";
	for (int i=str.length()-1; i>=0; i--) {
		reverse =reverse+str.charAt(i);
	}
	String[] words=reverse.split(" ");
	for (int i=words.length-1; i>0; i--) {
		System.out.println(words[i]+" ");
	}
	
}
}
