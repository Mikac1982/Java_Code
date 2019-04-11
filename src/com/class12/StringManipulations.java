package com.class12;

public class StringManipulations {
   public static void main(String[] args) {
	
	// Length function or method - returns 
	  String str="Syntax";
	  
	  int lengthOfString=str.length();
	  System.out.println(lengthOfString);   //6
	   
	  String str1="Syntax Technologies";
	  
	  int lengthOf2String=str1.length();
	  System.out.println(lengthOf2String);   //19
	   
	  String str2="Welcome, students!";
	//  int lengthOf3String=str2.length();
	  System.out.println(str2.length());   //18
	 
	// convert to the Upper Case() -> convert all characters to UpperCase 
	// to LowerCase() --> convert all characters to LowerCase   
	 String str3="Hello";
	 
	 String newString=str3.toUpperCase();
	 System.out.println(newString);           //HELLO
	 
     String lowerCaseString=newString.toLowerCase();
	 System.out.println(lowerCaseString);     //hello
	  
	//equals() --> compare 2 strings, if strings are equal -->TRUE, else-->FALSE
	 String str4="Hello";
	 String str5="hello";
	 
	 boolean equality=str4.equals(str5);  //false
	 System.out.println(equality);
	 
	// equalsIgnoreCase() _ compares 2 strings but ignores case (just cares about matching values)
	 String expectedBrowser="Chrome";
	 String actualBrowser="CHROME";
	 
	 boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);  //true
	 System.out.println(equals);
	 
	 
}
}
