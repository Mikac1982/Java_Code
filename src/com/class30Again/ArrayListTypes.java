package com.class30Again;

import java.util.ArrayList;

public class ArrayListTypes {

	public static void main(String[] args) {
		
		//GENERIC LIST- specifying data type (of String)
		ArrayList <String> names=new ArrayList<String>(); //arrayList type of String
		names.add("Mika");
		names.add("Una");
		names.add("Milica");
		names.add("Nata");
		names.add("Dragana");
		
		//NON-GENERIC ARRAY LIST - we can store different(any primitive data) types of Objects (storing our generic OBJECT)
		ArrayList alist=new ArrayList();
		alist.add("String"); //storing String Object
		alist.add(100);      //storing Integer
		alist.add(100.10);   //storing Double
		alist.add(true);     //storing Boolean
		alist.add('a');      //storing Character
		
		for (Object values : alist) {   //taking each single element of OBJECT type
			System.out.println(values);
		}
		
		ArrayList <Boolean>booleanArray=new ArrayList();
		booleanArray.add(true);
		booleanArray.add(false);
		
		for (Object val : booleanArray) {
			System.out.println(val);
		}
		
		
		
		
		
		
	}
}
