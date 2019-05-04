package com.class32Again;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionClass {

	public static void main(String[] args) {
		
	ArrayList<Integer> integerList=new ArrayList<>();
	integerList.add(90);
	integerList.add(33);
	integerList.add(56);
	integerList.add(1000);
	System.out.println("Collection before sorting: "+integerList);
	
	Collections.sort(integerList);
	System.out.println("Collection after sorting: "+integerList);
	
	int[] integerArray= {12,57,979,1};
	Arrays.sort(integerArray); //sorting from the smallest to the biggest number! find min max
	
	System.out.println("Array after sorting");
	for(int num:integerArray) {
		System.out.print(num+" ");
	}
	
	
	
	
	}
}
