package com.class14;

public class ReplaceNum {
   public static void main(String[] args) {
	
	String str="The page not found 404" ;
	String str1="Internal server 500 error";
	
	System.out.println("BEFORE: "+str);
	
	// to remove numbers from the string
	System.out.println("The letter part is: "+str.replaceAll("[0-9]", ""));   // The page not found
	
	// to remove letters from the string 
    System.out.println("The number part is: "+str.replaceAll("[a-zA-Z]", "")); // 400
	
	
	
	// to remove letters from the string 
	System.out.println("Removed letters: "+str1.replaceAll("[a-zA-Z]", ""));  //500
	//or
	System.out.println("Removed letters: "+ str1.replaceAll("[^0-9]",""));
	
}
}
