package com.class31Again;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
	//Create an ArrayList of cars and retrieve all the values using 4 different ways
	public static void main(String[] args) {
		
	ArrayList<String> cars=new ArrayList<>();
	cars.add("BMW");
	cars.add("Nisan");
	cars.add("Toyota");
	
	for (int i=0; i<cars.size(); i++) {
		System.out.println(cars.get(i));
	}
System.out.println();
	
	for (String car:cars) {
		System.out.println(car);
	}	
System.out.println();		
		
	Iterator<String> it=cars.iterator()	;
	while(it.hasNext()) {
		System.out.println(it.next());
	}
System.out.println();	
	
	int a=0;
	while(cars.size()>a) {
		String car=cars.get(a);
		System.out.println(car);
		a++;
	}



	}
}
