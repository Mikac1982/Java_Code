package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
		System.out.println("Collection before: "+aList);
		
		System.out.println("------using HashSet--------");
		Set<String> set=new HashSet<>(aList);
		System.out.println("Collection without duplicates: "+set); //no order
		
	//	for(String s:set) {
	//		System.out.println(s);
	//	}
		
		System.out.println("------using LinkedHashSet--------");
		Set<String> lset=new LinkedHashSet<>();
		lset.addAll(aList);
		System.out.println("Collection without duplicates: "+lset); //keep the order
		
		
	}
}
