package com.class31Again;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
	//Create an arrayList of words. Remove every word that ends with “e”.
	
	public static void main(String[] args) {
		
	ArrayList<String> words=new ArrayList<>();	
	words.add("home");
	words.add("school");
	words.add("Java");
	words.add("love");
	
	Iterator<String> it=words.iterator();
	while(it.hasNext()) {
		String word=it.next();
		if (word.endsWith("e")) {
			it.remove();
		}	
	}
	System.out.println(words);	
		
		
		
		
		
		
		
	}	
}
