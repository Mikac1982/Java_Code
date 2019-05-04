package com.class32Again;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

 // Create an HashSet of cities and add duplicates into it.
 // Retrieve all values from hashset in 2 different ways.
 // Retrieve all values in alphabetical order.

public class Task3 {

	public static void main(String[] args) {
			
	HashSet<String> hset=new HashSet<>();
	hset.add("Washington");
	hset.add("Beograd");
	hset.add("New York");
	hset.add("Madrid");
	hset.add("Beograd");
	hset.add("New York");
	
	System.out.println(hset);
	System.out.println(hset.size());
	
	System.out.println("-----using Iterator-------");
	Iterator<String> it=hset.iterator();
	while(it.hasNext())	{
		System.out.println(it.next());
	}
	
	System.out.println("-------using Advanced For Loop-------");	
	for (String city:hset) {
		System.out.println(city);
	}
	
	System.out.println("------Alphabetical Order--------");
	TreeSet<String> tset=new TreeSet<>();
	tset.addAll(hset);
	System.out.println(tset);
	
	}
}
