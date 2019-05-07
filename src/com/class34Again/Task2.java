package com.class34Again;
import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		/* Write a program to check which employee gets highest salary 
		 * use hashMap employee name as key and salary amount as the value.
		 * Output example: John Smith=100000.		
		*/
		
	Map<String, Integer> map=new HashMap<>();
	map.put("John", 90000);
	map.put("Anne", 125000);
	map.put("Mike", 70000);
	map.put("Jess", 108000);
	map.put("Eric", -95000);
	
	int maxSalary=Integer.MIN_VALUE; //or intSalary max=0;
	String key=null;
	//using for each loop
	for (Map.Entry<String, Integer> entry : map.entrySet())	{
		if(entry.getValue()>maxSalary) {
			maxSalary=entry.getValue();
			key=entry.getKey();
		}	
	}
	//using iterator
	Iterator<Map.Entry<String, Integer>> it=map.entrySet().iterator();
	while(it.hasNext()) {
		Map.Entry<String, Integer> entry=it.next();
		if(entry.getValue()>maxSalary) {
			maxSalary=entry.getValue();
			key=entry.getKey();
		}
	}
	
	
	
	System.out.println("Max salary "+maxSalary+" belongs to "+key);	
	
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
