package com.class31Again;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveOdds {
	//lets create an ArrayList of integers from 1 to 20 
	//and then remove all odds numbers using Iterator
	
	public static void main(String[] args) {
		
	  ArrayList<Integer> alist=new ArrayList<>();
	  for (int i=1; i<=20; i++) {
			alist.add(i);
	  }
	  System.out.println(alist);	
		
	 Iterator<Integer> it=alist.iterator();
		while(it.hasNext()) {
			int num=it.next();
			if (num%2!=0) {
				it.remove();
			}
		}
	System.out.println(alist);	
		
	}
	
	
	
}
