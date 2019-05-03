package com.class31Again;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {
	 
   public static void main(String[] args) {
	
	//lets create an ArrayList of integers from 1 to 20 
	//and then remove all odds numbers using Iterator
	
	ArrayList<Integer> alist=new ArrayList<>();
	//alist.add(1);
	//alist.add(2);
	
	for (int i=1; i<=20; i++) {
		alist.add(i);  //adding all these values 
	}
	System.out.println(alist);
	
	Iterator<Integer> it=alist.iterator();  //will return 1 Object of iterator
	while(it.hasNext()) {  //check if there is any element inside collection /true
		int num=it.next();  //returns 1 element/Object and store inside variable num
		if(num%2!=0) {
			it.remove();
		}
	}
	System.out.println(alist);
	
	
	
}
}
