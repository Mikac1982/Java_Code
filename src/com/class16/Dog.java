package com.class16;

public class Dog {

	//Create a Dog Class and create 3 different objects of it:
	//Husky, Bulldog, Labrador  with specific  attributes and behaviours.
	
   String breed, color, size;
   int age;
   
	public static void main(String[] args) {
	
	Dog dog1=new Dog();
	
	dog1.breed="Buldog";
	dog1.age=3;
	dog1.color="Braon";
	dog1.size="Large";
	
	dog1.bark();
	dog1.play();
	dog1.sleep();
	
	System.out.println();
	Dog dog2=new Dog();
	
	dog2.breed="Labrador";
	dog2.age=2;
	dog2.color="Golden";
	dog2.size="Large";
	dog2.bark();
	dog2.play();
	dog2.sleep();
	
	System.out.println();
	Dog dog3=new Dog();
	
	dog3.breed="Husky";
	dog3.age=5;
	dog3.color="White";
	dog3.size="Medium";
	
	dog3.bark();
	dog3.play();
	dog3.sleep();
		
	}
	
	void bark() {
		System.out.println(breed+" can bark all day long");
	}
	void play() {
		System.out.println(breed+" likes to play with kids");
	}
	void sleep() {
		System.out.println(breed+" sleeps most of the time");
	}
	
}
