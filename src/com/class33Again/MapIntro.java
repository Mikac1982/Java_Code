package com.class33Again;
import java.util.*;
public class MapIntro {

	public static void main(String[] args) {
	//Map<Key, Value>	
	Map<Integer, String> map=new HashMap<>();	
	//add entries(key+value)
	map.put(101, "John");	
	map.put(102, "Jane");	
	map.put(103, "Kate");	
	map.put(104, "James");	
	System.out.println(map);		
		
	//retrieve or access values	
	System.out.println(map.get(102));	//get value of key 102->Jane
		
	//how to find the size of a map
	System.out.println(map.size());  //4 
		
	//how to update value
	map.replace(103,"Mika");
	System.out.println(map.get(103)); //Mika
		
	//how to remove
	map.remove(104);
	System.out.println(map.size()); //3
	System.out.println(map);        //{101=John, 102=Jane, 103=Mika}
	
	//how to check if there are any values in map
	System.out.println(map.isEmpty()); //false
	
	//to check if specific key/value is there
	System.out.println(map.containsKey(101));      //true
	System.out.println(map.containsValue("Mika")); //true
	
	//we can have duplicate values!
	map.put(105, "Jane");  
	System.out.println(map); //{101=John, 102=Jane, 103=Mika, 105=Jane}
	
	//we can NOT have duplicate KEYS!
	map.put(101, "Una"); //we just overriding old value with a new one
	System.out.println(map); //{101=Una, 102=Jane, 103=Mika, 105=Jane}
	
	//adding null key with some value
	map.put(null, "Some value");
	System.out.println(map);
	
	//adding null key with null value
	map.put(null, null);     //{null=Some value, 101=Una, 102=Jane, 103=Mika, 105=Jane}
	System.out.println(map); //{null=null, 101=Una, 102=Jane, 103=Mika, 105=Jane}
	
	
	
	
	
	
	
	
	}
}
