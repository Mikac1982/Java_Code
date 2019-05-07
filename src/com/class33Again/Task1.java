package com.class33Again;
import java.util.*;

public class Task1 {
	//how can you remove all duplicates from ArrayList?
	public static void main(String[] args) {
		
		List<String> aList=new ArrayList<String>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");	
		System.out.println("Original collection: "+aList);
		
		Set<String> lset=new LinkedHashSet<>(); //keep the order, using .addAll()
		lset.addAll(aList);
		System.out.println("Using LinkedHashSet: "+lset);
		
		Set<String> hset=new HashSet<>(aList);  //no order, adding collection
		System.out.println("Using HashSet      : "+hset);
	}
}
