package com.class30;

import java.util.ArrayList;

public class ArrayListTypes {

	public static void main(String[] args) {
		
		//GENERIC ARRAY LIST - stores ONLY specifying data type (only String Object)
		ArrayList<String> names=new ArrayList<String>(); 
		names.add("Milena");
		names.add("Lola");
		names.add("Zaki");
		names.add("Farah");
		names.add("Samir");
		
		//NON-GENERIC ARRAY LIST - we can store different(any primitive data) types of Objects (storing our generic OBJECT)
		ArrayList alist=new ArrayList();
		alist.add("String"); //storing String Object
		alist.add(100);      //Integer
		alist.add(100.10);   //Double
		alist.add(true);     //Boolean
		alist.add('a');      //Character
			
		for (Object values: alist) {  //taking each single element of OBJECT type
			System.out.println(values);
		}
		
		//ArrayList -> CLASS!                                   //creating OBJECT of ArrayList
        ArrayList<Boolean> booleanArrayList=new ArrayList();    //we do not have to use <> at the end
		booleanArrayList.add(true);
		booleanArrayList.add(false);
		
	   for (Object val : booleanArrayList) {
		   System.out.println(val);
	   }
	
	
	}
	
	
}
