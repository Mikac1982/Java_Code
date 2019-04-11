package com.class17;

public class Greetings1 {

	public static void main(String[] args) {
		
		Greetings1 obj=new Greetings1();
		obj.askHowAreYou("Milena");  //ARGUMENT      
	//	obj.askHowAreYou1("Una");                           //calling just one method, only matching one 	
	}
	
	//void - return type; askHowAreYou - method name
	void askHowAreYou(String name) {
		System.out.println("How are you "+name);
	}

	void askHowAreYou1(String name) {  //parameter
		System.out.println("How are you "+name);
	}

	void askHowAreYou2(String name) {
		System.out.println("How are you "+name);
	}
}
