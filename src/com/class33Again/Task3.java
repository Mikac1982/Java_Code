package com.class33Again;
import java.util.*;

/* Create a map of countries with its capital. 
   Print all keys and values from a country map using for each loop and iterator.
   Print all values from a country map using for each loop and iterator.
 */
public class Task3 {

	public static void main(String[] args) {
		
	Map<String, String> map=new LinkedHashMap<>();
	map.put("Serbia", "Belgrade");
	map.put("Spain", "Madrid");
	map.put("USA", "Washington dc");
	map.put("Italy", "Rome");
	System.out.println(map);
	
	//print ALL KEYS:
	Set<String> keys=map.keySet();
	
	System.out.println("-------------Printing ALL KEYS and Values using For Each Loop:");	
	for(String key:keys) {
		System.out.println(key+" = "+map.get(key));
	}
	System.out.println("-------------Printing ALL KEYS and Values using Iterator:");
	Iterator<String> it=keys.iterator();
	while(it.hasNext())	{
		String key=it.next();
		System.out.println(key+" = "+map.get(key));
	}
	//print ALL VALUES:	
	Collection<String> values=map.values();
	
	System.out.println("-------------Printing ALL VALUES using For Each Loop:");	
	for(String value: values) {
		System.out.println(value);
	}		
	System.out.println("-------------Printing ALL VALUES using Iterator:");	
	Iterator<String> itVal=values.iterator();	
	while(itVal.hasNext()) {
		System.out.println(itVal.next());
	}	
		
		
		
		
		
		
		
		
		
	}
}
