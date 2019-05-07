package com.class33Again;
import java.util.*;
public class RetriveOneValueFromSet {

	public static void main(String[] args) {
		
	Set<String>	cars=new LinkedHashSet<>();
	cars.add("Toyota");
	cars.add("Honda");
	cars.add("Audi");
	cars.add("BMW");
	cars.add("Ford");
	
	//HOW TO ACCESS 1 SPECIFIC VALUE FROM A SET?
	//1. way we convert to ArrayList:	
	//a - to add collection into ArrayList (in constructor)
	//we created List from Set collection
	List<String> list=new ArrayList<>(cars); //by passing collection
	System.out.println("List collection: "+list);
	System.out.println(list.get(2));	//to access value Audi
		
	//b - using addAll() method	
	List<String> list2=new ArrayList<>();	
	list2.addAll(cars);	//adding entire collection
	list2.add("Ford");
	System.out.println("List 2 collection: "+list2);
	System.out.println(list2.get(3));	//to access value BMW
		
	//2. way CONVERT TO ARRAY:
	Object[] array=cars.toArray();	//returns you Object array so you can store any element
	System.out.println(array[1]);	//accessing value Honda
		
		
		
	}
}
