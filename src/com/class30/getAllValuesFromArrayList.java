package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class getAllValuesFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>(); 
		names.add("Milena");
		names.add("Lola");
		names.add("Zaki");
		names.add("Farah");
		names.add("Samir");
		
		// ways to retrieve the value:
		// 1.way using FOOR LOOP
		System.out.println("----First way using FOOR LOOP-------");
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i)); //to access the all values!
		}
		
		// 2.way using ADVANCED FOOR LOOP
		System.out.println("----Second way using ADVANCED FOOR LOOP-------");
		for (Object name:names) {
			System.out.println(name);
		}
		
		// 3.way using ITERATOR-from begging to the end, just one way
		System.out.println("----Third way using ITERATOR METHOD---------");
		
		Iterator<String> it=names.iterator(); // this method will return 1 ITERATOR OBJECT!
		//it goes inside COLLECTION class and check(iterates) if there are any elements in it: returns true/false
		//boolean check=it.hasNext(); //1. method 
		
		//iterates true each elements and getting/taking/printing (RETURN) them one by one
		while(it.hasNext()) {   //using while loop, checking until there are elements; when there is no more (false) stop.
			System.out.println(it.next()); //2. method
		}    
		//3. method is public void remove();
		
		
	}
	
	
	
	
}
