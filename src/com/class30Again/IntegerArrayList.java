package com.class30Again;

import java.util.ArrayList;

public class IntegerArrayList {

	public static void main(String[] args) {
		
	//Class //WrappedClass
	ArrayList <Integer> numbers=new ArrayList<Integer>();
	numbers.add(10);  //storing the value ->compiler do it automatically
	numbers.add(20);
	numbers.add(33);  //index 2
	numbers.add(100);
	
	//numbers -> collection name!
	numbers.set(2, 3333);  //changing value of element with index 2, with value 3333
	
	
	
	//to RETRIVE ALL the elements from  our collection:
	for (int i=0; i<numbers.size(); i++) {
		System.out.println(numbers.get(i));
	}
	
	for (Integer num:numbers) {  //or we can use int instead Integer
		System.out.println(num);
	}
	
	
	}	
}
