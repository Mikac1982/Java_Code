package com.class14;

public class IntQ3 {
public static void main(String[] args) {
	
	// 3. Find out how many alpha characters present in a string?
	
	String str="12aaa34**bbbb";
	
	String replaced=str.replaceAll("[^a-zA-Z]", "");
	System.out.println("Number of alpha characters is "+replaced.length());
	
	
}
}
