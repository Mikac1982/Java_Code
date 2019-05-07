package com.class34;
import java.util.*;
public class Task1 {

	public static void main(String[] args) {
	/* Create a Map from array of cities that will sort keys in alphabetical order.
	   As a key store the name of the city and as a value store the length of the city name 
	   (Example: Paris=5, Moscow =6 etc..).
       If any city name is more than 7 characters remove that city ( use entrySet with Iterator ). 	
	 */
	
	String[] cityArray= {"Paris","Belgrade", "San Francisco","Berlin","Rome", "Barcelona"};	
		
	Map<String, Integer> cityMap=new TreeMap<>();	
	
	for (String city: cityArray ) {
		cityMap.put(city, city.length());
		}
		System.out.println(cityMap);
		
	Iterator<Map.Entry<String, Integer>> it=cityMap.entrySet().iterator();	
	while (it.hasNext()) {
		Map.Entry<String, Integer> entry=it.next();
		if(entry.getValue()>7) {
			it.remove();	
			
		}
	}	
	System.out.println(cityMap);
		
	
		
		
	}
}
