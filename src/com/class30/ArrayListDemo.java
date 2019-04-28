package com.class30;

import java.util.ArrayList; //we have to import from java.util

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//using this class we are trying to represent group of ...
		ArrayList<String> greetings=new ArrayList<String>();  //GENERIC LIST
		greetings.add("Hello"); //storing values based on intex
		greetings.add("Welcome");
		greetings.add("Hi");
		greetings.add("Bye");
		
		System.out.println(greetings.get(1)); //Welcome
		System.out.println(greetings.size());  //size of an Array = 4
		
		//COLLECTIONS- growable in size! 
		greetings.add("How are you?"); //allows you duplicate 
		greetings.add("How are you?");
		greetings.add("How are you?");
		
		System.out.println(greetings.size()); //4+3=7
		
		System.out.println("-------For Loop-------");
		for (int i=0; i<greetings.size(); i++) {  //the way we stored that way it print it
			System.out.println(greetings.get(i));
		}
		System.out.println("------Advanced Loop--------");
		for(String greetWords :greetings) {
			System.out.println(greetWords);
		}
		
	}
	
	
	
	
	
	
}
