package com.class22;

public class Child1 extends Parent {
	
	String hairType="curly"; //belongs only to the child
	
	
	public static void main(String[] args) {
		
		Child1 childObject=new Child1();
		
		System.out.println("Child 1 eye color is "+childObject.eyeColor);
		System.out.println("Child 1 hair color is "+childObject.hairColor);
		System.out.println("Child 1 has "+childObject.nose+" nose");
		childObject.sing();
		childObject.playTennis();
		
		Parent parentObject=new Parent(); //CREATING OBJECT OF A PARENT CLASS
	//	parentObject.hairType;   --> not ACCESSIBLE in Parent Class, JUST to the child
	//	parentObject.playTennnis --> not ACCESSIBLE in Parent Class
		
	}
	
	public void playTennis() {
		System.out.println("Child 1 can play tennis");
	}

}
