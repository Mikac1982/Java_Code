package com.class33Again;
import java.util.*;

public class KeyAndValuesUsingEntrySet {

	public static void main(String[] args) {
		//Create a map to store userDetails(name, salary, department, title)	
		
	Map<String, String> userDetailsMap=new LinkedHashMap<>();	
	userDetailsMap.put("Name", "Alex Smith");  //1. entry: key=name + value="alex smith"
	userDetailsMap.put("Salary", "90000");     //2.entry
	userDetailsMap.put("Department", "IT");    //3.entry
	userDetailsMap.put("Title", "Automation Tester"); //4.entry
	System.out.println(userDetailsMap);	
		
	//RETRIVE KEYS AND VALUES USING ENTRIES:	
		
	userDetailsMap.entrySet();	//returns a Set of Entries->returns set collection
		
	for(Map.Entry<String, String> entry: userDetailsMap.entrySet())	{ //generic map
		System.out.println(entry.getKey()+" : "+entry.getValue());
	}
	
	System.out.println("----------Using Iterator:");
	Iterator<Map.Entry<String, String>> it=userDetailsMap.entrySet().iterator();	
	while(it.hasNext())	{
		Map.Entry<String, String> entry=it.next();//storing in variable of Entry type
		System.out.println(entry.getKey()+" : "+entry.getValue());
		
	}
		
		
		
		
	}
}
