package com.class14;

public class StringManipulations {
   public static void main(String[] args) {
	
	//1 replace() - will replace old char/value to new char/value   
	   
	String str="I am good tester#1!";
	
	String newStr=str.replace("a", "e");
	System.out.println(newStr);   
	
	String newStr1=str.replace("good", "great");
	System.out.println(newStr1);
	
   // what we are looking for to replace, new value
	String newStr2=str.replace("tester", "programer");
	System.out.println(newStr2);

	String newStr3=str.replace("Tester", "programer");  // no change because is case sensitive, did't find "Tester"
	System.out.println(newStr3);
	
	str=str.replace("!", "?");
	System.out.println(str);
	
	str=str.replace("1", "2");
	System.out.println(str);
	
	System.out.println();
	
	// 2 replaceAll()- pattern (group of numbers, group of characters) 
	//               - will replace all that matches specified pattern[regex];
	
	String str1="12Hello 3234 World 456%$%";
	
	String replacedNoNumbers=str1.replaceAll("[0-9]", "");
	System.out.println(replacedNoNumbers);     // Hello World %$%
	
	String newString=replacedNoNumbers.replaceAll("[^A-Z a-z]","");  //Hello World
	System.out.println(newString);
	
	String replacedNoCharacters=replacedNoNumbers.replaceAll("[a-zA-Z]", ""); //%$%
	System.out.println(replacedNoCharacters);
	
	String str2="1Hello123";
	str2=str2.replaceAll("[^0-9]", "");                 //replace all expect numbers = 1123
	System.out.println(str2.replaceAll("[a-zA-Z]", ""));//same thing, different way  = 1123
	System.out.println(str2);           //1123
	
	
	
}
}
