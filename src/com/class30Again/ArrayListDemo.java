package com.class30Again;

import java.util.ArrayList; //we have to import it from java.util

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> greetings=new ArrayList<String>(); //ArrayList is a CLASS
		greetings.add("Hello"); //adding value of an Object String
		greetings.add("Welcome");
		greetings.add("Hi");
		greetings.add("Bye");  //storing the values 
		
		System.out.println(greetings.get(1)); //specifying the index of an Object we want 
		System.out.println(greetings.size()); //to find the size of an ArrayList =4
		
		//collections - growable in size
		greetings.add("How are you?");
		greetings.add("How are you?"); 
		greetings.add("How are you?"); //we can have duplicate elements
		
		System.out.println(greetings.size());


		System.out.println("--------For Loop-------");
		for (int i=0; i<greetings.size(); i++) {
			System.out.println(greetings.get(i)); //.get -> method to access all the value
		}
		System.out.println("--------Advanced Loop-------");
		for (String greetWords : greetings ) {
			System.out.println(greetWords);
		}
		
		
		
	}

}
