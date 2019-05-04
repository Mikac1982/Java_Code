package com.class32Again;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIntro {

	public static void main(String[] args) {
		
	HashSet<Integer> hset=new HashSet<>();
	hset.add(12);
	hset.add(32);
	hset.add(34);
	hset.add(99);
	
	System.out.println(hset.size());        // 3
	System.out.println(hset);	            // [32, 34, 99, 12] -there is NO ORDER
	System.out.println(hset.contains(32));	// true
	System.out.println(hset.contains(55));	// false
		
	hset.add(12); //can not have duplicates
	hset.add(32);
	System.out.println(hset.size());     // 4
	System.out.println(hset.isEmpty());  // false
	
	hset.remove(34);
	System.out.println(hset); // [32, 99, 12]
	
	//to RETRIVE ALL THE VALUES  from hashset
	//1. using Advanced for loop
	System.out.println("------using Advanced For Loop-------");
	for(int num:hset) {
		System.out.println(num);
	}
	
	//2. using Iterator
	System.out.println("-------using Iterator-------");
	Iterator<Integer> it=hset.iterator(); //returns 1 Iterator Object
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	hset.clear();             // removes all the elements from the list
	System.out.println(hset); // []
	
	}
}
