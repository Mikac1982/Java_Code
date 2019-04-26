package com.javaReview9Again;

public class Childinheritance extends MainInheritance{
	
public void swapNum(int a, int b) {
		
		System.out.println(a);
		System.out.println(b);
	}
	
    public void swapWords(String a, String b) {
		
    	System.out.println(a+" "+b);
	}
    
    void parentNum(int a, int b) {
    	super.swapNum(a, b);
    }
    
    void parentString(String a, String b) {
    	super.swapWords(a, b);
    }
    
    public static void main(String[] args) {
		Childinheritance obj=new Childinheritance();
		obj.parentNum(5, 10);
    	obj.parentString("hello", "bye");
    	
	}
    
    
}
