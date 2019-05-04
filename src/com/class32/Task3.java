package com.class32;
 //Create an HashSet of cities and add duplicates into it.
 //Retrieve all values from hashset in 2 different ways.
 //Retrieve all values in alphabetical order.

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Task3 {

	public static void main(String[] args) {
		
	HashSet<String> alist=new HashSet<>();
	alist.add("Beograd");
	alist.add("Washington DC");
	alist.add("Rim");
	alist.add("Barcelona");
	alist.add("New York");
	alist.add("Beograd");
	alist.add("Washington DC");
	System.out.println(alist);
	System.out.println(alist.size());	
	
	
	System.out.println("-------Advance For Loop--------");
    for (String city:alist)	{
		System.out.println(city);
	}
    
	System.out.println("---------Iterator--------");	
	Iterator<String> it=alist.iterator();
	while(it.hasNext())	{
		System.out.println(it.next());
	}
	
	System.out.println("-------Alphabetical order-----");
	TreeSet<String> cities=new TreeSet<>();
	//TreeSet cities = new TreeSet();
	cities.addAll(alist);
	System.out.println(cities);	
		
	}
}
