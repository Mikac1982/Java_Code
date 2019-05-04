package com.class33;

import java.util.HashMap;
import java.util.Map;
/*  Create a map of a building. Store floor number and it is associated company name. 
   (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map
 */
public class Task2 {

	public static void main(String[] args) {
		
	Map<Integer, String> map=new HashMap<>();
	map.put(1, "Google");
	map.put(2, "Amazon");
	map.put(3, "Syntax");
	map.put(4, "Apple");
	map.put(5, "Samsung");
	map.put(6, "Simens");
	map.put(7, "Ebay");
    System.out.println(map);
	System.out.println(map.size());
    
	map.put(3, "Audi");
	System.out.println(map);
	
	map.replace(4, "Nokia")	;
	System.out.println(map);	
		
	map.remove(7);
	System.out.println(map);
	System.out.println(map.size());
	}
}
