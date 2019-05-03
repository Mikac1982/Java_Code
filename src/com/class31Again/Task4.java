package com.class31Again;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
	// Create an arrayList of even numbers from 1 to 50.
	// Using Iterator remove any number that is divisible by 5 from that arrayList.
	
	public static void main(String[] args) {
		
	ArrayList<Integer> numbers=new ArrayList<>();
	//  for (int i=1; i<=50; i++) {
	//     if (i%2==0) {
	//	   numbers.add(i);
	//  }
		for (int i=2; i<=50; i+=2) {
			numbers.add(i);
		}
		System.out.println(numbers);
		
		Iterator<Integer> it=numbers.iterator();
		while(it.hasNext()) {
			int num=it.next();
			if (num%5==0) {
				it.remove();
			}
		}
		System.out.println(numbers);
		
		
		
		
		
		
	}
}
