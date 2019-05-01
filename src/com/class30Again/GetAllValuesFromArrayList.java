package com.class30Again;

import java.util.ArrayList;
import java.util.Iterator;

public class GetAllValuesFromArrayList {

	public static void main(String[] args) {
		
		ArrayList <String> names=new ArrayList<String>(); //arrayList type of String
		names.add("Mika");
		names.add("Una");
		names.add("Milica");
		names.add("Nata");
		names.add("Dragana");
	
	//1. way using For Loop:
	System.out.println("----First way using FOR LOOP-------");
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
	//2. way using Advanced Loop:
	System.out.println("----Second way using ADVANCED FOOR LOOP-------");
		for(Object name : names) {  //or we can use String
			System.out.println(name);
		}
	
	//3. way using ITERATION: 
		System.out.println("----Third way using ITERATOR method-------");
	
	    Iterator <String> it=names.iterator(); //this method will return 1 ITERATOR OBJECT!
	    //goes inside collection and check(iterates) if there are any elements inside it/returns true-false and print them
	   // boolean check=it.hasNext();  //1. method inside Iteration
	
	  //iterates true each elements and getting/taking/printing (RETURN) them one by one
	   while(it.hasNext()) {
		   System.out.println(it.next()); //2.method
	   }
	
	   
	   
	   
	   
	   
	   
	   
	   
	}
}
