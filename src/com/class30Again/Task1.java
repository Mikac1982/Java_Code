package com.class30Again;

import java.util.ArrayList;

public class Task1 {
	/*Create a generic ArrayList that will store 5 names into it.
	Find out whether the given ArrayList is empty or not?
	Check whether the specific name is present in an ArrayList or not?
	Find the size of your arrayList and print all values from that
	*/
	
public static void main(String[] args) {
	
	//GENERIC LIST- specifying data type (of String)
	ArrayList<String> names=new ArrayList<String>(); //arrayList type of String
	names.add("Mika");
	names.add("Una");
	names.add("Milica");
	names.add("Nata");
//	names.add(123); can NOT store integer into ArrayList of String type
                   //not possible since we have generic array list of type of String 	
	
	System.out.println(names.isEmpty());
	System.out.println(names.contains("Mika"));
    System.out.println(names.size());
    
    for (String getAll : names) {
    	System.out.println(getAll);
    }
	
    for (int i=0; i<names.size(); i++) {
    	System.out.print(names.get(i)+" ");
    }
	
	
	
	
	}	
}
