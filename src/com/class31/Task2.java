package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
//Create an arrayList of words. Remove every word that ends with “e”.
	
	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<>();
		
		list.add("Home");
		list.add("School");
		list.add("Love");
		list.add("Java");
		
      Iterator<String> it=list.iterator();
      while(it.hasNext()) {
    	  String word=it.next();
    	  if (word.endsWith("e")) {
    		  it.remove();
    	  }
      }
      System.out.println(list);
		
		
		
	
	
	
	
	
	
	
	
	}
}
