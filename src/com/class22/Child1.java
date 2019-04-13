package com.class22;

public class Child1 extends Parent {
	
	String hairType="curly"; //belongs only to the child
	
	
	public static void main(String[] args) {
		
		Child1 childObjectj=new Child1();
		System.out.println("Child 1 eye color is "+childObjectj.eyeColor);
		System.out.println("Child 1 hair color is "+childObjectj.hairColor);
		System.out.println("Child 1 has "+childObjectj.nose+" nose");
		childObjectj.sing();
		
		
		Parent parentObject=new Parent();
	//	parentObject.hairType; --> not ACCESSIBLE in Parent Class
	//	parentObject.playTennnis --> not ACCESSIBLE in Parent Class
		
	}
	
	public void playTennis() {
		System.out.println("Child 1 can play tennis");
	}

}
