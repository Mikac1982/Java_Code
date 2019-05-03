package com.class31Again;

import java.util.ArrayList;

public class Task3 {
	//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
	
	public static void main(String[] args) {
		
	ArrayList<String> drinks=new ArrayList<>();
	drinks.add("coffee");
	drinks.add("soda");
	drinks.add("milk");
	drinks.add("tea");
	
    for (int i=0; i<drinks.size(); i++) { //if we work with INDEXes we use FOR LOOP
    	String drink=drinks.get(i); //accessing elements 
    	
    	if (drink.contains("a") || drink.contains("e")) {
    		drinks.set(i, "water");
    	}	
    }
    System.out.println(drinks);	
   		
	}
}
