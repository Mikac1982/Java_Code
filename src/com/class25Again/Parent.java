package com.class25Again;

public class Parent {
    
	String str;
	Parent(){
		System.out.println("I am a parent constructor");
	}
	
}
class Child extends Parent{
	
	//Parent(){
	//	System.out.println("I am a child constructor");
	//}
	int num;
	Child(){
		System.out.println("I am a child constructor");
	}
}