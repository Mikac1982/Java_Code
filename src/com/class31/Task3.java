package com.class31;

import java.util.ArrayList;

public class Task3 {
//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Vodka");
		list.add("Beer");
		list.add("Juce");
		list.add("Viski");
		
		
	for (int i=0; i<list.size(); i++) {
		String drink=list.get(i);
		if (drink.contains("a") || drink.contains("e")) {
			list.set(i, "water");
		}
	}	
	System.out.println(list);	
		
	}
}
