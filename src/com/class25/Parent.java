package com.class25;

public class Parent {

	String str;
	Parent(){
		System.out.println("I am a parent constructor");
	}
}
class Child extends Parent{
	
	//WE CAN NOT OVERRIDE CONSTRUCTOR
//	Parent(){
//		System.out.println("I am a child constructor");
//	}
	int num;
	Child(){
		System.out.println("I am a child constructor");
	}
}