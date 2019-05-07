package com.class34Again;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task1Again {

	public static void main(String[] args) {
		/* Create a Map from array of cities that will sort keys in alphabetical order.
		   As a key store the name of the city and as a value store the length of the city name 
		   (Example: Paris=5, Moscow =6 etc..).
	       If any city name is more than 7 characters remove that city ( use entrySet with Iterator ). 	
		 */
	String[] city= {"Washongton","Paris","Berlin","San Francisko","Belgrade"};		
		
	Map<String,Integer> cityMap=new TreeMap<>();	
		
	int num=1;
	for(String c:city) {
		cityMap.put(c, num);
		num++;
	}
	System.out.println(cityMap);	
		
    Iterator<Map.Entry<String, Integer>> it=cityMap.entrySet().iterator();
       while(it.hasNext()) {
    	   Map.Entry<String, Integer> entry=it.next();
    	   if(entry.getKey().length()>7) {
    		   it.remove();
    	   } 
       }
    System.out.println(cityMap);
		
	}
}
