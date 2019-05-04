package com.class33Again;
import java.util.*;

public class EntrySet {

	public static void main(String[] args) {
		
		Map<String, Integer> classroomMap=new LinkedHashMap<>();	
		classroomMap.put("Table", 20);	  //Entry<Key, Value>
		classroomMap.put("Chairs", 60);    //Entry<String, Integer>
		classroomMap.put("Screen", 3);
		classroomMap.put("Student", 60);
		classroomMap.put("Instructor", 3);	
		System.out.println(classroomMap);
		
		System.out.println("----------Using For Each Loop:");
		for( Map.Entry<String, Integer> entry : classroomMap.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		System.out.println("----------Using Iterator:");
		
		Iterator<Map.Entry<String, Integer>> crIt=classroomMap.entrySet().iterator();
		while(crIt.hasNext()) {
		  Map.Entry<String, Integer> me=crIt.next();
		  System.out.println(me.getKey()+"="+me.getValue());
		}
		
		
		
		
		
		
		
	}
}
