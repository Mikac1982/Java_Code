package com.class30;

import java.util.ArrayList;

public class Task1 {

	/*Create a generic ArrayList that will store 5 names into it.
	Find out whether the given ArrayList is empty or not?
	Check whether the specific name is present in an ArrayList or not?
	Find the size of your arrayList and print all values from that
	*/
	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>(); //GENERIC LIST- specifying data type
		names.add("Milena");
		names.add("Lola");
		names.add("Zaki");
		names.add("Farah");
		names.add("Samir");
	  //names.add(33);  not possible since we have generic array list of type of String  
	
		System.out.println(names.isEmpty());	
		System.out.println(names.contains("John"));
		System.out.println(names.size());
	
	System.out.println("-------For Loop------");
	for (String allNames : names)	{
		System.out.println(allNames);
	}
	
	System.out.println("-------Advanced Loop--------");
	for (int i=0; i<names.size(); i++)	{
		System.out.println(names.get(i));
	}
		
		
	
		
		
		
		
	}
}
