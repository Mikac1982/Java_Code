package com.class19;

public class StaticVariable {

	
	static int a =10;
	
	public static void main(String[] args) {
		
	  StaticVariable obj=new StaticVariable();
	  obj.a=15;
	  System.out.println(obj.a);
	  
	  StaticVariable obj1=new StaticVariable();
	  System.out.println(obj1.a);
	    
	}	
	
}
