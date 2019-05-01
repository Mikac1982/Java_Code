package com.class30;

public class WrapperClass {

	public static void main(String[] args) {
		
		  // BOXING-converting primitive data type into Object
		Integer integer1=new Integer(10); //storing the value of 10
		System.out.println(integer1);     //
		Integer integer2=10; //AutoBoxing-compiler do it
		
		
		//UNBOXING-taking out primitive data type
		int num=integer1.intValue();
		System.out.println(num);
		
		int num2=integer2; //AutoUnboxing
		
		
	}

}
