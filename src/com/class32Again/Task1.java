package com.class32Again;

import java.util.ArrayList;
import java.util.Collections;

//Create an ArrayList of Strings and using Collections class sort the values of that ArrayList.

public class Task1 {

	public static void main(String[] args) {
		
	ArrayList<String> alist=new ArrayList<>();
	alist.add("day");
	alist.add("night");
	alist.add("welcome");
	alist.add("good");
	System.out.println("Collection before sorting: "+alist);
	
	Collections.sort(alist);	
	System.out.println("Collection after sorting: "+alist);
		
	}
}
