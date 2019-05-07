package com.class33;

import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class SetOverview {

	public static void main(String[] args) {
	
	  //wrapper class(String)
	Set<String> classDays=new LinkedHashSet<>();
	classDays.add("Tuesday");
	classDays.add("Wednesday");
	classDays.add("Thursday");
	classDays.add("Saturday");
	classDays.add("Sunday");			
	System.out.println(classDays);	 //[Thursday, Wednesday, Sunday, Tuesday, Saturday]
	
	//2 Ways to RETRIVE ALL the values:
	System.out.println("-----Advanced For Loop------");
	for (String days:classDays) {
		System.out.println(days);
	}	
	System.out.println("------Iterator-------");	
	Iterator<String> it=classDays.iterator();	
	 while(it.hasNext()) {
		 System.out.println(it.next());
    }	
		
	
		
		
	}
}
