package com.class33Again;
import java.util.*;

public class EntrySet {

	public static void main(String[] args) {
		//create Map of classroom 
		Map<String, Integer> classroomMap=new LinkedHashMap<>();	
		classroomMap.put("Table", 20);	  //Entry<Key, Value>
		classroomMap.put("Chairs", 60);    //Entry<String, Integer>
		classroomMap.put("Screen", 3);
		classroomMap.put("Student", 60);
		classroomMap.put("Instructor", 3);	
		System.out.println(classroomMap);
		
		classroomMap.entrySet(); //to collect all the entries!
		
		System.out.println("----------Using For Each Loop:");
		for(Map.Entry<String, Integer> entry: classroomMap.entrySet()) { //loop through all entry set 
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		
		System.out.println("----------Using Iterator:");
		Iterator<Map.Entry<String, Integer>> iter=classroomMap.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry=iter.next(); //each element is of type entry-string, integer
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		
		
		
		
		
		
		
	}
}
