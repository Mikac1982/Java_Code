package com.class33Again;
import java.util.*;
public class AllKeysAndValuesFromMap {

	public static void main(String[] args) {
		
	Map<Integer, String> map=new HashMap<>();
	map.put(1, "A");
	map.put(2, "AA");
	map.put(3, "B");
	map.put(3, "C");	//overriding-> replacing old value B with new value C
	map.put(4, "D");	
	System.out.println(map.size()); //4 
	System.out.println(map);        //{1=A, 2=AA, 3=C, 4=D}
	
	//HOW TO GET ALL KEYS??
	//returns set of keys from the map	
	Set<Integer> keys=map.keySet();	 //return type -> Set
	
	System.out.println("----------using Iterator:");
	for (Integer key:keys) {
		System.out.println(key+"="+map.get(key)); //1 2 3 4
	}
	System.out.println();
	System.out.println("----------using For Each Loop:");
	Iterator<Integer> it=keys.iterator(); //iterator belongs just to collection, not to map
	while(it.hasNext()) {
		Integer key=it.next(); //get element , return Integer
		System.out.println(key+"="+map.get(key));
	}
	System.out.println();
	
	//HOW TO GET ALL VALUES?
	//return collection of values from a map
	Collection<String> val=map.values();  //return type -> Collection
	
	System.out.println("----------using For Each Loop:");
	for(String value:val) {
		System.out.print(value+", ");
	}
	System.out.println();
	System.out.println("----------using Iterator:");
	Iterator<String> itVal=val.iterator();
	while(itVal.hasNext()) {
		System.out.print(itVal.next()+", ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
