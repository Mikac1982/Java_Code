package com.class14;

public class IntQ1 {
  public static void main(String[] args) {
	
 // Write a program to swap 2 numbers without a temporary variable? Swap 2 strings without a temporary variable?  
	  
	int a=5;
	int b=15;
	
	a=a+b;  // 5+15=20
	b=a-b;  // 20-15=5
	a=a-b;  // 20-5=15
	
	System.out.println("After swap the value of a="+a+", value of b="+b);
	
	System.out.println();
	
	String str1="Hello";  //5
	String str2="World";  //5
	
	str1=str1+str2;   //HelloWorld-->10
	str2=str1.substring(0, str1.length()-str2.length());  //Hello
	str1=str1.substring(str2.length());
	
	System.out.println("The value of str1="+str1);
	System.out.println("The value of str2="+str2);
	
	
}
}
