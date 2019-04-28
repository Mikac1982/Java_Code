package com.class30;

import java.util.ArrayList;

public class IntegerArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		
		numbers.add(10); //storing the value ->compiler do it automaticly
		numbers.add(20);
		numbers.add(33); //index 2
		numbers.add(100);
		
		numbers.set(2, 3333); //changing value of element with index 2
		
		
		for (Integer num : numbers) { //we can keep int as well
			System.out.println(num);
		}
		
	}
	
	
	
	
	
}
