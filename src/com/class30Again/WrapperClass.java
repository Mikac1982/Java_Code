package com.class30Again;

public class WrapperClass {

	public static void main(String[] args) {
		//BOXING - converting primitive data type into Object
		Integer integer1=new Integer(10);
		System.out.println(integer1);   //10
		
		Integer integer2=20; //AUTOBOXING -compiler do it automatically
		System.out.println(integer2);
		
		//UNBOXING - taking out primitive data type from an Object
		int num=integer1.intValue();  //method that is doing that
		System.out.println(num);
		
		int num2=integer2; //AUTO-UNboxing
        System.out.println(num2);
        
        
		Double double1=new Double(5);
		System.out.println(double1);
		
		double num1=double1.doubleValue();
		System.out.println(num1);
		
		
		
		
	}
	
	
	
	
	
	
}
