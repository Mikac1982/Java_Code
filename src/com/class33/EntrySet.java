package com.class33;
import java.util.*;

public class EntrySet {

	public static void main(String[] args) {
		
	Map<String, Integer> classromMap=new LinkedHashMap<>();	
	classromMap.put("Table", 20);	  //Entry<Key, Value>
	classromMap.put("Chairs", 60);    //Entry<String, Integer>
	classromMap.put("Screen", 3);
	classromMap.put("Student", 60);
	classromMap.put("Instructor", 3);
		
	System.out.println(classromMap);	
	//classromMap.entrySet(); //to collect all the entries
	
	System.out.println("----------Using For Each Loop:");
	for (Map.Entry<String,Integer> entry:classromMap.entrySet()) {
		//these methods accessible through entry object:
		System.out.println(entry.getKey()+"="+entry.getValue()); //
	}
	
	System.out.println("----------Using Iterator:");
	Iterator<Map.Entry<String, Integer>> classRomIt=classromMap.entrySet().iterator();
	while(classRomIt.hasNext()) {
		Map.Entry<String, Integer> me=classRomIt.next();
		System.out.println(me.getKey()+"="+me.getValue());
	}
	
	
	
	
	
	
	
	}
}
