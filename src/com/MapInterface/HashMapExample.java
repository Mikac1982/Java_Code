package com.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		 // Creating a HashMap
		Map<String, Integer> map=new HashMap<>();
		
		//adding key-values pairs
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		
		// Add a new key-value pair only if the key does not exist in the HashMap
		map.putIfAbsent("Four", 4);
		
		System.out.println(map.keySet());    // [One, Four, Two, Three]
		System.out.println(map.entrySet());  // [One=1, Four=4, Two=2, Three=3]
		System.out.println(map.get("One"));  // 1
		
		map.remove("Two"); 
		System.out.println(map);    // {One=1, Four=4, Three=3}
		
		map.remove("One", 1);
		System.out.println(map);    // {Four=4, Three=3}

	}
}
