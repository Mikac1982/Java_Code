package com.class33;
import java.util.*;

public class KeyAndValuesUsingEntrySet {

	public static void main(String[] args) {
	//Create a map to store userDetails(name, salary, department, title)
		
		Map<String, String> userDetailsMap=new LinkedHashMap<>();
		userDetailsMap.put("Name", "Alex Smith");  //1. entry: key=name + value="alex smith"
		userDetailsMap.put("Salary", "90000");     //2.entry
		userDetailsMap.put("Department", "IT");    //3.entry
		userDetailsMap.put("Title", "Automation Tester");
		System.out.println(userDetailsMap);
		
		//RETRIVE KEYS AND VALUES USING ENTRIES:
		//returns a Set of Entries ->returns set of collection
		userDetailsMap.entrySet(); 
		//taking set/entry by set/entry and assigning to variable
		for (Map.Entry<String, String> entry : userDetailsMap.entrySet()) { //Map.Entry-generic-String type
			System.out.println(entry.getKey()+" : "+entry.getValue());	
		}
	    //for (Map.Entry<> entry : userDetailsMap.entrySet())   //Non-Generic-not specifying the type(gives a warning)
		
		System.out.println("----------Using Iterator:");
		//iterator type of Map.Entry(value type of string, key type of string)
		Iterator<Map.Entry<String, String>> it=userDetailsMap.entrySet().iterator(); //return an Object of the Iterator
		while(it.hasNext()) {
			Map.Entry<String, String> entry=it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}
}
