package com.class33;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetriveOneValueFromSet {

	public static void main(String[] args) {
		
		Set<String> cars=new LinkedHashSet<>();
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Ford");
	//	System.out.println(cars);
		
		//1. way we convert to the arrayList:
		//a- add collection into ArrayList ->in constructor
		List<String> list=new ArrayList<>(cars); //we created List from Set collection
		System.out.println("List collection: "+list);
		System.out.println(list.get(2)); //to access Audi
		
		//b -
		List<String> list2=new ArrayList<>();
		list2.addAll(cars);
		list2.add("Ford");
		System.out.println("List 2 collection: "+list2);
		
		//2. way convert to Array
		Object[] array=cars.toArray();
		System.out.println(array[1]);  //Honda
		
		
	}
}
