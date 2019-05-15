package com.class33;

import java.util.*; //with java.uti.*; we import everything!

public class MapIntro {

	public static void main(String[] args) {
	
	  //Map <Key, Value>
	Map <Integer, String> map=new HashMap<>();	
	//add entries (key+value)
	map.put(101, "John");
	map.put(102, "Jane");
	map.put(103, "Kate");
	map.put(104, "James");
	System.out.println(map); // {101=John, 102=Jane, 103=Kate, 104=James}
	
	//retrieve or access values
	System.out.println(map.get(102));	 //Jane
	
	//how to find the size of a map
	System.out.println(map.size());  //4 - counting entries
	
	//how to update value
	map.replace(103, "Bilal");
	System.out.println(map);   // {101=John, 102=Jane, 103=Bilal, 104=James}
    System.out.println(map.get(103)); //Bilal
	
	//how to remove the value
	map.remove(104);
	System.out.println(map.size());  //3
	
	//how to check if there are any values in the map
	System.out.println(map.isEmpty());   //false
	
	//to check if specific key/value is there
	System.out.println(map.containsKey(102));        //true
	System.out.println(map.containsValue("Bilal"));  //true
	
	map.put(105, "Jane");
	System.out.println(map); // {101=John, 102=Jane, 103=Bilal, 105=Jane}
	
	map.put(101, "Mika");    //values will be replaced, overriden but not a key
	System.out.println(map); // {101=Mika, 102=Jane, 103=Bilal, 105=Jane}
	
	//adding null key with some value
	map.put(null, "Some value");
	System.out.println(map);   // {null=Some value, 101=Mika, 102=Jane, 103=Bilal, 105=Jane}
	
	//adding null key with null value
	map.put(null, null);
	System.out.println(map);  // {null=null, 101=Mika, 102=Jane, 103=Bilal, 105=Jane}

	map.clear();
	System.out.println(map); //{}
	
    
	
	
	}
}
