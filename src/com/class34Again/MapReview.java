package com.class34Again;
import java.util.*;

public class MapReview {
	//Create a map of grocery products and it is quantity
	public static void main(String[] args) {
		
	Map<String, Integer>map=new LinkedHashMap<>();	
	map.put("milk", 1);	
	map.put("bread", 2);	
	map.put("eggs", 12);	
	map.put("coffee", 2);	
	map.put("poteto", 2);	
	map.put("cookies", 3);		
	System.out.println(map);	//{milk=1, bread=2, eggs=12, coffee=2, poteto=2, cookies=3}
	
	map.put("cheese",1);	
	System.out.println(map.size()); //7
	
	map.replace("eggs", 18);
	System.out.println(map);	
	
	map.remove("cheese");
	System.out.println(map); //{milk=1, bread=2, eggs=18, coffee=2, poteto=2, cookies=3}
	
	//retrieving ALL KEYS+VALUES using KEYSET();
//	Set<String> keySet=map.keySet(); //returns a Set of keys from Map
	
//	System.out.println("----using Advanced For Loop-------");
//	for(String key:keySet) {
//		System.out.println(key+"=="+map.get(key));
//	}
//	System.out.println("----using Iterator------");
//	Iterator<String> it=keySet.iterator();
//	while(it.hasNext()) {
//		String key= it.next();
//		System.out.println(key+"=="+map.get(key));
//	}
	
	//using it directly (without storing Set inside variable) 
	System.out.println("----using Advanced For Loop-------");
	for(String key:map.keySet()) {
		System.out.println(key+"=="+map.get(key));
	}
	System.out.println("----using Iterator------");
	Iterator<String> it=map.keySet().iterator();
	while(it.hasNext()) {
		String key=it.next();
		System.out.println(key+"=="+map.get(key));
	}
	
	//retrieving ALL VALUES using:
	System.out.println("----------All Values using For Ecah Loop------");
	
//	Collection<Integer> val=map.values();
//	for(Integer values:val) {
//		System.out.print(values+" ");
//	}
	for (Integer value : map.values()) { //using it directly
		System.out.print(value+", ");
	}
	System.out.println();
	System.out.println("----All Values using Iterator------");
	Iterator<Integer> itVal=map.values().iterator(); //using directly
	while(itVal.hasNext()) {
		Integer key=itVal.next();
		System.out.print(key+" ");
	}
	System.out.println();
	//retrieving ALL KEYS+VALUES using entrySet();
//	Set<Map.Entry<String, Integer>> setEntries=map.entrySet();
     
	System.out.println("----All Keys and Values using entrySet()---For Each Loop-----");
	for(Map.Entry<String, Integer> entry : map.entrySet()) {
		System.out.println(entry.getKey()+" = "+entry.getValue());
	}
	
	System.out.println("-----All Keys and Values using entrySet()---Iterator----");
	Iterator<Map.Entry<String, Integer>> itKey=map.entrySet().iterator();
	while(itKey.hasNext()) {
		Map.Entry<String, Integer> entry=itKey.next();
		String valueFromMap=entry.getKey()+" = "+entry.getValue();
		System.out.println(valueFromMap);
	//	System.out.println(entry.getKey()+" = "+entry.getValue());
	}
	
	
	
	
	
	
	
	
	
	}
}
