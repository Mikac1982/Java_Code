package com.class15;

public class IQ1 {
   public static void main(String[] args) {
	
   // Write a program to swap 2 numbers without a temporary variable? Swap 2 strings without a temporary variable?    
	   
	int a=10; 
	int b=20;
	// numbers --> arithmetic operations
    a=a+b;  //30
	b=a-b;  //30-20=10
	a=a-b;  //30-10=20
	
	System.out.println("The value of a="+a+", value of b="+b);
	
	// String (manipulations)
	
	String str1="Hello";
	String str2="World"; //length=5
	
//	str1=str1+str2;  //HelloWorld --> 10
//	str2=str1.substring(0,str1.length()-str2.length());  //10-5=5 Hello
//	str1=str1.substring(str2.length());
	
	str1=str1+str2;
    str2=str1.replaceAll(str2,"");
    str1=str1.replaceAll(str2, "");
    
	System.out.println("the value of str1="+str1+" value of str2="+str2);
	
	   
}
}
