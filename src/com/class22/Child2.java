package com.class22;

public class Child2 extends Parent{
	
	String hairType="straight";
	
	
	public static void main(String[] args) {
		
		Child2 childObject2=new Child2();
		
		System.out.println("Child 2 eye color is "+childObject2.eyeColor);
		System.out.println("Child 2 hair color is "+childObject2.hairColor);
		System.out.println("Child 2 has "+childObject2.nose+" nose");
		System.out.println("Child 2 has "+childObject2.hairType+" hair type");
		childObject2.sing();
		childObject2.coding();
		
	}

	public void coding() {
		System.out.println("I can do coding");
		
	}
	
	
	

}
