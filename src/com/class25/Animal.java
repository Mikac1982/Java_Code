package com.class25;

public class Animal {
	
    //static method can not be overriding
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
}
class Puppy extends Animal{
	  //CAN NOT OVERRIDE STATIC METHOD with INSTANCE
  //public void whoAmI() {
	//	System.out.println("I am a puppy");
	//}
}
class Monkey extends Animal{
	//static methods from the child class will be hidden from the Parent- METHOD HIDING
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
}