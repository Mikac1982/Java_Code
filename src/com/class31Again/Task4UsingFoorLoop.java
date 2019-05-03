package com.class31Again;

import java.util.ArrayList;

public class Task4UsingFoorLoop {
	// Create an arrayList of even numbers from 1 to 50.
	// Using Iterator remove any number that is divisible by 5 from that arrayList.
	
	public static void main(String[] args) {
		
	ArrayList<Integer> list=new ArrayList<Integer>();
	
	for (int i=2; i<=50; i+=2) {
		list.add(i);
	}
	System.out.println(list);
	
	for (int i=0; i<list.size(); i++) {
		if (i%5==0) {
			list.remove(i);
		}
	}	
	System.out.println(list);	
		
		
		
		
		
		
		
	}
}
