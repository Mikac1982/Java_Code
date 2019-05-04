package com.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class MapDemo {  
	
	public static void main(String[] args) {
		
	Map<String,String> map=new HashMap<>();	
	map.put("myName", "Mika");
	map.put("actor","Angelina");
	map.put("ceo", "Marisa");
	
	map.put("actor", "Mika"); //we can duplicate values
	
	
	Set<String> keys=map.keySet();
	
	for(String key:keys) {
	    System.out.println(key+" "+map.get(key));
	}
//	System.out.println(map.get("actor"));
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
