package com.class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {
		
	ArrayList<Integer> integerList=new ArrayList<>();	
	
	integerList.add(90);
	integerList.add(33);
	integerList.add(56);
	integerList.add(1000);
	System.out.println("Collection before sorting: "+integerList); // [90, 33, 56, 1000]
	
	//Collections -> utility class -all methods inside are static! can not create an object
	Collections.sort(integerList);	//class that works with collections (LIST Array)?
	System.out.println("Collection after sorting: "+integerList);  // [33, 56, 90, 1000]
	
	int[] integerArray= {12,57,9799,1};
	//Arrays -> utility class!
	Arrays.sort(integerArray); //sort from the smallest to the biggest
	System.out.println("Array after sorting:");
	for (int num:integerArray) {
		System.out.print(num+" ");
	}
	
	
	
	
	
	
	
	
	
	}
}
