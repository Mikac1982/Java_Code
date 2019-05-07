package com.class34;
import java.util.*;

public class Task2 {

	public static void main(String[] args) {
	/* Write a program to check which employee gets highest salary 
	 * use hashMap employee name as key and salary amount as the value.
	 * Output example: John Smith=100000.		
	*/	
		
	Map<String, Integer> map=new HashMap<>();	//wrapper class Integer provide additional methods
	map.put("John", 70000);    //1.entry
	map.put("James", 80000);   //2.entry
	map.put("Frank", -900000);  //3.entry
	map.put("David", 50000);   //4.entry
	map.put("Jordan",-100000);  //5.entry
		
   //int maxSalary=Integer.MIN_VALUE;	
	int maxSalary=0;
	String key=null;
	
	for (Map.Entry<String, Integer> entry:map.entrySet()) {
		if (entry.getValue()>maxSalary) {
			maxSalary=entry.getValue();
			key=entry.getKey();
		}
	}
	System.out.println("Max salary "+maxSalary+" belongs to "+key);	
		
		
		
		
	}
}
