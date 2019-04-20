package com.class25Again;

public class Animal {

	public static void whoAmI() {
		System.out.println("I am an animal");
	}	
}
class Puppy extends Animal{
	//CANNOT OVERRIDE STATIC METHOD WITH INSTANCE
	//public void whoAmI() {
	//	System.out.println("I am a puppy");
	//}	
}
class Monkey extends Animal{
	//child static method will be hidden from the parent
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
	
	
}