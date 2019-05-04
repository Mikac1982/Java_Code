package com.class33;
import java.util.*;
public class Task4 {
	// Create a map of Best Buy store. 
	// Place item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
	// Print all keys and values from a Best Buy map using EntrySet.
	
	public static void main(String[] args) {
		
		Map<Integer, String> storeMap=new LinkedHashMap<>();
		storeMap.put(101, "Printer");
		storeMap.put(102, "Screen");
		storeMap.put(103, "Mouse");
		storeMap.put(104, "iPhone");
		
	//	storeMap.entrySet();
		
		System.out.println("----------Using For Each Loop:");
		
		for (Map.Entry<Integer,String> entry : storeMap.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		System.out.println("----------Using Iterator:");
		
		Iterator<Map.Entry<Integer,String>> smIt=storeMap.entrySet().iterator();
		while (smIt.hasNext()) {
			Map.Entry<Integer, String> el=smIt.next();
			System.out.println(el.getKey()+"="+el.getValue());
		}
		
	}
	
	
}
