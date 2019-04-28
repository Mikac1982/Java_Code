package com.javaReview9Again;

public class MainInheritance {
String parentMethod;
	public void swapNum(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
	}
	
    public void swapWords(String a, String b) {
		a=a+b; //HelloWorld =10
    	b=a.substring(0, a.length()-b.length());  //Hello
    	a=a.substring(b.length());
    	
    	System.out.println(a+" "+b);
    	
	}
    
}
