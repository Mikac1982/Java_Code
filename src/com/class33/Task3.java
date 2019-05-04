package com.class33;
import java.util.*;

/* Create a map of countries with its capital. 
   Print all keys and values from a country map using for each loop and iterator.
   Print all values from a country map using for each loop and iterator.
 */
public class Task3 {

	public static void main(String[] args) {
		
	Map<String, String>	map=new LinkedHashMap<>();
	map.put("Serbia", "Belgrade");
	map.put("Spain", "Madrid");
	map.put("USA", "Washington dc");
	map.put("Italy", "Rome");
	
	//returns a set of keys from the map
	Set<String> keys=map.keySet();
	
	System.out.println("------Printing all KEYS and values using For Each Loop:");
	for (String key:keys) {
		System.out.println(key+":"+map.get(key));
	}	
	System.out.println("------Printing all KEYS and values using Iterator:");	
	Iterator<String> it=keys.iterator()	;
	while(it.hasNext()) {
		String key=it.next();
		System.out.println(key+":"+map.get(key));
	}
	
	Collection <String> capital=map.values();
	System.out.println("------Printing all VALUES using For Each Loop:");	
	for (String value:capital)	{
		System.out.print(value+" ");
	}		
	System.out.println();
	System.out.println("------Printing all VALUES using Iterator:");	
	
	Iterator<String> it2=capital.iterator();
	while(it2.hasNext()) {
		System.out.print(it2.next()+" ");
	}
		
	}
	
	
	
	
	
	
	
}
