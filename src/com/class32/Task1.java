package com.class32;
//Create an ArrayList of Strings and using Collections class sort the values of that ArrayList.

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {

	public static void main(String[] args) {
		
	ArrayList<String> alist=new ArrayList<>();	
	alist.add("sunny");	
	alist.add("day");
	alist.add("having");
	alist.add("fun");
	System.out.println("Colection before sorting: "+alist);
	
	Collections.sort(alist);
	System.out.println("Colection after sorting: "+alist);	
	
	}
}
