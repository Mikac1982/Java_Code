package com.class34;
import java.util.*;
//Create a map of grocery products and it is quantity
public class MapReview{
   	
	public static void main(String[] args) {
		
	Map<String, Integer> groceryMap=new LinkedHashMap<>();
	groceryMap.put("Milk", 1);
	groceryMap.put("Bread", 2);
	groceryMap.put("Eggs", 12);
	groceryMap.put("Coffee", 2);
	groceryMap.put("Potato", 2);
	groceryMap.put("Cookies", 3);	
	System.out.println(groceryMap);	 //{Milk=1, Bread=2, Eggs=12, Coffee=2, Potato=2, Cookies=3}
		
	groceryMap.put("Cheese", 1);	
	System.out.println(groceryMap.size());	//7
		
	groceryMap.replace("Eggs", 18);
	System.out.println(groceryMap);  //{Milk=1, Bread=2, Eggs=18, Coffee=2, Potato=2, Cookies=3, Cheese=1}
		
	groceryMap.remove("Cheese");	
	System.out.println(groceryMap);	 //{Milk=1, Bread=2, Eggs=18, Coffee=2, Potato=2, Cookies=3}
	
	//retrieving ALL KEYS+VALUES using KEYSET();
	System.out.println("----using Advanced For Loop-------");
	Set<String>	keySet=groceryMap.keySet(); //storing Set inside variable(keySet)
	for(String key:keySet) {
		System.out.println("Key is "+key+" and value is "+groceryMap.get(key));
	}
	
	System.out.println("----using Iterator------");
	Iterator<String> it=keySet.iterator();
	while(it.hasNext()) {
		String key=it.next();
		System.out.println(key+" "+groceryMap.get(key));
	}
	//using it directly (without storing Set inside variable) 
	for(String  key : groceryMap.keySet()) { 
		System.out.println("Key is "+key+" and value is "+groceryMap.get(key));
	}
	//using it directly
	Iterator<String> itKey=groceryMap.keySet().iterator();
	while(itKey.hasNext()) {
		String key=itKey.next();
		System.out.println(key+" "+groceryMap.get(key));
	}
	
	//retrieving ALL VALUES using:
//	Collection<Integer> valColl=groceryMap.values(); //storing inside variable(valColl)
	System.out.println("----using For Each Loop-----");
//	for(Integer value: valColl) {
//		System.out.println(value);
//	}
	
	//using it directly without storing it inside the variable
	for(Integer val : groceryMap.values()) {
		System.out.print(val+" ");
	}
	System.out.println();
	System.out.println("-----using Iterator----");
	Iterator<Integer> valueIt=groceryMap.values().iterator(); 
	while(valueIt.hasNext()) {
		System.out.print(valueIt.next()+" ");
	}
	
	//retrieving ALL KEYS+VALUES using entrySet();
	//returns you set of Entry, entry of type string, integer
	//Set<Map.Entry<String, Integer>> setOfEntries=groceryMap.entrySet(); 
	
	System.out.println("----using For Each Loop-----");
	for(Map.Entry<String, Integer> entry: groceryMap.entrySet()) { //each object is 1 entry
		System.out.println(entry.getKey()+"=="+entry.getValue());
	}
	System.out.println("-----using Iterator----");
	
	//map-->using entrySet we will get Set(Set is collection)->any collection has iterator method->returns 1 Iterator Object 
	//-->1 Iterator object of Entries<key is type of String, value is type of Integer>
	Iterator<Map.Entry<String, Integer>> it2=groceryMap.entrySet().iterator();
	//each element inside Iterator is an Entry
	while(it2.hasNext()) { //is there any entry object/element (key-value)
		Map.Entry<String, Integer> entry=it2.next(); //returns 1 single entry (entry is object)
		//inside entry object we have 2 methods:
		String valueFromMap=entry.getKey()+"=="+entry.getValue();
		//System.out.println(entry.getKey()+"=="+entry.getValue());
		System.out.println(valueFromMap);
	}
	
	
	}
}
