package com.class32;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIntro {

	public static void main(String[] args) {
		
		
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(12);
		hset.add(32);
		hset.add(34);
		
		System.out.println(hset.size());       // 3
		//SET does not keep the order 
		System.out.println(hset);              // [32, 34, 12]
		System.out.println(hset.contains(32)); // true
		
		//Set Interface does not allow duplicates
		hset.add(12);
		hset.add(32);
		System.out.println(hset.size()); //still 3
		
		//1. using advanced for loop
		System.out.println("------usinf Advanced For Loop--------");
		for (int num:hset) {
			System.out.println(num); // 32 34 12
		}
		//2. using iterator
		System.out.println("-------using Iterator--------");
		Iterator<Integer> it=hset.iterator();
		while(it.hasNext()) {
			int num=it.next();
			System.out.println(num);
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
