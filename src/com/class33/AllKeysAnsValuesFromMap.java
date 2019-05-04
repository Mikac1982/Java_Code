package com.class33;
import java.util.*;

public class AllKeysAnsValuesFromMap {

	public static void main(String[] args) {
		
	Map<Integer, String> map=new HashMap<>();	
	map.put(1, "A");
	map.put(2, "AA");
	map.put(3, "B");
	map.put(3, "C");	//overriding
	map.put(4, "D");	
	System.out.println(map);         // {1=A, 2=AA, 3=C, 4=D}
	System.out.println(map.size());  //4
	
	//returns a set of keys from the map
	Set<Integer> keys=map.keySet();	 //we use Set cause there is no duplicates
	
	//how to print ALL KEYS?
	System.out.println("----using Advanced For Loop-------");
	for(int key:keys) {
		System.out.println(key+":"+map.get(key)); //1 2 3 4
	}
	System.out.println();
	System.out.println("----using Iterator------");
	Iterator<Integer> it=keys.iterator();
	while(it.hasNext()) {
		Integer key=it.next();
		System.out.println(key+":"+map.get(key));
	}
	System.out.println();
	
	//How to get All VALUES?
	//return collection of values from a map
	Collection <String> valCol=map.values(); //we use Collection cause not sure which list to use
	
	System.out.println("----using For Each Loop-----");
	for (String value: valCol) {
		System.out.print(value+" ");
	}
	System.out.println();
	System.out.println("-----using Iterator----");
	
	Iterator<String> itValues=valCol.iterator();
	while(itValues.hasNext()) {
		System.out.print(itValues.next()+" ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
